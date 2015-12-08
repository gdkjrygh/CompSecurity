// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.notifications;


// Referenced classes of package com.contextlogic.wish.ui.fragment.notifications:
//            NotificationsFragment

class this._cls0
    implements com.contextlogic.wish.api.service.ck
{

    final NotificationsFragment this$0;

    public void onServiceFailed()
    {
        postDelayed(new Runnable() {

            final NotificationsFragment._cls7 this$1;

            public void run()
            {
                NotificationsFragment.access$500(this$0);
            }

            
            {
                this$1 = NotificationsFragment._cls7.this;
                super();
            }
        }, getAnimationTimeRemaining());
    }

    _cls1.this._cls1()
    {
        this$0 = NotificationsFragment.this;
        super();
    }
}
