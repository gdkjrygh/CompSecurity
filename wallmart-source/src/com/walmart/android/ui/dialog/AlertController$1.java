// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.ui.dialog;

import android.os.Handler;
import android.os.Message;
import android.view.View;

// Referenced classes of package com.walmart.android.ui.dialog:
//            AlertController

class this._cls0
    implements android.view.er
{

    final AlertController this$0;

    public void onClick(View view)
    {
        Object obj = null;
        if (view != AlertController.access$000(AlertController.this) || AlertController.access$100(AlertController.this) == null) goto _L2; else goto _L1
_L1:
        Message message = Message.obtain(AlertController.access$100(AlertController.this));
_L4:
        if (message != null)
        {
            message.sendToTarget();
        }
        AlertController.access$700(AlertController.this).obtainMessage(1, AlertController.access$600(AlertController.this)).sendToTarget();
        return;
_L2:
        if (view == AlertController.access$200(AlertController.this) && AlertController.access$300(AlertController.this) != null)
        {
            message = Message.obtain(AlertController.access$300(AlertController.this));
        } else
        {
            message = obj;
            if (view == AlertController.access$400(AlertController.this))
            {
                message = obj;
                if (AlertController.access$500(AlertController.this) != null)
                {
                    message = Message.obtain(AlertController.access$500(AlertController.this));
                }
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    ()
    {
        this$0 = AlertController.this;
        super();
    }
}
