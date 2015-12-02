// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.payment;

import android.content.res.Resources;
import doc;
import dts;
import java.util.Map;

// Referenced classes of package com.ubercab.client.feature.payment:
//            AddPaymentFragment

public final class a
    implements doc
{

    final AddPaymentFragment a;

    public final void a(Map map, boolean flag)
    {
        if (flag)
        {
            a.startActivityForResult(dts.a(a.getActivity()), 900);
            return;
        } else
        {
            a.c(a.getResources().getString(0x7f07034e));
            return;
        }
    }

    (AddPaymentFragment addpaymentfragment)
    {
        a = addpaymentfragment;
        super();
    }
}
