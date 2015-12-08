// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.internal.zzad;
import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzak, zza, zzdf

class zzb extends zzak
{

    private static final String ID;
    private final zza zzaOI;

    public zzb(Context context)
    {
        this(zza.zzaL(context));
    }

    zzb(zza zza1)
    {
        super(ID, new String[0]);
        zzaOI = zza1;
    }

    public com.google.android.gms.internal.zzag.zza zzG(Map map)
    {
        map = zzaOI.zzzt();
        if (map == null)
        {
            return zzdf.zzBg();
        } else
        {
            return zzdf.zzK(map);
        }
    }

    public boolean zzzx()
    {
        return false;
    }

    static 
    {
        ID = zzad.zzbf.toString();
    }
}
