// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;

import android.os.Parcel;

// Referenced classes of package com.ubercab.client.core.model:
//            Shape_SafetyNetAddContactsResponse, SafetyNetAddContactsResponse

final class 
    implements android.os.ContactsResponse._cls1
{

    public final SafetyNetAddContactsResponse createFromParcel(Parcel parcel)
    {
        return new Shape_SafetyNetAddContactsResponse(parcel, null);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        return createFromParcel(parcel);
    }

    public final SafetyNetAddContactsResponse[] newArray(int i)
    {
        return new SafetyNetAddContactsResponse[i];
    }

    public final volatile Object[] newArray(int i)
    {
        return newArray(i);
    }

    ()
    {
    }
}
