// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui.presenter;

import android.app.Activity;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import com.google.android.apps.youtube.app.d.a;
import com.google.android.apps.youtube.app.d.o;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.client.bj;
import com.google.android.apps.youtube.core.identity.UserProfile;
import com.google.android.apps.youtube.uilib.a.f;
import com.google.android.apps.youtube.uilib.a.g;
import com.google.android.youtube.h;
import com.google.android.youtube.j;
import com.google.android.youtube.l;
import com.google.android.youtube.p;

// Referenced classes of package com.google.android.apps.youtube.app.ui.presenter:
//            t, v

public final class s
    implements g
{

    private final View a;
    private final ImageView b;
    private final EditText c;
    private final Activity d;
    private final bj e;

    public s(Activity activity, bj bj1, o o)
    {
        d = (Activity)com.google.android.apps.youtube.common.fromguava.c.a(activity);
        e = (bj)com.google.android.apps.youtube.common.fromguava.c.a(bj1);
        a = View.inflate(activity, l.S, null);
        b = (ImageView)a.findViewById(j.A);
        c = (EditText)a.findViewById(j.o);
        c.setOnClickListener(new t(this, o));
    }

    public final View a(f f, Object obj)
    {
        f = (v)obj;
        if (((v) (f)).a)
        {
            c.setEnabled(true);
            c.setHint(p.ar);
        } else
        {
            c.setEnabled(false);
            c.setHint(p.av);
        }
        if (((v) (f)).b == null)
        {
            b.setImageResource(h.am);
        } else
        {
            com.google.android.apps.youtube.app.d.a.a(d, e, ((v) (f)).b.thumbnailUri, b);
        }
        return a;
    }
}
