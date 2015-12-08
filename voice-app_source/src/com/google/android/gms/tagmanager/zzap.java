// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zzad;
import com.google.android.gms.internal.zzae;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzak, zzdf, zzk, zzbg

class zzap extends zzak
{

    private static final String ID;
    private static final String zzaLE;
    private static final String zzaLG;
    private static final String zzaLK;

    public zzap()
    {
        super(ID, new String[] {
            zzaLE
        });
    }

    private byte[] zzd(String s, byte abyte0[])
        throws NoSuchAlgorithmException
    {
        s = MessageDigest.getInstance(s);
        s.update(abyte0);
        return s.digest();
    }

    public com.google.android.gms.internal.zzag.zza zzE(Map map)
    {
        Object obj = (com.google.android.gms.internal.zzag.zza)map.get(zzaLE);
        if (obj == null || obj == zzdf.zzzQ())
        {
            return zzdf.zzzQ();
        }
        String s = zzdf.zzg(((com.google.android.gms.internal.zzag.zza) (obj)));
        obj = (com.google.android.gms.internal.zzag.zza)map.get(zzaLK);
        if (obj == null)
        {
            obj = "MD5";
        } else
        {
            obj = zzdf.zzg(((com.google.android.gms.internal.zzag.zza) (obj)));
        }
        map = (com.google.android.gms.internal.zzag.zza)map.get(zzaLG);
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
            map = zzk.zzee(s);
        } else
        {
            zzbg.zzaz((new StringBuilder()).append("Hash: unknown input format: ").append(map).toString());
            return zzdf.zzzQ();
        }
        try
        {
            map = zzdf.zzI(zzk.zzi(zzd(((String) (obj)), map)));
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            zzbg.zzaz((new StringBuilder()).append("Hash: unknown algorithm: ").append(((String) (obj))).toString());
            return zzdf.zzzQ();
        }
        return map;
    }

    public boolean zzyh()
    {
        return true;
    }

    static 
    {
        ID = zzad.zzbK.toString();
        zzaLE = zzae.zzdw.toString();
        zzaLK = zzae.zzdn.toString();
        zzaLG = zzae.zzfq.toString();
    }
}
