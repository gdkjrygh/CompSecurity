// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            zzod

public final class zzom extends zzod
{

    private String zzUc;
    public int zzaIA;
    public int zzaIB;
    public int zzaIC;
    public int zzzQ;
    public int zzzR;

    public zzom()
    {
    }

    public String getLanguage()
    {
        return zzUc;
    }

    public void setLanguage(String s)
    {
        zzUc = s;
    }

    public String toString()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("language", zzUc);
        hashmap.put("screenColors", Integer.valueOf(zzaIA));
        hashmap.put("screenWidth", Integer.valueOf(zzzQ));
        hashmap.put("screenHeight", Integer.valueOf(zzzR));
        hashmap.put("viewportWidth", Integer.valueOf(zzaIB));
        hashmap.put("viewportHeight", Integer.valueOf(zzaIC));
        return zzA(hashmap);
    }

    public volatile void zza(zzod zzod1)
    {
        zza((zzom)zzod1);
    }

    public void zza(zzom zzom1)
    {
        if (zzaIA != 0)
        {
            zzom1.zzhN(zzaIA);
        }
        if (zzzQ != 0)
        {
            zzom1.zzhO(zzzQ);
        }
        if (zzzR != 0)
        {
            zzom1.zzhP(zzzR);
        }
        if (zzaIB != 0)
        {
            zzom1.zzhQ(zzaIB);
        }
        if (zzaIC != 0)
        {
            zzom1.zzhR(zzaIC);
        }
        if (!TextUtils.isEmpty(zzUc))
        {
            zzom1.setLanguage(zzUc);
        }
    }

    public void zzhN(int i)
    {
        zzaIA = i;
    }

    public void zzhO(int i)
    {
        zzzQ = i;
    }

    public void zzhP(int i)
    {
        zzzR = i;
    }

    public void zzhQ(int i)
    {
        zzaIB = i;
    }

    public void zzhR(int i)
    {
        zzaIC = i;
    }

    public int zzxH()
    {
        return zzaIA;
    }

    public int zzxI()
    {
        return zzzQ;
    }

    public int zzxJ()
    {
        return zzzR;
    }

    public int zzxK()
    {
        return zzaIB;
    }

    public int zzxL()
    {
        return zzaIC;
    }
}
