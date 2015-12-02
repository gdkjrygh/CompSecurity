// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.feature.profiles.EditEmailFragment;

public final class exl
    implements eye
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

    private exl(exm exm1)
    {
        if (!a && exm1 == null)
        {
            throw new AssertionError();
        } else
        {
            a(exm1);
            return;
        }
    }

    exl(exm exm1, byte byte0)
    {
        this(exm1);
    }

    public static exm a()
    {
        return new exm((byte)0);
    }

    private void a(exm exm1)
    {
        b = new hst(exm1) {

            final exm a;
            final exl b;

            private cev b()
            {
                cev cev = exm.a(a).D();
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
                b = exl.this;
                a = exm1;
                super();
            }
        };
        c = hsw.a(djd.a(exm.b(exm1), b));
        d = new hst(exm1) {

            final exm a;
            final exl b;

            private chp b()
            {
                chp chp = exm.a(a).e();
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
                b = exl.this;
                a = exm1;
                super();
            }
        };
        e = hsw.a(djc.a(exm.b(exm1), d));
        f = hsw.a(dje.a(exm.b(exm1), c, e));
        g = czc.a(hsu.a(), f);
        h = new hst(exm1) {

            final exm a;
            final exl b;

            private eyy b()
            {
                eyy eyy = exm.a(a).al();
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
                b = exl.this;
                a = exm1;
                super();
            }
        };
        i = eyf.a(g, d, b, h);
    }

    public final void a(EditEmailFragment editemailfragment)
    {
        i.injectMembers(editemailfragment);
    }

    static 
    {
        boolean flag;
        if (!exl.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
