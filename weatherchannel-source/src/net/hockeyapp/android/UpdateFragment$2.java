// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.hockeyapp.android;

import android.app.Activity;
import net.hockeyapp.android.listeners.DownloadFileListener;
import net.hockeyapp.android.tasks.DownloadFileTask;

// Referenced classes of package net.hockeyapp.android:
//            UpdateFragment, UpdateManager, UpdateManagerListener

class dFileListener extends DownloadFileListener
{

    final UpdateFragment this$0;
    final Activity val$activity;

    public void downloadFailed(DownloadFileTask downloadfiletask, Boolean boolean1)
    {
        if (boolean1.booleanValue())
        {
            UpdateFragment.access$000(UpdateFragment.this, val$activity);
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

    eTask()
    {
        this$0 = final_updatefragment;
        val$activity = Activity.this;
        super();
    }
}
