// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.shop;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.os.Handler;
import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.squareup.otto.Bus;
import com.walmart.android.app.item.ItemDetailsPresenter;
import com.walmart.android.app.item.ItemPriceView;
import com.walmart.android.app.item.ProductImagePresenter;
import com.walmart.android.app.item.view.InStoreView;
import com.walmart.android.app.shop.map.InStoreMapFullScreenPresenter;
import com.walmart.android.app.shop.map.InStoreMapSectionController;
import com.walmart.android.app.shop.map.ItemSourceDataMapper;
import com.walmart.android.app.shop.map.MappedSections;
import com.walmart.android.app.shop.map.SimpleItemPagerAdapter;
import com.walmart.android.app.shop.map.SourceDataMapper;
import com.walmart.android.data.StoreAvailabilityData;
import com.walmart.android.service.AsyncCallbackOnThread;
import com.walmart.android.service.MessageBus;
import com.walmart.android.ui.OnSingleClickListener;
import com.walmart.android.ui.Presenter;
import com.walmart.android.util.AvailabilityUtils;
import com.walmart.android.util.ImageUtils;
import com.walmart.android.utils.ViewUtil;
import com.walmart.android.wmservice.Services;
import com.walmart.android.wmservice.WalmartNetService;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

public class SimpleItemDetailsPresenter extends Presenter
{
    private class MapLoadingCallbacks
        implements com.walmart.android.app.shop.map.InStoreMapController.LoadingCallbacks
    {

        final SimpleItemDetailsPresenter this$0;

        public void onAislesLoaded()
        {
            SimpleItemDetailsPresenter simpleitemdetailspresenter = SimpleItemDetailsPresenter.this;
            boolean flag;
            if (mStoreMapSectionController.getSourceDataMapper().hasAllData() && mStoreMapSectionController.isMapLoaded())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            simpleitemdetailspresenter.mHasLoadedMap = flag;
            sendPendingPageViewEvents();
        }

        public void onMapFail()
        {
            mHasLoadedMap = true;
            sendPendingPageViewEvents();
        }

        public void onMapLoaded()
        {
            SimpleItemDetailsPresenter simpleitemdetailspresenter = SimpleItemDetailsPresenter.this;
            boolean flag;
            if (mStoreMapSectionController.getSourceDataMapper().hasAllData() && mStoreMapSectionController.isMapLoaded())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            simpleitemdetailspresenter.mHasLoadedMap = flag;
            sendPendingPageViewEvents();
        }

        public void onStoreDataSourceChanged()
        {
            SimpleItemDetailsPresenter simpleitemdetailspresenter = SimpleItemDetailsPresenter.this;
            boolean flag;
            if (mStoreMapSectionController.getSourceDataMapper().hasAllData() && mStoreMapSectionController.isMapLoaded())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            simpleitemdetailspresenter.mHasLoadedMap = flag;
            sendPendingPageViewEvents();
        }

        private MapLoadingCallbacks()
        {
            this$0 = SimpleItemDetailsPresenter.this;
            super();
        }

    }


    private static final String ROLLBACK = "ROLLBACK";
    protected static final String TAG = com/walmart/android/app/shop/SimpleItemDetailsPresenter.getSimpleName();
    private StoreAvailabilityData mAvailabilityData;
    private final Context mContext;
    private String mDealInfo;
    private Bitmap mDefaultImage;
    private String mDescription;
    private boolean mHasInfo;
    private boolean mHasLoadedMap;
    private boolean mHasProductImage;
    private String mImageUrl;
    private String mInstoreAddress;
    private boolean mIsPushed;
    private Spanned mItemName;
    private int mPendingPageviewEvents;
    private String mPrefix;
    private String mPrice;
    private String mPricePerUnit;
    private String mPriceUnit;
    private View mRootView;
    private String mStoreId;
    private InStoreMapSectionController mStoreMapSectionController;
    private String mSubPrice;
    private String mUpc;

    public SimpleItemDetailsPresenter(Context context)
    {
        mContext = context;
    }

    private void loadDescription()
    {
        if (!TextUtils.isEmpty(mDescription))
        {
            LinearLayout linearlayout = (LinearLayout)mRootView.findViewById(0x7f10031c);
            ((TextView)linearlayout.findViewById(0x7f1001b4)).setText(mDescription);
            linearlayout.setVisibility(0);
        }
    }

    private void loadInfo()
    {
        ViewUtil.setText(0x7f10004f, mRootView, mItemName);
        loadProductImage(mImageUrl);
        loadPrice();
        loadRollback();
        loadDescription();
    }

    private void loadPrice()
    {
        if (!TextUtils.isEmpty(mPrefix))
        {
            TextView textview = (TextView)mRootView.findViewById(0x7f100571);
            textview.setText(mPrefix);
            textview.setVisibility(0);
        }
        if (!TextUtils.isEmpty(mPrice))
        {
            ItemPriceView itempriceview = (ItemPriceView)ViewUtil.findViewById(mRootView, 0x7f1000a8);
            itempriceview.setPrice(mPrice);
            Object obj;
            if (!TextUtils.isEmpty(mPriceUnit))
            {
                obj = mPriceUnit;
            } else
            {
                obj = null;
            }
            itempriceview.setUnit(((String) (obj)));
            itempriceview.setVisibility(0);
        }
        if (!TextUtils.isEmpty(mSubPrice))
        {
            obj = (TextView)mRootView.findViewById(0x7f100591);
            ((TextView) (obj)).setText(mSubPrice);
            ((TextView) (obj)).setVisibility(0);
        }
        if (TextUtils.isEmpty(mPriceUnit) && !TextUtils.isEmpty(mPricePerUnit))
        {
            obj = (TextView)ViewUtil.findViewById(mRootView, 0x7f10017c);
            ((TextView) (obj)).setText(mPricePerUnit);
            ((TextView) (obj)).setVisibility(0);
        }
    }

    private void loadProductImage(String s)
    {
        if (s != null && !"".equals(s))
        {
            AsyncCallbackOnThread asynccallbackonthread = new AsyncCallbackOnThread(new Handler()) {

                final SimpleItemDetailsPresenter this$0;

                public void onFailureSameThread(Integer integer, Bitmap bitmap)
                {
                    Log.e(SimpleItemDetailsPresenter.TAG, (new StringBuilder()).append("Failed to load detail image: ").append(integer).toString());
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
                        setImage(bitmap, false);
                        return;
                    }
                }

                public volatile void onSuccessSameThread(Object obj)
                {
                    onSuccessSameThread((Bitmap)obj);
                }

            
            {
                this$0 = SimpleItemDetailsPresenter.this;
                super(handler);
            }
            };
            Services.get().getWalmartService().getImage(s, asynccallbackonthread);
        } else
        if (hasDefaultImage())
        {
            setImage(mDefaultImage, true);
            return;
        }
    }

    private void loadRollback()
    {
        if ("ROLLBACK".equals(mDealInfo))
        {
            int i = ViewUtil.dpToPixels(5, mRootView.getContext().getResources().getDisplayMetrics());
            ImageView imageview = (ImageView)mRootView.findViewById(0x7f100590);
            ViewUtil.recycleImageView(mRootView, 0x7f100590);
            imageview.setImageBitmap(ImageUtils.createPriceFlag(mDealInfo, Color.rgb(238, 53, 42), ViewUtil.dpToPixels(16, mRootView.getContext().getResources().getDisplayMetrics())));
            imageview.setPadding(0, i, i, 0);
            imageview.setVisibility(0);
        }
    }

    private void loadStoreAvailability()
    {
        if (mAvailabilityData != null)
        {
            mRootView.findViewById(0x7f1001f8).setVisibility(8);
            mRootView.findViewById(0x7f1001f5).setVisibility(8);
            android.text.SpannableStringBuilder spannablestringbuilder = AvailabilityUtils.getStockString(mContext, mAvailabilityData.stockStatus);
            String as[] = mAvailabilityData.aisleLocations;
            String s = mAvailabilityData.department;
            Object obj1 = mInstoreAddress;
            Object obj = obj1;
            if (obj1 == null)
            {
                obj = "";
            }
            obj1 = (TextView)ViewUtil.findViewById(mRootView, 0x7f1001f4);
            ((TextView) (obj1)).setVisibility(0);
            ((TextView) (obj1)).setText(mContext.getString(0x7f090193, new Object[] {
                obj
            }));
            obj1 = (TextView)ViewUtil.findViewById(mRootView, 0x7f1001f3);
            obj = (ViewGroup)ViewUtil.findViewById(mRootView, 0x7f1001f6);
            if (spannablestringbuilder != null)
            {
                ((TextView) (obj1)).setText(spannablestringbuilder);
                ((TextView) (obj1)).setVisibility(0);
            }
            if (as != null && as.length > 0)
            {
                ItemDetailsPresenter.setAisleFlags(((ViewGroup) (obj)), as, mContext);
                ((ViewGroup) (obj)).setVisibility(0);
                ViewUtil.setText(0x7f1001f7, ((View) (obj)), mContext.getResources().getQuantityString(0x7f110004, as.length));
                obj1 = new TextView(mContext);
                ((TextView) (obj1)).setTextAppearance(mContext, 0x7f0b0049);
                ((TextView) (obj1)).setText(mContext.getString(0x7f090178, new Object[] {
                    s
                }));
                ((ViewGroup) (obj)).addView(((View) (obj1)));
            } else
            {
                ((ViewGroup) (obj)).setVisibility(8);
            }
            if (mAvailabilityData.hasStoreLocationData)
            {
                mStoreMapSectionController.setStoreDataSource(mStoreId, mAvailabilityData);
            } else
            {
                mStoreMapSectionController.setStoreDataSource(null, null);
            }
            obj1 = (ItemPriceView)ViewUtil.findViewById(mRootView, 0x7f1001eb);
            ((ItemPriceView) (obj1)).setPrice(mPrice);
            if (!TextUtils.isEmpty(mPriceUnit))
            {
                obj = mPriceUnit;
            } else
            {
                obj = null;
            }
            ((ItemPriceView) (obj1)).setUnit(((String) (obj)));
            if (TextUtils.isEmpty(mPriceUnit) && !TextUtils.isEmpty(mPricePerUnit))
            {
                obj = (TextView)ViewUtil.findViewById(mRootView, 0x7f1001f1);
                ((TextView) (obj)).setText(mPricePerUnit);
                ((TextView) (obj)).setVisibility(0);
            }
            mRootView.findViewById(0x7f10058d).setVisibility(8);
            mRootView.findViewById(0x7f10058e).setVisibility(8);
            return;
        } else
        {
            mRootView.findViewById(0x7f1001e9).setVisibility(8);
            mStoreMapSectionController.setStoreDataSource(null, null);
            return;
        }
    }

    private void sendPendingPageViewEvents()
    {
        if (mHasLoadedMap && mPendingPageviewEvents > 0)
        {
            for (int i = 0; i < mPendingPageviewEvents; i++)
            {
                com.walmartlabs.anivia.AniviaEventAsJson.Builder builder = (new com.walmartlabs.anivia.AniviaEventAsJson.Builder("pageView")).putString("name", "product detail").putString("section", "shop");
                if (!TextUtils.isEmpty(mUpc))
                {
                    builder.putString("upc", mUpc);
                }
                if (!TextUtils.isEmpty(mItemName))
                {
                    builder.putString("productName", mItemName.toString());
                }
                builder.putBoolean("recModule", false);
                if (!TextUtils.isEmpty(mStoreId))
                {
                    builder.putString("storeId", mStoreId);
                }
                if (mAvailabilityData != null && !TextUtils.isEmpty(mAvailabilityData.stockStatus) && !TextUtils.isEmpty(mStoreId))
                {
                    builder.putString("storeAvailability", mAvailabilityData.stockStatus);
                }
                if (mStoreMapSectionController.getSourceDataMapper().hasAllData() && mStoreMapSectionController.isMapLoaded())
                {
                    List list = mStoreMapSectionController.getSourceDataMapper().getMappedSections().getAnalyticsMappedLocations();
                    if (!list.isEmpty())
                    {
                        builder.putString("aisleMapped", (String)list.get(0));
                    }
                    list = mStoreMapSectionController.getSourceDataMapper().getMappedSections().getAnalyticsMissingLocations();
                    if (!list.isEmpty())
                    {
                        builder.putString("aisleNotMapped", StringUtils.join(list.toArray(new String[list.size()]), ','));
                    }
                }
                MessageBus.getBus().post(builder);
            }

            mPendingPageviewEvents = 0;
        }
    }

    private void setImage(Bitmap bitmap, boolean flag)
    {
        ImageView imageview = (ImageView)mRootView.findViewById(0x7f10004b);
        imageview.setImageBitmap(bitmap);
        bitmap = new AlphaAnimation(0.0F, 1.0F);
        bitmap.setDuration(250L);
        imageview.startAnimation(bitmap);
        if (!flag)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        mHasProductImage = flag;
        mRootView.findViewById(0x7f100083).setVisibility(8);
    }

    public String getTitleText()
    {
        return "Item Details";
    }

    public View getView()
    {
        return mRootView;
    }

    public boolean hasDefaultImage()
    {
        return mDefaultImage != null;
    }

    public void init(Spanned spanned, String s, String s1, String s2, String s3, String s4, String s5)
    {
        init(spanned, s, s1, null, s2, s3, s4, s5);
    }

    public void init(Spanned spanned, String s, String s1, String s2, String s3, String s4, String s5, 
            String s6)
    {
        if (!isPopped())
        {
            if (mHasInfo)
            {
                throw new IllegalStateException("Init has already been called either explicitly or by a constructor.");
            }
            mItemName = spanned;
            mUpc = s;
            mDealInfo = s6;
            mDescription = s5;
            mImageUrl = s1;
            mPrefix = s2;
            mPrice = s3;
            mSubPrice = s4;
            mHasInfo = true;
            mStoreMapSectionController = new InStoreMapSectionController(mContext, new ItemSourceDataMapper(), new MapLoadingCallbacks());
            if (mIsPushed)
            {
                loadInfo();
                return;
            }
        }
    }

    public void init(String s, String s1, String s2, String s3, String s4, String s5, String s6)
    {
        init(Html.fromHtml(s), s1, s2, s3, s4, s5, s6);
    }

    public void onAfterPop()
    {
        super.onAfterPop();
        mStoreMapSectionController.stop();
        mStoreMapSectionController.destroy();
        ViewUtil.recycleImageView(mRootView, 0x7f10004b);
        ViewUtil.recycleImageView(mRootView, 0x7f100590);
        if (mDefaultImage != null && !mDefaultImage.isRecycled())
        {
            mDefaultImage.recycle();
        }
        mRootView = null;
    }

    public void onBeforePoppedTo()
    {
        super.onBeforePoppedTo();
        mStoreMapSectionController.start();
    }

    public void onBeforePush()
    {
        super.onBeforePush();
        mStoreMapSectionController.start();
    }

    protected void onCreateView(ViewGroup viewgroup)
    {
        super.onCreateView(viewgroup);
        if (mRootView == null)
        {
            mRootView = LayoutInflater.from(mContext).inflate(0x7f04019c, viewgroup, false);
            mStoreMapSectionController.setMapVisibilityCallback(new com.walmart.android.app.shop.map.InStoreMapController.MapVisibilityCallback() {

                final SimpleItemDetailsPresenter this$0;

                public void onMapVisibilityChanged(boolean flag)
                {
                    ((InStoreView)ViewUtil.findViewById(mRootView, 0x7f1001e9)).showInStoreMap(flag);
                }

            
            {
                this$0 = SimpleItemDetailsPresenter.this;
                super();
            }
            });
            viewgroup = (ViewGroup)ViewUtil.findViewById(mRootView, 0x7f100183);
            mStoreMapSectionController.setContainerView(viewgroup);
            loadStoreAvailability();
            viewgroup = (ImageView)mRootView.findViewById(0x7f10004b);
            viewgroup.setOnClickListener(new OnSingleClickListener(viewgroup) {

                final SimpleItemDetailsPresenter this$0;
                final ImageView val$imageView;

                public void onSingleClick(View view)
                {
                    if (mHasProductImage && (BitmapDrawable)imageView.getDrawable() != null)
                    {
                        view = new com.walmartlabs.anivia.AniviaEventAsJson.Builder("enlargePic");
                        MessageBus.getBus().post(view);
                        view = new ArrayList();
                        view.add(mImageUrl);
                        view = new ProductImagePresenter(mContext, view);
                        pushPresenter(view);
                    }
                }

            
            {
                this$0 = SimpleItemDetailsPresenter.this;
                imageView = imageview;
                super(final_presenter);
            }
            });
            ViewUtil.findViewById(mRootView, 0x7f100183).setOnClickListener(new OnSingleClickListener(this) {

                final SimpleItemDetailsPresenter this$0;

                public void onSingleClick(View view)
                {
                    if (mAvailabilityData != null)
                    {
                        view = new SimpleItemPagerAdapter();
                        Spanned spanned = mItemName;
                        String s = mImageUrl;
                        String s1 = mPrefix;
                        String s2 = mPrice;
                        boolean flag;
                        if (mSubPrice != null)
                        {
                            flag = true;
                        } else
                        {
                            flag = false;
                        }
                        view.setItemData(spanned, s, s1, s2, flag, mPriceUnit, mPricePerUnit, mAvailabilityData.stockStatus);
                        pushPresenter(new InStoreMapFullScreenPresenter(mContext, getTitleText(), mStoreMapSectionController.getSourceDataMapper(), view, null));
                    }
                }

            
            {
                this$0 = SimpleItemDetailsPresenter.this;
                super(presenter);
            }
            });
        }
    }

    public void onNewTop()
    {
        super.onNewTop();
        mStoreMapSectionController.stop();
    }

    protected void onPageView()
    {
        super.onPageView();
        mPendingPageviewEvents = mPendingPageviewEvents + 1;
        sendPendingPageViewEvents();
    }

    public void onPauseAsTop()
    {
        super.onPauseAsTop();
        mStoreMapSectionController.stop();
    }

    public void onPushed()
    {
        if (mHasInfo)
        {
            loadInfo();
        }
        mIsPushed = true;
    }

    public void onResumeAsTop()
    {
        super.onResumeAsTop();
        mStoreMapSectionController.start();
    }

    public void setAvailabilityData(StoreAvailabilityData storeavailabilitydata, String s, String s1)
    {
        mAvailabilityData = storeavailabilitydata;
        mInstoreAddress = s;
        mStoreId = s1;
    }

    public void setDefaultImage(Bitmap bitmap)
    {
        mDefaultImage = bitmap;
    }

    public void setUnitInformation(String s, String s1)
    {
        mPriceUnit = s;
        mPricePerUnit = s1;
        if (mIsPushed)
        {
            loadPrice();
        }
    }










/*
    static boolean access$1602(SimpleItemDetailsPresenter simpleitemdetailspresenter, boolean flag)
    {
        simpleitemdetailspresenter.mHasLoadedMap = flag;
        return flag;
    }

*/









}
