// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.ui;

import android.graphics.drawable.Drawable;
import android.view.View;

public final class BackgroundSetter
{
    public static interface SetBackgroundInterface
    {

        public abstract void setBackground(View view, Drawable drawable);
    }

    private static class SetBackgroundInterfaceJellybeanAndGreater
        implements SetBackgroundInterface
    {

        public void setBackground(View view, Drawable drawable)
        {
            view.setBackground(drawable);
        }

        private SetBackgroundInterfaceJellybeanAndGreater()
        {
        }

    }

    private static class SetBackgroundInterfacePreJellyBean
        implements SetBackgroundInterface
    {

        public void setBackground(View view, Drawable drawable)
        {
            view.setBackgroundDrawable(drawable);
        }

        private SetBackgroundInterfacePreJellyBean()
        {
        }

    }


    public static final SetBackgroundInterface backgroundInterface;

    private BackgroundSetter()
    {
    }

    static 
    {
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            backgroundInterface = new SetBackgroundInterfaceJellybeanAndGreater();
        } else
        {
            backgroundInterface = new SetBackgroundInterfacePreJellyBean();
        }
    }
}
