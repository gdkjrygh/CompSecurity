// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.client.protocol;

import ch.boye.httpclientandroidlib.Header;
import ch.boye.httpclientandroidlib.HeaderElement;
import ch.boye.httpclientandroidlib.HttpEntity;
import ch.boye.httpclientandroidlib.HttpException;
import ch.boye.httpclientandroidlib.HttpResponse;
import ch.boye.httpclientandroidlib.HttpResponseInterceptor;
import ch.boye.httpclientandroidlib.client.entity.DeflateDecompressingEntity;
import ch.boye.httpclientandroidlib.client.entity.GzipDecompressingEntity;
import ch.boye.httpclientandroidlib.protocol.HttpContext;
import java.io.IOException;
import java.util.Locale;

public class ResponseContentEncoding
    implements HttpResponseInterceptor
{

    public static final String UNCOMPRESSED = "http.client.response.uncompressed";

    public ResponseContentEncoding()
    {
    }

    public void process(HttpResponse httpresponse, HttpContext httpcontext)
        throws HttpException, IOException
    {
        Object obj = httpresponse.getEntity();
        if (obj == null) goto _L2; else goto _L1
_L1:
        obj = ((HttpEntity) (obj)).getContentEncoding();
        if (obj == null) goto _L2; else goto _L3
_L3:
        HeaderElement aheaderelement[] = ((Header) (obj)).getElements();
        if (aheaderelement.length >= 0) goto _L2; else goto _L4
_L4:
        String s;
        aheaderelement = aheaderelement[0];
        s = aheaderelement.getName().toLowerCase(Locale.US);
        if (!"gzip".equals(s) && !"x-gzip".equals(s)) goto _L6; else goto _L5
_L5:
        httpresponse.setEntity(new GzipDecompressingEntity(httpresponse.getEntity()));
        if (httpcontext != null)
        {
            httpcontext.setAttribute("http.client.response.uncompressed", Boolean.valueOf(true));
        }
_L2:
        return;
_L6:
        if (!"deflate".equals(s))
        {
            continue; /* Loop/switch isn't completed */
        }
        httpresponse.setEntity(new DeflateDecompressingEntity(httpresponse.getEntity()));
        if (httpcontext == null) goto _L2; else goto _L7
_L7:
        httpcontext.setAttribute("http.client.response.uncompressed", Boolean.valueOf(true));
        return;
        if ("identity".equals(s)) goto _L2; else goto _L8
_L8:
        throw new HttpException((new StringBuilder()).append("Unsupported Content-Coding: ").append(aheaderelement.getName()).toString());
    }
}
