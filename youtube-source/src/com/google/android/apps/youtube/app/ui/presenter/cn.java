// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui.presenter;

import android.content.Context;
import android.view.View;
import com.google.a.a.a.a.kz;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.ui.YouTubeTextView;
import com.google.android.apps.youtube.datalib.d.a;
import com.google.android.apps.youtube.uilib.a.f;
import com.google.android.apps.youtube.uilib.a.g;
import com.google.android.apps.youtube.uilib.a.i;
import com.google.android.apps.youtube.uilib.innertube.u;
import com.google.android.youtube.l;
import com.google.android.youtube.p;

// Referenced classes of package com.google.android.apps.youtube.app.ui.presenter:
//            co

public final class cn
    implements g
{

    private final YouTubeTextView a;
    private final i b;
    private final android.view.View.OnClickListener c;
    private kz d;

    public cn(Context context, i j, a a1)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(context);
        com.google.android.apps.youtube.common.fromguava.c.a(a1);
        b = (i)com.google.android.apps.youtube.common.fromguava.c.a(j);
        a = (YouTubeTextView)View.inflate(context, l.bp, null);
        c = new co(this, a1);
        j.a(a);
    }

    static kz a(cn cn1)
    {
        return cn1.d;
    }

    public final View a(f f, Object obj)
    {
        u u1 = (u)obj;
        d = u1.c();
        i j = b;
        if (u1.b() == null)
        {
            obj = c;
        } else
        {
            obj = u1.b();
        }
        j.a(((android.view.View.OnClickListener) (obj)));
        if (u1.a() != null)
        {
            a.setText(u1.a());
        } else
        {
            a.setText(p.cv);
        }
        return b.a(f);
    }
}
