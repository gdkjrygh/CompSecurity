// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.hybrid;


// Referenced classes of package com.walmart.android.app.hybrid:
//            JSBridgeAdapter

class val.jsCallback
    implements Runnable
{

    final val.jsCallback this$1;
    final String val$data;
    final com.walmartlabs.hybrid. val$jsCallback;

    public void run()
    {
        ndleOnMain(val$data, val$jsCallback);
    }

    ()
    {
        this$1 = final_;
        val$data = s;
        val$jsCallback = com.walmartlabs.hybrid..this;
        super();
    }
}
