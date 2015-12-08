// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.mpmetrics;

import android.util.Log;
import com.mixpanel.android.viewcrawler.UpdatesFromMixpanel;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;

// Referenced classes of package com.mixpanel.android.mpmetrics:
//            InAppNotification, MPConfig, Survey

class DecideMessages
{
    public static interface OnNewResultsListener
    {

        public abstract void onNewResults();
    }


    private static final String LOGTAG = "MixpanelAPI.DecideUpdts";
    private String mDistinctId;
    private final OnNewResultsListener mListener;
    private final Set mNotificationIds = new HashSet();
    private final Set mSurveyIds = new HashSet();
    private final String mToken;
    private final List mUnseenNotifications = new LinkedList();
    private final List mUnseenSurveys = new LinkedList();
    private final UpdatesFromMixpanel mUpdatesFromMixpanel;
    private JSONArray mVariants;

    public DecideMessages(String s, OnNewResultsListener onnewresultslistener, UpdatesFromMixpanel updatesfrommixpanel)
    {
        mToken = s;
        mListener = onnewresultslistener;
        mUpdatesFromMixpanel = updatesfrommixpanel;
        mDistinctId = null;
    }

    public String getDistinctId()
    {
        this;
        JVM INSTR monitorenter ;
        String s = mDistinctId;
        this;
        JVM INSTR monitorexit ;
        return s;
        Exception exception;
        exception;
        throw exception;
    }

    public InAppNotification getNotification(int i, boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        InAppNotification inappnotification;
        int j;
        inappnotification = null;
        j = 0;
_L5:
        int k = mUnseenNotifications.size();
        if (j < k) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return inappnotification;
_L2:
        InAppNotification inappnotification1;
        if (((InAppNotification)mUnseenNotifications.get(j)).getId() != i)
        {
            break MISSING_BLOCK_LABEL_96;
        }
        inappnotification1 = (InAppNotification)mUnseenNotifications.get(j);
        inappnotification = inappnotification1;
        if (flag) goto _L1; else goto _L3
_L3:
        mUnseenNotifications.remove(j);
        inappnotification = inappnotification1;
          goto _L1
        Exception exception;
        exception;
        throw exception;
        j++;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public InAppNotification getNotification(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        if (!mUnseenNotifications.isEmpty()) goto _L2; else goto _L1
_L1:
        if (MPConfig.DEBUG)
        {
            Log.v("MixpanelAPI.DecideUpdts", "No unseen notifications exist, none will be returned.");
        }
        Object obj = null;
_L4:
        this;
        JVM INSTR monitorexit ;
        return ((InAppNotification) (obj));
_L2:
        InAppNotification inappnotification = (InAppNotification)mUnseenNotifications.remove(0);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_81;
        }
        mUnseenNotifications.add(mUnseenNotifications.size(), inappnotification);
        obj = inappnotification;
        continue; /* Loop/switch isn't completed */
        obj;
        throw obj;
        obj = inappnotification;
        if (!MPConfig.DEBUG)
        {
            continue; /* Loop/switch isn't completed */
        }
        Log.v("MixpanelAPI.DecideUpdts", (new StringBuilder("Recording notification ")).append(inappnotification).append(" as seen.").toString());
        obj = inappnotification;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public Survey getSurvey(int i, boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        Survey survey;
        int j;
        survey = null;
        j = 0;
_L5:
        int k = mUnseenSurveys.size();
        if (j < k) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return survey;
_L2:
        Survey survey1;
        if (((Survey)mUnseenSurveys.get(j)).getId() != i)
        {
            break MISSING_BLOCK_LABEL_96;
        }
        survey1 = (Survey)mUnseenSurveys.get(j);
        survey = survey1;
        if (flag) goto _L1; else goto _L3
_L3:
        mUnseenSurveys.remove(j);
        survey = survey1;
          goto _L1
        Exception exception;
        exception;
        throw exception;
        j++;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public Survey getSurvey(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag1 = mUnseenSurveys.isEmpty();
        if (!flag1) goto _L2; else goto _L1
_L1:
        Survey survey = null;
_L4:
        this;
        JVM INSTR monitorexit ;
        return survey;
_L2:
        Survey survey1 = (Survey)mUnseenSurveys.remove(0);
        survey = survey1;
        if (!flag)
        {
            continue; /* Loop/switch isn't completed */
        }
        mUnseenSurveys.add(mUnseenSurveys.size(), survey1);
        survey = survey1;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public String getToken()
    {
        return mToken;
    }

    public JSONArray getVariants()
    {
        this;
        JVM INSTR monitorenter ;
        JSONArray jsonarray = mVariants;
        this;
        JVM INSTR monitorexit ;
        return jsonarray;
        Exception exception;
        exception;
        throw exception;
    }

    public boolean hasUpdatesAvailable()
    {
        this;
        JVM INSTR monitorenter ;
        if (!mUnseenNotifications.isEmpty() || !mUnseenSurveys.isEmpty()) goto _L2; else goto _L1
_L1:
        JSONArray jsonarray = mVariants;
        if (jsonarray != null) goto _L2; else goto _L3
_L3:
        boolean flag = false;
_L5:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        flag = true;
        if (true) goto _L5; else goto _L4
_L4:
        Exception exception;
        exception;
        throw exception;
    }

    public void reportResults(List list, List list1, JSONArray jsonarray, JSONArray jsonarray1)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = false;
        mUpdatesFromMixpanel.setEventBindings(jsonarray);
        jsonarray = list.iterator();
_L6:
        if (jsonarray.hasNext()) goto _L2; else goto _L1
_L1:
        jsonarray = list1.iterator();
_L8:
        if (jsonarray.hasNext()) goto _L4; else goto _L3
_L3:
        mVariants = jsonarray1;
        if (MPConfig.DEBUG)
        {
            Log.v("MixpanelAPI.DecideUpdts", (new StringBuilder("New Decide content has become available. ")).append(list.size()).append(" surveys and ").append(list1.size()).append(" notifications have been added.").toString());
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_133;
        }
        if (hasUpdatesAvailable() && mListener != null)
        {
            mListener.onNewResults();
        }
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        Object obj;
        int i;
        obj = (Survey)jsonarray.next();
        i = ((Survey) (obj)).getId();
        if (mSurveyIds.contains(Integer.valueOf(i))) goto _L6; else goto _L5
_L5:
        mSurveyIds.add(Integer.valueOf(i));
        mUnseenSurveys.add(obj);
        flag = true;
          goto _L6
_L4:
        obj = (InAppNotification)jsonarray.next();
        i = ((InAppNotification) (obj)).getId();
        if (mNotificationIds.contains(Integer.valueOf(i))) goto _L8; else goto _L7
_L7:
        mNotificationIds.add(Integer.valueOf(i));
        mUnseenNotifications.add(obj);
        flag = true;
          goto _L8
        list;
        throw list;
          goto _L6
    }

    public void setDistinctId(String s)
    {
        this;
        JVM INSTR monitorenter ;
        mUnseenSurveys.clear();
        mUnseenNotifications.clear();
        mDistinctId = s;
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }
}
