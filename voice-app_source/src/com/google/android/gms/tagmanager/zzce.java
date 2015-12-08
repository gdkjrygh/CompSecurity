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
    private static final String zzaMO;
    private static final String zzaMP;
    private static final String zzaMQ;
    private static final String zzaMR;

    public zzce()
    {
        super(ID, new String[] {
            zzaMO, zzaMP
        });
    }

    public com.google.android.gms.internal.zzag.zza zzE(Map map)
    {
        Object obj = (com.google.android.gms.internal.zzag.zza)map.get(zzaMO);
        com.google.android.gms.internal.zzag.zza zza = (com.google.android.gms.internal.zzag.zza)map.get(zzaMP);
        if (obj == null || obj == zzdf.zzzQ() || zza == null || zza == zzdf.zzzQ())
        {
            return zzdf.zzzQ();
        }
        byte byte0 = 64;
        if (zzdf.zzk((com.google.android.gms.internal.zzag.zza)map.get(zzaMQ)).booleanValue())
        {
            byte0 = 66;
        }
        map = (com.google.android.gms.internal.zzag.zza)map.get(zzaMR);
        int i;
        if (map != null)
        {
            map = zzdf.zzi(map);
            if (map == zzdf.zzzL())
            {
                return zzdf.zzzQ();
            }
            int j = map.intValue();
            i = j;
            if (j < 0)
            {
                return zzdf.zzzQ();
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
            return zzdf.zzzQ();
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
        return zzdf.zzzQ();
        map = zzdf.zzI(map);
        return map;
    }

    public boolean zzyh()
    {
        return true;
    }

    static 
    {
        ID = zzad.zzbO.toString();
        zzaMO = zzae.zzdw.toString();
        zzaMP = zzae.zzdx.toString();
        zzaMQ = zzae.zzfo.toString();
        zzaMR = zzae.zzfi.toString();
    }
}
