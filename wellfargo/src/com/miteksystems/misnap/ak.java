// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.miteksystems.misnap;

import android.app.AlertDialog;
import android.os.Handler;
import android.widget.ImageView;

// Referenced classes of package com.miteksystems.misnap:
//            t, MiSnap, MiSnapAPI

final class ak
    implements Runnable
{

    final t a;

    ak(t t1)
    {
        a = t1;
        super();
    }

    public final void run()
    {
        if (t.n(a).b == null)
        {
            return;
        }
        t t1 = a;
        t.b(t1, t.w(t1) + 1);
        if (t.w(a) > t.n(a).a.l())
        {
            if (t.m(a) != null && a.r != null)
            {
                t.m(a).removeCallbacks(a.r);
            }
            if (t.x(a) != null)
            {
                t.x(a).setVisibility(4);
            }
            a.j.sendEmptyMessage(9);
            return;
        }
        if ((t.y(a) == null || !t.y(a).isShowing()) && !t.k(a))
        {
            a.j.sendEmptyMessage(6);
            return;
        } else
        {
            t.m(a).postDelayed(t.z(a), t.A(a));
            return;
        }
    }
}
