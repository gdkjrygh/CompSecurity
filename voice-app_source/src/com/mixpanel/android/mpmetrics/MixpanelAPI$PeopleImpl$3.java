// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.mpmetrics;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import com.mixpanel.android.surveys.SurveyActivity;

// Referenced classes of package com.mixpanel.android.mpmetrics:
//            MixpanelAPI

class val.intentId
    implements roundCapturedListener
{

    final val.parent this$1;
    private final int val$intentId;
    private final Activity val$parent;
    private final yState.SurveyState val$surveyDisplay;

    public void onBackgroundCaptured(Bitmap bitmap, int i)
    {
        val$surveyDisplay.setBackground(bitmap);
        val$surveyDisplay.setHighlightColor(i);
        bitmap = new Intent(val$parent.getApplicationContext(), com/mixpanel/android/surveys/SurveyActivity);
        bitmap.addFlags(0x10000000);
        bitmap.addFlags(0x20000);
        bitmap.putExtra("com.mixpanel.android.surveys.SurveyActivity.INTENT_ID_KEY", val$intentId);
        val$parent.startActivity(bitmap);
    }

    yState.SurveyState()
    {
        this$1 = final_surveystate;
        val$surveyDisplay = surveystate1;
        val$parent = activity;
        val$intentId = I.this;
        super();
    }
}
