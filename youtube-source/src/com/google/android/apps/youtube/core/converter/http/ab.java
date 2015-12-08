// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.converter.http;

import android.net.Uri;
import com.google.android.apps.youtube.core.converter.ConverterException;
import com.google.android.apps.youtube.core.converter.c;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpUriRequest;

// Referenced classes of package com.google.android.apps.youtube.core.converter.http:
//            ay, HttpMethod

public class ab extends ay
    implements c
{

    public ab()
    {
    }

    private Long e(HttpResponse httpresponse)
    {
        c(httpresponse);
        httpresponse = httpresponse.getFirstHeader("Content-Range");
        if (httpresponse == null)
        {
            throw new ConverterException("Missing content range header");
        }
        httpresponse = httpresponse.getValue();
        int i = httpresponse.lastIndexOf("/") + 1;
        if (i > 0 && i < httpresponse.length())
        {
            long l;
            try
            {
                l = Long.parseLong(httpresponse.substring(i));
            }
            // Misplaced declaration of an exception variable
            catch (HttpResponse httpresponse)
            {
                throw new ConverterException(httpresponse);
            }
            return Long.valueOf(l);
        } else
        {
            throw new ConverterException("Invalid content range header");
        }
    }

    public volatile Object a(Object obj)
    {
        return a((Uri)obj);
    }

    public HttpUriRequest a(Uri uri)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(uri);
        uri = HttpMethod.GET.createHttpRequest(uri);
        uri.addHeader("Range", "bytes=0-1");
        return uri;
    }

    public final Object a_(Object obj)
    {
        return e((HttpResponse)obj);
    }

    public final Object b(HttpResponse httpresponse)
    {
        return e(httpresponse);
    }
}
