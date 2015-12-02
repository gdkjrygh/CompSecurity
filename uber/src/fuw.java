// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.feature.trip.contact.ContactDriverFragment;

public final class fuw
    implements fur
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
    private hsr l;

    private fuw(fux fux1)
    {
        if (!a && fux1 == null)
        {
            throw new AssertionError();
        } else
        {
            a(fux1);
            return;
        }
    }

    fuw(fux fux1, byte byte0)
    {
        this(fux1);
    }

    public static fux a()
    {
        return new fux((byte)0);
    }

    private void a(fux fux1)
    {
        b = new hst(fux1) {

            final fux a;
            final fuw b;

            private cev b()
            {
                cev cev = fux.a(a).D();
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
                b = fuw.this;
                a = fux1;
                super();
            }
        };
        c = hsw.a(diy.a(fux.b(fux1), b));
        d = new hst(fux1) {

            final fux a;
            final fuw b;

            private chp b()
            {
                chp chp = fux.a(a).e();
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
                b = fuw.this;
                a = fux1;
                super();
            }
        };
        e = hsw.a(dix.a(fux.b(fux1), d));
        f = hsw.a(diz.a(fux.b(fux1), c, e));
        g = cza.a(hsu.a(), f);
        h = new hst(fux1) {

            final fux a;
            final fuw b;

            private drc b()
            {
                drc drc = fux.a(a).aN();
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
                b = fuw.this;
                a = fux1;
                super();
            }
        };
        i = new hst(fux1) {

            final fux a;
            final fuw b;

            private hkr b()
            {
                hkr hkr = fux.a(a).aP();
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
                b = fuw.this;
                a = fux1;
                super();
            }
        };
        j = new hst(fux1) {

            final fux a;
            final fuw b;

            private gmg b()
            {
                gmg gmg = fux.a(a).f();
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
                b = fuw.this;
                a = fux1;
                super();
            }
        };
        k = new hst(fux1) {

            final fux a;
            final fuw b;

            private cys b()
            {
                cys cys = fux.a(a).X();
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
                b = fuw.this;
                a = fux1;
                super();
            }
        };
        l = fus.a(g, d, h, i, j, k);
    }

    public final void a(ContactDriverFragment contactdriverfragment)
    {
        l.injectMembers(contactdriverfragment);
    }

    static 
    {
        boolean flag;
        if (!fuw.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
