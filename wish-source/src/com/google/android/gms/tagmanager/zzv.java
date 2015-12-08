// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zza;
import com.google.android.gms.internal.zzb;
import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzak, zzdf, DataLayer

class zzv extends zzak
{

    private static final String ID;
    private static final String NAME;
    private static final String zzaDa;
    private final DataLayer zzaCl;

    public zzv(DataLayer datalayer)
    {
        super(ID, new String[] {
            NAME
        });
        zzaCl = datalayer;
    }

    public com.google.android.gms.internal.zzd.zza zzD(Map map)
    {
        Object obj = zzaCl.get(zzdf.zzg((com.google.android.gms.internal.zzd.zza)map.get(NAME)));
        if (obj == null)
        {
            map = (com.google.android.gms.internal.zzd.zza)map.get(zzaDa);
            if (map != null)
            {
                return map;
            } else
            {
                return zzdf.zzxU();
            }
        } else
        {
            return zzdf.zzE(obj);
        }
    }

    public boolean zzwl()
    {
        return false;
    }

    static 
    {
        ID = zza.zzC.toString();
        NAME = zzb.zzeg.toString();
        zzaDa = zzb.zzcR.toString();
    }
}
