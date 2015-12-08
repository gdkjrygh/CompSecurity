// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.notifications;


// Referenced classes of package com.contextlogic.wish.ui.fragment.notifications:
//            NotificationsFragment

class this._cls1
    implements Runnable
{

    final is._cls0 this$1;

    public void run()
    {
        NotificationsFragment.access$500(_fld0);
    }

    is._cls0()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class com/contextlogic/wish/ui/fragment/notifications/NotificationsFragment$7

/* anonymous class */
    class NotificationsFragment._cls7
        implements com.contextlogic.wish.api.service.ApiService.FailureCallback
    {

        final NotificationsFragment this$0;

        public void onServiceFailed()
        {
            postDelayed(new NotificationsFragment._cls7._cls1(), getAnimationTimeRemaining());
        }

            
            {
                this$0 = NotificationsFragment.this;
                super();
            }
    }

}
