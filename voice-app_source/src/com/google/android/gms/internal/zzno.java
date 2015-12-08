// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.common.internal.zzu;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            zznq, zzns, zzlb, zznr

public final class zzno
{

    private final zznr zzaDU;
    private boolean zzaDV;
    private long zzaDW;
    private long zzaDX;
    private long zzaDY;
    private long zzaDZ;
    private long zzaEa;
    private boolean zzaEb;
    private final Map zzaEc;
    private final List zzaEd;
    private final zzlb zzpw;

    zzno(zzno zzno1)
    {
        zzaDU = zzno1.zzaDU;
        zzpw = zzno1.zzpw;
        zzaDW = zzno1.zzaDW;
        zzaDX = zzno1.zzaDX;
        zzaDY = zzno1.zzaDY;
        zzaDZ = zzno1.zzaDZ;
        zzaEa = zzno1.zzaEa;
        zzaEd = new ArrayList(zzno1.zzaEd);
        zzaEc = new HashMap(zzno1.zzaEc.size());
        java.util.Map.Entry entry;
        zznq zznq1;
        for (zzno1 = zzno1.zzaEc.entrySet().iterator(); zzno1.hasNext(); zzaEc.put(entry.getKey(), zznq1))
        {
            entry = (java.util.Map.Entry)zzno1.next();
            zznq1 = zzf((Class)entry.getKey());
            ((zznq)entry.getValue()).zza(zznq1);
        }

    }

    zzno(zznr zznr1, zzlb zzlb1)
    {
        zzu.zzu(zznr1);
        zzu.zzu(zzlb1);
        zzaDU = zznr1;
        zzpw = zzlb1;
        zzaDZ = 0x1b7740L;
        zzaEa = 0xb43e9400L;
        zzaEc = new HashMap();
        zzaEd = new ArrayList();
    }

    private static zznq zzf(Class class1)
    {
        try
        {
            class1 = (zznq)class1.newInstance();
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
        zzaDX = l;
    }

    public void zzb(zznq zznq1)
    {
        zzu.zzu(zznq1);
        Class class1 = zznq1.getClass();
        if (class1.getSuperclass() != com/google/android/gms/internal/zznq)
        {
            throw new IllegalArgumentException();
        } else
        {
            zznq1.zza(zze(class1));
            return;
        }
    }

    public zznq zzd(Class class1)
    {
        return (zznq)zzaEc.get(class1);
    }

    public zznq zze(Class class1)
    {
        zznq zznq2 = (zznq)zzaEc.get(class1);
        zznq zznq1 = zznq2;
        if (zznq2 == null)
        {
            zznq1 = zzf(class1);
            zzaEc.put(class1, zznq1);
        }
        return zznq1;
    }

    public zzno zzvP()
    {
        return new zzno(this);
    }

    public Collection zzvQ()
    {
        return zzaEc.values();
    }

    public List zzvR()
    {
        return zzaEd;
    }

    public long zzvS()
    {
        return zzaDW;
    }

    public void zzvT()
    {
        zzvX().zze(this);
    }

    public boolean zzvU()
    {
        return zzaDV;
    }

    void zzvV()
    {
        zzaDY = zzpw.elapsedRealtime();
        if (zzaDX != 0L)
        {
            zzaDW = zzaDX;
        } else
        {
            zzaDW = zzpw.currentTimeMillis();
        }
        zzaDV = true;
    }

    zznr zzvW()
    {
        return zzaDU;
    }

    zzns zzvX()
    {
        return zzaDU.zzvX();
    }

    boolean zzvY()
    {
        return zzaEb;
    }

    void zzvZ()
    {
        zzaEb = true;
    }
}
