// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zza;
import com.google.android.gms.internal.zzb;
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

        public abstract Object zzc(String s, Map map);
    }


    private static final String ID;
    private static final String zzaCP;
    private static final String zzaCd;
    private final zza zzaCQ;

    public zzt(zza zza1)
    {
        super(ID, new String[] {
            zzaCP
        });
        zzaCQ = zza1;
    }

    public com.google.android.gms.internal.zzd.zza zzD(Map map)
    {
        String s = zzdf.zzg((com.google.android.gms.internal.zzd.zza)map.get(zzaCP));
        HashMap hashmap = new HashMap();
        map = (com.google.android.gms.internal.zzd.zza)map.get(zzaCd);
        if (map != null)
        {
            map = ((Map) (zzdf.zzl(map)));
            if (!(map instanceof Map))
            {
                zzbg.zzan("FunctionCallMacro: expected ADDITIONAL_PARAMS to be a map.");
                return zzdf.zzxU();
            }
            java.util.Map.Entry entry;
            for (map = ((Map)map).entrySet().iterator(); map.hasNext(); hashmap.put(entry.getKey().toString(), entry.getValue()))
            {
                entry = (java.util.Map.Entry)map.next();
            }

        }
        try
        {
            map = zzdf.zzE(zzaCQ.zzc(s, hashmap));
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            zzbg.zzan((new StringBuilder()).append("Custom macro/tag ").append(s).append(" threw exception ").append(map.getMessage()).toString());
            return zzdf.zzxU();
        }
        return map;
    }

    public boolean zzwl()
    {
        return false;
    }

    static 
    {
        ID = com.google.android.gms.internal.zza.zzL.toString();
        zzaCP = zzb.zzdz.toString();
        zzaCd = zzb.zzbC.toString();
    }
}
