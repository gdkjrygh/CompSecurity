// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.e;

import com.google.android.exoplayer.upstream.i;
import java.io.IOException;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// Referenced classes of package com.google.android.exoplayer.e:
//            l

public final class k
{

    public static final int a;

    public static void a(i j)
    {
        try
        {
            j.a();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (i j)
        {
            return;
        }
    }

    public static boolean a(Object obj, Object obj1)
    {
        if (obj == null)
        {
            return obj1 == null;
        } else
        {
            return obj.equals(obj1);
        }
    }

    public static boolean a(String s)
    {
        return s.startsWith("audio/");
    }

    public static boolean b(String s)
    {
        return s.startsWith("video/");
    }

    public static ExecutorService c(String s)
    {
        return Executors.newSingleThreadExecutor(new l(s));
    }

    public static String d(String s)
    {
        if (s == null)
        {
            return null;
        } else
        {
            return s.toLowerCase(Locale.US);
        }
    }

    static 
    {
        a = android.os.Build.VERSION.SDK_INT;
    }
}
