// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.ads2.ui;


// Referenced classes of package com.weather.ads2.ui:
//            AdRefreshable

public interface HideableAd
    extends AdRefreshable
{

    public abstract void hideAd();

    public abstract void showAdOnLoad();
}
