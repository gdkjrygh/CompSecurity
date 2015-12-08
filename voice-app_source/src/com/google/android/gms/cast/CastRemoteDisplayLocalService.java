// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.support.v7.media.MediaRouter;
import android.text.TextUtils;
import android.view.Display;
import com.google.android.gms.cast.internal.zzl;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.zzu;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.google.android.gms.cast:
//            CastDevice, CastRemoteDisplay, CastMediaControlIntent, CastRemoteDisplayApi

public abstract class CastRemoteDisplayLocalService extends Service
{
    public static interface Callbacks
    {

        public abstract void onRemoteDisplaySessionError(Status status);

        public abstract void onRemoteDisplaySessionStarted(CastRemoteDisplayLocalService castremotedisplaylocalservice);
    }

    public static final class NotificationSettings
    {

        private Notification mNotification;
        private PendingIntent zzRv;
        private String zzRw;
        private String zzRx;

        static Notification zza(NotificationSettings notificationsettings)
        {
            return notificationsettings.mNotification;
        }

        static Notification zza(NotificationSettings notificationsettings, Notification notification)
        {
            notificationsettings.mNotification = notification;
            return notification;
        }

        static PendingIntent zza(NotificationSettings notificationsettings, PendingIntent pendingintent)
        {
            notificationsettings.zzRv = pendingintent;
            return pendingintent;
        }

        static String zza(NotificationSettings notificationsettings, String s)
        {
            notificationsettings.zzRw = s;
            return s;
        }

        static String zzb(NotificationSettings notificationsettings)
        {
            return notificationsettings.zzRw;
        }

        static String zzb(NotificationSettings notificationsettings, String s)
        {
            notificationsettings.zzRx = s;
            return s;
        }

        static String zzc(NotificationSettings notificationsettings)
        {
            return notificationsettings.zzRx;
        }

        static PendingIntent zzd(NotificationSettings notificationsettings)
        {
            return notificationsettings.zzRv;
        }

        private NotificationSettings()
        {
        }


        private NotificationSettings(NotificationSettings notificationsettings)
        {
            mNotification = notificationsettings.mNotification;
            zzRv = notificationsettings.zzRv;
            zzRw = notificationsettings.zzRw;
            zzRx = notificationsettings.zzRx;
        }

    }

    public static final class NotificationSettings.Builder
    {

        private NotificationSettings zzRy;

        public NotificationSettings build()
        {
            if (NotificationSettings.zza(zzRy) != null)
            {
                if (!TextUtils.isEmpty(NotificationSettings.zzb(zzRy)))
                {
                    throw new IllegalArgumentException("notificationTitle requires using the default notification");
                }
                if (!TextUtils.isEmpty(NotificationSettings.zzc(zzRy)))
                {
                    throw new IllegalArgumentException("notificationText requires using the default notification");
                }
                if (NotificationSettings.zzd(zzRy) != null)
                {
                    throw new IllegalArgumentException("notificationPendingIntent requires using the default notification");
                }
            } else
            if (TextUtils.isEmpty(NotificationSettings.zzb(zzRy)) && TextUtils.isEmpty(NotificationSettings.zzc(zzRy)) && NotificationSettings.zzd(zzRy) == null)
            {
                throw new IllegalArgumentException("At least an argument must be provided");
            }
            return zzRy;
        }

        public NotificationSettings.Builder setNotification(Notification notification)
        {
            NotificationSettings.zza(zzRy, notification);
            return this;
        }

        public NotificationSettings.Builder setNotificationPendingIntent(PendingIntent pendingintent)
        {
            NotificationSettings.zza(zzRy, pendingintent);
            return this;
        }

        public NotificationSettings.Builder setNotificationText(String s)
        {
            NotificationSettings.zzb(zzRy, s);
            return this;
        }

        public NotificationSettings.Builder setNotificationTitle(String s)
        {
            NotificationSettings.zza(zzRy, s);
            return this;
        }

        public NotificationSettings.Builder()
        {
            zzRy = new NotificationSettings();
        }
    }

    private class zza extends Binder
    {

        final CastRemoteDisplayLocalService zzRp;

        CastRemoteDisplayLocalService zzlp()
        {
            return zzRp;
        }

        private zza()
        {
            zzRp = CastRemoteDisplayLocalService.this;
            super();
        }

    }

    private static final class zzb extends BroadcastReceiver
    {

        public void onReceive(Context context, Intent intent)
        {
            if (intent.getAction().equals("com.google.android.gms.cast.remote_display.ACTION_NOTIFICATION_DISCONNECT"))
            {
                CastRemoteDisplayLocalService.zzln().zzb("disconnecting", new Object[0]);
                CastRemoteDisplayLocalService.stopService();
            }
        }

        private zzb()
        {
        }

    }


    private static final zzl zzQW = new zzl("CastRemoteDisplayLocalService");
    private static final int zzQX;
    private static final Object zzQY = new Object();
    private static AtomicBoolean zzQZ = new AtomicBoolean(false);
    private static CastRemoteDisplayLocalService zzRn;
    private Handler mHandler;
    private Notification mNotification;
    private String zzQv;
    private GoogleApiClient zzRa;
    private CastRemoteDisplay.CastRemoteDisplaySessionCallbacks zzRb;
    private Callbacks zzRc;
    private zzb zzRd;
    private NotificationSettings zzRe;
    private Boolean zzRf;
    private PendingIntent zzRg;
    private CastDevice zzRh;
    private Display zzRi;
    private Context zzRj;
    private ServiceConnection zzRk;
    private MediaRouter zzRl;
    private final android.support.v7.media.MediaRouter.Callback zzRm = new android.support.v7.media.MediaRouter.Callback() {

        final CastRemoteDisplayLocalService zzRp;

        public void onRouteUnselected(MediaRouter mediarouter, android.support.v7.media.MediaRouter.RouteInfo routeinfo)
        {
            CastRemoteDisplayLocalService.zzln().zzb("onRouteUnselected", new Object[0]);
            if (CastRemoteDisplayLocalService.zza(zzRp) == null)
            {
                CastRemoteDisplayLocalService.zzln().zzb("onRouteUnselected, no device was selected", new Object[0]);
                return;
            }
            if (!CastDevice.getFromBundle(routeinfo.getExtras()).getDeviceId().equals(CastRemoteDisplayLocalService.zza(zzRp).getDeviceId()))
            {
                CastRemoteDisplayLocalService.zzln().zzb("onRouteUnselected, device does not match", new Object[0]);
                return;
            } else
            {
                CastRemoteDisplayLocalService.stopService();
                return;
            }
        }

            
            {
                zzRp = CastRemoteDisplayLocalService.this;
                super();
            }
    };
    private final IBinder zzRo = new zza();

    public CastRemoteDisplayLocalService()
    {
    }

    public static CastRemoteDisplayLocalService getInstance()
    {
        CastRemoteDisplayLocalService castremotedisplaylocalservice;
        synchronized (zzQY)
        {
            castremotedisplaylocalservice = zzRn;
        }
        return castremotedisplaylocalservice;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected static void setDebugEnabled()
    {
        zzQW.zzS(true);
    }

    public static void startService(Context context, Class class1, String s, CastDevice castdevice, NotificationSettings notificationsettings, Callbacks callbacks)
    {
        zzQW.zzb("Starting Service", new Object[0]);
        zzb(context, class1);
        zzu.zzb(context, "activityContext is required.");
        zzu.zzb(class1, "serviceClass is required.");
        zzu.zzb(s, "applicationId is required.");
        zzu.zzb(castdevice, "device is required.");
        zzu.zzb(notificationsettings, "notificationSettings is required.");
        zzu.zzb(callbacks, "callbacks is required.");
        if (NotificationSettings.zza(notificationsettings) == null && NotificationSettings.zzd(notificationsettings) == null)
        {
            throw new IllegalArgumentException("notificationSettings: Either the notification or the notificationPendingIntent must be provided");
        }
        if (zzQZ.getAndSet(true))
        {
            zzQW.zzc("Service is already being started, startService has been called twice", new Object[0]);
            return;
        } else
        {
            class1 = new Intent(context, class1);
            context.startService(class1);
            context.bindService(class1, new ServiceConnection(s, castdevice, notificationsettings, context, callbacks) {

                final String zzQC;
                final CastDevice zzRq;
                final NotificationSettings zzRr;
                final Context zzRs;
                final Callbacks zzRt;

                public void onServiceConnected(ComponentName componentname, IBinder ibinder)
                {
                    componentname = ((zza)ibinder).zzlp();
                    if (componentname != null)
                    {
                        CastRemoteDisplayLocalService.zza(componentname, zzQC, zzRq, zzRr, zzRs, this, zzRt);
                        return;
                    } else
                    {
                        CastRemoteDisplayLocalService.zzln().zzc("Connected but unable to get the service instance", new Object[0]);
                        zzRt.onRemoteDisplaySessionError(new Status(2200));
                        CastRemoteDisplayLocalService.zzlo().set(false);
                        zzRs.unbindService(this);
                        return;
                    }
                }

                public void onServiceDisconnected(ComponentName componentname)
                {
                    CastRemoteDisplayLocalService.zzln().zzb("onServiceDisconnected", new Object[0]);
                    zzRt.onRemoteDisplaySessionError(new Status(2201, "Service Disconnected"));
                    CastRemoteDisplayLocalService.zzlo().set(false);
                    zzRs.unbindService(this);
                }

            
            {
                zzQC = s;
                zzRq = castdevice;
                zzRr = notificationsettings;
                zzRs = context;
                zzRt = callbacks;
                super();
            }
            }, 64);
            return;
        }
    }

    public static void stopService()
    {
        zzM(false);
    }

    private static void zzM(boolean flag)
    {
label0:
        {
            zzQW.zzb("Stopping Service", new Object[0]);
            zzQZ.set(false);
            synchronized (zzQY)
            {
                if (zzRn != null)
                {
                    break label0;
                }
                zzQW.zzc("Service is already being stopped", new Object[0]);
            }
            return;
        }
        CastRemoteDisplayLocalService castremotedisplaylocalservice;
        castremotedisplaylocalservice = zzRn;
        zzRn = null;
        obj;
        JVM INSTR monitorexit ;
        if (!flag && castremotedisplaylocalservice.zzRl != null)
        {
            zzQW.zzb("Setting default route", new Object[0]);
            castremotedisplaylocalservice.zzRl.selectRoute(castremotedisplaylocalservice.zzRl.getDefaultRoute());
        }
        if (castremotedisplaylocalservice.zzRd != null)
        {
            zzQW.zzb("Unregistering notification receiver", new Object[0]);
            castremotedisplaylocalservice.unregisterReceiver(castremotedisplaylocalservice.zzRd);
        }
        castremotedisplaylocalservice.zzlk();
        castremotedisplaylocalservice.zzll();
        castremotedisplaylocalservice.zzlg();
        if (castremotedisplaylocalservice.zzRj != null && castremotedisplaylocalservice.zzRk != null)
        {
            castremotedisplaylocalservice.zzRj.unbindService(castremotedisplaylocalservice.zzRk);
            castremotedisplaylocalservice.zzRk = null;
            castremotedisplaylocalservice.zzRj = null;
        }
        castremotedisplaylocalservice.zzRc = null;
        castremotedisplaylocalservice.zzQv = null;
        castremotedisplaylocalservice.zzRa = null;
        castremotedisplaylocalservice.zzRh = null;
        castremotedisplaylocalservice.zzRe = null;
        castremotedisplaylocalservice.mNotification = null;
        castremotedisplaylocalservice.zzRi = null;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private Notification zzN(boolean flag)
    {
        int k = getApplicationInfo().labelRes;
        String s1 = NotificationSettings.zzb(zzRe);
        String s = NotificationSettings.zzc(zzRe);
        Object obj;
        int i;
        int j;
        if (flag)
        {
            j = com.google.android.gms.R.string.cast_notification_connected_message;
            i = com.google.android.gms.R.drawable.cast_ic_notification_on;
        } else
        {
            j = com.google.android.gms.R.string.cast_notification_connecting_message;
            i = com.google.android.gms.R.drawable.cast_ic_notification_connecting;
        }
        obj = s1;
        if (TextUtils.isEmpty(s1))
        {
            obj = getString(k);
        }
        if (TextUtils.isEmpty(s))
        {
            s = getString(j, new Object[] {
                zzRh.getFriendlyName()
            });
        }
        obj = (new android.support.v4.app.NotificationCompat.Builder(this)).setContentTitle(((CharSequence) (obj))).setContentText(s).setContentIntent(NotificationSettings.zzd(zzRe)).setSmallIcon(i).setOngoing(true).addAction(0x1080038, getString(com.google.android.gms.R.string.cast_notification_disconnect), zzlm()).build();
        startForeground(zzQX, ((Notification) (obj)));
        return ((Notification) (obj));
    }

    static void zzO(boolean flag)
    {
        zzM(flag);
    }

    static Context zza(CastRemoteDisplayLocalService castremotedisplaylocalservice, Context context)
    {
        castremotedisplaylocalservice.zzRj = context;
        return context;
    }

    static ServiceConnection zza(CastRemoteDisplayLocalService castremotedisplaylocalservice, ServiceConnection serviceconnection)
    {
        castremotedisplaylocalservice.zzRk = serviceconnection;
        return serviceconnection;
    }

    static CastDevice zza(CastRemoteDisplayLocalService castremotedisplaylocalservice)
    {
        return castremotedisplaylocalservice.zzRh;
    }

    private GoogleApiClient zza(CastDevice castdevice)
    {
        castdevice = new CastRemoteDisplay.CastRemoteDisplayOptions.Builder(castdevice, zzRb);
        return (new com.google.android.gms.common.api.GoogleApiClient.Builder(this, new com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks() {

            final CastRemoteDisplayLocalService zzRp;

            public void onConnected(Bundle bundle)
            {
                CastRemoteDisplayLocalService.zzln().zzb("onConnected", new Object[0]);
                CastRemoteDisplayLocalService.zzf(zzRp);
            }

            public void onConnectionSuspended(int i)
            {
                CastRemoteDisplayLocalService.zzln().zzf(String.format("ConnectionSuspended %d", new Object[] {
                    Integer.valueOf(i)
                }), new Object[0]);
            }

            
            {
                zzRp = CastRemoteDisplayLocalService.this;
                super();
            }
        }, new com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener() {

            final CastRemoteDisplayLocalService zzRp;

            public void onConnectionFailed(ConnectionResult connectionresult)
            {
                CastRemoteDisplayLocalService.zzln().zzc((new StringBuilder()).append("Connection failed: ").append(connectionresult).toString(), new Object[0]);
                CastRemoteDisplayLocalService.zzc(zzRp);
            }

            
            {
                zzRp = CastRemoteDisplayLocalService.this;
                super();
            }
        })).addApi(CastRemoteDisplay.API, castdevice.build()).build();
    }

    private void zza(Display display)
    {
        zzRi = display;
        if (zzRf.booleanValue())
        {
            mNotification = zzN(true);
        }
        if (zzRc != null)
        {
            zzRc.onRemoteDisplaySessionStarted(this);
            zzRc = null;
        }
        onCreatePresentation(zzRi);
    }

    static void zza(CastRemoteDisplayLocalService castremotedisplaylocalservice, Display display)
    {
        castremotedisplaylocalservice.zza(display);
    }

    static void zza(CastRemoteDisplayLocalService castremotedisplaylocalservice, String s, CastDevice castdevice, NotificationSettings notificationsettings, Context context, ServiceConnection serviceconnection, Callbacks callbacks)
    {
        castremotedisplaylocalservice.zza(s, castdevice, notificationsettings, context, serviceconnection, callbacks);
    }

    private void zza(String s, CastDevice castdevice, NotificationSettings notificationsettings, Context context, ServiceConnection serviceconnection, Callbacks callbacks)
    {
        zzQW.zzb("startRemoteDisplaySession", new Object[0]);
        zzu.zzbY("Starting the Cast Remote Display must be done on the main thread");
        synchronized (zzQY)
        {
            if (zzRn != null)
            {
                zzM(true);
                zzQW.zzf("An existing service had not been stopped before starting one", new Object[0]);
            }
            zzRn = this;
        }
        zzRc = callbacks;
        zzQv = s;
        zzRh = castdevice;
        zzRj = context;
        zzRk = serviceconnection;
        zzRl = MediaRouter.getInstance(getApplicationContext());
        s = (new android.support.v7.media.MediaRouteSelector.Builder()).addControlCategory(CastMediaControlIntent.categoryForCast(zzQv)).build();
        zzRl.addCallback(s, zzRm, 4);
        mHandler = new Handler(getMainLooper());
        mNotification = NotificationSettings.zza(notificationsettings);
        zzRd = new zzb();
        registerReceiver(zzRd, new IntentFilter("com.google.android.gms.cast.remote_display.ACTION_NOTIFICATION_DISCONNECT"));
        zzRe = new NotificationSettings(notificationsettings);
        if (NotificationSettings.zza(zzRe) == null)
        {
            zzRf = Boolean.valueOf(true);
            mNotification = zzN(false);
        } else
        {
            zzRf = Boolean.valueOf(false);
            mNotification = NotificationSettings.zza(zzRe);
        }
        zzRa = zza(castdevice);
        zzRa.connect();
        return;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }

    static Handler zzb(CastRemoteDisplayLocalService castremotedisplaylocalservice)
    {
        return castremotedisplaylocalservice.mHandler;
    }

    static Display zzb(CastRemoteDisplayLocalService castremotedisplaylocalservice, Display display)
    {
        castremotedisplaylocalservice.zzRi = display;
        return display;
    }

    private static void zzb(Context context, Class class1)
    {
        try
        {
            class1 = new ComponentName(context, class1);
            context = context.getPackageManager().getServiceInfo(class1, 128);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new IllegalStateException("Service not found, did you forget to configure it in the manifest?");
        }
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_56;
        }
        if (((ServiceInfo) (context)).exported)
        {
            throw new IllegalStateException("The service must not be exported, verify the manifest configuration");
        }
    }

    static void zzc(CastRemoteDisplayLocalService castremotedisplaylocalservice)
    {
        castremotedisplaylocalservice.zzlj();
    }

    static Context zzd(CastRemoteDisplayLocalService castremotedisplaylocalservice)
    {
        return castremotedisplaylocalservice.zzRj;
    }

    static ServiceConnection zze(CastRemoteDisplayLocalService castremotedisplaylocalservice)
    {
        return castremotedisplaylocalservice.zzRk;
    }

    static void zzf(CastRemoteDisplayLocalService castremotedisplaylocalservice)
    {
        castremotedisplaylocalservice.zzlh();
    }

    private void zzlg()
    {
        if (zzRl != null)
        {
            zzu.zzbY("CastRemoteDisplayLocalService calls must be done on the main thread");
            zzRl.removeCallback(zzRm);
        }
    }

    private void zzlh()
    {
        zzQW.zzb("startRemoteDisplay", new Object[0]);
        if (zzRa == null || !zzRa.isConnected())
        {
            zzQW.zzc("Unable to start the remote display as the API client is not ready", new Object[0]);
            return;
        } else
        {
            CastRemoteDisplay.CastRemoteDisplayApi.startRemoteDisplay(zzRa, zzQv).setResultCallback(new ResultCallback() {

                final CastRemoteDisplayLocalService zzRp;

                public void onResult(Result result)
                {
                    zza((CastRemoteDisplay.CastRemoteDisplaySessionResult)result);
                }

                public void zza(CastRemoteDisplay.CastRemoteDisplaySessionResult castremotedisplaysessionresult)
                {
                    if (!castremotedisplaysessionresult.getStatus().isSuccess())
                    {
                        CastRemoteDisplayLocalService.zzln().zzc("Connection was not successful", new Object[0]);
                        CastRemoteDisplayLocalService.zzc(zzRp);
                    } else
                    {
                        castremotedisplaysessionresult = castremotedisplaysessionresult.getPresentationDisplay();
                        if (castremotedisplaysessionresult != null)
                        {
                            CastRemoteDisplayLocalService.zza(zzRp, castremotedisplaysessionresult);
                        } else
                        {
                            CastRemoteDisplayLocalService.zzln().zzc("Cast Remote Display session created without display", new Object[0]);
                        }
                        CastRemoteDisplayLocalService.zzlo().set(false);
                        if (CastRemoteDisplayLocalService.zzd(zzRp) != null && CastRemoteDisplayLocalService.zze(zzRp) != null)
                        {
                            CastRemoteDisplayLocalService.zzd(zzRp).unbindService(CastRemoteDisplayLocalService.zze(zzRp));
                            CastRemoteDisplayLocalService.zza(zzRp, null);
                            CastRemoteDisplayLocalService.zza(zzRp, null);
                            return;
                        }
                    }
                }

            
            {
                zzRp = CastRemoteDisplayLocalService.this;
                super();
            }
            });
            return;
        }
    }

    private void zzli()
    {
        zzQW.zzb("stopRemoteDisplay", new Object[0]);
        if (zzRa == null || !zzRa.isConnected())
        {
            zzQW.zzc("Unable to stop the remote display as the API client is not ready", new Object[0]);
            return;
        } else
        {
            CastRemoteDisplay.CastRemoteDisplayApi.stopRemoteDisplay(zzRa).setResultCallback(new ResultCallback() {

                final CastRemoteDisplayLocalService zzRp;

                public void onResult(Result result)
                {
                    zza((CastRemoteDisplay.CastRemoteDisplaySessionResult)result);
                }

                public void zza(CastRemoteDisplay.CastRemoteDisplaySessionResult castremotedisplaysessionresult)
                {
                    if (!castremotedisplaysessionresult.getStatus().isSuccess())
                    {
                        CastRemoteDisplayLocalService.zzln().zzb("Unable to stop the remote display, result unsuccessful", new Object[0]);
                    } else
                    {
                        CastRemoteDisplayLocalService.zzln().zzb("remote display stopped", new Object[0]);
                    }
                    CastRemoteDisplayLocalService.zzb(zzRp, null);
                }

            
            {
                zzRp = CastRemoteDisplayLocalService.this;
                super();
            }
            });
            return;
        }
    }

    private void zzlj()
    {
        if (zzRc != null)
        {
            zzRc.onRemoteDisplaySessionError(new Status(2200));
            zzRc = null;
        }
        stopService();
    }

    private void zzlk()
    {
        zzQW.zzb("stopRemoteDisplaySession", new Object[0]);
        zzli();
        onDismissPresentation();
    }

    private void zzll()
    {
        zzQW.zzb("Stopping the remote display Service", new Object[0]);
        stopForeground(true);
        stopSelf();
    }

    private PendingIntent zzlm()
    {
        if (zzRg == null)
        {
            zzRg = PendingIntent.getBroadcast(this, 0, new Intent("com.google.android.gms.cast.remote_display.ACTION_NOTIFICATION_DISCONNECT"), 0x10000000);
        }
        return zzRg;
    }

    static zzl zzln()
    {
        return zzQW;
    }

    static AtomicBoolean zzlo()
    {
        return zzQZ;
    }

    protected Display getDisplay()
    {
        return zzRi;
    }

    public IBinder onBind(Intent intent)
    {
        return zzRo;
    }

    public void onCreate()
    {
        super.onCreate();
        zzRb = new CastRemoteDisplay.CastRemoteDisplaySessionCallbacks() {

            final CastRemoteDisplayLocalService zzRp;

            public void onRemoteDisplayEnded(Status status)
            {
                CastRemoteDisplayLocalService.zzln().zzb(String.format("Cast screen has ended: %d", new Object[] {
                    Integer.valueOf(status.getStatusCode())
                }), new Object[0]);
                if (CastRemoteDisplayLocalService.zzb(zzRp) != null)
                {
                    CastRemoteDisplayLocalService.zzb(zzRp).post(new Runnable(this) {

                        final _cls3 zzRu;

                        public void run()
                        {
                            CastRemoteDisplayLocalService.zzO(false);
                        }

            
            {
                zzRu = _pcls3;
                super();
            }
                    });
                }
            }

            
            {
                zzRp = CastRemoteDisplayLocalService.this;
                super();
            }
        };
    }

    public abstract void onCreatePresentation(Display display);

    public abstract void onDismissPresentation();

    public int onStartCommand(Intent intent, int i, int j)
    {
        zzQW.zzb("onStartCommand", new Object[0]);
        return 2;
    }

    public void updateNotificationSettings(NotificationSettings notificationsettings)
    {
        zzu.zzb(notificationsettings, "notificationSettings is required.");
        if (zzRf.booleanValue())
        {
            if (NotificationSettings.zza(notificationsettings) != null)
            {
                throw new IllegalStateException("Current mode is default notification, notification attribute must not be provided");
            }
            if (NotificationSettings.zzd(notificationsettings) != null)
            {
                NotificationSettings.zza(zzRe, NotificationSettings.zzd(notificationsettings));
            }
            if (!TextUtils.isEmpty(NotificationSettings.zzb(notificationsettings)))
            {
                NotificationSettings.zza(zzRe, NotificationSettings.zzb(notificationsettings));
            }
            if (!TextUtils.isEmpty(NotificationSettings.zzc(notificationsettings)))
            {
                NotificationSettings.zzb(zzRe, NotificationSettings.zzc(notificationsettings));
            }
            mNotification = zzN(true);
        } else
        {
            zzu.zzb(NotificationSettings.zza(notificationsettings), "notification is required.");
            mNotification = NotificationSettings.zza(notificationsettings);
            NotificationSettings.zza(zzRe, mNotification);
        }
        startForeground(zzQX, mNotification);
    }

    static 
    {
        zzQX = com.google.android.gms.R.id.cast_notification_id;
    }
}
