// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.youtube.app.ui.presenter.ax;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.utils.p;
import com.google.android.apps.youtube.datalib.legacy.model.x;
import com.google.android.youtube.h;
import com.google.android.youtube.j;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            is, ij, iq

final class ip
    implements is
{

    final ij a;
    private final View b;
    private final TextView c;
    private final TextView d;
    private final TextView e;
    private final TextView f;
    private final ax g;
    private final TextView h;
    private final ImageView i;

    public ip(ij ij1, View view)
    {
        a = ij1;
        super();
        b = (View)com.google.android.apps.youtube.common.fromguava.c.a(view);
        View view1 = view.findViewById(j.bD);
        c = (TextView)com.google.android.apps.youtube.common.fromguava.c.a((TextView)view.findViewById(j.fF));
        d = (TextView)com.google.android.apps.youtube.common.fromguava.c.a((TextView)view.findViewById(j.cg));
        e = (TextView)com.google.android.apps.youtube.common.fromguava.c.a((TextView)view.findViewById(j.aM));
        f = (TextView)com.google.android.apps.youtube.common.fromguava.c.a((TextView)view.findViewById(j.cN));
        if (p.a(ij.a(ij1)))
        {
            g = new ax(view, ij.b(ij1));
        } else
        {
            g = null;
        }
        h = (TextView)view.findViewById(j.aH);
        i = (ImageView)view.findViewById(j.ba);
        d.setOnClickListener(com.google.android.apps.youtube.app.ui.ij.c(ij1));
        e.setOnClickListener(ij.d(ij1));
        if (h != null && view1 != null)
        {
            view1.setOnClickListener(new iq(this, ij1));
        }
    }

    static TextView a(ip ip1)
    {
        return ip1.d;
    }

    static TextView b(ip ip1)
    {
        return ip1.e;
    }

    public final void a()
    {
        if (g == null)
        {
            return;
        } else
        {
            g.d();
            return;
        }
    }

    public final void a(CharSequence charsequence)
    {
        c.setText(charsequence);
    }

    public final void a(CharSequence charsequence, CharSequence charsequence1, CharSequence charsequence2)
    {
        f.setText(charsequence);
        d.setText(charsequence1);
        e.setText(charsequence2);
        a.c(b);
    }

    public final void a(boolean flag)
    {
        d.setEnabled(flag);
        e.setEnabled(flag);
    }

    public final void a(boolean flag, x x)
    {
        if (g == null)
        {
            return;
        }
        if (!flag)
        {
            g.a();
            return;
        } else
        {
            g.a(x);
            return;
        }
    }

    public final void b(CharSequence charsequence)
    {
        if (h != null)
        {
            h.setText(charsequence);
            a.c(b);
        }
    }

    public final void b(boolean flag)
    {
        if (h != null)
        {
            TextView textview = h;
            int k;
            if (flag)
            {
                k = 0;
            } else
            {
                k = 8;
            }
            textview.setVisibility(k);
            if (i != null)
            {
                ImageView imageview = i;
                if (flag)
                {
                    k = h.e;
                } else
                {
                    k = h.d;
                }
                imageview.setImageResource(k);
            }
            a.c(b);
        }
    }
}
