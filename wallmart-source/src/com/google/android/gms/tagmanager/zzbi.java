// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zzad;
import com.google.android.gms.internal.zzae;
import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzak, zzdf

class zzbi extends zzak
{

    private static final String ID;
    private static final String zzaPY;

    public zzbi()
    {
        super(ID, new String[] {
            zzaPY
        });
    }

    public com.google.android.gms.internal.zzag.zza zzG(Map map)
    {
        return zzdf.zzK(zzdf.zzg((com.google.android.gms.internal.zzag.zza)map.get(zzaPY)).toLowerCase());
    }

    public boolean zzzx()
    {
        return true;
    }

    static 
    {
        ID = zzad.zzbT.toString();
        zzaPY = zzae.zzdz.toString();
    }
}
