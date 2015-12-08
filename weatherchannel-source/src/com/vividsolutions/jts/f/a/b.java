// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.f.a;

import com.vividsolutions.jts.c.b.c;
import com.vividsolutions.jts.c.e.e;
import com.vividsolutions.jts.f.i;
import com.vividsolutions.jts.f.r;
import com.vividsolutions.jts.geom.h;

// Referenced classes of package com.vividsolutions.jts.f.a:
//            a

public final class b
{
    public final class a extends c
    {

        private com.vividsolutions.jts.f.a.a b;
        private r c;
        private int d;
        private boolean e;

        public final void a(com.vividsolutions.jts.c.b.a a1, int j)
        {
            a1 = (i)a1.b();
            if (c != null && a1 == c && j == d)
            {
                return;
            } else
            {
                e = b.a(a1, j);
                return;
            }
        }

        public final boolean a()
        {
            return e;
        }

        public a(com.vividsolutions.jts.f.a.a a1, r r, int j)
        {
            e = false;
            b = a1;
            c = r;
            d = j;
        }
    }


    private e a;

    public b(com.vividsolutions.jts.c.b b1)
    {
        a = (e)b1;
    }

    public final boolean a(com.vividsolutions.jts.f.a.a a1)
    {
        return a(a1, null, -1);
    }

    public final boolean a(com.vividsolutions.jts.f.a.a a1, r r, int i)
    {
        h h = a1.a();
        a1 = new a(a1, r, i);
        a.a(h, new com.vividsolutions.jts.c.a(h, a1) {

            private h a;
            private a b;

            public final void a(Object obj)
            {
                ((com.vividsolutions.jts.c.b.a)obj).a(a, b);
            }

            
            {
                a = h;
                b = a1;
                super();
            }
        });
        return a1.a();
    }
}
