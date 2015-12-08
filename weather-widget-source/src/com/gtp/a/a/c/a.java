// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.a.a.c;

import android.util.Log;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

// Referenced classes of package com.gtp.a.a.c:
//            b

public class a
{

    private static int a = -1;

    public static int a()
    {
        if (a != -1)
        {
            return a;
        }
        int i = b();
        int j = c();
        if (i + j <= 2)
        {
            a = 1;
        } else
        if (i <= 2 && j <= 2)
        {
            a = 2;
        } else
        {
            a = 3;
        }
        return a;
    }

    private static int b()
    {
        Integer integer = Integer.valueOf(com.gtp.a.a.c.b.a());
        if (integer.intValue() >= 0x124f80)
        {
            return 1;
        }
        int i;
        try
        {
            i = integer.intValue();
        }
        catch (Exception exception)
        {
            return 2;
        }
label0:
        {
            if (i < 0xdbba0)
            {
                return 3;
            }
            break label0;
        }
    }

    private static int c()
    {
        long l2 = Runtime.getRuntime().maxMemory() / 1024L / 1024L;
        long l;
        long l1;
        long l3;
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            l = 128L;
        } else
        {
            l = 48L;
        }
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            l1 = 64L;
        } else
        {
            l1 = 28L;
        }
        l3 = d() / 1024L;
        if (l3 >= 680L && l2 >= l)
        {
            return 1;
        }
        return l3 < 500L || l2 < l1 ? 3 : 2;
    }

    private static long d()
    {
        long l1 = 0L;
        String as[];
        String s;
        long l;
        try
        {
            BufferedReader bufferedreader = new BufferedReader(new FileReader("/proc/meminfo"), 4096);
            s = bufferedreader.readLine();
            bufferedreader.close();
        }
        catch (NumberFormatException numberformatexception)
        {
            Log.e("taskManager", "getTotalMemory error");
            return 0L;
        }
        catch (FileNotFoundException filenotfoundexception)
        {
            Log.e("taskManager", "getTotalMemory error");
            return 0L;
        }
        catch (IOException ioexception)
        {
            Log.e("taskManager", "getTotalMemory error");
            return 0L;
        }
        l = l1;
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_69;
        }
        as = s.split("\\s+");
        l = l1;
        if (as == null)
        {
            break MISSING_BLOCK_LABEL_69;
        }
        l = l1;
        if (as.length >= 1)
        {
            l = Long.parseLong(as[1]);
        }
        return l;
    }

}
