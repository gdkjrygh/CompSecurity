// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.signup;

import android.widget.ScrollView;
import hpb;

// Referenced classes of package com.ubercab.client.feature.signup:
//            SignupFragment

final class a extends hpb
{

    final SignupFragment a;

    public final void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
        if (i == 0 && k > 0)
        {
            a.mScrollViewContent.scrollTo(0, a.mScrollViewContent.getBottom());
        }
    }

    (SignupFragment signupfragment)
    {
        a = signupfragment;
        super();
    }
}
