// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.conn;

import ch.boye.httpclientandroidlib.HttpEntity;
import ch.boye.httpclientandroidlib.entity.HttpEntityWrapper;
import ch.boye.httpclientandroidlib.util.EntityUtils;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.SocketException;

// Referenced classes of package ch.boye.httpclientandroidlib.conn:
//            ConnectionReleaseTrigger, EofSensorWatcher, ManagedClientConnection, EofSensorInputStream

public class BasicManagedEntity extends HttpEntityWrapper
    implements ConnectionReleaseTrigger, EofSensorWatcher
{

    protected final boolean attemptReuse;
    protected ManagedClientConnection managedConn;

    public BasicManagedEntity(HttpEntity httpentity, ManagedClientConnection managedclientconnection, boolean flag)
    {
        super(httpentity);
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

    private void ensureConsumed()
        throws IOException
    {
        if (managedConn == null)
        {
            return;
        }
        if (attemptReuse)
        {
            EntityUtils.consume(wrappedEntity);
            managedConn.markReusable();
        }
        releaseManagedConnection();
        return;
        Exception exception;
        exception;
        releaseManagedConnection();
        throw exception;
    }

    public void abortConnection()
        throws IOException
    {
        if (managedConn == null)
        {
            break MISSING_BLOCK_LABEL_21;
        }
        managedConn.abortConnection();
        managedConn = null;
        return;
        Exception exception;
        exception;
        managedConn = null;
        throw exception;
    }

    public void consumeContent()
        throws IOException
    {
        ensureConsumed();
    }

    public boolean eofDetected(InputStream inputstream)
        throws IOException
    {
        if (attemptReuse && managedConn != null)
        {
            inputstream.close();
            managedConn.markReusable();
        }
        releaseManagedConnection();
        return false;
        inputstream;
        releaseManagedConnection();
        throw inputstream;
    }

    public InputStream getContent()
        throws IOException
    {
        return new EofSensorInputStream(wrappedEntity.getContent(), this);
    }

    public boolean isRepeatable()
    {
        return false;
    }

    public void releaseConnection()
        throws IOException
    {
        ensureConsumed();
    }

    protected void releaseManagedConnection()
        throws IOException
    {
        if (managedConn == null)
        {
            break MISSING_BLOCK_LABEL_21;
        }
        managedConn.releaseConnection();
        managedConn = null;
        return;
        Exception exception;
        exception;
        managedConn = null;
        throw exception;
    }

    public boolean streamAbort(InputStream inputstream)
        throws IOException
    {
        if (managedConn != null)
        {
            managedConn.abortConnection();
        }
        return false;
    }

    public boolean streamClosed(InputStream inputstream)
        throws IOException
    {
        boolean flag;
        if (!attemptReuse || managedConn == null)
        {
            break MISSING_BLOCK_LABEL_37;
        }
        flag = managedConn.isOpen();
        inputstream.close();
        managedConn.markReusable();
_L2:
        releaseManagedConnection();
        return false;
        inputstream;
        if (!flag) goto _L2; else goto _L1
_L1:
        throw inputstream;
        inputstream;
        releaseManagedConnection();
        throw inputstream;
    }

    public void writeTo(OutputStream outputstream)
        throws IOException
    {
        super.writeTo(outputstream);
        ensureConsumed();
    }
}
