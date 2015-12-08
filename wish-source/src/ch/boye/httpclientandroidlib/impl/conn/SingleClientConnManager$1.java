// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.impl.conn;

import ch.boye.httpclientandroidlib.conn.ClientConnectionRequest;
import ch.boye.httpclientandroidlib.conn.ManagedClientConnection;
import ch.boye.httpclientandroidlib.conn.routing.HttpRoute;
import java.util.concurrent.TimeUnit;

// Referenced classes of package ch.boye.httpclientandroidlib.impl.conn:
//            SingleClientConnManager

class val.state
    implements ClientConnectionRequest
{

    final SingleClientConnManager this$0;
    final HttpRoute val$route;
    final Object val$state;

    public void abortRequest()
    {
    }

    public ManagedClientConnection getConnection(long l, TimeUnit timeunit)
    {
        return SingleClientConnManager.this.getConnection(val$route, val$state);
    }

    ()
    {
        this$0 = final_singleclientconnmanager;
        val$route = httproute;
        val$state = Object.this;
        super();
    }
}
