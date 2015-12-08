// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.innertube;

import com.android.volley.VolleyError;
import com.google.a.a.a.a.ww;
import com.google.android.apps.youtube.datalib.a.l;
import com.google.android.apps.youtube.datalib.innertube.model.ba;

// Referenced classes of package com.google.android.apps.youtube.datalib.innertube:
//            bc

final class bd
    implements l
{

    final l a;
    final bc b;

    bd(bc bc, l l1)
    {
        b = bc;
        a = l1;
        super();
    }

    public final void a(VolleyError volleyerror)
    {
        a.a(volleyerror);
    }

    public final void a(Object obj)
    {
        obj = (ww)obj;
        a.a(new ba(((ww) (obj))));
    }
}
