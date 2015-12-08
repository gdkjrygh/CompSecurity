// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.zzb;
import com.google.android.gms.internal.zzlm;
import com.google.android.gms.internal.zzlo;
import com.google.android.gms.internal.zzqk;
import com.google.android.gms.internal.zzqo;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzcb, zzcn, zzcm, zzbe, 
//            zzs, zzbg, Container, TagManager, 
//            zzo, zzcd, ContainerHolder, zzbf

public class zzp extends com.google.android.gms.common.api.zzb
{
    static interface zza
    {

        public abstract boolean zzb(Container container);
    }

    private class zzb
        implements zzbf
    {

        final zzp zzaPt;

        public void zzB(Object obj)
        {
            zza((com.google.android.gms.internal.zzqh.zza)obj);
        }

        public void zza(com.google.android.gms.internal.zzqh.zza zza1)
        {
            com.google.android.gms.internal.zzaf.zzj zzj1;
            if (zza1.zzaTu != null)
            {
                zzj1 = zza1.zzaTu;
            } else
            {
                com.google.android.gms.internal.zzaf.zzf zzf1 = zza1.zziR;
                zzj1 = new com.google.android.gms.internal.zzaf.zzj();
                zzj1.zziR = zzf1;
                zzj1.zziQ = null;
                zzj1.zziS = zzf1.version;
            }
            zzp.zza(zzaPt, zzj1, zza1.zzaTt, true);
        }

        public void zza(zzbf.zza zza1)
        {
            if (!zzp.zzh(zzaPt))
            {
                zzp.zza(zzaPt, 0L);
            }
        }

        public void zzzL()
        {
        }

        private zzb()
        {
            zzaPt = zzp.this;
            super();
        }

    }

    private class zzc
        implements zzbf
    {

        final zzp zzaPt;

        public void zzB(Object obj)
        {
            zzb((com.google.android.gms.internal.zzaf.zzj)obj);
        }

        public void zza(zzbf.zza zza1)
        {
            zza1 = zzaPt;
            zza1;
            JVM INSTR monitorenter ;
            if (!zzaPt.isReady())
            {
                if (zzp.zzf(zzaPt) == null)
                {
                    break MISSING_BLOCK_LABEL_54;
                }
                zzaPt.zza(zzp.zzf(zzaPt));
            }
_L2:
            zzp.zza(zzaPt, 0x36ee80L);
            return;
            zzaPt.zza(zzaPt.zzbg(Status.zzaaG));
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
                synchronized (zzaPt)
                {
                    if (zzj1.zziR != null)
                    {
                        break MISSING_BLOCK_LABEL_59;
                    }
                    if (zzp.zzi(zzaPt).zziR != null)
                    {
                        break label0;
                    }
                    com.google.android.gms.tagmanager.zzbg.e("Current resource is null; network resource is also null");
                    zzp.zza(zzaPt, 0x36ee80L);
                }
                return;
            }
            zzj1.zziR = zzp.zzi(zzaPt).zziR;
            zzp.zza(zzaPt, zzj1, zzp.zzg(zzaPt).currentTimeMillis(), false);
            com.google.android.gms.tagmanager.zzbg.v((new StringBuilder()).append("setting refresh time to current time: ").append(zzp.zzj(zzaPt)).toString());
            if (!zzp.zzk(zzaPt))
            {
                zzp.zza(zzaPt, zzj1);
            }
            zzp1;
            JVM INSTR monitorexit ;
            return;
            zzj1;
            zzp1;
            JVM INSTR monitorexit ;
            throw zzj1;
        }

        public void zzzL()
        {
        }

        private zzc()
        {
            zzaPt = zzp.this;
            super();
        }

    }

    private class zzd
        implements zzo.zza
    {

        final zzp zzaPt;

        public void zzey(String s)
        {
            zzaPt.zzey(s);
        }

        public String zzzE()
        {
            return zzaPt.zzzE();
        }

        public void zzzG()
        {
            if (zzp.zze(zzaPt).zzkp())
            {
                zzp.zza(zzaPt, 0L);
            }
        }

        private zzd()
        {
            zzaPt = zzp.this;
            super();
        }

    }

    static interface zze
        extends Releasable
    {

        public abstract void zza(zzbf zzbf);

        public abstract void zzeB(String s);

        public abstract void zzf(long l, String s);
    }

    static interface zzf
        extends Releasable
    {

        public abstract void zza(zzbf zzbf);

        public abstract void zzb(com.google.android.gms.internal.zzqh.zza zza1);

        public abstract com.google.android.gms.internal.zzqp.zzc zzjc(int i);

        public abstract void zzzM();
    }


    private final Context mContext;
    private final Looper zzYV;
    private final String zzaOS;
    private long zzaOX;
    private final TagManager zzaPe;
    private final zzd zzaPh;
    private final zzcd zzaPi;
    private final int zzaPj;
    private zzf zzaPk;
    private zzqk zzaPl;
    private volatile zzo zzaPm;
    private volatile boolean zzaPn;
    private com.google.android.gms.internal.zzaf.zzj zzaPo;
    private String zzaPp;
    private zze zzaPq;
    private zza zzaPr;
    private final zzlm zzpO;

    zzp(Context context, TagManager tagmanager, Looper looper, String s, int i, zzf zzf1, zze zze1, 
            zzqk zzqk1, zzlm zzlm1, zzcd zzcd)
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
        zzaPe = tagmanager;
        context = looper;
        if (looper == null)
        {
            context = Looper.getMainLooper();
        }
        zzYV = context;
        zzaOS = s;
        zzaPj = i;
        zzaPk = zzf1;
        zzaPq = zze1;
        zzaPl = zzqk1;
        zzaPh = new zzd();
        zzaPo = new com.google.android.gms.internal.zzaf.zzj();
        zzpO = zzlm1;
        zzaPi = zzcd;
        if (zzzK())
        {
            zzey(zzcb.zzAv().zzAx());
        }
    }

    public zzp(Context context, TagManager tagmanager, Looper looper, String s, int i, zzs zzs1)
    {
        this(context, tagmanager, looper, s, i, ((zzf) (new zzcn(context, s))), ((zze) (new zzcm(context, s, zzs1))), new zzqk(context), zzlo.zzpN(), ((zzcd) (new zzbe(30, 0xdbba0L, 5000L, "refreshing", zzlo.zzpN()))));
        zzaPl.zzfj(zzs1.zzzN());
    }

    private void zzR(long l)
    {
        this;
        JVM INSTR monitorenter ;
        if (zzaPq != null) goto _L2; else goto _L1
_L1:
        com.google.android.gms.tagmanager.zzbg.zzaE("Refresh requested, but no network load scheduler.");
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        zzaPq.zzf(l, zzaPo.zziS);
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    static zzo zza(zzp zzp1, zzo zzo1)
    {
        zzp1.zzaPm = zzo1;
        return zzo1;
    }

    static String zza(zzp zzp1)
    {
        return zzp1.zzaOS;
    }

    private void zza(com.google.android.gms.internal.zzaf.zzj zzj1)
    {
        this;
        JVM INSTR monitorenter ;
        if (zzaPk != null)
        {
            com.google.android.gms.internal.zzqh.zza zza1 = new com.google.android.gms.internal.zzqh.zza();
            zza1.zzaTt = zzaOX;
            zza1.zziR = new com.google.android.gms.internal.zzaf.zzf();
            zza1.zzaTu = zzj1;
            zzaPk.zzb(zza1);
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
        flag = zzaPn;
        if (!flag) goto _L2; else goto _L3
_L3:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (isReady())
        {
            if (zzaPm != null);
        }
        zzaPo = zzj1;
        zzaOX = l;
        zzR(Math.max(0L, Math.min(0x2932e00L, (zzaOX + 0x2932e00L) - zzpO.currentTimeMillis())));
        zzj1 = new Container(mContext, zzaPe.getDataLayer(), zzaOS, l, zzj1);
        if (zzaPm != null)
        {
            break; /* Loop/switch isn't completed */
        }
        zzaPm = new zzo(zzaPe, zzYV, zzj1, zzaPh);
_L5:
        if (!isReady() && zzaPr.zzb(zzj1))
        {
            zza(((Result) (zzaPm)));
        }
        if (true) goto _L3; else goto _L4
        zzj1;
        throw zzj1;
_L4:
        zzaPm.zza(zzj1);
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

    private void zzar(boolean flag)
    {
        zzaPk.zza(new zzb());
        zzaPq.zza(new zzc());
        com.google.android.gms.internal.zzqp.zzc zzc1 = zzaPk.zzjc(zzaPj);
        if (zzc1 != null)
        {
            zzaPm = new zzo(zzaPe, zzYV, new Container(mContext, zzaPe.getDataLayer(), zzaOS, 0L, zzc1), zzaPh);
        }
        zzaPr = new zza(flag) {

            final zzp zzaPt;
            final boolean zzaPv;

            public boolean zzb(Container container)
            {
                if (!zzaPv) goto _L2; else goto _L1
_L1:
                if (container.getLastRefreshTime() + 0x2932e00L < zzp.zzg(zzaPt).currentTimeMillis()) goto _L4; else goto _L3
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
                zzaPt = zzp.this;
                zzaPv = flag;
                super();
            }
        };
        if (zzzK())
        {
            zzaPq.zzf(0L, "");
            return;
        } else
        {
            zzaPk.zzzM();
            return;
        }
    }

    static TagManager zzb(zzp zzp1)
    {
        return zzp1.zzaPe;
    }

    static Looper zzc(zzp zzp1)
    {
        return zzp1.zzYV;
    }

    static Context zzd(zzp zzp1)
    {
        return zzp1.mContext;
    }

    static zzcd zze(zzp zzp1)
    {
        return zzp1.zzaPi;
    }

    static zzo zzf(zzp zzp1)
    {
        return zzp1.zzaPm;
    }

    static zzlm zzg(zzp zzp1)
    {
        return zzp1.zzpO;
    }

    static boolean zzh(zzp zzp1)
    {
        return zzp1.zzaPn;
    }

    static com.google.android.gms.internal.zzaf.zzj zzi(zzp zzp1)
    {
        return zzp1.zzaPo;
    }

    static long zzj(zzp zzp1)
    {
        return zzp1.zzaOX;
    }

    static boolean zzk(zzp zzp1)
    {
        return zzp1.zzzK();
    }

    private boolean zzzK()
    {
        zzcb zzcb1 = zzcb.zzAv();
        return (zzcb1.zzAw() == zzcb.zza.zzaRd || zzcb1.zzAw() == zzcb.zza.zzaRe) && zzaOS.equals(zzcb1.getContainerId());
    }

    public void load(String s)
    {
        Integer integer;
        if (zzaPj != -1)
        {
            integer = Integer.valueOf(zzaPj);
        } else
        {
            integer = null;
        }
        zzaPl.zza(zzaOS, integer, s, new com.google.android.gms.internal.zzqk.zza(s) {

            final String zzaPs;
            final zzp zzaPt;

            public void zza(zzqo zzqo1)
            {
                if (zzqo1.getStatus() != Status.zzaaD)
                {
                    com.google.android.gms.tagmanager.zzbg.e((new StringBuilder()).append("Load request failed for the container ").append(zzp.zza(zzaPt)).toString());
                    zzaPt.zza(zzaPt.zzbg(Status.zzaaF));
                    return;
                }
                com.google.android.gms.internal.zzqp.zzc zzc1 = zzqo1.zzBw().zzBA();
                if (zzc1 == null)
                {
                    com.google.android.gms.tagmanager.zzbg.e("Response doesn't have the requested container");
                    zzaPt.zza(zzaPt.zzbg(new Status(8, "Response doesn't have the requested container", null)));
                    return;
                } else
                {
                    long l = zzqo1.zzBw().zzBB();
                    zzp.zza(zzaPt, new zzo(com.google.android.gms.tagmanager.zzp.zzb(zzaPt), zzp.zzc(zzaPt), new Container(zzp.zzd(zzaPt), com.google.android.gms.tagmanager.zzp.zzb(zzaPt).getDataLayer(), zzp.zza(zzaPt), l, zzc1), new zzo.zza(this) {

                        final _cls1 zzaPu;

                        public void zzey(String s)
                        {
                            zzaPu.zzaPt.zzey(s);
                        }

                        public String zzzE()
                        {
                            return zzaPu.zzaPt.zzzE();
                        }

                        public void zzzG()
                        {
                            if (zzp.zze(zzaPu.zzaPt).zzkp())
                            {
                                zzaPu.zzaPt.load(zzaPu.zzaPs);
                            }
                        }

            
            {
                zzaPu = _pcls1;
                super();
            }
                    }));
                    zzaPt.zza(zzp.zzf(zzaPt));
                    return;
                }
            }

            
            {
                zzaPt = zzp.this;
                zzaPs = s;
                super();
            }
        });
    }

    protected Result zzb(Status status)
    {
        return zzbg(status);
    }

    protected ContainerHolder zzbg(Status status)
    {
        if (zzaPm != null)
        {
            return zzaPm;
        }
        if (status == Status.zzaaG)
        {
            com.google.android.gms.tagmanager.zzbg.e("timer expired: setting result to failure");
        }
        return new zzo(status);
    }

    void zzey(String s)
    {
        this;
        JVM INSTR monitorenter ;
        zzaPp = s;
        if (zzaPq != null)
        {
            zzaPq.zzeB(s);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    String zzzE()
    {
        this;
        JVM INSTR monitorenter ;
        String s = zzaPp;
        this;
        JVM INSTR monitorexit ;
        return s;
        Exception exception;
        exception;
        throw exception;
    }

    public void zzzH()
    {
        Object obj = zzaPk.zzjc(zzaPj);
        if (obj != null)
        {
            obj = new Container(mContext, zzaPe.getDataLayer(), zzaOS, 0L, ((com.google.android.gms.internal.zzqp.zzc) (obj)));
            zza(new zzo(zzaPe, zzYV, ((Container) (obj)), new zzo.zza() {

                final zzp zzaPt;

                public void zzey(String s)
                {
                    zzaPt.zzey(s);
                }

                public String zzzE()
                {
                    return zzaPt.zzzE();
                }

                public void zzzG()
                {
                    com.google.android.gms.tagmanager.zzbg.zzaE("Refresh ignored: container loaded as default only.");
                }

            
            {
                zzaPt = zzp.this;
                super();
            }
            }));
        } else
        {
            com.google.android.gms.tagmanager.zzbg.e("Default was requested, but no default container was found");
            zza(zzbg(new Status(10, "Default was requested, but no default container was found", null)));
        }
        zzaPq = null;
        zzaPk = null;
    }

    public void zzzI()
    {
        zzar(false);
    }

    public void zzzJ()
    {
        zzar(true);
    }
}
