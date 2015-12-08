// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.notifications;

import android.content.DialogInterface;
import com.contextlogic.wish.api.data.WishUser;
import com.contextlogic.wish.api.service.UnfollowService;

// Referenced classes of package com.contextlogic.wish.ui.fragment.notifications:
//            NotificationsAdapter, NotificationsFragment

class this._cls1
    implements com.contextlogic.wish.api.service.llback
{

    final eshFollowButtonStates this$1;

    public void onServiceSucceeded()
    {
        refreshFollowButtonStates();
    }

    l.user()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class com/contextlogic/wish/ui/fragment/notifications/NotificationsAdapter$4

/* anonymous class */
    class NotificationsAdapter._cls4
        implements android.content.DialogInterface.OnClickListener
    {

        final NotificationsAdapter this$0;
        final WishUser val$user;

        public void onClick(DialogInterface dialoginterface, int i)
        {
            NotificationsAdapter.access$200(NotificationsAdapter.this).trackClick(com.contextlogic.wish.analytics.Analytics.EventType.Unfollow);
            NotificationsAdapter.access$200(NotificationsAdapter.this).unfollowService.requestService(user.getUserId(), new NotificationsAdapter._cls4._cls1(), new NotificationsAdapter._cls4._cls2());
            refreshFollowButtonStates();
        }

            
            {
                this$0 = final_notificationsadapter;
                user = WishUser.this;
                super();
            }

        // Unreferenced inner class com/contextlogic/wish/ui/fragment/notifications/NotificationsAdapter$4$2

/* anonymous class */
        class NotificationsAdapter._cls4._cls2
            implements com.contextlogic.wish.api.service.ApiService.FailureCallback
        {

            final NotificationsAdapter._cls4 this$1;

            public void onServiceFailed()
            {
                refreshFollowButtonStates();
            }

                    
                    {
                        this$1 = NotificationsAdapter._cls4.this;
                        super();
                    }
        }

    }

}
