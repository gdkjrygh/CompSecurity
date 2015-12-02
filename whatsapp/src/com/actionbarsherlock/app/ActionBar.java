// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.app;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;

public abstract class ActionBar
{

    public ActionBar()
    {
    }

    public abstract void addOnMenuVisibilityListener(OnMenuVisibilityListener onmenuvisibilitylistener);

    public abstract void addTab(Tab tab);

    public Context getThemedContext()
    {
        return null;
    }

    public abstract void hide();

    public abstract Tab newTab();

    public abstract void removeOnMenuVisibilityListener(OnMenuVisibilityListener onmenuvisibilitylistener);

    public abstract void setBackgroundDrawable(Drawable drawable);

    public abstract void setCustomView(View view);

    public abstract void setCustomView(View view, LayoutParams layoutparams);

    public abstract void setDisplayHomeAsUpEnabled(boolean flag);

    public abstract void setDisplayOptions(int i);

    public abstract void setDisplayShowCustomEnabled(boolean flag);

    public abstract void setDisplayShowHomeEnabled(boolean flag);

    public abstract void setDisplayShowTitleEnabled(boolean flag);

    public abstract void setIcon(int i);

    public abstract void setIcon(Drawable drawable);

    public abstract void setNavigationMode(int i);

    public abstract void setSelectedNavigationItem(int i);

    public abstract void setSubtitle(int i);

    public abstract void setSubtitle(CharSequence charsequence);

    public abstract void setTitle(int i);

    public abstract void setTitle(CharSequence charsequence);

    public abstract void show();
}
