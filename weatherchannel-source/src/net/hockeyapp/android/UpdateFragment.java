// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.hockeyapp.android;

import android.app.Activity;
import android.app.DialogFragment;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;
import net.hockeyapp.android.listeners.DownloadFileListener;
import net.hockeyapp.android.tasks.DownloadFileTask;
import net.hockeyapp.android.tasks.GetFileSizeTask;
import net.hockeyapp.android.utils.AsyncTaskUtils;
import net.hockeyapp.android.utils.VersionHelper;
import net.hockeyapp.android.views.UpdateView;
import org.json.JSONArray;
import org.json.JSONException;

// Referenced classes of package net.hockeyapp.android:
//            UpdateInfoListener, UpdateManager, UpdateManagerListener

public class UpdateFragment extends DialogFragment
    implements android.view.View.OnClickListener, UpdateInfoListener
{

    private DownloadFileTask downloadTask;
    private String urlString;
    private VersionHelper versionHelper;
    private JSONArray versionInfo;

    public UpdateFragment()
    {
    }

    public static UpdateFragment newInstance(JSONArray jsonarray, String s)
    {
        Bundle bundle = new Bundle();
        bundle.putString("url", s);
        bundle.putString("versionInfo", jsonarray.toString());
        jsonarray = new UpdateFragment();
        jsonarray.setArguments(bundle);
        return jsonarray;
    }

    private void startDownloadTask(final Activity activity)
    {
        downloadTask = new DownloadFileTask(activity, urlString, new DownloadFileListener() {

            final UpdateFragment this$0;
            final Activity val$activity;

            public void downloadFailed(DownloadFileTask downloadfiletask, Boolean boolean1)
            {
                if (boolean1.booleanValue())
                {
                    startDownloadTask(activity);
                }
            }

            public void downloadSuccessful(DownloadFileTask downloadfiletask)
            {
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
                this$0 = UpdateFragment.this;
                activity = activity1;
                super();
            }
        });
        AsyncTaskUtils.execute(downloadTask);
    }

    public String getAppName()
    {
        Object obj = getActivity();
        try
        {
            PackageManager packagemanager = ((Activity) (obj)).getPackageManager();
            obj = packagemanager.getApplicationLabel(packagemanager.getApplicationInfo(((Activity) (obj)).getPackageName(), 0)).toString();
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
            i = getActivity().getPackageManager().getPackageInfo(getActivity().getPackageName(), 128).versionCode;
        }
        catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
        {
            return -1;
        }
        catch (NullPointerException nullpointerexception)
        {
            return -1;
        }
        return i;
    }

    public View getLayoutView()
    {
        return new UpdateView(getActivity(), false, true);
    }

    public void onClick(View view)
    {
        startDownloadTask(getActivity());
        dismiss();
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        try
        {
            urlString = getArguments().getString("url");
            versionInfo = new JSONArray(getArguments().getString("versionInfo"));
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            dismiss();
            return;
        }
        setStyle(1, 0x1030073);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, final Bundle versionLabel)
    {
        viewgroup = getLayoutView();
        versionHelper = new VersionHelper(getActivity(), versionInfo.toString(), this);
        ((TextView)viewgroup.findViewById(4098)).setText(getAppName());
        versionLabel = (TextView)viewgroup.findViewById(4099);
        final String versionString = (new StringBuilder()).append("Version ").append(versionHelper.getVersionString()).toString();
        final String fileDate = versionHelper.getFileDateString();
        layoutinflater = "Unknown size";
        long l = versionHelper.getFileSizeBytes();
        if (l >= 0L)
        {
            layoutinflater = (new StringBuilder()).append(String.format("%.2f", new Object[] {
                Float.valueOf((float)l / 1048576F)
            })).append(" MB").toString();
        } else
        {
            AsyncTaskUtils.execute(new GetFileSizeTask(getActivity(), urlString, new DownloadFileListener() {

                final UpdateFragment this$0;
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
                this$0 = UpdateFragment.this;
                versionLabel = textview;
                versionString = s;
                fileDate = s1;
                super();
            }
            }));
        }
        versionLabel.setText((new StringBuilder()).append(versionString).append("\n").append(fileDate).append(" - ").append(layoutinflater).toString());
        ((Button)viewgroup.findViewById(4100)).setOnClickListener(this);
        layoutinflater = (WebView)viewgroup.findViewById(4101);
        layoutinflater.clearCache(true);
        layoutinflater.destroyDrawingCache();
        layoutinflater.loadDataWithBaseURL("https://sdk.hockeyapp.net/", versionHelper.getReleaseNotes(false), "text/html", "utf-8", null);
        return viewgroup;
    }

}
