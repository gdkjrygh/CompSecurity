// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zza;
import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzak, zzdf

class zzq extends zzak
{

    private static final String ID;
    private final String zzacK;

    public zzq(String s)
    {
        super(ID, new String[0]);
        zzacK = s;
    }

    public com.google.android.gms.internal.zzd.zza zzD(Map map)
    {
        if (zzacK == null)
        {
            return zzdf.zzxU();
        } else
        {
            return zzdf.zzE(zzacK);
        }
    }

    public boolean zzwl()
    {
        return true;
    }

    static 
    {
        ID = zza.zzD.toString();
    }
}
