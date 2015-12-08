// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.youtube.app.offline.OfflineStreamQuality;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.youtube.h;
import com.google.android.youtube.j;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            bv

final class by
    implements android.view.View.OnClickListener
{

    final bv a;
    private final com.google.android.apps.youtube.datalib.innertube.model.Offlineability.Format.Type b;
    private final OfflineStreamQuality c;
    private final View d;
    private final View e;
    private final TextView f;
    private final TextView g;
    private Drawable h;
    private boolean i;

    private by(bv bv1, com.google.android.apps.youtube.datalib.innertube.model.Offlineability.Format.Type type, View view)
    {
        a = bv1;
        super();
        b = (com.google.android.apps.youtube.datalib.innertube.model.Offlineability.Format.Type)com.google.android.apps.youtube.common.fromguava.c.a(type);
        c = OfflineStreamQuality.getOfflineStreamQualityForFormatType(type);
        d = (View)com.google.android.apps.youtube.common.fromguava.c.a(view);
        e = (View)com.google.android.apps.youtube.common.fromguava.c.a(view.findViewById(j.eV));
        f = (TextView)com.google.android.apps.youtube.common.fromguava.c.a((TextView)e.findViewById(j.eW));
        g = (TextView)com.google.android.apps.youtube.common.fromguava.c.a((TextView)e.findViewById(j.eX));
        a(false);
        view.setOnClickListener(this);
    }

    by(bv bv1, com.google.android.apps.youtube.datalib.innertube.model.Offlineability.Format.Type type, View view, byte byte0)
    {
        this(bv1, type, view);
    }

    static OfflineStreamQuality a(by by1)
    {
        return by1.c;
    }

    static void a(by by1, com.google.android.apps.youtube.datalib.innertube.model.Offlineability.Format format)
    {
        by1.d.setVisibility(0);
        by1.f.setText(format.a());
        if (format.b())
        {
            by1.g.setVisibility(0);
            by1.g.setText(format.c());
            return;
        } else
        {
            by1.g.setVisibility(8);
            return;
        }
    }

    static void a(by by1, boolean flag)
    {
        by1.a(flag);
    }

    private void a(boolean flag)
    {
        if (flag)
        {
            if (h == null)
            {
                h = d.getResources().getDrawable(h.r);
            }
            e.setBackgroundDrawable(h);
        } else
        {
            e.setBackgroundDrawable(null);
        }
        i = flag;
    }

    static void b(by by1)
    {
        by1.d.setVisibility(8);
    }

    static com.google.android.apps.youtube.datalib.innertube.model.Offlineability.Format.Type c(by by1)
    {
        return by1.b;
    }

    static void d(by by1)
    {
        by1.d.setVisibility(0);
        by1.f.setText(by1.c.getSettingStringId());
        by1.g.setVisibility(8);
    }

    static boolean e(by by1)
    {
        return by1.i;
    }

    public final void onClick(View view)
    {
        bv.a(a, c);
    }
}
