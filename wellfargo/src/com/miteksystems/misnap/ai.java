// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.miteksystems.misnap;

import android.os.Handler;
import android.util.Log;
import android.widget.ImageView;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.miteksystems.misnap:
//            t, MiSnap, MiSnapAPI

final class ai
    implements Runnable
{

    final t a;

    ai(t t1)
    {
        a = t1;
        super();
    }

    public final void run()
    {
        Object obj;
        if (t.k(a))
        {
            return;
        }
        t.a(a, 0);
        if (t.l(a))
        {
            t.m(a).postDelayed(this, 1800L);
            return;
        }
        int j = t.n(a).a.J();
        if (t.o(a).size() == 0 || t.p(a).isShown() || t.q(a) || !t.i(a).isShown())
        {
            StringBuilder stringbuilder = (new StringBuilder("restarting smart-bubble in ")).append(j).append("ms (bubbleMap.size=").append(t.o(a).size()).append(", ghostImage.isShown()=");
            String s;
            if (t.p(a).isShown())
            {
                s = "1";
            } else
            {
                s = "0";
            }
            stringbuilder = stringbuilder.append(s).append(", ghostAnimationRunning=");
            if (t.q(a))
            {
                s = "1";
            } else
            {
                s = "0";
            }
            stringbuilder = stringbuilder.append(s).append(", !mGaugeImage.isShown()");
            if (!t.i(a).isShown())
            {
                s = "1";
            } else
            {
                s = "0";
            }
            stringbuilder.append(s).toString();
            t.m(a).postDelayed(this, j);
            return;
        }
        StringBuilder stringbuilder1 = (new StringBuilder("calculating smart-bubble in ")).append(j).append("ms (bubbleMap.size=").append(t.o(a).size()).append(", ghostImage.isShown()=");
        Iterator iterator;
        int i;
        if (t.p(a).isShown())
        {
            obj = "1";
        } else
        {
            obj = "0";
        }
        stringbuilder1 = stringbuilder1.append(((String) (obj))).append(", ghostAnimationRunning=");
        if (t.q(a))
        {
            obj = "1";
        } else
        {
            obj = "0";
        }
        stringbuilder1 = stringbuilder1.append(((String) (obj))).append(", !mGaugeImage.isShown()");
        if (!t.i(a).isShown())
        {
            obj = "1";
        } else
        {
            obj = "0";
        }
        stringbuilder1.append(((String) (obj))).toString();
        iterator = t.o(a).entrySet().iterator();
        i = 0;
        obj = null;
        do
        {
            if (!iterator.hasNext())
            {
                if (i < t.n(a).a.K())
                {
                    t.m(a).postDelayed(this, j / (i + 1));
                    return;
                }
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
            int k = ((Integer)entry.getKey()).intValue();
            if ((k == 0 || 1 == k || 2 == k || 3 == k) && (k != 0 || t.n(a).b == null || !t.n(a).x) && (obj == null || ((AtomicInteger)entry.getValue()).intValue() > i))
            {
                i = ((AtomicInteger)entry.getValue()).intValue();
                obj = entry;
            }
        } while (true);
        ((Integer)((java.util.Map.Entry) (obj)).getKey()).intValue();
        JVM INSTR tableswitch 0 3: default 620
    //                   0 648
    //                   1 679
    //                   2 705
    //                   3 731;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        Log.e("MiSnap", (new StringBuilder("unknown help bubble event ")).append(((java.util.Map.Entry) (obj)).getKey()).toString());
        return;
_L2:
        t.a(a, R.drawable.error_more_light);
        t.n(a).a(R.string.uxp_brightness_help);
_L7:
        a.c();
        return;
_L3:
        t.a(a, R.drawable.error_center);
        t.n(a).a(R.string.uxp_angle_help);
        continue; /* Loop/switch isn't completed */
_L4:
        t.a(a, R.drawable.error_getcloser);
        t.n(a).a(R.string.uxp_closeness_help);
        continue; /* Loop/switch isn't completed */
_L5:
        t.a(a, R.drawable.error_hold_steady);
        t.n(a).a(R.string.uxp_sharpness_help);
        if (true) goto _L7; else goto _L6
_L6:
    }
}
