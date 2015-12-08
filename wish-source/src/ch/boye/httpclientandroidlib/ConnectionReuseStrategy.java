// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib;

import ch.boye.httpclientandroidlib.protocol.HttpContext;

// Referenced classes of package ch.boye.httpclientandroidlib:
//            HttpResponse

public interface ConnectionReuseStrategy
{

    public abstract boolean keepAlive(HttpResponse httpresponse, HttpContext httpcontext);
}
