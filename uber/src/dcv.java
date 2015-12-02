// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Application;
import android.os.Handler;
import android.os.Looper;
import android.widget.Toast;
import com.ubercab.analytics.model.AnalyticsEvent;

public final class dcv
    implements chr
{

    private Application a;
    private Handler b;

    public dcv(Application application)
    {
        a = application;
    }

    static Application a(dcv dcv1)
    {
        return dcv1.a;
    }

    public final void a(cia cia, String s)
    {
        if (b == null)
        {
            b = new Handler(Looper.getMainLooper());
        }
        b.post(new Runnable(s, cia) {

            final String a;
            final cia b;
            final dcv c;

            public final void run()
            {
                String s1 = (new StringBuilder()).append(a).append(": ").append(b.name().toLowerCase()).toString();
                Toast.makeText(dcv.a(c), s1, 0).show();
                ijg.a(String.format("Analytics event: %s - %s", new Object[] {
                    b.name(), a
                }), new Object[0]);
            }

            
            {
                c = dcv.this;
                a = s;
                b = cia1;
                super();
            }
        });
    }

    public final void a(AnalyticsEvent analyticsevent)
    {
    }
}
