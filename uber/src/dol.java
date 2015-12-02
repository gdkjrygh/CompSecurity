// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.text.TextUtils;
import com.ubercab.analytics.model.AnalyticsEvent;
import java.util.Map;

public final class dol
    implements cpv
{

    private final Map a;
    private final Map b;
    private final chp c;
    private final Context d;
    private final hki e;
    private final dom f;
    private final gmg g;
    private hav h;

    public dol(Context context, dom dom1, hki hki1, chp chp, gmg gmg1)
    {
        a = gkg.a(hav.a, "baidu", hav.b, "gcm");
        b = gkg.a(hav.a, Integer.valueOf(0x7f0706be), hav.b, Integer.valueOf(0x7f0706c1));
        d = context;
        f = dom1;
        e = hki1;
        c = chp;
        g = gmg1;
    }

    static chp a(dol dol1)
    {
        return dol1.c;
    }

    private void a(hav hav1, haw haw1)
    {
        if (haw1.a()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        String s = f.a(hav1);
        if (f.b() && !TextUtils.isEmpty(s)) goto _L1; else goto _L3
_L3:
        if (!TextUtils.isEmpty(s))
        {
            a(s, hav1);
            return;
        }
        try
        {
            haw1.a(d.getString(((Integer)b.get(hav1)).intValue()), new hax() {

                final dol a;

                public final void a(hav hav2, String s1)
                {
                    AnalyticsEvent analyticsevent = AnalyticsEvent.create("custom").setName(k.b).setValue(hav2.name().toLowerCase());
                    dol.a(a).a(analyticsevent);
                    dol.b(a).a(hav2, s1);
                    a.a(s1, hav2);
                }

                public final void a(Exception exception)
                {
                    exception = AnalyticsEvent.create("custom").setName(k.a).setValue(exception.getMessage());
                    dol.a(a).a(exception);
                }

            
            {
                a = dol.this;
                super();
            }
            });
            return;
        }
        // Misplaced declaration of an exception variable
        catch (hav hav1)
        {
            return;
        }
    }

    private void a(haw haw1, String s, hay hay1)
    {
        if (g.a(dbf.ak))
        {
            e.b(s, (String)a.get(h), d.getString(0x7f0706c2));
        } else
        {
            e.a(s);
        }
        haw1.a(hay1);
        f.a();
    }

    static dom b(dol dol1)
    {
        return dol1.f;
    }

    public final void a(hav hav1)
    {
        h = hav1;
        a(hav1, new haw(d, hav1));
    }

    public final void a(hay hay1)
    {
        String s = f.a(h);
        if (!f.b() || TextUtils.isEmpty(s))
        {
            new Exception(d.getString(0x7f07038b));
            hay1.b();
            return;
        } else
        {
            a(new haw(d, h), s, hay1);
            return;
        }
    }

    final void a(String s, hav hav1)
    {
        if (TextUtils.isEmpty(s))
        {
            return;
        } else
        {
            e.a(d.getString(0x7f0706c2), (String)a.get(hav1), s).a(ico.a()).b(new ick() {

                final dol a;

                private void e()
                {
                    dol.b(a).c();
                }

                public final void a()
                {
                }

                public final void a(Object obj)
                {
                    e();
                }

                public final void a(Throwable throwable)
                {
                }

            
            {
                a = dol.this;
                super();
            }
            });
            return;
        }
    }

    public final boolean a()
    {
        return h != null;
    }
}
