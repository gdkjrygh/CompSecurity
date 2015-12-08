// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.item;

import com.google.android.gms.common.ConnectionResult;

// Referenced classes of package com.walmart.android.app.item:
//            StoreAvailabilityListAdapter

public static interface Y
{

    public abstract void onEmptyStoreAvailabilityResponse();

    public abstract void onErrorLoadingStoreAvailability(int i);

    public abstract void onErrorLoadingStores(int i);

    public abstract void onErrorRequestingLocation(int i);

    public abstract void onErrorRequestingLocation(ConnectionResult connectionresult);

    public abstract void onLoadCompleted(boolean flag);
}
