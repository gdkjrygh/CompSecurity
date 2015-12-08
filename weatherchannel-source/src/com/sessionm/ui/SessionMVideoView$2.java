// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sessionm.ui;

import android.media.MediaPlayer;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.sessionm.ui:
//            SessionMVideoView, VideoErrorListener

class this._cls0
    implements android.media.istener
{

    final SessionMVideoView this$0;

    public boolean onError(MediaPlayer mediaplayer, int i, int j)
    {
        for (mediaplayer = SessionMVideoView.access$100(SessionMVideoView.this).iterator(); mediaplayer.hasNext(); ((VideoErrorListener)mediaplayer.next()).onVideoError(SessionMVideoView.this, i, j)) { }
        return false;
    }

    tener()
    {
        this$0 = SessionMVideoView.this;
        super();
    }
}
