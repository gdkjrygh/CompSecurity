// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.feature.safetynet.SafetyNetFragment;

public final class fdu
    implements feg
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

    private fdu(fdv fdv1)
    {
        if (!a && fdv1 == null)
        {
            throw new AssertionError();
        } else
        {
            a(fdv1);
            return;
        }
    }

    fdu(fdv fdv1, byte byte0)
    {
        this(fdv1);
    }

    public static fdv a()
    {
        return new fdv((byte)0);
    }

    private void a(fdv fdv1)
    {
        b = new hst(fdv1) {

            final fdv a;
            final fdu b;

            private cev b()
            {
                cev cev = fdv.a(a).D();
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
                b = fdu.this;
                a = fdv1;
                super();
            }
        };
        c = hsw.a(djd.a(fdv.b(fdv1), b));
        d = new hst(fdv1) {

            final fdv a;
            final fdu b;

            private chp b()
            {
                chp chp = fdv.a(a).e();
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
                b = fdu.this;
                a = fdv1;
                super();
            }
        };
        e = hsw.a(djc.a(fdv.b(fdv1), d));
        f = hsw.a(dje.a(fdv.b(fdv1), c, e));
        g = czc.a(hsu.a(), f);
        h = new hst(fdv1) {

            final fdv a;
            final fdu b;

            private fei b()
            {
                fei fei = fdv.a(a).ao();
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
                b = fdu.this;
                a = fdv1;
                super();
            }
        };
        i = feh.a(g, b, h);
    }

    public final void a(SafetyNetFragment safetynetfragment)
    {
        i.injectMembers(safetynetfragment);
    }

    static 
    {
        boolean flag;
        if (!fdu.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
