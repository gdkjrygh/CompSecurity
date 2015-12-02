// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class fku
    implements fmk
{

    static final boolean a;
    private hzb b;
    private hzb c;
    private hzb d;
    private hzb e;
    private hzb f;
    private hsr g;
    private hsr h;
    private hsr i;

    private fku(fkv fkv1)
    {
        if (!a && fkv1 == null)
        {
            throw new AssertionError();
        } else
        {
            a(fkv1);
            return;
        }
    }

    fku(fkv fkv1, byte byte0)
    {
        this(fkv1);
    }

    public static fkv a()
    {
        return new fkv((byte)0);
    }

    private void a(fkv fkv1)
    {
        b = new hst(fkv1) {

            final fkv a;
            final fku b;

            private cev b()
            {
                cev cev = fkv.a(a).D();
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
                b = fku.this;
                a = fkv1;
                super();
            }
        };
        c = hsw.a(djd.a(fkv.b(fkv1), b));
        d = new hst(fkv1) {

            final fkv a;
            final fku b;

            private chp b()
            {
                chp chp = fkv.a(a).e();
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
                b = fku.this;
                a = fkv1;
                super();
            }
        };
        e = hsw.a(djc.a(fkv.b(fkv1), d));
        f = hsw.a(dje.a(fkv.b(fkv1), c, e));
        g = czc.a(hsu.a(), f);
        h = eef.a(g, b);
        i = hsu.a(h);
    }

    public final void a(fmj fmj)
    {
        i.injectMembers(fmj);
    }

    static 
    {
        boolean flag;
        if (!fku.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
