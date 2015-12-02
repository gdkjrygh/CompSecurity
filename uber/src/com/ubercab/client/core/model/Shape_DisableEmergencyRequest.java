// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;

import android.os.Parcel;

// Referenced classes of package com.ubercab.client.core.model:
//            DisableEmergencyRequest

public final class Shape_DisableEmergencyRequest extends DisableEmergencyRequest
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final DisableEmergencyRequest createFromParcel(Parcel parcel)
        {
            return new Shape_DisableEmergencyRequest(parcel);
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final DisableEmergencyRequest[] newArray(int i)
        {
            return new DisableEmergencyRequest[i];
        }

        public final volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    private static final ClassLoader PARCELABLE_CL = com/ubercab/client/core/model/Shape_DisableEmergencyRequest.getClassLoader();
    private Long createdAt;

    Shape_DisableEmergencyRequest()
    {
    }

    private Shape_DisableEmergencyRequest(Parcel parcel)
    {
        createdAt = (Long)parcel.readValue(PARCELABLE_CL);
    }


    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (DisableEmergencyRequest)obj;
            if (((DisableEmergencyRequest) (obj)).getCreatedAt() == null ? getCreatedAt() != null : !((DisableEmergencyRequest) (obj)).getCreatedAt().equals(getCreatedAt()))
            {
                return false;
            }
        }
        return true;
    }

    public final Long getCreatedAt()
    {
        return createdAt;
    }

    public final int hashCode()
    {
        int i;
        if (createdAt == null)
        {
            i = 0;
        } else
        {
            i = createdAt.hashCode();
        }
        return i ^ 0xf4243;
    }

    final DisableEmergencyRequest setCreatedAt(Long long1)
    {
        createdAt = long1;
        return this;
    }

    public final String toString()
    {
        return (new StringBuilder("DisableEmergencyRequest{createdAt=")).append(createdAt).append("}").toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeValue(createdAt);
    }

}
