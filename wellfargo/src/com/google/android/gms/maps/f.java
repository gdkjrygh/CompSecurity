// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps;

import com.google.android.gms.a.j;
import com.google.android.gms.a.m;
import com.google.android.gms.maps.a.an;
import com.google.android.gms.maps.model.a.p;
import com.google.android.gms.maps.model.e;

// Referenced classes of package com.google.android.gms.maps:
//            g, c

class f extends an
{

    final g a;
    final c b;

    f(c c, g g1)
    {
        b = c;
        a = g1;
        super();
    }

    public j a(p p)
    {
        return m.a(a.a(new e(p)));
    }

    public j b(p p)
    {
        return m.a(a.b(new e(p)));
    }
}
