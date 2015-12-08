// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.common.internal.zzx;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            zzod, zzof, zzlm, zzoe

public final class zzob
{

    private final zzoe zzaHQ;
    private boolean zzaHR;
    private long zzaHS;
    private long zzaHT;
    private long zzaHU;
    private long zzaHV;
    private long zzaHW;
    private boolean zzaHX;
    private final Map zzaHY;
    private final List zzaHZ;
    private final zzlm zzpO;

    zzob(zzob zzob1)
    {
        zzaHQ = zzob1.zzaHQ;
        zzpO = zzob1.zzpO;
        zzaHS = zzob1.zzaHS;
        zzaHT = zzob1.zzaHT;
        zzaHU = zzob1.zzaHU;
        zzaHV = zzob1.zzaHV;
        zzaHW = zzob1.zzaHW;
        zzaHZ = new ArrayList(zzob1.zzaHZ);
        zzaHY = new HashMap(zzob1.zzaHY.size());
        java.util.Map.Entry entry;
        zzod zzod1;
        for (zzob1 = zzob1.zzaHY.entrySet().iterator(); zzob1.hasNext(); zzaHY.put(entry.getKey(), zzod1))
        {
            entry = (java.util.Map.Entry)zzob1.next();
            zzod1 = zzf((Class)entry.getKey());
            ((zzod)entry.getValue()).zza(zzod1);
        }

    }

    zzob(zzoe zzoe1, zzlm zzlm1)
    {
        zzx.zzv(zzoe1);
        zzx.zzv(zzlm1);
        zzaHQ = zzoe1;
        zzpO = zzlm1;
        zzaHV = 0x1b7740L;
        zzaHW = 0xb43e9400L;
        zzaHY = new HashMap();
        zzaHZ = new ArrayList();
    }

    private static zzod zzf(Class class1)
    {
        try
        {
            class1 = (zzod)class1.newInstance();
        }
        // Misplaced declaration of an exception variable
        catch (Class class1)
        {
            throw new IllegalArgumentException("dataType doesn't have default constructor", class1);
        }
        // Misplaced declaration of an exception variable
        catch (Class class1)
        {
            throw new IllegalArgumentException("dataType default constructor is not accessible", class1);
        }
        return class1;
    }

    public void zzL(long l)
    {
        zzaHT = l;
    }

    public void zzb(zzod zzod1)
    {
        zzx.zzv(zzod1);
        Class class1 = zzod1.getClass();
        if (class1.getSuperclass() != com/google/android/gms/internal/zzod)
        {
            throw new IllegalArgumentException();
        } else
        {
            zzod1.zza(zze(class1));
            return;
        }
    }

    public zzod zzd(Class class1)
    {
        return (zzod)zzaHY.get(class1);
    }

    public zzod zze(Class class1)
    {
        zzod zzod2 = (zzod)zzaHY.get(class1);
        zzod zzod1 = zzod2;
        if (zzod2 == null)
        {
            zzod1 = zzf(class1);
            zzaHY.put(class1, zzod1);
        }
        return zzod1;
    }

    public zzob zzxh()
    {
        return new zzob(this);
    }

    public Collection zzxi()
    {
        return zzaHY.values();
    }

    public List zzxj()
    {
        return zzaHZ;
    }

    public long zzxk()
    {
        return zzaHS;
    }

    public void zzxl()
    {
        zzxp().zze(this);
    }

    public boolean zzxm()
    {
        return zzaHR;
    }

    void zzxn()
    {
        zzaHU = zzpO.elapsedRealtime();
        if (zzaHT != 0L)
        {
            zzaHS = zzaHT;
        } else
        {
            zzaHS = zzpO.currentTimeMillis();
        }
        zzaHR = true;
    }

    zzoe zzxo()
    {
        return zzaHQ;
    }

    zzof zzxp()
    {
        return zzaHQ.zzxp();
    }

    boolean zzxq()
    {
        return zzaHX;
    }

    void zzxr()
    {
        zzaHX = true;
    }
}
