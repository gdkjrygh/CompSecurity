// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.feature.safetynet.SafetyNetTutorialFragment;

public final class fea
    implements fet
{

    static final boolean a;
    private hzb b;
    private hzb c;
    private hzb d;
    private hzb e;
    private hzb f;
    private hsr g;
    private hzb h;
    private hsr i;

    private fea(feb feb1)
    {
        if (!a && feb1 == null)
        {
            throw new AssertionError();
        } else
        {
            a(feb1);
            return;
        }
    }

    fea(feb feb1, byte byte0)
    {
        this(feb1);
    }

    public static feb a()
    {
        return new feb((byte)0);
    }

    private void a(feb feb1)
    {
        b = new hst(feb1) {

            final feb a;
            final fea b;

            private cev b()
            {
                cev cev = feb.a(a).D();
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
                b = fea.this;
                a = feb1;
                super();
            }
        };
        c = hsw.a(djd.a(feb.b(feb1), b));
        d = new hst(feb1) {

            final feb a;
            final fea b;

            private chp b()
            {
                chp chp = feb.a(a).e();
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
                b = fea.this;
                a = feb1;
                super();
            }
        };
        e = hsw.a(djc.a(feb.b(feb1), d));
        f = hsw.a(dje.a(feb.b(feb1), c, e));
        g = czc.a(hsu.a(), f);
        h = new hst(feb1) {

            final feb a;
            final fea b;

            private fei b()
            {
                fei fei = feb.a(a).ao();
                if (fei == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return fei;
                }
            }

            public final Object a()
            {
                return b();
            }

            
            {
                b = fea.this;
                a = feb1;
                super();
            }
        };
        i = feu.a(g, b, h, d);
    }

    public final void a(SafetyNetTutorialFragment safetynettutorialfragment)
    {
        i.injectMembers(safetynettutorialfragment);
    }

    static 
    {
        boolean flag;
        if (!fea.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
