// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.innertube.model.a;

import com.google.a.a.a.a.fy;
import com.google.a.a.a.a.fz;
import com.google.a.a.a.a.gc;
import com.google.android.apps.youtube.common.fromguava.c;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.datalib.innertube.model.a:
//            c, d

public class b extends com.google.android.apps.youtube.datalib.innertube.model.a.c
    implements d
{

    private final List g;
    private boolean h;
    private final String i;
    private final String j;

    public b(fy fy1)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(fy1);
        com.google.android.apps.youtube.common.fromguava.c.a(fy1.b);
        com.google.android.apps.youtube.common.fromguava.c.a(fy1.d);
        b = null;
        j = fy1.b.b.c;
        i = fy1.d.b.c;
        fy1 = fy1.c;
        com.google.android.apps.youtube.common.fromguava.c.a(fy1);
        ArrayList arraylist = new ArrayList();
        int l = fy1.length;
        for (int k = 0; k < l; k++)
        {
            Object obj = fy1[k];
            if (((fz) (obj)).b != null)
            {
                arraylist.add(new com.google.android.apps.youtube.datalib.innertube.model.a.c(((fz) (obj)).b, this));
            }
        }

        g = arraylist;
    }

    public final List a()
    {
        return g;
    }

    public final void a(boolean flag)
    {
        h = flag;
    }

    public final String b()
    {
        if (h)
        {
            return i;
        } else
        {
            return j;
        }
    }

    public final boolean c()
    {
        return h;
    }
}
