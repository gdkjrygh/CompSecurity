// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.saver;

import android.app.Activity;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.os.Handler;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.widget.HeaderViewListAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.squareup.otto.Bus;
import com.walmart.android.app.WalmartLinkMovementMethod;
import com.walmart.android.app.item.ItemPriceView;
import com.walmart.android.service.AsyncCallbackOnThread;
import com.walmart.android.service.MessageBus;
import com.walmart.android.service.saver.SaverManager;
import com.walmart.android.ui.OnSingleClickListener;
import com.walmart.android.ui.Presenter;
import com.walmart.android.utils.ViewUtil;
import com.walmart.android.wmservice.Services;
import com.walmart.android.wmservice.WalmartNetService;
import com.walmartlabs.utils.WLog;
import java.util.ArrayList;

// Referenced classes of package com.walmart.android.app.saver:
//            HasGetItBackBar, SaverReceiptItemComparisonListAdapter

public class SaverReceiptItemComparisonPresenter extends Presenter
    implements HasGetItBackBar
{
    public static interface ActionCallbacks
    {

        public abstract void onShowFeedback(com.walmart.android.service.saver.SaverReceipt.Item item);

        public abstract void onShowItemDetails(com.walmart.android.service.saver.SaverReceipt.Item item);
    }


    private static final String TAG = com/walmart/android/app/saver/SaverReceiptItemComparisonPresenter.getSimpleName();
    private ActionCallbacks mActionCallbacks;
    private final Activity mActivity;
    private TextView mDealsFoundViewInEmpty;
    private TextView mDealsFoundViewInHeader;
    private Bitmap mDefaultImage;
    private View mEmptyView;
    private final String mImageUrl;
    private final com.walmart.android.service.saver.SaverReceipt.Item mItem;
    private final Spanned mItemName;
    private final SaverReceiptItemComparisonListAdapter mListAdapter;
    private ListView mListView;
    private View mRootView;

    public SaverReceiptItemComparisonPresenter(Activity activity, com.walmart.android.service.saver.SaverReceipt.Item item, Spanned spanned, String s)
    {
        mActivity = activity;
        mItem = item;
        mItemName = spanned;
        mImageUrl = s;
        setTitleText(mActivity.getString(0x7f090498));
        mListAdapter = new SaverReceiptItemComparisonListAdapter(mActivity, item.getPrice(), item.quantity, item.unitType);
    }

    private CharSequence createFeedbackText()
    {
        String s = (new StringBuilder()).append(mActivity.getText(0x7f090493)).append(" ").toString();
        CharSequence charsequence = mActivity.getText(0x7f090492);
        SpannableStringBuilder spannablestringbuilder = new SpannableStringBuilder(s);
        spannablestringbuilder.append(charsequence);
        spannablestringbuilder.setSpan(new ClickableSpan() {

            final SaverReceiptItemComparisonPresenter this$0;

            public void onClick(View view)
            {
                if (mActionCallbacks != null)
                {
                    mActionCallbacks.onShowFeedback(mItem);
                }
            }

            public void updateDrawState(TextPaint textpaint)
            {
                super.updateDrawState(textpaint);
                textpaint.setUnderlineText(false);
            }

            
            {
                this$0 = SaverReceiptItemComparisonPresenter.this;
                super();
            }
        }, s.length(), s.length() + charsequence.length(), 33);
        spannablestringbuilder.setSpan(new ForegroundColorSpan(mActivity.getResources().getColor(0x7f0f0109)), s.length(), s.length() + charsequence.length(), 33);
        return spannablestringbuilder;
    }

    private void fetchCompetitors()
    {
        SaverManager.get().getCompetitors(mItem.itemId, new com.walmart.android.service.saver.SaverManager.ResultCallback() {

            final SaverReceiptItemComparisonPresenter this$0;

            public void onResult(Cursor cursor)
            {
                updateDealsFound(cursor.getCount());
                mListAdapter.changeCursor(cursor);
            }

            public volatile void onResult(Object obj)
            {
                onResult((Cursor)obj);
            }

            
            {
                this$0 = SaverReceiptItemComparisonPresenter.this;
                super();
            }
        });
    }

    private void loadProductImage(String s)
    {
        if (s != null && !"".equals(s))
        {
            AsyncCallbackOnThread asynccallbackonthread = new AsyncCallbackOnThread(new Handler()) {

                final SaverReceiptItemComparisonPresenter this$0;

                public void onFailureSameThread(Integer integer, Bitmap bitmap)
                {
                    WLog.e(SaverReceiptItemComparisonPresenter.TAG, (new StringBuilder()).append("Failed to load detail image: ").append(integer).toString());
                }

                public volatile void onFailureSameThread(Object obj, Object obj1)
                {
                    onFailureSameThread((Integer)obj, (Bitmap)obj1);
                }

                public void onSuccessSameThread(Bitmap bitmap)
                {
                    if (isPopped())
                    {
                        bitmap.recycle();
                        return;
                    } else
                    {
                        updateImage(bitmap);
                        return;
                    }
                }

                public volatile void onSuccessSameThread(Object obj)
                {
                    onSuccessSameThread((Bitmap)obj);
                }

            
            {
                this$0 = SaverReceiptItemComparisonPresenter.this;
                super(handler);
            }
            };
            Services.get().getWalmartService().getImage(s, asynccallbackonthread);
        } else
        if (hasDefaultImage())
        {
            updateImage(mDefaultImage);
            return;
        }
    }

    private void trackPageView()
    {
        com.walmartlabs.anivia.AniviaEventAsJson.Builder builder = (new com.walmartlabs.anivia.AniviaEventAsJson.Builder("pageView")).putString("name", "Price Comparison").putString("section", "Saver").putString("subCategory", "Savings Catcher");
        MessageBus.getBus().post(builder);
    }

    private void updateDealsFound(int i)
    {
        mDealsFoundViewInEmpty.setText(mActivity.getResources().getQuantityString(0x7f110009, i, new Object[] {
            Integer.valueOf(i)
        }));
        mDealsFoundViewInHeader.setText(mActivity.getResources().getQuantityString(0x7f110009, i, new Object[] {
            Integer.valueOf(i)
        }));
    }

    private void updateImage(Bitmap bitmap)
    {
        ImageView imageview = (ImageView)mRootView.findViewById(0x7f100481);
        imageview.setImageBitmap(bitmap);
        bitmap = new AlphaAnimation(0.0F, 1.0F);
        bitmap.setDuration(250L);
        imageview.startAnimation(bitmap);
        ViewUtil.setText(0x7f100482, mRootView, mItemName);
    }

    private void updatePrice()
    {
label0:
        {
            if (mItem != null)
            {
                Object obj = (ItemPriceView)ViewUtil.findViewById(mRootView, 0x7f100483);
                ((ItemPriceView) (obj)).setPrice(mActivity.getString(0x7f0900fc, new Object[] {
                    Float.valueOf(mItem.getPriceInDollar())
                }));
                ((ItemPriceView) (obj)).setVisibility(0);
                if (!"lb".equalsIgnoreCase(mItem.unitType))
                {
                    break label0;
                }
                obj = (TextView)ViewUtil.findViewById(mRootView, 0x7f1000fe);
                ((TextView) (obj)).setText(mActivity.getString(0x7f0900fb, new Object[] {
                    Float.valueOf(mItem.quantity), Integer.valueOf(mItem.unitQuantity), Float.valueOf(mItem.getUnitPriceInDollar())
                }));
                ((TextView) (obj)).setVisibility(0);
            }
            return;
        }
        if (mItem.quantity > 1.0F && mItem.unitType == null)
        {
            TextView textview = (TextView)ViewUtil.findViewById(mRootView, 0x7f1000fe);
            textview.setText(mActivity.getString(0x7f0900fd, new Object[] {
                Integer.valueOf((int)mItem.quantity), Float.valueOf(mItem.getUnitPriceInDollar())
            }));
            textview.setVisibility(0);
            return;
        } else
        {
            ViewUtil.findViewById(mRootView, 0x7f1000fe).setVisibility(8);
            return;
        }
    }

    public int getRedeemLimit()
    {
        return 50;
    }

    public View getView()
    {
        return mRootView;
    }

    public boolean hasDefaultImage()
    {
        return mDefaultImage != null;
    }

    public void onAfterPop()
    {
        super.onAfterPop();
        mListAdapter.changeCursor(null);
        ViewUtil.recycleImageView(mRootView, 0x7f100481);
        if (mDefaultImage != null && !mDefaultImage.isRecycled())
        {
            mDefaultImage.recycle();
        }
        mRootView = null;
    }

    public void onBeforePoppedTo()
    {
        super.onBeforePoppedTo();
        trackPageView();
    }

    public void onBeforePush()
    {
        super.onBeforePush();
        fetchCompetitors();
    }

    public boolean onCreateMenu(Menu menu, MenuInflater menuinflater)
    {
        menu.clear();
        return super.onCreateMenu(menu, menuinflater);
    }

    protected void onCreateView(ViewGroup viewgroup)
    {
        if (mRootView == null)
        {
            mRootView = mActivity.getLayoutInflater().inflate(0x7f040160, viewgroup, false);
            mListView = (ListView)ViewUtil.findViewById(mRootView, 0x7f1004cf);
            mDealsFoundViewInHeader = (TextView)ViewUtil.inflate(mActivity, 0x7f040163, mListView, false);
            Object obj = ViewUtil.inflate(mActivity, 0x7f040162, mListView, false);
            Object obj1 = new ArrayList(1);
            ArrayList arraylist = new ArrayList(0);
            Object obj2 = mListView;
            obj2.getClass();
            obj2 = new android.widget.ListView.FixedViewInfo(((ListView) (obj2)));
            obj2.view = mDealsFoundViewInHeader;
            obj2.isSelectable = false;
            ((ArrayList) (obj1)).add(obj2);
            obj2 = mListView;
            obj2.getClass();
            obj2 = new android.widget.ListView.FixedViewInfo(((ListView) (obj2)));
            obj2.view = ((View) (obj));
            obj2.isSelectable = false;
            arraylist.add(obj2);
            obj1 = new HeaderViewListAdapter(((ArrayList) (obj1)), arraylist, mListAdapter) {

                final SaverReceiptItemComparisonPresenter this$0;

                public boolean areAllItemsEnabled()
                {
                    return true;
                }

            
            {
                this$0 = SaverReceiptItemComparisonPresenter.this;
                super(arraylist, arraylist1, listadapter);
            }
            };
            mListView.setAdapter(((ListAdapter) (obj1)));
            mEmptyView = ViewUtil.findViewById(mRootView, 0x7f1004d0);
            mDealsFoundViewInEmpty = (TextView)ViewUtil.findViewById(mEmptyView, 0x7f1004d6);
            mListView.setEmptyView(mEmptyView);
            ViewUtil.findViewById(mRootView, 0x7f100480).setOnClickListener(new OnSingleClickListener(this) {

                final SaverReceiptItemComparisonPresenter this$0;

                public void onSingleClick(View view)
                {
                    if (mActionCallbacks != null)
                    {
                        mActionCallbacks.onShowItemDetails(mItem);
                    }
                }

            
            {
                this$0 = SaverReceiptItemComparisonPresenter.this;
                super(presenter);
            }
            });
            obj = (TextView)ViewUtil.findViewById(((View) (obj)), 0x7f1004d5);
            ((TextView) (obj)).setText(createFeedbackText());
            ((TextView) (obj)).setMovementMethod(WalmartLinkMovementMethod.getInstance(mActivity));
            obj = (TextView)ViewUtil.findViewById(mEmptyView, 0x7f1004d5);
            ((TextView) (obj)).setText(createFeedbackText());
            ((TextView) (obj)).setMovementMethod(WalmartLinkMovementMethod.getInstance(mActivity));
        }
        super.onCreateView(viewgroup);
    }

    public void onPushed()
    {
        loadProductImage(mImageUrl);
        updatePrice();
        trackPageView();
    }

    public void onResumeAsTop()
    {
        super.onResumeAsTop();
        trackPageView();
    }

    public void setActionCallbacks(ActionCallbacks actioncallbacks)
    {
        mActionCallbacks = actioncallbacks;
    }

    public void setDefaultImage(Bitmap bitmap)
    {
        mDefaultImage = bitmap;
    }







}
