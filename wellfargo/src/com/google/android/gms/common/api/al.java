// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import com.google.android.gms.common.ConnectionResult;

// Referenced classes of package com.google.android.gms.common.api:
//            bd, ai, ak, bh

class al extends bd
{

    final ai a;
    final ConnectionResult b;
    final ak c;

    al(ak ak, bh bh, ai ai1, ConnectionResult connectionresult)
    {
        c = ak;
        a = ai1;
        b = connectionresult;
        super(bh);
    }

    public void a()
    {
        ai.c(a, b);
    }
}
