// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.storelocator;


// Referenced classes of package com.walmartlabs.storelocator:
//            StoreFinderController, StoreData

public static interface 
{

    public abstract void onClosestStoreFound(double d, double d1, StoreData storedata);

    public abstract void onClosestStoreFound(String s, StoreData storedata);
}
