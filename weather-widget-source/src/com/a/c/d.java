// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.c;

import android.view.View;
import android.view.animation.Interpolator;
import com.a.a.a;
import com.a.a.an;
import com.a.a.b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.a.c:
//            c, f, e, h, 
//            g

class d extends c
{

    ArrayList a;
    private final WeakReference b;
    private long c;
    private boolean d;
    private long e;
    private boolean f;
    private Interpolator g;
    private boolean h;
    private b i;
    private f j;
    private Runnable k;
    private HashMap l;

    d(View view)
    {
        d = false;
        e = 0L;
        f = false;
        h = false;
        i = null;
        j = new f(this, null);
        a = new ArrayList();
        k = new e(this);
        l = new HashMap();
        b = new WeakReference(view);
    }

    private float a(int i1)
    {
        View view = (View)b.get();
        if (view == null) goto _L2; else goto _L1
_L1:
        i1;
        JVM INSTR lookupswitch 10: default 108
    //                   1: 110
    //                   2: 115
    //                   4: 135
    //                   8: 140
    //                   16: 120
    //                   32: 125
    //                   64: 130
    //                   128: 145
    //                   256: 150
    //                   512: 155;
           goto _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12
_L2:
        return 0.0F;
_L3:
        return view.getTranslationX();
_L4:
        return view.getTranslationY();
_L7:
        return view.getRotation();
_L8:
        return view.getRotationX();
_L9:
        return view.getRotationY();
_L5:
        return view.getScaleX();
_L6:
        return view.getScaleY();
_L10:
        return view.getX();
_L11:
        return view.getY();
_L12:
        return view.getAlpha();
    }

    static b a(d d1, b b1)
    {
        d1.i = b1;
        return b1;
    }

    private void a(int i1, float f1)
    {
        float f2 = a(i1);
        a(i1, f2, f1 - f2);
    }

    private void a(int i1, float f1, float f2)
    {
        if (l.size() <= 0) goto _L2; else goto _L1
_L1:
        Iterator iterator = l.keySet().iterator();
_L6:
        if (!iterator.hasNext()) goto _L4; else goto _L3
_L3:
        Object obj;
        h h1;
        obj = (a)iterator.next();
        h1 = (h)l.get(obj);
        if (!h1.a(i1) || h1.a != 0) goto _L6; else goto _L5
_L5:
        if (obj != null)
        {
            ((a) (obj)).b();
        }
_L2:
        obj = new g(i1, f1, f2);
        a.add(obj);
        obj = (View)b.get();
        if (obj != null)
        {
            ((View) (obj)).removeCallbacks(k);
            ((View) (obj)).post(k);
        }
        return;
_L4:
        obj = null;
        if (true) goto _L5; else goto _L7
_L7:
    }

    static void a(d d1)
    {
        d1.b();
    }

    static void a(d d1, int i1, float f1)
    {
        d1.b(i1, f1);
    }

    static b b(d d1)
    {
        return d1.i;
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
            j1 |= ((g)arraylist.get(i1)).a;
        }

        l.put(an1, new h(j1, arraylist));
        an1.a(j);
        an1.a(j);
        if (f)
        {
            an1.e(e);
        }
        if (d)
        {
            an1.c(c);
        }
        if (h)
        {
            an1.a(g);
        }
        an1.a();
    }

    private void b(int i1, float f1)
    {
        View view = (View)b.get();
        if (view == null) goto _L2; else goto _L1
_L1:
        i1;
        JVM INSTR lookupswitch 10: default 108
    //                   1: 109
    //                   2: 115
    //                   4: 139
    //                   8: 145
    //                   16: 121
    //                   32: 127
    //                   64: 133
    //                   128: 151
    //                   256: 157
    //                   512: 163;
           goto _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12
_L2:
        return;
_L3:
        view.setTranslationX(f1);
        return;
_L4:
        view.setTranslationY(f1);
        return;
_L7:
        view.setRotation(f1);
        return;
_L8:
        view.setRotationX(f1);
        return;
_L9:
        view.setRotationY(f1);
        return;
_L5:
        view.setScaleX(f1);
        return;
_L6:
        view.setScaleY(f1);
        return;
_L10:
        view.setX(f1);
        return;
_L11:
        view.setY(f1);
        return;
_L12:
        view.setAlpha(f1);
        return;
    }

    static HashMap c(d d1)
    {
        return d1.l;
    }

    static WeakReference d(d d1)
    {
        return d1.b;
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
            d = true;
            c = l1;
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
