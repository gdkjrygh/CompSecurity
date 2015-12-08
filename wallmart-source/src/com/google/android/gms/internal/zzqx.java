// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.tagmanager.zzbg;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            zzlo, zzqn, zzqi, zzqo, 
//            zzql, zzlm

public abstract class zzqx
{
    public static final class zza extends Enum
    {

        public static final zza zzaUq;
        public static final zza zzaUr;
        public static final zza zzaUs;
        private static final zza zzaUt[];

        public static zza valueOf(String s)
        {
            return (zza)Enum.valueOf(com/google/android/gms/internal/zzqx$zza, s);
        }

        public static zza[] values()
        {
            return (zza[])zzaUt.clone();
        }

        static 
        {
            zzaUq = new zza("NOT_AVAILABLE", 0);
            zzaUr = new zza("IO_ERROR", 1);
            zzaUs = new zza("SERVER_ERROR", 2);
            zzaUt = (new zza[] {
                zzaUq, zzaUr, zzaUs
            });
        }

        private zza(String s, int i)
        {
            super(s, i);
        }
    }

    public class zzb
    {

        private final zzqo.zza.zza zzaTJ;
        private final long zzaTL;
        private final Object zzaUu;

        public long zzBB()
        {
            return zzaTL;
        }

        public Object zzBX()
        {
            return zzaUu;
        }

        public zzqo.zza.zza zzBx()
        {
            return zzaTJ;
        }
    }


    private zzqn zzaUo;
    private zzql zzaUp;
    private zzlm zzpO;

    public zzqx(zzqn zzqn1, zzql zzql1)
    {
        this(zzqn1, zzql1, zzlo.zzpN());
    }

    public zzqx(zzqn zzqn1, zzql zzql1, zzlm zzlm1)
    {
        boolean flag = true;
        super();
        if (zzqn1.zzBv().size() != 1)
        {
            flag = false;
        }
        zzx.zzZ(flag);
        zzaUo = zzqn1;
        zzaUp = zzql1;
        zzpO = zzlm1;
    }

    protected abstract zzb zza(zzqi zzqi1);

    protected abstract void zza(zzqo zzqo1);

    public void zza(zza zza1)
    {
        zzbg.e((new StringBuilder()).append("ResourceManager: Failed to download a resource: ").append(zza1.name()).toString());
        zza1 = (zzqi)zzaUo.zzBv().get(0);
        zzb zzb1 = zza(((zzqi) (zza1)));
        if (zzb1 != null && (zzb1.zzBX() instanceof zzqp.zzc))
        {
            zza1 = new zzqo.zza(Status.zzaaD, zza1, null, (zzqp.zzc)zzb1.zzBX(), zzb1.zzBx(), zzb1.zzBB());
        } else
        {
            zza1 = new zzqo.zza(Status.zzaaF, zza1, zzqo.zza.zza.zzaTO);
        }
        zza(new zzqo(zza1));
    }

    public void zzu(byte abyte0[])
    {
        Object obj;
        zzqo.zza.zza zza1;
        zzqo.zza.zza zza2;
        zzqi zzqi1;
        long l;
        long l1;
        zzbg.v((new StringBuilder()).append("ResourceManager: Resource downloaded from Network: ").append(zzaUo.getId()).toString());
        zzqi1 = (zzqi)zzaUo.zzBv().get(0);
        zza2 = zzqo.zza.zza.zzaTO;
        obj = null;
        l1 = 0L;
        l = l1;
        zza1 = zza2;
        Object obj1 = zzaUp.zzt(abyte0);
        l = l1;
        obj = obj1;
        zza1 = zza2;
        l1 = zzpO.currentTimeMillis();
        l = l1;
        obj = obj1;
        zza1 = zza2;
        if (obj1 != null)
        {
            break MISSING_BLOCK_LABEL_220;
        }
        l = l1;
        obj = obj1;
        zza1 = zza2;
        zzbg.zzaD("Parsed resource from network is null");
        l = l1;
        obj = obj1;
        zza1 = zza2;
        zzb zzb2 = zza(zzqi1);
        l = l1;
        obj = obj1;
        zza1 = zza2;
        if (zzb2 == null)
        {
            break MISSING_BLOCK_LABEL_220;
        }
        l = l1;
        obj = obj1;
        zza1 = zza2;
        obj1 = zzb2.zzBX();
        l = l1;
        obj = obj1;
        zza1 = zza2;
        zza2 = zzb2.zzBx();
        l = l1;
        obj = obj1;
        zza1 = zza2;
        l1 = zzb2.zzBB();
        l = l1;
        zza1 = zza2;
        obj = obj1;
_L1:
        zzqp.zzg zzg;
        zzb zzb1;
        if (obj != null)
        {
            abyte0 = new zzqo.zza(Status.zzaaD, zzqi1, abyte0, (zzqp.zzc)obj, zza1, l);
        } else
        {
            abyte0 = new zzqo.zza(Status.zzaaF, zzqi1, zzqo.zza.zza.zzaTO);
        }
        zza(new zzqo(abyte0));
        return;
        zzg;
        zzbg.zzaD("Resource from network is corrupted");
        zzb1 = zza(zzqi1);
        if (zzb1 != null)
        {
            obj = zzb1.zzBX();
            zza1 = zzb1.zzBx();
        }
          goto _L1
    }
}
