// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.facebook.FacebookException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.facebook.internal:
//            Utility

public class AttributionIdentifiers
{
    private static final class GoogleAdInfo
        implements IInterface
    {

        private static final int FIRST_TRANSACTION_CODE = 1;
        private static final int SECOND_TRANSACTION_CODE = 2;
        private IBinder binder;

        public IBinder asBinder()
        {
            return binder;
        }

        public String getAdvertiserId()
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
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public boolean isTrackingLimited()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag;
            flag = true;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int i;
            parcel.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
            parcel.writeInt(1);
            binder.transact(2, parcel, parcel1, 0);
            parcel1.readException();
            i = parcel1.readInt();
            if (i == 0)
            {
                flag = false;
            }
            parcel1.recycle();
            parcel.recycle();
            return flag;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        GoogleAdInfo(IBinder ibinder)
        {
            binder = ibinder;
        }
    }

    private static final class GoogleAdServiceConnection
        implements ServiceConnection
    {

        private AtomicBoolean consumed;
        private final BlockingQueue queue;

        public IBinder getBinder()
            throws InterruptedException
        {
            if (consumed.compareAndSet(true, true))
            {
                throw new IllegalStateException("Binder already consumed");
            } else
            {
                return (IBinder)queue.take();
            }
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
        }

        private GoogleAdServiceConnection()
        {
            consumed = new AtomicBoolean(false);
            queue = new LinkedBlockingDeque();
        }

        GoogleAdServiceConnection(GoogleAdServiceConnection googleadserviceconnection)
        {
            this();
        }
    }


    private static final String ANDROID_ID_COLUMN_NAME = "androidid";
    private static final String ATTRIBUTION_ID_COLUMN_NAME = "aid";
    private static final String ATTRIBUTION_ID_CONTENT_PROVIDER = "com.facebook.katana.provider.AttributionIdProvider";
    private static final String ATTRIBUTION_ID_CONTENT_PROVIDER_WAKIZASHI = "com.facebook.wakizashi.provider.AttributionIdProvider";
    private static final int CONNECTION_RESULT_SUCCESS = 0;
    private static final long IDENTIFIER_REFRESH_INTERVAL_MILLIS = 0x36ee80L;
    private static final String LIMIT_TRACKING_COLUMN_NAME = "limit_tracking";
    private static final String TAG = com/facebook/internal/AttributionIdentifiers.getCanonicalName();
    private static AttributionIdentifiers recentlyFetchedIdentifiers;
    private String androidAdvertiserId;
    private String androidInstallerPackage;
    private String attributionId;
    private long fetchTime;
    private boolean limitTracking;

    public AttributionIdentifiers()
    {
    }

    private static AttributionIdentifiers cacheAndReturnIdentifiers(AttributionIdentifiers attributionidentifiers)
    {
        attributionidentifiers.fetchTime = System.currentTimeMillis();
        recentlyFetchedIdentifiers = attributionidentifiers;
        return attributionidentifiers;
    }

    private static AttributionIdentifiers getAndroidId(Context context)
    {
        AttributionIdentifiers attributionidentifiers = getAndroidIdViaReflection(context);
        Object obj = attributionidentifiers;
        if (attributionidentifiers == null)
        {
            context = getAndroidIdViaService(context);
            obj = context;
            if (context == null)
            {
                obj = new AttributionIdentifiers();
            }
        }
        return ((AttributionIdentifiers) (obj));
    }

    private static AttributionIdentifiers getAndroidIdViaReflection(Context context)
    {
        if (Looper.myLooper() == Looper.getMainLooper())
        {
            throw new FacebookException("getAndroidId cannot be called on the main thread.");
        }
          goto _L1
        context;
        Utility.logd("android_id", context);
_L3:
        return null;
_L1:
        Object obj = Utility.getMethodQuietly("com.google.android.gms.common.GooglePlayServicesUtil", "isGooglePlayServicesAvailable", new Class[] {
            android/content/Context
        });
        if (obj == null) goto _L3; else goto _L2
_L2:
        obj = Utility.invokeMethodQuietly(null, ((java.lang.reflect.Method) (obj)), new Object[] {
            context
        });
        if (!(obj instanceof Integer) || ((Integer)obj).intValue() != 0) goto _L3; else goto _L4
_L4:
        obj = Utility.getMethodQuietly("com.google.android.gms.ads.identifier.AdvertisingIdClient", "getAdvertisingIdInfo", new Class[] {
            android/content/Context
        });
        if (obj == null) goto _L3; else goto _L5
_L5:
        context = ((Context) (Utility.invokeMethodQuietly(null, ((java.lang.reflect.Method) (obj)), new Object[] {
            context
        })));
        if (context == null) goto _L3; else goto _L6
_L6:
        java.lang.reflect.Method method;
        obj = Utility.getMethodQuietly(context.getClass(), "getId", new Class[0]);
        method = Utility.getMethodQuietly(context.getClass(), "isLimitAdTrackingEnabled", new Class[0]);
        if (obj == null || method == null) goto _L3; else goto _L7
_L7:
        AttributionIdentifiers attributionidentifiers = new AttributionIdentifiers();
        attributionidentifiers.androidAdvertiserId = (String)Utility.invokeMethodQuietly(context, ((java.lang.reflect.Method) (obj)), new Object[0]);
        attributionidentifiers.limitTracking = ((Boolean)Utility.invokeMethodQuietly(context, method, new Object[0])).booleanValue();
        return null;
    }

    private static AttributionIdentifiers getAndroidIdViaService(Context context)
    {
        GoogleAdServiceConnection googleadserviceconnection;
        googleadserviceconnection = new GoogleAdServiceConnection(null);
        Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
        intent.setPackage("com.google.android.gms");
        if (!context.bindService(intent, googleadserviceconnection, 1))
        {
            break MISSING_BLOCK_LABEL_91;
        }
        AttributionIdentifiers attributionidentifiers;
        GoogleAdInfo googleadinfo = new GoogleAdInfo(googleadserviceconnection.getBinder());
        attributionidentifiers = new AttributionIdentifiers();
        attributionidentifiers.androidAdvertiserId = googleadinfo.getAdvertiserId();
        attributionidentifiers.limitTracking = googleadinfo.isTrackingLimited();
        context.unbindService(googleadserviceconnection);
        return attributionidentifiers;
        Object obj;
        obj;
        Utility.logd("android_id", ((Exception) (obj)));
        context.unbindService(googleadserviceconnection);
        return null;
        obj;
        context.unbindService(googleadserviceconnection);
        throw obj;
    }

    public static AttributionIdentifiers getAttributionIdentifiers(Context context)
    {
        if (recentlyFetchedIdentifiers == null || System.currentTimeMillis() - recentlyFetchedIdentifiers.fetchTime >= 0x36ee80L) goto _L2; else goto _L1
_L1:
        context = recentlyFetchedIdentifiers;
_L8:
        return context;
_L2:
        Object obj;
        Cursor cursor;
        Object obj1;
        Object obj2;
        Object obj3;
        AttributionIdentifiers attributionidentifiers;
        attributionidentifiers = getAndroidId(context);
        obj2 = null;
        obj3 = null;
        obj1 = null;
        cursor = obj3;
        obj = obj2;
        if (context.getPackageManager().resolveContentProvider("com.facebook.katana.provider.AttributionIdProvider", 0) == null) goto _L4; else goto _L3
_L3:
        cursor = obj3;
        obj = obj2;
        obj1 = Uri.parse("content://com.facebook.katana.provider.AttributionIdProvider");
_L6:
        cursor = obj3;
        obj = obj2;
        String s = getInstallerPackageName(context);
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_104;
        }
        cursor = obj3;
        obj = obj2;
        attributionidentifiers.androidInstallerPackage = s;
        if (obj1 != null)
        {
            break; /* Loop/switch isn't completed */
        }
        cursor = obj3;
        obj = obj2;
        context = cacheAndReturnIdentifiers(attributionidentifiers);
        if (false)
        {
            throw new NullPointerException();
        }
        continue; /* Loop/switch isn't completed */
_L4:
        cursor = obj3;
        obj = obj2;
        if (context.getPackageManager().resolveContentProvider("com.facebook.wakizashi.provider.AttributionIdProvider", 0) == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        cursor = obj3;
        obj = obj2;
        obj1 = Uri.parse("content://com.facebook.wakizashi.provider.AttributionIdProvider");
        if (true) goto _L6; else goto _L5
_L5:
        cursor = obj3;
        obj = obj2;
        obj1 = context.getContentResolver().query(((Uri) (obj1)), new String[] {
            "aid", "androidid", "limit_tracking"
        }, null, null, null);
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_220;
        }
        cursor = ((Cursor) (obj1));
        obj = obj1;
        if (((Cursor) (obj1)).moveToFirst())
        {
            break; /* Loop/switch isn't completed */
        }
        cursor = ((Cursor) (obj1));
        obj = obj1;
        context = cacheAndReturnIdentifiers(attributionidentifiers);
        obj = context;
        context = ((Context) (obj));
        if (obj1 != null)
        {
            ((Cursor) (obj1)).close();
            return ((AttributionIdentifiers) (obj));
        }
        if (true) goto _L8; else goto _L7
_L7:
        cursor = ((Cursor) (obj1));
        obj = obj1;
        int k = ((Cursor) (obj1)).getColumnIndex("aid");
        cursor = ((Cursor) (obj1));
        obj = obj1;
        int i = ((Cursor) (obj1)).getColumnIndex("androidid");
        cursor = ((Cursor) (obj1));
        obj = obj1;
        int j = ((Cursor) (obj1)).getColumnIndex("limit_tracking");
        cursor = ((Cursor) (obj1));
        obj = obj1;
        attributionidentifiers.attributionId = ((Cursor) (obj1)).getString(k);
        if (i <= 0 || j <= 0)
        {
            break MISSING_BLOCK_LABEL_364;
        }
        cursor = ((Cursor) (obj1));
        obj = obj1;
        if (attributionidentifiers.getAndroidAdvertiserId() != null)
        {
            break MISSING_BLOCK_LABEL_364;
        }
        cursor = ((Cursor) (obj1));
        obj = obj1;
        attributionidentifiers.androidAdvertiserId = ((Cursor) (obj1)).getString(i);
        cursor = ((Cursor) (obj1));
        obj = obj1;
        attributionidentifiers.limitTracking = Boolean.parseBoolean(((Cursor) (obj1)).getString(j));
        if (obj1 != null)
        {
            ((Cursor) (obj1)).close();
        }
        return cacheAndReturnIdentifiers(attributionidentifiers);
        context;
        obj = cursor;
        Log.d(TAG, (new StringBuilder("Caught unexpected exception in getAttributionId(): ")).append(context.toString()).toString());
        if (cursor != null)
        {
            cursor.close();
        }
        return null;
        context;
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        throw context;
    }

    private static String getInstallerPackageName(Context context)
    {
        PackageManager packagemanager = context.getPackageManager();
        if (packagemanager != null)
        {
            return packagemanager.getInstallerPackageName(context.getPackageName());
        } else
        {
            return null;
        }
    }

    public String getAndroidAdvertiserId()
    {
        return androidAdvertiserId;
    }

    public String getAndroidInstallerPackage()
    {
        return androidInstallerPackage;
    }

    public String getAttributionId()
    {
        return attributionId;
    }

    public boolean isTrackingLimited()
    {
        return limitTracking;
    }

}
