// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.mediaframework.layeredvideo;

import android.os.Handler;
import com.google.android.libraries.mediaframework.exoplayerextensions.ObservablePlayerControl;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;

// Referenced classes of package com.google.android.libraries.mediaframework.layeredvideo:
//            PlaybackControlLayer, LayerManager

class this._cls0
    implements android.view.tyChangeListener
{

    final PlaybackControlLayer this$0;

    public void onSystemUiVisibilityChange(int i)
    {
label0:
        {
            LogUtil.d("PlaybackControlLayer", LoggingMetaTags.TWC_VIDEOS, "OnSystemUiVisibilityChangeListener: player=%s, visibility=%s, shouldBePlaying=%s, isPlaying=%s, isHidden=%s", new Object[] {
                getLayerManager().getPlayerName(), Integer.valueOf(i), Boolean.valueOf(PlaybackControlLayer.access$500(PlaybackControlLayer.this)), Boolean.valueOf(PlaybackControlLayer.access$600(PlaybackControlLayer.this).getControl().isPlaying()), Boolean.valueOf(PlaybackControlLayer.access$600(PlaybackControlLayer.this).isHidden())
            });
            if (isLandscape() && (i & 4) == 0)
            {
                if (!PlaybackControlLayer.access$600(PlaybackControlLayer.this).isHidden())
                {
                    break label0;
                }
                LogUtil.d("PlaybackControlLayer", LoggingMetaTags.TWC_VIDEOS, "OnSystemUiVisibilityChangeListener: player=%s, not visible, will hide system bars...", new Object[] {
                    getLayerManager().getPlayerName()
                });
                android.os.Message message = PlaybackControlLayer.access$700(PlaybackControlLayer.this).obtainMessage(3);
                PlaybackControlLayer.access$700(PlaybackControlLayer.this).removeMessages(3);
                PlaybackControlLayer.access$700(PlaybackControlLayer.this).sendMessageDelayed(message, 2500L);
            }
            return;
        }
        LogUtil.d("PlaybackControlLayer", LoggingMetaTags.TWC_VIDEOS, "OnSystemUiVisibilityChangeListener: player=%s, visible, will show controls", new Object[] {
            getLayerManager().getPlayerName()
        });
        show(2500);
    }

    Control()
    {
        this$0 = PlaybackControlLayer.this;
        super();
    }
}
