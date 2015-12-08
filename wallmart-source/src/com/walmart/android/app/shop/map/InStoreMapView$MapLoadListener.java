// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.shop.map;


// Referenced classes of package com.walmart.android.app.shop.map:
//            InStoreMapView

public static interface 
{

    public abstract void onMapLoadFail(Throwable throwable);

    public abstract void onMapLoadFinish();

    public abstract void onMapLoadStart();

    public abstract void onMapReloadFinish();

    public abstract void onMapReloadStart();

    public abstract void onMapSource(float f, float f1, float f2, float f3);
}
