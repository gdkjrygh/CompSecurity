// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import android.app.Activity;
import android.app.AlertDialog;
import com.google.a.a.a.a.ai;
import com.google.a.a.a.a.ee;
import com.google.a.a.a.a.il;
import com.google.a.a.a.a.kx;
import com.google.a.a.a.a.kz;
import com.google.a.a.a.a.lv;
import com.google.a.a.a.a.lz;
import com.google.a.a.a.a.mh;
import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.Analytics;
import com.google.android.apps.youtube.core.ui.aa;
import com.google.android.apps.youtube.datalib.a.m;
import com.google.android.apps.youtube.datalib.d.a;
import com.google.android.apps.youtube.datalib.innertube.t;
import com.google.android.apps.youtube.datalib.innertube.u;
import com.google.android.youtube.p;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            hi

public final class hh
{

    private final Activity a;
    private final a b;
    private final Analytics c;
    private final t d;
    private AlertDialog e;
    private AlertDialog f;
    private kz g;

    public hh(Activity activity, a a1, Analytics analytics, t t1)
    {
        a = (Activity)com.google.android.apps.youtube.common.fromguava.c.a(activity);
        b = (a)com.google.android.apps.youtube.common.fromguava.c.a(a1);
        c = (Analytics)com.google.android.apps.youtube.common.fromguava.c.a(analytics);
        d = (t)com.google.android.apps.youtube.common.fromguava.c.a(t1);
    }

    static kz a(hh hh1)
    {
        return hh1.g;
    }

    private void a(ee ee1)
    {
        a(ee1.b);
    }

    private void a(kx kx1)
    {
        if (f == null)
        {
            hi hi1 = new hi(this);
            f = (new aa(a)).setNegativeButton(p.aR, null).setPositiveButton(p.ck, hi1).create();
        }
        g = kx1.c;
        u u1 = d.a();
        u1.b(kx1.d);
        d.a(u1, m.a(com/google/a/a/a/a/il));
        c.b("MusicUpsellDialogShown");
        f.show();
    }

    private void a(String s)
    {
        if (e == null)
        {
            e = (new aa(a)).setNeutralButton(p.dA, null).create();
        }
        e.setMessage(s);
        e.show();
    }

    static a b(hh hh1)
    {
        return hh1.b;
    }

    public final void a()
    {
        a(a.getString(p.ds));
    }

    public final void a(ai ai1)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(ai1);
        if (ai1.c != null)
        {
            a(ai1.c);
            return;
        }
        if (ai1.b != null)
        {
            a(ai1.b);
            return;
        } else
        {
            L.b("background_message_seekrit doesn't contain dismissable_dialog_renderer or more_info_dialog_renderer");
            return;
        }
    }

    public final void a(lv lv1)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(lv1);
        if (lv1.c != null)
        {
            a(lv1.c);
            return;
        }
        if (lv1.b != null)
        {
            a(lv1.b);
            return;
        } else
        {
            L.b("offline_message doesn't contain dismissable_dialog_renderer or music_upsell_dialog_renderer");
            return;
        }
    }

    public final void a(lz lz1)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(lz1);
        if (lz1.c != null)
        {
            a(lz1.c);
            return;
        }
        if (lz1.b != null)
        {
            a(lz1.b);
            return;
        } else
        {
            L.b("offline_refresh_message doesn't contain dismissable_dialog_renderer or music_upsell_dialog_renderer");
            return;
        }
    }

    public final void a(mh mh1)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(mh1);
        if (mh1.c != null)
        {
            a(mh1.c);
            return;
        }
        if (mh1.b != null)
        {
            a(mh1.b);
            return;
        } else
        {
            L.b("offlineability_renderer.info_renderer doesn't contain dissmissiable_dialog_renderer or music_upsell_dialog_renderer");
            return;
        }
    }
}
