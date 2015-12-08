// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import android.os.Handler;
import android.os.Looper;
import android.widget.ImageView;
import com.google.android.apps.youtube.app.d.a;
import com.google.android.apps.youtube.app.d.e;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.client.bj;
import com.google.android.apps.youtube.datalib.innertube.a.b;
import com.google.android.apps.youtube.datalib.innertube.model.ao;
import com.google.android.apps.youtube.datalib.innertube.model.ap;
import com.google.android.youtube.j;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            gs

public final class gr
{

    private final bj a;
    private final ImageView b;
    private Handler c;
    private final Runnable d = new gs(this);
    private e e;
    private ap f;

    public gr(bj bj1, ImageView imageview)
    {
        a = (bj)com.google.android.apps.youtube.common.fromguava.c.a(bj1);
        b = (ImageView)com.google.android.apps.youtube.common.fromguava.c.a(imageview);
    }

    static ImageView a(gr gr1)
    {
        return gr1.b;
    }

    private Handler b()
    {
        if (c == null)
        {
            Handler handler = b.getHandler();
            if (handler == null)
            {
                handler = new Handler(Looper.getMainLooper());
            }
            c = handler;
        }
        return c;
    }

    static void b(gr gr1)
    {
        gr1.c();
    }

    private void c()
    {
        b().removeCallbacks(d);
        b().post(d);
    }

    static void c(gr gr1)
    {
        gr1.b().removeCallbacks(gr1.d);
        int i = gr1.b.getWidth();
        int k = gr1.b.getHeight();
        ao ao1;
        if (gr1.f != null && i != 0 && k != 0)
        {
            if ((ao1 = com.google.android.apps.youtube.datalib.innertube.a.b.a(gr1.f, i, k)) != null)
            {
                com.google.android.apps.youtube.app.d.a.a(gr1.b.getContext(), gr1.a, ao1.a(), gr1.b, gr1.e);
                gr1.e = null;
                return;
            }
        }
    }

    public final ImageView a()
    {
        return b;
    }

    public final void a(ap ap)
    {
        a(ap, null);
    }

    public final void a(ap ap, e e1)
    {
        f = ap;
        if (b.getTag(j.fz) != ap)
        {
            b.setImageBitmap(null);
            b.setTag(j.fz, ap);
        }
        if (ap != null)
        {
            e = e1;
            c();
        }
    }
}
