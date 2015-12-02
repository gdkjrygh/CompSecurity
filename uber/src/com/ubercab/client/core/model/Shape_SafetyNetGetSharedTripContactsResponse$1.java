// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;

import android.os.Parcel;

// Referenced classes of package com.ubercab.client.core.model:
//            Shape_SafetyNetGetSharedTripContactsResponse, SafetyNetGetSharedTripContactsResponse

final class 
    implements android.os.ContactsResponse._cls1
{

    public final SafetyNetGetSharedTripContactsResponse createFromParcel(Parcel parcel)
    {
        return new Shape_SafetyNetGetSharedTripContactsResponse(parcel, null);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        return createFromParcel(parcel);
    }

    public final SafetyNetGetSharedTripContactsResponse[] newArray(int i)
    {
        return new SafetyNetGetSharedTripContactsResponse[i];
    }

    public final volatile Object[] newArray(int i)
    {
        return newArray(i);
    }

    ()
    {
    }
}
