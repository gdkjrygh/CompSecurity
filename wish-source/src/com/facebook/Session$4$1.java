// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.facebook:
//            Session, SessionState

class usCallback
    implements Runnable
{

    final l.exception this$1;
    final usCallback val$callback;

    public void run()
    {
        val$callback.call(_fld0, newState, exception);
    }

    usCallback()
    {
        this$1 = final_uscallback;
        val$callback = usCallback.this;
        super();
    }

    // Unreferenced inner class com/facebook/Session$4

/* anonymous class */
    class Session._cls4
        implements Runnable
    {

        final Session this$0;
        final Exception val$exception;
        final SessionState val$newState;

        public void run()
        {
            List list = Session.access$1200(Session.this);
            list;
            JVM INSTR monitorenter ;
            Session._cls4._cls1 _lcls1;
            for (Iterator iterator = Session.access$1200(Session.this).iterator(); iterator.hasNext(); Session.access$1400(Session.access$1300(Session.this), _lcls1))
            {
                _lcls1 = ((Session.StatusCallback)iterator.next()). new Session._cls4._cls1();
            }

            break MISSING_BLOCK_LABEL_69;
            Exception exception1;
            exception1;
            list;
            JVM INSTR monitorexit ;
            throw exception1;
            list;
            JVM INSTR monitorexit ;
        }

            
            {
                this$0 = final_session;
                newState = sessionstate;
                exception = Exception.this;
                super();
            }
    }

}
