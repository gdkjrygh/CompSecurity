// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.prompt;

import android.app.Dialog;
import android.view.View;
import com.contextlogic.wish.analytics.Analytics;

// Referenced classes of package com.contextlogic.wish.prompt:
//            RateAppPrompt

class val.dialog
    implements android.view.ener
{

    final RateAppPrompt this$0;
    final Dialog val$dialog;

    public void onClick(View view)
    {
        Analytics.getInstance().trackEvent(com.contextlogic.wish.analytics.ype.Skip, com.contextlogic.wish.analytics.ewType.RateAppPrompt, com.contextlogic.wish.analytics.ype.Click);
        RateAppPrompt.markPromptShown();
        val$dialog.dismiss();
    }

    elType()
    {
        this$0 = final_rateappprompt;
        val$dialog = Dialog.this;
        super();
    }
}
