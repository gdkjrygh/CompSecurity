// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.zzv;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

// Referenced classes of package com.google.android.gms.internal:
//            zzki

public final class zzkv extends zzki
{

    private String zzawM;
    private int zzawN;
    private int zzawO;
    private String zzawP;
    private String zzawQ;
    private boolean zzawR;
    private boolean zzawS;
    private boolean zzawT;

    public zzkv()
    {
        this(false);
    }

    public zzkv(boolean flag)
    {
        this(flag, zzuI());
    }

    public zzkv(boolean flag, int i)
    {
        zzv.zzaR(i);
        zzawN = i;
        zzawS = flag;
    }

    static int zzuI()
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

    private void zzuP()
    {
        if (zzawT)
        {
            throw new IllegalStateException("ScreenViewInfo is immutable");
        } else
        {
            return;
        }
    }

    public boolean isMutable()
    {
        return !zzawT;
    }

    public void setScreenName(String s)
    {
        zzuP();
        zzawM = s;
    }

    public String toString()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("screenName", zzawM);
        hashmap.put("interstitial", Boolean.valueOf(zzawR));
        hashmap.put("automatic", Boolean.valueOf(zzawS));
        hashmap.put("screenId", Integer.valueOf(zzawN));
        hashmap.put("referrerScreenId", Integer.valueOf(zzawO));
        hashmap.put("referrerScreenName", zzawP);
        hashmap.put("referrerUri", zzawQ);
        return zzu(hashmap);
    }

    public void zza(zzki zzki1)
    {
        zzc((zzkv)zzki1);
    }

    public int zzaJ()
    {
        return zzawN;
    }

    public void zzac(boolean flag)
    {
        zzuP();
        zzawS = flag;
    }

    public void zzad(boolean flag)
    {
        zzuP();
        zzawR = flag;
    }

    public void zzc(zzkv zzkv1)
    {
        if (!TextUtils.isEmpty(zzawM))
        {
            zzkv1.setScreenName(zzawM);
        }
        if (zzawN != 0)
        {
            zzkv1.zzgI(zzawN);
        }
        if (zzawO != 0)
        {
            zzkv1.zzgJ(zzawO);
        }
        if (!TextUtils.isEmpty(zzawP))
        {
            zzkv1.zzdd(zzawP);
        }
        if (!TextUtils.isEmpty(zzawQ))
        {
            zzkv1.zzde(zzawQ);
        }
        if (zzawR)
        {
            zzkv1.zzad(zzawR);
        }
        if (zzawS)
        {
            zzkv1.zzac(zzawS);
        }
    }

    public void zzdd(String s)
    {
        zzuP();
        zzawP = s;
    }

    public void zzde(String s)
    {
        zzuP();
        if (TextUtils.isEmpty(s))
        {
            zzawQ = null;
            return;
        } else
        {
            zzawQ = s;
            return;
        }
    }

    public void zzgI(int i)
    {
        zzuP();
        zzawN = i;
    }

    public void zzgJ(int i)
    {
        zzuP();
        zzawO = i;
    }

    public String zzuJ()
    {
        return zzawM;
    }

    public int zzuK()
    {
        return zzawO;
    }

    public String zzuL()
    {
        return zzawP;
    }

    public String zzuM()
    {
        return zzawQ;
    }

    public void zzuN()
    {
        zzawT = true;
    }

    public boolean zzuO()
    {
        return zzawR;
    }
}
