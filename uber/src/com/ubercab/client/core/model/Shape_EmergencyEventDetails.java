// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;

import android.os.Parcel;

// Referenced classes of package com.ubercab.client.core.model:
//            EmergencyEventDetails

public final class Shape_EmergencyEventDetails extends EmergencyEventDetails
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final EmergencyEventDetails createFromParcel(Parcel parcel)
        {
            return new Shape_EmergencyEventDetails(parcel);
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final EmergencyEventDetails[] newArray(int i)
        {
            return new EmergencyEventDetails[i];
        }

        public final volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    private static final ClassLoader PARCELABLE_CL = com/ubercab/client/core/model/Shape_EmergencyEventDetails.getClassLoader();
    private Long createdAt;
    private String driverId;
    private String driverName;
    private Double latitude;
    private Double longitude;
    private String riderId;
    private String riderName;
    private String tripUuid;

    Shape_EmergencyEventDetails()
    {
    }

    private Shape_EmergencyEventDetails(Parcel parcel)
    {
        tripUuid = (String)parcel.readValue(PARCELABLE_CL);
        riderName = (String)parcel.readValue(PARCELABLE_CL);
        riderId = (String)parcel.readValue(PARCELABLE_CL);
        driverName = (String)parcel.readValue(PARCELABLE_CL);
        driverId = (String)parcel.readValue(PARCELABLE_CL);
        latitude = (Double)parcel.readValue(PARCELABLE_CL);
        longitude = (Double)parcel.readValue(PARCELABLE_CL);
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
            obj = (EmergencyEventDetails)obj;
            if (((EmergencyEventDetails) (obj)).getTripUuid() == null ? getTripUuid() != null : !((EmergencyEventDetails) (obj)).getTripUuid().equals(getTripUuid()))
            {
                return false;
            }
            if (((EmergencyEventDetails) (obj)).getRiderName() == null ? getRiderName() != null : !((EmergencyEventDetails) (obj)).getRiderName().equals(getRiderName()))
            {
                return false;
            }
            if (((EmergencyEventDetails) (obj)).getRiderId() == null ? getRiderId() != null : !((EmergencyEventDetails) (obj)).getRiderId().equals(getRiderId()))
            {
                return false;
            }
            if (((EmergencyEventDetails) (obj)).getDriverName() == null ? getDriverName() != null : !((EmergencyEventDetails) (obj)).getDriverName().equals(getDriverName()))
            {
                return false;
            }
            if (((EmergencyEventDetails) (obj)).getDriverId() == null ? getDriverId() != null : !((EmergencyEventDetails) (obj)).getDriverId().equals(getDriverId()))
            {
                return false;
            }
            if (((EmergencyEventDetails) (obj)).getLatitude() == null ? getLatitude() != null : !((EmergencyEventDetails) (obj)).getLatitude().equals(getLatitude()))
            {
                return false;
            }
            if (((EmergencyEventDetails) (obj)).getLongitude() == null ? getLongitude() != null : !((EmergencyEventDetails) (obj)).getLongitude().equals(getLongitude()))
            {
                return false;
            }
            if (((EmergencyEventDetails) (obj)).getCreatedAt() == null ? getCreatedAt() != null : !((EmergencyEventDetails) (obj)).getCreatedAt().equals(getCreatedAt()))
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

    public final String getDriverId()
    {
        return driverId;
    }

    public final String getDriverName()
    {
        return driverName;
    }

    public final Double getLatitude()
    {
        return latitude;
    }

    public final Double getLongitude()
    {
        return longitude;
    }

    public final String getRiderId()
    {
        return riderId;
    }

    public final String getRiderName()
    {
        return riderName;
    }

    public final String getTripUuid()
    {
        return tripUuid;
    }

    public final int hashCode()
    {
        int l1 = 0;
        int i;
        int j;
        int k;
        int l;
        int i1;
        int j1;
        int k1;
        if (tripUuid == null)
        {
            i = 0;
        } else
        {
            i = tripUuid.hashCode();
        }
        if (riderName == null)
        {
            j = 0;
        } else
        {
            j = riderName.hashCode();
        }
        if (riderId == null)
        {
            k = 0;
        } else
        {
            k = riderId.hashCode();
        }
        if (driverName == null)
        {
            l = 0;
        } else
        {
            l = driverName.hashCode();
        }
        if (driverId == null)
        {
            i1 = 0;
        } else
        {
            i1 = driverId.hashCode();
        }
        if (latitude == null)
        {
            j1 = 0;
        } else
        {
            j1 = latitude.hashCode();
        }
        if (longitude == null)
        {
            k1 = 0;
        } else
        {
            k1 = longitude.hashCode();
        }
        if (createdAt != null)
        {
            l1 = createdAt.hashCode();
        }
        return (k1 ^ (j1 ^ (i1 ^ (l ^ (k ^ (j ^ (i ^ 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243 ^ l1;
    }

    final EmergencyEventDetails setCreatedAt(Long long1)
    {
        createdAt = long1;
        return this;
    }

    final EmergencyEventDetails setDriverId(String s)
    {
        driverId = s;
        return this;
    }

    final EmergencyEventDetails setDriverName(String s)
    {
        driverName = s;
        return this;
    }

    final EmergencyEventDetails setLatitude(Double double1)
    {
        latitude = double1;
        return this;
    }

    final EmergencyEventDetails setLongitude(Double double1)
    {
        longitude = double1;
        return this;
    }

    final EmergencyEventDetails setRiderId(String s)
    {
        riderId = s;
        return this;
    }

    final EmergencyEventDetails setRiderName(String s)
    {
        riderName = s;
        return this;
    }

    final EmergencyEventDetails setTripUuid(String s)
    {
        tripUuid = s;
        return this;
    }

    public final String toString()
    {
        return (new StringBuilder("EmergencyEventDetails{tripUuid=")).append(tripUuid).append(", riderName=").append(riderName).append(", riderId=").append(riderId).append(", driverName=").append(driverName).append(", driverId=").append(driverId).append(", latitude=").append(latitude).append(", longitude=").append(longitude).append(", createdAt=").append(createdAt).append("}").toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeValue(tripUuid);
        parcel.writeValue(riderName);
        parcel.writeValue(riderId);
        parcel.writeValue(driverName);
        parcel.writeValue(driverId);
        parcel.writeValue(latitude);
        parcel.writeValue(longitude);
        parcel.writeValue(createdAt);
    }

}
