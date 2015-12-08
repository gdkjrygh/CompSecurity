// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.surveys;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import android.view.View;
import com.mixpanel.android.mpmetrics.InAppNotification;
import com.mixpanel.android.mpmetrics.MixpanelAPI;
import com.mixpanel.android.mpmetrics.UpdateDisplayState;

// Referenced classes of package com.mixpanel.android.surveys:
//            SurveyActivity

class on
    implements android.view.ner
{

    final SurveyActivity this$0;
    private final InAppNotification val$inApp;

    public void onClick(View view)
    {
        view = val$inApp.getCallToActionUrl();
        if (view != null && view.length() > 0)
        {
            try
            {
                view = Uri.parse(view);
            }
            // Misplaced declaration of an exception variable
            catch (View view)
            {
                Log.i("MixpanelAPI.SrvyActvty", "Can't parse notification URI, will not take any action", view);
                return;
            }
            try
            {
                view = new Intent("android.intent.action.VIEW", view);
                startActivity(view);
                SurveyActivity.access$0(SurveyActivity.this).getPeople().trackNotification("$campaign_open", val$inApp);
            }
            // Misplaced declaration of an exception variable
            catch (View view)
            {
                Log.i("MixpanelAPI.SrvyActvty", "User doesn't have an activity for notification URI");
            }
        }
        finish();
        UpdateDisplayState.releaseDisplayState(SurveyActivity.access$1(SurveyActivity.this));
    }

    on()
    {
        this$0 = final_surveyactivity;
        val$inApp = InAppNotification.this;
        super();
    }
}
