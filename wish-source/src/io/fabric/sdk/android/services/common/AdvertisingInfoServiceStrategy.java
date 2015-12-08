// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.common;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Logger;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

// Referenced classes of package io.fabric.sdk.android.services.common:
//            AdvertisingInfoStrategy, AdvertisingInfo

class AdvertisingInfoServiceStrategy
    implements AdvertisingInfoStrategy
{
    private static final class AdvertisingConnection
        implements ServiceConnection
    {

        private static final int QUEUE_TIMEOUT_IN_MS = 200;
        private final LinkedBlockingQueue queue;
        private boolean retrieved;

        public IBinder getBinder()
        {
            if (retrieved)
            {
                Fabric.getLogger().e("Fabric", "getBinder already called");
            }
            retrieved = true;
            IBinder ibinder;
            try
            {
                ibinder = (IBinder)queue.poll(200L, TimeUnit.MILLISECONDS);
            }
            catch (InterruptedException interruptedexception)
            {
                return null;
            }
            return ibinder;
        }

        public void onServiceConnected(ComponentName componentname, IBinder ibinder)
        {
            try
            {
                queue.put(ibinder);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (ComponentName componentname)
            {
                return;
            }
        }

        public void onServiceDisconnected(ComponentName componentname)
        {
            queue.clear();
        }

        private AdvertisingConnection()
        {
            retrieved = false;
            queue = new LinkedBlockingQueue(1);
        }

    }

    private static final class AdvertisingInterface
        implements IInterface
    {

        public static final String ADVERTISING_ID_SERVICE_INTERFACE_TOKEN = "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService";
        private static final int AD_TRANSACTION_CODE_ID = 1;
        private static final int AD_TRANSACTION_CODE_LIMIT_AD_TRACKING = 2;
        private static final int FLAGS_NONE = 0;
        private final IBinder binder;

        public IBinder asBinder()
        {
            return binder;
        }

        public String getId()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            String s;
            parcel.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
            binder.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            s = parcel1.readString();
            parcel1.recycle();
            parcel.recycle();
            return s;
            Object obj;
            obj;
            Fabric.getLogger().d("Fabric", "Could not get parcel from Google Play Service to capture AdvertisingId");
            parcel1.recycle();
            parcel.recycle();
            return null;
            obj;
            parcel1.recycle();
            parcel.recycle();
            throw obj;
        }

        public boolean isLimitAdTrackingEnabled()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int i;
            parcel.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
            parcel.writeInt(1);
            binder.transact(2, parcel, parcel1, 0);
            parcel1.readException();
            i = parcel1.readInt();
            boolean flag;
            if (i != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            parcel1.recycle();
            parcel.recycle();
            return flag;
            Object obj;
            obj;
            Fabric.getLogger().d("Fabric", "Could not get parcel from Google Play Service to capture Advertising limitAdTracking");
            parcel1.recycle();
            parcel.recycle();
            return false;
            obj;
            parcel1.recycle();
            parcel.recycle();
            throw obj;
        }

        public AdvertisingInterface(IBinder ibinder)
        {
            binder = ibinder;
        }
    }


    public static final String GOOGLE_PLAY_SERVICES_INTENT = "com.google.android.gms.ads.identifier.service.START";
    public static final String GOOGLE_PLAY_SERVICES_INTENT_PACKAGE_NAME = "com.google.android.gms";
    private static final String GOOGLE_PLAY_SERVICE_PACKAGE_NAME = "com.android.vending";
    private final Context context;

    public AdvertisingInfoServiceStrategy(Context context1)
    {
        context = context1.getApplicationContext();
    }

    public AdvertisingInfo getAdvertisingInfo()
    {
        Object obj;
        if (Looper.myLooper() == Looper.getMainLooper())
        {
            Fabric.getLogger().d("Fabric", "AdvertisingInfoServiceStrategy cannot be called on the main thread");
            return null;
        }
        Object obj1;
        boolean flag;
        try
        {
            context.getPackageManager().getPackageInfo("com.android.vending", 0);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Fabric.getLogger().d("Fabric", "Unable to find Google Play Services package name");
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Fabric.getLogger().d("Fabric", "Unable to determine if Google Play Services is available", ((Throwable) (obj)));
            return null;
        }
        obj = new AdvertisingConnection();
        obj1 = new Intent("com.google.android.gms.ads.identifier.service.START");
        ((Intent) (obj1)).setPackage("com.google.android.gms");
        Exception exception;
        try
        {
            flag = context.bindService(((Intent) (obj1)), ((ServiceConnection) (obj)), 1);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Fabric.getLogger().d("Fabric", "Could not bind to Google Play Service to capture AdvertisingId", ((Throwable) (obj)));
            return null;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_198;
        }
        obj1 = new AdvertisingInterface(((AdvertisingConnection) (obj)).getBinder());
        obj1 = new AdvertisingInfo(((AdvertisingInterface) (obj1)).getId(), ((AdvertisingInterface) (obj1)).isLimitAdTrackingEnabled());
        context.unbindService(((ServiceConnection) (obj)));
        return ((AdvertisingInfo) (obj1));
        exception;
        Fabric.getLogger().w("Fabric", "Exception in binding to Google Play Service to capture AdvertisingId", exception);
        context.unbindService(((ServiceConnection) (obj)));
        return null;
        Exception exception1;
        exception1;
        context.unbindService(((ServiceConnection) (obj)));
        throw exception1;
        Fabric.getLogger().d("Fabric", "Could not bind to Google Play Service to capture AdvertisingId");
        return null;
    }
}
