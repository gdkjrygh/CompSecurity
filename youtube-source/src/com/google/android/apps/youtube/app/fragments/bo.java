// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.fragments;

import android.content.res.Resources;
import com.android.volley.VolleyError;
import com.google.android.apps.youtube.app.WatchWhileActivity;
import com.google.android.apps.youtube.app.ui.LoadingFrameLayout;
import com.google.android.apps.youtube.core.aw;
import com.google.android.apps.youtube.datalib.a.l;
import com.google.android.apps.youtube.datalib.innertube.model.ai;
import com.google.android.apps.youtube.uilib.innertube.t;
import com.google.android.youtube.p;

// Referenced classes of package com.google.android.apps.youtube.app.fragments:
//            SearchFragment

final class bo
    implements l
{

    final SearchFragment a;

    bo(SearchFragment searchfragment)
    {
        a = searchfragment;
        super();
    }

    public final void a(VolleyError volleyerror)
    {
        SearchFragment.b(a).a(SearchFragment.d(a).a(volleyerror), true);
    }

    public final void a(Object obj)
    {
        obj = (ai)obj;
        if (((ai) (obj)).c())
        {
            SearchFragment.b(a).a(a.c.getResources().getString(p.cS));
            return;
        } else
        {
            SearchFragment.b(a).b();
            SearchFragment.c(a).b(((ai) (obj)).a());
            return;
        }
    }
}
