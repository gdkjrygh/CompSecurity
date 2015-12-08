// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads;


// Referenced classes of package com.facebook.ads:
//            Ad, AdError

public interface AdListener
{

    public abstract void onAdClicked(Ad ad);

    public abstract void onAdLoaded(Ad ad);

    public abstract void onError(Ad ad, AdError aderror);
}
