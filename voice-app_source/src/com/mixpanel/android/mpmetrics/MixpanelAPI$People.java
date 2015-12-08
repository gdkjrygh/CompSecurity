// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.mpmetrics;

import android.app.Activity;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.mixpanel.android.mpmetrics:
//            MixpanelAPI, OnMixpanelUpdatesReceivedListener, SurveyCallbacks, InAppNotification, 
//            Survey

public static interface ceivedListener
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

    public abstract ceivedListener withIdentity(String s);
}
