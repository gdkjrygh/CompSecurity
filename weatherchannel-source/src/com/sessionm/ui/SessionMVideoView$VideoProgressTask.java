// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sessionm.ui;

import java.util.Iterator;
import java.util.List;
import java.util.TimerTask;

// Referenced classes of package com.sessionm.ui:
//            SessionMVideoView, VideoProgressListener

private class <init> extends TimerTask
{

    final SessionMVideoView this$0;

    public void run()
    {
        int i = getCurrentPosition();
        for (Iterator iterator = SessionMVideoView.access$000(SessionMVideoView.this).iterator(); iterator.hasNext(); ((VideoProgressListener)iterator.next()).onVideoProgress(SessionMVideoView.this, i)) { }
        SessionMVideoView.access$200(SessionMVideoView.this);
    }

    private _cls9()
    {
        this$0 = SessionMVideoView.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
