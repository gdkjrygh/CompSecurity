// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.innertube;

import com.google.a.a.a.a.oc;
import com.google.a.a.a.a.od;
import com.google.android.apps.youtube.common.fromguava.c;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.datalib.innertube:
//            b, p

public final class an extends b
{

    private String c;
    private final List d = new ArrayList();
    private int e;

    protected an(p p)
    {
        super(p);
    }

    static List a(an an1)
    {
        return an1.d;
    }

    static String b(an an1)
    {
        return an1.c;
    }

    public final an a(String s)
    {
        c = s;
        return this;
    }

    public final an b(String s)
    {
        oc oc1 = new oc();
        oc1.e = 1;
        oc1.b = s;
        d.add(oc1);
        return this;
    }

    public final an c(String s)
    {
        oc oc1 = new oc();
        oc1.e = 2;
        oc1.c = s;
        d.add(oc1);
        return this;
    }

    protected final void c()
    {
        boolean flag1 = true;
        boolean flag;
        if (c != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.android.apps.youtube.common.fromguava.c.b(flag);
        if (d.size() > 0)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        com.google.android.apps.youtube.common.fromguava.c.b(flag);
    }

    public final String e()
    {
        return "browse/edit_playlist";
    }

    public final com.google.protobuf.nano.c f()
    {
        b();
        od od1 = new od();
        od1.d = c;
        od1.e = e;
        od1.b = d();
        od1.c = new oc[d.size()];
        d.toArray(od1.c);
        return od1;
    }
}
