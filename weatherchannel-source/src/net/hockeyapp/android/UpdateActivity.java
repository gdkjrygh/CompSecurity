// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.hockeyapp.android;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;
import net.hockeyapp.android.listeners.DownloadFileListener;
import net.hockeyapp.android.objects.ErrorObject;
import net.hockeyapp.android.tasks.DownloadFileTask;
import net.hockeyapp.android.tasks.GetFileSizeTask;
import net.hockeyapp.android.utils.AsyncTaskUtils;
import net.hockeyapp.android.utils.VersionHelper;
import net.hockeyapp.android.views.UpdateView;

// Referenced classes of package net.hockeyapp.android:
//            UpdateActivityInterface, UpdateInfoListener, UpdateManager, UpdateManagerListener

public class UpdateActivity extends Activity
    implements UpdateActivityInterface, UpdateInfoListener, android.view.View.OnClickListener
{

    private final int DIALOG_ERROR_ID = 0;
    private Context context;
    protected DownloadFileTask downloadTask;
    private ErrorObject error;
    protected VersionHelper versionHelper;

    public UpdateActivity()
    {
    }

    private boolean isUnknownSourcesChecked()
    {
        int i;
        if (android.os.Build.VERSION.SDK_INT >= 17 && android.os.Build.VERSION.SDK_INT < 21)
        {
            return android.provider.Settings.Global.getInt(getContentResolver(), "install_non_market_apps") == 1;
        }
        try
        {
            i = android.provider.Settings.Secure.getInt(getContentResolver(), "install_non_market_apps");
        }
        catch (android.provider.Settings.SettingNotFoundException settingnotfoundexception)
        {
            return true;
        }
label0:
        {
            if (i != 1)
            {
                return false;
            }
            break label0;
        }
    }

    private boolean isWriteExternalStorageSet(Context context1)
    {
        return context1.checkCallingOrSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0;
    }

    protected void configureView()
    {
        ((TextView)findViewById(4098)).setText(getAppName());
        final TextView versionLabel = (TextView)findViewById(4099);
        final String versionString = (new StringBuilder()).append("Version ").append(versionHelper.getVersionString()).toString();
        final String fileDate = versionHelper.getFileDateString();
        Object obj = "Unknown size";
        long l = versionHelper.getFileSizeBytes();
        if (l >= 0L)
        {
            obj = (new StringBuilder()).append(String.format("%.2f", new Object[] {
                Float.valueOf((float)l / 1048576F)
            })).append(" MB").toString();
        } else
        {
            AsyncTaskUtils.execute(new GetFileSizeTask(this, getIntent().getStringExtra("url"), new DownloadFileListener() {

                final UpdateActivity this$0;
                final String val$fileDate;
                final TextView val$versionLabel;
                final String val$versionString;

                public void downloadSuccessful(DownloadFileTask downloadfiletask)
                {
                    if (downloadfiletask instanceof GetFileSizeTask)
                    {
                        long l1 = ((GetFileSizeTask)downloadfiletask).getSize();
                        downloadfiletask = (new StringBuilder()).append(String.format("%.2f", new Object[] {
                            Float.valueOf((float)l1 / 1048576F)
                        })).append(" MB").toString();
                        versionLabel.setText((new StringBuilder()).append(versionString).append("\n").append(fileDate).append(" - ").append(downloadfiletask).toString());
                    }
                }

            
            {
                this$0 = UpdateActivity.this;
                versionLabel = textview;
                versionString = s;
                fileDate = s1;
                super();
            }
            }));
        }
        versionLabel.setText((new StringBuilder()).append(versionString).append("\n").append(fileDate).append(" - ").append(((String) (obj))).toString());
        ((Button)findViewById(4100)).setOnClickListener(this);
        obj = (WebView)findViewById(4101);
        ((WebView) (obj)).clearCache(true);
        ((WebView) (obj)).destroyDrawingCache();
        ((WebView) (obj)).loadDataWithBaseURL("https://sdk.hockeyapp.net/", getReleaseNotes(), "text/html", "utf-8", null);
    }

    protected void createDownloadTask(String s, DownloadFileListener downloadfilelistener)
    {
        downloadTask = new DownloadFileTask(this, s, downloadfilelistener);
    }

    public void enableUpdateButton()
    {
        findViewById(4100).setEnabled(true);
    }

    public String getAppName()
    {
        Object obj;
        try
        {
            obj = getPackageManager();
            obj = ((PackageManager) (obj)).getApplicationLabel(((PackageManager) (obj)).getApplicationInfo(getPackageName(), 0)).toString();
        }
        catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
        {
            return "";
        }
        return ((String) (obj));
    }

    public int getCurrentVersionCode()
    {
        int i;
        try
        {
            i = getPackageManager().getPackageInfo(getPackageName(), 128).versionCode;
        }
        catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
        {
            return -1;
        }
        return i;
    }

    public volatile View getLayoutView()
    {
        return getLayoutView();
    }

    public ViewGroup getLayoutView()
    {
        return new UpdateView(this);
    }

    protected String getReleaseNotes()
    {
        return versionHelper.getReleaseNotes(false);
    }

    public void onClick(View view)
    {
        if (!isWriteExternalStorageSet(context))
        {
            error = new ErrorObject();
            error.setMessage("The permission to access the external storage permission is not set. Please contact the developer.");
            runOnUiThread(new Runnable() {

                final UpdateActivity this$0;

                public void run()
                {
                    showDialog(0);
                }

            
            {
                this$0 = UpdateActivity.this;
                super();
            }
            });
            return;
        }
        if (!isUnknownSourcesChecked())
        {
            error = new ErrorObject();
            error.setMessage("The installation from unknown sources is not enabled. Please check the device settings.");
            runOnUiThread(new Runnable() {

                final UpdateActivity this$0;

                public void run()
                {
                    showDialog(0);
                }

            
            {
                this$0 = UpdateActivity.this;
                super();
            }
            });
            return;
        } else
        {
            startDownloadTask();
            view.setEnabled(false);
            return;
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setTitle("App Update");
        setContentView(getLayoutView());
        context = this;
        versionHelper = new VersionHelper(this, getIntent().getStringExtra("json"), this);
        configureView();
        downloadTask = (DownloadFileTask)getLastNonConfigurationInstance();
        if (downloadTask != null)
        {
            downloadTask.attach(this);
        }
    }

    protected Dialog onCreateDialog(int i)
    {
        switch (i)
        {
        default:
            return null;

        case 0: // '\0'
            return (new android.app.AlertDialog.Builder(this)).setMessage("An error has occured").setCancelable(false).setTitle("Error").setIcon(0x1080027).setPositiveButton("OK", new android.content.DialogInterface.OnClickListener() {

                final UpdateActivity this$0;

                public void onClick(DialogInterface dialoginterface, int j)
                {
                    error = null;
                    dialoginterface.cancel();
                }

            
            {
                this$0 = UpdateActivity.this;
                super();
            }
            }).create();
        }
    }

    protected void onPrepareDialog(int i, Dialog dialog)
    {
        switch (i)
        {
        default:
            return;

        case 0: // '\0'
            dialog = (AlertDialog)dialog;
            break;
        }
        if (error != null)
        {
            dialog.setMessage(error.getMessage());
            return;
        } else
        {
            dialog.setMessage("An unknown error has occured.");
            return;
        }
    }

    public Object onRetainNonConfigurationInstance()
    {
        if (downloadTask != null)
        {
            downloadTask.detach();
        }
        return downloadTask;
    }

    protected void startDownloadTask()
    {
        startDownloadTask(getIntent().getStringExtra("url"));
    }

    protected void startDownloadTask(String s)
    {
        createDownloadTask(s, new DownloadFileListener() {

            final UpdateActivity this$0;

            public void downloadFailed(DownloadFileTask downloadfiletask, Boolean boolean1)
            {
                if (boolean1.booleanValue())
                {
                    startDownloadTask();
                    return;
                } else
                {
                    enableUpdateButton();
                    return;
                }
            }

            public void downloadSuccessful(DownloadFileTask downloadfiletask)
            {
                enableUpdateButton();
            }

            public String getStringForResource(int i)
            {
                UpdateManagerListener updatemanagerlistener = UpdateManager.getLastListener();
                if (updatemanagerlistener != null)
                {
                    return updatemanagerlistener.getStringForResource(i);
                } else
                {
                    return null;
                }
            }

            
            {
                this$0 = UpdateActivity.this;
                super();
            }
        });
        AsyncTaskUtils.execute(downloadTask);
    }


/*
    static ErrorObject access$002(UpdateActivity updateactivity, ErrorObject errorobject)
    {
        updateactivity.error = errorobject;
        return errorobject;
    }

*/
}
