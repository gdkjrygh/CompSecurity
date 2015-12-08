// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.analytics;

import android.os.Handler;

// Referenced classes of package com.google.android.apps.analytics:
//            GoogleAnalyticsTracker, EventStore

final class this._cls0
    implements this._cls0
{

    final GoogleAnalyticsTracker this$0;

    public void dispatchFinished()
    {
        GoogleAnalyticsTracker.access$000(GoogleAnalyticsTracker.this).post(new Runnable() {

            final GoogleAnalyticsTracker.DispatcherCallbacks this$1;

            public void run()
            {
                dispatchFinished();
            }

            
            {
                this$1 = GoogleAnalyticsTracker.DispatcherCallbacks.this;
                super();
            }
        });
    }

    public void eventDispatched(long l)
    {
        GoogleAnalyticsTracker.access$100(GoogleAnalyticsTracker.this).deleteEvent(l);
    }

    _cls1.this._cls1()
    {
        this$0 = GoogleAnalyticsTracker.this;
        super();
    }
}
