// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.surveys;

import android.view.View;
import com.mixpanel.android.mpmetrics.UpdateDisplayState;

// Referenced classes of package com.mixpanel.android.surveys:
//            SurveyActivity

class this._cls0
    implements android.view.ner
{

    final SurveyActivity this$0;

    public void onClick(View view)
    {
        finish();
        UpdateDisplayState.releaseDisplayState(SurveyActivity.access$1(SurveyActivity.this));
    }

    ate()
    {
        this$0 = SurveyActivity.this;
        super();
    }
}
