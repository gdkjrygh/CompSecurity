// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zzad;
import com.google.android.gms.internal.zzae;
import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzak, zzdf, DataLayer

class zzv extends zzak
{

    private static final String ID;
    private static final String NAME;
    private static final String zzaLo;
    private final DataLayer zzaKz;

    public zzv(DataLayer datalayer)
    {
        super(ID, new String[] {
            NAME
        });
        zzaKz = datalayer;
    }

    public com.google.android.gms.internal.zzag.zza zzE(Map map)
    {
        Object obj = zzaKz.get(zzdf.zzg((com.google.android.gms.internal.zzag.zza)map.get(NAME)));
        if (obj == null)
        {
            map = (com.google.android.gms.internal.zzag.zza)map.get(zzaLo);
            if (map != null)
            {
                return map;
            } else
            {
                return zzdf.zzzQ();
            }
        } else
        {
            return zzdf.zzI(obj);
        }
    }

    public boolean zzyh()
    {
        return false;
    }

    static 
    {
        ID = zzad.zzbk.toString();
        NAME = zzae.zzfO.toString();
        zzaLo = zzae.zzez.toString();
    }
}
