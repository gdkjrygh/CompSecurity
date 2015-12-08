// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zzae;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzak, zzdf

public abstract class zzca extends zzak
{

    private static final String zzaPY;
    private static final String zzaQW;

    public zzca(String s)
    {
        super(s, new String[] {
            zzaPY, zzaQW
        });
    }

    public volatile String zzAc()
    {
        return super.zzAc();
    }

    public volatile Set zzAd()
    {
        return super.zzAd();
    }

    public com.google.android.gms.internal.zzag.zza zzG(Map map)
    {
        for (Iterator iterator = map.values().iterator(); iterator.hasNext();)
        {
            if ((com.google.android.gms.internal.zzag.zza)iterator.next() == zzdf.zzBg())
            {
                return zzdf.zzK(Boolean.valueOf(false));
            }
        }

        com.google.android.gms.internal.zzag.zza zza1 = (com.google.android.gms.internal.zzag.zza)map.get(zzaPY);
        com.google.android.gms.internal.zzag.zza zza2 = (com.google.android.gms.internal.zzag.zza)map.get(zzaQW);
        boolean flag;
        if (zza1 == null || zza2 == null)
        {
            flag = false;
        } else
        {
            flag = zza(zza1, zza2, map);
        }
        return zzdf.zzK(Boolean.valueOf(flag));
    }

    protected abstract boolean zza(com.google.android.gms.internal.zzag.zza zza1, com.google.android.gms.internal.zzag.zza zza2, Map map);

    public boolean zzzx()
    {
        return true;
    }

    static 
    {
        zzaPY = zzae.zzdz.toString();
        zzaQW = zzae.zzdA.toString();
    }
}
