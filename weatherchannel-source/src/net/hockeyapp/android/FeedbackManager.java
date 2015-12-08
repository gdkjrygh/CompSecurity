// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.hockeyapp.android;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Toast;
import java.io.File;
import java.io.FileOutputStream;
import net.hockeyapp.android.tasks.ParseFeedbackTask;
import net.hockeyapp.android.tasks.SendFeedbackTask;
import net.hockeyapp.android.utils.AsyncTaskUtils;
import net.hockeyapp.android.utils.PrefsUtil;
import net.hockeyapp.android.utils.Util;

// Referenced classes of package net.hockeyapp.android:
//            Constants, FeedbackManagerListener, FeedbackActivity

public class FeedbackManager
{
    private static class MediaScannerClient
        implements android.media.MediaScannerConnection.MediaScannerConnectionClient
    {

        private MediaScannerConnection connection;
        private String path;

        public void onMediaScannerConnected()
        {
            if (connection != null)
            {
                connection.scanFile(path, null);
            }
        }

        public void onScanCompleted(String s, Uri uri)
        {
            Log.i("HockeyApp", String.format("Scanned path %s -> URI = %s", new Object[] {
                s, uri.toString()
            }));
            connection.disconnect();
        }

        public void setConnection(MediaScannerConnection mediascannerconnection)
        {
            connection = mediascannerconnection;
        }

        private MediaScannerClient(String s)
        {
            connection = null;
            path = s;
        }

    }


    private static final String BROADCAST_ACTION = "net.hockeyapp.android.SCREENSHOT";
    private static final int BROADCAST_REQUEST_CODE = 1;
    private static final int SCREENSHOT_NOTIFICATION_ID = 1;
    private static Activity currentActivity;
    private static String identifier = null;
    private static FeedbackManagerListener lastListener = null;
    private static boolean notificationActive = false;
    private static BroadcastReceiver receiver = null;
    private static String urlString = null;

    public FeedbackManager()
    {
    }

    public static void checkForAnswersAndNotify(Context context)
    {
        String s = PrefsUtil.getInstance().getFeedbackTokenFromPrefs(context);
        if (s == null)
        {
            return;
        } else
        {
            int i = context.getSharedPreferences("net.hockeyapp.android.feedback", 0).getInt("idLastMessageSend", -1);
            context = new SendFeedbackTask(context, getURLString(context), null, null, null, null, null, s, new Handler(context) {

                final Context val$context;

                public void handleMessage(Message message)
                {
                    message = message.getData().getString("feedback_response");
                    if (message != null)
                    {
                        message = new ParseFeedbackTask(context, message, null, "fetch");
                        message.setUrlString(FeedbackManager.getURLString(context));
                        AsyncTaskUtils.execute(message);
                    }
                }

            
            {
                context = context1;
                super();
            }
            }, true);
            context.setShowProgressDialog(false);
            context.setLastMessageId(i);
            AsyncTaskUtils.execute(context);
            return;
        }
    }

    private static void endNotification()
    {
        notificationActive = false;
        currentActivity.unregisterReceiver(receiver);
        ((NotificationManager)currentActivity.getSystemService("notification")).cancel(1);
    }

    public static FeedbackManagerListener getLastListener()
    {
        return lastListener;
    }

    private static String getURLString(Context context)
    {
        return (new StringBuilder()).append(urlString).append("api/2/apps/").append(identifier).append("/feedback/").toString();
    }

    public static void register(Context context, String s)
    {
        register(context, s, null);
    }

    public static void register(Context context, String s, String s1, FeedbackManagerListener feedbackmanagerlistener)
    {
        if (context != null)
        {
            identifier = Util.sanitizeAppIdentifier(s1);
            urlString = s;
            lastListener = feedbackmanagerlistener;
            Constants.loadFromContext(context);
        }
    }

    public static void register(Context context, String s, FeedbackManagerListener feedbackmanagerlistener)
    {
        register(context, "https://sdk.hockeyapp.net/", s, feedbackmanagerlistener);
    }

    public static void setActivityForScreenshot(Activity activity)
    {
        currentActivity = activity;
        if (!notificationActive)
        {
            startNotification();
        }
    }

    public static void showFeedbackActivity(Context context)
    {
        if (context != null)
        {
            Object obj = null;
            if (lastListener != null)
            {
                obj = lastListener.getFeedbackActivityClass();
            }
            Object obj1 = obj;
            if (obj == null)
            {
                obj1 = net/hockeyapp/android/FeedbackActivity;
            }
            obj = new Intent();
            ((Intent) (obj)).setFlags(0x10000000);
            ((Intent) (obj)).setClass(context, ((Class) (obj1)));
            ((Intent) (obj)).putExtra("url", getURLString(context));
            context.startActivity(((Intent) (obj)));
        }
    }

    private static void startNotification()
    {
        notificationActive = true;
        NotificationManager notificationmanager = (NotificationManager)currentActivity.getSystemService("notification");
        Notification notification = new Notification(currentActivity.getResources().getIdentifier("ic_menu_camera", "drawable", "android"), "", System.currentTimeMillis());
        Object obj = new Intent();
        ((Intent) (obj)).setAction("net.hockeyapp.android.SCREENSHOT");
        obj = PendingIntent.getBroadcast(currentActivity, 1, ((Intent) (obj)), 0x40000000);
        notification.setLatestEventInfo(currentActivity, "HockeyApp Feedback", "Take a screenshot for your feedback.", ((PendingIntent) (obj)));
        notificationmanager.notify(1, notification);
        if (receiver == null)
        {
            receiver = new BroadcastReceiver() {

                public void onReceive(Context context, Intent intent)
                {
                    FeedbackManager.takeScreenshot(context);
                }

            };
        }
        currentActivity.registerReceiver(receiver, new IntentFilter("net.hockeyapp.android.SCREENSHOT"));
    }

    public static void takeScreenshot(Context context)
    {
        Object obj = currentActivity.getWindow().getDecorView();
        ((View) (obj)).setDrawingCacheEnabled(true);
        Object obj1 = ((View) (obj)).getDrawingCache();
        Object obj2 = currentActivity.getLocalClassName();
        File file = Constants.getHockeyAppStorageDir();
        obj = new File(file, (new StringBuilder()).append(((String) (obj2))).append(".jpg").toString());
        for (int i = 1; ((File) (obj)).exists(); i++)
        {
            obj = new File(file, (new StringBuilder()).append(((String) (obj2))).append("_").append(i).append(".jpg").toString());
        }

        (new AsyncTask(((Bitmap) (obj1)), context) {

            final Bitmap val$bitmap;
            final Context val$context;

            protected transient Boolean doInBackground(File afile[])
            {
                try
                {
                    afile = new FileOutputStream(afile[0]);
                    bitmap.compress(android.graphics.Bitmap.CompressFormat.JPEG, 100, afile);
                    afile.close();
                }
                // Misplaced declaration of an exception variable
                catch (File afile[])
                {
                    Log.e("HockeyApp", "Could not save screenshot.", afile);
                    return Boolean.valueOf(false);
                }
                return Boolean.valueOf(true);
            }

            protected volatile Object doInBackground(Object aobj[])
            {
                return doInBackground((File[])aobj);
            }

            protected void onPostExecute(Boolean boolean1)
            {
                if (!boolean1.booleanValue())
                {
                    Toast.makeText(context, "Screenshot could not be created. Sorry.", 2000).show();
                }
            }

            protected volatile void onPostExecute(Object obj3)
            {
                onPostExecute((Boolean)obj3);
            }

            
            {
                bitmap = bitmap1;
                context = context1;
                super();
            }
        }).execute(new File[] {
            obj
        });
        obj1 = new MediaScannerClient(((File) (obj)).getAbsolutePath());
        obj2 = new MediaScannerConnection(currentActivity, ((android.media.MediaScannerConnection.MediaScannerConnectionClient) (obj1)));
        ((MediaScannerClient) (obj1)).setConnection(((MediaScannerConnection) (obj2)));
        ((MediaScannerConnection) (obj2)).connect();
        Toast.makeText(context, (new StringBuilder()).append("Screenshot '").append(((File) (obj)).getName()).append("' is available in gallery.").toString(), 2000).show();
    }

    public static void unregister()
    {
        lastListener = null;
    }

    public static void unsetCurrentActivityForScreenshot(Activity activity)
    {
        if (currentActivity == null || currentActivity != activity)
        {
            return;
        } else
        {
            endNotification();
            currentActivity = null;
            return;
        }
    }


}
