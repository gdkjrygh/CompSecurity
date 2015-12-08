// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.client.a;

import android.content.SharedPreferences;
import android.util.Base64;
import com.google.a.a.a.a.dt;
import com.google.a.a.a.a.ix;
import com.google.android.apps.common.csi.lib.Sender;
import com.google.android.apps.common.csi.lib.f;
import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.c.a;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.identity.l;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import java.util.LinkedList;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.core.client.a:
//            c, j, i, l, 
//            k, b, e, d, 
//            f

public final class h
    implements com.google.android.apps.youtube.core.client.a.c
{

    private final l a;
    private final com.google.android.apps.common.csi.lib.c b;
    private final String c;
    private final com.google.android.apps.youtube.common.network.h d;
    private final SharedPreferences e;
    private final a f;
    private List g;
    private List h;
    private List i;
    private List j;
    private List k;

    private h(a a1, l l1, com.google.android.apps.common.csi.lib.c c1, String s, com.google.android.apps.youtube.common.network.h h1, SharedPreferences sharedpreferences)
    {
        g = new LinkedList();
        h = new LinkedList();
        i = new LinkedList();
        j = new LinkedList();
        k = new LinkedList();
        f = (a)com.google.android.apps.youtube.common.fromguava.c.a(a1);
        a = (l)com.google.android.apps.youtube.common.fromguava.c.a(l1);
        b = (com.google.android.apps.common.csi.lib.c)com.google.android.apps.youtube.common.fromguava.c.a(c1);
        c = (String)com.google.android.apps.youtube.common.fromguava.c.a(s);
        d = (com.google.android.apps.youtube.common.network.h)com.google.android.apps.youtube.common.fromguava.c.a(h1);
        e = (SharedPreferences)com.google.android.apps.youtube.common.fromguava.c.a(sharedpreferences);
    }

    public static h a(a a1, l l1, String s, String s1, String s2, com.google.android.apps.youtube.common.network.h h1, SharedPreferences sharedpreferences, Sender sender)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(l1);
        com.google.android.apps.youtube.common.fromguava.c.a(s, "packageName cannot be null or empty.");
        com.google.android.apps.youtube.common.fromguava.c.a(s1, "version cannot be null or empty.");
        com.google.android.apps.youtube.common.fromguava.c.a(h1);
        com.google.android.apps.youtube.common.fromguava.c.a(sharedpreferences);
        if (s2 == null)
        {
            s2 = "";
        }
        com.google.android.apps.common.csi.lib.f.a((new com.google.android.apps.common.csi.lib.a()).a("youtube_android").a(s, s1).b("https://csi.gstatic.com/csi").a(sender).a(1));
        return new h(a1, l1, com.google.android.apps.common.csi.lib.f.a(), s2, h1, sharedpreferences);
    }

    static List a(h h1)
    {
        return h1.k;
    }

    static com.google.android.apps.common.csi.lib.c b(h h1)
    {
        return h1.b;
    }

    public final e a(Class class1, b b1)
    {
        b1 = new j(this, b1, (byte)0);
        f.a(this, class1, b1);
        g.add(b1);
        return b1;
    }

    public final l a()
    {
        return a;
    }

    public final void a(Class class1, d d1)
    {
        d1 = new i(this, d1);
        f.a(this, class1, d1);
        j.add(d1);
    }

    public final void a(Class class1, com.google.android.apps.youtube.core.client.a.f f1)
    {
        f1 = new com.google.android.apps.youtube.core.client.a.l(this, f1, (byte)0);
        f.a(this, class1, f1);
        i.add(f1);
    }

    public final void a(Class class1, String s)
    {
        s = new k(this, s, (byte)0);
        f.a(this, class1, s);
        h.add(s);
    }

    public final String b()
    {
        return c;
    }

    public final dt c()
    {
        String s = e.getString("csi_params_from_innertube", Base64.encodeToString(com.google.protobuf.nano.c.a(new dt()), 0));
        dt dt2;
        try
        {
            dt2 = new dt();
            com.google.protobuf.nano.c.a(dt2, Base64.decode(s, 0));
        }
        catch (InvalidProtocolBufferNanoException invalidprotocolbuffernanoexception)
        {
            L.a("Error parsing CsiParams from preferences", invalidprotocolbuffernanoexception);
            dt dt1 = new dt();
            dt1.b = (new ix[] {
                new ix()
            });
            dt1.b[0].b = "csiParamsParseException";
            dt1.b[0].c = "true";
            return dt1;
        }
        return dt2;
    }

    public final com.google.android.apps.youtube.common.network.h d()
    {
        return d;
    }
}
