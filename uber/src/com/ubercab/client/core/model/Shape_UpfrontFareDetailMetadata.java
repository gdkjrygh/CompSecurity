// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;

import android.os.Parcel;

// Referenced classes of package com.ubercab.client.core.model:
//            UpfrontFareDetailMetadata

public final class Shape_UpfrontFareDetailMetadata extends UpfrontFareDetailMetadata
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final UpfrontFareDetailMetadata createFromParcel(Parcel parcel)
        {
            return new Shape_UpfrontFareDetailMetadata(parcel);
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final UpfrontFareDetailMetadata[] newArray(int i)
        {
            return new UpfrontFareDetailMetadata[i];
        }

        public final volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    private static final ClassLoader PARCELABLE_CL = com/ubercab/client/core/model/Shape_UpfrontFareDetailMetadata.getClassLoader();
    private float fare;
    private String formattedFare;
    private boolean isPool;
    private boolean isSurge;
    private String label;

    Shape_UpfrontFareDetailMetadata()
    {
    }

    private Shape_UpfrontFareDetailMetadata(Parcel parcel)
    {
        formattedFare = (String)parcel.readValue(PARCELABLE_CL);
        fare = ((Float)parcel.readValue(PARCELABLE_CL)).floatValue();
        label = (String)parcel.readValue(PARCELABLE_CL);
        isPool = ((Boolean)parcel.readValue(PARCELABLE_CL)).booleanValue();
        isSurge = ((Boolean)parcel.readValue(PARCELABLE_CL)).booleanValue();
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
            obj = (UpfrontFareDetailMetadata)obj;
            if (((UpfrontFareDetailMetadata) (obj)).getFormattedFare() == null ? getFormattedFare() != null : !((UpfrontFareDetailMetadata) (obj)).getFormattedFare().equals(getFormattedFare()))
            {
                return false;
            }
            if (Float.compare(((UpfrontFareDetailMetadata) (obj)).getFare(), getFare()) != 0)
            {
                return false;
            }
            if (((UpfrontFareDetailMetadata) (obj)).getLabel() == null ? getLabel() != null : !((UpfrontFareDetailMetadata) (obj)).getLabel().equals(getLabel()))
            {
                return false;
            }
            if (((UpfrontFareDetailMetadata) (obj)).getIsPool() != getIsPool())
            {
                return false;
            }
            if (((UpfrontFareDetailMetadata) (obj)).getIsSurge() != getIsSurge())
            {
                return false;
            }
        }
        return true;
    }

    public final float getFare()
    {
        return fare;
    }

    public final String getFormattedFare()
    {
        return formattedFare;
    }

    public final boolean getIsPool()
    {
        return isPool;
    }

    public final boolean getIsSurge()
    {
        return isSurge;
    }

    public final String getLabel()
    {
        return label;
    }

    public final int hashCode()
    {
        char c1 = '\u04CF';
        int j = 0;
        int i;
        char c;
        int k;
        if (formattedFare == null)
        {
            i = 0;
        } else
        {
            i = formattedFare.hashCode();
        }
        k = Float.floatToIntBits(fare);
        if (label != null)
        {
            j = label.hashCode();
        }
        if (isPool)
        {
            c = '\u04CF';
        } else
        {
            c = '\u04D5';
        }
        if (!isSurge)
        {
            c1 = '\u04D5';
        }
        return (c ^ (((i ^ 0xf4243) * 0xf4243 ^ k) * 0xf4243 ^ j) * 0xf4243) * 0xf4243 ^ c1;
    }

    final UpfrontFareDetailMetadata setFare(float f)
    {
        fare = f;
        return this;
    }

    final UpfrontFareDetailMetadata setFormattedFare(String s)
    {
        formattedFare = s;
        return this;
    }

    final UpfrontFareDetailMetadata setIsPool(boolean flag)
    {
        isPool = flag;
        return this;
    }

    final UpfrontFareDetailMetadata setIsSurge(boolean flag)
    {
        isSurge = flag;
        return this;
    }

    final UpfrontFareDetailMetadata setLabel(String s)
    {
        label = s;
        return this;
    }

    public final String toString()
    {
        return (new StringBuilder("UpfrontFareDetailMetadata{formattedFare=")).append(formattedFare).append(", fare=").append(fare).append(", label=").append(label).append(", isPool=").append(isPool).append(", isSurge=").append(isSurge).append("}").toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeValue(formattedFare);
        parcel.writeValue(Float.valueOf(fare));
        parcel.writeValue(label);
        parcel.writeValue(Boolean.valueOf(isPool));
        parcel.writeValue(Boolean.valueOf(isSurge));
    }

}
