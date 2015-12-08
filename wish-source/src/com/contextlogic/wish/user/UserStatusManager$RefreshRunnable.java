// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.user;

import com.contextlogic.wish.WishApplication;

// Referenced classes of package com.contextlogic.wish.user:
//            UserStatusManager, LoggedInUser

class this._cls0
    implements Runnable
{

    final UserStatusManager this$0;

    private void requestComplete()
    {
        UserStatusManager.access$002(UserStatusManager.this, false);
        UserStatusManager.access$100(UserStatusManager.this, 30000L);
    }

    public void run()
    {
        if (UserStatusManager.access$000(UserStatusManager.this))
        {
            return;
        }
        if (!LoggedInUser.getInstance().isLoggedIn() || !WishApplication.getAppInstance().inForeground())
        {
            stopStatusRefresh();
            return;
        } else
        {
            UserStatusManager.access$002(UserStatusManager.this, true);
            refreshStatus();
            requestComplete();
            return;
        }
    }

    ()
    {
        this$0 = UserStatusManager.this;
        super();
    }
}
