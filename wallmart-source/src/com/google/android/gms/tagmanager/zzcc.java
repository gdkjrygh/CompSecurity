// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zzad;
import com.google.android.gms.internal.zzae;
import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzak, zzdf, zzde

class zzcc extends zzak
{

    private static final String ID;
    private static final String zzaRg;
    private static final String zzaRh;

    public zzcc()
    {
        super(ID, new String[0]);
    }

    public com.google.android.gms.internal.zzag.zza zzG(Map map)
    {
        Object obj;
        obj = (com.google.android.gms.internal.zzag.zza)map.get(zzaRg);
        map = (com.google.android.gms.internal.zzag.zza)map.get(zzaRh);
        if (obj == null || obj == zzdf.zzBg() || map == null || map == zzdf.zzBg()) goto _L2; else goto _L1
_L1:
        obj = zzdf.zzh(((com.google.android.gms.internal.zzag.zza) (obj)));
        map = zzdf.zzh(map);
        if (obj == zzdf.zzBe() || map == zzdf.zzBe()) goto _L2; else goto _L3
_L3:
        double d;
        double d1;
        d1 = ((zzde) (obj)).doubleValue();
        d = map.doubleValue();
        if (d1 > d) goto _L2; else goto _L4
_L4:
        return zzdf.zzK(Long.valueOf(Math.round((d - d1) * Math.random() + d1)));
_L2:
        d = 2147483647D;
        d1 = 0.0D;
        if (true) goto _L4; else goto _L5
_L5:
    }

    public boolean zzzx()
    {
        return false;
    }

    static 
    {
        ID = zzad.zzbB.toString();
        zzaRg = zzae.zzfP.toString();
        zzaRh = zzae.zzfN.toString();
    }
}
