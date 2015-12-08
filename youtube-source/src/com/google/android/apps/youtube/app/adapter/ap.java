// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.adapter;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.youtube.datalib.legacy.model.Playlist;
import com.google.android.youtube.j;
import com.google.android.youtube.o;

// Referenced classes of package com.google.android.apps.youtube.app.adapter:
//            ae, ao

final class ap
    implements ae
{

    final ao a;
    private final TextView b;
    private final TextView c;
    private final TextView d;
    private final View e;
    private final int f;
    private final int g;
    private final int h;
    private final int i;

    private ap(ao ao1, View view)
    {
        a = ao1;
        super();
        e = view.findViewById(j.dF);
        b = (TextView)e.findViewById(j.fF);
        c = (TextView)e.findViewById(j.y);
        d = (TextView)e.findViewById(j.fV);
        f = b.getPaddingLeft();
        g = b.getPaddingTop();
        h = b.getPaddingRight();
        i = b.getPaddingBottom();
    }

    ap(ao ao1, View view, ViewGroup viewgroup)
    {
        this(ao1, view);
    }

    public final View a(int k, Object obj)
    {
        obj = (Playlist)obj;
        if (b != null)
        {
            b.setText(((Playlist) (obj)).title);
            TextView textview = b;
            int l = f;
            int i1 = g;
            int j1 = h;
            if (c != null && ao.a(a))
            {
                k = 0;
            } else
            {
                k = i;
            }
            textview.setPadding(l, i1, j1, k);
        }
        if (c != null && ao.a(a))
        {
            c.setText(((Playlist) (obj)).author);
            textview = c;
            if (ao.a(a))
            {
                k = 0;
            } else
            {
                k = 8;
            }
            textview.setVisibility(k);
        }
        if (d != null)
        {
            d.setText(ao.b(a).getQuantityString(o.l, ((Playlist) (obj)).size, new Object[] {
                Integer.valueOf(((Playlist) (obj)).size)
            }));
        }
        return e;
    }
}
