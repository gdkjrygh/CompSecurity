// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            zzd, zzaa, zzz, zzf

public class zzan extends zzd
{

    protected boolean zzIx;
    protected int zzKR;
    protected String zzLU;
    protected String zzLV;
    protected int zzLX;
    protected boolean zzML;
    protected boolean zzMM;
    protected boolean zzMN;

    public zzan(zzf zzf)
    {
        super(zzf);
    }

    private static int zzbo(String s)
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
        zzia();
        return zzKR;
    }

    void zza(zzaa zzaa1)
    {
        zzaT("Loading global XML config values");
        if (zzaa1.zzjK())
        {
            String s = zzaa1.zzjL();
            zzLU = s;
            zzb("XML config - app name", s);
        }
        if (zzaa1.zzjM())
        {
            String s1 = zzaa1.zzjN();
            zzLV = s1;
            zzb("XML config - app version", s1);
        }
        if (zzaa1.zzjO())
        {
            int i = zzbo(zzaa1.zzjP());
            if (i >= 0)
            {
                zzKR = i;
                zza("XML config - log level", Integer.valueOf(i));
            }
        }
        if (zzaa1.zzjQ())
        {
            int j = zzaa1.zzjR();
            zzLX = j;
            zzMM = true;
            zzb("XML config - dispatch period (sec)", Integer.valueOf(j));
        }
        if (zzaa1.zzjS())
        {
            boolean flag = zzaa1.zzjT();
            zzIx = flag;
            zzMN = true;
            zzb("XML config - dry run", Boolean.valueOf(flag));
        }
    }

    protected void zzhn()
    {
        zzkI();
    }

    public String zzjL()
    {
        zzia();
        return zzLU;
    }

    public String zzjN()
    {
        zzia();
        return zzLV;
    }

    public boolean zzjO()
    {
        zzia();
        return zzML;
    }

    public boolean zzjQ()
    {
        zzia();
        return zzMM;
    }

    public boolean zzjS()
    {
        zzia();
        return zzMN;
    }

    public boolean zzjT()
    {
        zzia();
        return zzIx;
    }

    public int zzkH()
    {
        zzia();
        return zzLX;
    }

    protected void zzkI()
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
            zzaW("Couldn't get ApplicationInfo to load global config");
        } else
        {
            obj = ((ApplicationInfo) (obj)).metaData;
            if (obj != null)
            {
                int i = ((Bundle) (obj)).getInt("com.google.android.gms.analytics.globalConfigResource");
                if (i > 0)
                {
                    zzaa zzaa1 = (zzaa)(new zzz(zzhM())).zzab(i);
                    if (zzaa1 != null)
                    {
                        zza(zzaa1);
                        return;
                    }
                }
            }
        }
    }
}
