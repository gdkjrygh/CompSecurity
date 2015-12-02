// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;

import android.os.Parcel;
import com.ubercab.rider.realtime.model.FareDetail;
import com.ubercab.rider.realtime.model.Metadata;
import com.ubercab.rider.realtime.model.UpfrontFare;

// Referenced classes of package com.ubercab.client.core.model:
//            FareInfo, UpfrontFare, UpfrontFareMetadata, UpfrontFareDetail

public final class Shape_FareInfo extends FareInfo
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final FareInfo createFromParcel(Parcel parcel)
        {
            return new Shape_FareInfo(parcel);
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final FareInfo[] newArray(int i)
        {
            return new FareInfo[i];
        }

        public final volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    private static final ClassLoader PARCELABLE_CL = com/ubercab/client/core/model/Shape_FareInfo.getClassLoader();
    private UpfrontFareDetail fareDetail;
    private UpfrontFareMetadata metadata;
    private com.ubercab.client.core.model.UpfrontFare upfrontFare;

    Shape_FareInfo()
    {
    }

    private Shape_FareInfo(Parcel parcel)
    {
        upfrontFare = (com.ubercab.client.core.model.UpfrontFare)parcel.readValue(PARCELABLE_CL);
        metadata = (UpfrontFareMetadata)parcel.readValue(PARCELABLE_CL);
        fareDetail = (UpfrontFareDetail)parcel.readValue(PARCELABLE_CL);
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
            obj = (FareInfo)obj;
            if (((FareInfo) (obj)).getUpfrontFare() == null ? getUpfrontFare() != null : !((FareInfo) (obj)).getUpfrontFare().equals(getUpfrontFare()))
            {
                return false;
            }
            if (((FareInfo) (obj)).getMetadata() == null ? getMetadata() != null : !((FareInfo) (obj)).getMetadata().equals(getMetadata()))
            {
                return false;
            }
            if (((FareInfo) (obj)).getFareDetail() == null ? getFareDetail() != null : !((FareInfo) (obj)).getFareDetail().equals(getFareDetail()))
            {
                return false;
            }
        }
        return true;
    }

    public final UpfrontFareDetail getFareDetail()
    {
        return fareDetail;
    }

    public final volatile FareDetail getFareDetail()
    {
        return getFareDetail();
    }

    public final UpfrontFareMetadata getMetadata()
    {
        return metadata;
    }

    public final volatile Metadata getMetadata()
    {
        return getMetadata();
    }

    public final com.ubercab.client.core.model.UpfrontFare getUpfrontFare()
    {
        return upfrontFare;
    }

    public final volatile UpfrontFare getUpfrontFare()
    {
        return getUpfrontFare();
    }

    public final int hashCode()
    {
        int k = 0;
        int i;
        int j;
        if (upfrontFare == null)
        {
            i = 0;
        } else
        {
            i = upfrontFare.hashCode();
        }
        if (metadata == null)
        {
            j = 0;
        } else
        {
            j = metadata.hashCode();
        }
        if (fareDetail != null)
        {
            k = fareDetail.hashCode();
        }
        return (j ^ (i ^ 0xf4243) * 0xf4243) * 0xf4243 ^ k;
    }

    public final FareInfo setFareDetail(UpfrontFareDetail upfrontfaredetail)
    {
        fareDetail = upfrontfaredetail;
        return this;
    }

    public final FareInfo setMetadata(UpfrontFareMetadata upfrontfaremetadata)
    {
        metadata = upfrontfaremetadata;
        return this;
    }

    public final FareInfo setUpfrontFare(com.ubercab.client.core.model.UpfrontFare upfrontfare)
    {
        upfrontFare = upfrontfare;
        return this;
    }

    public final String toString()
    {
        return (new StringBuilder("com.ubercab.client.core.model.FareInfo{upfrontFare=")).append(upfrontFare).append(", metadata=").append(metadata).append(", fareDetail=").append(fareDetail).append("}").toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeValue(upfrontFare);
        parcel.writeValue(metadata);
        parcel.writeValue(fareDetail);
    }

}
