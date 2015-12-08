// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player.a;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.youtube.common.fromguava.e;
import com.google.android.apps.youtube.core.utils.p;
import com.google.android.exoplayer.upstream.cache.a;
import com.google.android.exoplayer.upstream.i;
import com.google.android.exoplayer.upstream.j;
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
//            a, f

public final class h
    implements HttpRequestHandler
{

    private final e a;
    private final com.google.android.apps.youtube.core.player.a.a b;

    public h(e e1, com.google.android.apps.youtube.core.player.a.a a1)
    {
        a = e1;
        b = a1;
    }

    public final void a(a a1, a a2)
    {
        b.a(a1, a2);
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
            throw new HttpException("Internal error while handling an exo requset.", httprequest);
        }
        Object obj;
        String s;
        String s1;
        Object obj1;
        long l2;
        obj1 = Uri.parse(httprequest.getRequestLine().getUri());
        httpcontext = ((Uri) (obj1)).getQueryParameter("id");
        s = Uri.decode(((Uri) (obj1)).getQueryParameter("s"));
        s1 = ((Uri) (obj1)).getQueryParameter("i");
        obj = ((Uri) (obj1)).getQueryParameter("l");
        obj1 = ((Uri) (obj1)).getQueryParameter("m");
        l2 = Long.parseLong(((String) (obj)));
        obj = httprequest.getLastHeader("Range");
        long l;
        long l1;
        long l3;
        l = 0L;
        l3 = l;
        l1 = l2;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_253;
        }
        httprequest = Pattern.compile("bytes=(\\d*)-(\\d*)").matcher(((Header) (obj)).getValue());
        l3 = l;
        l1 = l2;
        String s2;
        if (!httprequest.matches())
        {
            break MISSING_BLOCK_LABEL_253;
        }
        s2 = httprequest.group(1);
        l1 = l2;
        if (TextUtils.isEmpty(s2))
        {
            break MISSING_BLOCK_LABEL_217;
        }
        l = Long.parseLong(s2);
        l1 = l2 - l;
        httprequest = httprequest.group(2);
        l3 = l;
        if (TextUtils.isEmpty(httprequest))
        {
            break MISSING_BLOCK_LABEL_253;
        }
        l1 = Long.parseLong(httprequest);
        l1 = (l1 - l) + 1L;
        l3 = l;
        if (!TextUtils.isEmpty(httpcontext))
        {
            break MISSING_BLOCK_LABEL_323;
        }
        httpcontext = (i)a.b();
        httprequest = new j(Uri.parse(s), l3, l1, null);
_L1:
        httpresponse.setEntity(new f(httpcontext, httprequest, "video/mp4"));
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_361;
        }
        httpresponse.setStatusCode(200);
        return;
        httprequest = p.a(httpcontext, s1, ((String) (obj1)));
        httprequest = new j(Uri.parse(s), l3, l1, httprequest);
        httpcontext = b.a();
          goto _L1
        httpresponse.setStatusCode(206);
        return;
        httprequest;
        httpresponse.setStatusCode(404);
        return;
    }
}
