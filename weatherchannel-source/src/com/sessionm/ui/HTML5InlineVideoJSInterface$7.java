// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sessionm.ui;

import android.util.Log;

// Referenced classes of package com.sessionm.ui:
//            HTML5InlineVideoJSInterface, SessionMVideoView

class val.width
    implements Runnable
{

    final HTML5InlineVideoJSInterface this$0;
    final int val$height;
    final int val$width;

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
        if (val$height >= 0 && val$width >= 0)
        {
            break MISSING_BLOCK_LABEL_85;
        }
        HTML5InlineVideoJSInterface.access$100(HTML5InlineVideoJSInterface.this, deoState.ERROR);
        HTML5InlineVideoJSInterface.access$200(HTML5InlineVideoJSInterface.this, "error");
        remove();
        html5inlinevideojsinterface;
        JVM INSTR monitorexit ;
        return;
        exception;
        html5inlinevideojsinterface;
        JVM INSTR monitorexit ;
        throw exception;
        HTML5InlineVideoJSInterface.access$700(HTML5InlineVideoJSInterface.this).dth = HTML5InlineVideoJSInterface.access$800(HTML5InlineVideoJSInterface.this, val$width);
        HTML5InlineVideoJSInterface.access$700(HTML5InlineVideoJSInterface.this).ight = HTML5InlineVideoJSInterface.access$800(HTML5InlineVideoJSInterface.this, val$height);
        HTML5InlineVideoJSInterface.access$600(HTML5InlineVideoJSInterface.this).setLayoutParams(HTML5InlineVideoJSInterface.access$700(HTML5InlineVideoJSInterface.this));
        HTML5InlineVideoJSInterface.access$200(HTML5InlineVideoJSInterface.this, "moved");
        html5inlinevideojsinterface;
        JVM INSTR monitorexit ;
    }

    deoState()
    {
        this$0 = final_html5inlinevideojsinterface;
        val$height = i;
        val$width = I.this;
        super();
    }
}
