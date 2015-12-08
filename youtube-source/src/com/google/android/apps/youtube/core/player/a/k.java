// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player.a;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.youtube.common.L;
import java.io.File;
import java.security.Key;
import java.util.Locale;
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
//            i

final class k
    implements HttpRequestHandler
{

    private static final Pattern a = Pattern.compile("bytes=(\\d*)-(\\d*)");
    private final Key b;

    public k(Key key)
    {
        b = key;
    }

    public final void handle(HttpRequest httprequest, HttpResponse httpresponse, HttpContext httpcontext)
    {
        boolean flag;
        flag = true;
        try
        {
            httpcontext = httprequest.getRequestLine().getMethod().toUpperCase();
            if (!httpcontext.equals("GET"))
            {
                throw new MethodNotSupportedException((new StringBuilder()).append(httpcontext).append(" method is not supported.").toString());
            }
        }
        // Misplaced declaration of an exception variable
        catch (HttpRequest httprequest)
        {
            L.a("Internal error while handling a local file request", httprequest);
            throw new HttpException("Internal error while handling a local file request", httprequest);
        }
        httpcontext = new File(Uri.parse(httprequest.getRequestLine().getUri()).getQueryParameter("f"));
        if (!httpcontext.exists())
        {
            L.b((new StringBuilder("Requested file not found: ")).append(httpcontext.getAbsolutePath()).toString());
            httpresponse.setStatusCode(404);
            return;
        }
        if (!httpcontext.canRead())
        {
            L.b((new StringBuilder("Requested file cannot be read: ")).append(httpcontext.getAbsolutePath()).toString());
            httpresponse.setStatusCode(403);
            return;
        }
        long l1;
        httprequest = httprequest.getLastHeader("Range");
        l1 = httpcontext.length() - 1L;
        if (httprequest == null)
        {
            break MISSING_BLOCK_LABEL_464;
        }
        String s;
        httprequest = a.matcher(httprequest.getValue());
        if (!httprequest.matches())
        {
            break MISSING_BLOCK_LABEL_464;
        }
        s = httprequest.group(1);
        if (TextUtils.isEmpty(s)) goto _L2; else goto _L1
_L1:
        long l = Long.parseLong(s);
_L4:
        httprequest = httprequest.group(2);
        if (!TextUtils.isEmpty(httprequest))
        {
            l1 = Long.parseLong(httprequest);
        }
        if (l < 0L)
        {
            break MISSING_BLOCK_LABEL_292;
        }
        long l2;
        long l3;
        if (l1 < httpcontext.length())
        {
            l2 = l;
            l3 = l1;
            if (l <= l1)
            {
                break MISSING_BLOCK_LABEL_340;
            }
        }
        L.b(String.format("Invalid range %d-%d requested, file size is %d", new Object[] {
            Long.valueOf(l), Long.valueOf(l1), Long.valueOf(httpcontext.length())
        }));
        httpresponse.setStatusCode(416);
        return;
_L5:
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_446;
        }
        httpresponse.setStatusCode(206);
        httprequest = String.format(Locale.US, "bytes %d-%d/%d", new Object[] {
            Long.valueOf(l2), Long.valueOf(l3), Long.valueOf(httpcontext.length())
        });
        httpresponse.setHeader("Content-Range", httprequest);
        L.e((new StringBuilder("Requested range: ")).append(httprequest).toString());
_L3:
        httpresponse.setEntity(new i(httpcontext, "video/mp4", l2, l3, b));
        return;
        httpresponse.setStatusCode(200);
        if (true) goto _L3; else goto _L2
_L2:
        l = 0L;
          goto _L4
        l2 = 0L;
        flag = false;
        l3 = l1;
          goto _L5
    }

}
