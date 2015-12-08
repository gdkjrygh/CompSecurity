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

    protected boolean zzKx;
    protected int zzMQ;
    protected String zzNT;
    protected String zzNU;
    protected int zzNW;
    protected boolean zzOL;
    protected boolean zzOM;
    protected boolean zzON;

    public zzan(zzf zzf)
    {
        super(zzf);
    }

    private static int zzbt(String s)
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
        zzio();
        return zzMQ;
    }

    void zza(zzaa zzaa1)
    {
        zzaY("Loading global XML config values");
        if (zzaa1.zzjY())
        {
            String s = zzaa1.zzjZ();
            zzNT = s;
            zzb("XML config - app name", s);
        }
        if (zzaa1.zzka())
        {
            String s1 = zzaa1.zzkb();
            zzNU = s1;
            zzb("XML config - app version", s1);
        }
        if (zzaa1.zzkc())
        {
            int i = zzbt(zzaa1.zzkd());
            if (i >= 0)
            {
                zzMQ = i;
                zza("XML config - log level", Integer.valueOf(i));
            }
        }
        if (zzaa1.zzke())
        {
            int j = zzaa1.zzkf();
            zzNW = j;
            zzOM = true;
            zzb("XML config - dispatch period (sec)", Integer.valueOf(j));
        }
        if (zzaa1.zzkg())
        {
            boolean flag = zzaa1.zzkh();
            zzKx = flag;
            zzON = true;
            zzb("XML config - dry run", Boolean.valueOf(flag));
        }
    }

    protected void zzhB()
    {
        zzkW();
    }

    public String zzjZ()
    {
        zzio();
        return zzNT;
    }

    public int zzkV()
    {
        zzio();
        return zzNW;
    }

    protected void zzkW()
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
            zzbb("Couldn't get ApplicationInfo to load global config");
        } else
        {
            obj = ((ApplicationInfo) (obj)).metaData;
            if (obj != null)
            {
                int i = ((Bundle) (obj)).getInt("com.google.android.gms.analytics.globalConfigResource");
                if (i > 0)
                {
                    zzaa zzaa1 = (zzaa)(new zzz(zzia())).zzac(i);
                    if (zzaa1 != null)
                    {
                        zza(zzaa1);
                        return;
                    }
                }
            }
        }
    }

    public String zzkb()
    {
        zzio();
        return zzNU;
    }

    public boolean zzkc()
    {
        zzio();
        return zzOL;
    }

    public boolean zzke()
    {
        zzio();
        return zzOM;
    }

    public boolean zzkg()
    {
        zzio();
        return zzON;
    }

    public boolean zzkh()
    {
        zzio();
        return zzKx;
    }
}
