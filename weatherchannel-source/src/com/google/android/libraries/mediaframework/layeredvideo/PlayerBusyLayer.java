// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.mediaframework.layeredvideo;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.libraries.mediaframework.exoplayerextensions.ExoplayerUtil;
import com.google.android.libraries.mediaframework.exoplayerextensions.ExoplayerWrapper;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;

// Referenced classes of package com.google.android.libraries.mediaframework.layeredvideo:
//            Layer, LayerManager

public class PlayerBusyLayer
    implements Layer
{

    private static final String TAG = "PlayerBusyLayer";
    private View busyIndicator;
    private String playerName;
    private FrameLayout rootView;

    public PlayerBusyLayer()
    {
    }

    private void hideIndicator()
    {
        busyIndicator.setVisibility(8);
    }

    private void showIndicator()
    {
        busyIndicator.setVisibility(0);
    }

    public FrameLayout createView(LayerManager layermanager)
    {
        playerName = layermanager.getPlayerName();
        rootView = (FrameLayout)layermanager.getActivity().getLayoutInflater().inflate(com.weather.commons.R.layout.player_busy_layer, null);
        busyIndicator = rootView.findViewById(com.weather.commons.R.id.video_player_busy_indicator);
        hideIndicator();
        return rootView;
    }

    public void hide()
    {
        rootView.setVisibility(8);
    }

    public void onLayerDisplayed(LayerManager layermanager)
    {
        layermanager.getExoplayerWrapper().addListener(new com.google.android.libraries.mediaframework.exoplayerextensions.ExoplayerWrapper.Listener() {

            final PlayerBusyLayer this$0;

            public void onError(Exception exception)
            {
                hideIndicator();
            }

            public void onStateChanged(boolean flag, int i)
            {
                LogUtil.d("PlayerBusyLayer", LoggingMetaTags.TWC_VIDEOS, "busy layer onStateChanged: player=%s, playWhenReady=%s, playbackState=%s", new Object[] {
                    playerName, Boolean.valueOf(flag), ExoplayerUtil.getExoplayerStateString(i)
                });
                switch (i)
                {
                default:
                    return;

                case 1: // '\001'
                case 4: // '\004'
                case 5: // '\005'
                    hideIndicator();
                    return;

                case 2: // '\002'
                case 3: // '\003'
                    showIndicator();
                    break;
                }
            }

            public void onVideoSizeChanged(int i, int j, int k, float f)
            {
            }

            
            {
                this$0 = PlayerBusyLayer.this;
                super();
            }
        });
    }

    public void show()
    {
        rootView.setVisibility(0);
    }



}
