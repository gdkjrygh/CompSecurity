// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;

import android.os.Parcel;

// Referenced classes of package com.ubercab.client.core.model:
//            AnonymousPhoneNumberRequest

public final class Shape_AnonymousPhoneNumberRequest extends AnonymousPhoneNumberRequest
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final AnonymousPhoneNumberRequest createFromParcel(Parcel parcel)
        {
            return new Shape_AnonymousPhoneNumberRequest(parcel);
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final AnonymousPhoneNumberRequest[] newArray(int i)
        {
            return new AnonymousPhoneNumberRequest[i];
        }

        public final volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    private static final ClassLoader PARCELABLE_CL = com/ubercab/client/core/model/Shape_AnonymousPhoneNumberRequest.getClassLoader();
    private String callerPhoneNumber;
    private String cityName;
    private Double latitude;
    private String locale;
    private Double longitude;
    private String userType;

    Shape_AnonymousPhoneNumberRequest()
    {
    }

    private Shape_AnonymousPhoneNumberRequest(Parcel parcel)
    {
        callerPhoneNumber = (String)parcel.readValue(PARCELABLE_CL);
        cityName = (String)parcel.readValue(PARCELABLE_CL);
        locale = (String)parcel.readValue(PARCELABLE_CL);
        userType = (String)parcel.readValue(PARCELABLE_CL);
        latitude = (Double)parcel.readValue(PARCELABLE_CL);
        longitude = (Double)parcel.readValue(PARCELABLE_CL);
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
            obj = (AnonymousPhoneNumberRequest)obj;
            if (((AnonymousPhoneNumberRequest) (obj)).getCallerPhoneNumber() == null ? getCallerPhoneNumber() != null : !((AnonymousPhoneNumberRequest) (obj)).getCallerPhoneNumber().equals(getCallerPhoneNumber()))
            {
                return false;
            }
            if (((AnonymousPhoneNumberRequest) (obj)).getCityName() == null ? getCityName() != null : !((AnonymousPhoneNumberRequest) (obj)).getCityName().equals(getCityName()))
            {
                return false;
            }
            if (((AnonymousPhoneNumberRequest) (obj)).getLocale() == null ? getLocale() != null : !((AnonymousPhoneNumberRequest) (obj)).getLocale().equals(getLocale()))
            {
                return false;
            }
            if (((AnonymousPhoneNumberRequest) (obj)).getUserType() == null ? getUserType() != null : !((AnonymousPhoneNumberRequest) (obj)).getUserType().equals(getUserType()))
            {
                return false;
            }
            if (((AnonymousPhoneNumberRequest) (obj)).getLatitude() == null ? getLatitude() != null : !((AnonymousPhoneNumberRequest) (obj)).getLatitude().equals(getLatitude()))
            {
                return false;
            }
            if (((AnonymousPhoneNumberRequest) (obj)).getLongitude() == null ? getLongitude() != null : !((AnonymousPhoneNumberRequest) (obj)).getLongitude().equals(getLongitude()))
            {
                return false;
            }
        }
        return true;
    }

    public final String getCallerPhoneNumber()
    {
        return callerPhoneNumber;
    }

    public final String getCityName()
    {
        return cityName;
    }

    public final Double getLatitude()
    {
        return latitude;
    }

    public final String getLocale()
    {
        return locale;
    }

    public final Double getLongitude()
    {
        return longitude;
    }

    public final String getUserType()
    {
        return userType;
    }

    public final int hashCode()
    {
        int j1 = 0;
        int i;
        int j;
        int k;
        int l;
        int i1;
        if (callerPhoneNumber == null)
        {
            i = 0;
        } else
        {
            i = callerPhoneNumber.hashCode();
        }
        if (cityName == null)
        {
            j = 0;
        } else
        {
            j = cityName.hashCode();
        }
        if (locale == null)
        {
            k = 0;
        } else
        {
            k = locale.hashCode();
        }
        if (userType == null)
        {
            l = 0;
        } else
        {
            l = userType.hashCode();
        }
        if (latitude == null)
        {
            i1 = 0;
        } else
        {
            i1 = latitude.hashCode();
        }
        if (longitude != null)
        {
            j1 = longitude.hashCode();
        }
        return (i1 ^ (l ^ (k ^ (j ^ (i ^ 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243 ^ j1;
    }

    final AnonymousPhoneNumberRequest setCallerPhoneNumber(String s)
    {
        callerPhoneNumber = s;
        return this;
    }

    final AnonymousPhoneNumberRequest setCityName(String s)
    {
        cityName = s;
        return this;
    }

    final AnonymousPhoneNumberRequest setLatitude(Double double1)
    {
        latitude = double1;
        return this;
    }

    final AnonymousPhoneNumberRequest setLocale(String s)
    {
        locale = s;
        return this;
    }

    final AnonymousPhoneNumberRequest setLongitude(Double double1)
    {
        longitude = double1;
        return this;
    }

    final AnonymousPhoneNumberRequest setUserType(String s)
    {
        userType = s;
        return this;
    }

    public final String toString()
    {
        return (new StringBuilder("AnonymousPhoneNumberRequest{callerPhoneNumber=")).append(callerPhoneNumber).append(", cityName=").append(cityName).append(", locale=").append(locale).append(", userType=").append(userType).append(", latitude=").append(latitude).append(", longitude=").append(longitude).append("}").toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeValue(callerPhoneNumber);
        parcel.writeValue(cityName);
        parcel.writeValue(locale);
        parcel.writeValue(userType);
        parcel.writeValue(latitude);
        parcel.writeValue(longitude);
    }

}
