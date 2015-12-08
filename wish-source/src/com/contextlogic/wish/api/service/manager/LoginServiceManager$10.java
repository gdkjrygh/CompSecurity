// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.service.manager;

import com.contextlogic.wish.user.LoggedInUser;

// Referenced classes of package com.contextlogic.wish.api.service.manager:
//            LoginServiceManager

class val.allowStoredSession
    implements com.contextlogic.wish.api.service.allback
{

    final LoginServiceManager this$0;
    final boolean val$allowStoredSession;

    public void onServiceSucceeded(String s, boolean flag, com.contextlogic.wish.ui.activity.login.pFlow pflow)
    {
        LoggedInUser.getInstance().setLoginTime(System.currentTimeMillis());
        LoginServiceManager.access$300(LoginServiceManager.this, s, flag, val$allowStoredSession, pflow);
    }

    low()
    {
        this$0 = final_loginservicemanager;
        val$allowStoredSession = Z.this;
        super();
    }
}
