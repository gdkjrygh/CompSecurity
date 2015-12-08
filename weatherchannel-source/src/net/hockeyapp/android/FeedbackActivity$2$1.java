// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.hockeyapp.android;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import net.hockeyapp.android.objects.ErrorObject;

// Referenced classes of package net.hockeyapp.android:
//            FeedbackActivity, Strings

class this._cls1
    implements Runnable
{

    final Dialog this$1;

    public void run()
    {
        enableDisableSendFeedbackButton(true);
        showDialog(0);
    }

    is._cls0()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class net/hockeyapp/android/FeedbackActivity$2

/* anonymous class */
    class FeedbackActivity._cls2 extends Handler
    {

        final FeedbackActivity this$0;

        public void handleMessage(Message message)
        {
            boolean flag = false;
            FeedbackActivity.access$002(FeedbackActivity.this, new ErrorObject());
            if (message != null && message.getData() != null)
            {
                Object obj = message.getData();
                message = ((Bundle) (obj)).getString("feedback_response");
                String s = ((Bundle) (obj)).getString("feedback_status");
                obj = ((Bundle) (obj)).getString("request_type");
                if (((String) (obj)).equals("send") && (message == null || Integer.parseInt(s) != 201))
                {
                    FeedbackActivity.access$000(FeedbackActivity.this).setMessage(Strings.get(1036));
                } else
                if (((String) (obj)).equals("fetch") && s != null && (Integer.parseInt(s) == 404 || Integer.parseInt(s) == 422))
                {
                    FeedbackActivity.access$100(FeedbackActivity.this);
                    flag = true;
                } else
                if (message != null)
                {
                    FeedbackActivity.access$200(FeedbackActivity.this, message, ((String) (obj)));
                    flag = true;
                } else
                {
                    FeedbackActivity.access$000(FeedbackActivity.this).setMessage(Strings.get(1037));
                }
            } else
            {
                FeedbackActivity.access$000(FeedbackActivity.this).setMessage(Strings.get(1036));
            }
            if (!flag)
            {
                runOnUiThread(new FeedbackActivity._cls2._cls1());
            }
        }

            
            {
                this$0 = FeedbackActivity.this;
                super();
            }
    }

}
