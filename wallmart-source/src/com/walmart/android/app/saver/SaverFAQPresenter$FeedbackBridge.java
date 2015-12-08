// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.saver;

import android.app.Activity;
import com.walmart.android.util.UserVoiceUtils;

// Referenced classes of package com.walmart.android.app.saver:
//            SaverFAQPresenter

private static class <init>
{

    private final Activity mActivity;

    public void show()
    {
        mActivity.runOnUiThread(new Runnable() {

            final SaverFAQPresenter.FeedbackBridge this$0;

            public void run()
            {
                UserVoiceUtils.launchFeedback(mActivity);
            }

            
            {
                this$0 = SaverFAQPresenter.FeedbackBridge.this;
                super();
            }
        });
    }


    private _cls1.this._cls0(Activity activity)
    {
        mActivity = activity;
    }

    mActivity(Activity activity, mActivity mactivity)
    {
        this(activity);
    }
}
