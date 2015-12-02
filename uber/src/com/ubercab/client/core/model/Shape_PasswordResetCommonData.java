// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;


// Referenced classes of package com.ubercab.client.core.model:
//            PasswordResetCommonData

public final class Shape_PasswordResetCommonData extends PasswordResetCommonData
{

    private String appName;
    private String deviceIMEI;
    private String deviceId;
    private String deviceMobileCountryCode;
    private String deviceMobileDigits;
    private String deviceModel;
    private String deviceOS;
    private String deviceSerialNumber;
    private long epoch;
    private String language;
    private Double latitude;
    private Double longitude;
    private String version;

    Shape_PasswordResetCommonData()
    {
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (PasswordResetCommonData)obj;
            if (((PasswordResetCommonData) (obj)).getAppName() == null ? getAppName() != null : !((PasswordResetCommonData) (obj)).getAppName().equals(getAppName()))
            {
                return false;
            }
            if (((PasswordResetCommonData) (obj)).getDeviceId() == null ? getDeviceId() != null : !((PasswordResetCommonData) (obj)).getDeviceId().equals(getDeviceId()))
            {
                return false;
            }
            if (((PasswordResetCommonData) (obj)).getDeviceIMEI() == null ? getDeviceIMEI() != null : !((PasswordResetCommonData) (obj)).getDeviceIMEI().equals(getDeviceIMEI()))
            {
                return false;
            }
            if (((PasswordResetCommonData) (obj)).getDeviceMobileDigits() == null ? getDeviceMobileDigits() != null : !((PasswordResetCommonData) (obj)).getDeviceMobileDigits().equals(getDeviceMobileDigits()))
            {
                return false;
            }
            if (((PasswordResetCommonData) (obj)).getDeviceMobileCountryCode() == null ? getDeviceMobileCountryCode() != null : !((PasswordResetCommonData) (obj)).getDeviceMobileCountryCode().equals(getDeviceMobileCountryCode()))
            {
                return false;
            }
            if (((PasswordResetCommonData) (obj)).getDeviceModel() == null ? getDeviceModel() != null : !((PasswordResetCommonData) (obj)).getDeviceModel().equals(getDeviceModel()))
            {
                return false;
            }
            if (((PasswordResetCommonData) (obj)).getDeviceOS() == null ? getDeviceOS() != null : !((PasswordResetCommonData) (obj)).getDeviceOS().equals(getDeviceOS()))
            {
                return false;
            }
            if (((PasswordResetCommonData) (obj)).getDeviceSerialNumber() == null ? getDeviceSerialNumber() != null : !((PasswordResetCommonData) (obj)).getDeviceSerialNumber().equals(getDeviceSerialNumber()))
            {
                return false;
            }
            if (((PasswordResetCommonData) (obj)).getEpoch() != getEpoch())
            {
                return false;
            }
            if (((PasswordResetCommonData) (obj)).getLanguage() == null ? getLanguage() != null : !((PasswordResetCommonData) (obj)).getLanguage().equals(getLanguage()))
            {
                return false;
            }
            if (((PasswordResetCommonData) (obj)).getVersion() == null ? getVersion() != null : !((PasswordResetCommonData) (obj)).getVersion().equals(getVersion()))
            {
                return false;
            }
            if (((PasswordResetCommonData) (obj)).getLatitude() == null ? getLatitude() != null : !((PasswordResetCommonData) (obj)).getLatitude().equals(getLatitude()))
            {
                return false;
            }
            if (((PasswordResetCommonData) (obj)).getLongitude() == null ? getLongitude() != null : !((PasswordResetCommonData) (obj)).getLongitude().equals(getLongitude()))
            {
                return false;
            }
        }
        return true;
    }

    public final String getAppName()
    {
        return appName;
    }

    public final String getDeviceIMEI()
    {
        return deviceIMEI;
    }

    public final String getDeviceId()
    {
        return deviceId;
    }

    public final String getDeviceMobileCountryCode()
    {
        return deviceMobileCountryCode;
    }

    public final String getDeviceMobileDigits()
    {
        return deviceMobileDigits;
    }

    public final String getDeviceModel()
    {
        return deviceModel;
    }

    public final String getDeviceOS()
    {
        return deviceOS;
    }

    public final String getDeviceSerialNumber()
    {
        return deviceSerialNumber;
    }

    public final long getEpoch()
    {
        return epoch;
    }

    public final String getLanguage()
    {
        return language;
    }

    public final Double getLatitude()
    {
        return latitude;
    }

    public final Double getLongitude()
    {
        return longitude;
    }

    public final String getVersion()
    {
        return version;
    }

    public final int hashCode()
    {
        boolean flag = false;
        int i;
        int j;
        int k;
        int l;
        int i1;
        int j1;
        int k1;
        int l1;
        if (appName == null)
        {
            i = 0;
        } else
        {
            i = appName.hashCode();
        }
        if (deviceId == null)
        {
            j = 0;
        } else
        {
            j = deviceId.hashCode();
        }
        if (deviceIMEI == null)
        {
            k = 0;
        } else
        {
            k = deviceIMEI.hashCode();
        }
        if (deviceMobileDigits == null)
        {
            l = 0;
        } else
        {
            l = deviceMobileDigits.hashCode();
        }
        if (deviceMobileCountryCode == null)
        {
            i1 = 0;
        } else
        {
            i1 = deviceMobileCountryCode.hashCode();
        }
        if (deviceModel == null)
        {
            j1 = 0;
        } else
        {
            j1 = deviceModel.hashCode();
        }
        if (deviceOS == null)
        {
            k1 = 0;
        } else
        {
            k1 = deviceOS.hashCode();
        }
        if (deviceSerialNumber == null)
        {
            l1 = 0;
        } else
        {
            l1 = deviceSerialNumber.hashCode();
        }
        i1 = (int)((long)((l1 ^ (k1 ^ (j1 ^ (i1 ^ (l ^ (k ^ (j ^ (i ^ 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243) ^ (epoch >>> 32 ^ epoch));
        if (language == null)
        {
            i = 0;
        } else
        {
            i = language.hashCode();
        }
        if (version == null)
        {
            j = 0;
        } else
        {
            j = version.hashCode();
        }
        if (latitude == null)
        {
            k = 0;
        } else
        {
            k = latitude.hashCode();
        }
        if (longitude == null)
        {
            l = ((flag) ? 1 : 0);
        } else
        {
            l = longitude.hashCode();
        }
        return (k ^ (j ^ (i ^ i1 * 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243 ^ l;
    }

    public final PasswordResetCommonData setAppName(String s)
    {
        appName = s;
        return this;
    }

    public final PasswordResetCommonData setDeviceIMEI(String s)
    {
        deviceIMEI = s;
        return this;
    }

    public final PasswordResetCommonData setDeviceId(String s)
    {
        deviceId = s;
        return this;
    }

    public final PasswordResetCommonData setDeviceMobileCountryCode(String s)
    {
        deviceMobileCountryCode = s;
        return this;
    }

    public final PasswordResetCommonData setDeviceMobileDigits(String s)
    {
        deviceMobileDigits = s;
        return this;
    }

    public final PasswordResetCommonData setDeviceModel(String s)
    {
        deviceModel = s;
        return this;
    }

    public final PasswordResetCommonData setDeviceOS(String s)
    {
        deviceOS = s;
        return this;
    }

    public final PasswordResetCommonData setDeviceSerialNumber(String s)
    {
        deviceSerialNumber = s;
        return this;
    }

    public final PasswordResetCommonData setEpoch(long l)
    {
        epoch = l;
        return this;
    }

    public final PasswordResetCommonData setLanguage(String s)
    {
        language = s;
        return this;
    }

    public final PasswordResetCommonData setLatitude(Double double1)
    {
        latitude = double1;
        return this;
    }

    public final PasswordResetCommonData setLongitude(Double double1)
    {
        longitude = double1;
        return this;
    }

    public final PasswordResetCommonData setVersion(String s)
    {
        version = s;
        return this;
    }

    public final String toString()
    {
        return (new StringBuilder("PasswordResetCommonData{appName=")).append(appName).append(", deviceId=").append(deviceId).append(", deviceIMEI=").append(deviceIMEI).append(", deviceMobileDigits=").append(deviceMobileDigits).append(", deviceMobileCountryCode=").append(deviceMobileCountryCode).append(", deviceModel=").append(deviceModel).append(", deviceOS=").append(deviceOS).append(", deviceSerialNumber=").append(deviceSerialNumber).append(", epoch=").append(epoch).append(", language=").append(language).append(", version=").append(version).append(", latitude=").append(latitude).append(", longitude=").append(longitude).append("}").toString();
    }
}
