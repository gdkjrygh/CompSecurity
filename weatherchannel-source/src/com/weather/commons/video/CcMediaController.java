// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.video;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.MediaController;
import android.widget.TextView;
import com.weather.util.ui.UIUtil;

// Referenced classes of package com.weather.commons.video:
//            VideoPlaybackSupport

public class CcMediaController extends MediaController
{

    private final Context context;
    private View fullScreenButton;
    private final VideoPlaybackSupport playbackSupport;

    public CcMediaController(Context context1, VideoPlaybackSupport videoplaybacksupport)
    {
        super(context1);
        context = context1;
        playbackSupport = videoplaybacksupport;
    }

    private View makeCCView()
    {
        TextView textview = new TextView(context);
        setFullScreenToggleImage(textview);
        textview.setOnClickListener(new android.view.View.OnClickListener() {

            final CcMediaController this$0;

            public void onClick(View view)
            {
                toggleFullScreen();
            }

            
            {
                this$0 = CcMediaController.this;
                super();
            }
        });
        return textview;
    }

    private View makeShareButton()
    {
        TextView textview = new TextView(context);
        textview.setBackgroundResource(com.weather.commons.R.drawable.ic_action_share);
        textview.setOnClickListener(new android.view.View.OnClickListener() {

            final CcMediaController this$0;

            public void onClick(View view)
            {
                playbackSupport.shareCurrentVideo();
            }

            
            {
                this$0 = CcMediaController.this;
                super();
            }
        });
        return textview;
    }

    private void setFullScreenToggleImage(View view)
    {
        if (playbackSupport.isFullScreen())
        {
            view.setBackgroundResource(com.weather.commons.R.drawable.twc_ic_action_return_from_full_screen);
            return;
        } else
        {
            view.setBackgroundResource(com.weather.commons.R.drawable.twc_ic_action_full_screen);
            return;
        }
    }

    public void setAnchorView(View view)
    {
        super.setAnchorView(view);
        view = new android.widget.FrameLayout.LayoutParams(-2, -2);
        LinearLayout linearlayout;
        android.widget.LinearLayout.LayoutParams layoutparams;
        if (UIUtil.isKindle2ndGenDevices())
        {
            view.gravity = 0x800055;
        } else
        {
            view.gravity = 0x800035;
        }
        layoutparams = new android.widget.LinearLayout.LayoutParams(-2, -2);
        layoutparams.gravity = 16;
        layoutparams.setMargins(0, 0, context.getResources().getDimensionPixelOffset(com.weather.commons.R.dimen.video_media_controller_share_margin_right), 0);
        linearlayout = new LinearLayout(context);
        linearlayout.addView(makeShareButton(), layoutparams);
        layoutparams = new android.widget.LinearLayout.LayoutParams(-2, -2);
        layoutparams.gravity = 16;
        fullScreenButton = makeCCView();
        linearlayout.addView(fullScreenButton, layoutparams);
        addView(linearlayout, view);
    }

    public void toggleFullScreen()
    {
        playbackSupport.toggleFullScreenMode();
        setFullScreenToggleImage(fullScreenButton);
    }

}
