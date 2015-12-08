// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.notifications;

import com.contextlogic.wish.user.UserStatusManager;
import java.util.ArrayList;

// Referenced classes of package com.contextlogic.wish.ui.fragment.notifications:
//            NotificationsFragment

class val.bucketCount
    implements Runnable
{

    final val.bucketCount this$1;
    final int val$bucketCount;
    final ArrayList val$items;

    public void run()
    {
        NotificationsFragment.access$400(_fld0, val$items, val$bucketCount);
    }

    is._cls0()
    {
        this$1 = final__pcls0;
        val$items = arraylist;
        val$bucketCount = I.this;
        super();
    }

    // Unreferenced inner class com/contextlogic/wish/ui/fragment/notifications/NotificationsFragment$6

/* anonymous class */
    class NotificationsFragment._cls6
        implements com.contextlogic.wish.api.service.GetNotificationsService.SuccessCallback
    {

        final NotificationsFragment this$0;

        public void onServiceSucceeded(final ArrayList items, int i)
        {
            NotificationsFragment.access$302(NotificationsFragment.this, true);
            postDelayed(i. new NotificationsFragment._cls6._cls1(), getAnimationTimeRemaining());
            UserStatusManager.getInstance().refreshStatus();
        }

            
            {
                this$0 = NotificationsFragment.this;
                super();
            }
    }

}
