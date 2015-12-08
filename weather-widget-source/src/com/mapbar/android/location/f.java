// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mapbar.android.location;

import android.telephony.CellLocation;
import android.telephony.PhoneStateListener;
import android.telephony.ServiceState;
import android.telephony.TelephonyManager;

// Referenced classes of package com.mapbar.android.location:
//            b, l, i, k

final class f extends PhoneStateListener
{

    private b a;

    f(b b1)
    {
        a = b1;
        super();
    }

    public final void onCellLocationChanged(CellLocation celllocation)
    {
        if (l.k == null || "".equals(l.k))
        {
            l.k = b.c(a).getSimOperator();
            i.a("CellLocationImpl", (new StringBuilder()).append("MPATAG_IMEI = ").append(l.a).toString());
            i.a("CellLocationImpl", (new StringBuilder()).append("MapTags.MPATAG_IMSI = ").append(l.b).toString());
        }
        b.a(a, celllocation);
        b.a(a, b.c(a).getNeighboringCellInfo());
        k.a(b.b(a)).c();
    }

    public final void onServiceStateChanged(ServiceState servicestate)
    {
        b.a(a, servicestate);
    }

    public final void onSignalStrengthChanged(int j)
    {
        l.m = j;
    }
}
