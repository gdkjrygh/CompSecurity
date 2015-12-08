// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.AbstractPendingResult;
import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.zzlb;
import com.google.android.gms.internal.zzld;
import com.google.android.gms.internal.zzqa;
import com.google.android.gms.internal.zzqe;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzcb, zzcn, zzcm, zzbe, 
//            zzs, zzbg, Container, TagManager, 
//            zzo, zzcd, ContainerHolder, zzbf

public class zzp extends AbstractPendingResult
{
    static interface zza
    {

        public abstract boolean zzb(Container container);
    }

    private class zzb
        implements zzbf
    {

        final zzp zzaKZ;

        public void zza(com.google.android.gms.internal.zzpx.zza zza1)
        {
            com.google.android.gms.internal.zzaf.zzj zzj1;
            if (zza1.zzaPa != null)
            {
                zzj1 = zza1.zzaPa;
            } else
            {
                com.google.android.gms.internal.zzaf.zzf zzf1 = zza1.zziO;
                zzj1 = new com.google.android.gms.internal.zzaf.zzj();
                zzj1.zziO = zzf1;
                zzj1.zziN = null;
                zzj1.zziP = zzf1.version;
            }
            zzp.zza(zzaKZ, zzj1, zza1.zzaOZ, true);
        }

        public void zza(zzbf.zza zza1)
        {
            if (!zzp.zzh(zzaKZ))
            {
                zzp.zza(zzaKZ, 0L);
            }
        }

        public void zzyv()
        {
        }

        public void zzz(Object obj)
        {
            zza((com.google.android.gms.internal.zzpx.zza)obj);
        }

        private zzb()
        {
            zzaKZ = zzp.this;
            super();
        }

    }

    private class zzc
        implements zzbf
    {

        final zzp zzaKZ;

        public void zza(zzbf.zza zza1)
        {
            zza1 = zzaKZ;
            zza1;
            JVM INSTR monitorenter ;
            if (!zzaKZ.isReady())
            {
                if (zzp.zzf(zzaKZ) == null)
                {
                    break MISSING_BLOCK_LABEL_54;
                }
                zzaKZ.setResult(zzp.zzf(zzaKZ));
            }
_L2:
            zzp.zza(zzaKZ, 0x36ee80L);
            return;
            zzaKZ.setResult(zzaKZ.zzaU(Status.zzXS));
            if (true) goto _L2; else goto _L1
_L1:
            Exception exception;
            exception;
            zza1;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public void zzb(com.google.android.gms.internal.zzaf.zzj zzj1)
        {
label0:
            {
                synchronized (zzaKZ)
                {
                    if (zzj1.zziO != null)
                    {
                        break MISSING_BLOCK_LABEL_59;
                    }
                    if (zzp.zzi(zzaKZ).zziO != null)
                    {
                        break label0;
                    }
                    zzbg.zzaz("Current resource is null; network resource is also null");
                    zzp.zza(zzaKZ, 0x36ee80L);
                }
                return;
            }
            zzj1.zziO = zzp.zzi(zzaKZ).zziO;
            zzp.zza(zzaKZ, zzj1, zzp.zzg(zzaKZ).currentTimeMillis(), false);
            zzbg.zzaB((new StringBuilder()).append("setting refresh time to current time: ").append(zzp.zzj(zzaKZ)).toString());
            if (!zzp.zzk(zzaKZ))
            {
                zzp.zza(zzaKZ, zzj1);
            }
            zzp1;
            JVM INSTR monitorexit ;
            return;
            zzj1;
            zzp1;
            JVM INSTR monitorexit ;
            throw zzj1;
        }

        public void zzyv()
        {
        }

        public void zzz(Object obj)
        {
            zzb((com.google.android.gms.internal.zzaf.zzj)obj);
        }

        private zzc()
        {
            zzaKZ = zzp.this;
            super();
        }

    }

    private class zzd
        implements zzo.zza
    {

        final zzp zzaKZ;

        public void zzej(String s)
        {
            zzaKZ.zzej(s);
        }

        public String zzyo()
        {
            return zzaKZ.zzyo();
        }

        public void zzyq()
        {
            if (zzp.zze(zzaKZ).zzkb())
            {
                zzp.zza(zzaKZ, 0L);
            }
        }

        private zzd()
        {
            zzaKZ = zzp.this;
            super();
        }

    }

    static interface zze
        extends Releasable
    {

        public abstract void zza(zzbf zzbf);

        public abstract void zzem(String s);

        public abstract void zzf(long l, String s);
    }

    static interface zzf
        extends Releasable
    {

        public abstract void zza(zzbf zzbf);

        public abstract void zzb(com.google.android.gms.internal.zzpx.zza zza1);

        public abstract com.google.android.gms.internal.zzqf.zzc zziR(int i);

        public abstract void zzyw();
    }


    private final Context mContext;
    private final Looper zzWt;
    private long zzaKD;
    private final TagManager zzaKK;
    private final zzd zzaKN;
    private final zzcd zzaKO;
    private final int zzaKP;
    private zzf zzaKQ;
    private zzqa zzaKR;
    private volatile zzo zzaKS;
    private volatile boolean zzaKT;
    private com.google.android.gms.internal.zzaf.zzj zzaKU;
    private String zzaKV;
    private zze zzaKW;
    private zza zzaKX;
    private final String zzaKy;
    private final zzlb zzpw;

    zzp(Context context, TagManager tagmanager, Looper looper, String s, int i, zzf zzf1, zze zze1, 
            zzqa zzqa1, zzlb zzlb1, zzcd zzcd)
    {
        Looper looper1;
        if (looper == null)
        {
            looper1 = Looper.getMainLooper();
        } else
        {
            looper1 = looper;
        }
        super(looper1);
        mContext = context;
        zzaKK = tagmanager;
        context = looper;
        if (looper == null)
        {
            context = Looper.getMainLooper();
        }
        zzWt = context;
        zzaKy = s;
        zzaKP = i;
        zzaKQ = zzf1;
        zzaKW = zze1;
        zzaKR = zzqa1;
        zzaKN = new zzd();
        zzaKU = new com.google.android.gms.internal.zzaf.zzj();
        zzpw = zzlb1;
        zzaKO = zzcd;
        if (zzyu())
        {
            zzej(zzcb.zzzf().zzzh());
        }
    }

    public zzp(Context context, TagManager tagmanager, Looper looper, String s, int i, zzs zzs1)
    {
        this(context, tagmanager, looper, s, i, ((zzf) (new zzcn(context, s))), ((zze) (new zzcm(context, s, zzs1))), new zzqa(context), zzld.zzoQ(), ((zzcd) (new zzbe(30, 0xdbba0L, 5000L, "refreshing", zzld.zzoQ()))));
        zzaKR.zzeU(zzs1.zzyx());
    }

    private void zzR(long l)
    {
        this;
        JVM INSTR monitorenter ;
        if (zzaKW != null) goto _L2; else goto _L1
_L1:
        zzbg.zzaC("Refresh requested, but no network load scheduler.");
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        zzaKW.zzf(l, zzaKU.zziP);
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    static zzo zza(zzp zzp1, zzo zzo1)
    {
        zzp1.zzaKS = zzo1;
        return zzo1;
    }

    static String zza(zzp zzp1)
    {
        return zzp1.zzaKy;
    }

    private void zza(com.google.android.gms.internal.zzaf.zzj zzj1)
    {
        this;
        JVM INSTR monitorenter ;
        if (zzaKQ != null)
        {
            com.google.android.gms.internal.zzpx.zza zza1 = new com.google.android.gms.internal.zzpx.zza();
            zza1.zzaOZ = zzaKD;
            zza1.zziO = new com.google.android.gms.internal.zzaf.zzf();
            zza1.zzaPa = zzj1;
            zzaKQ.zzb(zza1);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        zzj1;
        throw zzj1;
    }

    private void zza(com.google.android.gms.internal.zzaf.zzj zzj1, long l, boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        if (!flag) goto _L2; else goto _L1
_L1:
        flag = zzaKT;
        if (!flag) goto _L2; else goto _L3
_L3:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (isReady())
        {
            if (zzaKS != null);
        }
        zzaKU = zzj1;
        zzaKD = l;
        zzR(Math.max(0L, Math.min(0x2932e00L, (zzaKD + 0x2932e00L) - zzpw.currentTimeMillis())));
        zzj1 = new Container(mContext, zzaKK.getDataLayer(), zzaKy, l, zzj1);
        if (zzaKS != null)
        {
            break; /* Loop/switch isn't completed */
        }
        zzaKS = new zzo(zzaKK, zzWt, zzj1, zzaKN);
_L5:
        if (!isReady() && zzaKX.zzb(zzj1))
        {
            setResult(zzaKS);
        }
        if (true) goto _L3; else goto _L4
        zzj1;
        throw zzj1;
_L4:
        zzaKS.zza(zzj1);
          goto _L5
    }

    static void zza(zzp zzp1, long l)
    {
        zzp1.zzR(l);
    }

    static void zza(zzp zzp1, com.google.android.gms.internal.zzaf.zzj zzj1)
    {
        zzp1.zza(zzj1);
    }

    static void zza(zzp zzp1, com.google.android.gms.internal.zzaf.zzj zzj1, long l, boolean flag)
    {
        zzp1.zza(zzj1, l, flag);
    }

    private void zzam(boolean flag)
    {
        zzaKQ.zza(new zzb());
        zzaKW.zza(new zzc());
        com.google.android.gms.internal.zzqf.zzc zzc1 = zzaKQ.zziR(zzaKP);
        if (zzc1 != null)
        {
            zzaKS = new zzo(zzaKK, zzWt, new Container(mContext, zzaKK.getDataLayer(), zzaKy, 0L, zzc1), zzaKN);
        }
        zzaKX = new zza(flag) {

            final zzp zzaKZ;
            final boolean zzaLb;

            public boolean zzb(Container container)
            {
                if (!zzaLb) goto _L2; else goto _L1
_L1:
                if (container.getLastRefreshTime() + 0x2932e00L < zzp.zzg(zzaKZ).currentTimeMillis()) goto _L4; else goto _L3
_L3:
                return true;
_L4:
                return false;
_L2:
                if (container.isDefault())
                {
                    return false;
                }
                if (true) goto _L3; else goto _L5
_L5:
            }

            
            {
                zzaKZ = zzp.this;
                zzaLb = flag;
                super();
            }
        };
        if (zzyu())
        {
            zzaKW.zzf(0L, "");
            return;
        } else
        {
            zzaKQ.zzyw();
            return;
        }
    }

    static TagManager zzb(zzp zzp1)
    {
        return zzp1.zzaKK;
    }

    static Looper zzc(zzp zzp1)
    {
        return zzp1.zzWt;
    }

    static Context zzd(zzp zzp1)
    {
        return zzp1.mContext;
    }

    static zzcd zze(zzp zzp1)
    {
        return zzp1.zzaKO;
    }

    static zzo zzf(zzp zzp1)
    {
        return zzp1.zzaKS;
    }

    static zzlb zzg(zzp zzp1)
    {
        return zzp1.zzpw;
    }

    static boolean zzh(zzp zzp1)
    {
        return zzp1.zzaKT;
    }

    static com.google.android.gms.internal.zzaf.zzj zzi(zzp zzp1)
    {
        return zzp1.zzaKU;
    }

    static long zzj(zzp zzp1)
    {
        return zzp1.zzaKD;
    }

    static boolean zzk(zzp zzp1)
    {
        return zzp1.zzyu();
    }

    private boolean zzyu()
    {
        zzcb zzcb1 = zzcb.zzzf();
        return (zzcb1.zzzg() == zzcb.zza.zzaMJ || zzcb1.zzzg() == zzcb.zza.zzaMK) && zzaKy.equals(zzcb1.getContainerId());
    }

    protected Result createFailedResult(Status status)
    {
        return zzaU(status);
    }

    public void load(String s)
    {
        Integer integer;
        if (zzaKP != -1)
        {
            integer = Integer.valueOf(zzaKP);
        } else
        {
            integer = null;
        }
        zzaKR.zza(zzaKy, integer, s, new com.google.android.gms.internal.zzqa.zza(s) {

            final String zzaKY;
            final zzp zzaKZ;

            public void zza(zzqe zzqe1)
            {
                if (zzqe1.getStatus() != Status.zzXP)
                {
                    zzbg.zzaz((new StringBuilder()).append("Load request failed for the container ").append(zzp.zza(zzaKZ)).toString());
                    zzaKZ.setResult(zzaKZ.zzaU(Status.zzXR));
                    return;
                }
                com.google.android.gms.internal.zzqf.zzc zzc1 = zzqe1.zzAg().zzAk();
                if (zzc1 == null)
                {
                    zzbg.zzaz("Response doesn't have the requested container");
                    zzaKZ.setResult(zzaKZ.zzaU(new Status(8, "Response doesn't have the requested container", null)));
                    return;
                } else
                {
                    long l = zzqe1.zzAg().zzAl();
                    zzp.zza(zzaKZ, new zzo(zzp.zzb(zzaKZ), zzp.zzc(zzaKZ), new Container(zzp.zzd(zzaKZ), zzp.zzb(zzaKZ).getDataLayer(), zzp.zza(zzaKZ), l, zzc1), new zzo.zza(this) {

                        final _cls1 zzaLa;

                        public void zzej(String s)
                        {
                            zzaLa.zzaKZ.zzej(s);
                        }

                        public String zzyo()
                        {
                            return zzaLa.zzaKZ.zzyo();
                        }

                        public void zzyq()
                        {
                            if (zzp.zze(zzaLa.zzaKZ).zzkb())
                            {
                                zzaLa.zzaKZ.load(zzaLa.zzaKY);
                            }
                        }

            
            {
                zzaLa = _pcls1;
                super();
            }
                    }));
                    zzaKZ.setResult(zzp.zzf(zzaKZ));
                    return;
                }
            }

            
            {
                zzaKZ = zzp.this;
                zzaKY = s;
                super();
            }
        });
    }

    protected ContainerHolder zzaU(Status status)
    {
        if (zzaKS != null)
        {
            return zzaKS;
        }
        if (status == Status.zzXS)
        {
            zzbg.zzaz("timer expired: setting result to failure");
        }
        return new zzo(status);
    }

    void zzej(String s)
    {
        this;
        JVM INSTR monitorenter ;
        zzaKV = s;
        if (zzaKW != null)
        {
            zzaKW.zzem(s);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    String zzyo()
    {
        this;
        JVM INSTR monitorenter ;
        String s = zzaKV;
        this;
        JVM INSTR monitorexit ;
        return s;
        Exception exception;
        exception;
        throw exception;
    }

    public void zzyr()
    {
        Object obj = zzaKQ.zziR(zzaKP);
        if (obj != null)
        {
            obj = new Container(mContext, zzaKK.getDataLayer(), zzaKy, 0L, ((com.google.android.gms.internal.zzqf.zzc) (obj)));
            setResult(new zzo(zzaKK, zzWt, ((Container) (obj)), new zzo.zza() {

                final zzp zzaKZ;

                public void zzej(String s)
                {
                    zzaKZ.zzej(s);
                }

                public String zzyo()
                {
                    return zzaKZ.zzyo();
                }

                public void zzyq()
                {
                    zzbg.zzaC("Refresh ignored: container loaded as default only.");
                }

            
            {
                zzaKZ = zzp.this;
                super();
            }
            }));
        } else
        {
            zzbg.zzaz("Default was requested, but no default container was found");
            setResult(zzaU(new Status(10, "Default was requested, but no default container was found", null)));
        }
        zzaKW = null;
        zzaKQ = null;
    }

    public void zzys()
    {
        zzam(false);
    }

    public void zzyt()
    {
        zzam(true);
    }
}
