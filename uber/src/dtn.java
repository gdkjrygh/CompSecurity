// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class dtn
    implements dtq
{

    static final boolean a;
    private hzb b;
    private hzb c;
    private hzb d;
    private hzb e;
    private hzb f;
    private hsr g;
    private hsr h;
    private hzb i;
    private hsr j;

    private dtn(dto dto1)
    {
        if (!a && dto1 == null)
        {
            throw new AssertionError();
        } else
        {
            a(dto1);
            return;
        }
    }

    dtn(dto dto1, byte byte0)
    {
        this(dto1);
    }

    public static dto a()
    {
        return new dto((byte)0);
    }

    private void a(dto dto1)
    {
        b = new hst(dto1) {

            final dto a;
            final dtn b;

            private cev b()
            {
                cev cev = dto.a(a).D();
                if (cev == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return cev;
                }
            }

            public final Object a()
            {
                return b();
            }

            
            {
                b = dtn.this;
                a = dto1;
                super();
            }
        };
        c = hsw.a(diy.a(dto.b(dto1), b));
        d = new hst(dto1) {

            final dto a;
            final dtn b;

            private chp b()
            {
                chp chp = dto.a(a).e();
                if (chp == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return chp;
                }
            }

            public final Object a()
            {
                return b();
            }

            
            {
                b = dtn.this;
                a = dto1;
                super();
            }
        };
        e = hsw.a(dix.a(dto.b(dto1), d));
        f = hsw.a(diz.a(dto.b(dto1), c, e));
        g = cza.a(hsu.a(), f);
        h = hsu.a(g);
        i = new hst(dto1) {

            final dto a;
            final dtn b;

            private gmg b()
            {
                gmg gmg = dto.a(a).f();
                if (gmg == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return gmg;
                }
            }

            public final Object a()
            {
                return b();
            }

            
            {
                b = dtn.this;
                a = dto1;
                super();
            }
        };
        j = dtr.a(h, i);
    }

    public final void a(dtp dtp)
    {
        j.injectMembers(dtp);
    }

    static 
    {
        boolean flag;
        if (!dtn.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
