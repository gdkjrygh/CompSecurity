// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.activity.login;

import android.view.View;
import com.contextlogic.wish.analytics.Analytics;
import com.contextlogic.wish.analytics.WishAnalyticsEvent;

// Referenced classes of package com.contextlogic.wish.ui.activity.login:
//            LoginActivity

class this._cls0
    implements android.view.ener
{

    final LoginActivity this$0;

    public void onClick(View view)
    {
        trackClick(WishAnalyticsEvent.CLICK_MOBILE_SPLASH_EMAIL_LOGIN);
        Analytics.getInstance().trackEvent(com.contextlogic.wish.analytics.ype.EmailSignInSelect, com.contextlogic.wish.analytics.ewType.LoginSplash, com.contextlogic.wish.analytics.ype.Click);
        LoginActivity.access$200(LoginActivity.this, false);
    }

    ()
    {
        this$0 = LoginActivity.this;
        super();
    }
}
