// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.product.tabbeddetails;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.contextlogic.wish.WishApplication;
import com.contextlogic.wish.api.data.WishProduct;
import com.contextlogic.wish.api.data.WishRating;
import com.contextlogic.wish.api.data.WishRatingSummary;
import com.contextlogic.wish.api.data.WishUser;
import com.contextlogic.wish.cache.RuntimeStateStore;
import com.contextlogic.wish.ui.activity.root.RootActivity;
import com.contextlogic.wish.ui.components.alert.PopupAlertDialog;
import com.contextlogic.wish.ui.components.image.BorderedImageView;
import com.contextlogic.wish.ui.components.image.CachedImageView;
import com.contextlogic.wish.ui.components.list.ListeningListView;
import com.contextlogic.wish.ui.components.list.LoadingListRow;
import com.contextlogic.wish.ui.fragment.base.BaseContentFragment;
import com.contextlogic.wish.ui.fragment.profile.ProfileFragment;
import com.contextlogic.wish.ui.fragment.ratings.RatingsAdapter;
import com.contextlogic.wish.util.BitmapUtil;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.contextlogic.wish.ui.fragment.product.tabbeddetails:
//            TabbedProductDetailsPagerView, TabbedProductDetailsFragment

public abstract class TabbedProductDetailsRatingsView extends TabbedProductDetailsPagerView
{

    protected TextView actionTextView;
    protected View errorView;
    protected BorderedImageView imageView;
    protected RatingsAdapter listAdapter;
    protected ListeningListView listView;
    protected boolean loadingComplete;
    protected boolean loadingErrored;
    protected LoadingListRow loadingListRow;
    protected View loadingView;
    protected int nextOffset;
    protected boolean noMoreItems;
    protected ProgressBar ratingBarFive;
    protected ProgressBar ratingBarFour;
    protected ProgressBar ratingBarOne;
    protected ProgressBar ratingBarThree;
    protected ProgressBar ratingBarTwo;
    protected ImageView ratingStarFive;
    protected ImageView ratingStarFour;
    protected ImageView ratingStarOne;
    protected TextView ratingStarText;
    protected ImageView ratingStarThree;
    protected ImageView ratingStarTwo;
    protected WishRatingSummary ratingSummary;
    protected ArrayList ratings;
    protected View rootLayout;
    protected View spacerView;
    protected TextView subtitleLineOne;
    protected TextView subtitleLineTwo;
    protected TextView titleView;
    protected boolean updatingList;

    public TabbedProductDetailsRatingsView(Context context)
    {
        super(context);
    }

    public TabbedProductDetailsRatingsView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public TabbedProductDetailsRatingsView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    private void handleItemClick(int i)
    {
        WishRating wishrating;
        if (i != 0)
        {
            if ((wishrating = (WishRating)ratings.get(i - 1)).getAuthor().getUserState() == com.contextlogic.wish.api.data.WishUser.WishUserState.Registered)
            {
                fragment.trackClick(com.contextlogic.wish.analytics.Analytics.EventType.RaterSelect);
                ProfileFragment profilefragment = new ProfileFragment();
                Bundle bundle = new Bundle();
                bundle.putSerializable("ArgUser", RuntimeStateStore.getInstance().storeState(wishrating.getAuthor(), null));
                profilefragment.setArguments(bundle);
                ((RootActivity)fragment.getActivity()).setContentFragment(profilefragment, false);
                return;
            }
        }
    }

    private void handleScrollLoad(int i, int j, int k)
    {
        boolean flag;
        if (!loadingErrored && !noMoreItems && !isNetworkRequestPending() && !updatingList && loadingComplete)
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
        } else
        {
            loadingErrored = false;
            performNetworkRequest();
            refreshViewState();
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
        if (loadingErrored)
        {
            if (ratings.size() > 0)
            {
                listView.setVisibility(0);
                if (noMoreItems)
                {
                    loadingListRow.setNoMoreItemsText(getResources().getString(0x7f0601be));
                    loadingListRow.setLoadingMode(com.contextlogic.wish.ui.components.list.LoadingListRow.LoadingMode.NoMoreItems);
                    return;
                }
                if (isNetworkRequestPending())
                {
                    loadingListRow.setLoadingMode(com.contextlogic.wish.ui.components.list.LoadingListRow.LoadingMode.Loading);
                    return;
                } else
                {
                    loadingListRow.setLoadingMode(com.contextlogic.wish.ui.components.list.LoadingListRow.LoadingMode.ClickToLoad);
                    return;
                }
            } else
            {
                errorView.setVisibility(0);
                return;
            }
        }
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
            if (isNetworkRequestPending())
            {
                loadingListRow.setLoadingMode(com.contextlogic.wish.ui.components.list.LoadingListRow.LoadingMode.Loading);
                return;
            } else
            {
                loadingListRow.setLoadingMode(com.contextlogic.wish.ui.components.list.LoadingListRow.LoadingMode.ClickToLoad);
                return;
            }
        } else
        {
            loadingView.setVisibility(0);
            return;
        }
    }

    protected abstract void cancelNetworkRequest();

    public void cleanup()
    {
        releaseImages();
        cancelNetworkRequest();
    }

    protected abstract String getActionButtonText();

    public int getCurrentScrollY()
    {
        if (listView != null)
        {
            return listView.getCurrentScrollY();
        } else
        {
            return 0;
        }
    }

    protected abstract String getSubtitleLineOne();

    protected abstract String getSubtitleLineTwo();

    public abstract void handleActionClick();

    protected void handleLoadingFailure()
    {
        loadingErrored = true;
        PopupAlertDialog.showError(fragment.getActivity(), fragment.getActivity().getString(0x7f06030d), fragment.getActivity().getString(0x7f0601bb));
        refreshViewState();
    }

    protected void handleLoadingSuccess(WishRatingSummary wishratingsummary, ArrayList arraylist, boolean flag, int i, int j)
    {
        loadingComplete = true;
        WishRating wishrating;
        for (arraylist = arraylist.iterator(); arraylist.hasNext(); ratings.add(wishrating))
        {
            wishrating = (WishRating)arraylist.next();
        }

        noMoreItems = flag;
        ratingSummary = wishratingsummary;
        if (nextOffset == 0)
        {
            setupHeader();
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

    public void handleOrientationChanged()
    {
    }

    protected void init()
    {
        super.init();
        ratings = new ArrayList();
        rootLayout = ((LayoutInflater)getContext().getSystemService("layout_inflater")).inflate(0x7f0300b1, this);
    }

    protected abstract boolean isNetworkRequestPending();

    public void onPagerScrollSettled()
    {
        super.onPagerScrollSettled();
        if (fragment.getCurrentIndex() == index)
        {
            refreshRowTimestamps();
        }
    }

    protected abstract void performNetworkRequest();

    protected void recursiveAssignImage(LinearLayout linearlayout)
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

    public void refreshWishStates(boolean flag)
    {
    }

    public void releaseImages()
    {
    }

    public void restoreImages()
    {
    }

    public void setup(WishProduct wishproduct, int i, TabbedProductDetailsFragment tabbedproductdetailsfragment)
    {
        super.setup(wishproduct, i, tabbedproductdetailsfragment);
        listView = (ListeningListView)rootLayout.findViewById(0x7f0d03bd);
        listView.setScrollViewListener(new com.contextlogic.wish.ui.components.list.ListeningListView.ScrollViewListener() {

            final TabbedProductDetailsRatingsView this$0;

            public void onScrollChanged(int j, int k)
            {
                handleScrollChanged(j, k);
            }

            
            {
                this$0 = TabbedProductDetailsRatingsView.this;
                super();
            }
        });
        setupScroller(listView);
        loadingView = rootLayout.findViewById(0x7f0d03be);
        errorView = rootLayout.findViewById(0x7f0d03bf);
        wishproduct = View.inflate(rootLayout.getContext(), 0x7f0300b2, null);
        listView.addHeaderView(wishproduct);
        titleView = (TextView)wishproduct.findViewById(0x7f0d03c2);
        imageView = (BorderedImageView)wishproduct.findViewById(0x7f0d03c1);
        imageView.getImageView().setRequestedImageHeight(65);
        imageView.getImageView().setRequestedImageWidth(65);
        spacerView = wishproduct.findViewById(0x7f0d03c0);
        tabbedproductdetailsfragment = new android.widget.LinearLayout.LayoutParams(-1, tabbedproductdetailsfragment.getTabBarStripHeight());
        spacerView.setLayoutParams(tabbedproductdetailsfragment);
        actionTextView = (TextView)wishproduct.findViewById(0x7f0d03c5);
        subtitleLineOne = (TextView)wishproduct.findViewById(0x7f0d03c3);
        subtitleLineTwo = (TextView)wishproduct.findViewById(0x7f0d03c4);
        recursiveAssignImage((LinearLayout)rootLayout.findViewById(0x7f0d03cc));
        ratingStarText = (TextView)rootLayout.findViewById(0x7f0d03cb);
        ratingStarOne = (ImageView)rootLayout.findViewById(0x7f0d03c6);
        ratingStarTwo = (ImageView)rootLayout.findViewById(0x7f0d03c7);
        ratingStarThree = (ImageView)rootLayout.findViewById(0x7f0d03c8);
        ratingStarFour = (ImageView)rootLayout.findViewById(0x7f0d03c9);
        ratingStarFive = (ImageView)rootLayout.findViewById(0x7f0d03ca);
        ratingBarOne = (ProgressBar)rootLayout.findViewById(0x7f0d03d1);
        ratingBarTwo = (ProgressBar)rootLayout.findViewById(0x7f0d03d0);
        ratingBarThree = (ProgressBar)rootLayout.findViewById(0x7f0d03cf);
        ratingBarFour = (ProgressBar)rootLayout.findViewById(0x7f0d03ce);
        ratingBarFive = (ProgressBar)rootLayout.findViewById(0x7f0d03cd);
        loadingListRow = new LoadingListRow(fragment.getActivity());
        loadingListRow.setOnClickListener(new android.view.View.OnClickListener() {

            final TabbedProductDetailsRatingsView this$0;

            public void onClick(View view)
            {
                fragment.trackClick(com.contextlogic.wish.analytics.Analytics.EventType.Load);
                loadNextPage();
            }

            
            {
                this$0 = TabbedProductDetailsRatingsView.this;
                super();
            }
        });
        listView.addFooterView(loadingListRow);
        listView.setFadingEdgeLength(0);
        listView.setOnScrollListener(new android.widget.AbsListView.OnScrollListener() {

            final TabbedProductDetailsRatingsView this$0;

            public void onScroll(AbsListView abslistview, int j, int k, int l)
            {
                handleScrollLoad(j, k, l);
            }

            public void onScrollStateChanged(AbsListView abslistview, int j)
            {
            }

            
            {
                this$0 = TabbedProductDetailsRatingsView.this;
                super();
            }
        });
        listView.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {

            final TabbedProductDetailsRatingsView this$0;

            public void onItemClick(AdapterView adapterview, View view, int j, long l)
            {
                handleItemClick(j);
            }

            
            {
                this$0 = TabbedProductDetailsRatingsView.this;
                super();
            }
        });
        listAdapter = new RatingsAdapter(fragment.getActivity(), ratings, listView);
        listView.setAdapter(listAdapter);
        listAdapter.notifyDataSetChanged();
        loadNextPage();
    }

    protected void setupHeader()
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
        ratingStarOne.setImageResource(ai[0]);
        ratingStarTwo.setImageResource(ai[1]);
        ratingStarThree.setImageResource(ai[2]);
        ratingStarFour.setImageResource(ai[3]);
        ratingStarFive.setImageResource(ai[4]);
        ratingStarText.setText(WishApplication.getAppInstance().getQuantityString(0x7f070009, (int)ratingSummary.getRatingCount(), new Object[] {
            NumberFormat.getInstance().format(ratingSummary.getRatingCount())
        }));
        i = 0;
        for (Iterator iterator = ratingSummary.getRatingSpreads().iterator(); iterator.hasNext();)
        {
            i += ((Integer)iterator.next()).intValue();
        }

        ratingBarOne.setMax(i);
        ratingBarOne.setProgress(((Integer)ratingSummary.getRatingSpreads().get(0)).intValue());
        ratingBarTwo.setMax(i);
        ratingBarTwo.setProgress(((Integer)ratingSummary.getRatingSpreads().get(1)).intValue());
        ratingBarThree.setMax(i);
        ratingBarThree.setProgress(((Integer)ratingSummary.getRatingSpreads().get(2)).intValue());
        ratingBarFour.setMax(i);
        ratingBarFour.setProgress(((Integer)ratingSummary.getRatingSpreads().get(3)).intValue());
        ratingBarFive.setMax(i);
        ratingBarFive.setProgress(((Integer)ratingSummary.getRatingSpreads().get(4)).intValue());
        if (getActionButtonText() != null)
        {
            actionTextView.setText(getActionButtonText());
            actionTextView.setOnClickListener(new android.view.View.OnClickListener() {

                final TabbedProductDetailsRatingsView this$0;

                public void onClick(View view)
                {
                    handleActionClick();
                }

            
            {
                this$0 = TabbedProductDetailsRatingsView.this;
                super();
            }
            });
        } else
        {
            actionTextView.setVisibility(8);
        }
        if (getSubtitleLineOne() != null)
        {
            subtitleLineOne.setText(getSubtitleLineOne());
        } else
        {
            subtitleLineOne.setVisibility(8);
        }
        if (getSubtitleLineTwo() != null)
        {
            subtitleLineTwo.setText(getSubtitleLineTwo());
            return;
        } else
        {
            subtitleLineTwo.setVisibility(8);
            return;
        }
    }



}
