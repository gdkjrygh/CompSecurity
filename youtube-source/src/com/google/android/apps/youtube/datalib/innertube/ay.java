// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.innertube;

import com.android.volley.l;
import com.google.a.a.a.a.wg;

// Referenced classes of package com.google.android.apps.youtube.datalib.innertube:
//            a, i, bb, az, 
//            r, ba, p

public final class ay extends a
    implements i
{

    public ay(r r1, p p, l l1)
    {
        super(r1, p, l1);
    }

    public final bb a()
    {
        return new bb(b, (byte)0);
    }

    public final void a(bb bb1, com.google.android.apps.youtube.datalib.a.l l1)
    {
        l1 = new az(this, l1);
        c.a(a.a(bb1, com/google/a/a/a/a/wg, l1));
    }

    public final void a(String s, com.google.android.apps.youtube.datalib.a.l l1)
    {
        bb bb1 = a();
        bb1.d(s);
        a(bb1, ((com.google.android.apps.youtube.datalib.a.l) (new ba(this, l1))));
    }
}
