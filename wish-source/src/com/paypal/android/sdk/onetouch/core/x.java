// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk.onetouch.core;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.telephony.ServiceState;
import android.telephony.TelephonyManager;
import android.telephony.cdma.CdmaCellLocation;
import android.telephony.gsm.GsmCellLocation;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.Timer;
import java.util.UUID;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONObject;

// Referenced classes of package com.paypal.android.sdk.onetouch.core:
//            v, as, t, ab, 
//            y, w, ah, aj, 
//            a, ad, ar, aq, 
//            s, ac, aa, z

public class x
    implements LocationListener
{

    private static final String a = com/paypal/android/sdk/onetouch/core/x.getSimpleName();
    private static v x = new v();
    private static final Object y = new Object();
    private static x z;
    private Context b;
    private String c;
    private long d;
    private long e;
    private int f;
    private int g;
    private long h;
    private String i;
    private t j;
    private w k;
    private w l;
    private String m;
    private Map n;
    private Map o;
    private Location p;
    private Timer q;
    private Handler r;
    private a s;
    private String t;
    private String u;
    private boolean v;
    private String w;

    private x()
    {
    }

    static int a(x x1)
    {
        int i1 = x1.f;
        x1.f = i1 + 1;
        return i1;
    }

    private static long a(Context context)
    {
        if (context != null) goto _L2; else goto _L1
_L1:
        return 0L;
_L2:
        long l1;
        try
        {
            if (android.os.Build.VERSION.SDK_INT > 8)
            {
                return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).firstInstallTime;
            }
            context = context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).sourceDir;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return 0L;
        }
        if (context == null) goto _L1; else goto _L3
_L3:
        l1 = (new File(context)).lastModified();
        return l1;
    }

    public static x a()
    {
        x x1;
        synchronized (y)
        {
            if (z == null)
            {
                z = new x();
            }
            x1 = z;
        }
        return x1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private static String a(TelephonyManager telephonymanager)
    {
        try
        {
            telephonymanager = telephonymanager.getSimOperatorName();
        }
        // Misplaced declaration of an exception variable
        catch (TelephonyManager telephonymanager)
        {
            as.a(a, "Known SecurityException on some devices", telephonymanager);
            return null;
        }
        return telephonymanager;
    }

    private void a(t t1)
    {
        j = t1;
        as.a(a, "Configuration loaded");
        as.a(a, (new StringBuilder("URL:     ")).append(j.a()).toString());
        as.a(a, (new StringBuilder("Version: ")).append(j.b()).toString());
        j();
        q = new Timer();
        long l1 = j.c();
        long l2 = j.d();
        long l3 = j.e();
        as.a(a, (new StringBuilder("Sending logRiskMetadata every ")).append(l1).append(" seconds.").toString());
        as.a(a, (new StringBuilder("sessionTimeout set to ")).append(l2).append(" seconds.").toString());
        as.a(a, (new StringBuilder("compTimeout set to    ")).append(l3).append(" seconds.").toString());
        d = l1 * 1000L;
        e = l3 * 1000L;
        ab.a(l2 * 1000L);
        if (j != null && v)
        {
            j();
            q = new Timer();
            as.a(a, "Starting LogRiskMetadataTask");
            q.scheduleAtFixedRate(new y(this), 0L, d);
        }
    }

    private void a(w w1, w w2)
    {
        boolean flag1 = true;
        if (w1 != null)
        {
            w1.ac = new HashMap(n);
            o = new HashMap(n);
            if (w2 != null)
            {
                w1 = w1.a(w2);
            } else
            {
                w1 = w1.a();
            }
            w2 = new ArrayList();
            w2.add(new BasicNameValuePair("appGuid", c));
            w2.add(new BasicNameValuePair("libraryVersion", c()));
            w2.add(new BasicNameValuePair("additionalData", w1.toString()));
            as.a(a, (new StringBuilder("Dyson Risk Data ")).append(w1.toString()).toString());
            if (j != null)
            {
                w1 = j.g();
                boolean flag2 = j.h();
                as.a(a, (new StringBuilder("new LogRiskMetadataRequest to: ")).append(w1).toString());
                Object obj = a;
                StringBuilder stringbuilder = (new StringBuilder("endpointIsStage: ")).append(flag2).append(" (using SSL: ");
                boolean flag;
                if (!flag2)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                as.a(((String) (obj)), stringbuilder.append(flag).append(")").toString());
                obj = r;
                if (!flag2)
                {
                    flag = flag1;
                } else
                {
                    flag = false;
                }
                w1 = new ah(w1, w2, ((Handler) (obj)), flag, null);
                aj.a().a(w1);
                return;
            }
        }
    }

    static int b(x x1)
    {
        return x1.f;
    }

    private static long b(Context context)
    {
        if (context != null) goto _L2; else goto _L1
_L1:
        return 0L;
_L2:
        long l1;
        try
        {
            if (android.os.Build.VERSION.SDK_INT > 8)
            {
                return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
            }
            context = context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).sourceDir;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return 0L;
        }
        if (context == null) goto _L1; else goto _L3
_L3:
        l1 = (new File(context)).lastModified();
        return l1;
    }

    private static boolean b(String s1)
    {
        return s1 != null && s1.trim().length() >= 10 && s1.trim().length() <= 32;
    }

    public static String c()
    {
        return String.format(Locale.US, "Dyson/%S (%S %S)", new Object[] {
            "3.3.2.release", "Android", android.os.Build.VERSION.RELEASE
        });
    }

    static boolean c(x x1)
    {
        return System.currentTimeMillis() - x1.h > x1.e;
    }

    static long d(x x1)
    {
        return x1.e;
    }

    static Timer e(x x1)
    {
        return x1.q;
    }

    static void f(x x1)
    {
        if (x1.l != null)
        {
            as.a(a, (new StringBuilder()).append(x1.m).append(" update not sent correctly, retrying...").toString());
            if ("full".equals(x1.m))
            {
                x1.a(x1.l, null);
                return;
            } else
            {
                w w1 = x1.k();
                x1.a(x1.l, w1);
                return;
            }
        }
        if (!ab.c() || x1.k == null)
        {
            ab.a();
            x1.m = "full";
            w w2 = x1.k();
            x1.a(w2, null);
            x1.l = w2;
            return;
        } else
        {
            x1.m = "incremental";
            w w3 = x1.k();
            x1.a(x1.k, w3);
            x1.l = w3;
            return;
        }
    }

    static int g(x x1)
    {
        int i1 = x1.g;
        x1.g = i1 + 1;
        return i1;
    }

    static String g()
    {
        return a;
    }

    static int h(x x1)
    {
        return x1.g;
    }

    private static String h()
    {
        return UUID.randomUUID().toString().replaceAll("-", "");
    }

    static Context i(x x1)
    {
        return x1.b;
    }

    private String i()
    {
        StringBuilder stringbuilder = new StringBuilder("https://b.stats.paypal.com/counter.cgi?p=");
        if (s == null || s == a.a)
        {
            return "Beacon not recognize host app";
        }
        int i1 = s.a();
        if (u == null)
        {
            return "Beacon pairing id empty";
        }
        stringbuilder.append(u).append("&i=");
        Object obj = as.b();
        if (((String) (obj)).equals(""))
        {
            try
            {
                stringbuilder.append(com.paypal.android.sdk.onetouch.core.v.a("emptyIp")).append("&t=");
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                as.a(a, "error reading property file", ((Throwable) (obj)));
            }
        } else
        {
            stringbuilder.append(((String) (obj))).append("&t=");
        }
        stringbuilder.append(String.valueOf(System.currentTimeMillis() / 1000L)).append("&a=").append(i1);
        as.a(a, (new StringBuilder("Beacon Request URL ")).append(stringbuilder.toString()).toString());
        obj = new ad(stringbuilder.toString(), c, t, as.a(b), r);
        aj.a().a(((ai) (obj)));
        return stringbuilder.toString();
    }

    static String j(x x1)
    {
        return x1.i;
    }

    private void j()
    {
        if (q != null)
        {
            q.cancel();
        }
    }

    static Handler k(x x1)
    {
        return x1.r;
    }

    private w k()
    {
        w w1;
        if (b == null)
        {
            return null;
        }
        w1 = new w();
        Object obj;
        Object obj1;
        aq aq1;
        TelephonyManager telephonymanager;
        aq1 = j.i();
        telephonymanager = (TelephonyManager)b.getSystemService("phone");
        obj1 = (WifiManager)b.getSystemService("wifi");
        obj = (ConnectivityManager)b.getSystemService("connectivity");
        if (!as.a(b, "android.permission.ACCESS_WIFI_STATE")) goto _L2; else goto _L1
_L1:
        Object obj2 = ((WifiManager) (obj1)).getConnectionInfo();
_L97:
        if (!as.a(b, "android.permission.ACCESS_NETWORK_STATE")) goto _L4; else goto _L3
_L3:
        NetworkInfo networkinfo = ((ConnectivityManager) (obj)).getActiveNetworkInfo();
_L98:
        int i1;
        boolean flag;
        if (as.a(b, "android.permission.ACCESS_COARSE_LOCATION") || as.a(b, "android.permission.ACCESS_FINE_LOCATION"))
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        flag = as.a(b, "android.permission.READ_PHONE_STATE");
        telephonymanager.getPhoneType();
        JVM INSTR tableswitch 0 2: default 1824
    //                   0 1591
    //                   1 1606
    //                   2 1637;
           goto _L5 _L6 _L7 _L8
_L5:
        w1.A = (new StringBuilder("unknown (")).append(telephonymanager.getPhoneType()).append(")").toString();
        obj1 = null;
        obj = null;
_L78:
        if (!aq1.a(ar.w))
        {
            w1.A = null;
        }
        if (aq1.a(ar.a))
        {
            w1.a = c;
        }
        if (aq1.a(ar.O))
        {
            w1.S = u;
        }
        if (!aq1.a(ar.M)) goto _L10; else goto _L9
_L9:
        if (s != null) goto _L12; else goto _L11
_L11:
        w1.O = a.a.a();
_L10:
        if (aq1.a(ar.N))
        {
            w1.P = t;
        }
        if (aq1.a(ar.u))
        {
            w1.X = w;
        }
        if (aq1.a(ar.S))
        {
            w1.V = android.provider.Settings.Secure.getString(b.getContentResolver(), "android_id");
        }
        s s1 = as.a(b);
        if (aq1.a(ar.b))
        {
            w1.b = s1.a();
        }
        if (aq1.a(ar.c))
        {
            w1.c = s1.b();
        }
        if (!aq1.a(ar.d)) goto _L14; else goto _L13
_L13:
        if (obj1 != null) goto _L16; else goto _L15
_L15:
        i1 = -1;
_L85:
        w1.d = i1;
_L14:
        if (!aq1.a(ar.I)) goto _L18; else goto _L17
_L17:
        if (obj1 != null) goto _L20; else goto _L19
_L19:
        i1 = -1;
_L86:
        w1.M = i1;
_L18:
        if (!aq1.a(ar.J)) goto _L22; else goto _L21
_L21:
        if (obj1 != null) goto _L24; else goto _L23
_L23:
        i1 = -1;
_L87:
        w1.L = i1;
_L22:
        if (!aq1.a(ar.e)) goto _L26; else goto _L25
_L25:
        if (obj2 != null) goto _L28; else goto _L27
_L27:
        obj1 = null;
_L88:
        w1.e = ((String) (obj1));
_L26:
        if (!aq1.a(ar.f)) goto _L30; else goto _L29
_L29:
        if (obj != null) goto _L32; else goto _L31
_L31:
        i1 = -1;
_L89:
        w1.f = i1;
_L30:
        if (aq1.a(ar.H))
        {
            w1.N = telephonymanager.getNetworkOperator();
        }
        w1.g = "3.3.2.release";
        w1.h = i;
        if (j != null) goto _L34; else goto _L33
_L33:
        obj1 = null;
_L90:
        w1.i = ((String) (obj1));
        if (!aq1.a(ar.g)) goto _L36; else goto _L35
_L35:
        if (networkinfo != null) goto _L38; else goto _L37
_L37:
        obj1 = null;
_L91:
        w1.j = ((String) (obj1));
_L36:
        if (!aq1.a(ar.h)) goto _L40; else goto _L39
_L39:
        if (!flag) goto _L42; else goto _L41
_L41:
        obj1 = telephonymanager.getDeviceId();
_L99:
        w1.k = ((String) (obj1));
_L40:
        if (aq1.a(ar.i))
        {
            w1.l = Build.MODEL;
        }
        if (aq1.a(ar.j))
        {
            w1.m = Build.DEVICE;
        }
        if (aq1.a(ar.k))
        {
            w1.n = SystemClock.uptimeMillis();
        }
        if (aq1.a(ar.l))
        {
            w1.o = as.b();
        }
        if (aq1.a(ar.l))
        {
            w1.p = as.a(true);
        }
        if (!aq1.a(ar.n)) goto _L44; else goto _L43
_L43:
        if (!flag) goto _L46; else goto _L45
_L45:
        obj1 = telephonymanager.getLine1Number();
_L100:
        w1.r = ((String) (obj1));
_L44:
        if (aq1.a(ar.o))
        {
            w1.s = as.a();
        }
        if (aq1.a(ar.p))
        {
            w1.t = Locale.getDefault().getCountry();
        }
        if (aq1.a(ar.q))
        {
            w1.u = Locale.getDefault().getLanguage();
        }
        if (!aq1.a(ar.r)) goto _L48; else goto _L47
_L47:
        if (p != null) goto _L50; else goto _L49
_L49:
        obj1 = null;
_L92:
        w1.v = ((Location) (obj1));
_L48:
        if (!aq1.a(ar.s)) goto _L52; else goto _L51
_L51:
        if (obj != null) goto _L54; else goto _L53
_L53:
        i1 = -1;
_L93:
        w1.w = i1;
_L52:
        if (!aq1.a(ar.t)) goto _L56; else goto _L55
_L55:
        if (obj2 != null) goto _L58; else goto _L57
_L57:
        obj = null;
_L94:
        w1.x = ((String) (obj));
_L56:
        if (aq1.a(ar.v))
        {
            w1.z = android.os.Build.VERSION.RELEASE;
        }
        if (aq1.a(ar.x))
        {
            w1.B = ab.b();
        }
        if (aq1.a(ar.y))
        {
            w1.C = Boolean.valueOf((new ServiceState()).getRoaming());
        }
        if (aq1.a(ar.z))
        {
            w1.D = a(telephonymanager);
        }
        if (!aq1.a(ar.R)) goto _L60; else goto _L59
_L59:
        if (!flag) goto _L62; else goto _L61
_L61:
        obj = telephonymanager.getSimSerialNumber();
_L101:
        w1.E = ((String) (obj));
_L60:
        if (android.os.Build.VERSION.SDK_INT >= 9)
        {
            w1.Y = Build.SERIAL;
        }
        if (aq1.a(ar.A))
        {
            w1.F = Boolean.valueOf(b.getPackageManager().hasSystemFeature("android.hardware.telephony"));
        }
        if (!aq1.a(ar.B)) goto _L64; else goto _L63
_L63:
        if (obj2 != null) goto _L66; else goto _L65
_L65:
        obj = null;
_L95:
        w1.G = ((String) (obj));
_L64:
        if (!aq1.a(ar.C)) goto _L68; else goto _L67
_L67:
        if (!flag) goto _L70; else goto _L69
_L69:
        obj = telephonymanager.getSubscriberId();
_L96:
        w1.H = ((String) (obj));
_L68:
        if (aq1.a(ar.D))
        {
            w1.I = System.currentTimeMillis();
        }
        if (aq1.a(ar.E))
        {
            w1.J = as.c();
        }
        if (aq1.a(ar.F))
        {
            w1.K = TimeZone.getDefault().getDisplayName();
        }
        if (!aq1.a(ar.K)) goto _L72; else goto _L71
_L71:
        if (!Build.BRAND.equalsIgnoreCase("generic") && !Build.PRODUCT.equals("sdk") && !Build.HARDWARE.equals("goldfish") && !Build.FINGERPRINT.startsWith("generic") && !Build.MANUFACTURER.equals("unknown") && !Build.PRODUCT.matches(".*_?sdk_?.*"))
        {
            flag = false;
        } else
        {
            flag = true;
        }
        w1.Q = Boolean.valueOf(flag);
_L72:
        if (aq1.a(ar.L))
        {
            w1.R = Boolean.valueOf(ac.a());
        }
        if (!aq1.a(ar.m)) goto _L74; else goto _L73
_L73:
        obj = new ArrayList();
        if (j == null) goto _L76; else goto _L75
_L75:
        obj1 = j.f();
        obj1 = ((List) (obj1)).iterator();
        do
        {
            if (!((Iterator) (obj1)).hasNext())
            {
                break;
            }
            obj2 = (String)((Iterator) (obj1)).next();
            if (as.a(b.getPackageManager(), (new Intent()).setComponent(ComponentName.unflattenFromString(((String) (obj2))))))
            {
                ((List) (obj)).add(obj2);
            }
        } while (true);
          goto _L76
        obj1;
        as.a(a, "knownApps error", null);
_L76:
        if (((List) (obj)).size() == 0)
        {
            obj = null;
        }
        w1.q = ((List) (obj));
_L74:
        if (aq1.a(ar.P))
        {
            w1.T = a(b);
        }
        if (aq1.a(ar.Q))
        {
            w1.U = b(b);
        }
        w1.ac = n;
        if (aq1.a(ar.T))
        {
            w1.Z = as.b(b);
        }
        if (aq1.a(ar.U))
        {
            w1.ab = as.e();
        }
        if (aq1.a(ar.V))
        {
            w1.aa = as.d();
        }
        if (aq1.a(ar.G))
        {
            w1.W = as.a(b, w1);
        }
        if (!aq1.a(ar.v))
        {
            w1.y = null;
        }
          goto _L77
_L6:
        w1.A = "none";
        obj1 = null;
        obj = null;
          goto _L78
_L7:
        w1.A = "gsm";
        if (i1 == 0) goto _L80; else goto _L79
_L79:
        obj = (GsmCellLocation)as.a(telephonymanager.getCellLocation(), android/telephony/gsm/GsmCellLocation);
          goto _L81
_L8:
        w1.A = "cdma";
        if (i1 == 0) goto _L83; else goto _L82
_L82:
        obj = (CdmaCellLocation)as.a(telephonymanager.getCellLocation(), android/telephony/cdma/CdmaCellLocation);
          goto _L84
_L12:
        w1.O = s.a();
          goto _L10
        obj;
        throw obj;
_L16:
        i1 = ((CdmaCellLocation) (obj1)).getBaseStationId();
          goto _L85
_L20:
        i1 = ((CdmaCellLocation) (obj1)).getNetworkId();
          goto _L86
_L24:
        i1 = ((CdmaCellLocation) (obj1)).getSystemId();
          goto _L87
_L28:
        obj1 = ((WifiInfo) (obj2)).getBSSID();
          goto _L88
_L32:
        i1 = ((GsmCellLocation) (obj)).getCid();
          goto _L89
_L34:
        obj1 = j.b();
          goto _L90
_L38:
        obj1 = networkinfo.getTypeName();
          goto _L91
_L50:
        obj1 = new Location(p);
          goto _L92
        obj;
        as.a(a, "Unknown error in RiskComponent", ((Throwable) (obj)));
          goto _L77
_L54:
        i1 = ((GsmCellLocation) (obj)).getLac();
          goto _L93
_L58:
        obj = ((WifiInfo) (obj2)).getMacAddress();
          goto _L94
_L66:
        obj = ((WifiInfo) (obj2)).getSSID();
          goto _L95
_L70:
        obj = null;
          goto _L96
_L77:
        return w1;
_L2:
        obj2 = null;
          goto _L97
_L4:
        networkinfo = null;
          goto _L98
_L81:
        obj1 = null;
          goto _L78
_L80:
        obj = null;
          goto _L81
_L84:
        Object obj3 = null;
        obj1 = obj;
        obj = obj3;
          goto _L78
_L83:
        obj = null;
          goto _L84
_L42:
        obj1 = null;
          goto _L99
_L46:
        obj1 = null;
          goto _L100
_L62:
        obj = null;
          goto _L101
    }

    public final String a(Context context, String s1, a a1, String s2, String s3, boolean flag, String s4, 
            String s5)
    {
        b = context;
        c = s1;
        v = flag;
        boolean flag1;
        if (a1 == null)
        {
            s = a.a;
        } else
        {
            s = a1;
        }
        t = s2;
        k = null;
        l = null;
        w = s5;
        n = new HashMap();
        g = 0;
        f = 0;
        if (s4 == null || s4.trim().length() == 0)
        {
            u = h();
            flag1 = true;
        } else
        {
            as.a(3, "PRD", "Using custom pairing id");
            u = s4.trim();
            if (!b(u))
            {
                u = h();
                flag1 = false;
            } else
            {
                flag1 = true;
            }
        }
        context = s3;
        if (s3 == null)
        {
            context = "https://www.paypalobjects.com/webstatic/risk/dyson_config_android_v3.json";
        }
        i = context;
        e();
        if (r != null)
        {
            break MISSING_BLOCK_LABEL_186;
        }
        r = new aa(this);
        context = (LocationManager)b.getSystemService("location");
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_186;
        }
        onLocationChanged(as.a(context));
        if (context.isProviderEnabled("network"))
        {
            context.requestLocationUpdates("network", 0x36ee80L, 10F, this);
        }
        j();
_L2:
        i();
        if (!flag1)
        {
            as.a(6, "PRD", "Provided pairingID is invalid. Please provide a 10-32 char length string if needed.");
        }
        a(new t(b));
        return u;
        context;
        as.a(a, null, context);
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final String a(String s1)
    {
        boolean flag;
        if (s1 != null && u != null && s1.equals(u))
        {
            return s1;
        }
        flag = true;
        if (s1 != null && s1.trim().length() != 0) goto _L2; else goto _L1
_L1:
        s1 = h();
_L4:
        u = s1;
        d();
        i();
        if (!flag)
        {
            as.a(6, "PRD", "Provided pairingID is invalid. Please provide a 10-32 char length string if needed.");
        }
        return s1;
_L2:
        String s2 = s1.trim();
        as.a(3, "PRD", "Using custom pairing id");
        s1 = s2;
        if (!b(s2))
        {
            s1 = h();
            flag = false;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void a(Message message)
    {
        message.what;
        JVM INSTR lookupswitch 9: default 549
    //                   0: 125
    //                   1: 506
    //                   2: 197
    //                   10: 88
    //                   11: 496
    //                   12: 179
    //                   20: 152
    //                   21: 516
    //                   22: 469;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10
_L5:
        as.a(a, (new StringBuilder("Load Configuration URL: ")).append(message.obj).toString());
        return;
_L2:
        try
        {
            as.a(a, (new StringBuilder("Dyson Async URL: ")).append(message.obj).toString());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Message message)
        {
            as.a(a, null, message);
            return;
        }
_L8:
        as.a(a, (new StringBuilder("Beacon URL: ")).append(message.obj).toString());
        return;
_L7:
        message = (t)message.obj;
        if (message == null) goto _L1; else goto _L11
_L11:
        a(((t) (message)));
        return;
_L4:
        message = (String)message.obj;
        as.a(a, (new StringBuilder("LogRiskMetadataRequest Server returned: ")).append(message).toString());
        message = Uri.parse((new StringBuilder("?")).append(message).toString());
        Iterator iterator;
        java.util.Map.Entry entry;
        Iterator iterator1;
        java.util.Map.Entry entry1;
        boolean flag;
        try
        {
            message = message.getQueryParameter("responseEnvelope.ack");
        }
        // Misplaced declaration of an exception variable
        catch (Message message)
        {
            message = null;
        }
        if (!"Success".equals(message)) goto _L1; else goto _L12
_L12:
        as.a(a, "LogRiskMetadataRequest Success");
        message = new HashMap(n);
        iterator = n.entrySet().iterator();
_L23:
        if (!iterator.hasNext()) goto _L14; else goto _L13
_L13:
        entry = (java.util.Map.Entry)iterator.next();
        flag = false;
        iterator1 = o.entrySet().iterator();
_L18:
        if (!iterator1.hasNext()) goto _L16; else goto _L15
_L15:
        entry1 = (java.util.Map.Entry)iterator1.next();
        if (!((String)entry1.getKey()).equals(entry.getKey())) goto _L18; else goto _L17
_L17:
        if (entry1.getValue() != null) goto _L20; else goto _L19
_L19:
        if (entry.getValue() != null) goto _L18; else goto _L21
_L20:
        if (entry1.getValue().equals(entry.getValue())) goto _L21; else goto _L18
_L16:
        if (!flag) goto _L23; else goto _L22
_L22:
        message.remove(entry.getKey());
          goto _L23
_L14:
        n = message;
        k = l;
        l = null;
        return;
_L10:
        as.a(a, (new StringBuilder("Beacon returned: ")).append(message.obj).toString());
        return;
_L6:
        as.a(a, "LoadConfigurationRequest failed.");
        return;
_L3:
        as.a(a, "LogRiskMetadataRequest failed.");
        return;
_L9:
        as.a(a, (new StringBuilder("BeaconRequest failed ")).append(((Exception)message.obj).getMessage()).toString());
        return;
_L1:
        return;
_L21:
        flag = true;
          goto _L18
    }

    public final void b()
    {
        (new Timer()).schedule(new z(this), 0L);
    }

    public final void d()
    {
        ab.a();
        k = k();
        a(k, null);
    }

    public final void e()
    {
        as.a(a, "Host activity detected");
        h = System.currentTimeMillis();
    }

    public final String f()
    {
        String s1 = h();
        u = s1;
        d();
        i();
        return s1;
    }

    public void onLocationChanged(Location location)
    {
        if (location != null)
        {
            p = new Location(location);
            as.a(a, (new StringBuilder("Location Update: ")).append(location.toString()).toString());
        }
    }

    public void onProviderDisabled(String s1)
    {
    }

    public void onProviderEnabled(String s1)
    {
    }

    public void onStatusChanged(String s1, int i1, Bundle bundle)
    {
    }

}
