// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.internal.zza;
import com.google.android.gms.internal.zzb;
import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzak, zzdf, zzax

class zzaw extends zzak
{

    private static final String ID;
    private static final String zzaCb;
    private final Context zzmH;

    public zzaw(Context context)
    {
        super(ID, new String[0]);
        zzmH = context;
    }

    public com.google.android.gms.internal.zzd.zza zzD(Map map)
    {
        if ((com.google.android.gms.internal.zzd.zza)map.get(zzaCb) != null)
        {
            map = zzdf.zzg((com.google.android.gms.internal.zzd.zza)map.get(zzaCb));
        } else
        {
            map = null;
        }
        map = zzax.zzi(zzmH, map);
        if (map != null)
        {
            return zzdf.zzE(map);
        } else
        {
            return zzdf.zzxU();
        }
    }

    public boolean zzwl()
    {
        return true;
    }

    static 
    {
        ID = zza.zzad.toString();
        zzaCb = zzb.zzcq.toString();
    }
}
