// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui.presenter;

import android.graphics.Bitmap;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.youtube.app.c.a;
import com.google.android.apps.youtube.app.d.e;
import com.google.android.apps.youtube.app.honeycomb.phone.YouTubeActivity;
import com.google.android.apps.youtube.app.ui.fw;
import com.google.android.apps.youtube.app.ui.gr;
import com.google.android.apps.youtube.app.ui.ja;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.aw;
import com.google.android.apps.youtube.core.client.bj;
import com.google.android.apps.youtube.core.identity.aa;
import com.google.android.apps.youtube.core.identity.as;
import com.google.android.apps.youtube.datalib.innertube.av;
import com.google.android.apps.youtube.datalib.innertube.bc;
import com.google.android.apps.youtube.datalib.innertube.model.am;
import com.google.android.apps.youtube.datalib.innertube.model.ap;
import com.google.android.apps.youtube.datalib.innertube.model.d;
import com.google.android.apps.youtube.uilib.a.f;
import com.google.android.apps.youtube.uilib.a.g;
import com.google.android.youtube.h;
import com.google.android.youtube.j;
import com.google.android.youtube.l;
import com.google.android.youtube.p;

public final class o
    implements e, g
{

    private final YouTubeActivity a;
    private final View b;
    private final View c;
    private final TextView d;
    private final TextView e;
    private final gr f;
    private final gr g;
    private final fw h;

    public o(YouTubeActivity youtubeactivity, av av, com.google.android.apps.youtube.core.identity.l l1, aa aa, as as, bc bc, bj bj, 
            com.google.android.apps.youtube.datalib.d.a a1, com.google.android.apps.youtube.common.c.a a2, aw aw)
    {
        a = (YouTubeActivity)com.google.android.apps.youtube.common.fromguava.c.a(youtubeactivity);
        b = LayoutInflater.from(youtubeactivity).inflate(l.l, null);
        c = b.findViewById(j.aj);
        f = new gr(bj, (ImageView)b.findViewById(j.ah));
        g = new gr(bj, (ImageView)b.findViewById(j.ai));
        d = (TextView)b.findViewById(j.ap);
        e = (TextView)b.findViewById(j.ao);
        h = new fw(youtubeactivity, av, l1, aa, new ja(youtubeactivity, new a(youtubeactivity, bc, l1, as), a1, a2, aw), aw, a2, b.findViewById(j.eZ));
    }

    private void b()
    {
        f.a().setImageResource(h.am);
    }

    public final View a(com.google.android.apps.youtube.datalib.innertube.model.c c1)
    {
        d.setText(c1.d());
        e.setText(c1.e());
        Object obj = c1.b();
        if (((ap) (obj)).a())
        {
            f.a(((ap) (obj)), this);
        } else
        {
            b();
        }
        obj = c1.a();
        if (((ap) (obj)).a())
        {
            g.a(((ap) (obj)));
            c.setVisibility(0);
        } else
        {
            c.setVisibility(8);
        }
        obj = c1.c();
        if (obj != null && ((am) (obj)).h() == null)
        {
            ((am) (obj)).a(new d(Html.fromHtml(a.getString(p.gn, new Object[] {
                c1.d()
            })), a.getString(0x1040013), a.getString(0x1040009)));
        }
        h.a(((am) (obj)));
        return b;
    }

    public final volatile View a(f f1, Object obj)
    {
        return a((com.google.android.apps.youtube.datalib.innertube.model.c)obj);
    }

    public final void a()
    {
        b();
    }

    public final void a(Bitmap bitmap)
    {
    }

    public final void a(ImageView imageview)
    {
    }
}
