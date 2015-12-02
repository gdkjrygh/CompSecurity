// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import com.ubercab.analytics.model.AnalyticsEvent;

public final class dor
{

    private dkn a;
    private don b;
    private final chp c;
    private czf d;

    public dor(dkn dkn, don don1, chp chp, czf czf1)
    {
        a = dkn;
        b = don1;
        c = chp;
        d = czf1;
    }

    static chp a(dor dor1)
    {
        return dor1.c;
    }

    static czf b(dor dor1)
    {
        return dor1.d;
    }

    static dkn c(dor dor1)
    {
        return dor1.a;
    }

    public final void a()
    {
        try
        {
            if (d.q() && !TextUtils.isEmpty(b.a()))
            {
                return;
            }
        }
        catch (Exception exception)
        {
            return;
        }
        b.a(new doo() {

            final dor a;

            public final void a(Exception exception1)
            {
                exception1 = AnalyticsEvent.create("custom").setName(k.a).setValue(exception1.getMessage());
                dor.a(a).a(exception1);
            }

            public final void a(String s, String s1)
            {
                AnalyticsEvent analyticsevent = AnalyticsEvent.create("custom").setName(k.b).setValue("google");
                dor.a(a).a(analyticsevent);
                dor.c(a).a(s, s1, new dos(this) {

                    final _cls1 a;

                    public final void a(boolean flag)
                    {
                        dor.b(a.a).i(flag);
                    }

            
            {
                a = _pcls1;
                super((byte)0);
            }
                });
            }

            
            {
                a = dor.this;
                super();
            }
        });
        return;
    }

    public final void a(String s, dop dop1)
    {
        if (!d.q() && TextUtils.isEmpty(b.a()))
        {
            dop1.a(new RuntimeException("unregister failed"));
            return;
        } else
        {
            b.a(new dop(s, dop1) {

                final String a;
                final dop b;
                final dor c;

                public final void a(Exception exception)
                {
                    b.a(exception);
                }

                public final void a(String s1, String s2)
                {
                    dor.c(c).a(a, s1, s2, new dos(this, s1, s2) {

                        final String a;
                        final String b;
                        final _cls2 c;

                        public final void a(boolean flag)
                        {
                            dor.b(c.c).i(false);
                            c.b.a(a, b);
                        }

            
            {
                c = _pcls2;
                a = s;
                b = s1;
                super((byte)0);
            }
                    });
                }

            
            {
                c = dor.this;
                a = s;
                b = dop1;
                super();
            }
            });
            return;
        }
    }
}
