// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class grp
    implements gqy
{

    final gro a;

    private grp(gro gro1)
    {
        a = gro1;
        super();
    }

    grp(gro gro1, byte byte0)
    {
        this(gro1);
    }

    public final gqq a(gqo gqo, gqz gqz1)
    {
        if (!gro.a(gqo))
        {
            gqo = gqz1.a(gqo);
        } else
        {
            if (!gro.a(a))
            {
                gro.b(a);
            }
            gqz1 = gqz1.a((new gqp(gqo)).a(String.format("/ramen/recv?uid=%s&seq=%d&sessionid=%s", new Object[] {
                gro.c(a), Integer.valueOf(gro.d(a)), gro.e(a)
            })).b());
            gqo = gqz1;
            if (!gqz1.c())
            {
                gro.f(a);
                return gqz1;
            }
        }
        return gqo;
    }
}
