// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.notifications;

import com.contextlogic.wish.user.UserStatusManager;
import java.util.ArrayList;

// Referenced classes of package com.contextlogic.wish.ui.fragment.notifications:
//            NotificationsFragment

class this._cls0
    implements com.contextlogic.wish.api.service.SuccessCallback
{

    final NotificationsFragment this$0;

    public void onServiceSucceeded(final ArrayList items, final int bucketCount)
    {
        NotificationsFragment.access$302(NotificationsFragment.this, true);
        postDelayed(new Runnable() {

            final NotificationsFragment._cls6 this$1;
            final int val$bucketCount;
            final ArrayList val$items;

            public void run()
            {
                NotificationsFragment.access$400(this$0, items, bucketCount);
            }

            
            {
                this$1 = NotificationsFragment._cls6.this;
                items = arraylist;
                bucketCount = i;
                super();
            }
        }, getAnimationTimeRemaining());
        UserStatusManager.getInstance().refreshStatus();
    }

    _cls1.val.bucketCount()
    {
        this$0 = NotificationsFragment.this;
        super();
    }
}
