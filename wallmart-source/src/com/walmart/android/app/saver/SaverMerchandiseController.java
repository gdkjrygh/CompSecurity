// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.saver;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Handler;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.TextView;
import com.squareup.otto.Bus;
import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestCreator;
import com.walmart.android.data.AppConfig;
import com.walmart.android.service.AsyncCallbackOnThread;
import com.walmart.android.service.MessageBus;
import com.walmart.android.service.saver.RecommendationResponse;
import com.walmart.android.service.saver.SaverManager;
import com.walmart.android.ui.Presenter;
import com.walmart.android.ui.RecyclerItemSingleClickListener;
import com.walmart.android.utils.ViewUtil;
import com.walmart.android.wmservice.AppConfigManager;
import com.walmart.android.wmui.Typefaces;
import com.walmartlabs.ui.StarsView;
import com.walmartlabs.ui.recycler.BasicAdapter;
import com.walmartlabs.ui.recycler.BasicViewHolder;
import com.walmartlabs.ui.recycler.HorizontalListRecyclerView;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SaverMerchandiseController
{
    private class ItemClickListener extends RecyclerItemSingleClickListener
    {

        final SaverMerchandiseController this$0;

        public void onItemSingleClick(BasicViewHolder basicviewholder, int i)
        {
            basicviewholder = mAdapter.getItem(i);
            mListener.onShowMerchandise(((com.walmart.android.service.saver.RecommendationResponse.Item) (basicviewholder)).productUrl);
            com.walmartlabs.anivia.AniviaEventAsJson.Builder builder = new com.walmartlabs.anivia.AniviaEventAsJson.Builder("recommendedTap");
            if (((com.walmart.android.service.saver.RecommendationResponse.Item) (basicviewholder)).productId != null)
            {
                builder.putString("itemId", ((com.walmart.android.service.saver.RecommendationResponse.Item) (basicviewholder)).productId);
            }
            if (((com.walmart.android.service.saver.RecommendationResponse.Item) (basicviewholder)).altImageText != null)
            {
                builder.putString("productName", ((com.walmart.android.service.saver.RecommendationResponse.Item) (basicviewholder)).altImageText);
            }
            if (((com.walmart.android.service.saver.RecommendationResponse.Item) (basicviewholder)).athClkBeacon != null)
            {
                builder.putObject("athenaBeacon", ((com.walmart.android.service.saver.RecommendationResponse.Item) (basicviewholder)).athClkBeacon);
            }
            MessageBus.getBus().post(builder);
        }

        public ItemClickListener(Presenter presenter)
        {
            this$0 = SaverMerchandiseController.this;
            super(presenter);
        }
    }

    private static class ItemDecoration extends android.support.v7.widget.RecyclerView.ItemDecoration
    {

        private final int pixelOffset;

        public void getItemOffsets(Rect rect1, View view, RecyclerView recyclerview, android.support.v7.widget.RecyclerView.State state)
        {
            rect1.left = pixelOffset;
            rect1.right = pixelOffset;
            int i = ((android.support.v7.widget.RecyclerView.LayoutParams)view.getLayoutParams()).getViewPosition();
            if (i == 0)
            {
                rect1.left = rect1.left + pixelOffset;
            } else
            if (i == state.getItemCount() - 1)
            {
                rect1.right = rect1.right + pixelOffset;
                return;
            }
        }

        private ItemDecoration(Activity activity)
        {
            pixelOffset = ViewUtil.dpToPixels(5, activity.getResources().getDisplayMetrics());
        }

    }

    public static interface MerchandiseSelectedListener
    {

        public abstract void onShowMerchandise(String s);
    }

    public static class RecommendedItemsAdapter extends BasicAdapter
    {

        private final Context mContext;
        private List mModel;
        private final int mPriceColor;
        private final Typeface mPriceTypeface;

        private List scrubData(List list)
        {
            Object obj = null;
            if (list != null)
            {
                ArrayList arraylist = new ArrayList(list.size());
                list = list.iterator();
                do
                {
                    obj = arraylist;
                    if (!list.hasNext())
                    {
                        break;
                    }
                    obj = (com.walmart.android.service.saver.RecommendationResponse.Item)list.next();
                    if (obj != null && !TextUtils.isEmpty(((com.walmart.android.service.saver.RecommendationResponse.Item) (obj)).productUrl) && !TextUtils.isEmpty(((com.walmart.android.service.saver.RecommendationResponse.Item) (obj)).currency) && !TextUtils.isEmpty(((com.walmart.android.service.saver.RecommendationResponse.Item) (obj)).altImageText))
                    {
                        arraylist.add(obj);
                    }
                } while (true);
            }
            return ((List) (obj));
        }

        private void setStarRating(StarsView starsview, float f)
        {
            if (f > 0.0F)
            {
                starsview.setVisibility(0);
                starsview.setValue(f);
                return;
            } else
            {
                starsview.setVisibility(4);
                return;
            }
        }

        public com.walmart.android.service.saver.RecommendationResponse.Item getItem(int i)
        {
            return (com.walmart.android.service.saver.RecommendationResponse.Item)mModel.get(i);
        }

        public int getItemCount()
        {
            if (mModel != null)
            {
                return mModel.size();
            } else
            {
                return 0;
            }
        }

        public RecommendationViewHolder onConstructViewHolder(ViewGroup viewgroup, int i)
        {
            viewgroup = new RecommendationViewHolder(ViewUtil.inflate(mContext, 0x7f040140, viewgroup));
            ((RecommendationViewHolder) (viewgroup)).price.setTypeface(mPriceTypeface);
            ((RecommendationViewHolder) (viewgroup)).price.setTextColor(mPriceColor);
            return viewgroup;
        }

        public volatile BasicViewHolder onConstructViewHolder(ViewGroup viewgroup, int i)
        {
            return onConstructViewHolder(viewgroup, i);
        }

        public void onPopulateViewHolder(RecommendationViewHolder recommendationviewholder, int i)
        {
            com.walmart.android.service.saver.RecommendationResponse.Item item = (com.walmart.android.service.saver.RecommendationResponse.Item)mModel.get(i);
            Picasso.with(mContext).load(item.imageUrl).placeholder(null).error(0x7f020342).into(recommendationviewholder.image);
            recommendationviewholder.price.setText((new StringBuilder()).append(item.currency).append(item.priceBeforeDecimal).append(DecimalFormatSymbols.getInstance().getDecimalSeparator()).append(String.format("%02d", new Object[] {
                Integer.valueOf(item.priceAfterDecimal)
            })).toString());
            recommendationviewholder.text.setText(item.altImageText);
            setStarRating(recommendationviewholder.rating, item.starRating);
        }

        public volatile void onPopulateViewHolder(BasicViewHolder basicviewholder, int i)
        {
            onPopulateViewHolder((RecommendationViewHolder)basicviewholder, i);
        }

        public void setDataSource(List list)
        {
            mModel = scrubData(list);
            notifyDataSetChanged();
        }

        public RecommendedItemsAdapter(Context context)
        {
            mContext = context;
            mPriceTypeface = Typefaces.create(mContext, com.walmart.android.wmui.Typefaces.Family.MEDIUM);
            mPriceColor = mContext.getResources().getColor(0x7f0f006e);
        }
    }

    public static class RecommendedItemsAdapter.RecommendationViewHolder extends BasicViewHolder
    {

        public final ImageView image;
        public final TextView price;
        public final StarsView rating;
        public final TextView text;

        public RecommendedItemsAdapter.RecommendationViewHolder(View view)
        {
            super(view);
            image = (ImageView)ViewUtil.findViewById(view, 0x7f100468);
            price = (TextView)ViewUtil.findViewById(view, 0x7f100469);
            text = (TextView)ViewUtil.findViewById(view, 0x7f10046a);
            rating = (StarsView)ViewUtil.findViewById(view, 0x7f10046b);
        }
    }

    private class ScrollChangedListener
        implements android.view.ViewTreeObserver.OnScrollChangedListener
    {

        final SaverMerchandiseController this$0;

        public void onScrollChanged()
        {
            if (mLoadingView.getVisibility() == 8 && ViewUtil.viewDrawnInView(mListView, mRootView, 1.0F, originalRect, rect))
            {
                mListView.getViewTreeObserver().removeOnScrollChangedListener(this);
                fireCarouselViewEvent();
            }
        }

        private ScrollChangedListener()
        {
            this$0 = SaverMerchandiseController.this;
            super();
        }

    }


    public static final String ATHENA_PAGE_CONFIRMATION = "SavingsCatcherConfirmation";
    public static final String ATHENA_PAGE_DASHBOARD = "SavingsCatcherDashboard";
    public static final String ATHENA_PAGE_RECEIPT_RECEIVED = "SavingsCatcherReceiptReceived";
    private static final float CAROUSEL_RATIO = 1F;
    private final RecommendedItemsAdapter mAdapter;
    private final String mAnalyticsPageType;
    private Object mAthenaBeacon;
    private final String mAthenaPageType;
    private View mBannerView;
    private boolean mFireCarouselViewEvent;
    private final ItemDecoration mItemDecoration;
    private HorizontalListRecyclerView mListView;
    private final MerchandiseSelectedListener mListener;
    private View mLoadingView;
    private Presenter mPresenter;
    private View mRecommendationContainer;
    private View mRootView;
    private final ScrollChangedListener mScrollChangedListener = new ScrollChangedListener();
    private final Rect originalRect = new Rect();
    private final Rect rect = new Rect();

    public SaverMerchandiseController(Activity activity, String s, String s1, MerchandiseSelectedListener merchandiseselectedlistener)
    {
        mAthenaPageType = s;
        mAnalyticsPageType = s1;
        mListener = merchandiseselectedlistener;
        mAdapter = new RecommendedItemsAdapter(activity);
        mItemDecoration = new ItemDecoration(activity);
    }

    private void fireCarouselViewEvent()
    {
        if (mPresenter.isTop() && mFireCarouselViewEvent)
        {
            com.walmartlabs.anivia.AniviaEventAsJson.Builder builder = new com.walmartlabs.anivia.AniviaEventAsJson.Builder("recommendedView");
            if (mAthenaBeacon != null)
            {
                builder.putObject("athenaBeacon", mAthenaBeacon);
            }
            MessageBus.getBus().post(builder);
            mFireCarouselViewEvent = false;
        }
    }

    private void loadBanner(View view)
    {
        mLoadingView.setVisibility(0);
        final AppConfig config = AppConfigManager.get().getAppConfig();
        final ImageView bannerView = (ImageView)ViewUtil.findViewById(view, 0x7f1004b8);
        if (config != null && config.scBanner != null && config.scBanner.imageUrl != null)
        {
            Picasso.with(view.getContext()).load(config.scBanner.imageUrl).error(0x7f0202a0).into(bannerView, new Callback() {

                final SaverMerchandiseController this$0;
                final ImageView val$bannerView;
                final AppConfig val$config;

                public void onError()
                {
                    setBannerClickListener(bannerView, "walmart://rollbacks");
                }

                public void onSuccess()
                {
                    setBannerClickListener(bannerView, config.scBanner.target);
                }

            
            {
                this$0 = SaverMerchandiseController.this;
                bannerView = imageview;
                config = appconfig;
                super();
            }
            });
            return;
        } else
        {
            setBannerClickListener(bannerView, "walmart://rollbacks");
            return;
        }
    }

    private void setBannerClickListener(View view, final String uri)
    {
        view.setOnClickListener(new android.view.View.OnClickListener() {

            final SaverMerchandiseController this$0;
            final String val$uri;

            public void onClick(View view1)
            {
                mListener.onShowMerchandise(uri);
                view1 = (new com.walmartlabs.anivia.AniviaEventAsJson.Builder("savingsCatcherBanner")).putString("banner", uri).putString("bannerLocation", mAnalyticsPageType);
                MessageBus.getBus().post(view1);
            }

            
            {
                this$0 = SaverMerchandiseController.this;
                uri = s;
                super();
            }
        });
        mLoadingView.setVisibility(8);
    }

    private void setupCarouselViewObserver()
    {
label0:
        {
            if (mLoadingView.getVisibility() == 8 && mFireCarouselViewEvent)
            {
                if (!ViewUtil.viewDrawnInView(mListView, mRootView, 1.0F, originalRect, rect))
                {
                    break label0;
                }
                fireCarouselViewEvent();
            }
            return;
        }
        mListView.getViewTreeObserver().addOnScrollChangedListener(mScrollChangedListener);
    }

    private void updateBanner(View view)
    {
        Object obj = ViewUtil.findViewById(view, 0x7f1004b8);
        if (obj != mBannerView)
        {
            int i = 0;
            if (mBannerView != null)
            {
                i = mBannerView.getVisibility();
            }
            mBannerView = ((View) (obj));
            mBannerView.setVisibility(i);
            if (i == 0)
            {
                loadBanner(view);
            }
        }
        obj = mBannerView.getLayoutParams();
        if (view.getResources().getConfiguration().orientation == 2)
        {
            obj.width = ViewUtil.dpToPixels(360, view.getContext());
            return;
        } else
        {
            obj.width = -1;
            return;
        }
    }

    private void updateRecommendations(Presenter presenter)
    {
        View view = ViewUtil.findViewById(mRootView, 0x7f1004b5);
        if (view != mRecommendationContainer)
        {
            int j = -1;
            int i = 0;
            if (mRecommendationContainer != null)
            {
                i = mRecommendationContainer.getVisibility();
                HorizontalListRecyclerView horizontallistrecyclerview = (HorizontalListRecyclerView)ViewUtil.findViewById(mRecommendationContainer, 0x7f1004b7);
                j = horizontallistrecyclerview.getFirstVisiblePosition();
                horizontallistrecyclerview.removeItemDecoration(mItemDecoration);
                horizontallistrecyclerview.setAdapter(null);
                horizontallistrecyclerview.setOnItemClickListener(null);
                horizontallistrecyclerview.getViewTreeObserver().removeOnScrollChangedListener(mScrollChangedListener);
            }
            mRecommendationContainer = view;
            mRecommendationContainer.setVisibility(i);
            mListView = (HorizontalListRecyclerView)ViewUtil.findViewById(view, 0x7f1004b7);
            mListView.setAdapter(mAdapter);
            mListView.setOnItemClickListener(new ItemClickListener(presenter));
            if (j >= 0)
            {
                mListView.scrollToPosition(j);
            }
            mListView.addItemDecoration(mItemDecoration);
            setupCarouselViewObserver();
        }
    }

    public void loadMerchandise()
    {
        mLoadingView.setVisibility(0);
        AppConfig appconfig = AppConfigManager.get().getAppConfig();
        if (appconfig != null && !appconfig.scRecommendationsEnabled)
        {
            mRecommendationContainer.setVisibility(8);
            mBannerView.setVisibility(0);
            loadBanner(mRootView);
            return;
        } else
        {
            mRecommendationContainer.setVisibility(0);
            SaverManager.get().getRecommendations(mAthenaPageType, new AsyncCallbackOnThread(new Handler()) {

                final SaverMerchandiseController this$0;

                public void onFailureSameThread(Integer integer, RecommendationResponse recommendationresponse)
                {
                    mRecommendationContainer.setVisibility(8);
                    mBannerView.setVisibility(0);
                    loadBanner(mRootView);
                }

                public volatile void onFailureSameThread(Object obj, Object obj1)
                {
                    onFailureSameThread((Integer)obj, (RecommendationResponse)obj1);
                }

                public void onSuccessSameThread(RecommendationResponse recommendationresponse)
                {
                    List list = recommendationresponse.getItems();
                    if (list.isEmpty())
                    {
                        onFailureSameThread(Integer.valueOf(0x15f91), recommendationresponse);
                        return;
                    }
                    mAdapter.setDataSource(list);
                    if (mAdapter.getItemCount() <= 0)
                    {
                        onFailureSameThread(Integer.valueOf(0x15f90), recommendationresponse);
                        return;
                    } else
                    {
                        mRecommendationContainer.setVisibility(0);
                        mBannerView.setVisibility(8);
                        mLoadingView.setVisibility(8);
                        mAthenaBeacon = recommendationresponse.athBeacon;
                        setupCarouselViewObserver();
                        return;
                    }
                }

                public volatile void onSuccessSameThread(Object obj)
                {
                    onSuccessSameThread((RecommendationResponse)obj);
                }

            
            {
                this$0 = SaverMerchandiseController.this;
                super(handler);
            }
            });
            return;
        }
    }

    public void pageViewed()
    {
        mFireCarouselViewEvent = true;
        setupCarouselViewObserver();
    }

    public void updateViews(Presenter presenter, View view)
    {
        mPresenter = presenter;
        if (view != mRootView)
        {
            int i = 0;
            if (mLoadingView != null)
            {
                i = mLoadingView.getVisibility();
            }
            mLoadingView = ViewUtil.findViewById(view, 0x7f1004b9);
            mLoadingView.setVisibility(i);
        }
        mRootView = view;
        updateRecommendations(presenter);
        updateBanner(view);
    }















/*
    static Object access$802(SaverMerchandiseController savermerchandisecontroller, Object obj)
    {
        savermerchandisecontroller.mAthenaBeacon = obj;
        return obj;
    }

*/

}
