// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.map;

import android.content.Context;
import android.graphics.Point;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.MotionEvent;
import eeh;
import eej;
import eem;
import eeo;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public final class MapViewExtension extends eeh
{

    private Handler a;
    private List b;
    private List c;

    public MapViewExtension(Context context)
    {
        this(context, null);
    }

    public MapViewExtension(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public MapViewExtension(Context context, AttributeSet attributeset, int k)
    {
        super(context, attributeset, k);
        a = new Handler();
        b = new CopyOnWriteArrayList();
        c = new CopyOnWriteArrayList();
    }

    static List a(MapViewExtension mapviewextension)
    {
        return mapviewextension.b;
    }

    private void j()
    {
        a.postDelayed(new Runnable() {

            final MapViewExtension a;

            public final void run()
            {
                for (Iterator iterator = MapViewExtension.a(a).iterator(); iterator.hasNext(); ((eeo)iterator.next()).s_()) { }
            }

            
            {
                a = MapViewExtension.this;
                super();
            }
        }, 100L);
    }

    public final volatile void a(Point point)
    {
        super.a(point);
    }

    public final volatile void a(eej eej)
    {
        super.a(eej);
    }

    public final void a(eem eem1)
    {
        c.add(eem1);
    }

    public final void a(eeo eeo1)
    {
        b.add(eeo1);
    }

    final boolean a()
    {
        return true;
    }

    protected final boolean a(int k, Point point)
    {
        k;
        JVM INSTR tableswitch 0 3: default 32
    //                   0 39
    //                   1 78
    //                   2 117
    //                   3 155;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        return super.a(k, point);
_L2:
        Iterator iterator = c.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                continue; /* Loop/switch isn't completed */
            }
        } while (!((eem)iterator.next()).a(point));
        return true;
_L3:
        Iterator iterator1 = c.iterator();
        do
        {
            if (!iterator1.hasNext())
            {
                continue; /* Loop/switch isn't completed */
            }
        } while (!((eem)iterator1.next()).b(point));
        return true;
_L4:
        Iterator iterator2 = c.iterator();
        do
        {
            if (!iterator2.hasNext())
            {
                continue; /* Loop/switch isn't completed */
            }
        } while (!((eem)iterator2.next()).j_());
        return true;
_L5:
        Iterator iterator3 = c.iterator();
        while (iterator3.hasNext()) 
        {
            if (((eem)iterator3.next()).k_())
            {
                return true;
            }
        }
        if (true) goto _L1; else goto _L6
_L6:
    }

    public final void b(eem eem1)
    {
        c.remove(eem1);
    }

    public final void b(eeo eeo1)
    {
        b.remove(eeo1);
    }

    final boolean b()
    {
        for (Iterator iterator = b.iterator(); iterator.hasNext(); ((eeo)iterator.next()).r_()) { }
        return false;
    }

    final boolean c()
    {
        for (Iterator iterator = b.iterator(); iterator.hasNext(); ((eeo)iterator.next()).t_()) { }
        j();
        return true;
    }

    final boolean d()
    {
        j();
        return false;
    }

    public final volatile boolean dispatchTouchEvent(MotionEvent motionevent)
    {
        return super.dispatchTouchEvent(motionevent);
    }

    final boolean e()
    {
        j();
        return false;
    }

    final boolean f()
    {
        for (Iterator iterator = b.iterator(); iterator.hasNext(); ((eeo)iterator.next()).g()) { }
        return true;
    }

    final boolean g()
    {
        for (Iterator iterator = b.iterator(); iterator.hasNext(); ((eeo)iterator.next()).h()) { }
        return true;
    }

    final boolean h()
    {
        return true;
    }

    final boolean i()
    {
        j();
        return true;
    }
}
