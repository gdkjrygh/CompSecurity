// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import android.app.Activity;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            zzp

public class zzal
    implements zzp
{

    public double zzME;
    public int zzMF;
    public int zzMG;
    public int zzMH;
    public int zzMI;
    public Map zzMJ;
    public String zztd;

    public zzal()
    {
        zzME = -1D;
        zzMF = -1;
        zzMG = -1;
        zzMH = -1;
        zzMI = -1;
        zzMJ = new HashMap();
    }

    public int getSessionTimeout()
    {
        return zzMF;
    }

    public String getTrackingId()
    {
        return zztd;
    }

    public String zzbh(String s)
    {
        String s1 = (String)zzMJ.get(s);
        if (s1 != null)
        {
            return s1;
        } else
        {
            return s;
        }
    }

    public double zzkA()
    {
        return zzME;
    }

    public boolean zzkB()
    {
        return zzMF >= 0;
    }

    public boolean zzkC()
    {
        return zzMG != -1;
    }

    public boolean zzkD()
    {
        return zzMG == 1;
    }

    public boolean zzkE()
    {
        return zzMH != -1;
    }

    public boolean zzkF()
    {
        return zzMH == 1;
    }

    public boolean zzkG()
    {
        return zzMI == 1;
    }

    public boolean zzky()
    {
        return zztd != null;
    }

    public boolean zzkz()
    {
        return zzME >= 0.0D;
    }

    public String zzq(Activity activity)
    {
        return zzbh(activity.getClass().getCanonicalName());
    }
}
