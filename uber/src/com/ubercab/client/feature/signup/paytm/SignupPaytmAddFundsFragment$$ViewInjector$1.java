// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.signup.paytm;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

// Referenced classes of package com.ubercab.client.feature.signup.paytm:
//            SignupPaytmAddFundsFragment

final class a extends DebouncingOnClickListener
{

    final SignupPaytmAddFundsFragment a;
    final gested b;

    public final void doClick(View view)
    {
        a.onClickButtonSuggested();
    }

    Y(Y y, SignupPaytmAddFundsFragment signuppaytmaddfundsfragment)
    {
        b = y;
        a = signuppaytmaddfundsfragment;
        super();
    }
}
