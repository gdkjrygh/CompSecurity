// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.hybrid;

import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import com.walmartlabs.utils.WLog;

// Referenced classes of package com.walmart.android.app.hybrid:
//            HybridPlatformBridge

class llback
    implements com.walmart.android.app.main.ivityResultCallback
{

    final HybridPlatformBridge this$0;
    final llback val$callback;

    public void onActivityResult(int i, int j, Intent intent)
    {
        iptResponse iptresponse = new iptResponse();
        if (j != 0) goto _L2; else goto _L1
_L1:
        Log.i(HybridPlatformBridge.access$100(), "RESULT_CANCELED");
        iptresponse.action = "cancel";
_L4:
        val$callback.respond(iptresponse);
        return;
_L2:
        if (j == -1)
        {
            Log.i(HybridPlatformBridge.access$100(), "RESULT_OK");
            if (intent != null)
            {
                String s = intent.getStringExtra("receipt_id");
                String s1 = intent.getStringExtra("EXTRA_TC_NUMBER");
                intent = intent.getStringExtra("EXTRA_DATE");
                WLog.i(HybridPlatformBridge.access$100(), (new StringBuilder()).append("Retrieved receiptId: ").append(s).append(" tcNumber: ").append(s1).append(" date: ").append(intent).toString());
                if (!TextUtils.isEmpty(s))
                {
                    iptresponse.receiptId = s;
                    iptresponse.action = "ok";
                } else
                if (!TextUtils.isEmpty(s1) && !TextUtils.isEmpty(intent))
                {
                    iptresponse.tcNumber = s1;
                    try
                    {
                        intent = intent.split("-");
                        iptresponse.year = Integer.parseInt(intent[0]);
                        iptresponse.month = Integer.parseInt(intent[1]) - 1;
                        iptresponse.day = Integer.parseInt(intent[2]);
                    }
                    // Misplaced declaration of an exception variable
                    catch (Intent intent)
                    {
                        WLog.e(HybridPlatformBridge.access$100(), "Failed to parse receipt date!", intent);
                    }
                    iptresponse.action = "ok";
                }
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    llback()
    {
        this$0 = final_hybridplatformbridge;
        val$callback = llback.this;
        super();
    }
}
