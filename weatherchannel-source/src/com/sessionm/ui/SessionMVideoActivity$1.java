// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sessionm.ui;

import android.media.MediaPlayer;

// Referenced classes of package com.sessionm.ui:
//            SessionMVideoActivity, SessionMVideoView

class this._cls0
    implements android.media.stener
{

    final SessionMVideoActivity this$0;

    public void onPrepared(MediaPlayer mediaplayer)
    {
        SessionMVideoActivity.access$000(SessionMVideoActivity.this).start();
    }

    ener()
    {
        this$0 = SessionMVideoActivity.this;
        super();
    }
}
