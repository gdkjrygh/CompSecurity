// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.mediaframework.layeredvideo;

import com.google.android.libraries.mediaframework.exoplayerextensions.PlayerControlCallback;

// Referenced classes of package com.google.android.libraries.mediaframework.layeredvideo:
//            SimpleVideoPlayer

class this._cls0
    implements PlayerControlCallback
{

    final SimpleVideoPlayer this$0;

    public void onPause()
    {
        SimpleVideoPlayer.access$002(SimpleVideoPlayer.this, true);
    }

    public void onPlay()
    {
        SimpleVideoPlayer.access$002(SimpleVideoPlayer.this, false);
    }

    Callback()
    {
        this$0 = SimpleVideoPlayer.this;
        super();
    }
}
