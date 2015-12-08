// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import javax.crypto.Cipher;
import org.json.JSONObject;

// Referenced classes of package com.crashlytics.android.internal:
//            aT, ab, ao, ap, 
//            v, q, r, ah, 
//            aY, aN, aO, aW, 
//            aZ, ai, aX, aU, 
//            aV, av

public final class aS
{

    private final AtomicReference a;
    private aW b;
    private boolean c;

    private aS()
    {
        a = new AtomicReference();
        c = false;
    }

    aS(byte byte0)
    {
        this();
    }

    public static aS a()
    {
        return aT.a();
    }

    private static String a(String s, String s1, Context context)
    {
        try
        {
            s1 = s1.replaceAll("\\.", (new StringBuffer(new String(new char[] {
                's', 'l', 'c'
            }))).reverse().toString());
            s = ab.b(1, ab.a((new StringBuilder()).append(s).append(s1).toString()));
            break MISSING_BLOCK_LABEL_71;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            v.a().b().a("Crashlytics", "Could not create cipher to encrypt headers.", s);
        }
_L2:
        return "";
        s1 = new JSONObject();
        context = new ao(context);
        Iterator iterator;
        try
        {
            s1.put("APPLICATION_INSTALLATION_UUID".toLowerCase(Locale.US), context.b());
        }
        catch (Exception exception)
        {
            v.a().b().a("Crashlytics", "Could not write application id to JSON", exception);
        }
        for (iterator = context.f().entrySet().iterator(); iterator.hasNext();)
        {
            java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
            try
            {
                s1.put(((ap)entry.getKey()).name().toLowerCase(Locale.US), entry.getValue());
            }
            catch (Exception exception2)
            {
                v.a().b().a("Crashlytics", (new StringBuilder("Could not write value to JSON: ")).append(((ap)entry.getKey()).name()).toString(), exception2);
            }
        }

        try
        {
            s1.put("os_version", context.c());
        }
        catch (Exception exception1)
        {
            v.a().b().a("Crashlytics", "Could not write OS version to JSON", exception1);
        }
        try
        {
            s1.put("model", context.d());
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            v.a().b().a("Crashlytics", "Could not write model to JSON", context);
        }
        if (s1.length() > 0)
        {
            try
            {
                s = ab.a(s.doFinal(s1.toString().getBytes()));
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                v.a().b().a("Crashlytics", "Could not encrypt IDs", s);
                return "";
            }
            return s;
        }
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final aS a(Context context, av av, String s, String s1, String s2)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = c;
        if (!flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return this;
_L2:
        if (b == null)
        {
            String s3 = r.a(context, false);
            String s4 = context.getPackageName();
            String s5 = context.getPackageManager().getInstallerPackageName(s4);
            ah ah1 = new ah();
            aY ay = new aY();
            aN an = new aN();
            String s6 = ab.g(context);
            av = new aO(s2, String.format(Locale.US, "https://settings.crashlytics.com/spi/v2/platforms/android/apps/%s/settings", new Object[] {
                s4
            }), av);
            b = new aW(new aZ(s3, a(s3, s4, context), ab.a(new String[] {
                ab.i(context)
            }), s1, s, ai.a(s5).a(), s6), ah1, ay, an, av);
        }
        c = true;
        if (true) goto _L1; else goto _L3
_L3:
        context;
        throw context;
    }

    public final Object a(aU au, Object obj)
    {
        aX ax = (aX)a.get();
        if (ax == null)
        {
            return obj;
        } else
        {
            return au.a(ax);
        }
    }

    public final aX b()
    {
        return (aX)a.get();
    }

    public final boolean c()
    {
        this;
        JVM INSTR monitorenter ;
        aX ax;
        ax = b.a();
        a.set(ax);
        boolean flag;
        if (ax != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    public final boolean d()
    {
        this;
        JVM INSTR monitorenter ;
        aX ax;
        ax = b.a(aV.b);
        a.set(ax);
        if (ax != null)
        {
            break MISSING_BLOCK_LABEL_42;
        }
        v.a().b().a("Crashlytics", "Failed to force reload of settings from Crashlytics.", null);
        boolean flag;
        if (ax != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }
}
