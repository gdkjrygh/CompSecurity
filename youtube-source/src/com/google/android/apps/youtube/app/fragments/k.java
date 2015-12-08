// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.fragments;

import com.android.volley.VolleyError;
import com.google.android.apps.youtube.app.b.o;
import com.google.android.apps.youtube.app.b.p;
import com.google.android.apps.youtube.app.ui.LoadingFrameLayout;
import com.google.android.apps.youtube.common.c.a;
import com.google.android.apps.youtube.core.aw;
import com.google.android.apps.youtube.datalib.a.l;
import com.google.android.apps.youtube.datalib.innertube.model.ab;
import com.google.android.apps.youtube.datalib.innertube.model.b;
import com.google.android.apps.youtube.datalib.innertube.model.c;
import com.google.android.apps.youtube.datalib.innertube.model.j;

// Referenced classes of package com.google.android.apps.youtube.app.fragments:
//            BrowseFragment

final class k
    implements l
{

    final a a;
    final byte b[];
    final BrowseFragment c;

    k(BrowseFragment browsefragment, a a1, byte abyte0[])
    {
        c = browsefragment;
        a = a1;
        b = abyte0;
        super();
    }

    public final void a(VolleyError volleyerror)
    {
        BrowseFragment.e(c).a(BrowseFragment.d(c).a(volleyerror), true);
    }

    public final void a(Object obj)
    {
        obj = (b)obj;
        a.a(new p());
        if (((b) (obj)).d())
        {
            BrowseFragment.e(c).a(com.google.android.youtube.p.cS);
            return;
        }
        com.google.android.apps.youtube.app.fragments.BrowseFragment.a(c, ((b) (obj)).b(), com.google.android.apps.youtube.app.fragments.BrowseFragment.a(c, ((b) (obj)).c(), b));
        BrowseFragment browsefragment = c;
        obj = ((b) (obj)).c();
        if (obj instanceof c)
        {
            obj = ((c)obj).d().toString();
        } else
        if (obj instanceof j)
        {
            obj = ((j)obj).a().toString();
        } else
        if (obj instanceof ab)
        {
            obj = ((ab)obj).c().toString();
        } else
        {
            obj = null;
        }
        com.google.android.apps.youtube.app.fragments.BrowseFragment.b(browsefragment, ((String) (obj)));
        BrowseFragment.e(c).b();
        c.F();
        a.a(new o());
    }
}
