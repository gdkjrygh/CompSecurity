// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.notifications;


// Referenced classes of package com.contextlogic.wish.ui.fragment.notifications:
//            NotificationsAdapter

class this._cls0
    implements com.contextlogic.wish.api.service.ack
{

    final NotificationsAdapter this$0;

    public void onServiceFailed()
    {
        refreshFollowButtonStates();
    }

    ()
    {
        this$0 = NotificationsAdapter.this;
        super();
    }
}
