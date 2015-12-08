// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            zzd, zzz, zzy, zze

public class zzam extends zzd
{

    protected boolean zzEA;
    protected int zzGV;
    protected String zzHY;
    protected String zzHZ;
    protected boolean zzIP;
    protected boolean zzIQ;
    protected boolean zzIR;
    protected int zzIb;

    public zzam(zze zze)
    {
        super(zze);
    }

    private static int zzba(String s)
    {
        s = s.toLowerCase();
        if ("verbose".equals(s))
        {
            return 0;
        }
        if ("info".equals(s))
        {
            return 1;
        }
        if ("warning".equals(s))
        {
            return 2;
        }
        return !"error".equals(s) ? -1 : 3;
    }

    public int getLogLevel()
    {
        zzgR();
        return zzGV;
    }

    void zza(zzz zzz1)
    {
        zzaF("Loading global XML config values");
        if (zzz1.zziC())
        {
            String s = zzz1.zziD();
            zzHY = s;
            zzb("XML config - app name", s);
        }
        if (zzz1.zziE())
        {
            String s1 = zzz1.zziF();
            zzHZ = s1;
            zzb("XML config - app version", s1);
        }
        if (zzz1.zziG())
        {
            int i = zzba(zzz1.zziH());
            if (i >= 0)
            {
                zzGV = i;
                zza("XML config - log level", Integer.valueOf(i));
            }
        }
        if (zzz1.zziI())
        {
            int j = zzz1.zziJ();
            zzIb = j;
            zzIQ = true;
            zzb("XML config - dispatch period (sec)", Integer.valueOf(j));
        }
        if (zzz1.zziK())
        {
            boolean flag = zzz1.zziL();
            zzEA = flag;
            zzIR = true;
            zzb("XML config - dry run", Boolean.valueOf(flag));
        }
    }

    protected void zzgb()
    {
        zzjB();
    }

    public String zziD()
    {
        zzgR();
        return zzHY;
    }

    public String zziF()
    {
        zzgR();
        return zzHZ;
    }

    public boolean zziG()
    {
        zzgR();
        return zzIP;
    }

    public boolean zziI()
    {
        zzgR();
        return zzIQ;
    }

    public boolean zziK()
    {
        zzgR();
        return zzIR;
    }

    public boolean zziL()
    {
        zzgR();
        return zzEA;
    }

    public int zzjA()
    {
        zzgR();
        return zzIb;
    }

    protected void zzjB()
    {
        Object obj = getContext();
        try
        {
            obj = ((Context) (obj)).getPackageManager().getApplicationInfo(((Context) (obj)).getPackageName(), 129);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            zzd("PackageManager doesn't know about the app package", obj);
            obj = null;
        }
        if (obj == null)
        {
            zzaI("Couldn't get ApplicationInfo to load global config");
        } else
        {
            obj = ((ApplicationInfo) (obj)).metaData;
            if (obj != null)
            {
                int i = ((Bundle) (obj)).getInt("com.google.android.gms.analytics.globalConfigResource");
                if (i > 0)
                {
                    zzz zzz1 = (zzz)(new zzy(zzgD())).zzS(i);
                    if (zzz1 != null)
                    {
                        zza(zzz1);
                        return;
                    }
                }
            }
        }
    }
}
