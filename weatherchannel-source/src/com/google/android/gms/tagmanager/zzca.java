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

    private static final String zzaLE;
    private static final String zzaMC;

    public zzca(String s)
    {
        super(s, new String[] {
            zzaLE, zzaMC
        });
    }

    public com.google.android.gms.internal.zzag.zza zzE(Map map)
    {
        for (Iterator iterator = map.values().iterator(); iterator.hasNext();)
        {
            if ((com.google.android.gms.internal.zzag.zza)iterator.next() == zzdf.zzzQ())
            {
                return zzdf.zzI(Boolean.valueOf(false));
            }
        }

        com.google.android.gms.internal.zzag.zza zza1 = (com.google.android.gms.internal.zzag.zza)map.get(zzaLE);
        com.google.android.gms.internal.zzag.zza zza2 = (com.google.android.gms.internal.zzag.zza)map.get(zzaMC);
        boolean flag;
        if (zza1 == null || zza2 == null)
        {
            flag = false;
        } else
        {
            flag = zza(zza1, zza2, map);
        }
        return zzdf.zzI(Boolean.valueOf(flag));
    }

    protected abstract boolean zza(com.google.android.gms.internal.zzag.zza zza1, com.google.android.gms.internal.zzag.zza zza2, Map map);

    public volatile String zzyM()
    {
        return super.zzyM();
    }

    public volatile Set zzyN()
    {
        return super.zzyN();
    }

    public boolean zzyh()
    {
        return true;
    }

    static 
    {
        zzaLE = zzae.zzdw.toString();
        zzaMC = zzae.zzdx.toString();
    }
}
