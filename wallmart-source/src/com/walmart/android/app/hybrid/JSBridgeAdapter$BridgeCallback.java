// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.hybrid;


// Referenced classes of package com.walmart.android.app.hybrid:
//            JSBridgeAdapter

public static class mJSCallback
{

    private com.walmartlabs.hybrid.ack mJSCallback;

    public void respond(Object obj)
    {
        mJSCallback.callbackToJs(obj);
    }

    public (com.walmartlabs.hybrid.ack ack)
    {
        mJSCallback = ack;
    }
}
