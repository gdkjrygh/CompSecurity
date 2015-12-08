// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.hockeyapp.android;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import net.hockeyapp.android.tasks.ParseFeedbackTask;
import net.hockeyapp.android.utils.AsyncTaskUtils;

// Referenced classes of package net.hockeyapp.android:
//            FeedbackManager

static final class val.context extends Handler
{

    final Context val$context;

    public void handleMessage(Message message)
    {
        message = message.getData().getString("feedback_response");
        if (message != null)
        {
            message = new ParseFeedbackTask(val$context, message, null, "fetch");
            message.setUrlString(FeedbackManager.access$000(val$context));
            AsyncTaskUtils.execute(message);
        }
    }

    ls(Context context1)
    {
        val$context = context1;
        super();
    }
}
