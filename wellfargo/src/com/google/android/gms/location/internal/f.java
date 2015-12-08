// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.n;
import com.google.android.gms.location.g;

// Referenced classes of package com.google.android.gms.location.internal:
//            g, v, d

class f extends com.google.android.gms.location.internal.g
{

    final g b;
    final d c;

    f(d d, n n, g g1)
    {
        c = d;
        b = g1;
        super(n);
    }

    protected void a(v v1)
    {
        v1.a(b);
        a(((com.google.android.gms.common.api.z) (Status.a)));
    }

    protected void b(h h)
    {
        a((v)h);
    }
}
