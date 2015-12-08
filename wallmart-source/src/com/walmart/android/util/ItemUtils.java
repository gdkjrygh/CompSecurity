// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.util;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.StrikethroughSpan;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public class ItemUtils
{

    private static final String DOLLAR_SIGN = "$";

    public ItemUtils()
    {
    }

    public static CharSequence applyListPriceStrikethrough(String s)
    {
        if (isListPriceString(s))
        {
            SpannableString spannablestring = new SpannableString(s);
            StrikethroughSpan strikethroughspan = new StrikethroughSpan();
            int i = s.indexOf("$");
            if (i >= 0)
            {
                spannablestring.setSpan(strikethroughspan, i, spannablestring.length(), 0);
                return spannablestring;
            }
        }
        return s;
    }

    public static String asFromPriceString(String s)
    {
        return withPricePrefix("From", s);
    }

    public static CharSequence asListPriceString(String s)
    {
        return applyListPriceStrikethrough(withPricePrefix("List Price:", s));
    }

    public static String asWasPriceString(String s)
    {
        return withPricePrefix("Was:", s);
    }

    public static String asYouSavePriceString(String s)
    {
        return withPricePrefix("You Save:", s);
    }

    private static boolean isListPriceString(String s)
    {
label0:
        {
            if (TextUtils.isEmpty(s))
            {
                break label0;
            }
            Iterator iterator = listPricePrefixes().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break label0;
                }
            } while (!s.startsWith((String)iterator.next()));
            return true;
        }
        return false;
    }

    public static boolean isValidSavingsPrice(com.walmart.android.service.item.ItemResponse.BuyingOption.Price price)
    {
        return price != null && !TextUtils.isEmpty(price.displayPrice) && !"$0.00".equals(price.displayPrice);
    }

    private static List listPricePrefixes()
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add("List Price");
        arraylist.add("List price");
        return arraylist;
    }

    private static String withPricePrefix(String s, String s1)
    {
        return String.format(Locale.US, (new StringBuilder()).append(s).append(" %s").toString(), new Object[] {
            s1
        });
    }
}
