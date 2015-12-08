// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.bridge;

import android.app.Dialog;
import io.theholygrail.dingo.platform.PlatformBridgeCallback;

// Referenced classes of package com.walmart.android.app.bridge:
//            BridgeController

class this._cls0
    implements PlatformBridgeCallback
{

    final BridgeController this$0;

    public void onDialogDismissed(Dialog dialog)
    {
        if (BridgeController.access$800(BridgeController.this) != null && BridgeController.access$800(BridgeController.this) == dialog)
        {
            BridgeController.access$802(BridgeController.this, null);
        }
    }

    public void showDialog(Dialog dialog)
    {
        if (!BridgeController.access$000(BridgeController.this).isVisible())
        {
            break MISSING_BLOCK_LABEL_67;
        }
        if (BridgeController.access$800(BridgeController.this) != null && BridgeController.access$800(BridgeController.this).isShowing())
        {
            BridgeController.access$800(BridgeController.this).dismiss();
        }
        BridgeController.access$802(BridgeController.this, dialog);
        BridgeController.access$800(BridgeController.this).show();
        return;
        dialog;
        BridgeController.access$802(BridgeController.this, null);
        return;
    }

    esenterCallback()
    {
        this$0 = BridgeController.this;
        super();
    }
}
