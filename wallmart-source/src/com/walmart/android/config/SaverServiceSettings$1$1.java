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
//            ServiceConfigChangedEvent, SaverServiceSettings

class this._cls0
    implements com.walmartlabs.ereceipt.service.lback
{

    final onResult this$0;

    public void onResult(Boolean boolean1)
    {
        MessageBus.getBus().post(new ServiceConfigChangedEvent());
    }

    public volatile void onResult(Object obj)
    {
        onResult((Boolean)obj);
    }

    l.context()
    {
        this$0 = this._cls0.this;
        super();
    }

    // Unreferenced inner class com/walmart/android/config/SaverServiceSettings$1

/* anonymous class */
    static final class SaverServiceSettings._cls1
        implements android.content.DialogInterface.OnClickListener
    {

        final Context val$context;
        final int val$selectedIndex;

        public void onClick(DialogInterface dialoginterface, int i)
        {
            if (i != selectedIndex)
            {
                SaverServiceSettings.access$000(context, "saver_server_setting", i);
                EReceiptManager.get().clearAllReceipts(new SaverServiceSettings._cls1._cls1());
            }
            dialoginterface.dismiss();
        }

            
            {
                selectedIndex = i;
                context = context1;
                super();
            }
    }

}
