// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.service.manager;

import com.contextlogic.wish.analytics.Analytics;

// Referenced classes of package com.contextlogic.wish.api.service.manager:
//            LoginServiceManager

class this._cls0
    implements com.contextlogic.wish.api.service.ureCallback
{

    final LoginServiceManager this$0;

    public void onServiceFailed(String s)
    {
        Analytics.getInstance().trackEvent(com.contextlogic.wish.analytics.ailLoginStepOne, com.contextlogic.wish.analytics..Api, com.contextlogic.wish.analytics.ilure);
        LoginServiceManager.access$100(LoginServiceManager.this, false, false, s);
    }

    ack()
    {
        this$0 = LoginServiceManager.this;
        super();
    }
}
