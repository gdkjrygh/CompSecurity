// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.hockeyapp.android.tasks;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import java.util.ArrayList;
import net.hockeyapp.android.FeedbackActivity;
import net.hockeyapp.android.FeedbackManager;
import net.hockeyapp.android.FeedbackManagerListener;
import net.hockeyapp.android.objects.Feedback;
import net.hockeyapp.android.objects.FeedbackMessage;
import net.hockeyapp.android.objects.FeedbackResponse;
import net.hockeyapp.android.utils.FeedbackParser;
import net.hockeyapp.android.utils.PrefsUtil;

public class ParseFeedbackTask extends AsyncTask
{

    public static final String ID_LAST_MESSAGE_PROCESSED = "idLastMessageProcessed";
    public static final String ID_LAST_MESSAGE_SEND = "idLastMessageSend";
    public static final int NEW_ANSWER_NOTIFICATION_ID = 2;
    public static final String PREFERENCES_NAME = "net.hockeyapp.android.feedback";
    private Context context;
    private String feedbackResponse;
    private Handler handler;
    private String requestType;
    private String urlString;

    public ParseFeedbackTask(Context context1, String s, Handler handler1, String s1)
    {
        context = context1;
        feedbackResponse = s;
        handler = handler1;
        requestType = s1;
        urlString = null;
    }

    private void checkForNewAnswers(ArrayList arraylist)
    {
        arraylist = (FeedbackMessage)arraylist.get(arraylist.size() - 1);
        int i = arraylist.getId();
        Object obj = context.getSharedPreferences("net.hockeyapp.android.feedback", 0);
        if (requestType.equals("send"))
        {
            PrefsUtil.applyChanges(((SharedPreferences) (obj)).edit().putInt("idLastMessageSend", i).putInt("idLastMessageProcessed", i));
        } else
        if (requestType.equals("fetch"))
        {
            int j = ((SharedPreferences) (obj)).getInt("idLastMessageSend", -1);
            int k = ((SharedPreferences) (obj)).getInt("idLastMessageProcessed", -1);
            if (i != j && i != k)
            {
                PrefsUtil.applyChanges(((SharedPreferences) (obj)).edit().putInt("idLastMessageProcessed", i));
                boolean flag = false;
                obj = FeedbackManager.getLastListener();
                if (obj != null)
                {
                    flag = ((FeedbackManagerListener) (obj)).feedbackAnswered(arraylist);
                }
                if (!flag)
                {
                    startNotification(context);
                    return;
                }
            }
        }
    }

    private void startNotification(Context context1)
    {
        if (urlString == null)
        {
            return;
        }
        NotificationManager notificationmanager = (NotificationManager)context1.getSystemService("notification");
        Notification notification = new Notification(context1.getResources().getIdentifier("ic_menu_refresh", "drawable", "android"), "New Answer to Your Feedback.", System.currentTimeMillis());
        Object obj = null;
        if (FeedbackManager.getLastListener() != null)
        {
            obj = FeedbackManager.getLastListener().getFeedbackActivityClass();
        }
        Object obj1 = obj;
        if (obj == null)
        {
            obj1 = net/hockeyapp/android/FeedbackActivity;
        }
        obj = new Intent();
        ((Intent) (obj)).setFlags(0x30000000);
        ((Intent) (obj)).setClass(context1, ((Class) (obj1)));
        ((Intent) (obj)).putExtra("url", urlString);
        notification.setLatestEventInfo(context1, "HockeyApp Feedback", "A new answer to your feedback is available.", PendingIntent.getActivity(context1, 0, ((Intent) (obj)), 0x40000000));
        notificationmanager.notify(2, notification);
    }

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((Void[])aobj);
    }

    protected transient FeedbackResponse doInBackground(Void avoid[])
    {
        if (context != null && feedbackResponse != null)
        {
            avoid = FeedbackParser.getInstance().parseFeedbackResponse(feedbackResponse);
            if (avoid != null && avoid.getFeedback() != null)
            {
                ArrayList arraylist = avoid.getFeedback().getMessages();
                if (arraylist != null && !arraylist.isEmpty())
                {
                    checkForNewAnswers(arraylist);
                }
            }
            return avoid;
        } else
        {
            return null;
        }
    }

    protected volatile void onPostExecute(Object obj)
    {
        onPostExecute((FeedbackResponse)obj);
    }

    protected void onPostExecute(FeedbackResponse feedbackresponse)
    {
        if (feedbackresponse != null && handler != null)
        {
            Message message = new Message();
            Bundle bundle = new Bundle();
            bundle.putSerializable("parse_feedback_response", feedbackresponse);
            message.setData(bundle);
            handler.sendMessage(message);
        }
    }

    public void setUrlString(String s)
    {
        urlString = s;
    }
}
