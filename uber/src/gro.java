// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.network.ramen.RamenApi;
import com.ubercab.network.ramen.internal.model.Session;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import retrofit.RetrofitError;

public final class gro
{

    private final RamenApi a;
    private final grm b;
    private final List c = new CopyOnWriteArrayList();
    private final bjw d = new bjw();
    private String e;
    private String f;
    private int g;
    private grl h;
    private boolean i;
    private boolean j;

    public gro(gqn gqn1)
    {
        gqn1.a(50000L, TimeUnit.MILLISECONDS);
        gqn1.b(50000L, TimeUnit.MILLISECONDS);
        gqn1.a(new gre(16));
        gqn1.a(new grp(this, (byte)0));
        a = (RamenApi)(new grt(gqn1)).a().a(com/ubercab/network/ramen/RamenApi);
        b = new grm(gqn1);
    }

    static int a(gro gro1, int k)
    {
        gro1.g = k;
        return k;
    }

    static boolean a(gqo gqo1)
    {
        return b(gqo1);
    }

    static boolean a(gro gro1)
    {
        return gro1.j;
    }

    static void b(gro gro1)
    {
        gro1.c();
    }

    private static boolean b(gqo gqo1)
    {
        return gqo1.a().startsWith("/ramen");
    }

    static String c(gro gro1)
    {
        return gro1.e;
    }

    private void c()
    {
        try
        {
            f = a.createSession("").getSessionId();
            g = 0;
            j = true;
            return;
        }
        catch (RetrofitError retrofiterror)
        {
            f = null;
        }
    }

    static int d(gro gro1)
    {
        return gro1.g;
    }

    static String e(gro gro1)
    {
        return gro1.f;
    }

    static boolean f(gro gro1)
    {
        gro1.j = false;
        return false;
    }

    static bjw g(gro gro1)
    {
        return gro1.d;
    }

    static List h(gro gro1)
    {
        return gro1.c;
    }

    public final void a(grr grr)
    {
        c.add(grr);
    }

    public final void a(String s)
    {
        if (i)
        {
            return;
        }
        i = true;
        e = s;
        if (h != null)
        {
            h.b();
        }
        s = (new gqp()).a("/ramen").a().b();
        h = b.a(s, new grq(this, (byte)0));
        h.a();
    }

    public final boolean a()
    {
        return i;
    }

    public final void b()
    {
        if (i)
        {
            i = false;
            if (h != null)
            {
                h.b();
                h = null;
                return;
            }
        }
    }

    public final void b(grr grr)
    {
        c.remove(grr);
    }
}
