// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.service.manager;

import com.contextlogic.wish.user.LoggedInUser;
import com.contextlogic.wish.user.UserPreferences;

// Referenced classes of package com.contextlogic.wish.api.service.manager:
//            LoginServiceManager

class val.googlePlusId
    implements com.contextlogic.wish.api.service.allback
{

    final LoginServiceManager this$0;
    final String val$googlePlusId;

    public void onServiceSucceeded(String s, boolean flag, com.contextlogic.wish.ui.activity.login.pFlow pflow)
    {
        UserPreferences.setGooglePlusId(val$googlePlusId);
        LoggedInUser.getInstance().setLoginTime(System.currentTimeMillis());
        LoginServiceManager.access$300(LoginServiceManager.this, s, flag, true, pflow);
    }

    low()
    {
        this$0 = final_loginservicemanager;
        val$googlePlusId = String.this;
        super();
    }
}
