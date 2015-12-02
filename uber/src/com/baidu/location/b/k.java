// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.baidu.location.b;

import android.content.Context;
import android.location.Location;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Environment;
import android.text.TextUtils;
import com.baidu.location.BDLocation;
import com.baidu.location.f;
import com.baidu.location.h.a;
import com.baidu.location.h.b;
import com.baidu.location.h.c;
import com.baidu.location.h.h;
import com.baidu.location.h.j;
import java.io.File;
import java.io.FileInputStream;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Calendar;
import java.util.Locale;

// Referenced classes of package com.baidu.location.b:
//            f, c

public class k
    implements com.baidu.location.b.f
{

    public static float b0 = 0F;
    public static boolean b1 = false;
    public static boolean b2 = false;
    private static String b3 = "https://sapi.skyhookwireless.com/wps2/location";
    public static int b4 = 0;
    public static int b5 = 0;
    public static byte b6[] = null;
    public static int b7 = 0;
    public static double b8 = 0D;
    private static String b9 = "http://loc.map.baidu.com/tcu.php";
    private static String bI = "http://loc.map.baidu.com/iofd.php";
    public static float bJ = 0F;
    public static double bK = 0D;
    public static int bL = 0;
    public static int bM = 0;
    public static int bN = 0;
    public static boolean bO = false;
    public static float bP = 0F;
    public static int bQ = 0;
    private static String bR = "http://loc.map.baidu.com/sdk.php";
    public static int bS = 0;
    public static boolean bT = false;
    public static int bU = 0;
    public static boolean bV = false;
    public static boolean bW = false;
    public static int bX = 0;
    private static String bY = "http://loc.map.baidu.com/oqur.php";
    private static String bZ = "http://loc.map.baidu.com/wloc";
    public static int cA = 0;
    public static float cB = 0F;
    public static int cC = 0;
    public static float cD = 0F;
    public static float cE = 0F;
    public static int cF = 0;
    public static int cG = 0;
    public static int cH = 0;
    public static double cI = 0D;
    public static int cJ = 0;
    public static boolean cK = false;
    public static long cL = 0L;
    public static int cM = 0;
    public static long cN = 0L;
    public static int cO = 0;
    public static int cP = 0;
    public static boolean cQ = false;
    public static String cR = "gcj02";
    public static float cS = 0F;
    public static long cT = 0L;
    public static float cU = 0F;
    private static String ca = "http://loc.map.baidu.com/user_err.php";
    public static int cb = 0;
    public static int cc = 0;
    public static int cd = 0;
    public static float ce = 0F;
    public static float cf = 0F;
    public static int cg = 0;
    public static float ch = 0F;
    public static final boolean ci = true;
    public static String cj = "no";
    public static float ck = 10F;
    public static float cl = 2.0F;
    public static boolean cm = false;
    public static boolean cn = false;
    public static float co = 2.3F;
    public static boolean cp = true;
    public static boolean cq = false;
    public static float cr = 10F;
    public static int cs = 0;
    public static double ct = 0.0D;
    public static int cu = 10;
    public static int cv = 1000;
    public static long cw = 0xdbba0L;
    public static long cx = 0L;
    public static long cy = 0x2bf20L;
    public static String cz = "http://loc.map.baidu.com/sdk_ep.php";

    public k()
    {
    }

    static String X()
    {
        Calendar calendar = Calendar.getInstance();
        int i = calendar.get(5);
        int l = calendar.get(1);
        int i1 = calendar.get(2);
        int j1 = calendar.get(11);
        int k1 = calendar.get(12);
        int l1 = calendar.get(13);
        return String.format(Locale.CHINA, "%d_%d_%d_%d_%d_%d", new Object[] {
            Integer.valueOf(l), Integer.valueOf(i1 + 1), Integer.valueOf(i), Integer.valueOf(j1), Integer.valueOf(k1), Integer.valueOf(l1)
        });
    }

    public static String Y()
    {
        return bY;
    }

    public static String Z()
    {
        return bR;
    }

    public static String aa()
    {
        return bZ;
    }

    public static String ab()
    {
        return b3;
    }

    public static String ac()
    {
        return b9;
    }

    public static String ad()
    {
        Calendar calendar = Calendar.getInstance();
        int i = calendar.get(5);
        int l = calendar.get(1);
        int i1 = calendar.get(2);
        int j1 = calendar.get(11);
        int k1 = calendar.get(12);
        int l1 = calendar.get(13);
        return String.format(Locale.CHINA, "%d-%02d-%02d %02d:%02d:%02d", new Object[] {
            Integer.valueOf(l), Integer.valueOf(i1 + 1), Integer.valueOf(i), Integer.valueOf(j1), Integer.valueOf(k1), Integer.valueOf(l1)
        });
    }

    public static String ae()
    {
        return ca;
    }

    public static String af()
    {
        if (Environment.getExternalStorageState().equals("mounted"))
        {
            String s;
            try
            {
                s = Environment.getExternalStorageDirectory().getPath();
                File file = new File((new StringBuilder()).append(s).append("/baidu/tempdata").toString());
                if (!file.exists())
                {
                    file.mkdirs();
                }
            }
            catch (Exception exception)
            {
                return null;
            }
            return s;
        } else
        {
            return null;
        }
    }

    public static String ag()
    {
        return bI;
    }

    public static String ah()
    {
        String s = af();
        if (s == null)
        {
            return null;
        } else
        {
            return (new StringBuilder()).append(s).append("/baidu/tempdata").toString();
        }
    }

    public static String ai()
    {
        Object obj;
        try
        {
            obj = new File((new StringBuilder()).append(f.getServiceContext().getFilesDir()).append(File.separator).append("lldt").toString());
            if (!((File) (obj)).exists())
            {
                ((File) (obj)).mkdirs();
            }
            obj = ((File) (obj)).getAbsolutePath();
        }
        catch (Exception exception)
        {
            return null;
        }
        return ((String) (obj));
    }

    static float _mthdo(String s, String s1, String s2)
    {
        int i;
        if (s != null && !s.equals(""))
        {
            if ((i = s.indexOf(s1)) != -1)
            {
                i += s1.length();
                int l = s.indexOf(s2, i);
                if (l != -1)
                {
                    s = s.substring(i, l);
                    if (s != null && !s.equals(""))
                    {
                        float f1;
                        try
                        {
                            f1 = Float.parseFloat(s);
                        }
                        // Misplaced declaration of an exception variable
                        catch (String s)
                        {
                            return 1.401298E-45F;
                        }
                        return f1;
                    }
                }
            }
        }
        return 1.401298E-45F;
    }

    public static boolean _mthdo(Context context)
    {
        boolean flag;
        boolean flag1;
        flag1 = false;
        context = (ConnectivityManager)context.getSystemService("connectivity");
        flag = flag1;
        if (context == null) goto _L2; else goto _L1
_L1:
        context = context.getAllNetworkInfo();
        flag = flag1;
        if (context == null) goto _L2; else goto _L3
_L3:
        int i = 0;
_L8:
        flag = flag1;
        if (i >= context.length) goto _L2; else goto _L4
_L4:
        if (context[i].getState() != android.net.NetworkInfo.State.CONNECTED) goto _L6; else goto _L5
_L5:
        flag = true;
_L2:
        return flag;
_L6:
        i++;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public static boolean _mthdo(BDLocation bdlocation)
    {
        int i = bdlocation.getLocType();
        return i > 100 && i < 200;
    }

    public static int _mthfor(String s, String s1, String s2)
    {
        int i;
        if (s != null && !s.equals(""))
        {
            if ((i = s.indexOf(s1)) != -1)
            {
                i += s1.length();
                int i1 = s.indexOf(s2, i);
                if (i1 != -1)
                {
                    s = s.substring(i, i1);
                    if (s != null && !s.equals(""))
                    {
                        int l;
                        try
                        {
                            l = Integer.parseInt(s);
                        }
                        // Misplaced declaration of an exception variable
                        catch (String s)
                        {
                            return 0x80000000;
                        }
                        return l;
                    }
                }
            }
        }
        return 0x80000000;
    }

    public static String _mthif(h h, com.baidu.location.h.f f1, Location location, String s)
    {
        StringBuffer stringbuffer = new StringBuffer();
        if (h != null)
        {
            String s1 = b.cU()._mthnew(h);
            if (s1 != null)
            {
                stringbuffer.append(s1);
            }
        }
        if (f1 != null)
        {
            try
            {
                f1 = f1.e(5);
            }
            // Misplaced declaration of an exception variable
            catch (com.baidu.location.h.f f1)
            {
                f1 = null;
            }
            if (f1 != null)
            {
                stringbuffer.append(f1);
            }
        }
        if (location != null)
        {
            if (b5 != 0)
            {
                f1 = a._mthelse(location);
            } else
            {
                f1 = a._mthgoto(location);
            }
            if (f1 != null)
            {
                stringbuffer.append(f1);
            }
        }
        f1 = c.N()._mthdo(false);
        if (f1 != null)
        {
            stringbuffer.append(f1);
        }
        if (s != null)
        {
            stringbuffer.append(s);
        }
        if (h != null)
        {
            h = c.a()._mthint(h);
            if (h != null && h.length() + stringbuffer.length() < 750)
            {
                stringbuffer.append(h);
            }
        }
        return stringbuffer.toString();
    }

    public static String _mthif(h h, com.baidu.location.h.f f1, Location location, String s, int i)
    {
        float f2;
        int l;
        int i1;
        StringBuffer stringbuffer = new StringBuffer(1024);
        if (h != null)
        {
            String s1 = b.cU()._mthnew(h);
            if (s1 != null)
            {
                stringbuffer.append(s1);
            }
        }
        String s2;
        if (f1 != null)
        {
            boolean flag;
            if (i == 0)
            {
                s2 = f1.dp();
            } else
            {
                s2 = f1.dk();
            }
            if (s2 != null)
            {
                stringbuffer.append(s2);
            }
        }
        if (location != null)
        {
            if (b5 != 0 && i != 0)
            {
                s2 = a._mthelse(location);
            } else
            {
                s2 = a._mthgoto(location);
            }
            if (s2 != null)
            {
                stringbuffer.append(s2);
            }
        }
        flag = false;
        if (i == 0)
        {
            flag = true;
        }
        s2 = c.N()._mthdo(flag);
        if (s2 != null)
        {
            stringbuffer.append(s2);
        }
        if (s != null)
        {
            stringbuffer.append(s);
        }
        s = com.baidu.location.e.f.bC().bB();
        if (!TextUtils.isEmpty(s))
        {
            stringbuffer.append("&bc=").append(s);
        }
        if (h != null)
        {
            h = c.a()._mthint(h);
            if (h != null && h.length() + stringbuffer.length() < 750)
            {
                stringbuffer.append(h);
            }
        }
        h = stringbuffer.toString();
        if (location == null || f1 == null)
        {
            break MISSING_BLOCK_LABEL_373;
        }
        f2 = location.getSpeed();
        i = b5;
        l = f1.df();
        i1 = f1.dl();
        flag = f1.dh();
        if (f2 >= ch || i != 1 && i != 0)
        {
            break MISSING_BLOCK_LABEL_312;
        }
        if (l < cg || flag)
        {
            try
            {
                b7 = 1;
            }
            // Misplaced declaration of an exception variable
            catch (com.baidu.location.h.f f1)
            {
                b7 = 3;
                return h;
            }
            return h;
        }
        if (f2 >= cD || i != 1 && i != 0 && i != 3)
        {
            break MISSING_BLOCK_LABEL_367;
        }
        if (l >= cO && i1 <= bS)
        {
            break MISSING_BLOCK_LABEL_367;
        }
        b7 = 2;
        return h;
        b7 = 3;
        return h;
        b7 = 3;
        return h;
    }

    public static String _mthif(File file)
    {
        byte abyte0[];
        if (!file.isFile())
        {
            return null;
        }
        abyte0 = new byte[1024];
        MessageDigest messagedigest;
        messagedigest = MessageDigest.getInstance("MD5");
        file = new FileInputStream(file);
_L1:
        int i = file.read(abyte0, 0, 1024);
label0:
        {
            if (i == -1)
            {
                break label0;
            }
            try
            {
                messagedigest.update(abyte0, 0, i);
            }
            // Misplaced declaration of an exception variable
            catch (File file)
            {
                file.printStackTrace();
                return null;
            }
        }
          goto _L1
        file.close();
        return (new BigInteger(1, messagedigest.digest())).toString(16);
    }

    static String _mthif(String s, String s1, String s2, double d)
    {
        int i;
        if (s != null && !s.equals(""))
        {
            if ((i = s.indexOf(s1)) != -1)
            {
                i += s1.length();
                int l = s.indexOf(s2, i);
                if (l != -1)
                {
                    s1 = s.substring(0, i);
                    s = s.substring(l);
                    s2 = String.format(Locale.CHINA, "%.7f", new Object[] {
                        Double.valueOf(d)
                    });
                    return (new StringBuilder()).append(s1).append(s2).append(s).toString();
                }
            }
        }
        return null;
    }

    static double _mthint(String s, String s1, String s2)
    {
        int i;
        if (s != null && !s.equals(""))
        {
            if ((i = s.indexOf(s1)) != -1)
            {
                i += s1.length();
                int l = s.indexOf(s2, i);
                if (l != -1)
                {
                    s = s.substring(i, l);
                    if (s != null && !s.equals(""))
                    {
                        double d;
                        try
                        {
                            d = Double.parseDouble(s);
                        }
                        // Misplaced declaration of an exception variable
                        catch (String s)
                        {
                            return 4.9406564584124654E-324D;
                        }
                        return d;
                    }
                }
            }
        }
        return 4.9406564584124654E-324D;
    }

    static 
    {
        cK = false;
        b2 = false;
        b5 = 0;
        b1 = false;
        bT = false;
        bW = false;
        b7 = 3;
        cI = 0.0D;
        bK = 0.0D;
        b8 = 0.0D;
        cQ = false;
        b4 = 0;
        cU = 1.1F;
        b0 = 2.2F;
        cE = 3.8F;
        cb = 3;
        cG = 2;
        bN = 7;
        bL = 20;
        cM = 70;
        bU = 120;
        cS = 50F;
        cB = 200F;
        cH = 16;
        bP = 0.9F;
        cC = 10000;
        bJ = 0.5F;
        cf = 0.0F;
        ce = 0.1F;
        cd = 30;
        cc = 100;
        cA = 0x668a0;
        bV = true;
        bO = true;
        cF = 20;
        cJ = 300;
        cN = 0x668a0L;
        cL = 15L;
        cT = 0x493e0L;
        bX = 1000;
        cP = 0;
        bM = 30000;
        bQ = 30000;
        ch = 6F;
        cD = 10F;
        cg = 60;
        cO = 70;
        bS = 6;
    }
}
