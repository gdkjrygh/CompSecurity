// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.a.c.b.b.c;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.a.c.a.c;
import org.a.c.b.b.a.e;
import org.a.c.b.b.a.j;
import org.a.c.b.b.b.a;
import org.a.c.b.b.b.f;

// Referenced classes of package org.a.c.b.b.c:
//            k, j, n, i, 
//            l

public final class h extends k
    implements j
{

    public final int a;
    private final ArrayList b = new ArrayList();
    private h c;
    private org.a.c.b.b.a d;

    public h(int i1)
    {
        c = null;
        d = null;
        a = i1;
    }

    private void a(e e1)
    {
        int i1;
        int k1;
        k1 = e1.b;
        i1 = 0;
_L6:
        if (i1 < b.size()) goto _L2; else goto _L1
_L1:
        e1 = null;
_L4:
        if (e1 != null)
        {
            b.remove(e1);
        }
        return;
_L2:
        org.a.c.b.b.c.j j1;
        j1 = (org.a.c.b.b.c.j)b.get(i1);
        e1 = j1;
        if (j1.a == k1) goto _L4; else goto _L3
_L3:
        i1++;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final ArrayList a()
    {
        return new ArrayList(b);
    }

    protected final List a(n n1)
    {
        int k1 = 0;
        a(au);
        a(av);
        org.a.c.b.b.c.j j1;
        ArrayList arraylist;
        i i1;
        if (d != null)
        {
            j1 = new org.a.c.b.b.c.j(au, G_, 1, org.a.c.b.b.b.a.a());
            a(j1);
            f f1 = G_;
            int i2 = d.;
            int k2 = n1.a;
            byte abyte0[] = f1.a(new int[] {
                i2
            }, k2);
            a(new org.a.c.b.b.c.j(av, G_, 1, abyte0));
        } else
        {
            j1 = null;
        }
        a(az_);
        a(aD_);
        a(bg_);
        a(bh_);
        arraylist = new ArrayList();
        arraylist.add(this);
        i1 = new i(this);
        Collections.sort(b, i1);
        do
        {
            if (k1 >= b.size())
            {
                if (d != null)
                {
                    l l1 = new l("JPEG image data", d.a);
                    arraylist.add(l1);
                    n1.a(l1, j1);
                }
                return arraylist;
            }
            org.a.c.b.b.c.j j2 = (org.a.c.b.b.c.j)b.get(k1);
            if (!j2.b())
            {
                arraylist.add(j2.a());
            }
            k1++;
        } while (true);
    }

    public final void a(c c1)
    {
        c1.b(b.size());
        int i1 = 0;
        do
        {
            if (i1 >= b.size())
            {
                if (c != null)
                {
                    i1 = c.d();
                } else
                {
                    i1 = 0;
                }
                if (i1 == -1)
                {
                    c1.a(0);
                    return;
                } else
                {
                    c1.a(i1);
                    return;
                }
            }
            ((org.a.c.b.b.c.j)b.get(i1)).a(c1);
            i1++;
        } while (true);
    }

    public final void a(h h1)
    {
        c = h1;
    }

    public final void a(org.a.c.b.b.c.j j1)
    {
        b.add(j1);
    }

    public final String b()
    {
        return org.a.c.b.b.c.a(a);
    }

    public final int c()
    {
        return b.size() * 12 + 2 + 4;
    }
}
