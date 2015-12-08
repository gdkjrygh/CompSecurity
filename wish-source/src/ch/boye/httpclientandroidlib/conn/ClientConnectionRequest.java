// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.conn;

import java.util.concurrent.TimeUnit;

// Referenced classes of package ch.boye.httpclientandroidlib.conn:
//            ConnectionPoolTimeoutException, ManagedClientConnection

public interface ClientConnectionRequest
{

    public abstract void abortRequest();

    public abstract ManagedClientConnection getConnection(long l, TimeUnit timeunit)
        throws InterruptedException, ConnectionPoolTimeoutException;
}
