// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.internal.widget;


// Referenced classes of package com.actionbarsherlock.internal.widget:
//            IcsProgressBar

class mFromUser
    implements Runnable
{

    private boolean mFromUser;
    private int mId;
    private int mProgress;
    final IcsProgressBar this$0;

    public void run()
    {
        IcsProgressBar.access$000(IcsProgressBar.this, mId, mProgress, mFromUser, true);
        IcsProgressBar.access$102(IcsProgressBar.this, this);
    }

    public void setup(int i, int j, boolean flag)
    {
        mId = i;
        mProgress = j;
        mFromUser = flag;
    }

    (int i, int j, boolean flag)
    {
        this$0 = IcsProgressBar.this;
        super();
        mId = i;
        mProgress = j;
        mFromUser = flag;
    }
}
