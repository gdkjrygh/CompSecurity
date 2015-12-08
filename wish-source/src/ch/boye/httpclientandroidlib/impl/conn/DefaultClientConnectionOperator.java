// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.impl.conn;

import ch.boye.httpclientandroidlib.HttpHost;
import ch.boye.httpclientandroidlib.androidextra.HttpClientAndroidLog;
import ch.boye.httpclientandroidlib.conn.ClientConnectionOperator;
import ch.boye.httpclientandroidlib.conn.ConnectTimeoutException;
import ch.boye.httpclientandroidlib.conn.DnsResolver;
import ch.boye.httpclientandroidlib.conn.HttpHostConnectException;
import ch.boye.httpclientandroidlib.conn.HttpInetSocketAddress;
import ch.boye.httpclientandroidlib.conn.OperatedClientConnection;
import ch.boye.httpclientandroidlib.conn.scheme.Scheme;
import ch.boye.httpclientandroidlib.conn.scheme.SchemeLayeredSocketFactory;
import ch.boye.httpclientandroidlib.conn.scheme.SchemeRegistry;
import ch.boye.httpclientandroidlib.conn.scheme.SchemeSocketFactory;
import ch.boye.httpclientandroidlib.params.HttpConnectionParams;
import ch.boye.httpclientandroidlib.params.HttpParams;
import ch.boye.httpclientandroidlib.protocol.HttpContext;
import java.io.IOException;
import java.net.ConnectException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.UnknownHostException;

// Referenced classes of package ch.boye.httpclientandroidlib.impl.conn:
//            SystemDefaultDnsResolver, DefaultClientConnection

public class DefaultClientConnectionOperator
    implements ClientConnectionOperator
{

    protected final DnsResolver dnsResolver;
    public HttpClientAndroidLog log;
    protected final SchemeRegistry schemeRegistry;

    public DefaultClientConnectionOperator(SchemeRegistry schemeregistry)
    {
        log = new HttpClientAndroidLog(getClass());
        if (schemeregistry == null)
        {
            throw new IllegalArgumentException("Scheme registry amy not be null");
        } else
        {
            schemeRegistry = schemeregistry;
            dnsResolver = new SystemDefaultDnsResolver();
            return;
        }
    }

    public DefaultClientConnectionOperator(SchemeRegistry schemeregistry, DnsResolver dnsresolver)
    {
        log = new HttpClientAndroidLog(getClass());
        if (schemeregistry == null)
        {
            throw new IllegalArgumentException("Scheme registry may not be null");
        }
        if (dnsresolver == null)
        {
            throw new IllegalArgumentException("DNS resolver may not be null");
        } else
        {
            schemeRegistry = schemeregistry;
            dnsResolver = dnsresolver;
            return;
        }
    }

    public OperatedClientConnection createConnection()
    {
        return new DefaultClientConnection();
    }

    public void openConnection(OperatedClientConnection operatedclientconnection, HttpHost httphost, InetAddress inetaddress, HttpContext httpcontext, HttpParams httpparams)
        throws IOException
    {
        SchemeSocketFactory schemesocketfactory;
        InetAddress ainetaddress[];
        int i;
        int j;
        if (operatedclientconnection == null)
        {
            throw new IllegalArgumentException("Connection may not be null");
        }
        if (httphost == null)
        {
            throw new IllegalArgumentException("Target host may not be null");
        }
        if (httpparams == null)
        {
            throw new IllegalArgumentException("Parameters may not be null");
        }
        if (operatedclientconnection.isOpen())
        {
            throw new IllegalStateException("Connection must not be open");
        }
        Scheme scheme = schemeRegistry.getScheme(httphost.getSchemeName());
        schemesocketfactory = scheme.getSchemeSocketFactory();
        ainetaddress = resolveHostname(httphost.getHostName());
        j = scheme.resolvePort(httphost.getPort());
        i = 0;
_L2:
        HttpInetSocketAddress httpinetsocketaddress;
        boolean flag;
        if (i >= ainetaddress.length)
        {
            break MISSING_BLOCK_LABEL_291;
        }
        Object obj = ainetaddress[i];
        Socket socket;
        Socket socket1;
        if (i == ainetaddress.length - 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        socket = schemesocketfactory.createSocket(httpparams);
        operatedclientconnection.opening(socket, httphost);
        httpinetsocketaddress = new HttpInetSocketAddress(httphost, ((InetAddress) (obj)), j);
        obj = null;
        if (inetaddress != null)
        {
            obj = new InetSocketAddress(inetaddress, 0);
        }
        if (log.isDebugEnabled())
        {
            log.debug((new StringBuilder()).append("Connecting to ").append(httpinetsocketaddress).toString());
        }
        socket1 = schemesocketfactory.connectSocket(socket, httpinetsocketaddress, ((InetSocketAddress) (obj)), httpparams);
        obj = socket;
        if (socket == socket1)
        {
            break MISSING_BLOCK_LABEL_264;
        }
        obj = socket1;
        operatedclientconnection.opening(((Socket) (obj)), httphost);
        prepareSocket(((Socket) (obj)), httpcontext, httpparams);
        operatedclientconnection.openCompleted(schemesocketfactory.isSecure(((Socket) (obj))), httpparams);
        return;
        Object obj1;
        obj1;
        if (flag)
        {
            throw new HttpHostConnectException(httphost, ((ConnectException) (obj1)));
        }
        break MISSING_BLOCK_LABEL_326;
        obj1;
        if (flag)
        {
            throw obj1;
        }
        if (log.isDebugEnabled())
        {
            log.debug((new StringBuilder()).append("Connect to ").append(httpinetsocketaddress).append(" timed out. ").append("Connection will be retried using another IP address").toString());
        }
        i++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    protected void prepareSocket(Socket socket, HttpContext httpcontext, HttpParams httpparams)
        throws IOException
    {
        socket.setTcpNoDelay(HttpConnectionParams.getTcpNoDelay(httpparams));
        socket.setSoTimeout(HttpConnectionParams.getSoTimeout(httpparams));
        int i = HttpConnectionParams.getLinger(httpparams);
        if (i >= 0)
        {
            boolean flag;
            if (i > 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            socket.setSoLinger(flag, i);
        }
    }

    protected InetAddress[] resolveHostname(String s)
        throws UnknownHostException
    {
        return dnsResolver.resolve(s);
    }

    public void updateSecureConnection(OperatedClientConnection operatedclientconnection, HttpHost httphost, HttpContext httpcontext, HttpParams httpparams)
        throws IOException
    {
        if (operatedclientconnection == null)
        {
            throw new IllegalArgumentException("Connection may not be null");
        }
        if (httphost == null)
        {
            throw new IllegalArgumentException("Target host may not be null");
        }
        if (httpparams == null)
        {
            throw new IllegalArgumentException("Parameters may not be null");
        }
        if (!operatedclientconnection.isOpen())
        {
            throw new IllegalStateException("Connection must be open");
        }
        Object obj = schemeRegistry.getScheme(httphost.getSchemeName());
        if (!(((Scheme) (obj)).getSchemeSocketFactory() instanceof SchemeLayeredSocketFactory))
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Target scheme (").append(((Scheme) (obj)).getName()).append(") must have layered socket factory.").toString());
        }
        SchemeLayeredSocketFactory schemelayeredsocketfactory = (SchemeLayeredSocketFactory)((Scheme) (obj)).getSchemeSocketFactory();
        try
        {
            obj = schemelayeredsocketfactory.createLayeredSocket(operatedclientconnection.getSocket(), httphost.getHostName(), ((Scheme) (obj)).resolvePort(httphost.getPort()), httpparams);
        }
        // Misplaced declaration of an exception variable
        catch (OperatedClientConnection operatedclientconnection)
        {
            throw new HttpHostConnectException(httphost, operatedclientconnection);
        }
        prepareSocket(((Socket) (obj)), httpcontext, httpparams);
        operatedclientconnection.update(((Socket) (obj)), httphost, schemelayeredsocketfactory.isSecure(((Socket) (obj))), httpparams);
    }
}
