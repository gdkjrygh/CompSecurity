// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.util;

import android.text.TextUtils;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WalmartPrice
{
    public static class Price
    {

        public int decimalPart;
        public int integerPart;

        public boolean equals(Object obj)
        {
            boolean flag1 = false;
            boolean flag = flag1;
            if (obj != null)
            {
                flag = flag1;
                if (obj instanceof Price)
                {
                    obj = (Price)obj;
                    flag = flag1;
                    if (integerPart == ((Price) (obj)).integerPart)
                    {
                        flag = flag1;
                        if (decimalPart == ((Price) (obj)).decimalPart)
                        {
                            flag = true;
                        }
                    }
                }
            }
            return flag;
        }

        public boolean hasValue()
        {
            return integerPart != 0 || decimalPart != 0;
        }

        public int hashCode()
        {
            return toString().hashCode();
        }

        public String toString()
        {
            return String.format(Locale.US, "$%,d.%02d", new Object[] {
                Integer.valueOf(integerPart), Integer.valueOf(decimalPart)
            });
        }

        public Price()
        {
        }

        public Price(int i, int j)
        {
            integerPart = i;
            decimalPart = j;
        }
    }


    private static String sPrefixRegEx;
    private static Pattern sPricePattern;
    private static Pattern sPriceRangePattern;
    private static String sPriceRegEx;
    private boolean mIsRange;
    private boolean mIsValid;
    private String mPrefix;
    private Price mPrice;
    private Price mUpperBound;

    private WalmartPrice()
    {
    }

    private static Price createPrice(String s, String s1)
    {
        Price price;
        try
        {
            price = new Price();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_97;
        }
        price.integerPart = Integer.parseInt(s.replaceAll(",", ""));
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_38;
        }
        if (s1.length() != 0)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        price.decimalPart = 0;
        return price;
        if (s1.length() != 1)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        price.decimalPart = Integer.parseInt(s1) * 10;
        return price;
        if (s1.length() != 2)
        {
            break MISSING_BLOCK_LABEL_84;
        }
        price.decimalPart = Integer.parseInt(s1);
        return price;
        price.decimalPart = Integer.parseInt(s1.substring(0, 2));
        return price;
    }

    public static WalmartPrice fromString(String s)
    {
        boolean flag1 = false;
        boolean flag = true;
        WalmartPrice walmartprice = new WalmartPrice();
        if (s != null)
        {
            Matcher matcher = sPriceRangePattern.matcher(s);
            if (matcher.matches())
            {
                walmartprice.mPrefix = matcher.group(1).trim();
                walmartprice.mPrice = createPrice(matcher.group(2), matcher.group(3));
                walmartprice.mUpperBound = createPrice(matcher.group(4), matcher.group(5));
                flag = flag1;
                if (walmartprice.mPrice != null)
                {
                    flag = flag1;
                    if (walmartprice.mPrice.hasValue())
                    {
                        flag = flag1;
                        if (walmartprice.mUpperBound != null)
                        {
                            flag = flag1;
                            if (walmartprice.mUpperBound.hasValue())
                            {
                                flag = true;
                            }
                        }
                    }
                }
                walmartprice.mIsValid = flag;
                walmartprice.mIsRange = true;
            } else
            {
                s = sPricePattern.matcher(s);
                if (s.matches())
                {
                    walmartprice.mPrefix = s.group(1).trim();
                    walmartprice.mPrice = createPrice(s.group(2), s.group(3));
                    if (walmartprice.mPrice == null || !walmartprice.mPrice.hasValue())
                    {
                        flag = false;
                    }
                    walmartprice.mIsValid = flag;
                    return walmartprice;
                }
            }
        }
        return walmartprice;
    }

    public static void test()
    {
        testSinglePrice("$19", new Price(19, 0), "$19.00");
        testSinglePrice("19", new Price(19, 0), "$19.00");
        testSinglePrice("$19.9", new Price(19, 90), "$19.90");
        testSinglePrice("19.9", new Price(19, 90), "$19.90");
        testSinglePrice("$19.99", new Price(19, 99), "$19.99");
        testSinglePrice("19.99", new Price(19, 99), "$19.99");
        testSinglePrice("$19.987", new Price(19, 98), "$19.98");
        testSinglePrice("19.987", new Price(19, 98), "$19.98");
        testSinglePrice("$19.9876", new Price(19, 98), "$19.98");
        testSinglePrice("19.9876", new Price(19, 98), "$19.98");
        testSinglePrice("$1000000", new Price(0xf4240, 0), "$1,000,000.00");
        testSinglePrice("1000000", new Price(0xf4240, 0), "$1,000,000.00");
        testSinglePrice("$1000.9", new Price(1000, 90), "$1,000.90");
        testSinglePrice("1000.9", new Price(1000, 90), "$1,000.90");
        testSinglePrice("$10000.98", new Price(10000, 98), "$10,000.98");
        testSinglePrice("10000.98", new Price(10000, 98), "$10,000.98");
        testSinglePrice("$100000.987", new Price(0x186a0, 98), "$100,000.98");
        testSinglePrice("100000.987", new Price(0x186a0, 98), "$100,000.98");
        testSinglePrice("$1000000.9876", new Price(0xf4240, 98), "$1,000,000.98");
        testSinglePrice("1000000.9876", new Price(0xf4240, 98), "$1,000,000.98");
        testPriceRange("$9.90-$100.50", new Price(9, 90), new Price(100, 50), "$9.90 - $100.50");
        testPriceRange("9.90-100.50", new Price(9, 90), new Price(100, 50), "$9.90 - $100.50");
        testPriceRange("$9.90-100.50", new Price(9, 90), new Price(100, 50), "$9.90 - $100.50");
        testPriceRange("9.90-$100.50", new Price(9, 90), new Price(100, 50), "$9.90 - $100.50");
        testPriceRange("  $9.90  -  $100.50  ", new Price(9, 90), new Price(100, 50), "$9.90 - $100.50");
        testPriceRange("  9.90  -  100.50  ", new Price(9, 90), new Price(100, 50), "$9.90 - $100.50");
        testPriceRange("  9.9  -  100.50  ", new Price(9, 90), new Price(100, 50), "$9.90 - $100.50");
        testPriceRange("  $9.9  -  100.50  ", new Price(9, 90), new Price(100, 50), "$9.90 - $100.50");
        testPriceRange("  9.9099  -  100.50  ", new Price(9, 90), new Price(100, 50), "$9.90 - $100.50");
        testPriceRange("  $9.9099  -  100.50  ", new Price(9, 90), new Price(100, 50), "$9.90 - $100.50");
        testPriceRange("  9  -  100.50  ", new Price(9, 0), new Price(100, 50), "$9.00 - $100.50");
        testPriceRange("  $9  -  100.50  ", new Price(9, 0), new Price(100, 50), "$9.00 - $100.50");
        testPriceRange("  $9.90  -  $100.5  ", new Price(9, 90), new Price(100, 50), "$9.90 - $100.50");
        testPriceRange("  9.90  -  100.5  ", new Price(9, 90), new Price(100, 50), "$9.90 - $100.50");
        testPriceRange("  9.9  -  $100.5055  ", new Price(9, 90), new Price(100, 50), "$9.90 - $100.50");
        testPriceRange("  $9.9  -  100.505  ", new Price(9, 90), new Price(100, 50), "$9.90 - $100.50");
        testPriceRange("  9.9099  -  100.  ", new Price(9, 90), new Price(100, 0), "$9.90 - $100.00");
        testPriceRange("  $9.9099  -  $100.  ", new Price(9, 90), new Price(100, 0), "$9.90 - $100.00");
        testPriceRange("  9.90  -  100  ", new Price(9, 90), new Price(100, 0), "$9.90 - $100.00");
        testPriceRange("  $9.90  -  $100  ", new Price(9, 90), new Price(100, 0), "$9.90 - $100.00");
        testPriceRange("$9.90-$1000.50", new Price(9, 90), new Price(1000, 50), "$9.90 - $1,000.50");
        testPriceRange("$9000.90-$10000.50", new Price(9000, 90), new Price(10000, 50), "$9,000.90 - $10,000.50");
        testPriceRange("$9000.9000  -  $10000.50000", new Price(9000, 90), new Price(10000, 50), "$9,000.90 - $10,000.50");
        testPriceRange("9000.9000  -  10000.50000", new Price(9000, 90), new Price(10000, 50), "$9,000.90 - $10,000.50");
        testPriceRange("90000.9000  -  100000.50000", new Price(0x15f90, 90), new Price(0x186a0, 50), "$90,000.90 - $100,000.50");
        testPriceRange("900000.9000  -  1000000.50000", new Price(0xdbba0, 90), new Price(0xf4240, 50), "$900,000.90 - $1,000,000.50");
        testFrom("From $19", new Price(19, 0), "From $19.00");
        testFrom("From 19", new Price(19, 0), "From $19.00");
        testFrom("From $19.99", new Price(19, 99), "From $19.99");
        testFrom(" From $19.99", new Price(19, 99), "From $19.99");
        testFrom(" From   $19.99", new Price(19, 99), "From $19.99");
        testFrom("  From   $19.99  ", new Price(19, 99), "From $19.99");
        testFrom(" From 19.99", new Price(19, 99), "From $19.99");
        testFrom(" From   19.99", new Price(19, 99), "From $19.99");
        testFrom("  From   19.99  ", new Price(19, 99), "From $19.99");
    }

    private static void testFrom(String s, Price price, String s1)
    {
        WalmartPrice walmartprice = fromString(s);
        if (walmartprice.isValid() && walmartprice.hasPrefix() && !walmartprice.isRange())
        {
            if (!price.equals(walmartprice.getPrice()) || !s1.equals(walmartprice.toString()))
            {
                throw new RuntimeException(String.format("Failed with %s: price=%s, prefix=%s, str=%s", new Object[] {
                    s, walmartprice.getPrice(), walmartprice.getPrefix(), walmartprice
                }));
            } else
            {
                return;
            }
        } else
        {
            throw new RuntimeException(String.format("Failed with %s: valid=%b, range=%b, hasPrefix=%b", new Object[] {
                s, Boolean.valueOf(walmartprice.isValid()), Boolean.valueOf(walmartprice.isRange()), Boolean.valueOf(walmartprice.hasPrefix())
            }));
        }
    }

    private static void testPriceRange(String s, Price price, Price price1, String s1)
    {
        WalmartPrice walmartprice = fromString(s);
        if (walmartprice.isValid() && walmartprice.isRange() && !walmartprice.hasPrefix())
        {
            if (!price.equals(walmartprice.getLowerBound()) || !price1.equals(walmartprice.getUpperBound()) || !s1.equals(walmartprice.toString()))
            {
                throw new RuntimeException(String.format("Failed with %s: lower=%s, upper=%s, str=%s", new Object[] {
                    s, walmartprice.getLowerBound(), walmartprice.getUpperBound(), walmartprice
                }));
            } else
            {
                return;
            }
        } else
        {
            throw new RuntimeException(String.format("Failed with %s: valid=%b, range=%b, hasPrefix=%b", new Object[] {
                s, Boolean.valueOf(walmartprice.isValid()), Boolean.valueOf(walmartprice.isRange()), Boolean.valueOf(walmartprice.hasPrefix())
            }));
        }
    }

    private static void testSinglePrice(String s, Price price, String s1)
    {
        WalmartPrice walmartprice = fromString(s);
        if (walmartprice.isValid() && !walmartprice.isRange() && !walmartprice.hasPrefix())
        {
            if (!price.equals(walmartprice.getPrice()) || !s1.equals(walmartprice.toString()))
            {
                throw new RuntimeException(String.format("Failed with %s: price=%s str=%s", new Object[] {
                    s, walmartprice.getPrice().toString(), walmartprice.toString()
                }));
            } else
            {
                return;
            }
        } else
        {
            throw new RuntimeException(String.format("Failed with %s: valid=%b, range=%b, hasPrefix=%b", new Object[] {
                s, Boolean.valueOf(walmartprice.isValid()), Boolean.valueOf(walmartprice.isRange()), Boolean.valueOf(walmartprice.hasPrefix())
            }));
        }
    }

    public Price getLowerBound()
    {
        return mPrice;
    }

    public String getPrefix()
    {
        return mPrefix;
    }

    public Price getPrice()
    {
        return mPrice;
    }

    public Price getUpperBound()
    {
        return mUpperBound;
    }

    public boolean hasPrefix()
    {
        return !TextUtils.isEmpty(mPrefix);
    }

    public boolean isRange()
    {
        return mIsRange;
    }

    public boolean isValid()
    {
        return mIsValid;
    }

    public String toString()
    {
        if (isValid())
        {
            if (isRange())
            {
                return String.format(Locale.US, "%s - %s", new Object[] {
                    mPrice.toString(), mUpperBound.toString()
                });
            }
            if (hasPrefix())
            {
                return String.format(Locale.US, "%s %s", new Object[] {
                    mPrefix, mPrice.toString()
                });
            } else
            {
                return mPrice.toString();
            }
        } else
        {
            return "";
        }
    }

    static 
    {
        sPrefixRegEx = "([^$]*?)";
        sPriceRegEx = "\\$?(\\d[\\d,]*)(?:\\.(\\d+))?";
        sPricePattern = Pattern.compile((new StringBuilder()).append("^").append(sPrefixRegEx).append(sPriceRegEx).append("(.*)$").toString());
        sPriceRangePattern = Pattern.compile((new StringBuilder()).append("^").append(sPrefixRegEx).append(sPriceRegEx).append("\\s*-\\s*").append(sPriceRegEx).append("(.*)$").toString());
    }
}
