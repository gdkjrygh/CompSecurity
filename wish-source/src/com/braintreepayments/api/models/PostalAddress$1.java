// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.braintreepayments.api.models;

import android.os.Parcel;

// Referenced classes of package com.braintreepayments.api.models:
//            PostalAddress

static final class 
    implements android.os.or
{

    public PostalAddress createFromParcel(Parcel parcel)
    {
        return new PostalAddress(parcel, null);
    }

    public volatile Object createFromParcel(Parcel parcel)
    {
        return createFromParcel(parcel);
    }

    public PostalAddress[] newArray(int i)
    {
        return new PostalAddress[i];
    }

    public volatile Object[] newArray(int i)
    {
        return newArray(i);
    }

    ()
    {
    }
}
