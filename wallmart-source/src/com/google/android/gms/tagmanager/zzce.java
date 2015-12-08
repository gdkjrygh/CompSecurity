// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zzad;
import com.google.android.gms.internal.zzae;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzak, zzdf

class zzce extends zzak
{

    private static final String ID;
    private static final String zzaRi;
    private static final String zzaRj;
    private static final String zzaRk;
    private static final String zzaRl;

    public zzce()
    {
        super(ID, new String[] {
            zzaRi, zzaRj
        });
    }

    public com.google.android.gms.internal.zzag.zza zzG(Map map)
    {
        Object obj = (com.google.android.gms.internal.zzag.zza)map.get(zzaRi);
        com.google.android.gms.internal.zzag.zza zza = (com.google.android.gms.internal.zzag.zza)map.get(zzaRj);
        if (obj == null || obj == zzdf.zzBg() || zza == null || zza == zzdf.zzBg())
        {
            return zzdf.zzBg();
        }
        byte byte0 = 64;
        if (zzdf.zzk((com.google.android.gms.internal.zzag.zza)map.get(zzaRk)).booleanValue())
        {
            byte0 = 66;
        }
        map = (com.google.android.gms.internal.zzag.zza)map.get(zzaRl);
        int i;
        if (map != null)
        {
            map = zzdf.zzi(map);
            if (map == zzdf.zzBb())
            {
                return zzdf.zzBg();
            }
            int j = map.intValue();
            i = j;
            if (j < 0)
            {
                return zzdf.zzBg();
            }
        } else
        {
            i = 1;
        }
        try
        {
            map = zzdf.zzg(((com.google.android.gms.internal.zzag.zza) (obj)));
            obj = zzdf.zzg(zza);
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            return zzdf.zzBg();
        }
        zza = null;
        obj = Pattern.compile(((String) (obj)), byte0).matcher(map);
        map = zza;
        if (!((Matcher) (obj)).find())
        {
            break MISSING_BLOCK_LABEL_186;
        }
        map = zza;
        if (((Matcher) (obj)).groupCount() >= i)
        {
            map = ((Matcher) (obj)).group(i);
        }
        if (map != null)
        {
            break MISSING_BLOCK_LABEL_194;
        }
        return zzdf.zzBg();
        map = zzdf.zzK(map);
        return map;
    }

    public boolean zzzx()
    {
        return true;
    }

    static 
    {
        ID = zzad.zzbR.toString();
        zzaRi = zzae.zzdz.toString();
        zzaRj = zzae.zzdA.toString();
        zzaRk = zzae.zzfr.toString();
        zzaRl = zzae.zzfl.toString();
    }
}
