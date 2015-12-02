// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.signup;

import android.content.res.Resources;
import chp;
import doc;
import dts;
import java.util.Map;
import l;

// Referenced classes of package com.ubercab.client.feature.signup:
//            SignupPaymentFragment

final class a
    implements doc
{

    final SignupPaymentFragment a;

    public final void a(Map map, boolean flag)
    {
        if (flag)
        {
            a.c.a(l.ai);
            a.startActivityForResult(dts.a(a.getActivity()), 400);
            return;
        } else
        {
            a.c(a.getResources().getString(0x7f07034e));
            return;
        }
    }

    (SignupPaymentFragment signuppaymentfragment)
    {
        a = signuppaymentfragment;
        super();
    }
}
