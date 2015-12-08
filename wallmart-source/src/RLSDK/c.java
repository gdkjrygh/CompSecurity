// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package RLSDK;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.os.AsyncTask;
import android.os.Build;
import android.util.Log;
import com.ebay.redlasersdk.BarcodeResult;
import com.ebay.redlasersdk.recognizers.BarcodeResultInternal;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URLEncoder;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.Signature;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

// Referenced classes of package RLSDK:
//            p, n, b, o, 
//            a

public final class RLSDK.c
{
    private static final class a extends AsyncTask
    {

        private static transient String a()
        {
            Object obj = new StringBuilder();
            RLSDK.a a1;
            try
            {
                ((StringBuilder) (obj)).append("http://api.redlaser.com/getstatus");
                ((StringBuilder) (obj)).append((new StringBuilder("?sdkver=")).append(o.a).toString());
                ((StringBuilder) (obj)).append((new StringBuilder("&udid=")).append(p.a()).toString());
                ((StringBuilder) (obj)).append((new StringBuilder("&key=")).append(URLEncoder.encode(RLSDK.c.e, "UTF-8")).toString());
                ((StringBuilder) (obj)).append("&platform=android");
                ((StringBuilder) (obj)).append((new StringBuilder("&os=")).append(URLEncoder.encode(android.os.Build.VERSION.RELEASE, "UTF-8")).toString());
                ((StringBuilder) (obj)).append((new StringBuilder("&dv=")).append(URLEncoder.encode(Build.MODEL, "UTF-8")).toString());
                ((StringBuilder) (obj)).append((new StringBuilder("&locale=")).append(URLEncoder.encode(Locale.getDefault().toString(), "UTF-8")).toString());
            }
            catch (UnsupportedEncodingException unsupportedencodingexception)
            {
                Log.e("StatusManager.LaunchPingTask", "Logic error sanitizing launch ping URL parameters.", unsupportedencodingexception);
                return "";
            }
            try
            {
                if (RLSDK.c.d != null)
                {
                    ((StringBuilder) (obj)).append((new StringBuilder("&appver=")).append(URLEncoder.encode(RLSDK.c.d, "UTF-8")).toString());
                }
            }
            catch (Exception exception) { }
            obj = ((StringBuilder) (obj)).toString();
            a1 = new RLSDK.a(RLSDK.c.b());
            try
            {
                obj = a1.a(((String) (obj)));
            }
            catch (MalformedURLException malformedurlexception)
            {
                Log.e("StatusManager.LaunchPingTask", "Logic error. Bad launch ping URL.", malformedurlexception);
                return "";
            }
            catch (IOException ioexception)
            {
                Log.e("StatusManager.LaunchPingTask", "Logic error. Bad URL cache.", ioexception);
                return "";
            }
            return RLSDK.a.a(((java.io.InputStream) (obj)));
        }

        protected final Object doInBackground(Object aobj[])
        {
            return a();
        }

        protected final void onPostExecute(Object obj)
        {
label0:
            {
                String s = (String)obj;
                if (s != null)
                {
                    obj = RLSDK.c.b.edit();
                    String as[] = s.split(",");
                    int l = as.length;
                    int k = 0;
                    while (k < l) 
                    {
                        String as1[] = as[k].split("=");
                        if (as1.length == 2)
                        {
                            String s1 = as1[0];
                            String s2 = as1[1];
                            if (s1.equalsIgnoreCase("disableCapture"))
                            {
                                ((android.content.SharedPreferences.Editor) (obj)).putString("disableCapture", s2);
                            } else
                            if (s1.equalsIgnoreCase("disableCaptureMessage"))
                            {
                                ((android.content.SharedPreferences.Editor) (obj)).putString("disableCaptureMessage", s2);
                            }
                        }
                        k++;
                    }
                    ((android.content.SharedPreferences.Editor) (obj)).commit();
                }
                if (RLSDK.c.a.compareTo(c.e) != 0)
                {
                    if (!RLSDK.c.b.getString("disableCapture", "NO").equalsIgnoreCase("YES"))
                    {
                        break label0;
                    }
                    RLSDK.c.a = c.c;
                }
                return;
            }
            if (RLSDK.c.e == "psdk")
            {
                RLSDK.c.a = c.a;
                return;
            } else
            {
                RLSDK.c.a = c.b;
                return;
            }
        }

        private a()
        {
        }

        a(byte byte0)
        {
            this();
        }
    }

    private static final class b extends AsyncTask
    {

        private static transient String a(BarcodeResult abarcoderesult[])
        {
            Object obj;
            StringBuilder stringbuilder;
            String s;
            BarcodeResult barcoderesult = abarcoderesult[0];
            stringbuilder = new StringBuilder();
            obj = barcoderesult.barcodeString;
            s = barcoderesult.getBarcodeType();
            if (barcoderesult.barcodeType != 16)
            {
                abarcoderesult = ((BarcodeResult []) (obj));
                if (barcoderesult.barcodeType != 16384)
                {
                    break MISSING_BLOCK_LABEL_123;
                }
            }
            byte abyte0[];
            int l;
            abarcoderesult = new StringBuilder();
            abyte0 = MessageDigest.getInstance("SHA-1").digest(((String) (obj)).getBytes("UTF-8"));
            l = abyte0.length;
            int k = 0;
_L2:
            if (k >= l)
            {
                break; /* Loop/switch isn't completed */
            }
            abarcoderesult.append(String.format("%02X", new Object[] {
                Byte.valueOf(abyte0[k])
            }));
            k++;
            if (true) goto _L2; else goto _L1
_L1:
            try
            {
                abarcoderesult = abarcoderesult.toString();
            }
            // Misplaced declaration of an exception variable
            catch (BarcodeResult abarcoderesult[])
            {
                abarcoderesult.printStackTrace();
                abarcoderesult = "**ErrorGeneratingHash**";
            }
            // Misplaced declaration of an exception variable
            catch (BarcodeResult abarcoderesult[])
            {
                abarcoderesult.printStackTrace();
                abarcoderesult = "**ErrorGeneratingHash**";
            }
            try
            {
                stringbuilder.append("http://api.redlaser.com/logscan");
                stringbuilder.append((new StringBuilder("?udid=")).append(p.a()).toString());
                stringbuilder.append((new StringBuilder("&key=")).append(URLEncoder.encode(RLSDK.c.e, "UTF-8")).toString());
                stringbuilder.append("&platform=android");
                stringbuilder.append((new StringBuilder("&barcode=")).append(URLEncoder.encode(abarcoderesult, "UTF-8")).toString());
                stringbuilder.append((new StringBuilder("&btype=")).append(URLEncoder.encode(s, "UTF-8")).toString());
                stringbuilder.append((new StringBuilder("&locale=")).append(URLEncoder.encode(Locale.getDefault().toString(), "UTF-8")).toString());
            }
            // Misplaced declaration of an exception variable
            catch (BarcodeResult abarcoderesult[])
            {
                Log.e("StatusManager.LogScanTask", "Logic error sanitizing scan logging URL parameters.", abarcoderesult);
                return "";
            }
            abarcoderesult = stringbuilder.toString();
            abyte0 = new RLSDK.a(RLSDK.c.b());
            try
            {
                abarcoderesult = abyte0.a(abarcoderesult);
            }
            // Misplaced declaration of an exception variable
            catch (BarcodeResult abarcoderesult[])
            {
                Log.e("StatusManager.LogScanTask", "Logic error. Bad scan logging URL.", abarcoderesult);
                return "";
            }
            // Misplaced declaration of an exception variable
            catch (BarcodeResult abarcoderesult[])
            {
                Log.e("StatusManager.LogScanTask", "Logic error. Bad URL cache.", abarcoderesult);
                return "";
            }
            return RLSDK.a.a(abarcoderesult);
        }

        protected final Object doInBackground(Object aobj[])
        {
            return a((BarcodeResult[])aobj);
        }

        protected final void onPostExecute(Object obj)
        {
            obj = (String)obj;
            if (obj != null && ((String) (obj)).contains("DENIED"))
            {
                obj = RLSDK.c.b.edit();
                ((android.content.SharedPreferences.Editor) (obj)).putString("disableCapture", "YES");
                ((android.content.SharedPreferences.Editor) (obj)).commit();
                RLSDK.c.a = c.c;
            }
        }

        private b()
        {
        }

        b(byte byte0)
        {
            this();
        }
    }

    public static final class c extends Enum
    {

        public static final c a;
        public static final c b;
        public static final c c;
        public static final c d;
        public static final c e;
        private static final c f[];

        public static c valueOf(String s)
        {
            return (c)Enum.valueOf(RLSDK/c$c, s);
        }

        public static c[] values()
        {
            return (c[])f.clone();
        }

        static 
        {
            a = new c("PUBLIC_SDK_MODE", 0);
            b = new c("LICENSED_SDK_MODE", 1);
            c = new c("DISABLED_SDK_MODE", 2);
            d = new c("UNINITIALIZED_SDK_MODE", 3);
            e = new c("ERROR", 4);
            f = (new c[] {
                a, b, c, d, e
            });
        }

        private c(String s, int k)
        {
            super(s, k);
        }
    }


    static c a;
    static SharedPreferences b;
    static String c;
    static String d;
    static String e;
    private static Context f;
    private static boolean g = false;
    private static boolean h = true;
    private static boolean i = true;
    private static final byte j[] = {
        48, -126, 2, 34, 48, 13, 6, 9, 42, -122, 
        72, -122, -9, 13, 1, 1, 1, 5, 0, 3, 
        -126, 2, 15, 0, 48, -126, 2, 10, 2, -126, 
        2, 1, 0, -85, 46, -20, -35, 65, -66, -62, 
        21, -51, 105, -53, 4, -121, 71, -101, -76, -93, 
        -38, 93, 100, -128, -51, 44, 101, -35, 9, 15, 
        -125, 48, 59, 73, -12, 21, 112, 84, -89, 117, 
        85, -90, 8, -66, -27, 50, -36, 93, 92, -95, 
        -25, 117, -62, 127, 0, -81, -123, -119, -49, -23, 
        -35, -17, 83, 79, 21, -40, 20, 81, 11, -122, 
        -19, 127, 106, 102, -127, -2, -47, -25, -25, 65, 
        56, -125, -83, -106, 11, 76, 120, -97, 17, 44, 
        -118, -15, -114, -110, -108, 111, 88, -93, 18, 72, 
        41, 59, -17, 70, 112, -64, -121, -11, 18, -32, 
        -46, -125, 102, 41, -25, 53, -117, -86, 16, 123, 
        64, -82, 83, 90, -35, 65, -23, 37, 72, -43, 
        -3, -51, 80, -125, 10, 117, -65, -70, 75, -22, 
        -19, -114, 13, 20, -17, 105, 28, -97, 111, 15, 
        95, -55, 17, -84, -12, -50, 118, -70, 57, 123, 
        -124, 96, 47, -82, -105, -102, -64, 84, -55, 67, 
        110, -75, -56, -117, -124, 59, -24, 40, -6, 93, 
        -108, 53, 118, 123, -9, -90, -66, -81, -11, 42, 
        107, -31, 11, 62, -63, 55, -111, -6, 79, 115, 
        121, 23, -13, 76, 93, 109, -8, -37, 31, 26, 
        26, 79, -56, -84, -72, -15, -48, 20, 127, -112, 
        -47, 119, 122, 103, -31, -44, 12, 97, -31, -52, 
        120, -32, -62, 117, 87, 7, -29, -54, -5, -8, 
        89, -4, 65, 5, 61, 92, -114, 51, -34, -28, 
        -111, -35, -57, -8, 125, -19, -12, 45, -89, -128, 
        115, -92, 63, 113, -21, -61, -89, -46, -86, 29, 
        52, -10, 85, 51, -58, 42, 8, 27, -113, 39, 
        112, -53, -36, 92, 104, 66, 23, -4, 110, 113, 
        -37, 67, -9, -77, -5, -41, -93, -69, 16, -64, 
        58, 101, 120, -34, 58, -73, 93, -114, -52, 109, 
        19, -58, -101, 37, 75, -14, -104, -119, -114, 90, 
        -12, 0, 118, -65, 14, -49, 27, 20, 111, -73, 
        -92, 41, 85, -124, -95, -61, -15, -110, 89, 76, 
        -22, 8, 26, 33, -64, -49, 82, -116, 22, -61, 
        48, 48, 41, 35, -79, 100, 114, 39, -66, 31, 
        -10, -67, 64, -6, 23, -80, -66, 66, -99, 4, 
        80, -33, -19, 112, 33, 7, 94, -69, 53, 78, 
        53, 10, -113, 119, -30, 35, 32, -2, 125, 80, 
        122, -18, 126, -101, 96, 99, 85, -67, -73, -49, 
        113, -72, 13, -87, 63, 57, -13, -87, -125, -119, 
        -96, -52, 85, -46, -22, -39, 103, -127, 39, 100, 
        9, 71, -46, -54, -1, 89, -109, -64, -58, -127, 
        89, -124, -21, 40, -29, -59, 0, -122, 92, 123, 
        -81, 68, -90, 68, 13, 124, 17, -56, 102, 77, 
        -124, 25, 42, 13, 30, -123, -102, 20, 30, -36, 
        92, 76, -15, 88, 96, 92, 40, 32, -95, 17, 
        25, 112, -114, 112, 4, 36, 2, -16, -72, 119, 
        1, -7, 43, -127, -4, 5, -11, -102, 110, -79, 
        -25, -3, 83, 93, -37, -13, 16, -77, 69, 74, 
        -64, 58, 62, -101, -90, -74, -21, -97, 25, 103, 
        123, 48, 80, 54, 103, 2, 3, 1, 0, 1
    };

    public static c a()
    {
        return a;
    }

    private static String a(Context context, String s)
    {
        context = new BufferedReader(new InputStreamReader(context.getAssets().open(s)));
        s = new StringBuilder();
_L1:
        String s1 = context.readLine();
label0:
        {
            if (s1 == null)
            {
                break label0;
            }
            try
            {
                s.append(s1).append("\n");
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                Log.e("StatusManager", "Problem reading license file", context);
                return null;
            }
        }
          goto _L1
        context.close();
        context = s.toString();
        return context;
    }

    private static ArrayList a(String s)
    {
        ArrayList arraylist = new ArrayList();
        Object obj;
        int k;
        obj = XmlPullParserFactory.newInstance();
        ((XmlPullParserFactory) (obj)).setNamespaceAware(true);
        obj = ((XmlPullParserFactory) (obj)).newPullParser();
        ((XmlPullParser) (obj)).setInput(new StringReader(s));
        k = ((XmlPullParser) (obj)).getEventType();
        boolean flag2;
        boolean flag3;
        boolean flag4;
        boolean flag5;
        boolean flag6;
        flag4 = false;
        flag5 = false;
        flag2 = false;
        flag6 = false;
        flag3 = false;
          goto _L1
_L16:
        k = ((XmlPullParser) (obj)).next();
        boolean flag;
        boolean flag1;
        boolean flag7;
        boolean flag8;
        boolean flag9;
        flag3 = flag7;
        flag4 = flag8;
        flag5 = flag1;
        flag2 = flag;
        flag6 = flag9;
          goto _L1
_L12:
        s = ((XmlPullParser) (obj)).getName();
        if (s.equalsIgnoreCase("key"))
        {
            flag2 = true;
        }
        flag7 = flag3;
        flag8 = flag4;
        flag1 = flag5;
        flag = flag2;
        flag9 = flag6;
        if (s.equalsIgnoreCase("string"))
        {
            flag1 = true;
            flag7 = flag3;
            flag8 = flag4;
            flag = flag2;
            flag9 = flag6;
        }
        continue; /* Loop/switch isn't completed */
_L14:
        s = ((XmlPullParser) (obj)).getText();
        if (!flag2) goto _L3; else goto _L2
_L2:
        if (s.equalsIgnoreCase("Android"))
        {
            flag8 = true;
            flag = false;
            flag7 = flag3;
            flag1 = flag5;
            flag9 = flag6;
            continue; /* Loop/switch isn't completed */
        }
        if (!flag4) goto _L5; else goto _L4
_L4:
        if (s.equalsIgnoreCase("Root Class Names"))
        {
            flag7 = true;
            flag = false;
            flag8 = flag4;
            flag1 = flag5;
            flag9 = flag6;
            continue; /* Loop/switch isn't completed */
        }
          goto _L5
_L3:
        flag7 = flag3;
        flag8 = flag4;
        flag1 = flag5;
        flag = flag2;
        flag9 = flag6;
        if (!flag5)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (!flag4 || !flag3) goto _L7; else goto _L6
_L6:
        arraylist.add(s);
        flag1 = false;
        flag7 = flag3;
        flag8 = flag4;
        flag = flag2;
        flag9 = flag6;
        continue; /* Loop/switch isn't completed */
_L13:
        boolean flag10 = ((XmlPullParser) (obj)).getName().equalsIgnoreCase("array");
        flag7 = flag3;
        flag8 = flag4;
        flag1 = flag5;
        flag = flag2;
        flag9 = flag6;
        if (flag10)
        {
            flag7 = flag3;
            flag8 = flag4;
            flag1 = flag5;
            flag = flag2;
            flag9 = flag6;
            if (flag4)
            {
                flag7 = flag3;
                flag8 = flag4;
                flag1 = flag5;
                flag = flag2;
                flag9 = flag6;
                if (flag3)
                {
                    flag9 = true;
                    flag7 = flag3;
                    flag8 = flag4;
                    flag1 = flag5;
                    flag = flag2;
                }
            }
        }
        continue; /* Loop/switch isn't completed */
        s;
        Log.e("StatusManager", "Logic error in license XML parser", s);
_L9:
        return arraylist;
_L7:
        flag1 = false;
        flag7 = flag3;
        flag8 = flag4;
        flag = flag2;
        flag9 = flag6;
        continue; /* Loop/switch isn't completed */
_L5:
        flag = false;
        flag7 = flag3;
        flag8 = flag4;
        flag1 = flag5;
        flag9 = flag6;
        continue; /* Loop/switch isn't completed */
_L1:
        if (flag6 || k == 1) goto _L9; else goto _L8
_L8:
        flag7 = flag3;
        flag8 = flag4;
        flag1 = flag5;
        flag = flag2;
        flag9 = flag6;
        k;
        JVM INSTR tableswitch 0 4: default 528
    //                   0 62
    //                   1 62
    //                   2 92
    //                   3 300
    //                   4 162;
           goto _L10 _L11 _L11 _L12 _L13 _L14
_L11:
        break; /* Loop/switch isn't completed */
_L10:
        flag7 = flag3;
        flag8 = flag4;
        flag1 = flag5;
        flag = flag2;
        flag9 = flag6;
        if (true) goto _L16; else goto _L15
_L15:
    }

    public static void a(Context context)
    {
        RLSDK/c;
        JVM INSTR monitorenter ;
        if (context != null)
        {
            break MISSING_BLOCK_LABEL_21;
        }
        throw new IllegalArgumentException();
        context;
        RLSDK/c;
        JVM INSTR monitorexit ;
        throw context;
        if (g) goto _L2; else goto _L1
_L1:
        Object obj;
        f = context;
        obj = context.getApplicationContext();
        p.a(context.getContentResolver());
        c = ((Context) (obj)).getPackageName();
        d = ((Context) (obj)).getPackageManager().getPackageInfo(c, 0).versionName;
_L12:
        b = ((Context) (obj)).getSharedPreferences("com.ebay.redlasersdk.network.preferences", 0);
        obj = a(((Context) (obj)), "RedLaser_License.xml");
        a = c.a;
        if (obj == null) goto _L4; else goto _L3
_L3:
        if (((String) (obj)).length() <= 0) goto _L4; else goto _L5
_L5:
        int k;
        int l;
        k = ((String) (obj)).indexOf("-----BEGIN SIGNATURE-----");
        l = ((String) (obj)).indexOf("-----END SIGNATURE-----");
        if (k == -1 || l == -1) goto _L7; else goto _L6
_L6:
        context = ((String) (obj)).substring(k + 25, l);
        Signature signature;
        context = n.a(context);
        obj = ((String) (obj)).substring(0, k);
        Object obj1 = new X509EncodedKeySpec(j);
        obj1 = KeyFactory.getInstance("RSA").generatePublic(((java.security.spec.KeySpec) (obj1)));
        signature = Signature.getInstance("SHA1withRSA");
        signature.initVerify(((java.security.PublicKey) (obj1)));
        signature.update(((String) (obj)).getBytes());
        if (!signature.verify(context)) goto _L9; else goto _L8
_L8:
        if (!a(((String) (obj))).contains(c)) goto _L11; else goto _L10
_L10:
        a = c.b;
_L4:
        e = c;
        if (a.compareTo(c.a) == 0)
        {
            e = "psdk";
        }
        if (b.getString("disableCapture", "NO").equalsIgnoreCase("YES"))
        {
            a = c.c;
        }
        if (i)
        {
            (new a((byte)0)).execute(null);
            RLSDK.b.a("ANDROIDSDK.APP_LAUNCH", null);
        }
        g = true;
_L2:
        RLSDK/c;
        JVM INSTR monitorexit ;
        return;
        context;
        d = null;
          goto _L12
_L11:
        a = c.e;
          goto _L4
        context;
        Log.e("StatusManager", "Logic error in license decryption", context);
_L7:
        a = c.e;
          goto _L4
_L9:
        a = c.e;
          goto _L4
        context;
        Log.e("StatusManager", "Logic error in license decryption", context);
          goto _L7
        context;
        Log.e("StatusManager", "Logic error in license decryption", context);
          goto _L7
        context;
        a = c.e;
          goto _L4
    }

    public static void a(BarcodeResultInternal barcoderesultinternal)
    {
        if (barcoderesultinternal == null)
        {
            Log.e("StatusManager", "Null list of barcodes sent to logScans");
        } else
        if (h)
        {
            (new b((byte)0)).execute(new BarcodeResult[] {
                barcoderesultinternal
            });
            HashMap hashmap = new HashMap();
            hashmap.put("type", barcoderesultinternal.getBarcodeTrackingType());
            hashmap.put("barcode", barcoderesultinternal.barcodeString);
            RLSDK.b.a("ANDRSDK.BARCODE_SCANNED", hashmap);
            return;
        }
    }

    static Context b()
    {
        return f;
    }

    static 
    {
        a = c.d;
    }
}
