// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.service.manager;

import com.contextlogic.wish.api.data.WishUser;
import com.contextlogic.wish.cache.TransientCache;
import com.contextlogic.wish.user.LoggedInUser;

// Referenced classes of package com.contextlogic.wish.api.service.manager:
//            LoginServiceManager

class low
    implements com.contextlogic.wish.api.service.ssCallback
{

    final LoginServiceManager this$0;
    final boolean val$isNewUser;
    final com.contextlogic.wish.ui.activity.login.pFlow val$signupFlow;

    public void onServiceSucceeded(WishUser wishuser)
    {
        TransientCache.getInstance().cacheUser(wishuser);
        LoggedInUser.getInstance().setCurrentUser(wishuser);
        LoginServiceManager.access$402(LoginServiceManager.this, true);
        LoginServiceManager.access$500(LoginServiceManager.this, val$isNewUser, val$signupFlow);
    }

    low()
    {
        this$0 = final_loginservicemanager;
        val$isNewUser = flag;
        val$signupFlow = com.contextlogic.wish.ui.activity.login.pFlow.this;
        super();
    }
}
