// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.innertube;

import com.android.volley.l;
import com.google.a.a.a.a.oc;
import com.google.a.a.a.a.oe;
import com.google.android.apps.youtube.common.c.a;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.datalib.innertube:
//            a, an, ao, ap, 
//            am, r, p

public final class al extends com.google.android.apps.youtube.datalib.innertube.a
{

    private final a d;

    public al(r r1, p p, l l1, a a1)
    {
        super(r1, p, l1);
        d = a1;
    }

    static void a(al al1, an an1)
    {
        Iterator iterator = com.google.android.apps.youtube.datalib.innertube.an.a(an1).iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            oc oc1 = (oc)iterator.next();
            if (oc1.e == 1)
            {
                al1.d.c(new ao(an.b(an1), oc1.b, (byte)0));
            } else
            if (oc1.e == 2)
            {
                al1.d.c(new ap(an.b(an1), oc1.c, (byte)0));
            }
        } while (true);
    }

    public final an a()
    {
        return new an(b);
    }

    public final void a(an an1, com.google.android.apps.youtube.datalib.a.l l1)
    {
        l1 = new am(this, l1, an1);
        c.a(a.a(an1, com/google/a/a/a/a/oe, l1));
    }
}
