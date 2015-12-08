// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zza;
import com.google.android.gms.internal.zzb;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzak, zzdf, zzk, zzbg

class zzap extends zzak
{

    private static final String ID;
    private static final String zzaDq;
    private static final String zzaDs;
    private static final String zzaDw;

    public zzap()
    {
        super(ID, new String[] {
            zzaDq
        });
    }

    private byte[] zzd(String s, byte abyte0[])
        throws NoSuchAlgorithmException
    {
        s = MessageDigest.getInstance(s);
        s.update(abyte0);
        return s.digest();
    }

    public com.google.android.gms.internal.zzd.zza zzD(Map map)
    {
        Object obj = (com.google.android.gms.internal.zzd.zza)map.get(zzaDq);
        if (obj == null || obj == zzdf.zzxU())
        {
            return zzdf.zzxU();
        }
        String s = zzdf.zzg(((com.google.android.gms.internal.zzd.zza) (obj)));
        obj = (com.google.android.gms.internal.zzd.zza)map.get(zzaDw);
        if (obj == null)
        {
            obj = "MD5";
        } else
        {
            obj = zzdf.zzg(((com.google.android.gms.internal.zzd.zza) (obj)));
        }
        map = (com.google.android.gms.internal.zzd.zza)map.get(zzaDs);
        if (map == null)
        {
            map = "text";
        } else
        {
            map = zzdf.zzg(map);
        }
        if ("text".equals(map))
        {
            map = s.getBytes();
        } else
        if ("base16".equals(map))
        {
            map = zzk.zzdw(s);
        } else
        {
            zzbg.zzak((new StringBuilder()).append("Hash: unknown input format: ").append(map).toString());
            return zzdf.zzxU();
        }
        try
        {
            map = zzdf.zzE(zzk.zzg(zzd(((String) (obj)), map)));
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            zzbg.zzak((new StringBuilder()).append("Hash: unknown algorithm: ").append(((String) (obj))).toString());
            return zzdf.zzxU();
        }
        return map;
    }

    public boolean zzwl()
    {
        return true;
    }

    static 
    {
        ID = zza.zzac.toString();
        zzaDq = zzb.zzbO.toString();
        zzaDw = zzb.zzbF.toString();
        zzaDs = zzb.zzdI.toString();
    }
}
