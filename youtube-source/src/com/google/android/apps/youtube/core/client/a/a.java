// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.client.a;

import android.text.TextUtils;
import com.google.a.a.a.a.dt;
import com.google.a.a.a.a.ix;
import com.google.android.apps.common.csi.lib.b;
import com.google.android.apps.common.csi.lib.h;
import com.google.android.apps.common.csi.lib.i;
import com.google.android.apps.common.csi.lib.j;
import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.fromguava.c;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.google.android.apps.youtube.core.client.a:
//            g

public class a
{

    private String a;
    private i b;
    private h c;
    private Set d;
    private boolean e;
    private final j f;
    private final String g;
    private final dt h;
    private final int i;
    private Set j;

    protected a(String s, int k, boolean flag, String s1, dt dt1)
    {
        this((String)com.google.android.apps.youtube.common.fromguava.c.a(s), k, flag, s1, dt1, ((j) (new b())));
    }

    private a(String s, int k, boolean flag, String s1, dt dt1, j j1)
    {
        a = (String)com.google.android.apps.youtube.common.fromguava.c.a(s);
        f = (j)com.google.android.apps.youtube.common.fromguava.c.a(j1);
        e = flag;
        g = s1;
        h = dt1;
        i = k;
        d = new HashSet();
    }

    private boolean b()
    {
        return b != null && c != null;
    }

    public final i a()
    {
        if (!b())
        {
            L.c("CsiAction.start() should be called before report. Ignored.");
            return null;
        }
        Object obj;
        if (e)
        {
            obj = "1";
        } else
        {
            obj = "0";
        }
        a("mod_li", ((String) (obj)));
        if (!"".equals(g))
        {
            a("egs", g);
        }
        if (h != null && h.b.length > 0)
        {
            obj = h.b;
            int l = obj.length;
            for (int k = 0; k < l; k++)
            {
                ix ix1 = obj[k];
                a(ix1.b, ix1.c);
            }

        }
        a("conn", String.valueOf(i));
        return b;
    }

    protected final void a(g g1, Set set)
    {
        if (b())
        {
            L.c((new StringBuilder("CsiAction [")).append(getClass().getSimpleName()).append("] already started. Ignored.").toString());
            return;
        } else
        {
            j = (Set)com.google.android.apps.youtube.common.fromguava.c.a(set);
            b = new i(a, f);
            set = b;
            c = new h(g1.a(), null, null);
            return;
        }
    }

    protected final void a(String s)
    {
        b.a(s);
    }

    protected final void a(String s, String s1)
    {
        if (!b())
        {
            L.c("CsiAction not yet started.");
            return;
        } else
        {
            b.a(s, s1);
            return;
        }
    }

    protected boolean a(g g1)
    {
        boolean flag = true;
        if (!b())
        {
            L.c((new StringBuilder("CsiAction [")).append(getClass().getSimpleName()).append("] not yet started.").toString());
            return false;
        }
        if (d.contains(g1.b()))
        {
            L.c(String.format("CsiAction [%s] already ticked %s. Ignored.", new Object[] {
                getClass().getSimpleName(), g1.b()
            }));
        } else
        if (!TextUtils.isEmpty(g1.b()))
        {
            b.a(c, g1.a(), new String[] {
                g1.b()
            });
            d.add(g1.b());
        } else
        {
            L.c(String.format("CsiAction [%s] triggered with no registered label", new Object[] {
                getClass().getSimpleName()
            }));
        }
        if (!j.contains(g1.getClass()) || d.size() <= 1)
        {
            flag = false;
        }
        return flag;
    }
}
