// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.mediaframework.layeredvideo;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.widget.FrameLayout;
import com.google.android.libraries.mediaframework.exoplayerextensions.ExoplayerWrapper;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;

// Referenced classes of package com.google.android.libraries.mediaframework.layeredvideo:
//            Layer, LayerManager, VideoSurfaceView

public class VideoSurfaceLayer
    implements Layer
{

    private static final String TAG = "VideoSurfaceLayer";
    private boolean autoplay;
    private LayerManager layerManager;
    private com.google.android.libraries.mediaframework.exoplayerextensions.ExoplayerWrapper.Listener playbackListener;
    private android.view.SurfaceHolder.Callback surfaceHolderCallback;
    private VideoSurfaceView surfaceView;
    private FrameLayout view;

    public VideoSurfaceLayer(boolean flag)
    {
        playbackListener = new com.google.android.libraries.mediaframework.exoplayerextensions.ExoplayerWrapper.Listener() {

            final VideoSurfaceLayer this$0;

            public void onError(Exception exception)
            {
            }

            public void onStateChanged(boolean flag1, int i)
            {
            }

            public void onVideoSizeChanged(int i, int j, int k, float f)
            {
                LogUtil.d("VideoSurfaceLayer", LoggingMetaTags.TWC_VIDEOS, "onVideoSizeChanged: player=%s, width=%s, height=%s, pixelWidthHeightRatio=%s", new Object[] {
                    layerManager.getPlayerName(), Integer.valueOf(i), Integer.valueOf(j), Float.valueOf(f)
                });
                VideoSurfaceView videosurfaceview = surfaceView;
                if (j == 0)
                {
                    f = 1.0F;
                } else
                {
                    f = ((float)i * f) / (float)j;
                }
                videosurfaceview.setVideoWidthHeightRatio(f);
            }

            
            {
                this$0 = VideoSurfaceLayer.this;
                super();
            }
        };
        surfaceHolderCallback = new android.view.SurfaceHolder.Callback() {

            final VideoSurfaceLayer this$0;

            public void surfaceChanged(SurfaceHolder surfaceholder, int i, int j, int k)
            {
            }

            public void surfaceCreated(SurfaceHolder surfaceholder)
            {
                ExoplayerWrapper exoplayerwrapper = layerManager.getExoplayerWrapper();
                if (exoplayerwrapper != null)
                {
                    exoplayerwrapper.setSurface(surfaceholder.getSurface());
                    if (exoplayerwrapper.getSurface().isValid() || exoplayerwrapper.getSelectedTrack(0) == -1)
                    {
                        exoplayerwrapper.setPlayWhenReady(autoplay);
                    }
                }
            }

            public void surfaceDestroyed(SurfaceHolder surfaceholder)
            {
                if (layerManager.getExoplayerWrapper() != null)
                {
                    layerManager.getExoplayerWrapper().blockingClearSurface();
                }
            }

            
            {
                this$0 = VideoSurfaceLayer.this;
                super();
            }
        };
        autoplay = flag;
    }

    public FrameLayout createView(LayerManager layermanager)
    {
        layerManager = layermanager;
        view = (FrameLayout)layermanager.getActivity().getLayoutInflater().inflate(com.weather.commons.R.layout.video_surface_layer, null);
        layermanager.getExoplayerWrapper().addListener(playbackListener);
        surfaceView = (VideoSurfaceView)view.findViewById(com.weather.commons.R.id.surface_view);
        if (surfaceView != null)
        {
            surfaceView.getHolder().addCallback(surfaceHolderCallback);
        }
        return view;
    }

    public void hide()
    {
        if (view != null)
        {
            view.setVisibility(8);
        }
    }

    public void moveSurfaceToBackground()
    {
        surfaceView.setZOrderMediaOverlay(false);
    }

    public void moveSurfaceToForeground()
    {
        surfaceView.setZOrderMediaOverlay(true);
    }

    public void onLayerDisplayed(LayerManager layermanager)
    {
    }

    public void release()
    {
        layerManager.getExoplayerWrapper().removeListener(playbackListener);
    }

    public void setAutoplay(boolean flag)
    {
        autoplay = flag;
    }

    public void setFullscreen(boolean flag)
    {
    }

    public void show()
    {
        if (view != null)
        {
            view.setVisibility(0);
        }
    }



}
