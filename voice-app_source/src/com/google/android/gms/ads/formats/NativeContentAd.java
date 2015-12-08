// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.formats;

import java.util.List;

// Referenced classes of package com.google.android.gms.ads.formats:
//            NativeAd

public abstract class NativeContentAd extends NativeAd
{
    public static interface OnContentAdLoadedListener
    {

        public abstract void onContentAdLoaded(NativeContentAd nativecontentad);
    }


    public NativeContentAd()
    {
    }

    public abstract CharSequence getAdvertiser();

    public abstract CharSequence getBody();

    public abstract CharSequence getCallToAction();

    public abstract CharSequence getHeadline();

    public abstract List getImages();

    public abstract NativeAd.Image getLogo();
}
