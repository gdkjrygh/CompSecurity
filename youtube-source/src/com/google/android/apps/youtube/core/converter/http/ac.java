// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.converter.http;

import android.net.Uri;
import com.google.android.apps.youtube.core.converter.ConverterException;
import com.google.android.apps.youtube.core.converter.c;
import org.apache.http.Header;
import org.apache.http.HttpResponse;

// Referenced classes of package com.google.android.apps.youtube.core.converter.http:
//            ay, HttpMethod

public final class ac extends ay
    implements c
{

    public ac()
    {
    }

    private Long e(HttpResponse httpresponse)
    {
        c(httpresponse);
        httpresponse = httpresponse.getFirstHeader("Content-Length");
        if (httpresponse == null)
        {
            throw new ConverterException("Missing content length header");
        }
        httpresponse = httpresponse.getValue();
        long l;
        try
        {
            l = Long.parseLong(httpresponse);
        }
        // Misplaced declaration of an exception variable
        catch (HttpResponse httpresponse)
        {
            throw new ConverterException(httpresponse);
        }
        return Long.valueOf(l);
    }

    public final Object a(Object obj)
    {
        obj = (Uri)obj;
        com.google.android.apps.youtube.common.fromguava.c.a(obj);
        return HttpMethod.HEAD.createHttpRequest(((Uri) (obj)));
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
