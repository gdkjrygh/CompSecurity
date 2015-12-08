// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk.onetouch.core;

import android.util.Log;
import java.io.IOException;
import java.util.Locale;
import org.apache.http.NoHttpResponseException;
import org.apache.http.client.HttpClient;
import org.apache.http.conn.ClientConnectionManager;

// Referenced classes of package com.paypal.android.sdk.onetouch.core:
//            bq, cl, cd, c, 
//            cm, bl

final class cf extends bq
{

    private final cl a;
    private cd b;

    private cf(cd cd1, cl cl1)
    {
        b = cd1;
        super();
        a = cl1;
    }

    cf(cd cd1, cl cl1, byte byte0)
    {
        this(cd1, cl1);
    }

    private String a(String s)
    {
        Locale locale = Locale.US;
        String s1 = (new StringBuilder()).append(a.n()).append(" PayPal Debug-ID: %s [%s, %s]").toString();
        String s2 = cd.b(b);
        StringBuilder stringbuilder = (new StringBuilder()).append(cd.c(b).a()).append(";");
        cd.c(b);
        return String.format(locale, s1, new Object[] {
            s, s2, stringbuilder.append("release").toString()
        });
    }

    public final void a(String s, String s1)
    {
        try
        {
            a.b(s);
            s = a;
            cd.a();
            (new StringBuilder()).append(a.n()).append(" success. response: ").append(a.h());
            if (c.b(s1))
            {
                Log.w("paypal.sdk", a(s1));
            }
            if (a.p())
            {
                cd.a(a);
            }
            cd.a(b).a(a);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.e("paypal.sdk", "exception in response handler", s);
        }
        throw s;
    }

    public final void a(Throwable throwable, String s, String s1)
    {
        a.b(s);
        if (c.b(s1))
        {
            Log.w("paypal.sdk", a(s1));
        }
        if (throwable instanceof NoHttpResponseException)
        {
            cd.d(b).a().getConnectionManager().closeExpiredConnections();
            b.b(a);
            return;
        }
        try
        {
            cd.a(b, a, (IOException)throwable);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Throwable throwable)
        {
            Log.e("paypal.sdk", "exception in response handler", throwable);
        }
        throw throwable;
    }
}
