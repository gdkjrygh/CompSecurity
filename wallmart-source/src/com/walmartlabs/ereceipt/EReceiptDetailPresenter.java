// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.ereceipt;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.os.AsyncTask;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import com.squareup.otto.Bus;
import com.walmart.android.service.AsyncCallbackOnThread;
import com.walmart.android.service.ImageDownloader;
import com.walmart.android.service.MessageBus;
import com.walmart.android.ui.OnItemSingleClickListener;
import com.walmart.android.ui.Presenter;
import com.walmart.android.utils.Base64;
import com.walmart.android.utils.RotationAnimationHandler;
import com.walmart.android.utils.ViewUtil;
import com.walmartlabs.analytics.AnalyticsEvent;
import com.walmartlabs.ereceipt.service.EReceipt;
import com.walmartlabs.ereceipt.service.EReceiptManager;
import com.walmartlabs.ui.ZoomableImageView;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.apache.commons.lang3.text.WordUtils;

// Referenced classes of package com.walmartlabs.ereceipt:
//            EReceiptItemListAdapter, EReceiptItemPresenterFactory

public class EReceiptDetailPresenter extends Presenter
{
    class DecodeBitmapTask extends AsyncTask
    {

        final EReceiptDetailPresenter this$0;

        protected transient Bitmap doInBackground(String as[])
        {
            as = as[0];
            return decodeImage(as);
        }

        protected volatile Object doInBackground(Object aobj[])
        {
            return doInBackground((String[])aobj);
        }

        protected void onPostExecute(Bitmap bitmap)
        {
            if (isPopped())
            {
                return;
            } else
            {
                setEReceiptImage(bitmap);
                hideImageProgress();
                return;
            }
        }

        protected volatile void onPostExecute(Object obj)
        {
            onPostExecute((Bitmap)obj);
        }

        DecodeBitmapTask()
        {
            this$0 = EReceiptDetailPresenter.this;
            super();
        }
    }

    public static interface DeleteHandler
    {

        public abstract void deleteReceipt(String s, boolean flag);
    }


    private static final int DIALOG_DELETE = 1;
    private static final int DIALOG_NO_RECEIPT = 0;
    private static final String ERECEIPT_PREFS = "ERECEIPT_PREFS";
    private static final long IMAGE_CACHE_TIMEOUT = 0x493e0L;
    private static final String PREFS_LAUNCH_IMAGE_MODE = "PREFS_LAUNCH_IMAGE_MODE";
    private static final String TAG = com/walmartlabs/ereceipt/EReceiptDetailPresenter.getSimpleName();
    private static final SimpleDateFormat sFormattedDate;
    private static final DecimalFormat sFormatter = new DecimalFormat("$#,##0.00;($#,##0.00)");
    private Activity mActivity;
    private DeleteHandler mDeleteHandler;
    private int mDialogConfig;
    private View mEReceiptDetailProgress;
    private ViewGroup mEReceiptDetailView;
    private View mFooterView;
    private boolean mFromScanner;
    private final ImageDownloader mImageDownloader;
    private boolean mInImageMode;
    private ZoomableImageView mItemImage;
    private View mItemImageProgress;
    private ListView mItemList;
    private EReceiptItemListAdapter mItemListAdapter;
    private EReceiptItemPresenterFactory mItemPresenterFactory;
    private EReceipt mReceipt;
    private boolean mReceiptIdMode;
    private final String mReceiptUuid;
    private RotationAnimationHandler mRotationAnimationHandler;
    private List mTaxes;
    private List mTenders;
    private MenuItem mToggleButton;

    public EReceiptDetailPresenter(Activity activity, EReceipt ereceipt, ImageDownloader imagedownloader)
    {
        mDialogConfig = 0;
        mReceipt = ereceipt;
        mReceiptUuid = ereceipt.uuid;
        mImageDownloader = imagedownloader;
        initPresenter(activity, imagedownloader);
    }

    public EReceiptDetailPresenter(Activity activity, String s, ImageDownloader imagedownloader, boolean flag)
    {
        mDialogConfig = 0;
        mReceiptUuid = s;
        mReceiptIdMode = true;
        mImageDownloader = imagedownloader;
        mFromScanner = flag;
        initPresenter(activity, imagedownloader);
    }

    private View createSummaryItem(ViewGroup viewgroup, String s, String s1, boolean flag)
    {
        View view = ViewUtil.inflate(mActivity, com.walmartlabs.android.ereceipt.R.layout.ereceipt_list_summary_item, viewgroup, false);
        setSummaryItem(view, s, s1, flag);
        viewgroup.addView(view);
        return view;
    }

    private Bitmap decodeImage(String s)
    {
        Object obj = null;
        if (!TextUtils.isEmpty(s))
        {
            s = Base64.decode(s, 0);
            obj = new android.graphics.BitmapFactory.Options();
            obj.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(s, 0, s.length, ((android.graphics.BitmapFactory.Options) (obj)));
            int l = mImageDownloader.getMaxSize();
            int k = ((android.graphics.BitmapFactory.Options) (obj)).outWidth;
            int j = ((android.graphics.BitmapFactory.Options) (obj)).outHeight;
            int i;
            for (i = 1; k > l || j > l; i++)
            {
                k /= 2;
                j /= 2;
            }

            obj = new android.graphics.BitmapFactory.Options();
            obj.inSampleSize = i;
            obj = BitmapFactory.decodeByteArray(s, 0, s.length, ((android.graphics.BitmapFactory.Options) (obj)));
        }
        return ((Bitmap) (obj));
    }

    private void deleteReceipt()
    {
        if (mDeleteHandler != null)
        {
            mDeleteHandler.deleteReceipt(mReceipt.uuid, mInImageMode);
        } else
        {
            EReceiptManager.get().deleteReceipt(mReceipt);
        }
        pop();
    }

    private void downloadReceipt()
    {
        AsyncCallbackOnThread asynccallbackonthread = new AsyncCallbackOnThread(new Handler()) {

            final EReceiptDetailPresenter this$0;

            public void onFailureSameThread(Integer integer, com.walmartlabs.ereceipt.service.EReceiptsResponse.Receipt receipt)
            {
                if (isPopped())
                {
                    return;
                } else
                {
                    showDialog(0);
                    return;
                }
            }

            public volatile void onFailureSameThread(Object obj, Object obj1)
            {
                onFailureSameThread((Integer)obj, (com.walmartlabs.ereceipt.service.EReceiptsResponse.Receipt)obj1);
            }

            public void onSuccessSameThread(com.walmartlabs.ereceipt.service.EReceiptsResponse.Receipt receipt)
            {
                if (!isPopped())
                {
                    if (receipt == null)
                    {
                        showDialog(0);
                        return;
                    }
                    mReceipt = receipt;
                    setReceiptContent();
                    setEReceiptImage(decodeImage(mReceipt.image));
                    hideImageProgress();
                    if (mFromScanner)
                    {
                        Bus bus = MessageBus.getBus();
                        com.walmartlabs.anivia.AniviaEventAsJson.Builder builder = (new com.walmartlabs.anivia.AniviaEventAsJson.Builder("ereceiptQRScan")).putString("receiptUuid", mReceipt.uuid);
                        if (mReceipt.store != null)
                        {
                            receipt = mReceipt.store.id;
                        } else
                        {
                            receipt = "";
                        }
                        bus.post(builder.putString("storeId", receipt).putInt("numberItems", mReceipt.itemsSold).putString("total", String.format(Locale.US, "$%.2f", new Object[] {
                            Float.valueOf(mReceipt.getPriceInDollar())
                        })));
                        return;
                    }
                }
            }

            public volatile void onSuccessSameThread(Object obj)
            {
                onSuccessSameThread((com.walmartlabs.ereceipt.service.EReceiptsResponse.Receipt)obj);
            }

            
            {
                this$0 = EReceiptDetailPresenter.this;
                super(handler);
            }
        };
        EReceiptManager.get().retrieveReceipt(mReceiptUuid, asynccallbackonthread);
    }

    private void fetchReceiptImage()
    {
label0:
        {
            if (mReceipt != null)
            {
                if (!mReceipt.hasImage())
                {
                    break label0;
                }
                EReceiptManager.get().getReceiptImage(mReceipt.uuid, new com.walmartlabs.ereceipt.service.EReceiptManager.ResultCallback() {

                    final EReceiptDetailPresenter this$0;

                    public volatile void onResult(Object obj)
                    {
                        onResult((String)obj);
                    }

                    public void onResult(String s)
                    {
                        (new DecodeBitmapTask()).execute(new String[] {
                            s
                        });
                    }

            
            {
                this$0 = EReceiptDetailPresenter.this;
                super();
            }
                });
            }
            return;
        }
        AsyncCallbackOnThread asynccallbackonthread = new AsyncCallbackOnThread(new Handler()) {

            final EReceiptDetailPresenter this$0;

            public void onFailureSameThread(Integer integer, Bitmap bitmap)
            {
                if (isPopped())
                {
                    if (bitmap != null)
                    {
                        bitmap.recycle();
                    }
                    return;
                } else
                {
                    setEReceiptImage(bitmap);
                    hideImageProgress();
                    return;
                }
            }

            public volatile void onFailureSameThread(Object obj, Object obj1)
            {
                onFailureSameThread((Integer)obj, (Bitmap)obj1);
            }

            public void onSuccessSameThread(Bitmap bitmap)
            {
                if (isPopped())
                {
                    if (bitmap != null)
                    {
                        bitmap.recycle();
                    }
                    return;
                } else
                {
                    setEReceiptImage(bitmap);
                    hideImageProgress();
                    return;
                }
            }

            public volatile void onSuccessSameThread(Object obj)
            {
                onSuccessSameThread((Bitmap)obj);
            }

            
            {
                this$0 = EReceiptDetailPresenter.this;
                super(handler);
            }
        };
        mImageDownloader.downloadImage(EReceiptManager.get().getReceiptImageUrl(mReceipt.uuid), 0x493e0L, asynccallbackonthread, true);
    }

    private static String getAmountString(int i)
    {
        return sFormatter.format((float)i * 0.01F);
    }

    private void hideImageProgress()
    {
        mItemImageProgress.setVisibility(8);
        mItemImage.setVisibility(0);
    }

    private void hideReceiptProgress()
    {
        mEReceiptDetailProgress.setVisibility(8);
    }

    private void initImage()
    {
        mItemImageProgress = ViewUtil.findViewById(mEReceiptDetailView, com.walmartlabs.android.ereceipt.R.id.ereceipt_detail_image_loading);
        mItemImage = (ZoomableImageView)ViewUtil.findViewById(mEReceiptDetailView, com.walmartlabs.android.ereceipt.R.id.ereceipt_detail_image_receipt);
    }

    private void initList()
    {
        mItemList = (ListView)ViewUtil.findViewById(mEReceiptDetailView, com.walmartlabs.android.ereceipt.R.id.ereceipt_detail_list);
        mFooterView = ViewUtil.inflate(mActivity, com.walmartlabs.android.ereceipt.R.layout.ereceipt_list_summary);
        mItemList.addFooterView(mFooterView, null, false);
        mItemList.setAdapter(mItemListAdapter);
        mItemList.setOnItemClickListener(new OnItemSingleClickListener(this) {

            final EReceiptDetailPresenter this$0;

            public void onItemSingleClick(AdapterView adapterview, View view, int i, long l)
            {
                boolean flag1 = false;
                boolean flag = flag1;
                if (mItemPresenterFactory != null)
                {
                    adapterview = (com.walmartlabs.ereceipt.service.EReceipt.Item)mItemListAdapter.getItem(i);
                    if (adapterview != null)
                    {
                        view = mItemPresenterFactory.createPresenter(adapterview, mReceipt.getTimeInMs());
                        flag = flag1;
                        if (view != null)
                        {
                            flag = true;
                            pushPresenter(view);
                            MessageBus.getBus().post(new AnalyticsEvent("Ereceipt", "Item view", ((com.walmartlabs.ereceipt.service.EReceipt.Item) (adapterview)).productId));
                        }
                    } else
                    {
                        Log.e(EReceiptDetailPresenter.TAG, (new StringBuilder()).append("Invalid item at position ").append(i).toString());
                        flag = flag1;
                    }
                }
                if (!flag)
                {
                    clearSingleClickFlag();
                }
            }

            
            {
                this$0 = EReceiptDetailPresenter.this;
                super(presenter);
            }
        });
    }

    private void initPresenter(Activity activity, ImageDownloader imagedownloader)
    {
        mActivity = activity;
        mInImageMode = true;
        mItemListAdapter = new EReceiptItemListAdapter(activity, imagedownloader);
        setTitleText(mActivity.getString(com.walmartlabs.android.ereceipt.R.string.ereceipts_title));
    }

    private void initView(ViewGroup viewgroup)
    {
        mEReceiptDetailView = (ViewGroup)ViewUtil.inflate(mActivity, com.walmartlabs.android.ereceipt.R.layout.ereceipt_detail_layout, viewgroup);
        viewgroup = (ViewGroup)ViewUtil.findViewById(mEReceiptDetailView, com.walmartlabs.android.ereceipt.R.id.ereceipt_detail_container);
        View view = ViewUtil.findViewById(viewgroup, com.walmartlabs.android.ereceipt.R.id.ereceipt_detail_image_container);
        mEReceiptDetailProgress = ViewUtil.findViewById(mEReceiptDetailView, com.walmartlabs.android.ereceipt.R.id.ereceipt_detail_loading);
        initList();
        initImage();
        mRotationAnimationHandler = new RotationAnimationHandler(viewgroup, view, mItemList);
    }

    private boolean launchToImageMode()
    {
        return mActivity.getSharedPreferences("ERECEIPT_PREFS", 0).getBoolean("PREFS_LAUNCH_IMAGE_MODE", true);
    }

    private void setEReceiptImage(Bitmap bitmap)
    {
        if (bitmap == null)
        {
            bitmap = mActivity.getResources().getDrawable(com.walmartlabs.android.ereceipt.R.drawable.msco_basket_item_nophoto);
        } else
        {
            bitmap = new BitmapDrawable(mActivity.getResources(), bitmap);
        }
        mItemImage.setImageDrawable(bitmap);
    }

    private void setNextLaunchMode()
    {
        android.content.SharedPreferences.Editor editor = mActivity.getSharedPreferences("ERECEIPT_PREFS", 0).edit();
        editor.putBoolean("PREFS_LAUNCH_IMAGE_MODE", mInImageMode);
        editor.apply();
    }

    private void setReceiptContent()
    {
        if (mReceipt != null)
        {
            hideReceiptProgress();
            EReceiptManager.get().getReceipt(mReceiptUuid, new com.walmartlabs.ereceipt.service.EReceiptManager.ResultCallback() {

                final EReceiptDetailPresenter this$0;

                public void onResult(EReceipt ereceipt)
                {
                    mReceipt = ereceipt;
                    long l = ereceipt.rowId;
                    EReceiptManager.get().getReceiptItems(l, new com.walmartlabs.ereceipt.service.EReceiptManager.ResultCallback() {

                        final _cls4 this$1;

                        public volatile void onResult(Object obj)
                        {
                            onResult((List)obj);
                        }

                        public void onResult(List list)
                        {
                            if (!isPopped())
                            {
                                mItemListAdapter.setItems((com.walmartlabs.ereceipt.service.EReceipt.Item[])list.toArray(new com.walmartlabs.ereceipt.service.EReceipt.Item[list.size()]));
                            }
                        }

            
            {
                this$1 = _cls4.this;
                super();
            }
                    });
                    EReceiptManager.get().getReceiptTax(l, new com.walmartlabs.ereceipt.service.EReceiptManager.ResultCallback() {

                        final _cls4 this$1;

                        public volatile void onResult(Object obj)
                        {
                            onResult((List)obj);
                        }

                        public void onResult(List list)
                        {
                            if (!isPopped())
                            {
                                mTaxes = list;
                                updateListSummary();
                            }
                        }

            
            {
                this$1 = _cls4.this;
                super();
            }
                    });
                    EReceiptManager.get().getReceiptTender(l, new com.walmartlabs.ereceipt.service.EReceiptManager.ResultCallback() {

                        final _cls4 this$1;

                        public volatile void onResult(Object obj)
                        {
                            onResult((List)obj);
                        }

                        public void onResult(List list)
                        {
                            if (!isPopped())
                            {
                                mTenders = list;
                                updateListSummary();
                            }
                        }

            
            {
                this$1 = _cls4.this;
                super();
            }
                    });
                }

                public volatile void onResult(Object obj)
                {
                    onResult((EReceipt)obj);
                }

            
            {
                this$0 = EReceiptDetailPresenter.this;
                super();
            }
            });
            updateListSummary();
            updateBottomBar();
            MessageBus.getBus().post((new com.walmartlabs.anivia.AniviaEventAsJson.Builder("tcNumber")).putString("number", mReceipt.tcNumber));
        }
    }

    private void setSummaryItem(View view, String s, String s1, boolean flag)
    {
        TextView textview = (TextView)ViewUtil.findViewById(view, com.walmartlabs.android.ereceipt.R.id.summary_item_text);
        TextView textview1 = (TextView)ViewUtil.findViewById(view, com.walmartlabs.android.ereceipt.R.id.summary_item_price);
        if (flag)
        {
            view.setBackgroundResource(com.walmartlabs.android.ereceipt.R.drawable.ereceipt_summary_highlight);
            textview.setTextColor(mActivity.getResources().getColor(com.walmartlabs.android.ereceipt.R.color.black));
            textview1.setTextColor(mActivity.getResources().getColor(com.walmartlabs.android.ereceipt.R.color.black));
        }
        textview.setText(s);
        textview1.setText(s1);
    }

    private void toggleMode(boolean flag)
    {
        String s;
        Bus bus;
        boolean flag1;
        if (!mInImageMode)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        mInImageMode = flag1;
        updateToggleButton();
        mRotationAnimationHandler.flipViews(flag);
        bus = MessageBus.getBus();
        if (mInImageMode)
        {
            s = "image view";
        } else
        {
            s = "itemized view";
        }
        bus.post(new AnalyticsEvent("Ereceipt", "Receipt type viewed", s));
    }

    private void updateBottomBar()
    {
        if (mReceipt != null)
        {
            ViewUtil.setText(com.walmartlabs.android.ereceipt.R.id.date_line, mEReceiptDetailView, sFormattedDate.format(new Date(mReceipt.getTimeInMs())));
            ViewUtil.setText(com.walmartlabs.android.ereceipt.R.id.ereceipt_detail_items, mEReceiptDetailView, mActivity.getResources().getQuantityString(com.walmartlabs.android.ereceipt.R.plurals.item, mReceipt.itemsSold, new Object[] {
                Integer.valueOf(mReceipt.itemsSold)
            }));
            ViewUtil.setText(com.walmartlabs.android.ereceipt.R.id.ereceipt_detail_price, mEReceiptDetailView, mActivity.getString(com.walmartlabs.android.ereceipt.R.string.ereceipts_price, new Object[] {
                Float.valueOf(mReceipt.getPriceInDollar())
            }));
            String s = mReceipt.getFormattedAddressLine();
            if (s != null)
            {
                ViewUtil.setText(com.walmartlabs.android.ereceipt.R.id.address_line, mEReceiptDetailView, s);
            }
        }
    }

    private void updateListSummary()
    {
        if (mReceipt == null)
        {
            return;
        }
        Object obj = (ViewGroup)ViewUtil.findViewById(mFooterView, com.walmartlabs.android.ereceipt.R.id.summary_items);
        ((ViewGroup) (obj)).removeAllViews();
        setSummaryItem(ViewUtil.findViewById(mFooterView, com.walmartlabs.android.ereceipt.R.id.summary_top_row), mActivity.getResources().getQuantityString(com.walmartlabs.android.ereceipt.R.plurals.item, mReceipt.itemsSold, new Object[] {
            Integer.valueOf(mReceipt.itemsSold)
        }), getAmountString(mItemListAdapter.getItemSubtotal()), true);
        if (mReceipt.discountGiven > 0)
        {
            createSummaryItem(((ViewGroup) (obj)), mActivity.getString(com.walmartlabs.android.ereceipt.R.string.ereceipts_summary_discount), getAmountString(-mReceipt.discountGiven), false);
        }
        int i = mItemListAdapter.getCouponSavings();
        if (i < 0)
        {
            createSummaryItem(((ViewGroup) (obj)), mActivity.getString(com.walmartlabs.android.ereceipt.R.string.ereceipts_summary_coupon), getAmountString(i), false);
        }
        if (mReceipt.subtotal > 0)
        {
            createSummaryItem(((ViewGroup) (obj)), mActivity.getString(com.walmartlabs.android.ereceipt.R.string.ereceipts_summary_subtotal), getAmountString(mReceipt.subtotal), false);
        }
        if (mTaxes != null)
        {
            com.walmartlabs.ereceipt.service.EReceipt.Tax tax;
            for (Iterator iterator = mTaxes.iterator(); iterator.hasNext(); createSummaryItem(((ViewGroup) (obj)), (new StringBuilder()).append(mActivity.getString(com.walmartlabs.android.ereceipt.R.string.ereceipts_summary_tax)).append(" ").append(tax.level).append(" ").append(tax.rateStr).append("%").toString(), getAmountString(tax.amount), false))
            {
                tax = (com.walmartlabs.ereceipt.service.EReceipt.Tax)iterator.next();
            }

        }
        Object obj1 = createSummaryItem(((ViewGroup) (obj)), mActivity.getString(com.walmartlabs.android.ereceipt.R.string.ereceipts_summary_total), getAmountString(mReceipt.total), true);
        android.widget.LinearLayout.LayoutParams layoutparams = (android.widget.LinearLayout.LayoutParams)((View) (obj1)).getLayoutParams();
        layoutparams.setMargins(layoutparams.leftMargin, layoutparams.topMargin + ViewUtil.dpToPixels(10, mActivity), layoutparams.rightMargin, layoutparams.bottomMargin);
        ((View) (obj1)).setLayoutParams(layoutparams);
        if (mTenders != null)
        {
            com.walmartlabs.ereceipt.service.EReceipt.Tender tender;
            for (obj1 = mTenders.iterator(); ((Iterator) (obj1)).hasNext(); createSummaryItem(((ViewGroup) (obj)), WordUtils.capitalizeFully(tender.name), getAmountString(tender.amount), false))
            {
                tender = (com.walmartlabs.ereceipt.service.EReceipt.Tender)((Iterator) (obj1)).next();
            }

            createSummaryItem(((ViewGroup) (obj)), mActivity.getString(com.walmartlabs.android.ereceipt.R.string.ereceipts_summary_change), getAmountString(-mReceipt.changeDue), false);
        }
        obj = ViewUtil.findViewById(mFooterView, com.walmartlabs.android.ereceipt.R.id.summary_bottom);
        obj1 = (BitmapDrawable)mActivity.getResources().getDrawable(com.walmartlabs.android.ereceipt.R.drawable.ereceipt_bg_summary_bottom);
        ((BitmapDrawable) (obj1)).setTileModeXY(android.graphics.Shader.TileMode.REPEAT, android.graphics.Shader.TileMode.CLAMP);
        ((View) (obj)).setBackgroundDrawable(((android.graphics.drawable.Drawable) (obj1)));
    }

    private void updateToggleButton()
    {
label0:
        {
            if (mToggleButton != null)
            {
                if (!mInImageMode)
                {
                    break label0;
                }
                mToggleButton.setIcon(com.walmartlabs.android.ereceipt.R.drawable.ereceipt_ic_listview);
            }
            return;
        }
        mToggleButton.setIcon(com.walmartlabs.android.ereceipt.R.drawable.ereceipt_ic_imageview);
    }

    public View getView()
    {
        return mEReceiptDetailView;
    }

    public void onAfterPop()
    {
        super.onAfterPop();
        if (!mReceiptIdMode)
        {
            setNextLaunchMode();
        }
        mRotationAnimationHandler.setListener(null);
        if (mItemImage != null)
        {
            ViewUtil.recycleImageView(mItemImage);
            mItemImage = null;
        }
        mItemListAdapter.finish();
        mEReceiptDetailView.removeAllViews();
        mEReceiptDetailView = null;
    }

    public void onBeforePoppedTo()
    {
        super.onBeforePoppedTo();
    }

    public void onBeforePush()
    {
        super.onBeforePush();
        if (mReceiptIdMode)
        {
            downloadReceipt();
            return;
        } else
        {
            fetchReceiptImage();
            return;
        }
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        if (mItemImage != null)
        {
            mItemImage.setLayoutListener();
        }
    }

    protected Dialog onCreateDialog(int i)
    {
        switch (i)
        {
        default:
            return super.onCreateDialog(i);

        case 0: // '\0'
            com.walmart.android.ui.CustomAlertDialog.Builder builder = new com.walmart.android.ui.CustomAlertDialog.Builder(mActivity, mDialogConfig);
            builder.setMessage(mActivity.getString(com.walmartlabs.android.ereceipt.R.string.ereceipts_dialog_error));
            builder.setPositiveButton(0x104000a, new android.content.DialogInterface.OnClickListener() {

                final EReceiptDetailPresenter this$0;

                public void onClick(DialogInterface dialoginterface, int j)
                {
                    dismissDialog(0);
                    pop();
                }

            
            {
                this$0 = EReceiptDetailPresenter.this;
                super();
            }
            });
            builder.setCancelable(false);
            builder.setIcon(null);
            return builder.create();

        case 1: // '\001'
            return (new com.walmart.android.ui.CustomAlertDialog.Builder(mActivity, mDialogConfig)).setTitle(com.walmartlabs.android.ereceipt.R.string.ereceipts_confirm_delete_dialog).setPositiveButton(0x104000a, new android.content.DialogInterface.OnClickListener() {

                final EReceiptDetailPresenter this$0;

                public void onClick(DialogInterface dialoginterface, int j)
                {
                    dialoginterface.dismiss();
                    deleteReceipt();
                }

            
            {
                this$0 = EReceiptDetailPresenter.this;
                super();
            }
            }).setNegativeButton(com.walmartlabs.android.ereceipt.R.string.cancel_button, new android.content.DialogInterface.OnClickListener() {

                final EReceiptDetailPresenter this$0;

                public void onClick(DialogInterface dialoginterface, int j)
                {
                    dialoginterface.cancel();
                }

            
            {
                this$0 = EReceiptDetailPresenter.this;
                super();
            }
            }).setIcon(null).create();
        }
    }

    public boolean onCreateMenu(Menu menu, MenuInflater menuinflater)
    {
        menuinflater.inflate(com.walmartlabs.android.ereceipt.R.menu.ereceipt_detail_actions, menu);
        mToggleButton = menu.findItem(com.walmartlabs.android.ereceipt.R.id.action_toggle_button);
        updateToggleButton();
        return super.onCreateMenu(menu, menuinflater);
    }

    protected void onCreateView(ViewGroup viewgroup)
    {
        super.onCreateView(viewgroup);
        if (mEReceiptDetailView == null)
        {
            initView(viewgroup);
            if (!mReceiptIdMode)
            {
                setReceiptContent();
                if (!launchToImageMode())
                {
                    toggleMode(false);
                }
            }
        }
    }

    public boolean onOptionsMenuItemSelected(MenuItem menuitem, Activity activity)
    {
        int i = menuitem.getItemId();
        if (i == com.walmartlabs.android.ereceipt.R.id.action_toggle_button)
        {
            toggleMode(true);
        } else
        {
            if (i == com.walmartlabs.android.ereceipt.R.id.action_delete)
            {
                showDialog(1);
                return true;
            }
            if (i == com.walmartlabs.android.ereceipt.R.id.action_return)
            {
                if (mItemPresenterFactory != null && mReceipt != null)
                {
                    mItemPresenterFactory.startReturn(mReceipt.tcNumber);
                    MessageBus.getBus().post(new com.walmartlabs.anivia.AniviaEventAsJson.Builder("returnItem"));
                    return true;
                }
            } else
            {
                return super.onOptionsMenuItemSelected(menuitem, activity);
            }
        }
        return true;
    }

    public void setDeleteHandler(DeleteHandler deletehandler)
    {
        mDeleteHandler = deletehandler;
    }

    public void setDialogConfiguration(int i)
    {
        mDialogConfig = i;
    }

    public void setItemPresenterFactory(EReceiptItemPresenterFactory ereceiptitempresenterfactory)
    {
        mItemPresenterFactory = ereceiptitempresenterfactory;
    }

    static 
    {
        sFormattedDate = new SimpleDateFormat("MMMM dd, yyyy", Locale.US);
    }





/*
    static List access$1102(EReceiptDetailPresenter ereceiptdetailpresenter, List list)
    {
        ereceiptdetailpresenter.mTenders = list;
        return list;
    }

*/











/*
    static EReceipt access$402(EReceiptDetailPresenter ereceiptdetailpresenter, EReceipt ereceipt)
    {
        ereceiptdetailpresenter.mReceipt = ereceipt;
        return ereceipt;
    }

*/






/*
    static List access$902(EReceiptDetailPresenter ereceiptdetailpresenter, List list)
    {
        ereceiptdetailpresenter.mTaxes = list;
        return list;
    }

*/
}
