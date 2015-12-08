// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.viewcrawler;


// Referenced classes of package com.mixpanel.android.viewcrawler:
//            ViewCrawler

private class mStopped
    implements Runnable
{

    private volatile boolean mStopped;
    final ViewCrawler this$0;

    public void run()
    {
        if (!mStopped)
        {
            android.os.Message message = ViewCrawler.access$0(ViewCrawler.this).obtainMessage(1);
            ViewCrawler.access$0(ViewCrawler.this).sendMessage(message);
        }
        ViewCrawler.access$0(ViewCrawler.this).postDelayed(this, 30000L);
    }

    public void start()
    {
        mStopped = false;
        ViewCrawler.access$0(ViewCrawler.this).post(this);
    }

    public void stop()
    {
        mStopped = true;
        ViewCrawler.access$0(ViewCrawler.this).removeCallbacks(this);
    }

    public ()
    {
        this$0 = ViewCrawler.this;
        super();
        mStopped = true;
    }
}
