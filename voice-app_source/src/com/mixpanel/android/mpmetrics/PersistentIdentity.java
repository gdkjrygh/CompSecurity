// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.mpmetrics;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.mixpanel.android.mpmetrics:
//            MPConfig, SuperPropertyUpdate

class PersistentIdentity
{

    private static final String LOGTAG = "MixpanelAPI.PIdentity";
    private static boolean sReferrerPrefsDirty = true;
    private static final Object sReferrerPrefsLock = new Object();
    private String mEventsDistinctId;
    private boolean mIdentitiesLoaded;
    private final Future mLoadReferrerPreferences;
    private final Future mLoadStoredPreferences;
    private String mPeopleDistinctId;
    private final android.content.SharedPreferences.OnSharedPreferenceChangeListener mReferrerChangeListener = new android.content.SharedPreferences.OnSharedPreferenceChangeListener() {

        final PersistentIdentity this$0;

        public void onSharedPreferenceChanged(SharedPreferences sharedpreferences, String s)
        {
            synchronized (PersistentIdentity.sReferrerPrefsLock)
            {
                readReferrerProperties();
                PersistentIdentity.sReferrerPrefsDirty = false;
            }
            return;
            s;
            sharedpreferences;
            JVM INSTR monitorexit ;
            throw s;
        }

            
            {
                this$0 = PersistentIdentity.this;
                super();
            }
    };
    private Map mReferrerPropertiesCache;
    private JSONObject mSuperPropertiesCache;
    private JSONArray mWaitingPeopleRecords;

    public PersistentIdentity(Future future, Future future1)
    {
        mLoadReferrerPreferences = future;
        mLoadStoredPreferences = future1;
        mSuperPropertiesCache = null;
        mReferrerPropertiesCache = null;
        mIdentitiesLoaded = false;
    }

    private JSONObject getSuperPropertiesCache()
    {
        if (mSuperPropertiesCache == null)
        {
            readSuperProperties();
        }
        return mSuperPropertiesCache;
    }

    private void readIdentities()
    {
        Object obj = null;
        SharedPreferences sharedpreferences = (SharedPreferences)mLoadStoredPreferences.get();
        obj = sharedpreferences;
_L2:
        if (obj == null)
        {
            return;
        }
        break; /* Loop/switch isn't completed */
        Object obj1;
        obj1;
        Log.e("MixpanelAPI.PIdentity", "Cannot read distinct ids from sharedPreferences.", ((ExecutionException) (obj1)).getCause());
        continue; /* Loop/switch isn't completed */
        obj1;
        Log.e("MixpanelAPI.PIdentity", "Cannot read distinct ids from sharedPreferences.", ((Throwable) (obj1)));
        if (true) goto _L2; else goto _L1
_L1:
        mEventsDistinctId = ((SharedPreferences) (obj)).getString("events_distinct_id", null);
        mPeopleDistinctId = ((SharedPreferences) (obj)).getString("people_distinct_id", null);
        mWaitingPeopleRecords = null;
        obj = ((SharedPreferences) (obj)).getString("waiting_array", null);
        if (obj != null)
        {
            try
            {
                mWaitingPeopleRecords = new JSONArray(((String) (obj)));
            }
            catch (JSONException jsonexception)
            {
                Log.e("MixpanelAPI.PIdentity", (new StringBuilder("Could not interpret waiting people JSON record ")).append(((String) (obj))).toString());
            }
        }
        if (mEventsDistinctId == null)
        {
            mEventsDistinctId = UUID.randomUUID().toString();
            writeIdentities();
        }
        mIdentitiesLoaded = true;
        return;
    }

    private void readReferrerProperties()
    {
        mReferrerPropertiesCache = new HashMap();
        Object obj;
        obj = (SharedPreferences)mLoadReferrerPreferences.get();
        ((SharedPreferences) (obj)).unregisterOnSharedPreferenceChangeListener(mReferrerChangeListener);
        ((SharedPreferences) (obj)).registerOnSharedPreferenceChangeListener(mReferrerChangeListener);
        obj = ((SharedPreferences) (obj)).getAll().entrySet().iterator();
_L1:
        if (!((Iterator) (obj)).hasNext())
        {
            return;
        }
        try
        {
            Object obj1 = (java.util.Map.Entry)((Iterator) (obj)).next();
            String s = (String)((java.util.Map.Entry) (obj1)).getKey();
            obj1 = ((java.util.Map.Entry) (obj1)).getValue();
            mReferrerPropertiesCache.put(s, obj1.toString());
        }
        catch (ExecutionException executionexception)
        {
            Log.e("MixpanelAPI.PIdentity", "Cannot load referrer properties from shared preferences.", executionexception.getCause());
            return;
        }
        catch (InterruptedException interruptedexception)
        {
            Log.e("MixpanelAPI.PIdentity", "Cannot load referrer properties from shared preferences.", interruptedexception);
            return;
        }
          goto _L1
    }

    private void readSuperProperties()
    {
        String s = ((SharedPreferences)mLoadStoredPreferences.get()).getString("super_properties", "{}");
        if (MPConfig.DEBUG)
        {
            Log.v("MixpanelAPI.PIdentity", (new StringBuilder("Loading Super Properties ")).append(s).toString());
        }
        mSuperPropertiesCache = new JSONObject(s);
        if (mSuperPropertiesCache == null)
        {
            mSuperPropertiesCache = new JSONObject();
        }
_L2:
        return;
        Object obj;
        obj;
        Log.e("MixpanelAPI.PIdentity", "Cannot load superProperties from SharedPreferences.", ((ExecutionException) (obj)).getCause());
        if (mSuperPropertiesCache != null) goto _L2; else goto _L1
_L1:
        mSuperPropertiesCache = new JSONObject();
        return;
        obj;
        Log.e("MixpanelAPI.PIdentity", "Cannot load superProperties from SharedPreferences.", ((Throwable) (obj)));
        if (mSuperPropertiesCache != null) goto _L2; else goto _L3
_L3:
        mSuperPropertiesCache = new JSONObject();
        return;
        obj;
        Log.e("MixpanelAPI.PIdentity", "Cannot parse stored superProperties");
        storeSuperProperties();
        if (mSuperPropertiesCache != null) goto _L2; else goto _L4
_L4:
        mSuperPropertiesCache = new JSONObject();
        return;
        obj;
        if (mSuperPropertiesCache == null)
        {
            mSuperPropertiesCache = new JSONObject();
        }
        throw obj;
    }

    private void storeSuperProperties()
    {
        if (mSuperPropertiesCache == null)
        {
            Log.e("MixpanelAPI.PIdentity", "storeSuperProperties should not be called with uninitialized superPropertiesCache.");
            return;
        }
        String s = mSuperPropertiesCache.toString();
        if (MPConfig.DEBUG)
        {
            Log.v("MixpanelAPI.PIdentity", (new StringBuilder("Storing Super Properties ")).append(s).toString());
        }
        try
        {
            android.content.SharedPreferences.Editor editor = ((SharedPreferences)mLoadStoredPreferences.get()).edit();
            editor.putString("super_properties", s);
            writeEdits(editor);
            return;
        }
        catch (ExecutionException executionexception)
        {
            Log.e("MixpanelAPI.PIdentity", "Cannot store superProperties in shared preferences.", executionexception.getCause());
            return;
        }
        catch (InterruptedException interruptedexception)
        {
            Log.e("MixpanelAPI.PIdentity", "Cannot store superProperties in shared preferences.", interruptedexception);
        }
    }

    public static JSONArray waitingPeopleRecordsForSending(SharedPreferences sharedpreferences)
    {
        JSONArray jsonarray;
        JSONArray jsonarray1;
        String s;
        String s1;
        jsonarray1 = null;
        s = sharedpreferences.getString("people_distinct_id", null);
        s1 = sharedpreferences.getString("waiting_array", null);
        jsonarray = jsonarray1;
        if (s1 == null) goto _L2; else goto _L1
_L1:
        jsonarray = jsonarray1;
        if (s == null) goto _L2; else goto _L3
_L3:
        int i;
        try
        {
            jsonarray1 = new JSONArray(s1);
        }
        // Misplaced declaration of an exception variable
        catch (SharedPreferences sharedpreferences)
        {
            Log.e("MixpanelAPI.PIdentity", "Waiting people records were unreadable.");
            return null;
        }
        jsonarray = new JSONArray();
        i = 0;
_L7:
        if (i < jsonarray1.length()) goto _L5; else goto _L4
_L4:
        sharedpreferences = sharedpreferences.edit();
        sharedpreferences.remove("waiting_array");
        writeEdits(sharedpreferences);
_L2:
        return jsonarray;
_L5:
        try
        {
            JSONObject jsonobject = jsonarray1.getJSONObject(i);
            jsonobject.put("$distinct_id", s);
            jsonarray.put(jsonobject);
        }
        catch (JSONException jsonexception)
        {
            Log.e("MixpanelAPI.PIdentity", "Unparsable object found in waiting people records", jsonexception);
        }
        i++;
        if (true) goto _L7; else goto _L6
_L6:
    }

    private static void writeEdits(android.content.SharedPreferences.Editor editor)
    {
        if (android.os.Build.VERSION.SDK_INT >= 9)
        {
            editor.apply();
            return;
        } else
        {
            editor.commit();
            return;
        }
    }

    private void writeIdentities()
    {
        android.content.SharedPreferences.Editor editor;
        editor = ((SharedPreferences)mLoadStoredPreferences.get()).edit();
        editor.putString("events_distinct_id", mEventsDistinctId);
        editor.putString("people_distinct_id", mPeopleDistinctId);
        if (mWaitingPeopleRecords != null)
        {
            break MISSING_BLOCK_LABEL_65;
        }
        editor.remove("waiting_array");
_L1:
        writeEdits(editor);
        return;
        try
        {
            editor.putString("waiting_array", mWaitingPeopleRecords.toString());
        }
        catch (ExecutionException executionexception)
        {
            Log.e("MixpanelAPI.PIdentity", "Can't write distinct ids to shared preferences.", executionexception.getCause());
            return;
        }
        catch (InterruptedException interruptedexception)
        {
            Log.e("MixpanelAPI.PIdentity", "Can't write distinct ids to shared preferences.", interruptedexception);
            return;
        }
          goto _L1
    }

    public static void writeReferrerPrefs(Context context, String s, Map map)
    {
        Object obj = sReferrerPrefsLock;
        obj;
        JVM INSTR monitorenter ;
        context = context.getSharedPreferences(s, 0).edit();
        context.clear();
        s = map.entrySet().iterator();
_L2:
        if (s.hasNext())
        {
            break MISSING_BLOCK_LABEL_57;
        }
        writeEdits(context);
        sReferrerPrefsDirty = true;
        return;
        map = (java.util.Map.Entry)s.next();
        context.putString((String)map.getKey(), (String)map.getValue());
        if (true) goto _L2; else goto _L1
_L1:
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    public void addSuperPropertiesToObject(JSONObject jsonobject)
    {
        this;
        JVM INSTR monitorenter ;
        JSONObject jsonobject1;
        Iterator iterator;
        jsonobject1 = getSuperPropertiesCache();
        iterator = jsonobject1.keys();
_L1:
        boolean flag = iterator.hasNext();
        if (flag)
        {
            break MISSING_BLOCK_LABEL_28;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        String s = (String)iterator.next();
        jsonobject.put(s, jsonobject1.get(s));
          goto _L1
        JSONException jsonexception;
        jsonexception;
        Log.wtf("MixpanelAPI.PIdentity", "Object read from one JSON Object cannot be written to another", jsonexception);
          goto _L1
        jsonobject;
        throw jsonobject;
    }

    public void clearPreferences()
    {
        this;
        JVM INSTR monitorenter ;
        android.content.SharedPreferences.Editor editor = ((SharedPreferences)mLoadStoredPreferences.get()).edit();
        editor.clear();
        writeEdits(editor);
        readSuperProperties();
        readIdentities();
        this;
        JVM INSTR monitorexit ;
        return;
        Object obj;
        obj;
        throw new RuntimeException(((ExecutionException) (obj)).getCause());
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        obj;
        throw new RuntimeException(((InterruptedException) (obj)).getCause());
    }

    public void clearPushId()
    {
        this;
        JVM INSTR monitorenter ;
        android.content.SharedPreferences.Editor editor = ((SharedPreferences)mLoadStoredPreferences.get()).edit();
        editor.remove("push_id");
        writeEdits(editor);
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
        Object obj;
        obj;
        Log.e("MixpanelAPI.PIdentity", "Can't write push id to shared preferences", ((ExecutionException) (obj)).getCause());
          goto _L1
        obj;
        throw obj;
        obj;
        Log.e("MixpanelAPI.PIdentity", "Can't write push id to shared preferences", ((Throwable) (obj)));
          goto _L1
    }

    public void clearSuperProperties()
    {
        this;
        JVM INSTR monitorenter ;
        mSuperPropertiesCache = new JSONObject();
        storeSuperProperties();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public String getEventsDistinctId()
    {
        this;
        JVM INSTR monitorenter ;
        String s;
        if (!mIdentitiesLoaded)
        {
            readIdentities();
        }
        s = mEventsDistinctId;
        this;
        JVM INSTR monitorexit ;
        return s;
        Exception exception;
        exception;
        throw exception;
    }

    public String getPeopleDistinctId()
    {
        this;
        JVM INSTR monitorenter ;
        String s;
        if (!mIdentitiesLoaded)
        {
            readIdentities();
        }
        s = mPeopleDistinctId;
        this;
        JVM INSTR monitorexit ;
        return s;
        Exception exception;
        exception;
        throw exception;
    }

    public String getPushId()
    {
        this;
        JVM INSTR monitorenter ;
        String s = null;
        String s1 = ((SharedPreferences)mLoadStoredPreferences.get()).getString("push_id", null);
        s = s1;
_L1:
        this;
        JVM INSTR monitorexit ;
        return s;
        Object obj;
        obj;
        Log.e("MixpanelAPI.PIdentity", "Can't write push id to shared preferences", ((ExecutionException) (obj)).getCause());
          goto _L1
        Exception exception;
        exception;
        throw exception;
        obj;
        Log.e("MixpanelAPI.PIdentity", "Can't write push id to shared preferences", ((Throwable) (obj)));
          goto _L1
    }

    public Map getReferrerProperties()
    {
        synchronized (sReferrerPrefsLock)
        {
            if (sReferrerPrefsDirty || mReferrerPropertiesCache == null)
            {
                readReferrerProperties();
                sReferrerPrefsDirty = false;
            }
        }
        return mReferrerPropertiesCache;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void registerSuperProperties(JSONObject jsonobject)
    {
        this;
        JVM INSTR monitorenter ;
        JSONObject jsonobject1;
        Iterator iterator;
        jsonobject1 = getSuperPropertiesCache();
        iterator = jsonobject.keys();
_L3:
        if (iterator.hasNext()) goto _L2; else goto _L1
_L1:
        storeSuperProperties();
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        String s = (String)iterator.next();
        jsonobject1.put(s, jsonobject.get(s));
          goto _L3
        JSONException jsonexception;
        jsonexception;
        Log.e("MixpanelAPI.PIdentity", "Exception registering super property.", jsonexception);
          goto _L3
        jsonobject;
        throw jsonobject;
    }

    public void registerSuperPropertiesOnce(JSONObject jsonobject)
    {
        this;
        JVM INSTR monitorenter ;
        JSONObject jsonobject1;
        Iterator iterator;
        jsonobject1 = getSuperPropertiesCache();
        iterator = jsonobject.keys();
_L4:
        if (iterator.hasNext()) goto _L2; else goto _L1
_L1:
        storeSuperProperties();
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        String s;
        boolean flag;
        s = (String)iterator.next();
        flag = jsonobject1.has(s);
        if (flag) goto _L4; else goto _L3
_L3:
        jsonobject1.put(s, jsonobject.get(s));
          goto _L4
        JSONException jsonexception;
        jsonexception;
        Log.e("MixpanelAPI.PIdentity", "Exception registering super property.", jsonexception);
          goto _L4
        jsonobject;
        throw jsonobject;
    }

    public void setEventsDistinctId(String s)
    {
        this;
        JVM INSTR monitorenter ;
        if (!mIdentitiesLoaded)
        {
            readIdentities();
        }
        mEventsDistinctId = s;
        writeIdentities();
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    public void setPeopleDistinctId(String s)
    {
        this;
        JVM INSTR monitorenter ;
        if (!mIdentitiesLoaded)
        {
            readIdentities();
        }
        mPeopleDistinctId = s;
        writeIdentities();
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    public void storePushId(String s)
    {
        this;
        JVM INSTR monitorenter ;
        android.content.SharedPreferences.Editor editor = ((SharedPreferences)mLoadStoredPreferences.get()).edit();
        editor.putString("push_id", s);
        writeEdits(editor);
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        Log.e("MixpanelAPI.PIdentity", "Can't write push id to shared preferences", s.getCause());
          goto _L1
        s;
        throw s;
        s;
        Log.e("MixpanelAPI.PIdentity", "Can't write push id to shared preferences", s);
          goto _L1
    }

    public void storeWaitingPeopleRecord(JSONObject jsonobject)
    {
        this;
        JVM INSTR monitorenter ;
        if (!mIdentitiesLoaded)
        {
            readIdentities();
        }
        if (mWaitingPeopleRecords == null)
        {
            mWaitingPeopleRecords = new JSONArray();
        }
        mWaitingPeopleRecords.put(jsonobject);
        writeIdentities();
        this;
        JVM INSTR monitorexit ;
        return;
        jsonobject;
        throw jsonobject;
    }

    public void unregisterSuperProperty(String s)
    {
        this;
        JVM INSTR monitorenter ;
        getSuperPropertiesCache().remove(s);
        storeSuperProperties();
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    public void updateSuperProperties(SuperPropertyUpdate superpropertyupdate)
    {
        this;
        JVM INSTR monitorenter ;
        JSONObject jsonobject;
        JSONObject jsonobject1;
        jsonobject = getSuperPropertiesCache();
        jsonobject1 = new JSONObject();
        Iterator iterator = jsonobject.keys();
_L3:
        boolean flag = iterator.hasNext();
        if (flag) goto _L2; else goto _L1
_L1:
        superpropertyupdate = superpropertyupdate.update(jsonobject1);
        if (superpropertyupdate != null)
        {
            break MISSING_BLOCK_LABEL_106;
        }
        Log.w("MixpanelAPI.PIdentity", "An update to Mixpanel's super properties returned null, and will have no effect.");
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        String s = (String)iterator.next();
        jsonobject1.put(s, jsonobject.get(s));
          goto _L3
        superpropertyupdate;
        Log.wtf("MixpanelAPI.PIdentity", "Can't copy from one JSONObject to another", superpropertyupdate);
          goto _L4
        superpropertyupdate;
        throw superpropertyupdate;
        mSuperPropertiesCache = superpropertyupdate;
        storeSuperProperties();
          goto _L4
    }

    public JSONArray waitingPeopleRecordsForSending()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj;
        Object obj1;
        obj1 = null;
        obj = null;
        JSONArray jsonarray = waitingPeopleRecordsForSending((SharedPreferences)mLoadStoredPreferences.get());
        obj = jsonarray;
        obj1 = jsonarray;
        readIdentities();
        obj = jsonarray;
_L2:
        this;
        JVM INSTR monitorexit ;
        return ((JSONArray) (obj));
        obj1;
        Log.e("MixpanelAPI.PIdentity", "Couldn't read waiting people records from shared preferences.", ((ExecutionException) (obj1)).getCause());
        continue; /* Loop/switch isn't completed */
        obj;
        throw obj;
        InterruptedException interruptedexception;
        interruptedexception;
        Log.e("MixpanelAPI.PIdentity", "Couldn't read waiting people records from shared preferences.", interruptedexception);
        interruptedexception = ((InterruptedException) (obj1));
        if (true) goto _L2; else goto _L1
_L1:
    }




}
