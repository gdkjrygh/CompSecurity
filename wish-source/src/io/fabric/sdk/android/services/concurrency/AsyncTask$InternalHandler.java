// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.concurrency;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

// Referenced classes of package io.fabric.sdk.android.services.concurrency:
//            AsyncTask

private static class  extends Handler
{

    public void handleMessage(Message message)
    {
          = ()message.obj;
        switch (message.what)
        {
        default:
            return;

        case 1: // '\001'
            AsyncTask.access$500(.task, .data[0]);
            return;

        case 2: // '\002'
            .task.onProgressUpdate(.data);
            break;
        }
    }

    public ()
    {
        super(Looper.getMainLooper());
    }
}
