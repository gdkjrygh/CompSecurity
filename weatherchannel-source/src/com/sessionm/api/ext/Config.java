// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sessionm.api.ext;

import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import java.util.Map;

public class Config
{

    private static final Config instance = new Config();
    private Map transitionButtonMap;
    private Map transitionMessageMap;
    private BitmapDrawable transitionViewErrorIcon;
    private AnimationDrawable transitionViewLoader;
    private String transitionViewTitle;

    private Config()
    {
    }

    private com.sessionm.core.Config getConfig()
    {
        return com.sessionm.core.Config.f();
    }

    public static Config getInstance()
    {
        return instance;
    }

    public Map getTransitionButtonMap()
    {
        return transitionButtonMap;
    }

    public Map getTransitionMessageMap()
    {
        return transitionMessageMap;
    }

    public BitmapDrawable getTransitionViewErrorIcon()
    {
        return transitionViewErrorIcon;
    }

    public AnimationDrawable getTransitionViewLoader()
    {
        return transitionViewLoader;
    }

    public String getTransitionViewTitle()
    {
        return transitionViewTitle;
    }

    public void setTransitionButtonMap(Map map)
    {
        transitionButtonMap = map;
    }

    public void setTransitionMessageMap(Map map)
    {
        transitionMessageMap = map;
    }

    public void setTransitionViewErrorIcon(BitmapDrawable bitmapdrawable)
    {
        transitionViewErrorIcon = bitmapdrawable;
    }

    public void setTransitionViewLoader(AnimationDrawable animationdrawable)
    {
        transitionViewLoader = animationdrawable;
    }

    public void setTransitionViewTitle(String s)
    {
        transitionViewTitle = s;
    }

}
