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
    private static final String zzaOJ;
    private final Context context;

    public zzaw(Context context1)
    {
        super(ID, new String[0]);
        context = context1;
    }

    public com.google.android.gms.internal.zzag.zza zzG(Map map)
    {
        if ((com.google.android.gms.internal.zzag.zza)map.get(zzaOJ) != null)
        {
            map = zzdf.zzg((com.google.android.gms.internal.zzag.zza)map.get(zzaOJ));
        } else
        {
            map = null;
        }
        map = zzax.zzk(context, map);
        if (map != null)
        {
            return zzdf.zzK(map);
        } else
        {
            return zzdf.zzBg();
        }
    }

    public boolean zzzx()
    {
        return true;
    }

    static 
    {
        ID = zzad.zzbO.toString();
        zzaOJ = zzae.zzeb.toString();
    }
}
