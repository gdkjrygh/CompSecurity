// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import android.app.Activity;
import android.view.View;
import android.widget.ListView;
import com.google.android.apps.youtube.app.am;
import com.google.android.apps.youtube.app.aw;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.client.bc;
import com.google.android.apps.youtube.core.client.bj;
import com.google.android.apps.youtube.core.player.ae;
import com.google.android.apps.youtube.core.player.event.ac;
import com.google.android.apps.youtube.datalib.legacy.model.VastAd;
import com.google.android.youtube.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            b, gt, u, t

public final class s
{

    private final ListView a;
    private final int b = 0;
    private final List c = new ArrayList();
    private u d;
    private boolean e;
    private VastAd f;

    public s(Activity activity, bc bc, bj bj, am am, aw aw1, View view, ListView listview, 
            int i, ae ae1)
    {
        a = (ListView)com.google.android.apps.youtube.common.fromguava.c.a(listview);
        e = true;
        if (aw1.W())
        {
            c.add(new b(activity, bj, view.findViewById(j.t), ae1.a()));
        }
        c.add(new gt(activity, bc, bj, am, view.findViewById(j.f)));
    }

    private void a(VastAd vastad)
    {
        b();
        f = vastad;
        Iterator iterator = c.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            u u1 = (u)iterator.next();
            if (!u1.a(vastad))
            {
                continue;
            }
            d = u1;
            break;
        } while (true);
    }

    private void handleVideoStageEvent(ac ac1)
    {
        t.a[ac1.c().ordinal()];
        JVM INSTR tableswitch 1 3: default 36
    //                   1 37
    //                   2 46
    //                   3 81;
           goto _L1 _L2 _L3 _L4
_L1:
        return;
_L2:
        a(ac1.e());
        return;
_L3:
        ac1 = ac1.e();
        if (f != ac1)
        {
            a(ac1);
        }
        if (d != null)
        {
            d.b();
            return;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (d != null && d.a().getVisibility() == 0 && e)
        {
            ac1 = d.a();
            float f1 = ac1.getY();
            int i = (int)Math.floor((float)ac1.getHeight() + f1);
            a.smoothScrollToPositionFromTop(b, -i, 400);
            return;
        }
        if (true) goto _L1; else goto _L5
_L5:
    }

    public final void a()
    {
        if (d != null)
        {
            d.d();
        }
    }

    public final void a(int i)
    {
        if (i == 1)
        {
            e = false;
        }
    }

    public final void b()
    {
        for (Iterator iterator = c.iterator(); iterator.hasNext(); ((u)iterator.next()).c()) { }
        d = null;
        e = true;
    }
}
