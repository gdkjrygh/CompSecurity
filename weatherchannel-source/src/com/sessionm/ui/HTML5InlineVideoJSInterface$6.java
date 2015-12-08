// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sessionm.ui;

import android.util.Log;

// Referenced classes of package com.sessionm.ui:
//            HTML5InlineVideoJSInterface, SessionMVideoView

class val.msec
    implements Runnable
{

    final HTML5InlineVideoJSInterface this$0;
    final int val$msec;

    public void run()
    {
label0:
        {
            synchronized (HTML5InlineVideoJSInterface.this)
            {
                obj = getVideoState();
                if (obj != deoState.IDLE && obj != deoState.INITIALIZED && obj != deoState.STOPPED && obj != deoState.ERROR)
                {
                    break label0;
                }
                if (Log.isLoggable("SessionM.Video", 5))
                {
                    Log.w("SessionM.Video", "trying to seek before video is ready for playback");
                }
            }
            return;
        }
        if (HTML5InlineVideoJSInterface.access$600(HTML5InlineVideoJSInterface.this) == null) goto _L2; else goto _L1
_L1:
        HTML5InlineVideoJSInterface.access$600(HTML5InlineVideoJSInterface.this).seekTo(val$msec);
        HTML5InlineVideoJSInterface.access$200(HTML5InlineVideoJSInterface.this, "seeking");
_L4:
        html5inlinevideojsinterface;
        JVM INSTR monitorexit ;
        return;
        obj;
        html5inlinevideojsinterface;
        JVM INSTR monitorexit ;
        throw obj;
_L2:
        if (!Log.isLoggable("SessionM.Video", 5)) goto _L4; else goto _L3
_L3:
        Log.w("SessionM.Video", String.format("Attempting to seek without a video view available state: %s", new Object[] {
            obj
        }));
          goto _L4
    }

    deoState()
    {
        this$0 = final_html5inlinevideojsinterface;
        val$msec = I.this;
        super();
    }
}
