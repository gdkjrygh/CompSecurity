// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.main;

import com.walmartlabs.utils.WLog;

// Referenced classes of package com.walmart.android.app.main:
//            MainActivity

class this._cls0
    implements Runnable
{

    final MainActivity this$0;

    public void run()
    {
        MainActivity.access$000(MainActivity.this);
        WLog.e(MainActivity.access$100(), "Using safeguard timeout for splash screen", new Exception((new StringBuilder()).append("Splashscreen timeout: resumed:").append(MainActivity.access$200(MainActivity.this)).append(" hasFocus:").append(hasWindowFocus()).toString()));
    }

    ()
    {
        this$0 = MainActivity.this;
        super();
    }
}
