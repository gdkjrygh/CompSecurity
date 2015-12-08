// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.config;

import android.content.Context;
import android.content.DialogInterface;
import com.squareup.otto.Bus;
import com.walmart.android.service.MessageBus;
import com.walmartlabs.ereceipt.service.EReceiptManager;

// Referenced classes of package com.walmart.android.config:
//            SaverServiceSettings, ServiceConfigChangedEvent

static final class val.context
    implements android.content.Listener
{

    final Context val$context;
    final int val$selectedIndex;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        if (i != val$selectedIndex)
        {
            SaverServiceSettings.access$000(val$context, "saver_server_setting", i);
            EReceiptManager.get().clearAllReceipts(new com.walmartlabs.ereceipt.service.EReceiptManager.ResultCallback() {

                final SaverServiceSettings._cls1 this$0;

                public void onResult(Boolean boolean1)
                {
                    MessageBus.getBus().post(new ServiceConfigChangedEvent());
                }

                public volatile void onResult(Object obj)
                {
                    onResult((Boolean)obj);
                }

            
            {
                this$0 = SaverServiceSettings._cls1.this;
                super();
            }
            });
        }
        dialoginterface.dismiss();
    }

    _cls1.this._cls0(int i, Context context1)
    {
        val$selectedIndex = i;
        val$context = context1;
        super();
    }
}
