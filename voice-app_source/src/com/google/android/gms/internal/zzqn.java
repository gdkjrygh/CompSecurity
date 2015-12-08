// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.tagmanager.zzbg;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            zzld, zzqd, zzpy, zzqe, 
//            zzqb, zzlb

public abstract class zzqn
{
    public static final class zza extends Enum
    {

        public static final zza zzaPW;
        public static final zza zzaPX;
        public static final zza zzaPY;
        private static final zza zzaPZ[];

        public static zza valueOf(String s)
        {
            return (zza)Enum.valueOf(com/google/android/gms/internal/zzqn$zza, s);
        }

        public static zza[] values()
        {
            return (zza[])zzaPZ.clone();
        }

        static 
        {
            zzaPW = new zza("NOT_AVAILABLE", 0);
            zzaPX = new zza("IO_ERROR", 1);
            zzaPY = new zza("SERVER_ERROR", 2);
            zzaPZ = (new zza[] {
                zzaPW, zzaPX, zzaPY
            });
        }

        private zza(String s, int i)
        {
            super(s, i);
        }
    }

    public class zzb
    {

        private final zzqe.zza.zza zzaPp;
        private final long zzaPr;
        private final Object zzaQa;

        public Object zzAH()
        {
            return zzaQa;
        }

        public zzqe.zza.zza zzAh()
        {
            return zzaPp;
        }

        public long zzAl()
        {
            return zzaPr;
        }
    }


    private zzqd zzaPU;
    private zzqb zzaPV;
    private zzlb zzpw;

    public zzqn(zzqd zzqd1, zzqb zzqb1)
    {
        this(zzqd1, zzqb1, zzld.zzoQ());
    }

    public zzqn(zzqd zzqd1, zzqb zzqb1, zzlb zzlb1)
    {
        boolean flag = true;
        super();
        if (zzqd1.zzAf().size() != 1)
        {
            flag = false;
        }
        com.google.android.gms.common.internal.zzu.zzV(flag);
        zzaPU = zzqd1;
        zzaPV = zzqb1;
        zzpw = zzlb1;
    }

    protected abstract zzb zza(zzpy zzpy1);

    protected abstract void zza(zzqe zzqe1);

    public void zza(zza zza1)
    {
        zzbg.zzaz((new StringBuilder()).append("ResourceManager: Failed to download a resource: ").append(zza1.name()).toString());
        zza1 = (zzpy)zzaPU.zzAf().get(0);
        zzb zzb1 = zza(((zzpy) (zza1)));
        if (zzb1 != null && (zzb1.zzAH() instanceof zzqf.zzc))
        {
            zza1 = new zzqe.zza(Status.zzXP, zza1, null, (zzqf.zzc)zzb1.zzAH(), zzb1.zzAh(), zzb1.zzAl());
        } else
        {
            zza1 = new zzqe.zza(Status.zzXR, zza1, zzqe.zza.zza.zzaPu);
        }
        zza(new zzqe(zza1));
    }

    public void zzu(byte abyte0[])
    {
        Object obj;
        zzqe.zza.zza zza1;
        zzqe.zza.zza zza2;
        zzpy zzpy1;
        long l;
        long l1;
        zzbg.zzaB((new StringBuilder()).append("ResourceManager: Resource downloaded from Network: ").append(zzaPU.getId()).toString());
        zzpy1 = (zzpy)zzaPU.zzAf().get(0);
        zza2 = zzqe.zza.zza.zzaPu;
        obj = null;
        l1 = 0L;
        l = l1;
        zza1 = zza2;
        Object obj1 = zzaPV.zzt(abyte0);
        l = l1;
        obj = obj1;
        zza1 = zza2;
        l1 = zzpw.currentTimeMillis();
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
        zzbg.zzaA("Parsed resource from network is null");
        l = l1;
        obj = obj1;
        zza1 = zza2;
        zzb zzb2 = zza(zzpy1);
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
        obj1 = zzb2.zzAH();
        l = l1;
        obj = obj1;
        zza1 = zza2;
        zza2 = zzb2.zzAh();
        l = l1;
        obj = obj1;
        zza1 = zza2;
        l1 = zzb2.zzAl();
        l = l1;
        zza1 = zza2;
        obj = obj1;
_L1:
        zzqf.zzg zzg;
        zzb zzb1;
        if (obj != null)
        {
            abyte0 = new zzqe.zza(Status.zzXP, zzpy1, abyte0, (zzqf.zzc)obj, zza1, l);
        } else
        {
            abyte0 = new zzqe.zza(Status.zzXR, zzpy1, zzqe.zza.zza.zzaPu);
        }
        zza(new zzqe(abyte0));
        return;
        zzg;
        zzbg.zzaA("Resource from network is corrupted");
        zzb1 = zza(zzpy1);
        if (zzb1 != null)
        {
            obj = zzb1.zzAH();
            zza1 = zzb1.zzAh();
        }
          goto _L1
    }
}
