// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.login;

import android.view.View;
import com.contextlogic.wish.analytics.WishAnalyticsEvent;

// Referenced classes of package com.contextlogic.wish.ui.fragment.login:
//            SignInFragment

class this._cls0
    implements android.view.ner
{

    final SignInFragment this$0;

    public void onClick(View view)
    {
        trackClick(WishAnalyticsEvent.CLICK_MOBILE_EMAIL_LOGIN);
        SignInFragment.access$100(SignInFragment.this);
    }

    ()
    {
        this$0 = SignInFragment.this;
        super();
    }
}
