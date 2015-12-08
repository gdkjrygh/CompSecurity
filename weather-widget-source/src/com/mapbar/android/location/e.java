// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mapbar.android.location;

import android.telephony.CellLocation;
import android.telephony.PhoneStateListener;
import android.telephony.ServiceState;
import android.telephony.TelephonyManager;

// Referenced classes of package com.mapbar.android.location:
//            b, k, l

final class e extends PhoneStateListener
{

    private b a;

    e(b b1)
    {
        a = b1;
        super();
    }

    public final void onCellLocationChanged(CellLocation celllocation)
    {
        b.a(a, celllocation);
        b.a(a, b.c(a).getNeighboringCellInfoGemini(1));
        k.a(b.b(a)).c();
    }

    public final void onServiceStateChanged(ServiceState servicestate)
    {
        b.a(a, servicestate);
    }

    public final void onSignalStrengthChanged(int i)
    {
        l.m = i;
    }
}
