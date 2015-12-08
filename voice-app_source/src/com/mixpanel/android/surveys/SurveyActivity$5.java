// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.surveys;

import android.content.DialogInterface;
import android.view.View;

// Referenced classes of package com.mixpanel.android.surveys:
//            SurveyActivity

class this._cls0
    implements android.content.nClickListener
{

    final SurveyActivity this$0;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        findViewById(com.mixpanel.android._android_activity_survey_id).setVisibility(0);
        SurveyActivity.access$4(SurveyActivity.this, true);
        SurveyActivity.access$6(SurveyActivity.this, SurveyActivity.access$5(SurveyActivity.this));
    }

    r()
    {
        this$0 = SurveyActivity.this;
        super();
    }
}
