// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;

public final class ejp
{

    private final cdv a;
    private cea b;
    private ejg c;

    private ejp(cdv cdv1)
    {
        a = cdv1;
    }

    ejp(String s, String s1, String s2)
    {
        this(new cdv(s, a(s1, s2)));
    }

    private static cdw a(String s, String s1)
    {
        s1 = gkg.a("x-uber-token", s1, "Accept-Language", cwt.a());
        s = new ehw((new StringBuilder()).append(s).append("rt/utunes/auth_private_channel").toString());
        s.a(s1);
        return (new cdw()).a().c().a(s);
    }

    static cea a(ejp ejp1)
    {
        ejp1.b = null;
        return null;
    }

    static void a(ejp ejp1, String s, ejq ejq, String as[])
    {
        ejp1.b(s, ejq, as);
    }

    static ejg b(ejp ejp1)
    {
        return ejp1.c;
    }

    private transient void b(String s, ejq ejq, String as[])
    {
        if (b())
        {
            return;
        } else
        {
            b = a.a(s, new ceb(ejq) {

                final ejq a;
                final ejp b;

                public final void a()
                {
                    if (ejp.b(b) != null)
                    {
                        ejp.c(b);
                    }
                    if (a != null)
                    {
                        a.a();
                    }
                }

                public final void a(String s1, String s2)
                {
                    if (a == null)
                    {
                        return;
                    } else
                    {
                        new bki();
                        s2 = (bkg)bki.a(s2);
                        a.a(s1, s2);
                        return;
                    }
                }

                public final void b()
                {
                    ejp.a(b);
                }

            
            {
                b = ejp.this;
                a = ejq1;
                super();
            }
            }, as);
            return;
        }
    }

    static void c(ejp ejp1)
    {
        ejp1.e();
    }

    private void e()
    {
        b.a(c.a(), c.b());
        c = null;
    }

    public final void a(String s, bkg bkg)
    {
        boolean flag;
        if (!TextUtils.isEmpty(s))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        gjz.a(flag);
        c = new ejg(s, bkg);
        if (!a())
        {
            a.b();
        } else
        if (b())
        {
            e();
            return;
        }
    }

    public final transient void a(String s, ejq ejq, String as[])
    {
        boolean flag;
        if (!TextUtils.isEmpty(s))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        gjz.a(flag);
        gjz.a(as);
        if (a())
        {
            b(s, ejq, as);
            return;
        } else
        {
            a.a(new cei(s, ejq, as) {

                final String a;
                final ejq b;
                final String c[];
                final ejp d;

                public final void a(cek cek1)
                {
                    if (cek1.a() == cej.b)
                    {
                        ejp.a(d, a, b, c);
                    }
                }

            
            {
                d = ejp.this;
                a = s;
                b = ejq;
                c = as;
                super();
            }
            });
            return;
        }
    }

    public final boolean a()
    {
        return a.a().b() == cej.b;
    }

    public final boolean b()
    {
        return b != null;
    }

    public final void c()
    {
        a.a(b.a());
        b = null;
    }

    public final void d()
    {
        a.c();
    }
}
