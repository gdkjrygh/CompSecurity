// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Looper;
import android.util.Log;
import com.facebook.FacebookException;

// Referenced classes of package com.facebook.internal:
//            Utility

public class AttributionIdentifiers
{

    private static final String ANDROID_ID_COLUMN_NAME = "androidid";
    private static final String ATTRIBUTION_ID_COLUMN_NAME = "aid";
    private static final Uri ATTRIBUTION_ID_CONTENT_URI = Uri.parse("content://com.facebook.katana.provider.AttributionIdProvider");
    private static final int CONNECTION_RESULT_SUCCESS = 0;
    private static final long IDENTIFIER_REFRESH_INTERVAL_MILLIS = 0x36ee80L;
    private static final String LIMIT_TRACKING_COLUMN_NAME = "limit_tracking";
    private static final String TAG = com/facebook/internal/AttributionIdentifiers.getCanonicalName();
    private static AttributionIdentifiers recentlyFetchedIdentifiers;
    private String androidAdvertiserId;
    private String attributionId;
    private long fetchTime;
    private boolean limitTracking;

    public AttributionIdentifiers()
    {
    }

    private static AttributionIdentifiers getAndroidId(Context context)
    {
        AttributionIdentifiers attributionidentifiers = new AttributionIdentifiers();
        if (Looper.myLooper() == Looper.getMainLooper())
        {
            throw new FacebookException("getAndroidId cannot be called on the main thread.");
        }
          goto _L1
        context;
        Utility.logd("android_id", context);
_L3:
        return attributionidentifiers;
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
        attributionidentifiers.androidAdvertiserId = (String)Utility.invokeMethodQuietly(context, ((java.lang.reflect.Method) (obj)), new Object[0]);
        attributionidentifiers.limitTracking = ((Boolean)Utility.invokeMethodQuietly(context, method, new Object[0])).booleanValue();
        return attributionidentifiers;
    }

    public static AttributionIdentifiers getAttributionIdentifiers(Context context)
    {
        if (recentlyFetchedIdentifiers == null || System.currentTimeMillis() - recentlyFetchedIdentifiers.fetchTime >= 0x36ee80L) goto _L2; else goto _L1
_L1:
        Object obj = recentlyFetchedIdentifiers;
_L4:
        return ((AttributionIdentifiers) (obj));
_L2:
        Object obj1;
        AttributionIdentifiers attributionidentifiers;
        attributionidentifiers = getAndroidId(context);
        obj1 = null;
        obj = null;
        context = context.getContentResolver().query(ATTRIBUTION_ID_CONTENT_URI, new String[] {
            "aid", "androidid", "limit_tracking"
        }, null, null, null);
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_92;
        }
        obj = context;
        obj1 = context;
        boolean flag = context.moveToFirst();
        if (flag)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = attributionidentifiers;
        if (context != null)
        {
            context.close();
            return attributionidentifiers;
        }
        if (true) goto _L4; else goto _L3
_L3:
        obj = context;
        obj1 = context;
        int i = context.getColumnIndex("aid");
        obj = context;
        obj1 = context;
        int j = context.getColumnIndex("androidid");
        obj = context;
        obj1 = context;
        int k = context.getColumnIndex("limit_tracking");
        obj = context;
        obj1 = context;
        attributionidentifiers.attributionId = context.getString(i);
        if (j <= 0 || k <= 0)
        {
            break MISSING_BLOCK_LABEL_220;
        }
        obj = context;
        obj1 = context;
        if (attributionidentifiers.getAndroidAdvertiserId() != null)
        {
            break MISSING_BLOCK_LABEL_220;
        }
        obj = context;
        obj1 = context;
        attributionidentifiers.androidAdvertiserId = context.getString(j);
        obj = context;
        obj1 = context;
        attributionidentifiers.limitTracking = Boolean.parseBoolean(context.getString(k));
        if (context != null)
        {
            context.close();
        }
        attributionidentifiers.fetchTime = System.currentTimeMillis();
        recentlyFetchedIdentifiers = attributionidentifiers;
        return attributionidentifiers;
        context;
        obj1 = obj;
        Log.d(TAG, (new StringBuilder()).append("Caught unexpected exception in getAttributionId(): ").append(context.toString()).toString());
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        return null;
        context;
        if (obj1 != null)
        {
            ((Cursor) (obj1)).close();
        }
        throw context;
    }

    public String getAndroidAdvertiserId()
    {
        return androidAdvertiserId;
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
