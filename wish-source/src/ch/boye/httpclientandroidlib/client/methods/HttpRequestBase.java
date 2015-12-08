// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.client.methods;

import ch.boye.httpclientandroidlib.ProtocolVersion;
import ch.boye.httpclientandroidlib.RequestLine;
import ch.boye.httpclientandroidlib.client.utils.CloneUtils;
import ch.boye.httpclientandroidlib.conn.ClientConnectionRequest;
import ch.boye.httpclientandroidlib.conn.ConnectionReleaseTrigger;
import ch.boye.httpclientandroidlib.message.AbstractHttpMessage;
import ch.boye.httpclientandroidlib.message.BasicRequestLine;
import ch.boye.httpclientandroidlib.message.HeaderGroup;
import ch.boye.httpclientandroidlib.params.HttpParams;
import ch.boye.httpclientandroidlib.params.HttpProtocolParams;
import java.io.IOException;
import java.net.URI;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

// Referenced classes of package ch.boye.httpclientandroidlib.client.methods:
//            AbortableHttpRequest, HttpUriRequest

public abstract class HttpRequestBase extends AbstractHttpMessage
    implements AbortableHttpRequest, HttpUriRequest, Cloneable
{

    private Lock abortLock;
    private volatile boolean aborted;
    private ClientConnectionRequest connRequest;
    private ConnectionReleaseTrigger releaseTrigger;
    private URI uri;

    public HttpRequestBase()
    {
        abortLock = new ReentrantLock();
    }

    private void cleanup()
    {
        if (connRequest != null)
        {
            connRequest.abortRequest();
            connRequest = null;
        }
        if (releaseTrigger != null)
        {
            try
            {
                releaseTrigger.abortConnection();
            }
            catch (IOException ioexception) { }
            releaseTrigger = null;
        }
    }

    public void abort()
    {
        if (aborted)
        {
            return;
        }
        abortLock.lock();
        aborted = true;
        cleanup();
        abortLock.unlock();
        return;
        Exception exception;
        exception;
        abortLock.unlock();
        throw exception;
    }

    public Object clone()
        throws CloneNotSupportedException
    {
        HttpRequestBase httprequestbase = (HttpRequestBase)super.clone();
        httprequestbase.abortLock = new ReentrantLock();
        httprequestbase.aborted = false;
        httprequestbase.releaseTrigger = null;
        httprequestbase.connRequest = null;
        httprequestbase.headergroup = (HeaderGroup)CloneUtils.clone(headergroup);
        httprequestbase.params = (HttpParams)CloneUtils.clone(params);
        return httprequestbase;
    }

    public abstract String getMethod();

    public ProtocolVersion getProtocolVersion()
    {
        return HttpProtocolParams.getVersion(getParams());
    }

    public RequestLine getRequestLine()
    {
        Object obj;
        String s1;
        ProtocolVersion protocolversion;
label0:
        {
            s1 = getMethod();
            protocolversion = getProtocolVersion();
            obj = getURI();
            String s = null;
            if (obj != null)
            {
                s = ((URI) (obj)).toASCIIString();
            }
            if (s != null)
            {
                obj = s;
                if (s.length() != 0)
                {
                    break label0;
                }
            }
            obj = "/";
        }
        return new BasicRequestLine(s1, ((String) (obj)), protocolversion);
    }

    public URI getURI()
    {
        return uri;
    }

    public boolean isAborted()
    {
        return aborted;
    }

    public void releaseConnection()
    {
        reset();
    }

    public void reset()
    {
        abortLock.lock();
        cleanup();
        aborted = false;
        abortLock.unlock();
        return;
        Exception exception;
        exception;
        abortLock.unlock();
        throw exception;
    }

    public void setConnectionRequest(ClientConnectionRequest clientconnectionrequest)
        throws IOException
    {
        if (aborted)
        {
            throw new IOException("Request already aborted");
        }
        abortLock.lock();
        connRequest = clientconnectionrequest;
        abortLock.unlock();
        return;
        clientconnectionrequest;
        abortLock.unlock();
        throw clientconnectionrequest;
    }

    public void setReleaseTrigger(ConnectionReleaseTrigger connectionreleasetrigger)
        throws IOException
    {
        if (aborted)
        {
            throw new IOException("Request already aborted");
        }
        abortLock.lock();
        releaseTrigger = connectionreleasetrigger;
        abortLock.unlock();
        return;
        connectionreleasetrigger;
        abortLock.unlock();
        throw connectionreleasetrigger;
    }

    public void setURI(URI uri1)
    {
        uri = uri1;
    }

    public String toString()
    {
        return (new StringBuilder()).append(getMethod()).append(" ").append(getURI()).append(" ").append(getProtocolVersion()).toString();
    }
}
