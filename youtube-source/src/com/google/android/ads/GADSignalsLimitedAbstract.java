// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.ads;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

// Referenced classes of package com.google.android.ads:
//            r, Obfuscator, u, v

public abstract class GADSignalsLimitedAbstract extends r
{

    static boolean c = false;
    private static Method d;
    private static Method e;
    private static Method f;
    private static Method g;
    private static Method h;
    private static Method i;
    private static String j;
    private static long k = 0L;
    private static Obfuscator l;

    protected GADSignalsLimitedAbstract(Context context, u u, v v)
    {
        super(context, u, v);
    }

    private static String a()
    {
        if (j == null)
        {
            throw new SignalUnavailableException();
        } else
        {
            return j;
        }
    }

    private static String a(byte abyte0[], String s)
    {
        try
        {
            abyte0 = new String(l.a(abyte0, s), "UTF-8");
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new SignalUnavailableException(abyte0);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new SignalUnavailableException(abyte0);
        }
        return abyte0;
    }

    protected static void a(String s, Context context, u u)
    {
        com/google/android/ads/GADSignalsLimitedAbstract;
        JVM INSTR monitorenter ;
        boolean flag = c;
        if (flag) goto _L2; else goto _L1
_L1:
        l = new Obfuscator(u, null);
        j = s;
        byte abyte0[];
        byte abyte1[];
        abyte0 = l.a("HsNqdSi3oaahMJ1qB578bN3ZzyO5qtAaBeV+hOcy37A=");
        abyte1 = l.a(abyte0, "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");
        u = context.getCacheDir();
        s = u;
        if (u != null) goto _L4; else goto _L3
_L3:
        u = context.getDir("dex", 0);
        s = u;
        if (u != null) goto _L4; else goto _L5
_L5:
        throw new SignalUnavailableException();
        s;
        try
        {
            throw new SignalUnavailableException(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s) { }
        // Misplaced declaration of an exception variable
        catch (String s) { }
        finally
        {
            com/google/android/ads/GADSignalsLimitedAbstract;
        }
_L2:
        com/google/android/ads/GADSignalsLimitedAbstract;
        JVM INSTR monitorexit ;
        return;
_L4:
        u = File.createTempFile("ads", ".jar", s);
        Object obj = new FileOutputStream(u);
        ((FileOutputStream) (obj)).write(abyte1, 0, abyte1.length);
        ((FileOutputStream) (obj)).close();
        Object obj1 = new DexClassLoader(u.getAbsolutePath(), s.getAbsolutePath(), null, context.getClassLoader());
        context = ((DexClassLoader) (obj1)).loadClass(a(abyte0, "M7+3J745Gn4xpUgFQW2Br/MkMqyj0sfwCpOmVPZsRHV7cmHGtcMDm237UJD76Z75"));
        Class class1 = ((DexClassLoader) (obj1)).loadClass(a(abyte0, "uanf7tIdkZt1rkDmRp+YXaSmEFCdT+UYRsbo7RzIwPEVE8mDK4sw9RpvJvOfP0ux"));
        obj = ((DexClassLoader) (obj1)).loadClass(a(abyte0, "DTHI6MG5Tw9Bm0XfM04+6aQ0W6kXU0TKHFlJbJw/5zYJ8v83LWD9YVS+XrZ9fQ7R"));
        Class class2 = ((DexClassLoader) (obj1)).loadClass(a(abyte0, "kQyz3dB+6CkJ9E149f9jKLoLgH8RmNhjqWJyEMFqYZIbnKecLMqMV6DTy9y8A7v1"));
        Class class3 = ((DexClassLoader) (obj1)).loadClass(a(abyte0, "jxeJzDN9sUJwdlEoqXDTeox07O1XHMJgsT8Dr6CQYFNqGtczcWf3bS5VxVokwrUF"));
        obj1 = ((DexClassLoader) (obj1)).loadClass(a(abyte0, "nGaQVQDR5+6vh7e+VoNb/P+/hktmV8zgOLvt/DHMAxMXC/B9XMzcmWQl/hyyolSQ"));
        d = context.getMethod(a(abyte0, "FiJ/ai6UrZpMzOYv/4QLJAGUMYgHzKAgLUWY7LuoK3o="), new Class[0]);
        e = class1.getMethod(a(abyte0, "KgFWb0HLIDnIlTrgtCqulbOveusdOe1kID1hQDE3B0I="), new Class[0]);
        f = ((Class) (obj)).getMethod(a(abyte0, "G3ELUJagtx0EKR5P516SvL/SkGX3lFHDlvNeLyuU+SY="), new Class[] {
            android/content/Context
        });
        g = class2.getMethod(a(abyte0, "vZN0MCOiJ0mVyXODND2OiBPHqlm23wpyGHWPIubBqR8="), new Class[] {
            android/view/MotionEvent, android/util/DisplayMetrics
        });
        h = class3.getMethod(a(abyte0, "968zt1kP6qxceFwhc8hDAcvE+9VVdfW2ZB325MvLxRw="), new Class[] {
            android/content/Context
        });
        i = ((Class) (obj1)).getMethod(a(abyte0, "VYAmaRrQjOR3u2b3fvxT0SkGGwXHdIOyrVYxukVAjco="), new Class[] {
            android/content/Context
        });
        context = u.getName();
        u.delete();
        (new File(s, context.replace(".jar", ".dex"))).delete();
        k = b().longValue();
        c = true;
          goto _L2
        s;
        throw new SignalUnavailableException(s);
        throw s;
        s;
        throw new SignalUnavailableException(s);
        s;
        throw new SignalUnavailableException(s);
        s;
        throw new SignalUnavailableException(s);
        s;
        throw new SignalUnavailableException(s);
    }

    private static Long b()
    {
        if (d == null)
        {
            throw new SignalUnavailableException();
        }
        Long long1;
        try
        {
            long1 = (Long)d.invoke(null, new Object[0]);
        }
        catch (IllegalAccessException illegalaccessexception)
        {
            throw new SignalUnavailableException(illegalaccessexception);
        }
        catch (InvocationTargetException invocationtargetexception)
        {
            throw new SignalUnavailableException(invocationtargetexception);
        }
        return long1;
    }

    private static String c()
    {
        if (e == null)
        {
            throw new SignalUnavailableException();
        }
        String s;
        try
        {
            s = (String)e.invoke(null, new Object[0]);
        }
        catch (IllegalAccessException illegalaccessexception)
        {
            throw new SignalUnavailableException(illegalaccessexception);
        }
        catch (InvocationTargetException invocationtargetexception)
        {
            throw new SignalUnavailableException(invocationtargetexception);
        }
        return s;
    }

    private static String c(Context context)
    {
        if (h == null)
        {
            throw new SignalUnavailableException();
        }
        try
        {
            context = (String)h.invoke(null, new Object[] {
                context
            });
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new SignalUnavailableException(context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new SignalUnavailableException(context);
        }
        if (context != null)
        {
            break MISSING_BLOCK_LABEL_65;
        }
        throw new SignalUnavailableException();
        return context;
    }

    protected final void b(Context context)
    {
        try
        {
            a(1, c());
        }
        catch (SignalUnavailableException signalunavailableexception2) { }
        try
        {
            a(2, a());
        }
        catch (SignalUnavailableException signalunavailableexception1) { }
        try
        {
            a(25, b().longValue());
        }
        catch (SignalUnavailableException signalunavailableexception) { }
        try
        {
            a(24, c(context));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return;
        }
        context;
    }


    private class SignalUnavailableException extends Exception
    {

        public SignalUnavailableException()
        {
        }

        public SignalUnavailableException(Throwable throwable)
        {
            super(throwable);
        }
    }

}
