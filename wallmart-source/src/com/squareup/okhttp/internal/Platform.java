// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal;

import com.squareup.okhttp.Protocol;
import java.io.IOException;
import java.io.PrintStream;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLSocket;
import okio.Buffer;

// Referenced classes of package com.squareup.okhttp.internal:
//            OptionalMethod, Util, Internal

public class Platform
{
    private static class Android extends Platform
    {

        private final OptionalMethod getAlpnSelectedProtocol;
        private final OptionalMethod setAlpnProtocols;
        private final OptionalMethod setHostname;
        private final OptionalMethod setUseSessionTickets;
        private final Method trafficStatsTagSocket;
        private final Method trafficStatsUntagSocket;

        public void configureTlsExtensions(SSLSocket sslsocket, String s, List list)
        {
            if (s != null)
            {
                setUseSessionTickets.invokeOptionalWithoutCheckedException(sslsocket, new Object[] {
                    Boolean.valueOf(true)
                });
                setHostname.invokeOptionalWithoutCheckedException(sslsocket, new Object[] {
                    s
                });
            }
            if (setAlpnProtocols != null && setAlpnProtocols.isSupported(sslsocket))
            {
                s = concatLengthPrefixed(list);
                setAlpnProtocols.invokeWithoutCheckedException(sslsocket, new Object[] {
                    s
                });
            }
        }

        public void connectSocket(Socket socket, InetSocketAddress inetsocketaddress, int i)
            throws IOException
        {
            try
            {
                socket.connect(inetsocketaddress, i);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Socket socket)
            {
                inetsocketaddress = new IOException("Exception in connect");
            }
            inetsocketaddress.initCause(socket);
            throw inetsocketaddress;
        }

        public String getSelectedProtocol(SSLSocket sslsocket)
        {
            while (getAlpnSelectedProtocol == null || !getAlpnSelectedProtocol.isSupported(sslsocket)) 
            {
                return null;
            }
            sslsocket = (byte[])(byte[])getAlpnSelectedProtocol.invokeWithoutCheckedException(sslsocket, new Object[0]);
            if (sslsocket != null)
            {
                sslsocket = new String(sslsocket, Util.UTF_8);
            } else
            {
                sslsocket = null;
            }
            return sslsocket;
        }

        public void tagSocket(Socket socket)
            throws SocketException
        {
            if (trafficStatsTagSocket == null)
            {
                return;
            }
            try
            {
                trafficStatsTagSocket.invoke(null, new Object[] {
                    socket
                });
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Socket socket)
            {
                throw new RuntimeException(socket);
            }
            // Misplaced declaration of an exception variable
            catch (Socket socket)
            {
                throw new RuntimeException(socket.getCause());
            }
        }

        public void untagSocket(Socket socket)
            throws SocketException
        {
            if (trafficStatsUntagSocket == null)
            {
                return;
            }
            try
            {
                trafficStatsUntagSocket.invoke(null, new Object[] {
                    socket
                });
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Socket socket)
            {
                throw new RuntimeException(socket);
            }
            // Misplaced declaration of an exception variable
            catch (Socket socket)
            {
                throw new RuntimeException(socket.getCause());
            }
        }

        public Android(OptionalMethod optionalmethod, OptionalMethod optionalmethod1, Method method, Method method1, OptionalMethod optionalmethod2, OptionalMethod optionalmethod3)
        {
            setUseSessionTickets = optionalmethod;
            setHostname = optionalmethod1;
            trafficStatsTagSocket = method;
            trafficStatsUntagSocket = method1;
            getAlpnSelectedProtocol = optionalmethod2;
            setAlpnProtocols = optionalmethod3;
        }
    }

    private static class JdkWithJettyBootPlatform extends Platform
    {

        private final Class clientProviderClass;
        private final Method getMethod;
        private final Method putMethod;
        private final Method removeMethod;
        private final Class serverProviderClass;

        public void afterHandshake(SSLSocket sslsocket)
        {
            try
            {
                removeMethod.invoke(null, new Object[] {
                    sslsocket
                });
                return;
            }
            // Misplaced declaration of an exception variable
            catch (SSLSocket sslsocket) { }
            // Misplaced declaration of an exception variable
            catch (SSLSocket sslsocket) { }
            throw new AssertionError();
        }

        public void configureTlsExtensions(SSLSocket sslsocket, String s, List list)
        {
            s = new ArrayList(list.size());
            int i = 0;
            int j = list.size();
            while (i < j) 
            {
                Protocol protocol = (Protocol)list.get(i);
                if (protocol != Protocol.HTTP_1_0)
                {
                    s.add(protocol.toString());
                }
                i++;
            }
            try
            {
                list = com/squareup/okhttp/internal/Platform.getClassLoader();
                Class class1 = clientProviderClass;
                Class class2 = serverProviderClass;
                s = new JettyNegoProvider(s);
                s = ((String) (Proxy.newProxyInstance(list, new Class[] {
                    class1, class2
                }, s)));
                putMethod.invoke(null, new Object[] {
                    sslsocket, s
                });
                return;
            }
            // Misplaced declaration of an exception variable
            catch (SSLSocket sslsocket) { }
            // Misplaced declaration of an exception variable
            catch (SSLSocket sslsocket) { }
            throw new AssertionError(sslsocket);
        }

        public String getSelectedProtocol(SSLSocket sslsocket)
        {
            sslsocket = (JettyNegoProvider)Proxy.getInvocationHandler(getMethod.invoke(null, new Object[] {
                sslsocket
            }));
            if (((JettyNegoProvider) (sslsocket)).unsupported || ((JettyNegoProvider) (sslsocket)).selected != null)
            {
                break MISSING_BLOCK_LABEL_50;
            }
            Internal.logger.log(Level.INFO, "ALPN callback dropped: SPDY and HTTP/2 are disabled. Is alpn-boot on the boot class path?");
            return null;
            if (((JettyNegoProvider) (sslsocket)).unsupported)
            {
                break MISSING_BLOCK_LABEL_77;
            }
            sslsocket = ((JettyNegoProvider) (sslsocket)).selected;
            return sslsocket;
            sslsocket;
_L2:
            throw new AssertionError();
            sslsocket;
            if (true) goto _L2; else goto _L1
_L1:
            return null;
        }

        public JdkWithJettyBootPlatform(Method method, Method method1, Method method2, Class class1, Class class2)
        {
            putMethod = method;
            getMethod = method1;
            removeMethod = method2;
            clientProviderClass = class1;
            serverProviderClass = class2;
        }
    }

    private static class JettyNegoProvider
        implements InvocationHandler
    {

        private final List protocols;
        private String selected;
        private boolean unsupported;

        public Object invoke(Object obj, Method method, Object aobj[])
            throws Throwable
        {
            String s = method.getName();
            Class class1 = method.getReturnType();
            obj = ((Object) (aobj));
            if (aobj == null)
            {
                obj = Util.EMPTY_STRING_ARRAY;
            }
            if (s.equals("supports") && Boolean.TYPE == class1)
            {
                return Boolean.valueOf(true);
            }
            if (s.equals("unsupported") && Void.TYPE == class1)
            {
                unsupported = true;
                return null;
            }
            if (s.equals("protocols") && obj.length == 0)
            {
                return protocols;
            }
            if ((s.equals("selectProtocol") || s.equals("select")) && java/lang/String == class1 && obj.length == 1 && (obj[0] instanceof List))
            {
                obj = (List)obj[0];
                int i = 0;
                for (int j = ((List) (obj)).size(); i < j; i++)
                {
                    if (protocols.contains(((List) (obj)).get(i)))
                    {
                        obj = (String)((List) (obj)).get(i);
                        selected = ((String) (obj));
                        return obj;
                    }
                }

                obj = (String)protocols.get(0);
                selected = ((String) (obj));
                return obj;
            }
            if ((s.equals("protocolSelected") || s.equals("selected")) && obj.length == 1)
            {
                selected = (String)obj[0];
                return null;
            } else
            {
                return method.invoke(this, ((Object []) (obj)));
            }
        }



        public JettyNegoProvider(List list)
        {
            protocols = list;
        }
    }


    private static final Platform PLATFORM = findPlatform();

    public Platform()
    {
    }

    static byte[] concatLengthPrefixed(List list)
    {
        Buffer buffer = new Buffer();
        int i = 0;
        int j = list.size();
        while (i < j) 
        {
            Protocol protocol = (Protocol)list.get(i);
            if (protocol != Protocol.HTTP_1_0)
            {
                buffer.writeByte(protocol.toString().length());
                buffer.writeUtf8(protocol.toString());
            }
            i++;
        }
        return buffer.readByteArray();
    }

    private static Platform findPlatform()
    {
        Class.forName("com.android.org.conscrypt.OpenSSLSocketImpl");
_L1:
        OptionalMethod optionalmethod1;
        OptionalMethod optionalmethod2;
        optionalmethod1 = new OptionalMethod(null, "setUseSessionTickets", new Class[] {
            Boolean.TYPE
        });
        optionalmethod2 = new OptionalMethod(null, "setHostname", new Class[] {
            java/lang/String
        });
        Object obj;
        Object obj1;
        Object obj2;
        Object obj3;
        OptionalMethod optionalmethod;
        Object obj4;
        Object obj5;
        Method method;
        Object obj6;
        obj6 = null;
        obj1 = null;
        method = null;
        optionalmethod = null;
        obj5 = null;
        obj4 = null;
        obj2 = obj1;
        obj3 = obj6;
        obj = method;
        Class class1 = Class.forName("android.net.TrafficStats");
        obj2 = obj1;
        obj3 = obj6;
        obj = method;
        obj1 = class1.getMethod("tagSocket", new Class[] {
            java/net/Socket
        });
        obj2 = obj1;
        obj3 = obj1;
        obj = method;
        method = class1.getMethod("untagSocket", new Class[] {
            java/net/Socket
        });
        obj2 = method;
        obj3 = obj1;
        obj = obj2;
        Class.forName("android.net.Network");
        obj3 = obj1;
        obj = obj2;
        optionalmethod = new OptionalMethod([B, "getAlpnSelectedProtocol", new Class[0]);
        obj3 = new OptionalMethod(null, "setAlpnProtocols", new Class[] {
            [B
        });
        obj = optionalmethod;
_L4:
        try
        {
            return new Android(optionalmethod1, optionalmethod2, ((Method) (obj1)), ((Method) (obj2)), ((OptionalMethod) (obj)), ((OptionalMethod) (obj3)));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        break MISSING_BLOCK_LABEL_215;
        obj;
        Class.forName("org.apache.harmony.xnet.provider.jsse.OpenSSLSocketImpl");
          goto _L1
        obj = Class.forName("org.eclipse.jetty.alpn.ALPN");
        obj1 = Class.forName((new StringBuilder()).append("org.eclipse.jetty.alpn.ALPN").append("$Provider").toString());
        obj2 = Class.forName((new StringBuilder()).append("org.eclipse.jetty.alpn.ALPN").append("$ClientProvider").toString());
        obj3 = Class.forName((new StringBuilder()).append("org.eclipse.jetty.alpn.ALPN").append("$ServerProvider").toString());
        obj = new JdkWithJettyBootPlatform(((Class) (obj)).getMethod("put", new Class[] {
            javax/net/ssl/SSLSocket, obj1
        }), ((Class) (obj)).getMethod("get", new Class[] {
            javax/net/ssl/SSLSocket
        }), ((Class) (obj)).getMethod("remove", new Class[] {
            javax/net/ssl/SSLSocket
        }), ((Class) (obj2)), ((Class) (obj3)));
        return ((Platform) (obj));
        obj;
_L3:
        return new Platform();
        obj;
        if (true) goto _L3; else goto _L2
_L2:
        obj;
        obj1 = obj2;
        obj2 = optionalmethod;
        obj = obj5;
        obj3 = obj4;
          goto _L4
        NoSuchMethodException nosuchmethodexception;
        nosuchmethodexception;
        nosuchmethodexception = ((NoSuchMethodException) (obj3));
        obj2 = obj;
        obj = obj5;
        obj3 = obj4;
          goto _L4
        obj;
        obj = optionalmethod;
        obj3 = obj4;
          goto _L4
        ClassNotFoundException classnotfoundexception;
        classnotfoundexception;
        classnotfoundexception = obj5;
        obj3 = obj4;
          goto _L4
        classnotfoundexception;
        classnotfoundexception = optionalmethod;
        obj3 = obj4;
          goto _L4
    }

    public static Platform get()
    {
        return PLATFORM;
    }

    public void afterHandshake(SSLSocket sslsocket)
    {
    }

    public void configureTlsExtensions(SSLSocket sslsocket, String s, List list)
    {
    }

    public void connectSocket(Socket socket, InetSocketAddress inetsocketaddress, int i)
        throws IOException
    {
        socket.connect(inetsocketaddress, i);
    }

    public String getPrefix()
    {
        return "OkHttp";
    }

    public String getSelectedProtocol(SSLSocket sslsocket)
    {
        return null;
    }

    public void logW(String s)
    {
        System.out.println(s);
    }

    public void tagSocket(Socket socket)
        throws SocketException
    {
    }

    public URI toUriLenient(URL url)
        throws URISyntaxException
    {
        return url.toURI();
    }

    public void untagSocket(Socket socket)
        throws SocketException
    {
    }

}
