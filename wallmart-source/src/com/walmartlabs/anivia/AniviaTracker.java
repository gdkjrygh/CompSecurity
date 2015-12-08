// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.anivia;

import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.text.TextUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.Properties;
import java.util.UUID;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import org.apache.commons.io.IOUtils;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

// Referenced classes of package com.walmartlabs.anivia:
//            BulkParams, AniviaContentProvider, AniviaEventSender, AniviaEvent, 
//            AniviaLog, HttpSender, AniviaEventAsJson

public class AniviaTracker
{

    private static final String ANIVIA_PREFS = "anivia_prefs";
    public static final int ANIVIA_QA_URL_ANALYTICS_QA = 0;
    public static final int ANIVIA_QA_URL_ANIVIA_STG0 = 1;
    public static final int ANIVIA_QA_URL_ANIVIA_STG1 = 2;
    public static final int ANIVIA_QA_URL_ANIVIA_STG2 = 3;
    public static final int ANIVIA_QA_URL_ANIVIA_STG3 = 4;
    private static final String BUILD_VERSION_BUILD_NUMBER = "versionNumber";
    private static final String BUILD_VERSION_COMMIT_SHA1 = "commitId";
    private static final String BUILD_VERSION_FILE = "version.properties";
    private static final String BUILD_VERSION_NOT_AVAILABLE = "na";
    private static final boolean DEBUG = false;
    private static final String PREF_VID = "visitor_id";
    private static final String TAG = com/walmartlabs/anivia/AniviaTracker.getSimpleName();
    private BulkParams mBulkParams;
    private final AniviaContentProvider mContentProvider;
    private final Context mContext;
    private final AniviaEventSender mEventSender;
    private final ScheduledExecutorService mExecutorService = Executors.newSingleThreadScheduledExecutor(new ThreadFactory() {

        final AniviaTracker this$0;

        public Thread newThread(Runnable runnable)
        {
            runnable = new Thread(runnable, "Anivia worker");
            runnable.setPriority(1);
            return runnable;
        }

            
            {
                this$0 = AniviaTracker.this;
                super();
            }
    });

    public AniviaTracker(Context context, HttpSender httpsender)
    {
        mBulkParams = new BulkParams();
        mContext = context;
        mContentProvider = new AniviaContentProvider(mContext);
        mEventSender = new AniviaEventSender(context, mContentProvider, httpsender);
    }

    private static boolean addIfValid(JSONObject jsonobject, ArrayList arraylist)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (jsonobject.has("event"))
        {
            flag = flag1;
            if (jsonobject.has("ets"))
            {
                ContentValues contentvalues = new ContentValues();
                contentvalues.put("event", jsonobject.toString());
                arraylist.add(contentvalues);
                flag = true;
            }
        }
        return flag;
    }

    private ContentValues eventToContentValues(AniviaEvent aniviaevent)
    {
        Object obj = null;
        String s;
        s = aniviaevent.toJson();
        aniviaevent = new ContentValues();
        aniviaevent.put("event", s);
        AniviaLog.d(TAG, (new StringBuilder()).append("eventToContentValues() event as json: ").append(s).toString());
        return aniviaevent;
        Exception exception;
        exception;
        aniviaevent = obj;
_L2:
        AniviaLog.e(TAG, "eventToContentValues(): ", exception);
        return aniviaevent;
        exception;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private String getAppVersion()
    {
        String s = null;
        PackageInfo packageinfo = mContext.getPackageManager().getPackageInfo(mContext.getPackageName(), 0);
        Object obj = s;
        if (packageinfo != null)
        {
            try
            {
                obj = packageinfo.versionName;
            }
            catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
            {
                namenotfoundexception.printStackTrace();
                namenotfoundexception = s;
            }
        }
        s = ((String) (obj));
        if (obj == null)
        {
            s = "unknown";
        }
        return s;
    }

    private Properties getBuildVersionProperties()
    {
        java.io.InputStream inputstream;
        Object obj;
        Properties properties;
        properties = new Properties();
        obj = null;
        inputstream = null;
        java.io.InputStream inputstream1 = mContext.getAssets().open("version.properties");
        inputstream = inputstream1;
        obj = inputstream1;
        properties.load(inputstream1);
        IOUtils.closeQuietly(inputstream1);
        return properties;
        obj;
        obj = inputstream;
        AniviaLog.w(TAG, "Failed to open build version file");
        IOUtils.closeQuietly(inputstream);
        return properties;
        Exception exception;
        exception;
        IOUtils.closeQuietly(((java.io.InputStream) (obj)));
        throw exception;
    }

    public static int getQAUrl()
    {
        return AniviaEventSender.getQAUrl();
    }

    private String getVisitorIdFromDisk()
    {
        SharedPreferences sharedpreferences = mContext.getSharedPreferences("anivia_prefs", 0);
        String s1 = sharedpreferences.getString("visitor_id", null);
        String s = s1;
        if (s1 == null)
        {
            s = UUID.randomUUID().toString();
            android.content.SharedPreferences.Editor editor = sharedpreferences.edit();
            editor.putString("visitor_id", s);
            editor.apply();
            AniviaLog.d(TAG, (new StringBuilder()).append("No visitor ID found. Generating: ").append(s).toString());
        }
        return s;
    }

    private void initIds()
    {
        if (TextUtils.isEmpty(mBulkParams.getApplicationId()))
        {
            throw new IllegalStateException("setApplicationId must be called before start()");
        } else
        {
            String s = getVisitorIdFromDisk();
            String s1 = UUID.randomUUID().toString();
            String s2 = getAppVersion();
            mBulkParams.setApplicationVersion(s2);
            mBulkParams.setVisitorId(s);
            mBulkParams.setSessionId(s1);
            return;
        }
    }

    private void internalTrackEventAsJson(String s)
    {
        ArrayList arraylist = new ArrayList();
        s = ((String) ((new JSONTokener(s)).nextValue()));
        if (!(s instanceof JSONArray)) goto _L2; else goto _L1
_L1:
        s = (JSONArray)s;
        int i = 0;
_L4:
        if (i >= s.length())
        {
            break; /* Loop/switch isn't completed */
        }
        addIfValid(s.getJSONObject(i), arraylist);
        i++;
        if (true) goto _L4; else goto _L3
_L2:
        try
        {
            if (s instanceof JSONObject)
            {
                addIfValid((JSONObject)s, arraylist);
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            AniviaLog.e(TAG, "failed to track event as json", s);
        }
_L3:
        if (!arraylist.isEmpty())
        {
            trackEventsAsContentValues(arraylist);
        }
        return;
    }

    public static void setQAUrl(int i)
    {
        AniviaEventSender.setQAUrl(i);
    }

    private void trackEventAsContentValues(ContentValues contentvalues)
    {
        if (mContentProvider.insert(contentvalues) != -1L)
        {
            AniviaLog.d(TAG, (new StringBuilder()).append("trackEvent() inserted new event: ").append(contentvalues.toString()).toString());
        } else
        {
            AniviaLog.e(TAG, (new StringBuilder()).append("trackEvent() failed to insert event: ").append(contentvalues.toString()).toString());
        }
        mEventSender.onEventsAvailable();
    }

    private void trackEventsAsContentValues(ArrayList arraylist)
    {
        if (arraylist.size() == 1)
        {
            trackEventAsContentValues((ContentValues)arraylist.get(0));
            return;
        } else
        {
            mContentProvider.bulkInsert(arraylist);
            mEventSender.onEventsAvailable();
            return;
        }
    }

    public void flushEvents()
    {
        AniviaLog.d(TAG, "Flushing events");
        mEventSender.sendEventsImmediately();
    }

    public BulkParams getBulkParams()
    {
        return mBulkParams;
    }

    public String getSessionId()
    {
        return mBulkParams.getSessionId();
    }

    public String getVisitorId()
    {
        return mBulkParams.getVisitorId();
    }

    public void setApplicationId(String s)
    {
        mBulkParams.setApplicationId(s);
    }

    public void setExtraBulkParams(Map map, boolean flag)
    {
        if (map != null)
        {
            mEventSender.updateExtraBulkParams(map, flag);
        }
    }

    public void start()
    {
        initIds();
        mEventSender.start(mExecutorService, mBulkParams);
    }

    public void stop()
    {
        mExecutorService.shutdown();
        mEventSender.stop();
        mContentProvider.destroy();
    }

    public void trackEvent(final AniviaEvent event)
    {
        mExecutorService.execute(new Runnable() {

            final AniviaTracker this$0;
            final AniviaEvent val$event;

            public void run()
            {
                ContentValues contentvalues = eventToContentValues(event);
                if (contentvalues != null)
                {
                    trackEventAsContentValues(contentvalues);
                }
            }

            
            {
                this$0 = AniviaTracker.this;
                event = aniviaevent;
                super();
            }
        });
    }

    public void trackEventAsJson(final AniviaEventAsJson.Builder builder)
    {
        mExecutorService.execute(new Runnable() {

            final AniviaTracker this$0;
            final AniviaEventAsJson.Builder val$builder;

            public void run()
            {
                AniviaEventAsJson aniviaeventasjson = builder.build();
                if (aniviaeventasjson.eventAsJson != null)
                {
                    internalTrackEventAsJson(aniviaeventasjson.eventAsJson);
                }
            }

            
            {
                this$0 = AniviaTracker.this;
                builder = builder1;
                super();
            }
        });
    }

    public void trackEventAsJson(final String eventAsJson)
    {
        mExecutorService.execute(new Runnable() {

            final AniviaTracker this$0;
            final String val$eventAsJson;

            public void run()
            {
                internalTrackEventAsJson(eventAsJson);
            }

            
            {
                this$0 = AniviaTracker.this;
                eventAsJson = s;
                super();
            }
        });
    }




}
