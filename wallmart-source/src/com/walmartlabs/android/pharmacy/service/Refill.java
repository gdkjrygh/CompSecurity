// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.pharmacy.service;

import android.text.TextUtils;
import java.util.Locale;
import org.apache.commons.lang3.text.WordUtils;

public class Refill
{
    public static class ShippingAddress
    {

        public String city;
        public String country;
        public String county;
        public String state;
        public String street1;
        public String street2;
        public String street3;
        public String street4;
        public String zip;

        public String getAddress()
        {
            StringBuilder stringbuilder = new StringBuilder();
            boolean flag1 = false;
            if (!TextUtils.isEmpty(street1))
            {
                stringbuilder.append(WordUtils.capitalizeFully(street1));
                flag1 = true;
            }
            boolean flag = flag1;
            if (!TextUtils.isEmpty(street2))
            {
                if (flag1)
                {
                    stringbuilder.append('\n');
                }
                stringbuilder.append(WordUtils.capitalizeFully(street2));
                flag = true;
            }
            flag1 = flag;
            if (!TextUtils.isEmpty(street3))
            {
                if (flag)
                {
                    stringbuilder.append('\n');
                }
                stringbuilder.append(WordUtils.capitalizeFully(street3));
                flag1 = true;
            }
            if (!TextUtils.isEmpty(street4))
            {
                if (flag1)
                {
                    stringbuilder.append('\n');
                }
                stringbuilder.append(WordUtils.capitalizeFully(street4));
            }
            if (stringbuilder.length() > 0)
            {
                stringbuilder.append('\n');
            }
            flag = false;
            if (!TextUtils.isEmpty(city))
            {
                stringbuilder.append(WordUtils.capitalizeFully(city));
                flag = true;
            }
            flag1 = flag;
            if (!TextUtils.isEmpty(state))
            {
                if (flag)
                {
                    stringbuilder.append(", ");
                }
                stringbuilder.append(state.toUpperCase(Locale.US));
                flag1 = true;
            }
            if (!TextUtils.isEmpty(zip))
            {
                if (flag1)
                {
                    stringbuilder.append(' ');
                }
                stringbuilder.append(zip);
            }
            if (!TextUtils.isEmpty(country))
            {
                if (stringbuilder.length() > 0 && stringbuilder.charAt(stringbuilder.length() - 1) != '\n')
                {
                    stringbuilder.append('\n');
                }
                stringbuilder.append(country);
            }
            return stringbuilder.toString();
        }

        public ShippingAddress()
        {
        }
    }


    public int deliveryMethod;
    public String dispensedDrugName;
    public float fillCost;
    public String fillDate;
    public String fillStatus;
    public int fillStoreNumber;
    public String prescriberName;
    public int rxNumber;
    public ShippingAddress shippingAddress;
    public int shippingCarrierNumber;
    public int shippingMethod;
    public String shippingName;

    public Refill()
    {
    }
}
