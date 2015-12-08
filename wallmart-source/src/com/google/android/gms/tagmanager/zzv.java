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
    private static final String zzaPI;
    private final DataLayer zzaOT;

    public zzv(DataLayer datalayer)
    {
        super(ID, new String[] {
            NAME
        });
        zzaOT = datalayer;
    }

    public com.google.android.gms.internal.zzag.zza zzG(Map map)
    {
        Object obj = zzaOT.get(zzdf.zzg((com.google.android.gms.internal.zzag.zza)map.get(NAME)));
        if (obj == null)
        {
            map = (com.google.android.gms.internal.zzag.zza)map.get(zzaPI);
            if (map != null)
            {
                return map;
            } else
            {
                return zzdf.zzBg();
            }
        } else
        {
            return zzdf.zzK(obj);
        }
    }

    public boolean zzzx()
    {
        return false;
    }

    static 
    {
        ID = zzad.zzbn.toString();
        NAME = zzae.zzfR.toString();
        zzaPI = zzae.zzeC.toString();
    }
}
