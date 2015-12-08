// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.shop.map;

import com.walmart.android.service.storesearch.AisleLocations;

// Referenced classes of package com.walmart.android.app.shop.map:
//            InStoreMapLoader

public static interface I
{

    public abstract void onAisleFailed();

    public abstract void onAisleLocations(AisleLocations aislelocations);
}
