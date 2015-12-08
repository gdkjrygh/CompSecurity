// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.data;

import com.contextlogic.wish.api.core.ApiMalformedDataException;
import com.contextlogic.wish.util.AddressUtil;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

public class WishShippingInfo
    implements Serializable
{

    private static final long serialVersionUID = 0xa815f3ff21821413L;
    private String city;
    private String countryCode;
    private String name;
    private String phoneNumber;
    private String state;
    private String streetAddressLineOne;
    private String streetAddressLineTwo;
    private String zipCode;

    public WishShippingInfo()
    {
    }

    public WishShippingInfo(JSONObject jsonobject)
        throws ApiMalformedDataException
    {
        try
        {
            if (jsonobject.has("name") && !jsonobject.isNull("name"))
            {
                name = jsonobject.getString("name");
            }
            if (jsonobject.has("zipcode") && !jsonobject.isNull("zipcode"))
            {
                zipCode = jsonobject.getString("zipcode");
            }
            if (jsonobject.has("state") && !jsonobject.isNull("state"))
            {
                state = jsonobject.getString("state");
            }
            if (jsonobject.has("country_code") && !jsonobject.isNull("country_code"))
            {
                countryCode = jsonobject.getString("country_code");
            }
            if (jsonobject.has("phone_number") && !jsonobject.isNull("phone_number"))
            {
                phoneNumber = jsonobject.getString("phone_number");
            }
            if (jsonobject.has("city") && !jsonobject.isNull("city"))
            {
                city = jsonobject.getString("city");
            }
            if (jsonobject.has("street_address1") && !jsonobject.isNull("street_address1"))
            {
                streetAddressLineOne = jsonobject.getString("street_address1");
            }
            if (jsonobject.has("street_address2") && !jsonobject.isNull("street_address2"))
            {
                streetAddressLineTwo = jsonobject.getString("street_address2");
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            throw new ApiMalformedDataException(jsonobject.getMessage());
        }
    }

    public String getCity()
    {
        return city;
    }

    public String getCountryCode()
    {
        return countryCode;
    }

    public String getFormattedString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        if (getName() != null)
        {
            stringbuilder.append(getName());
            stringbuilder.append("\n");
        }
        if (getStreetAddressLineOne() != null)
        {
            stringbuilder.append(getStreetAddressLineOne());
            stringbuilder.append("\n");
        }
        if (getStreetAddressLineTwo() != null)
        {
            stringbuilder.append(getStreetAddressLineTwo());
            stringbuilder.append("\n");
        }
        if (getCity() != null || getState() != null || getZipCode() != null)
        {
            boolean flag = false;
            if (getCity() != null)
            {
                stringbuilder.append(getCity());
                flag = true;
            }
            boolean flag1 = flag;
            if (getState() != null)
            {
                if (flag)
                {
                    stringbuilder.append(", ");
                }
                stringbuilder.append(getState());
                flag1 = true;
            }
            if (getZipCode() != null)
            {
                if (flag1)
                {
                    stringbuilder.append(", ");
                }
                stringbuilder.append(getZipCode());
            }
            stringbuilder.append("\n");
        }
        if (getCountryCode() != null)
        {
            stringbuilder.append(AddressUtil.getCountryName(getCountryCode()));
        }
        return stringbuilder.toString();
    }

    public String getName()
    {
        return name;
    }

    public String getPhoneNumber()
    {
        return phoneNumber;
    }

    public String getState()
    {
        return state;
    }

    public String getStreetAddressLineOne()
    {
        return streetAddressLineOne;
    }

    public String getStreetAddressLineTwo()
    {
        return streetAddressLineTwo;
    }

    public String getZipCode()
    {
        return zipCode;
    }

    public void setCity(String s)
    {
        city = s;
    }

    public void setCountryCode(String s)
    {
        countryCode = s;
    }

    public void setName(String s)
    {
        name = s;
    }

    public void setPhoneNumber(String s)
    {
        phoneNumber = s;
    }

    public void setState(String s)
    {
        state = s;
    }

    public void setStreetAddressLineOne(String s)
    {
        streetAddressLineOne = s;
    }

    public void setStreetAddressLineTwo(String s)
    {
        streetAddressLineTwo = s;
    }

    public void setZipCode(String s)
    {
        zipCode = s;
    }
}
