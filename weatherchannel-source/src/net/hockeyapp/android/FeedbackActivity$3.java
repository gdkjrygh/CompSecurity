// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.hockeyapp.android;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import net.hockeyapp.android.objects.ErrorObject;
import net.hockeyapp.android.objects.FeedbackResponse;
import net.hockeyapp.android.utils.PrefsUtil;

// Referenced classes of package net.hockeyapp.android:
//            FeedbackActivity

class this._cls0 extends Handler
{

    final FeedbackActivity this$0;

    public void handleMessage(Message message)
    {
        boolean flag1 = false;
        FeedbackActivity.access$002(FeedbackActivity.this, new ErrorObject());
        boolean flag = flag1;
        if (message != null)
        {
            flag = flag1;
            if (message.getData() != null)
            {
                message = (FeedbackResponse)message.getData().getSerializable("parse_feedback_response");
                flag = flag1;
                if (message != null)
                {
                    if (message.getStatus().equalsIgnoreCase("success"))
                    {
                        boolean flag2 = true;
                        flag = flag2;
                        if (message.getToken() != null)
                        {
                            PrefsUtil.getInstance().saveFeedbackTokenToPrefs(FeedbackActivity.access$300(FeedbackActivity.this), message.getToken());
                            FeedbackActivity.access$400(FeedbackActivity.this, message);
                            FeedbackActivity.access$502(FeedbackActivity.this, false);
                            flag = flag2;
                        }
                    } else
                    {
                        flag = false;
                    }
                }
            }
        }
        if (!flag)
        {
            runOnUiThread(new Runnable() {

                final FeedbackActivity._cls3 this$1;

                public void run()
                {
                    showDialog(0);
                }

            
            {
                this$1 = FeedbackActivity._cls3.this;
                super();
            }
            });
        }
        enableDisableSendFeedbackButton(true);
    }

    _cls1.this._cls1()
    {
        this$0 = FeedbackActivity.this;
        super();
    }
}
