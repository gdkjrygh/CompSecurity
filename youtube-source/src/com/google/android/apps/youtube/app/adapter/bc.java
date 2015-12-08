// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.apps.youtube.app.ui.ha;
import com.google.android.youtube.j;

// Referenced classes of package com.google.android.apps.youtube.app.adapter:
//            ae, bb

final class bc
    implements ae
{

    public final ProgressBar a;
    public final TextView b;
    public final TextView c;
    final bb d;
    private final ae e;
    private final ae f;
    private final View g;
    private final TextView h;
    private final TextView i;

    bc(bb bb, View view, ViewGroup viewgroup, ae ae1, ae ae2)
    {
        this(bb, view, ae1, ae2);
    }

    private bc(bb bb, View view, ae ae1, ae ae2)
    {
        d = bb;
        super();
        e = ae1;
        f = ae2;
        g = view.findViewById(j.fZ);
        a = (ProgressBar)g.findViewById(j.dU);
        b = (TextView)g.findViewById(j.eK);
        c = (TextView)g.findViewById(j.dT);
        h = (TextView)g.findViewById(j.aP);
        i = (TextView)g.findViewById(j.aK);
    }

    private void a(int k)
    {
        a(((View) (a)), k);
        a(((View) (c)), k);
        a(((View) (b)), k);
    }

    private static void a(View view, int k)
    {
        if (view != null)
        {
            view.setVisibility(k);
        }
    }

    private void b(int k)
    {
        a(h, k);
        a(i, k);
        a(g.findViewById(j.D), k);
    }

    public final View a(int k, Object obj)
    {
        obj = (ha)obj;
        if (((ha) (obj)).a())
        {
            a(8);
            b(0);
            return e.a(k, ((ha) (obj)).a);
        } else
        {
            a(0);
            b(8);
            return f.a(k, ((ha) (obj)).b);
        }
    }
}
