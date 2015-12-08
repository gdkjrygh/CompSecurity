// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.mediaframework.layeredvideo;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.accessibility.CaptioningManager;
import android.widget.FrameLayout;
import com.google.android.exoplayer.text.CaptionStyleCompat;
import com.google.android.exoplayer.text.SubtitleLayout;
import com.google.android.exoplayer.util.Util;
import com.google.android.libraries.mediaframework.exoplayerextensions.ExoplayerWrapper;
import java.util.List;

// Referenced classes of package com.google.android.libraries.mediaframework.layeredvideo:
//            Layer, LayerManager

public class SubtitleLayer
    implements Layer, com.google.android.libraries.mediaframework.exoplayerextensions.ExoplayerWrapper.CaptionListener
{

    private SubtitleLayout subtitleLayout;
    private FrameLayout view;

    public SubtitleLayer()
    {
    }

    private void configureSubtitleView(Activity activity)
    {
        float f;
        if (Util.SDK_INT >= 19)
        {
            CaptionStyleCompat captionstylecompat = getUserCaptionStyleV19(activity);
            f = getUserCaptionFontScaleV19(activity);
            activity = captionstylecompat;
        } else
        {
            activity = CaptionStyleCompat.DEFAULT;
            f = 1.0F;
        }
        subtitleLayout.setStyle(activity);
        subtitleLayout.setFractionalTextSize(0.0533F * f);
    }

    private float getUserCaptionFontScaleV19(Activity activity)
    {
        return ((CaptioningManager)activity.getSystemService("captioning")).getFontScale();
    }

    private CaptionStyleCompat getUserCaptionStyleV19(Activity activity)
    {
        return CaptionStyleCompat.createFromCaptionStyle(((CaptioningManager)activity.getSystemService("captioning")).getUserStyle());
    }

    public FrameLayout createView(LayerManager layermanager)
    {
        view = (FrameLayout)layermanager.getActivity().getLayoutInflater().inflate(com.weather.commons.R.layout.subtitle_layer, null);
        subtitleLayout = (SubtitleLayout)view.findViewById(com.weather.commons.R.id.subtitles);
        layermanager.getExoplayerWrapper().setCaptionListener(this);
        configureSubtitleView(layermanager.getActivity());
        return view;
    }

    public void hide()
    {
        setVisibility(8);
    }

    public void onCues(List list)
    {
        subtitleLayout.setCues(list);
    }

    public void onLayerDisplayed(LayerManager layermanager)
    {
    }

    public void setVisibility(int i)
    {
        view.setVisibility(i);
    }

    public void show()
    {
        setVisibility(0);
    }
}
