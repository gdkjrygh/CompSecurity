// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.a.f;

import android.app.ActivityManager;
import android.content.Context;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.gau.go.a.f:
//            b

public class a
{

    private static int a = -1;

    public static long a(Context context)
    {
        context = (ActivityManager)context.getSystemService("activity");
        android.app.ActivityManager.MemoryInfo memoryinfo = new android.app.ActivityManager.MemoryInfo();
        context.getMemoryInfo(memoryinfo);
        return memoryinfo.availMem;
    }

    public static String a()
    {
        Object obj;
        Object obj2;
        Object obj3;
        obj3 = "";
        obj2 = null;
        obj = null;
        InputStream inputstream = (new ProcessBuilder(new String[] {
            "/system/bin/cat", "/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_max_freq"
        })).start().getInputStream();
        obj = inputstream;
        obj2 = inputstream;
        byte abyte0[] = new byte[24];
_L2:
        obj = inputstream;
        obj2 = inputstream;
        if (inputstream.read(abyte0) == -1)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = inputstream;
        obj2 = inputstream;
        obj3 = (new StringBuilder()).append(((String) (obj3))).append(new String(abyte0)).toString();
        if (true) goto _L2; else goto _L1
_L1:
        obj = inputstream;
        obj2 = inputstream;
        inputstream.close();
        obj2 = obj3;
        if (inputstream == null)
        {
            break MISSING_BLOCK_LABEL_113;
        }
        inputstream.close();
        obj2 = obj3;
_L4:
        obj = obj2;
        if (((String) (obj2)).trim().equals(""))
        {
            obj = "0";
        }
        return ((String) (obj));
        obj3;
        obj2 = obj;
        ((IOException) (obj3)).printStackTrace();
        obj3 = "N/A";
        obj2 = obj3;
        if (obj == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        try
        {
            ((InputStream) (obj)).close();
        }
        catch (IOException ioexception)
        {
            obj2 = obj3;
            continue; /* Loop/switch isn't completed */
        }
        obj2 = obj3;
        continue; /* Loop/switch isn't completed */
        Object obj1;
        obj1;
        if (obj2 != null)
        {
            try
            {
                ((InputStream) (obj2)).close();
            }
            catch (IOException ioexception1) { }
        }
        throw obj1;
        obj1;
        obj2 = obj3;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static String b()
    {
        Object obj1;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        obj4 = null;
        obj2 = null;
        obj3 = null;
        obj1 = null;
        obj5 = "N/A";
        Object obj = new FileReader("/sys/devices/system/cpu/cpu0/cpufreq/scaling_cur_freq");
        obj2 = obj3;
        obj3 = obj;
        obj1 = new BufferedReader(((java.io.Reader) (obj)));
        obj3 = ((BufferedReader) (obj1)).readLine();
        obj2 = obj5;
        if (obj3 == null)
        {
            break MISSING_BLOCK_LABEL_53;
        }
        obj2 = ((String) (obj3)).trim();
        Exception exception;
        if (obj != null)
        {
            try
            {
                ((FileReader) (obj)).close();
            }
            catch (IOException ioexception)
            {
                return ((String) (obj2));
            }
        }
        obj5 = obj2;
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_75;
        }
        ((BufferedReader) (obj1)).close();
        obj5 = obj2;
_L2:
        return ((String) (obj5));
        obj2;
        obj = null;
_L7:
        ((FileNotFoundException) (obj2)).printStackTrace();
        if (obj1 != null)
        {
            try
            {
                ((FileReader) (obj1)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                return "N/A";
            }
        }
        if (obj == null) goto _L2; else goto _L1
_L1:
        ((BufferedReader) (obj)).close();
        return "N/A";
        obj1;
        obj = null;
_L6:
        obj2 = obj4;
        obj3 = obj;
        ((IOException) (obj1)).printStackTrace();
        if (obj != null)
        {
            try
            {
                ((FileReader) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                return "N/A";
            }
        }
        if (obj4 == null) goto _L2; else goto _L3
_L3:
        ((BufferedReader) (obj4)).close();
        return "N/A";
        obj1;
        obj = null;
_L5:
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_156;
        }
        ((FileReader) (obj)).close();
        if (obj2 != null)
        {
            try
            {
                ((BufferedReader) (obj2)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
        }
        throw obj1;
        obj1;
        obj = obj3;
        continue; /* Loop/switch isn't completed */
        exception;
        obj2 = obj1;
        obj1 = exception;
        continue; /* Loop/switch isn't completed */
        obj2;
        exception = ((Exception) (obj1));
        obj1 = obj2;
        obj2 = obj;
        obj = exception;
        if (true) goto _L5; else goto _L4
_L4:
        obj1;
          goto _L6
        obj2;
        obj4 = obj1;
        obj1 = obj2;
          goto _L6
        obj2;
        exception = null;
        obj1 = obj;
        obj = exception;
          goto _L7
        obj2;
        exception = ((Exception) (obj));
        obj = obj1;
        obj1 = exception;
          goto _L7
    }

    public static String c()
    {
        Object obj1 = null;
        Object obj = new FileReader("/proc/cpuinfo");
        Object obj2;
        Object obj3;
        String as[];
        IOException ioexception1;
        int i;
        try
        {
            obj1 = new BufferedReader(((java.io.Reader) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj2)
        {
            Object obj4 = null;
            obj1 = obj;
            obj = obj4;
            continue; /* Loop/switch isn't completed */
        }
        // Misplaced declaration of an exception variable
        catch (IOException ioexception1)
        {
            obj1 = null;
            continue; /* Loop/switch isn't completed */
        }
        finally
        {
            obj2 = null;
            continue; /* Loop/switch isn't completed */
        }
        obj2 = obj1;
        obj3 = obj;
        as = ((BufferedReader) (obj1)).readLine().split(":\\s+", 2);
        i = 0;
_L2:
        obj2 = obj1;
        obj3 = obj;
        if (i >= as.length)
        {
            break; /* Loop/switch isn't completed */
        }
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        obj2 = as[1];
        FileReader filereader;
        if (obj != null)
        {
            try
            {
                ((FileReader) (obj)).close();
            }
            catch (IOException ioexception)
            {
                return ((String) (obj2));
            }
        }
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_82;
        }
        ((BufferedReader) (obj1)).close();
        return ((String) (obj2));
        obj2;
        obj = null;
_L7:
        ((FileNotFoundException) (obj2)).printStackTrace();
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_99;
        }
        ((FileReader) (obj1)).close();
        if (obj != null)
        {
            try
            {
                ((BufferedReader) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
        }
        return "unknown";
        ioexception1;
        obj1 = null;
        obj = null;
_L5:
        obj2 = obj1;
        obj3 = obj;
        ioexception1.printStackTrace();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_133;
        }
        ((FileReader) (obj)).close();
        if (obj1 != null)
        {
            try
            {
                ((BufferedReader) (obj1)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
        }
        break MISSING_BLOCK_LABEL_107;
        obj1;
        obj2 = null;
        obj = null;
_L4:
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_161;
        }
        ((FileReader) (obj)).close();
        if (obj2 != null)
        {
            try
            {
                ((BufferedReader) (obj2)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
        }
        throw obj1;
        obj1;
        obj = obj3;
        continue; /* Loop/switch isn't completed */
        obj2;
        obj3 = obj1;
        obj1 = obj2;
        obj2 = obj;
        obj = obj3;
        if (true) goto _L4; else goto _L3
        ioexception1;
        if (true) goto _L5; else goto _L3
        obj2;
        filereader = ((FileReader) (obj));
        obj = obj1;
        obj1 = filereader;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public static long d()
    {
        Object obj1 = null;
        Object obj = new FileReader("/proc/meminfo");
        Object obj3;
        long l;
        try
        {
            obj3 = new BufferedReader(((java.io.Reader) (obj)), 8192);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj3)
        {
            continue; /* Loop/switch isn't completed */
        }
        finally
        {
            obj3 = null;
        }
        obj1 = ((BufferedReader) (obj3)).readLine();
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_92;
        }
        Matcher matcher = Pattern.compile("(\\d+)").matcher(((CharSequence) (obj1)));
        if (matcher.find())
        {
            obj1 = matcher.group(1);
        }
        l = Long.valueOf(((String) (obj1))).longValue();
        l *= 1000L;
        IOException ioexception;
        Object obj2;
        if (obj != null)
        {
            try
            {
                ((FileReader) (obj)).close();
            }
            catch (IOException ioexception1)
            {
                return l;
            }
        }
        if (obj3 == null)
        {
            break MISSING_BLOCK_LABEL_89;
        }
        ((BufferedReader) (obj3)).close();
        return l;
        ((BufferedReader) (obj3)).close();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_104;
        }
        ((FileReader) (obj)).close();
        if (obj3 != null)
        {
            try
            {
                ((BufferedReader) (obj3)).close();
            }
            // Misplaced declaration of an exception variable
            catch (IOException ioexception) { }
        }
        return 0L;
        obj;
        obj = null;
_L4:
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_125;
        }
        ((FileReader) (obj)).close();
        if (obj1 != null)
        {
            try
            {
                ((BufferedReader) (obj1)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
        }
        break MISSING_BLOCK_LABEL_112;
        obj2;
        obj3 = null;
        obj = null;
_L2:
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_153;
        }
        ((FileReader) (obj)).close();
        if (obj3 != null)
        {
            try
            {
                ((BufferedReader) (obj3)).close();
            }
            // Misplaced declaration of an exception variable
            catch (IOException ioexception) { }
        }
        throw obj2;
        obj2;
        if (true) goto _L2; else goto _L1
_L1:
        obj2;
        obj2 = obj3;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static int e()
    {
        int i;
        try
        {
            i = (new File("/sys/devices/system/cpu/")).listFiles(new b()).length;
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
            return 1;
        }
        return i;
    }

}
