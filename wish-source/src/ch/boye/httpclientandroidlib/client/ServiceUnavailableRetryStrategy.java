// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.client;

import ch.boye.httpclientandroidlib.HttpResponse;
import ch.boye.httpclientandroidlib.protocol.HttpContext;

public interface ServiceUnavailableRetryStrategy
{

    public abstract long getRetryInterval();

    public abstract boolean retryRequest(HttpResponse httpresponse, int i, HttpContext httpcontext);
}
