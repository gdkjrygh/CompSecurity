// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.notifications;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import com.contextlogic.wish.api.data.WishImage;
import com.contextlogic.wish.api.data.WishNotification;
import com.contextlogic.wish.api.data.WishUser;
import com.contextlogic.wish.api.service.FollowService;
import com.contextlogic.wish.api.service.UnfollowService;
import com.contextlogic.wish.api.service.ViewNotificationService;
import com.contextlogic.wish.cache.ImageCacheWarmer;
import com.contextlogic.wish.ui.components.image.BorderedImageView;
import com.contextlogic.wish.ui.components.image.CachedImageView;
import com.contextlogic.wish.ui.fragment.profile.userlist.ProfileUserListFollowButton;
import com.contextlogic.wish.user.LoggedInUser;
import com.contextlogic.wish.user.UserFollowingManager;
import com.contextlogic.wish.user.UserStatusManager;
import com.contextlogic.wish.util.DateUtil;
import java.util.ArrayList;

// Referenced classes of package com.contextlogic.wish.ui.fragment.notifications:
//            NotificationsFragment

public class NotificationsAdapter extends ArrayAdapter
{
    public static interface ActionButtonListener
    {

        public abstract void onActionButtonClicked(WishNotification wishnotification);
    }

    static class ItemRowHolder
    {

        View actionButton;
        TextView actionButtonText;
        int firstVisiblePosition;
        ProfileUserListFollowButton followButton;
        LinearLayout highlightView;
        BorderedImageView imageView;
        WishNotification notification;
        int position;
        TextView rowText;
        TextView rowTimestamp;

        ItemRowHolder()
        {
        }
    }


    private ImageCacheWarmer cacheWarmer;
    private ListView listView;
    private NotificationsFragment notificationFragment;

    public NotificationsAdapter(Context context, ArrayList arraylist, ListView listview, NotificationsFragment notificationsfragment)
    {
        super(context, 0x7f030075, arraylist);
        listView = listview;
        cacheWarmer = new ImageCacheWarmer();
        notificationFragment = notificationsfragment;
    }

    private void handleActionButtonClick(WishNotification wishnotification)
    {
        if (notificationFragment != null)
        {
            notificationFragment.handleNotificationClick(wishnotification);
        }
    }

    private void handleFollowButtonClick(int i, final ProfileUserListFollowButton user)
    {
        user = (WishNotification)getItem(i);
        if (user.getType() == com.contextlogic.wish.api.data.WishNotification.NotificationType.BeingFollowed && (user.getTarget() instanceof WishUser))
        {
            if (!notificationFragment.followService.isPending((user = (WishUser)user.getTarget()).getUserId()) && !notificationFragment.unfollowService.isPending(user.getUserId()))
            {
                if (LoggedInUser.getInstance().getFollowingManager().isFollowing(user.getUserId()))
                {
                    AlertDialog alertdialog = (new android.app.AlertDialog.Builder(getContext())).create();
                    alertdialog.setTitle(getContext().getString(0x7f060073));
                    alertdialog.setMessage(getContext().getString(0x7f06007c));
                    alertdialog.setButton(getContext().getString(0x7f0602d8), new android.content.DialogInterface.OnClickListener() {

                        final NotificationsAdapter this$0;

                        public void onClick(DialogInterface dialoginterface, int j)
                        {
                        }

            
            {
                this$0 = NotificationsAdapter.this;
                super();
            }
                    });
                    alertdialog.setButton2(getContext().getString(0x7f060488), new android.content.DialogInterface.OnClickListener() {

                        final NotificationsAdapter this$0;
                        final WishUser val$user;

                        public void onClick(DialogInterface dialoginterface, int j)
                        {
                            notificationFragment.trackClick(com.contextlogic.wish.analytics.Analytics.EventType.Unfollow);
                            notificationFragment.unfollowService.requestService(user.getUserId(), new com.contextlogic.wish.api.service.UnfollowService.SuccessCallback() {

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
                this$0 = NotificationsAdapter.this;
                user = wishuser;
                super();
            }
                    });
                    alertdialog.show();
                    return;
                } else
                {
                    notificationFragment.trackClick(com.contextlogic.wish.analytics.Analytics.EventType.Follow);
                    notificationFragment.followService.requestService(user.getUserId(), new com.contextlogic.wish.api.service.FollowService.SuccessCallback() {

                        final NotificationsAdapter this$0;

                        public void onServiceSucceeded()
                        {
                            refreshFollowButtonStates();
                        }

            
            {
                this$0 = NotificationsAdapter.this;
                super();
            }
                    }, new com.contextlogic.wish.api.service.ApiService.FailureCallback() {

                        final NotificationsAdapter this$0;

                        public void onServiceFailed()
                        {
                            refreshFollowButtonStates();
                        }

            
            {
                this$0 = NotificationsAdapter.this;
                super();
            }
                    });
                    refreshFollowButtonStates();
                    return;
                }
            }
        }
    }

    private void refreshFollowButtonState(ItemRowHolder itemrowholder)
    {
        if (itemrowholder.notification.getType() != com.contextlogic.wish.api.data.WishNotification.NotificationType.BeingFollowed)
        {
            itemrowholder.followButton.setVisibility(8);
        } else
        {
            itemrowholder.followButton.setVisibility(0);
            if (itemrowholder.notification.getTarget() instanceof WishUser)
            {
                WishUser wishuser = (WishUser)itemrowholder.notification.getTarget();
                if (notificationFragment.followService.isPending(wishuser.getUserId()))
                {
                    itemrowholder.followButton.setButtonMode(com.contextlogic.wish.ui.fragment.profile.userlist.ProfileUserListFollowButton.ButtonMode.FollowLoading);
                    return;
                }
                if (notificationFragment.unfollowService.isPending(wishuser.getUserId()))
                {
                    itemrowholder.followButton.setButtonMode(com.contextlogic.wish.ui.fragment.profile.userlist.ProfileUserListFollowButton.ButtonMode.FollowingLoading);
                    return;
                }
                if (LoggedInUser.getInstance().getFollowingManager().isFollowing(wishuser.getUserId()))
                {
                    itemrowholder.followButton.setButtonMode(com.contextlogic.wish.ui.fragment.profile.userlist.ProfileUserListFollowButton.ButtonMode.Following);
                    return;
                } else
                {
                    itemrowholder.followButton.setButtonMode(com.contextlogic.wish.ui.fragment.profile.userlist.ProfileUserListFollowButton.ButtonMode.Follow);
                    return;
                }
            }
        }
    }

    public View getView(final int buttonPosition, View view, ViewGroup viewgroup)
    {
        final WishNotification notification;
        Object obj;
        if (view == null)
        {
            view = ((Activity)getContext()).getLayoutInflater().inflate(0x7f030075, viewgroup, false);
            viewgroup = new ItemRowHolder();
            viewgroup.imageView = (BorderedImageView)view.findViewById(0x7f0d023e);
            viewgroup.actionButton = view.findViewById(0x7f0d0241);
            viewgroup.actionButtonText = (TextView)view.findViewById(0x7f0d0242);
            viewgroup.rowTimestamp = (TextView)view.findViewById(0x7f0d023f);
            viewgroup.rowText = (TextView)view.findViewById(0x7f0d0240);
            viewgroup.highlightView = (LinearLayout)view.findViewById(0x7f0d023d);
            viewgroup.followButton = (ProfileUserListFollowButton)view.findViewById(0x7f0d0243);
            ((ItemRowHolder) (viewgroup)).imageView.getImageView().setRequestedImageWidth(60);
            ((ItemRowHolder) (viewgroup)).imageView.getImageView().setRequestedImageHeight(60);
            view.setTag(viewgroup);
        } else
        {
            viewgroup = (ItemRowHolder)view.getTag();
        }
        if (((ItemRowHolder) (viewgroup)).notification != null && listView.getFirstVisiblePosition() >= ((ItemRowHolder) (viewgroup)).firstVisiblePosition && listView.getFirstVisiblePosition() <= ((ItemRowHolder) (viewgroup)).position)
        {
            ((ItemRowHolder) (viewgroup)).imageView.getImageView().lockImageInCache();
        }
        notification = (WishNotification)getItem(buttonPosition);
        viewgroup.notification = notification;
        viewgroup.position = buttonPosition;
        viewgroup.firstVisiblePosition = listView.getFirstVisiblePosition();
        ((ItemRowHolder) (viewgroup)).actionButton.setOnClickListener(new android.view.View.OnClickListener() {

            final NotificationsAdapter this$0;
            final WishNotification val$notification;

            public void onClick(View view1)
            {
                handleActionButtonClick(notification);
            }

            
            {
                this$0 = NotificationsAdapter.this;
                notification = wishnotification;
                super();
            }
        });
        if (!((ItemRowHolder) (viewgroup)).imageView.getImageView().isImageLoaded() && ((ItemRowHolder) (viewgroup)).imageView.getImageView().getImageUrl() != null && cacheWarmer != null)
        {
            cacheWarmer.warmCache(((ItemRowHolder) (viewgroup)).imageView.getImageView().getImageUrl(), 60, 60);
        }
        obj = notification.getImage();
        ((ItemRowHolder) (viewgroup)).imageView.getImageView().setImageUrl(null);
        ((ItemRowHolder) (viewgroup)).imageView.getImageView().setImageDrawable(null);
        if (obj != null)
        {
            obj = ((WishImage) (obj)).getUrlString(com.contextlogic.wish.api.data.WishImage.ImageSize.Medium);
            if (cacheWarmer != null)
            {
                cacheWarmer.cancel(((String) (obj)));
            }
            ((ItemRowHolder) (viewgroup)).imageView.getImageView().setImageUrl(((String) (obj)));
        } else
        {
            ((ItemRowHolder) (viewgroup)).imageView.getImageView().setImageResource(0x7f02019f);
        }
        ((ItemRowHolder) (viewgroup)).rowTimestamp.setText(DateUtil.getFuzzyDateFromNow(notification.getTimestamp()));
        ((ItemRowHolder) (viewgroup)).rowText.setText(notification.getMessage());
        if (notification.getActionButtonText() != null)
        {
            ((ItemRowHolder) (viewgroup)).actionButton.setVisibility(0);
            ((ItemRowHolder) (viewgroup)).actionButtonText.setText(notification.getActionButtonText());
        } else
        {
            ((ItemRowHolder) (viewgroup)).actionButton.setVisibility(8);
        }
        ((ItemRowHolder) (viewgroup)).highlightView.clearAnimation();
        if (!notification.isNew() || notification.isClicked())
        {
            ((ItemRowHolder) (viewgroup)).highlightView.setVisibility(8);
        } else
        {
            ((ItemRowHolder) (viewgroup)).highlightView.setVisibility(0);
            notification.markViewed();
            (new ViewNotificationService()).requestService(notification.getNotificationNumber(), notification.getBucketNumber(), null, null);
            UserStatusManager.getInstance().decrementUnviewedNotifications();
        }
        if (notification.getType() != com.contextlogic.wish.api.data.WishNotification.NotificationType.BeingFollowed)
        {
            ((ItemRowHolder) (viewgroup)).followButton.setVisibility(8);
        } else
        {
            ((ItemRowHolder) (viewgroup)).followButton.setVisibility(0);
            final ProfileUserListFollowButton followButton = ((ItemRowHolder) (viewgroup)).followButton;
            ((ItemRowHolder) (viewgroup)).followButton.setOnClickListener(new android.view.View.OnClickListener() {

                final NotificationsAdapter this$0;
                final int val$buttonPosition;
                final ProfileUserListFollowButton val$followButton;

                public void onClick(View view1)
                {
                    handleFollowButtonClick(buttonPosition, followButton);
                }

            
            {
                this$0 = NotificationsAdapter.this;
                buttonPosition = i;
                followButton = profileuserlistfollowbutton;
                super();
            }
            });
            refreshFollowButtonState(viewgroup);
        }
        if (cacheWarmer != null && listView.getLastVisiblePosition() >= 0)
        {
            buttonPosition = Math.min(Math.max(buttonPosition, listView.getLastVisiblePosition()) + 1, getCount());
            for (int i = Math.min(buttonPosition + 7, getCount()); buttonPosition < i; buttonPosition++)
            {
                viewgroup = (WishNotification)getItem(buttonPosition);
                if (viewgroup.getImage() != null)
                {
                    cacheWarmer.warmCache(viewgroup.getImage().getUrlString(com.contextlogic.wish.api.data.WishImage.ImageSize.Medium), 60, 60);
                }
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

    public void refreshNewState()
    {
        if (listView != null)
        {
            int i = 0;
            while (i < listView.getChildCount()) 
            {
                Object obj = listView.getChildAt(i).getTag();
                if (obj != null && (obj instanceof ItemRowHolder))
                {
                    obj = (ItemRowHolder)obj;
                    if (!((ItemRowHolder) (obj)).notification.isNew() || ((ItemRowHolder) (obj)).notification.isClicked())
                    {
                        ((ItemRowHolder) (obj)).highlightView.setVisibility(8);
                    } else
                    {
                        ((ItemRowHolder) (obj)).highlightView.setVisibility(0);
                    }
                }
                i++;
            }
        }
    }

    public void refreshTimestamps()
    {
        if (listView != null)
        {
            for (int i = 0; i < listView.getChildCount(); i++)
            {
                Object obj = listView.getChildAt(i).getTag();
                if (obj != null && (obj instanceof ItemRowHolder))
                {
                    obj = (ItemRowHolder)obj;
                    ((ItemRowHolder) (obj)).rowTimestamp.setText(DateUtil.getFuzzyDateFromNow(((ItemRowHolder) (obj)).notification.getTimestamp()));
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
