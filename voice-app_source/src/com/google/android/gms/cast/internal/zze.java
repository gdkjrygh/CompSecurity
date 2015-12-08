// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.LaunchOptions;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.BinderWrapper;
import com.google.android.gms.common.internal.zzi;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

// Referenced classes of package com.google.android.gms.cast.internal:
//            zzl, ApplicationStatus, zzf, DeviceStatus, 
//            zzi

public final class zze extends zzi
{
    private static final class zza
        implements com.google.android.gms.cast.Cast.ApplicationConnectionResult
    {

        private final String zzFE;
        private final Status zzOt;
        private final ApplicationMetadata zzUF;
        private final String zzUG;
        private final boolean zzUH;

        public ApplicationMetadata getApplicationMetadata()
        {
            return zzUF;
        }

        public String getApplicationStatus()
        {
            return zzUG;
        }

        public String getSessionId()
        {
            return zzFE;
        }

        public Status getStatus()
        {
            return zzOt;
        }

        public boolean getWasLaunched()
        {
            return zzUH;
        }

        public zza(Status status)
        {
            this(status, null, null, null, false);
        }

        public zza(Status status, ApplicationMetadata applicationmetadata, String s, String s1, boolean flag)
        {
            zzOt = status;
            zzUF = applicationmetadata;
            zzUG = s;
            zzFE = s1;
            zzUH = flag;
        }
    }

    private static class zzb extends zzj.zza
    {

        private final Handler mHandler;
        private final AtomicReference zzUI;

        private void zza(zze zze1, long l, int i)
        {
            synchronized (zze.zzg(zze1))
            {
                zze1 = (com.google.android.gms.common.api.zza.zzb)zze.zzg(zze1).remove(Long.valueOf(l));
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
                    mHandler.post(new Runnable(this, zze1, i) {

                        final zze zzUJ;
                        final int zzUK;
                        final zzb zzUL;

                        public void run()
                        {
                            if (zze.zzd(zzUJ) != null)
                            {
                                zze.zzd(zzUJ).onApplicationDisconnected(zzUK);
                            }
                        }

            
            {
                zzUL = zzb1;
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
                    zze.zzc(zze1).zzm(new zza(new Status(0), applicationmetadata, s, s1, flag));
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
                    zze.zzc(zze1).zzm(new zza(new Status(i)));
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
                mHandler.post(new Runnable(this, zze1, applicationstatus) {

                    final zze zzUJ;
                    final zzb zzUL;
                    final ApplicationStatus zzUN;

                    public void run()
                    {
                        zze.zza(zzUJ, zzUN);
                    }

            
            {
                zzUL = zzb1;
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
                mHandler.post(new Runnable(this, zze1, devicestatus) {

                    final zze zzUJ;
                    final zzb zzUL;
                    final DeviceStatus zzUM;

                    public void run()
                    {
                        zze.zza(zzUJ, zzUM);
                    }

            
            {
                zzUL = zzb1;
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
                mHandler.post(new Runnable(this, zze1, s, s1) {

                    final String zzQz;
                    final zze zzUJ;
                    final zzb zzUL;
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
                zzUL = zzb1;
                zzUJ = zze1;
                zzQz = s;
                zzUO = s1;
                super();
            }
                });
                return;
            }
        }

        public zzb(zze zze1)
        {
            zzUI = new AtomicReference(zze1);
            mHandler = new Handler(zze1.getLooper());
        }
    }


    private static final zzl zzQW = new zzl("CastClientImpl");
    private static final Object zzUD = new Object();
    private static final Object zzUE = new Object();
    private final com.google.android.gms.cast.Cast.Listener zzQI;
    private double zzSh;
    private boolean zzSi;
    private final Map zzUA = new HashMap();
    private com.google.android.gms.common.api.zza.zzb zzUB;
    private com.google.android.gms.common.api.zza.zzb zzUC;
    private ApplicationMetadata zzUl;
    private final CastDevice zzUm;
    private final Map zzUn = new HashMap();
    private final long zzUo;
    private zzb zzUp;
    private String zzUq;
    private boolean zzUr;
    private boolean zzUs;
    private boolean zzUt;
    private int zzUu;
    private int zzUv;
    private final AtomicLong zzUw = new AtomicLong(0L);
    private String zzUx;
    private String zzUy;
    private Bundle zzUz;

    public zze(Context context, Looper looper, CastDevice castdevice, long l, com.google.android.gms.cast.Cast.Listener listener, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, 
            com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        super(context, looper, 10, connectioncallbacks, onconnectionfailedlistener);
        zzUm = castdevice;
        zzQI = listener;
        zzUo = l;
        zzlL();
    }

    static ApplicationMetadata zza(zze zze1, ApplicationMetadata applicationmetadata)
    {
        zze1.zzUl = applicationmetadata;
        return applicationmetadata;
    }

    static com.google.android.gms.common.api.zza.zzb zza(zze zze1, com.google.android.gms.common.api.zza.zzb zzb1)
    {
        zze1.zzUB = zzb1;
        return zzb1;
    }

    static String zza(zze zze1, String s)
    {
        zze1.zzUx = s;
        return s;
    }

    private void zza(ApplicationStatus applicationstatus)
    {
        applicationstatus = applicationstatus.zzlI();
        boolean flag;
        if (!com.google.android.gms.cast.internal.zzf.zza(applicationstatus, zzUq))
        {
            zzUq = applicationstatus;
            flag = true;
        } else
        {
            flag = false;
        }
        zzQW.zzb("hasChanged=%b, mFirstApplicationStatusUpdate=%b", new Object[] {
            Boolean.valueOf(flag), Boolean.valueOf(zzUr)
        });
        if (zzQI != null && (flag || zzUr))
        {
            zzQI.onApplicationStatusChanged();
        }
        zzUr = false;
    }

    private void zza(DeviceStatus devicestatus)
    {
        ApplicationMetadata applicationmetadata = devicestatus.getApplicationMetadata();
        if (!com.google.android.gms.cast.internal.zzf.zza(applicationmetadata, zzUl))
        {
            zzUl = applicationmetadata;
            zzQI.onApplicationMetadataChanged(zzUl);
        }
        double d = devicestatus.zzlO();
        int i;
        boolean flag;
        boolean flag1;
        if (d != (0.0D / 0.0D) && Math.abs(d - zzSh) > 9.9999999999999995E-08D)
        {
            zzSh = d;
            flag = true;
        } else
        {
            flag = false;
        }
        flag1 = devicestatus.zzlX();
        if (flag1 != zzSi)
        {
            zzSi = flag1;
            flag = true;
        }
        zzQW.zzb("hasVolumeChanged=%b, mFirstDeviceStatusUpdate=%b", new Object[] {
            Boolean.valueOf(flag), Boolean.valueOf(zzUs)
        });
        if (zzQI != null && (flag || zzUs))
        {
            zzQI.onVolumeChanged();
        }
        i = devicestatus.zzlP();
        if (i != zzUu)
        {
            zzUu = i;
            flag = true;
        } else
        {
            flag = false;
        }
        zzQW.zzb("hasActiveInputChanged=%b, mFirstDeviceStatusUpdate=%b", new Object[] {
            Boolean.valueOf(flag), Boolean.valueOf(zzUs)
        });
        if (zzQI != null && (flag || zzUs))
        {
            zzQI.onActiveInputStateChanged(zzUu);
        }
        i = devicestatus.zzlQ();
        if (i != zzUv)
        {
            zzUv = i;
            flag = true;
        } else
        {
            flag = false;
        }
        zzQW.zzb("hasStandbyStateChanged=%b, mFirstDeviceStatusUpdate=%b", new Object[] {
            Boolean.valueOf(flag), Boolean.valueOf(zzUs)
        });
        if (zzQI != null && (flag || zzUs))
        {
            zzQI.onStandbyStateChanged(zzUv);
        }
        zzUs = false;
    }

    static void zza(zze zze1, ApplicationStatus applicationstatus)
    {
        zze1.zza(applicationstatus);
    }

    static void zza(zze zze1, DeviceStatus devicestatus)
    {
        zze1.zza(devicestatus);
    }

    static com.google.android.gms.common.api.zza.zzb zzb(zze zze1, com.google.android.gms.common.api.zza.zzb zzb1)
    {
        zze1.zzUC = zzb1;
        return zzb1;
    }

    static String zzb(zze zze1, String s)
    {
        zze1.zzUy = s;
        return s;
    }

    static void zzb(zze zze1)
    {
        zze1.zzlL();
    }

    static com.google.android.gms.common.api.zza.zzb zzc(zze zze1)
    {
        return zze1.zzUB;
    }

    private void zzc(com.google.android.gms.common.api.zza.zzb zzb1)
    {
        synchronized (zzUD)
        {
            if (zzUB != null)
            {
                zzUB.zzm(new zza(new Status(2002)));
            }
            zzUB = zzb1;
        }
        return;
        zzb1;
        obj;
        JVM INSTR monitorexit ;
        throw zzb1;
    }

    static com.google.android.gms.cast.Cast.Listener zzd(zze zze1)
    {
        return zze1.zzQI;
    }

    static Map zze(zze zze1)
    {
        return zze1.zzUn;
    }

    private void zze(com.google.android.gms.common.api.zza.zzb zzb1)
    {
label0:
        {
            synchronized (zzUE)
            {
                if (zzUC == null)
                {
                    break label0;
                }
                zzb1.zzm(new Status(2001));
            }
            return;
        }
        zzUC = zzb1;
        obj;
        JVM INSTR monitorexit ;
        return;
        zzb1;
        obj;
        JVM INSTR monitorexit ;
        throw zzb1;
    }

    static CastDevice zzf(zze zze1)
    {
        return zze1.zzUm;
    }

    static Map zzg(zze zze1)
    {
        return zze1.zzUA;
    }

    static com.google.android.gms.common.api.zza.zzb zzh(zze zze1)
    {
        return zze1.zzUC;
    }

    private void zzlL()
    {
        zzUt = false;
        zzUu = -1;
        zzUv = -1;
        zzUl = null;
        zzUq = null;
        zzSh = 0.0D;
        zzSi = false;
    }

    private void zzlR()
    {
        zzQW.zzb("removing all MessageReceivedCallbacks", new Object[0]);
        synchronized (zzUn)
        {
            zzUn.clear();
        }
        return;
        exception;
        map;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void zzlS()
        throws IllegalStateException
    {
        if (!zzUt || zzUp == null || zzUp.isDisposed())
        {
            throw new IllegalStateException("Not connected to a device");
        } else
        {
            return;
        }
    }

    static zzl zzlT()
    {
        return zzQW;
    }

    static Object zzlU()
    {
        return zzUD;
    }

    static Object zzlV()
    {
        return zzUE;
    }

    public void disconnect()
    {
        zzQW.zzb("disconnect(); ServiceListener=%s, isConnected=%b", new Object[] {
            zzUp, Boolean.valueOf(isConnected())
        });
        zzb zzb1 = zzUp;
        zzUp = null;
        if (zzb1 == null || zzb1.zzlW() == null)
        {
            zzQW.zzb("already disposed, so short-circuiting", new Object[0]);
            return;
        }
        zzlR();
        if (isConnected() || isConnecting())
        {
            ((com.google.android.gms.cast.internal.zzi)zznM()).disconnect();
        }
        super.disconnect();
        return;
        Object obj;
        obj;
        zzQW.zzb(((Throwable) (obj)), "Error while disconnecting the controller interface: %s", new Object[] {
            ((RemoteException) (obj)).getMessage()
        });
        super.disconnect();
        return;
        obj;
        super.disconnect();
        throw obj;
    }

    public ApplicationMetadata getApplicationMetadata()
        throws IllegalStateException
    {
        zzlS();
        return zzUl;
    }

    public String getApplicationStatus()
        throws IllegalStateException
    {
        zzlS();
        return zzUq;
    }

    protected String getServiceDescriptor()
    {
        return "com.google.android.gms.cast.internal.ICastDeviceController";
    }

    protected String getStartServiceAction()
    {
        return "com.google.android.gms.cast.service.BIND_CAST_DEVICE_CONTROLLER_SERVICE";
    }

    public boolean isMute()
        throws IllegalStateException
    {
        zzlS();
        return zzSi;
    }

    public void onConnectionFailed(ConnectionResult connectionresult)
    {
        super.onConnectionFailed(connectionresult);
        zzlR();
    }

    public void zzR(boolean flag)
        throws IllegalStateException, RemoteException
    {
        ((com.google.android.gms.cast.internal.zzi)zznM()).zza(flag, zzSh, zzSi);
    }

    protected IInterface zzT(IBinder ibinder)
    {
        return zzaw(ibinder);
    }

    protected void zza(int i, IBinder ibinder, Bundle bundle, int j)
    {
        zzQW.zzb("in onPostInitHandler; statusCode=%d", new Object[] {
            Integer.valueOf(i)
        });
        int k;
        if (i == 0 || i == 1001)
        {
            zzUt = true;
            zzUr = true;
            zzUs = true;
        } else
        {
            zzUt = false;
        }
        k = i;
        if (i == 1001)
        {
            zzUz = new Bundle();
            zzUz.putBoolean("com.google.android.gms.cast.EXTRA_APP_NO_LONGER_RUNNING", true);
            k = 0;
        }
        super.zza(k, ibinder, bundle, j);
    }

    public void zza(String s, com.google.android.gms.cast.Cast.MessageReceivedCallback messagereceivedcallback)
        throws IllegalArgumentException, IllegalStateException, RemoteException
    {
        com.google.android.gms.cast.internal.zzf.zzbD(s);
        zzbC(s);
        if (messagereceivedcallback != null)
        {
            synchronized (zzUn)
            {
                zzUn.put(s, messagereceivedcallback);
            }
            ((com.google.android.gms.cast.internal.zzi)zznM()).zzbH(s);
        }
        return;
        s;
        map;
        JVM INSTR monitorexit ;
        throw s;
    }

    public void zza(String s, LaunchOptions launchoptions, com.google.android.gms.common.api.zza.zzb zzb1)
        throws IllegalStateException, RemoteException
    {
        zzc(zzb1);
        ((com.google.android.gms.cast.internal.zzi)zznM()).zza(s, launchoptions);
    }

    public void zza(String s, com.google.android.gms.common.api.zza.zzb zzb1)
        throws IllegalStateException, RemoteException
    {
        zze(zzb1);
        ((com.google.android.gms.cast.internal.zzi)zznM()).zzbG(s);
    }

    public void zza(String s, String s1, com.google.android.gms.common.api.zza.zzb zzb1)
        throws IllegalArgumentException, IllegalStateException, RemoteException
    {
        if (TextUtils.isEmpty(s1))
        {
            throw new IllegalArgumentException("The message payload cannot be null or empty");
        }
        if (s1.length() > 0x10000)
        {
            throw new IllegalArgumentException("Message exceeds maximum size");
        }
        com.google.android.gms.cast.internal.zzf.zzbD(s);
        zzlS();
        long l = zzUw.incrementAndGet();
        try
        {
            zzUA.put(Long.valueOf(l), zzb1);
            ((com.google.android.gms.cast.internal.zzi)zznM()).zza(s, s1, l);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            zzUA.remove(Long.valueOf(l));
        }
        throw s;
    }

    public void zza(String s, boolean flag, com.google.android.gms.common.api.zza.zzb zzb1)
        throws IllegalStateException, RemoteException
    {
        zzc(zzb1);
        ((com.google.android.gms.cast.internal.zzi)zznM()).zzf(s, flag);
    }

    protected com.google.android.gms.cast.internal.zzi zzaw(IBinder ibinder)
    {
        return zzi.zza.zzax(ibinder);
    }

    public void zzb(String s, String s1, com.google.android.gms.common.api.zza.zzb zzb1)
        throws IllegalStateException, RemoteException
    {
        zzc(zzb1);
        ((com.google.android.gms.cast.internal.zzi)zznM()).zzr(s, s1);
    }

    public void zzbC(String s)
        throws IllegalArgumentException, RemoteException
    {
        if (TextUtils.isEmpty(s))
        {
            throw new IllegalArgumentException("Channel namespace cannot be null or empty");
        }
        com.google.android.gms.cast.Cast.MessageReceivedCallback messagereceivedcallback;
        synchronized (zzUn)
        {
            messagereceivedcallback = (com.google.android.gms.cast.Cast.MessageReceivedCallback)zzUn.remove(s);
        }
        if (messagereceivedcallback == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        ((com.google.android.gms.cast.internal.zzi)zznM()).zzbI(s);
        return;
        s;
        map;
        JVM INSTR monitorexit ;
        throw s;
        IllegalStateException illegalstateexception;
        illegalstateexception;
        zzQW.zzb(illegalstateexception, "Error unregistering namespace (%s): %s", new Object[] {
            s, illegalstateexception.getMessage()
        });
        return;
    }

    public void zzd(double d)
        throws IllegalArgumentException, IllegalStateException, RemoteException
    {
        if (Double.isInfinite(d) || Double.isNaN(d))
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Volume cannot be ").append(d).toString());
        } else
        {
            ((com.google.android.gms.cast.internal.zzi)zznM()).zza(d, zzSh, zzSi);
            return;
        }
    }

    public void zzd(com.google.android.gms.common.api.zza.zzb zzb1)
        throws IllegalStateException, RemoteException
    {
        zze(zzb1);
        ((com.google.android.gms.cast.internal.zzi)zznM()).zzlY();
    }

    protected Bundle zzkR()
    {
        Bundle bundle = new Bundle();
        zzQW.zzb("getRemoteService(): mLastApplicationId=%s, mLastSessionId=%s", new Object[] {
            zzUx, zzUy
        });
        zzUm.putInBundle(bundle);
        bundle.putLong("com.google.android.gms.cast.EXTRA_CAST_FLAGS", zzUo);
        zzUp = new zzb(this);
        bundle.putParcelable("listener", new BinderWrapper(zzUp.asBinder()));
        if (zzUx != null)
        {
            bundle.putString("last_application_id", zzUx);
            if (zzUy != null)
            {
                bundle.putString("last_session_id", zzUy);
            }
        }
        return bundle;
    }

    public Bundle zzlM()
    {
        if (zzUz != null)
        {
            Bundle bundle = zzUz;
            zzUz = null;
            return bundle;
        } else
        {
            return super.zzlM();
        }
    }

    public void zzlN()
        throws IllegalStateException, RemoteException
    {
        ((com.google.android.gms.cast.internal.zzi)zznM()).zzlN();
    }

    public double zzlO()
        throws IllegalStateException
    {
        zzlS();
        return zzSh;
    }

    public int zzlP()
        throws IllegalStateException
    {
        zzlS();
        return zzUu;
    }

    public int zzlQ()
        throws IllegalStateException
    {
        zzlS();
        return zzUv;
    }

}
