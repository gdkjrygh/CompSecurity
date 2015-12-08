// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.service.manager;

import com.contextlogic.wish.analytics.Analytics;

// Referenced classes of package com.contextlogic.wish.api.service.manager:
//            LoginServiceManager

class val.isNewUser
    implements com.contextlogic.wish.api.service.ack
{

    final LoginServiceManager this$0;
    final boolean val$isNewUser;

    public void onServiceFailed()
    {
        if (val$isNewUser)
        {
            Analytics.getInstance().trackEvent(com.contextlogic.wish.analytics.UserLoginStepTwo, com.contextlogic.wish.analytics.Api, com.contextlogic.wish.analytics.lure);
        } else
        {
            Analytics.getInstance().trackEvent(com.contextlogic.wish.analytics.inStepTwo, com.contextlogic.wish.analytics.Api, com.contextlogic.wish.analytics.lure);
        }
        LoginServiceManager.access$100(LoginServiceManager.this, false, false, null);
    }

    ()
    {
        this$0 = final_loginservicemanager;
        val$isNewUser = Z.this;
        super();
    }
}
