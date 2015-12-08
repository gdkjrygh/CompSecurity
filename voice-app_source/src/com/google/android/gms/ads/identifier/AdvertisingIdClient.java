// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.identifier;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.common.stats.zzb;
import com.google.android.gms.common.zza;
import com.google.android.gms.internal.zzav;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class AdvertisingIdClient
{
    public static final class Info
    {

        private final String zzoh;
        private final boolean zzoi;

        public String getId()
        {
            return zzoh;
        }

        public boolean isLimitAdTrackingEnabled()
        {
            return zzoi;
        }

        public String toString()
        {
            return (new StringBuilder()).append("{").append(zzoh).append("}").append(zzoi).toString();
        }

        public Info(String s, boolean flag)
        {
            zzoh = s;
            zzoi = flag;
        }
    }

    static class zza extends Thread
    {

        private WeakReference zzod;
        private long zzoe;
        CountDownLatch zzof;
        boolean zzog;

        private void disconnect()
        {
            AdvertisingIdClient advertisingidclient = (AdvertisingIdClient)zzod.get();
            if (advertisingidclient != null)
            {
                advertisingidclient.finish();
                zzog = true;
            }
        }

        public void cancel()
        {
            zzof.countDown();
        }

        public void run()
        {
            try
            {
                if (!zzof.await(zzoe, TimeUnit.MILLISECONDS))
                {
                    disconnect();
                }
                return;
            }
            catch (InterruptedException interruptedexception)
            {
                disconnect();
            }
        }

        public boolean zzaK()
        {
            return zzog;
        }

        public zza(AdvertisingIdClient advertisingidclient, long l)
        {
            zzod = new WeakReference(advertisingidclient);
            zzoe = l;
            zzof = new CountDownLatch(1);
            zzog = false;
            start();
        }
    }


    private final Context mContext;
    com.google.android.gms.common.zza zznX;
    zzav zznY;
    boolean zznZ;
    Object zzoa;
    zza zzob;
    final long zzoc;

    public AdvertisingIdClient(Context context)
    {
        this(context, 30000L);
    }

    public AdvertisingIdClient(Context context, long l)
    {
        zzoa = new Object();
        zzu.zzu(context);
        mContext = context;
        zznZ = false;
        zzoc = l;
    }

    public static Info getAdvertisingIdInfo(Context context)
        throws IOException, IllegalStateException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException
    {
        context = new AdvertisingIdClient(context, -1L);
        Info info;
        context.zzb(false);
        info = context.getInfo();
        context.finish();
        return info;
        Exception exception;
        exception;
        context.finish();
        throw exception;
    }

    static zzav zza(Context context, com.google.android.gms.common.zza zza1)
        throws IOException
    {
        try
        {
            context = com.google.android.gms.internal.zzav.zza.zzb(zza1.zzmh());
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new IOException("Interrupted exception");
        }
        return context;
    }

    private void zzaJ()
    {
        Object obj = zzoa;
        obj;
        JVM INSTR monitorenter ;
        if (zzob == null)
        {
            break MISSING_BLOCK_LABEL_28;
        }
        zzob.cancel();
        Exception exception;
        try
        {
            zzob.join();
        }
        catch (InterruptedException interruptedexception) { }
        if (zzoc > 0L)
        {
            zzob = new zza(this, zzoc);
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    static com.google.android.gms.common.zza zzo(Context context)
        throws IOException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException
    {
        com.google.android.gms.common.zza zza1;
        Intent intent;
        try
        {
            context.getPackageManager().getPackageInfo("com.android.vending", 0);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new GooglePlayServicesNotAvailableException(9);
        }
        try
        {
            GooglePlayServicesUtil.zzY(context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new IOException(context);
        }
        zza1 = new com.google.android.gms.common.zza();
        intent = new Intent("com.google.android.gms.ads.identifier.service.START");
        intent.setPackage("com.google.android.gms");
        if (com.google.android.gms.common.stats.zzb.zzoO().zza(context, intent, zza1, 1))
        {
            return zza1;
        } else
        {
            throw new IOException("Connection failure");
        }
    }

    protected void finalize()
        throws Throwable
    {
        finish();
        super.finalize();
    }

    public void finish()
    {
        zzu.zzbZ("Calling this from your main thread can lead to deadlock");
        this;
        JVM INSTR monitorenter ;
        if (mContext != null && zznX != null)
        {
            break MISSING_BLOCK_LABEL_24;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        if (zznZ)
        {
            com.google.android.gms.common.stats.zzb.zzoO().zza(mContext, zznX);
        }
_L1:
        zznZ = false;
        zznY = null;
        zznX = null;
        this;
        JVM INSTR monitorexit ;
        return;
        Object obj;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        obj;
        Log.i("AdvertisingIdClient", "AdvertisingIdClient unbindService failed.", ((Throwable) (obj)));
          goto _L1
    }

    public Info getInfo()
        throws IOException
    {
        zzu.zzbZ("Calling this from your main thread can lead to deadlock");
        this;
        JVM INSTR monitorenter ;
        if (zznZ)
        {
            break MISSING_BLOCK_LABEL_94;
        }
        Object obj = zzoa;
        obj;
        JVM INSTR monitorenter ;
        if (zzob == null || !zzob.zzaK())
        {
            throw new IOException("AdvertisingIdClient is not connected.");
        }
        break MISSING_BLOCK_LABEL_58;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        obj;
        JVM INSTR monitorexit ;
        zzb(false);
        if (!zznZ)
        {
            throw new IOException("AdvertisingIdClient cannot reconnect.");
        }
        break MISSING_BLOCK_LABEL_94;
        Object obj1;
        obj1;
        throw new IOException("AdvertisingIdClient cannot reconnect.", ((Throwable) (obj1)));
        zzu.zzu(zznX);
        zzu.zzu(zznY);
        obj1 = new Info(zznY.getId(), zznY.zzc(true));
        this;
        JVM INSTR monitorexit ;
        zzaJ();
        return ((Info) (obj1));
        obj1;
        Log.i("AdvertisingIdClient", "GMS remote exception ", ((Throwable) (obj1)));
        throw new IOException("Remote exception");
    }

    public void start()
        throws IOException, IllegalStateException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException
    {
        zzb(true);
    }

    protected void zzb(boolean flag)
        throws IOException, IllegalStateException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException
    {
        zzu.zzbZ("Calling this from your main thread can lead to deadlock");
        this;
        JVM INSTR monitorenter ;
        if (zznZ)
        {
            finish();
        }
        zznX = zzo(mContext);
        zznY = zza(mContext, zznX);
        zznZ = true;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        zzaJ();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
