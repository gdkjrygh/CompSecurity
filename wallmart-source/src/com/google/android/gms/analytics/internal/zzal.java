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

    public double zzOE;
    public int zzOF;
    public int zzOG;
    public int zzOH;
    public int zzOI;
    public Map zzOJ;
    public String zztw;

    public zzal()
    {
        zzOE = -1D;
        zzOF = -1;
        zzOG = -1;
        zzOH = -1;
        zzOI = -1;
        zzOJ = new HashMap();
    }

    public int getSessionTimeout()
    {
        return zzOF;
    }

    public String getTrackingId()
    {
        return zztw;
    }

    public String zzbm(String s)
    {
        String s1 = (String)zzOJ.get(s);
        if (s1 != null)
        {
            return s1;
        } else
        {
            return s;
        }
    }

    public boolean zzkM()
    {
        return zztw != null;
    }

    public boolean zzkN()
    {
        return zzOE >= 0.0D;
    }

    public double zzkO()
    {
        return zzOE;
    }

    public boolean zzkP()
    {
        return zzOF >= 0;
    }

    public boolean zzkQ()
    {
        return zzOG != -1;
    }

    public boolean zzkR()
    {
        return zzOG == 1;
    }

    public boolean zzkS()
    {
        return zzOH != -1;
    }

    public boolean zzkT()
    {
        return zzOH == 1;
    }

    public boolean zzkU()
    {
        return zzOI == 1;
    }

    public String zzr(Activity activity)
    {
        return zzbm(activity.getClass().getCanonicalName());
    }
}
