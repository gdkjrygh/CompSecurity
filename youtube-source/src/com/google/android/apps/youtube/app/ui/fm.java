// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.google.android.apps.youtube.app.adapter.ae;
import com.google.android.apps.youtube.app.adapter.ag;
import com.google.android.apps.youtube.app.adapter.ai;
import com.google.android.apps.youtube.app.am;
import com.google.android.apps.youtube.common.a.a;
import com.google.android.apps.youtube.common.a.b;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.client.WatchFeature;
import com.google.android.apps.youtube.core.client.bj;
import com.google.android.apps.youtube.datalib.legacy.model.Page;
import com.google.android.apps.youtube.datalib.model.gdata.Video;
import com.google.android.youtube.j;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            v, fq, fn, fo, 
//            fp

public abstract class fm
{

    private static final int f[];
    private static final int g[];
    protected final Context a;
    protected final am b;
    protected final bj c;
    protected final v d;
    protected final LinkedList e = new LinkedList();
    private final fp h;

    public fm(Context context, am am1, bj bj1, v v1, fp fp)
    {
        a = (Context)com.google.android.apps.youtube.common.fromguava.c.a(context);
        b = (am)com.google.android.apps.youtube.common.fromguava.c.a(am1);
        c = (bj)com.google.android.apps.youtube.common.fromguava.c.a(bj1);
        d = (v)com.google.android.apps.youtube.common.fromguava.c.a(v1);
        h = fp;
    }

    static fp a(fm fm1)
    {
        return fm1.h;
    }

    static int[] a()
    {
        return f;
    }

    static int[] b()
    {
        return g;
    }

    public final void a(Activity activity, Object obj)
    {
        fq fq1;
        for (Iterator iterator = e.iterator(); iterator.hasNext(); a(fq1, obj))
        {
            fq1 = (fq)iterator.next();
            com.google.android.apps.youtube.app.ui.fq.a(fq1, obj);
        }

        a(obj, ((b) (com.google.android.apps.youtube.common.a.a.a(activity, new fn(this)))));
    }

    public final void a(View view)
    {
        a(view, ag.c(a, c, d), 8);
    }

    public final void a(View view, ai ai1, int i)
    {
        LinkedList linkedlist = e;
        Context context = a;
        linkedlist.add(new fq(this, view, ai1, i));
    }

    protected final void a(fq fq1, Page page)
    {
        int l = page.totalResults;
        if (l > 0)
        {
            for (int i = 0; i < com.google.android.apps.youtube.app.ui.fq.b(fq1); i++)
            {
                int k = com.google.android.apps.youtube.app.ui.fq.c(fq1);
                if (l > i)
                {
                    Video video = (Video)page.entries.get(i);
                    fq.f(fq1).a(fq.d(fq1)[i], fq1.a).a(i, video);
                    fq.d(fq1)[i].setOnClickListener(new fo(this, video));
                    k = 0;
                }
                fq.d(fq1)[i].setVisibility(k);
                if (fq.e(fq1)[i] != null)
                {
                    fq.e(fq1)[i].setVisibility(k);
                }
            }

        }
    }

    protected void a(fq fq1, Object obj)
    {
    }

    protected abstract void a(Object obj);

    protected abstract void a(Object obj, b b1);

    protected final void a(String s)
    {
        b.a(s, false, WatchFeature.RELATED);
    }

    static 
    {
        f = (new int[] {
            j.fg, j.fh, j.fi
        });
        g = (new int[] {
            j.ev, j.ew, j.ex
        });
    }
}
