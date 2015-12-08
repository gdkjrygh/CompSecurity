// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.conn.ssl;

import ch.boye.httpclientandroidlib.HttpHost;
import ch.boye.httpclientandroidlib.conn.ConnectTimeoutException;
import ch.boye.httpclientandroidlib.conn.HttpInetSocketAddress;
import ch.boye.httpclientandroidlib.conn.scheme.HostNameResolver;
import ch.boye.httpclientandroidlib.conn.scheme.LayeredSchemeSocketFactory;
import ch.boye.httpclientandroidlib.conn.scheme.LayeredSocketFactory;
import ch.boye.httpclientandroidlib.conn.scheme.SchemeLayeredSocketFactory;
import ch.boye.httpclientandroidlib.params.HttpConnectionParams;
import ch.boye.httpclientandroidlib.params.HttpParams;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SecureRandom;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

// Referenced classes of package ch.boye.httpclientandroidlib.conn.ssl:
//            AllowAllHostnameVerifier, BrowserCompatHostnameVerifier, StrictHostnameVerifier, SSLInitializationException, 
//            TrustManagerDecorator, X509HostnameVerifier, TrustStrategy

public class SSLSocketFactory
    implements LayeredSchemeSocketFactory, LayeredSocketFactory, SchemeLayeredSocketFactory
{

    public static final X509HostnameVerifier ALLOW_ALL_HOSTNAME_VERIFIER = new AllowAllHostnameVerifier();
    public static final X509HostnameVerifier BROWSER_COMPATIBLE_HOSTNAME_VERIFIER = new BrowserCompatHostnameVerifier();
    private static final char EMPTY_PASSWORD[] = "".toCharArray();
    public static final String SSL = "SSL";
    public static final String SSLV2 = "SSLv2";
    public static final X509HostnameVerifier STRICT_HOSTNAME_VERIFIER = new StrictHostnameVerifier();
    public static final String TLS = "TLS";
    private volatile X509HostnameVerifier hostnameVerifier;
    private final HostNameResolver nameResolver;
    private final javax.net.ssl.SSLSocketFactory socketfactory;

    public SSLSocketFactory(TrustStrategy truststrategy)
        throws NoSuchAlgorithmException, KeyManagementException, KeyStoreException, UnrecoverableKeyException
    {
        this("TLS", null, null, null, null, truststrategy, BROWSER_COMPATIBLE_HOSTNAME_VERIFIER);
    }

    public SSLSocketFactory(TrustStrategy truststrategy, X509HostnameVerifier x509hostnameverifier)
        throws NoSuchAlgorithmException, KeyManagementException, KeyStoreException, UnrecoverableKeyException
    {
        this("TLS", null, null, null, null, truststrategy, x509hostnameverifier);
    }

    public SSLSocketFactory(String s, KeyStore keystore, String s1, KeyStore keystore1, SecureRandom securerandom, HostNameResolver hostnameresolver)
        throws NoSuchAlgorithmException, KeyManagementException, KeyStoreException, UnrecoverableKeyException
    {
        this(createSSLContext(s, keystore, s1, keystore1, securerandom, null), hostnameresolver);
    }

    public SSLSocketFactory(String s, KeyStore keystore, String s1, KeyStore keystore1, SecureRandom securerandom, TrustStrategy truststrategy, X509HostnameVerifier x509hostnameverifier)
        throws NoSuchAlgorithmException, KeyManagementException, KeyStoreException, UnrecoverableKeyException
    {
        this(createSSLContext(s, keystore, s1, keystore1, securerandom, truststrategy), x509hostnameverifier);
    }

    public SSLSocketFactory(String s, KeyStore keystore, String s1, KeyStore keystore1, SecureRandom securerandom, X509HostnameVerifier x509hostnameverifier)
        throws NoSuchAlgorithmException, KeyManagementException, KeyStoreException, UnrecoverableKeyException
    {
        this(createSSLContext(s, keystore, s1, keystore1, securerandom, null), x509hostnameverifier);
    }

    public SSLSocketFactory(KeyStore keystore)
        throws NoSuchAlgorithmException, KeyManagementException, KeyStoreException, UnrecoverableKeyException
    {
        this("TLS", null, null, keystore, null, null, BROWSER_COMPATIBLE_HOSTNAME_VERIFIER);
    }

    public SSLSocketFactory(KeyStore keystore, String s)
        throws NoSuchAlgorithmException, KeyManagementException, KeyStoreException, UnrecoverableKeyException
    {
        this("TLS", keystore, s, null, null, null, BROWSER_COMPATIBLE_HOSTNAME_VERIFIER);
    }

    public SSLSocketFactory(KeyStore keystore, String s, KeyStore keystore1)
        throws NoSuchAlgorithmException, KeyManagementException, KeyStoreException, UnrecoverableKeyException
    {
        this("TLS", keystore, s, keystore1, null, null, BROWSER_COMPATIBLE_HOSTNAME_VERIFIER);
    }

    public SSLSocketFactory(SSLContext sslcontext)
    {
        this(sslcontext, BROWSER_COMPATIBLE_HOSTNAME_VERIFIER);
    }

    public SSLSocketFactory(SSLContext sslcontext, HostNameResolver hostnameresolver)
    {
        socketfactory = sslcontext.getSocketFactory();
        hostnameVerifier = BROWSER_COMPATIBLE_HOSTNAME_VERIFIER;
        nameResolver = hostnameresolver;
    }

    public SSLSocketFactory(SSLContext sslcontext, X509HostnameVerifier x509hostnameverifier)
    {
        if (sslcontext == null)
        {
            throw new IllegalArgumentException("SSL context may not be null");
        } else
        {
            socketfactory = sslcontext.getSocketFactory();
            hostnameVerifier = x509hostnameverifier;
            nameResolver = null;
            return;
        }
    }

    public SSLSocketFactory(javax.net.ssl.SSLSocketFactory sslsocketfactory, X509HostnameVerifier x509hostnameverifier)
    {
        if (sslsocketfactory == null)
        {
            throw new IllegalArgumentException("SSL socket factory may not be null");
        } else
        {
            socketfactory = sslsocketfactory;
            hostnameVerifier = x509hostnameverifier;
            nameResolver = null;
            return;
        }
    }

    private static SSLContext createDefaultSSLContext()
        throws SSLInitializationException
    {
        SSLContext sslcontext;
        try
        {
            sslcontext = createSSLContext("TLS", null, null, null, null, null);
        }
        catch (Exception exception)
        {
            throw new SSLInitializationException("Failure initializing default SSL context", exception);
        }
        return sslcontext;
    }

    private static SSLContext createSSLContext(String s, KeyStore keystore, String s1, KeyStore keystore1, SecureRandom securerandom, TrustStrategy truststrategy)
        throws NoSuchAlgorithmException, KeyStoreException, UnrecoverableKeyException, KeyManagementException
    {
        String s2 = s;
        if (s == null)
        {
            s2 = "TLS";
        }
        KeyManagerFactory keymanagerfactory = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
        if (s1 != null)
        {
            s = s1.toCharArray();
        } else
        {
            s = null;
        }
        keymanagerfactory.init(keystore, s);
        s = keymanagerfactory.getKeyManagers();
        keystore = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        keystore.init(keystore1);
        keystore = keystore.getTrustManagers();
        if (keystore != null && truststrategy != null)
        {
            for (int i = 0; i < keystore.length; i++)
            {
                s1 = keystore[i];
                if (s1 instanceof X509TrustManager)
                {
                    keystore[i] = new TrustManagerDecorator((X509TrustManager)s1, truststrategy);
                }
            }

        }
        s1 = SSLContext.getInstance(s2);
        s1.init(s, keystore, securerandom);
        return s1;
    }

    private static SSLContext createSystemSSLContext()
        throws SSLInitializationException
    {
        SSLContext sslcontext;
        try
        {
            sslcontext = createSystemSSLContext("TLS", null);
        }
        catch (Exception exception)
        {
            throw new SSLInitializationException("Failure initializing default system SSL context", exception);
        }
        return sslcontext;
    }

    private static SSLContext createSystemSSLContext(String s, SecureRandom securerandom)
        throws IOException, NoSuchAlgorithmException, NoSuchProviderException, KeyStoreException, CertificateException, UnrecoverableKeyException, KeyManagementException
    {
        Object obj;
        Object obj1;
        obj1 = s;
        if (s == null)
        {
            obj1 = "TLS";
        }
        obj = System.getProperty("ssl.TrustManagerFactory.algorithm");
        s = ((String) (obj));
        if (obj == null)
        {
            s = TrustManagerFactory.getDefaultAlgorithm();
        }
        String s1 = System.getProperty("javax.net.ssl.trustStoreType");
        obj = s1;
        if (s1 == null)
        {
            obj = KeyStore.getDefaultType();
        }
        if (!"none".equalsIgnoreCase(((String) (obj)))) goto _L2; else goto _L1
_L1:
        s = TrustManagerFactory.getInstance(s);
_L11:
        Object obj3;
        String s3;
        obj = null;
        String s2 = System.getProperty("ssl.KeyManagerFactory.algorithm");
        obj3 = s2;
        if (s2 == null)
        {
            obj3 = KeyManagerFactory.getDefaultAlgorithm();
        }
        s2 = System.getProperty("javax.net.ssl.keyStoreType");
        s3 = s2;
        if (s2 == null)
        {
            s3 = KeyStore.getDefaultType();
        }
        if (!"none".equalsIgnoreCase(s3)) goto _L4; else goto _L3
_L3:
        obj = KeyManagerFactory.getInstance(((String) (obj3)));
_L8:
        obj1 = SSLContext.getInstance(((String) (obj1)));
        Object obj2;
        char ac[];
        Object obj4;
        if (obj != null)
        {
            obj = ((KeyManagerFactory) (obj)).getKeyManagers();
        } else
        {
            obj = null;
        }
        if (s != null)
        {
            s = s.getTrustManagers();
        } else
        {
            s = null;
        }
        ((SSLContext) (obj1)).init(((javax.net.ssl.KeyManager []) (obj)), s, securerandom);
        return ((SSLContext) (obj1));
_L2:
        obj2 = System.getProperty("javax.net.ssl.trustStore");
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_268;
        }
        obj3 = new File(((String) (obj2)));
        obj2 = TrustManagerFactory.getInstance(s);
        s = System.getProperty("javax.net.ssl.trustStoreProvider");
        if (s != null)
        {
            s = KeyStore.getInstance(((String) (obj)), s);
        } else
        {
            s = KeyStore.getInstance(((String) (obj)));
        }
        obj = System.getProperty("javax.net.ssl.trustStorePassword");
        obj3 = new FileInputStream(((File) (obj3)));
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_253;
        }
        obj = ((String) (obj)).toCharArray();
_L5:
        s.load(((java.io.InputStream) (obj3)), ((char []) (obj)));
        ((FileInputStream) (obj3)).close();
        ((TrustManagerFactory) (obj2)).init(s);
        s = ((String) (obj2));
        continue; /* Loop/switch isn't completed */
        obj = EMPTY_PASSWORD;
          goto _L5
        s;
        ((FileInputStream) (obj3)).close();
        throw s;
        obj = new File(System.getProperty("java.home"));
        s = new File(((File) (obj)), "lib/security/jssecacerts");
        if (!s.exists())
        {
            s = new File(((File) (obj)), "lib/security/cacerts");
        }
        obj = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        obj2 = KeyStore.getInstance(KeyStore.getDefaultType());
        s3 = System.getProperty("javax.net.ssl.trustStorePassword");
        obj3 = new FileInputStream(s);
        if (s3 == null)
        {
            break MISSING_BLOCK_LABEL_380;
        }
        s = s3.toCharArray();
_L6:
        ((KeyStore) (obj2)).load(((java.io.InputStream) (obj3)), s);
        ((FileInputStream) (obj3)).close();
        ((TrustManagerFactory) (obj)).init(((KeyStore) (obj2)));
        s = ((String) (obj));
        continue; /* Loop/switch isn't completed */
        s = null;
          goto _L6
        s;
        ((FileInputStream) (obj3)).close();
        throw s;
_L4:
        obj2 = null;
        obj4 = System.getProperty("javax.net.ssl.keyStore");
        if (obj4 != null)
        {
            obj2 = new File(((String) (obj4)));
        }
        if (obj2 == null) goto _L8; else goto _L7
_L7:
        obj3 = KeyManagerFactory.getInstance(((String) (obj3)));
        obj = System.getProperty("javax.net.ssl.keyStoreProvider");
        if (obj != null)
        {
            obj = KeyStore.getInstance(s3, ((String) (obj)));
        } else
        {
            obj = KeyStore.getInstance(s3);
        }
        s3 = System.getProperty("javax.net.ssl.keyStorePassword");
        obj4 = new FileInputStream(((File) (obj2)));
        if (s3 == null)
        {
            break MISSING_BLOCK_LABEL_526;
        }
        ac = s3.toCharArray();
_L9:
        ((KeyStore) (obj)).load(((java.io.InputStream) (obj4)), ac);
        ((FileInputStream) (obj4)).close();
        if (s3 != null)
        {
            ac = s3.toCharArray();
        } else
        {
            ac = EMPTY_PASSWORD;
        }
        ((KeyManagerFactory) (obj3)).init(((KeyStore) (obj)), ac);
        obj = obj3;
          goto _L8
        ac = EMPTY_PASSWORD;
          goto _L9
        s;
        ((FileInputStream) (obj4)).close();
        throw s;
        if (true) goto _L11; else goto _L10
_L10:
    }

    public static SSLSocketFactory getSocketFactory()
        throws SSLInitializationException
    {
        return new SSLSocketFactory(createDefaultSSLContext());
    }

    public static SSLSocketFactory getSystemSocketFactory()
        throws SSLInitializationException
    {
        return new SSLSocketFactory(createSystemSSLContext());
    }

    public Socket connectSocket(Socket socket, String s, int i, InetAddress inetaddress, int j, HttpParams httpparams)
        throws IOException, UnknownHostException, ConnectTimeoutException
    {
        InetSocketAddress inetsocketaddress = null;
        if (inetaddress != null || j > 0)
        {
            int k = j;
            if (j < 0)
            {
                k = 0;
            }
            inetsocketaddress = new InetSocketAddress(inetaddress, k);
        }
        if (nameResolver != null)
        {
            inetaddress = nameResolver.resolve(s);
        } else
        {
            inetaddress = InetAddress.getByName(s);
        }
        return connectSocket(socket, ((InetSocketAddress) (new HttpInetSocketAddress(new HttpHost(s, i), inetaddress, i))), inetsocketaddress, httpparams);
    }

    public Socket connectSocket(Socket socket, InetSocketAddress inetsocketaddress, InetSocketAddress inetsocketaddress1, HttpParams httpparams)
        throws IOException, UnknownHostException, ConnectTimeoutException
    {
        if (inetsocketaddress == null)
        {
            throw new IllegalArgumentException("Remote address may not be null");
        }
        if (httpparams == null)
        {
            throw new IllegalArgumentException("HTTP parameters may not be null");
        }
        int i;
        int k;
        if (socket == null)
        {
            socket = socketfactory.createSocket();
        }
        if (inetsocketaddress1 != null)
        {
            socket.setReuseAddress(HttpConnectionParams.getSoReuseaddr(httpparams));
            socket.bind(inetsocketaddress1);
        }
        i = HttpConnectionParams.getConnectionTimeout(httpparams);
        k = HttpConnectionParams.getSoTimeout(httpparams);
        try
        {
            socket.setSoTimeout(k);
            socket.connect(inetsocketaddress, i);
        }
        // Misplaced declaration of an exception variable
        catch (Socket socket)
        {
            throw new ConnectTimeoutException((new StringBuilder()).append("Connect to ").append(inetsocketaddress).append(" timed out").toString());
        }
        if (inetsocketaddress instanceof HttpInetSocketAddress)
        {
            inetsocketaddress1 = ((HttpInetSocketAddress)inetsocketaddress).getHttpHost().getHostName();
        } else
        {
            inetsocketaddress1 = inetsocketaddress.getHostName();
        }
        if (socket instanceof SSLSocket)
        {
            socket = (SSLSocket)socket;
        } else
        {
            int j = inetsocketaddress.getPort();
            socket = (SSLSocket)socketfactory.createSocket(socket, inetsocketaddress1, j, true);
            prepareSocket(socket);
        }
        if (hostnameVerifier != null)
        {
            try
            {
                hostnameVerifier.verify(inetsocketaddress1, socket);
            }
            // Misplaced declaration of an exception variable
            catch (InetSocketAddress inetsocketaddress)
            {
                try
                {
                    socket.close();
                }
                // Misplaced declaration of an exception variable
                catch (Socket socket) { }
                throw inetsocketaddress;
            }
        }
        return socket;
    }

    public Socket createLayeredSocket(Socket socket, String s, int i, HttpParams httpparams)
        throws IOException, UnknownHostException
    {
        socket = (SSLSocket)socketfactory.createSocket(socket, s, i, true);
        prepareSocket(socket);
        if (hostnameVerifier != null)
        {
            hostnameVerifier.verify(s, socket);
        }
        return socket;
    }

    public Socket createLayeredSocket(Socket socket, String s, int i, boolean flag)
        throws IOException, UnknownHostException
    {
        socket = (SSLSocket)socketfactory.createSocket(socket, s, i, flag);
        prepareSocket(socket);
        if (hostnameVerifier != null)
        {
            hostnameVerifier.verify(s, socket);
        }
        return socket;
    }

    public Socket createSocket()
        throws IOException
    {
        SSLSocket sslsocket = (SSLSocket)socketfactory.createSocket();
        prepareSocket(sslsocket);
        return sslsocket;
    }

    public Socket createSocket(HttpParams httpparams)
        throws IOException
    {
        httpparams = (SSLSocket)socketfactory.createSocket();
        prepareSocket(httpparams);
        return httpparams;
    }

    public Socket createSocket(Socket socket, String s, int i, boolean flag)
        throws IOException, UnknownHostException
    {
        return createLayeredSocket(socket, s, i, flag);
    }

    public X509HostnameVerifier getHostnameVerifier()
    {
        return hostnameVerifier;
    }

    public boolean isSecure(Socket socket)
        throws IllegalArgumentException
    {
        if (socket == null)
        {
            throw new IllegalArgumentException("Socket may not be null");
        }
        if (!(socket instanceof SSLSocket))
        {
            throw new IllegalArgumentException("Socket not created by this factory");
        }
        if (socket.isClosed())
        {
            throw new IllegalArgumentException("Socket is closed");
        } else
        {
            return true;
        }
    }

    protected void prepareSocket(SSLSocket sslsocket)
        throws IOException
    {
    }

    public void setHostnameVerifier(X509HostnameVerifier x509hostnameverifier)
    {
        if (x509hostnameverifier == null)
        {
            throw new IllegalArgumentException("Hostname verifier may not be null");
        } else
        {
            hostnameVerifier = x509hostnameverifier;
            return;
        }
    }

}
