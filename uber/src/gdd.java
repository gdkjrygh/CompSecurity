// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.feature.trip.profiles.ProfilePickerDialogFragment;

public final class gdd
    implements gdf
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

    private gdd(gde gde1)
    {
        if (!a && gde1 == null)
        {
            throw new AssertionError();
        } else
        {
            a(gde1);
            return;
        }
    }

    gdd(gde gde1, byte byte0)
    {
        this(gde1);
    }

    public static gde a()
    {
        return new gde((byte)0);
    }

    private void a(gde gde1)
    {
        b = new hst(gde1) {

            final gde a;
            final gdd b;

            private cev b()
            {
                cev cev = gde.a(a).g();
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
                b = gdd.this;
                a = gde1;
                super();
            }
        };
        c = hsw.a(diy.a(gde.b(gde1), b));
        d = new hst(gde1) {

            final gde a;
            final gdd b;

            private chp b()
            {
                chp chp = gde.a(a).c();
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
                b = gdd.this;
                a = gde1;
                super();
            }
        };
        e = hsw.a(dix.a(gde.b(gde1), d));
        f = hsw.a(diz.a(gde.b(gde1), c, e));
        g = cza.a(hsu.a(), f);
        h = new hst(gde1) {

            final gde a;
            final gdd b;

            private hkr b()
            {
                hkr hkr = gde.a(a).j();
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
                b = gdd.this;
                a = gde1;
                super();
            }
        };
        i = new hst(gde1) {

            final gde a;
            final gdd b;

            private gmg b()
            {
                gmg gmg = gde.a(a).m();
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
                b = gdd.this;
                a = gde1;
                super();
            }
        };
        j = new hst(gde1) {

            final gde a;
            final gdd b;

            private cgh b()
            {
                cgh cgh = gde.a(a).y();
                if (cgh == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return cgh;
                }
            }

            public final Object a()
            {
                return b();
            }

            
            {
                b = gdd.this;
                a = gde1;
                super();
            }
        };
        k = new hst(gde1) {

            final gde a;
            final gdd b;

            private ezd b()
            {
                ezd ezd = gde.a(a).W();
                if (ezd == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return ezd;
                }
            }

            public final Object a()
            {
                return b();
            }

            
            {
                b = gdd.this;
                a = gde1;
                super();
            }
        };
        l = new hst(gde1) {

            final gde a;
            final gdd b;

            private eyy b()
            {
                eyy eyy = gde.a(a).O();
                if (eyy == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return eyy;
                }
            }

            public final Object a()
            {
                return b();
            }

            
            {
                b = gdd.this;
                a = gde1;
                super();
            }
        };
        m = gdg.a(g, d, b, h, i, j, k, l);
    }

    public final void a(ProfilePickerDialogFragment profilepickerdialogfragment)
    {
        m.injectMembers(profilepickerdialogfragment);
    }

    static 
    {
        boolean flag;
        if (!gdd.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
