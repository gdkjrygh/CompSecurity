// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.conn;

import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package ch.boye.httpclientandroidlib.conn:
//            EofSensorWatcher, ManagedClientConnection

public class BasicEofSensorWatcher
    implements EofSensorWatcher
{

    protected final boolean attemptReuse;
    protected final ManagedClientConnection managedConn;

    public BasicEofSensorWatcher(ManagedClientConnection managedclientconnection, boolean flag)
    {
        if (managedclientconnection == null)
        {
            throw new IllegalArgumentException("Connection may not be null.");
        } else
        {
            managedConn = managedclientconnection;
            attemptReuse = flag;
            return;
        }
    }

    public boolean eofDetected(InputStream inputstream)
        throws IOException
    {
        if (attemptReuse)
        {
            inputstream.close();
            managedConn.markReusable();
        }
        managedConn.releaseConnection();
        return false;
        inputstream;
        managedConn.releaseConnection();
        throw inputstream;
    }

    public boolean streamAbort(InputStream inputstream)
        throws IOException
    {
        managedConn.abortConnection();
        return false;
    }

    public boolean streamClosed(InputStream inputstream)
        throws IOException
    {
        if (attemptReuse)
        {
            inputstream.close();
            managedConn.markReusable();
        }
        managedConn.releaseConnection();
        return false;
        inputstream;
        managedConn.releaseConnection();
        throw inputstream;
    }
}
