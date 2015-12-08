// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.viewcrawler;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.DisplayMetrics;
import android.util.JsonWriter;
import android.util.Log;
import android.util.Pair;
import com.mixpanel.android.mpmetrics.MPConfig;
import com.mixpanel.android.mpmetrics.MixpanelAPI;
import com.mixpanel.android.mpmetrics.SuperPropertyUpdate;
import com.mixpanel.android.mpmetrics.Tweaks;
import com.mixpanel.android.util.JSONUtils;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.lang.annotation.Annotation;
import java.net.URI;
import java.net.URISyntaxException;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.mixpanel.android.viewcrawler:
//            UpdatesFromMixpanel, TrackingDebug, EditState, DynamicEventTracker, 
//            FlipGesture, ImageStore, EditProtocol, EditorConnection, 
//            ViewSnapshot, ViewVisitor

public class ViewCrawler
    implements UpdatesFromMixpanel, TrackingDebug, ViewVisitor.OnLayoutErrorListener
{
    private class Editor
        implements EditorConnection.Editor
    {

        final ViewCrawler this$0;

        public void bindEvents(JSONObject jsonobject)
        {
            Message message = mMessageThreadHandler.obtainMessage(6);
            message.obj = jsonobject;
            mMessageThreadHandler.sendMessage(message);
        }

        public void cleanup()
        {
            Message message = mMessageThreadHandler.obtainMessage(8);
            mMessageThreadHandler.sendMessage(message);
        }

        public void clearEdits(JSONObject jsonobject)
        {
            Message message = mMessageThreadHandler.obtainMessage(10);
            message.obj = jsonobject;
            mMessageThreadHandler.sendMessage(message);
        }

        public void performEdit(JSONObject jsonobject)
        {
            Message message = mMessageThreadHandler.obtainMessage(3);
            message.obj = jsonobject;
            mMessageThreadHandler.sendMessage(message);
        }

        public void sendDeviceInfo()
        {
            Message message = mMessageThreadHandler.obtainMessage(4);
            mMessageThreadHandler.sendMessage(message);
        }

        public void sendSnapshot(JSONObject jsonobject)
        {
            Message message = mMessageThreadHandler.obtainMessage(2);
            message.obj = jsonobject;
            mMessageThreadHandler.sendMessage(message);
        }

        public void setTweaks(JSONObject jsonobject)
        {
            Message message = mMessageThreadHandler.obtainMessage(11);
            message.obj = jsonobject;
            mMessageThreadHandler.sendMessage(message);
        }

        private Editor()
        {
            this$0 = ViewCrawler.this;
            super();
        }

        Editor(Editor editor)
        {
            this();
        }
    }

    private class EmulatorConnector
        implements Runnable
    {

        private volatile boolean mStopped;
        final ViewCrawler this$0;

        public void run()
        {
            if (!mStopped)
            {
                Message message = mMessageThreadHandler.obtainMessage(1);
                mMessageThreadHandler.sendMessage(message);
            }
            mMessageThreadHandler.postDelayed(this, 30000L);
        }

        public void start()
        {
            mStopped = false;
            mMessageThreadHandler.post(this);
        }

        public void stop()
        {
            mStopped = true;
            mMessageThreadHandler.removeCallbacks(this);
        }

        public EmulatorConnector()
        {
            this$0 = ViewCrawler.this;
            super();
            mStopped = true;
        }
    }

    private class LifecycleCallbacks
        implements android.app.Application.ActivityLifecycleCallbacks, FlipGesture.OnFlipGestureListener
    {

        private final EmulatorConnector mEmulatorConnector;
        private final FlipGesture mFlipGesture = new FlipGesture(this);
        final ViewCrawler this$0;

        private void installConnectionSensor(Activity activity)
        {
            if (isInEmulator() && !mConfig.getDisableEmulatorBindingUI())
            {
                mEmulatorConnector.start();
            } else
            if (!mConfig.getDisableGestureBindingUI())
            {
                activity = (SensorManager)activity.getSystemService("sensor");
                android.hardware.Sensor sensor = activity.getDefaultSensor(1);
                activity.registerListener(mFlipGesture, sensor, 3);
                return;
            }
        }

        private boolean isInEmulator()
        {
            while (!Build.HARDWARE.equals("goldfish") || !Build.BRAND.startsWith("generic") || !Build.DEVICE.startsWith("generic") || !Build.PRODUCT.contains("sdk") || !Build.MODEL.toLowerCase(Locale.US).contains("sdk")) 
            {
                return false;
            }
            return true;
        }

        private void uninstallConnectionSensor(Activity activity)
        {
            if (isInEmulator() && !mConfig.getDisableEmulatorBindingUI())
            {
                mEmulatorConnector.stop();
            } else
            if (!mConfig.getDisableGestureBindingUI())
            {
                ((SensorManager)activity.getSystemService("sensor")).unregisterListener(mFlipGesture);
                return;
            }
        }

        public void onActivityCreated(Activity activity, Bundle bundle)
        {
        }

        public void onActivityDestroyed(Activity activity)
        {
        }

        public void onActivityPaused(Activity activity)
        {
            mEditState.remove(activity);
            if (mEditState.isEmpty())
            {
                uninstallConnectionSensor(activity);
            }
        }

        public void onActivityResumed(Activity activity)
        {
            installConnectionSensor(activity);
            mEditState.add(activity);
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle)
        {
        }

        public void onActivityStarted(Activity activity)
        {
        }

        public void onActivityStopped(Activity activity)
        {
        }

        public void onFlipGesture()
        {
            Message message = mMessageThreadHandler.obtainMessage(1);
            mMessageThreadHandler.sendMessage(message);
        }

        public LifecycleCallbacks()
        {
            this$0 = ViewCrawler.this;
            super();
            mEmulatorConnector = new EmulatorConnector();
        }
    }

    public static interface MessageType
        extends Annotation
    {
    }

    private static class VariantChange
    {

        public final String activityName;
        public final JSONObject change;
        public final Pair variantId;

        public VariantChange(String s, JSONObject jsonobject, Pair pair)
        {
            activityName = s;
            change = jsonobject;
            variantId = pair;
        }
    }

    private static class VariantTracker
    {

        private final MixpanelAPI mMixpanel;

        public void trackVariants(Set set)
        {
            JSONObject jsonobject;
            if (set.size() == 0)
            {
                return;
            }
            jsonobject = new JSONObject();
            set = set.iterator();
_L3:
            boolean flag = set.hasNext();
            if (flag) goto _L2; else goto _L1
_L1:
            mMixpanel.getPeople().merge("$experiments", jsonobject);
            mMixpanel.updateSuperProperties(jsonobject. new SuperPropertyUpdate() {

                final VariantTracker this$1;
                private final JSONObject val$variantObject;

                public JSONObject update(JSONObject jsonobject)
                {
                    try
                    {
                        jsonobject.put("$experiments", variantObject);
                    }
                    catch (JSONException jsonexception)
                    {
                        Log.wtf("MixpanelAPI.ViewCrawler", "Can't write $experiments super property", jsonexception);
                        return jsonobject;
                    }
                    return jsonobject;
                }

            
            {
                this$1 = final_varianttracker;
                variantObject = JSONObject.this;
                super();
            }
            });
            return;
_L2:
            Object obj = (Pair)set.next();
            int i = ((Integer)((Pair) (obj)).first).intValue();
            int j = ((Integer)((Pair) (obj)).second).intValue();
            obj = new JSONObject();
            ((JSONObject) (obj)).put("$experiment_id", i);
            ((JSONObject) (obj)).put("$variant_id", j);
            mMixpanel.track("$experiment_started", ((JSONObject) (obj)));
            jsonobject.put(Integer.toString(i), j);
              goto _L3
            set;
            Log.wtf("MixpanelAPI.ViewCrawler", "Could not build JSON for reporting experiment start", set);
              goto _L1
        }

        public VariantTracker(MixpanelAPI mixpanelapi)
        {
            mMixpanel = mixpanelapi;
        }
    }

    private class ViewCrawlerHandler extends Handler
    {

        private final Context mContext;
        private final List mEditorAssetUrls = new ArrayList();
        private final Map mEditorChanges = new HashMap();
        private EditorConnection mEditorConnection;
        private final List mEditorEventBindings = new ArrayList();
        private final ImageStore mImageStore;
        private final List mPersistentChanges = new ArrayList();
        private final List mPersistentEventBindings = new ArrayList();
        private final EditProtocol mProtocol;
        private final Set mSeenExperiments = new HashSet();
        private ViewSnapshot mSnapshot;
        private final Lock mStartLock = new ReentrantLock();
        private final String mToken;
        final ViewCrawler this$0;

        private void connectToEditor()
        {
            if (MPConfig.DEBUG)
            {
                Log.v("MixpanelAPI.ViewCrawler", "connecting to editor");
            }
            if (mEditorConnection != null && mEditorConnection.isValid())
            {
                if (MPConfig.DEBUG)
                {
                    Log.v("MixpanelAPI.ViewCrawler", "There is already a valid connection to an events editor.");
                }
            } else
            if (mSSLSocketFactory == null)
            {
                if (MPConfig.DEBUG)
                {
                    Log.v("MixpanelAPI.ViewCrawler", "SSL is not available on this device, no connection will be attempted to the events editor.");
                    return;
                }
            } else
            {
                String s = (new StringBuilder(String.valueOf(MPConfig.getInstance(mContext).getEditorUrl()))).append(mToken).toString();
                try
                {
                    java.net.Socket socket = mSSLSocketFactory.createSocket();
                    mEditorConnection = new EditorConnection(new URI(s), new Editor(null), socket);
                    return;
                }
                catch (URISyntaxException urisyntaxexception)
                {
                    Log.e("MixpanelAPI.ViewCrawler", (new StringBuilder("Error parsing URI ")).append(s).append(" for editor websocket").toString(), urisyntaxexception);
                    return;
                }
                catch (EditorConnection.EditorConnectionException editorconnectionexception)
                {
                    Log.e("MixpanelAPI.ViewCrawler", (new StringBuilder("Error connecting to URI ")).append(s).toString(), editorconnectionexception);
                    return;
                }
                catch (IOException ioexception)
                {
                    Log.i("MixpanelAPI.ViewCrawler", "Can't create SSL Socket to connect to editor service", ioexception);
                }
                return;
            }
        }

        private SharedPreferences getSharedPreferences()
        {
            String s = (new StringBuilder("mixpanel.viewcrawler.changes")).append(mToken).toString();
            return mContext.getSharedPreferences(s, 0);
        }

        private void handleEditorBindingsCleared(JSONObject jsonobject)
        {
            jsonobject = jsonobject.getJSONObject("payload").getJSONArray("actions");
            int i = 0;
_L3:
            int j = jsonobject.length();
            if (i < j) goto _L2; else goto _L1
_L1:
            updateEditState();
            return;
_L2:
            String s = jsonobject.getString(i);
            mEditorChanges.remove(s);
            i++;
              goto _L3
            jsonobject;
            Log.e("MixpanelAPI.ViewCrawler", "Bad clear request received", jsonobject);
              goto _L1
        }

        private void handleEditorBindingsReceived(JSONObject jsonobject)
        {
            int i;
            int j;
            try
            {
                jsonobject = jsonobject.getJSONObject("payload").getJSONArray("events");
            }
            // Misplaced declaration of an exception variable
            catch (JSONObject jsonobject)
            {
                Log.e("MixpanelAPI.ViewCrawler", "Bad event bindings received", jsonobject);
                return;
            }
            j = jsonobject.length();
            mEditorEventBindings.clear();
            i = 0;
            do
            {
                if (i >= j)
                {
                    updateEditState();
                    return;
                }
                try
                {
                    JSONObject jsonobject1 = jsonobject.getJSONObject(i);
                    String s = JSONUtils.optionalStringKey(jsonobject1, "target_activity");
                    mEditorEventBindings.add(new Pair(s, jsonobject1));
                }
                catch (JSONException jsonexception)
                {
                    Log.e("MixpanelAPI.ViewCrawler", (new StringBuilder("Bad event binding received from editor in ")).append(jsonobject.toString()).toString(), jsonexception);
                }
                i++;
            } while (true);
        }

        private void handleEditorChangeReceived(JSONObject jsonobject)
        {
            JSONObject jsonobject1;
            String s;
            String s1;
            int i;
            try
            {
                jsonobject = jsonobject.getJSONObject("payload").getJSONArray("actions");
            }
            // Misplaced declaration of an exception variable
            catch (JSONObject jsonobject)
            {
                Log.e("MixpanelAPI.ViewCrawler", "Bad change request received", jsonobject);
                return;
            }
            i = 0;
            if (i >= jsonobject.length())
            {
                updateEditState();
                return;
            }
            jsonobject1 = jsonobject.getJSONObject(i);
            s = JSONUtils.optionalStringKey(jsonobject1, "target_activity");
            s1 = jsonobject1.getString("name");
            mEditorChanges.put(s1, new Pair(s, jsonobject1));
            i++;
            if (false)
            {
            } else
            {
                break MISSING_BLOCK_LABEL_15;
            }
        }

        private void handleEditorClosed()
        {
            mEditorChanges.clear();
            mEditorEventBindings.clear();
            mSnapshot = null;
            if (MPConfig.DEBUG)
            {
                Log.v("MixpanelAPI.ViewCrawler", "Editor closed- freeing snapshot");
            }
            updateEditState();
            Iterator iterator = mEditorAssetUrls.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    return;
                }
                String s = (String)iterator.next();
                mImageStore.deleteStorage(s);
            } while (true);
        }

        private void handleEditorTweaksReceived(JSONObject jsonobject)
        {
            int i;
            int j;
            Object obj;
            try
            {
                jsonobject = jsonobject.getJSONObject("payload").getJSONArray("tweaks");
                j = jsonobject.length();
            }
            // Misplaced declaration of an exception variable
            catch (JSONObject jsonobject)
            {
                Log.e("MixpanelAPI.ViewCrawler", "Bad tweaks received", jsonobject);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (JSONObject jsonobject)
            {
                Log.e("MixpanelAPI.ViewCrawler", "Strange tweaks received", jsonobject);
                return;
            }
            i = 0;
              goto _L1
_L3:
            obj = jsonobject.getJSONObject(i);
            obj = mProtocol.readTweak(((JSONObject) (obj)));
            mTweaks.set((String)((Pair) (obj)).first, ((Pair) (obj)).second);
            i++;
_L1:
            if (i < j) goto _L3; else goto _L2
_L2:
        }

        private void handleEventBindingsReceived(JSONArray jsonarray)
        {
            android.content.SharedPreferences.Editor editor = getSharedPreferences().edit();
            editor.putString("mixpanel.viewcrawler.bindings", jsonarray.toString());
            editor.apply();
            initializeChanges();
        }

        private void handleVariantsReceived(JSONArray jsonarray)
        {
            android.content.SharedPreferences.Editor editor = getSharedPreferences().edit();
            editor.putString("mixpanel.viewcrawler.changes", jsonarray.toString());
            editor.apply();
            initializeChanges();
        }

        private void initializeChanges()
        {
            Object obj;
            Object obj1;
            Object obj3;
            obj = getSharedPreferences();
            obj3 = ((SharedPreferences) (obj)).getString("mixpanel.viewcrawler.changes", null);
            obj1 = ((SharedPreferences) (obj)).getString("mixpanel.viewcrawler.bindings", null);
            if (obj3 == null) goto _L2; else goto _L1
_L1:
            int k;
            mPersistentChanges.clear();
            obj3 = new JSONArray(((String) (obj3)));
            k = ((JSONArray) (obj3)).length();
            int i = 0;
              goto _L3
_L2:
            if (obj1 == null) goto _L5; else goto _L4
_L4:
            obj1 = new JSONArray(((String) (obj1)));
            mPersistentEventBindings.clear();
            i = 0;
_L12:
            int j = ((JSONArray) (obj1)).length();
            if (i < j) goto _L6; else goto _L5
_L5:
            updateEditState();
            return;
_L13:
            Object obj4;
            Pair pair;
            JSONArray jsonarray;
            obj4 = ((JSONArray) (obj3)).getJSONObject(i);
            j = ((JSONObject) (obj4)).getInt("id");
            pair = new Pair(Integer.valueOf(((JSONObject) (obj4)).getInt("experiment_id")), Integer.valueOf(j));
            jsonarray = ((JSONObject) (obj4)).getJSONArray("actions");
            j = 0;
_L11:
            if (j < jsonarray.length()) goto _L8; else goto _L7
_L7:
            int l;
            obj4 = ((JSONObject) (obj4)).getJSONArray("tweaks");
            l = ((JSONArray) (obj4)).length();
            j = 0;
              goto _L9
_L8:
            Object obj6 = jsonarray.getJSONObject(j);
            obj6 = new VariantChange(JSONUtils.optionalStringKey(((JSONObject) (obj6)), "target_activity"), ((JSONObject) (obj6)), pair);
            mPersistentChanges.add(obj6);
            j++;
            if (true) goto _L11; else goto _L10
_L10:
            Object obj5 = ((JSONArray) (obj4)).getJSONObject(j);
            obj5 = mProtocol.readTweak(((JSONObject) (obj5)));
            mTweaks.set((String)((Pair) (obj5)).first, ((Pair) (obj5)).second);
            j++;
            continue; /* Loop/switch isn't completed */
_L6:
            JSONObject jsonobject = ((JSONArray) (obj1)).getJSONObject(i);
            String s = JSONUtils.optionalStringKey(jsonobject, "target_activity");
            mPersistentEventBindings.add(new Pair(s, jsonobject));
            i++;
              goto _L12
            Object obj2;
            obj2;
            Log.i("MixpanelAPI.ViewCrawler", "JSON error when initializing saved changes, clearing persistent memory", ((Throwable) (obj2)));
            obj = ((SharedPreferences) (obj)).edit();
            ((android.content.SharedPreferences.Editor) (obj)).remove("mixpanel.viewcrawler.changes");
            ((android.content.SharedPreferences.Editor) (obj)).remove("mixpanel.viewcrawler.bindings");
            ((android.content.SharedPreferences.Editor) (obj)).apply();
              goto _L5
            obj2;
            Log.i("MixpanelAPI.ViewCrawler", "Bad instructions in saved changes, clearing persistent memory", ((Throwable) (obj2)));
            obj = ((SharedPreferences) (obj)).edit();
            ((android.content.SharedPreferences.Editor) (obj)).remove("mixpanel.viewcrawler.changes");
            ((android.content.SharedPreferences.Editor) (obj)).remove("mixpanel.viewcrawler.bindings");
            ((android.content.SharedPreferences.Editor) (obj)).apply();
              goto _L5
_L3:
            if (i < k) goto _L13; else goto _L2
_L9:
            if (j < l) goto _L10; else goto _L14
_L14:
            i++;
              goto _L3
        }

        private void loadKnownChanges()
        {
            Object obj;
            Object obj1;
            obj = getSharedPreferences();
            obj1 = ((SharedPreferences) (obj)).getString("mixpanel.viewcrawler.changes", null);
            if (obj1 == null) goto _L2; else goto _L1
_L1:
            int i;
            int j;
            Object obj2;
            int k;
            try
            {
                obj1 = new JSONArray(((String) (obj1)));
                j = ((JSONArray) (obj1)).length();
            }
            catch (JSONException jsonexception)
            {
                Log.e("MixpanelAPI.ViewCrawler", "Malformed variants found in persistent storage, clearing all variants", jsonexception);
                obj = ((SharedPreferences) (obj)).edit();
                ((android.content.SharedPreferences.Editor) (obj)).remove("mixpanel.viewcrawler.changes");
                ((android.content.SharedPreferences.Editor) (obj)).remove("mixpanel.viewcrawler.bindings");
                ((android.content.SharedPreferences.Editor) (obj)).apply();
                return;
            }
            i = 0;
              goto _L3
_L4:
            obj2 = ((JSONArray) (obj1)).getJSONObject(i);
            k = ((JSONObject) (obj2)).getInt("id");
            obj2 = new Pair(Integer.valueOf(((JSONObject) (obj2)).getInt("experiment")), Integer.valueOf(k));
            mSeenExperiments.add(obj2);
            i++;
_L3:
            if (i < j) goto _L4; else goto _L2
_L2:
        }

        private void sendDeviceInfo()
        {
            Object obj;
            if (mEditorConnection == null)
            {
                return;
            }
            obj = new JsonWriter(new OutputStreamWriter(mEditorConnection.getBufferedOutputStream()));
            Object obj1;
            ((JsonWriter) (obj)).beginObject();
            ((JsonWriter) (obj)).name("type").value("device_info_response");
            ((JsonWriter) (obj)).name("payload").beginObject();
            ((JsonWriter) (obj)).name("device_type").value("Android");
            ((JsonWriter) (obj)).name("device_name").value((new StringBuilder(String.valueOf(Build.BRAND))).append("/").append(Build.MODEL).toString());
            ((JsonWriter) (obj)).name("scaled_density").value(mScaledDensity);
            obj1 = mDeviceInfo.entrySet().iterator();
_L5:
            if (((Iterator) (obj1)).hasNext()) goto _L2; else goto _L1
_L1:
            obj1 = mTweaks.getAllValues();
            ((JsonWriter) (obj)).name("tweaks").beginArray();
            obj1 = ((Map) (obj1)).entrySet().iterator();
_L11:
            if (((Iterator) (obj1)).hasNext()) goto _L4; else goto _L3
_L3:
            ((JsonWriter) (obj)).endArray();
            ((JsonWriter) (obj)).endObject();
            ((JsonWriter) (obj)).endObject();
            try
            {
                ((JsonWriter) (obj)).close();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                Log.e("MixpanelAPI.ViewCrawler", "Can't close websocket writer", ((Throwable) (obj)));
            }
            return;
_L2:
            java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator) (obj1)).next();
            ((JsonWriter) (obj)).name((String)entry.getKey()).value((String)entry.getValue());
              goto _L5
            obj1;
            Log.e("MixpanelAPI.ViewCrawler", "Can't write device_info to server", ((Throwable) (obj1)));
            try
            {
                ((JsonWriter) (obj)).close();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                Log.e("MixpanelAPI.ViewCrawler", "Can't close websocket writer", ((Throwable) (obj)));
            }
            return;
_L4:
            com.mixpanel.android.mpmetrics.Tweaks.TweakValue tweakvalue;
            Object obj2 = (java.util.Map.Entry)((Iterator) (obj1)).next();
            tweakvalue = (com.mixpanel.android.mpmetrics.Tweaks.TweakValue)((java.util.Map.Entry) (obj2)).getValue();
            obj2 = (String)((java.util.Map.Entry) (obj2)).getKey();
            ((JsonWriter) (obj)).beginObject();
            ((JsonWriter) (obj)).name("name").value(((String) (obj2)));
            ((JsonWriter) (obj)).name("minimum").value(null);
            ((JsonWriter) (obj)).name("maximum").value(null);
            tweakvalue.type;
            JVM INSTR tableswitch 1 4: default 638
        //                       1 459
        //                       2 494
        //                       3 543
        //                       4 592;
               goto _L6 _L7 _L8 _L9 _L10
_L10:
            break MISSING_BLOCK_LABEL_592;
_L6:
            Log.wtf("MixpanelAPI.ViewCrawler", (new StringBuilder("Unrecognized Tweak Type ")).append(tweakvalue.type).append(" encountered.").toString());
_L12:
            ((JsonWriter) (obj)).endObject();
              goto _L11
            Exception exception;
            exception;
            try
            {
                ((JsonWriter) (obj)).close();
            }
            catch (IOException ioexception)
            {
                Log.e("MixpanelAPI.ViewCrawler", "Can't close websocket writer", ioexception);
            }
            throw exception;
_L7:
            ((JsonWriter) (obj)).name("type").value("boolean");
            ((JsonWriter) (obj)).name("value").value(tweakvalue.getBooleanValue().booleanValue());
              goto _L12
_L8:
            ((JsonWriter) (obj)).name("type").value("number");
            ((JsonWriter) (obj)).name("encoding").value("d");
            ((JsonWriter) (obj)).name("value").value(tweakvalue.getNumberValue().doubleValue());
              goto _L12
_L9:
            ((JsonWriter) (obj)).name("type").value("number");
            ((JsonWriter) (obj)).name("encoding").value("l");
            ((JsonWriter) (obj)).name("value").value(tweakvalue.getNumberValue().longValue());
              goto _L12
            ((JsonWriter) (obj)).name("type").value("string");
            ((JsonWriter) (obj)).name("value").value(tweakvalue.getStringValue());
              goto _L12
        }

        private void sendError(String s)
        {
            if (mEditorConnection == null)
            {
                return;
            }
            JSONObject jsonobject = new JSONObject();
            try
            {
                jsonobject.put("error_message", s);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                Log.e("MixpanelAPI.ViewCrawler", "Apparently impossible JSONException", s);
            }
            s = new OutputStreamWriter(mEditorConnection.getBufferedOutputStream());
            s.write("{\"type\": \"error\", ");
            s.write("\"payload\": ");
            s.write(jsonobject.toString());
            s.write("}");
            try
            {
                s.close();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                Log.e("MixpanelAPI.ViewCrawler", "Could not close output writer to editor", s);
            }
            return;
            Object obj;
            obj;
            Log.e("MixpanelAPI.ViewCrawler", "Can't write error message to editor", ((Throwable) (obj)));
            try
            {
                s.close();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                Log.e("MixpanelAPI.ViewCrawler", "Could not close output writer to editor", s);
            }
            return;
            obj;
            try
            {
                s.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                Log.e("MixpanelAPI.ViewCrawler", "Could not close output writer to editor", s);
            }
            throw obj;
        }

        private void sendLayoutError(ViewVisitor.LayoutErrorMessage layouterrormessage)
        {
            JsonWriter jsonwriter;
            if (mEditorConnection == null)
            {
                return;
            }
            jsonwriter = new JsonWriter(new OutputStreamWriter(mEditorConnection.getBufferedOutputStream()));
            jsonwriter.beginObject();
            jsonwriter.name("type").value("layout_error");
            jsonwriter.name("exception_type").value(layouterrormessage.getErrorType());
            jsonwriter.name("cid").value(layouterrormessage.getName());
            jsonwriter.endObject();
            try
            {
                jsonwriter.close();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (ViewVisitor.LayoutErrorMessage layouterrormessage)
            {
                Log.e("MixpanelAPI.ViewCrawler", "Can't close writer.", layouterrormessage);
            }
            return;
            layouterrormessage;
            Log.e("MixpanelAPI.ViewCrawler", "Can't write track_message to server", layouterrormessage);
            try
            {
                jsonwriter.close();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (ViewVisitor.LayoutErrorMessage layouterrormessage)
            {
                Log.e("MixpanelAPI.ViewCrawler", "Can't close writer.", layouterrormessage);
            }
            return;
            layouterrormessage;
            try
            {
                jsonwriter.close();
            }
            catch (IOException ioexception)
            {
                Log.e("MixpanelAPI.ViewCrawler", "Can't close writer.", ioexception);
            }
            throw layouterrormessage;
        }

        private void sendReportTrackToEditor(String s)
        {
            JsonWriter jsonwriter;
            if (mEditorConnection == null)
            {
                return;
            }
            jsonwriter = new JsonWriter(new OutputStreamWriter(mEditorConnection.getBufferedOutputStream()));
            jsonwriter.beginObject();
            jsonwriter.name("type").value("track_message");
            jsonwriter.name("payload");
            jsonwriter.beginObject();
            jsonwriter.name("event_name").value(s);
            jsonwriter.endObject();
            jsonwriter.endObject();
            jsonwriter.flush();
            try
            {
                jsonwriter.close();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                Log.e("MixpanelAPI.ViewCrawler", "Can't close writer.", s);
            }
            return;
            s;
            Log.e("MixpanelAPI.ViewCrawler", "Can't write track_message to server", s);
            try
            {
                jsonwriter.close();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                Log.e("MixpanelAPI.ViewCrawler", "Can't close writer.", s);
            }
            return;
            s;
            try
            {
                jsonwriter.close();
            }
            catch (IOException ioexception)
            {
                Log.e("MixpanelAPI.ViewCrawler", "Can't close writer.", ioexception);
            }
            throw s;
        }

        private void sendSnapshot(JSONObject jsonobject)
        {
            java.io.BufferedOutputStream bufferedoutputstream;
            long l;
            l = System.currentTimeMillis();
            try
            {
                jsonobject = jsonobject.getJSONObject("payload");
                if (jsonobject.has("config"))
                {
                    mSnapshot = mProtocol.readSnapshotConfig(jsonobject);
                    if (MPConfig.DEBUG)
                    {
                        Log.v("MixpanelAPI.ViewCrawler", "Initializing snapshot with configuration");
                    }
                }
            }
            // Misplaced declaration of an exception variable
            catch (JSONObject jsonobject)
            {
                Log.e("MixpanelAPI.ViewCrawler", "Payload with snapshot config required with snapshot request", jsonobject);
                sendError("Payload with snapshot config required with snapshot request");
                return;
            }
            // Misplaced declaration of an exception variable
            catch (JSONObject jsonobject)
            {
                Log.e("MixpanelAPI.ViewCrawler", "Editor sent malformed message with snapshot request", jsonobject);
                sendError(jsonobject.getMessage());
                return;
            }
            if (mSnapshot == null)
            {
                sendError("No snapshot configuration (or a malformed snapshot configuration) was sent.");
                Log.w("MixpanelAPI.ViewCrawler", "Mixpanel editor is misconfigured, sent a snapshot request without a valid configuration.");
                return;
            }
            bufferedoutputstream = mEditorConnection.getBufferedOutputStream();
            jsonobject = new OutputStreamWriter(bufferedoutputstream);
            jsonobject.write("{");
            jsonobject.write("\"type\": \"snapshot_response\",");
            jsonobject.write("\"payload\": {");
            jsonobject.write("\"activities\":");
            jsonobject.flush();
            mSnapshot.snapshots(mEditState, bufferedoutputstream);
            long l1 = System.currentTimeMillis();
            jsonobject.write(",\"snapshot_time_millis\": ");
            jsonobject.write(Long.toString(l1 - l));
            jsonobject.write("}");
            jsonobject.write("}");
            try
            {
                jsonobject.close();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (JSONObject jsonobject)
            {
                Log.e("MixpanelAPI.ViewCrawler", "Can't close writer.", jsonobject);
            }
            return;
            Object obj;
            obj;
            Log.e("MixpanelAPI.ViewCrawler", "Can't write snapshot request to server", ((Throwable) (obj)));
            try
            {
                jsonobject.close();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (JSONObject jsonobject)
            {
                Log.e("MixpanelAPI.ViewCrawler", "Can't close writer.", jsonobject);
            }
            return;
            obj;
            try
            {
                jsonobject.close();
            }
            // Misplaced declaration of an exception variable
            catch (JSONObject jsonobject)
            {
                Log.e("MixpanelAPI.ViewCrawler", "Can't close writer.", jsonobject);
            }
            throw obj;
        }

        private void updateEditState()
        {
            ArrayList arraylist;
            HashSet hashset;
            int i;
            int j;
            arraylist = new ArrayList();
            hashset = new HashSet();
            j = mPersistentChanges.size();
            i = 0;
_L9:
            if (i < j) goto _L2; else goto _L1
_L1:
            Object obj = mEditorChanges.values().iterator();
_L10:
            if (((Iterator) (obj)).hasNext()) goto _L4; else goto _L3
_L3:
            j = mPersistentEventBindings.size();
            i = 0;
_L11:
            if (i < j) goto _L6; else goto _L5
_L5:
            j = mEditorEventBindings.size();
            i = 0;
_L12:
            if (i < j) goto _L8; else goto _L7
_L7:
            Object obj2;
            obj2 = new HashMap();
            j = arraylist.size();
            i = 0;
_L13:
            if (i >= j)
            {
                mEditState.setEdits(((Map) (obj2)));
                mSeenExperiments.addAll(hashset);
                mVariantTracker.trackVariants(hashset);
                return;
            }
            break MISSING_BLOCK_LABEL_611;
_L2:
            obj = (VariantChange)mPersistentChanges.get(i);
            try
            {
                obj2 = mProtocol.readEdit(((VariantChange) (obj)).change);
                arraylist.add(new Pair(((VariantChange) (obj)).activityName, ((EditProtocol.Edit) (obj2)).visitor));
                if (!mSeenExperiments.contains(((VariantChange) (obj)).variantId))
                {
                    hashset.add(((VariantChange) (obj)).variantId);
                }
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                Log.v("MixpanelAPI.ViewCrawler", "Can't load assets for an edit, won't apply the change now", ((Throwable) (obj)));
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                Log.i("MixpanelAPI.ViewCrawler", ((EditProtocol.InapplicableInstructionsException) (obj)).getMessage());
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                Log.e("MixpanelAPI.ViewCrawler", "Bad persistent change request cannot be applied.", ((Throwable) (obj)));
            }
            i++;
              goto _L9
_L4:
            obj2 = (Pair)((Iterator) (obj)).next();
            try
            {
                EditProtocol.Edit edit = mProtocol.readEdit((JSONObject)((Pair) (obj2)).second);
                arraylist.add(new Pair((String)((Pair) (obj2)).first, edit.visitor));
                mEditorAssetUrls.addAll(edit.imageUrls);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj2)
            {
                Log.v("MixpanelAPI.ViewCrawler", "Can't load assets for an edit, won't apply the change now", ((Throwable) (obj2)));
            }
            // Misplaced declaration of an exception variable
            catch (Object obj2)
            {
                Log.i("MixpanelAPI.ViewCrawler", ((EditProtocol.InapplicableInstructionsException) (obj2)).getMessage());
            }
            // Misplaced declaration of an exception variable
            catch (Object obj2)
            {
                Log.e("MixpanelAPI.ViewCrawler", "Bad editor change request cannot be applied.", ((Throwable) (obj2)));
            }
              goto _L10
_L6:
            Pair pair = (Pair)mPersistentEventBindings.get(i);
            try
            {
                obj2 = mProtocol.readEventBinding((JSONObject)pair.second, mTracker);
                arraylist.add(new Pair((String)pair.first, obj2));
            }
            catch (EditProtocol.InapplicableInstructionsException inapplicableinstructionsexception)
            {
                Log.i("MixpanelAPI.ViewCrawler", inapplicableinstructionsexception.getMessage());
            }
            catch (EditProtocol.BadInstructionsException badinstructionsexception)
            {
                Log.e("MixpanelAPI.ViewCrawler", "Bad persistent event binding cannot be applied.", badinstructionsexception);
            }
            i++;
              goto _L11
_L8:
            Pair pair1 = (Pair)mEditorEventBindings.get(i);
            try
            {
                obj2 = mProtocol.readEventBinding((JSONObject)pair1.second, mTracker);
                arraylist.add(new Pair((String)pair1.first, obj2));
            }
            catch (EditProtocol.InapplicableInstructionsException inapplicableinstructionsexception1)
            {
                Log.i("MixpanelAPI.ViewCrawler", inapplicableinstructionsexception1.getMessage());
            }
            catch (EditProtocol.BadInstructionsException badinstructionsexception1)
            {
                Log.e("MixpanelAPI.ViewCrawler", "Bad editor event binding cannot be applied.", badinstructionsexception1);
            }
            i++;
              goto _L12
            Pair pair2 = (Pair)arraylist.get(i);
            Object obj1;
            if (((Map) (obj2)).containsKey(pair2.first))
            {
                obj1 = (List)((Map) (obj2)).get(pair2.first);
            } else
            {
                obj1 = new ArrayList();
                ((Map) (obj2)).put((String)pair2.first, obj1);
            }
            ((List) (obj1)).add((ViewVisitor)pair2.second);
            i++;
              goto _L13
        }

        public void handleMessage(Message message)
        {
            mStartLock.lock();
            int i = message.what;
            i;
            JVM INSTR tableswitch 0 12: default 80
        //                       0 90
        //                       1 113
        //                       2 127
        //                       3 183
        //                       4 120
        //                       5 197
        //                       6 211
        //                       7 141
        //                       8 253
        //                       9 169
        //                       10 225
        //                       11 239
        //                       12 155;
               goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14
_L1:
            break; /* Loop/switch isn't completed */
_L10:
            break MISSING_BLOCK_LABEL_253;
_L15:
            mStartLock.unlock();
            return;
_L2:
            loadKnownChanges();
            initializeChanges();
              goto _L15
            message;
            mStartLock.unlock();
            throw message;
_L3:
            connectToEditor();
              goto _L15
_L6:
            sendDeviceInfo();
              goto _L15
_L4:
            sendSnapshot((JSONObject)message.obj);
              goto _L15
_L9:
            sendReportTrackToEditor((String)message.obj);
              goto _L15
_L14:
            sendLayoutError((ViewVisitor.LayoutErrorMessage)message.obj);
              goto _L15
_L11:
            handleVariantsReceived((JSONArray)message.obj);
              goto _L15
_L5:
            handleEditorChangeReceived((JSONObject)message.obj);
              goto _L15
_L7:
            handleEventBindingsReceived((JSONArray)message.obj);
              goto _L15
_L8:
            handleEditorBindingsReceived((JSONObject)message.obj);
              goto _L15
_L12:
            handleEditorBindingsCleared((JSONObject)message.obj);
              goto _L15
_L13:
            handleEditorTweaksReceived((JSONObject)message.obj);
              goto _L15
            handleEditorClosed();
              goto _L15
        }

        public void start()
        {
            mStartLock.unlock();
        }

        public ViewCrawlerHandler(Context context, String s, Looper looper, ViewVisitor.OnLayoutErrorListener onlayouterrorlistener)
        {
            this$0 = ViewCrawler.this;
            super(looper);
            mContext = context;
            mToken = s;
            mSnapshot = null;
            s = mConfig.getResourcePackageName();
            viewcrawler = s;
            if (s == null)
            {
                viewcrawler = context.getPackageName();
            }
            viewcrawler = new com.mixpanel.android.mpmetrics.ResourceReader.Ids(ViewCrawler.this, context);
            mImageStore = new ImageStore(context);
            mProtocol = new EditProtocol(ViewCrawler.this, mImageStore, onlayouterrorlistener);
            mStartLock.lock();
        }
    }


    private static final int EMULATOR_CONNECT_ATTEMPT_INTERVAL_MILLIS = 30000;
    private static final String LOGTAG = "MixpanelAPI.ViewCrawler";
    private static final int MESSAGE_CONNECT_TO_EDITOR = 1;
    private static final int MESSAGE_EVENT_BINDINGS_RECEIVED = 5;
    private static final int MESSAGE_HANDLE_EDITOR_BINDINGS_RECEIVED = 6;
    private static final int MESSAGE_HANDLE_EDITOR_CHANGES_CLEARED = 10;
    private static final int MESSAGE_HANDLE_EDITOR_CHANGES_RECEIVED = 3;
    private static final int MESSAGE_HANDLE_EDITOR_CLOSED = 8;
    private static final int MESSAGE_HANDLE_EDITOR_TWEAKS_RECEIVED = 11;
    private static final int MESSAGE_INITIALIZE_CHANGES = 0;
    private static final int MESSAGE_SEND_DEVICE_INFO = 4;
    private static final int MESSAGE_SEND_EVENT_TRACKED = 7;
    private static final int MESSAGE_SEND_LAYOUT_ERROR = 12;
    private static final int MESSAGE_SEND_STATE_FOR_EDITING = 2;
    private static final int MESSAGE_VARIANTS_RECEIVED = 9;
    private static final String SHARED_PREF_BINDINGS_KEY = "mixpanel.viewcrawler.bindings";
    private static final String SHARED_PREF_CHANGES_KEY = "mixpanel.viewcrawler.changes";
    private static final String SHARED_PREF_EDITS_FILE = "mixpanel.viewcrawler.changes";
    private final MPConfig mConfig;
    private final Map mDeviceInfo;
    private final EditState mEditState = new EditState();
    private final ViewCrawlerHandler mMessageThreadHandler;
    private final SSLSocketFactory mSSLSocketFactory;
    private final float mScaledDensity;
    private final DynamicEventTracker mTracker;
    private final Tweaks mTweaks;
    private final VariantTracker mVariantTracker;

    public ViewCrawler(Context context, String s, MixpanelAPI mixpanelapi, Tweaks tweaks)
    {
        mConfig = MPConfig.getInstance(context);
        mTweaks = tweaks;
        mDeviceInfo = mixpanelapi.getDeviceInfo();
        mScaledDensity = Resources.getSystem().getDisplayMetrics().scaledDensity;
        ((Application)context.getApplicationContext()).registerActivityLifecycleCallbacks(new LifecycleCallbacks());
        tweaks = new HandlerThread(com/mixpanel/android/viewcrawler/ViewCrawler.getCanonicalName());
        tweaks.setPriority(10);
        tweaks.start();
        mMessageThreadHandler = new ViewCrawlerHandler(context, s, tweaks.getLooper(), this);
        mTracker = new DynamicEventTracker(mixpanelapi, mMessageThreadHandler);
        mVariantTracker = new VariantTracker(mixpanelapi);
        try
        {
            context = SSLContext.getInstance("TLS");
            context.init(null, null, null);
            context = context.getSocketFactory();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.i("MixpanelAPI.ViewCrawler", "System has no SSL support. Built-in events editor will not be available", context);
            context = null;
        }
        mSSLSocketFactory = context;
        mTweaks.addOnTweakDeclaredListener(new com.mixpanel.android.mpmetrics.Tweaks.OnTweakDeclaredListener() {

            final ViewCrawler this$0;

            public void onTweakDeclared()
            {
                Message message = mMessageThreadHandler.obtainMessage(4);
                mMessageThreadHandler.sendMessage(message);
            }

            
            {
                this$0 = ViewCrawler.this;
                super();
            }
        });
    }

    public Tweaks getTweaks()
    {
        return mTweaks;
    }

    public void onLayoutError(ViewVisitor.LayoutErrorMessage layouterrormessage)
    {
        Message message = mMessageThreadHandler.obtainMessage();
        message.what = 12;
        message.obj = layouterrormessage;
        mMessageThreadHandler.sendMessage(message);
    }

    public void reportTrack(String s)
    {
        Message message = mMessageThreadHandler.obtainMessage();
        message.what = 7;
        message.obj = s;
        mMessageThreadHandler.sendMessage(message);
    }

    public void setEventBindings(JSONArray jsonarray)
    {
        Message message = mMessageThreadHandler.obtainMessage(5);
        message.obj = jsonarray;
        mMessageThreadHandler.sendMessage(message);
    }

    public void setVariants(JSONArray jsonarray)
    {
        Message message = mMessageThreadHandler.obtainMessage(9);
        message.obj = jsonarray;
        mMessageThreadHandler.sendMessage(message);
    }

    public void startUpdates()
    {
        mMessageThreadHandler.start();
        mMessageThreadHandler.sendMessage(mMessageThreadHandler.obtainMessage(0));
    }









}
