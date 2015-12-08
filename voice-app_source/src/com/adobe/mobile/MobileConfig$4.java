// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mobile;

import java.io.File;

// Referenced classes of package com.adobe.mobile:
//            MobileConfig, RemoteDownload

class this._cls0
    implements Runnable
{

    final MobileConfig this$0;

    public void run()
    {
        if (MobileConfig.access$000(MobileConfig.this) == null || MobileConfig.access$000(MobileConfig.this).length() <= 0)
        {
            MobileConfig.access$100(MobileConfig.this);
            return;
        } else
        {
            RemoteDownload.remoteDownloadSync(MobileConfig.access$000(MobileConfig.this), new RemoteDownload.RemoteDownloadBlock() {

                final MobileConfig._cls4 this$1;

                public void call(boolean flag, File file)
                {
                    updateMessagesData(file);
                    MobileConfig.access$100(this$0);
                }

            
            {
                this$1 = MobileConfig._cls4.this;
                super();
            }
            });
            return;
        }
    }

    _cls1.this._cls1()
    {
        this$0 = MobileConfig.this;
        super();
    }
}
