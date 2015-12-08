// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.util.client.zzb;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

// Referenced classes of package com.google.android.gms.internal:
//            zzdv, zzhu, zzbb, zzic, 
//            zzdg, zzip

class zzxO extends TimerTask
{

    final ient.zzb.v zzxO;

    public void run()
    {
label0:
        {
            synchronized (zzdv.zzc(zzxO.xN.))
            {
                if (zzxO.xN..tStatus() != -1 && zzxO.xN..tStatus() != 1)
                {
                    break label0;
                }
            }
            return;
        }
        zzxO.xN..ject();
        zzhu.runOnUiThread(new Runnable() {

            final zzdv._cls1._cls1._cls1 zzxP;

            public void run()
            {
                zzxP.zzxO.zzxM.destroy();
            }

            
            {
                zzxP = zzdv._cls1._cls1._cls1.this;
                super();
            }
        });
        zzb.v("Could not receive loaded message in a timely manner. Rejecting.");
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    ( )
    {
        zzxO = ;
        super();
    }

    // Unreferenced inner class com/google/android/gms/internal/zzdv$1

/* anonymous class */
    class zzdv._cls1
        implements Runnable
    {

        final zzdv.zze zzxK;
        final zzdv zzxL;

        public void run()
        {
            zzbb zzbb1 = zzxL.zza(zzdv.zza(zzxL), com.google.android.gms.internal.zzdv.zzb(zzxL));
            zzbb1.zza(new zzdv._cls1._cls1(this, zzbb1));
            zzbb1.zza("/jsLoaded", new zzdv._cls1._cls2(zzbb1));
            zzic zzic1 = new zzic();
            zzdg zzdg = new zzdv._cls1._cls3(zzbb1, zzic1);
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
            (new Timer()).schedule(new zzdv._cls1._cls4(zzbb1), zzdv.zza.zzxT);
        }

            
            {
                zzxL = zzdv1;
                zzxK = zze;
                super();
            }

        // Unreferenced inner class com/google/android/gms/internal/zzdv$1$2

/* anonymous class */
        class zzdv._cls1._cls2
            implements zzdg
        {

            final zzbb zzxM;
            final zzdv._cls1 zzxN;

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
                zzb.v("Successfully loaded JS Engine.");
                zzip;
                JVM INSTR monitorexit ;
                return;
                map;
                zzip;
                JVM INSTR monitorexit ;
                throw map;
            }

                    
                    {
                        zzxN = zzdv._cls1.this;
                        zzxM = zzbb1;
                        super();
                    }
        }


        // Unreferenced inner class com/google/android/gms/internal/zzdv$1$3

/* anonymous class */
        class zzdv._cls1._cls3
            implements zzdg
        {

            final zzbb zzxM;
            final zzdv._cls1 zzxN;
            final zzic zzxQ;

            public void zza(zzip zzip, Map map)
            {
                synchronized (zzdv.zzc(zzxN.zzxL))
                {
                    zzb.zzaD("JS Engine is requesting an update");
                    if (zzdv.zze(zzxN.zzxL) == 0)
                    {
                        zzb.zzaD("Starting reload.");
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
                        zzxN = zzdv._cls1.this;
                        zzxM = zzbb1;
                        zzxQ = zzic1;
                        super();
                    }
        }


        // Unreferenced inner class com/google/android/gms/internal/zzdv$1$4

/* anonymous class */
        class zzdv._cls1._cls4 extends TimerTask
        {

            final zzbb zzxM;
            final zzdv._cls1 zzxN;

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
                zzhu.runOnUiThread(new zzdv._cls1._cls4._cls1(this));
                zzb.v("Could not receive loaded message in a timely manner. Rejecting.");
                obj;
                JVM INSTR monitorexit ;
                return;
                exception;
                obj;
                JVM INSTR monitorexit ;
                throw exception;
            }

                    
                    {
                        zzxN = zzdv._cls1.this;
                        zzxM = zzbb1;
                        super();
                    }
        }


        // Unreferenced inner class com/google/android/gms/internal/zzdv$1$4$1

/* anonymous class */
        class zzdv._cls1._cls4._cls1
            implements Runnable
        {

            final zzdv._cls1._cls4 zzxR;

            public void run()
            {
                zzxR.zzxM.destroy();
            }

                    
                    {
                        zzxR = _pcls4;
                        super();
                    }
        }

    }


    // Unreferenced inner class com/google/android/gms/internal/zzdv$1$1

/* anonymous class */
    class zzdv._cls1._cls1
        implements zzbb.zza
    {

        final zzbb zzxM;
        final zzdv._cls1 zzxN;

        public void zzcj()
        {
            (new Timer()).schedule(new zzdv._cls1._cls1._cls1(this), zzdv.zza.zzxU);
        }

            
            {
                zzxN = _pcls1;
                zzxM = zzbb;
                super();
            }
    }

}
