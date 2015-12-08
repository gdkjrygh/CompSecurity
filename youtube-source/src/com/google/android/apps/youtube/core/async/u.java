// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.async;

import android.content.SharedPreferences;
import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.a.b;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.converter.http.ay;
import java.io.IOException;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.HttpResponseException;
import org.apache.http.client.methods.HttpUriRequest;

// Referenced classes of package com.google.android.apps.youtube.core.async:
//            g, v

public final class u extends g
    implements android.content.SharedPreferences.OnSharedPreferenceChangeListener
{

    public static SharedPreferences a;
    private static Boolean d = null;
    private final HttpClient b;
    private boolean c;

    public u(HttpClient httpclient, com.google.android.apps.youtube.core.converter.c c1, ay ay)
    {
        super(c1, ay);
        c = false;
        b = (HttpClient)com.google.android.apps.youtube.common.fromguava.c.a(httpclient);
        if (a != null)
        {
            a.registerOnSharedPreferenceChangeListener(this);
            if (d == null)
            {
                d = Boolean.valueOf(a.getBoolean("api_request_logging", false));
            }
        }
    }

    private static void a(HttpResponse httpresponse)
    {
        httpresponse = httpresponse.getEntity();
        if (httpresponse != null)
        {
            httpresponse.consumeContent();
        }
    }

    protected final void a(Object obj, Object obj1, b b1, Exception exception)
    {
        obj1 = (HttpUriRequest)obj1;
        if (exception instanceof HttpResponseException)
        {
            HttpResponseException httpresponseexception = (HttpResponseException)exception;
            L.e((new StringBuilder("Http error: request=[")).append(((HttpUriRequest) (obj1)).getURI()).append("]").toString());
            L.b((new StringBuilder("Http error: status=[")).append(httpresponseexception.getStatusCode()).append("] msg=[").append(exception.getMessage()).append("]").toString());
        }
        super.a(obj, obj1, b1, exception);
    }

    protected final void b(Object obj, b b1)
    {
        HttpResponse httpresponse1;
        HttpResponse httpresponse2;
        HttpResponse httpresponse3;
        HttpUriRequest httpurirequest;
        httpurirequest = (HttpUriRequest)obj;
        com.google.android.apps.youtube.common.fromguava.c.a(httpurirequest);
        if (c || Boolean.TRUE.equals(d))
        {
            L.e(v.a(httpurirequest));
        }
        httpresponse2 = null;
        obj = null;
        httpresponse3 = null;
        httpresponse1 = null;
        HttpResponse httpresponse = b.execute(httpurirequest);
        httpresponse1 = httpresponse;
        httpresponse2 = httpresponse;
        obj = httpresponse;
        httpresponse3 = httpresponse;
        b1.a(httpurirequest, httpresponse);
        if (httpresponse == null)
        {
            break MISSING_BLOCK_LABEL_90;
        }
        a(httpresponse);
_L2:
        return;
        obj;
        L.b("Error consuming content response", ((Throwable) (obj)));
        return;
        IllegalStateException illegalstateexception;
        illegalstateexception;
        obj = httpresponse1;
        b1.a(httpurirequest, illegalstateexception);
        if (httpresponse1 == null) goto _L2; else goto _L1
_L1:
        try
        {
            a(httpresponse1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            L.b("Error consuming content response", ((Throwable) (obj)));
        }
        return;
        b1;
        obj = httpresponse2;
        httpurirequest.abort();
        obj = httpresponse2;
        throw b1;
        b1;
        Exception exception;
        if (obj != null)
        {
            try
            {
                a(((HttpResponse) (obj)));
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                L.b("Error consuming content response", ((Throwable) (obj)));
            }
        }
        throw b1;
        exception;
        obj = httpresponse3;
        b1.a(httpurirequest, exception);
        if (httpresponse3 != null)
        {
            try
            {
                a(httpresponse3);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                L.b("Error consuming content response", ((Throwable) (obj)));
            }
            return;
        }
          goto _L2
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedpreferences, String s)
    {
        if ("api_request_logging".equals(s))
        {
            d = Boolean.valueOf(sharedpreferences.getBoolean(s, false));
        }
    }

}
