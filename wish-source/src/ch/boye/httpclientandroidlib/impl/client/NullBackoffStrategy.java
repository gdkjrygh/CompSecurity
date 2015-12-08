// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.impl.client;

import ch.boye.httpclientandroidlib.HttpResponse;
import ch.boye.httpclientandroidlib.client.ConnectionBackoffStrategy;

public class NullBackoffStrategy
    implements ConnectionBackoffStrategy
{

    public NullBackoffStrategy()
    {
    }

    public boolean shouldBackoff(HttpResponse httpresponse)
    {
        return false;
    }

    public boolean shouldBackoff(Throwable throwable)
    {
        return false;
    }
}
