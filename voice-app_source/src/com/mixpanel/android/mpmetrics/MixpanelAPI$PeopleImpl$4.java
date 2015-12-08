// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.mpmetrics;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.util.Log;
import com.mixpanel.android.surveys.SurveyActivity;
import com.mixpanel.android.util.ActivityImageUtils;
import java.util.concurrent.locks.ReentrantLock;

// Referenced classes of package com.mixpanel.android.mpmetrics:
//            MixpanelAPI, UpdateDisplayState, MPConfig, InAppNotification, 
//            ConfigurationChecker, InAppFragment

class val.parent
    implements Runnable
{

    private static int $SWITCH_TABLE$com$mixpanel$android$mpmetrics$InAppNotification$Type[];
    final cation.Type this$1;
    private final InAppNotification val$notifOrNull;
    private final Activity val$parent;

    static int[] $SWITCH_TABLE$com$mixpanel$android$mpmetrics$InAppNotification$Type()
    {
        int ai[] = $SWITCH_TABLE$com$mixpanel$android$mpmetrics$InAppNotification$Type;
        if (ai != null)
        {
            return ai;
        }
        ai = new int[lues().length];
        try
        {
            ai[NI.dinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            ai[KEOVER.dinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            ai[KNOWN.dinal()] = 1;
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
        Object obj = val$notifOrNull;
        InAppNotification inappnotification;
        inappnotification = ((InAppNotification) (obj));
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_52;
        }
        inappnotification = tNotificationIfAvailable();
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
        if (obj != KEOVER || ConfigurationChecker.checkSurveyActivityAvailable(val$parent.getApplicationContext()))
        {
            break MISSING_BLOCK_LABEL_119;
        }
        if (MPConfig.DEBUG)
        {
            Log.v("MixpanelAPI.API", "Application is not configured to show takeover notifications, none will be shown.");
        }
        reentrantlock.unlock();
        return;
        int i = UpdateDisplayState.proposeDisplay(new yState.InAppNotificationState(inappnotification, ActivityImageUtils.getHighlightColorFromBackground(val$parent)), tDistinctId(), MixpanelAPI.access$9(cess._mth2(this._cls1.this)));
        if (i > 0)
        {
            break MISSING_BLOCK_LABEL_174;
        }
        Log.e("MixpanelAPI.API", "DisplayState Lock in inconsistent state! Please report this issue to Mixpanel");
        reentrantlock.unlock();
        return;
        $SWITCH_TABLE$com$mixpanel$android$mpmetrics$InAppNotification$Type()[((cation.Type) (obj)).dinal()];
        JVM INSTR tableswitch 2 3: default 452
    //                   2 260
    //                   3 386;
           goto _L1 _L2 _L3
_L3:
        break MISSING_BLOCK_LABEL_386;
_L1:
        Log.e("MixpanelAPI.API", (new StringBuilder("Unrecognized notification type ")).append(obj).append(" can't be shown").toString());
_L4:
        if (!MixpanelAPI.access$5(cess._mth2(this._cls1.this)).getTestMode())
        {
            ackNotificationSeen(inappnotification);
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
        inappfragment.setDisplayState(cess._mth2(this._cls1.this), i, (yState.InAppNotificationState)((UpdateDisplayState) (obj1)).getDisplayState());
        inappfragment.setRetainInstance(true);
        if (MPConfig.DEBUG)
        {
            Log.v("MixpanelAPI.API", "Attempting to show mini notification.");
        }
        obj1 = val$parent.getFragmentManager().beginTransaction();
        ((FragmentTransaction) (obj1)).setCustomAnimations(0, com.mixpanel.android.id_slide_down);
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
        Intent intent = new Intent(val$parent.getApplicationContext(), com/mixpanel/android/surveys/SurveyActivity);
        intent.addFlags(0x10000000);
        intent.addFlags(0x20000);
        intent.putExtra("com.mixpanel.android.surveys.SurveyActivity.INTENT_ID_KEY", i);
        val$parent.startActivity(intent);
          goto _L4
    }

    yState.InAppNotificationState()
    {
        this$1 = final_inappnotificationstate;
        val$notifOrNull = inappnotification;
        val$parent = Activity.this;
        super();
    }
}
