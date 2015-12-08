// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.hockeyapp.android;

import net.hockeyapp.android.listeners.DownloadFileListener;
import net.hockeyapp.android.tasks.DownloadFileTask;

// Referenced classes of package net.hockeyapp.android:
//            UpdateActivity, UpdateManager, UpdateManagerListener

class dFileListener extends DownloadFileListener
{

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

    eTask()
    {
        this$0 = UpdateActivity.this;
        super();
    }
}
