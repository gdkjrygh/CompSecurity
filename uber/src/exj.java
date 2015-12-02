// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.feature.profiles.EditBadgeFragment;

public final class exj
    implements eyb
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
    private hsr j;

    private exj(exk exk1)
    {
        if (!a && exk1 == null)
        {
            throw new AssertionError();
        } else
        {
            a(exk1);
            return;
        }
    }

    exj(exk exk1, byte byte0)
    {
        this(exk1);
    }

    public static exk a()
    {
        return new exk((byte)0);
    }

    private void a(exk exk1)
    {
        b = new hst(exk1) {

            final exk a;
            final exj b;

            private cev b()
            {
                cev cev = exk.a(a).D();
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
                b = exj.this;
                a = exk1;
                super();
            }
        };
        c = hsw.a(djd.a(exk.b(exk1), b));
        d = new hst(exk1) {

            final exk a;
            final exj b;

            private chp b()
            {
                chp chp = exk.a(a).e();
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
                b = exj.this;
                a = exk1;
                super();
            }
        };
        e = hsw.a(djc.a(exk.b(exk1), d));
        f = hsw.a(dje.a(exk.b(exk1), c, e));
        g = czc.a(hsu.a(), f);
        h = new hst(exk1) {

            final exk a;
            final exj b;

            private cgh b()
            {
                cgh cgh = exk.a(a).Z();
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
                b = exj.this;
                a = exk1;
                super();
            }
        };
        i = new hst(exk1) {

            final exk a;
            final exj b;

            private eyy b()
            {
                eyy eyy = exk.a(a).al();
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
                b = exj.this;
                a = exk1;
                super();
            }
        };
        j = eyd.a(g, d, b, h, i);
    }

    public final void a(EditBadgeFragment editbadgefragment)
    {
        j.injectMembers(editbadgefragment);
    }

    static 
    {
        boolean flag;
        if (!exj.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
