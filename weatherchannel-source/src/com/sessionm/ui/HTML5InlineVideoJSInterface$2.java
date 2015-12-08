// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sessionm.ui;

import android.media.MediaPlayer;
import android.util.Log;

// Referenced classes of package com.sessionm.ui:
//            HTML5InlineVideoJSInterface

class this._cls0
    implements android.media.
{

    final HTML5InlineVideoJSInterface this$0;

    public void onPrepared(MediaPlayer mediaplayer)
    {
        synchronized (HTML5InlineVideoJSInterface.this)
        {
            if (Log.isLoggable("SessionM.Video", 3))
            {
                Log.d("SessionM.Video", "video is ready for playback");
            }
            HTML5InlineVideoJSInterface.access$100(HTML5InlineVideoJSInterface.this, deoState.PREPARED);
            HTML5InlineVideoJSInterface.access$200(HTML5InlineVideoJSInterface.this, "ready");
            if (HTML5InlineVideoJSInterface.access$300(HTML5InlineVideoJSInterface.this))
            {
                show();
                HTML5InlineVideoJSInterface.access$400(HTML5InlineVideoJSInterface.this);
            }
        }
        return;
        exception;
        mediaplayer;
        JVM INSTR monitorexit ;
        throw exception;
    }

    deoState()
    {
        this$0 = HTML5InlineVideoJSInterface.this;
        super();
    }
}
