// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zzad;
import com.google.android.gms.internal.zzae;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzak, zzdf, zzbg

class zzt extends zzak
{
    public static interface zza
    {

        public abstract Object zzd(String s, Map map);
    }


    private static final String ID;
    private static final String zzaKr;
    private static final String zzaLd;
    private final zza zzaLe;

    public zzt(zza zza1)
    {
        super(ID, new String[] {
            zzaLd
        });
        zzaLe = zza1;
    }

    public com.google.android.gms.internal.zzag.zza zzE(Map map)
    {
        String s = zzdf.zzg((com.google.android.gms.internal.zzag.zza)map.get(zzaLd));
        HashMap hashmap = new HashMap();
        map = (com.google.android.gms.internal.zzag.zza)map.get(zzaKr);
        if (map != null)
        {
            map = ((Map) (zzdf.zzl(map)));
            if (!(map instanceof Map))
            {
                zzbg.zzaC("FunctionCallMacro: expected ADDITIONAL_PARAMS to be a map.");
                return zzdf.zzzQ();
            }
            java.util.Map.Entry entry;
            for (map = ((Map)map).entrySet().iterator(); map.hasNext(); hashmap.put(entry.getKey().toString(), entry.getValue()))
            {
                entry = (java.util.Map.Entry)map.next();
            }

        }
        try
        {
            map = zzdf.zzI(zzaLe.zzd(s, hashmap));
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            zzbg.zzaC((new StringBuilder()).append("Custom macro/tag ").append(s).append(" threw exception ").append(map.getMessage()).toString());
            return zzdf.zzzQ();
        }
        return map;
    }

    public boolean zzyh()
    {
        return false;
    }

    static 
    {
        ID = zzad.zzbt.toString();
        zzaLd = zzae.zzfh.toString();
        zzaKr = zzae.zzdk.toString();
    }
}
