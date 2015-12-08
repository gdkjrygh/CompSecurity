// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.c;

import android.view.View;
import android.view.animation.Interpolator;
import com.a.a.an;
import com.a.a.b;
import com.a.c.a.a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.a.c:
//            c, l, k, n, 
//            m

class j extends c
{

    ArrayList a;
    private final a b;
    private final WeakReference c;
    private long d;
    private boolean e;
    private long f;
    private boolean g;
    private Interpolator h;
    private boolean i;
    private b j;
    private l k;
    private Runnable l;
    private HashMap m;

    j(View view)
    {
        e = false;
        f = 0L;
        g = false;
        i = false;
        j = null;
        k = new l(this, null);
        a = new ArrayList();
        l = new k(this);
        m = new HashMap();
        c = new WeakReference(view);
        b = com.a.c.a.a.a(view);
    }

    private float a(int i1)
    {
        switch (i1)
        {
        default:
            return 0.0F;

        case 1: // '\001'
            return b.k();

        case 2: // '\002'
            return b.l();

        case 16: // '\020'
            return b.d();

        case 32: // ' '
            return b.e();

        case 64: // '@'
            return b.f();

        case 4: // '\004'
            return b.g();

        case 8: // '\b'
            return b.h();

        case 128: 
            return b.m();

        case 256: 
            return b.n();

        case 512: 
            return b.a();
        }
    }

    static b a(j j1, b b1)
    {
        j1.j = b1;
        return b1;
    }

    private void a(int i1, float f1)
    {
        float f2 = a(i1);
        a(i1, f2, f1 - f2);
    }

    private void a(int i1, float f1, float f2)
    {
        if (m.size() <= 0) goto _L2; else goto _L1
_L1:
        Iterator iterator = m.keySet().iterator();
_L6:
        if (!iterator.hasNext()) goto _L4; else goto _L3
_L3:
        Object obj;
        n n1;
        obj = (com.a.a.a)iterator.next();
        n1 = (n)m.get(obj);
        if (!n1.a(i1) || n1.a != 0) goto _L6; else goto _L5
_L5:
        if (obj != null)
        {
            ((com.a.a.a) (obj)).b();
        }
_L2:
        obj = new m(i1, f1, f2);
        a.add(obj);
        obj = (View)c.get();
        if (obj != null)
        {
            ((View) (obj)).removeCallbacks(l);
            ((View) (obj)).post(l);
        }
        return;
_L4:
        obj = null;
        if (true) goto _L5; else goto _L7
_L7:
    }

    static void a(j j1)
    {
        j1.b();
    }

    static void a(j j1, int i1, float f1)
    {
        j1.b(i1, f1);
    }

    static b b(j j1)
    {
        return j1.j;
    }

    private void b()
    {
        an an1 = an.b(new float[] {
            1.0F
        });
        ArrayList arraylist = (ArrayList)a.clone();
        a.clear();
        int k1 = arraylist.size();
        int i1 = 0;
        int j1 = 0;
        for (; i1 < k1; i1++)
        {
            j1 |= ((m)arraylist.get(i1)).a;
        }

        m.put(an1, new n(j1, arraylist));
        an1.a(k);
        an1.a(k);
        if (g)
        {
            an1.e(f);
        }
        if (e)
        {
            an1.c(d);
        }
        if (i)
        {
            an1.a(h);
        }
        an1.a();
    }

    private void b(int i1, float f1)
    {
        switch (i1)
        {
        default:
            return;

        case 1: // '\001'
            b.i(f1);
            return;

        case 2: // '\002'
            b.j(f1);
            return;

        case 16: // '\020'
            b.d(f1);
            return;

        case 32: // ' '
            b.e(f1);
            return;

        case 64: // '@'
            b.f(f1);
            return;

        case 4: // '\004'
            b.g(f1);
            return;

        case 8: // '\b'
            b.h(f1);
            return;

        case 128: 
            b.k(f1);
            return;

        case 256: 
            b.l(f1);
            return;

        case 512: 
            b.a(f1);
            break;
        }
    }

    static HashMap c(j j1)
    {
        return j1.m;
    }

    static WeakReference d(j j1)
    {
        return j1.c;
    }

    public c a(float f1)
    {
        a(4, f1);
        return this;
    }

    public c a(long l1)
    {
        if (l1 < 0L)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Animators cannot have negative duration: ").append(l1).toString());
        } else
        {
            e = true;
            d = l1;
            return this;
        }
    }

    public void a()
    {
        b();
    }

    public c b(float f1)
    {
        a(8, f1);
        return this;
    }
}
