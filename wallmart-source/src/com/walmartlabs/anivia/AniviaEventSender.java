// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.anivia;

import android.content.Context;
import android.database.Cursor;
import android.util.SparseArray;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

// Referenced classes of package com.walmartlabs.anivia:
//            BulkParams, AniviaLog, AniviaContentProvider, HttpSender

class AniviaEventSender
{

    private static final String ANIVIA_URL_PRODUCTION = "https://analytics.mobile.walmart.com/analytics/devices";
    private static final int DEFAULT_SEND_INTERVAL_SECONDS = 60;
    private static final String ENDPOINT = "/analytics/devices";
    private static final String EVENTS = "events";
    private static final int MAX_SEND_INTERVAL_SECONDS = 900;
    private static final String TAG = com/walmartlabs/anivia/AniviaEventSender.getSimpleName();
    private static String sAniviaUrl = "https://analytics.mobile.walmart.com/analytics/devices";
    private static int sQAUrl = 0;
    private static final SparseArray sServiceUrlMap = new SparseArray() {

            
            {
                put(0, "https://analytics-qa.mobile.walmart.com");
                put(1, "https://analytics-stg0.mobile.walmart.com");
                put(2, "https://analytics-stg1.mobile.walmart.com");
                put(3, "https://analytics-stg2.mobile.walmart.com");
                put(4, "https://analytics-stg3.mobile.walmart.com");
            }
    };
    private final AniviaContentProvider mAniviaContentProvider;
    private volatile BulkParams mBulkParams;
    private final Context mContext;
    private volatile boolean mDontSend;
    private volatile ScheduledExecutorService mExecutor;
    private Map mExtraBulkParams;
    private final HttpSender mHttpSender;
    private final Runnable mScheduleSendIfNecessaryRunnable = new Runnable() {

        final AniviaEventSender this$0;

        public void run()
        {
            int i = getNumberOfEventsAvailable();
            AniviaLog.d(AniviaEventSender.TAG, (new StringBuilder()).append("scheduleSendIfNecessary(): events available: ").append(i).toString());
            if (i > 0 && (mSendEventsFuture == null || mSendEventsFuture.isDone()))
            {
                mSendEventsFuture = mExecutor.schedule(mSendEventsRunnable, mSendIntervalSeconds, TimeUnit.SECONDS);
                AniviaLog.d(AniviaEventSender.TAG, (new StringBuilder()).append("scheduled next send in ").append(mSendIntervalSeconds).append(" seconds").toString());
            }
        }

            
            {
                this$0 = AniviaEventSender.this;
                super();
            }
    };
    private volatile Future mSendEventsFuture;
    private final Runnable mSendEventsRunnable = new Runnable() {

        final AniviaEventSender this$0;

        public void run()
        {
            AniviaLog.d(AniviaEventSender.TAG, "sendEventsRunnable run()");
            if (!sendEvents()) goto _L2; else goto _L1
_L1:
            mSendIntervalSeconds = 60;
_L4:
            mExecutor.execute(mScheduleSendIfNecessaryRunnable);
            return;
_L2:
            try
            {
                mSendIntervalSeconds = Math.min(mSendIntervalSeconds * 2, 900);
            }
            catch (Exception exception)
            {
                AniviaLog.e(AniviaEventSender.TAG, "run(): ", exception);
            }
            if (true) goto _L4; else goto _L3
_L3:
        }

            
            {
                this$0 = AniviaEventSender.this;
                super();
            }
    };
    private int mSendIntervalSeconds;

    public AniviaEventSender(Context context, AniviaContentProvider aniviacontentprovider, HttpSender httpsender)
    {
        mSendIntervalSeconds = 60;
        mSendEventsFuture = null;
        mBulkParams = new BulkParams();
        mContext = context;
        mHttpSender = httpsender;
        mAniviaContentProvider = aniviacontentprovider;
    }

    private void cleanup(JSONObject jsonobject)
    {
        Iterator iterator = jsonobject.keys();
_L2:
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        Object obj = jsonobject.get((String)iterator.next());
        if (obj == null)
        {
            try
            {
                iterator.remove();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                AniviaLog.wtf(TAG, "Couldn't get value for key that the object told us it have. what!?", ((Throwable) (obj)));
            }
            continue; /* Loop/switch isn't completed */
        }
        if (obj instanceof JSONObject)
        {
            cleanup((JSONObject)obj);
        }
        if (true) goto _L2; else goto _L1
_L1:
    }

    private JSONObject createBulkEvent(JSONArray jsonarray)
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("pid", "android");
            jsonobject.put("tpid", "android");
            jsonobject.put("aid", mBulkParams.getApplicationId());
            jsonobject.put("vid", mBulkParams.getVisitorId());
            jsonobject.put("sid", mBulkParams.getSessionId());
            jsonobject.put("aVer", mBulkParams.getApplicationVersion());
            jsonobject.put("mts", System.currentTimeMillis());
            jsonobject.put("events", jsonarray);
            if (mExtraBulkParams != null)
            {
                java.util.Map.Entry entry;
                for (jsonarray = mExtraBulkParams.entrySet().iterator(); jsonarray.hasNext(); jsonobject.put((String)entry.getKey(), entry.getValue()))
                {
                    entry = (java.util.Map.Entry)jsonarray.next();
                }

            }
        }
        // Misplaced declaration of an exception variable
        catch (JSONArray jsonarray)
        {
            AniviaLog.wtf(TAG, "Failed to create bulk event", jsonarray);
        }
        return jsonobject;
    }

    private JSONObject createJsonObjectFromCurrentCursorRow(Cursor cursor)
    {
        String s = cursor.getString(1);
        cursor = null;
        JSONObject jsonobject;
        try
        {
            jsonobject = (JSONObject)(new JSONTokener(s)).nextValue();
        }
        catch (JSONException jsonexception)
        {
            AniviaLog.e(TAG, String.format("Failed to create event from db: %s", new Object[] {
                s
            }), jsonexception);
            return cursor;
        }
        cursor = jsonobject;
        cleanup(jsonobject);
        return jsonobject;
    }

    private void deleteEvents()
    {
        try
        {
            int i = mAniviaContentProvider.delete("1", null);
            AniviaLog.d(TAG, (new StringBuilder()).append("Deleted ").append(i).append(" events").toString());
            return;
        }
        catch (Exception exception)
        {
            AniviaLog.e(TAG, "deleteEvents: ", exception);
        }
    }

    private int getNumberOfEventsAvailable()
    {
        int i = 0;
        boolean flag = false;
        Cursor cursor = mAniviaContentProvider.query(new String[] {
            "count(*) AS count"
        }, null, null, null);
        if (cursor != null)
        {
            i = ((flag) ? 1 : 0);
            if (cursor.moveToFirst())
            {
                i = cursor.getInt(0);
            }
            cursor.close();
        }
        return i;
    }

    public static int getQAUrl()
    {
        return sQAUrl;
    }

    private boolean sendEvents()
    {
        Cursor cursor = mAniviaContentProvider.query(new String[] {
            "_id", "event"
        }, null, null, null);
        if (cursor != null)
        {
            JSONArray jsonarray = new JSONArray();
            do
            {
                if (!cursor.moveToNext())
                {
                    break;
                }
                JSONObject jsonobject = createJsonObjectFromCurrentCursorRow(cursor);
                if (jsonobject != null)
                {
                    jsonarray.put(jsonobject);
                }
            } while (true);
            cursor.close();
            if (sendEvents(jsonarray))
            {
                deleteEvents();
                return true;
            }
        }
        return false;
    }

    private boolean sendEvents(JSONArray jsonarray)
    {
label0:
        {
label1:
            {
                boolean flag1 = false;
                boolean flag = flag1;
                if (jsonarray.length() > 0)
                {
                    String s = createBulkEvent(jsonarray).toString();
                    if (s == null)
                    {
                        break label0;
                    }
                    AniviaLog.d(TAG, String.format("ready to send %d events (dontSend=%b): %s", new Object[] {
                        Integer.valueOf(jsonarray.length()), Boolean.valueOf(mDontSend), s
                    }));
                    if (mDontSend)
                    {
                        break label1;
                    }
                    jsonarray = mHttpSender.post(sAniviaUrl, "application/json", s);
                    flag = flag1;
                    if (jsonarray != null)
                    {
                        flag = true;
                        AniviaLog.d(TAG, String.format(Locale.US, "Anivia response. Status=%d, Body=%s", new Object[] {
                            Integer.valueOf(((HttpSender.Response) (jsonarray)).statusCode), ((HttpSender.Response) (jsonarray)).body
                        }));
                    }
                }
                return flag;
            }
            return true;
        }
        AniviaLog.wtf(TAG, "JSON string should not be null here. Are extra bulk parameters correctly configured?");
        return false;
    }

    public static void setQAUrl(int i)
    {
        if (sServiceUrlMap.get(i) != null)
        {
            sQAUrl = i;
            sAniviaUrl = (new StringBuilder()).append((String)sServiceUrlMap.get(i)).append("/analytics/devices").toString();
            return;
        } else
        {
            AniviaLog.w(TAG, (new StringBuilder()).append("Unable to find QA url: ").append(i).toString());
            return;
        }
    }

    public void onEventsAvailable()
    {
        mExecutor.execute(mScheduleSendIfNecessaryRunnable);
    }

    public void sendEventsImmediately()
    {
        boolean flag;
        boolean flag1;
        boolean flag2;
        if (getNumberOfEventsAvailable() > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        flag2 = true;
        flag1 = flag2;
        if (mSendEventsFuture != null)
        {
            flag1 = flag2;
            if (!mSendEventsFuture.isDone())
            {
                flag1 = mSendEventsFuture.cancel(false);
            }
        }
        if (flag && flag1)
        {
            mSendEventsFuture = mExecutor.submit(mSendEventsRunnable);
        }
    }

    public void setDontSend(boolean flag)
    {
        mDontSend = flag;
    }

    public void start(ScheduledExecutorService scheduledexecutorservice, BulkParams bulkparams)
    {
        mBulkParams = bulkparams;
        mExecutor = scheduledexecutorservice;
        mExecutor.execute(mScheduleSendIfNecessaryRunnable);
    }

    public void stop()
    {
        if (mSendEventsFuture != null)
        {
            mSendEventsFuture.cancel(true);
            mSendEventsFuture = null;
        }
    }

    public void updateExtraBulkParams(final Map extraParamsCopy, boolean flag)
    {
        if (flag)
        {
            sendEventsImmediately();
        }
        extraParamsCopy = Collections.unmodifiableMap(new HashMap(extraParamsCopy));
        mExecutor.submit(new Runnable() {

            final AniviaEventSender this$0;
            final Map val$extraParamsCopy;

            public void run()
            {
                mExtraBulkParams = extraParamsCopy;
            }

            
            {
                this$0 = AniviaEventSender.this;
                extraParamsCopy = map;
                super();
            }
        });
    }






/*
    static Future access$202(AniviaEventSender aniviaeventsender, Future future)
    {
        aniviaeventsender.mSendEventsFuture = future;
        return future;
    }

*/




/*
    static int access$402(AniviaEventSender aniviaeventsender, int i)
    {
        aniviaeventsender.mSendIntervalSeconds = i;
        return i;
    }

*/





/*
    static Map access$802(AniviaEventSender aniviaeventsender, Map map)
    {
        aniviaeventsender.mExtraBulkParams = map;
        return map;
    }

*/
}
