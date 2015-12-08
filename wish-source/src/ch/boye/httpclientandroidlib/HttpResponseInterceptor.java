// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib;

import ch.boye.httpclientandroidlib.protocol.HttpContext;
import java.io.IOException;

// Referenced classes of package ch.boye.httpclientandroidlib:
//            HttpException, HttpResponse

public interface HttpResponseInterceptor
{

    public abstract void process(HttpResponse httpresponse, HttpContext httpcontext)
        throws HttpException, IOException;
}
