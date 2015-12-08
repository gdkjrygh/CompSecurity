// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.util;

import android.text.TextUtils;
import com.walmartlabs.utils.WLog;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PricePerUnitUtils
{

    private static final String CURRENCY_SYMBOL_CENT = "\242";
    private static final int MIN_LATE_LINEBREAK_UOM_LENGTH = 6;
    private static final String PPUM_CENTS = "cents";
    private static final String PPUM_DOLLARS = "dollars";
    private static final String TAG = com/walmart/android/util/PricePerUnitUtils.getSimpleName();
    private static final Pattern sPriceVariesByStorePattern = Pattern.compile("^Price varies by store.*$", 2);

    public PricePerUnitUtils()
    {
    }

    private static String asCents(String s)
    {
        return String.format("%s%s", new Object[] {
            s, "\242"
        });
    }

    private static String asDollars(String s)
    {
        return String.format("$%s", new Object[] {
            s
        });
    }

    public static String getPricePerUnitDisplayString(String s, String s1, String s2)
    {
        if (!TextUtils.isEmpty(s) && !TextUtils.isEmpty(s1) && !TextUtils.isEmpty(s2))
        {
            if (s1.equalsIgnoreCase("dollars"))
            {
                return String.format("$%s / %s", new Object[] {
                    s, s2
                });
            }
            if (s1.equalsIgnoreCase("cents"))
            {
                return String.format("%s%s / %s", new Object[] {
                    s, "\242", s2
                });
            }
            WLog.e(TAG, (new StringBuilder()).append("Unknown PPU modifier: ").append(s1).toString());
        }
        return "";
    }

    public static String getPricePerUnitRangeDisplayString(String s, String s1, String s2, String s3, String s4, boolean flag)
    {
        if (!TextUtils.isEmpty(s) && !TextUtils.isEmpty(s1) && !TextUtils.isEmpty(s2) && !TextUtils.isEmpty(s3) && !TextUtils.isEmpty(s4) && validCurrencyModifiers(new String[] {
    s1, s3
}))
        {
            if (s1.equalsIgnoreCase("dollars"))
            {
                s = asDollars(s);
            } else
            {
                s = asCents(s);
            }
            if (s3.equalsIgnoreCase("dollars"))
            {
                s1 = asDollars(s2);
            } else
            {
                s1 = asCents(s2);
            }
            if (flag)
            {
                if (s4.length() > 6)
                {
                    return String.format("%s -%s\n/ %s", new Object[] {
                        s, s1, s4
                    });
                } else
                {
                    return String.format("%s -\n%s / %s", new Object[] {
                        s, s1, s4
                    });
                }
            } else
            {
                return String.format("%s - %s / %s", new Object[] {
                    s, s1, s4
                });
            }
        } else
        {
            return "";
        }
    }

    public static boolean shouldDisplayShelfPPU(com.walmart.android.data.InStoreSearchResult.Result result)
    {
        if (result == null)
        {
            return false;
        } else
        {
            return result.hasPricePerUnit();
        }
    }

    public static boolean shouldDisplayShelfPPU(com.walmart.android.data.StoreQueryResult.Item item)
    {
        boolean flag1 = true;
        if (item == null)
        {
            return false;
        }
        String s = item.getPrice();
        boolean flag;
        if (s != null && sPriceVariesByStorePattern.matcher(s).matches())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!item.hasPricePerUnit() || item.isSubMarketPrice() || flag)
        {
            flag1 = false;
        }
        return flag1;
    }

    private static transient boolean validCurrencyModifiers(String as[])
    {
        int j = as.length;
        for (int i = 0; i < j; i++)
        {
            String s = as[i];
            if (!"dollars".equalsIgnoreCase(s) && !"cents".equalsIgnoreCase(s))
            {
                return false;
            }
        }

        return true;
    }

}
