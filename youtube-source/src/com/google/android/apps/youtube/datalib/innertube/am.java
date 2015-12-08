// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.innertube;

import com.android.volley.VolleyError;
import com.google.a.a.a.a.oe;
import com.google.android.apps.youtube.datalib.a.l;
import com.google.android.apps.youtube.datalib.innertube.model.z;

// Referenced classes of package com.google.android.apps.youtube.datalib.innertube:
//            al, an

final class am
    implements l
{

    final l a;
    final an b;
    final al c;

    am(al al1, l l1, an an)
    {
        c = al1;
        a = l1;
        b = an;
        super();
    }

    public final void a(VolleyError volleyerror)
    {
        a.a(volleyerror);
    }

    public final void a(Object obj)
    {
        obj = (oe)obj;
        a.a(new z(((oe) (obj))));
        al.a(c, b);
    }
}
