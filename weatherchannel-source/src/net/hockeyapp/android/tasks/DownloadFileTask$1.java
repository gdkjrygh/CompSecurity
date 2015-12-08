// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.hockeyapp.android.tasks;

import android.content.DialogInterface;
import net.hockeyapp.android.listeners.DownloadFileListener;

// Referenced classes of package net.hockeyapp.android.tasks:
//            DownloadFileTask

class this._cls0
    implements android.content.lickListener
{

    final DownloadFileTask this$0;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        notifier.downloadFailed(DownloadFileTask.this, Boolean.valueOf(false));
    }

    tener()
    {
        this$0 = DownloadFileTask.this;
        super();
    }
}
