// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.mpmetrics;

import android.app.Activity;
import android.app.Application;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.mixpanel.android.surveys.SurveyActivity;
import com.mixpanel.android.util.ActivityImageUtils;
import com.mixpanel.android.viewcrawler.TrackingDebug;
import com.mixpanel.android.viewcrawler.UpdatesFromMixpanel;
import com.mixpanel.android.viewcrawler.ViewCrawler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.mixpanel.android.mpmetrics:
//            SharedPreferencesLoader, Tweaks, PersistentIdentity, DecideMessages, 
//            AnalyticsMessages, ConfigurationChecker, MPConfig, MixpanelActivityLifecycleCallbacks, 
//            Tweak, SuperPropertyUpdate, OnMixpanelUpdatesReceivedListener, SurveyCallbacks, 
//            InAppNotification, Survey, UpdateDisplayState, BackgroundCapture, 
//            InAppFragment

public class MixpanelAPI
{
    static interface InstanceProcessor
    {

        public abstract void process(MixpanelAPI mixpanelapi);
    }

    public static interface People
    {

        public abstract void addOnMixpanelUpdatesReceivedListener(OnMixpanelUpdatesReceivedListener onmixpanelupdatesreceivedlistener);

        public abstract void append(String s, Object obj);

        public abstract void checkForSurvey(SurveyCallbacks surveycallbacks);

        public abstract void checkForSurvey(SurveyCallbacks surveycallbacks, Activity activity);

        public abstract void clearCharges();

        public abstract void clearPushRegistrationId();

        public abstract void deleteUser();

        public abstract String getDistinctId();

        public abstract InAppNotification getNotificationIfAvailable();

        public abstract Survey getSurveyIfAvailable();

        public abstract void identify(String s);

        public abstract void increment(String s, double d);

        public abstract void increment(Map map);

        public abstract void initPushHandling(String s);

        public abstract void joinExperimentIfAvailable();

        public abstract void merge(String s, JSONObject jsonobject);

        public abstract void removeOnMixpanelUpdatesReceivedListener(OnMixpanelUpdatesReceivedListener onmixpanelupdatesreceivedlistener);

        public abstract void set(String s, Object obj);

        public abstract void set(JSONObject jsonobject);

        public abstract void setMap(Map map);

        public abstract void setOnce(String s, Object obj);

        public abstract void setOnce(JSONObject jsonobject);

        public abstract void setOnceMap(Map map);

        public abstract void setPushRegistrationId(String s);

        public abstract void showGivenNotification(InAppNotification inappnotification, Activity activity);

        public abstract void showNotificationById(int i, Activity activity);

        public abstract void showNotificationIfAvailable(Activity activity);

        public abstract void showSurvey(Survey survey, Activity activity);

        public abstract void showSurveyById(int i, Activity activity);

        public abstract void showSurveyIfAvailable(Activity activity);

        public abstract void trackCharge(double d, JSONObject jsonobject);

        public abstract void trackNotification(String s, InAppNotification inappnotification);

        public abstract void trackNotificationSeen(InAppNotification inappnotification);

        public abstract void union(String s, JSONArray jsonarray);

        public abstract void unset(String s);

        public abstract People withIdentity(String s);
    }

    private class PeopleImpl
        implements People
    {

        final MixpanelAPI this$0;

        private void registerForPushIdAPI19AndOlder(String s)
        {
            try
            {
                if (MPConfig.DEBUG)
                {
                    Log.v("MixpanelAPI.API", "Registering a new push id");
                }
                Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
                intent.putExtra("app", PendingIntent.getBroadcast(mContext, 0, new Intent(), 0));
                intent.putExtra("sender", s);
                mContext.startService(intent);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                Log.w("MixpanelAPI.API", s);
            }
        }

        private void registerForPushIdAPI21AndUp(String s)
        {
            mMessages.registerForGCM(s);
        }

        private void showGivenOrAvailableNotification(final InAppNotification notifOrNull, Activity activity)
        {
            if (android.os.Build.VERSION.SDK_INT < 16)
            {
                if (MPConfig.DEBUG)
                {
                    Log.v("MixpanelAPI.API", "Will not show notifications, os version is too low.");
                }
                return;
            } else
            {
                activity.runOnUiThread(activity. new Runnable() {

                    private static int $SWITCH_TABLE$com$mixpanel$android$mpmetrics$InAppNotification$Type[];
                    final PeopleImpl this$1;
                    private final InAppNotification val$notifOrNull;
                    private final Activity val$parent;

                    static int[] $SWITCH_TABLE$com$mixpanel$android$mpmetrics$InAppNotification$Type()
                    {
                        int ai[] = $SWITCH_TABLE$com$mixpanel$android$mpmetrics$InAppNotification$Type;
                        if (ai != null)
                        {
                            return ai;
                        }
                        ai = new int[InAppNotification.Type.values().length];
                        try
                        {
                            ai[InAppNotification.Type.MINI.ordinal()] = 2;
                        }
                        catch (NoSuchFieldError nosuchfielderror2) { }
                        try
                        {
                            ai[InAppNotification.Type.TAKEOVER.ordinal()] = 3;
                        }
                        catch (NoSuchFieldError nosuchfielderror1) { }
                        try
                        {
                            ai[InAppNotification.Type.UNKNOWN.ordinal()] = 1;
                        }
                        catch (NoSuchFieldError nosuchfielderror) { }
                        $SWITCH_TABLE$com$mixpanel$android$mpmetrics$InAppNotification$Type = ai;
                        return ai;
                    }

                    public void run()
                    {
                        ReentrantLock reentrantlock;
                        reentrantlock = UpdateDisplayState.getLockObject();
                        reentrantlock.lock();
                        if (!UpdateDisplayState.hasCurrentProposal())
                        {
                            break MISSING_BLOCK_LABEL_33;
                        }
                        if (MPConfig.DEBUG)
                        {
                            Log.v("MixpanelAPI.API", "DisplayState is locked, will not show notifications.");
                        }
                        reentrantlock.unlock();
                        return;
                        Object obj = notifOrNull;
                        InAppNotification inappnotification;
                        inappnotification = ((InAppNotification) (obj));
                        if (obj != null)
                        {
                            break MISSING_BLOCK_LABEL_52;
                        }
                        inappnotification = getNotificationIfAvailable();
                        if (inappnotification != null)
                        {
                            break MISSING_BLOCK_LABEL_75;
                        }
                        if (MPConfig.DEBUG)
                        {
                            Log.v("MixpanelAPI.API", "No notification available, will not show.");
                        }
                        reentrantlock.unlock();
                        return;
                        obj = inappnotification.getType();
                        if (obj != InAppNotification.Type.TAKEOVER || ConfigurationChecker.checkSurveyActivityAvailable(parent.getApplicationContext()))
                        {
                            break MISSING_BLOCK_LABEL_119;
                        }
                        if (MPConfig.DEBUG)
                        {
                            Log.v("MixpanelAPI.API", "Application is not configured to show takeover notifications, none will be shown.");
                        }
                        reentrantlock.unlock();
                        return;
                        int i = UpdateDisplayState.proposeDisplay(new UpdateDisplayState.DisplayState.InAppNotificationState(inappnotification, ActivityImageUtils.getHighlightColorFromBackground(parent)), getDistinctId(), mToken);
                        if (i > 0)
                        {
                            break MISSING_BLOCK_LABEL_174;
                        }
                        Log.e("MixpanelAPI.API", "DisplayState Lock in inconsistent state! Please report this issue to Mixpanel");
                        reentrantlock.unlock();
                        return;
                        $SWITCH_TABLE$com$mixpanel$android$mpmetrics$InAppNotification$Type()[((InAppNotification.Type) (obj)).ordinal()];
                        JVM INSTR tableswitch 2 3: default 452
                    //                                   2 260
                    //                                   3 386;
                           goto _L1 _L2 _L3
_L3:
                        break MISSING_BLOCK_LABEL_386;
_L1:
                        Log.e("MixpanelAPI.API", (new StringBuilder("Unrecognized notification type ")).append(obj).append(" can't be shown").toString());
_L4:
                        if (!mConfig.getTestMode())
                        {
                            trackNotificationSeen(inappnotification);
                        }
                        reentrantlock.unlock();
                        return;
_L2:
                        Object obj1 = UpdateDisplayState.claimDisplayState(i);
                        if (obj1 != null)
                        {
                            break MISSING_BLOCK_LABEL_291;
                        }
                        if (MPConfig.DEBUG)
                        {
                            Log.v("MixpanelAPI.API", "Notification's display proposal was already consumed, no notification will be shown.");
                        }
                        reentrantlock.unlock();
                        return;
                        InAppFragment inappfragment = new InAppFragment();
                        inappfragment.setDisplayState(_fld0, i, (UpdateDisplayState.DisplayState.InAppNotificationState)((UpdateDisplayState) (obj1)).getDisplayState());
                        inappfragment.setRetainInstance(true);
                        if (MPConfig.DEBUG)
                        {
                            Log.v("MixpanelAPI.API", "Attempting to show mini notification.");
                        }
                        obj1 = parent.getFragmentManager().beginTransaction();
                        ((FragmentTransaction) (obj1)).setCustomAnimations(0, com.mixpanel.android.R.anim.com_mixpanel_android_slide_down);
                        ((FragmentTransaction) (obj1)).add(0x1020002, inappfragment);
                        ((FragmentTransaction) (obj1)).commit();
                          goto _L4
                        Exception exception;
                        exception;
                        reentrantlock.unlock();
                        throw exception;
                        if (MPConfig.DEBUG)
                        {
                            Log.v("MixpanelAPI.API", "Sending intent for takeover notification.");
                        }
                        Intent intent = new Intent(parent.getApplicationContext(), com/mixpanel/android/surveys/SurveyActivity);
                        intent.addFlags(0x10000000);
                        intent.addFlags(0x20000);
                        intent.putExtra("com.mixpanel.android.surveys.SurveyActivity.INTENT_ID_KEY", i);
                        parent.startActivity(intent);
                          goto _L4
                    }

            
            {
                this$1 = final_peopleimpl;
                notifOrNull = inappnotification;
                parent = Activity.this;
                super();
            }
                });
                return;
            }
        }

        private void showGivenOrAvailableSurvey(final Survey surveyDisplay, final Activity parent)
        {
            if (android.os.Build.VERSION.SDK_INT >= 16) goto _L2; else goto _L1
_L1:
            if (MPConfig.DEBUG)
            {
                Log.v("MixpanelAPI.API", "Will not show survey, os version is too low.");
            }
_L4:
            return;
_L2:
            if (ConfigurationChecker.checkSurveyActivityAvailable(parent.getApplicationContext()))
            {
                break; /* Loop/switch isn't completed */
            }
            if (MPConfig.DEBUG)
            {
                Log.v("MixpanelAPI.API", "Will not show survey, application isn't configured appropriately.");
                return;
            }
            if (true) goto _L4; else goto _L3
_L3:
            ReentrantLock reentrantlock;
            reentrantlock = UpdateDisplayState.getLockObject();
            reentrantlock.lock();
            boolean flag = UpdateDisplayState.hasCurrentProposal();
            Survey survey;
            if (flag)
            {
                reentrantlock.unlock();
                return;
            }
            survey = surveyDisplay;
            if (surveyDisplay != null)
            {
                break MISSING_BLOCK_LABEL_85;
            }
            survey = getSurveyIfAvailable();
            if (survey == null)
            {
                reentrantlock.unlock();
                return;
            }
            int i;
            surveyDisplay = new UpdateDisplayState.DisplayState.SurveyState(survey);
            i = UpdateDisplayState.proposeDisplay(surveyDisplay, getDistinctId(), mToken);
            if (i > 0)
            {
                break MISSING_BLOCK_LABEL_140;
            }
            Log.e("MixpanelAPI.API", "DisplayState Lock is in an inconsistent state! Please report this issue to Mixpanel");
            reentrantlock.unlock();
            return;
            surveyDisplay = i. new BackgroundCapture.OnBackgroundCapturedListener() {

                final PeopleImpl this$1;
                private final int val$intentId;
                private final Activity val$parent;
                private final UpdateDisplayState.DisplayState.SurveyState val$surveyDisplay;

                public void onBackgroundCaptured(Bitmap bitmap, int i)
                {
                    surveyDisplay.setBackground(bitmap);
                    surveyDisplay.setHighlightColor(i);
                    bitmap = new Intent(parent.getApplicationContext(), com/mixpanel/android/surveys/SurveyActivity);
                    bitmap.addFlags(0x10000000);
                    bitmap.addFlags(0x20000);
                    bitmap.putExtra("com.mixpanel.android.surveys.SurveyActivity.INTENT_ID_KEY", intentId);
                    parent.startActivity(bitmap);
                }

            
            {
                this$1 = final_peopleimpl;
                surveyDisplay = surveystate;
                parent = activity;
                intentId = I.this;
                super();
            }
            };
            reentrantlock.unlock();
            BackgroundCapture.captureBackground(parent, surveyDisplay);
            return;
            surveyDisplay;
            reentrantlock.unlock();
            throw surveyDisplay;
        }

        private JSONObject stdPeopleMessage(String s, Object obj)
            throws JSONException
        {
            JSONObject jsonobject = new JSONObject();
            String s1 = getDistinctId();
            jsonobject.put(s, obj);
            jsonobject.put("$token", mToken);
            jsonobject.put("$time", System.currentTimeMillis());
            if (s1 != null)
            {
                jsonobject.put("$distinct_id", s1);
            }
            return jsonobject;
        }

        public void addOnMixpanelUpdatesReceivedListener(OnMixpanelUpdatesReceivedListener onmixpanelupdatesreceivedlistener)
        {
            mUpdatesListener.addOnMixpanelUpdatesReceivedListener(onmixpanelupdatesreceivedlistener);
        }

        public void append(String s, Object obj)
        {
            try
            {
                JSONObject jsonobject = new JSONObject();
                jsonobject.put(s, obj);
                s = stdPeopleMessage("$append", jsonobject);
                recordPeopleMessage(s);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                Log.e("MixpanelAPI.API", "Exception appending a property", s);
            }
        }

        public void checkForSurvey(SurveyCallbacks surveycallbacks)
        {
            Log.i("MixpanelAPI.API", "MixpanelAPI.checkForSurvey is deprecated. Calling is now a no-op.\n    to query surveys, call MixpanelAPI.getPeople().getSurveyIfAvailable()");
        }

        public void checkForSurvey(SurveyCallbacks surveycallbacks, Activity activity)
        {
            Log.i("MixpanelAPI.API", "MixpanelAPI.checkForSurvey is deprecated. Calling is now a no-op.\n    to query surveys, call MixpanelAPI.getPeople().getSurveyIfAvailable()");
        }

        public void clearCharges()
        {
            unset("$transactions");
        }

        public void clearPushRegistrationId()
        {
            mPersistentIdentity.clearPushId();
            set("$android_devices", new JSONArray());
        }

        public void deleteUser()
        {
            try
            {
                JSONObject jsonobject = stdPeopleMessage("$delete", JSONObject.NULL);
                recordPeopleMessage(jsonobject);
                return;
            }
            catch (JSONException jsonexception)
            {
                Log.e("MixpanelAPI.API", "Exception deleting a user");
            }
        }

        public String getDistinctId()
        {
            return mPersistentIdentity.getPeopleDistinctId();
        }

        public InAppNotification getNotificationIfAvailable()
        {
            return mDecideMessages.getNotification(mConfig.getTestMode());
        }

        public Survey getSurveyIfAvailable()
        {
            return mDecideMessages.getSurvey(mConfig.getTestMode());
        }

        public void identify(String s)
        {
            synchronized (mPersistentIdentity)
            {
                mPersistentIdentity.setPeopleDistinctId(s);
                mDecideMessages.setDistinctId(s);
            }
            pushWaitingPeopleRecord();
            return;
            s;
            persistentidentity;
            JVM INSTR monitorexit ;
            throw s;
        }

        public void increment(String s, double d)
        {
            HashMap hashmap = new HashMap();
            hashmap.put(s, Double.valueOf(d));
            increment(((Map) (hashmap)));
        }

        public void increment(Map map)
        {
            map = new JSONObject(map);
            try
            {
                map = stdPeopleMessage("$add", map);
                recordPeopleMessage(map);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Map map)
            {
                Log.e("MixpanelAPI.API", "Exception incrementing properties", map);
            }
        }

        public void initPushHandling(String s)
        {
            if (!ConfigurationChecker.checkPushConfiguration(mContext))
            {
                Log.i("MixpanelAPI.API", "Can't register for push notification services. Push notifications will not work.");
                Log.i("MixpanelAPI.API", (new StringBuilder("See log tagged ")).append(ConfigurationChecker.LOGTAG).append(" above for details.").toString());
                return;
            }
            String s1 = mPersistentIdentity.getPushId();
            if (s1 == null)
            {
                if (android.os.Build.VERSION.SDK_INT >= 21)
                {
                    registerForPushIdAPI21AndUp(s);
                    return;
                } else
                {
                    registerForPushIdAPI19AndOlder(s);
                    return;
                }
            } else
            {
                MixpanelAPI.allInstances(s1. new InstanceProcessor() {

                    final PeopleImpl this$1;
                    private final String val$pushId;

                    public void process(MixpanelAPI mixpanelapi)
                    {
                        if (MPConfig.DEBUG)
                        {
                            Log.v("MixpanelAPI.API", (new StringBuilder("Using existing pushId ")).append(pushId).toString());
                        }
                        mixpanelapi.getPeople().setPushRegistrationId(pushId);
                    }

            
            {
                this$1 = final_peopleimpl;
                pushId = String.this;
                super();
            }
                });
                return;
            }
        }

        public void joinExperimentIfAvailable()
        {
            JSONArray jsonarray = mDecideMessages.getVariants();
            if (jsonarray != null)
            {
                mUpdatesFromMixpanel.setVariants(jsonarray);
            }
        }

        public void merge(String s, JSONObject jsonobject)
        {
            JSONObject jsonobject1 = new JSONObject();
            try
            {
                jsonobject1.put(s, jsonobject);
                s = stdPeopleMessage("$merge", jsonobject1);
                recordPeopleMessage(s);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                Log.e("MixpanelAPI.API", "Exception merging a property", s);
            }
        }

        public void removeOnMixpanelUpdatesReceivedListener(OnMixpanelUpdatesReceivedListener onmixpanelupdatesreceivedlistener)
        {
            mUpdatesListener.removeOnMixpanelUpdatesReceivedListener(onmixpanelupdatesreceivedlistener);
        }

        public void set(String s, Object obj)
        {
            try
            {
                set((new JSONObject()).put(s, obj));
                return;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                Log.e("MixpanelAPI.API", "set", s);
            }
        }

        public void set(JSONObject jsonobject)
        {
            JSONObject jsonobject1;
            Iterator iterator;
            jsonobject1 = new JSONObject(mDeviceInfo);
            iterator = jsonobject.keys();
_L1:
            if (!iterator.hasNext())
            {
                jsonobject = stdPeopleMessage("$set", jsonobject1);
                recordPeopleMessage(jsonobject);
                return;
            }
            try
            {
                String s = (String)iterator.next();
                jsonobject1.put(s, jsonobject.get(s));
            }
            // Misplaced declaration of an exception variable
            catch (JSONObject jsonobject)
            {
                Log.e("MixpanelAPI.API", "Exception setting people properties", jsonobject);
                return;
            }
              goto _L1
        }

        public void setMap(Map map)
        {
            if (map == null)
            {
                Log.e("MixpanelAPI.API", "setMap does not accept null properties");
                return;
            }
            try
            {
                set(new JSONObject(map));
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Map map)
            {
                Log.w("MixpanelAPI.API", "Can't have null keys in the properties of setMap!");
            }
        }

        public void setOnce(String s, Object obj)
        {
            try
            {
                setOnce((new JSONObject()).put(s, obj));
                return;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                Log.e("MixpanelAPI.API", "set", s);
            }
        }

        public void setOnce(JSONObject jsonobject)
        {
            try
            {
                jsonobject = stdPeopleMessage("$set_once", jsonobject);
                recordPeopleMessage(jsonobject);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (JSONObject jsonobject)
            {
                Log.e("MixpanelAPI.API", "Exception setting people properties");
            }
        }

        public void setOnceMap(Map map)
        {
            if (map == null)
            {
                Log.e("MixpanelAPI.API", "setOnceMap does not accept null properties");
                return;
            }
            try
            {
                setOnce(new JSONObject(map));
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Map map)
            {
                Log.w("MixpanelAPI.API", "Can't have null keys in the properties setOnceMap!");
            }
        }

        public void setPushRegistrationId(String s)
        {
label0:
            {
                synchronized (mPersistentIdentity)
                {
                    if (mPersistentIdentity.getPeopleDistinctId() != null)
                    {
                        break label0;
                    }
                }
                return;
            }
            mPersistentIdentity.storePushId(s);
            JSONArray jsonarray = new JSONArray();
            jsonarray.put(s);
            union("$android_devices", jsonarray);
            persistentidentity;
            JVM INSTR monitorexit ;
            return;
            s;
            persistentidentity;
            JVM INSTR monitorexit ;
            throw s;
        }

        public void showGivenNotification(InAppNotification inappnotification, Activity activity)
        {
            if (inappnotification != null)
            {
                showGivenOrAvailableNotification(inappnotification, activity);
            }
        }

        public void showNotificationById(int i, Activity activity)
        {
            showGivenNotification(mDecideMessages.getNotification(i, mConfig.getTestMode()), activity);
        }

        public void showNotificationIfAvailable(Activity activity)
        {
            if (android.os.Build.VERSION.SDK_INT < 16)
            {
                return;
            } else
            {
                showGivenOrAvailableNotification(null, activity);
                return;
            }
        }

        public void showSurvey(Survey survey, Activity activity)
        {
            showGivenOrAvailableSurvey(survey, activity);
        }

        public void showSurveyById(int i, Activity activity)
        {
            Survey survey = mDecideMessages.getSurvey(i, mConfig.getTestMode());
            if (survey != null)
            {
                showGivenOrAvailableSurvey(survey, activity);
            }
        }

        public void showSurveyIfAvailable(Activity activity)
        {
            if (android.os.Build.VERSION.SDK_INT < 16)
            {
                return;
            } else
            {
                showGivenOrAvailableSurvey(null, activity);
                return;
            }
        }

        public void trackCharge(double d, JSONObject jsonobject)
        {
            Object obj = new Date();
            Object obj1 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
            ((DateFormat) (obj1)).setTimeZone(TimeZone.getTimeZone("UTC"));
            JSONObject jsonobject1;
            try
            {
                jsonobject1 = new JSONObject();
                jsonobject1.put("$amount", d);
                jsonobject1.put("$time", ((DateFormat) (obj1)).format(((Date) (obj))));
            }
            // Misplaced declaration of an exception variable
            catch (JSONObject jsonobject)
            {
                Log.e("MixpanelAPI.API", "Exception creating new charge", jsonobject);
                return;
            }
            if (jsonobject == null) goto _L2; else goto _L1
_L1:
            obj = jsonobject.keys();
_L4:
            if (((Iterator) (obj)).hasNext())
            {
                break MISSING_BLOCK_LABEL_99;
            }
_L2:
            append("$transactions", jsonobject1);
            return;
            obj1 = (String)((Iterator) (obj)).next();
            jsonobject1.put(((String) (obj1)), jsonobject.get(((String) (obj1))));
            if (true) goto _L4; else goto _L3
_L3:
        }

        public void trackNotification(String s, InAppNotification inappnotification)
        {
            track(s, inappnotification.getCampaignProperties());
        }

        public void trackNotificationSeen(InAppNotification inappnotification)
        {
            if (inappnotification == null)
            {
                return;
            }
            trackNotification("$campaign_delivery", inappnotification);
            People people = getPeople().withIdentity(getDistinctId());
            SimpleDateFormat simpledateformat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
            JSONObject jsonobject = inappnotification.getCampaignProperties();
            try
            {
                jsonobject.put("$time", simpledateformat.format(new Date()));
            }
            catch (JSONException jsonexception)
            {
                Log.e("MixpanelAPI.API", "Exception trying to track an in-app notification seen", jsonexception);
            }
            people.append("$campaigns", Integer.valueOf(inappnotification.getId()));
            people.append("$notifications", jsonobject);
        }

        public void union(String s, JSONArray jsonarray)
        {
            try
            {
                JSONObject jsonobject = new JSONObject();
                jsonobject.put(s, jsonarray);
                s = stdPeopleMessage("$union", jsonobject);
                recordPeopleMessage(s);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                Log.e("MixpanelAPI.API", "Exception unioning a property");
            }
        }

        public void unset(String s)
        {
            try
            {
                JSONArray jsonarray = new JSONArray();
                jsonarray.put(s);
                s = stdPeopleMessage("$unset", jsonarray);
                recordPeopleMessage(s);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                Log.e("MixpanelAPI.API", "Exception unsetting a property", s);
            }
        }

        public People withIdentity(String s)
        {
            if (s == null)
            {
                return null;
            } else
            {
                return new PeopleImpl(s) {

                    final PeopleImpl this$1;
                    private final String val$distinctId;

                    public String getDistinctId()
                    {
                        return distinctId;
                    }

                    public void identify(String s)
                    {
                        throw new RuntimeException("This MixpanelPeople object has a fixed, constant distinctId");
                    }

            
            {
                this$1 = final_peopleimpl;
                distinctId = s;
                super(null);
            }
                };
            }
        }


        private PeopleImpl()
        {
            this$0 = MixpanelAPI.this;
            super();
        }

        PeopleImpl(PeopleImpl peopleimpl)
        {
            this();
        }

        PeopleImpl(PeopleImpl peopleimpl, PeopleImpl peopleimpl1)
        {
            this();
        }
    }

    private class SupportedUpdatesListener
        implements UpdatesListener, Runnable
    {

        private final Executor mExecutor;
        private final Set mListeners;
        final MixpanelAPI this$0;

        public void addOnMixpanelUpdatesReceivedListener(OnMixpanelUpdatesReceivedListener onmixpanelupdatesreceivedlistener)
        {
            this;
            JVM INSTR monitorenter ;
            if (mDecideMessages.hasUpdatesAvailable())
            {
                onNewResults();
            }
            mListeners.add(onmixpanelupdatesreceivedlistener);
            this;
            JVM INSTR monitorexit ;
            return;
            onmixpanelupdatesreceivedlistener;
            throw onmixpanelupdatesreceivedlistener;
        }

        public void onNewResults()
        {
            mExecutor.execute(this);
        }

        public void removeOnMixpanelUpdatesReceivedListener(OnMixpanelUpdatesReceivedListener onmixpanelupdatesreceivedlistener)
        {
            this;
            JVM INSTR monitorenter ;
            mListeners.remove(onmixpanelupdatesreceivedlistener);
            this;
            JVM INSTR monitorexit ;
            return;
            onmixpanelupdatesreceivedlistener;
            throw onmixpanelupdatesreceivedlistener;
        }

        public void run()
        {
            this;
            JVM INSTR monitorenter ;
            Iterator iterator = mListeners.iterator();
_L1:
            boolean flag = iterator.hasNext();
            if (flag)
            {
                break MISSING_BLOCK_LABEL_26;
            }
            this;
            JVM INSTR monitorexit ;
            return;
            ((OnMixpanelUpdatesReceivedListener)iterator.next()).onMixpanelUpdatesReceived();
              goto _L1
            Exception exception;
            exception;
            throw exception;
        }

        private SupportedUpdatesListener()
        {
            this$0 = MixpanelAPI.this;
            super();
            mListeners = new HashSet();
            mExecutor = Executors.newSingleThreadExecutor();
        }

        SupportedUpdatesListener(SupportedUpdatesListener supportedupdateslistener)
        {
            this();
        }
    }

    private class UnsupportedUpdatesFromMixpanel
        implements UpdatesFromMixpanel
    {

        private final Tweaks mTweaks;
        final MixpanelAPI this$0;

        public Tweaks getTweaks()
        {
            return mTweaks;
        }

        public void setEventBindings(JSONArray jsonarray)
        {
        }

        public void setVariants(JSONArray jsonarray)
        {
        }

        public void startUpdates()
        {
        }

        public UnsupportedUpdatesFromMixpanel(Tweaks tweaks)
        {
            this$0 = MixpanelAPI.this;
            super();
            mTweaks = tweaks;
        }
    }

    private class UnsupportedUpdatesListener
        implements UpdatesListener
    {

        final MixpanelAPI this$0;

        public void addOnMixpanelUpdatesReceivedListener(OnMixpanelUpdatesReceivedListener onmixpanelupdatesreceivedlistener)
        {
        }

        public void onNewResults()
        {
        }

        public void removeOnMixpanelUpdatesReceivedListener(OnMixpanelUpdatesReceivedListener onmixpanelupdatesreceivedlistener)
        {
        }

        private UnsupportedUpdatesListener()
        {
            this$0 = MixpanelAPI.this;
            super();
        }

        UnsupportedUpdatesListener(UnsupportedUpdatesListener unsupportedupdateslistener)
        {
            this();
        }
    }

    private static interface UpdatesListener
        extends DecideMessages.OnNewResultsListener
    {

        public abstract void addOnMixpanelUpdatesReceivedListener(OnMixpanelUpdatesReceivedListener onmixpanelupdatesreceivedlistener);

        public abstract void removeOnMixpanelUpdatesReceivedListener(OnMixpanelUpdatesReceivedListener onmixpanelupdatesreceivedlistener);
    }


    private static final String APP_LINKS_LOGTAG = "MixpanelAPI.AL";
    private static final String ENGAGE_DATE_FORMAT_STRING = "yyyy-MM-dd'T'HH:mm:ss";
    private static final String LOGTAG = "MixpanelAPI.API";
    public static final String VERSION = "4.6.0";
    private static final Map sInstanceMap = new HashMap();
    private static final SharedPreferencesLoader sPrefsLoader = new SharedPreferencesLoader();
    private static Future sReferrerPrefs;
    private static final Tweaks sSharedTweaks = new Tweaks();
    private final MPConfig mConfig = getConfig();
    private final Context mContext;
    private final DecideMessages mDecideMessages;
    private final Map mDeviceInfo;
    private final Map mEventTimings = new HashMap();
    private final AnalyticsMessages mMessages = getAnalyticsMessages();
    private final PeopleImpl mPeople = new PeopleImpl(null, null);
    private final PersistentIdentity mPersistentIdentity;
    private final String mToken;
    private final TrackingDebug mTrackingDebug = constructTrackingDebug();
    private final UpdatesFromMixpanel mUpdatesFromMixpanel;
    private final UpdatesListener mUpdatesListener = constructUpdatesListener();

    MixpanelAPI(Context context, Future future, String s)
    {
        mContext = context;
        mToken = s;
        HashMap hashmap = new HashMap();
        hashmap.put("$android_lib_version", "4.6.0");
        hashmap.put("$android_os", "Android");
        Object obj;
        if (android.os.Build.VERSION.RELEASE == null)
        {
            obj = "UNKNOWN";
        } else
        {
            obj = android.os.Build.VERSION.RELEASE;
        }
        hashmap.put("$android_os_version", obj);
        if (Build.MANUFACTURER == null)
        {
            obj = "UNKNOWN";
        } else
        {
            obj = Build.MANUFACTURER;
        }
        hashmap.put("$android_manufacturer", obj);
        if (Build.BRAND == null)
        {
            obj = "UNKNOWN";
        } else
        {
            obj = Build.BRAND;
        }
        hashmap.put("$android_brand", obj);
        if (Build.MODEL == null)
        {
            obj = "UNKNOWN";
        } else
        {
            obj = Build.MODEL;
        }
        hashmap.put("$android_model", obj);
        try
        {
            obj = mContext.getPackageManager().getPackageInfo(mContext.getPackageName(), 0);
            hashmap.put("$android_app_version", ((PackageInfo) (obj)).versionName);
            hashmap.put("$android_app_version_code", Integer.toString(((PackageInfo) (obj)).versionCode));
        }
        catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
        {
            Log.e("MixpanelAPI.API", "Exception getting app version name", namenotfoundexception);
        }
        mDeviceInfo = Collections.unmodifiableMap(hashmap);
        mUpdatesFromMixpanel = constructUpdatesFromMixpanel(context, s);
        mPersistentIdentity = getPersistentIdentity(context, future, s);
        mDecideMessages = constructDecideUpdates(s, mUpdatesListener, mUpdatesFromMixpanel);
        future = mPersistentIdentity.getPeopleDistinctId();
        context = future;
        if (future == null)
        {
            context = mPersistentIdentity.getEventsDistinctId();
        }
        mDecideMessages.setDistinctId(context);
        mMessages.installDecideCheck(mDecideMessages);
        registerMixpanelActivityLifecycleCallbacks();
        if (sendAppOpen())
        {
            track("$app_open", null);
        }
        mUpdatesFromMixpanel.startUpdates();
    }

    static void allInstances(InstanceProcessor instanceprocessor)
    {
        Map map = sInstanceMap;
        map;
        JVM INSTR monitorenter ;
        Iterator iterator = sInstanceMap.values().iterator();
_L2:
        if (iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_32;
        }
        return;
        Iterator iterator1 = ((Map)iterator.next()).values().iterator();
        while (iterator1.hasNext()) 
        {
            instanceprocessor.process((MixpanelAPI)iterator1.next());
        }
        if (true) goto _L2; else goto _L1
_L1:
        instanceprocessor;
        map;
        JVM INSTR monitorexit ;
        throw instanceprocessor;
    }

    public static Tweak booleanTweak(String s, boolean flag)
    {
        return sSharedTweaks.booleanTweak(s, flag);
    }

    public static Tweak byteTweak(String s, byte byte0)
    {
        return sSharedTweaks.byteTweak(s, byte0);
    }

    private static void checkIntentForInboundAppLink(Context context)
    {
        if (context instanceof Activity)
        {
            try
            {
                Class class1 = Class.forName("bolts.AppLinks");
                Intent intent = ((Activity)context).getIntent();
                class1.getMethod("getTargetUrlFromInboundIntent", new Class[] {
                    android/content/Context, android/content/Intent
                }).invoke(null, new Object[] {
                    context, intent
                });
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                Log.d("MixpanelAPI.AL", "Failed to invoke bolts.AppLinks.getTargetUrlFromInboundIntent() -- Unable to detect inbound App Links", context);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                Log.d("MixpanelAPI.AL", (new StringBuilder("Please install the Bolts library >= 1.1.2 to track App Links: ")).append(context.getMessage()).toString());
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                Log.d("MixpanelAPI.AL", (new StringBuilder("Please install the Bolts library >= 1.1.2 to track App Links: ")).append(context.getMessage()).toString());
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                Log.d("MixpanelAPI.AL", (new StringBuilder("Unable to detect inbound App Links: ")).append(context.getMessage()).toString());
            }
            return;
        } else
        {
            Log.d("MixpanelAPI.AL", "Context is not an instance of Activity. To detect inbound App Links, pass an instance of an Activity to getInstance.");
            return;
        }
    }

    public static Tweak doubleTweak(String s, double d)
    {
        return sSharedTweaks.doubleTweak(s, d);
    }

    public static void enableFallbackServer(Context context, boolean flag)
    {
        Log.i("MixpanelAPI.API", "MixpanelAPI.enableFallbackServer is deprecated. This call is a no-op.\n    To enable fallback in your application, add\n    <meta-data android:name=\"com.mixpanel.android.MPConfig.DisableFallback\" android:value=\"false\" />\n    to the <application> section of your AndroidManifest.xml.");
    }

    public static Tweak floatTweak(String s, float f)
    {
        return sSharedTweaks.floatTweak(s, f);
    }

    public static MixpanelAPI getInstance(Context context, String s)
    {
        if (s == null || context == null)
        {
            return null;
        }
        Map map = sInstanceMap;
        map;
        JVM INSTR monitorenter ;
        Object obj1;
        Context context1;
        context1 = context.getApplicationContext();
        if (sReferrerPrefs == null)
        {
            sReferrerPrefs = sPrefsLoader.loadPreferences(context, "com.mixpanel.android.mpmetrics.ReferralInfo", null);
        }
        obj1 = (Map)sInstanceMap.get(s);
        Object obj;
        obj = obj1;
        if (obj1 != null)
        {
            break MISSING_BLOCK_LABEL_82;
        }
        obj = new HashMap();
        sInstanceMap.put(s, obj);
        MixpanelAPI mixpanelapi = (MixpanelAPI)((Map) (obj)).get(context1);
        obj1 = mixpanelapi;
        if (mixpanelapi != null)
        {
            break MISSING_BLOCK_LABEL_143;
        }
        obj1 = mixpanelapi;
        if (ConfigurationChecker.checkBasicConfiguration(context1))
        {
            obj1 = new MixpanelAPI(context1, sReferrerPrefs, s);
            registerAppLinksListeners(context, ((MixpanelAPI) (obj1)));
            ((Map) (obj)).put(context1, obj1);
        }
        checkIntentForInboundAppLink(context);
        map;
        JVM INSTR monitorexit ;
        return ((MixpanelAPI) (obj1));
        context;
        map;
        JVM INSTR monitorexit ;
        throw context;
    }

    public static Tweak intTweak(String s, int i)
    {
        return sSharedTweaks.intTweak(s, i);
    }

    public static Tweak longTweak(String s, long l)
    {
        return sSharedTweaks.longTweak(s, l);
    }

    private void pushWaitingPeopleRecord()
    {
        JSONArray jsonarray = mPersistentIdentity.waitingPeopleRecordsForSending();
        if (jsonarray != null)
        {
            sendAllPeopleRecords(jsonarray);
        }
    }

    private void recordPeopleMessage(JSONObject jsonobject)
    {
        if (jsonobject.has("$distinct_id"))
        {
            mMessages.peopleMessage(jsonobject);
            return;
        } else
        {
            mPersistentIdentity.storeWaitingPeopleRecord(jsonobject);
            return;
        }
    }

    private static void registerAppLinksListeners(Context context, final MixpanelAPI mixpanel)
    {
        try
        {
            Class class1 = Class.forName("android.support.v4.content.LocalBroadcastManager");
            Method method = class1.getMethod("getInstance", new Class[] {
                android/content/Context
            });
            class1.getMethod("registerReceiver", new Class[] {
                android/content/BroadcastReceiver, android/content/IntentFilter
            }).invoke(method.invoke(null, new Object[] {
                context
            }), new Object[] {
                new BroadcastReceiver() {

                    private final MixpanelAPI val$mixpanel;

                    public void onReceive(Context context1, Intent intent)
                    {
                        Bundle bundle;
                        context1 = new JSONObject();
                        bundle = intent.getBundleExtra("event_args");
                        if (bundle == null) goto _L2; else goto _L1
_L1:
                        Iterator iterator = bundle.keySet().iterator();
_L5:
                        if (iterator.hasNext()) goto _L3; else goto _L2
_L2:
                        mixpanel.track((new StringBuilder("$")).append(intent.getStringExtra("event_name")).toString(), context1);
                        return;
_L3:
                        String s = (String)iterator.next();
                        try
                        {
                            context1.put(s, bundle.get(s));
                        }
                        catch (JSONException jsonexception)
                        {
                            Log.e("MixpanelAPI.AL", (new StringBuilder("failed to add key \"")).append(s).append("\" to properties for tracking bolts event").toString(), jsonexception);
                        }
                        if (true) goto _L5; else goto _L4
_L4:
                    }

            
            {
                mixpanel = mixpanelapi;
                super();
            }
                }, new IntentFilter("com.parse.bolts.measurement_event")
            });
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.d("MixpanelAPI.AL", "Failed to invoke LocalBroadcastManager.registerReceiver() -- App Links tracking will not be enabled due to this exception", context);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.d("MixpanelAPI.AL", (new StringBuilder("To enable App Links tracking android.support.v4 must be installed: ")).append(context.getMessage()).toString());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.d("MixpanelAPI.AL", (new StringBuilder("To enable App Links tracking android.support.v4 must be installed: ")).append(context.getMessage()).toString());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.d("MixpanelAPI.AL", (new StringBuilder("App Links tracking will not be enabled due to this exception: ")).append(context.getMessage()).toString());
        }
    }

    private void sendAllPeopleRecords(JSONArray jsonarray)
    {
        int i = 0;
        do
        {
            if (i >= jsonarray.length())
            {
                return;
            }
            try
            {
                JSONObject jsonobject = jsonarray.getJSONObject(i);
                mMessages.peopleMessage(jsonobject);
            }
            catch (JSONException jsonexception)
            {
                Log.e("MixpanelAPI.API", "Malformed people record stored pending identity, will not send it.", jsonexception);
            }
            i++;
        } while (true);
    }

    public static void setFlushInterval(Context context, long l)
    {
        Log.i("MixpanelAPI.API", "MixpanelAPI.setFlushInterval is deprecated. Calling is now a no-op.\n    To set a custom Mixpanel flush interval for your application, add\n    <meta-data android:name=\"com.mixpanel.android.MPConfig.FlushInterval\" android:value=\"YOUR_INTERVAL\" />\n    to the <application> section of your AndroidManifest.xml.");
    }

    public static Tweak shortTweak(String s, short word0)
    {
        return sSharedTweaks.shortTweak(s, word0);
    }

    public static Tweak stringTweak(String s, String s1)
    {
        return sSharedTweaks.stringTweak(s, s1);
    }

    public void alias(String s, String s1)
    {
        String s2 = s1;
        if (s1 == null)
        {
            s2 = getDistinctId();
        }
        if (s.equals(s2))
        {
            Log.w("MixpanelAPI.API", (new StringBuilder("Attempted to alias identical distinct_ids ")).append(s).append(". Alias message will not be sent.").toString());
            return;
        }
        try
        {
            s1 = new JSONObject();
            s1.put("alias", s);
            s1.put("original", s2);
            track("$create_alias", s1);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.e("MixpanelAPI.API", "Failed to alias", s);
        }
        flush();
    }

    public void clearSuperProperties()
    {
        mPersistentIdentity.clearSuperProperties();
    }

    DecideMessages constructDecideUpdates(String s, DecideMessages.OnNewResultsListener onnewresultslistener, UpdatesFromMixpanel updatesfrommixpanel)
    {
        return new DecideMessages(s, onnewresultslistener, updatesfrommixpanel);
    }

    TrackingDebug constructTrackingDebug()
    {
        if (mUpdatesFromMixpanel instanceof ViewCrawler)
        {
            return (TrackingDebug)mUpdatesFromMixpanel;
        } else
        {
            return null;
        }
    }

    UpdatesFromMixpanel constructUpdatesFromMixpanel(Context context, String s)
    {
        if (android.os.Build.VERSION.SDK_INT < 16)
        {
            Log.i("MixpanelAPI.API", "Web Configuration, A/B Testing, and Dynamic Tweaks are not supported on this Android OS Version");
            return new UnsupportedUpdatesFromMixpanel(sSharedTweaks);
        } else
        {
            return new ViewCrawler(mContext, mToken, this, sSharedTweaks);
        }
    }

    UpdatesListener constructUpdatesListener()
    {
        if (android.os.Build.VERSION.SDK_INT < 16)
        {
            Log.i("MixpanelAPI.API", "Surveys and Notifications are not supported on this Android OS Version");
            return new UnsupportedUpdatesListener(null);
        } else
        {
            return new SupportedUpdatesListener(null);
        }
    }

    public void flush()
    {
        mMessages.postToServer();
    }

    AnalyticsMessages getAnalyticsMessages()
    {
        return AnalyticsMessages.getInstance(mContext);
    }

    MPConfig getConfig()
    {
        return MPConfig.getInstance(mContext);
    }

    public Map getDeviceInfo()
    {
        return mDeviceInfo;
    }

    public String getDistinctId()
    {
        return mPersistentIdentity.getEventsDistinctId();
    }

    public People getPeople()
    {
        return mPeople;
    }

    PersistentIdentity getPersistentIdentity(Context context, Future future, String s)
    {
        SharedPreferencesLoader.OnPrefsLoadedListener onprefsloadedlistener = new SharedPreferencesLoader.OnPrefsLoadedListener() {

            final MixpanelAPI this$0;

            public void onPrefsLoaded(SharedPreferences sharedpreferences)
            {
                sharedpreferences = PersistentIdentity.waitingPeopleRecordsForSending(sharedpreferences);
                if (sharedpreferences != null)
                {
                    sendAllPeopleRecords(sharedpreferences);
                }
            }

            
            {
                this$0 = MixpanelAPI.this;
                super();
            }
        };
        s = (new StringBuilder("com.mixpanel.android.mpmetrics.MixpanelAPI_")).append(s).toString();
        return new PersistentIdentity(future, sPrefsLoader.loadPreferences(context, s, onprefsloadedlistener));
    }

    public JSONObject getSuperProperties()
    {
        JSONObject jsonobject = new JSONObject();
        mPersistentIdentity.addSuperPropertiesToObject(jsonobject);
        return jsonobject;
    }

    public void identify(String s)
    {
        PersistentIdentity persistentidentity = mPersistentIdentity;
        persistentidentity;
        JVM INSTR monitorenter ;
        String s1;
        mPersistentIdentity.setEventsDistinctId(s);
        s1 = mPersistentIdentity.getPeopleDistinctId();
        s = s1;
        if (s1 != null)
        {
            break MISSING_BLOCK_LABEL_37;
        }
        s = mPersistentIdentity.getEventsDistinctId();
        mDecideMessages.setDistinctId(s);
        persistentidentity;
        JVM INSTR monitorexit ;
        return;
        s;
        persistentidentity;
        JVM INSTR monitorexit ;
        throw s;
    }

    public void logPosts()
    {
        Log.i("MixpanelAPI.API", "MixpanelAPI.logPosts() is deprecated.\n    To get verbose debug level logging, add\n    <meta-data android:name=\"com.mixpanel.android.MPConfig.EnableDebugLogging\" value=\"true\" />\n    to the <application> section of your AndroidManifest.xml.");
    }

    void registerMixpanelActivityLifecycleCallbacks()
    {
label0:
        {
            if (android.os.Build.VERSION.SDK_INT >= 16 && mConfig.getAutoShowMixpanelUpdates())
            {
                if (!(mContext.getApplicationContext() instanceof Application))
                {
                    break label0;
                }
                ((Application)mContext.getApplicationContext()).registerActivityLifecycleCallbacks(new MixpanelActivityLifecycleCallbacks(this));
            }
            return;
        }
        Log.i("MixpanelAPI.API", "Context is not an Application, Mixpanel will not automatically show surveys, in-app notifications, or A/B test experiments.");
    }

    public void registerSuperProperties(JSONObject jsonobject)
    {
        mPersistentIdentity.registerSuperProperties(jsonobject);
    }

    public void registerSuperPropertiesMap(Map map)
    {
        if (map == null)
        {
            Log.e("MixpanelAPI.API", "registerSuperPropertiesMap does not accept null properties");
            return;
        }
        try
        {
            registerSuperProperties(new JSONObject(map));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            Log.w("MixpanelAPI.API", "Can't have null keys in the properties of registerSuperPropertiesMap!");
        }
    }

    public void registerSuperPropertiesOnce(JSONObject jsonobject)
    {
        mPersistentIdentity.registerSuperPropertiesOnce(jsonobject);
    }

    public void registerSuperPropertiesOnceMap(Map map)
    {
        if (map == null)
        {
            Log.e("MixpanelAPI.API", "registerSuperPropertiesOnceMap does not accept null properties");
            return;
        }
        try
        {
            registerSuperPropertiesOnce(new JSONObject(map));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            Log.w("MixpanelAPI.API", "Can't have null keys in the properties of registerSuperPropertiesOnce!");
        }
    }

    public void reset()
    {
        mPersistentIdentity.clearPreferences();
    }

    boolean sendAppOpen()
    {
        return !mConfig.getDisableAppOpenEvent();
    }

    public void timeEvent(String s)
    {
        long l = System.currentTimeMillis();
        synchronized (mEventTimings)
        {
            mEventTimings.put(s, Long.valueOf(l));
        }
        return;
        s;
        map;
        JVM INSTR monitorexit ;
        throw s;
    }

    public void track(String s)
    {
        track(s, null);
    }

    public void track(String s, JSONObject jsonobject)
    {
        Object obj1;
        synchronized (mEventTimings)
        {
            obj1 = (Long)mEventTimings.get(s);
            mEventTimings.remove(s);
        }
        Iterator iterator;
        obj = new JSONObject();
        iterator = mPersistentIdentity.getReferrerProperties().entrySet().iterator();
_L5:
        if (iterator.hasNext()) goto _L2; else goto _L1
_L1:
        double d;
        mPersistentIdentity.addSuperPropertiesToObject(((JSONObject) (obj)));
        d = (double)System.currentTimeMillis() / 1000D;
        ((JSONObject) (obj)).put("time", (long)d);
        ((JSONObject) (obj)).put("distinct_id", getDistinctId());
        if (obj1 != null)
        {
            try
            {
                ((JSONObject) (obj)).put("$duration", d - (double)((Long) (obj1)).longValue() / 1000D);
            }
            // Misplaced declaration of an exception variable
            catch (JSONObject jsonobject)
            {
                Log.e("MixpanelAPI.API", (new StringBuilder("Exception tracking event ")).append(s).toString(), jsonobject);
                return;
            }
        }
        if (jsonobject == null) goto _L4; else goto _L3
_L3:
        obj1 = jsonobject.keys();
_L6:
        if (((Iterator) (obj1)).hasNext())
        {
            break MISSING_BLOCK_LABEL_278;
        }
_L4:
        jsonobject = new AnalyticsMessages.EventDescription(s, ((JSONObject) (obj)), mToken);
        mMessages.eventsMessage(jsonobject);
        if (mTrackingDebug != null)
        {
            mTrackingDebug.reportTrack(s);
        }
        return;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
_L2:
        java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
        ((JSONObject) (obj)).put((String)entry.getKey(), (String)entry.getValue());
          goto _L5
        String s1 = (String)((Iterator) (obj1)).next();
        ((JSONObject) (obj)).put(s1, jsonobject.get(s1));
          goto _L6
    }

    public void trackMap(String s, Map map)
    {
        if (map == null)
        {
            track(s, null);
            return;
        }
        try
        {
            track(s, new JSONObject(map));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.w("MixpanelAPI.API", "Can't have null keys in the properties of trackMap!");
        }
    }

    public void unregisterSuperProperty(String s)
    {
        mPersistentIdentity.unregisterSuperProperty(s);
    }

    public void updateSuperProperties(SuperPropertyUpdate superpropertyupdate)
    {
        mPersistentIdentity.updateSuperProperties(superpropertyupdate);
    }













}
