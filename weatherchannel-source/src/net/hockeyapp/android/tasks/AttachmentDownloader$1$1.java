// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.hockeyapp.android.tasks;

import android.os.Handler;
import android.os.Message;
import java.util.Queue;

// Referenced classes of package net.hockeyapp.android.tasks:
//            AttachmentDownloader

class loadJob
    implements Runnable
{

    final is._cls0 this$1;
    final loadJob val$retryCandidate;

    public void run()
    {
        AttachmentDownloader.access$200(_fld0).add(val$retryCandidate);
        AttachmentDownloader.access$300(_fld0);
    }

    loadJob()
    {
        this$1 = final_loadjob;
        val$retryCandidate = loadJob.this;
        super();
    }

    // Unreferenced inner class net/hockeyapp/android/tasks/AttachmentDownloader$1

/* anonymous class */
    class AttachmentDownloader._cls1 extends Handler
    {

        final AttachmentDownloader this$0;

        public void handleMessage(Message message)
        {
            message = (AttachmentDownloader.DownloadJob)AttachmentDownloader.access$200(AttachmentDownloader.this).poll();
            if (!message.isSuccess() && message.consumeRetry())
            {
                postDelayed(message. new AttachmentDownloader._cls1._cls1(), 3000L);
            }
            AttachmentDownloader.access$402(AttachmentDownloader.this, false);
            AttachmentDownloader.access$300(AttachmentDownloader.this);
        }

            
            {
                this$0 = AttachmentDownloader.this;
                super();
            }
    }

}
