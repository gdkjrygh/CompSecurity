// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.pla.internal;

import android.graphics.Rect;
import android.view.View;

// Referenced classes of package com.jiubang.pla.internal:
//            PLA_AbsListView

class g
    implements Runnable
{

    final PLA_AbsListView a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private final int g;

    public void run()
    {
        int j1;
        int k1;
        j1 = a.getHeight();
        k1 = a.B;
        b;
        JVM INSTR tableswitch 1 4: default 52
    //                   1 53
    //                   2 345
    //                   3 191
    //                   4 445;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        return;
_L2:
        int i = a.getChildCount() - 1;
        k1 += i;
        if (i >= 0)
        {
            if (k1 == e)
            {
                a.post(this);
                return;
            }
            View view = a.getChildAt(i);
            int l1 = view.getHeight();
            int k2 = view.getTop();
            if (k1 < a.M - 1)
            {
                i = g;
            } else
            {
                i = a.l.bottom;
            }
            a.b(i + (l1 - (j1 - k2)), f);
            e = k1;
            if (k1 < c)
            {
                a.post(this);
                return;
            }
        }
        continue; /* Loop/switch isn't completed */
_L4:
        int j = a.getChildCount();
        if (k1 != d && j > 1 && j + k1 < a.M)
        {
            int k = k1 + 1;
            if (k == e)
            {
                a.post(this);
                return;
            }
            View view1 = a.getChildAt(1);
            j1 = view1.getHeight();
            k1 = view1.getTop();
            int i2 = g;
            if (k < d)
            {
                a.b(Math.max(0, (k1 + j1) - i2), f);
                e = k;
                a.post(this);
                return;
            }
            if (k1 > i2)
            {
                a.b(k1 - i2, f);
                return;
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
        if (k1 == e)
        {
            a.post(this);
            return;
        }
        View view2 = a.getChildAt(0);
        if (view2 != null)
        {
            j1 = view2.getTop();
            int l;
            if (k1 > 0)
            {
                l = g;
            } else
            {
                l = a.l.top;
            }
            a.b(j1 - l, f);
            e = k1;
            if (k1 > c)
            {
                a.post(this);
                return;
            }
        }
        if (true)
        {
            continue; /* Loop/switch isn't completed */
        }
_L5:
        int j2 = a.getChildCount() - 2;
        if (j2 >= 0)
        {
            int i1 = k1 + j2;
            if (i1 == e)
            {
                a.post(this);
                return;
            }
            View view3 = a.getChildAt(j2);
            k1 = view3.getHeight();
            j2 = view3.getTop();
            e = i1;
            if (i1 > d)
            {
                a.b(-(j1 - j2 - g), f);
                a.post(this);
                return;
            }
            i1 = j1 - g;
            j1 = j2 + k1;
            if (i1 > j1)
            {
                a.b(-(i1 - j1), f);
                return;
            }
        }
        if (true) goto _L1; else goto _L6
_L6:
    }
}
