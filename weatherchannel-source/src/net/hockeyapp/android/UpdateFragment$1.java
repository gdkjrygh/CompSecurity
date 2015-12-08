// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.hockeyapp.android;

import android.widget.TextView;
import net.hockeyapp.android.listeners.DownloadFileListener;
import net.hockeyapp.android.tasks.DownloadFileTask;
import net.hockeyapp.android.tasks.GetFileSizeTask;

// Referenced classes of package net.hockeyapp.android:
//            UpdateFragment

class dFileListener extends DownloadFileListener
{

    final UpdateFragment this$0;
    final String val$fileDate;
    final TextView val$versionLabel;
    final String val$versionString;

    public void downloadSuccessful(DownloadFileTask downloadfiletask)
    {
        if (downloadfiletask instanceof GetFileSizeTask)
        {
            long l = ((GetFileSizeTask)downloadfiletask).getSize();
            downloadfiletask = (new StringBuilder()).append(String.format("%.2f", new Object[] {
                Float.valueOf((float)l / 1048576F)
            })).append(" MB").toString();
            val$versionLabel.setText((new StringBuilder()).append(val$versionString).append("\n").append(val$fileDate).append(" - ").append(downloadfiletask).toString());
        }
    }

    eTask()
    {
        this$0 = final_updatefragment;
        val$versionLabel = textview;
        val$versionString = s;
        val$fileDate = String.this;
        super();
    }
}
