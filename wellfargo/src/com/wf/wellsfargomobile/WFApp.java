// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.support.multidex.MultiDexApplication;
import android.support.v7.app.ActionBarActivity;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.SparseArray;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.squareup.leakcanary.LeakCanary;
import com.visa.cbp.sdk.facade.VisaPaymentSDK;
import com.visa.cbp.sdk.facade.VisaPaymentSDKImpl;
import com.wf.wellsfargomobile.a.a;
import com.wf.wellsfargomobile.d.f;
import com.wf.wellsfargomobile.hcewallet.d.i;
import com.wf.wellsfargomobile.hcewallet.d.k;
import com.wf.wellsfargomobile.mrdc.ImageCaptureType;
import com.wf.wellsfargomobile.p2pimport.P2PContact;
import com.wf.wellsfargomobile.util.d;
import com.wf.wellsfargomobile.util.m;
import com.wf.wellsfargomobile.util.n;
import com.wf.wellsfargomobile.util.o;
import com.wf.wellsfargomobile.util.t;
import java.net.CookieHandler;
import java.net.CookiePolicy;
import java.util.List;
import java.util.Locale;

// Referenced classes of package com.wf.wellsfargomobile:
//            az, ay, ax

public class WFApp extends MultiDexApplication
{

    private static t A;
    private static t B;
    private static String C = null;
    private static boolean D = true;
    private static CookieManager E;
    private static CookieSyncManager F;
    private static d G = null;
    private static String H;
    private static boolean I = false;
    private static String J;
    private static boolean K = false;
    private static final SparseArray L = new SparseArray(5);
    private static long M;
    private static boolean N = false;
    private static boolean O = false;
    private static P2PContact P;
    private static Locale Q;
    private static VisaPaymentSDK R;
    private static boolean S;
    public static String a = "DeviceOrientation";
    public static String b = "landscape";
    public static String c = "portrait";
    public static final CharSequence d = "BMW";
    public static final CharSequence e = "/wps2/myretirement";
    static boolean f = false;
    public static Context g;
    public static String h = "";
    public static long i = 0L;
    public static long j = 0L;
    public static int k;
    public static boolean l = false;
    public static boolean m = false;
    public static boolean n = false;
    public static boolean o = false;
    public static boolean p = false;
    public static boolean q = true;
    private static byte r[] = null;
    private static String s = null;
    private static byte t[] = null;
    private static String u = null;
    private static Bitmap v = null;
    private static Bitmap w = null;
    private static byte x[] = null;
    private static byte y[] = null;
    private static ImageCaptureType z;

    public WFApp()
    {
    }

    public static void A()
    {
        B();
        C();
        D();
    }

    public static void B()
    {
        E.removeExpiredCookie();
    }

    public static void C()
    {
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            E.removeSessionCookies(null);
            return;
        } else
        {
            E.removeSessionCookie();
            return;
        }
    }

    public static void D()
    {
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            E.flush();
            return;
        } else
        {
            F.sync();
            return;
        }
    }

    public static void E()
    {
        Object obj = g.getSharedPreferences("WF_PREFERENCES", 0);
        int i1 = ((SharedPreferences) (obj)).getInt("lastBackgroundImageIndex", 1);
        SparseArray sparsearray = (SparseArray)L.get(i1);
        if (sparsearray != null)
        {
            if ((Drawable)sparsearray.get(2) == null);
            if ((Drawable)sparsearray.get(1) == null);
        }
        L.delete(i1);
        System.gc();
        int j1 = i1 + 1;
        i1 = j1;
        if (j1 > g.getResources().getInteger(0x7f0c0005))
        {
            i1 = 1;
        }
        obj = ((SharedPreferences) (obj)).edit();
        ((android.content.SharedPreferences.Editor) (obj)).putInt("lastBackgroundImageIndex", i1);
        ((android.content.SharedPreferences.Editor) (obj)).apply();
    }

    public static boolean F()
    {
        return H() != null;
    }

    public static boolean G()
    {
        return j(M());
    }

    public static String H()
    {
        return (String)com.wf.wellsfargomobile.util.o.a("preferenceCollector");
    }

    public static void I()
    {
        com.wf.wellsfargomobile.util.o.a("preferenceCollector", null);
    }

    public static void J()
    {
        String s1 = (String)a((new StringBuilder()).append(com.wf.wellsfargomobile.a.a.c()).append("/auth/login/do?channel=mobile").toString(), "DCT_SUM");
        String s2 = (String)a((new StringBuilder()).append(com.wf.wellsfargomobile.a.a.c()).append("/auth/login/do?channel=mobile").toString(), "DCT_ESU");
        n n1 = new n(g);
        n1.a(s1, s2);
        n1.d();
    }

    public static void K()
    {
        android.content.SharedPreferences.Editor editor = g.getSharedPreferences("WF_PREFERENCES", 0).edit();
        editor.putString("SAVEDANDMASKEDUSERID", N());
        editor.apply();
    }

    public static n L()
    {
        n n1 = new n(g);
        n1.b();
        return n1;
    }

    public static String M()
    {
        return g.getSharedPreferences("WF_PREFERENCES", 0).getString("SAVEDANDMASKEDUSERID", null);
    }

    public static String N()
    {
        return (String)k("SAVEDANDMASKEDUSERID");
    }

    public static void O()
    {
        android.content.SharedPreferences.Editor editor = g.getSharedPreferences("WF_PREFERENCES", 0).edit();
        editor.putString("SAVEDANDMASKEDUSERID", null);
        editor.apply();
        com.wf.wellsfargomobile.util.o.a("saveUsername", Boolean.valueOf(false));
    }

    public static String P()
    {
        if (G())
        {
            return M();
        } else
        {
            return "";
        }
    }

    public static String Q()
    {
        n n1 = L();
        if (!n1.a())
        {
            return n1.e();
        } else
        {
            return "";
        }
    }

    public static d R()
    {
        if (G == null)
        {
            G = com.wf.wellsfargomobile.util.d.a(g.getSharedPreferences("WF_PREFERENCES", 0).getString("customerType", d.a.toString()));
        }
        return G;
    }

    public static Drawable S()
    {
        int i1 = g.getResources().getIdentifier("signon_background04", "drawable", g.getPackageName());
        if (i1 != 0)
        {
            return g.getResources().getDrawable(i1);
        } else
        {
            Log.w("WFApp", "unexpectedly no sign off background image was found");
            return g.getResources().getDrawable(0x7f020100);
        }
    }

    public static boolean T()
    {
        boolean flag = true;
        if (G())
        {
            f(true);
            K();
            flag = G();
        }
        return flag;
    }

    public static boolean U()
    {
        boolean flag1 = false;
        Object obj = g.getSharedPreferences("native_bridge_prefs", 0);
        String s1 = ((SharedPreferences) (obj)).getString("prefToken", "");
        obj = ((SharedPreferences) (obj)).getString("pactToken", "");
        boolean flag = flag1;
        if (!s1.trim().isEmpty())
        {
            flag = flag1;
            if (!((String) (obj)).trim().isEmpty())
            {
                flag = flag1;
                if (s1.trim().startsWith("1"))
                {
                    flag = true;
                }
            }
        }
        return flag;
    }

    public static void V()
    {
        Object obj = g.getApplicationContext().getSharedPreferences("native_bridge_prefs", 0);
        String s1 = ((SharedPreferences) (obj)).getString("prefToken", "");
        if (!s1.trim().isEmpty() && s1.trim().startsWith("1"))
        {
            s1 = s1.replaceFirst("1", "0");
            obj = ((SharedPreferences) (obj)).edit();
            ((android.content.SharedPreferences.Editor) (obj)).putString("prefToken", s1);
            ((android.content.SharedPreferences.Editor) (obj)).apply();
        }
    }

    public static P2PContact W()
    {
        return P;
    }

    public static String X()
    {
        return (new StringBuilder()).append("4.6.108 ").append(com.wf.wellsfargomobile.a.a.g()).append(" ").append(com.wf.wellsfargomobile.a.a.a(g)).toString().trim();
    }

    public static int Y()
    {
        return 0x7054c;
    }

    public static void Z()
    {
        a(Locale.US);
        i(Locale.US.getLanguage());
        ak();
    }

    public static int a(int i1)
    {
        DisplayMetrics displaymetrics = g.getResources().getDisplayMetrics();
        float f1 = i1;
        return Math.round((displaymetrics.xdpi / 160F) * f1);
    }

    static CookieManager a(CookieManager cookiemanager)
    {
        E = cookiemanager;
        return cookiemanager;
    }

    static CookieSyncManager a(CookieSyncManager cookiesyncmanager)
    {
        F = cookiesyncmanager;
        return cookiesyncmanager;
    }

    public static VisaPaymentSDK a()
    {
        return R;
    }

    private static Object a(String s1, String s2)
    {
        Object obj;
        Object obj1;
        Object obj2;
        obj1 = null;
        obj2 = null;
        obj = s1;
        if (s1 == null)
        {
            obj = com.wf.wellsfargomobile.a.a.a();
        }
        s1 = z();
        if (s1 != null) goto _L2; else goto _L1
_L1:
        obj = obj2;
_L4:
        return obj;
_L2:
        int i1;
        int j1;
        s1 = s1.getCookie(((String) (obj)));
        obj = obj2;
        if (s1 == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = s1.split(";");
        j1 = obj.length;
        i1 = 0;
_L5:
label0:
        {
            s1 = obj1;
            if (i1 < j1)
            {
                s1 = obj[i1].split("=");
                if (!s2.equals(s1[0].trim()))
                {
                    break label0;
                }
                s1 = s1[1];
            }
            obj = s1;
            if (s1 != null)
            {
                obj = s1;
                if (s1.toString().length() == 0)
                {
                    return s1;
                }
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
        i1++;
          goto _L5
        if (true) goto _L4; else goto _L6
_L6:
    }

    public static void a(long l1)
    {
        M = l1;
    }

    public static void a(Bitmap bitmap)
    {
        v = bitmap;
    }

    public static void a(ActionBarActivity actionbaractivity, ImageView imageview)
    {
        a(actionbaractivity, imageview, null, null, null, null, null);
    }

    public static void a(ActionBarActivity actionbaractivity, ImageView imageview, ImageView imageview1, ImageView imageview2, ImageView imageview3)
    {
        a(actionbaractivity, imageview, imageview1, imageview2, null, null, null);
    }

    public static void a(ActionBarActivity actionbaractivity, ImageView imageview, ImageView imageview1, ImageView imageview2, ImageView imageview3, LinearLayout linearlayout, Button button)
    {
        actionbaractivity = R();
        if (imageview == null) goto _L2; else goto _L1
_L1:
        com.wf.wellsfargomobile.az.a[actionbaractivity.ordinal()];
        JVM INSTR tableswitch 1 1: default 36
    //                   1 80;
           goto _L3 _L4
_L3:
        if (!d())
        {
            break MISSING_BLOCK_LABEL_136;
        }
        if (imageview != null)
        {
            imageview.setImageResource(0x7f020100);
        }
        if (linearlayout != null)
        {
            linearlayout.setBackgroundResource(0x7f020161);
        }
        if (button != null)
        {
            button.setBackgroundResource(0x7f020079);
        }
_L2:
        return;
_L4:
        if (!d())
        {
            continue; /* Loop/switch isn't completed */
        }
        if (imageview != null)
        {
            imageview.setImageResource(0x7f020101);
        }
        if (linearlayout != null)
        {
            linearlayout.setBackgroundResource(0x7f020162);
        }
        if (button == null) goto _L2; else goto _L5
_L5:
        button.setBackgroundResource(0x7f020084);
        return;
        if (imageview == null) goto _L2; else goto _L6
_L6:
        imageview.setImageResource(0x7f02013c);
        return;
        imageview.setImageResource(0x7f020139);
        return;
    }

    public static void a(ImageView imageview)
    {
label0:
        {
label1:
            {
label2:
                {
label3:
                    {
label4:
                        {
                            if (imageview != null)
                            {
                                if (d())
                                {
                                    break label0;
                                }
                                switch (com.wf.wellsfargomobile.az.a[R().ordinal()])
                                {
                                default:
                                    imageview.setImageResource(0x7f020163);
                                    break;

                                case 1: // '\001'
                                    break label2;

                                case 2: // '\002'
                                    break label4;

                                case 3: // '\003'
                                    break label1;

                                case 4: // '\004'
                                    break label3;
                                }
                            }
                            return;
                        }
                        imageview.setImageResource(0x7f020163);
                        return;
                    }
                    imageview.setImageResource(0x7f020164);
                    return;
                }
                imageview.setImageResource(0x7f020164);
                return;
            }
            imageview.setImageResource(0x7f020163);
            return;
        }
        imageview.setImageResource(0x7f02010e);
    }

    public static void a(ImageCaptureType imagecapturetype)
    {
        z = imagecapturetype;
    }

    public static void a(P2PContact p2pcontact)
    {
        P = p2pcontact;
    }

    public static void a(d d1)
    {
        android.content.SharedPreferences.Editor editor = g.getSharedPreferences("WF_PREFERENCES", 0).edit();
        if (d1 != null)
        {
            editor.putString("customerType", d1.toString());
        } else
        {
            editor.remove("customerType");
        }
        editor.apply();
        G = d1;
    }

    public static void a(t t1)
    {
        A = t1;
    }

    public static void a(String s1)
    {
        VisaPaymentSDKImpl.initialize(g);
        R = VisaPaymentSDKImpl.getInstance();
        R.setMaxTvlRecords(50);
    }

    public static void a(Locale locale)
    {
        Q = locale;
    }

    public static void a(boolean flag)
    {
        S = flag;
    }

    public static void a(byte abyte0[])
    {
        r = abyte0;
    }

    public static boolean a(Context context)
    {
        if (android.os.Build.VERSION.SDK_INT < 9)
        {
            return false;
        }
        int i1;
        try
        {
            Intent intent = new Intent("android.intent.action.MAIN");
            intent.addCategory("android.intent.category.LAUNCHER");
            intent.setClassName("com.android.providers.downloads.ui", "com.android.providers.downloads.ui.DownloadList");
            i1 = context.getPackageManager().queryIntentActivities(intent, 0x10000).size();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return false;
        }
label0:
        {
            if (i1 > 0)
            {
                return true;
            }
            break label0;
        }
    }

    public static boolean aa()
    {
        return f;
    }

    public static Locale ab()
    {
        return Q;
    }

    public static void ac()
    {
        Configuration configuration = new Configuration();
        configuration.locale = ab();
        g.getResources().updateConfiguration(configuration, g.getResources().getDisplayMetrics());
        ak();
    }

    public static String ad()
    {
        return g.getSharedPreferences("WF_PREFERENCES", 0).getString("selectedLanguage", null);
    }

    public static boolean ae()
    {
        return false;
    }

    public static String af()
    {
        if (d())
        {
            return "Android";
        } else
        {
            return "Android";
        }
    }

    public static String ag()
    {
        switch (com.wf.wellsfargomobile.az.a[R().ordinal()])
        {
        case 2: // '\002'
        case 3: // '\003'
        default:
            return g.getString(0x7f080155);

        case 1: // '\001'
            return g.getString(0x7f080156);

        case 4: // '\004'
            return g.getString(0x7f080157);
        }
    }

    public static boolean ah()
    {
        return !com.wf.wellsfargomobile.hcewallet.d.i.isDeviceRooted() && com.wf.wellsfargomobile.hcewallet.d.i.isHCESupported(g) && !d() && al();
    }

    static CookieSyncManager ai()
    {
        return F;
    }

    private static void aj()
    {
        f = true;
    }

    private static void ak()
    {
        f = false;
    }

    private static boolean al()
    {
        boolean flag = false;
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            flag = com.wf.wellsfargomobile.hcewallet.d.i.isLolliPopCapableDevice();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 19)
        {
            return com.wf.wellsfargomobile.hcewallet.d.i.isKitKatCapableDevice();
        }
        return flag;
    }

    public static Drawable b(int i1)
    {
        SparseArray sparsearray = (SparseArray)L.get(i1);
        if (sparsearray == null)
        {
            sparsearray = new SparseArray(3);
            L.put(i1, sparsearray);
        }
        int j1 = g.getResources().getConfiguration().orientation;
        Drawable drawable1 = (Drawable)sparsearray.get(j1);
        Drawable drawable = drawable1;
        if (drawable1 == null)
        {
            int k1 = g.getResources().getIdentifier((new StringBuilder()).append("signon_background0").append(i1).toString(), "drawable", g.getPackageName());
            if (k1 != 0)
            {
                drawable = g.getResources().getDrawable(k1);
            } else
            {
                Log.w("WFApp", (new StringBuilder()).append("unexpectedly no background image was found, index was: ").append(i1).toString());
                drawable = g.getResources().getDrawable(0x7f020100);
            }
            sparsearray.put(j1, drawable);
        }
        return drawable;
    }

    public static void b()
    {
        if (ah())
        {
            a("WFApp");
        }
    }

    public static void b(Bitmap bitmap)
    {
        w = bitmap;
    }

    public static void b(t t1)
    {
        B = t1;
    }

    public static void b(String s1)
    {
        s = s1;
    }

    public static void b(boolean flag)
    {
        O = true;
        D = flag;
    }

    public static void b(byte abyte0[])
    {
        t = abyte0;
    }

    public static void c(String s1)
    {
        u = s1;
    }

    public static void c(boolean flag)
    {
        I = flag;
    }

    public static void c(byte abyte0[])
    {
        x = abyte0;
    }

    public static boolean c()
    {
        return R != null;
    }

    public static void d(String s1)
    {
        C = s1;
    }

    public static void d(boolean flag)
    {
        K = flag;
    }

    public static void d(byte abyte0[])
    {
        y = abyte0;
    }

    public static boolean d()
    {
        return "tablet".equals(g.getString(0x7f080127));
    }

    public static String e()
    {
        return g.getString(0x7f080127);
    }

    public static void e(boolean flag)
    {
        N = flag;
    }

    public static boolean e(String s1)
    {
        while (s1 == null || o() == null || !s1.equals(o())) 
        {
            return false;
        }
        return true;
    }

    public static void f()
    {
        (new ay()).execute(new Void[0]);
        g();
        h();
    }

    public static void f(String s1)
    {
        H = s1;
    }

    public static void f(boolean flag)
    {
        B();
        if (flag)
        {
            D();
        }
    }

    public static void g()
    {
        com.wf.wellsfargomobile.util.m.b(r);
        com.wf.wellsfargomobile.util.m.a(v);
        com.wf.wellsfargomobile.util.m.b(x);
        z = ImageCaptureType.NONE;
        I = false;
        s = null;
    }

    public static void g(String s1)
    {
        J = s1;
    }

    public static void h()
    {
        com.wf.wellsfargomobile.util.m.b(t);
        com.wf.wellsfargomobile.util.m.a(w);
        com.wf.wellsfargomobile.util.m.b(y);
        K = false;
        u = null;
    }

    public static boolean h(String s1)
    {
        if (s1 != null && s1.length() > 0)
        {
            com.wf.wellsfargomobile.util.o.a("preferenceCollector", s1);
            return true;
        } else
        {
            return false;
        }
    }

    public static void i()
    {
        f();
        f(((String) (null)));
        g(null);
        A = t.c;
    }

    public static void i(String s1)
    {
        l("Locale before resetting");
        Object obj;
        Configuration configuration;
        if (s1 != null && !s1.equalsIgnoreCase("null"))
        {
            obj = new Locale(s1);
            Locale.setDefault(((Locale) (obj)));
        } else
        {
            obj = ab();
        }
        configuration = new Configuration();
        configuration.locale = ((Locale) (obj));
        g.getResources().updateConfiguration(configuration, g.getResources().getDisplayMetrics());
        obj = g.getSharedPreferences("WF_PREFERENCES", 0).edit();
        ((android.content.SharedPreferences.Editor) (obj)).putString("selectedLanguage", s1);
        ((android.content.SharedPreferences.Editor) (obj)).apply();
        aj();
        l("Locale after resetting");
    }

    private static boolean j(String s1)
    {
        return s1 != null && s1.length() > 5;
    }

    public static byte[] j()
    {
        return r;
    }

    private static Object k(String s1)
    {
        return a(((String) (null)), s1);
    }

    public static String k()
    {
        return s;
    }

    public static String l()
    {
        return u;
    }

    private static void l(String s1)
    {
    }

    public static byte[] m()
    {
        return t;
    }

    public static t n()
    {
        return B;
    }

    public static String o()
    {
        return C;
    }

    public static boolean p()
    {
        return S;
    }

    public static boolean q()
    {
        if (O || g == null) goto _L2; else goto _L1
_L1:
        if (com.google.android.gms.common.d.a(g) != 0) goto _L4; else goto _L3
_L3:
        D = true;
_L6:
        O = true;
_L2:
        return D;
_L4:
        try
        {
            D = false;
        }
        catch (NoClassDefFoundError noclassdeffounderror)
        {
            D = false;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public static String r()
    {
        return H;
    }

    public static String s()
    {
        return J;
    }

    public static Bitmap t()
    {
        return v;
    }

    public static Bitmap u()
    {
        return w;
    }

    public static byte[] v()
    {
        return x;
    }

    public static byte[] w()
    {
        return y;
    }

    public static ImageCaptureType x()
    {
        return z;
    }

    public static long y()
    {
        return M;
    }

    public static CookieManager z()
    {
        return E;
    }

    protected void attachBaseContext(Context context)
    {
        super.attachBaseContext(context);
        android.support.multidex.a.a(this);
    }

    public void onCreate()
    {
        super.onCreate();
        LeakCanary.install(this);
        g = getApplicationContext();
        (new ax(this)).execute(new Void[0]);
        CookieHandler.setDefault(new f(null, CookiePolicy.ACCEPT_ORIGINAL_SERVER));
        Z();
        i();
        com.wf.wellsfargomobile.hcewallet.d.k.enableDisableAPDUService(getApplicationContext());
    }

    public void onLowMemory()
    {
        super.onLowMemory();
        Log.w("WFApp", "onLowMemory() called");
    }

    public void onTrimMemory(int i1)
    {
        super.onTrimMemory(i1);
        Log.w("WFApp", (new StringBuilder()).append("onTrimMemory(").append(i1).append(") called").toString());
    }

    static 
    {
        z = ImageCaptureType.NONE;
        A = t.c;
    }
}
