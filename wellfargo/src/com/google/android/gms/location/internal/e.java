// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.n;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.g;

// Referenced classes of package com.google.android.gms.location.internal:
//            g, v, d

class e extends com.google.android.gms.location.internal.g
{

    final LocationRequest b;
    final g c;
    final d d;

    e(d d1, n n, LocationRequest locationrequest, g g1)
    {
        d = d1;
        b = locationrequest;
        c = g1;
        super(n);
    }

    protected void a(v v1)
    {
        v1.a(b, c, null);
        a(((com.google.android.gms.common.api.z) (Status.a)));
    }

    protected void b(h h)
    {
        a((v)h);
    }
}
