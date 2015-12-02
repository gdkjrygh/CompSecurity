// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.feature.trip.contact.ContactDriverAnonymouslyFragment;

public final class fuu
    implements fup
{

    static final boolean a;
    private hzb b;
    private hzb c;
    private hzb d;
    private hzb e;
    private hzb f;
    private hsr g;
    private hzb h;
    private hzb i;
    private hzb j;
    private hzb k;
    private hzb l;
    private hsr m;

    private fuu(fuv fuv1)
    {
        if (!a && fuv1 == null)
        {
            throw new AssertionError();
        } else
        {
            a(fuv1);
            return;
        }
    }

    fuu(fuv fuv1, byte byte0)
    {
        this(fuv1);
    }

    public static fuv a()
    {
        return new fuv((byte)0);
    }

    private void a(fuv fuv1)
    {
        b = new hst(fuv1) {

            final fuv a;
            final fuu b;

            private cev b()
            {
                cev cev = fuv.a(a).D();
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
                b = fuu.this;
                a = fuv1;
                super();
            }
        };
        c = hsw.a(diy.a(fuv.b(fuv1), b));
        d = new hst(fuv1) {

            final fuv a;
            final fuu b;

            private chp b()
            {
                chp chp = fuv.a(a).e();
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
                b = fuu.this;
                a = fuv1;
                super();
            }
        };
        e = hsw.a(dix.a(fuv.b(fuv1), d));
        f = hsw.a(diz.a(fuv.b(fuv1), c, e));
        g = cza.a(hsu.a(), f);
        h = new hst(fuv1) {

            final fuv a;
            final fuu b;

            private drc b()
            {
                drc drc = fuv.a(a).aN();
                if (drc == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return drc;
                }
            }

            public final Object a()
            {
                return b();
            }

            
            {
                b = fuu.this;
                a = fuv1;
                super();
            }
        };
        i = new hst(fuv1) {

            final fuv a;
            final fuu b;

            private hkr b()
            {
                hkr hkr = fuv.a(a).aP();
                if (hkr == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return hkr;
                }
            }

            public final Object a()
            {
                return b();
            }

            
            {
                b = fuu.this;
                a = fuv1;
                super();
            }
        };
        j = new hst(fuv1) {

            final fuv a;
            final fuu b;

            private gmg b()
            {
                gmg gmg = fuv.a(a).f();
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
                b = fuu.this;
                a = fuv1;
                super();
            }
        };
        k = new hst(fuv1) {

            final fuv a;
            final fuu b;

            private cys b()
            {
                cys cys = fuv.a(a).X();
                if (cys == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return cys;
                }
            }

            public final Object a()
            {
                return b();
            }

            
            {
                b = fuu.this;
                a = fuv1;
                super();
            }
        };
        l = new hst(fuv1) {

            final fuv a;
            final fuu b;

            private dkj b()
            {
                dkj dkj = fuv.a(a).Y();
                if (dkj == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return dkj;
                }
            }

            public final Object a()
            {
                return b();
            }

            
            {
                b = fuu.this;
                a = fuv1;
                super();
            }
        };
        m = fuq.a(g, d, h, i, j, k, l);
    }

    public final void a(ContactDriverAnonymouslyFragment contactdriveranonymouslyfragment)
    {
        m.injectMembers(contactdriveranonymouslyfragment);
    }

    static 
    {
        boolean flag;
        if (!fuu.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
