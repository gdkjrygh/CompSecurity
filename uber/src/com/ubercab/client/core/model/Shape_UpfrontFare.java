// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;

import android.os.Parcel;
import com.ubercab.rider.realtime.model.Signature;

// Referenced classes of package com.ubercab.client.core.model:
//            UpfrontFare, UpfrontFareSignature

public final class Shape_UpfrontFare extends UpfrontFare
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final UpfrontFare createFromParcel(Parcel parcel)
        {
            return new Shape_UpfrontFare(parcel);
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final UpfrontFare[] newArray(int i)
        {
            return new UpfrontFare[i];
        }

        public final volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    private static final ClassLoader PARCELABLE_CL = com/ubercab/client/core/model/Shape_UpfrontFare.getClassLoader();
    private Integer capacity;
    private String currencyCode;
    private double destinationLat;
    private double destinationLng;
    private String fare;
    private double originLat;
    private double originLng;
    private UpfrontFareSignature signature;
    private String uuid;
    private int vehicleViewId;

    Shape_UpfrontFare()
    {
    }

    private Shape_UpfrontFare(Parcel parcel)
    {
        currencyCode = (String)parcel.readValue(PARCELABLE_CL);
        capacity = (Integer)parcel.readValue(PARCELABLE_CL);
        destinationLat = ((Double)parcel.readValue(PARCELABLE_CL)).doubleValue();
        destinationLng = ((Double)parcel.readValue(PARCELABLE_CL)).doubleValue();
        fare = (String)parcel.readValue(PARCELABLE_CL);
        originLat = ((Double)parcel.readValue(PARCELABLE_CL)).doubleValue();
        originLng = ((Double)parcel.readValue(PARCELABLE_CL)).doubleValue();
        signature = (UpfrontFareSignature)parcel.readValue(PARCELABLE_CL);
        uuid = (String)parcel.readValue(PARCELABLE_CL);
        vehicleViewId = ((Integer)parcel.readValue(PARCELABLE_CL)).intValue();
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
            obj = (UpfrontFare)obj;
            if (((UpfrontFare) (obj)).getCurrencyCode() == null ? getCurrencyCode() != null : !((UpfrontFare) (obj)).getCurrencyCode().equals(getCurrencyCode()))
            {
                return false;
            }
            if (((UpfrontFare) (obj)).getCapacity() == null ? getCapacity() != null : !((UpfrontFare) (obj)).getCapacity().equals(getCapacity()))
            {
                return false;
            }
            if (Double.compare(((UpfrontFare) (obj)).getDestinationLat(), getDestinationLat()) != 0)
            {
                return false;
            }
            if (Double.compare(((UpfrontFare) (obj)).getDestinationLng(), getDestinationLng()) != 0)
            {
                return false;
            }
            if (((UpfrontFare) (obj)).getFare() == null ? getFare() != null : !((UpfrontFare) (obj)).getFare().equals(getFare()))
            {
                return false;
            }
            if (Double.compare(((UpfrontFare) (obj)).getOriginLat(), getOriginLat()) != 0)
            {
                return false;
            }
            if (Double.compare(((UpfrontFare) (obj)).getOriginLng(), getOriginLng()) != 0)
            {
                return false;
            }
            if (((UpfrontFare) (obj)).getSignature() == null ? getSignature() != null : !((UpfrontFare) (obj)).getSignature().equals(getSignature()))
            {
                return false;
            }
            if (((UpfrontFare) (obj)).getUuid() == null ? getUuid() != null : !((UpfrontFare) (obj)).getUuid().equals(getUuid()))
            {
                return false;
            }
            if (((UpfrontFare) (obj)).getVehicleViewId() != getVehicleViewId())
            {
                return false;
            }
        }
        return true;
    }

    public final Integer getCapacity()
    {
        return capacity;
    }

    public final String getCurrencyCode()
    {
        return currencyCode;
    }

    public final double getDestinationLat()
    {
        return destinationLat;
    }

    public final double getDestinationLng()
    {
        return destinationLng;
    }

    public final String getFare()
    {
        return fare;
    }

    public final double getOriginLat()
    {
        return originLat;
    }

    public final double getOriginLng()
    {
        return originLng;
    }

    public final UpfrontFareSignature getSignature()
    {
        return signature;
    }

    public final volatile Signature getSignature()
    {
        return getSignature();
    }

    public final String getUuid()
    {
        return uuid;
    }

    public final int getVehicleViewId()
    {
        return vehicleViewId;
    }

    public final int hashCode()
    {
        boolean flag = false;
        int i;
        int j;
        int k;
        if (currencyCode == null)
        {
            i = 0;
        } else
        {
            i = currencyCode.hashCode();
        }
        if (capacity == null)
        {
            j = 0;
        } else
        {
            j = capacity.hashCode();
        }
        j = (int)((long)((int)((long)((j ^ (i ^ 0xf4243) * 0xf4243) * 0xf4243) ^ (Double.doubleToLongBits(destinationLat) >>> 32 ^ Double.doubleToLongBits(destinationLat))) * 0xf4243) ^ (Double.doubleToLongBits(destinationLng) >>> 32 ^ Double.doubleToLongBits(destinationLng)));
        if (fare == null)
        {
            i = 0;
        } else
        {
            i = fare.hashCode();
        }
        k = (int)((long)((int)((long)((i ^ j * 0xf4243) * 0xf4243) ^ (Double.doubleToLongBits(originLat) >>> 32 ^ Double.doubleToLongBits(originLat))) * 0xf4243) ^ (Double.doubleToLongBits(originLng) >>> 32 ^ Double.doubleToLongBits(originLng)));
        if (signature == null)
        {
            i = 0;
        } else
        {
            i = signature.hashCode();
        }
        if (uuid == null)
        {
            j = ((flag) ? 1 : 0);
        } else
        {
            j = uuid.hashCode();
        }
        return ((i ^ k * 0xf4243) * 0xf4243 ^ j) * 0xf4243 ^ vehicleViewId;
    }

    final UpfrontFare setCapacity(Integer integer)
    {
        capacity = integer;
        return this;
    }

    final UpfrontFare setCurrencyCode(String s)
    {
        currencyCode = s;
        return this;
    }

    final UpfrontFare setDestinationLat(double d)
    {
        destinationLat = d;
        return this;
    }

    final UpfrontFare setDestinationLng(double d)
    {
        destinationLng = d;
        return this;
    }

    final UpfrontFare setFare(String s)
    {
        fare = s;
        return this;
    }

    final UpfrontFare setOriginLat(double d)
    {
        originLat = d;
        return this;
    }

    final UpfrontFare setOriginLng(double d)
    {
        originLng = d;
        return this;
    }

    final UpfrontFare setSignature(UpfrontFareSignature upfrontfaresignature)
    {
        signature = upfrontfaresignature;
        return this;
    }

    final UpfrontFare setUuid(String s)
    {
        uuid = s;
        return this;
    }

    final UpfrontFare setVehicleViewId(int i)
    {
        vehicleViewId = i;
        return this;
    }

    public final String toString()
    {
        return (new StringBuilder("com.ubercab.client.core.model.UpfrontFare{currencyCode=")).append(currencyCode).append(", capacity=").append(capacity).append(", destinationLat=").append(destinationLat).append(", destinationLng=").append(destinationLng).append(", fare=").append(fare).append(", originLat=").append(originLat).append(", originLng=").append(originLng).append(", signature=").append(signature).append(", uuid=").append(uuid).append(", vehicleViewId=").append(vehicleViewId).append("}").toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeValue(currencyCode);
        parcel.writeValue(capacity);
        parcel.writeValue(Double.valueOf(destinationLat));
        parcel.writeValue(Double.valueOf(destinationLng));
        parcel.writeValue(fare);
        parcel.writeValue(Double.valueOf(originLat));
        parcel.writeValue(Double.valueOf(originLng));
        parcel.writeValue(signature);
        parcel.writeValue(uuid);
        parcel.writeValue(Integer.valueOf(vehicleViewId));
    }

}
