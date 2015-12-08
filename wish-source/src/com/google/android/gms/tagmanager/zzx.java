// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zza;
import com.google.android.gms.internal.zzb;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzdd, zzdf, DataLayer

class zzx extends zzdd
{

    private static final String ID;
    private static final String VALUE;
    private static final String zzaDl;
    private final DataLayer zzaCl;

    public zzx(DataLayer datalayer)
    {
        super(ID, new String[] {
            VALUE
        });
        zzaCl = datalayer;
    }

    private void zza(com.google.android.gms.internal.zzd.zza zza1)
    {
        if (zza1 != null && zza1 != zzdf.zzxO())
        {
            if ((zza1 = zzdf.zzg(zza1)) != zzdf.zzxT())
            {
                zzaCl.zzdF(zza1);
                return;
            }
        }
    }

    private void zzb(com.google.android.gms.internal.zzd.zza zza1)
    {
        if (zza1 != null && zza1 != zzdf.zzxO())
        {
            if ((zza1 = ((com.google.android.gms.internal.zzd.zza) (zzdf.zzl(zza1)))) instanceof List)
            {
                zza1 = ((List)zza1).iterator();
                while (zza1.hasNext()) 
                {
                    Object obj = zza1.next();
                    if (obj instanceof Map)
                    {
                        obj = (Map)obj;
                        zzaCl.push(((Map) (obj)));
                    }
                }
            }
        }
    }

    public void zzF(Map map)
    {
        zzb((com.google.android.gms.internal.zzd.zza)map.get(VALUE));
        zza((com.google.android.gms.internal.zzd.zza)map.get(zzaDl));
    }

    static 
    {
        ID = zza.zzah.toString();
        VALUE = zzb.zzfU.toString();
        zzaDl = zzb.zzcl.toString();
    }
}
