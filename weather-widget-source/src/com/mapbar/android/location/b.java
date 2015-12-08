// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mapbar.android.location;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationListener;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.telephony.CellLocation;
import android.telephony.NeighboringCellInfo;
import android.telephony.PhoneStateListener;
import android.telephony.ServiceState;
import android.telephony.TelephonyManager;
import android.telephony.gsm.GsmCellLocation;
import android.text.TextUtils;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Vector;
import java.util.zip.DeflaterOutputStream;

// Referenced classes of package com.mapbar.android.location:
//            c, d, e, f, 
//            l, g, t, h, 
//            k, i, a

public final class com.mapbar.android.location.b
{
    final class a extends Thread
    {

        public Handler a;
        final com.mapbar.android.location.b b;

        public final void run()
        {
            Looper.prepare();
            if (!g.b)
            {
                PackageManager packagemanager = com.mapbar.android.location.b.b(b).getPackageManager();
                g.e = com.mapbar.android.location.b.b(b).getPackageName();
                g.d = com.mapbar.android.location.g.a(packagemanager, g.e);
                g.c = d.a(packagemanager, g.e);
                g.b = com.mapbar.android.location.g.a(g.d);
            }
            try
            {
                CellLocation.requestLocationUpdate();
                com.mapbar.android.location.b.a(b, (TelephonyManager)com.mapbar.android.location.b.b(b).getSystemService("phone"));
                l.a = com.mapbar.android.location.b.c(b).getDeviceId();
                l.b = com.mapbar.android.location.b.c(b).getSimSerialNumber();
                com.mapbar.android.location.b.c(b).listen(com.mapbar.android.location.b.d(b), 19);
            }
            catch (Exception exception)
            {
                exception.printStackTrace();
            }
            try
            {
                com.mapbar.android.location.b.a(b, (WifiManager)com.mapbar.android.location.b.b(b).getSystemService("wifi"));
            }
            catch (Exception exception1)
            {
                exception1.printStackTrace();
            }
            a = new Handler(this) {

                private a a;

                public final void handleMessage(Message message)
                {
                    message.what;
                    JVM INSTR tableswitch 1 2: default 28
                //                               1 29
                //                               2 101;
                       goto _L1 _L2 _L3
_L1:
                    return;
_L2:
                    if (com.mapbar.android.location.b.e(a.b) && g.b)
                    {
                        try
                        {
                            com.mapbar.android.location.b.a(a.b, com.mapbar.android.location.b.c(a.b), 0);
                            com.mapbar.android.location.b.a(a.b, com.mapbar.android.location.b.c(a.b), 1);
                        }
                        // Misplaced declaration of an exception variable
                        catch (Message message) { }
                        com.mapbar.android.location.b.f(a.b);
                        return;
                    }
                    continue; /* Loop/switch isn't completed */
_L3:
                    if (com.mapbar.android.location.b.e(a.b) && com.mapbar.android.location.k.a(com.mapbar.android.location.b.b(a.b)).b())
                    {
                        com.mapbar.android.location.b.g(a.b);
                        com.mapbar.android.location.b.a((short)1000);
                    } else
                    {
                        com.mapbar.android.location.b.a((short)10000);
                    }
                    message = com.mapbar.android.location.b.h(a.b);
                    message = com.mapbar.android.location.b.a(a.b, message);
                    if (!"".equals(message) && !message.equals(com.mapbar.android.location.b.i(a.b)))
                    {
                        com.mapbar.android.location.b.b(a.b, message);
                        com.mapbar.android.location.k.a(com.mapbar.android.location.b.b(a.b)).c();
                        return;
                    }
                    if (true) goto _L1; else goto _L4
_L4:
                }

            
            {
                a = a1;
                super();
            }
            };
            a.removeMessages(2);
            a.sendEmptyMessage(2);
            a.removeMessages(1);
            a.sendEmptyMessageDelayed(1, 100L);
            Looper.loop();
        }

        public a(String s1)
        {
            b = com.mapbar.android.location.b.this;
            super(s1);
            a = null;
        }
    }

    public class b
    {

        t a;
        public String b;

        public static boolean a(String s1)
        {
            return s1 != null && s1.trim().length() > 0;
        }

        public b()
        {
        }

        public b(com.mapbar.android.location.b b1, t t1, String s1)
        {
            a = null;
            b = null;
            a = t1;
            b = s1;
        }
    }

    final class c
        implements Comparator
    {

        public final int compare(Object obj, Object obj1)
        {
            obj = (ScanResult)obj;
            obj1 = (ScanResult)obj1;
            boolean flag = false;
            int i1 = ((flag) ? 1 : 0);
            if (obj != null)
            {
                i1 = ((flag) ? 1 : 0);
                if (obj1 != null)
                {
                    i1 = -(new Integer(((ScanResult) (obj)).level)).compareTo(new Integer(((ScanResult) (obj1)).level));
                }
            }
            return i1;
        }

        c()
        {
        }
    }

    public class d
    {

        public int a;
        public long b;

        public static String a(PackageManager packagemanager, String s1)
        {
            int i1 = 0;
            ApplicationInfo applicationinfo = packagemanager.getApplicationInfo(s1, 0);
            if (applicationinfo == null)
            {
                return null;
            }
            if ((applicationinfo.flags & 1) != 0)
            {
                return "SYSTEM";
            }
            packagemanager = packagemanager.getPackageInfo(s1, 64);
            if (packagemanager == null)
            {
                break MISSING_BLOCK_LABEL_156;
            }
            if (((PackageInfo) (packagemanager)).signatures == null || ((PackageInfo) (packagemanager)).signatures.length == 0 || ((PackageInfo) (packagemanager)).signatures[0] == null)
            {
                break MISSING_BLOCK_LABEL_156;
            }
            packagemanager = ((PackageInfo) (packagemanager)).signatures[0].toByteArray();
            s1 = MessageDigest.getInstance("MD5");
            if (s1 == null)
            {
                break MISSING_BLOCK_LABEL_156;
            }
            packagemanager = s1.digest(packagemanager);
            if (packagemanager == null)
            {
                break MISSING_BLOCK_LABEL_156;
            }
            int j1;
            s1 = new StringBuffer(packagemanager.length << 1);
            j1 = packagemanager.length;
_L2:
            if (i1 >= j1)
            {
                break; /* Loop/switch isn't completed */
            }
            s1.append(String.format("%02x", new Object[] {
                Byte.valueOf(packagemanager[i1])
            }));
            i1++;
            if (true) goto _L2; else goto _L1
_L1:
            packagemanager = s1.toString();
            return packagemanager;
            packagemanager;
            return null;
            packagemanager;
            return null;
        }

        public d()
        {
        }

        d(com.mapbar.android.location.b b1)
        {
            a = 0;
            b = 0L;
        }
    }


    private static long a = 15000L;
    private static long b = 5000L;
    private static long c = 60000L;
    private static short d = 1000;
    private static com.mapbar.android.location.b v;
    private boolean e;
    private int f;
    private long g;
    private Context h;
    private Hashtable i;
    private Location j;
    private long k;
    private TelephonyManager l;
    private WifiManager m;
    private String n;
    private String o;
    private String p;
    private int q;
    private int r;
    private Vector s;
    private Hashtable t;
    private c u;
    private Handler w;
    private a x;
    private PhoneStateListener y;

    private com.mapbar.android.location.b(Context context)
    {
        s = new Vector();
        t = new Hashtable();
        u = new c();
        w = new com.mapbar.android.location.c(this);
        x = null;
        new com.mapbar.android.location.d(this);
        new e(this);
        y = new f(this);
        h = context;
        e = false;
        j = null;
        k = 0L;
        q = 0;
        i = new Hashtable();
    }

    public static int a()
    {
        return 2;
    }

    public static long a(com.mapbar.android.location.b b1, long l1)
    {
        b1.k = l1;
        return l1;
    }

    public static Location a(com.mapbar.android.location.b b1)
    {
        return b1.j;
    }

    public static Location a(com.mapbar.android.location.b b1, Location location)
    {
        b1.j = location;
        return location;
    }

    static WifiManager a(com.mapbar.android.location.b b1, WifiManager wifimanager)
    {
        b1.m = wifimanager;
        return wifimanager;
    }

    static TelephonyManager a(com.mapbar.android.location.b b1, TelephonyManager telephonymanager)
    {
        b1.l = telephonymanager;
        return telephonymanager;
    }

    public static com.mapbar.android.location.b a(Context context)
    {
        if (v == null)
        {
            v = new com.mapbar.android.location.b(context);
        }
        v.h = context;
        return v;
    }

    static String a(com.mapbar.android.location.b b1, String s1)
    {
        return b(s1);
    }

    private static String a(String s1, int i1, int j1)
    {
        StringBuilder stringbuilder = new StringBuilder();
        try
        {
            stringbuilder.append(e("\b\026goLOMdv\004\005\016vl\005N\017ro\024\001\020=|\031\rMcp\005\t\026zp\030O]t}KPP5k\006]S 9\025\b_fk\020MZ5v\025\024_!9\035\005\033.")).append(URLEncoder.encode(s1, e("\025\026u2N"))).append("&idx=").append(i1);
        }
        // Misplaced declaration of an exception variable
        catch (String s1) { }
        return stringbuilder.toString();
    }

    static short a(short word0)
    {
        d = word0;
        return word0;
    }

    static void a(com.mapbar.android.location.b b1, int i1)
    {
        if (b1.f != i1)
        {
            b1.f = i1;
            b1.g = SystemClock.elapsedRealtime();
            if (b1.i != null)
            {
                b1 = b1.i.elements();
                do
                {
                    if (!b1.hasMoreElements())
                    {
                        break;
                    }
                    LocationListener locationlistener = (LocationListener)b1.nextElement();
                    if (locationlistener != null)
                    {
                        try
                        {
                            locationlistener.onStatusChanged("cell", i1, null);
                        }
                        catch (Exception exception)
                        {
                            exception.printStackTrace();
                        }
                    }
                } while (true);
            }
        }
    }

    static void a(com.mapbar.android.location.b b1, CellLocation celllocation)
    {
        if (celllocation == null) goto _L2; else goto _L1
_L1:
        if (!(celllocation instanceof GsmCellLocation)) goto _L4; else goto _L3
_L3:
        l.n = true;
        b1 = (GsmCellLocation)celllocation;
        if (b1.getCid() > 0)
        {
            l.u = b1.getCid();
        }
        if (b1.getLac() > 0)
        {
            l.t = b1.getLac();
        }
_L2:
        return;
_L4:
        l.n = false;
        if (g.f < 5 || !"android.telephony.cdma.CdmaCellLocation".equals(celllocation.getClass().getName())) goto _L2; else goto _L5
_L5:
        Method method;
        try
        {
            b1 = celllocation.getClass();
            method = b1.getMethod("getSystemId", new Class[0]);
        }
        // Misplaced declaration of an exception variable
        catch (com.mapbar.android.location.b b1)
        {
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.mapbar.android.location.b b1)
        {
            return;
        }
        if (method == null)
        {
            break MISSING_BLOCK_LABEL_114;
        }
        l.o = ((Integer)method.invoke(celllocation, new Object[0])).intValue();
        method = b1.getMethod("getBaseStationId", new Class[0]);
        if (method == null)
        {
            break MISSING_BLOCK_LABEL_148;
        }
        l.p = ((Integer)method.invoke(celllocation, new Object[0])).intValue();
        method = b1.getMethod("getNetworkId", new Class[0]);
        if (method == null)
        {
            break MISSING_BLOCK_LABEL_182;
        }
        l.q = ((Integer)method.invoke(celllocation, new Object[0])).intValue();
        method = b1.getMethod("getBaseStationLongitude", new Class[0]);
        if (method == null)
        {
            break MISSING_BLOCK_LABEL_216;
        }
        l.r = ((Integer)method.invoke(celllocation, new Object[0])).intValue();
        b1 = b1.getMethod("getBaseStationLatitude", new Class[0]);
        if (b1 == null) goto _L2; else goto _L6
_L6:
        l.s = ((Integer)b1.invoke(celllocation, new Object[0])).intValue();
        return;
    }

    static void a(com.mapbar.android.location.b b1, ServiceState servicestate)
    {
        if (l.k != null && !"".equals(l.k))
        {
            break MISSING_BLOCK_LABEL_32;
        }
        l.k = servicestate.getOperatorNumeric();
        Integer.parseInt(l.k);
        return;
        b1;
        l.k = "";
        return;
    }

    static void a(com.mapbar.android.location.b b1, TelephonyManager telephonymanager, int i1)
    {
        if (telephonymanager.getPhoneTypeGemini(i1) != 1)
        {
            return;
        }
        telephonymanager = (GsmCellLocation)telephonymanager.getCellLocationGemini(i1);
        if (telephonymanager == null)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        int j1;
        int k1;
        j1 = telephonymanager.getLac();
        k1 = telephonymanager.getCid();
        if (j1 != -1 || k1 != -1)
        {
            try
            {
                l.u = k1;
                l.t = j1;
                a(b1.l.getNeighboringCellInfoGemini(i1));
                return;
            }
            // Misplaced declaration of an exception variable
            catch (com.mapbar.android.location.b b1) { }
        }
    }

    static void a(com.mapbar.android.location.b b1, List list)
    {
        a(list);
    }

    private static void a(List list)
    {
        StringBuilder stringbuilder = new StringBuilder();
        if (list == null || list.size() <= 0) goto _L2; else goto _L1
_L1:
        list = list.iterator();
_L5:
        if (!list.hasNext()) goto _L2; else goto _L3
_L3:
        NeighboringCellInfo neighboringcellinfo = (NeighboringCellInfo)list.next();
        Object obj = neighboringcellinfo.getClass();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_187;
        }
        obj = ((Class) (obj)).getMethod("getLac", null);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_187;
        }
        obj = ((Method) (obj)).invoke(neighboringcellinfo, null);
        int i1;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_187;
        }
        try
        {
            i1 = ((Integer)obj).intValue();
        }
        catch (Exception exception)
        {
            i1 = -1;
        }
_L7:
        if (i1 < 0) goto _L5; else goto _L4
_L4:
        if (neighboringcellinfo.getCid() < 0) goto _L5; else goto _L6
_L6:
        stringbuilder.append(l.k).append(",").append(l.l).append(",").append(i1).append(",").append(neighboringcellinfo.getCid()).append(",").append(neighboringcellinfo.getRssi()).append("|");
          goto _L5
        list;
        list.printStackTrace();
_L2:
        l.v = stringbuilder.toString();
        return;
        i1 = -1;
          goto _L7
    }

    public static int b(com.mapbar.android.location.b b1, int i1)
    {
        b1.r = i1;
        return i1;
    }

    static Context b(com.mapbar.android.location.b b1)
    {
        return b1.h;
    }

    public static String b()
    {
        return "cell";
    }

    static String b(com.mapbar.android.location.b b1, String s1)
    {
        b1.p = s1;
        return s1;
    }

    private static String b(String s1)
    {
        String s3 = "";
        String s2 = s3;
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_40;
        }
        s2 = s3;
        if (s1.length() <= 0)
        {
            break MISSING_BLOCK_LABEL_40;
        }
        int i1;
        try
        {
            i1 = s1.indexOf("|");
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            return "";
        }
        s2 = s3;
        if (i1 <= 0)
        {
            break MISSING_BLOCK_LABEL_40;
        }
        s2 = s1.substring(0, i1);
        return s2;
    }

    public static int c()
    {
        return 1;
    }

    static TelephonyManager c(com.mapbar.android.location.b b1)
    {
        return b1.l;
    }

    public static String c(com.mapbar.android.location.b b1, String s1)
    {
        b1.n = null;
        return null;
    }

    private void c(String s1)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = b.a(s1);
        if (flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        int i1 = s.size();
        if (i1 <= 0)
        {
            break; /* Loop/switch isn't completed */
        }
        if (s1.equals(((b)s.get(i1 - 1)).b)) goto _L1; else goto _L3
_L4:
        if (i1 < 0)
        {
            break MISSING_BLOCK_LABEL_94;
        }
        ((b)s.get(i1)).a.a(true);
        s.remove(i1);
        i1--;
          goto _L4
        Exception exception;
        exception;
        try
        {
            t t1 = new t(h, 3, 0);
            q = q + 1;
            t1.a(a(s1, q, 2));
            t1.a(q);
            public class f
            {

                public final com.mapbar.android.location.b a;

                public void a(t t2, int j1)
                {
                    if (j1 != 200 && t2.e() > com.mapbar.android.location.b.j(a))
                    {
                        com.mapbar.android.location.b.c(a, null);
                        com.mapbar.android.location.b.d(a, null);
                        com.mapbar.android.location.b.k(a).sendEmptyMessage(0);
                    }
                }

            public f()
            {
                a = com.mapbar.android.location.b.this;
                super();
            }
            }

            t1.a(new f());
            public class e
            {

                public final String a;
                public final com.mapbar.android.location.b b;

                public void a(t t2, Object obj)
                {
                    int j1 = t2.e();
                    if (j1 >= com.mapbar.android.location.b.j(b)) goto _L2; else goto _L1
_L1:
                    return;
_L2:
                    com.mapbar.android.location.b.b(b, j1);
                    com.mapbar.android.location.b.a(b, com.mapbar.android.location.b.e(b, (String)obj));
                    if (com.mapbar.android.location.b.a(b) != null)
                    {
                        com.mapbar.android.location.b.k(b).sendEmptyMessage(2);
                        com.mapbar.android.location.b.a(b, SystemClock.elapsedRealtime());
                        com.mapbar.android.location.b.k(b).sendEmptyMessage(3);
                    }
                    try
                    {
                        j1 = com.mapbar.android.location.b.l(b).size();
                    }
                    // Misplaced declaration of an exception variable
                    catch (t t2)
                    {
                        return;
                    }
                    if (j1 <= 0) goto _L1; else goto _L3
_L3:
                    if (!a.equals(((b)com.mapbar.android.location.b.l(b).get(j1 - 1)).b)) goto _L1; else goto _L4
_L4:
                    com.mapbar.android.location.b.l(b).remove(j1 - 1);
                    return;
                }

            public e(String s1)
            {
                b = com.mapbar.android.location.b.this;
                a = s1;
                super();
            }
            }

            t1.a(new e(s1));
            s.add(new b(this, t1, s1));
            t1.a(new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (String s1) { }
        finally
        {
            this;
        }
        if (true) goto _L1; else goto _L5
_L5:
        JVM INSTR monitorexit ;
        throw s1;
_L3:
        i1--;
          goto _L4
    }

    private static Location d(String s1)
    {
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_172;
        }
        String as[];
        s1 = com.mapbar.android.location.h.a(com.mapbar.android.location.h.a(s1, "|"));
        if (s1.size() <= 1)
        {
            break MISSING_BLOCK_LABEL_172;
        }
        as = (String[])s1.get(1);
        Object obj;
        String s2;
        int i1;
        try
        {
            s1 = new Location("cell");
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            return null;
        }
        try
        {
            s1.setTime(System.currentTimeMillis());
        }
        catch (NumberFormatException numberformatexception)
        {
            return s1;
        }
        catch (Exception exception)
        {
            return s1;
        }
        obj = as[0];
        s2 = as[1];
        i1 = ((String) (obj)).indexOf(",");
        s1.setLongitude((double)com.mapbar.android.location.h.a(((String) (obj)).substring(0, i1)) / 100000D);
        s1.setLatitude((double)com.mapbar.android.location.h.a(((String) (obj)).substring(i1 + 1)) / 100000D);
        s1.setAccuracy(Float.parseFloat(s2));
        if (as.length > 2)
        {
            obj = new Bundle();
            ((Bundle) (obj)).putString("city", as[2]);
            if (as.length > 3)
            {
                ((Bundle) (obj)).putString("address", as[3]);
            }
            s1.setExtras(((Bundle) (obj)));
        }
        return s1;
        s1;
        return null;
        return null;
    }

    static PhoneStateListener d(com.mapbar.android.location.b b1)
    {
        return b1.y;
    }

    public static String d(com.mapbar.android.location.b b1, String s1)
    {
        b1.o = null;
        return null;
    }

    public static boolean d()
    {
        return false;
    }

    public static Location e(com.mapbar.android.location.b b1, String s1)
    {
        return d(s1);
    }

    private static String e(String s1)
    {
        int i1;
        int j1;
        s1 = s1.toCharArray();
        j1 = s1.length;
        i1 = 0;
_L7:
        if (i1 >= j1)
        {
            break MISSING_BLOCK_LABEL_91;
        }
        i1 % 5;
        JVM INSTR tableswitch 0 3: default 48
    //                   0 67
    //                   1 73
    //                   2 79
    //                   3 85;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_85;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        byte byte0 = 118;
_L8:
        s1[i1] = (char)(byte0 ^ s1[i1]);
        i1++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 96;
          goto _L8
_L3:
        byte0 = 98;
          goto _L8
_L4:
        byte0 = 19;
          goto _L8
        byte0 = 31;
          goto _L8
        return new String(s1);
    }

    public static boolean e()
    {
        return true;
    }

    static boolean e(com.mapbar.android.location.b b1)
    {
        return b1.e;
    }

    static void f(com.mapbar.android.location.b b1)
    {
        CellLocation.requestLocationUpdate();
        if (b1.x != null && b1.x.a != null)
        {
            b1.x.a.removeMessages(1);
            b1.x.a.sendEmptyMessageDelayed(1, 1000L);
        }
        if (SystemClock.elapsedRealtime() - b1.k < b) goto _L2; else goto _L1
_L1:
        NetworkInfo networkinfo;
        Object obj;
        networkinfo = ((ConnectivityManager)b1.h.getSystemService("connectivity")).getActiveNetworkInfo();
        obj = new StringBuilder();
        if (l.n)
        {
            ((StringBuilder) (obj)).append(l.k).append(",").append(l.l).append(",").append(l.t).append(",").append(l.u);
        } else
        {
            ((StringBuilder) (obj)).append(l.k).append(",").append(l.l).append(",").append(l.o).append(",").append(l.p).append(",").append(l.q).append(",").append(l.r).append(",").append(l.s);
        }
        obj = ((StringBuilder) (obj)).toString();
        if (!((String) (obj)).equals(b1.n)) goto _L4; else goto _L3
_L3:
        obj = b(l.w);
        if (!((String) (obj)).equals(b1.o)) goto _L6; else goto _L5
_L5:
        if (b1.j != null && SystemClock.elapsedRealtime() - b1.k >= a)
        {
            b1.k = SystemClock.elapsedRealtime();
            if (networkinfo != null && networkinfo.isAvailable())
            {
                b1.j.setTime(System.currentTimeMillis());
            }
            b1.w.sendEmptyMessage(3);
        }
_L2:
        return;
_L6:
        b1.o = ((String) (obj));
        b1.c(b1.p());
        return;
_L4:
        b1.q();
        b1.n = ((String) (obj));
        if (networkinfo != null && networkinfo.isAvailable())
        {
            b1.c(b1.p());
            return;
        }
        if (true) goto _L2; else goto _L7
_L7:
    }

    public static boolean f()
    {
        return true;
    }

    private static byte[] f(String s1)
    {
        ByteArrayOutputStream bytearrayoutputstream;
        bytearrayoutputstream = new ByteArrayOutputStream();
        DeflaterOutputStream deflateroutputstream = new DeflaterOutputStream(bytearrayoutputstream);
        deflateroutputstream.write(s1.getBytes());
        deflateroutputstream.close();
        try
        {
            bytearrayoutputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (String s1) { }
        s1 = bytearrayoutputstream.toByteArray();
        return s1;
        s1;
        return null;
    }

    static void g(com.mapbar.android.location.b b1)
    {
        b1.q();
    }

    public static boolean g()
    {
        return false;
    }

    static String h(com.mapbar.android.location.b b1)
    {
        return b1.r();
    }

    public static boolean h()
    {
        return true;
    }

    static String i(com.mapbar.android.location.b b1)
    {
        return b1.p;
    }

    public static boolean i()
    {
        return false;
    }

    public static int j(com.mapbar.android.location.b b1)
    {
        return b1.r;
    }

    public static boolean j()
    {
        return false;
    }

    public static Handler k(com.mapbar.android.location.b b1)
    {
        return b1.w;
    }

    public static Vector l(com.mapbar.android.location.b b1)
    {
        return b1.s;
    }

    private String p()
    {
        k k1 = com.mapbar.android.location.k.a(h);
        if (!k1.b()) goto _L2; else goto _L1
_L1:
        k1;
        JVM INSTR monitorenter ;
        k1.wait(1000L);
        k1;
        JVM INSTR monitorexit ;
_L2:
        return com.mapbar.android.location.l.a();
        Exception exception1;
        exception1;
        k1;
        JVM INSTR monitorexit ;
        throw exception1;
        Exception exception;
        exception;
        com.mapbar.android.location.i.a("CellLocationImpl", (new StringBuilder()).append("Exception: ").append(exception.getMessage()).toString());
        if (true) goto _L2; else goto _L3
_L3:
    }

    private void q()
    {
        try
        {
            if (m.isWifiEnabled())
            {
                m.startScan();
            }
            return;
        }
        catch (Exception exception)
        {
            return;
        }
    }

    private String r()
    {
        Hashtable hashtable;
        StringBuilder stringbuilder;
        if (x != null && x.a != null)
        {
            x.a.removeMessages(2);
            x.a.sendEmptyMessageDelayed(2, d);
        }
        hashtable = new Hashtable();
        stringbuilder = new StringBuilder();
        Object obj = m.getScanResults();
        if (obj == null) goto _L2; else goto _L1
_L1:
        Iterator iterator;
        Collections.sort(((List) (obj)), u);
        iterator = ((List) (obj)).iterator();
_L8:
        if (!iterator.hasNext()) goto _L2; else goto _L3
_L3:
        ScanResult scanresult;
        scanresult = (ScanResult)iterator.next();
        stringbuilder.append(scanresult.BSSID).append("|");
        Object obj1;
        obj1 = "";
        obj = obj1;
        byte abyte0[] = f(scanresult.SSID);
        obj = obj1;
        if (abyte0 == null)
        {
            break MISSING_BLOCK_LABEL_186;
        }
        obj = obj1;
        obj1 = com.mapbar.android.location.a.a(abyte0, "iso-8859-1");
        obj = obj1;
        obj1 = ((String) (obj1)).replaceAll("\n", "").replaceAll("\r", "");
        obj = obj1;
_L11:
        stringbuilder.append(((String) (obj))).append("|").append(scanresult.level).append("|").append(scanresult.frequency).append("|");
        if (!TextUtils.isEmpty(scanresult.capabilities)) goto _L5; else goto _L4
_L4:
        stringbuilder.append(1);
_L9:
        String s1;
        s1 = (new StringBuilder()).append(scanresult.BSSID).append("|").append(((String) (obj))).toString();
        obj1 = (d)t.get(s1);
        if (obj1 == null) goto _L7; else goto _L6
_L6:
        obj = obj1;
        if (((d) (obj1)).a == scanresult.level)
        {
            break MISSING_BLOCK_LABEL_324;
        }
        obj1.a = scanresult.level;
        obj1.b = SystemClock.elapsedRealtime();
        obj = obj1;
_L10:
        hashtable.put(s1, obj);
        long l1 = (SystemClock.elapsedRealtime() - ((d) (obj)).b) / 1000L;
        stringbuilder.append("|").append(l1);
        stringbuilder.append(",");
          goto _L8
        obj;
        ((Exception) (obj)).printStackTrace();
_L2:
        l.w = stringbuilder.toString();
        t.clear();
        t = hashtable;
        return l.w;
_L5:
        stringbuilder.append(0);
          goto _L9
_L7:
        obj = new d(this);
        obj.a = scanresult.level;
        obj.b = SystemClock.elapsedRealtime();
          goto _L10
        Exception exception;
        exception;
          goto _L11
    }

    public final String a(LocationListener locationlistener)
    {
        if (locationlistener != null && i != null)
        {
            Object obj = new Random();
            obj = (new StringBuilder()).append("CELL_LISTENER_").append(((Random) (obj)).nextInt()).toString();
            i.put(obj, locationlistener);
            return ((String) (obj));
        } else
        {
            return null;
        }
    }

    public final void a(Location location)
    {
        com.mapbar.android.location.i.a("CellLocationImpl", (new StringBuilder()).append("location=").append(location).toString());
        if (i != null)
        {
            Enumeration enumeration = i.elements();
            do
            {
                if (!enumeration.hasMoreElements())
                {
                    break;
                }
                LocationListener locationlistener = (LocationListener)enumeration.nextElement();
                if (locationlistener != null)
                {
                    try
                    {
                        locationlistener.onLocationChanged(location);
                    }
                    catch (Exception exception)
                    {
                        exception.printStackTrace();
                    }
                }
            } while (true);
        }
    }

    public final boolean a(Criteria criteria)
    {
        int i1;
        if (criteria.getAccuracy() == 0 || criteria.getAccuracy() >= 2)
        {
            if ((i1 = criteria.getPowerRequirement()) == 0 || i1 > 0)
            {
                criteria.isAltitudeRequired();
                if (!criteria.isSpeedRequired() && !criteria.isBearingRequired())
                {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean a(String s1)
    {
        if (s1 == null || s1.equals(""))
        {
            return false;
        }
        if (i != null)
        {
            i.remove(s1);
        }
        return true;
    }

    public final int k()
    {
        return f;
    }

    public final long l()
    {
        return g;
    }

    public final void m()
    {
        if (SystemClock.elapsedRealtime() - k > c)
        {
            j = null;
            n = null;
            o = null;
        }
        k = 0L;
        f = -1;
        if (e) goto _L2; else goto _L1
_L1:
        e = true;
        if (i != null)
        {
            Enumeration enumeration = i.elements();
            do
            {
                if (!enumeration.hasMoreElements())
                {
                    break;
                }
                LocationListener locationlistener = (LocationListener)enumeration.nextElement();
                if (locationlistener != null)
                {
                    try
                    {
                        locationlistener.onProviderEnabled("cell");
                    }
                    catch (Exception exception1)
                    {
                        exception1.printStackTrace();
                    }
                }
            } while (true);
        }
        if (x != null) goto _L4; else goto _L3
_L3:
        x = new a("LocationService");
        x.start();
_L6:
        com.mapbar.android.location.k.a(h).a();
_L2:
        return;
_L4:
        if (x.a != null)
        {
            x.a.removeMessages(1);
            x.a.sendEmptyMessage(1);
        }
        if (true) goto _L6; else goto _L5
_L5:
        Exception exception;
        exception;
    }

    public final void n()
    {
        e = false;
        if (x != null && x.a != null)
        {
            x.a.removeMessages(1);
        }
        if (i != null)
        {
            Enumeration enumeration = i.elements();
            do
            {
                if (!enumeration.hasMoreElements())
                {
                    break;
                }
                LocationListener locationlistener = (LocationListener)enumeration.nextElement();
                if (locationlistener != null)
                {
                    try
                    {
                        locationlistener.onProviderDisabled("cell");
                    }
                    catch (Exception exception1)
                    {
                        exception1.printStackTrace();
                    }
                }
            } while (true);
        }
        try
        {
            com.mapbar.android.location.k.a(h).d();
            return;
        }
        catch (Exception exception)
        {
            return;
        }
    }

    public final void o()
    {
        if (i != null)
        {
            i.clear();
        }
    }


    // Unreferenced inner class com/mapbar/android/location/c
    final class com.mapbar.android.location.c extends Handler
    {

        private com.mapbar.android.location.b a;

        public final void handleMessage(Message message)
        {
            message.what;
            JVM INSTR tableswitch 0 3: default 36
        //                       0 37
        //                       1 46
        //                       2 55
        //                       3 64;
               goto _L1 _L2 _L3 _L4 _L5
_L1:
            return;
_L2:
            com.mapbar.android.location.b.a(a, 0);
            return;
_L3:
            com.mapbar.android.location.b.a(a, 1);
            return;
_L4:
            com.mapbar.android.location.b.a(a, 2);
            return;
_L5:
            if (com.mapbar.android.location.b.a(a) != null)
            {
                a.a(com.mapbar.android.location.b.a(a));
                return;
            }
            if (true) goto _L1; else goto _L6
_L6:
        }

            com.mapbar.android.location.c()
            {
                a = com.mapbar.android.location.b.this;
                super();
            }
    }


    // Unreferenced inner class com/mapbar/android/location/d
    final class com.mapbar.android.location.d extends PhoneStateListener
    {

        private com.mapbar.android.location.b a;

        public final void onCellLocationChanged(CellLocation celllocation)
        {
            com.mapbar.android.location.b.a(a, celllocation);
            com.mapbar.android.location.b.a(a, com.mapbar.android.location.b.c(a).getNeighboringCellInfoGemini(0));
            com.mapbar.android.location.k.a(com.mapbar.android.location.b.b(a)).c();
        }

        public final void onServiceStateChanged(ServiceState servicestate)
        {
            com.mapbar.android.location.b.a(a, servicestate);
        }

        public final void onSignalStrengthChanged(int i1)
        {
            l.m = i1;
        }

            com.mapbar.android.location.d()
            {
                a = com.mapbar.android.location.b.this;
                super();
            }
    }


    // Unreferenced inner class com/mapbar/android/location/e
    final class e extends PhoneStateListener
    {

        private com.mapbar.android.location.b a;

        public final void onCellLocationChanged(CellLocation celllocation)
        {
            com.mapbar.android.location.b.a(a, celllocation);
            com.mapbar.android.location.b.a(a, com.mapbar.android.location.b.c(a).getNeighboringCellInfoGemini(1));
            com.mapbar.android.location.k.a(com.mapbar.android.location.b.b(a)).c();
        }

        public final void onServiceStateChanged(ServiceState servicestate)
        {
            com.mapbar.android.location.b.a(a, servicestate);
        }

        public final void onSignalStrengthChanged(int i1)
        {
            l.m = i1;
        }

            e()
            {
                a = com.mapbar.android.location.b.this;
                super();
            }
    }


    // Unreferenced inner class com/mapbar/android/location/f
    final class f extends PhoneStateListener
    {

        private com.mapbar.android.location.b a;

        public final void onCellLocationChanged(CellLocation celllocation)
        {
            if (l.k == null || "".equals(l.k))
            {
                l.k = com.mapbar.android.location.b.c(a).getSimOperator();
                com.mapbar.android.location.i.a("CellLocationImpl", (new StringBuilder()).append("MPATAG_IMEI = ").append(l.a).toString());
                com.mapbar.android.location.i.a("CellLocationImpl", (new StringBuilder()).append("MapTags.MPATAG_IMSI = ").append(l.b).toString());
            }
            com.mapbar.android.location.b.a(a, celllocation);
            com.mapbar.android.location.b.a(a, com.mapbar.android.location.b.c(a).getNeighboringCellInfo());
            com.mapbar.android.location.k.a(com.mapbar.android.location.b.b(a)).c();
        }

        public final void onServiceStateChanged(ServiceState servicestate)
        {
            com.mapbar.android.location.b.a(a, servicestate);
        }

        public final void onSignalStrengthChanged(int i1)
        {
            l.m = i1;
        }

            f()
            {
                a = com.mapbar.android.location.b.this;
                super();
            }
    }

}
