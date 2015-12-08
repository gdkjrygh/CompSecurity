// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.a;

import com.android.volley.VolleyError;
import com.google.android.apps.youtube.common.L;

// Referenced classes of package com.google.android.apps.youtube.datalib.a:
//            l

final class n
    implements l
{

    final Class a;

    n(Class class1)
    {
        a = class1;
        super();
    }

    public final void a(VolleyError volleyerror)
    {
        L.a((new StringBuilder("Volley request failed for type ")).append(a.getCanonicalName()).toString(), volleyerror);
    }

    public final void a(Object obj)
    {
        L.e((new StringBuilder("Successful volley request for type ")).append(a.getCanonicalName()).toString());
    }
}
