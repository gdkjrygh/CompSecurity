// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.innertube;

import com.android.volley.l;
import com.google.a.a.a.a.qm;

// Referenced classes of package com.google.android.apps.youtube.datalib.innertube:
//            a, i, au, as, 
//            r, at, p

public final class SearchService extends a
    implements i
{

    public SearchService(r r1, p p, l l1)
    {
        super(r1, p, l1);
    }

    public final au a()
    {
        return new au(b, (byte)0);
    }

    public final void a(au au1, com.google.android.apps.youtube.datalib.a.l l1)
    {
        l1 = new as(this, l1);
        c.a(a.a(au1, com/google/a/a/a/a/qm, l1));
    }

    public final void a(String s, com.google.android.apps.youtube.datalib.a.l l1)
    {
        au au1 = a();
        au1.b(s);
        a(au1, ((com.google.android.apps.youtube.datalib.a.l) (new at(this, l1))));
    }
}
