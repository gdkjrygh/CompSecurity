// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player;

import android.content.SharedPreferences;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.identity.aa;
import com.google.android.apps.youtube.core.identity.ai;
import com.google.android.apps.youtube.core.identity.aj;
import com.google.android.apps.youtube.core.identity.l;
import com.google.android.apps.youtube.datalib.innertube.model.w;

// Referenced classes of package com.google.android.apps.youtube.core.player:
//            w, y, z, as

public final class ar extends com.google.android.apps.youtube.core.player.w
{

    private final l d;
    private final aa e;
    private final SharedPreferences f;

    public ar(l l1, aa aa1, SharedPreferences sharedpreferences)
    {
        d = (l)com.google.android.apps.youtube.common.fromguava.c.a(l1);
        e = (aa)com.google.android.apps.youtube.common.fromguava.c.a(aa1);
        f = (SharedPreferences)com.google.android.apps.youtube.common.fromguava.c.a(sharedpreferences);
        b();
    }

    private String a(String s)
    {
        return (new StringBuilder()).append(s).append(":").append(d.c()).toString();
    }

    static void a(ar ar1)
    {
        ar1.b();
    }

    private void b()
    {
        a = b("playability_adult_confirmations");
        b = b("playability_content_confirmations");
    }

    private boolean b(String s)
    {
        if (d.b())
        {
            return f.contains(a(s));
        } else
        {
            return false;
        }
    }

    private void c(String s)
    {
        if (d.b())
        {
            f.edit().putBoolean(a(s), true).apply();
        }
    }

    protected final void a(w w1)
    {
        if (w1.g())
        {
            c("playability_adult_confirmations");
        } else
        if (w1.f())
        {
            c("playability_content_confirmations");
            return;
        }
    }

    protected final void a(w w1, y y1)
    {
        if (c == null)
        {
            y1.a(b(w1));
            return;
        } else
        {
            e.a(c.a(), new as(this, w1, y1));
            return;
        }
    }

    public final void onSignIn(ai ai)
    {
        b();
    }

    public final void onSignOut(aj aj)
    {
        b();
    }
}
