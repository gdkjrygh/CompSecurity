// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.internal;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.res.Resources;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.Debug;
import android.os.StatFs;
import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileReader;
import java.io.Flushable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

// Referenced classes of package com.crashlytics.android.internal:
//            ac, v, q, ad

public final class ab
{

    public static final Comparator a = new ac();
    private static Boolean b = null;
    private static final char c[] = {
        '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 
        'a', 'b', 'c', 'd', 'e', 'f'
    };
    private static long d = -1L;
    private static Boolean e = null;

    public static int a(Context context, String s, String s1)
    {
        Resources resources = context.getResources();
        int j = context.getApplicationContext().getApplicationInfo().icon;
        if (j > 0)
        {
            context = context.getResources().getResourcePackageName(j);
        } else
        {
            context = context.getPackageName();
        }
        return resources.getIdentifier(s, s1, context);
    }

    public static int a(boolean flag)
    {
        float f1 = b(v.a().getContext());
        if (!flag)
        {
            return 1;
        }
        if (flag && (double)f1 >= 99D)
        {
            return 3;
        }
        return !flag || (double)f1 >= 99D ? 0 : 2;
    }

    public static long a(Context context)
    {
        android.app.ActivityManager.MemoryInfo memoryinfo = new android.app.ActivityManager.MemoryInfo();
        ((ActivityManager)context.getSystemService("activity")).getMemoryInfo(memoryinfo);
        return memoryinfo.availMem;
    }

    private static long a(String s, String s1, int j)
    {
        return Long.parseLong(s.split(s1)[0].trim()) * (long)j;
    }

    public static android.app.ActivityManager.RunningAppProcessInfo a(String s, Context context)
    {
label0:
        {
            context = ((ActivityManager)context.getSystemService("activity")).getRunningAppProcesses();
            if (context == null)
            {
                break label0;
            }
            context = context.iterator();
            android.app.ActivityManager.RunningAppProcessInfo runningappprocessinfo;
            do
            {
                if (!context.hasNext())
                {
                    break label0;
                }
                runningappprocessinfo = (android.app.ActivityManager.RunningAppProcessInfo)context.next();
            } while (!runningappprocessinfo.processName.equals(s));
            return runningappprocessinfo;
        }
        return null;
    }

    public static SharedPreferences a()
    {
        return v.a().getContext().getSharedPreferences("com.crashlytics.prefs", 0);
    }

    public static String a(int j)
    {
        if (j < 0)
        {
            throw new IllegalArgumentException("value must be zero or greater");
        } else
        {
            return String.format(Locale.US, "%1$10s", new Object[] {
                Integer.valueOf(j)
            }).replace(' ', '0');
        }
    }

    public static String a(Context context, String s)
    {
        int j = a(context, s, "string");
        if (j > 0)
        {
            return context.getString(j);
        } else
        {
            return "";
        }
    }

    private static String a(File file, String s)
    {
        Object obj;
        Object obj1;
        obj = null;
        obj1 = null;
        if (!file.exists())
        {
            break MISSING_BLOCK_LABEL_95;
        }
        BufferedReader bufferedreader = new BufferedReader(new FileReader(file), 1024);
_L2:
        obj = bufferedreader;
        String s1 = bufferedreader.readLine();
        obj = obj1;
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_89;
        }
        obj = bufferedreader;
        String as[] = Pattern.compile("\\s*:\\s*").split(s1, 2);
        obj = bufferedreader;
        if (as.length <= 1) goto _L2; else goto _L1
_L1:
        obj = bufferedreader;
        if (!as[0].equals(s)) goto _L2; else goto _L3
_L3:
        obj = as[1];
        a(((Closeable) (bufferedreader)), "Failed to close system file reader.");
        return ((String) (obj));
        Exception exception;
        exception;
        s = null;
_L7:
        obj = s;
        v.a().b().a("Crashlytics", (new StringBuilder("Error parsing ")).append(file).toString(), exception);
        a(((Closeable) (s)), "Failed to close system file reader.");
        return null;
        file;
        obj = null;
_L5:
        a(((Closeable) (obj)), "Failed to close system file reader.");
        throw file;
        file;
        if (true) goto _L5; else goto _L4
_L4:
        exception;
        s = bufferedreader;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public static String a(InputStream inputstream)
        throws IOException
    {
        inputstream = (new Scanner(inputstream)).useDelimiter("\\A");
        if (inputstream.hasNext())
        {
            return inputstream.next();
        } else
        {
            return "";
        }
    }

    public static String a(String s)
    {
        return a(s.getBytes(), "SHA-1");
    }

    public static String a(byte abyte0[])
    {
        char ac1[] = new char[abyte0.length << 1];
        for (int j = 0; j < abyte0.length; j++)
        {
            int k = abyte0[j] & 0xff;
            ac1[j << 1] = c[k >>> 4];
            ac1[(j << 1) + 1] = c[k & 0xf];
        }

        return new String(ac1);
    }

    private static String a(byte abyte0[], String s)
    {
        MessageDigest messagedigest;
        try
        {
            messagedigest = MessageDigest.getInstance(s);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            v.a().b().a("Crashlytics", (new StringBuilder("Could not create hashing algorithm: ")).append(s).append(", returning empty string.").toString(), abyte0);
            return "";
        }
        messagedigest.update(abyte0);
        return a(messagedigest.digest());
    }

    public static transient String a(String as[])
    {
        if (as == null || as.length == 0)
        {
            return null;
        }
        Object obj = new ArrayList();
        int k = as.length;
        for (int j = 0; j < k; j++)
        {
            String s = as[j];
            if (s != null)
            {
                ((List) (obj)).add(s.replace("-", "").toLowerCase(Locale.US));
            }
        }

        Collections.sort(((List) (obj)));
        as = new StringBuilder();
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); as.append((String)((Iterator) (obj)).next())) { }
        as = as.toString();
        if (as.length() > 0)
        {
            return a(((String) (as)));
        } else
        {
            return null;
        }
    }

    public static void a(int j, String s)
    {
        if (e(v.a().getContext()))
        {
            v.a().b().a(4, "Crashlytics", s);
        }
    }

    public static void a(Closeable closeable, String s)
    {
        if (closeable == null)
        {
            break MISSING_BLOCK_LABEL_10;
        }
        closeable.close();
        return;
        closeable;
        v.a().b().a("Crashlytics", s, closeable);
        return;
    }

    public static void a(Flushable flushable, String s)
    {
        if (flushable == null)
        {
            break MISSING_BLOCK_LABEL_10;
        }
        flushable.flush();
        return;
        flushable;
        v.a().b().a("Crashlytics", s, flushable);
        return;
    }

    public static void a(InputStream inputstream, OutputStream outputstream, byte abyte0[])
        throws IOException
    {
        do
        {
            int j = inputstream.read(abyte0);
            if (j != -1)
            {
                outputstream.write(abyte0, 0, j);
            } else
            {
                return;
            }
        } while (true);
    }

    public static boolean a(Context context, String s, boolean flag)
    {
        boolean flag1 = flag;
        if (context != null)
        {
            Resources resources = context.getResources();
            flag1 = flag;
            if (resources != null)
            {
                int j = a(context, s, "bool");
                if (j > 0)
                {
                    flag1 = resources.getBoolean(j);
                } else
                {
                    int k = a(context, s, "string");
                    flag1 = flag;
                    if (k > 0)
                    {
                        return Boolean.parseBoolean(context.getString(k));
                    }
                }
            }
        }
        return flag1;
    }

    public static float b(Context context)
    {
        context = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        int j = context.getIntExtra("level", -1);
        int k = context.getIntExtra("scale", -1);
        return (float)j / (float)k;
    }

    public static int b()
    {
        return ad.a().ordinal();
    }

    public static long b(String s)
    {
        s = new StatFs(s);
        long l = s.getBlockSize();
        return (long)s.getBlockCount() * l - (long)s.getAvailableBlocks() * l;
    }

    public static String b(int j)
    {
        switch (j)
        {
        default:
            return "?";

        case 7: // '\007'
            return "A";

        case 3: // '\003'
            return "D";

        case 6: // '\006'
            return "E";

        case 4: // '\004'
            return "I";

        case 2: // '\002'
            return "V";

        case 5: // '\005'
            return "W";
        }
    }

    private static String b(InputStream inputstream)
    {
        MessageDigest messagedigest;
        byte abyte0[];
        messagedigest = MessageDigest.getInstance("SHA-1");
        abyte0 = new byte[1024];
_L1:
        int j = inputstream.read(abyte0);
label0:
        {
            if (j == -1)
            {
                break label0;
            }
            try
            {
                messagedigest.update(abyte0, 0, j);
            }
            // Misplaced declaration of an exception variable
            catch (InputStream inputstream)
            {
                v.a().b().a("Crashlytics", "Could not calculate hash for app icon.", inputstream);
                return "";
            }
        }
          goto _L1
        inputstream = a(messagedigest.digest());
        return inputstream;
    }

    public static Cipher b(int j, String s)
        throws InvalidKeyException
    {
        if (s.length() < 32)
        {
            throw new InvalidKeyException("Key must be at least 32 bytes.");
        }
        s = new SecretKeySpec(s.getBytes(), 0, 32, "AES/ECB/PKCS7Padding");
        Cipher cipher;
        try
        {
            cipher = Cipher.getInstance("AES/ECB/PKCS7Padding");
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            v.a().b().a("Crashlytics", "Could not create Cipher for AES/ECB/PKCS7Padding - should never happen.", s);
            throw new RuntimeException(s);
        }
        cipher.init(1, s);
        return cipher;
    }

    public static long c()
    {
        com/crashlytics/android/internal/ab;
        JVM INSTR monitorenter ;
        if (d != -1L) goto _L2; else goto _L1
_L1:
        String s;
        s = a(new File("/proc/meminfo"), "MemTotal");
        if (TextUtils.isEmpty(s))
        {
            break MISSING_BLOCK_LABEL_194;
        }
        s = s.toUpperCase(Locale.US);
        if (!s.endsWith("KB")) goto _L4; else goto _L3
_L3:
        long l = a(s, "KB", 1024);
_L5:
        d = l;
_L2:
        l = d;
        com/crashlytics/android/internal/ab;
        JVM INSTR monitorexit ;
        return l;
_L4:
label0:
        {
            if (!s.endsWith("MB"))
            {
                break label0;
            }
            l = a(s, "MB", 0x100000);
        }
          goto _L5
label1:
        {
            if (!s.endsWith("GB"))
            {
                break label1;
            }
            l = a(s, "GB", 0x40000000);
        }
          goto _L5
        v.a().b().a("Crashlytics", (new StringBuilder("Unexpected meminfo format while computing RAM: ")).append(s).toString());
        l = 0L;
          goto _L5
        NumberFormatException numberformatexception;
        numberformatexception;
        v.a().b().a("Crashlytics", (new StringBuilder("Unexpected meminfo format while computing RAM: ")).append(s).toString(), numberformatexception);
        l = 0L;
          goto _L5
        Exception exception;
        exception;
        throw exception;
    }

    public static void c(String s)
    {
        if (e(v.a().getContext()))
        {
            v.a().b().a("Crashlytics", s);
        }
    }

    public static boolean c(Context context)
    {
        if (d())
        {
            return false;
        }
        return ((SensorManager)context.getSystemService("sensor")).getDefaultSensor(8) != null;
    }

    public static void d(String s)
    {
        if (e(v.a().getContext()))
        {
            v.a().b().d("Crashlytics", s);
        }
    }

    public static boolean d()
    {
        String s = android.provider.Settings.Secure.getString(v.a().getContext().getContentResolver(), "android_id");
        return "sdk".equals(Build.PRODUCT) || "google_sdk".equals(Build.PRODUCT) || s == null;
    }

    public static boolean d(Context context)
    {
        boolean flag = false;
        if (e == null)
        {
            if (!a(context, "com.crashlytics.SilenceCrashlyticsLogCat", false))
            {
                flag = true;
            }
            e = Boolean.valueOf(flag);
        }
        return e.booleanValue();
    }

    public static boolean e()
    {
        String s;
        boolean flag;
        flag = d();
        s = Build.TAGS;
        break MISSING_BLOCK_LABEL_8;
        if ((flag || s == null || !s.contains("test-keys")) && !(new File("/system/app/Superuser.apk")).exists())
        {
            File file = new File("/system/xbin/su");
            if (flag || !file.exists())
            {
                return false;
            }
        }
        return true;
    }

    public static boolean e(Context context)
    {
        if (b == null)
        {
            b = Boolean.valueOf(a(context, "com.crashlytics.Trace", false));
        }
        return b.booleanValue();
    }

    public static boolean e(String s)
    {
        return s == null || s.length() == 0;
    }

    public static int f()
    {
label0:
        {
            int l = 0;
            int j;
            int k;
            if (d())
            {
                k = 1;
            } else
            {
                k = 0;
            }
            j = k;
            if (e())
            {
                j = k | 2;
            }
            if (!Debug.isDebuggerConnected())
            {
                k = l;
                if (!Debug.waitingForDebugger())
                {
                    break label0;
                }
            }
            k = 1;
        }
        l = j;
        if (k != 0)
        {
            l = j | 4;
        }
        return l;
    }

    public static boolean f(Context context)
    {
        return (context.getApplicationInfo().flags & 2) != 0;
    }

    public static String g(Context context)
    {
        Object obj1 = null;
        context = context.getResources().openRawResource(h(context));
        Object obj = context;
        String s = b(context);
        obj = context;
        boolean flag = e(s);
        if (flag)
        {
            obj = obj1;
        } else
        {
            obj = s;
        }
        a(context, "Failed to close icon input stream.");
        return ((String) (obj));
        Exception exception;
        exception;
        context = null;
_L4:
        obj = context;
        v.a().b().a("Crashlytics", "Could not calculate hash for app icon.", exception);
        a(context, "Failed to close icon input stream.");
        return null;
        context;
        obj = null;
_L2:
        a(((Closeable) (obj)), "Failed to close icon input stream.");
        throw context;
        context;
        if (true) goto _L2; else goto _L1
_L1:
        exception;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static int h(Context context)
    {
        return context.getApplicationContext().getApplicationInfo().icon;
    }

    public static String i(Context context)
    {
        String s = null;
        int j = a(context, "com.crashlytics.android.build_id", "string");
        if (j != 0)
        {
            s = context.getResources().getString(j);
            v.a().b().a("Crashlytics", (new StringBuilder("Build ID is: ")).append(s).toString());
        }
        return s;
    }

}
