// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.hockeyapp.android.tasks;

import android.os.Handler;
import android.os.Message;
import java.util.Queue;

// Referenced classes of package net.hockeyapp.android.tasks:
//            AttachmentDownloader

class this._cls0 extends Handler
{

    final AttachmentDownloader this$0;

    public void handleMessage(final Message retryCandidate)
    {
        retryCandidate = (wnloadJob)AttachmentDownloader.access$200(AttachmentDownloader.this).poll();
        if (!retryCandidate.isSuccess() && retryCandidate.consumeRetry())
        {
            postDelayed(new Runnable() {

                final AttachmentDownloader._cls1 this$1;
                final AttachmentDownloader.DownloadJob val$retryCandidate;

                public void run()
                {
                    AttachmentDownloader.access$200(this$0).add(retryCandidate);
                    AttachmentDownloader.access$300(this$0);
                }

            
            {
                this$1 = AttachmentDownloader._cls1.this;
                retryCandidate = downloadjob;
                super();
            }
            }, 3000L);
        }
        AttachmentDownloader.access$402(AttachmentDownloader.this, false);
        AttachmentDownloader.access$300(AttachmentDownloader.this);
    }

    _cls1.val.retryCandidate()
    {
        this$0 = AttachmentDownloader.this;
        super();
    }
}
