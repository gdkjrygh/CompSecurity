// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.zzx;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

// Referenced classes of package com.google.android.gms.internal:
//            zzod

public final class zzoq extends zzod
{

    private String zzaIF;
    private int zzaIG;
    private int zzaIH;
    private String zzaII;
    private String zzaIJ;
    private boolean zzaIK;
    private boolean zzaIL;
    private boolean zzaIM;

    public zzoq()
    {
        this(false);
    }

    public zzoq(boolean flag)
    {
        this(flag, zzxS());
    }

    public zzoq(boolean flag, int i)
    {
        zzx.zzbD(i);
        zzaIG = i;
        zzaIL = flag;
    }

    static int zzxS()
    {
        UUID uuid = UUID.randomUUID();
        int i = (int)(uuid.getLeastSignificantBits() & 0x7fffffffL);
        if (i == 0)
        {
            int j = (int)(uuid.getMostSignificantBits() & 0x7fffffffL);
            i = j;
            if (j == 0)
            {
                Log.e("GAv4", "UUID.randomUUID() returned 0.");
                return 0x7fffffff;
            }
        }
        return i;
    }

    private void zzxZ()
    {
        if (zzaIM)
        {
            throw new IllegalStateException("ScreenViewInfo is immutable");
        } else
        {
            return;
        }
    }

    public boolean isMutable()
    {
        return !zzaIM;
    }

    public void setScreenName(String s)
    {
        zzxZ();
        zzaIF = s;
    }

    public String toString()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("screenName", zzaIF);
        hashmap.put("interstitial", Boolean.valueOf(zzaIK));
        hashmap.put("automatic", Boolean.valueOf(zzaIL));
        hashmap.put("screenId", Integer.valueOf(zzaIG));
        hashmap.put("referrerScreenId", Integer.valueOf(zzaIH));
        hashmap.put("referrerScreenName", zzaII);
        hashmap.put("referrerUri", zzaIJ);
        return zzA(hashmap);
    }

    public void zza(zzod zzod1)
    {
        zzc((zzoq)zzod1);
    }

    public void zzal(boolean flag)
    {
        zzxZ();
        zzaIL = flag;
    }

    public void zzam(boolean flag)
    {
        zzxZ();
        zzaIK = flag;
    }

    public int zzbp()
    {
        return zzaIG;
    }

    public void zzc(zzoq zzoq1)
    {
        if (!TextUtils.isEmpty(zzaIF))
        {
            zzoq1.setScreenName(zzaIF);
        }
        if (zzaIG != 0)
        {
            zzoq1.zzhS(zzaIG);
        }
        if (zzaIH != 0)
        {
            zzoq1.zzhT(zzaIH);
        }
        if (!TextUtils.isEmpty(zzaII))
        {
            zzoq1.zzdU(zzaII);
        }
        if (!TextUtils.isEmpty(zzaIJ))
        {
            zzoq1.zzdV(zzaIJ);
        }
        if (zzaIK)
        {
            zzoq1.zzam(zzaIK);
        }
        if (zzaIL)
        {
            zzoq1.zzal(zzaIL);
        }
    }

    public void zzdU(String s)
    {
        zzxZ();
        zzaII = s;
    }

    public void zzdV(String s)
    {
        zzxZ();
        if (TextUtils.isEmpty(s))
        {
            zzaIJ = null;
            return;
        } else
        {
            zzaIJ = s;
            return;
        }
    }

    public void zzhS(int i)
    {
        zzxZ();
        zzaIG = i;
    }

    public void zzhT(int i)
    {
        zzxZ();
        zzaIH = i;
    }

    public String zzxT()
    {
        return zzaIF;
    }

    public int zzxU()
    {
        return zzaIH;
    }

    public String zzxV()
    {
        return zzaII;
    }

    public String zzxW()
    {
        return zzaIJ;
    }

    public void zzxX()
    {
        zzaIM = true;
    }

    public boolean zzxY()
    {
        return zzaIK;
    }
}
