// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.wmservice.fastpickup;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.squareup.otto.Bus;
import com.walmart.android.app.fastpickup.FastPickupUtil;
import com.walmart.android.data.FastPickupOrder;
import com.walmart.android.events.FastPickupOrderReadyEvent;
import com.walmart.android.service.MessageBus;
import com.walmart.android.util.SharedPreferencesUtil;
import com.walmartlabs.utils.WLog;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.walmart.android.wmservice.fastpickup:
//            FastPickupNotificationReceiver

public class FastPickupLocalNotification
{

    private static final String NOTIFICATION_ID = "fastpickup";
    private static final String TAG = com/walmart/android/wmservice/fastpickup/FastPickupLocalNotification.getSimpleName();
    private final Context mContext;
    private FastPickupOrderReadyEvent mFastPickupEvent;
    private String mLatestStoreId;

    private FastPickupLocalNotification(Context context)
    {
        mLatestStoreId = null;
        mContext = context;
    }

    public static FastPickupLocalNotification create(Context context)
    {
        context = new FastPickupLocalNotification(context);
        MessageBus.getBus().register(context);
        return context;
    }

    private PendingIntent getNotificationIntent()
    {
        int i = FastPickupUtil.getCurrentRequestCode(mContext);
        Intent intent = new Intent(mContext, com/walmart/android/wmservice/fastpickup/FastPickupNotificationReceiver);
        WLog.d(TAG, (new StringBuilder()).append("getNotificationIntent requestCode:").append(i).toString());
        return PendingIntent.getBroadcast(mContext, i, intent, 0x20000000);
    }

    private boolean isNotificationShown()
    {
        PendingIntent pendingintent = getNotificationIntent();
        String s = TAG;
        StringBuilder stringbuilder = (new StringBuilder()).append("isNotificationShown() :");
        boolean flag;
        if (pendingintent != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        WLog.d(s, stringbuilder.append(flag).toString());
        return pendingintent != null;
    }

    private boolean orderExists(FastPickupOrderReadyEvent fastpickuporderreadyevent)
    {
        WLog.d(TAG, (new StringBuilder()).append("orderExist: ").append(fastpickuporderreadyevent.storeId).append(", ").append(fastpickuporderreadyevent.getCount()).toString());
        return !TextUtils.isEmpty(fastpickuporderreadyevent.storeId) && fastpickuporderreadyevent.getCount() > 0;
    }

    private boolean shouldShowNotification()
    {
        String s = mFastPickupEvent.orders.getHash(mFastPickupEvent.storeId);
        String s1 = SharedPreferencesUtil.getFastPickupNotificationStatus(mContext, mFastPickupEvent.storeId);
        String s2 = TAG;
        StringBuilder stringbuilder = (new StringBuilder()).append("shouldShowNotification() ");
        boolean flag;
        if (s != null && (s1 == null || !s.equals(s1)))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        WLog.d(s2, stringbuilder.append(flag).toString());
        return s != null && (s1 == null || !s.equals(s1));
    }

    private void showNotification(String s)
    {
        int i = FastPickupUtil.getNextRequestCode(mContext);
        Object obj1 = Collections.emptySet();
        Object obj = obj1;
        if (mFastPickupEvent != null)
        {
            obj = obj1;
            if (mFastPickupEvent.orders != null)
            {
                obj = mFastPickupEvent.orders.getOrderIds(s);
            }
        }
        obj1 = FastPickupUtil.createNotification(mContext, s, mContext.getString(0x7f090111), mContext.getString(0x7f090110), "USWMSM842", i, (String[])((Set) (obj)).toArray(new String[((Set) (obj)).size()]));
        WLog.d(TAG, (new StringBuilder()).append("showNotification requestCode:").append(i).toString());
        ((NotificationManager)mContext.getSystemService("notification")).notify("fastpickup", i, ((android.app.Notification) (obj1)));
        obj1 = mFastPickupEvent.orders.getHash(mFastPickupEvent.storeId);
        if (!TextUtils.isEmpty(((CharSequence) (obj1))))
        {
            WLog.d(TAG, (new StringBuilder()).append("Notification set: ").append(((String) (obj1))).toString());
            SharedPreferencesUtil.setFastPickupNotificationStatus(mContext, mFastPickupEvent.storeId, ((String) (obj1)));
        }
        mLatestStoreId = mFastPickupEvent.storeId;
        if (obj != null)
        {
            Object obj2;
            for (obj = ((Set) (obj)).iterator(); ((Iterator) (obj)).hasNext(); MessageBus.getBus().post(obj2))
            {
                obj2 = (String)((Iterator) (obj)).next();
                obj2 = (new com.walmartlabs.anivia.AniviaEventAsJson.Builder("notificationSent")).putString("storeId", s).putString("orderId", ((String) (obj2)));
            }

        }
    }

    private void updateStatus()
    {
        if (mFastPickupEvent != null) goto _L2; else goto _L1
_L1:
        WLog.d(TAG, "updateStatus() fast pickup event is null");
        if (isNotificationShown())
        {
            removeNotification();
        }
_L4:
        return;
_L2:
        if (mFastPickupEvent.isLocationEnabled())
        {
            break; /* Loop/switch isn't completed */
        }
        WLog.d(TAG, "updateStatus() location is turned off");
        if (isNotificationShown())
        {
            removeNotification();
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (mFastPickupEvent.isLoggedIn())
        {
            break; /* Loop/switch isn't completed */
        }
        WLog.d(TAG, "updateStatus() user is not logged in");
        if (isNotificationShown())
        {
            removeNotification();
            return;
        }
        if (true) goto _L4; else goto _L5
_L5:
        if (!mFastPickupEvent.isInStore())
        {
            WLog.d(TAG, "updateStatus() not in-store");
            if (isNotificationShown())
            {
                removeNotification();
            }
            if (mLatestStoreId != null)
            {
                SharedPreferencesUtil.clearFastPickupNotificationStatus(mContext, mLatestStoreId);
            }
            mLatestStoreId = null;
            return;
        }
        mLatestStoreId = mFastPickupEvent.storeId;
        if (mFastPickupEvent.isCheckedIn(mFastPickupEvent.storeId))
        {
            WLog.d(TAG, (new StringBuilder()).append("updateStatus() customer state:").append(mFastPickupEvent.isCheckedIn(mFastPickupEvent.storeId)).toString());
            if (isNotificationShown())
            {
                removeNotification();
            }
            SharedPreferencesUtil.clearFastPickupNotificationStatus(mContext, mFastPickupEvent.storeId);
            return;
        }
        if (orderExists(mFastPickupEvent) && !isNotificationShown() && shouldShowNotification() && mLatestStoreId != null && !mLatestStoreId.isEmpty())
        {
            showNotification(mLatestStoreId);
            return;
        }
        if (true) goto _L4; else goto _L6
_L6:
    }

    public void destroy()
    {
        MessageBus.getBus().unregister(this);
    }

    public void onFastPickupReady(FastPickupOrderReadyEvent fastpickuporderreadyevent)
    {
        WLog.d(TAG, "onFastPickupOrderReady() ");
        mFastPickupEvent = fastpickuporderreadyevent;
        updateStatus();
    }

    public void removeNotification()
    {
        PendingIntent pendingintent = getNotificationIntent();
        String s = TAG;
        StringBuilder stringbuilder = (new StringBuilder()).append("removeNotification() :");
        boolean flag;
        if (pendingintent != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        WLog.d(s, stringbuilder.append(flag).toString());
        if (pendingintent != null)
        {
            pendingintent.cancel();
            ((NotificationManager)mContext.getSystemService("notification")).cancel("fastpickup", FastPickupUtil.getCurrentRequestCode(mContext));
        }
    }

}
