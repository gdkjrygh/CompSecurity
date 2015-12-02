// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Point;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.ubercab.analytics.model.AnalyticsEvent;
import com.ubercab.android.location.UberLatLng;
import com.ubercab.client.core.location.RiderLocation;

public final class fzk
    implements cjq, eem
{

    private final chp a;
    private final cev b;
    private final fta c;
    private boolean d;
    private float e;
    private float f;
    private boolean g;
    private UberLatLng h;
    private UberLatLng i;
    private UberLatLng j;
    private Handler k;

    public fzk(chp chp1, cev cev1, fta fta1)
    {
        a = chp1;
        b = cev1;
        c = fta1;
        k = new Handler(Looper.getMainLooper());
    }

    private void e()
    {
        a.a(n.aR);
        a(true);
    }

    public final void a(cjg cjg1)
    {
        float f1 = f;
        f = cjg1.d();
        h = cjg1.b();
        if (f1 != f && g)
        {
            e();
        }
    }

    final void a(boolean flag)
    {
        Object obj = c.c();
        AnalyticsEvent analyticsevent;
        if (flag)
        {
            obj = "zoom";
        } else
        if (obj != null)
        {
            obj = ((ftd) (obj)).a();
        } else
        {
            obj = null;
        }
        analyticsevent = AnalyticsEvent.create("impression").setName(l.cI).setValuePosition(Long.valueOf((long)f));
        if (!TextUtils.isEmpty(((CharSequence) (obj))))
        {
            analyticsevent.setValue(((String) (obj)));
        }
        a.a(analyticsevent);
    }

    public final boolean a(Point point)
    {
        e = f;
        i = h;
        g = false;
        return false;
    }

    public final boolean b(Point point)
    {
        if (f != e)
        {
            e();
        }
        if (i != null && !i.equals(h))
        {
            a.a(n.aQ);
        }
        g = true;
        return false;
    }

    public final void c()
    {
        if (!d)
        {
            b.a(this);
            d = true;
        }
    }

    public final void d()
    {
        if (d)
        {
            b.b(this);
            d = false;
        }
    }

    public final boolean j_()
    {
        return false;
    }

    public final boolean k_()
    {
        return false;
    }

    public final void onPinLocationEvent(daq daq1)
    {
        daq1 = daq1.a().getUberLatLng();
        if (gjx.a(daq1, j))
        {
            return;
        } else
        {
            j = daq1;
            k.post(new Runnable() {

                final fzk a;

                public final void run()
                {
                    a.a(false);
                }

            
            {
                a = fzk.this;
                super();
            }
            });
            return;
        }
    }
}
