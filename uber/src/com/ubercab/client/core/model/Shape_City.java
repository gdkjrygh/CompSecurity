// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;

import java.util.List;

// Referenced classes of package com.ubercab.client.core.model:
//            City

public final class Shape_City extends City
{

    private String cityId;
    private String cityName;
    private String countryIso2;
    private String currencyCode;
    private String defaultVehicleViewId;
    private String fareSplitFeeString;
    private List messages;
    private List vehicleViewsOrder;

    Shape_City()
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
            obj = (City)obj;
            if (((City) (obj)).getCityName() == null ? getCityName() != null : !((City) (obj)).getCityName().equals(getCityName()))
            {
                return false;
            }
            if (((City) (obj)).getCurrencyCode() == null ? getCurrencyCode() != null : !((City) (obj)).getCurrencyCode().equals(getCurrencyCode()))
            {
                return false;
            }
            if (((City) (obj)).getCountryIso2() == null ? getCountryIso2() != null : !((City) (obj)).getCountryIso2().equals(getCountryIso2()))
            {
                return false;
            }
            if (((City) (obj)).getDefaultVehicleViewId() == null ? getDefaultVehicleViewId() != null : !((City) (obj)).getDefaultVehicleViewId().equals(getDefaultVehicleViewId()))
            {
                return false;
            }
            if (((City) (obj)).getMessages() == null ? getMessages() != null : !((City) (obj)).getMessages().equals(getMessages()))
            {
                return false;
            }
            if (((City) (obj)).getVehicleViewsOrder() == null ? getVehicleViewsOrder() != null : !((City) (obj)).getVehicleViewsOrder().equals(getVehicleViewsOrder()))
            {
                return false;
            }
            if (((City) (obj)).getFareSplitFeeString() == null ? getFareSplitFeeString() != null : !((City) (obj)).getFareSplitFeeString().equals(getFareSplitFeeString()))
            {
                return false;
            }
            if (((City) (obj)).getCityId() == null ? getCityId() != null : !((City) (obj)).getCityId().equals(getCityId()))
            {
                return false;
            }
        }
        return true;
    }

    public final String getCityId()
    {
        return cityId;
    }

    public final String getCityName()
    {
        return cityName;
    }

    public final String getCountryIso2()
    {
        return countryIso2;
    }

    public final String getCurrencyCode()
    {
        return currencyCode;
    }

    public final String getDefaultVehicleViewId()
    {
        return defaultVehicleViewId;
    }

    public final String getFareSplitFeeString()
    {
        return fareSplitFeeString;
    }

    public final List getMessages()
    {
        return messages;
    }

    public final List getVehicleViewsOrder()
    {
        return vehicleViewsOrder;
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
        if (cityName == null)
        {
            i = 0;
        } else
        {
            i = cityName.hashCode();
        }
        if (currencyCode == null)
        {
            j = 0;
        } else
        {
            j = currencyCode.hashCode();
        }
        if (countryIso2 == null)
        {
            k = 0;
        } else
        {
            k = countryIso2.hashCode();
        }
        if (defaultVehicleViewId == null)
        {
            l = 0;
        } else
        {
            l = defaultVehicleViewId.hashCode();
        }
        if (messages == null)
        {
            i1 = 0;
        } else
        {
            i1 = messages.hashCode();
        }
        if (vehicleViewsOrder == null)
        {
            j1 = 0;
        } else
        {
            j1 = vehicleViewsOrder.hashCode();
        }
        if (fareSplitFeeString == null)
        {
            k1 = 0;
        } else
        {
            k1 = fareSplitFeeString.hashCode();
        }
        if (cityId != null)
        {
            l1 = cityId.hashCode();
        }
        return (k1 ^ (j1 ^ (i1 ^ (l ^ (k ^ (j ^ (i ^ 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243 ^ l1;
    }

    public final City setCityId(String s)
    {
        cityId = s;
        return this;
    }

    final City setCityName(String s)
    {
        cityName = s;
        return this;
    }

    final City setCountryIso2(String s)
    {
        countryIso2 = s;
        return this;
    }

    final City setCurrencyCode(String s)
    {
        currencyCode = s;
        return this;
    }

    final City setDefaultVehicleViewId(String s)
    {
        defaultVehicleViewId = s;
        return this;
    }

    public final City setFareSplitFeeString(String s)
    {
        fareSplitFeeString = s;
        return this;
    }

    public final City setMessages(List list)
    {
        messages = list;
        return this;
    }

    final City setVehicleViewsOrder(List list)
    {
        vehicleViewsOrder = list;
        return this;
    }

    public final String toString()
    {
        return (new StringBuilder("com.ubercab.client.core.model.City{cityName=")).append(cityName).append(", currencyCode=").append(currencyCode).append(", countryIso2=").append(countryIso2).append(", defaultVehicleViewId=").append(defaultVehicleViewId).append(", messages=").append(messages).append(", vehicleViewsOrder=").append(vehicleViewsOrder).append(", fareSplitFeeString=").append(fareSplitFeeString).append(", cityId=").append(cityId).append("}").toString();
    }
}
