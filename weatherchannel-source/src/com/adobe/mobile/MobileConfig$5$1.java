// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mobile;

import java.io.File;
import java.util.concurrent.ExecutorService;

// Referenced classes of package com.adobe.mobile:
//            StaticMethods, MobileConfig

class val.file
    implements Runnable
{

    final val.file this$1;
    final File val$file;

    public void run()
    {
        if (val$file != null)
        {
            StaticMethods.logDebugFormat("Config - Using remote definition for points of interest", new Object[0]);
            updatePOIData(val$file);
        }
    }

    is._cls0()
    {
        this$1 = final__pcls0;
        val$file = File.this;
        super();
    }

    // Unreferenced inner class com/adobe/mobile/MobileConfig$5

/* anonymous class */
    class MobileConfig._cls5
        implements RemoteDownload.RemoteDownloadBlock
    {

        final MobileConfig this$0;

        public void call(boolean flag, File file1)
        {
            StaticMethods.getAnalyticsExecutor().execute(file1. new MobileConfig._cls5._cls1());
        }

            
            {
                this$0 = MobileConfig.this;
                super();
            }
    }

}
