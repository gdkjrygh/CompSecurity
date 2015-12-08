// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.internal.zzad;
import com.google.android.gms.internal.zzae;
import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzak, zzdf, zzax

class zzaw extends zzak
{

    private static final String ID;
    private static final String zzaKp;
    private final Context zzpH;

    public zzaw(Context context)
    {
        super(ID, new String[0]);
        zzpH = context;
    }

    public com.google.android.gms.internal.zzag.zza zzE(Map map)
    {
        if ((com.google.android.gms.internal.zzag.zza)map.get(zzaKp) != null)
        {
            map = zzdf.zzg((com.google.android.gms.internal.zzag.zza)map.get(zzaKp));
        } else
        {
            map = null;
        }
        map = zzax.zzj(zzpH, map);
        if (map != null)
        {
            return zzdf.zzI(map);
        } else
        {
            return zzdf.zzzQ();
        }
    }

    public boolean zzyh()
    {
        return true;
    }

    static 
    {
        ID = zzad.zzbL.toString();
        zzaKp = zzae.zzdY.toString();
    }
}
