// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.profile.userlist;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.AbsListView;
import android.widget.ListView;
import android.widget.TextView;
import com.contextlogic.wish.api.core.ApiDataChangeNotificationListener;
import com.contextlogic.wish.api.core.ApiDataChangeNotificationManager;
import com.contextlogic.wish.api.data.WishUser;
import com.contextlogic.wish.api.service.FollowService;
import com.contextlogic.wish.api.service.GetProfileUsersService;
import com.contextlogic.wish.api.service.UnfollowService;
import com.contextlogic.wish.cache.RuntimeStateStore;
import com.contextlogic.wish.ui.activity.root.RootActivity;
import com.contextlogic.wish.ui.components.list.LoadingListRow;
import com.contextlogic.wish.ui.components.navigation.NavigationBarWrapper;
import com.contextlogic.wish.ui.fragment.base.BaseContentFragment;
import com.contextlogic.wish.ui.fragment.profile.ProfileFragment;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.contextlogic.wish.ui.fragment.profile.userlist:
//            ProfileUserListAdapter

public class ProfileUserListFragment extends BaseContentFragment
    implements ApiDataChangeNotificationListener
{
    public static final class SectionMode extends Enum
    {

        private static final SectionMode $VALUES[];
        public static final SectionMode Followers;
        public static final SectionMode Following;

        public static SectionMode valueOf(String s)
        {
            return (SectionMode)Enum.valueOf(com/contextlogic/wish/ui/fragment/profile/userlist/ProfileUserListFragment$SectionMode, s);
        }

        public static SectionMode[] values()
        {
            return (SectionMode[])$VALUES.clone();
        }

        static 
        {
            Following = new SectionMode("Following", 0);
            Followers = new SectionMode("Followers", 1);
            $VALUES = (new SectionMode[] {
                Following, Followers
            });
        }

        private SectionMode(String s, int i)
        {
            super(s, i);
        }
    }


    public static final String ARG_FOLLOWERS_SET_ID = "ArgFollowersSetId";
    public static final String ARG_FOLLOWING_SET_ID = "ArgFollowingSetId";
    public static final String ARG_SECTION_MODE = "ArgSectionMode";
    public static final String ARG_STANDALONE_MODE = "ArgStandaloneMode";
    private static final int REQUEST_USER_COUNT = 25;
    private static final String STORED_STATE_CURRENT_OFFSET = "StoredStateCurrentOffset";
    private static final String STORED_STATE_DATA = "StoredStateData";
    private static final String STORED_STATE_FOLLOWERS_SET_ID = "StoredStateFollowersSetId";
    private static final String STORED_STATE_FOLLOWING_SET_ID = "StoredStateFollowingSetId";
    private static final String STORED_STATE_NO_MORE_DATA = "StoredStateNoMoreData";
    private int currentOffset;
    private String dataStateStoreKey;
    private View errorView;
    public FollowService followService;
    private String followersSetId;
    private String followingSetId;
    private GetProfileUsersService getProfileUsersService;
    private ProfileUserListAdapter listAdapter;
    private ListView listView;
    private boolean loadingComplete;
    private boolean loadingErrored;
    private LoadingListRow loadingListRow;
    private View loadingView;
    private TextView noItemsText;
    private View noItemsView;
    private boolean noMoreItems;
    private SectionMode sectionMode;
    public UnfollowService unfollowService;
    private boolean useStandaloneMode;
    private ArrayList userList;

    public ProfileUserListFragment()
    {
    }

    private void handleLoadingFailure()
    {
        loadingErrored = true;
        refreshViewState();
    }

    private void handleLoadingSuccess(ArrayList arraylist, boolean flag)
    {
        loadingComplete = true;
        WishUser wishuser;
        for (arraylist = arraylist.iterator(); arraylist.hasNext(); userList.add(wishuser))
        {
            wishuser = (WishUser)arraylist.next();
        }

        listAdapter.notifyDataSetChanged();
        if (currentOffset == 0)
        {
            listView.setSelectionAfterHeaderView();
        }
        currentOffset = currentOffset + 25;
        noMoreItems = flag;
        if (!noMoreItems && userList.size() < 10)
        {
            loadNextPage();
        }
        refreshViewState();
    }

    private void handleScrollLoad(int i, int j, int k)
    {
        boolean flag;
        if (!loadingErrored && !noMoreItems && !getProfileUsersService.isPending() && loadingComplete)
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
        noItemsView.setVisibility(8);
        loadingView.setVisibility(8);
    }

    private void loadNextPage()
    {
        loadingErrored = false;
        if (sectionMode != SectionMode.Following) goto _L2; else goto _L1
_L1:
        getProfileUsersService.requestService(followingSetId, currentOffset, 25, new com.contextlogic.wish.api.service.GetProfileUsersService.SuccessCallback() {

            final ProfileUserListFragment this$0;

            public void onServiceSucceeded(ArrayList arraylist, boolean flag)
            {
                handleLoadingSuccess(arraylist, flag);
            }

            
            {
                this$0 = ProfileUserListFragment.this;
                super();
            }
        }, new com.contextlogic.wish.api.service.ApiService.FailureCallback() {

            final ProfileUserListFragment this$0;

            public void onServiceFailed()
            {
                handleLoadingFailure();
            }

            
            {
                this$0 = ProfileUserListFragment.this;
                super();
            }
        });
_L4:
        refreshViewState();
        return;
_L2:
        if (sectionMode == SectionMode.Followers)
        {
            getProfileUsersService.requestService(followersSetId, currentOffset, 25, new com.contextlogic.wish.api.service.GetProfileUsersService.SuccessCallback() {

                final ProfileUserListFragment this$0;

                public void onServiceSucceeded(ArrayList arraylist, boolean flag)
                {
                    handleLoadingSuccess(arraylist, flag);
                }

            
            {
                this$0 = ProfileUserListFragment.this;
                super();
            }
            }, new com.contextlogic.wish.api.service.ApiService.FailureCallback() {

                final ProfileUserListFragment this$0;

                public void onServiceFailed()
                {
                    handleLoadingFailure();
                }

            
            {
                this$0 = ProfileUserListFragment.this;
                super();
            }
            });
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void refreshViewState()
    {
        hideAllUiElements();
        if (loadingErrored)
        {
            if (userList.size() > 0)
            {
                if (noMoreItems)
                {
                    loadingListRow.setLoadingMode(com.contextlogic.wish.ui.components.list.LoadingListRow.LoadingMode.NoMoreItems);
                    return;
                }
                if (getProfileUsersService.isPending())
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
        if (loadingComplete && userList.size() == 0)
        {
            noItemsView.setVisibility(0);
            if (sectionMode == SectionMode.Followers)
            {
                noItemsText.setText(getActivity().getString(0x7f0601b2));
                return;
            } else
            {
                noItemsText.setText(getActivity().getString(0x7f0601b3));
                return;
            }
        }
        if (loadingComplete)
        {
            listView.setVisibility(0);
            if (noMoreItems)
            {
                loadingListRow.setLoadingMode(com.contextlogic.wish.ui.components.list.LoadingListRow.LoadingMode.NoMoreItems);
                return;
            }
            if (getProfileUsersService.isPending())
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

    protected com.contextlogic.wish.analytics.Analytics.PageViewType getAnalyticsPageViewType()
    {
        if (sectionMode == SectionMode.Followers)
        {
            return com.contextlogic.wish.analytics.Analytics.PageViewType.ProfileFollowers;
        } else
        {
            return com.contextlogic.wish.analytics.Analytics.PageViewType.ProfileFollowing;
        }
    }

    public int getLayoutResourceId()
    {
        return 0x7f03008f;
    }

    public void handleProfileUserClick(WishUser wishuser)
    {
        trackClick(com.contextlogic.wish.analytics.Analytics.EventType.ProfileUserBucketSelect);
        ProfileFragment profilefragment = new ProfileFragment();
        Bundle bundle = new Bundle();
        bundle.putString("ArgUser", RuntimeStateStore.getInstance().storeState(wishuser, null));
        profilefragment.setArguments(bundle);
        ((RootActivity)getActivity()).setContentFragment(profilefragment, false);
    }

    public void handleResume()
    {
        super.handleResume();
        if (currentOffset == -1 && !loadingComplete && followersSetId != null && followingSetId != null)
        {
            currentOffset = 0;
            loadNextPage();
        }
        refreshViewState();
        if (listAdapter != null)
        {
            listAdapter.resumeCacheWarming();
            listAdapter.refreshFollowButtonStates();
        }
    }

    public void initializeUi(View view)
    {
        if (useStandaloneMode)
        {
            if (sectionMode == SectionMode.Following)
            {
                getNavigationBar().setTitle(getString(0x7f0601b1));
            } else
            {
                getNavigationBar().setTitle(getString(0x7f060167));
            }
        } else
        {
            hideNavigationBar();
        }
        listView = (ListView)view.findViewById(0x7f0d02bf);
        loadingView = view.findViewById(0x7f0d02c0);
        noItemsView = view.findViewById(0x7f0d02c1);
        noItemsText = (TextView)view.findViewById(0x7f0d02c3);
        errorView = view.findViewById(0x7f0d02c4);
        listView.setOnScrollListener(new android.widget.AbsListView.OnScrollListener() {

            final ProfileUserListFragment this$0;

            public void onScroll(AbsListView abslistview, int i, int j, int k)
            {
                handleScrollLoad(i, j, k);
            }

            public void onScrollStateChanged(AbsListView abslistview, int i)
            {
            }

            
            {
                this$0 = ProfileUserListFragment.this;
                super();
            }
        });
        loadingListRow = new LoadingListRow(getActivity());
        loadingListRow.setNoMoreItemsText(getString(0x7f0602e2));
        loadingListRow.setOnClickListener(new android.view.View.OnClickListener() {

            final ProfileUserListFragment this$0;

            public void onClick(View view1)
            {
                trackClick(com.contextlogic.wish.analytics.Analytics.EventType.Load);
                loadNextPage();
            }

            
            {
                this$0 = ProfileUserListFragment.this;
                super();
            }
        });
        listView.addFooterView(loadingListRow);
        listAdapter = new ProfileUserListAdapter(getActivity(), userList, listView, this);
        listView.setAdapter(listAdapter);
        listAdapter.notifyDataSetChanged();
        listView.setFadingEdgeLength(0);
    }

    public void loadingComplete(WishUser wishuser)
    {
        followersSetId = wishuser.getFollowersSetId();
        followingSetId = wishuser.getFollowingSetId();
        if (currentOffset == -1 && !loadingComplete && followersSetId != null && followingSetId != null)
        {
            currentOffset = 0;
            loadNextPage();
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        getProfileUsersService = new GetProfileUsersService();
        followService = new FollowService();
        unfollowService = new UnfollowService();
        sectionMode = SectionMode.values()[getArguments().getInt("ArgSectionMode")];
        followersSetId = getArguments().getString("ArgFollowersSetId");
        followingSetId = getArguments().getString("ArgFollowingSetId");
        useStandaloneMode = getArguments().getBoolean("ArgStandaloneMode", false);
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
        if (isVisible() && listAdapter != null)
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
        getProfileUsersService.cancelAllRequests();
        followService.cancelAllRequests();
        unfollowService.cancelAllRequests();
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        if (loadingComplete && userList.size() > 0 && currentOffset >= 0)
        {
            dataStateStoreKey = RuntimeStateStore.getInstance().storeState(userList, dataStateStoreKey);
            bundle.putSerializable("StoredStateData", dataStateStoreKey);
            bundle.putInt("StoredStateCurrentOffset", currentOffset);
            bundle.putBoolean("StoredStateNoMoreData", noMoreItems);
            bundle.putString("StoredStateFollowersSetId", followersSetId);
            bundle.putString("StoredStateFollowingSetId", followingSetId);
        }
    }

    public void refresh()
    {
        loadingErrored = false;
        loadingComplete = false;
        userList.clear();
        noMoreItems = false;
        currentOffset = -1;
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
        if (bundle != null && bundle.containsKey("StoredStateData") && bundle.containsKey("StoredStateNoMoreData") && bundle.containsKey("StoredStateCurrentOffset"))
        {
            dataStateStoreKey = bundle.getString("StoredStateData");
            userList = (ArrayList)RuntimeStateStore.getInstance().getState(dataStateStoreKey);
            currentOffset = bundle.getInt("StoredStateCurrentOffset");
            noMoreItems = bundle.getBoolean("StoredStateNoMoreData");
            loadingComplete = true;
            followersSetId = bundle.getString("StoredStateFollowersSetId");
            followingSetId = bundle.getString("StoredStateFollowingSetId");
            return;
        } else
        {
            userList = new ArrayList();
            noMoreItems = false;
            currentOffset = -1;
            loadingComplete = false;
            return;
        }
    }

    public boolean useCanvasBackground()
    {
        return true;
    }




}
