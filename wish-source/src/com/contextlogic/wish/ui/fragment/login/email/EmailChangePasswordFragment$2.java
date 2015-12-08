// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.login.email;

import android.view.View;
import com.contextlogic.wish.analytics.WishAnalyticsEvent;

// Referenced classes of package com.contextlogic.wish.ui.fragment.login.email:
//            EmailChangePasswordFragment

class this._cls0
    implements android.view.il.EmailChangePasswordFragment._cls2
{

    final EmailChangePasswordFragment this$0;

    public void onClick(View view)
    {
        trackClick(WishAnalyticsEvent.CLICK_MOBILE_EMAIL_CHANGE_PASSWORD);
        EmailChangePasswordFragment.access$100(EmailChangePasswordFragment.this);
    }

    Q()
    {
        this$0 = EmailChangePasswordFragment.this;
        super();
    }
}
