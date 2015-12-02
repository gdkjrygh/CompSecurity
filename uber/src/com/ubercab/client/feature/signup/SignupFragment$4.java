// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.signup;

import dtp;
import hrs;
import hse;

// Referenced classes of package com.ubercab.client.feature.signup:
//            SignupFragment

final class a
    implements hse
{

    final SignupFragment a;

    private void a(hrs hrs1)
    {
        if (hrs1 == null)
        {
            return;
        } else
        {
            dtp.a(SignupFragment.c(a), 0, hrs1.a(a.getResources()).toString());
            return;
        }
    }

    public final volatile void a(Object obj)
    {
        a((hrs)obj);
    }

    (SignupFragment signupfragment)
    {
        a = signupfragment;
        super();
    }
}
