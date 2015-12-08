// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.protocol;

import ch.boye.httpclientandroidlib.HttpException;
import ch.boye.httpclientandroidlib.HttpRequest;
import ch.boye.httpclientandroidlib.HttpResponse;
import java.io.IOException;

// Referenced classes of package ch.boye.httpclientandroidlib.protocol:
//            HttpContext

public interface HttpRequestHandler
{

    public abstract void handle(HttpRequest httprequest, HttpResponse httpresponse, HttpContext httpcontext)
        throws HttpException, IOException;
}
