// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.converter.http;

import com.google.android.apps.youtube.core.converter.d;
import java.io.IOException;
import java.io.InputStream;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpResponseException;

// Referenced classes of package com.google.android.apps.youtube.core.converter.http:
//            az

public abstract class ay
    implements d
{

    public static final ay b = new az();

    public ay()
    {
    }

    protected Object a(InputStream inputstream)
    {
        return null;
    }

    protected Object a(HttpEntity httpentity)
    {
        if (httpentity == null)
        {
            throw new IOException("Empty response body");
        } else
        {
            return a(httpentity.getContent());
        }
    }

    protected HttpResponseException a(HttpResponse httpresponse)
    {
        httpresponse = httpresponse.getStatusLine();
        return new HttpResponseException(httpresponse.getStatusCode(), httpresponse.getReasonPhrase());
    }

    public Object a_(Object obj)
    {
        return b((HttpResponse)obj);
    }

    public Object b(HttpResponse httpresponse)
    {
        c(httpresponse);
        return a(httpresponse.getEntity());
    }

    protected final void c(HttpResponse httpresponse)
    {
        if (d(httpresponse))
        {
            throw a(httpresponse);
        } else
        {
            return;
        }
    }

    protected boolean d(HttpResponse httpresponse)
    {
        return httpresponse.getStatusLine().getStatusCode() >= 300;
    }

}
