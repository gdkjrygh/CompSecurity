// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.mediaframework.layeredvideo;

import android.os.Handler;
import android.os.Message;
import com.google.android.libraries.mediaframework.exoplayerextensions.ObservablePlayerControl;
import java.lang.ref.WeakReference;

// Referenced classes of package com.google.android.libraries.mediaframework.layeredvideo:
//            PlaybackControlLayer, LayerManager

private static class <init> extends Handler
{

    private final WeakReference playbackControlLayer;

    public void handleMessage(Message message)
    {
        PlaybackControlLayer playbackcontrollayer = (PlaybackControlLayer)playbackControlLayer.get();
        if (playbackcontrollayer != null && playbackcontrollayer.getLayerManager().getControl() != null)
        {
            int i;
            switch (message.what)
            {
            default:
                return;

            case 1: // '\001'
                playbackcontrollayer.hide();
                return;

            case 3: // '\003'
                PlaybackControlLayer.access$000(playbackcontrollayer);
                return;

            case 2: // '\002'
                i = playbackcontrollayer.updateProgress();
                break;
            }
            if (!PlaybackControlLayer.access$100(playbackcontrollayer) && PlaybackControlLayer.access$200(playbackcontrollayer) && playbackcontrollayer.getLayerManager().getControl().isPlaying())
            {
                sendMessageDelayed(obtainMessage(2), 1000 - i % 1000);
                return;
            }
        }
    }

    private (PlaybackControlLayer playbackcontrollayer)
    {
        playbackControlLayer = new WeakReference(playbackcontrollayer);
    }

    playbackControlLayer(PlaybackControlLayer playbackcontrollayer, playbackControlLayer playbackcontrollayer1)
    {
        this(playbackcontrollayer);
    }
}
