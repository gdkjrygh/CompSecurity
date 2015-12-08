// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.ParseException;
import android.net.Uri;
import android.text.Html;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.google.android.apps.youtube.app.remote.YouTubeTvScreensMonitor;
import com.google.android.apps.youtube.app.remote.an;
import com.google.android.apps.youtube.app.remote.bk;
import com.google.android.apps.youtube.app.remote.bw;
import com.google.android.apps.youtube.common.a.a;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.Analytics;
import com.google.android.apps.youtube.core.aw;
import com.google.android.apps.youtube.core.ui.aa;
import com.google.android.apps.youtube.core.utils.Typefaces;
import com.google.android.youtube.j;
import com.google.android.youtube.p;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            ew, ey, ff, ez, 
//            fa, fb, fe, fd, 
//            fc, fg

public final class ev
{

    private final Activity a;
    private final bw b;
    private final YouTubeTvScreensMonitor c;
    private final a d;
    private final Resources e;
    private final aw f;
    private final Analytics g;
    private final Button h;
    private final EditText i;
    private final ImageView j;
    private final ProgressBar k;
    private final View l;
    private String m;

    public ev(Activity activity, an an, bw bw1, YouTubeTvScreensMonitor youtubetvscreensmonitor, bk bk, Analytics analytics, fg fg, 
            aw aw1, int i1)
    {
        a = (Activity)com.google.android.apps.youtube.common.fromguava.c.a(activity);
        b = (bw)com.google.android.apps.youtube.common.fromguava.c.a(bw1, "screensClient can not be null");
        c = (YouTubeTvScreensMonitor)com.google.android.apps.youtube.common.fromguava.c.a(youtubetvscreensmonitor);
        com.google.android.apps.youtube.common.fromguava.c.a(bk);
        com.google.android.apps.youtube.common.fromguava.c.a(fg);
        g = (Analytics)com.google.android.apps.youtube.common.fromguava.c.a(analytics);
        f = (aw)com.google.android.apps.youtube.common.fromguava.c.a(aw1);
        d = com.google.android.apps.youtube.common.a.a.a(activity, new ew(this, analytics, an, activity, fg, aw1));
        e = activity.getResources();
        activity.setContentView(i1);
        i = (EditText)activity.findViewById(j.dh);
        l = activity.findViewById(j.em);
        if (!activity.getPackageManager().hasSystemFeature("android.hardware.camera"))
        {
            l.setVisibility(8);
        }
        j = (ImageView)activity.findViewById(j.en);
        k = (ProgressBar)activity.findViewById(j.eo);
        i.setOnFocusChangeListener(new ey(this));
        h = (Button)activity.findViewById(j.aO);
        h.setTypeface(Typefaces.ROBOTO_LIGHT.toTypeface(activity), 1);
        i.addTextChangedListener(new ff((byte)0));
        i.setImeActionLabel(e.getString(p.m), 6);
        i.setOnEditorActionListener(new ez(this));
        h.setOnClickListener(new fa(this));
        j.setOnClickListener(new fb(this, activity));
    }

    static EditText a(ev ev1)
    {
        return ev1.i;
    }

    static String a(ev ev1, String s)
    {
        ev1.m = null;
        return null;
    }

    static View b(ev ev1)
    {
        return ev1.l;
    }

    private static String b(String s)
    {
        String s1;
        try
        {
            s1 = Uri.parse(s).getQueryParameter("pairingCode");
        }
        catch (ParseException parseexception)
        {
            return s;
        }
        if (s1 != null)
        {
            s = s1;
        }
        return s;
    }

    static void c(ev ev1)
    {
        String s = ev1.i.getText().toString();
        if (TextUtils.isEmpty(s))
        {
            ev1.f.a(p.bk);
            return;
        } else
        {
            ev1.g.b("RemoteAddScreenPressed");
            ev1.b.b(com.google.android.apps.youtube.common.a.a.a(ev1.a, new fe(ev1, "", s, (byte)0)));
            return;
        }
    }

    static ProgressBar d(ev ev1)
    {
        return ev1.k;
    }

    static ImageView e(ev ev1)
    {
        return ev1.j;
    }

    static a f(ev ev1)
    {
        return ev1.d;
    }

    static YouTubeTvScreensMonitor g(ev ev1)
    {
        return ev1.c;
    }

    static Activity h(ev ev1)
    {
        return ev1.a;
    }

    public final Dialog a(int i1)
    {
        String s = i.getText().toString();
        android.text.Spanned spanned;
        switch (i1)
        {
        default:
            return null;

        case 1027: 
            spanned = Html.fromHtml(a.getString(p.aZ, new Object[] {
                ""
            }));
            break;
        }
        return (new aa(a)).setTitle(p.m).setMessage(spanned).setPositiveButton(p.fj, new fd(this, s)).setNeutralButton(p.K, new fc(this)).create();
    }

    public final String a()
    {
        android.text.Editable editable = i.getText();
        if (editable != null)
        {
            return editable.toString();
        } else
        {
            return "";
        }
    }

    public final void a(String s)
    {
        m = s;
        i.setText(m);
    }

    public final boolean a(int i1, int j1, Intent intent)
    {
        boolean flag = false;
        if (i1 == 1718)
        {
            if (j1 == -1)
            {
                m = b(intent.getStringExtra("SCAN_RESULT"));
                i.setText(m);
            }
            k.setVisibility(8);
            j.setVisibility(0);
            flag = true;
        }
        return flag;
    }

    public final void b()
    {
        k.setVisibility(8);
        j.setVisibility(0);
    }
}
