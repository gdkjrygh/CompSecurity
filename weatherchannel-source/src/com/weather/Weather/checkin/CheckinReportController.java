// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.checkin;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Environment;
import android.os.Handler;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import com.google.common.base.Preconditions;
import com.weather.checkin.provider.CheckinHistoryManager;
import com.weather.checkin.provider.CheckinHistoryRecord;
import com.weather.commons.analytics.checkin.CheckInSocialWeatherSummaryRecorder;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;
import flow.Backstack;
import flow.Flow;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

// Referenced classes of package com.weather.Weather.checkin:
//            Controller, CheckinDisplayController, CheckinImageCreator, CheckinDisplayView, 
//            CheckinHistoryListController

public class CheckinReportController
    implements Controller, CheckinDisplayController
{

    private static final String TAG = "CheckinReportController";
    Activity activity;
    volatile File checkinImagePath;
    Flow flow;
    private final Handler handler;
    CheckinHistoryManager historyManager;
    private final CheckinHistoryRecord historyRecord;
    CheckinImageCreator imageCreator;
    CheckInSocialWeatherSummaryRecorder localyticsRecorder;
    private volatile boolean okToSendOutAnalytics;
    private CheckinDisplayView view;

    public CheckinReportController(CheckinHistoryRecord checkinhistoryrecord, Handler handler1)
    {
        handler = handler1;
        historyRecord = (CheckinHistoryRecord)Preconditions.checkNotNull(checkinhistoryrecord);
        okToSendOutAnalytics = true;
    }

    private File createTemporaryImageFile(File file)
        throws IOException
    {
        if (file == null)
        {
            throw new IOException("null image directory");
        } else
        {
            String s = (new SimpleDateFormat("yyyyMMdd_HHmm", Locale.US)).format(new Date());
            file = File.createTempFile((new StringBuilder()).append("socialweather_").append(s).append('_').toString(), ".jpg", file);
            Log.i("CheckinReportController", (new StringBuilder()).append("imageFile=").append(file.getAbsolutePath()).append("; exists=").append(file.exists()).toString());
            return file;
        }
    }

    private void deleteOldImageFile(File file)
    {
        if (file != null && !file.delete())
        {
            Log.w("CheckinReportController", (new StringBuilder()).append("Unable to delete unused checkin photo.  path = ").append(checkinImagePath.getAbsolutePath()).toString());
        }
    }

    private void displayErrorMessageOnUitThread()
    {
        handler.post(new _cls1());
    }

    private File getFileForCamera()
        throws IOException
    {
        File file = activity.getExternalCacheDir();
        if (file == null || !file.exists())
        {
            throw new IOException("Unable to find an external cache directory");
        } else
        {
            return new File(file, "CheckinImage.jpg");
        }
    }

    private void replaceSelfWithNewView(Controller controller)
    {
        if (equals(flow.getBackstack().current().getScreen()))
        {
            flow.Backstack.Builder builder = flow.getBackstack().buildUpon();
            builder.pop();
            builder.push(controller);
            flow.forward(builder.build());
            return;
        } else
        {
            flow.goTo(controller);
            return;
        }
    }

    private void reportLocalytics()
    {
        LogUtil.d("CheckinReportController", LoggingMetaTags.TWC_SOCIAL, "localtyics tag: checkin report", new Object[0]);
        localyticsRecorder.tagEventIfHaveAttributesAndClearData();
    }

    private void updateImage(File file)
    {
    /* block-local class not found */
    class CheckinHistoryRecordReceiver {}

        CheckinHistoryRecordReceiver checkinhistoryrecordreceiver = new CheckinHistoryRecordReceiver(file, null);
        int i = activity.getResources().getDimensionPixelOffset(0x7f0a00c0);
        try
        {
            String s = createTemporaryImageFile(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES)).getAbsolutePath();
            LogUtil.v("CheckinReportController", LoggingMetaTags.TWC_SOCIAL, "updateImage: kicking off imageCreator.asyncUpdateImage.  path=%s, resultPath=%s", new Object[] {
                file, s
            });
            imageCreator.asyncUpdateImage(historyRecord.addImage(s), i, file, checkinhistoryrecordreceiver);
            return;
        }
        catch (IOException ioexception)
        {
            Log.w("CheckinReportController", "Unable to create directory for final image", ioexception);
        }
        deleteOldImageFile(file);
        checkinImagePath = null;
        displayErrorMessageOnUitThread();
    }

    public boolean createOptionsMenu(Menu menu, MenuInflater menuinflater)
    {
        Preconditions.checkNotNull(menu);
        Preconditions.checkNotNull(menuinflater);
        menuinflater.inflate(0x7f100000, menu);
        return true;
    }

    public void handleActivityResult(int i, int j, Intent intent)
    {
        LogUtil.v("CheckinReportController", LoggingMetaTags.TWC_SOCIAL, "handleActivity: requestCode=%s, resultCode=%s, data=%s, checkinImagePath=%s", new Object[] {
            Integer.valueOf(i), Integer.valueOf(j), intent, checkinImagePath
        });
        if (i != 2) goto _L2; else goto _L1
_L1:
        boolean flag;
        okToSendOutAnalytics = true;
        flag = false;
        if (j != -1) goto _L4; else goto _L3
_L3:
        if (checkinImagePath != null)
        {
            i = 1;
            updateImage(checkinImagePath);
            localyticsRecorder.incrementPhotosTaken();
            reportLocalytics();
            LogUtil.d("CheckinReportController", LoggingMetaTags.TWC_SOCIAL, "localtyics tag: successful picture taken", new Object[0]);
        } else
        {
            Log.w("CheckinReportController", "checkinImagePath was null, ignoring...");
            localyticsRecorder.incrementPhotosTakenFailedBecauseOfCheckinPath();
            i = ((flag) ? 1 : 0);
        }
_L6:
        if (i == 0)
        {
            deleteOldImageFile(checkinImagePath);
            checkinImagePath = null;
        }
_L2:
        return;
_L4:
        i = ((flag) ? 1 : 0);
        if (j != 0)
        {
            view.showToast(activity.getString(0x7f0700c7));
            localyticsRecorder.incrementPhotosTakenFailed();
            i = ((flag) ? 1 : 0);
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public boolean handleOptionsMenuSelection(int i)
    {
        boolean flag = false;
        if (i == 0x7f0d035c)
        {
            okToSendOutAnalytics = false;
            flow.goTo(new CheckinHistoryListController());
            localyticsRecorder.userViewedWeatherHistory();
            flag = true;
        }
        return flag;
    }

    public void onViewInvisible()
    {
        if (okToSendOutAnalytics)
        {
            LogUtil.d("CheckinReportController", LoggingMetaTags.TWC_SOCIAL, "okToSendOutAnalytics", new Object[0]);
            reportLocalytics();
        }
    }

    public void onViewVisible()
    {
        view.initialize();
        view.displayReport(historyRecord);
        okToSendOutAnalytics = true;
    }

    CheckinDisplayController provideController()
    {
        return this;
    }

    public void setView(Object obj)
    {
        view = (CheckinDisplayView)Preconditions.checkNotNull(obj);
    }

    public void setupForImageRecovery()
    {
        try
        {
            checkinImagePath = getFileForCamera();
            return;
        }
        catch (IOException ioexception)
        {
            Log.e("CheckinReportController", "Unable to create file for image storage", ioexception);
        }
    }

    public void shareWithMessenger()
    {
    }

    public void takePhoto()
    {
        okToSendOutAnalytics = false;
        if (checkinImagePath != null)
        {
            return;
        }
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        try
        {
            checkinImagePath = getFileForCamera();
            intent.putExtra("output", Uri.fromFile(checkinImagePath));
            if (intent.resolveActivity(activity.getPackageManager()) != null)
            {
                LogUtil.d("CheckinReportController", LoggingMetaTags.TWC_SOCIAL, "Saving image to %s", new Object[] {
                    checkinImagePath
                });
                activity.startActivityForResult(intent, 2);
                return;
            }
        }
        catch (IOException ioexception)
        {
            Log.e("CheckinReportController", "Unable to create file for image storage", ioexception);
            view.showToast(activity.getString(0x7f0700c7));
            return;
        }
        view.showToast(activity.getString(0x7f0700c7));
        return;
    }







    // Unreferenced inner class com/weather/Weather/checkin/CheckinReportController$ReplaceViewRunnable
    /* block-local class not found */
    class ReplaceViewRunnable {}


    /* member class not found */
    class _cls1 {}

}
