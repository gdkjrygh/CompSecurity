// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.profile.userlist;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.contextlogic.wish.api.data.WishNotification;
import com.contextlogic.wish.api.data.WishProfileImage;
import com.contextlogic.wish.api.data.WishUser;
import com.contextlogic.wish.api.service.FollowService;
import com.contextlogic.wish.api.service.UnfollowService;
import com.contextlogic.wish.cache.ImageCacheWarmer;
import com.contextlogic.wish.ui.components.image.BorderedImageView;
import com.contextlogic.wish.ui.components.image.CachedImageView;
import com.contextlogic.wish.user.LoggedInUser;
import com.contextlogic.wish.user.UserFollowingManager;
import java.util.ArrayList;

// Referenced classes of package com.contextlogic.wish.ui.fragment.profile.userlist:
//            ProfileUserListFragment, ProfileUserListFollowButton

public class ProfileUserListAdapter extends ArrayAdapter
{
    public static interface ActionButtonListener
    {

        public abstract void onActionButtonClicked(WishNotification wishnotification);
    }

    static class ItemRowHolder
    {

        int firstVisiblePosition;
        ProfileUserListFollowButton followButton;
        BorderedImageView imageView;
        int position;
        TextView rowText;
        WishUser user;

        ItemRowHolder()
        {
        }
    }


    private ImageCacheWarmer cacheWarmer;
    private ListView listView;
    private ProfileUserListFragment profileFragment;

    public ProfileUserListAdapter(Context context, ArrayList arraylist, ListView listview, ProfileUserListFragment profileuserlistfragment)
    {
        super(context, 0x7f030091, arraylist);
        listView = listview;
        cacheWarmer = new ImageCacheWarmer();
        profileFragment = profileuserlistfragment;
    }

    private void handleFollowButtonClick(int i, final ProfileUserListFollowButton user)
    {
        for (user = (WishUser)getItem(i); profileFragment.followService.isPending(user.getUserId()) || profileFragment.unfollowService.isPending(user.getUserId());)
        {
            return;
        }

        if (LoggedInUser.getInstance().getFollowingManager().isFollowing(user.getUserId()))
        {
            AlertDialog alertdialog = (new android.app.AlertDialog.Builder(getContext())).create();
            alertdialog.setTitle(getContext().getString(0x7f060073));
            alertdialog.setMessage(getContext().getString(0x7f06007c));
            alertdialog.setButton(getContext().getString(0x7f0602d8), new android.content.DialogInterface.OnClickListener() {

                final ProfileUserListAdapter this$0;

                public void onClick(DialogInterface dialoginterface, int j)
                {
                }

            
            {
                this$0 = ProfileUserListAdapter.this;
                super();
            }
            });
            alertdialog.setButton2(getContext().getString(0x7f060488), new android.content.DialogInterface.OnClickListener() {

                final ProfileUserListAdapter this$0;
                final WishUser val$user;

                public void onClick(DialogInterface dialoginterface, int j)
                {
                    profileFragment.trackClick(com.contextlogic.wish.analytics.Analytics.EventType.Unfollow);
                    profileFragment.unfollowService.requestService(user.getUserId(), new com.contextlogic.wish.api.service.UnfollowService.SuccessCallback() {

                        final _cls4 this$1;

                        public void onServiceSucceeded()
                        {
                            refreshFollowButtonStates();
                        }

            
            {
                this$1 = _cls4.this;
                super();
            }
                    }, new com.contextlogic.wish.api.service.ApiService.FailureCallback() {

                        final _cls4 this$1;

                        public void onServiceFailed()
                        {
                            refreshFollowButtonStates();
                        }

            
            {
                this$1 = _cls4.this;
                super();
            }
                    });
                    refreshFollowButtonStates();
                }

            
            {
                this$0 = ProfileUserListAdapter.this;
                user = wishuser;
                super();
            }
            });
            alertdialog.show();
            return;
        } else
        {
            profileFragment.trackClick(com.contextlogic.wish.analytics.Analytics.EventType.Follow);
            profileFragment.followService.requestService(user.getUserId(), new com.contextlogic.wish.api.service.FollowService.SuccessCallback() {

                final ProfileUserListAdapter this$0;

                public void onServiceSucceeded()
                {
                    refreshFollowButtonStates();
                }

            
            {
                this$0 = ProfileUserListAdapter.this;
                super();
            }
            }, new com.contextlogic.wish.api.service.ApiService.FailureCallback() {

                final ProfileUserListAdapter this$0;

                public void onServiceFailed()
                {
                    refreshFollowButtonStates();
                }

            
            {
                this$0 = ProfileUserListAdapter.this;
                super();
            }
            });
            refreshFollowButtonStates();
            return;
        }
    }

    private void handleItemClick(int i)
    {
        WishUser wishuser = (WishUser)getItem(i);
        profileFragment.handleProfileUserClick(wishuser);
    }

    private void refreshFollowButtonState(ItemRowHolder itemrowholder)
    {
        if (itemrowholder.user.isLoggedInUser())
        {
            itemrowholder.followButton.setVisibility(8);
            return;
        }
        itemrowholder.followButton.setVisibility(0);
        if (profileFragment.followService.isPending(itemrowholder.user.getUserId()))
        {
            itemrowholder.followButton.setButtonMode(ProfileUserListFollowButton.ButtonMode.FollowLoading);
            return;
        }
        if (profileFragment.unfollowService.isPending(itemrowholder.user.getUserId()))
        {
            itemrowholder.followButton.setButtonMode(ProfileUserListFollowButton.ButtonMode.FollowingLoading);
            return;
        }
        if (LoggedInUser.getInstance().getFollowingManager().isFollowing(itemrowholder.user.getUserId()))
        {
            itemrowholder.followButton.setButtonMode(ProfileUserListFollowButton.ButtonMode.Following);
            return;
        } else
        {
            itemrowholder.followButton.setButtonMode(ProfileUserListFollowButton.ButtonMode.Follow);
            return;
        }
    }

    public View getView(final int buttonPosition, View view, ViewGroup viewgroup)
    {
        WishUser wishuser;
        final ProfileUserListFollowButton followButton;
        if (view == null)
        {
            view = ((Activity)getContext()).getLayoutInflater().inflate(0x7f030091, viewgroup, false);
            viewgroup = new ItemRowHolder();
            viewgroup.imageView = (BorderedImageView)view.findViewById(0x7f0d02c7);
            viewgroup.followButton = (ProfileUserListFollowButton)view.findViewById(0x7f0d02c9);
            viewgroup.rowText = (TextView)view.findViewById(0x7f0d02c8);
            ((ItemRowHolder) (viewgroup)).imageView.getImageView().setRequestedImageWidth(60);
            ((ItemRowHolder) (viewgroup)).imageView.getImageView().setRequestedImageHeight(60);
            view.setTag(viewgroup);
        } else
        {
            viewgroup = (ItemRowHolder)view.getTag();
        }
        if (((ItemRowHolder) (viewgroup)).user != null && listView.getFirstVisiblePosition() >= ((ItemRowHolder) (viewgroup)).firstVisiblePosition && listView.getFirstVisiblePosition() <= ((ItemRowHolder) (viewgroup)).position)
        {
            ((ItemRowHolder) (viewgroup)).imageView.getImageView().lockImageInCache();
        }
        wishuser = (WishUser)getItem(buttonPosition);
        viewgroup.user = wishuser;
        viewgroup.position = buttonPosition;
        viewgroup.firstVisiblePosition = listView.getFirstVisiblePosition();
        followButton = ((ItemRowHolder) (viewgroup)).followButton;
        ((ItemRowHolder) (viewgroup)).followButton.setOnClickListener(new android.view.View.OnClickListener() {

            final ProfileUserListAdapter this$0;
            final int val$buttonPosition;
            final ProfileUserListFollowButton val$followButton;

            public void onClick(View view1)
            {
                handleFollowButtonClick(buttonPosition, followButton);
            }

            
            {
                this$0 = ProfileUserListAdapter.this;
                buttonPosition = i;
                followButton = profileuserlistfollowbutton;
                super();
            }
        });
        view.setOnClickListener(new android.view.View.OnClickListener() {

            final ProfileUserListAdapter this$0;
            final int val$buttonPosition;

            public void onClick(View view1)
            {
                handleItemClick(buttonPosition);
            }

            
            {
                this$0 = ProfileUserListAdapter.this;
                buttonPosition = i;
                super();
            }
        });
        if (!((ItemRowHolder) (viewgroup)).imageView.getImageView().isImageLoaded() && ((ItemRowHolder) (viewgroup)).imageView.getImageView().getImageUrl() != null && cacheWarmer != null)
        {
            cacheWarmer.warmCache(((ItemRowHolder) (viewgroup)).imageView.getImageView().getImageUrl(), 60, 60);
        }
        ((ItemRowHolder) (viewgroup)).imageView.getImageView().setImageUrl(wishuser.getProfileImage().getUrlString(com.contextlogic.wish.api.data.WishProfileImage.ImageSize.Medium));
        ((ItemRowHolder) (viewgroup)).rowText.setText(wishuser.getName());
        ((ItemRowHolder) (viewgroup)).followButton.setVisibility(0);
        refreshFollowButtonState(viewgroup);
        if (cacheWarmer != null && listView.getLastVisiblePosition() >= 0)
        {
            buttonPosition = Math.min(Math.max(buttonPosition, listView.getLastVisiblePosition()) + 1, getCount());
            for (int i = Math.min(buttonPosition + 7, getCount()); buttonPosition < i; buttonPosition++)
            {
                viewgroup = (WishUser)getItem(buttonPosition);
                cacheWarmer.warmCache(viewgroup.getProfileImage().getUrlString(com.contextlogic.wish.api.data.WishProfileImage.ImageSize.Medium), 60, 60);
            }

        }
        return view;
    }

    public void pauseCacheWarming()
    {
        cacheWarmer.pause();
    }

    public void refreshFollowButtonStates()
    {
        if (listView != null)
        {
            for (int i = 0; i < listView.getChildCount(); i++)
            {
                Object obj = listView.getChildAt(i).getTag();
                if (obj != null && (obj instanceof ItemRowHolder))
                {
                    refreshFollowButtonState((ItemRowHolder)obj);
                }
            }

        }
    }

    public void releaseImages()
    {
        if (listView != null)
        {
            for (int i = 0; i < listView.getChildCount(); i++)
            {
                Object obj = listView.getChildAt(i).getTag();
                if (obj != null && (obj instanceof ItemRowHolder))
                {
                    ((ItemRowHolder)obj).imageView.getImageView().releaseImage();
                }
            }

        }
    }

    public void restoreImages()
    {
        if (listView != null)
        {
            for (int i = 0; i < listView.getChildCount(); i++)
            {
                Object obj = listView.getChildAt(i).getTag();
                if (obj != null && (obj instanceof ItemRowHolder))
                {
                    ((ItemRowHolder)obj).imageView.getImageView().restoreImage();
                }
            }

        }
    }

    public void resumeCacheWarming()
    {
        cacheWarmer.resume();
    }



}
