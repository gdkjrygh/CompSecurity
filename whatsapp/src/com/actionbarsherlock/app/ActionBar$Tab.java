// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.app;

import android.graphics.drawable.Drawable;
import android.view.View;

public abstract class istener
{

    public abstract CharSequence getContentDescription();

    public abstract View getCustomView();

    public abstract Drawable getIcon();

    public abstract int getPosition();

    public abstract CharSequence getText();

    public abstract void select();

    public abstract istener setIcon(int i);

    public abstract istener setTabListener(istener istener);

    public istener()
    {
    }
}
