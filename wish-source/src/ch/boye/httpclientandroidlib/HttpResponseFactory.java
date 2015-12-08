// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib;

import ch.boye.httpclientandroidlib.protocol.HttpContext;

// Referenced classes of package ch.boye.httpclientandroidlib:
//            ProtocolVersion, HttpResponse, StatusLine

public interface HttpResponseFactory
{

    public abstract HttpResponse newHttpResponse(ProtocolVersion protocolversion, int i, HttpContext httpcontext);

    public abstract HttpResponse newHttpResponse(StatusLine statusline, HttpContext httpcontext);
}
