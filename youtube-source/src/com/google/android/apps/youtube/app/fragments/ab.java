// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.fragments;

import com.android.volley.VolleyError;
import com.google.android.apps.youtube.core.aw;
import com.google.android.apps.youtube.datalib.a.l;
import com.google.android.apps.youtube.datalib.innertube.model.a.a;
import com.google.android.apps.youtube.datalib.innertube.model.a.b;
import com.google.android.apps.youtube.datalib.innertube.model.a.c;
import com.google.android.apps.youtube.datalib.innertube.model.a.g;
import com.google.android.apps.youtube.uilib.a.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.app.fragments:
//            GuideFragment

final class ab
    implements l
{

    final GuideFragment a;

    public ab(GuideFragment guidefragment)
    {
        a = guidefragment;
        super();
    }

    public final void a(VolleyError volleyerror)
    {
        com.google.android.apps.youtube.app.fragments.GuideFragment.a(a, GuideFragment.j(a).a(volleyerror), true);
    }

    public final void a(Object obj)
    {
        obj = ((com.google.android.apps.youtube.datalib.innertube.model.l)obj).a();
        com.google.android.apps.youtube.app.fragments.GuideFragment.a(a, null);
        GuideFragment.f(a).b();
        com.google.android.apps.youtube.app.fragments.GuideFragment.h(a).clear();
        for (obj = ((a) (obj)).a().iterator(); ((Iterator) (obj)).hasNext();)
        {
            Object obj1 = (g)((Iterator) (obj)).next();
            if (!((g) (obj1)).a().equals(""))
            {
                com.google.android.apps.youtube.app.fragments.GuideFragment.h(a).add(obj1);
            }
            obj1 = ((g) (obj1)).b().iterator();
            while (((Iterator) (obj1)).hasNext()) 
            {
                c c1 = (c)((Iterator) (obj1)).next();
                if (c1 instanceof b)
                {
                    c c2;
                    for (Iterator iterator = ((b)c1).a().iterator(); iterator.hasNext(); com.google.android.apps.youtube.app.fragments.GuideFragment.h(a).add(c2))
                    {
                        c2 = (c)iterator.next();
                    }

                }
                com.google.android.apps.youtube.app.fragments.GuideFragment.h(a).add(c1);
            }
        }

        com.google.android.apps.youtube.app.fragments.GuideFragment.g(a);
        GuideFragment.i(a);
    }
}
