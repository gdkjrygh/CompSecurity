// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.notifications;

import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.widget.SwipeRefreshLayout;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import com.contextlogic.wish.WishApplication;
import com.contextlogic.wish.activity.link.WishDeepLinkActivity;
import com.contextlogic.wish.api.core.ApiDataChangeNotificationListener;
import com.contextlogic.wish.api.core.ApiDataChangeNotificationManager;
import com.contextlogic.wish.api.data.WishBrandFilter;
import com.contextlogic.wish.api.data.WishNotification;
import com.contextlogic.wish.api.data.WishProduct;
import com.contextlogic.wish.api.data.WishTag;
import com.contextlogic.wish.api.data.WishUser;
import com.contextlogic.wish.api.service.ClickNotificationService;
import com.contextlogic.wish.api.service.FollowService;
import com.contextlogic.wish.api.service.GetNotificationsService;
import com.contextlogic.wish.api.service.UnfollowService;
import com.contextlogic.wish.cache.RuntimeStateStore;
import com.contextlogic.wish.prompt.RateAppPrompt;
import com.contextlogic.wish.ui.activity.root.RootActivity;
import com.contextlogic.wish.ui.components.alert.PopupAlertDialog;
import com.contextlogic.wish.ui.components.list.LoadingListRow;
import com.contextlogic.wish.ui.components.navigation.NavigationBarWrapper;
import com.contextlogic.wish.ui.fragment.base.BaseContentFragment;
import com.contextlogic.wish.ui.fragment.embeddedbrowser.EmbeddedBrowserFragment;
import com.contextlogic.wish.ui.fragment.menu.MainMenuItem;
import com.contextlogic.wish.ui.fragment.productfeed.ProductFeedFragment;
import com.contextlogic.wish.ui.fragment.profile.ProfileFragment;
import com.contextlogic.wish.user.LoggedInUser;
import com.contextlogic.wish.user.UserStatusManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

// Referenced classes of package com.contextlogic.wish.ui.fragment.notifications:
//            NotificationsAdapter

public class NotificationsFragment extends BaseContentFragment
    implements ApiDataChangeNotificationListener
{

    private static final String STORED_STATE_BUCKET_NUMBER = "StoredStateBucketNumber";
    private static final String STORED_STATE_DATA = "StoredStateData";
    private static final String STORED_STATE_NO_MORE_DATA = "StoredStateNoMoreData";
    private int bucketNumber;
    private String dataStateStoreKey;
    private View errorView;
    public FollowService followService;
    private GetNotificationsService getNotificationsService;
    private NotificationsAdapter listAdapter;
    private ListView listView;
    private boolean loadingComplete;
    private boolean loadingErrored;
    private LoadingListRow loadingListRow;
    private View loadingView;
    private TextView noItemsTextView;
    private View noItemsView;
    private boolean noMoreItems;
    private ArrayList notifications;
    private SwipeRefreshLayout refresherView;
    public UnfollowService unfollowService;
    private boolean updatingList;

    public NotificationsFragment()
    {
    }

    private void handleLoadingFailure()
    {
        loadingErrored = true;
        PopupAlertDialog.showError(getActivity(), getActivity().getString(0x7f06030d), getActivity().getString(0x7f060192));
        refreshViewState();
        refresherView.setRefreshing(false);
        refresherView.setEnabled(true);
    }

    private void handleLoadingSuccess(ArrayList arraylist, int i)
    {
        loadingComplete = true;
        WishNotification wishnotification;
        for (arraylist = arraylist.iterator(); arraylist.hasNext(); notifications.add(wishnotification))
        {
            wishnotification = (WishNotification)arraylist.next();
        }

        listAdapter.notifyDataSetChanged();
        if (bucketNumber == 0)
        {
            listView.setSelectionAfterHeaderView();
        }
        bucketNumber = bucketNumber + 1;
        boolean flag;
        if (bucketNumber >= i)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        noMoreItems = flag;
        if (!noMoreItems && notifications.size() < 10)
        {
            loadNextPage();
        }
        refreshViewState();
        updatingList = false;
        refresherView.setRefreshing(false);
        refresherView.setEnabled(true);
    }

    private void handleScrollLoad(int i, int j, int k)
    {
        boolean flag;
        if (!loadingErrored && !noMoreItems && !updatingList && !getNotificationsService.isPending() && loadingComplete)
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
        refresherView.setVisibility(8);
        listView.setVisibility(8);
        errorView.setVisibility(8);
        noItemsView.setVisibility(8);
        loadingView.setVisibility(8);
    }

    private void loadNextPage()
    {
        WishApplication.getAppInstance().clearAllPushNotifications();
        loadingErrored = false;
        getNotificationsService.requestService(bucketNumber, new com.contextlogic.wish.api.service.GetNotificationsService.SuccessCallback() {

            final NotificationsFragment this$0;

            public void onServiceSucceeded(final ArrayList items, int i)
            {
                updatingList = true;
                postDelayed(i. new Runnable() {

                    final _cls6 this$1;
                    final int val$bucketCount;
                    final ArrayList val$items;

                    public void run()
                    {
                        handleLoadingSuccess(items, bucketCount);
                    }

            
            {
                this$1 = final__pcls6;
                items = arraylist;
                bucketCount = I.this;
                super();
            }
                }, getAnimationTimeRemaining());
                UserStatusManager.getInstance().refreshStatus();
            }

            
            {
                this$0 = NotificationsFragment.this;
                super();
            }
        }, new com.contextlogic.wish.api.service.ApiService.FailureCallback() {

            final NotificationsFragment this$0;

            public void onServiceFailed()
            {
                postDelayed(new Runnable() {

                    final _cls7 this$1;

                    public void run()
                    {
                        handleLoadingFailure();
                    }

            
            {
                this$1 = _cls7.this;
                super();
            }
                }, getAnimationTimeRemaining());
            }

            
            {
                this$0 = NotificationsFragment.this;
                super();
            }
        });
        refreshViewState();
    }

    private void refresh()
    {
        getNotificationsService.cancelAllRequests();
        notifications.clear();
        listAdapter.notifyDataSetChanged();
        noMoreItems = false;
        bucketNumber = 0;
        loadingComplete = false;
        loadNextPage();
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
        if (notifications.size() <= 0) goto _L4; else goto _L3
_L3:
        refresherView.setVisibility(0);
        listView.setVisibility(0);
        if (!noMoreItems) goto _L6; else goto _L5
_L5:
        loadingListRow.setLoadingMode(com.contextlogic.wish.ui.components.list.LoadingListRow.LoadingMode.NoMoreItems);
_L8:
        return;
_L6:
        if (getNotificationsService.isPending())
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
        if (loadingComplete && notifications.size() == 0)
        {
            noItemsView.setVisibility(0);
            noItemsTextView.setText(getString(0x7f060193));
            return;
        }
        if (loadingComplete)
        {
            refresherView.setVisibility(0);
            listView.setVisibility(0);
            if (noMoreItems)
            {
                loadingListRow.setLoadingMode(com.contextlogic.wish.ui.components.list.LoadingListRow.LoadingMode.NoMoreItems);
                return;
            }
            if (getNotificationsService.isPending())
            {
                loadingListRow.setLoadingMode(com.contextlogic.wish.ui.components.list.LoadingListRow.LoadingMode.Loading);
                return;
            } else
            {
                loadingListRow.setLoadingMode(com.contextlogic.wish.ui.components.list.LoadingListRow.LoadingMode.ClickToLoad);
                return;
            }
        }
        if (getNotificationsService.isPending())
        {
            if (!refresherView.isRefreshing())
            {
                loadingView.setVisibility(0);
                return;
            } else
            {
                refresherView.setVisibility(0);
                return;
            }
        }
        if (true) goto _L8; else goto _L7
_L7:
    }

    protected com.contextlogic.wish.analytics.Analytics.PageViewType getAnalyticsPageViewType()
    {
        return com.contextlogic.wish.analytics.Analytics.PageViewType.AllNotifications;
    }

    public int getLayoutResourceId()
    {
        return 0x7f030074;
    }

    public MainMenuItem getTopLevelMenuItem()
    {
        return MainMenuItem.NOTIFICATIONS;
    }

    public void handleNotificationClick(int i)
    {
        handleNotificationClick((WishNotification)notifications.get(i));
    }

    public void handleNotificationClick(WishNotification wishnotification)
    {
        wishnotification.markClicked();
        (new ClickNotificationService()).requestService(wishnotification.getNotificationNumber(), wishnotification.getBucketNumber(), false, null, null);
        if (listAdapter != null)
        {
            listAdapter.refreshNewState();
        }
        static class _cls8
        {

            static final int $SwitchMap$com$contextlogic$wish$api$data$WishNotification$NotificationTargetType[];

            static 
            {
                $SwitchMap$com$contextlogic$wish$api$data$WishNotification$NotificationTargetType = new int[com.contextlogic.wish.api.data.WishNotification.NotificationTargetType.values().length];
                try
                {
                    $SwitchMap$com$contextlogic$wish$api$data$WishNotification$NotificationTargetType[com.contextlogic.wish.api.data.WishNotification.NotificationTargetType.Website.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror8) { }
                try
                {
                    $SwitchMap$com$contextlogic$wish$api$data$WishNotification$NotificationTargetType[com.contextlogic.wish.api.data.WishNotification.NotificationTargetType.Product.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    $SwitchMap$com$contextlogic$wish$api$data$WishNotification$NotificationTargetType[com.contextlogic.wish.api.data.WishNotification.NotificationTargetType.Invite.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    $SwitchMap$com$contextlogic$wish$api$data$WishNotification$NotificationTargetType[com.contextlogic.wish.api.data.WishNotification.NotificationTargetType.Feed.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    $SwitchMap$com$contextlogic$wish$api$data$WishNotification$NotificationTargetType[com.contextlogic.wish.api.data.WishNotification.NotificationTargetType.BrandFeed.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    $SwitchMap$com$contextlogic$wish$api$data$WishNotification$NotificationTargetType[com.contextlogic.wish.api.data.WishNotification.NotificationTargetType.Profile.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$contextlogic$wish$api$data$WishNotification$NotificationTargetType[com.contextlogic.wish.api.data.WishNotification.NotificationTargetType.Alert.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$contextlogic$wish$api$data$WishNotification$NotificationTargetType[com.contextlogic.wish.api.data.WishNotification.NotificationTargetType.Rate.ordinal()] = 8;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$contextlogic$wish$api$data$WishNotification$NotificationTargetType[com.contextlogic.wish.api.data.WishNotification.NotificationTargetType.DeepLink.ordinal()] = 9;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls8..SwitchMap.com.contextlogic.wish.api.data.WishNotification.NotificationTargetType[wishnotification.getTargetType().ordinal()];
        JVM INSTR tableswitch 1 9: default 100
    //                   1 101
    //                   2 153
    //                   3 211
    //                   4 241
    //                   5 348
    //                   6 420
    //                   7 496
    //                   8 565
    //                   9 579;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10
_L1:
        return;
_L2:
        try
        {
            wishnotification = (String)wishnotification.getTarget();
            EmbeddedBrowserFragment embeddedbrowserfragment = new EmbeddedBrowserFragment();
            Bundle bundle = new Bundle();
            bundle.putString("ArgInitialUrl", wishnotification);
            embeddedbrowserfragment.setArguments(bundle);
            ((RootActivity)getActivity()).setContentFragment(embeddedbrowserfragment, false);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (WishNotification wishnotification)
        {
            return;
        }
_L3:
        String s;
        WishProduct wishproduct;
        try
        {
            wishproduct = (WishProduct)wishnotification.getTarget();
        }
        // Misplaced declaration of an exception variable
        catch (WishNotification wishnotification)
        {
            return;
        }
        s = null;
        if (wishnotification.getExtraInfo().containsKey("recommended_by"))
        {
            s = (String)wishnotification.getExtraInfo().get("recommended_by");
        }
        ((RootActivity)getActivity()).setContentFragment(RootActivity.getProductDetailFragment(wishproduct, null, s, null), false);
        return;
_L4:
        if (getActivity() != null)
        {
            ((RootActivity)getActivity()).showShareDialog(UserStatusManager.getInstance().getInviteSubject(), UserStatusManager.getInstance().getInviteMessage());
            return;
        }
          goto _L1
_L5:
        if (wishnotification.getTarget() != null)
        {
            try
            {
                wishnotification = (WishTag)wishnotification.getTarget();
                ProductFeedFragment productfeedfragment = new ProductFeedFragment();
                Bundle bundle1 = new Bundle();
                bundle1.putString("ArgDataValue", wishnotification.getTagId());
                bundle1.putInt("ArgDataMode", com.contextlogic.wish.ui.fragment.productfeed.ProductFeedFragment.DataMode.Tag.ordinal());
                bundle1.putString("ArgDataTitle", wishnotification.getName());
                productfeedfragment.setArguments(bundle1);
                ((RootActivity)getActivity()).setContentFragment(productfeedfragment, false);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (WishNotification wishnotification)
            {
                return;
            }
        } else
        {
            wishnotification = ProductFeedFragment.createEverythingFeedFragment(getActivity());
            ((RootActivity)getActivity()).setContentFragment(wishnotification, false);
            return;
        }
_L6:
        if (wishnotification.getTarget() == null) goto _L1; else goto _L11
_L11:
        try
        {
            wishnotification = (WishBrandFilter)wishnotification.getTarget();
            ProductFeedFragment productfeedfragment1 = new ProductFeedFragment();
            Bundle bundle2 = new Bundle();
            bundle2.putSerializable("ArgDataValue", wishnotification);
            bundle2.putInt("ArgDataMode", com.contextlogic.wish.ui.fragment.productfeed.ProductFeedFragment.DataMode.Brand.ordinal());
            productfeedfragment1.setArguments(bundle2);
            ((RootActivity)getActivity()).setContentFragment(productfeedfragment1, false);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (WishNotification wishnotification)
        {
            return;
        }
_L7:
        if (wishnotification.getTarget() == null || !(wishnotification.getTarget() instanceof WishUser)) goto _L13; else goto _L12
_L12:
        Object obj = (WishUser)wishnotification.getTarget();
_L15:
        ProfileFragment profilefragment = new ProfileFragment();
        Bundle bundle3 = new Bundle();
        bundle3.putSerializable("ArgUser", RuntimeStateStore.getInstance().storeState(obj, null));
        profilefragment.setArguments(bundle3);
        ((RootActivity)getActivity()).setContentFragment(profilefragment, false);
_L8:
        if (wishnotification.getTarget() == null) goto _L1; else goto _L14
_L14:
        try
        {
            obj = new android.app.AlertDialog.Builder(getActivity());
            ((android.app.AlertDialog.Builder) (obj)).setMessage((String)wishnotification.getTarget());
            ((android.app.AlertDialog.Builder) (obj)).setPositiveButton(getString(0x7f060304), new android.content.DialogInterface.OnClickListener() {

                final NotificationsFragment this$0;

                public void onClick(DialogInterface dialoginterface, int i)
                {
                    dialoginterface.dismiss();
                }

            
            {
                this$0 = NotificationsFragment.this;
                super();
            }
            });
            ((android.app.AlertDialog.Builder) (obj)).show();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (WishNotification wishnotification)
        {
            return;
        }
_L13:
        obj = LoggedInUser.getInstance().getCurrentUser();
          goto _L15
_L9:
        RateAppPrompt.markPromptShown();
        WishApplication.getAppInstance().goToMarketListing(getActivity());
        return;
_L10:
        if (wishnotification.getTarget() == null) goto _L1; else goto _L16
_L16:
        try
        {
            wishnotification = WishDeepLinkActivity.getDeepLinkTarget(Uri.parse((String)wishnotification.getTarget()));
        }
        // Misplaced declaration of an exception variable
        catch (WishNotification wishnotification)
        {
            return;
        }
        if (wishnotification == null) goto _L1; else goto _L17
_L17:
        obj = getActivity();
        if (obj == null) goto _L1; else goto _L18
_L18:
        if (!(obj instanceof RootActivity)) goto _L1; else goto _L19
_L19:
        ((RootActivity)obj).processDeepLink(wishnotification, false);
        return;
        ClassCastException classcastexception;
        classcastexception;
          goto _L8
    }

    public void handleResume()
    {
        super.handleResume();
        if (bucketNumber == -1 || !loadingComplete)
        {
            bucketNumber = 0;
            loadNextPage();
        } else
        {
            UserStatusManager.getInstance().refreshStatus();
        }
        refreshViewState();
        refreshRowTimestamps();
        if (listAdapter != null)
        {
            listAdapter.resumeCacheWarming();
        }
    }

    public void initializeUi(View view)
    {
        getNavigationBar().setTitle(getActivity().getString(0x7f0602fc));
        refresherView = (SwipeRefreshLayout)view.findViewById(0x7f0d0237);
        refresherView.setColorSchemeResources(new int[] {
            0x7f0c00bf
        });
        refresherView.setEnabled(false);
        refresherView.setOnRefreshListener(new android.support.v4.widget.SwipeRefreshLayout.OnRefreshListener() {

            final NotificationsFragment this$0;

            public void onRefresh()
            {
                trackEvent(com.contextlogic.wish.analytics.Analytics.EventType.Refresh, com.contextlogic.wish.analytics.Analytics.LabelType.Scroll);
                refresh();
            }

            
            {
                this$0 = NotificationsFragment.this;
                super();
            }
        });
        listView = (ListView)view.findViewById(0x7f0d0238);
        loadingView = view.findViewById(0x7f0d0239);
        noItemsView = view.findViewById(0x7f0d023a);
        errorView = view.findViewById(0x7f0d023c);
        noItemsTextView = (TextView)view.findViewById(0x7f0d023b);
        listView.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {

            final NotificationsFragment this$0;

            public void onItemClick(AdapterView adapterview, View view1, int i, long l)
            {
                handleNotificationClick(i);
            }

            
            {
                this$0 = NotificationsFragment.this;
                super();
            }
        });
        listView.setOnScrollListener(new android.widget.AbsListView.OnScrollListener() {

            final NotificationsFragment this$0;

            public void onScroll(AbsListView abslistview, int i, int j, int k)
            {
                handleScrollLoad(i, j, k);
            }

            public void onScrollStateChanged(AbsListView abslistview, int i)
            {
            }

            
            {
                this$0 = NotificationsFragment.this;
                super();
            }
        });
        loadingListRow = new LoadingListRow(getActivity());
        loadingListRow.setOnClickListener(new android.view.View.OnClickListener() {

            final NotificationsFragment this$0;

            public void onClick(View view1)
            {
                trackClick(com.contextlogic.wish.analytics.Analytics.EventType.Load);
                loadNextPage();
            }

            
            {
                this$0 = NotificationsFragment.this;
                super();
            }
        });
        listView.addFooterView(loadingListRow);
        listAdapter = new NotificationsAdapter(getActivity(), notifications, listView, this);
        listView.setAdapter(listAdapter);
        listAdapter.notifyDataSetChanged();
        listView.setFadingEdgeLength(0);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        getNotificationsService = new GetNotificationsService();
        followService = new FollowService();
        unfollowService = new UnfollowService();
        ApiDataChangeNotificationManager.getInstance().addListener(com.contextlogic.wish.api.core.ApiDataChangeNotificationManager.NotificationType.UserFollowed, this);
        ApiDataChangeNotificationManager.getInstance().addListener(com.contextlogic.wish.api.core.ApiDataChangeNotificationManager.NotificationType.UserUnfollowed, this);
    }

    public void onDestroy()
    {
        super.onDestroy();
        RuntimeStateStore.getInstance().clearState(dataStateStoreKey);
    }

    public void onNotificationReceived(com.contextlogic.wish.api.core.ApiDataChangeNotificationManager.NotificationType notificationtype, Bundle bundle)
    {
        if (listAdapter != null)
        {
            listAdapter.refreshFollowButtonStates();
        }
    }

    public void onPause()
    {
        super.onPause();
        if (listAdapter != null)
        {
            listAdapter.pauseCacheWarming();
        }
        getNotificationsService.cancelAllRequests();
        followService.cancelAllRequests();
        unfollowService.cancelAllRequests();
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        if (loadingComplete && notifications.size() > 0 && bucketNumber >= 0)
        {
            dataStateStoreKey = RuntimeStateStore.getInstance().storeState(notifications, dataStateStoreKey);
            bundle.putSerializable("StoredStateData", dataStateStoreKey);
            bundle.putInt("StoredStateBucketNumber", bucketNumber);
            bundle.putBoolean("StoredStateNoMoreData", noMoreItems);
        }
    }

    protected void releaseImages()
    {
        if (listAdapter != null)
        {
            listAdapter.releaseImages();
        }
    }

    protected void restoreImages()
    {
        if (listAdapter != null)
        {
            listAdapter.restoreImages();
        }
    }

    public void restoreState(Bundle bundle)
    {
        super.restoreState(bundle);
        if (bundle != null && bundle.containsKey("StoredStateData") && bundle.containsKey("StoredStateNoMoreData") && bundle.containsKey("StoredStateBucketNumber"))
        {
            dataStateStoreKey = bundle.getString("StoredStateData");
            notifications = (ArrayList)RuntimeStateStore.getInstance().getState(dataStateStoreKey);
            bucketNumber = bundle.getInt("StoredStateBucketNumber");
            noMoreItems = bundle.getBoolean("StoredStateNoMoreData");
            boolean flag;
            if (notifications != null)
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
            notifications = new ArrayList();
            noMoreItems = false;
            bucketNumber = -1;
            loadingComplete = false;
        }
    }

    public boolean useCanvasBackground()
    {
        return true;
    }





/*
    static boolean access$302(NotificationsFragment notificationsfragment, boolean flag)
    {
        notificationsfragment.updatingList = flag;
        return flag;
    }

*/


}
