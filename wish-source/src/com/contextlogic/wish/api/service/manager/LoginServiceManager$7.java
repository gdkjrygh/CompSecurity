// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.service.manager;

import com.contextlogic.wish.user.LoggedInUser;

// Referenced classes of package com.contextlogic.wish.api.service.manager:
//            LoginServiceManager

class this._cls0
    implements com.contextlogic.wish.api.service.Callback
{

    final LoginServiceManager this$0;

    public void onServiceSucceeded(String s, boolean flag, com.contextlogic.wish.ui.activity.login.upFlow upflow)
    {
        LoggedInUser.getInstance().setLoginTime(System.currentTimeMillis());
        LoginServiceManager.access$300(LoginServiceManager.this, s, flag, false, upflow);
    }

    Flow()
    {
        this$0 = LoginServiceManager.this;
        super();
    }
}
