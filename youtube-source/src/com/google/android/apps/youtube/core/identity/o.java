// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.identity;

import android.app.Activity;
import android.app.Dialog;
import android.content.SharedPreferences;
import android.net.Uri;
import com.google.android.apps.youtube.common.a.a;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.Analytics;
import com.google.android.apps.youtube.core.client.bc;
import com.google.android.apps.youtube.core.client.bj;
import com.google.android.apps.youtube.core.client.bz;
import com.google.android.apps.youtube.core.ui.aa;
import com.google.android.apps.youtube.core.ui.n;
import com.google.android.youtube.p;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Executor;

// Referenced classes of package com.google.android.apps.youtube.core.identity:
//            b, w, r, q, 
//            p, u, t, s, 
//            y, v

public final class o
{

    private static final Uri b = Uri.parse("http://m.youtube.com/create_channel");
    protected final y a = new w(this, (byte)0);
    private final bc c;
    private final bz d;
    private final bj e;
    private final b f;
    private final Analytics g;
    private final SharedPreferences h;
    private final Executor i;
    private final List j = new LinkedList();

    public o(bc bc1, bz bz1, bj bj1, b b1, Analytics analytics, SharedPreferences sharedpreferences, Executor executor)
    {
        c = (bc)com.google.android.apps.youtube.common.fromguava.c.a(bc1);
        d = (bz)com.google.android.apps.youtube.common.fromguava.c.a(bz1);
        e = (bj)com.google.android.apps.youtube.common.fromguava.c.a(bj1);
        f = (b)com.google.android.apps.youtube.common.fromguava.c.a(b1);
        g = (Analytics)com.google.android.apps.youtube.common.fromguava.c.a(analytics);
        h = (SharedPreferences)com.google.android.apps.youtube.common.fromguava.c.a(sharedpreferences);
        i = (Executor)com.google.android.apps.youtube.common.fromguava.c.a(executor);
    }

    static Uri a()
    {
        return b;
    }

    static List a(o o1)
    {
        return o1.j;
    }

    static void a(o o1, v v, Activity activity)
    {
        o1.j.add(v);
        if (o1.j.size() == 1)
        {
            activity.showDialog(1);
            o1.g.b("PlusChannelUpgradeDialogShown");
        }
    }

    static void a(o o1, Exception exception)
    {
        o1.i.execute(new r(o1, exception));
    }

    static void a(o o1, String s1, String s2)
    {
        o1.a(s1, s2);
    }

    private void a(String s1, String s2)
    {
        this;
        JVM INSTR monitorenter ;
        h.edit().putString("username", s1).putString("user_channel_id", s2).apply();
        this;
        JVM INSTR monitorexit ;
        return;
        s1;
        throw s1;
    }

    static void b(o o1)
    {
        o1.i.execute(new q(o1));
    }

    static void b(o o1, v v, Activity activity)
    {
        o1.j.add(v);
        if (o1.j.size() == 1)
        {
            activity.showDialog(3);
            o1.g.b("WebChannelUpgradeDialogShown");
        }
    }

    static b c(o o1)
    {
        return o1.f;
    }

    static void d(o o1)
    {
        o1.i.execute(new com.google.android.apps.youtube.core.identity.p(o1));
    }

    static bc e(o o1)
    {
        return o1.c;
    }

    public final Dialog a(Activity activity)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(activity);
        return (new aa(activity)).setMessage(p.ae).setPositiveButton(p.cd, new u(this, activity)).setOnCancelListener(new t(this)).create();
    }

    public final void a(Activity activity, v v)
    {
        c.a(com.google.android.apps.youtube.common.a.a.a(activity, new s(this, v, activity)));
    }

    public final Dialog b(Activity activity)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(activity);
        return new n(activity, c, e, d, g, a);
    }

}
