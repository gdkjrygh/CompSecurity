// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.innertube;

import com.android.volley.VolleyError;
import com.google.a.a.a.a.qm;
import com.google.android.apps.youtube.datalib.a.l;
import com.google.android.apps.youtube.datalib.innertube.model.ai;

// Referenced classes of package com.google.android.apps.youtube.datalib.innertube:
//            SearchService

final class as
    implements l
{

    final l a;
    final SearchService b;

    as(SearchService searchservice, l l1)
    {
        b = searchservice;
        a = l1;
        super();
    }

    public final void a(VolleyError volleyerror)
    {
        a.a(volleyerror);
    }

    public final void a(Object obj)
    {
        obj = (qm)obj;
        a.a(new ai(((qm) (obj))));
    }
}
