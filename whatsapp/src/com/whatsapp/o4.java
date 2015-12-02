// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.app.Application;
import android.backport.util.Base64;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.os.Debug;
import android.os.Environment;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import com.whatsapp.util.v;
import dalvik.system.DexFile;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.InvalidParameterException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Locale;
import java.util.zip.ZipFile;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

// Referenced classes of package com.whatsapp:
//            App, as4, u, b6, 
//            as6, al0

public class o4
{

    private static final byte a[];
    private static int b;
    private static boolean c;
    private static boolean d;
    private static final byte e[];
    private static final byte f[];
    private static String g;
    private static File h;
    private static boolean i;
    private static final byte j[];
    private static File k;
    private static String l;
    private static boolean m;
    private static volatile boolean n;
    private static File o;
    private static final String p[];
    private static File q;
    private static File r;
    private static boolean s;
    private static boolean t;
    private static final byte u[];
    private static final String z[];

    private static File A()
    {
label0:
        {
            File file;
            try
            {
                if (!n)
                {
                    break label0;
                }
                file = h;
            }
            catch (NullPointerException nullpointerexception)
            {
                throw nullpointerexception;
            }
            return file;
        }
        return new File(App.au.getFilesDir(), z[162]);
    }

    private static String B()
    {
        return a(true);
    }

    public static boolean C()
    {
        Object obj;
        byte abyte0[];
        try
        {
            obj = t();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Log.c(z[18], ((Throwable) (obj)));
            return false;
        }
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_29;
        }
        abyte0 = ((as4) (obj)).c.a;
        if (abyte0 != null)
        {
            try
            {
                abyte0 = ((as4) (obj)).b;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
            if (abyte0 != null)
            {
                break MISSING_BLOCK_LABEL_50;
            }
        }
        return false;
        obj;
        throw obj;
        return Arrays.equals(b(((as4) (obj)).c.a), ((as4) (obj)).b);
    }

    public static boolean D()
    {
        boolean flag = false;
        boolean flag1;
        try
        {
            Process process = Runtime.getRuntime().exec(z[70]);
            BufferedInputStream bufferedinputstream = new BufferedInputStream(process.getInputStream());
            BufferedInputStream bufferedinputstream1 = new BufferedInputStream(process.getErrorStream());
            process.waitFor();
            int i1 = bufferedinputstream1.available();
            bufferedinputstream1.read(new byte[i1], 0, i1);
            i1 = bufferedinputstream.available();
            byte abyte0[] = new byte[i1];
            bufferedinputstream.read(abyte0, 0, i1);
            flag1 = (new String(abyte0)).contains(z[69]);
        }
        catch (Exception exception)
        {
            Log.a(exception);
            return false;
        }
        if (flag1)
        {
            flag = true;
        }
        return flag;
    }

    public static String E()
    {
        Object obj = A();
        boolean flag;
        try
        {
            flag = ((File) (obj)).exists();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        byte abyte0[];
        if (flag)
        {
            if ((abyte0 = a(((File) (obj)))) != null)
            {
                MessageDigest messagedigest;
                try
                {
                    messagedigest = MessageDigest.getInstance(z[71]);
                }
                catch (NoSuchAlgorithmException nosuchalgorithmexception)
                {
                    Log.a(nosuchalgorithmexception);
                    return null;
                }
                messagedigest.reset();
                messagedigest.update(abyte0);
                return Base64.encodeToString(messagedigest.digest(), 2);
            }
        }
        return null;
    }

    static boolean F()
    {
        Object obj = App.z.getSubscriberId();
        boolean flag;
        try
        {
            flag = TextUtils.isEmpty(((CharSequence) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        if (!flag)
        {
            boolean flag1;
            try
            {
                flag1 = ((String) (obj)).contains(z[165]);
            }
            catch (NullPointerException nullpointerexception)
            {
                throw nullpointerexception;
            }
            if (!flag1)
            {
                return false;
            }
        }
        return true;
    }

    private static String G()
    {
label0:
        {
            String s1;
            try
            {
                if (!n)
                {
                    break label0;
                }
                s1 = l;
            }
            catch (NullPointerException nullpointerexception)
            {
                throw nullpointerexception;
            }
            return s1;
        }
        return B();
    }

    private static byte[] H()
    {
        return a(16);
    }

    static boolean I()
    {
label0:
        {
            boolean flag;
            try
            {
                if (!n)
                {
                    break label0;
                }
                flag = c;
            }
            catch (Exception exception)
            {
                throw exception;
            }
            return flag;
        }
        Object obj = new File(z[80]);
        try
        {
            if (((File) (obj)).exists())
            {
                c = true;
            }
        }
        catch (Exception exception1)
        {
            try
            {
                throw exception1;
            }
            catch (Exception exception2) { }
        }
        obj = App.au.getPackageManager();
        try
        {
            ((PackageManager) (obj)).getPackageInfo(z[81], 128);
            c = true;
        }
        catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception) { }
        return c;
    }

    private static void J()
    {
        Log.i(z[43]);
        android.content.SharedPreferences.Editor editor = App.au.getSharedPreferences(z[41], 0).edit();
        try
        {
            editor.putBoolean(z[42], true);
            if (!editor.commit())
            {
                Log.w(z[40]);
            }
            return;
        }
        catch (NullPointerException nullpointerexception)
        {
            throw nullpointerexception;
        }
    }

    private static File K()
    {
label0:
        {
            File file;
            try
            {
                if (!n)
                {
                    break label0;
                }
                file = q;
            }
            catch (NullPointerException nullpointerexception)
            {
                throw nullpointerexception;
            }
            return file;
        }
        return new File(App.au.getFilesDir(), z[62]);
    }

    public static void L()
    {
        String s1 = Environment.getExternalStorageState();
        boolean flag;
        try
        {
            flag = s1.equals(z[22]);
        }
        catch (Exception exception)
        {
            throw exception;
        }
        if (flag) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Object obj;
        byte abyte1[];
        byte abyte2[];
        File file1 = d();
        File file = A();
        abyte2 = a(file);
        abyte1 = a(file1);
        boolean flag1 = file1.exists();
        Exception exception1;
        StringBuilder stringbuilder;
        long l1;
        try
        {
            stringbuilder = (new StringBuilder()).append(z[24]).append(flag1).append(" ");
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        if (!flag1) goto _L4; else goto _L3
_L3:
        l1 = file1.lastModified();
        obj = Long.valueOf(l1);
_L8:
        try
        {
            Log.i(stringbuilder.append(obj).toString());
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            try
            {
                throw obj;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
            try
            {
                throw obj;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
        }
        if (abyte2 == null && abyte1 == null) goto _L1; else goto _L5
_L5:
        flag1 = Arrays.equals(abyte2, abyte1);
        if (flag1) goto _L1; else goto _L6
_L6:
        if (abyte2 != null)
        {
            Log.i(z[25]);
            if (App.am == 0)
            {
                break MISSING_BLOCK_LABEL_243;
            }
        }
        Log.i(z[21]);
        obj = "i";
        file1 = file;
_L9:
        a(abyte1, file1);
        Arrays.equals(abyte1, a(file1));
        if (!"i".equals(obj)) goto _L1; else goto _L7
_L7:
        J();
        return;
        exception1;
        try
        {
            throw exception1;
        }
        // Misplaced declaration of an exception variable
        catch (Exception exception1)
        {
            Log.e((new StringBuilder()).append(z[23]).append(((String) (obj))).toString());
        }
        return;
_L4:
        obj = "";
          goto _L8
        byte abyte0[] = abyte2;
        obj = "e";
        abyte1 = abyte0;
          goto _L9
    }

    static boolean M()
    {
        boolean flag = false;
        if (!n) goto _L2; else goto _L1
_L1:
        flag = i;
_L4:
        return flag;
        Exception exception;
        exception;
        throw exception;
_L2:
        boolean flag1;
        try
        {
            flag1 = (new File(z[31])).exists();
        }
        catch (Exception exception1)
        {
            return false;
        }
        if (flag1)
        {
            return true;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static boolean N()
    {
        return r().delete();
    }

    public static void O()
    {
        K().delete();
    }

    static boolean P()
    {
        byte byte0;
        boolean flag1;
        byte0 = 2;
        flag1 = true;
        if (!n) goto _L2; else goto _L1
_L1:
        boolean flag = d;
_L8:
        return flag;
        Exception exception;
        exception;
        throw exception;
_L2:
        Object obj1;
        File file;
        file = new File(z[1]);
        obj1 = new File(z[5]);
        if (android.os.Build.VERSION.SDK_INT < 9)
        {
            break MISSING_BLOCK_LABEL_604;
        }
        flag = file.canExecute();
        Object obj;
        StringBuilder stringbuilder;
        int i1;
        int j1;
        boolean flag2;
        boolean flag3;
        if (flag)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        flag = ((File) (obj1)).canExecute();
        if (flag)
        {
            byte0 = 1;
        } else
        {
            byte0 = 0;
        }
_L12:
        flag = j();
        flag2 = F();
        try
        {
            obj = (new StringBuilder()).append(z[0]);
            flag3 = file.exists();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        if (flag3)
        {
            j1 = 1;
        } else
        {
            j1 = 0;
        }
        try
        {
            obj = ((StringBuilder) (obj)).append(j1);
            flag3 = file.canRead();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        if (flag3)
        {
            j1 = 1;
        } else
        {
            j1 = 0;
        }
        try
        {
            obj = ((StringBuilder) (obj)).append(j1);
            flag3 = file.canWrite();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        if (flag3)
        {
            j1 = 1;
        } else
        {
            j1 = 0;
        }
        try
        {
            stringbuilder = ((StringBuilder) (obj)).append(j1).append(i1);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        if (!flag) goto _L4; else goto _L3
_L3:
        obj = z[6];
_L13:
        boolean flag4;
        try
        {
            stringbuilder = stringbuilder.append(((String) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        if (flag2)
        {
            obj = "3";
        } else
        {
            obj = "";
        }
        try
        {
            Log.i(stringbuilder.append(((String) (obj))).toString());
            obj = (new StringBuilder()).append(z[2]);
            flag4 = ((File) (obj1)).exists();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        if (flag4)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        try
        {
            obj = ((StringBuilder) (obj)).append(i1);
            flag4 = ((File) (obj1)).canRead();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        if (flag4)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        try
        {
            obj = ((StringBuilder) (obj)).append(i1);
            flag4 = ((File) (obj1)).canWrite();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        if (flag4)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        try
        {
            stringbuilder = ((StringBuilder) (obj)).append(i1).append(byte0);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        if (!flag) goto _L6; else goto _L5
_L5:
        obj = z[3];
_L14:
        try
        {
            stringbuilder = stringbuilder.append(((String) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        if (flag2)
        {
            obj = "3";
        } else
        {
            obj = "";
        }
        try
        {
            Log.i(stringbuilder.append(((String) (obj))).toString());
            flag2 = file.exists();
        }
        catch (Exception exception1)
        {
            throw exception1;
        }
        flag = flag1;
        if (flag2) goto _L8; else goto _L7
_L7:
        try
        {
            flag2 = ((File) (obj1)).exists();
        }
        catch (Exception exception2)
        {
            throw exception2;
        }
        flag = flag1;
        if (flag2) goto _L8; else goto _L9
_L9:
label0:
        {
            try
            {
                obj = new FileInputStream(file);
            }
            catch (Exception exception3)
            {
                exception3 = null;
                break label0;
            }
            Exception exception4;
            try
            {
                ((FileInputStream) (obj)).close();
            }
            catch (Exception exception5) { }
        }
        flag = flag1;
        if (obj != null) goto _L8; else goto _L10
_L10:
        obj1 = new FileInputStream(((File) (obj1)));
        ((FileInputStream) (obj1)).close();
        obj = obj1;
_L15:
        flag = flag1;
        if (obj == null)
        {
            return false;
        }
          goto _L8
        obj;
        throw obj;
        obj;
        try
        {
            throw obj;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            i1 = 2;
            break MISSING_BLOCK_LABEL_85;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            i1 = 2;
        }
          goto _L11
        obj;
        try
        {
            throw obj;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            break MISSING_BLOCK_LABEL_85;
        }
        catch (NoSuchMethodError nosuchmethoderror) { }
_L11:
        Log.i((new StringBuilder()).append(z[4]).append(android.os.Build.VERSION.SDK_INT).toString());
          goto _L12
_L4:
        obj = "";
          goto _L13
_L6:
        obj = "";
          goto _L14
        obj1;
          goto _L15
        exception4;
        exception4 = ((Exception) (obj1));
          goto _L15
        i1 = 2;
          goto _L12
    }

    public static u a(InputStream inputstream)
    {
        byte abyte0[];
        byte abyte1[];
        byte abyte2[];
        byte abyte3[];
        byte abyte4[];
        int i1;
        int k1;
        k1 = App.am;
        abyte0 = new byte[e.length];
        abyte1 = new byte[32];
        abyte2 = new byte[16];
        abyte3 = new byte[16];
        abyte4 = new byte[abyte0.length + 1 + abyte1.length + abyte2.length + abyte3.length];
        inputstream.read(abyte4);
        System.arraycopy(abyte4, 0, abyte0, 0, e.length);
        i1 = 0 + e.length;
        boolean flag = Arrays.equals(abyte0, u);
        if (!flag)
        {
            try
            {
                if (!Arrays.equals(abyte0, j))
                {
                    throw new b6(null);
                }
            }
            // Misplaced declaration of an exception variable
            catch (InputStream inputstream)
            {
                throw inputstream;
            }
        }
        break MISSING_BLOCK_LABEL_112;
        inputstream;
        throw inputstream;
        byte byte0 = abyte4[i1];
        inputstream = new byte[3][];
        inputstream[0] = abyte1;
        inputstream[1] = abyte2;
        inputstream[2] = abyte3;
        int l1 = inputstream.length;
        int j1 = i1 + 1;
        i1 = 0;
        do
        {
            if (i1 >= l1)
            {
                break;
            }
            Object obj = inputstream[i1];
            System.arraycopy(abyte4, j1, obj, 0, obj.length);
            j1 += obj.length;
            i1++;
        } while (k1 == 0);
        return new u(abyte0, String.valueOf(byte0), abyte1, abyte2, abyte3);
    }

    static String a()
    {
label0:
        {
            String s1;
            try
            {
                if (!n)
                {
                    break label0;
                }
                s1 = g;
            }
            catch (NullPointerException nullpointerexception)
            {
                throw nullpointerexception;
            }
            return s1;
        }
        Object obj;
        String s2;
        String s3;
        String s4;
        String s5;
        if (Build.MANUFACTURER == null)
        {
            obj = "";
        } else
        {
            obj = Build.MANUFACTURER;
        }
        if (android.os.Build.VERSION.RELEASE == null)
        {
            s2 = "";
        } else
        {
            s2 = android.os.Build.VERSION.RELEASE;
        }
        if (Build.DISPLAY == null)
        {
            s3 = "";
        } else
        {
            s3 = Build.DISPLAY;
        }
        if (Build.MODEL == null)
        {
            s4 = "";
        } else
        {
            s4 = Build.MODEL;
        }
        s5 = as6.b();
        if (!s5.toLowerCase(Locale.US).contains(z[111])) goto _L2; else goto _L1
_L1:
        obj = z[136];
_L4:
        Log.i((new StringBuilder()).append(z[116]).append(((String) (obj))).toString());
        return ((String) (obj));
        obj;
        throw obj;
        obj;
        throw obj;
        obj;
        throw obj;
        obj;
        throw obj;
_L2:
label1:
        {
            if (((String) (obj)).toLowerCase(Locale.US).contains(z[134]))
            {
                obj = z[148];
                continue; /* Loop/switch isn't completed */
            }
            if (s2.toLowerCase(Locale.US).contains(z[83]))
            {
                obj = z[92];
                continue; /* Loop/switch isn't completed */
            }
            if (s3.toLowerCase(Locale.US).contains(z[85]))
            {
                obj = z[107];
                continue; /* Loop/switch isn't completed */
            }
            if (s4.toLowerCase(Locale.US).contains(z[125]))
            {
                obj = z[105];
                continue; /* Loop/switch isn't completed */
            }
            if (s5.toLowerCase(Locale.US).contains(z[129]))
            {
                obj = z[146];
                continue; /* Loop/switch isn't completed */
            }
            if (s3.startsWith(z[112]))
            {
                obj = z[97];
                continue; /* Loop/switch isn't completed */
            }
            if (((String) (obj)).startsWith(z[124]))
            {
                obj = z[127];
                continue; /* Loop/switch isn't completed */
            }
            if (s2.startsWith(z[137]))
            {
                obj = z[135];
                continue; /* Loop/switch isn't completed */
            }
            boolean flag;
            try
            {
                if (s2.startsWith(z[118]))
                {
                    break label1;
                }
                flag = s3.startsWith(z[99]);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
            if (!flag)
            {
                break MISSING_BLOCK_LABEL_420;
            }
        }
        obj = z[114];
        continue; /* Loop/switch isn't completed */
        if (s2.startsWith(z[94]))
        {
            obj = z[149];
        } else
        if (s3.startsWith(z[82]))
        {
            obj = z[91];
        } else
        if (s3.startsWith(z[103]))
        {
            obj = z[109];
        } else
        if (s3.startsWith(z[131]))
        {
            obj = z[128];
        } else
        if (s3.startsWith(z[95]))
        {
            obj = z[96];
        } else
        if (s3.startsWith(z[119]))
        {
            obj = z[126];
        } else
        if (s3.startsWith(z[140]))
        {
            obj = z[123];
        } else
        if (s3.startsWith(z[115]))
        {
            obj = z[151];
        } else
        if (s3.startsWith(z[100]))
        {
            obj = z[130];
        } else
        if (s3.startsWith(z[117]))
        {
            obj = z[90];
        } else
        if (s3.startsWith(z[110]))
        {
            obj = z[150];
        } else
        if (s4.startsWith(z[98]))
        {
            obj = z[141];
        } else
        if (s3.startsWith(z[101]))
        {
            obj = z[113];
        } else
        if (s3.startsWith(z[122]))
        {
            obj = z[121];
        } else
        if (s3.startsWith(z[132]))
        {
            obj = z[144];
        } else
        if (s3.startsWith(z[102]))
        {
            obj = z[84];
        } else
        if (s3.startsWith(z[138]))
        {
            obj = z[142];
        } else
        if (s3.startsWith(z[143]))
        {
            obj = z[106];
        } else
        if (s3.startsWith(z[104]))
        {
            obj = z[87];
        } else
        if (s5.contains(z[108]))
        {
            obj = z[89];
        } else
        if (s5.contains(z[145]))
        {
            obj = z[147];
        } else
        if (s5.contains(z[120]))
        {
            obj = z[133];
        } else
        if (s5.contains(z[139]))
        {
            obj = z[88];
        } else
        if (s3.contains(z[93]))
        {
            obj = z[86];
        } else
        {
            obj = null;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static String a(Application application)
    {
        int k1 = App.am;
        Object obj;
        byte abyte0[];
        application = new ZipFile(application.getPackageCodePath());
        application = application.getInputStream(application.getEntry(z[156]));
        obj = MessageDigest.getInstance(z[154]);
        abyte0 = new byte[8192];
_L2:
        int i1 = application.read(abyte0);
        int j1;
        int l1;
        if (i1 <= 0)
        {
            break; /* Loop/switch isn't completed */
        }
        try
        {
            ((MessageDigest) (obj)).update(abyte0, 0, i1);
        }
        // Misplaced declaration of an exception variable
        catch (Application application)
        {
            Log.e((new StringBuilder()).append(z[153]).append(application.toString()).toString());
            return z[155];
        }
        if (k1 == 0) goto _L2; else goto _L1
_L1:
        application = ((MessageDigest) (obj)).digest();
        obj = new StringBuilder();
        l1 = application.length;
        i1 = 0;
          goto _L3
_L8:
        ((StringBuilder) (obj)).append(Character.forDigit(j1 >> 4, 16));
        ((StringBuilder) (obj)).append(Character.forDigit(j1 % 16, 16));
        if (k1 == 0) goto _L5; else goto _L4
_L4:
        application = ((StringBuilder) (obj)).toString();
        return application;
_L5:
        i1++;
_L3:
        if (i1 >= l1) goto _L4; else goto _L6
_L6:
        byte byte0 = application[i1];
        j1 = byte0;
        if (byte0 < 0)
        {
            j1 = byte0 + 256;
        }
        if (true) goto _L8; else goto _L7
_L7:
    }

    public static String a(Context context)
    {
        int k1;
label0:
        {
            k1 = App.am;
            context = com.whatsapp.util.v.a(context);
            if (context != null)
            {
                int i1;
                try
                {
                    i1 = context.length;
                }
                // Misplaced declaration of an exception variable
                catch (Context context)
                {
                    try
                    {
                        throw context;
                    }
                    // Misplaced declaration of an exception variable
                    catch (Context context)
                    {
                        throw context;
                    }
                }
                if (i1 != 0)
                {
                    break label0;
                }
            }
            return null;
        }
        MessageDigest messagedigest;
        int j1;
        int l1;
        try
        {
            messagedigest = MessageDigest.getInstance(z[44]);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.a(context);
            return null;
        }
        messagedigest.reset();
        l1 = context.length;
        j1 = 0;
        do
        {
            if (j1 >= l1)
            {
                break;
            }
            messagedigest.update(context[j1].toByteArray());
            j1++;
        } while (k1 == 0);
        return Base64.encodeToString(messagedigest.digest(), 2);
    }

    private static String a(boolean flag)
    {
        AccountManager accountmanager;
        int j1;
        j1 = App.am;
        accountmanager = AccountManager.get(App.au.getApplicationContext());
        if (accountmanager == null) goto _L2; else goto _L1
_L1:
        Account aaccount[] = accountmanager.getAccountsByType(z[13]);
        if (aaccount == null) goto _L2; else goto _L3
_L3:
        int i1;
        int k1;
        k1 = aaccount.length;
        i1 = 0;
_L4:
        Account account;
        if (i1 >= k1)
        {
            break; /* Loop/switch isn't completed */
        }
        account = aaccount[i1];
        String s1 = account.name;
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_109;
        }
        NullPointerException nullpointerexception;
        if (flag)
        {
            try
            {
                return account.name;
            }
            catch (NullPointerException nullpointerexception1)
            {
                throw nullpointerexception1;
            }
        }
        break MISSING_BLOCK_LABEL_77;
        nullpointerexception;
        throw nullpointerexception;
        i1 = account.name.indexOf('@');
        if (i1 > 0)
        {
            return account.name.substring(0, i1);
        } else
        {
            return account.name;
        }
        i1++;
        if (j1 == 0) goto _L4; else goto _L2
_L2:
        return "";
    }

    public static SecretKey a(byte abyte0[], byte abyte1[], int i1, int j1)
    {
        int l1 = App.am;
        char ac[] = new char[abyte0.length];
        int k1 = 0;
        do
        {
            if (k1 >= abyte0.length)
            {
                break;
            }
            ac[k1] = (char)abyte0[k1];
            k1++;
        } while (l1 == 0);
        abyte0 = new PBEKeySpec(ac, abyte1, i1, j1);
        try
        {
            abyte1 = SecretKeyFactory.getInstance(z[14]);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new AssertionError(abyte0);
        }
        try
        {
            abyte0 = abyte1.generateSecret(abyte0);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new AssertionError(abyte0);
        }
        return abyte0;
    }

    public static void a(OutputStream outputstream, as4 as4_1)
    {
        int i1 = 0;
        int j1 = App.am;
        byte byte0 = Byte.parseByte(as4_1.c.c);
        byte abyte0[][] = new byte[5][];
        abyte0[0] = e;
        abyte0[1] = (new byte[] {
            byte0
        });
        abyte0[2] = as4_1.c.e;
        abyte0[3] = as4_1.c.a;
        abyte0[4] = as4_1.c.d;
        int k1 = abyte0.length;
        do
        {
            if (i1 >= k1)
            {
                break;
            }
            outputstream.write(abyte0[i1]);
            i1++;
        } while (j1 == 0);
    }

    private static void a(byte abyte0[], File file)
    {
        file = new ObjectOutputStream(new FileOutputStream(file));
        file.writeObject(abyte0);
        file.close();
    }

    private static boolean a(Application application, String s1)
    {
        int j1;
        boolean flag2;
        flag2 = false;
        j1 = App.am;
        if (!n) goto _L2; else goto _L1
_L1:
        boolean flag = s;
_L4:
        return flag;
        application;
        throw application;
_L2:
        String s2 = application.getPackageName();
        flag = flag2;
        if (s2 == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        Signature asignature[];
        int i1;
        int k1;
        boolean flag3;
        try
        {
            flag3 = s2.equals(z[11]);
        }
        // Misplaced declaration of an exception variable
        catch (Application application)
        {
            throw application;
        }
        flag = flag2;
        if (!flag3)
        {
            continue; /* Loop/switch isn't completed */
        }
        application = application.getPackageManager();
        flag = flag2;
        if (application == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        try
        {
            application = application.getPackageInfo(s2, 64);
        }
        // Misplaced declaration of an exception variable
        catch (Application application)
        {
            return false;
        }
        flag = flag2;
        if (application == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        try
        {
            asignature = ((PackageInfo) (application)).signatures;
        }
        // Misplaced declaration of an exception variable
        catch (Application application)
        {
            throw application;
        }
        flag = flag2;
        if (asignature == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        application = ((PackageInfo) (application)).signatures;
        k1 = application.length;
        i1 = 0;
        do
        {
            flag = flag2;
            if (i1 >= k1)
            {
                continue; /* Loop/switch isn't completed */
            }
            Signature signature = application[i1];
            if (signature != null)
            {
                boolean flag1;
                try
                {
                    flag1 = signature.toCharsString().equals(s1);
                }
                // Misplaced declaration of an exception variable
                catch (Application application)
                {
                    throw application;
                }
                if (flag1)
                {
                    return true;
                }
            }
            i1++;
            if (j1 != 0)
            {
                return false;
            }
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    private static boolean a(File file, byte abyte0[], String s1, byte abyte1[])
    {
        int k1 = App.am;
        byte abyte2[];
        byte abyte3[];
        byte abyte4[];
        int i1;
        int j1;
        int l1;
        boolean flag;
        try
        {
            abyte2 = l();
            abyte3 = H();
            s1 = new SecretKeySpec(a(s1, abyte2), z[29]);
            Cipher cipher = Cipher.getInstance(z[27]);
            cipher.init(1, s1, new IvParameterSpec(abyte3));
            abyte4 = cipher.doFinal(abyte0);
            abyte0 = new byte[abyte1.length + abyte2.length + abyte3.length + abyte4.length];
            s1 = new byte[4][];
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            Log.a((new StringBuilder()).append(z[28]).append(file.toString()).toString(), abyte0);
            return false;
        }
        s1[0] = abyte1;
        s1[1] = abyte2;
        s1[2] = abyte3;
        s1[3] = abyte4;
        l1 = s1.length;
        i1 = 0;
        j1 = 0;
_L2:
        if (i1 >= l1)
        {
            break; /* Loop/switch isn't completed */
        }
        abyte1 = s1[i1];
        System.arraycopy(abyte1, 0, abyte0, j1, abyte1.length);
        j1 += abyte1.length;
        i1++;
        if (k1 == 0) goto _L2; else goto _L1
_L1:
        a(abyte0, file);
        flag = Arrays.equals(abyte0, a(file));
        return flag;
    }

    public static boolean a(String s1, byte abyte0[], byte abyte1[], byte abyte2[], byte abyte3[], byte abyte4[])
    {
        int k1 = App.am;
        File file = new File(App.au.getFilesDir(), z[164]);
        byte abyte5[] = abyte4;
        byte abyte6[][];
        int i1;
        int j1;
        int l1;
        boolean flag;
        if (abyte4 == null)
        {
            try
            {
                abyte5 = H();
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                throw s1;
            }
        }
        abyte4 = new byte[1];
        abyte4[0] = Byte.parseByte(s1);
        s1 = new byte[e.length + abyte4.length + abyte0.length + abyte3.length + abyte2.length + abyte5.length + abyte1.length];
        abyte6 = new byte[7][];
        abyte6[0] = e;
        abyte6[1] = abyte4;
        abyte6[2] = abyte0;
        abyte6[3] = abyte3;
        abyte6[4] = abyte2;
        abyte6[5] = abyte5;
        abyte6[6] = abyte1;
        l1 = abyte6.length;
        i1 = 0;
        j1 = 0;
        do
        {
            if (i1 >= l1)
            {
                break;
            }
            abyte0 = abyte6[i1];
            System.arraycopy(abyte0, 0, s1, j1, abyte0.length);
            j1 += abyte0.length;
            i1++;
        } while (k1 == 0);
        try
        {
            a(((byte []) (s1)), file);
            abyte0 = a(file);
            t();
            flag = Arrays.equals(s1, abyte0);
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            Log.e((new StringBuilder()).append(z[163]).append(s1.toString()).toString());
            return false;
        }
        return flag;
    }

    public static boolean a(byte abyte0[], String s1)
    {
        File file;
        boolean flag;
label0:
        {
            file = A();
            flag = a(file, abyte0, (new StringBuilder()).append(al0.a).append(s1).append(G()).toString(), f);
            abyte0 = y();
            boolean flag1;
            try
            {
                if (abyte0.exists())
                {
                    break label0;
                }
                flag1 = abyte0.mkdirs();
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[])
            {
                try
                {
                    throw abyte0;
                }
                // Misplaced declaration of an exception variable
                catch (byte abyte0[])
                {
                    throw abyte0;
                }
            }
            if (!flag1)
            {
                return flag;
            }
        }
        abyte0 = d();
        s1 = a(file);
        try
        {
            a(((byte []) (s1)), ((File) (abyte0)));
            boolean flag2 = Arrays.equals(s1, a(((File) (abyte0))));
            Log.i((new StringBuilder()).append(z[75]).append(flag2).toString());
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            Log.e(z[74]);
            return flag;
        }
        return flag;
    }

    private static byte[] a(int i1)
    {
        byte abyte0[];
        try
        {
            abyte0 = new byte[i1];
            SecureRandom.getInstance(z[26]).nextBytes(abyte0);
        }
        catch (NoSuchAlgorithmException nosuchalgorithmexception)
        {
            throw new RuntimeException(nosuchalgorithmexception);
        }
        return abyte0;
    }

    private static byte[] a(File file)
    {
        if (!file.exists()) goto _L2; else goto _L1
_L1:
        long l1 = file.length();
        if (l1 <= 0L) goto _L2; else goto _L3
_L3:
        ObjectInputStream objectinputstream = new ObjectInputStream(new FileInputStream(file));
        file = objectinputstream;
        byte abyte0[] = (byte[])(byte[])objectinputstream.readObject();
        if (objectinputstream == null)
        {
            break MISSING_BLOCK_LABEL_55;
        }
        objectinputstream.close();
        return abyte0;
        file;
        throw file;
        file;
        try
        {
            throw file;
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            Log.a(file);
        }
        return abyte0;
        Exception exception1;
        exception1;
        objectinputstream = null;
_L9:
        file = objectinputstream;
        Log.a(z[159], exception1);
        if (objectinputstream != null)
        {
            try
            {
                objectinputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch (File file)
            {
                Log.a(file);
            }
        }
_L2:
        return null;
        Exception exception;
        exception;
        file = null;
_L7:
        if (file == null)
        {
            break MISSING_BLOCK_LABEL_115;
        }
        file.close();
_L5:
        throw exception;
        file;
        try
        {
            throw file;
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            Log.a(file);
        }
        if (true) goto _L5; else goto _L4
_L4:
        exception;
        if (true) goto _L7; else goto _L6
_L6:
        exception1;
        if (true) goto _L9; else goto _L8
_L8:
    }

    private static byte[] a(File file, String s1, byte abyte0[])
    {
        byte abyte1[];
        byte abyte2[];
        abyte1 = null;
        abyte2 = a(file);
        if (abyte2 == null)
        {
            break MISSING_BLOCK_LABEL_233;
        }
        try
        {
            if (abyte2.length < abyte0.length + 4 + 16 + 20)
            {
                throw new InvalidParameterException((new StringBuilder()).append(file.toString()).append(z[17]).toString());
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            try
            {
                throw s1;
            }
            // Misplaced declaration of an exception variable
            catch (String s1) { }
            try
            {
                file.delete();
                if (s1 instanceof b6)
                {
                    throw (b6)s1;
                }
            }
            // Misplaced declaration of an exception variable
            catch (File file)
            {
                throw file;
            }
            break MISSING_BLOCK_LABEL_235;
        }
        int i1;
        abyte1 = new byte[abyte0.length];
        System.arraycopy(abyte2, 0, abyte1, 0, abyte0.length);
        i1 = abyte0.length;
        i1 += 0;
        try
        {
            if (!Arrays.equals(abyte1, abyte0))
            {
                throw new b6(null);
            }
            break MISSING_BLOCK_LABEL_132;
        }
        // Misplaced declaration of an exception variable
        catch (String s1) { }
        throw s1;
        abyte1 = new byte[4];
        System.arraycopy(abyte2, i1, abyte1, 0, 4);
        i1 += 4;
        abyte0 = new byte[16];
        System.arraycopy(abyte2, i1, abyte0, 0, 16);
        i1 += 16;
        s1 = new SecretKeySpec(a(s1, abyte1), z[16]);
        abyte1 = Cipher.getInstance(z[15]);
        abyte1.init(2, s1, new IvParameterSpec(abyte0));
        abyte1 = abyte1.doFinal(abyte2, i1, abyte2.length - i1);
        return abyte1;
        throw new RuntimeException(s1);
    }

    public static byte[] a(String s1)
    {
        byte abyte0[];
        byte abyte1[];
        File file;
        try
        {
            abyte1 = a(A(), (new StringBuilder()).append(al0.a).append(s1).append(G()).toString(), f);
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            Log.c(z[9], s1);
            return null;
        }
        abyte0 = abyte1;
        if (abyte1 != null) goto _L2; else goto _L1
_L1:
        file = d();
        abyte0 = a(file, (new StringBuilder()).append(al0.a).append(s1).append(G()).toString(), f);
        if (abyte0 == null)
        {
            break MISSING_BLOCK_LABEL_119;
        }
        s1 = A();
        file = a(file);
        a(((byte []) (file)), ((File) (s1)));
        Arrays.equals(file, a(((File) (s1))));
        Log.i(z[10]);
        J();
_L4:
        s1 = abyte0;
        if (App.am == 0) goto _L3; else goto _L2
_L2:
        L();
        s1 = abyte0;
_L3:
        return s1;
        s1;
        Log.e(z[8]);
          goto _L4
        s1;
        throw s1;
          goto _L4
    }

    private static byte[] a(String s1, byte abyte0[])
    {
        return (new SecretKeySpec(a(s1.getBytes(), abyte0, 16, 128).getEncoded(), z[63])).getEncoded();
    }

    public static byte[] a(byte abyte0[])
    {
        int k1 = App.am;
        String s1 = G();
        byte abyte1[];
        try
        {
            abyte1 = MessageDigest.getInstance(z[46]).digest(s1.getBytes(z[45]));
        }
        catch (NoSuchAlgorithmException nosuchalgorithmexception)
        {
            nosuchalgorithmexception = null;
        }
        catch (UnsupportedEncodingException unsupportedencodingexception)
        {
            unsupportedencodingexception = null;
        }
        if (abyte1 != null)
        {
            int i1;
            try
            {
                i1 = abyte1.length;
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[])
            {
                throw abyte0;
            }
            if (i1 > 0)
            {
                int j1 = 0;
                do
                {
                    if (j1 >= abyte0.length)
                    {
                        break;
                    }
                    abyte0[j1] = (byte)(abyte0[j1] ^ abyte1[j1 % abyte1.length]);
                    j1++;
                } while (k1 == 0);
            }
        }
        return abyte0;
    }

    public static byte[] a(byte abyte0[], byte abyte1[], boolean flag)
    {
        Object obj;
        String s1;
        Object obj1;
        obj1 = null;
        try
        {
            obj = MessageDigest.getInstance(z[67]);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Log.e((new StringBuilder()).append(z[65]).append(((NoSuchAlgorithmException) (obj)).toString()).toString());
            obj = null;
        }
        if (obj == null)
        {
            try
            {
                Log.e(z[66]);
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[])
            {
                throw abyte0;
            }
            return null;
        }
        s1 = "";
        if (flag)
        {
            s1 = a(Arrays.equals(abyte1, j));
        }
        if (s1 == null) goto _L2; else goto _L1
_L1:
        abyte1 = s1.getBytes(z[64]);
        int i1 = abyte1.length;
_L5:
        byte abyte2[] = new byte[abyte0.length + i1];
        UnsupportedEncodingException unsupportedencodingexception;
        if (i1 > 0)
        {
            System.arraycopy(abyte1, 0, abyte2, 0, abyte1.length);
            i1 += 0;
        } else
        {
            i1 = 0;
        }
        System.arraycopy(abyte0, 0, abyte2, i1, abyte0.length);
        ((MessageDigest) (obj)).reset();
        ((MessageDigest) (obj)).update(abyte2);
        return ((MessageDigest) (obj)).digest();
        unsupportedencodingexception;
        abyte1 = obj1;
_L3:
        Log.e((new StringBuilder()).append(z[68]).append(unsupportedencodingexception.toString()).toString());
        i1 = 0;
        continue; /* Loop/switch isn't completed */
        unsupportedencodingexception;
        if (true) goto _L3; else goto _L2
_L2:
        abyte1 = null;
        i1 = 0;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public static byte[] a(byte abyte0[], byte abyte1[][])
    {
        int j1 = App.am;
        Mac mac;
        int i1;
        int k1;
        try
        {
            mac = Mac.getInstance(z[19]);
            mac.init(new SecretKeySpec(abyte0, z[20]));
            k1 = abyte1.length;
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new RuntimeException(abyte0);
        }
        i1 = 0;
        if (i1 >= k1)
        {
            break; /* Loop/switch isn't completed */
        }
        mac.update(abyte1[i1]);
        i1++;
        if (j1 == 0) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_39;
_L1:
        abyte0 = mac.doFinal();
        return abyte0;
    }

    public static u b(File file)
    {
        Object obj3 = null;
        if (file.exists()) goto _L2; else goto _L1
_L1:
        Log.w(z[57]);
        Object obj1 = obj3;
_L4:
        return ((u) (obj1));
        file;
        throw file;
_L2:
        Object obj = new FileInputStream(file);
        obj1 = obj;
        u u1 = a(((InputStream) (obj)));
        file = u1;
        obj1 = file;
        if (obj != null)
        {
            try
            {
                ((FileInputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                Log.e((new StringBuilder()).append(z[61]).append(((Exception) (obj)).toString()).toString());
                return file;
            }
            return file;
        }
        if (true) goto _L4; else goto _L3
_L3:
        file;
        obj = null;
_L10:
        obj1 = obj;
        Log.w(z[56]);
        obj1 = obj3;
        if (obj != null)
        {
            try
            {
                ((FileInputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (File file)
            {
                Log.e((new StringBuilder()).append(z[58]).append(file.toString()).toString());
                return null;
            }
            return null;
        }
          goto _L4
        obj;
        obj = null;
_L9:
        obj1 = obj;
        Log.e((new StringBuilder()).append(z[53]).append(file.getAbsolutePath()).toString());
        obj1 = obj3;
        if (obj != null)
        {
            try
            {
                ((FileInputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (File file)
            {
                Log.e((new StringBuilder()).append(z[55]).append(file.toString()).toString());
                return null;
            }
            return null;
        }
          goto _L4
        obj;
        file = null;
_L8:
        Log.e((new StringBuilder()).append(z[54]).append(((IOException) (obj)).toString()).toString());
        obj1 = obj3;
        if (file == null) goto _L4; else goto _L5
_L5:
        try
        {
            file.close();
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            Log.e((new StringBuilder()).append(z[60]).append(file.toString()).toString());
            return null;
        }
        return null;
        file;
        obj1 = null;
_L7:
        if (obj1 != null)
        {
            try
            {
                ((FileInputStream) (obj1)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                Log.e((new StringBuilder()).append(z[59]).append(((Exception) (obj)).toString()).toString());
            }
        }
        throw file;
        file;
        continue; /* Loop/switch isn't completed */
        obj;
        obj1 = file;
        file = ((File) (obj));
        if (true) goto _L7; else goto _L6
_L6:
        Object obj2;
        obj2;
        file = ((File) (obj));
        obj = obj2;
          goto _L8
        obj2;
          goto _L9
        file;
          goto _L10
    }

    public static String b(String s1)
    {
        int i1;
        int j1;
        int l1;
        int k1 = App.am;
        Object obj;
        try
        {
            obj = MessageDigest.getInstance(z[157]);
            ((MessageDigest) (obj)).update(s1.getBytes());
            s1 = ((MessageDigest) (obj)).digest();
            obj = new StringBuilder();
            l1 = s1.length;
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            return null;
        }
        i1 = 0;
          goto _L1
_L6:
        ((StringBuilder) (obj)).append(Character.forDigit(j1 >> 4, 16));
        ((StringBuilder) (obj)).append(Character.forDigit(j1 % 16, 16));
        if (k1 == 0) goto _L3; else goto _L2
_L2:
        s1 = ((StringBuilder) (obj)).toString();
        return s1;
_L3:
        i1++;
_L1:
        if (i1 >= l1) goto _L2; else goto _L4
_L4:
        byte byte0 = s1[i1];
        j1 = byte0;
        if (byte0 < 0)
        {
            j1 = byte0 + 256;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    static void b(Application application)
    {
        n = false;
        g = a();
        d = P();
        t = p();
        i = M();
        m = q();
        c = I();
        s = c(application);
        l = G();
        o = y();
        r = d();
        h = A();
        k = f();
        q = K();
        n = true;
    }

    public static boolean b()
    {
        boolean flag;
        try
        {
            flag = r().exists();
        }
        catch (NullPointerException nullpointerexception)
        {
            throw nullpointerexception;
        }
        return !flag;
    }

    public static boolean b(byte abyte0[], String s1)
    {
label0:
        {
            try
            {
                if (!a(K(), abyte0, (new StringBuilder()).append(al0.g).append(s1).toString(), a))
                {
                    break label0;
                }
                App.T = abyte0;
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[])
            {
                throw abyte0;
            }
            return true;
        }
        return false;
    }

    public static byte[] b(Context context)
    {
        int i1 = App.am;
        MessageDigest messagedigest;
        byte abyte0[];
        context = new ZipFile((new ContextWrapper(context)).getPackageCodePath());
        context = context.getInputStream(context.getEntry(z[33]));
        messagedigest = MessageDigest.getInstance(z[36]);
        abyte0 = new byte[8192];
_L2:
        int j1 = context.read(abyte0);
        if (j1 <= 0)
        {
            break; /* Loop/switch isn't completed */
        }
        try
        {
            messagedigest.update(abyte0, 0, j1);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.e((new StringBuilder()).append(z[35]).append(context.toString()).toString());
            try
            {
                context = z[34].getBytes(z[32]);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                throw new Error(context);
            }
            return context;
        }
        if (i1 == 0) goto _L2; else goto _L1
_L1:
        context = messagedigest.digest();
        return context;
    }

    public static byte[] b(byte abyte0[])
    {
        return a(abyte0, e, false);
    }

    static Boolean c()
    {
        boolean flag;
        try
        {
            flag = Environment.getExternalStorageState().equals(z[7]);
        }
        catch (Exception exception)
        {
            return null;
        }
        return Boolean.valueOf(flag);
    }

    static boolean c(Application application)
    {
label0:
        {
            boolean flag;
            try
            {
                if (!n)
                {
                    break label0;
                }
                flag = s;
            }
            // Misplaced declaration of an exception variable
            catch (Application application)
            {
                throw application;
            }
            return flag;
        }
        return a(application, g());
    }

    public static boolean c(byte abyte0[], String s1)
    {
label0:
        {
            try
            {
                if (!a(f(), abyte0, (new StringBuilder()).append(al0.g).append(s1).toString(), a))
                {
                    break label0;
                }
                App.T = abyte0;
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[])
            {
                throw abyte0;
            }
            return true;
        }
        return false;
    }

    public static byte[] c(String s1)
    {
        try
        {
            s1 = a(f(), (new StringBuilder()).append(al0.g).append(s1).toString(), a);
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            Log.c(z[73], s1);
            return null;
        }
        return s1;
    }

    private static File d()
    {
label0:
        {
            File file;
            try
            {
                if (!n)
                {
                    break label0;
                }
                file = r;
            }
            catch (NullPointerException nullpointerexception)
            {
                throw nullpointerexception;
            }
            return file;
        }
        return new File(y(), z[12]);
    }

    public static boolean d(String s1)
    {
        boolean flag;
        boolean flag1;
        flag1 = false;
        File file = A();
        boolean flag2;
        try
        {
            flag2 = file.exists();
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            try
            {
                throw s1;
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                throw s1;
            }
        }
        flag = flag1;
        if (!flag2)
        {
            break MISSING_BLOCK_LABEL_47;
        }
        if (file.length() <= 0L)
        {
            return false;
        }
        flag = flag1;
        if (g(s1) != null)
        {
            flag = true;
        }
        return flag;
    }

    public static int e()
    {
        int i1;
label0:
        {
            i1 = App.am;
            try
            {
                if (b == 0)
                {
                    break label0;
                }
                i1 = b;
            }
            catch (IOException ioexception)
            {
                throw ioexception;
            }
            return i1;
        }
        Enumeration enumeration = (new DexFile(App.au.getApplicationInfo().sourceDir)).entries();
        do
        {
            if (!enumeration.hasMoreElements())
            {
                break;
            }
            enumeration.nextElement();
            b++;
        } while (i1 == 0);
_L2:
        return b;
        IOException ioexception1;
        ioexception1;
        Log.a(ioexception1);
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static byte[] e(String s1)
    {
        try
        {
            s1 = a(K(), (new StringBuilder()).append(al0.g).append(s1).toString(), a);
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            Log.w(z[160]);
            return null;
        }
        return s1;
    }

    private static File f()
    {
label0:
        {
            File file;
            try
            {
                if (!n)
                {
                    break label0;
                }
                file = k;
            }
            catch (NullPointerException nullpointerexception)
            {
                throw nullpointerexception;
            }
            return file;
        }
        return new File(App.au.getFilesDir(), z[152]);
    }

    static String f(String s1)
    {
        byte abyte0[] = Base64.decode(al0.i, 0);
        byte abyte1[] = a(App.au).getBytes();
        int i1 = abyte0.length;
        int j1 = abyte1.length;
        byte abyte2[] = new byte[i1 + j1];
        System.arraycopy(abyte0, 0, abyte2, 0, i1);
        System.arraycopy(abyte1, 0, abyte2, i1, j1);
        return new String(Base64.encode(a(abyte2, new byte[][] {
            a(abyte2, new byte[][] {
                s1.getBytes()
            })
        }), 2));
    }

    private static String g()
    {
        int i1;
        try
        {
            i1 = App.l;
        }
        catch (NullPointerException nullpointerexception)
        {
            try
            {
                throw nullpointerexception;
            }
            catch (NullPointerException nullpointerexception1)
            {
                throw nullpointerexception1;
            }
        }
        if (i1 == 3)
        {
            break MISSING_BLOCK_LABEL_16;
        }
        if (App.u != 3)
        {
            break MISSING_BLOCK_LABEL_26;
        }
        return al0.f;
        return al0.m;
    }

    public static byte[] g(String s1)
    {
        try
        {
            s1 = a(A(), (new StringBuilder()).append(al0.a).append(s1).append(G()).toString(), f);
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            Log.c(z[161], s1);
            return null;
        }
        return s1;
    }

    public static String h()
    {
        String s1 = G();
        if (s1 != null)
        {
            return b(s1);
        } else
        {
            return null;
        }
    }

    public static byte[] i()
    {
        byte abyte0[];
        try
        {
            KeyGenerator keygenerator = KeyGenerator.getInstance(z[79]);
            keygenerator.init(160, SecureRandom.getInstance(z[78]));
            abyte0 = keygenerator.generateKey().getEncoded();
        }
        catch (Exception exception)
        {
            throw new RuntimeException(exception);
        }
        return abyte0;
    }

    static boolean j()
    {
        Object obj = Build.PRODUCT;
        boolean flag;
        try
        {
            flag = TextUtils.isEmpty(((CharSequence) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        if (!flag)
        {
            boolean flag1;
            try
            {
                flag1 = ((String) (obj)).toLowerCase(Locale.US).contains(z[47]);
            }
            catch (NullPointerException nullpointerexception)
            {
                throw nullpointerexception;
            }
            if (!flag1)
            {
                String s1 = Build.MODEL;
                boolean flag2;
                try
                {
                    flag2 = TextUtils.isEmpty(s1);
                }
                catch (NullPointerException nullpointerexception1)
                {
                    throw nullpointerexception1;
                }
                if (!flag2)
                {
                    boolean flag3;
                    try
                    {
                        flag3 = s1.toLowerCase(Locale.US).contains(z[48]);
                    }
                    catch (NullPointerException nullpointerexception2)
                    {
                        throw nullpointerexception2;
                    }
                    if (!flag3)
                    {
                        String s2 = Build.MANUFACTURER;
                        boolean flag4;
                        try
                        {
                            flag4 = TextUtils.isEmpty(s2);
                        }
                        catch (NullPointerException nullpointerexception3)
                        {
                            throw nullpointerexception3;
                        }
                        if (!flag4)
                        {
                            boolean flag5;
                            try
                            {
                                flag5 = s2.toLowerCase(Locale.US).contains(z[50]);
                            }
                            catch (NullPointerException nullpointerexception4)
                            {
                                throw nullpointerexception4;
                            }
                            if (!flag5)
                            {
                                android.content.ContentResolver contentresolver;
                                try
                                {
                                    contentresolver = App.d;
                                }
                                catch (NullPointerException nullpointerexception5)
                                {
                                    throw nullpointerexception5;
                                }
                                if (contentresolver != null)
                                {
                                    String s3;
                                    try
                                    {
                                        s3 = z[49];
                                    }
                                    catch (NullPointerException nullpointerexception6)
                                    {
                                        throw nullpointerexception6;
                                    }
                                    if (s3 != null)
                                    {
                                        String s4;
                                        boolean flag6;
                                        try
                                        {
                                            s4 = android.provider.Settings.Secure.getString(App.d, z[51]);
                                        }
                                        catch (NullPointerException nullpointerexception9)
                                        {
                                            return true;
                                        }
                                        try
                                        {
                                            flag6 = TextUtils.isEmpty(s4);
                                        }
                                        catch (NullPointerException nullpointerexception7)
                                        {
                                            throw nullpointerexception7;
                                        }
                                        if (!flag6)
                                        {
                                            TelephonyManager telephonymanager;
                                            try
                                            {
                                                telephonymanager = App.z;
                                            }
                                            catch (NullPointerException nullpointerexception8)
                                            {
                                                throw nullpointerexception8;
                                            }
                                            if (telephonymanager != null)
                                            {
                                                return false;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return true;
    }

    public static boolean k()
    {
        return App.au.getSharedPreferences(z[38], 0).getBoolean(z[39], false);
    }

    private static byte[] l()
    {
        return a(4);
    }

    static boolean m()
    {
        try
        {
            Class.forName(z[72]);
        }
        catch (ClassNotFoundException classnotfoundexception)
        {
            return false;
        }
        return true;
    }

    public static String n()
    {
        StringBuilder stringbuilder;
        int i1;
        int j1;
        j1 = App.am;
        stringbuilder = new StringBuilder();
        i1 = 15;
        Enumeration enumeration = (new DexFile(App.au.getApplicationInfo().sourceDir)).entries();
_L2:
        if (!enumeration.hasMoreElements())
        {
            break; /* Loop/switch isn't completed */
        }
        i1--;
        if (i1 < 0 && j1 == 0)
        {
            break; /* Loop/switch isn't completed */
        }
        stringbuilder.append((String)enumeration.nextElement());
        stringbuilder.append(";");
        if (j1 == 0) goto _L2; else goto _L1
_L1:
        return stringbuilder.toString();
        IOException ioexception;
        ioexception;
        Log.a(ioexception);
        if (true) goto _L1; else goto _L3
_L3:
    }

    public static void o()
    {
        f().delete();
    }

    static boolean p()
    {
label0:
        {
            boolean flag;
            try
            {
                if (!n)
                {
                    break label0;
                }
                flag = t;
            }
            catch (NullPointerException nullpointerexception)
            {
                throw nullpointerexception;
            }
            return flag;
        }
        return Debug.isDebuggerConnected();
    }

    static boolean q()
    {
        int j1;
label0:
        {
            j1 = App.am;
            boolean flag;
            try
            {
                if (!n)
                {
                    break label0;
                }
                flag = m;
            }
            catch (Exception exception)
            {
                throw exception;
            }
            return flag;
        }
        File file = new File(z[158]);
        String as[];
        int i1;
        int k1;
        try
        {
            if (file.exists())
            {
                m = true;
            }
        }
        catch (Exception exception1)
        {
            try
            {
                throw exception1;
            }
            catch (Exception exception2) { }
        }
        as = p;
        k1 = as.length;
        i1 = 0;
        do
        {
            if (i1 >= k1)
            {
                break;
            }
            String s1 = as[i1];
            PackageManager packagemanager = App.au.getPackageManager();
            try
            {
                packagemanager.getPackageInfo(s1, 128);
                m = true;
            }
            catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception) { }
            i1++;
        } while (j1 == 0);
        return m;
    }

    private static File r()
    {
        return new File(App.au.getFilesDir(), z[52]);
    }

    public static Boolean s()
    {
        Object obj = d();
        boolean flag;
        try
        {
            flag = ((File) (obj)).exists();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        if (flag)
        {
            File file = A();
            boolean flag1;
            try
            {
                flag1 = file.exists();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
            if (flag1)
            {
                byte abyte0[] = a(file);
                obj = a(((File) (obj)));
                if (abyte0 == null || obj == null)
                {
                    return Boolean.valueOf(false);
                } else
                {
                    return Boolean.valueOf(Arrays.equals(abyte0, ((byte []) (obj))));
                }
            }
        }
        return null;
    }

    public static as4 t()
    {
        File file = r();
        if (file.exists()) goto _L2; else goto _L1
_L1:
        Log.w(z[76]);
_L4:
        return null;
        NullPointerException nullpointerexception;
        nullpointerexception;
        throw nullpointerexception;
_L2:
        Object obj = a(file);
        if (obj != null)
        {
            try
            {
                if (obj.length < e.length + 1 + 32 + 16 + 32 + 16 + 32)
                {
                    throw new InvalidParameterException((new StringBuilder()).append(file.toString()).append(z[77]).toString());
                }
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
            byte abyte0[] = new byte[e.length];
            System.arraycopy(obj, 0, abyte0, 0, e.length);
            int i1 = e.length + 0;
            try
            {
                if (!Arrays.equals(abyte0, e))
                {
                    throw new b6(null);
                }
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
            int j1 = i1 + 1;
            i1 = obj[i1];
            byte abyte1[] = new byte[32];
            System.arraycopy(obj, j1, abyte1, 0, 32);
            j1 += 32;
            byte abyte2[] = new byte[16];
            System.arraycopy(obj, j1, abyte2, 0, 16);
            j1 += 16;
            byte abyte3[] = new byte[32];
            System.arraycopy(obj, j1, abyte3, 0, 32);
            j1 += 32;
            byte abyte4[] = new byte[16];
            System.arraycopy(obj, j1, abyte4, 0, 16);
            byte abyte5[] = new byte[32];
            System.arraycopy(obj, j1 + 16, abyte5, 0, 32);
            return new as4(abyte0, String.valueOf(i1), abyte1, abyte2, abyte3, abyte4, abyte5);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    static int u()
    {
        AccountManager accountmanager = AccountManager.get(App.au.getApplicationContext());
        int i1 = -1;
        if (accountmanager != null)
        {
            try
            {
                i1 = accountmanager.getAccountsByType(z[30]).length;
            }
            catch (Exception exception)
            {
                return -1;
            }
        }
        return i1;
    }

    public static void v()
    {
        A().delete();
        d().delete();
    }

    public static byte[] w()
    {
        return H();
    }

    public static boolean x()
    {
        return A().exists();
    }

    private static File y()
    {
label0:
        {
            File file;
            try
            {
                if (!n)
                {
                    break label0;
                }
                file = o;
            }
            catch (NullPointerException nullpointerexception)
            {
                throw nullpointerexception;
            }
            return file;
        }
        return new File(App.aK, z[37]);
    }

    static boolean z()
    {
        return n;
    }

    static 
    {
        String as[];
        Object obj;
        String as1[];
        char c1;
        int i1;
        as = new String[166];
        obj = "\t\004-:F\004\r}";
        c1 = '\uFFFF';
        as1 = as;
        i1 = 0;
_L10:
        int j1;
        int k1;
        obj = ((String) (obj)).toCharArray();
        k1 = obj.length;
        j1 = 0;
_L7:
        if (k1 <= j1)
        {
            obj = (new String(((char []) (obj)))).intern();
            byte byte0;
            char c2;
            switch (c1)
            {
            default:
                as1[i1] = ((String) (obj));
                obj = "G\007$fV\r\031rwK\006[.`";
                i1 = 1;
                as1 = as;
                c1 = '\0';
                continue; /* Loop/switch isn't completed */

            case 0: // '\0'
                as1[i1] = ((String) (obj));
                obj = "\t\004-:F\004\r}";
                i1 = 2;
                as1 = as;
                c1 = '\001';
                continue; /* Loop/switch isn't completed */

            case 1: // '\001'
                as1[i1] = ((String) (obj));
                obj = "FD";
                i1 = 3;
                as1 = as;
                c1 = '\002';
                continue; /* Loop/switch isn't completed */

            case 2: // '\002'
                as1[i1] = ((String) (obj));
                i1 = 4;
                as1 = as;
                obj = "\t\004-:A\000\021>~\r\006\0330pV\000\03395";
                c1 = '\003';
                continue; /* Loop/switch isn't completed */

            case 3: // '\003'
                as1[i1] = ((String) (obj));
                i1 = 5;
                obj = "G\007$fV\r\031rm@\001\032rfW";
                c1 = '\004';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 4: // '\004'
                as1[i1] = ((String) (obj));
                i1 = 6;
                obj = "FD";
                c1 = '\005';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 5: // '\005'
                as1[i1] = ((String) (obj));
                i1 = 7;
                obj = "\005\033({V\r\020";
                c1 = '\006';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 6: // '\006'
                as1[i1] = ((String) (obj));
                i1 = 8;
                obj = "\035\032<wN\rT)z\002\037\0064aGH\035";
                c1 = '\007';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 7: // '\007'
                as1[i1] = ((String) (obj));
                i1 = 9;
                obj = "\032\021>zT\r\006$5V\007\0378{\002\000\021<qG\032T0|Q\005\025)vJ";
                c1 = '\b';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 8: // '\b'
                as1[i1] = ((String) (obj));
                i1 = 10;
                obj = "\017\021):PG\021";
                c1 = '\t';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 9: // '\t'
                as1[i1] = ((String) (obj));
                i1 = 11;
                obj = "\013\0330;U\000\025)fC\030\004";
                c1 = '\n';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 10: // '\n'
                as1[i1] = ((String) (obj));
                i1 = 12;
                obj = "F\0322xG\f\035<";
                c1 = '\013';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 11: // '\013'
                as1[i1] = ((String) (obj));
                i1 = 13;
                obj = "\013\0330;E\007\033:yG";
                c1 = '\f';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 12: // '\f'
                as1[i1] = ((String) (obj));
                i1 = 14;
                obj = "86\026QdZ#4aJ \031<vq 5lTL\fL\037\\v";
                c1 = '\r';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 13: // '\r'
                as1[i1] = ((String) (obj));
                i1 = 15;
                obj = ")1\016:m.6r[M8\0259qK\006\023";
                c1 = '\016';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 14: // '\016'
                as1[i1] = ((String) (obj));
                i1 = 16;
                obj = ")1\016:m.6r[M8\0259qK\006\023";
                c1 = '\017';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 15: // '\017'
                as1[i1] = ((String) (obj));
                i1 = 17;
                obj = "H\0074oGH\0314fO\t\000>}";
                c1 = '\020';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 16: // '\020'
                as1[i1] = ((String) (obj));
                i1 = 18;
                obj = "\t\034+tN\001\0204a[G\021/gM\032";
                c1 = '\021';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 17: // '\021'
                as1[i1] = ((String) (obj));
                i1 = 19;
                obj = " \031<vq 5l";
                c1 = '\022';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 18: // '\022'
                as1[i1] = ((String) (obj));
                i1 = 20;
                obj = " \031<vq 5l";
                c1 = '\023';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 19: // '\023'
                as1[i1] = ((String) (obj));
                i1 = 21;
                obj = "\033\r3vPG\035";
                c1 = '\024';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 20: // '\024'
                as1[i1] = ((String) (obj));
                i1 = 22;
                obj = "\005\033({V\r\020";
                c1 = '\025';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 21: // '\025'
                as1[i1] = ((String) (obj));
                i1 = 23;
                obj = "\033\r3vPG\0013t@\004\021}aMH\003/|V\rT";
                c1 = '\026';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 22: // '\026'
                as1[i1] = ((String) (obj));
                i1 = 24;
                obj = "\033\r3vPG\021}";
                c1 = '\027';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 23: // '\027'
                as1[i1] = ((String) (obj));
                i1 = 25;
                obj = "\033\r3vPG\021";
                c1 = '\030';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 24: // '\030'
                as1[i1] = ((String) (obj));
                i1 = 26;
                obj = ";<\034$r::\032";
                c1 = '\031';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 25: // '\031'
                as1[i1] = ((String) (obj));
                i1 = 27;
                obj = ")1\016:m.6r[M8\0259qK\006\023";
                c1 = '\032';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 26: // '\032'
                as1[i1] = ((String) (obj));
                i1 = 28;
                obj = "\035\032<wN\rT)z\002\037\0064aGH";
                c1 = '\033';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 27: // '\033'
                as1[i1] = ((String) (obj));
                i1 = 29;
                obj = ")1\016:m.6r[M8\0259qK\006\023";
                c1 = '\034';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 28: // '\034'
                as1[i1] = ((String) (obj));
                i1 = 30;
                obj = "\013\0330;E\007\033:yG";
                c1 = '\035';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 29: // '\035'
                as1[i1] = ((String) (obj));
                i1 = 31;
                obj = "G\007$fV\r\031ryK\n[1|@\013+0tN\004\033>JF\r\026(r}\031\0210`\f\033\033";
                c1 = '\036';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 30: // '\036'
                as1[i1] = ((String) (obj));
                i1 = 32;
                obj = "= \0338\032";
                c1 = '\037';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 31: // '\037'
                as1[i1] = ((String) (obj));
                i1 = 33;
                obj = "\013\030<fQ\r\007sqG\020";
                c1 = ' ';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 32: // ' '
                as1[i1] = ((String) (obj));
                i1 = 34;
                obj = "\006\0011y";
                c1 = '!';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 33: // '!'
                as1[i1] = ((String) (obj));
                i1 = 35;
                obj = "\t\004-:O\fArw[\034\021.:G\032\0062g\002";
                c1 = '"';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 34: // '"'
                as1[i1] = ((String) (obj));
                i1 = 36;
                obj = "%0h";
                c1 = '#';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 35: // '#'
                as1[i1] = ((String) (obj));
                i1 = 37;
                obj = "8\0062sK\004\021}EK\013\000(gG\033";
                c1 = '$';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 36: // '$'
                as1[i1] = ((String) (obj));
                i1 = 38;
                obj = "\013\0330;U\000\025)fC\030\004\002eP\r\0228gG\006\0278f";
                c1 = '%';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 37: // '%'
                as1[i1] = ((String) (obj));
                i1 = 39;
                obj = "\r\f)pP\006\0251JP\013+>zR\001\0219JV\007+4{V\r\0063tN";
                c1 = '&';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 38: // '&'
                as1[i1] = ((String) (obj));
                i1 = 40;
                obj = "\033\r3vPG\004/pDG\0078a\r\r\006/zP";
                c1 = '\'';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 39: // '\''
                as1[i1] = ((String) (obj));
                i1 = 41;
                obj = "\013\0330;U\000\025)fC\030\004\002eP\r\0228gG\006\0278f";
                c1 = '(';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 40: // '('
                as1[i1] = ((String) (obj));
                i1 = 42;
                obj = "\r\f)pP\006\0251JP\013+>zR\001\0219JV\007+4{V\r\0063tN";
                c1 = ')';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 41: // ')'
                as1[i1] = ((String) (obj));
                i1 = 43;
                obj = "\033\r3vPG\004/pDG\0078a";
                c1 = '*';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 42: // '*'
                as1[i1] = ((String) (obj));
                i1 = 44;
                obj = ";<\0348\020]B";
                c1 = '+';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 43: // '+'
                as1[i1] = ((String) (obj));
                i1 = 45;
                obj = "= \0338\032";
                c1 = ',';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 44: // ','
                as1[i1] = ((String) (obj));
                i1 = 46;
                obj = "%0h";
                c1 = '-';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 45: // '-'
                as1[i1] = ((String) (obj));
                i1 = 47;
                obj = "\033\0206";
                c1 = '.';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 46: // '.'
                as1[i1] = ((String) (obj));
                i1 = 48;
                obj = "\033\0206";
                c1 = '/';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 47: // '/'
                as1[i1] = ((String) (obj));
                i1 = 49;
                obj = "\t\0329gM\001\020\002|F";
                c1 = '0';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 48: // '0'
                as1[i1] = ((String) (obj));
                i1 = 50;
                obj = "\033\0206";
                c1 = '1';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 49: // '1'
                as1[i1] = ((String) (obj));
                i1 = 51;
                obj = "\t\0329gM\001\020\002|F";
                c1 = '2';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 50: // '2'
                as1[i1] = ((String) (obj));
                i1 = 52;
                obj = "\003\021$";
                c1 = '3';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 51: // '3'
                as1[i1] = ((String) (obj));
                i1 = 53;
                obj = "\n\025>~W\030\0274eJ\r\006rq@G\0238a\r\013\02532VH\0224{FH";
                c1 = '4';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 52: // '4'
                as1[i1] = ((String) (obj));
                i1 = 54;
                obj = "\n\025>~W\030\0274eJ\r\006rq@G\0238a\r\r\006/zPH";
                c1 = '5';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 53: // '5'
                as1[i1] = ((String) (obj));
                i1 = 55;
                obj = "\n\025>~W\030\0274eJ\r\006rq@G\0238a\r\001\0338gP\007\006}";
                c1 = '6';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 54: // '6'
                as1[i1] = ((String) (obj));
                i1 = 56;
                obj = "\n\025>~W\030\0274eJ\r\006r}G\t\0208g\017\005\035.xC\034\0275";
                c1 = '7';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 55: // '7'
                as1[i1] = ((String) (obj));
                i1 = 57;
                obj = "\n\025>~W\030\0378l\r\f\026rrG\034\004<gC\005\007rqM\r\007p{M\034Y8mK\033\0";
                c1 = '8';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 56: // '8'
                as1[i1] = ((String) (obj));
                i1 = 58;
                obj = "\n\025>~W\030\0274eJ\r\006rq@G\0238a\r\001\0338gP\007\006}";
                c1 = '9';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 57: // '9'
                as1[i1] = ((String) (obj));
                i1 = 59;
                obj = "\n\025>~W\030\0274eJ\r\006rq@G\0238a\r\001\0338gP\007\006}";
                c1 = ':';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 58: // ':'
                as1[i1] = ((String) (obj));
                i1 = 60;
                obj = "\n\025>~W\030\0274eJ\r\006rq@G\0238a\r\001\0338gP\007\006}";
                c1 = ';';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 59: // ';'
                as1[i1] = ((String) (obj));
                i1 = 61;
                obj = "\n\025>~W\030\0274eJ\r\006rq@G\0238a\r\001\0338gP\007\006}";
                c1 = '<';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 60: // '<'
                as1[i1] = ((String) (obj));
                i1 = 62;
                obj = "\007\0309JR\037";
                c1 = '=';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 61: // '='
                as1[i1] = ((String) (obj));
                i1 = 63;
                obj = ")1\016";
                c1 = '>';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 62: // '>'
                as1[i1] = ((String) (obj));
                i1 = 64;
                obj = "= \0338\032";
                c1 = '?';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 63: // '?'
                as1[i1] = ((String) (obj));
                i1 = 65;
                obj = "\013\0251vW\004\025)pC\000\025.}\r\f\035:pQ\034\021/5";
                c1 = '@';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 64: // '@'
                as1[i1] = ((String) (obj));
                i1 = 66;
                obj = "\013\0251vW\004\025)pC\000\025.}\r\f\035:pQ\034\021/5K\033T3`N\004";
                c1 = 'A';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 65: // 'A'
                as1[i1] = ((String) (obj));
                i1 = 67;
                obj = ";<\0348\020]B";
                c1 = 'B';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 66: // 'B'
                as1[i1] = ((String) (obj));
                i1 = 68;
                obj = "\013\0251vW\004\025)pC\000\025.}\r\r\032>zF\001\032::G\032\0062g\002";
                c1 = 'C';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 67: // 'C'
                as1[i1] = ((String) (obj));
                i1 = 69;
                obj = "\013\0330;C\006\020/zK\fZ>zO\005\0253qQF\0312{I\r\r";
                c1 = 'D';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 68: // 'D'
                as1[i1] = ((String) (obj));
                i1 = 70;
                obj = "\030\007";
                c1 = 'E';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 69: // 'E'
                as1[i1] = ((String) (obj));
                i1 = 71;
                obj = ";<\0348\020]B";
                c1 = 'F';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 70: // 'F'
                as1[i1] = ((String) (obj));
                i1 = 72;
                obj = "\007\006:;C\013\006<;c+&\034";
                c1 = 'G';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 71: // 'G'
                as1[i1] = ((String) (obj));
                i1 = 73;
                obj = "\030\025.fU\007\00695J\r\0259pPH\0314fO\t\000>}";
                c1 = 'H';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 72: // 'H'
                as1[i1] = ((String) (obj));
                i1 = 74;
                obj = "\033\021):W\006\025?yGH\00025U\032\035)p\002\r";
                c1 = 'I';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 73: // 'I'
                as1[i1] = ((String) (obj));
                i1 = 75;
                obj = "\032[8:";
                c1 = 'J';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 74: // 'J'
                as1[i1] = ((String) (obj));
                i1 = 76;
                obj = "\n\025>~W\030\0378l\r\017\021)|L\016\033rqM\r\007p{M\034Y8mK\033\0";
                c1 = 'K';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 75: // 'K'
                as1[i1] = ((String) (obj));
                i1 = 77;
                obj = "H\0074oGH\0314fO\t\000>}";
                c1 = 'L';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 76: // 'L'
                as1[i1] = ((String) (obj));
                i1 = 78;
                obj = ";<\034$r::\032";
                c1 = 'M';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 77: // 'M'
                as1[i1] = ((String) (obj));
                i1 = 79;
                obj = ")1\016";
                c1 = 'N';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 78: // 'N'
                as1[i1] = ((String) (obj));
                i1 = 80;
                obj = "G\0208c\r\013\0330;E\r\032$xM\034\0352{\f\033\001-pP\035\0078g\f\f\0258xM\006";
                c1 = 'O';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 79: // 'O'
                as1[i1] = ((String) (obj));
                i1 = 81;
                obj = "\013\0330;E\r\032$xM\034\0352{\f\033\001-pP\035\0078g";
                c1 = 'P';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 80: // 'P'
                as1[i1] = ((String) (obj));
                i1 = 82;
                obj = "%=\b\\";
                c1 = 'Q';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 81: // 'Q'
                as1[i1] = ((String) (obj));
                i1 = 83;
                obj = "\f\021?`E";
                c1 = 'R';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 82: // 'R'
                as1[i1] = ((String) (obj));
                i1 = 84;
                obj = "\t\0329gME\0359";
                c1 = 'S';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 83: // 'S'
                as1[i1] = ((String) (obj));
                i1 = 85;
                obj = "\f\021?`E";
                c1 = 'T';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 84: // 'T'
                as1[i1] = ((String) (obj));
                i1 = 86;
                obj = "\f\0250|C\006\023)z";
                c1 = 'U';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 85: // 'U'
                as1[i1] = ((String) (obj));
                i1 = 87;
                obj = "\t\0275zV\002\0253";
                c1 = 'V';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 86: // 'V'
                as1[i1] = ((String) (obj));
                i1 = 88;
                obj = "\032\0270|Z";
                c1 = 'W';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 87: // 'W'
                as1[i1] = ((String) (obj));
                i1 = 89;
                obj = "\016\001:`";
                c1 = 'X';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 88: // 'X'
                as1[i1] = ((String) (obj));
                i1 = 90;
                obj = "\017\0353rG\032\0068tN";
                c1 = 'Y';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 89: // 'Y'
                as1[i1] = ((String) (obj));
                i1 = 91;
                obj = "\005\035(|";
                c1 = 'Z';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 90: // 'Z'
                as1[i1] = ((String) (obj));
                i1 = 92;
                obj = "\f\021?`E";
                c1 = '[';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 91: // '['
                as1[i1] = ((String) (obj));
                i1 = 93;
                obj = ",\0250|C\0063\tZ";
                c1 = '\\';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 92: // '\\'
                as1[i1] = ((String) (obj));
                i1 = 94;
                obj = "?\0351qr\035\016'yG";
                c1 = ']';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 93: // ']'
                as1[i1] = ((String) (obj));
                i1 = 95;
                obj = ".\0068pzYD";
                c1 = '^';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 94: // '^'
                as1[i1] = ((String) (obj));
                i1 = 96;
                obj = "\016\0068pZYD";
                c1 = '_';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 95: // '_'
                as1[i1] = ((String) (obj));
                i1 = 97;
                obj = "\f\025/~[";
                c1 = '`';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 96: // '`'
                as1[i1] = ((String) (obj));
                i1 = 98;
                obj = "%\033\031ta\007";
                c1 = 'a';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 97: // 'a'
                as1[i1] = ((String) (obj));
                i1 = 99;
                obj = ">\0351yC\001\032\017Zo";
                c1 = 'b';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 98: // 'b'
                as1[i1] = ((String) (obj));
                i1 = 100;
                obj = "/=\023Rg:\"4yN\t\0353";
                c1 = 'c';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 99: // 'c'
                as1[i1] = ((String) (obj));
                i1 = 101;
                obj = "+\0064fI\r\0302Gm%";
                c1 = 'd';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 100: // 'd'
                as1[i1] = ((String) (obj));
                i1 = 102;
                obj = ")\0329gME=\031";
                c1 = 'e';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 101: // 'e'
                as1[i1] = ((String) (obj));
                i1 = 103;
                obj = "! \033@l2";
                c1 = 'f';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 102: // 'f'
                as1[i1] = ((String) (obj));
                i1 = 104;
                obj = ")\0275zV\002\0253";
                c1 = 'g';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 103: // 'g'
                as1[i1] = ((String) (obj));
                i1 = 105;
                obj = "\f\021?`E";
                c1 = 'h';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 104: // 'h'
                as1[i1] = ((String) (obj));
                i1 = 106;
                obj = "\030\0351zV\020";
                c1 = 'i';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 105: // 'i'
                as1[i1] = ((String) (obj));
                i1 = 107;
                obj = "\f\021?`E";
                c1 = 'j';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 106: // 'j'
                as1[i1] = ((String) (obj));
                i1 = 108;
                obj = ".\001:`o\007\020";
                c1 = 'k';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 107: // 'k'
                as1[i1] = ((String) (obj));
                i1 = 109;
                obj = "\001\000;`L\022";
                c1 = 'l';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 108: // 'l'
                as1[i1] = ((String) (obj));
                i1 = 110;
                obj = ":Z\b;pFEd'\022";
                c1 = 'm';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 109: // 'm'
                as1[i1] = ((String) (obj));
                i1 = 111;
                obj = "\013\r<{M\017\0213";
                c1 = 'n';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 110: // 'n'
                as1[i1] = ((String) (obj));
                i1 = 112;
                obj = ",\025/~[";
                c1 = 'o';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 111: // 'o'
                as1[i1] = ((String) (obj));
                i1 = 113;
                obj = "\013\0064fI\r\0302gM\005";
                c1 = 'p';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 112: // 'p'
                as1[i1] = ((String) (obj));
                i1 = 114;
                obj = "\036\0351yC\001\032/zO";
                c1 = 'q';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 113: // 'q'
                as1[i1] = ((String) (obj));
                i1 = 115;
                obj = "$\035)p\005\006\0353r\002:\0330";
                c1 = 'r';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 114: // 'r'
                as1[i1] = ((String) (obj));
                i1 = 116;
                obj = "\t\004-:A\035\007)zOE\0062x\002";
                c1 = 's';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 115: // 's'
                as1[i1] = ((String) (obj));
                i1 = 117;
                obj = "/\0353rG\032&8tN";
                c1 = 't';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 116: // 't'
                as1[i1] = ((String) (obj));
                i1 = 118;
                obj = ">\0351yC\001\032\017Zo";
                c1 = 'u';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 117: // 'u'
                as1[i1] = ((String) (obj));
                i1 = 119;
                obj = "8\021/vG\030\0004zLH6(|N\f";
                c1 = 'v';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 118: // 'v'
                as1[i1] = ((String) (obj));
                i1 = 120;
                obj = "$\033/QO\007\020\023Vv\r\0250";
                c1 = 'w';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 119: // 'w'
                as1[i1] = ((String) (obj));
                i1 = 121;
                obj = "\004\0218qP\007\0359";
                c1 = 'x';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 120: // 'x'
                as1[i1] = ((String) (obj));
                i1 = 122;
                obj = "$\0218QP'\035\031";
                c1 = 'y';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 121: // 'y'
                as1[i1] = ((String) (obj));
                i1 = 123;
                obj = "\n\0352{K\020";
                c1 = 'z';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 122: // 'z'
                as1[i1] = ((String) (obj));
                i1 = 124;
                obj = "00\034{F\032\0334q";
                c1 = '{';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 123: // '{'
                as1[i1] = ((String) (obj));
                i1 = 125;
                obj = "\f\021?`E";
                c1 = '|';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 124: // '|'
                as1[i1] = ((String) (obj));
                i1 = 126;
                obj = "\030\021/vG\030\0004zL";
                c1 = '}';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 125: // '}'
                as1[i1] = ((String) (obj));
                i1 = 127;
                obj = "\020\020<{F\032\0334q";
                c1 = '~';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 126: // '~'
                as1[i1] = ((String) (obj));
                i1 = 128;
                obj = "\f\021?`Q";
                c1 = '\177';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 127: // '\177'
                as1[i1] = ((String) (obj));
                i1 = 129;
                obj = "\f\021?`E";
                c1 = '\200';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 128: 
                as1[i1] = ((String) (obj));
                i1 = 130;
                obj = "\017\0353rG\032\0024yN\001\0253";
                c1 = '\201';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 129: 
                as1[i1] = ((String) (obj));
                i1 = 131;
                obj = ",\021?`Q:;\020";
                c1 = '\202';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 130: 
                as1[i1] = ((String) (obj));
                i1 = 132;
                obj = ",\021%aG\032S.5d\007\0304zo\007\020";
                c1 = '\203';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 131: 
                as1[i1] = ((String) (obj));
                i1 = 133;
                obj = "\004\033/qO\007\020";
                c1 = '\204';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 132: 
                as1[i1] = ((String) (obj));
                i1 = 134;
                obj = "\f\021?`E";
                c1 = '\205';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 133: 
                as1[i1] = ((String) (obj));
                i1 = 135;
                obj = "\016\0062lF\036\0351yC\001\032";
                c1 = '\206';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 134: 
                as1[i1] = ((String) (obj));
                i1 = 136;
                obj = "\013\r<{M\017\0213";
                c1 = '\207';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 135: 
                as1[i1] = ((String) (obj));
                i1 = 137;
                obj = ".\0062lF>\0351yC\001\032";
                c1 = '\210';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 136: 
                as1[i1] = ((String) (obj));
                i1 = 138;
                obj = ".\0062lM8\030(f";
                c1 = '\211';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 137: 
                as1[i1] = ((String) (obj));
                i1 = 139;
                obj = "E&\036Xk0";
                c1 = '\212';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 138: 
                as1[i1] = ((String) (obj));
                i1 = 140;
                obj = "*\0352{K\020";
                c1 = '\213';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 139: 
                as1[i1] = ((String) (obj));
                i1 = 141;
                obj = "\005\0339tA\007";
                c1 = '\214';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 140: 
                as1[i1] = ((String) (obj));
                i1 = 142;
                obj = "\016\0062lM\030\030(f";
                c1 = '\215';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 141: 
                as1[i1] = ((String) (obj));
                i1 = 143;
                obj = "8\0351zV\020&2x";
                c1 = '\216';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 142: 
                as1[i1] = ((String) (obj));
                i1 = 144;
                obj = "\016\0331|M\005\0339";
                c1 = '\217';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 143: 
                as1[i1] = ((String) (obj));
                i1 = 145;
                obj = "\016\0256pq\000\0312z";
                c1 = '\220';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 144: 
                as1[i1] = ((String) (obj));
                i1 = 146;
                obj = "\f\021?`E";
                c1 = '\221';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 145: 
                as1[i1] = ((String) (obj));
                i1 = 147;
                obj = "\016\0256pQ\000\0312z";
                c1 = '\222';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 146: 
                as1[i1] = ((String) (obj));
                i1 = 148;
                obj = "\f\021?`E";
                c1 = '\223';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 147: 
                as1[i1] = ((String) (obj));
                i1 = 149;
                obj = "\037\0351qR\035\016'yG";
                c1 = '\224';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 148: 
                as1[i1] = ((String) (obj));
                i1 = 150;
                obj = "\032\001/$\033ZD";
                c1 = '\225';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 149: 
                as1[i1] = ((String) (obj));
                i1 = 151;
                obj = "\004\035)pL\001\032:";
                c1 = '\226';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 150: 
                as1[i1] = ((String) (obj));
                i1 = 152;
                obj = "\030\003";
                c1 = '\227';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 151: 
                as1[i1] = ((String) (obj));
                i1 = 153;
                obj = "\t\004-:O\fArpP\032\033/5";
                c1 = '\230';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 152: 
                as1[i1] = ((String) (obj));
                i1 = 154;
                obj = "%0h";
                c1 = '\231';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 153: 
                as1[i1] = ((String) (obj));
                i1 = 155;
                obj = "\006\0011y";
                c1 = '\232';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 154: 
                as1[i1] = ((String) (obj));
                i1 = 156;
                obj = "\013\030<fQ\r\007sqG\020";
                c1 = '\233';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 155: 
                as1[i1] = ((String) (obj));
                i1 = 157;
                obj = "%0h";
                c1 = '\234';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 156: 
                as1[i1] = ((String) (obj));
                i1 = 158;
                obj = "G\0313a\r\033\020>tP\f[?fV\016\0331qG\032[\024{R\035\000\020tR\030\021/:A\007\031swN\035\021.aC\013\037.;C\030\0040tP\034Z>sE";
                c1 = '\235';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 157: 
                as1[i1] = ((String) (obj));
                i1 = 159;
                obj = "\017\021)5@\021\00085C\032\006<l";
                c1 = '\236';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 158: 
                as1[i1] = ((String) (obj));
                i1 = 160;
                obj = "\007\026;:R\037[2yFG\0348tF\r\006pxK\033\031<aA\0";
                c1 = '\237';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 159: 
                as1[i1] = ((String) (obj));
                i1 = 161;
                obj = "\032\021>zT\r\006$5V\007\0378{\002\000\021<qG\032T0|Q\005\025)vJ";
                c1 = '\240';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 160: 
                as1[i1] = ((String) (obj));
                i1 = 162;
                obj = "\032\027";
                c1 = '\241';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 161: 
                as1[i1] = ((String) (obj));
                i1 = 163;
                obj = "\n\025>~W\030\0378l\r\033\021):W\006\025?yGE\00028U\032\035)p\002";
                c1 = '\242';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 162: 
                as1[i1] = ((String) (obj));
                i1 = 164;
                obj = "\003\021$";
                c1 = '\243';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 163: 
                as1[i1] = ((String) (obj));
                i1 = 165;
                obj = "XDm%\022XDm%";
                c1 = '\244';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 164: 
                as1[i1] = ((String) (obj));
                z = as;
                as = new String[11];
                obj = "\013\0330;@\004\0018fV\t\0276f\f\033\021<gA\000\025-e";
                c1 = '\245';
                as1 = as;
                i1 = 0;
                continue; /* Loop/switch isn't completed */

            case 165: 
                as1[i1] = ((String) (obj));
                obj = "\013\0330;@\004\0018fV\t\0276f\f\000\0330p";
                c1 = '\246';
                i1 = 1;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 166: 
                as1[i1] = ((String) (obj));
                obj = "\013\0330;@\004\0018fV\t\0276f\f\033\021)`R";
                c1 = '\247';
                i1 = 2;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 167: 
                as1[i1] = ((String) (obj));
                obj = "\013\0330;@\004\0018fV\t\0276f\f\t\004-sK\006\0208g";
                c1 = '\250';
                i1 = 3;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 168: 
                as1[i1] = ((String) (obj));
                i1 = 4;
                obj = "\013\0330;@\004\0018fV\t\0276f\f\033\021)aK\006\023.";
                c1 = '\251';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 169: 
                as1[i1] = ((String) (obj));
                i1 = 5;
                obj = "\013\0330;@\004\0018fV\t\0276f\f\n\007)sM\004\0208g";
                c1 = '\252';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 170: 
                as1[i1] = ((String) (obj));
                i1 = 6;
                obj = "\013\0330;@\004\0018fV\t\0276f\f\t\004-fG\034\0004{E\033";
                c1 = '\253';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 171: 
                as1[i1] = ((String) (obj));
                i1 = 7;
                obj = "\013\0330;@\004\0018fV\t\0276f\f\t\004-xC\032\0";
                c1 = '\254';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 172: 
                as1[i1] = ((String) (obj));
                i1 = 8;
                obj = "\013\0330;@\004\0018fV\t\0276f\f\t\027>pN\r\0062xG\034\021/`K";
                c1 = '\255';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 173: 
                as1[i1] = ((String) (obj));
                i1 = 9;
                obj = "\013\0330;@\004\0018fV\t\0276f\f*\007)VM\005\031<{F8\0062vG\033\0072g";
                c1 = '\256';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 174: 
                as1[i1] = ((String) (obj));
                i1 = 10;
                obj = "\013\0330;@\004\0018fV\t\0276f\f\033F-";
                c1 = '\257';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 175: 
                as1[i1] = ((String) (obj));
                break;
            }
            break; /* Loop/switch isn't completed */
        }
        c2 = obj[j1];
        j1 % 5;
        JVM INSTR tableswitch 0 3: default 4224
    //                   0 4247
    //                   1 4254
    //                   2 4261
    //                   3 4268;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_4268;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        byte0 = 34;
_L8:
        obj[j1] = (char)(byte0 ^ c2);
        j1++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 104;
          goto _L8
_L3:
        byte0 = 116;
          goto _L8
_L4:
        byte0 = 93;
          goto _L8
        byte0 = 21;
          goto _L8
        if (true) goto _L10; else goto _L9
_L9:
        p = as;
        a = (new byte[] {
            0, 1
        });
        f = (new byte[] {
            0, 2
        });
        j = (new byte[] {
            0, 1
        });
        u = (new byte[] {
            0, 2
        });
        e = (new byte[] {
            0, 1
        });
        l = null;
        g = null;
        d = false;
        t = false;
        i = false;
        m = false;
        c = false;
        s = false;
        r = null;
        h = null;
        o = null;
        k = null;
        q = null;
        b = 0;
        n = false;
    }
}
