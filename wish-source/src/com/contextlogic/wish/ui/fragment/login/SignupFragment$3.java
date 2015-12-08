// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.login;

import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import com.contextlogic.wish.analytics.WishAnalyticsEvent;
import java.util.ArrayList;

// Referenced classes of package com.contextlogic.wish.ui.fragment.login:
//            SignupFragment

class this._cls0
    implements android.widget.mClickListener
{

    final SignupFragment this$0;

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        trackClick(WishAnalyticsEvent.CLICK_MOBILE_SIGNUP_EMAIL_SUGGEST);
        SignupFragment.access$400(SignupFragment.this).setText((CharSequence)SignupFragment.access$300(SignupFragment.this).get(i));
    }

    ()
    {
        this$0 = SignupFragment.this;
        super();
    }
}
