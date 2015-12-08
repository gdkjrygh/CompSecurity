// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.profile;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.SwipeRefreshLayout;
import android.util.TypedValue;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.contextlogic.wish.WishApplication;
import com.contextlogic.wish.analytics.WishAnalyticsEvent;
import com.contextlogic.wish.api.core.ApiDataChangeNotificationListener;
import com.contextlogic.wish.api.core.ApiDataChangeNotificationManager;
import com.contextlogic.wish.api.data.WishProfileImage;
import com.contextlogic.wish.api.data.WishUser;
import com.contextlogic.wish.api.service.FollowService;
import com.contextlogic.wish.api.service.GetProfileService;
import com.contextlogic.wish.api.service.LogService;
import com.contextlogic.wish.api.service.UnfollowService;
import com.contextlogic.wish.cache.RuntimeStateStore;
import com.contextlogic.wish.cache.TransientCache;
import com.contextlogic.wish.ui.activity.root.ProfileImageUploadCallback;
import com.contextlogic.wish.ui.activity.root.RootActivity;
import com.contextlogic.wish.ui.components.alert.PopupAlertDialog;
import com.contextlogic.wish.ui.components.image.BorderedImageView;
import com.contextlogic.wish.ui.components.image.CachedImageView;
import com.contextlogic.wish.ui.components.navigation.NavigationBarButtonCallback;
import com.contextlogic.wish.ui.components.navigation.NavigationBarWrapper;
import com.contextlogic.wish.ui.fragment.base.BaseContentFragment;
import com.contextlogic.wish.ui.fragment.menu.MainMenuItem;
import com.contextlogic.wish.ui.fragment.productfeed.ProductFeedFragment;
import com.contextlogic.wish.ui.fragment.profile.userlist.ProfileUserListFragment;
import com.contextlogic.wish.ui.fragment.profile.wishes.ProfileWishesFragment;
import com.contextlogic.wish.user.LoggedInUser;
import com.contextlogic.wish.user.UserFollowingManager;
import com.contextlogic.wish.user.UserStatusManager;
import com.contextlogic.wish.util.TabletUtil;

public class ProfileFragment extends BaseContentFragment
    implements ApiDataChangeNotificationListener
{

    public static final String ARG_SET_ID = "ArgSetId";
    public static final String ARG_USER = "ArgUser";
    private static final String STORED_STATE_DATA = "StoredStateData";
    private int currentSectionIndex;
    private String dataStateStoreKey;
    private TextView editOverlay;
    private View errorView;
    private FollowService followService;
    private TextView followersCountTextView;
    private ProfileUserListFragment followersListFragment;
    private TextView followersTextView;
    private TextView followingCountTextView;
    private ProfileUserListFragment followingListFragment;
    private boolean forceRefresh;
    private GetProfileService getProfileService;
    private boolean loadingComplete;
    private boolean loadingErrored;
    private View loadingView;
    private ProductFeedFragment productFeedFragment;
    private ImageView profileArrowView;
    private double profileButtonOffset;
    private View profileContentView;
    private View profileFollowersButton;
    private View profileFollowingButton;
    private View profileHeaderView;
    private BorderedImageView profileImageView;
    private SwipeRefreshLayout profileRefresher;
    private View profileWishesButton;
    private UnfollowService unfollowService;
    private Button unregisteredUserInviteButton;
    private TextView unregisteredUserTextView;
    private View unregisteredUserView;
    private WishUser user;
    private TextView wishesCountTextView;
    private ProfileWishesFragment wishesFragment;

    public ProfileFragment()
    {
    }

    private void followUser()
    {
        while (followService.isPending(user.getUserId()) || unfollowService.isPending(user.getUserId())) 
        {
            return;
        }
        if (LoggedInUser.getInstance().getFollowingManager().isFollowing(user.getUserId()))
        {
            AlertDialog alertdialog = (new android.app.AlertDialog.Builder(getActivity())).create();
            alertdialog.setTitle(getActivity().getString(0x7f060073));
            alertdialog.setMessage(getActivity().getString(0x7f06007c));
            alertdialog.setButton(getActivity().getString(0x7f0602d8), new android.content.DialogInterface.OnClickListener() {

                final ProfileFragment this$0;

                public void onClick(DialogInterface dialoginterface, int i)
                {
                }

            
            {
                this$0 = ProfileFragment.this;
                super();
            }
            });
            alertdialog.setButton2(getActivity().getString(0x7f060488), new android.content.DialogInterface.OnClickListener() {

                final ProfileFragment this$0;

                public void onClick(DialogInterface dialoginterface, int i)
                {
                    trackClick(com.contextlogic.wish.analytics.Analytics.EventType.Unfollow);
                    unfollowService.requestService(user.getUserId(), new com.contextlogic.wish.api.service.UnfollowService.SuccessCallback() {

                        final _cls25 this$1;

                        public void onServiceSucceeded()
                        {
                            refreshFollowButton();
                        }

            
            {
                this$1 = _cls25.this;
                super();
            }
                    }, new com.contextlogic.wish.api.service.ApiService.FailureCallback() {

                        final _cls25 this$1;

                        public void onServiceFailed()
                        {
                            refreshFollowButton();
                        }

            
            {
                this$1 = _cls25.this;
                super();
            }
                    });
                    refreshFollowButton();
                }

            
            {
                this$0 = ProfileFragment.this;
                super();
            }
            });
            alertdialog.show();
            return;
        } else
        {
            trackClick(com.contextlogic.wish.analytics.Analytics.EventType.Follow);
            followService.requestService(user.getUserId(), new com.contextlogic.wish.api.service.FollowService.SuccessCallback() {

                final ProfileFragment this$0;

                public void onServiceSucceeded()
                {
                    refreshFollowButton();
                }

            
            {
                this$0 = ProfileFragment.this;
                super();
            }
            }, new com.contextlogic.wish.api.service.ApiService.FailureCallback() {

                final ProfileFragment this$0;

                public void onServiceFailed()
                {
                    refreshFollowButton();
                }

            
            {
                this$0 = ProfileFragment.this;
                super();
            }
            });
            refreshFollowButton();
            return;
        }
    }

    private void handleFollowersSelected(boolean flag)
    {
        int i = currentSectionIndex;
        currentSectionIndex = com.contextlogic.wish.ui.fragment.profile.userlist.ProfileUserListFragment.SectionMode.Followers.ordinal();
        positionArrow(i, flag);
        FragmentTransaction fragmenttransaction = getChildFragmentManager().beginTransaction();
        if (!followersListFragment.isAdded())
        {
            fragmenttransaction.add(0x7f0d02a9, followersListFragment, null);
        }
        if (wishesFragment != null && wishesFragment.isVisible())
        {
            fragmenttransaction.hide(wishesFragment);
        }
        if (productFeedFragment != null && productFeedFragment.isVisible())
        {
            fragmenttransaction.hide(productFeedFragment);
        }
        if (followingListFragment.isVisible())
        {
            fragmenttransaction.hide(followingListFragment);
        }
        fragmenttransaction.setCustomAnimations(0x7f040006, 0x7f040006);
        fragmenttransaction.show(followersListFragment);
        try
        {
            fragmenttransaction.commitAllowingStateLoss();
        }
        catch (IllegalStateException illegalstateexception) { }
        profileWishesButton.setSelected(false);
        profileFollowingButton.setSelected(false);
        profileFollowersButton.setSelected(true);
    }

    private void handleFollowingSelected(boolean flag)
    {
        int i = currentSectionIndex;
        currentSectionIndex = com.contextlogic.wish.ui.fragment.profile.userlist.ProfileUserListFragment.SectionMode.Following.ordinal();
        positionArrow(i, flag);
        FragmentTransaction fragmenttransaction = getChildFragmentManager().beginTransaction();
        if (!followingListFragment.isAdded())
        {
            fragmenttransaction.add(0x7f0d02a9, followingListFragment, null);
        }
        if (wishesFragment != null && wishesFragment.isVisible())
        {
            fragmenttransaction.hide(wishesFragment);
        }
        if (productFeedFragment != null && productFeedFragment.isVisible())
        {
            fragmenttransaction.hide(productFeedFragment);
        }
        if (followersListFragment.isVisible())
        {
            fragmenttransaction.hide(followersListFragment);
        }
        fragmenttransaction.setCustomAnimations(0x7f040006, 0x7f040006);
        fragmenttransaction.show(followingListFragment);
        try
        {
            fragmenttransaction.commitAllowingStateLoss();
        }
        catch (IllegalStateException illegalstateexception) { }
        profileWishesButton.setSelected(false);
        profileFollowingButton.setSelected(true);
        profileFollowersButton.setSelected(false);
    }

    private void handleLoadingFailure()
    {
        loadingErrored = true;
        PopupAlertDialog.showError(getActivity(), getString(0x7f06030d), getString(0x7f0601ab));
        profileRefresher.setRefreshing(false);
        profileRefresher.setEnabled(false);
        refreshViewState();
    }

    private void handleLoadingSuccess(WishUser wishuser)
    {
        loadingComplete = true;
        user = wishuser;
        profileImageView.getImageView().setImageUrl(user.getProfileImage().getUrlString(com.contextlogic.wish.api.data.WishProfileImage.ImageSize.Large));
        getNavigationBar().setTitle(user.getName());
        followersListFragment.queueVisibleTask(new Runnable() {

            final ProfileFragment this$0;

            public void run()
            {
                followersListFragment.loadingComplete(user);
            }

            
            {
                this$0 = ProfileFragment.this;
                super();
            }
        });
        followingListFragment.queueVisibleTask(new Runnable() {

            final ProfileFragment this$0;

            public void run()
            {
                followingListFragment.loadingComplete(user);
            }

            
            {
                this$0 = ProfileFragment.this;
                super();
            }
        });
        if (wishesFragment != null)
        {
            wishesFragment.queueVisibleTask(new Runnable() {

                final ProfileFragment this$0;

                public void run()
                {
                    wishesFragment.loadingComplete(user);
                }

            
            {
                this$0 = ProfileFragment.this;
                super();
            }
            });
        }
        wishesCountTextView.setText(Integer.toString(user.getWishesCount()));
        followersCountTextView.setText(Integer.toString(user.getFollowersCount()));
        followersTextView.setText(WishApplication.getAppInstance().getQuantityString(0x7f070005, user.getFollowersCount()));
        followingCountTextView.setText(Integer.toString(user.getFollowingCount()));
        if (!wishuser.isLoggedInUser())
        {
            refreshFollowButton();
        }
        profileRefresher.setRefreshing(false);
        profileRefresher.setEnabled(wishuser.isLoggedInUser());
        refreshViewState();
    }

    private void handleProfilePictureClicked()
    {
        RootActivity rootactivity;
        if (user.getUserId().equals(LoggedInUser.getInstance().getCurrentUser().getUserId()))
        {
            if ((rootactivity = (RootActivity)getActivity()) != null)
            {
                rootactivity.startUploadProfilePictureFlow(new ProfileImageUploadCallback() {

                    final ProfileFragment this$0;

                    public void onFailure(boolean flag)
                    {
                        if (!flag)
                        {
                            showNoImageError();
                        }
                    }

                    public void onSuccess(WishUser wishuser)
                    {
                        refresh();
                    }

            
            {
                this$0 = ProfileFragment.this;
                super();
            }
                });
                return;
            }
        }
    }

    private void handleWishesSelected(boolean flag)
    {
        int i = currentSectionIndex;
        currentSectionIndex = -1;
        positionArrow(i, flag);
        FragmentTransaction fragmenttransaction = getChildFragmentManager().beginTransaction();
        if (wishesFragment != null && !wishesFragment.isAdded())
        {
            fragmenttransaction.add(0x7f0d02a9, wishesFragment, null);
        }
        if (productFeedFragment != null && !productFeedFragment.isAdded())
        {
            fragmenttransaction.add(0x7f0d02a9, productFeedFragment, null);
        }
        if (followingListFragment.isVisible())
        {
            fragmenttransaction.hide(followingListFragment);
        }
        if (followersListFragment.isVisible())
        {
            fragmenttransaction.hide(followersListFragment);
        }
        fragmenttransaction.setCustomAnimations(0x7f040006, 0x7f040006);
        if (wishesFragment != null)
        {
            fragmenttransaction.show(wishesFragment);
        } else
        if (productFeedFragment != null)
        {
            fragmenttransaction.show(productFeedFragment);
        }
        try
        {
            fragmenttransaction.commitAllowingStateLoss();
        }
        catch (IllegalStateException illegalstateexception) { }
        profileWishesButton.setSelected(true);
        profileFollowingButton.setSelected(false);
        profileFollowersButton.setSelected(false);
    }

    private void hideAllUiElements()
    {
        profileRefresher.setVisibility(8);
        profileHeaderView.setVisibility(8);
        profileContentView.setVisibility(8);
        errorView.setVisibility(8);
        loadingView.setVisibility(8);
        unregisteredUserView.setVisibility(8);
    }

    private void inviteUser()
    {
        if (getActivity() != null)
        {
            ((RootActivity)getActivity()).showShareDialog(UserStatusManager.getInstance().getInviteSubject(), UserStatusManager.getInstance().getInviteMessage());
        }
    }

    private void loadUser()
    {
        if (loadingComplete) goto _L2; else goto _L1
_L1:
        getProfileService.requestService(user.getUserId(), false, false, new com.contextlogic.wish.api.service.GetProfileService.SuccessCallback() {

            final ProfileFragment this$0;

            public void onServiceSucceeded(WishUser wishuser)
            {
                postDelayed(wishuser. new Runnable() {

                    final _cls13 this$1;
                    final WishUser val$user;

                    public void run()
                    {
                        handleLoadingSuccess(user);
                    }

            
            {
                this$1 = final__pcls13;
                user = WishUser.this;
                super();
            }
                }, getAnimationTimeRemaining());
            }

            
            {
                this$0 = ProfileFragment.this;
                super();
            }
        }, new com.contextlogic.wish.api.service.ApiService.FailureCallback() {

            final ProfileFragment this$0;

            public void onServiceFailed()
            {
                postDelayed(new Runnable() {

                    final _cls14 this$1;

                    public void run()
                    {
                        handleLoadingFailure();
                    }

            
            {
                this$1 = _cls14.this;
                super();
            }
                }, getAnimationTimeRemaining());
            }

            
            {
                this$0 = ProfileFragment.this;
                super();
            }
        });
_L4:
        refreshViewState();
        return;
_L2:
        if (!user.isPreview())
        {
            handleLoadingSuccess(user);
            getProfileService.requestService(user.getUserId(), false, false, new com.contextlogic.wish.api.service.GetProfileService.SuccessCallback() {

                final ProfileFragment this$0;

                public void onServiceSucceeded(WishUser wishuser)
                {
                    postDelayed(wishuser. new Runnable() {

                        final _cls15 this$1;
                        final WishUser val$user;

                        public void run()
                        {
                            handleLoadingSuccess(user);
                        }

            
            {
                this$1 = final__pcls15;
                user = WishUser.this;
                super();
            }
                    }, getAnimationTimeRemaining());
                }

            
            {
                this$0 = ProfileFragment.this;
                super();
            }
            }, null);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void positionArrow(int i, boolean flag)
    {
        if (((android.widget.FrameLayout.LayoutParams)profileArrowView.getLayoutParams()).leftMargin == 0)
        {
            android.widget.FrameLayout.LayoutParams layoutparams = new android.widget.FrameLayout.LayoutParams((int)TypedValue.applyDimension(1, 20F, getResources().getDisplayMetrics()), (int)TypedValue.applyDimension(1, 10F, getResources().getDisplayMetrics()), 80);
            layoutparams.setMargins((int)((double)(int)TypedValue.applyDimension(1, 70F, getResources().getDisplayMetrics()) + (profileButtonOffset - (double)profileArrowView.getWidth()) * (1.5D + (double)i)), 0, 0, 0);
            profileArrowView.setLayoutParams(layoutparams);
        }
        long l;
        if (i != currentSectionIndex)
        {
            Object obj = new TranslateAnimation(0.0F, (int)(profileButtonOffset * (double)(currentSectionIndex - i)), 0.0F, 0.0F);
            if (flag)
            {
                l = 250L;
            } else
            {
                l = 0L;
            }
            ((Animation) (obj)).setDuration(l);
            ((Animation) (obj)).setAnimationListener(new android.view.animation.Animation.AnimationListener() {

                final ProfileFragment this$0;

                public void onAnimationEnd(Animation animation)
                {
                    animation = new TranslateAnimation(0.0F, 0.0F, 0.0F, 0.0F);
                    animation.setDuration(1L);
                    profileArrowView.startAnimation(animation);
                    animation = new android.widget.FrameLayout.LayoutParams((int)TypedValue.applyDimension(1, 20F, getResources().getDisplayMetrics()), (int)TypedValue.applyDimension(1, 10F, getResources().getDisplayMetrics()), 80);
                    animation.setMargins((int)((double)(int)TypedValue.applyDimension(1, 70F, getResources().getDisplayMetrics()) + profileButtonOffset * (1.5D + (double)currentSectionIndex)), 0, 0, 0);
                    profileArrowView.setLayoutParams(animation);
                    profileWishesButton.setEnabled(true);
                    profileFollowersButton.setEnabled(true);
                    profileFollowingButton.setEnabled(true);
                }

                public void onAnimationRepeat(Animation animation)
                {
                }

                public void onAnimationStart(Animation animation)
                {
                    profileWishesButton.setEnabled(false);
                    profileFollowersButton.setEnabled(false);
                    profileFollowingButton.setEnabled(false);
                }

            
            {
                this$0 = ProfileFragment.this;
                super();
            }
            });
            profileArrowView.startAnimation(((Animation) (obj)));
        }
        obj = new AlphaAnimation(0.0F, 1.0F);
        if (flag)
        {
            l = 250L;
        } else
        {
            l = 0L;
        }
        ((Animation) (obj)).setDuration(l);
    }

    private void refresh()
    {
        getProfileService.cancelAllRequests();
        getNavigationBar().clearRightButtons();
        followersListFragment.queueVisibleTask(new Runnable() {

            final ProfileFragment this$0;

            public void run()
            {
                followersListFragment.refresh();
            }

            
            {
                this$0 = ProfileFragment.this;
                super();
            }
        });
        followingListFragment.queueVisibleTask(new Runnable() {

            final ProfileFragment this$0;

            public void run()
            {
                followingListFragment.refresh();
            }

            
            {
                this$0 = ProfileFragment.this;
                super();
            }
        });
        if (wishesFragment != null)
        {
            wishesFragment.queueVisibleTask(new Runnable() {

                final ProfileFragment this$0;

                public void run()
                {
                    wishesFragment.refresh();
                }

            
            {
                this$0 = ProfileFragment.this;
                super();
            }
            });
        }
        if (productFeedFragment != null)
        {
            productFeedFragment.queueVisibleTask(new Runnable() {

                final ProfileFragment this$0;

                public void run()
                {
                    productFeedFragment.refresh();
                }

            
            {
                this$0 = ProfileFragment.this;
                super();
            }
            });
        }
        loadingErrored = false;
        loadingComplete = false;
        loadUser();
    }

    private void refreshFollowButton()
    {
        int i;
        if (LoggedInUser.getInstance().getFollowingManager().isFollowing(user.getUserId()) || followService.isPending(user.getUserId()))
        {
            i = 0x7f0601b1;
        } else
        {
            i = 0x7f0601b0;
        }
        if (i != 0)
        {
            getNavigationBar().clearRightButtons();
            getNavigationBar().setMenuItem(getResources().getString(i), 0, new NavigationBarButtonCallback() {

                final ProfileFragment this$0;

                public void onMenuItemClicked()
                {
                    followUser();
                }

            
            {
                this$0 = ProfileFragment.this;
                super();
            }
            });
        }
    }

    private void refreshFollowCounts()
    {
        if (user != null && wishesCountTextView != null && followersCountTextView != null && followersCountTextView != null)
        {
            wishesCountTextView.setText(Integer.toString(user.getWishesCount()));
            followersCountTextView.setText(Integer.toString(user.getFollowersCount()));
            followersTextView.setText(WishApplication.getAppInstance().getQuantityString(0x7f070005, user.getFollowersCount()));
            followingCountTextView.setText(Integer.toString(user.getFollowingCount()));
        }
    }

    private void refreshViewState()
    {
        int i = 0;
        hideAllUiElements();
        WishUser wishuser;
        if (loadingErrored)
        {
            getNavigationBar().clearRightButtons();
            errorView.setVisibility(0);
        } else
        if (!profileRefresher.isRefreshing() && user != null && !user.isPreview())
        {
            profileRefresher.setVisibility(0);
            profileHeaderView.setVisibility(0);
            profileContentView.setVisibility(0);
            refreshFollowCounts();
        } else
        if (!profileRefresher.isRefreshing() && user != null && user.getUserState() == com.contextlogic.wish.api.data.WishUser.WishUserState.Unregistered)
        {
            unregisteredUserView.setVisibility(0);
            if (user != null && user.getName() != null)
            {
                unregisteredUserTextView.setText(String.format(getString(0x7f060351), new Object[] {
                    user.getName(), user.getName(), WishApplication.getAppInstance().getAppName()
                }));
            } else
            {
                unregisteredUserTextView.setText(getString(0x7f060352, new Object[] {
                    WishApplication.getAppInstance().getAppName()
                }));
            }
        } else
        if (getProfileService.isPending())
        {
            getNavigationBar().clearRightButtons();
            if (profileRefresher.isRefreshing())
            {
                profileRefresher.setVisibility(0);
            } else
            {
                loadingView.setVisibility(0);
            }
        }
        wishuser = LoggedInUser.getInstance().getCurrentUser();
        if (wishuser != null && user.getUserId() != null)
        {
            TextView textview = editOverlay;
            if (!user.getUserId().equals(wishuser.getUserId()))
            {
                i = 8;
            }
            textview.setVisibility(i);
            return;
        } else
        {
            editOverlay.setVisibility(8);
            return;
        }
    }

    private void repositionArrow()
    {
        android.widget.FrameLayout.LayoutParams layoutparams = new android.widget.FrameLayout.LayoutParams((int)TypedValue.applyDimension(1, 20F, getResources().getDisplayMetrics()), (int)TypedValue.applyDimension(1, 10F, getResources().getDisplayMetrics()), 80);
        layoutparams.setMargins((int)((double)(int)TypedValue.applyDimension(1, 70F, getResources().getDisplayMetrics()) + profileButtonOffset * (1.5D + (double)currentSectionIndex)), 0, 0, 0);
        profileArrowView.setLayoutParams(layoutparams);
        profileWishesButton.setEnabled(true);
        profileFollowersButton.setEnabled(true);
        profileFollowingButton.setEnabled(true);
    }

    private void showNoImageError()
    {
        Object obj = (RootActivity)getActivity();
        if (obj != null)
        {
            obj = new android.app.AlertDialog.Builder(((android.content.Context) (obj)));
            ((android.app.AlertDialog.Builder) (obj)).setTitle(getString(0x7f0602df));
            ((android.app.AlertDialog.Builder) (obj)).setMessage(getString(0x7f0602de, new Object[] {
                WishApplication.getAppInstance().getAppName()
            }));
            ((android.app.AlertDialog.Builder) (obj)).setPositiveButton(getString(0x7f060305), new android.content.DialogInterface.OnClickListener() {

                final ProfileFragment this$0;

                public void onClick(DialogInterface dialoginterface, int i)
                {
                }

            
            {
                this$0 = ProfileFragment.this;
                super();
            }
            });
            ((android.app.AlertDialog.Builder) (obj)).show();
        }
    }

    protected com.contextlogic.wish.analytics.Analytics.PageViewType getAnalyticsPageViewType()
    {
        if (user != null && user.isLoggedInUser())
        {
            return com.contextlogic.wish.analytics.Analytics.PageViewType.MyProfile;
        } else
        {
            return com.contextlogic.wish.analytics.Analytics.PageViewType.OtherProfile;
        }
    }

    protected int getLayoutResourceId()
    {
        return 0x7f03008d;
    }

    public MainMenuItem getTopLevelMenuItem()
    {
        if (user != null && user.isLoggedInUser())
        {
            return MainMenuItem.PROFILE;
        } else
        {
            return null;
        }
    }

    protected WishAnalyticsEvent getWishAnalyticsPageViewType()
    {
        if (user != null && user.isLoggedInUser())
        {
            return WishAnalyticsEvent.IMPRESSION_MY_PROFILE;
        } else
        {
            return WishAnalyticsEvent.IMPRESSION_OTHER_PROFILE;
        }
    }

    public void handleOrientationChanged()
    {
        super.handleOrientationChanged();
        int i;
        if (TabletUtil.isTablet(getActivity()))
        {
            i = ((RootActivity)getActivity()).getTabletContentContainerWidth();
        } else
        {
            i = getActivity().getWindowManager().getDefaultDisplay().getWidth();
        }
        profileButtonOffset = ((float)i - TypedValue.applyDimension(1, 90F, getResources().getDisplayMetrics())) / 3F;
        repositionArrow();
    }

    public void handleResume()
    {
        super.handleResume();
        if (currentSectionIndex != -1) goto _L2; else goto _L1
_L1:
        handleWishesSelected(false);
_L4:
        loadUser();
        return;
_L2:
        if (currentSectionIndex == com.contextlogic.wish.ui.fragment.profile.userlist.ProfileUserListFragment.SectionMode.Following.ordinal())
        {
            handleFollowingSelected(false);
        } else
        if (currentSectionIndex == com.contextlogic.wish.ui.fragment.profile.userlist.ProfileUserListFragment.SectionMode.Followers.ordinal())
        {
            handleFollowersSelected(false);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected void initializeUi(View view)
    {
        getNavigationBar().setTitle(getString(0x7f060350));
        if (user != null && user.getName() != null)
        {
            getNavigationBar().setTitle(user.getName());
        }
        profileRefresher = (SwipeRefreshLayout)view.findViewById(0x7f0d02aa);
        profileRefresher.setColorSchemeResources(new int[] {
            0x7f0c00bf
        });
        profileRefresher.setEnabled(false);
        profileRefresher.setOnRefreshListener(new android.support.v4.widget.SwipeRefreshLayout.OnRefreshListener() {

            final ProfileFragment this$0;

            public void onRefresh()
            {
                trackEvent(com.contextlogic.wish.analytics.Analytics.EventType.Refresh, com.contextlogic.wish.analytics.Analytics.LabelType.Scroll);
                refresh();
            }

            
            {
                this$0 = ProfileFragment.this;
                super();
            }
        });
        profileHeaderView = (FrameLayout)view.findViewById(0x7f0d02ab);
        profileContentView = (FrameLayout)view.findViewById(0x7f0d02a9);
        loadingView = view.findViewById(0x7f0d02b7);
        errorView = view.findViewById(0x7f0d02b8);
        unregisteredUserView = view.findViewById(0x7f0d02b9);
        unregisteredUserTextView = (TextView)view.findViewById(0x7f0d02bb);
        unregisteredUserInviteButton = (Button)view.findViewById(0x7f0d02bc);
        unregisteredUserInviteButton.setOnClickListener(new android.view.View.OnClickListener() {

            final ProfileFragment this$0;

            public void onClick(View view1)
            {
                trackClick(com.contextlogic.wish.analytics.Analytics.EventType.AddFriends);
                inviteUser();
            }

            
            {
                this$0 = ProfileFragment.this;
                super();
            }
        });
        editOverlay = (TextView)view.findViewById(0x7f0d02ad);
        profileImageView = (BorderedImageView)view.findViewById(0x7f0d02ac);
        profileImageView.getImageView().setRequestedImageHeight(60);
        profileImageView.getImageView().setRequestedImageWidth(60);
        profileImageView.setOnClickListener(new android.view.View.OnClickListener() {

            final ProfileFragment this$0;

            public void onClick(View view1)
            {
                handleProfilePictureClicked();
            }

            
            {
                this$0 = ProfileFragment.this;
                super();
            }
        });
        int i;
        if (TabletUtil.isTablet(getActivity()))
        {
            i = ((RootActivity)getActivity()).getTabletContentContainerWidth();
        } else
        {
            i = getActivity().getWindowManager().getDefaultDisplay().getWidth();
        }
        profileButtonOffset = ((float)i - TypedValue.applyDimension(1, 90F, getResources().getDisplayMetrics())) / 3F;
        wishesCountTextView = (TextView)view.findViewById(0x7f0d02b0);
        followingCountTextView = (TextView)view.findViewById(0x7f0d02b2);
        followersCountTextView = (TextView)view.findViewById(0x7f0d02b4);
        followersTextView = (TextView)view.findViewById(0x7f0d02b5);
        profileWishesButton = view.findViewById(0x7f0d02af);
        profileWishesButton.setOnClickListener(new android.view.View.OnClickListener() {

            final ProfileFragment this$0;

            public void onClick(View view1)
            {
                trackClick(com.contextlogic.wish.analytics.Analytics.EventType.ProfileWishesSelected);
                handleWishesSelected(true);
            }

            
            {
                this$0 = ProfileFragment.this;
                super();
            }
        });
        profileFollowersButton = view.findViewById(0x7f0d02b3);
        profileFollowersButton.setOnClickListener(new android.view.View.OnClickListener() {

            final ProfileFragment this$0;

            public void onClick(View view1)
            {
                (new LogService()).requestService("1385", null, null, null);
                trackClick(com.contextlogic.wish.analytics.Analytics.EventType.ProfileFollowersSelected);
                handleFollowersSelected(true);
            }

            
            {
                this$0 = ProfileFragment.this;
                super();
            }
        });
        profileFollowingButton = view.findViewById(0x7f0d02b1);
        profileFollowingButton.setOnClickListener(new android.view.View.OnClickListener() {

            final ProfileFragment this$0;

            public void onClick(View view1)
            {
                (new LogService()).requestService("1384", null, null, null);
                trackClick(com.contextlogic.wish.analytics.Analytics.EventType.ProfileFollowingSelected);
                handleFollowingSelected(true);
            }

            
            {
                this$0 = ProfileFragment.this;
                super();
            }
        });
        profileArrowView = (ImageView)view.findViewById(0x7f0d02b6);
        if (loadingComplete && user.getUserState() != com.contextlogic.wish.api.data.WishUser.WishUserState.Unregistered)
        {
            handleLoadingSuccess(user);
        }
        if (!isPageViewTracked())
        {
            (new LogService()).requestService("3", null, null, null);
        }
    }

    public boolean isForceRefresh()
    {
        return forceRefresh;
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        getProfileService = new GetProfileService();
        currentSectionIndex = -1;
        followService = new FollowService();
        unfollowService = new UnfollowService();
        bundle = new Bundle();
        if (((RootActivity)getActivity()).getWishlistExperimentBucket().equals("show"))
        {
            productFeedFragment = new ProductFeedFragment();
            bundle.putInt("ArgDataMode", com.contextlogic.wish.ui.fragment.productfeed.ProductFeedFragment.DataMode.WishlistV2.ordinal());
            productFeedFragment.setArguments(bundle);
        } else
        {
            bundle.putString("ArgSetId", getArguments().getString("ArgSetId"));
            wishesFragment = new ProfileWishesFragment();
            wishesFragment.setArguments(bundle);
        }
        bundle = new Bundle();
        bundle.putInt("ArgSectionMode", com.contextlogic.wish.ui.fragment.profile.userlist.ProfileUserListFragment.SectionMode.Followers.ordinal());
        followersListFragment = new ProfileUserListFragment();
        followersListFragment.setArguments(bundle);
        followingListFragment = new ProfileUserListFragment();
        bundle = new Bundle();
        bundle.putInt("ArgSectionMode", com.contextlogic.wish.ui.fragment.profile.userlist.ProfileUserListFragment.SectionMode.Following.ordinal());
        followingListFragment.setArguments(bundle);
        ApiDataChangeNotificationManager.getInstance().addListener(com.contextlogic.wish.api.core.ApiDataChangeNotificationManager.NotificationType.UserFollowed, this);
        ApiDataChangeNotificationManager.getInstance().addListener(com.contextlogic.wish.api.core.ApiDataChangeNotificationManager.NotificationType.UserUnfollowed, this);
        ApiDataChangeNotificationManager.getInstance().addListener(com.contextlogic.wish.api.core.ApiDataChangeNotificationManager.NotificationType.UserUpdated, this);
        if (loadingComplete && user.getUserState() != com.contextlogic.wish.api.data.WishUser.WishUserState.Unregistered)
        {
            followersListFragment.queueVisibleTask(new Runnable() {

                final ProfileFragment this$0;

                public void run()
                {
                    followersListFragment.loadingComplete(user);
                }

            
            {
                this$0 = ProfileFragment.this;
                super();
            }
            });
            followingListFragment.queueVisibleTask(new Runnable() {

                final ProfileFragment this$0;

                public void run()
                {
                    followingListFragment.loadingComplete(user);
                }

            
            {
                this$0 = ProfileFragment.this;
                super();
            }
            });
            if (wishesFragment != null)
            {
                wishesFragment.queueVisibleTask(new Runnable() {

                    final ProfileFragment this$0;

                    public void run()
                    {
                        wishesFragment.loadingComplete(user);
                    }

            
            {
                this$0 = ProfileFragment.this;
                super();
            }
                });
            }
        }
    }

    public void onDestroy()
    {
        super.onDestroy();
        RuntimeStateStore.getInstance().clearState(dataStateStoreKey);
    }

    public void onNotificationReceived(com.contextlogic.wish.api.core.ApiDataChangeNotificationManager.NotificationType notificationtype, Bundle bundle)
    {
        if (notificationtype == com.contextlogic.wish.api.core.ApiDataChangeNotificationManager.NotificationType.UserFollowed)
        {
            if (user != null && user.isLoggedInUser())
            {
                postDelayed(new Runnable() {

                    final ProfileFragment this$0;

                    public void run()
                    {
                        refreshFollowCounts();
                    }

            
            {
                this$0 = ProfileFragment.this;
                super();
            }
                }, 0L);
            }
            if (user != null && !user.isLoggedInUser())
            {
                refreshFollowButton();
            }
        } else
        if (notificationtype == com.contextlogic.wish.api.core.ApiDataChangeNotificationManager.NotificationType.UserUnfollowed)
        {
            if (user != null && user.isLoggedInUser())
            {
                postDelayed(new Runnable() {

                    final ProfileFragment this$0;

                    public void run()
                    {
                        refreshFollowCounts();
                    }

            
            {
                this$0 = ProfileFragment.this;
                super();
            }
                }, 0L);
            }
            if (user != null && !user.isLoggedInUser())
            {
                refreshFollowButton();
                return;
            }
        }
    }

    public void onPause()
    {
        super.onPause();
        getProfileService.cancelAllRequests();
        followService.cancelAllRequests();
        unfollowService.cancelAllRequests();
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        if (loadingComplete)
        {
            dataStateStoreKey = RuntimeStateStore.getInstance().storeState(user, dataStateStoreKey);
            bundle.putString("StoredStateData", dataStateStoreKey);
        }
    }

    public void releaseImages()
    {
        super.releaseImages();
        if (wishesFragment != null && wishesFragment.isAdded() && wishesFragment.isVisible())
        {
            wishesFragment.conditionallyReleaseImages();
        }
        if (productFeedFragment != null && productFeedFragment.isAdded() && productFeedFragment.isVisible())
        {
            productFeedFragment.conditionallyReleaseImages();
        }
        if (followingListFragment != null && followingListFragment.isAdded() && followingListFragment.isVisible())
        {
            followingListFragment.conditionallyReleaseImages();
        }
        if (followersListFragment != null && followersListFragment.isAdded() && followersListFragment.isVisible())
        {
            followersListFragment.conditionallyReleaseImages();
        }
    }

    public void restoreImages()
    {
        super.restoreImages();
        if (wishesFragment != null && wishesFragment.isAdded() && wishesFragment.isVisible())
        {
            wishesFragment.conditionallyRestoreImages();
        }
        if (productFeedFragment != null && productFeedFragment.isAdded() && productFeedFragment.isVisible())
        {
            productFeedFragment.conditionallyRestoreImages();
        }
        if (followingListFragment != null && followingListFragment.isAdded() && followingListFragment.isVisible())
        {
            followingListFragment.conditionallyRestoreImages();
        }
        if (followersListFragment != null && followersListFragment.isAdded() && followersListFragment.isVisible())
        {
            followersListFragment.conditionallyRestoreImages();
        }
    }

    protected void restoreState(Bundle bundle)
    {
label0:
        {
            super.restoreState(bundle);
            if (bundle != null && bundle.containsKey("StoredStateData"))
            {
                dataStateStoreKey = bundle.getString("StoredStateData");
                user = (WishUser)RuntimeStateStore.getInstance().getState(dataStateStoreKey);
                boolean flag;
                if (user != null)
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
                bundle = getArguments().getString("ArgUser");
                user = (WishUser)RuntimeStateStore.getInstance().getState(bundle);
                if (user != null)
                {
                    break label0;
                }
                user = new WishUser("User", "-1");
                user.setUserState(com.contextlogic.wish.api.data.WishUser.WishUserState.Unregistered);
                loadingComplete = true;
            }
            return;
        }
        if (user.getUserId() != null)
        {
            bundle = TransientCache.getInstance().getCachedUser(user.getUserId());
        } else
        {
            bundle = null;
        }
        if (user.isPreview() && user.getUserState() != com.contextlogic.wish.api.data.WishUser.WishUserState.Unregistered && bundle != null && !bundle.isPreview() && !forceRefresh)
        {
            user = bundle;
            loadingComplete = true;
            return;
        }
        if (user.isPreview() && user.getUserState() != com.contextlogic.wish.api.data.WishUser.WishUserState.Unregistered)
        {
            loadingComplete = false;
            return;
        } else
        {
            loadingComplete = true;
            return;
        }
    }

    public void setForceRefresh(boolean flag)
    {
        forceRefresh = flag;
    }

    public boolean useCanvasBackground()
    {
        return true;
    }
























}
