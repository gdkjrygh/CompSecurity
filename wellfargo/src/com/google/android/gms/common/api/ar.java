// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import com.google.android.gms.common.ConnectionResult;

// Referenced classes of package com.google.android.gms.common.api:
//            bd, aq, ai, bh

class ar extends bd
{

    final ConnectionResult a;
    final aq b;

    ar(aq aq1, bh bh, ConnectionResult connectionresult)
    {
        b = aq1;
        a = connectionresult;
        super(bh);
    }

    public void a()
    {
        ai.a(b.a, a);
    }
}
