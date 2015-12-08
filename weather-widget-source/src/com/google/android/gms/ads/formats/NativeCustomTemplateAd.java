// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.formats;

import java.util.List;

public interface NativeCustomTemplateAd
{
    public static interface OnCustomClickListener
    {

        public abstract void onCustomClick(NativeCustomTemplateAd nativecustomtemplatead, String s);
    }

    public static interface OnCustomTemplateAdLoadedListener
    {

        public abstract void onCustomTemplateAdLoaded(NativeCustomTemplateAd nativecustomtemplatead);
    }


    public abstract List getAvailableAssetNames();

    public abstract String getCustomTemplateId();

    public abstract NativeAd.Image getImage(String s);

    public abstract CharSequence getText(String s);

    public abstract void performClick(String s);

    public abstract void recordImpression();
}
