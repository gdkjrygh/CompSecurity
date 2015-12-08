// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.j;

import com.go.weatherex.common.g;

// Referenced classes of package com.go.weatherex.j:
//            g, k, ab, ae, 
//            ac

class ad extends g
{

    final ab c;

    private ad(ab ab1)
    {
        c = ab1;
        super();
    }

    ad(ab ab1, ac ac)
    {
        this(ab1);
    }

    protected transient Object a(com.go.weatherex.j.g ag[])
    {
        ag = ag[0];
        k k1 = ag.q();
        k1.n();
        return ((Object) (new Object[] {
            ag, k1
        }));
    }

    protected volatile Object a(Object aobj[])
    {
        return a((com.go.weatherex.j.g[])aobj);
    }

    protected void a(Object obj)
    {
        Object aobj[] = (Object[])(Object[])obj;
        obj = (com.go.weatherex.j.g)aobj[0];
        k k1 = (k)aobj[1];
        if (ab.a(c) != null)
        {
            ab.a(c).a(((com.go.weatherex.j.g) (obj)), k1);
        }
    }
}
