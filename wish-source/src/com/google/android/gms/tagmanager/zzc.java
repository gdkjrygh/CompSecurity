// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.internal.zza;
import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzak, zza, zzdf

class zzc extends zzak
{

    private static final String ID;
    private final com.google.android.gms.tagmanager.zza zzaCa;

    public zzc(Context context)
    {
        this(zza.zzan(context));
    }

    zzc(com.google.android.gms.tagmanager.zza zza1)
    {
        super(ID, new String[0]);
        zzaCa = zza1;
    }

    public com.google.android.gms.internal.zzd.zza zzD(Map map)
    {
        boolean flag;
        if (!zzaCa.isLimitAdTrackingEnabled())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return zzdf.zzE(Boolean.valueOf(flag));
    }

    public boolean zzwl()
    {
        return false;
    }

    static 
    {
        ID = zza.zzv.toString();
    }
}
