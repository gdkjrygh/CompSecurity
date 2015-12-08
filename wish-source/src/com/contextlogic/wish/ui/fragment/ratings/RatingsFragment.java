// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.ratings;

import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.contextlogic.wish.WishApplication;
import com.contextlogic.wish.activity.link.WishDeepLinkActivity;
import com.contextlogic.wish.analytics.WishAnalyticsEvent;
import com.contextlogic.wish.api.data.WishRating;
import com.contextlogic.wish.api.data.WishRatingSummary;
import com.contextlogic.wish.api.data.WishUser;
import com.contextlogic.wish.api.service.GetMerchantRatingsService;
import com.contextlogic.wish.api.service.GetProductRatingsService;
import com.contextlogic.wish.cache.RuntimeStateStore;
import com.contextlogic.wish.ui.activity.root.RootActivity;
import com.contextlogic.wish.ui.components.alert.PopupAlertDialog;
import com.contextlogic.wish.ui.components.image.BorderedImageView;
import com.contextlogic.wish.ui.components.image.CachedImageView;
import com.contextlogic.wish.ui.components.list.LoadingListRow;
import com.contextlogic.wish.ui.components.navigation.NavigationBarWrapper;
import com.contextlogic.wish.ui.fragment.base.BaseContentFragment;
import com.contextlogic.wish.ui.fragment.profile.ProfileFragment;
import com.contextlogic.wish.util.BitmapUtil;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.contextlogic.wish.ui.fragment.ratings:
//            RatingsAdapter

public class RatingsFragment extends BaseContentFragment
{

    public static final String ARG_MERCHANT_ID = "ArgMerchantID";
    public static final String ARG_PRODUCT_ID = "ArgProductID";
    private static final String STORED_STATE_CURRENT_RATINGS_COUNT = "StoredStateCurrentRatingsCount";
    private static final String STORED_STATE_DATA = "StoredStateData";
    private static final String STORED_STATE_DATA_RATINGS = "StoredStateDataRatings";
    private static final String STORED_STATE_DATA_RATING_SUMMARY = "StoredStateDataRatingSummary";
    private static final String STORED_STATE_NEXT_OFFSET = "StoredStateNextOffset";
    private static final String STORED_STATE_NO_MORE_DATA = "StoredStateNoMoreData";
    private int currentRatingsCount;
    private String dataStateStoreKey;
    private View errorView;
    private GetMerchantRatingsService getMerchantRatingsService;
    private GetProductRatingsService getProductRatingsService;
    private BorderedImageView imageView;
    private RatingsAdapter listAdapter;
    private ListView listView;
    private boolean loadingComplete;
    private boolean loadingErrored;
    private LoadingListRow loadingListRow;
    private View loadingView;
    private String merchantId;
    private int nextOffset;
    private TextView noItemsText;
    private boolean noMoreItems;
    private String productId;
    private ImageView productRatingStarFive;
    private ImageView productRatingStarFour;
    private ImageView productRatingStarOne;
    private ImageView productRatingStarThree;
    private ImageView productRatingStarTwo;
    private TextView productRatingText;
    private ProgressBar ratingBar1;
    private ProgressBar ratingBar2;
    private ProgressBar ratingBar3;
    private ProgressBar ratingBar4;
    private ProgressBar ratingBar5;
    private WishRatingSummary ratingSummary;
    private ArrayList ratings;
    private TextView titleView;
    private boolean updatingList;
    private TextView visitTextView;

    public RatingsFragment()
    {
    }

    private void handleItemClick(int i)
    {
        WishRating wishrating;
        if (i != 0)
        {
            if ((wishrating = (WishRating)ratings.get(i - 1)).getAuthor().getUserState() == com.contextlogic.wish.api.data.WishUser.WishUserState.Registered)
            {
                trackClick(com.contextlogic.wish.analytics.Analytics.EventType.RaterSelect);
                ProfileFragment profilefragment = new ProfileFragment();
                Bundle bundle = new Bundle();
                bundle.putSerializable("ArgUser", RuntimeStateStore.getInstance().storeState(wishrating.getAuthor(), null));
                profilefragment.setArguments(bundle);
                ((RootActivity)getActivity()).setContentFragment(profilefragment, false);
                return;
            }
        }
    }

    private void handleLoadingFailure()
    {
        PopupAlertDialog.showError(getActivity(), getActivity().getString(0x7f06030d), getActivity().getString(0x7f0601bb));
        refreshViewState();
    }

    private void handleLoadingSuccess(WishRatingSummary wishratingsummary, ArrayList arraylist, boolean flag, int i, int j)
    {
        loadingComplete = true;
        WishRating wishrating;
        for (arraylist = arraylist.iterator(); arraylist.hasNext(); ratings.add(wishrating))
        {
            wishrating = (WishRating)arraylist.next();
        }

        if (flag)
        {
            noMoreItems = true;
            currentRatingsCount = 0;
        } else
        {
            currentRatingsCount = currentRatingsCount + i;
        }
        ratingSummary = wishratingsummary;
        if (nextOffset == 0)
        {
            refreshHeaderState();
        }
        nextOffset = j;
        if (!noMoreItems && ratings.size() < 10)
        {
            loadNextPage();
        }
        listAdapter.notifyDataSetChanged();
        refreshViewState();
        updatingList = false;
    }

    private void handleScrollLoad(int i, int j, int k)
    {
        boolean flag;
        if (!loadingErrored && !noMoreItems && !getProductRatingsService.isPending() && !getMerchantRatingsService.isPending() && !updatingList && loadingComplete)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag && i > k - j * 2)
        {
            loadNextPage();
        }
    }

    private void hideAllUiElements()
    {
        listView.setVisibility(8);
        errorView.setVisibility(8);
        loadingView.setVisibility(8);
    }

    private void loadNextPage()
    {
        if (noMoreItems)
        {
            return;
        }
        loadingErrored = false;
        if (merchantId != null)
        {
            getMerchantRatingsService.requestService(merchantId, nextOffset, 25, new com.contextlogic.wish.api.service.GetMerchantRatingsService.SuccessCallback() {

                final RatingsFragment this$0;

                public void onServiceSucceeded(final WishRatingSummary summary, final ArrayList items, final int ratingsCount, int i, final boolean noMoreRatings)
                {
                    updatingList = true;
                    postDelayed(i. new Runnable() {

                        final _cls5 this$1;
                        final ArrayList val$items;
                        final int val$nextOffset;
                        final boolean val$noMoreRatings;
                        final int val$ratingsCount;
                        final WishRatingSummary val$summary;

                        public void run()
                        {
                            handleLoadingSuccess(summary, items, noMoreRatings, ratingsCount, nextOffset);
                        }

            
            {
                this$1 = final__pcls5;
                summary = wishratingsummary;
                items = arraylist;
                noMoreRatings = flag;
                ratingsCount = i;
                nextOffset = I.this;
                super();
            }
                    }, getAnimationTimeRemaining());
                }

            
            {
                this$0 = RatingsFragment.this;
                super();
            }
            }, new com.contextlogic.wish.api.service.ApiService.FailureCallback() {

                final RatingsFragment this$0;

                public void onServiceFailed()
                {
                    loadingErrored = true;
                    postDelayed(new Runnable() {

                        final _cls6 this$1;

                        public void run()
                        {
                            handleLoadingFailure();
                            refreshViewState();
                        }

            
            {
                this$1 = _cls6.this;
                super();
            }
                    }, getAnimationTimeRemaining());
                }

            
            {
                this$0 = RatingsFragment.this;
                super();
            }
            });
        } else
        {
            getProductRatingsService.requestService(productId, nextOffset, 25, new com.contextlogic.wish.api.service.GetProductRatingsService.SuccessCallback() {

                final RatingsFragment this$0;

                public void onServiceSucceeded(final WishRatingSummary summary, final ArrayList items, final int ratingsCount, int i, final boolean noMoreRatings)
                {
                    updatingList = true;
                    postDelayed(i. new Runnable() {

                        final _cls7 this$1;
                        final ArrayList val$items;
                        final int val$nextOffset;
                        final boolean val$noMoreRatings;
                        final int val$ratingsCount;
                        final WishRatingSummary val$summary;

                        public void run()
                        {
                            handleLoadingSuccess(summary, items, noMoreRatings, ratingsCount, nextOffset);
                        }

            
            {
                this$1 = final__pcls7;
                summary = wishratingsummary;
                items = arraylist;
                noMoreRatings = flag;
                ratingsCount = i;
                nextOffset = I.this;
                super();
            }
                    }, getAnimationTimeRemaining());
                }

            
            {
                this$0 = RatingsFragment.this;
                super();
            }
            }, new com.contextlogic.wish.api.service.ApiService.FailureCallback() {

                final RatingsFragment this$0;

                public void onServiceFailed()
                {
                    loadingErrored = true;
                    postDelayed(new Runnable() {

                        final _cls8 this$1;

                        public void run()
                        {
                            handleLoadingFailure();
                            refreshViewState();
                        }

            
            {
                this$1 = _cls8.this;
                super();
            }
                    }, getAnimationTimeRemaining());
                }

            
            {
                this$0 = RatingsFragment.this;
                super();
            }
            });
        }
        refreshViewState();
    }

    private void refreshHeaderState()
    {
        titleView.setText(ratingSummary.getDisplayName());
        imageView.getImageView().setImageUrl(ratingSummary.getImageUrl());
        int ai[] = new int[5];
        int i = 0;
        while (i < 5) 
        {
            if (ratingSummary.getRating() >= (double)(i + 1))
            {
                ai[i] = 0x7f0201ce;
            } else
            {
                double d = (double)(i + 1) - ratingSummary.getRating();
                if (d <= 0.25D)
                {
                    ai[i] = 0x7f0201ce;
                } else
                if (d <= 0.75D)
                {
                    ai[i] = 0x7f0200dc;
                } else
                {
                    ai[i] = 0x7f0200d8;
                }
            }
            i++;
        }
        productRatingStarOne.setImageResource(ai[0]);
        productRatingStarTwo.setImageResource(ai[1]);
        productRatingStarThree.setImageResource(ai[2]);
        productRatingStarFour.setImageResource(ai[3]);
        productRatingStarFive.setImageResource(ai[4]);
        productRatingText.setText(WishApplication.getAppInstance().getQuantityString(0x7f070009, (int)ratingSummary.getRatingCount(), new Object[] {
            NumberFormat.getInstance().format(ratingSummary.getRatingCount())
        }));
        i = 0;
        for (Iterator iterator = ratingSummary.getRatingSpreads().iterator(); iterator.hasNext();)
        {
            i += ((Integer)iterator.next()).intValue();
        }

        ratingBar1.setMax(i);
        ratingBar1.setProgress(((Integer)ratingSummary.getRatingSpreads().get(0)).intValue());
        ratingBar2.setMax(i);
        ratingBar2.setProgress(((Integer)ratingSummary.getRatingSpreads().get(1)).intValue());
        ratingBar3.setMax(i);
        ratingBar3.setProgress(((Integer)ratingSummary.getRatingSpreads().get(2)).intValue());
        ratingBar4.setMax(i);
        ratingBar4.setProgress(((Integer)ratingSummary.getRatingSpreads().get(3)).intValue());
        ratingBar5.setMax(i);
        ratingBar5.setProgress(((Integer)ratingSummary.getRatingSpreads().get(4)).intValue());
        if (productId != null)
        {
            visitTextView.setText(getString(0x7f0601bf));
        } else
        if (merchantId != null)
        {
            visitTextView.setText(getString(0x7f0601c0));
            return;
        }
    }

    private void refreshRowTimestamps()
    {
        if (listAdapter != null)
        {
            listAdapter.refreshTimestamps();
        }
    }

    private void refreshViewState()
    {
        hideAllUiElements();
        if (!loadingErrored) goto _L2; else goto _L1
_L1:
        if (ratings.size() <= 0) goto _L4; else goto _L3
_L3:
        listView.setVisibility(0);
        if (!noMoreItems) goto _L6; else goto _L5
_L5:
        loadingListRow.setNoMoreItemsText(getResources().getString(0x7f0601be));
        loadingListRow.setLoadingMode(com.contextlogic.wish.ui.components.list.LoadingListRow.LoadingMode.NoMoreItems);
_L8:
        return;
_L6:
        if (getMerchantRatingsService.isPending() || getProductRatingsService.isPending())
        {
            loadingListRow.setLoadingMode(com.contextlogic.wish.ui.components.list.LoadingListRow.LoadingMode.Loading);
            return;
        } else
        {
            loadingListRow.setLoadingMode(com.contextlogic.wish.ui.components.list.LoadingListRow.LoadingMode.ClickToLoad);
            return;
        }
_L4:
        errorView.setVisibility(0);
        return;
_L2:
        if (loadingComplete && noMoreItems && ratings.size() == 0)
        {
            listView.setVisibility(0);
            loadingListRow.setNoMoreItemsText(getResources().getString(0x7f0601bd));
            loadingListRow.setLoadingMode(com.contextlogic.wish.ui.components.list.LoadingListRow.LoadingMode.NoMoreItems);
            return;
        }
        if (loadingComplete)
        {
            listView.setVisibility(0);
            if (noMoreItems)
            {
                loadingListRow.setNoMoreItemsText(getResources().getString(0x7f0601be));
                loadingListRow.setLoadingMode(com.contextlogic.wish.ui.components.list.LoadingListRow.LoadingMode.NoMoreItems);
                return;
            }
            if (getMerchantRatingsService.isPending() || getProductRatingsService.isPending())
            {
                loadingListRow.setLoadingMode(com.contextlogic.wish.ui.components.list.LoadingListRow.LoadingMode.Loading);
                return;
            } else
            {
                loadingListRow.setLoadingMode(com.contextlogic.wish.ui.components.list.LoadingListRow.LoadingMode.ClickToLoad);
                return;
            }
        }
        if (getMerchantRatingsService.isPending() || getProductRatingsService.isPending())
        {
            loadingView.setVisibility(0);
            return;
        }
        if (true) goto _L8; else goto _L7
_L7:
    }

    protected com.contextlogic.wish.analytics.Analytics.PageViewType getAnalyticsPageViewType()
    {
        if (productId != null)
        {
            return com.contextlogic.wish.analytics.Analytics.PageViewType.ProductRatings;
        } else
        {
            return com.contextlogic.wish.analytics.Analytics.PageViewType.MerchantRatings;
        }
    }

    protected int getLayoutResourceId()
    {
        return 0x7f030097;
    }

    protected WishAnalyticsEvent getWishAnalyticsPageViewType()
    {
        if (productId != null)
        {
            return WishAnalyticsEvent.IMPRESSION_MOBILE_NATIVE_PRODUCT_RATINGS;
        } else
        {
            return WishAnalyticsEvent.IMPRESSION_MOBILE_NATIVE_MERCHANT_RATINGS;
        }
    }

    public void handleResume()
    {
        super.handleResume();
        if (currentRatingsCount == -1 || !loadingComplete)
        {
            loadNextPage();
        }
        if (listAdapter != null)
        {
            listAdapter.resumeCacheWarming();
        }
        refreshRowTimestamps();
        refreshViewState();
    }

    public void handleVisitClick()
    {
        if (productId != null)
        {
            trackClick(WishAnalyticsEvent.CLICK_MOBILE_RATINGS_VIEW_PRODUCT);
            com.contextlogic.wish.ApplicationDeepLinkConfig applicationdeeplinkconfig = WishDeepLinkActivity.getDeepLinkTarget(Uri.parse(String.format((new StringBuilder()).append(WishApplication.getAppInstance().getString(0x7f0604c7)).append("://c/%s").toString(), new Object[] {
                productId
            })));
            if (applicationdeeplinkconfig != null)
            {
                ((RootActivity)getActivity()).processDeepLink(applicationdeeplinkconfig, false);
            }
        } else
        if (merchantId != null)
        {
            trackClick(WishAnalyticsEvent.CLICK_MOBILE_RATINGS_VISIT_STORE);
            com.contextlogic.wish.ApplicationDeepLinkConfig applicationdeeplinkconfig1 = WishDeepLinkActivity.getDeepLinkTarget(Uri.parse(String.format((new StringBuilder()).append(WishApplication.getAppInstance().getString(0x7f0604c7)).append("://merchant/%s").toString(), new Object[] {
                ratingSummary.getName()
            })));
            if (applicationdeeplinkconfig1 != null)
            {
                ((RootActivity)getActivity()).processDeepLink(applicationdeeplinkconfig1, false);
                return;
            }
        }
    }

    protected void initializeUi(View view)
    {
        getNavigationBar().setTitle(getString(0x7f06035f));
        listView = (ListView)view.findViewById(0x7f0d02dd);
        loadingView = view.findViewById(0x7f0d02de);
        errorView = view.findViewById(0x7f0d02df);
        View view1 = View.inflate(view.getContext(), 0x7f030099, null);
        listView.addHeaderView(view1);
        titleView = (TextView)view1.findViewById(0x7f0d02eb);
        imageView = (BorderedImageView)view1.findViewById(0x7f0d02ea);
        imageView.getImageView().setRequestedImageHeight(60);
        imageView.getImageView().setRequestedImageWidth(60);
        visitTextView = (TextView)view1.findViewById(0x7f0d02ec);
        recursiveAssignImage((LinearLayout)view.findViewById(0x7f0d02f4));
        productRatingText = (TextView)view.findViewById(0x7f0d02f3);
        productRatingStarOne = (ImageView)view.findViewById(0x7f0d02ee);
        productRatingStarTwo = (ImageView)view.findViewById(0x7f0d02ef);
        productRatingStarThree = (ImageView)view.findViewById(0x7f0d02f0);
        productRatingStarFour = (ImageView)view.findViewById(0x7f0d02f1);
        productRatingStarFive = (ImageView)view.findViewById(0x7f0d02f2);
        ratingBar1 = (ProgressBar)view.findViewById(0x7f0d0308);
        ratingBar2 = (ProgressBar)view.findViewById(0x7f0d0306);
        ratingBar3 = (ProgressBar)view.findViewById(0x7f0d0303);
        ratingBar4 = (ProgressBar)view.findViewById(0x7f0d02ff);
        ratingBar5 = (ProgressBar)view.findViewById(0x7f0d02fa);
        loadingListRow = new LoadingListRow(getActivity());
        loadingListRow.setOnClickListener(new android.view.View.OnClickListener() {

            final RatingsFragment this$0;

            public void onClick(View view2)
            {
                trackClick(com.contextlogic.wish.analytics.Analytics.EventType.Load);
                loadNextPage();
            }

            
            {
                this$0 = RatingsFragment.this;
                super();
            }
        });
        listView.addFooterView(loadingListRow);
        listAdapter = new RatingsAdapter(getActivity(), ratings, listView);
        listView.setAdapter(listAdapter);
        listView.setOnScrollListener(new android.widget.AbsListView.OnScrollListener() {

            final RatingsFragment this$0;

            public void onScroll(AbsListView abslistview, int i, int j, int k)
            {
                handleScrollLoad(i, j, k);
            }

            public void onScrollStateChanged(AbsListView abslistview, int i)
            {
            }

            
            {
                this$0 = RatingsFragment.this;
                super();
            }
        });
        listAdapter.notifyDataSetChanged();
        listView.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {

            final RatingsFragment this$0;

            public void onItemClick(AdapterView adapterview, View view2, int i, long l)
            {
                handleItemClick(i);
            }

            
            {
                this$0 = RatingsFragment.this;
                super();
            }
        });
        listView.setFadingEdgeLength(0);
        visitTextView.setOnClickListener(new android.view.View.OnClickListener() {

            final RatingsFragment this$0;

            public void onClick(View view2)
            {
                handleVisitClick();
            }

            
            {
                this$0 = RatingsFragment.this;
                super();
            }
        });
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        productId = getArguments().getString("ArgProductID");
        merchantId = getArguments().getString("ArgMerchantID");
        getMerchantRatingsService = new GetMerchantRatingsService();
        getProductRatingsService = new GetProductRatingsService();
    }

    public void onPause()
    {
        super.onPause();
        if (listAdapter != null)
        {
            listAdapter.pauseCacheWarming();
        }
        getMerchantRatingsService.cancelAllRequests();
        getProductRatingsService.cancelAllRequests();
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        if (loadingComplete && ratings.size() > 0 && currentRatingsCount >= 0)
        {
            Bundle bundle1 = new Bundle();
            bundle1.putSerializable("StoredStateDataRatingSummary", ratingSummary);
            bundle1.putSerializable("StoredStateDataRatings", ratings);
            dataStateStoreKey = RuntimeStateStore.getInstance().storeState(bundle1, dataStateStoreKey);
            bundle.putSerializable("StoredStateData", dataStateStoreKey);
            bundle.putInt("StoredStateCurrentRatingsCount", currentRatingsCount);
            bundle.putBoolean("StoredStateNoMoreData", noMoreItems);
            bundle.putInt("StoredStateNextOffset", nextOffset);
        }
    }

    public void recursiveAssignImage(LinearLayout linearlayout)
    {
        int i = linearlayout.getChildCount() - 1;
        while (i >= 0) 
        {
            View view = linearlayout.getChildAt(i);
            if (view instanceof LinearLayout)
            {
                recursiveAssignImage((LinearLayout)view);
            } else
            if (view != null && (view instanceof ImageView))
            {
                BitmapUtil.safeSetImageResource((ImageView)view, 0x7f0200d8);
            }
            i--;
        }
    }

    public void restoreState(Bundle bundle)
    {
        super.restoreState(bundle);
        if (bundle != null && bundle.containsKey("StoredStateData") && bundle.containsKey("StoredStateNoMoreData") && bundle.containsKey("StoredStateCurrentRatingsCount") && bundle.containsKey("StoredStateNextOffset"))
        {
            dataStateStoreKey = bundle.getString("StoredStateData");
            Bundle bundle1 = (Bundle)RuntimeStateStore.getInstance().getState(dataStateStoreKey);
            ratings = (ArrayList)bundle1.getSerializable("StoredStateDataRatings");
            ratingSummary = (WishRatingSummary)bundle1.getSerializable("StoredStateDataRatingSummary");
            currentRatingsCount = bundle.getInt("StoredStateCurrentRatingsCount");
            noMoreItems = bundle.getBoolean("StoredStateNoMoreData");
            nextOffset = bundle.getInt("StoredStateNextOffset");
            boolean flag;
            if (ratings != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            loadingComplete = flag;
        }
        if (!loadingComplete)
        {
            ratings = new ArrayList();
            noMoreItems = false;
            currentRatingsCount = -1;
            nextOffset = 0;
            loadingComplete = false;
        }
    }





/*
    static boolean access$302(RatingsFragment ratingsfragment, boolean flag)
    {
        ratingsfragment.updatingList = flag;
        return flag;
    }

*/



/*
    static boolean access$502(RatingsFragment ratingsfragment, boolean flag)
    {
        ratingsfragment.loadingErrored = flag;
        return flag;
    }

*/


}
