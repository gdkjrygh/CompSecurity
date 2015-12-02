// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ewg
{

    private final gmg a;
    private boolean b;
    private boolean c;
    private boolean d;
    private boolean e;
    private boolean f;
    private boolean g;
    private boolean h;
    private boolean i;
    private boolean j;
    private boolean k;

    public ewg(gmg gmg1)
    {
        a = gmg1;
    }

    private boolean a(String s)
    {
        return "true".equals(a.b(dbf.bK, s));
    }

    private boolean b(String s)
    {
        return "true".equals(a.b(dbf.bU, s));
    }

    private void j()
    {
        boolean flag1;
        flag1 = false;
        if (k)
        {
            return;
        }
        b = a("always_show_interstitial");
        h = a.a(dbf.bK);
        if (!h) goto _L2; else goto _L1
_L1:
        if (a("show_interstitial") || a.a(dbf.bK, dbs.b)) goto _L4; else goto _L3
_L3:
        dzw.a();
_L2:
        boolean flag = false;
_L5:
        i = flag;
        if (h)
        {
            if (a("show_on_pan") || a.a(dbf.bK, dbs.b) || a.a(dbf.bK, dbs.a))
            {
                break MISSING_BLOCK_LABEL_242;
            }
            dzw.a();
        }
        flag = false;
_L6:
        j = flag;
        if (a("disable_guided_pickup_always_starts") || b("disable_guided_pickup_always_starts"))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        c = flag;
        d = a("disable_hotspot_manager");
        f = a("enable_geotalker");
        if (!h || a("disable_set_pickup_analytics"))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        e = flag;
        flag = flag1;
        if (f)
        {
            flag = flag1;
            if (a("enable_geotalker_pickup_note"))
            {
                flag = true;
            }
        }
        g = flag;
        k = true;
        return;
_L4:
        flag = true;
          goto _L5
        flag = true;
          goto _L6
    }

    public final boolean a()
    {
        j();
        return b;
    }

    public final boolean b()
    {
        j();
        return h;
    }

    public final boolean c()
    {
        j();
        return i;
    }

    public final boolean d()
    {
        j();
        return j;
    }

    public final boolean e()
    {
        j();
        return d;
    }

    public final boolean f()
    {
        j();
        return f;
    }

    public final boolean g()
    {
        j();
        return g;
    }

    public final boolean h()
    {
        j();
        return c;
    }

    public final boolean i()
    {
        j();
        return !h || e;
    }
}
