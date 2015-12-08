// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kochava.android.tracker;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.kochava.android.util.Logging;
import java.util.Timer;
import java.util.TimerTask;

// Referenced classes of package com.kochava.android.tracker:
//            Feature

class this._cls0 extends Handler
{

    final Feature this$0;

    public void handleMessage(Message message)
    {
        boolean flag = message.getData().getBoolean("sendonstart");
        Feature.access$3300(Feature.this);
        if (!flag)
        {
            Feature.access$3500(Feature.this).schedule(new TimerTask() {

                final Feature._cls10 this$1;

                public void run()
                {
                    Logging.Log("Reached 10 min mark w/o sending initial, sending now.");
                    Feature.access$3400(this$0, false);
                }

            
            {
                this$1 = Feature._cls10.this;
                super();
            }
            }, 0x927c0L);
            return;
        } else
        {
            Feature.access$3500(Feature.this).schedule(new TimerTask() {

                final Feature._cls10 this$1;

                public void run()
                {
                    Logging.Log("Scheduling timer to que initial event if needed.");
                    Feature.access$3400(this$0, false);
                }

            
            {
                this$1 = Feature._cls10.this;
                super();
            }
            }, 2000L);
            Feature.access$3602(Feature.this, new Timer());
            Feature.access$3600(Feature.this).schedule(new TimerTask() {

                final Feature._cls10 this$1;

                public void run()
                {
                    Feature.flush();
                }

            
            {
                this$1 = Feature._cls10.this;
                super();
            }
            }, 4000L);
            return;
        }
    }

    _cls3.this._cls1()
    {
        this$0 = Feature.this;
        super();
    }
}
