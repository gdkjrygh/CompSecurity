// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.hybrid;

import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;

// Referenced classes of package com.walmart.android.app.hybrid:
//            HybridPlatformBridge

class llback
    implements com.walmart.android.app.main.ivityResultCallback
{

    final HybridPlatformBridge this$0;
    final llback val$callback;

    public void onActivityResult(int i, int j, Intent intent)
    {
        Response response = new Response();
        if (j == 0)
        {
            Log.i(HybridPlatformBridge.access$100(), "Scan canceled!");
            response.action = "cancel";
            return;
        }
        intent = HybridPlatformBridge.access$200(HybridPlatformBridge.this, intent);
        Log.i(HybridPlatformBridge.access$100(), (new StringBuilder()).append("BarcodeTypeString: ").append(((codeInfo) (intent)).type).toString());
        Log.i(HybridPlatformBridge.access$100(), (new StringBuilder()).append("Barcode: ").append(((codeInfo) (intent)).barcode).toString());
        if (!TextUtils.isEmpty(((codeInfo) (intent)).barcode))
        {
            response.action = "ok";
            response.code = ((codeInfo) (intent)).barcode;
        } else
        {
            response.action = "cancel";
        }
        val$callback.respond(response);
    }

    llback()
    {
        this$0 = final_hybridplatformbridge;
        val$callback = llback.this;
        super();
    }
}
