// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.main;

import android.os.Process;

// Referenced classes of package com.walmart.android.app.main:
//            UpgradeActivity

class this._cls0
    implements Runnable
{

    final UpgradeActivity this$0;

    public void run()
    {
        Process.killProcess(Process.myPid());
    }

    ()
    {
        this$0 = UpgradeActivity.this;
        super();
    }
}
