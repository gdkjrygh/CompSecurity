// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sessionm.ui;

import android.util.Log;

// Referenced classes of package com.sessionm.ui:
//            HTML5InlineVideoJSInterface, SessionMVideoView

class val.y
    implements Runnable
{

    final HTML5InlineVideoJSInterface this$0;
    final int val$x;
    final int val$y;

    public void run()
    {
label0:
        {
            synchronized (HTML5InlineVideoJSInterface.this)
            {
                if (HTML5InlineVideoJSInterface.access$600(HTML5InlineVideoJSInterface.this) != null)
                {
                    break label0;
                }
                if (Log.isLoggable("SessionM.Video", 5))
                {
                    Log.w("SessionM.Video", "trying to move video view before it is initialized");
                }
            }
            return;
        }
        HTML5InlineVideoJSInterface.access$700(HTML5InlineVideoJSInterface.this).ftMargin = HTML5InlineVideoJSInterface.access$800(HTML5InlineVideoJSInterface.this, val$x);
        HTML5InlineVideoJSInterface.access$700(HTML5InlineVideoJSInterface.this).pMargin = HTML5InlineVideoJSInterface.access$800(HTML5InlineVideoJSInterface.this, val$y);
        HTML5InlineVideoJSInterface.access$600(HTML5InlineVideoJSInterface.this).setLayoutParams(HTML5InlineVideoJSInterface.access$700(HTML5InlineVideoJSInterface.this));
        if (Log.isLoggable("SessionM.Video", 3))
        {
            Log.i("SessionM.Video", (new StringBuilder()).append("video is playing: ").append(HTML5InlineVideoJSInterface.access$300(HTML5InlineVideoJSInterface.this)).append(" video state: ").append(getVideoState()).append(" x: ").append(val$x).append(" y: ").append(val$y).toString());
        }
        if (val$x >= 0 && val$y >= 0)
        {
            break MISSING_BLOCK_LABEL_223;
        }
        HTML5InlineVideoJSInterface.access$100(HTML5InlineVideoJSInterface.this, deoState.ERROR);
        HTML5InlineVideoJSInterface.access$200(HTML5InlineVideoJSInterface.this, "error");
        remove();
_L1:
        html5inlinevideojsinterface;
        JVM INSTR monitorexit ;
        return;
        exception;
        html5inlinevideojsinterface;
        JVM INSTR monitorexit ;
        throw exception;
        HTML5InlineVideoJSInterface.access$200(HTML5InlineVideoJSInterface.this, "moved");
          goto _L1
    }

    deoState()
    {
        this$0 = final_html5inlinevideojsinterface;
        val$x = i;
        val$y = I.this;
        super();
    }
}
