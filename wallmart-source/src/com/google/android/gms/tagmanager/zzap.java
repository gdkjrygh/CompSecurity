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
    private static final String zzaPY;
    private static final String zzaQa;
    private static final String zzaQe;

    public zzap()
    {
        super(ID, new String[] {
            zzaPY
        });
    }

    private byte[] zzd(String s, byte abyte0[])
        throws NoSuchAlgorithmException
    {
        s = MessageDigest.getInstance(s);
        s.update(abyte0);
        return s.digest();
    }

    public com.google.android.gms.internal.zzag.zza zzG(Map map)
    {
        Object obj = (com.google.android.gms.internal.zzag.zza)map.get(zzaPY);
        if (obj == null || obj == zzdf.zzBg())
        {
            return zzdf.zzBg();
        }
        String s = zzdf.zzg(((com.google.android.gms.internal.zzag.zza) (obj)));
        obj = (com.google.android.gms.internal.zzag.zza)map.get(zzaQe);
        if (obj == null)
        {
            obj = "MD5";
        } else
        {
            obj = zzdf.zzg(((com.google.android.gms.internal.zzag.zza) (obj)));
        }
        map = (com.google.android.gms.internal.zzag.zza)map.get(zzaQa);
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
            map = zzk.zzet(s);
        } else
        {
            zzbg.e((new StringBuilder()).append("Hash: unknown input format: ").append(map).toString());
            return zzdf.zzBg();
        }
        try
        {
            map = zzdf.zzK(zzk.zzi(zzd(((String) (obj)), map)));
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            zzbg.e((new StringBuilder()).append("Hash: unknown algorithm: ").append(((String) (obj))).toString());
            return zzdf.zzBg();
        }
        return map;
    }

    public boolean zzzx()
    {
        return true;
    }

    static 
    {
        ID = zzad.zzbN.toString();
        zzaPY = zzae.zzdz.toString();
        zzaQe = zzae.zzdq.toString();
        zzaQa = zzae.zzft.toString();
    }
}
