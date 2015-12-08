// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.honeycomb.ui;

import android.content.SharedPreferences;
import android.os.Handler;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.google.android.apps.youtube.app.honeycomb.phone.YouTubeActivity;
import com.google.android.apps.youtube.app.remote.YouTubeTvScreen;
import com.google.android.apps.youtube.app.remote.YouTubeTvScreensMonitor;
import com.google.android.apps.youtube.app.remote.bg;
import com.google.android.apps.youtube.app.remote.bi;
import com.google.android.apps.youtube.app.ui.TutorialView;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.youtube.j;
import com.google.android.youtube.l;
import com.google.android.youtube.p;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.app.honeycomb.ui:
//            i, h

public final class g
    implements bi
{

    private final YouTubeActivity a;
    private final SharedPreferences b;
    private final YouTubeTvScreensMonitor c;
    private final Handler d = new i(this);
    private TutorialView e;
    private View f;
    private boolean g;
    private boolean h;
    private boolean i;

    public g(YouTubeActivity youtubeactivity, SharedPreferences sharedpreferences, YouTubeTvScreensMonitor youtubetvscreensmonitor)
    {
        a = (YouTubeActivity)com.google.android.apps.youtube.common.fromguava.c.a(youtubeactivity);
        b = (SharedPreferences)com.google.android.apps.youtube.common.fromguava.c.a(sharedpreferences);
        c = (YouTubeTvScreensMonitor)com.google.android.apps.youtube.common.fromguava.c.a(youtubetvscreensmonitor);
    }

    static SharedPreferences a(g g1)
    {
        return g1.b;
    }

    static void b(g g1)
    {
        g1.c();
    }

    private void c()
    {
        Iterator iterator;
        if (f == null || g || h || i || !b.getBoolean("show_dial_screen_tutorial", true) || b.getBoolean("show_channel_store_turorial", true))
        {
            break MISSING_BLOCK_LABEL_234;
        }
        iterator = c.a().iterator();
_L4:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        if (!((YouTubeTvScreen)iterator.next()).hasDevice()) goto _L4; else goto _L3
_L3:
        boolean flag = true;
_L5:
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_234;
        }
        flag = true;
_L6:
        if (flag)
        {
            if (e == null)
            {
                ViewGroup viewgroup = (ViewGroup)a.getWindow().getDecorView();
                e = (TutorialView)a.getLayoutInflater().inflate(l.br, viewgroup).findViewById(j.fL);
                e.setDismissListener(new h(this));
                e.setText(Html.fromHtml(a.getString(p.aQ)));
                e.setAlignTextToCling(8);
            }
            e.setTargetView(a.getWindow().getDecorView(), f);
            e.setVisibility(0);
            return;
        } else
        {
            a();
            return;
        }
_L2:
        flag = false;
          goto _L5
        flag = false;
          goto _L6
    }

    public final void a()
    {
        if (e != null)
        {
            e.setVisibility(8);
        }
    }

    public final void a(View view)
    {
        f = view;
        c();
    }

    public final void a(bg bg)
    {
        c();
    }

    public final void a(boolean flag)
    {
        g = flag;
        if (!flag && b.getBoolean("show_dial_screen_tutorial", true))
        {
            d.sendEmptyMessageDelayed(0, 100L);
        }
    }

    public final void b()
    {
        if (b.getBoolean("show_dial_screen_tutorial", true))
        {
            d.sendEmptyMessageDelayed(0, 500L);
        }
    }

    public final void b(bg bg)
    {
        c();
    }

    public final void b(boolean flag)
    {
        h = flag;
        c();
    }

    public final void c(boolean flag)
    {
        i = flag;
        c();
    }
}
