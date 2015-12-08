// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sessionm.ui;

import android.util.Log;

// Referenced classes of package com.sessionm.ui:
//            HTML5InlineVideoJSInterface

class this._cls0
    implements Runnable
{

    final HTML5InlineVideoJSInterface this$0;

    public void run()
    {
label0:
        {
            synchronized (HTML5InlineVideoJSInterface.this)
            {
                deoState deostate = getVideoState();
                if (deostate != deoState.IDLE && deostate != deoState.INITIALIZED && deostate != deoState.STOPPED && deostate != deoState.ERROR)
                {
                    break label0;
                }
                if (Log.isLoggable("SessionM.Video", 5))
                {
                    Log.w("SessionM.Video", "trying to pause video before video is read for playback");
                }
            }
            return;
        }
        HTML5InlineVideoJSInterface.access$500(HTML5InlineVideoJSInterface.this);
        html5inlinevideojsinterface;
        JVM INSTR monitorexit ;
        return;
        exception;
        html5inlinevideojsinterface;
        JVM INSTR monitorexit ;
        throw exception;
    }

    deoState()
    {
        this$0 = HTML5InlineVideoJSInterface.this;
        super();
    }
}
