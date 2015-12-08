// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.c;

import com.android.volley.VolleyError;
import com.google.a.a.a.a.wy;
import com.google.android.apps.youtube.datalib.a.l;

// Referenced classes of package com.google.android.apps.youtube.app.c:
//            a

final class b
    implements l
{

    final a a;

    b(a a1)
    {
        a = a1;
        super();
    }

    public final void a(VolleyError volleyerror)
    {
        com.google.android.apps.youtube.app.c.a.a(a, volleyerror);
    }

    public final volatile void a(Object obj)
    {
        obj = (wy)obj;
        com.google.android.apps.youtube.app.c.a.a(a, ((wy) (obj)).d, ((wy) (obj)).e);
    }
}
