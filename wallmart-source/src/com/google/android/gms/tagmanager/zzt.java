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
    private static final String zzaOL;
    private static final String zzaPx;
    private final zza zzaPy;

    public zzt(zza zza1)
    {
        super(ID, new String[] {
            zzaPx
        });
        zzaPy = zza1;
    }

    public com.google.android.gms.internal.zzag.zza zzG(Map map)
    {
        String s = zzdf.zzg((com.google.android.gms.internal.zzag.zza)map.get(zzaPx));
        HashMap hashmap = new HashMap();
        map = (com.google.android.gms.internal.zzag.zza)map.get(zzaOL);
        if (map != null)
        {
            map = ((Map) (zzdf.zzl(map)));
            if (!(map instanceof Map))
            {
                zzbg.zzaE("FunctionCallMacro: expected ADDITIONAL_PARAMS to be a map.");
                return zzdf.zzBg();
            }
            java.util.Map.Entry entry;
            for (map = ((Map)map).entrySet().iterator(); map.hasNext(); hashmap.put(entry.getKey().toString(), entry.getValue()))
            {
                entry = (java.util.Map.Entry)map.next();
            }

        }
        try
        {
            map = zzdf.zzK(zzaPy.zzd(s, hashmap));
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            zzbg.zzaE((new StringBuilder()).append("Custom macro/tag ").append(s).append(" threw exception ").append(map.getMessage()).toString());
            return zzdf.zzBg();
        }
        return map;
    }

    public boolean zzzx()
    {
        return false;
    }

    static 
    {
        ID = zzad.zzbw.toString();
        zzaPx = zzae.zzfk.toString();
        zzaOL = zzae.zzdn.toString();
    }
}
