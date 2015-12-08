// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast.internal;

import android.os.Handler;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.common.api.Status;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

// Referenced classes of package com.google.android.gms.cast.internal:
//            zze, zzl, ApplicationStatus, DeviceStatus

private static class ooper extends ooper
{

    private final Handler mHandler;
    private final AtomicReference zzUI;

    private void zza(zze zze1, long l, int i)
    {
        synchronized (zze.zzg(zze1))
        {
            zze1 = (com.google.android.gms.common.api.zg)zze.zzg(zze1).remove(Long.valueOf(l));
        }
        if (zze1 != null)
        {
            zze1.zzm(new Status(i));
        }
        return;
        zze1;
        map;
        JVM INSTR monitorexit ;
        throw zze1;
    }

    private boolean zza(zze zze1, int i)
    {
        Object obj = zze.zzlV();
        obj;
        JVM INSTR monitorenter ;
        if (zze.zzh(zze1) == null)
        {
            break MISSING_BLOCK_LABEL_40;
        }
        zze.zzh(zze1).zzm(new Status(i));
        zze.zzb(zze1, null);
        return true;
        obj;
        JVM INSTR monitorexit ;
        return false;
        zze1;
        obj;
        JVM INSTR monitorexit ;
        throw zze1;
    }

    public boolean isDisposed()
    {
        return zzUI.get() == null;
    }

    public void onApplicationDisconnected(int i)
    {
        zze zze1 = (zze)zzUI.get();
        if (zze1 != null)
        {
            zze.zza(zze1, null);
            zze.zzb(zze1, null);
            zza(zze1, i);
            if (zze.zzd(zze1) != null)
            {
                mHandler.post(new Runnable(zze1, i) {

                    final zze zzUJ;
                    final int zzUK;
                    final zze.zzb zzUL;

                    public void run()
                    {
                        if (zze.zzd(zzUJ) != null)
                        {
                            zze.zzd(zzUJ).onApplicationDisconnected(zzUK);
                        }
                    }

            
            {
                zzUL = zze.zzb.this;
                zzUJ = zze1;
                zzUK = i;
                super();
            }
                });
                return;
            }
        }
    }

    public void zza(ApplicationMetadata applicationmetadata, String s, String s1, boolean flag)
    {
        zze zze1 = (zze)zzUI.get();
        if (zze1 == null)
        {
            return;
        }
        zze.zza(zze1, applicationmetadata);
        zze.zza(zze1, applicationmetadata.getApplicationId());
        zze.zzb(zze1, s1);
        synchronized (zze.zzlU())
        {
            if (zze.zzc(zze1) != null)
            {
                zze.zzc(zze1).zzm(new <init>(new Status(0), applicationmetadata, s, s1, flag));
                zze.zza(zze1, null);
            }
        }
        return;
        applicationmetadata;
        obj;
        JVM INSTR monitorexit ;
        throw applicationmetadata;
    }

    public void zza(String s, double d, boolean flag)
    {
        zze.zzlT().zzb("Deprecated callback: \"onStatusreceived\"", new Object[0]);
    }

    public void zza(String s, long l, int i)
    {
        s = (zze)zzUI.get();
        if (s == null)
        {
            return;
        } else
        {
            zza(((zze) (s)), l, i);
            return;
        }
    }

    public void zzaM(int i)
    {
        zze zze1 = zzlW();
        if (zze1 != null)
        {
            zze.zzlT().zzb("ICastDeviceControllerListener.onDisconnected: %d", new Object[] {
                Integer.valueOf(i)
            });
            if (i != 0)
            {
                zze1.zzbs(2);
                return;
            }
        }
    }

    public void zzaN(int i)
    {
        zze zze1 = (zze)zzUI.get();
        if (zze1 == null)
        {
            return;
        }
        synchronized (zze.zzlU())
        {
            if (zze.zzc(zze1) != null)
            {
                zze.zzc(zze1).zzm(new <init>(new Status(i)));
                zze.zza(zze1, null);
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void zzaO(int i)
    {
        zze zze1 = (zze)zzUI.get();
        if (zze1 == null)
        {
            return;
        } else
        {
            zza(zze1, i);
            return;
        }
    }

    public void zzaP(int i)
    {
        zze zze1 = (zze)zzUI.get();
        if (zze1 == null)
        {
            return;
        } else
        {
            zza(zze1, i);
            return;
        }
    }

    public void zzb(ApplicationStatus applicationstatus)
    {
        zze zze1 = (zze)zzUI.get();
        if (zze1 == null)
        {
            return;
        } else
        {
            zze.zzlT().zzb("onApplicationStatusChanged", new Object[0]);
            mHandler.post(new Runnable(zze1, applicationstatus) {

                final zze zzUJ;
                final zze.zzb zzUL;
                final ApplicationStatus zzUN;

                public void run()
                {
                    zze.zza(zzUJ, zzUN);
                }

            
            {
                zzUL = zze.zzb.this;
                zzUJ = zze1;
                zzUN = applicationstatus;
                super();
            }
            });
            return;
        }
    }

    public void zzb(DeviceStatus devicestatus)
    {
        zze zze1 = (zze)zzUI.get();
        if (zze1 == null)
        {
            return;
        } else
        {
            zze.zzlT().zzb("onDeviceStatusChanged", new Object[0]);
            mHandler.post(new Runnable(zze1, devicestatus) {

                final zze zzUJ;
                final zze.zzb zzUL;
                final DeviceStatus zzUM;

                public void run()
                {
                    zze.zza(zzUJ, zzUM);
                }

            
            {
                zzUL = zze.zzb.this;
                zzUJ = zze1;
                zzUM = devicestatus;
                super();
            }
            });
            return;
        }
    }

    public void zzb(String s, byte abyte0[])
    {
        if ((zze)zzUI.get() == null)
        {
            return;
        } else
        {
            zze.zzlT().zzb("IGNORING: Receive (type=binary, ns=%s) <%d bytes>", new Object[] {
                s, Integer.valueOf(abyte0.length)
            });
            return;
        }
    }

    public void zzd(String s, long l)
    {
        s = (zze)zzUI.get();
        if (s == null)
        {
            return;
        } else
        {
            zza(s, l, 0);
            return;
        }
    }

    public zze zzlW()
    {
        zze zze1 = (zze)zzUI.getAndSet(null);
        if (zze1 == null)
        {
            return null;
        } else
        {
            zze.zzb(zze1);
            return zze1;
        }
    }

    public void zzq(String s, String s1)
    {
        zze zze1 = (zze)zzUI.get();
        if (zze1 == null)
        {
            return;
        } else
        {
            zze.zzlT().zzb("Receive (type=text, ns=%s) %s", new Object[] {
                s, s1
            });
            mHandler.post(new Runnable(zze1, s, s1) {

                final String zzQz;
                final zze zzUJ;
                final zze.zzb zzUL;
                final String zzUO;

                public void run()
                {
                    com.google.android.gms.cast.Cast.MessageReceivedCallback messagereceivedcallback;
                    synchronized (zze.zze(zzUJ))
                    {
                        messagereceivedcallback = (com.google.android.gms.cast.Cast.MessageReceivedCallback)zze.zze(zzUJ).get(zzQz);
                    }
                    if (messagereceivedcallback != null)
                    {
                        messagereceivedcallback.onMessageReceived(zze.zzf(zzUJ), zzQz, zzUO);
                        return;
                    } else
                    {
                        zze.zzlT().zzb("Discarded message for unknown namespace '%s'", new Object[] {
                            zzQz
                        });
                        return;
                    }
                    exception;
                    map;
                    JVM INSTR monitorexit ;
                    throw exception;
                }

            
            {
                zzUL = zze.zzb.this;
                zzUJ = zze1;
                zzQz = s;
                zzUO = s1;
                super();
            }
            });
            return;
        }
    }

    public _cls4.zzUO(zze zze1)
    {
        zzUI = new AtomicReference(zze1);
        mHandler = new Handler(zze1.getLooper());
    }
}
