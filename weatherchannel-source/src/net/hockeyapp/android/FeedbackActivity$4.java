// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.hockeyapp.android;

import android.widget.ListView;
import android.widget.TextView;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import net.hockeyapp.android.adapters.MessagesAdapter;
import net.hockeyapp.android.objects.Feedback;
import net.hockeyapp.android.objects.FeedbackMessage;
import net.hockeyapp.android.objects.FeedbackResponse;

// Referenced classes of package net.hockeyapp.android:
//            FeedbackActivity

class ponse
    implements Runnable
{

    final FeedbackActivity this$0;
    final FeedbackResponse val$feedbackResponse;

    public void run()
    {
        configureFeedbackView(true);
        Object obj = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
        SimpleDateFormat simpledateformat = new SimpleDateFormat("d MMM h:mm a");
        if (val$feedbackResponse != null && val$feedbackResponse.getFeedback() != null && val$feedbackResponse.getFeedback().getMessages() != null && val$feedbackResponse.getFeedback().getMessages().size() > 0)
        {
            FeedbackActivity.access$602(FeedbackActivity.this, val$feedbackResponse.getFeedback().getMessages());
            Collections.reverse(FeedbackActivity.access$600(FeedbackActivity.this));
            try
            {
                obj = ((SimpleDateFormat) (obj)).parse(((FeedbackMessage)FeedbackActivity.access$600(FeedbackActivity.this).get(0)).getCreatedAt());
                FeedbackActivity.access$700(FeedbackActivity.this).setText(String.format("Last Updated: %s", new Object[] {
                    simpledateformat.format(((java.util.Date) (obj)))
                }));
            }
            catch (ParseException parseexception)
            {
                parseexception.printStackTrace();
            }
            if (FeedbackActivity.access$800(FeedbackActivity.this) == null)
            {
                FeedbackActivity.access$802(FeedbackActivity.this, new MessagesAdapter(FeedbackActivity.access$300(FeedbackActivity.this), FeedbackActivity.access$600(FeedbackActivity.this)));
            } else
            {
                FeedbackActivity.access$800(FeedbackActivity.this).clear();
                FeedbackMessage feedbackmessage;
                for (Iterator iterator = FeedbackActivity.access$600(FeedbackActivity.this).iterator(); iterator.hasNext(); FeedbackActivity.access$800(FeedbackActivity.this).add(feedbackmessage))
                {
                    feedbackmessage = (FeedbackMessage)iterator.next();
                }

                FeedbackActivity.access$800(FeedbackActivity.this).notifyDataSetChanged();
            }
            FeedbackActivity.access$900(FeedbackActivity.this).setAdapter(FeedbackActivity.access$800(FeedbackActivity.this));
        }
    }

    ponse()
    {
        this$0 = final_feedbackactivity;
        val$feedbackResponse = FeedbackResponse.this;
        super();
    }
}
