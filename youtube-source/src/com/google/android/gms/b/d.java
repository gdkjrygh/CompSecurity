// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.b;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.c;
import com.google.android.gms.internal.ij;

// Referenced classes of package com.google.android.gms.b:
//            e

final class d
    implements c
{

    final e a;
    final Integer b;
    final Long c;
    final Integer d;
    final Integer e;
    final Bundle f;

    d(e e1, Integer integer, Long long1, Integer integer1, Integer integer2, Bundle bundle)
    {
        a = e1;
        b = integer;
        c = long1;
        d = integer1;
        e = integer2;
        f = bundle;
        super();
    }

    public final void b()
    {
        if (ij.a)
        {
            Log.d("MDM", "disconnected from network quality service");
        }
    }

    public final void u_()
    {
        if (ij.a)
        {
            Log.d("MDM", "connected to network quality service");
        }
        a.a(b, c, d, e, f);
        a.b();
    }
}
