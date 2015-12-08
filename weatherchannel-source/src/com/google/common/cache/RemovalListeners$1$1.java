// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.cache;

import java.util.concurrent.Executor;

// Referenced classes of package com.google.common.cache:
//            RemovalListener, RemovalNotification, RemovalListeners

class val.notification
    implements Runnable
{

    final val.notification this$0;
    final RemovalNotification val$notification;

    public void run()
    {
        listener.onRemoval(val$notification);
    }

    l.listener()
    {
        this$0 = final_listener;
        val$notification = RemovalNotification.this;
        super();
    }

    // Unreferenced inner class com/google/common/cache/RemovalListeners$1

/* anonymous class */
    static final class RemovalListeners._cls1
        implements RemovalListener
    {

        final Executor val$executor;
        final RemovalListener val$listener;

        public void onRemoval(RemovalNotification removalnotification)
        {
            executor.execute(removalnotification. new RemovalListeners._cls1._cls1());
        }

            
            {
                executor = executor1;
                listener = removallistener;
                super();
            }
    }

}
