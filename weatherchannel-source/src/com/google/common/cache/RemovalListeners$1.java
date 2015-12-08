// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.cache;

import java.util.concurrent.Executor;

// Referenced classes of package com.google.common.cache:
//            RemovalListener, RemovalListeners, RemovalNotification

static final class val.listener
    implements RemovalListener
{

    final Executor val$executor;
    final RemovalListener val$listener;

    public void onRemoval(final RemovalNotification notification)
    {
        val$executor.execute(new Runnable() {

            final RemovalListeners._cls1 this$0;
            final RemovalNotification val$notification;

            public void run()
            {
                listener.onRemoval(notification);
            }

            
            {
                this$0 = RemovalListeners._cls1.this;
                notification = removalnotification;
                super();
            }
        });
    }

    _cls1.val.notification(Executor executor1, RemovalListener removallistener)
    {
        val$executor = executor1;
        val$listener = removallistener;
        super();
    }
}
