// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import android.util.Log;
import com.google.android.gms.analytics.Logger;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            zzr, zzae, zzx

public class zzad
{

    private static volatile Logger zzIo;

    public static Logger getLogger()
    {
        return zzIo;
    }

    public static void setLogger(Logger logger)
    {
        zzIo = logger;
    }

    public static boolean zzC(int i)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (getLogger() != null)
        {
            flag = flag1;
            if (getLogger().getLogLevel() <= i)
            {
                flag = true;
            }
        }
        return flag;
    }

    public static void zzan(String s)
    {
        zzae zzae1 = zzae.zziU();
        if (zzae1 == null) goto _L2; else goto _L1
_L1:
        zzae1.zzaI(s);
_L4:
        Logger logger = zzIo;
        if (logger != null)
        {
            logger.warn(s);
        }
        return;
_L2:
        if (zzC(2))
        {
            Log.w((String)zzx.zzHf.get(), s);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static void zzf(String s, Object obj)
    {
        zzae zzae1 = zzae.zziU();
        if (zzae1 == null) goto _L2; else goto _L1
_L1:
        zzae1.zze(s, obj);
_L4:
        obj = zzIo;
        if (obj != null)
        {
            ((Logger) (obj)).error(s);
        }
        return;
_L2:
        if (zzC(3))
        {
            if (obj != null)
            {
                obj = (new StringBuilder()).append(s).append(":").append(obj).toString();
            } else
            {
                obj = s;
            }
            Log.e((String)zzx.zzHf.get(), ((String) (obj)));
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    static 
    {
        setLogger(new zzr());
    }
}
