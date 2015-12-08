// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import java.util.concurrent.ConcurrentHashMap;

// Referenced classes of package com.facebook.internal:
//            LikeActionController, FileLruCache, Utility

class val.broadcastContext
    implements Runnable
{

    final ss._cls202 this$0;
    final Context val$broadcastContext;
    final boolean val$shouldClearDisk;

    public void run()
    {
        if (val$shouldClearDisk)
        {
            int _tmp = LikeActionController.access$302((LikeActionController.access$300() + 1) % 1000);
            val$broadcastContext.getSharedPreferences("com.facebook.LikeActionController.CONTROLLER_STORE_KEY", 0).edit().putInt("OBJECT_SUFFIX", LikeActionController.access$300()).apply();
            LikeActionController.access$400().clear();
            LikeActionController.access$500().clearCache();
        }
        LikeActionController.access$600(val$broadcastContext, null, "com.facebook.sdk.LikeActionController.DID_RESET");
        boolean _tmp1 = LikeActionController.access$202(false);
    }

    ()
    {
        this$0 = final_;
        val$shouldClearDisk = flag;
        val$broadcastContext = Context.this;
        super();
    }

    // Unreferenced inner class com/facebook/internal/LikeActionController$4

/* anonymous class */
    static final class LikeActionController._cls4 extends BroadcastReceiver
    {

        public void onReceive(Context context, Intent intent)
        {
            if (LikeActionController.access$200())
            {
                return;
            }
            intent = intent.getAction();
            final boolean shouldClearDisk;
            if (Utility.areObjectsEqual("com.facebook.sdk.ACTIVE_SESSION_UNSET", intent) || Utility.areObjectsEqual("com.facebook.sdk.ACTIVE_SESSION_CLOSED", intent))
            {
                shouldClearDisk = true;
            } else
            {
                shouldClearDisk = false;
            }
            boolean _tmp = LikeActionController.access$202(true);
            LikeActionController.access$700().postDelayed(context. new LikeActionController._cls4._cls1(), 100L);
        }

    }

}
