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

class zze extends zzak
{

    private static final String ID;
    private static final String zzaOJ;
    private static final String zzaOK;
    private final Context context;

    public zze(Context context1)
    {
        super(ID, new String[] {
            zzaOK
        });
        context = context1;
    }

    public com.google.android.gms.internal.zzag.zza zzG(Map map)
    {
        Object obj = (com.google.android.gms.internal.zzag.zza)map.get(zzaOK);
        if (obj == null)
        {
            return zzdf.zzBg();
        }
        obj = zzdf.zzg(((com.google.android.gms.internal.zzag.zza) (obj)));
        map = (com.google.android.gms.internal.zzag.zza)map.get(zzaOJ);
        if (map != null)
        {
            map = zzdf.zzg(map);
        } else
        {
            map = null;
        }
        map = zzax.zzg(context, ((String) (obj)), map);
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
        ID = zzad.zzbJ.toString();
        zzaOJ = zzae.zzeb.toString();
        zzaOK = zzae.zzee.toString();
    }
}
