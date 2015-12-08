// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.mpmetrics;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.gcm.GoogleCloudMessaging;
import com.mixpanel.android.util.Base64Coder;
import com.mixpanel.android.util.HttpService;
import com.mixpanel.android.util.RemoteService;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.mixpanel.android.mpmetrics:
//            MPConfig, MPDbAdapter, DecideMessages, SystemInformation, 
//            DecideChecker, MixpanelAPI

class AnalyticsMessages
{
    static class EventDescription
    {

        private final String eventName;
        private final JSONObject properties;
        private final String token;

        public String getEventName()
        {
            return eventName;
        }

        public JSONObject getProperties()
        {
            return properties;
        }

        public String getToken()
        {
            return token;
        }

        public EventDescription(String s, JSONObject jsonobject, String s1)
        {
            eventName = s;
            properties = jsonobject;
            token = s1;
        }
    }

    private class Worker
    {

        private long mAveFlushFrequency;
        private long mFlushCount;
        private Handler mHandler;
        private final Object mHandlerLock = new Object();
        private long mLastFlushTime;
        private SystemInformation mSystemInformation;
        final AnalyticsMessages this$0;

        private Handler restartWorkerThread()
        {
            HandlerThread handlerthread = new HandlerThread("com.mixpanel.android.AnalyticsWorker", 1);
            handlerthread.start();
            return new AnalyticsMessageHandler(handlerthread.getLooper());
        }

        private void updateFlushFrequency()
        {
            long l = System.currentTimeMillis();
            long l1 = mFlushCount + 1L;
            if (mLastFlushTime > 0L)
            {
                mAveFlushFrequency = ((l - mLastFlushTime) + mAveFlushFrequency * mFlushCount) / l1;
                long l2 = mAveFlushFrequency / 1000L;
                logAboutMessageToMixpanel((new StringBuilder("Average send frequency approximately ")).append(l2).append(" seconds.").toString());
            }
            mLastFlushTime = l;
            mFlushCount = l1;
        }

        public boolean isDead()
        {
            Object obj = mHandlerLock;
            obj;
            JVM INSTR monitorenter ;
            Exception exception;
            boolean flag;
            if (mHandler == null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            obj;
            JVM INSTR monitorexit ;
            return flag;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public void runMessage(Message message)
        {
            Object obj = mHandlerLock;
            obj;
            JVM INSTR monitorenter ;
            if (mHandler != null)
            {
                break MISSING_BLOCK_LABEL_43;
            }
            logAboutMessageToMixpanel((new StringBuilder("Dead mixpanel worker dropping a message: ")).append(message.what).toString());
_L2:
            return;
            mHandler.sendMessage(message);
            if (true) goto _L2; else goto _L1
_L1:
            message;
            obj;
            JVM INSTR monitorexit ;
            throw message;
        }







        public Worker()
        {
            this$0 = AnalyticsMessages.this;
            super();
            mFlushCount = 0L;
            mAveFlushFrequency = 0L;
            mLastFlushTime = -1L;
            mHandler = restartWorkerThread();
        }
    }

    private class Worker.AnalyticsMessageHandler extends Handler
    {

        private MPDbAdapter mDbAdapter;
        private final DecideChecker mDecideChecker;
        private final boolean mDisableFallback;
        private final long mFlushInterval;
        private long mRetryAfter;
        final Worker this$1;

        private JSONObject getDefaultEventProperties()
            throws JSONException
        {
            JSONObject jsonobject;
            jsonobject = new JSONObject();
            jsonobject.put("mp_lib", "android");
            jsonobject.put("$lib_version", "4.6.0");
            jsonobject.put("$os", "Android");
            Object obj;
            int i;
            if (android.os.Build.VERSION.RELEASE == null)
            {
                obj = "UNKNOWN";
            } else
            {
                obj = android.os.Build.VERSION.RELEASE;
            }
            jsonobject.put("$os_version", obj);
            if (Build.MANUFACTURER == null)
            {
                obj = "UNKNOWN";
            } else
            {
                obj = Build.MANUFACTURER;
            }
            jsonobject.put("$manufacturer", obj);
            if (Build.BRAND == null)
            {
                obj = "UNKNOWN";
            } else
            {
                obj = Build.BRAND;
            }
            jsonobject.put("$brand", obj);
            if (Build.MODEL == null)
            {
                obj = "UNKNOWN";
            } else
            {
                obj = Build.MODEL;
            }
            jsonobject.put("$model", obj);
            i = GooglePlayServicesUtil.isGooglePlayServicesAvailable(mContext);
            i;
            JVM INSTR tableswitch 0 9: default 172
        //                       0 422
        //                       1 460
        //                       2 472
        //                       3 484
        //                       4 172
        //                       5 172
        //                       6 172
        //                       7 172
        //                       8 172
        //                       9 496;
               goto _L1 _L2 _L3 _L4 _L5 _L1 _L1 _L1 _L1 _L1 _L6
_L1:
            break; /* Loop/switch isn't completed */
_L6:
            break MISSING_BLOCK_LABEL_496;
_L7:
            obj = mSystemInformation.getDisplayMetrics();
            jsonobject.put("$screen_dpi", ((DisplayMetrics) (obj)).densityDpi);
            jsonobject.put("$screen_height", ((DisplayMetrics) (obj)).heightPixels);
            jsonobject.put("$screen_width", ((DisplayMetrics) (obj)).widthPixels);
            obj = mSystemInformation.getAppVersionName();
            if (obj != null)
            {
                jsonobject.put("$app_version", obj);
            }
            obj = Boolean.valueOf(mSystemInformation.hasNFC());
            if (obj != null)
            {
                jsonobject.put("$has_nfc", ((Boolean) (obj)).booleanValue());
            }
            obj = Boolean.valueOf(mSystemInformation.hasTelephony());
            if (obj != null)
            {
                jsonobject.put("$has_telephone", ((Boolean) (obj)).booleanValue());
            }
            obj = mSystemInformation.getCurrentNetworkOperator();
            if (obj != null)
            {
                jsonobject.put("$carrier", obj);
            }
            obj = mSystemInformation.isWifiConnected();
            if (obj != null)
            {
                jsonobject.put("$wifi", ((Boolean) (obj)).booleanValue());
            }
            obj = mSystemInformation.isBluetoothEnabled();
            if (obj != null)
            {
                jsonobject.put("$bluetooth_enabled", obj);
            }
            obj = mSystemInformation.getBluetoothVersion();
            if (obj != null)
            {
                jsonobject.put("$bluetooth_version", obj);
            }
            return jsonobject;
_L2:
            jsonobject.put("$google_play_services", "available");
              goto _L7
            RuntimeException runtimeexception;
            runtimeexception;
            try
            {
                jsonobject.put("$google_play_services", "not configured");
            }
            catch (NoClassDefFoundError noclassdeffounderror)
            {
                jsonobject.put("$google_play_services", "not included");
            }
              goto _L7
_L3:
            jsonobject.put("$google_play_services", "missing");
              goto _L7
_L4:
            jsonobject.put("$google_play_services", "out of date");
              goto _L7
_L5:
            jsonobject.put("$google_play_services", "disabled");
              goto _L7
            jsonobject.put("$google_play_services", "invalid");
              goto _L7
        }

        private JSONObject prepareEventObject(EventDescription eventdescription)
            throws JSONException
        {
            JSONObject jsonobject;
            JSONObject jsonobject1;
            JSONObject jsonobject2;
            jsonobject = new JSONObject();
            jsonobject1 = eventdescription.getProperties();
            jsonobject2 = getDefaultEventProperties();
            jsonobject2.put("token", eventdescription.getToken());
            if (jsonobject1 == null) goto _L2; else goto _L1
_L1:
            Iterator iterator = jsonobject1.keys();
_L5:
            if (iterator.hasNext()) goto _L3; else goto _L2
_L2:
            jsonobject.put("event", eventdescription.getEventName());
            jsonobject.put("properties", jsonobject2);
            return jsonobject;
_L3:
            String s = (String)iterator.next();
            jsonobject2.put(s, jsonobject1.get(s));
            if (true) goto _L5; else goto _L4
_L4:
        }

        private void runGCMRegistration(String s)
        {
            if (GooglePlayServicesUtil.isGooglePlayServicesAvailable(mContext) != 0)
            {
                Log.i("MixpanelAPI.Messages", "Can't register for push notifications, Google Play Services are not installed.");
                return;
            }
            break MISSING_BLOCK_LABEL_52;
            s;
            try
            {
                Log.i("MixpanelAPI.Messages", "Can't register for push notifications, Google Play services are not configured.");
                return;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                Log.i("MixpanelAPI.Messages", "Exception when trying to register for GCM", s);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                Log.w("MixpanelAPI.Messages", "Google play services were not part of this build, push notifications cannot be registered or delivered");
            }
            break MISSING_BLOCK_LABEL_101;
            s = GoogleCloudMessaging.getInstance(mContext).register(new String[] {
                s
            });
            MixpanelAPI.allInstances(s. new MixpanelAPI.InstanceProcessor() {

                final Worker.AnalyticsMessageHandler this$2;
                private final String val$registrationId;

                public void process(MixpanelAPI mixpanelapi)
                {
                    if (MPConfig.DEBUG)
                    {
                        Log.v("MixpanelAPI.Messages", (new StringBuilder("Using existing pushId ")).append(registrationId).toString());
                    }
                    mixpanelapi.getPeople().setPushRegistrationId(registrationId);
                }

            
            {
                this$2 = final_analyticsmessagehandler;
                registrationId = String.this;
                super();
            }
            });
            return;
        }

        private void sendAllData(MPDbAdapter mpdbadapter)
            throws com.mixpanel.android.util.RemoteService.ServiceUnavailableException
        {
            if (!getPoster().isOnline(mContext))
            {
                logAboutMessageToMixpanel("Not flushing data to Mixpanel because the device is not connected to the internet.");
                return;
            }
            logAboutMessageToMixpanel("Sending records to Mixpanel");
            if (mDisableFallback)
            {
                sendData(mpdbadapter, MPDbAdapter.Table.EVENTS, new String[] {
                    mConfig.getEventsEndpoint()
                });
                sendData(mpdbadapter, MPDbAdapter.Table.PEOPLE, new String[] {
                    mConfig.getPeopleEndpoint()
                });
                return;
            } else
            {
                sendData(mpdbadapter, MPDbAdapter.Table.EVENTS, new String[] {
                    mConfig.getEventsEndpoint(), mConfig.getEventsFallbackEndpoint()
                });
                sendData(mpdbadapter, MPDbAdapter.Table.PEOPLE, new String[] {
                    mConfig.getPeopleEndpoint(), mConfig.getPeopleFallbackEndpoint()
                });
                return;
            }
        }

        private void sendData(MPDbAdapter mpdbadapter, MPDbAdapter.Table table, String as[])
            throws com.mixpanel.android.util.RemoteService.ServiceUnavailableException
        {
            RemoteService remoteservice;
            String as1[];
            remoteservice = getPoster();
            as1 = mpdbadapter.generateDataString(table);
            if (as1 == null) goto _L2; else goto _L1
_L1:
            String s;
            String s3;
            ArrayList arraylist;
            boolean flag;
            int i;
            int j;
            s = as1[0];
            s3 = as1[1];
            String s1 = Base64Coder.encodeString(s3);
            arraylist = new ArrayList(1);
            arraylist.add(new BasicNameValuePair("data", s1));
            if (MPConfig.DEBUG)
            {
                arraylist.add(new BasicNameValuePair("verbose", "1"));
            }
            flag = true;
            j = as.length;
            i = 0;
_L7:
            if (i < j) goto _L4; else goto _L3
_L3:
            if (!flag) goto _L6; else goto _L5
_L5:
            logAboutMessageToMixpanel("Not retrying this batch of events, deleting them from DB.");
            mpdbadapter.cleanupEvents(s, table);
_L2:
            return;
_L4:
            String s2;
            boolean flag1;
            s2 = as[i];
            flag1 = flag;
            byte abyte0[] = remoteservice.performRequest(s2, arraylist);
            boolean flag2;
            boolean flag3;
            boolean flag4;
            flag3 = true;
            flag4 = true;
            flag2 = true;
            if (abyte0 != null)
            {
                break MISSING_BLOCK_LABEL_269;
            }
            flag1 = flag3;
            flag = flag4;
            logAboutMessageToMixpanel((new StringBuilder("Response was null, unexpected failure posting to ")).append(s2).append(".").toString());
            flag = flag2;
              goto _L3
            as;
            Log.e("MixpanelAPI.Messages", (new StringBuilder("Out of memory when posting to ")).append(s2).append(".").toString(), as);
            flag = flag1;
              goto _L3
            flag1 = flag3;
            flag = flag4;
            String s4 = new String(abyte0, "UTF-8");
            flag1 = flag3;
            flag = flag4;
            logAboutMessageToMixpanel((new StringBuilder("Successfully posted to ")).append(s2).append(": \n").append(s3).toString());
            flag1 = flag3;
            flag = flag4;
            logAboutMessageToMixpanel((new StringBuilder("Response was ")).append(s4).toString());
            flag = flag2;
              goto _L3
            as;
            Log.e("MixpanelAPI.Messages", (new StringBuilder("Cannot interpret ")).append(s2).append(" as a URL.").toString(), as);
              goto _L3
            Object obj;
            obj;
            flag1 = flag3;
            flag = flag4;
            throw new RuntimeException("UTF not supported on this platform?", ((Throwable) (obj)));
            obj;
            logAboutMessageToMixpanel((new StringBuilder("Cannot post message to ")).append(s2).append(".").toString(), ((Throwable) (obj)));
            flag = false;
            i++;
              goto _L7
_L6:
            logAboutMessageToMixpanel("Retrying this batch of events.");
            if (hasMessages(2)) goto _L2; else goto _L8
_L8:
            sendEmptyMessageDelayed(2, mFlushInterval);
            return;
              goto _L3
        }

        public void handleMessage(Message message)
        {
            byte byte0;
            if (mDbAdapter == null)
            {
                mDbAdapter = makeDbAdapter(mContext);
                mDbAdapter.cleanupEvents(System.currentTimeMillis() - (long)mConfig.getDataExpiration(), MPDbAdapter.Table.EVENTS);
                mDbAdapter.cleanupEvents(System.currentTimeMillis() - (long)mConfig.getDataExpiration(), MPDbAdapter.Table.PEOPLE);
            }
            byte0 = -3;
            if (message.what != 0) goto _L2; else goto _L1
_L1:
            int i;
            message = (JSONObject)message.obj;
            logAboutMessageToMixpanel("Queuing people record for sending later");
            logAboutMessageToMixpanel((new StringBuilder("    ")).append(message.toString()).toString());
            i = mDbAdapter.addJSON(message, MPDbAdapter.Table.PEOPLE);
_L8:
            if (i < mConfig.getBulkUploadLimit() && i != -2) goto _L4; else goto _L3
_L3:
            if (SystemClock.elapsedRealtime() < mRetryAfter) goto _L4; else goto _L5
_L5:
            logAboutMessageToMixpanel("Flushing queue due to bulk upload limit");
            updateFlushFrequency();
            sendAllData(mDbAdapter);
            mDecideChecker.runDecideChecks(getPoster());
_L12:
            return;
_L2:
            if (message.what != 1) goto _L7; else goto _L6
_L6:
            message = (EventDescription)message.obj;
            JSONObject jsonobject = prepareEventObject(message);
            logAboutMessageToMixpanel("Queuing event for sending later");
            logAboutMessageToMixpanel((new StringBuilder("    ")).append(jsonobject.toString()).toString());
            i = mDbAdapter.addJSON(jsonobject, MPDbAdapter.Table.EVENTS);
              goto _L8
            Object obj;
            obj;
            Log.e("MixpanelAPI.Messages", (new StringBuilder("Exception tracking event ")).append(message.getEventName()).toString(), ((Throwable) (obj)));
            i = byte0;
              goto _L8
            obj;
            Log.e("MixpanelAPI.Messages", "Worker threw an unhandled exception", ((Throwable) (obj)));
            message = ((Message) (mHandlerLock));
            message;
            JVM INSTR monitorenter ;
            mHandler = null;
            Looper.myLooper().quit();
            Log.e("MixpanelAPI.Messages", "Mixpanel will not process any more analytics messages", ((Throwable) (obj)));
_L14:
            return;
            obj;
            message;
            JVM INSTR monitorexit ;
            throw obj;
_L7:
            long l;
            long l1;
            if (message.what != 2)
            {
                break MISSING_BLOCK_LABEL_516;
            }
            logAboutMessageToMixpanel("Flushing queue due to scheduled or forced flush");
            updateFlushFrequency();
            l = SystemClock.elapsedRealtime();
            l1 = mRetryAfter;
            i = byte0;
            if (l < l1) goto _L8; else goto _L9
_L9:
            sendAllData(mDbAdapter);
            mDecideChecker.runDecideChecks(getPoster());
            i = byte0;
              goto _L8
            message;
            mRetryAfter = SystemClock.elapsedRealtime() + (long)(message.getRetryAfter() * 1000);
            i = byte0;
              goto _L8
            if (message.what != 12)
            {
                break MISSING_BLOCK_LABEL_623;
            }
            logAboutMessageToMixpanel("Installing a check for surveys and in-app notifications");
            message = (DecideMessages)message.obj;
            mDecideChecker.addDecideCheck(message);
            l = SystemClock.elapsedRealtime();
            l1 = mRetryAfter;
            i = byte0;
            if (l < l1) goto _L8; else goto _L10
_L10:
            mDecideChecker.runDecideChecks(getPoster());
            i = byte0;
              goto _L8
            message;
            mRetryAfter = SystemClock.elapsedRealtime() + (long)(message.getRetryAfter() * 1000);
            i = byte0;
              goto _L8
            if (message.what != 13)
            {
                break MISSING_BLOCK_LABEL_649;
            }
            runGCMRegistration((String)message.obj);
            i = byte0;
              goto _L8
            if (message.what != 5)
            {
                break MISSING_BLOCK_LABEL_730;
            }
            Log.w("MixpanelAPI.Messages", (new StringBuilder("Worker received a hard kill. Dumping all events and force-killing. Thread id ")).append(Thread.currentThread().getId()).toString());
            synchronized (mHandlerLock)
            {
                mDbAdapter.deleteDB();
                mHandler = null;
                Looper.myLooper().quit();
            }
            i = byte0;
              goto _L8
            exception;
            message;
            JVM INSTR monitorexit ;
            throw exception;
            Log.e("MixpanelAPI.Messages", (new StringBuilder("Unexpected message received by Mixpanel worker: ")).append(message).toString());
            i = byte0;
              goto _L8
            message;
            mRetryAfter = SystemClock.elapsedRealtime() + (long)(message.getRetryAfter() * 1000);
            return;
_L4:
            if (i <= 0) goto _L12; else goto _L11
_L11:
            if (hasMessages(2)) goto _L12; else goto _L13
_L13:
            logAboutMessageToMixpanel((new StringBuilder("Queue depth ")).append(i).append(" - Adding flush in ").append(mFlushInterval).toString());
            if (mFlushInterval >= 0L)
            {
                sendEmptyMessageDelayed(2, mFlushInterval);
                return;
            }
              goto _L12
            exception;
            Log.e("MixpanelAPI.Messages", "Could not halt looper", exception);
              goto _L14
        }

        public Worker.AnalyticsMessageHandler(Looper looper)
        {
            this$1 = Worker.this;
            super(looper);
            mDbAdapter = null;
            mDecideChecker = new DecideChecker(mContext, mConfig);
            mDisableFallback = mConfig.getDisableFallback();
            mFlushInterval = mConfig.getFlushInterval(mContext);
            mSystemInformation = new SystemInformation(mContext);
            mRetryAfter = -1L;
        }
    }


    private static final int ENQUEUE_EVENTS = 1;
    private static final int ENQUEUE_PEOPLE = 0;
    private static final int FLUSH_QUEUE = 2;
    private static final int INSTALL_DECIDE_CHECK = 12;
    private static final int KILL_WORKER = 5;
    private static final String LOGTAG = "MixpanelAPI.Messages";
    private static final int REGISTER_FOR_GCM = 13;
    private static final Map sInstances = new HashMap();
    private final MPConfig mConfig;
    private final Context mContext;
    private final Worker mWorker = new Worker();

    AnalyticsMessages(Context context)
    {
        mContext = context;
        mConfig = getConfig(context);
    }

    public static AnalyticsMessages getInstance(Context context)
    {
        Map map = sInstances;
        map;
        JVM INSTR monitorenter ;
        Context context1;
        context1 = context.getApplicationContext();
        if (sInstances.containsKey(context1))
        {
            break MISSING_BLOCK_LABEL_47;
        }
        context = new AnalyticsMessages(context1);
        sInstances.put(context1, context);
_L2:
        return context;
        context = (AnalyticsMessages)sInstances.get(context1);
        if (true) goto _L2; else goto _L1
_L1:
        context;
        map;
        JVM INSTR monitorexit ;
        throw context;
    }

    private void logAboutMessageToMixpanel(String s)
    {
        if (MPConfig.DEBUG)
        {
            Log.v("MixpanelAPI.Messages", (new StringBuilder(String.valueOf(s))).append(" (Thread ").append(Thread.currentThread().getId()).append(")").toString());
        }
    }

    private void logAboutMessageToMixpanel(String s, Throwable throwable)
    {
        if (MPConfig.DEBUG)
        {
            Log.v("MixpanelAPI.Messages", (new StringBuilder(String.valueOf(s))).append(" (Thread ").append(Thread.currentThread().getId()).append(")").toString(), throwable);
        }
    }

    public void eventsMessage(EventDescription eventdescription)
    {
        Message message = Message.obtain();
        message.what = 1;
        message.obj = eventdescription;
        mWorker.runMessage(message);
    }

    protected MPConfig getConfig(Context context)
    {
        return MPConfig.getInstance(context);
    }

    protected RemoteService getPoster()
    {
        return new HttpService();
    }

    public void hardKill()
    {
        Message message = Message.obtain();
        message.what = 5;
        mWorker.runMessage(message);
    }

    public void installDecideCheck(DecideMessages decidemessages)
    {
        Message message = Message.obtain();
        message.what = 12;
        message.obj = decidemessages;
        mWorker.runMessage(message);
    }

    boolean isDead()
    {
        return mWorker.isDead();
    }

    protected MPDbAdapter makeDbAdapter(Context context)
    {
        return new MPDbAdapter(context);
    }

    public void peopleMessage(JSONObject jsonobject)
    {
        Message message = Message.obtain();
        message.what = 0;
        message.obj = jsonobject;
        mWorker.runMessage(message);
    }

    public void postToServer()
    {
        Message message = Message.obtain();
        message.what = 2;
        mWorker.runMessage(message);
    }

    public void registerForGCM(String s)
    {
        Message message = Message.obtain();
        message.what = 13;
        message.obj = s;
        mWorker.runMessage(message);
    }





}
