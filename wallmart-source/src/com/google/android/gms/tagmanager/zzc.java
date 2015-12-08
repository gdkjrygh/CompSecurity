// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.internal.zzad;
import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzak, zza, zzdf

class zzc extends zzak
{

    private static final String ID;
    private final zza zzaOI;

    public zzc(Context context)
    {
        this(zza.zzaL(context));
    }

    zzc(zza zza1)
    {
        super(ID, new String[0]);
        zzaOI = zza1;
    }

    public com.google.android.gms.internal.zzag.zza zzG(Map map)
    {
        boolean flag;
        if (!zzaOI.isLimitAdTrackingEnabled())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return zzdf.zzK(Boolean.valueOf(flag));
    }

    public boolean zzzx()
    {
        return false;
    }

    static 
    {
        ID = zzad.zzbg.toString();
    }
}
