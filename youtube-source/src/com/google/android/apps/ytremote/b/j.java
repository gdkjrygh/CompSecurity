// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.ytremote.b;

import android.net.Uri;
import android.util.Log;
import com.google.android.apps.ytremote.logic.a;
import com.google.android.apps.ytremote.logic.b;
import com.google.android.apps.ytremote.logic.c;
import com.google.android.apps.ytremote.model.AppStatus;
import com.google.android.apps.ytremote.model.SsdpId;
import com.google.android.apps.ytremote.model.YouTubeDevice;
import com.google.android.apps.ytremote.model.g;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.conn.ConnectTimeoutException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

// Referenced classes of package com.google.android.apps.ytremote.b:
//            c, i, a, b, 
//            k, l, m, n, 
//            o

public class j
    implements b
{

    private static final List a;
    private static final String b;
    private static Pattern c;
    private final ScheduledExecutorService d = Executors.newScheduledThreadPool(3);
    private final com.google.android.apps.ytremote.b.a e = new i();
    private final a f = new com.google.android.apps.ytremote.b.c();
    private final InetAddress g = d();
    private final Set h = new HashSet();
    private final Map i = new ConcurrentHashMap();
    private final Set j = new HashSet();
    private final Map k = new HashMap();
    private final List l = new ArrayList();
    private boolean m;

    public j()
    {
    }

    private YouTubeDevice a(YouTubeDevice youtubedevice)
    {
        if (!youtubedevice.hasDialSupport()) goto _L2; else goto _L1
_L1:
        Object obj = f.a(youtubedevice.getAppUri());
        if (((AppStatus) (obj)).getStatus() != -2 && ((AppStatus) (obj)).getStatus() != -1) goto _L4; else goto _L3
_L3:
        Log.e(b, (new StringBuilder("Dropping TV: ")).append(youtubedevice.getDeviceName()).append(" status: ").append(((AppStatus) (obj)).getStatus()).toString());
_L6:
        return null;
_L4:
        return youtubedevice.withAppStatus(((AppStatus) (obj)));
_L2:
        obj = e.a(youtubedevice.getModelName());
        if (!((com.google.android.apps.ytremote.b.b) (obj)).b()) goto _L6; else goto _L5
_L5:
        youtubedevice = youtubedevice.withNewDeviceName(((com.google.android.apps.ytremote.b.b) (obj)).a());
        return youtubedevice;
        youtubedevice;
        Log.w(b, "Couldn't retrieve device information", youtubedevice);
        return null;
    }

    private static YouTubeDevice a(HttpResponse httpresponse)
    {
        String s;
        Header aheader[] = httpresponse.getHeaders("Application-URL");
        if (aheader.length != 1)
        {
            Log.w(b, "Expected one Application-URL header. Found 0 or more");
            return null;
        }
        s = aheader[0].getValue();
        Object obj;
        byte abyte0[];
        httpresponse = httpresponse.getEntity().getContent();
        obj = new ByteArrayOutputStream();
        abyte0 = new byte[512];
_L1:
        int i1 = httpresponse.read(abyte0);
label0:
        {
            if (i1 == -1)
            {
                break label0;
            }
            try
            {
                ((ByteArrayOutputStream) (obj)).write(abyte0, 0, i1);
            }
            // Misplaced declaration of an exception variable
            catch (HttpResponse httpresponse)
            {
                Log.w(b, "Error parsing device description response: ", httpresponse);
                return null;
            }
        }
          goto _L1
        httpresponse = ((ByteArrayOutputStream) (obj)).toByteArray();
        obj = DocumentBuilderFactory.newInstance();
        ((DocumentBuilderFactory) (obj)).setNamespaceAware(true);
        obj = ((DocumentBuilderFactory) (obj)).newDocumentBuilder().parse(new ByteArrayInputStream(httpresponse)).getDocumentElement().getElementsByTagName("device");
        httpresponse = new g();
        if (((NodeList) (obj)).getLength() != 0)
        {
            break MISSING_BLOCK_LABEL_170;
        }
        Log.w(b, "No devices found in device description XML.");
        return null;
        obj = (Element)((NodeList) (obj)).item(0);
        httpresponse.a(a(((Element) (obj)), "friendlyName", "urn:schemas-upnp-org:device-1-0"));
        httpresponse.a(new SsdpId(a(((Element) (obj)), "UDN", "urn:schemas-upnp-org:device-1-0")));
        httpresponse.b(a(((Element) (obj)), "manufacturer", "urn:schemas-upnp-org:device-1-0"));
        httpresponse.c(a(((Element) (obj)), "modelName", "urn:schemas-upnp-org:device-1-0"));
        if (s == null) goto _L3; else goto _L2
_L2:
        httpresponse.a(true);
        httpresponse.a(Uri.parse(s).buildUpon().appendPath("YouTube").build());
_L5:
        return httpresponse.a();
_L3:
        httpresponse.a(false);
        if (true) goto _L5; else goto _L4
_L4:
    }

    static String a()
    {
        return b;
    }

    private static String a(Element element, String s, String s1)
    {
        element = element.getChildNodes();
        for (int i1 = 0; i1 < element.getLength(); i1++)
        {
            Node node = element.item(i1);
            if ((node instanceof Element) && s.equals(node.getLocalName()) && s1.equals(node.getNamespaceURI()))
            {
                return node.getTextContent();
            }
        }

        return null;
    }

    static DatagramPacket a(String s)
    {
        return c(s);
    }

    private static InetAddress a(NetworkInterface networkinterface)
    {
        networkinterface = networkinterface.getInetAddresses();
        if (networkinterface == null)
        {
            return null;
        }
        while (networkinterface.hasMoreElements()) 
        {
            InetAddress inetaddress = (InetAddress)networkinterface.nextElement();
            if (inetaddress instanceof Inet4Address)
            {
                return inetaddress;
            }
        }
        return null;
    }

    static List a(j j1)
    {
        return j1.l;
    }

    static void a(j j1, String s)
    {
        Object obj = com.google.android.apps.ytremote.a.d.a.c();
        HttpGet httpget = new HttpGet(s);
        httpget.setHeader("Origin", "package:com.google.android.youtube");
        try
        {
            obj = a(((HttpClient) (obj)).execute(httpget));
        }
        // Misplaced declaration of an exception variable
        catch (j j1)
        {
            Log.e(b, String.format("Timed out reading device details at %s failed", new Object[] {
                s
            }));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (j j1)
        {
            Log.e(b, String.format("Reading device details at %s failed: %s", new Object[] {
                s, j1.getMessage()
            }));
            return;
        }
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_44;
        }
        j1.a(s, ((YouTubeDevice) (obj)));
    }

    static void a(j j1, DatagramSocket datagramsocket, List list)
    {
        ArrayList arraylist;
        byte abyte0[];
        int i1;
        i1 = 2000;
        abyte0 = new byte[1024];
        arraylist = new ArrayList();
_L2:
        Object obj = new DatagramPacket(abyte0, abyte0.length);
        datagramsocket.setSoTimeout(i1);
        boolean flag;
        long l1;
        l1 = System.currentTimeMillis();
        flag = true;
        datagramsocket.receive(((DatagramPacket) (obj)));
_L5:
        i1 -= (int)(System.currentTimeMillis() - l1);
        int k1 = i1;
        if (i1 <= 0)
        {
            break MISSING_BLOCK_LABEL_195;
        }
        if (flag)
        {
            obj = b(new String(((DatagramPacket) (obj)).getData(), 0, ((DatagramPacket) (obj)).getLength()));
            if (list.contains(((Map) (obj)).get("ST")))
            {
                obj = (String)((Map) (obj)).get("LOCATION");
                IOException ioexception;
                long l2;
                long l3;
                if (obj != null)
                {
                    if (j1.k.containsKey(obj))
                    {
                        j1.a(((String) (obj)), (YouTubeDevice)j1.k.get(obj));
                    } else
                    {
                        arraylist.add(j1.d.submit(new k(j1, ((String) (obj)))));
                    }
                }
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        j1;
        Log.w(b, "Error setting socket timeout", j1);
        k1 = i1;
_L4:
        j1 = arraylist.iterator();
        l2 = 7300L;
_L3:
        if (!j1.hasNext())
        {
            break MISSING_BLOCK_LABEL_338;
        }
        datagramsocket = (Future)j1.next();
        l3 = System.currentTimeMillis();
        datagramsocket.get(k1, TimeUnit.MILLISECONDS);
        l3 = Math.max(0L, l2 - (System.currentTimeMillis() - l3));
        l2 = l3;
          goto _L3
        j1;
        k1 = i1;
          goto _L4
        ioexception;
        Log.w(b, "Error receiving m search response packet", ioexception);
        flag = false;
          goto _L5
        j1;
        Log.w(b, "Read device response task cancelled while waiting for reading device details task to complete");
        a(((List) (arraylist)));
        return;
        datagramsocket;
        Log.e(b, "Error waiting for reading device details task to complete", datagramsocket);
          goto _L3
        datagramsocket;
        Log.e(b, "Timed out whilst reading device details");
          goto _L3
    }

    private void a(String s, YouTubeDevice youtubedevice)
    {
        this;
        JVM INSTR monitorenter ;
        if (h.contains(youtubedevice.getSsdpId()))
        {
            break MISSING_BLOCK_LABEL_110;
        }
        h.add(youtubedevice.getSsdpId());
        youtubedevice = a(youtubedevice);
        if (youtubedevice == null)
        {
            break MISSING_BLOCK_LABEL_110;
        }
        i.put(youtubedevice, Boolean.TRUE);
        for (Iterator iterator = j.iterator(); iterator.hasNext(); ((c)iterator.next()).a(youtubedevice)) { }
        break MISSING_BLOCK_LABEL_98;
        s;
        throw s;
        k.put(s, youtubedevice);
        this;
        JVM INSTR monitorexit ;
    }

    private static void a(List list)
    {
        for (list = list.iterator(); list.hasNext(); ((Future)list.next()).cancel(true)) { }
    }

    static boolean a(j j1, boolean flag)
    {
        j1.m = false;
        return false;
    }

    private static MulticastSocket b(NetworkInterface networkinterface)
    {
        MulticastSocket multicastsocket;
        try
        {
            multicastsocket = new MulticastSocket();
            multicastsocket.setNetworkInterface(networkinterface);
            multicastsocket.setReceiveBufferSize(0x40000);
            multicastsocket.setBroadcast(true);
        }
        catch (IOException ioexception)
        {
            Log.w(b, String.format("Error creating socket on interface %s", new Object[] {
                networkinterface.getDisplayName()
            }), ioexception);
            return null;
        }
        return multicastsocket;
    }

    static List b()
    {
        return a;
    }

    static Map b(j j1)
    {
        return j1.k;
    }

    private static Map b(String s)
    {
        HashMap hashmap = new HashMap();
        s = new Scanner(s);
        do
        {
            if (!s.hasNextLine())
            {
                break;
            }
            Object obj = s.nextLine();
            obj = c.matcher(((CharSequence) (obj)));
            if (((Matcher) (obj)).matches())
            {
                hashmap.put(((Matcher) (obj)).group(1).toUpperCase(Locale.US), ((Matcher) (obj)).group(2));
            }
        } while (true);
        return hashmap;
    }

    private static DatagramPacket c(String s)
    {
        InetAddress inetaddress;
        try
        {
            inetaddress = InetAddress.getByName("239.255.255.250");
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        s = (new StringBuilder("M-SEARCH * HTTP/1.1\r\nHOST: ")).append(inetaddress.getHostAddress()).append(":1900").append("\r\nMAN: \"ssdp:discover\"\r\n").append("MX: 1").append("\r\nST: ").append(s).append("\r\n\r\n").toString().getBytes();
        return new DatagramPacket(s, s.length, inetaddress, 1900);
    }

    private List c()
    {
        Object obj;
        NetworkInterface networkinterface;
        boolean flag;
        Object obj1;
        boolean flag1;
        try
        {
            obj1 = Collections.list(NetworkInterface.getNetworkInterfaces());
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Log.e(b, "Error retrieving local interfaces", ((Throwable) (obj)));
            return Collections.emptyList();
        }
        obj = new ArrayList();
        obj1 = ((List) (obj1)).iterator();
_L4:
        if (!((Iterator) (obj1)).hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        networkinterface = (NetworkInterface)((Iterator) (obj1)).next();
        if (android.os.Build.VERSION.SDK_INT < 9)
        {
            break MISSING_BLOCK_LABEL_127;
        }
        InetAddress inetaddress;
        SocketException socketexception;
        boolean flag2;
        if (!networkinterface.isLoopback() && !networkinterface.isPointToPoint())
        {
            flag = false;
        } else
        {
            flag = true;
        }
        if (flag)
        {
            continue; /* Loop/switch isn't completed */
        }
        flag1 = networkinterface.getInetAddresses().hasMoreElements();
        if (flag1 && a(networkinterface) != null)
        {
            ((List) (obj)).add(networkinterface);
        }
        continue; /* Loop/switch isn't completed */
        inetaddress = a(networkinterface);
        if (inetaddress == null)
        {
            break MISSING_BLOCK_LABEL_160;
        }
        flag2 = inetaddress.equals(g);
        if (flag2)
        {
            flag = true;
            continue; /* Loop/switch isn't completed */
        }
        flag = false;
        if (true) goto _L2; else goto _L1
_L1:
        break MISSING_BLOCK_LABEL_165;
_L2:
        break MISSING_BLOCK_LABEL_66;
        socketexception;
        Log.e(b, String.format("Could not read interface type for %s", new Object[] {
            networkinterface.getDisplayName()
        }), socketexception);
        if (true) goto _L4; else goto _L3
_L3:
        return ((List) (obj));
    }

    static Map c(j j1)
    {
        return j1.i;
    }

    private static InetAddress d()
    {
        InetAddress inetaddress;
        try
        {
            inetaddress = InetAddress.getByName("127.0.0.1");
        }
        catch (UnknownHostException unknownhostexception)
        {
            return null;
        }
        return inetaddress;
    }

    static Set d(j j1)
    {
        return j1.h;
    }

    static Set e(j j1)
    {
        return j1.j;
    }

    static void f(j j1)
    {
label0:
        {
            Object obj = j1.c();
            if (!((List) (obj)).isEmpty())
            {
                j1.l.clear();
                j1.k.clear();
                obj = ((List) (obj)).iterator();
                do
                {
                    if (!((Iterator) (obj)).hasNext())
                    {
                        break;
                    }
                    MulticastSocket multicastsocket = b((NetworkInterface)((Iterator) (obj)).next());
                    if (multicastsocket != null)
                    {
                        for (Iterator iterator = a.iterator(); iterator.hasNext();)
                        {
                            String s = (String)iterator.next();
                            int i1 = 0;
                            while (i1 < 3) 
                            {
                                j1.d.schedule(new l(j1, s, multicastsocket), i1 * 300, TimeUnit.MILLISECONDS);
                                i1++;
                            }
                        }

                        j1.l.add(j1.d.submit(new m(j1, multicastsocket)));
                    }
                } while (true);
                if (j1.l.isEmpty())
                {
                    break label0;
                }
                j1.d.schedule(new n(j1), 2L, TimeUnit.SECONDS);
            }
            return;
        }
        j1.m = false;
    }

    public final void a(c c1)
    {
        if (d.isShutdown())
        {
            Log.e(b, "Can not call find after stopSearch. Bye!");
        } else
        {
            j.add(c1);
            if (m)
            {
                Iterator iterator = i.keySet().iterator();
                while (iterator.hasNext()) 
                {
                    c1.a((YouTubeDevice)iterator.next());
                }
            } else
            {
                m = true;
                d.execute(new o(this));
                return;
            }
        }
    }

    static 
    {
        String as[];
        int i1;
        i1 = 0;
        as = new String[1];
        as[0] = "urn:dial-multiscreen-org:service:dial:1";
        if (as != null && as.length != 0) goto _L2; else goto _L1
_L1:
        Object obj = Collections.emptyList();
_L4:
        a = Collections.unmodifiableList(((List) (obj)));
        b = com/google/android/apps/ytremote/b/j.getCanonicalName();
        c = Pattern.compile("^(.+?): (.+)$");
        return;
_L2:
        ArrayList arraylist = new ArrayList(as.length);
        int j1 = as.length;
        do
        {
            obj = arraylist;
            if (i1 >= j1)
            {
                continue;
            }
            arraylist.add(as[i1]);
            i1++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }
}
