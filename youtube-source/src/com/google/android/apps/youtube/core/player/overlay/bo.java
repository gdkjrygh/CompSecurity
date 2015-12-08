// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player.overlay;

import android.os.CountDownTimer;
import com.google.android.apps.youtube.common.e.b;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.player.PlaybackClientManager;
import com.google.android.apps.youtube.core.player.am;
import com.google.android.apps.youtube.core.player.at;
import com.google.android.apps.youtube.core.player.au;
import com.google.android.apps.youtube.core.player.av;
import com.google.android.apps.youtube.core.player.event.ac;
import com.google.android.apps.youtube.datalib.legacy.model.Survey;
import com.google.android.apps.youtube.datalib.legacy.model.SurveyQuestion;
import com.google.android.apps.youtube.datalib.legacy.model.VastAd;
import com.google.android.apps.youtube.datalib.legacy.model.aw;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.apps.youtube.core.player.overlay:
//            bm, bp, bq

public final class bo
    implements av
{

    private final bm a;
    private final PlaybackClientManager b;
    private final b c;
    private final au d;
    private final am e;
    private Survey f;
    private CountDownTimer g;
    private aw h;
    private at i;
    private boolean j;
    private boolean k;

    public bo(PlaybackClientManager playbackclientmanager, bm bm1, b b1, au au1, am am1)
    {
        a = (bm)com.google.android.apps.youtube.common.fromguava.c.a(bm1);
        c = (b)com.google.android.apps.youtube.common.fromguava.c.a(b1);
        d = (au)com.google.android.apps.youtube.common.fromguava.c.a(au1);
        b = (PlaybackClientManager)com.google.android.apps.youtube.common.fromguava.c.a(playbackclientmanager);
        e = (am)com.google.android.apps.youtube.common.fromguava.c.a(am1);
        bm1.setListener(new bp(this));
        c();
    }

    static void a(bo bo1, int l, int i1)
    {
        bo1.h.b();
        bo1.b.a(bo1.h);
        bo1.b.a(l, i1);
        bo1.e();
    }

    static void a(bo bo1, long l)
    {
        if (bo1.f != null && bo1.f.getQuestions().size() != 0)
        {
            long l1 = (long)(((SurveyQuestion)bo1.f.getQuestions().get(0)).getDurationSeconds() * 1000) - l;
            bo1.b.a(l1);
            if (l > 0L)
            {
                bo1.a.a((int)l);
                if (bo1.k && l1 >= 5000L && !bo1.j)
                {
                    bo1.j = true;
                    bo1.a.d();
                    bo1.b.k();
                    return;
                }
            } else
            {
                bo1.d();
                return;
            }
        }
    }

    static void a(bo bo1, int ai[])
    {
        if (bo1.h != null)
        {
            ArrayList arraylist = new ArrayList();
            for (int l = 0; l < ai.length; l++)
            {
                arraylist.add(Integer.valueOf(ai[l]));
            }

            bo1.h.a(arraylist);
        }
        bo1.b.l();
        bo1.b.g();
        bo1.b.a(bo1.h);
        bo1.e();
    }

    private static boolean a(VastAd vastad)
    {
        return vastad.getSurvey() != null;
    }

    private void c()
    {
        f();
        a.a();
        j = false;
        f = null;
    }

    private void d()
    {
        h.b();
        b.a(h);
        b.g();
        e();
    }

    private void e()
    {
        e.a(false);
        f();
        a.setVisible(false);
        if (i != null)
        {
            i.a();
            i = null;
        }
        f = null;
    }

    private void f()
    {
        if (g != null)
        {
            g.cancel();
            g = null;
        }
    }

    public final void a()
    {
        i = null;
        c();
    }

    public final void a(at at1)
    {
        i = at1;
        at1 = f.getQuestion(0);
        j = false;
        a.a(at1.getQuestion(), at1.getAnswers(), at1.isMultiSelectQuestion());
        a.a((int)TimeUnit.MILLISECONDS.convert(at1.getDurationSeconds(), TimeUnit.SECONDS));
        b.b(0L);
        h = new aw(c);
        int l = at1.getDurationSeconds();
        g = new bq(this, (int)TimeUnit.MILLISECONDS.convert(l, TimeUnit.SECONDS));
        g.start();
        h.a();
        a.setVisible(true);
        e.a(true);
    }

    public final void b()
    {
        if (f != null)
        {
            d();
        }
    }

    public final void handleVideoStageEvent(ac ac1)
    {
        if (ac1.c() == com.google.android.apps.youtube.core.player.Director.VideoStage.NEW)
        {
            c();
        } else
        if (ac1.c() == com.google.android.apps.youtube.core.player.Director.VideoStage.AD_LOADED)
        {
            ac1 = ac1.e();
            if (!a(ac1) || f != ac1.getSurvey())
            {
                c();
                if (a(ac1))
                {
                    k = ac1.isSkippable();
                    f = ac1.getSurvey();
                    d.a(this);
                    return;
                }
            }
        }
    }
}
