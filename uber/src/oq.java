// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.AdActivity;
import com.google.android.gms.ads.purchase.InAppPurchaseActivity;
import java.util.regex.Pattern;

public final class oq extends ls
    implements amm, ano
{

    private static final Object e = new Object();
    private static oq f;
    anl a;
    String b;
    String c;
    private final Context d;
    private boolean g;

    private oq(Context context)
    {
        d = context;
        g = false;
    }

    public static oq a(Context context)
    {
        synchronized (e)
        {
            if (f == null)
            {
                f = new oq(context.getApplicationContext());
            }
            context = f;
        }
        return context;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    public final void a(amt amt1)
    {
    }

    public final void a(amt amt1, Activity activity)
    {
        if (amt1 != null && activity != null)
        {
            if (activity instanceof AdActivity)
            {
                ot.e();
                int i = ajc.d(activity);
                if (i == 1)
                {
                    amt1.a(true);
                    amt1.a("Interstitial Ad");
                    return;
                }
                if (i == 2 || i == 3)
                {
                    amt1.a("Expanded Ad");
                    return;
                } else
                {
                    amt1.a(null);
                    return;
                }
            }
            if (activity instanceof InAppPurchaseActivity)
            {
                amt1.a(null);
                return;
            }
        }
    }

    public final void a(String s, String s1)
    {
label0:
        {
            synchronized (e)
            {
                ot.e();
                if (ajc.a(d.getPackageManager(), d.getPackageName(), "android.permission.INTERNET"))
                {
                    break label0;
                }
                of.b("Missing permission android.permission.INTERNET");
            }
            return;
        }
        ot.e();
        if (ajc.a(d.getPackageManager(), d.getPackageName(), "android.permission.ACCESS_NETWORK_STATE"))
        {
            break MISSING_BLOCK_LABEL_79;
        }
        of.b("Missing permission android.permission.ACCESS_NETWORK_STATE");
        obj;
        JVM INSTR monitorexit ;
        return;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
        if (d != null)
        {
            break MISSING_BLOCK_LABEL_94;
        }
        of.e("Fail to initialize MobileAdsSettingManager because context is null.");
        obj;
        JVM INSTR monitorexit ;
        return;
        if (!TextUtils.isEmpty(s))
        {
            break MISSING_BLOCK_LABEL_109;
        }
        of.e("Fail to initialize MobileAdsSettingManager because ApplicationCode is empty.");
        obj;
        JVM INSTR monitorexit ;
        return;
        if (!g)
        {
            break MISSING_BLOCK_LABEL_124;
        }
        of.c("MobileAdsSettingManager has been initialized.");
        obj;
        JVM INSTR monitorexit ;
        return;
        if (!Pattern.matches("ca-app-[a-z0-9_-]+~[a-z0-9_-]+", s))
        {
            throw new IllegalArgumentException("Please provide a valid application code");
        }
        g = true;
        b = s;
        c = s1;
        s = ann.a(d);
        s1 = new anm(b);
        if (!TextUtils.isEmpty(c))
        {
            s1.a(c);
        }
        s.a(s1.a());
        s.a(this);
        aml.a(d).a(this);
        s.b();
        obj;
        JVM INSTR monitorexit ;
    }

    public final boolean a()
    {
        boolean flag;
        synchronized (e)
        {
            flag = g;
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void b()
    {
        a = ann.a(d).a();
    }

    public final int c()
    {
label0:
        {
            synchronized (e)
            {
                if (g)
                {
                    break label0;
                }
            }
            return -1;
        }
        amt amt1 = aml.a(d).a();
        if (amt1 == null)
        {
            break MISSING_BLOCK_LABEL_46;
        }
        int i = amt1.b();
        obj;
        JVM INSTR monitorexit ;
        return i;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        obj;
        JVM INSTR monitorexit ;
        return -1;
    }

    public final String d()
    {
label0:
        {
            synchronized (e)
            {
                if (g)
                {
                    break label0;
                }
            }
            return null;
        }
        String s = pf.a(d).f();
        obj;
        JVM INSTR monitorexit ;
        return s;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

}
