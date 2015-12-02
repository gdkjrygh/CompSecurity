// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.feature.safetynet.contactpicker.ContactPickerFragment;

public final class fez
    implements fex
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
    private hsr k;

    private fez(ffa ffa1)
    {
        if (!a && ffa1 == null)
        {
            throw new AssertionError();
        } else
        {
            a(ffa1);
            return;
        }
    }

    fez(ffa ffa1, byte byte0)
    {
        this(ffa1);
    }

    public static ffa a()
    {
        return new ffa((byte)0);
    }

    private void a(ffa ffa1)
    {
        b = new hst(ffa1) {

            final ffa a;
            final fez b;

            private cev b()
            {
                cev cev = ffa.a(a).D();
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
                b = fez.this;
                a = ffa1;
                super();
            }
        };
        c = hsw.a(djd.a(ffa.b(ffa1), b));
        d = new hst(ffa1) {

            final ffa a;
            final fez b;

            private chp b()
            {
                chp chp = ffa.a(a).e();
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
                b = fez.this;
                a = ffa1;
                super();
            }
        };
        e = hsw.a(djc.a(ffa.b(ffa1), d));
        f = hsw.a(dje.a(ffa.b(ffa1), c, e));
        g = czc.a(hsu.a(), f);
        h = new hst(ffa1) {

            final ffa a;
            final fez b;

            private gmg b()
            {
                gmg gmg = ffa.a(a).f();
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
                b = fez.this;
                a = ffa1;
                super();
            }
        };
        i = new hst(ffa1) {

            final ffa a;
            final fez b;

            private cys b()
            {
                cys cys = ffa.a(a).X();
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
                b = fez.this;
                a = ffa1;
                super();
            }
        };
        j = new hst(ffa1) {

            final ffa a;
            final fez b;

            private cgh b()
            {
                cgh cgh = ffa.a(a).Z();
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
                b = fez.this;
                a = ffa1;
                super();
            }
        };
        k = fey.a(g, b, h, i, j);
    }

    public final void a(ContactPickerFragment contactpickerfragment)
    {
        k.injectMembers(contactpickerfragment);
    }

    static 
    {
        boolean flag;
        if (!fez.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
