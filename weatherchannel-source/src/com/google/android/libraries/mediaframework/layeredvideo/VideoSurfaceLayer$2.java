// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.mediaframework.layeredvideo;

import android.view.Surface;
import android.view.SurfaceHolder;
import com.google.android.libraries.mediaframework.exoplayerextensions.ExoplayerWrapper;

// Referenced classes of package com.google.android.libraries.mediaframework.layeredvideo:
//            VideoSurfaceLayer, LayerManager

class this._cls0
    implements android.view.ck
{

    final VideoSurfaceLayer this$0;

    public void surfaceChanged(SurfaceHolder surfaceholder, int i, int j, int k)
    {
    }

    public void surfaceCreated(SurfaceHolder surfaceholder)
    {
        ExoplayerWrapper exoplayerwrapper = VideoSurfaceLayer.access$000(VideoSurfaceLayer.this).getExoplayerWrapper();
        if (exoplayerwrapper != null)
        {
            exoplayerwrapper.setSurface(surfaceholder.getSurface());
            if (exoplayerwrapper.getSurface().isValid() || exoplayerwrapper.getSelectedTrack(0) == -1)
            {
                exoplayerwrapper.setPlayWhenReady(VideoSurfaceLayer.access$200(VideoSurfaceLayer.this));
            }
        }
    }

    public void surfaceDestroyed(SurfaceHolder surfaceholder)
    {
        if (VideoSurfaceLayer.access$000(VideoSurfaceLayer.this).getExoplayerWrapper() != null)
        {
            VideoSurfaceLayer.access$000(VideoSurfaceLayer.this).getExoplayerWrapper().blockingClearSurface();
        }
    }

    per()
    {
        this$0 = VideoSurfaceLayer.this;
        super();
    }
}
