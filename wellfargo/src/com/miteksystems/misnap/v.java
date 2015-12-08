// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.miteksystems.misnap;

import android.os.Handler;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;

// Referenced classes of package com.miteksystems.misnap:
//            MiSnap, t, MiSnapAPI, i

final class v
    implements Runnable
{

    final t a;

    v(t t1)
    {
        a = t1;
        super();
    }

    public final void run()
    {
        MiSnap.i = true;
        t.n(a).a(true);
        t.a = false;
        if (t.n(a).a.aj() == 0)
        {
            t.a(a, false);
            t.B(a).setVisibility(4);
            t.C(a).setVisibility(0);
            t.b(a, true);
            android.widget.RelativeLayout.LayoutParams layoutparams = new android.widget.RelativeLayout.LayoutParams(-1, -1);
            layoutparams.setMargins(0, 0, 0, t.D(a));
            t.E(a).setLayoutParams(layoutparams);
            a.j.sendEmptyMessage(2);
        } else
        {
            t.a(a, true);
            android.widget.RelativeLayout.LayoutParams layoutparams1 = new android.widget.RelativeLayout.LayoutParams(-1, -1);
            layoutparams1.setMargins(0, 0, 0, t.D(a));
            t.E(a).setLayoutParams(layoutparams1);
            t.B(a).setVisibility(0);
            t.C(a).setVisibility(0);
            a.b(true);
            t.b(a, false);
            t.F(a).setVisibility(8);
            if (t.n(a).a.at())
            {
                t.G(a).setText(R.string.dialog_mitek_capture);
                a.l.a(t.G(a), R.string.dialog_mitek_capture);
            } else
            {
                t.G(a).setText(t.n(a).a.ai());
                a.l.a(t.G(a), t.n(a).a.ai());
            }
        }
        a.postInvalidate();
    }
}
