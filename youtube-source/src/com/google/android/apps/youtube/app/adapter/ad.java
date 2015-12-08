// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.youtube.core.utils.p;
import com.google.android.apps.youtube.datalib.legacy.model.Playlist;
import com.google.android.youtube.h;

// Referenced classes of package com.google.android.apps.youtube.app.adapter:
//            at, au

public final class ad extends at
{

    private final int b = 0;
    private final int d = 1;
    private final int e;
    private final int f;
    private final int g;

    public ad(Context context, int i)
    {
        super(context, i);
        if (p.a(context))
        {
            i = 3;
            e = 2;
        } else
        {
            e = -1;
            i = 2;
        }
        f = i;
        g = i + 1;
    }

    public final Playlist a(int i)
    {
        if (i < g || i >= getCount())
        {
            return null;
        } else
        {
            return (Playlist)super.getItem(i - g);
        }
    }

    public final boolean b(int i)
    {
        return i == f;
    }

    public final boolean c(int i)
    {
        return i == d;
    }

    public final boolean d(int i)
    {
        return i == b;
    }

    public final boolean e(int i)
    {
        return i == e;
    }

    public final int getCount()
    {
        return super.getCount() + g;
    }

    public final Object getItem(int i)
    {
        return a(i);
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        au au1;
        view = a(view, viewgroup);
        au1 = (au)view.getTag();
        View view1 = au1.c;
        byte byte0;
        if (i == 0)
        {
            byte0 = 8;
        } else
        {
            byte0 = 0;
        }
        view1.setVisibility(byte0);
        if (i >= g)
        {
            return a((Playlist)super.getItem(i - g), view, viewgroup);
        }
        if (!d(i)) goto _L2; else goto _L1
_L1:
        au1.a.setText(com.google.android.youtube.p.aj);
        au1.b.setImageResource(h.K);
_L4:
        return view;
_L2:
        if (c(i))
        {
            au1.a.setText(com.google.android.youtube.p.ad);
            au1.b.setImageResource(h.H);
        } else
        if (e(i))
        {
            au1.a.setText(com.google.android.youtube.p.ch);
            au1.b.setImageResource(h.I);
        } else
        if (b(i))
        {
            au1.a.setText(com.google.android.youtube.p.aD);
            au1.b.setImageResource(h.G);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}
