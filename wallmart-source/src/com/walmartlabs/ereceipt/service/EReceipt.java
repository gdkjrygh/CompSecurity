// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.ereceipt.service;

import android.text.Html;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import java.util.Locale;
import org.apache.commons.lang3.text.WordUtils;

public class EReceipt
    implements Comparable
{
    public static class Item
    {

        private static final SpannableString EMPTY_STRING = new SpannableString("");
        public boolean coupon;
        public String lineNumber;
        public String name;
        public String nameOnReceipt;
        public String normalizedUpc;
        public int originalOrder;
        public int price;
        public String productId;
        public String productImageUrl;
        public float quantity;
        public String rawText;
        public boolean storeItemLookup;
        public int unitPrice;
        public int unitQuantity;
        public String unitType;
        public String upc;
        public String verticalPixel;

        public Spanned getDisplayName()
        {
            String s;
            Object obj;
            if (TextUtils.isEmpty(name) || name.equals(nameOnReceipt))
            {
                s = nameOnReceipt;
            } else
            if (name.matches("^[^a-z]*$"))
            {
                s = WordUtils.capitalizeFully(name);
            } else
            {
                s = name;
            }
            obj = EMPTY_STRING;
            if (!TextUtils.isEmpty(s))
            {
                obj = Html.fromHtml(s);
            }
            return ((Spanned) (obj));
        }

        public int getPrice()
        {
            return price;
        }

        public float getPriceInDollar()
        {
            return (float)getPrice() * 0.01F;
        }

        public int getUnitPrice()
        {
            return unitPrice;
        }

        public float getUnitPriceInDollar()
        {
            return (float)getUnitPrice() * 0.01F;
        }

        public boolean hasProductId()
        {
            return !TextUtils.isEmpty(productId);
        }

        public boolean hasProductImageUrl()
        {
            return !TextUtils.isEmpty(productImageUrl);
        }


        public Item()
        {
        }
    }

    public static class Store
    {

        public String address;
        public String addressLine1;
        public String addressLine2;
        public String city;
        public String id;
        public String phone;

        public Store()
        {
        }
    }

    public static class Tax
    {

        public int amount;
        public String level;
        public String rateStr;

        public Tax()
        {
        }
    }

    public static class Tender
    {

        public int amount;
        public String name;

        public Tender()
        {
        }
    }


    public static final float CENT_TO_DOLLAR = 0.01F;
    public static final long TO_MILLISECONDS = 1000L;
    public int changeDue;
    public String customerId;
    public int customerReceiptId;
    public String datetimePrinted;
    public boolean deleted;
    public int discountGiven;
    public boolean hasImage;
    public String image;
    public int itemsSold;
    public String localDate;
    public long rowId;
    public Store store;
    public int subtotal;
    public String tcNumber;
    public long timestamp;
    public int total;
    public String uuid;
    public String waitingOnMoreInfo;

    public EReceipt()
    {
    }

    public int compareTo(EReceipt ereceipt)
    {
        if (timestamp > ereceipt.timestamp)
        {
            return -1;
        }
        return timestamp >= ereceipt.timestamp ? 0 : 1;
    }

    public volatile int compareTo(Object obj)
    {
        return compareTo((EReceipt)obj);
    }

    public String getFormattedAddressLine()
    {
        if (store != null)
        {
            return WordUtils.capitalizeFully(store.address);
        } else
        {
            return null;
        }
    }

    public String getFormattedAddressLine1()
    {
        if (store != null)
        {
            return WordUtils.capitalizeFully(store.addressLine1);
        } else
        {
            return null;
        }
    }

    public String getFormattedAddressLine2()
    {
        if (store != null)
        {
            if (store.addressLine2 != null)
            {
                String as[] = store.addressLine2.split(",");
                if (as != null && as.length == 2)
                {
                    return (new StringBuilder()).append(WordUtils.capitalizeFully(as[0])).append(",").append(as[1]).toString();
                }
            }
            return WordUtils.capitalizeFully(store.addressLine2);
        } else
        {
            return null;
        }
    }

    public float getPriceInDollar()
    {
        return (float)total * 0.01F;
    }

    public long getTimeInMs()
    {
        return timestamp * 1000L;
    }

    public String getTotalForAnalytics()
    {
        int i = total / 100;
        int j = total;
        return String.format(Locale.US, "%d.%02d", new Object[] {
            Integer.valueOf(i), Integer.valueOf(j % 100)
        });
    }

    public boolean hasImage()
    {
        return hasImage;
    }
}
