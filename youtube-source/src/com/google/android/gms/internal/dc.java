// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            aa, db, ai, av, 
//            aj, al, ac

public final class dc
{

    public final aa a;
    public final db b;
    public final List c;
    public final int d;
    public final List e;
    public final List f;
    public final int g;
    public final long h;
    public final String i;
    public final boolean j;
    public final ai k;
    public final av l;
    public final String m;
    public final aj n;
    public final al o;
    public final long p;
    public final ac q;
    public final long r;

    public dc(aa aa, db db, List list, int i1, List list1, List list2, int j1, 
            long l1, String s, boolean flag, ai ai, av av, String s1, 
            aj aj, al al, long l2, ac ac, long l3)
    {
        a = aa;
        b = db;
        if (list != null)
        {
            aa = Collections.unmodifiableList(list);
        } else
        {
            aa = null;
        }
        c = aa;
        d = i1;
        if (list1 != null)
        {
            aa = Collections.unmodifiableList(list1);
        } else
        {
            aa = null;
        }
        e = aa;
        if (list2 != null)
        {
            aa = Collections.unmodifiableList(list2);
        } else
        {
            aa = null;
        }
        f = aa;
        g = j1;
        h = l1;
        i = s;
        j = flag;
        k = ai;
        l = av;
        m = s1;
        n = aj;
        o = al;
        p = l2;
        q = ac;
        r = l3;
    }
}
