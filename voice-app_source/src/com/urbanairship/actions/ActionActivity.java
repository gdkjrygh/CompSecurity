// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.actions;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.urbanairship.Logger;
import com.urbanairship.UAirship;
import com.urbanairship.analytics.Analytics;

public class ActionActivity extends Activity
{

    public static final String RESULT_INTENT_EXTRA = "com.urbanairship.actions.actionactivity.RESULT_INTENT_EXTRA";
    public static final String RESULT_RECEIVER_EXTRA = "com.urbanairship.actions.actionactivity.RESULT_RECEIVER_EXTRA";
    public static final String START_ACTIVITY_INTENT_EXTRA = "com.urbanairship.actions.START_ACTIVITY_INTENT_EXTRA";
    private static int requestCode = 0;
    private ResultReceiver actionResultReceiver;

    public ActionActivity()
    {
    }

    protected void onActivityResult(int i, int j, Intent intent)
    {
        if (actionResultReceiver != null)
        {
            Bundle bundle = new Bundle();
            bundle.putParcelable("com.urbanairship.actions.actionactivity.RESULT_INTENT_EXTRA", intent);
            actionResultReceiver.send(j, bundle);
        }
        super.onActivityResult(i, j, intent);
        finish();
    }

    public final void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent == null)
        {
            Logger.warn("Started Action Activity with null intent");
            finish();
        } else
        if (bundle == null)
        {
            bundle = (Intent)intent.getParcelableExtra("com.urbanairship.actions.START_ACTIVITY_INTENT_EXTRA");
            actionResultReceiver = (ResultReceiver)intent.getParcelableExtra("com.urbanairship.actions.actionactivity.RESULT_RECEIVER_EXTRA");
            int i = requestCode + 1;
            requestCode = i;
            startActivityForResult(bundle, i);
            return;
        }
    }

    protected void onStart()
    {
        super.onStart();
        UAirship.shared().getAnalytics().activityStarted(this);
    }

    protected void onStop()
    {
        super.onStop();
        UAirship.shared().getAnalytics().activityStopped(this);
    }

}
