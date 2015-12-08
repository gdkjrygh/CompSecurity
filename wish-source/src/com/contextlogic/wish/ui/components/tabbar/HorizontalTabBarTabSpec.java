// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.components.tabbar;


public class HorizontalTabBarTabSpec
{

    private android.view.View.OnClickListener listener;
    private String text;

    public HorizontalTabBarTabSpec(String s, android.view.View.OnClickListener onclicklistener)
    {
        listener = onclicklistener;
        text = s;
    }

    public android.view.View.OnClickListener getListener()
    {
        return listener;
    }

    public String getText()
    {
        return text;
    }
}
