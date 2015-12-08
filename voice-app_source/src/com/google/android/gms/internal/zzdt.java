// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.zzu;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

// Referenced classes of package com.google.android.gms.internal:
//            zzhl, zzbd, zzbb, zzhy, 
//            zzbf, zzbe, zzhr, zzdg, 
//            zzid

public class zzdt
{
    static class zza
    {

        static int zzxc = 60000;
        static int zzxd = 10000;

    }

    public static interface zzb
    {

        public abstract void zzc(Object obj);
    }

    public static class zzc
        implements zzb
    {

        public void zzc(Object obj)
        {
        }

        public zzc()
        {
        }
    }

    public static class zzd extends zzhy
    {

        private final Object zzqt = new Object();
        private final zze zzxe;
        private boolean zzxf;

        static zze zza(zzd zzd1)
        {
            return zzd1.zzxe;
        }

        public void release()
        {
label0:
            {
                synchronized (zzqt)
                {
                    if (!zzxf)
                    {
                        break label0;
                    }
                }
                return;
            }
            zzxf = true;
            zza(new zzhx.zzc(this) {

                final zzd zzxg;

                public void zzb(zzbe zzbe1)
                {
                    com.google.android.gms.ads.internal.util.client.zzb.zzaB("Ending javascript session.");
                    ((zzbf)zzbe1).zzcg();
                }

                public void zzc(Object obj)
                {
                    zzb((zzbe)obj);
                }

            
            {
                zzxg = zzd1;
                super();
            }
            }, new zzhx.zzb());
            zza(new zzhx.zzc(this) {

                final zzd zzxg;

                public void zzb(zzbe zzbe1)
                {
                    com.google.android.gms.ads.internal.util.client.zzb.zzaB("Releasing engine reference.");
                    zzd.zza(zzxg).zzdW();
                }

                public void zzc(Object obj)
                {
                    zzb((zzbe)obj);
                }

            
            {
                zzxg = zzd1;
                super();
            }
            }, new zzhx.zza(this) {

                final zzd zzxg;

                public void run()
                {
                    zzd.zza(zzxg).zzdW();
                }

            
            {
                zzxg = zzd1;
                super();
            }
            });
            obj;
            JVM INSTR monitorexit ;
            return;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public zzd(zze zze1)
        {
            zzxe = zze1;
        }
    }

    public static class zze extends zzhy
    {

        private final Object zzqt = new Object();
        private zzb zzwQ;
        private boolean zzxh;
        private int zzxi;

        static zzb zza(zze zze1)
        {
            return zze1.zzwQ;
        }

        public zzd zzdV()
        {
            zzd zzd1 = new zzd(this);
            Object obj = zzqt;
            obj;
            JVM INSTR monitorenter ;
            zza(new zzhx.zzc(this, zzd1) {

                final zzd zzxj;
                final zze zzxk;

                public void zza(zzbb zzbb1)
                {
                    com.google.android.gms.ads.internal.util.client.zzb.zzaB("Getting a new session for JS Engine.");
                    zzxj.zzg(zzbb1.zzce());
                }

                public void zzc(Object obj)
                {
                    zza((zzbb)obj);
                }

            
            {
                zzxk = zze1;
                zzxj = zzd1;
                super();
            }
            }, new zzhx.zza(this, zzd1) {

                final zzd zzxj;
                final zze zzxk;

                public void run()
                {
                    com.google.android.gms.ads.internal.util.client.zzb.zzaB("Rejecting reference for JS Engine.");
                    zzxj.reject();
                }

            
            {
                zzxk = zze1;
                zzxj = zzd1;
                super();
            }
            });
            Exception exception;
            boolean flag;
            if (zzxi >= 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            zzu.zzU(flag);
            zzxi = zzxi + 1;
            obj;
            JVM INSTR monitorexit ;
            return zzd1;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        protected void zzdW()
        {
            boolean flag = true;
            Object obj = zzqt;
            obj;
            JVM INSTR monitorenter ;
            Exception exception;
            if (zzxi < 1)
            {
                flag = false;
            }
            zzu.zzU(flag);
            com.google.android.gms.ads.internal.util.client.zzb.zzaB("Releasing 1 reference for JS Engine");
            zzxi = zzxi - 1;
            zzdY();
            return;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public void zzdX()
        {
            boolean flag = true;
            Object obj = zzqt;
            obj;
            JVM INSTR monitorenter ;
            Exception exception;
            if (zzxi < 0)
            {
                flag = false;
            }
            zzu.zzU(flag);
            com.google.android.gms.ads.internal.util.client.zzb.zzaB("Releasing root reference. JS Engine will be destroyed once other references are released.");
            zzxh = true;
            zzdY();
            return;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        protected void zzdY()
        {
            Object obj = zzqt;
            obj;
            JVM INSTR monitorenter ;
            Exception exception;
            boolean flag;
            if (zzxi >= 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            zzu.zzU(flag);
            if (!zzxh || zzxi != 0)
            {
                break MISSING_BLOCK_LABEL_61;
            }
            com.google.android.gms.ads.internal.util.client.zzb.zzaB("No reference is left (including root). Cleaning up engine.");
            zza(new zzhx.zzc(this) {

                final zze zzxk;

                public void zza(zzbb zzbb1)
                {
                    zzhl.runOnUiThread(new Runnable(this, zzbb1) {

                        final zzbb zzra;
                        final zze._cls3 zzxl;

                        public void run()
                        {
                            zze.zza(zzxl.zzxk).zzc(zzra);
                            zzra.destroy();
                        }

            
            {
                zzxl = _pcls3;
                zzra = zzbb1;
                super();
            }
                    });
                }

                public void zzc(Object obj)
                {
                    zza((zzbb)obj);
                }

            
            {
                zzxk = zze1;
                super();
            }
            }, new zzhx.zzb());
_L2:
            obj;
            JVM INSTR monitorexit ;
            return;
            com.google.android.gms.ads.internal.util.client.zzb.zzaB("There are still references to the engine. Not destroying.");
            if (true) goto _L2; else goto _L1
_L1:
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public zze(zzb zzb1)
        {
            zzwQ = zzb1;
            zzxh = false;
            zzxi = 0;
        }
    }


    private final Context mContext;
    private final VersionInfoParcel zzoM;
    private final Object zzqt;
    private final String zzwO;
    private zzb zzwP;
    private zzb zzwQ;
    private zze zzwR;
    private int zzwS;

    public zzdt(Context context, VersionInfoParcel versioninfoparcel, String s)
    {
        zzqt = new Object();
        zzwS = 1;
        zzwO = s;
        mContext = context.getApplicationContext();
        zzoM = versioninfoparcel;
        zzwP = new zzc();
        zzwQ = new zzc();
    }

    public zzdt(Context context, VersionInfoParcel versioninfoparcel, String s, zzb zzb1, zzb zzb2)
    {
        this(context, versioninfoparcel, s);
        zzwP = zzb1;
        zzwQ = zzb2;
    }

    static int zza(zzdt zzdt1, int i)
    {
        zzdt1.zzwS = i;
        return i;
    }

    static Context zza(zzdt zzdt1)
    {
        return zzdt1.mContext;
    }

    static zze zza(zzdt zzdt1, zze zze1)
    {
        zzdt1.zzwR = zze1;
        return zze1;
    }

    static VersionInfoParcel zzb(zzdt zzdt1)
    {
        return zzdt1.zzoM;
    }

    static Object zzc(zzdt zzdt1)
    {
        return zzdt1.zzqt;
    }

    static zzb zzd(zzdt zzdt1)
    {
        return zzdt1.zzwP;
    }

    private zze zzdS()
    {
        zze zze1 = new zze(zzwQ);
        zzhl.runOnUiThread(new Runnable(zze1) {

            final zze zzwT;
            final zzdt zzwU;

            public void run()
            {
                zzbb zzbb1 = zzwU.zza(zzdt.zza(zzwU), zzdt.zzb(zzwU));
                zzbb1.zza(new zzbb.zza(this, zzbb1) {

                    final zzbb zzwV;
                    final _cls1 zzwW;

                    public void zzcf()
                    {
                        (new Timer()).schedule(new TimerTask(this) {

                            final _cls1 zzwX;

                            public void run()
                            {
label0:
                                {
                                    synchronized (zzdt.zzc(zzwX.zzwW.zzwU))
                                    {
                                        if (zzwX.zzwW.zzwT.getStatus() != -1 && zzwX.zzwW.zzwT.getStatus() != 1)
                                        {
                                            break label0;
                                        }
                                    }
                                    return;
                                }
                                zzwX.zzwW.zzwT.reject();
                                zzhl.runOnUiThread(new Runnable(this) {

                                    final _cls1 zzwY;

                                    public void run()
                                    {
                                        zzwY.zzwX.zzwV.destroy();
                                    }

            
            {
                zzwY = _pcls1;
                super();
            }
                                });
                                com.google.android.gms.ads.internal.util.client.zzb.zzaB("Could not receive loaded message in a timely manner. Rejecting.");
                                obj;
                                JVM INSTR monitorexit ;
                                return;
                                exception;
                                obj;
                                JVM INSTR monitorexit ;
                                throw exception;
                            }

            
            {
                zzwX = _pcls1;
                super();
            }
                        }, zza.zzxd);
                    }

            
            {
                zzwW = _pcls1;
                zzwV = zzbb;
                super();
            }
                });
                zzbb1.zza("/jsLoaded", new zzdg(this, zzbb1) {

                    final zzbb zzwV;
                    final _cls1 zzwW;

                    public void zza(zzid zzid, Map map)
                    {
label0:
                        {
                            synchronized (zzdt.zzc(zzwW.zzwU))
                            {
                                if (zzwW.zzwT.getStatus() != -1 && zzwW.zzwT.getStatus() != 1)
                                {
                                    break label0;
                                }
                            }
                            return;
                        }
                        zzdt.zza(zzwW.zzwU, 0);
                        zzdt.zzd(zzwW.zzwU).zzc(zzwV);
                        zzwW.zzwT.zzg(zzwV);
                        zzdt.zza(zzwW.zzwU, zzwW.zzwT);
                        com.google.android.gms.ads.internal.util.client.zzb.zzaB("Successfully loaded JS Engine.");
                        zzid;
                        JVM INSTR monitorexit ;
                        return;
                        map;
                        zzid;
                        JVM INSTR monitorexit ;
                        throw map;
                    }

            
            {
                zzwW = _pcls1;
                zzwV = zzbb;
                super();
            }
                });
                zzhr zzhr1 = new zzhr();
                zzdg zzdg = new zzdg(this, zzbb1, zzhr1) {

                    final zzbb zzwV;
                    final _cls1 zzwW;
                    final zzhr zzwZ;

                    public void zza(zzid zzid, Map map)
                    {
                        synchronized (zzdt.zzc(zzwW.zzwU))
                        {
                            com.google.android.gms.ads.internal.util.client.zzb.zzaA("JS Engine is requesting an update");
                            if (zzdt.zze(zzwW.zzwU) == 0)
                            {
                                com.google.android.gms.ads.internal.util.client.zzb.zzaA("Starting reload.");
                                zzdt.zza(zzwW.zzwU, 2);
                                zzwW.zzwU.zzdT();
                            }
                            zzwV.zzb("/requestReload", (zzdg)zzwZ.get());
                        }
                        return;
                        map;
                        zzid;
                        JVM INSTR monitorexit ;
                        throw map;
                    }

            
            {
                zzwW = _pcls1;
                zzwV = zzbb1;
                zzwZ = zzhr1;
                super();
            }
                };
                zzhr1.set(zzdg);
                zzbb1.zza("/requestReload", zzdg);
                if (zzdt.zzf(zzwU).endsWith(".js"))
                {
                    zzbb1.zzr(zzdt.zzf(zzwU));
                } else
                if (zzdt.zzf(zzwU).startsWith("<html>"))
                {
                    zzbb1.zzt(zzdt.zzf(zzwU));
                } else
                {
                    zzbb1.zzs(zzdt.zzf(zzwU));
                }
                (new Timer()).schedule(new TimerTask(this, zzbb1) {

                    final zzbb zzwV;
                    final _cls1 zzwW;

                    public void run()
                    {
label0:
                        {
                            synchronized (zzdt.zzc(zzwW.zzwU))
                            {
                                if (zzwW.zzwT.getStatus() != -1 && zzwW.zzwT.getStatus() != 1)
                                {
                                    break label0;
                                }
                            }
                            return;
                        }
                        zzwW.zzwT.reject();
                        zzhl.runOnUiThread(new Runnable(this) {

                            final _cls4 zzxa;

                            public void run()
                            {
                                zzxa.zzwV.destroy();
                            }

            
            {
                zzxa = _pcls4;
                super();
            }
                        });
                        com.google.android.gms.ads.internal.util.client.zzb.zzaB("Could not receive loaded message in a timely manner. Rejecting.");
                        obj;
                        JVM INSTR monitorexit ;
                        return;
                        exception;
                        obj;
                        JVM INSTR monitorexit ;
                        throw exception;
                    }

            
            {
                zzwW = _pcls1;
                zzwV = zzbb;
                super();
            }
                }, zza.zzxc);
            }

            
            {
                zzwU = zzdt.this;
                zzwT = zze1;
                super();
            }
        });
        return zze1;
    }

    static int zze(zzdt zzdt1)
    {
        return zzdt1.zzwS;
    }

    static String zzf(zzdt zzdt1)
    {
        return zzdt1.zzwO;
    }

    static zze zzg(zzdt zzdt1)
    {
        return zzdt1.zzwR;
    }

    protected zzbb zza(Context context, VersionInfoParcel versioninfoparcel)
    {
        return new zzbd(context, versioninfoparcel);
    }

    protected zze zzdT()
    {
        zze zze1 = zzdS();
        zze1.zza(new zzhx.zzc(zze1) {

            final zzdt zzwU;
            final zze zzxb;

            public void zza(zzbb zzbb1)
            {
                synchronized (zzdt.zzc(zzwU))
                {
                    zzdt.zza(zzwU, 0);
                    if (zzdt.zzg(zzwU) != null && zzxb != zzdt.zzg(zzwU))
                    {
                        com.google.android.gms.ads.internal.util.client.zzb.zzaB("New JS engine is loaded, marking previous one as destroyable.");
                        zzdt.zzg(zzwU).zzdX();
                    }
                    zzdt.zza(zzwU, zzxb);
                }
                return;
                exception;
                zzbb1;
                JVM INSTR monitorexit ;
                throw exception;
            }

            public void zzc(Object obj)
            {
                zza((zzbb)obj);
            }

            
            {
                zzwU = zzdt.this;
                zzxb = zze1;
                super();
            }
        }, new zzhx.zza(zze1) {

            final zzdt zzwU;
            final zze zzxb;

            public void run()
            {
                synchronized (zzdt.zzc(zzwU))
                {
                    zzdt.zza(zzwU, 1);
                    com.google.android.gms.ads.internal.util.client.zzb.zzaB("Failed loading new engine. Marking new engine destroyable.");
                    zzxb.zzdX();
                }
                return;
                exception;
                obj;
                JVM INSTR monitorexit ;
                throw exception;
            }

            
            {
                zzwU = zzdt.this;
                zzxb = zze1;
                super();
            }
        });
        return zze1;
    }

    public zzd zzdU()
    {
label0:
        {
            zzd zzd1;
            synchronized (zzqt)
            {
                if (zzwR != null && zzwR.getStatus() != -1)
                {
                    break label0;
                }
                zzwS = 2;
                zzwR = zzdT();
                zzd1 = zzwR.zzdV();
            }
            return zzd1;
        }
        zzd zzd2;
        if (zzwS != 0)
        {
            break MISSING_BLOCK_LABEL_74;
        }
        zzd2 = zzwR.zzdV();
        obj;
        JVM INSTR monitorexit ;
        return zzd2;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        if (zzwS != 1)
        {
            break MISSING_BLOCK_LABEL_104;
        }
        zzwS = 2;
        zzdT();
        exception = zzwR.zzdV();
        obj;
        JVM INSTR monitorexit ;
        return exception;
        if (zzwS != 2)
        {
            break MISSING_BLOCK_LABEL_124;
        }
        exception = zzwR.zzdV();
        obj;
        JVM INSTR monitorexit ;
        return exception;
        exception = zzwR.zzdV();
        obj;
        JVM INSTR monitorexit ;
        return exception;
    }
}
