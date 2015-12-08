// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.mediaframework.layeredvideo;

import android.animation.Animator;
import android.os.Handler;
import android.widget.FrameLayout;

// Referenced classes of package com.google.android.libraries.mediaframework.layeredvideo:
//            PlaybackControlLayer

class val.container
    implements android.animation.er
{

    private boolean cancelled;
    final PlaybackControlLayer this$0;
    final FrameLayout val$container;

    public void onAnimationCancel(Animator animator)
    {
        cancelled = true;
    }

    public void onAnimationEnd(Animator animator)
    {
        PlaybackControlLayer.access$802(PlaybackControlLayer.this, false);
        if (!cancelled)
        {
            PlaybackControlLayer.access$900(PlaybackControlLayer.this).setVisibility(4);
            val$container.removeView(PlaybackControlLayer.access$900(PlaybackControlLayer.this));
            if (isLandscape())
            {
                PlaybackControlLayer.access$000(PlaybackControlLayer.this);
            }
            PlaybackControlLayer.access$700(PlaybackControlLayer.this).removeMessages(2);
            PlaybackControlLayer.access$202(PlaybackControlLayer.this, false);
        }
    }

    public void onAnimationRepeat(Animator animator)
    {
    }

    public void onAnimationStart(Animator animator)
    {
    }

    ()
    {
        this$0 = final_playbackcontrollayer;
        val$container = FrameLayout.this;
        super();
    }
}
