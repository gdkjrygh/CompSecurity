// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.wmservice.fastpickup;

import android.app.AlarmManager;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.PowerManager;
import android.os.SystemClock;
import android.text.TextUtils;
import com.walmart.android.app.fastpickup.FastPickupUtil;
import com.walmart.android.data.FastPickupOrder;
import com.walmart.android.service.AsyncCallbackOnThread;
import com.walmart.android.util.SharedPreferencesUtil;
import com.walmart.android.wmservice.Authentication;
import com.walmart.android.wmservice.Services;
import com.walmart.android.wmservice.WalmartNetService;
import com.walmartlabs.auth.AuthenticationStatusEvent;
import com.walmartlabs.utils.WLog;
import java.util.ArrayList;
import java.util.Set;

// Referenced classes of package com.walmart.android.wmservice.fastpickup:
//            FastPickupManager

public class FastPickupService extends Service
{
    public static class AlarmReceiver extends BroadcastReceiver
    {

        public void onReceive(Context context, Intent intent)
        {
            WLog.d(FastPickupService.TAG, "AlarmReceiver.onReceive()");
            FastPickupService.refresh(context, false);
        }

        public AlarmReceiver()
        {
        }
    }

    class Callback extends AsyncCallbackOnThread
    {

        private final int mStartId;
        final FastPickupService this$0;

        public void onCancelledSameThread()
        {
            reschedule();
            stopService(mStartId);
        }

        public void onFailureSameThread(Integer integer, FastPickupOrder fastpickuporder)
        {
            WLog.d(FastPickupService.TAG, (new StringBuilder()).append("Callback.onFailureSameThread() error=").append(integer).append(", data:").append(fastpickuporder).toString());
            Services.get().getFastPickupManager().updateServerState(fastpickuporder, integer.intValue());
            reschedule();
            stopService(mStartId);
        }

        public volatile void onFailureSameThread(Object obj, Object obj1)
        {
            onFailureSameThread((Integer)obj, (FastPickupOrder)obj1);
        }

        public void onSuccessSameThread(FastPickupOrder fastpickuporder)
        {
            WLog.d(FastPickupService.TAG, "Callback.onSuccessSameThread()");
            Services.get().getFastPickupManager().updateServerState(fastpickuporder, 0);
            reschedule();
            stopService(mStartId);
        }

        public volatile void onSuccessSameThread(Object obj)
        {
            onSuccessSameThread((FastPickupOrder)obj);
        }

        public Callback(int i)
        {
            this$0 = FastPickupService.this;
            super(mHandler);
            mStartId = i;
        }
    }

    private class PushNotification extends Callback
    {

        public static final String EXTRAS_STORE_ID = "STORE_ID";
        public static final String EXTRAS_TEXT = "TEXT";
        public static final String EXTRAS_TITLE = "TITLE";
        public static final String EXTRAS_TYPE = "ANIVIA";
        private final String mAniviaType;
        private final String mStoreId;
        private final String mText;
        private final String mTitle;
        final FastPickupService this$0;

        public void onSuccessSameThread(FastPickupOrder fastpickuporder)
        {
            WLog.d(FastPickupService.TAG, "PushNotification.onSuccessSameThread()");
            if (SharedPreferencesUtil.isStoreFeatureNotificationsEnabled(FastPickupService.this) && fastpickuporder != null && fastpickuporder.getCount(mStoreId) > 0)
            {
                int i = FastPickupUtil.getNextPushRequestCode(FastPickupService.this);
                Object obj = fastpickuporder.getOrderIds(mStoreId);
                obj = FastPickupUtil.createNotification(FastPickupService.this, mStoreId, mTitle, mText, mAniviaType, i, (String[])((Set) (obj)).toArray(new String[((Set) (obj)).size()]));
                ((NotificationManager)getSystemService("notification")).notify("FastPickupPushNotification", i, ((android.app.Notification) (obj)));
            }
            super.onSuccessSameThread(fastpickuporder);
        }

        public volatile void onSuccessSameThread(Object obj)
        {
            onSuccessSameThread((FastPickupOrder)obj);
        }

        public PushNotification(int i, String s, String s1, String s2, String s3)
        {
            this$0 = FastPickupService.this;
            super(i);
            mStoreId = s;
            mTitle = s1;
            mText = s2;
            mAniviaType = s3;
        }
    }


    private static final String ACTION_PUSH_NOTIFICATION = (new StringBuilder()).append(com/walmart/android/wmservice/fastpickup/FastPickupService.getPackage()).append(".PUSH_NOTIFICATION").toString();
    private static final String ACTION_REFRESH = (new StringBuilder()).append(com/walmart/android/wmservice/fastpickup/FastPickupService.getPackage()).append(".REFRESH").toString();
    private static final Integer AUTHENTICATION_FAILED = Integer.valueOf(401);
    private static final String EXTRAS_ANIVIA_TYPE = "anivia";
    private static final String EXTRA_FORCE_UPDATE = "force";
    public static final String FAST_PICKUP_PUSH_NOTIFICATION = "FastPickupPushNotification";
    public static final boolean FORCE_UPDATE = true;
    public static final boolean SCHEDULED_UPDATE = false;
    private static final String TAG = com/walmart/android/wmservice/fastpickup/FastPickupService.getSimpleName();
    private static final Object sClassLock = com/walmart/android/wmservice/fastpickup/FastPickupService;
    private static android.os.PowerManager.WakeLock sWakeLock;
    private ArrayList mActiveStartId;
    private Handler mHandler;
    private int mLatestStartId;

    public FastPickupService()
    {
        mActiveStartId = new ArrayList();
    }

    private static void acquireWakeLock(Context context)
    {
        synchronized (sClassLock)
        {
            WLog.d(TAG, "acquireWakeLock()");
            if (sWakeLock == null)
            {
                sWakeLock = ((PowerManager)context.getSystemService("power")).newWakeLock(1, com/walmart/android/wmservice/fastpickup/FastPickupService.getName());
                sWakeLock.acquire();
            }
        }
        return;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    private void handlePushNotification(int i, Intent intent)
    {
        String s = intent.getStringExtra("STORE_ID");
        WLog.d(TAG, (new StringBuilder()).append("handlePushNotification() storeId=").append(s).toString());
        String s1 = intent.getStringExtra("TITLE");
        String s2 = intent.getStringExtra("TEXT");
        intent = intent.getStringExtra("ANIVIA");
        if (!TextUtils.isEmpty(s) && !TextUtils.isEmpty(s1))
        {
            requestServerStatus(new PushNotification(i, s, s1, s2, intent));
            return;
        } else
        {
            stopService(i);
            return;
        }
    }

    private void handleRefresh(int i, boolean flag)
    {
        WLog.d(TAG, "handleRefresh()");
        FastPickupManager.Model model = Services.get().getFastPickupManager().getModel();
        long l = model.getScheduleInterval();
        if (flag || System.currentTimeMillis() - model.getLastServerUpdate() > l)
        {
            requestServerStatus(new Callback(i));
            return;
        } else
        {
            stopService(i);
            return;
        }
    }

    private void onHandleIntent(Intent intent, int i)
    {
        if (intent != null)
        {
            String s = intent.getAction();
            if (ACTION_PUSH_NOTIFICATION.equals(s))
            {
                handlePushNotification(i, intent);
                return;
            }
            if (ACTION_REFRESH.equals(s))
            {
                handleRefresh(i, intent.getBooleanExtra("force", false));
                return;
            } else
            {
                stopService(i);
                return;
            }
        } else
        {
            stopService(i);
            return;
        }
    }

    public static void refresh(Context context, boolean flag)
    {
        WLog.d(TAG, (new StringBuilder()).append("refresh() forceUpdate:").append(flag).toString());
        Intent intent = new Intent(context, com/walmart/android/wmservice/fastpickup/FastPickupService);
        intent.setAction(ACTION_REFRESH);
        intent.putExtra("force", flag);
        start(context, intent);
    }

    private static void releaseWakeLock()
    {
        synchronized (sClassLock)
        {
            WLog.d(TAG, "releaseWakeLock()");
            if (sWakeLock != null)
            {
                sWakeLock.release();
                sWakeLock = null;
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void requestServerStatus(final Callback callback)
    {
        Authentication authentication = Services.get().getAuthentication();
        if (authentication.getLastAuthChangedEvent().loggedIn)
        {
            Services.get().getWalmartService().getFastPickupOrders(callback);
            return;
        }
        if (authentication.hasCredentials())
        {
            authentication.renewSession(new com.walmart.android.wmservice.Authentication.AuthCallback() {

                final FastPickupService this$0;
                final Callback val$callback;

                public void onFailure(int i)
                {
                    WLog.d(FastPickupService.TAG, "renewSession.onFailure()");
                    callback.onFailure(Integer.valueOf(i), null);
                }

                public void onSuccess()
                {
                    WLog.d(FastPickupService.TAG, "renewSession.onSuccess()");
                    Services.get().getWalmartService().getFastPickupOrders(callback);
                }

            
            {
                this$0 = FastPickupService.this;
                callback = callback1;
                super();
            }
            });
            return;
        } else
        {
            callback.onFailure(AUTHENTICATION_FAILED, null);
            return;
        }
    }

    private void reschedule()
    {
        Authentication authentication = Services.get().getAuthentication();
        if (authentication.getLastAuthChangedEvent().loggedIn || authentication.hasCredentials())
        {
            AlarmManager alarmmanager = (AlarmManager)getSystemService("alarm");
            PendingIntent pendingintent = PendingIntent.getBroadcast(this, 0, new Intent(this, com/walmart/android/wmservice/fastpickup/FastPickupService$AlarmReceiver), 0x10000000);
            long l = Services.get().getFastPickupManager().getModel().getScheduleInterval();
            alarmmanager.set(2, SystemClock.elapsedRealtime() + l, pendingintent);
            WLog.d(TAG, (new StringBuilder()).append("scheduleStatusUpdates() next start in ").append(l).append("ms").toString());
        }
    }

    private static void start(Context context, Intent intent)
    {
        acquireWakeLock(context);
        context.startService(intent);
    }

    public static void startPushNotification(Context context, String s, String s1, String s2, Bundle bundle)
    {
        if (!TextUtils.isEmpty(s) && !TextUtils.isEmpty(s1) && !TextUtils.isEmpty(s2))
        {
            Intent intent = new Intent(context, com/walmart/android/wmservice/fastpickup/FastPickupService);
            intent.setAction(ACTION_PUSH_NOTIFICATION);
            intent.putExtra("STORE_ID", s);
            intent.putExtra("TITLE", s1);
            intent.putExtra("TEXT", s2);
            if (bundle != null)
            {
                s = bundle.getString("anivia");
            } else
            {
                s = null;
            }
            if (!TextUtils.isEmpty(s))
            {
                intent.putExtra("ANIVIA", s);
            }
            start(context, intent);
        }
    }

    private void stopService(int i)
    {
        WLog.d(TAG, (new StringBuilder()).append("stopService() startId=").append(i).append(", latestId=").append(mLatestStartId).append(" , queue size=").append(mActiveStartId.size()).toString());
        mActiveStartId.remove(Integer.valueOf(i));
        if (mActiveStartId.size() <= 0)
        {
            stopSelf(mLatestStartId);
            return;
        }
        if (i != mLatestStartId)
        {
            stopSelf(i);
            return;
        } else
        {
            WLog.d(TAG, "stopService() not stopping, remaining jobs exist.");
            return;
        }
    }

    public IBinder onBind(Intent intent)
    {
        return null;
    }

    public void onCreate()
    {
        super.onCreate();
        mHandler = new Handler();
    }

    public void onDestroy()
    {
        WLog.d(TAG, "onDestroy()");
        releaseWakeLock();
        super.onDestroy();
    }

    public int onStartCommand(Intent intent, int i, int j)
    {
        WLog.d(TAG, (new StringBuilder()).append("onStartCommand() intent=").append(intent).toString());
        mLatestStartId = j;
        mActiveStartId.add(Integer.valueOf(j));
        onHandleIntent(intent, j);
        return 3;
    }

    public void refresh()
    {
        refresh(((Context) (this)), false);
    }





}
