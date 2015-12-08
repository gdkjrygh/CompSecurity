// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.photo.model.order;

import android.os.Parcel;

// Referenced classes of package com.walmartlabs.android.photo.model.order:
//            PendingOrder

static final class 
    implements android.os.tor
{

    public PendingOrder createFromParcel(Parcel parcel)
    {
        return new PendingOrder(parcel);
    }

    public volatile Object createFromParcel(Parcel parcel)
    {
        return createFromParcel(parcel);
    }

    public PendingOrder[] newArray(int i)
    {
        return new PendingOrder[i];
    }

    public volatile Object[] newArray(int i)
    {
        return newArray(i);
    }

    ()
    {
    }
}
