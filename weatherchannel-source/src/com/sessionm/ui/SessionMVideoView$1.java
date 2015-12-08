// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sessionm.ui;

import android.media.MediaPlayer;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.sessionm.ui:
//            SessionMVideoView, VideoProgressListener

class this._cls0
    implements android.media.tionListener
{

    final SessionMVideoView this$0;

    public void onCompletion(MediaPlayer mediaplayer)
    {
        pause();
        for (mediaplayer = SessionMVideoView.access$000(SessionMVideoView.this).iterator(); mediaplayer.hasNext(); ((VideoProgressListener)mediaplayer.next()).onVideoCompleted(SessionMVideoView.this)) { }
    }

    r()
    {
        this$0 = SessionMVideoView.this;
        super();
    }
}
