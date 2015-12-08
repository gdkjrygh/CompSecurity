// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.ads2.branded.background;


// Referenced classes of package com.weather.ads2.branded.background:
//            BrandedBackground

public interface BackgroundView
{
    public static interface OnBackgroundUpdateListener
    {

        public abstract void onBackgroundUpdated(boolean flag);
    }


    public abstract boolean isShowingBrandedBackground();

    public abstract void setOnBackgroundUpdateListener(OnBackgroundUpdateListener onbackgroundupdatelistener);

    public abstract void showBrandedBackground(BrandedBackground brandedbackground);

    public abstract void showNonBrandedBackground();
}
