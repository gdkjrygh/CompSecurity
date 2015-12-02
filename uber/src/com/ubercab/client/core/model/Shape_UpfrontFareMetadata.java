// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;

import android.os.Parcel;

// Referenced classes of package com.ubercab.client.core.model:
//            UpfrontFareMetadata

public final class Shape_UpfrontFareMetadata extends UpfrontFareMetadata
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final UpfrontFareMetadata createFromParcel(Parcel parcel)
        {
            return new Shape_UpfrontFareMetadata(parcel);
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final UpfrontFareMetadata[] newArray(int i)
        {
            return new UpfrontFareMetadata[i];
        }

        public final volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    private static final ClassLoader PARCELABLE_CL = com/ubercab/client/core/model/Shape_UpfrontFareMetadata.getClassLoader();
    private double discountPercentage;
    private String fareType;
    private String formattedFare;
    private String longDescription;
    private String shortDescription;
    private String tagline;

    Shape_UpfrontFareMetadata()
    {
    }

    private Shape_UpfrontFareMetadata(Parcel parcel)
    {
        discountPercentage = ((Double)parcel.readValue(PARCELABLE_CL)).doubleValue();
        fareType = (String)parcel.readValue(PARCELABLE_CL);
        formattedFare = (String)parcel.readValue(PARCELABLE_CL);
        longDescription = (String)parcel.readValue(PARCELABLE_CL);
        shortDescription = (String)parcel.readValue(PARCELABLE_CL);
        tagline = (String)parcel.readValue(PARCELABLE_CL);
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
            obj = (UpfrontFareMetadata)obj;
            if (Double.compare(((UpfrontFareMetadata) (obj)).getDiscountPercentage(), getDiscountPercentage()) != 0)
            {
                return false;
            }
            if (((UpfrontFareMetadata) (obj)).getFareType() == null ? getFareType() != null : !((UpfrontFareMetadata) (obj)).getFareType().equals(getFareType()))
            {
                return false;
            }
            if (((UpfrontFareMetadata) (obj)).getFormattedFare() == null ? getFormattedFare() != null : !((UpfrontFareMetadata) (obj)).getFormattedFare().equals(getFormattedFare()))
            {
                return false;
            }
            if (((UpfrontFareMetadata) (obj)).getLongDescription() == null ? getLongDescription() != null : !((UpfrontFareMetadata) (obj)).getLongDescription().equals(getLongDescription()))
            {
                return false;
            }
            if (((UpfrontFareMetadata) (obj)).getShortDescription() == null ? getShortDescription() != null : !((UpfrontFareMetadata) (obj)).getShortDescription().equals(getShortDescription()))
            {
                return false;
            }
            if (((UpfrontFareMetadata) (obj)).getTagline() == null ? getTagline() != null : !((UpfrontFareMetadata) (obj)).getTagline().equals(getTagline()))
            {
                return false;
            }
        }
        return true;
    }

    public final double getDiscountPercentage()
    {
        return discountPercentage;
    }

    public final String getFareType()
    {
        return fareType;
    }

    public final String getFormattedFare()
    {
        return formattedFare;
    }

    public final String getLongDescription()
    {
        return longDescription;
    }

    public final String getShortDescription()
    {
        return shortDescription;
    }

    public final String getTagline()
    {
        return tagline;
    }

    public final int hashCode()
    {
        int i1 = 0;
        int j1 = (int)(0xf4243L ^ (Double.doubleToLongBits(discountPercentage) >>> 32 ^ Double.doubleToLongBits(discountPercentage)));
        int i;
        int j;
        int k;
        int l;
        if (fareType == null)
        {
            i = 0;
        } else
        {
            i = fareType.hashCode();
        }
        if (formattedFare == null)
        {
            j = 0;
        } else
        {
            j = formattedFare.hashCode();
        }
        if (longDescription == null)
        {
            k = 0;
        } else
        {
            k = longDescription.hashCode();
        }
        if (shortDescription == null)
        {
            l = 0;
        } else
        {
            l = shortDescription.hashCode();
        }
        if (tagline != null)
        {
            i1 = tagline.hashCode();
        }
        return (l ^ (k ^ (j ^ (i ^ j1 * 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243 ^ i1;
    }

    public final UpfrontFareMetadata setDiscountPercentage(double d)
    {
        discountPercentage = d;
        return this;
    }

    public final UpfrontFareMetadata setFareType(String s)
    {
        fareType = s;
        return this;
    }

    public final UpfrontFareMetadata setFormattedFare(String s)
    {
        formattedFare = s;
        return this;
    }

    public final UpfrontFareMetadata setLongDescription(String s)
    {
        longDescription = s;
        return this;
    }

    public final UpfrontFareMetadata setShortDescription(String s)
    {
        shortDescription = s;
        return this;
    }

    public final UpfrontFareMetadata setTagline(String s)
    {
        tagline = s;
        return this;
    }

    public final String toString()
    {
        return (new StringBuilder("UpfrontFareMetadata{discountPercentage=")).append(discountPercentage).append(", fareType=").append(fareType).append(", formattedFare=").append(formattedFare).append(", longDescription=").append(longDescription).append(", shortDescription=").append(shortDescription).append(", tagline=").append(tagline).append("}").toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeValue(Double.valueOf(discountPercentage));
        parcel.writeValue(fareType);
        parcel.writeValue(formattedFare);
        parcel.writeValue(longDescription);
        parcel.writeValue(shortDescription);
        parcel.writeValue(tagline);
    }

}
