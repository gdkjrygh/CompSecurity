// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.picasso;

import android.net.NetworkInfo;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;

// Referenced classes of package com.squareup.picasso:
//            Dispatcher, Picasso, Action, BitmapHunter

private static class dispatcher extends Handler
{

    private final Dispatcher dispatcher;

    public void handleMessage(final Message msg)
    {
        boolean flag = true;
        Dispatcher dispatcher1;
        switch (msg.what)
        {
        case 3: // '\003'
        case 8: // '\b'
        default:
            Picasso.HANDLER.post(new Runnable() {

                final Dispatcher.DispatcherHandler this$0;
                final Message val$msg;

                public void run()
                {
                    throw new AssertionError((new StringBuilder()).append("Unknown handler message received: ").append(msg.what).toString());
                }

            
            {
                this$0 = Dispatcher.DispatcherHandler.this;
                msg = message;
                super();
            }
            });
            return;

        case 1: // '\001'
            msg = (Action)msg.obj;
            dispatcher.performSubmit(msg);
            return;

        case 2: // '\002'
            msg = (Action)msg.obj;
            dispatcher.performCancel(msg);
            return;

        case 11: // '\013'
            msg = ((Message) (msg.obj));
            dispatcher.performPauseTag(msg);
            return;

        case 12: // '\f'
            msg = ((Message) (msg.obj));
            dispatcher.performResumeTag(msg);
            return;

        case 4: // '\004'
            msg = (BitmapHunter)msg.obj;
            dispatcher.performComplete(msg);
            return;

        case 5: // '\005'
            msg = (BitmapHunter)msg.obj;
            dispatcher.performRetry(msg);
            return;

        case 6: // '\006'
            msg = (BitmapHunter)msg.obj;
            dispatcher.performError(msg, false);
            return;

        case 7: // '\007'
            dispatcher.performBatchComplete();
            return;

        case 9: // '\t'
            msg = (NetworkInfo)msg.obj;
            dispatcher.performNetworkStateChange(msg);
            return;

        case 10: // '\n'
            dispatcher1 = dispatcher;
            break;
        }
        if (msg.arg1 != 1)
        {
            flag = false;
        }
        dispatcher1.performAirplaneModeChange(flag);
    }

    public _cls1.val.msg(Looper looper, Dispatcher dispatcher1)
    {
        super(looper);
        dispatcher = dispatcher1;
    }
}
