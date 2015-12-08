// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.impl.conn;

import ch.boye.httpclientandroidlib.conn.OperatedClientConnection;
import ch.boye.httpclientandroidlib.conn.routing.HttpRoute;
import ch.boye.httpclientandroidlib.pool.ConnFactory;
import java.io.IOException;

// Referenced classes of package ch.boye.httpclientandroidlib.impl.conn:
//            HttpConnPool, DefaultClientConnection

static class 
    implements ConnFactory
{

    public OperatedClientConnection create(HttpRoute httproute)
        throws IOException
    {
        return new DefaultClientConnection();
    }

    public volatile Object create(Object obj)
        throws IOException
    {
        return create((HttpRoute)obj);
    }

    ()
    {
    }
}
