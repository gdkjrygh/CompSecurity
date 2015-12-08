// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.internal.zza;
import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzak, zza, zzdf

class zzb extends zzak
{

    private static final String ID;
    private final com.google.android.gms.tagmanager.zza zzaCa;

    public zzb(Context context)
    {
        this(zza.zzan(context));
    }

    zzb(com.google.android.gms.tagmanager.zza zza1)
    {
        super(ID, new String[0]);
        zzaCa = zza1;
    }

    public com.google.android.gms.internal.zzd.zza zzD(Map map)
    {
        map = zzaCa.zzwh();
        if (map == null)
        {
            return zzdf.zzxU();
        } else
        {
            return zzdf.zzE(map);
        }
    }

    public boolean zzwl()
    {
        return false;
    }

    static 
    {
        ID = zza.zzu.toString();
    }
}
