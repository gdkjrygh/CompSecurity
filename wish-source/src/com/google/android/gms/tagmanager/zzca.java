// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zzb;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzak, zzdf

public abstract class zzca extends zzak
{

    private static final String zzaDq;
    private static final String zzaEo;

    public zzca(String s)
    {
        super(s, new String[] {
            zzaDq, zzaEo
        });
    }

    public com.google.android.gms.internal.zzd.zza zzD(Map map)
    {
        for (Iterator iterator = map.values().iterator(); iterator.hasNext();)
        {
            if ((com.google.android.gms.internal.zzd.zza)iterator.next() == zzdf.zzxU())
            {
                return zzdf.zzE(Boolean.valueOf(false));
            }
        }

        com.google.android.gms.internal.zzd.zza zza1 = (com.google.android.gms.internal.zzd.zza)map.get(zzaDq);
        com.google.android.gms.internal.zzd.zza zza2 = (com.google.android.gms.internal.zzd.zza)map.get(zzaEo);
        boolean flag;
        if (zza1 == null || zza2 == null)
        {
            flag = false;
        } else
        {
            flag = zza(zza1, zza2, map);
        }
        return zzdf.zzE(Boolean.valueOf(flag));
    }

    protected abstract boolean zza(com.google.android.gms.internal.zzd.zza zza1, com.google.android.gms.internal.zzd.zza zza2, Map map);

    public volatile String zzwQ()
    {
        return super.zzwQ();
    }

    public volatile Set zzwR()
    {
        return super.zzwR();
    }

    public boolean zzwl()
    {
        return true;
    }

    static 
    {
        zzaDq = zzb.zzbO.toString();
        zzaEo = zzb.zzbP.toString();
    }
}
