// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.innertube.model;

import com.google.a.a.a.a.dp;
import com.google.a.a.a.a.qq;
import com.google.a.a.a.a.qs;
import com.google.a.a.a.a.qt;
import com.google.a.a.a.a.rd;
import com.google.a.a.a.a.re;
import com.google.android.apps.youtube.common.fromguava.c;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.datalib.innertube.model:
//            o, p, ag, ar

public final class aj
{

    private final qq a;
    private List b;
    private dp c;

    public aj(qq qq1)
    {
        a = (qq)com.google.android.apps.youtube.common.fromguava.c.a(qq1);
    }

    public final List a()
    {
        if (b == null)
        {
            b = new ArrayList(a.b.length);
            qt aqt[] = a.b;
            int j = aqt.length;
            int i = 0;
            while (i < j) 
            {
                Object obj = aqt[i];
                if (((qt) (obj)).b != null)
                {
                    b.add(new o(((qt) (obj)).b));
                } else
                if (((qt) (obj)).d != null)
                {
                    b.add(new p(((qt) (obj)).d));
                } else
                if (((qt) (obj)).g != null)
                {
                    b.add(new ag(((qt) (obj)).g));
                } else
                if (((qt) (obj)).f != null)
                {
                    b.add(((qt) (obj)).f);
                } else
                if (((qt) (obj)).e != null)
                {
                    obj = ((qt) (obj)).e;
                    if (((rd) (obj)).f != null && ((rd) (obj)).f.e != null)
                    {
                        b.add(new ar(((rd) (obj))));
                    }
                }
                i++;
            }
        }
        return b;
    }

    public final dp b()
    {
        if (c == null)
        {
            c = new dp();
            qs aqs[] = a.c;
            int j = aqs.length;
            int i = 0;
            while (i < j) 
            {
                qs qs1 = aqs[i];
                if (qs1.b != null)
                {
                    c.c = qs1.b;
                } else
                if (qs1.d != null)
                {
                    c.f = qs1.d;
                }
                i++;
            }
        }
        return c;
    }
}
