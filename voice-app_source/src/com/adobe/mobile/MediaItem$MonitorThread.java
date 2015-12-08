// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mobile;

import java.util.concurrent.ExecutorService;

// Referenced classes of package com.adobe.mobile:
//            MediaItem, StaticMethods, MediaAnalytics

private static class <init> extends Thread
{

    protected boolean canceled;
    long delay;
    protected MediaItem monitorMediaItem;

    public void run()
    {
        try
        {
            while (!canceled) 
            {
                Thread.sleep(delay);
                StaticMethods.getMediaExecutor().execute(new Runnable() {

                    final MediaItem.MonitorThread this$0;

                    public void run()
                    {
                        monitorMediaItem.mediaAnalytics.monitor(monitorMediaItem.name, -1D);
                    }

            
            {
                this$0 = MediaItem.MonitorThread.this;
                super();
            }
                });
            }
        }
        catch (InterruptedException interruptedexception)
        {
            StaticMethods.logWarningFormat("Media - Background Thread Interrupted : %s", new Object[] {
                interruptedexception.getMessage()
            });
        }
    }

    private _cls1.this._cls0()
    {
        delay = 1000L;
        canceled = false;
    }

    canceled(canceled canceled1)
    {
        this();
    }
}
