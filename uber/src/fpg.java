// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.feature.survey.SurveyDialogFragment;

public final class fpg
    implements fpk
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

    private fpg(fph fph1)
    {
        if (!a && fph1 == null)
        {
            throw new AssertionError();
        } else
        {
            a(fph1);
            return;
        }
    }

    fpg(fph fph1, byte byte0)
    {
        this(fph1);
    }

    public static fph a()
    {
        return new fph((byte)0);
    }

    private void a(fph fph1)
    {
        b = new hst(fph1) {

            final fph a;
            final fpg b;

            private cev b()
            {
                cev cev = fph.a(a).D();
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
                b = fpg.this;
                a = fph1;
                super();
            }
        };
        c = hsw.a(diy.a(fph.b(fph1), b));
        d = new hst(fph1) {

            final fph a;
            final fpg b;

            private chp b()
            {
                chp chp = fph.a(a).e();
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
                b = fpg.this;
                a = fph1;
                super();
            }
        };
        e = hsw.a(dix.a(fph.b(fph1), d));
        f = hsw.a(diz.a(fph.b(fph1), c, e));
        g = cza.a(hsu.a(), f);
        h = new hst(fph1) {

            final fph a;
            final fpg b;

            private gju b()
            {
                gju gju = fph.a(a).H();
                if (gju == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return gju;
                }
            }

            public final Object a()
            {
                return b();
            }

            
            {
                b = fpg.this;
                a = fph1;
                super();
            }
        };
        i = hsw.a(dja.a(fph.b(fph1)));
        j = hsw.a(fpm.a(fph.c(fph1), i));
        k = new hst(fph1) {

            final fph a;
            final fpg b;

            private dal b()
            {
                dal dal = fph.a(a).ap();
                if (dal == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return dal;
                }
            }

            public final Object a()
            {
                return b();
            }

            
            {
                b = fpg.this;
                a = fph1;
                super();
            }
        };
        l = hsw.a(fpn.a(fph.c(fph1), i));
        m = fpo.a(g, d, h, j, k, l);
    }

    public final void a(SurveyDialogFragment surveydialogfragment)
    {
        m.injectMembers(surveydialogfragment);
    }

    static 
    {
        boolean flag;
        if (!fpg.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
