// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.components.text.standalonecreditcard;


public class CreditCardContainer
{

    private String cardNumber;
    private String expiryDate;
    private String securityCode;

    public CreditCardContainer(String s, int i, int j, String s1)
    {
        setCardNumber(s);
        setExpiryDate((new StringBuilder()).append(getTextWithLeadingZero(i)).append("/").append(getTextWithLeadingZero(j - 2000)).toString());
        setSecurityCode(s1);
    }

    public CreditCardContainer(String s, String s1, String s2)
    {
        setCardNumber(s);
        setExpiryDate(s1);
        setSecurityCode(s2);
    }

    public static final String getFormattedExpiryDate(int i, int j)
    {
        return (new StringBuilder()).append(getTextWithLeadingZero(i)).append("/").append(j).toString();
    }

    private static String getTextWithLeadingZero(int i)
    {
        if (i < 9)
        {
            return String.format("0%d", new Object[] {
                Integer.valueOf(i)
            });
        } else
        {
            return Integer.toString(i);
        }
    }

    public String getCardNumber()
    {
        return cardNumber;
    }

    public String getExpiryDate()
    {
        return expiryDate;
    }

    public int getExpiryMonth()
    {
        return Integer.valueOf(expiryDate.split("/")[0]).intValue();
    }

    public int getExpiryYear()
    {
        return Integer.valueOf(expiryDate.split("/")[1]).intValue() + 2000;
    }

    public String getSecurityCode()
    {
        return securityCode;
    }

    public void setCardNumber(String s)
    {
        cardNumber = s;
    }

    public void setExpiryDate(String s)
    {
        expiryDate = s;
    }

    public void setSecurityCode(String s)
    {
        securityCode = s;
    }
}
