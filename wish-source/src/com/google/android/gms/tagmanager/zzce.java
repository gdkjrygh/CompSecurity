// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zza;
import com.google.android.gms.internal.zzb;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzak, zzdf

class zzce extends zzak
{

    private static final String ID;
    private static final String zzaEA;
    private static final String zzaEB;
    private static final String zzaEC;
    private static final String zzaED;

    public zzce()
    {
        super(ID, new String[] {
            zzaEA, zzaEB
        });
    }

    public com.google.android.gms.internal.zzd.zza zzD(Map map)
    {
        Object obj = (com.google.android.gms.internal.zzd.zza)map.get(zzaEA);
        com.google.android.gms.internal.zzd.zza zza1 = (com.google.android.gms.internal.zzd.zza)map.get(zzaEB);
        if (obj == null || obj == zzdf.zzxU() || zza1 == null || zza1 == zzdf.zzxU())
        {
            return zzdf.zzxU();
        }
        byte byte0 = 64;
        if (zzdf.zzk((com.google.android.gms.internal.zzd.zza)map.get(zzaEC)).booleanValue())
        {
            byte0 = 66;
        }
        map = (com.google.android.gms.internal.zzd.zza)map.get(zzaED);
        int i;
        if (map != null)
        {
            map = zzdf.zzi(map);
            if (map == zzdf.zzxP())
            {
                return zzdf.zzxU();
            }
            int j = map.intValue();
            i = j;
            if (j < 0)
            {
                return zzdf.zzxU();
            }
        } else
        {
            i = 1;
        }
        try
        {
            map = zzdf.zzg(((com.google.android.gms.internal.zzd.zza) (obj)));
            obj = zzdf.zzg(zza1);
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            return zzdf.zzxU();
        }
        zza1 = null;
        obj = Pattern.compile(((String) (obj)), byte0).matcher(map);
        map = zza1;
        if (!((Matcher) (obj)).find())
        {
            break MISSING_BLOCK_LABEL_186;
        }
        map = zza1;
        if (((Matcher) (obj)).groupCount() >= i)
        {
            map = ((Matcher) (obj)).group(i);
        }
        if (map != null)
        {
            break MISSING_BLOCK_LABEL_194;
        }
        return zzdf.zzxU();
        map = zzdf.zzE(map);
        return map;
    }

    public boolean zzwl()
    {
        return true;
    }

    static 
    {
        ID = zza.zzag.toString();
        zzaEA = zzb.zzbO.toString();
        zzaEB = zzb.zzbP.toString();
        zzaEC = zzb.zzdG.toString();
        zzaED = zzb.zzdA.toString();
    }
}
