// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.distiller;

import com.android.volley.l;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.identity.ak;
import com.google.android.apps.youtube.datalib.c.f;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.datalib.distiller:
//            c, d, f, e, 
//            h, b

public final class a
{

    private static final String a;
    private final ak b;
    private final f c;
    private final List d;
    private final l e;
    private final com.google.android.apps.youtube.datalib.config.a f;
    private final String g;

    public a(ak ak1, f f1, List list, l l1, com.google.android.apps.youtube.datalib.config.a a1, String s)
    {
        b = (ak)com.google.android.apps.youtube.common.fromguava.c.a(ak1);
        c = (f)com.google.android.apps.youtube.common.fromguava.c.a(f1);
        d = (List)com.google.android.apps.youtube.common.fromguava.c.a(list);
        e = (l)com.google.android.apps.youtube.common.fromguava.c.a(l1);
        f = (com.google.android.apps.youtube.datalib.config.a)com.google.android.apps.youtube.common.fromguava.c.a(a1);
        g = com.google.android.apps.youtube.common.fromguava.c.a(s);
    }

    public static com.google.android.apps.youtube.datalib.distiller.c a()
    {
        return new com.google.android.apps.youtube.datalib.distiller.c();
    }

    public static d b()
    {
        return new d();
    }

    public static com.google.android.apps.youtube.datalib.distiller.f c()
    {
        return new com.google.android.apps.youtube.datalib.distiller.f();
    }

    public static e d()
    {
        return new e();
    }

    static String e()
    {
        return a;
    }

    public final void a(com.google.android.apps.youtube.datalib.distiller.c c1, com.google.android.apps.youtube.datalib.a.l l1)
    {
        c1 = new h(0, c1, new b(this, l1, c1), b, c, d, f, g);
        e.a(c1);
    }

    public final void a(d d1, com.google.android.apps.youtube.datalib.a.l l1)
    {
        d1 = new h(0, d1, l1, b, c, d, f, g);
        e.a(d1);
    }

    public final void a(e e1, com.google.android.apps.youtube.datalib.a.l l1)
    {
        e1 = new h(3, e1, l1, b, c, d, f, g);
        e.a(e1);
    }

    public final void a(com.google.android.apps.youtube.datalib.distiller.f f1, com.google.android.apps.youtube.datalib.a.l l1)
    {
        f1 = new h(1, f1, l1, b, c, d, f, g);
        e.a(f1);
    }

    static 
    {
        try
        {
            a = URLEncoder.encode("http://www.youtube.com/watch?v=", "UTF-8");
        }
        catch (UnsupportedEncodingException unsupportedencodingexception)
        {
            throw new RuntimeException("Device doesn't support UTF-8.", unsupportedencodingexception);
        }
    }
}
