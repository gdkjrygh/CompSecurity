// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.components.tabbar;


public class CategoriesTabBarTabSpec
{

    private String imageUrl;
    private android.view.View.OnClickListener listener;
    private String title;

    public CategoriesTabBarTabSpec(String s, String s1, android.view.View.OnClickListener onclicklistener)
    {
        title = s;
        imageUrl = s1;
        listener = onclicklistener;
    }

    public String getImageUrl()
    {
        return imageUrl;
    }

    public android.view.View.OnClickListener getListener()
    {
        return listener;
    }

    public String getTitle()
    {
        return title;
    }
}
