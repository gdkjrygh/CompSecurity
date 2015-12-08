// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp;

import com.squareup.okhttp.internal.Platform;
import com.squareup.okhttp.internal.RouteDatabase;
import com.squareup.okhttp.internal.Util;
import com.squareup.okhttp.internal.http.HttpConnection;
import com.squareup.okhttp.internal.http.HttpEngine;
import com.squareup.okhttp.internal.http.HttpTransport;
import com.squareup.okhttp.internal.http.OkHeaders;
import com.squareup.okhttp.internal.http.SpdyTransport;
import com.squareup.okhttp.internal.http.Transport;
import com.squareup.okhttp.internal.spdy.SpdyConnection;
import com.squareup.okhttp.internal.tls.OkHostnameVerifier;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.URL;
import java.security.Principal;
import java.security.cert.X509Certificate;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import okio.Source;

// Referenced classes of package com.squareup.okhttp:
//            Protocol, Request, Response, Route, 
//            Address, ConnectionSpec, Handshake, CertificatePinner, 
//            OkHttpClient, ConnectionPool

public final class Connection
{

    private boolean connected;
    private Handshake handshake;
    private HttpConnection httpConnection;
    private long idleStartTimeNs;
    private Object owner;
    private final ConnectionPool pool;
    private Protocol protocol;
    private int recycleCount;
    private final Route route;
    private Socket socket;
    private SpdyConnection spdyConnection;

    public Connection(ConnectionPool connectionpool, Route route1)
    {
        connected = false;
        protocol = Protocol.HTTP_1_1;
        pool = connectionpool;
        route = route1;
    }

    private void makeTunnel(Request request, int i, int j)
        throws IOException
    {
        HttpConnection httpconnection = new HttpConnection(pool, this, socket);
        httpconnection.setTimeouts(i, j);
        URL url = request.url();
        String s = (new StringBuilder()).append("CONNECT ").append(url.getHost()).append(":").append(url.getPort()).append(" HTTP/1.1").toString();
        do
        {
            httpconnection.writeRequest(request.headers(), s);
            httpconnection.flush();
            request = httpconnection.readResponse().request(request).build();
            long l1 = OkHeaders.contentLength(request);
            long l = l1;
            if (l1 == -1L)
            {
                l = 0L;
            }
            Object obj = httpconnection.newFixedLengthSource(l);
            Util.skipAll(((Source) (obj)), 0x7fffffff, TimeUnit.MILLISECONDS);
            ((Source) (obj)).close();
            switch (request.code())
            {
            default:
                throw new IOException((new StringBuilder()).append("Unexpected response code for CONNECT: ").append(request.code()).toString());

            case 200: 
                if (httpconnection.bufferSize() > 0L)
                {
                    throw new IOException("TLS tunnel buffered too many bytes!");
                } else
                {
                    return;
                }

            case 407: 
                obj = OkHeaders.processAuthHeader(route.address.authenticator, request, route.proxy);
                request = ((Request) (obj));
                break;
            }
        } while (obj != null);
        throw new IOException("Failed to authenticate with proxy");
    }

    private Request tunnelRequest(Request request)
        throws IOException
    {
        if (!route.requiresTunnel())
        {
            return null;
        }
        String s = request.url().getHost();
        int i = Util.getEffectivePort(request.url());
        Object obj;
        if (i == Util.getDefaultPort("https"))
        {
            obj = s;
        } else
        {
            obj = (new StringBuilder()).append(s).append(":").append(i).toString();
        }
        obj = (new Request.Builder()).url(new URL("https", s, i, "/")).header("Host", ((String) (obj))).header("Proxy-Connection", "Keep-Alive");
        s = request.header("User-Agent");
        if (s != null)
        {
            ((Request.Builder) (obj)).header("User-Agent", s);
        }
        request = request.header("Proxy-Authorization");
        if (request != null)
        {
            ((Request.Builder) (obj)).header("Proxy-Authorization", request);
        }
        return ((Request.Builder) (obj)).build();
    }

    private void upgradeToTls(Request request, int i, int j)
        throws IOException
    {
        Platform platform;
        platform = Platform.get();
        if (request != null)
        {
            makeTunnel(request, i, j);
        }
        socket = route.address.sslSocketFactory.createSocket(socket, route.address.uriHost, route.address.uriPort, true);
        request = (SSLSocket)socket;
        route.connectionSpec.apply(request, route);
        String s;
        request.startHandshake();
        if (!route.connectionSpec.supportsTlsExtensions())
        {
            break MISSING_BLOCK_LABEL_120;
        }
        s = platform.getSelectedProtocol(request);
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_120;
        }
        protocol = Protocol.get(s);
        platform.afterHandshake(request);
        handshake = Handshake.get(request.getSession());
        if (!route.address.hostnameVerifier.verify(route.address.uriHost, request.getSession()))
        {
            request = (X509Certificate)request.getSession().getPeerCertificates()[0];
            throw new SSLPeerUnverifiedException((new StringBuilder()).append("Hostname ").append(route.address.uriHost).append(" not verified:").append("\n    certificate: ").append(CertificatePinner.pin(request)).append("\n    DN: ").append(request.getSubjectDN().getName()).append("\n    subjectAltNames: ").append(OkHostnameVerifier.allSubjectAltNames(request)).toString());
        }
        break MISSING_BLOCK_LABEL_282;
        Exception exception;
        exception;
        platform.afterHandshake(request);
        throw exception;
        route.address.certificatePinner.check(route.address.uriHost, handshake.peerCertificates());
        if (protocol == Protocol.SPDY_3 || protocol == Protocol.HTTP_2)
        {
            request.setSoTimeout(0);
            spdyConnection = (new com.squareup.okhttp.internal.spdy.SpdyConnection.Builder(route.address.getUriHost(), true, socket)).protocol(protocol).build();
            spdyConnection.sendConnectionPreface();
            return;
        } else
        {
            httpConnection = new HttpConnection(pool, this, socket);
            return;
        }
    }

    boolean clearOwner()
    {
label0:
        {
            synchronized (pool)
            {
                if (owner != null)
                {
                    break label0;
                }
            }
            return false;
        }
        owner = null;
        connectionpool;
        JVM INSTR monitorexit ;
        return true;
        exception;
        connectionpool;
        JVM INSTR monitorexit ;
        throw exception;
    }

    void closeIfOwnedBy(Object obj)
        throws IOException
    {
label0:
        {
            if (isSpdy())
            {
                throw new IllegalStateException();
            }
            synchronized (pool)
            {
                if (owner == obj)
                {
                    break label0;
                }
            }
            return;
        }
        owner = null;
        connectionpool;
        JVM INSTR monitorexit ;
        socket.close();
        return;
        obj;
        connectionpool;
        JVM INSTR monitorexit ;
        throw obj;
    }

    void connect(int i, int j, int k, Request request)
        throws IOException
    {
        if (connected)
        {
            throw new IllegalStateException("already connected");
        }
        if (route.proxy.type() == java.net.Proxy.Type.DIRECT || route.proxy.type() == java.net.Proxy.Type.HTTP)
        {
            socket = route.address.socketFactory.createSocket();
        } else
        {
            socket = new Socket(route.proxy);
        }
        socket.setSoTimeout(j);
        Platform.get().connectSocket(socket, route.inetSocketAddress, i);
        if (route.address.sslSocketFactory != null)
        {
            upgradeToTls(request, j, k);
        } else
        {
            httpConnection = new HttpConnection(pool, this, socket);
        }
        connected = true;
    }

    void connectAndSetOwner(OkHttpClient okhttpclient, Object obj, Request request)
        throws IOException
    {
        setOwner(obj);
        if (!isConnected())
        {
            obj = tunnelRequest(request);
            connect(okhttpclient.getConnectTimeout(), okhttpclient.getReadTimeout(), okhttpclient.getWriteTimeout(), ((Request) (obj)));
            if (isSpdy())
            {
                okhttpclient.getConnectionPool().share(this);
            }
            okhttpclient.routeDatabase().connected(getRoute());
        }
        setTimeouts(okhttpclient.getReadTimeout(), okhttpclient.getWriteTimeout());
    }

    public Handshake getHandshake()
    {
        return handshake;
    }

    long getIdleStartTimeNs()
    {
        if (spdyConnection == null)
        {
            return idleStartTimeNs;
        } else
        {
            return spdyConnection.getIdleStartTimeNs();
        }
    }

    Object getOwner()
    {
        Object obj;
        synchronized (pool)
        {
            obj = owner;
        }
        return obj;
        exception;
        connectionpool;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public Protocol getProtocol()
    {
        return protocol;
    }

    public Route getRoute()
    {
        return route;
    }

    public Socket getSocket()
    {
        return socket;
    }

    void incrementRecycleCount()
    {
        recycleCount = recycleCount + 1;
    }

    boolean isAlive()
    {
        return !socket.isClosed() && !socket.isInputShutdown() && !socket.isOutputShutdown();
    }

    boolean isConnected()
    {
        return connected;
    }

    boolean isIdle()
    {
        return spdyConnection == null || spdyConnection.isIdle();
    }

    boolean isReadable()
    {
        if (httpConnection != null)
        {
            return httpConnection.isReadable();
        } else
        {
            return true;
        }
    }

    boolean isSpdy()
    {
        return spdyConnection != null;
    }

    Transport newTransport(HttpEngine httpengine)
        throws IOException
    {
        if (spdyConnection != null)
        {
            return new SpdyTransport(httpengine, spdyConnection);
        } else
        {
            return new HttpTransport(httpengine, httpConnection);
        }
    }

    int recycleCount()
    {
        return recycleCount;
    }

    void resetIdleStartTime()
    {
        if (spdyConnection != null)
        {
            throw new IllegalStateException("spdyConnection != null");
        } else
        {
            idleStartTimeNs = System.nanoTime();
            return;
        }
    }

    void setOwner(Object obj)
    {
        if (isSpdy())
        {
            return;
        }
        ConnectionPool connectionpool = pool;
        connectionpool;
        JVM INSTR monitorenter ;
        if (owner != null)
        {
            throw new IllegalStateException("Connection already has an owner!");
        }
        break MISSING_BLOCK_LABEL_38;
        obj;
        connectionpool;
        JVM INSTR monitorexit ;
        throw obj;
        owner = obj;
        connectionpool;
        JVM INSTR monitorexit ;
    }

    void setProtocol(Protocol protocol1)
    {
        if (protocol1 == null)
        {
            throw new IllegalArgumentException("protocol == null");
        } else
        {
            protocol = protocol1;
            return;
        }
    }

    void setTimeouts(int i, int j)
        throws IOException
    {
        if (!connected)
        {
            throw new IllegalStateException("setTimeouts - not connected");
        }
        if (httpConnection != null)
        {
            socket.setSoTimeout(i);
            httpConnection.setTimeouts(i, j);
        }
    }

    public String toString()
    {
        StringBuilder stringbuilder = (new StringBuilder()).append("Connection{").append(route.address.uriHost).append(":").append(route.address.uriPort).append(", proxy=").append(route.proxy).append(" hostAddress=").append(route.inetSocketAddress.getAddress().getHostAddress()).append(" cipherSuite=");
        String s;
        if (handshake != null)
        {
            s = handshake.cipherSuite();
        } else
        {
            s = "none";
        }
        return stringbuilder.append(s).append(" protocol=").append(protocol).append('}').toString();
    }
}
