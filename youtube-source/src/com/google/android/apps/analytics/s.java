// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.analytics;

import android.os.Build;
import android.os.Looper;
import java.util.Locale;
import org.apache.http.HttpHost;

// Referenced classes of package com.google.android.apps.analytics:
//            g, t, h, n

final class s
    implements g
{

    private final String a;
    private final HttpHost b;
    private t c;
    private boolean d;

    public s()
    {
        this("GoogleAnalytics", "1.5.1");
    }

    public s(String s1, String s2)
    {
        this(s1, s2, "www.google-analytics.com", 80);
    }

    private s(String s1, String s2, String s3, int i)
    {
        d = false;
        b = new HttpHost(s3, 80);
        Object obj = Locale.getDefault();
        String s4 = android.os.Build.VERSION.RELEASE;
        if (((Locale) (obj)).getLanguage() != null)
        {
            s3 = ((Locale) (obj)).getLanguage().toLowerCase();
        } else
        {
            s3 = "en";
        }
        if (((Locale) (obj)).getCountry() != null)
        {
            obj = ((Locale) (obj)).getCountry().toLowerCase();
        } else
        {
            obj = "";
        }
        a = String.format("%s/%s (Linux; U; Android %s; %s-%s; %s Build/%s)", new Object[] {
            s1, s2, s4, s3, obj, Build.MODEL, Build.ID
        });
    }

    static HttpHost a(s s1)
    {
        return s1.b;
    }

    public final void a(h h)
    {
        if (c != null && c.getLooper() != null)
        {
            c.getLooper().quit();
            c = null;
        }
        c = new t(h, a, this, (byte)0);
        c.start();
    }

    public final void a(boolean flag)
    {
        d = flag;
    }

    public final void a(n an[])
    {
        if (c == null)
        {
            return;
        } else
        {
            c.a(an);
            return;
        }
    }

    public final boolean a()
    {
        return d;
    }
}
