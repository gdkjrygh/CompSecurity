// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;

import com.ubercab.rider.realtime.model.TripDriverCapabilities;
import com.ubercab.rider.realtime.model.TripDriverLocation;

// Referenced classes of package com.ubercab.client.core.model:
//            TripDriverLocation, Capabilities

public class TripDriver
    implements com.ubercab.rider.realtime.model.TripDriver
{

    Capabilities capabilities;
    boolean displayCompany;
    Boolean isAccessibilityTripViewEnabled;
    Boolean isCallButtonEnabled;
    com.ubercab.client.core.model.TripDriverLocation location;
    String mobile;
    String name;
    String partnerCompany;
    String pictureUrl;
    float rating;
    String status;
    String uuid;

    public TripDriver()
    {
        rating = 0.0F;
        displayCompany = false;
        uuid = "";
        mobile = "";
        name = "";
        partnerCompany = "";
        pictureUrl = "";
        status = "";
        isAccessibilityTripViewEnabled = Boolean.valueOf(false);
        isCallButtonEnabled = Boolean.valueOf(true);
    }

    public boolean equals(Object obj)
    {
        if (this != obj) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (obj == null || getClass() != obj.getClass())
        {
            return false;
        }
        obj = (TripDriver)obj;
        if (capabilities == null ? ((TripDriver) (obj)).capabilities != null : !capabilities.equals(((TripDriver) (obj)).capabilities))
        {
            return false;
        }
        if (displayCompany != ((TripDriver) (obj)).displayCompany)
        {
            return false;
        }
        if (Float.compare(((TripDriver) (obj)).rating, rating) != 0)
        {
            return false;
        }
        if (uuid == null ? ((TripDriver) (obj)).uuid != null : !uuid.equals(((TripDriver) (obj)).uuid))
        {
            return false;
        }
        if (location == null ? ((TripDriver) (obj)).location != null : !location.equals(((TripDriver) (obj)).location))
        {
            return false;
        }
        if (mobile == null ? ((TripDriver) (obj)).mobile != null : !mobile.equals(((TripDriver) (obj)).mobile))
        {
            return false;
        }
        if (name == null ? ((TripDriver) (obj)).name != null : !name.equals(((TripDriver) (obj)).name))
        {
            return false;
        }
        if (partnerCompany == null ? ((TripDriver) (obj)).partnerCompany != null : !partnerCompany.equals(((TripDriver) (obj)).partnerCompany))
        {
            return false;
        }
        if (pictureUrl == null ? ((TripDriver) (obj)).pictureUrl != null : !pictureUrl.equals(((TripDriver) (obj)).pictureUrl))
        {
            return false;
        }
        if (status == null ? ((TripDriver) (obj)).status != null : !status.equals(((TripDriver) (obj)).status))
        {
            return false;
        }
        if (isAccessibilityTripViewEnabled == null ? ((TripDriver) (obj)).isAccessibilityTripViewEnabled != null : !isAccessibilityTripViewEnabled.equals(((TripDriver) (obj)).isAccessibilityTripViewEnabled))
        {
            return false;
        }
        if (isCallButtonEnabled == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (isCallButtonEnabled.equals(((TripDriver) (obj)).isCallButtonEnabled)) goto _L1; else goto _L3
_L3:
        return true;
        if (((TripDriver) (obj)).isCallButtonEnabled == null) goto _L1; else goto _L4
_L4:
        return true;
    }

    public boolean getAccessibilityTripViewEnabled()
    {
        if (isAccessibilityTripViewEnabled == null)
        {
            return false;
        } else
        {
            return isAccessibilityTripViewEnabled.booleanValue();
        }
    }

    public boolean getCallButtonEnabled()
    {
        if (isCallButtonEnabled == null)
        {
            return false;
        } else
        {
            return isCallButtonEnabled.booleanValue();
        }
    }

    public TripDriverCapabilities getCapabilities()
    {
        return getTripDriverCapabilities();
    }

    public boolean getDisplayCompany()
    {
        return isDisplayCompany();
    }

    public String getId()
    {
        throw new UnsupportedOperationException("ID not supported anymore. Use UUID instead.");
    }

    public boolean getIsAccessibilityTripViewEnabled()
    {
        return getAccessibilityTripViewEnabled();
    }

    public boolean getIsCallButtonEnabled()
    {
        return getCallButtonEnabled();
    }

    public TripDriverLocation getLocation()
    {
        return location;
    }

    public String getMobile()
    {
        return mobile;
    }

    public String getMobileCountryIso2()
    {
        throw new UnsupportedOperationException("Mobile country code not supported on old ping model.");
    }

    public String getMobileDigits()
    {
        throw new UnsupportedOperationException("Mobile digits not supported on old ping model.");
    }

    public String getName()
    {
        return name;
    }

    public String getPartnerCompany()
    {
        return partnerCompany;
    }

    public String getPictureUrl()
    {
        return pictureUrl;
    }

    public float getRating()
    {
        return rating;
    }

    public String getStatus()
    {
        return status;
    }

    public TripDriverCapabilities getTripDriverCapabilities()
    {
        return capabilities;
    }

    public String getUuid()
    {
        return uuid;
    }

    public int hashCode()
    {
        int l2 = 0;
        int i;
        int j;
        int k;
        int l;
        int i1;
        int j1;
        int k1;
        int l1;
        int i2;
        int j2;
        int k2;
        if (capabilities != null)
        {
            i = capabilities.hashCode();
        } else
        {
            i = 0;
        }
        if (rating != 0.0F)
        {
            j = Float.floatToIntBits(rating);
        } else
        {
            j = 0;
        }
        if (displayCompany)
        {
            k = 1;
        } else
        {
            k = 0;
        }
        if (uuid != null)
        {
            l = uuid.hashCode();
        } else
        {
            l = 0;
        }
        if (mobile != null)
        {
            i1 = mobile.hashCode();
        } else
        {
            i1 = 0;
        }
        if (name != null)
        {
            j1 = name.hashCode();
        } else
        {
            j1 = 0;
        }
        if (partnerCompany != null)
        {
            k1 = partnerCompany.hashCode();
        } else
        {
            k1 = 0;
        }
        if (pictureUrl != null)
        {
            l1 = pictureUrl.hashCode();
        } else
        {
            l1 = 0;
        }
        if (status != null)
        {
            i2 = status.hashCode();
        } else
        {
            i2 = 0;
        }
        if (location != null)
        {
            j2 = location.hashCode();
        } else
        {
            j2 = 0;
        }
        if (isAccessibilityTripViewEnabled != null)
        {
            k2 = isAccessibilityTripViewEnabled.hashCode();
        } else
        {
            k2 = 0;
        }
        if (isCallButtonEnabled != null)
        {
            l2 = isCallButtonEnabled.hashCode();
        }
        return (k2 + (j2 + (i2 + (l1 + (k1 + (j1 + (i1 + (l + (k + (j + i * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31 + l2;
    }

    public boolean isDisplayCompany()
    {
        return displayCompany;
    }

    public void setStatus(String s)
    {
        status = s;
    }
}
