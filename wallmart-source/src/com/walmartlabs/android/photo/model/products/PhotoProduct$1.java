// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.photo.model.products;

import android.os.Parcel;

// Referenced classes of package com.walmartlabs.android.photo.model.products:
//            PhotoProduct

static final class A
    implements android.os.tor
{

    public PhotoProduct createFromParcel(Parcel parcel)
    {
        return new PhotoProduct(parcel, null);
    }

    public volatile Object createFromParcel(Parcel parcel)
    {
        return createFromParcel(parcel);
    }

    public PhotoProduct[] newArray(int i)
    {
        return new PhotoProduct[i];
    }

    public volatile Object[] newArray(int i)
    {
        return newArray(i);
    }

    A()
    {
    }
}
