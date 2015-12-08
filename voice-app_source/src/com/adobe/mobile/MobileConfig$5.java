// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mobile;

import java.io.File;
import java.util.concurrent.ExecutorService;

// Referenced classes of package com.adobe.mobile:
//            MobileConfig, StaticMethods

class this._cls0
    implements RemoteDownloadBlock
{

    final MobileConfig this$0;

    public void call(boolean flag, final File file)
    {
        StaticMethods.getAnalyticsExecutor().execute(new Runnable() {

            final MobileConfig._cls5 this$1;
            final File val$file;

            public void run()
            {
                if (file != null)
                {
                    StaticMethods.logDebugFormat("Config - Using remote definition for points of interest", new Object[0]);
                    updatePOIData(file);
                }
            }

            
            {
                this$1 = MobileConfig._cls5.this;
                file = file1;
                super();
            }
        });
    }

    _cls1.val.file()
    {
        this$0 = MobileConfig.this;
        super();
    }
}
