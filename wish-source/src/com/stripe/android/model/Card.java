// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.stripe.android.model;

import com.stripe.android.util.DateUtils;
import com.stripe.android.util.TextUtils;
import com.stripe.model.StripeObject;

public class Card extends StripeObject
{

    String addressCity;
    String addressCountry;
    String addressLine1;
    String addressLine2;
    String addressState;
    String addressZip;
    String country;
    String cvc;
    Integer expMonth;
    Integer expYear;
    String fingerprint;
    String last4;
    String name;
    String number;
    String type;

    public Card(String s, Integer integer, Integer integer1, String s1)
    {
        this(s, integer, integer1, s1, null, null, null, null, null, null, null, null, null, null, null);
        type = getType();
    }

    public Card(String s, Integer integer, Integer integer1, String s1, String s2, String s3, String s4, 
            String s5, String s6, String s7, String s8)
    {
        this(s, integer, integer1, s1, s2, s3, s4, s5, s6, s7, s8, null, null, null, null);
    }

    public Card(String s, Integer integer, Integer integer1, String s1, String s2, String s3, String s4, 
            String s5, String s6, String s7, String s8, String s9, String s10, String s11, 
            String s12)
    {
        number = TextUtils.nullIfBlank(normalizeCardNumber(s));
        expMonth = integer;
        expYear = integer1;
        cvc = TextUtils.nullIfBlank(s1);
        name = TextUtils.nullIfBlank(s2);
        addressLine1 = TextUtils.nullIfBlank(s3);
        addressLine2 = TextUtils.nullIfBlank(s4);
        addressCity = TextUtils.nullIfBlank(s5);
        addressState = TextUtils.nullIfBlank(s6);
        addressZip = TextUtils.nullIfBlank(s7);
        addressCountry = TextUtils.nullIfBlank(s8);
        last4 = TextUtils.nullIfBlank(s9);
        type = TextUtils.nullIfBlank(s10);
        fingerprint = TextUtils.nullIfBlank(s11);
        country = TextUtils.nullIfBlank(s12);
    }

    private boolean isValidLuhnNumber(String s)
    {
        boolean flag1 = true;
        boolean flag = true;
        int j = 0;
        int k = s.length() - 1;
        while (k >= 0) 
        {
            char c = s.charAt(k);
            if (!Character.isDigit(c))
            {
                return false;
            }
            int l = Integer.parseInt((new StringBuilder()).append("").append(c).toString());
            int i;
            if (!flag)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            i = l;
            if (flag)
            {
                i = l * 2;
            }
            l = i;
            if (i > 9)
            {
                l = i - 9;
            }
            j += l;
            k--;
        }
        if (j % 10 != 0)
        {
            flag1 = false;
        }
        return flag1;
    }

    private String normalizeCardNumber(String s)
    {
        if (s == null)
        {
            return null;
        } else
        {
            return s.trim().replaceAll("\\s+|-", "");
        }
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

    public String getCVC()
    {
        return cvc;
    }

    public String getCountry()
    {
        return country;
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
        if (!TextUtils.isBlank(last4))
        {
            return last4;
        }
        if (number != null && number.length() > 4)
        {
            return number.substring(number.length() - 4, number.length());
        } else
        {
            return null;
        }
    }

    public String getName()
    {
        return name;
    }

    public String getNumber()
    {
        return number;
    }

    public String getType()
    {
        if (TextUtils.isBlank(type) && !TextUtils.isBlank(number))
        {
            if (TextUtils.hasAnyPrefix(number, new String[] {
    "34", "37"
}))
            {
                return "American Express";
            }
            if (TextUtils.hasAnyPrefix(number, new String[] {
    "60", "62", "64", "65"
}))
            {
                return "Discover";
            }
            if (TextUtils.hasAnyPrefix(number, new String[] {
    "35"
}))
            {
                return "JCB";
            }
            if (TextUtils.hasAnyPrefix(number, new String[] {
    "30", "36", "38", "39"
}))
            {
                return "Diners Club";
            }
            if (TextUtils.hasAnyPrefix(number, new String[] {
    "4"
}))
            {
                return "Visa";
            }
            if (TextUtils.hasAnyPrefix(number, new String[] {
    "5"
}))
            {
                return "MasterCard";
            } else
            {
                return "Unknown";
            }
        } else
        {
            return type;
        }
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

    public void setCVC(String s)
    {
        cvc = s;
    }

    public void setExpMonth(Integer integer)
    {
        expMonth = integer;
    }

    public void setExpYear(Integer integer)
    {
        expYear = integer;
    }

    public void setName(String s)
    {
        name = s;
    }

    public void setNumber(String s)
    {
        number = s;
    }

    public boolean validateCVC()
    {
        if (!TextUtils.isBlank(cvc))
        {
            String s = cvc.trim();
            boolean flag;
            if (type == null && s.length() >= 3 && s.length() <= 4 || "American Express".equals(type) && s.length() == 4 || !"American Express".equals(type) && s.length() == 3)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (TextUtils.isWholePositiveNumber(s) && flag)
            {
                return true;
            }
        }
        return false;
    }

    public boolean validateCard()
    {
        if (cvc != null) goto _L2; else goto _L1
_L1:
        if (!validateNumber() || !validateExpiryDate()) goto _L4; else goto _L3
_L3:
        return true;
_L4:
        return false;
_L2:
        if (!validateNumber() || !validateExpiryDate() || !validateCVC())
        {
            return false;
        }
        if (true) goto _L3; else goto _L5
_L5:
    }

    public boolean validateExpMonth()
    {
        boolean flag = true;
        if (expMonth == null)
        {
            return false;
        }
        if (expMonth.intValue() < 1 || expMonth.intValue() > 12)
        {
            flag = false;
        }
        return flag;
    }

    public boolean validateExpYear()
    {
        while (expYear == null || DateUtils.hasYearPassed(expYear.intValue())) 
        {
            return false;
        }
        return true;
    }

    public boolean validateExpiryDate()
    {
        while (!validateExpMonth() || !validateExpYear() || DateUtils.hasMonthPassed(expYear.intValue(), expMonth.intValue())) 
        {
            return false;
        }
        return true;
    }

    public boolean validateNumber()
    {
        String s;
        if (!TextUtils.isBlank(number))
        {
            if (!TextUtils.isBlank(s = number.trim().replaceAll("\\s+|-", "")) && TextUtils.isWholePositiveNumber(s) && isValidLuhnNumber(s) && ("American Express".equals(type) || s.length() == 16) && (!"American Express".equals(type) || s.length() == 15))
            {
                return true;
            }
        }
        return false;
    }
}
