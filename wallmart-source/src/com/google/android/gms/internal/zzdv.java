// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.zzx;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

// Referenced classes of package com.google.android.gms.internal:
//            zzhu, zzbd, zzbb, zzik, 
//            zzbf, zzbe, zzic, zzdg, 
//            zzip

public class zzdv
{
    static class zza
    {

        static int zzxT = 60000;
        static int zzxU = 10000;

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

    public static class zzd extends zzik
    {

        private final Object zzpc = new Object();
        private final zze zzxV;
        private boolean zzxW;

        static zze zza(zzd zzd1)
        {
            return zzd1.zzxV;
        }

        public void release()
        {
label0:
            {
                synchronized (zzpc)
                {
                    if (!zzxW)
                    {
                        break label0;
                    }
                }
                return;
            }
            zzxW = true;
            zza(new zzij.zzc(this) {

                final zzd zzxX;

                public void zzb(zzbe zzbe1)
                {
                    com.google.android.gms.ads.internal.util.client.zzb.v("Ending javascript session.");
                    ((zzbf)zzbe1).zzck();
                }

                public void zzc(Object obj)
                {
                    zzb((zzbe)obj);
                }

            
            {
                zzxX = zzd1;
                super();
            }
            }, new zzij.zzb());
            zza(new zzij.zzc(this) {

                final zzd zzxX;

                public void zzb(zzbe zzbe1)
                {
                    com.google.android.gms.ads.internal.util.client.zzb.v("Releasing engine reference.");
                    zzd.zza(zzxX).zzdN();
                }

                public void zzc(Object obj)
                {
                    zzb((zzbe)obj);
                }

            
            {
                zzxX = zzd1;
                super();
            }
            }, new zzij.zza(this) {

                final zzd zzxX;

                public void run()
                {
                    zzd.zza(zzxX).zzdN();
                }

            
            {
                zzxX = zzd1;
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
            zzxV = zze1;
        }
    }

    public static class zze extends zzik
    {

        private final Object zzpc = new Object();
        private zzb zzxH;
        private boolean zzxY;
        private int zzxZ;

        static zzb zza(zze zze1)
        {
            return zze1.zzxH;
        }

        public zzd zzdM()
        {
            zzd zzd1 = new zzd(this);
            Object obj = zzpc;
            obj;
            JVM INSTR monitorenter ;
            zza(new zzij.zzc(this, zzd1) {

                final zzd zzya;
                final zze zzyb;

                public void zza(zzbb zzbb1)
                {
                    com.google.android.gms.ads.internal.util.client.zzb.v("Getting a new session for JS Engine.");
                    zzya.zzg(zzbb1.zzci());
                }

                public void zzc(Object obj)
                {
                    zza((zzbb)obj);
                }

            
            {
                zzyb = zze1;
                zzya = zzd1;
                super();
            }
            }, new zzij.zza(this, zzd1) {

                final zzd zzya;
                final zze zzyb;

                public void run()
                {
                    com.google.android.gms.ads.internal.util.client.zzb.v("Rejecting reference for JS Engine.");
                    zzya.reject();
                }

            
            {
                zzyb = zze1;
                zzya = zzd1;
                super();
            }
            });
            Exception exception;
            boolean flag;
            if (zzxZ >= 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            zzx.zzY(flag);
            zzxZ = zzxZ + 1;
            obj;
            JVM INSTR monitorexit ;
            return zzd1;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        protected void zzdN()
        {
            boolean flag = true;
            Object obj = zzpc;
            obj;
            JVM INSTR monitorenter ;
            Exception exception;
            if (zzxZ < 1)
            {
                flag = false;
            }
            zzx.zzY(flag);
            com.google.android.gms.ads.internal.util.client.zzb.v("Releasing 1 reference for JS Engine");
            zzxZ = zzxZ - 1;
            zzdP();
            return;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public void zzdO()
        {
            boolean flag = true;
            Object obj = zzpc;
            obj;
            JVM INSTR monitorenter ;
            Exception exception;
            if (zzxZ < 0)
            {
                flag = false;
            }
            zzx.zzY(flag);
            com.google.android.gms.ads.internal.util.client.zzb.v("Releasing root reference. JS Engine will be destroyed once other references are released.");
            zzxY = true;
            zzdP();
            return;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        protected void zzdP()
        {
            Object obj = zzpc;
            obj;
            JVM INSTR monitorenter ;
            Exception exception;
            boolean flag;
            if (zzxZ >= 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            zzx.zzY(flag);
            if (!zzxY || zzxZ != 0)
            {
                break MISSING_BLOCK_LABEL_61;
            }
            com.google.android.gms.ads.internal.util.client.zzb.v("No reference is left (including root). Cleaning up engine.");
            zza(new zzij.zzc(this) {

                final zze zzyb;

                public void zza(zzbb zzbb1)
                {
                    zzhu.runOnUiThread(new Runnable(this, zzbb1) {

                        final zzbb zzrt;
                        final zze._cls3 zzyc;

                        public void run()
                        {
                            zze.zza(zzyc.zzyb).zzc(zzrt);
                            zzrt.destroy();
                        }

            
            {
                zzyc = _pcls3;
                zzrt = zzbb1;
                super();
            }
                    });
                }

                public void zzc(Object obj)
                {
                    zza((zzbb)obj);
                }

            
            {
                zzyb = zze1;
                super();
            }
            }, new zzij.zzb());
_L2:
            obj;
            JVM INSTR monitorexit ;
            return;
            com.google.android.gms.ads.internal.util.client.zzb.v("There are still references to the engine. Not destroying.");
            if (true) goto _L2; else goto _L1
_L1:
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public zze(zzb zzb1)
        {
            zzxH = zzb1;
            zzxY = false;
            zzxZ = 0;
        }
    }


    private final Context mContext;
    private final VersionInfoParcel zzpa;
    private final Object zzpc;
    private final String zzxF;
    private zzb zzxG;
    private zzb zzxH;
    private zze zzxI;
    private int zzxJ;

    public zzdv(Context context, VersionInfoParcel versioninfoparcel, String s)
    {
        zzpc = new Object();
        zzxJ = 1;
        zzxF = s;
        mContext = context.getApplicationContext();
        zzpa = versioninfoparcel;
        zzxG = new zzc();
        zzxH = new zzc();
    }

    public zzdv(Context context, VersionInfoParcel versioninfoparcel, String s, zzb zzb1, zzb zzb2)
    {
        this(context, versioninfoparcel, s);
        zzxG = zzb1;
        zzxH = zzb2;
    }

    static int zza(zzdv zzdv1, int i)
    {
        zzdv1.zzxJ = i;
        return i;
    }

    static Context zza(zzdv zzdv1)
    {
        return zzdv1.mContext;
    }

    static zze zza(zzdv zzdv1, zze zze1)
    {
        zzdv1.zzxI = zze1;
        return zze1;
    }

    static VersionInfoParcel zzb(zzdv zzdv1)
    {
        return zzdv1.zzpa;
    }

    static Object zzc(zzdv zzdv1)
    {
        return zzdv1.zzpc;
    }

    static zzb zzd(zzdv zzdv1)
    {
        return zzdv1.zzxG;
    }

    private zze zzdJ()
    {
        zze zze1 = new zze(zzxH);
        zzhu.runOnUiThread(new Runnable(zze1) {

            final zze zzxK;
            final zzdv zzxL;

            public void run()
            {
                zzbb zzbb1 = zzxL.zza(zzdv.zza(zzxL), zzdv.zzb(zzxL));
                zzbb1.zza(new zzbb.zza(this, zzbb1) {

                    final zzbb zzxM;
                    final _cls1 zzxN;

                    public void zzcj()
                    {
                        (new Timer()).schedule(new TimerTask(this) {

                            final _cls1 zzxO;

                            public void run()
                            {
label0:
                                {
                                    synchronized (zzdv.zzc(zzxO.zzxN.zzxL))
                                    {
                                        if (zzxO.zzxN.zzxK.getStatus() != -1 && zzxO.zzxN.zzxK.getStatus() != 1)
                                        {
                                            break label0;
                                        }
                                    }
                                    return;
                                }
                                zzxO.zzxN.zzxK.reject();
                                zzhu.runOnUiThread(new Runnable(this) {

                                    final _cls1 zzxP;

                                    public void run()
                                    {
                                        zzxP.zzxO.zzxM.destroy();
                                    }

            
            {
                zzxP = _pcls1;
                super();
            }
                                });
                                com.google.android.gms.ads.internal.util.client.zzb.v("Could not receive loaded message in a timely manner. Rejecting.");
                                obj;
                                JVM INSTR monitorexit ;
                                return;
                                exception;
                                obj;
                                JVM INSTR monitorexit ;
                                throw exception;
                            }

            
            {
                zzxO = _pcls1;
                super();
            }
                        }, zza.zzxU);
                    }

            
            {
                zzxN = _pcls1;
                zzxM = zzbb;
                super();
            }
                });
                zzbb1.zza("/jsLoaded", new zzdg(this, zzbb1) {

                    final zzbb zzxM;
                    final _cls1 zzxN;

                    public void zza(zzip zzip, Map map)
                    {
label0:
                        {
                            synchronized (zzdv.zzc(zzxN.zzxL))
                            {
                                if (zzxN.zzxK.getStatus() != -1 && zzxN.zzxK.getStatus() != 1)
                                {
                                    break label0;
                                }
                            }
                            return;
                        }
                        zzdv.zza(zzxN.zzxL, 0);
                        zzdv.zzd(zzxN.zzxL).zzc(zzxM);
                        zzxN.zzxK.zzg(zzxM);
                        zzdv.zza(zzxN.zzxL, zzxN.zzxK);
                        com.google.android.gms.ads.internal.util.client.zzb.v("Successfully loaded JS Engine.");
                        zzip;
                        JVM INSTR monitorexit ;
                        return;
                        map;
                        zzip;
                        JVM INSTR monitorexit ;
                        throw map;
                    }

            
            {
                zzxN = _pcls1;
                zzxM = zzbb;
                super();
            }
                });
                zzic zzic1 = new zzic();
                zzdg zzdg = new zzdg(this, zzbb1, zzic1) {

                    final zzbb zzxM;
                    final _cls1 zzxN;
                    final zzic zzxQ;

                    public void zza(zzip zzip, Map map)
                    {
                        synchronized (zzdv.zzc(zzxN.zzxL))
                        {
                            com.google.android.gms.ads.internal.util.client.zzb.zzaD("JS Engine is requesting an update");
                            if (zzdv.zze(zzxN.zzxL) == 0)
                            {
                                com.google.android.gms.ads.internal.util.client.zzb.zzaD("Starting reload.");
                                zzdv.zza(zzxN.zzxL, 2);
                                zzxN.zzxL.zzdK();
                            }
                            zzxM.zzb("/requestReload", (zzdg)zzxQ.get());
                        }
                        return;
                        map;
                        zzip;
                        JVM INSTR monitorexit ;
                        throw map;
                    }

            
            {
                zzxN = _pcls1;
                zzxM = zzbb1;
                zzxQ = zzic1;
                super();
            }
                };
                zzic1.set(zzdg);
                zzbb1.zza("/requestReload", zzdg);
                if (zzdv.zzf(zzxL).endsWith(".js"))
                {
                    zzbb1.zzs(zzdv.zzf(zzxL));
                } else
                if (zzdv.zzf(zzxL).startsWith("<html>"))
                {
                    zzbb1.zzu(zzdv.zzf(zzxL));
                } else
                {
                    zzbb1.zzt(zzdv.zzf(zzxL));
                }
                (new Timer()).schedule(new TimerTask(this, zzbb1) {

                    final zzbb zzxM;
                    final _cls1 zzxN;

                    public void run()
                    {
label0:
                        {
                            synchronized (zzdv.zzc(zzxN.zzxL))
                            {
                                if (zzxN.zzxK.getStatus() != -1 && zzxN.zzxK.getStatus() != 1)
                                {
                                    break label0;
                                }
                            }
                            return;
                        }
                        zzxN.zzxK.reject();
                        zzhu.runOnUiThread(new Runnable(this) {

                            final _cls4 zzxR;

                            public void run()
                            {
                                zzxR.zzxM.destroy();
                            }

            
            {
                zzxR = _pcls4;
                super();
            }
                        });
                        com.google.android.gms.ads.internal.util.client.zzb.v("Could not receive loaded message in a timely manner. Rejecting.");
                        obj;
                        JVM INSTR monitorexit ;
                        return;
                        exception;
                        obj;
                        JVM INSTR monitorexit ;
                        throw exception;
                    }

            
            {
                zzxN = _pcls1;
                zzxM = zzbb;
                super();
            }
                }, zza.zzxT);
            }

            
            {
                zzxL = zzdv.this;
                zzxK = zze1;
                super();
            }
        });
        return zze1;
    }

    static int zze(zzdv zzdv1)
    {
        return zzdv1.zzxJ;
    }

    static String zzf(zzdv zzdv1)
    {
        return zzdv1.zzxF;
    }

    static zze zzg(zzdv zzdv1)
    {
        return zzdv1.zzxI;
    }

    protected zzbb zza(Context context, VersionInfoParcel versioninfoparcel)
    {
        return new zzbd(context, versioninfoparcel, null);
    }

    protected zze zzdK()
    {
        zze zze1 = zzdJ();
        zze1.zza(new zzij.zzc(zze1) {

            final zzdv zzxL;
            final zze zzxS;

            public void zza(zzbb zzbb1)
            {
                synchronized (zzdv.zzc(zzxL))
                {
                    zzdv.zza(zzxL, 0);
                    if (zzdv.zzg(zzxL) != null && zzxS != zzdv.zzg(zzxL))
                    {
                        com.google.android.gms.ads.internal.util.client.zzb.v("New JS engine is loaded, marking previous one as destroyable.");
                        zzdv.zzg(zzxL).zzdO();
                    }
                    zzdv.zza(zzxL, zzxS);
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
                zzxL = zzdv.this;
                zzxS = zze1;
                super();
            }
        }, new zzij.zza(zze1) {

            final zzdv zzxL;
            final zze zzxS;

            public void run()
            {
                synchronized (zzdv.zzc(zzxL))
                {
                    zzdv.zza(zzxL, 1);
                    com.google.android.gms.ads.internal.util.client.zzb.v("Failed loading new engine. Marking new engine destroyable.");
                    zzxS.zzdO();
                }
                return;
                exception;
                obj;
                JVM INSTR monitorexit ;
                throw exception;
            }

            
            {
                zzxL = zzdv.this;
                zzxS = zze1;
                super();
            }
        });
        return zze1;
    }

    public zzd zzdL()
    {
label0:
        {
            zzd zzd1;
            synchronized (zzpc)
            {
                if (zzxI != null && zzxI.getStatus() != -1)
                {
                    break label0;
                }
                zzxJ = 2;
                zzxI = zzdK();
                zzd1 = zzxI.zzdM();
            }
            return zzd1;
        }
        zzd zzd2;
        if (zzxJ != 0)
        {
            break MISSING_BLOCK_LABEL_74;
        }
        zzd2 = zzxI.zzdM();
        obj;
        JVM INSTR monitorexit ;
        return zzd2;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        if (zzxJ != 1)
        {
            break MISSING_BLOCK_LABEL_104;
        }
        zzxJ = 2;
        zzdK();
        exception = zzxI.zzdM();
        obj;
        JVM INSTR monitorexit ;
        return exception;
        if (zzxJ != 2)
        {
            break MISSING_BLOCK_LABEL_124;
        }
        exception = zzxI.zzdM();
        obj;
        JVM INSTR monitorexit ;
        return exception;
        exception = zzxI.zzdM();
        obj;
        JVM INSTR monitorexit ;
        return exception;
    }
}
