// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player.a;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.e.b;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.utils.p;
import com.google.android.exoplayer.upstream.FileDataSource;
import com.google.android.exoplayer.upstream.cache.a;
import com.google.android.exoplayer.upstream.j;
import java.security.Key;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.http.Header;
import org.apache.http.HttpException;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.MethodNotSupportedException;
import org.apache.http.RequestLine;
import org.apache.http.protocol.HttpContext;
import org.apache.http.protocol.HttpRequestHandler;

// Referenced classes of package com.google.android.apps.youtube.core.player.a:
//            f, m

public final class n
    implements HttpRequestHandler
{

    private final Key a;
    private final b b;
    private a c;
    private a d;

    public n(Key key, b b1)
    {
        a = key;
        b = (b)com.google.android.apps.youtube.common.fromguava.c.a(b1);
        c = null;
        d = null;
    }

    public final void a(a a1, a a2)
    {
        c = a1;
        d = a2;
    }

    public final void handle(HttpRequest httprequest, HttpResponse httpresponse, HttpContext httpcontext)
    {
        try
        {
            httpcontext = httprequest.getRequestLine().getMethod();
            if (!"GET".equalsIgnoreCase(httpcontext))
            {
                throw new MethodNotSupportedException((new StringBuilder("Method is not supported: ")).append(httpcontext).toString());
            }
        }
        // Misplaced declaration of an exception variable
        catch (HttpRequest httprequest)
        {
            throw new HttpException("Internal error while handling an exo request.", httprequest);
        }
        Object obj;
        String s;
        Object obj1;
        long l2;
        obj1 = Uri.parse(httprequest.getRequestLine().getUri());
        obj = ((Uri) (obj1)).getQueryParameter("v");
        s = ((Uri) (obj1)).getQueryParameter("i");
        httpcontext = ((Uri) (obj1)).getQueryParameter("l");
        String s1 = ((Uri) (obj1)).getQueryParameter("e");
        obj1 = ((Uri) (obj1)).getQueryParameter("m");
        l2 = Long.parseLong(httpcontext);
        if (Long.parseLong(s1) < b.b())
        {
            L.c("Offline URL has expired. Not allowed to access content.");
            httpresponse.setStatusCode(403);
            return;
        }
        httpcontext = httprequest.getLastHeader("Range");
        long l;
        long l1;
        long l3;
        l = 0L;
        l3 = l;
        l1 = l2;
        if (httpcontext == null)
        {
            break MISSING_BLOCK_LABEL_275;
        }
        httprequest = Pattern.compile("bytes=(\\d*)-(\\d*)").matcher(httpcontext.getValue());
        l3 = l;
        l1 = l2;
        String s2;
        if (!httprequest.matches())
        {
            break MISSING_BLOCK_LABEL_275;
        }
        s2 = httprequest.group(1);
        l1 = l2;
        if (TextUtils.isEmpty(s2))
        {
            break MISSING_BLOCK_LABEL_243;
        }
        l = Long.parseLong(s2);
        l1 = l2 - l;
        httprequest = httprequest.group(2);
        l3 = l;
        if (TextUtils.isEmpty(httprequest))
        {
            break MISSING_BLOCK_LABEL_275;
        }
        l1 = (Long.parseLong(httprequest) - l) + 1L;
        l3 = l;
        if (c == null)
        {
            httpresponse.setStatusCode(404);
            return;
        }
        if (TextUtils.isEmpty(((CharSequence) (obj))))
        {
            break MISSING_BLOCK_LABEL_430;
        }
        obj = new j(null, l3, l1, p.a(((String) (obj)), s, ((String) (obj1))));
        httprequest = new FileDataSource();
        if (a != null)
        {
            httprequest = new com.google.android.exoplayer.upstream.a.b(a.getEncoded(), httprequest);
        }
        httpresponse.setEntity(new f(new m(c, d, httprequest), ((j) (obj)), "video/mp4"));
        if (httpcontext != null)
        {
            break MISSING_BLOCK_LABEL_420;
        }
        httpresponse.setStatusCode(200);
        return;
        httprequest;
        L.a("Exception while trying to construct a offline data source.", httprequest);
        httpresponse.setStatusCode(500);
        return;
        httpresponse.setStatusCode(206);
        return;
        httpresponse.setStatusCode(404);
        return;
    }
}
