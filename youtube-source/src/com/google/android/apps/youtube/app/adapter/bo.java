// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.adapter;

import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.datalib.model.gdata.Video;
import com.google.android.youtube.h;
import com.google.android.youtube.j;

// Referenced classes of package com.google.android.apps.youtube.app.adapter:
//            ae, j, h, bp

public final class bo
    implements ae, com.google.android.apps.youtube.app.adapter.j
{

    private final View a;
    private final com.google.android.apps.youtube.app.adapter.h b;
    private ImageView c;
    private final ImageView d;
    private final View e;
    private final Runnable f = new bp(this);

    public bo(com.google.android.apps.youtube.app.adapter.h h1, View view)
    {
        a = (View)com.google.android.apps.youtube.common.fromguava.c.a(view);
        b = (com.google.android.apps.youtube.app.adapter.h)com.google.android.apps.youtube.common.fromguava.c.a(h1);
        c = (ImageView)view.findViewById(j.fM);
        d = (ImageView)view.findViewById(j.bt);
        e = view.findViewById(j.fA);
        if (d != null || e != null)
        {
            h1.a(this);
        }
    }

    static View a(bo bo1)
    {
        return bo1.e;
    }

    public final View a(int i, Object obj)
    {
        obj = (Video)obj;
        a.removeCallbacks(f);
        if (d != null)
        {
            d.setVisibility(8);
        }
        if (e != null)
        {
            e.setBackgroundResource(h.h);
        }
        b.a(i, obj);
        if (((Video) (obj)).state == com.google.android.apps.youtube.datalib.model.gdata.Video.State.PLAYABLE || ((Video) (obj)).state == com.google.android.apps.youtube.datalib.model.gdata.Video.State.PROCESSING && ((Video) (obj)).isLive())
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (i != 0)
        {
            if (c != null)
            {
                c.setVisibility(8);
            }
        } else
        {
            if (c == null)
            {
                c = (ImageView)((ViewStub)a.findViewById(j.fN)).inflate();
            }
            c.setVisibility(0);
        }
        return a;
    }

    public final void a()
    {
        if (d != null)
        {
            d.setVisibility(0);
        }
    }

    public final void b()
    {
        a.post(f);
    }
}
