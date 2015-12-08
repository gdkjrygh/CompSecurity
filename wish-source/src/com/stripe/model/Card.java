// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.stripe.model;


// Referenced classes of package com.stripe.model:
//            StripeObject

public class Card extends StripeObject
{

    String addressCity;
    String addressCountry;
    String addressLine1;
    String addressLine1Check;
    String addressLine2;
    String addressState;
    String addressZip;
    String addressZipCheck;
    String country;
    String cvcCheck;
    Integer expMonth;
    Integer expYear;
    String fingerprint;
    String last4;
    String name;
    String type;

    public Card()
    {
    }

    public String getAddressCity()
    {
        return addressCity;
    }

    public String getAddressCountry()
    {
        return addressCountry;
    }

    public String getAddressLine1()
    {
        return addressLine1;
    }

    public String getAddressLine1Check()
    {
        return addressLine1Check;
    }

    public String getAddressLine2()
    {
        return addressLine2;
    }

    public String getAddressState()
    {
        return addressState;
    }

    public String getAddressZip()
    {
        return addressZip;
    }

    public String getAddressZipCheck()
    {
        return addressZipCheck;
    }

    public String getCountry()
    {
        return country;
    }

    public String getCvcCheck()
    {
        return cvcCheck;
    }

    public Integer getExpMonth()
    {
        return expMonth;
    }

    public Integer getExpYear()
    {
        return expYear;
    }

    public String getFingerprint()
    {
        return fingerprint;
    }

    public String getLast4()
    {
        return last4;
    }

    public String getName()
    {
        return name;
    }

    public String getType()
    {
        return type;
    }

    public void setAddressCity(String s)
    {
        addressCity = s;
    }

    public void setAddressCountry(String s)
    {
        addressCountry = s;
    }

    public void setAddressLine1(String s)
    {
        addressLine1 = s;
    }

    public void setAddressLine1Check(String s)
    {
        addressLine1Check = s;
    }

    public void setAddressLine2(String s)
    {
        addressLine2 = s;
    }

    public void setAddressState(String s)
    {
        addressState = s;
    }

    public void setAddressZip(String s)
    {
        addressZip = s;
    }

    public void setAddressZipCheck(String s)
    {
        addressZipCheck = s;
    }

    public void setCountry(String s)
    {
        country = s;
    }

    public void setCvcCheck(String s)
    {
        cvcCheck = s;
    }

    public void setExpMonth(Integer integer)
    {
        expMonth = integer;
    }

    public void setExpYear(Integer integer)
    {
        expYear = integer;
    }

    public void setFingerprint(String s)
    {
        fingerprint = s;
    }

    public void setLast4(String s)
    {
        last4 = s;
    }

    public void setName(String s)
    {
        name = s;
    }

    public void setType(String s)
    {
        type = s;
    }
}
