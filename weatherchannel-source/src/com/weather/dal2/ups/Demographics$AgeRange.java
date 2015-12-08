// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.dal2.ups;


// Referenced classes of package com.weather.dal2.ups:
//            Demographics

public static final class maxAge extends Enum
{

    private static final AGE_RANGE_65_PLUS $VALUES[];
    public static final AGE_RANGE_65_PLUS AGE_RANGE_13_TO_17;
    public static final AGE_RANGE_65_PLUS AGE_RANGE_18_TO_24;
    public static final AGE_RANGE_65_PLUS AGE_RANGE_25_TO_34;
    public static final AGE_RANGE_65_PLUS AGE_RANGE_35_TO_44;
    public static final AGE_RANGE_65_PLUS AGE_RANGE_45_TO_54;
    public static final AGE_RANGE_65_PLUS AGE_RANGE_55_TO_64;
    public static final AGE_RANGE_65_PLUS AGE_RANGE_65_PLUS;
    public static final AGE_RANGE_65_PLUS AGE_RANGE_UNDER;
    private final String ageRange;
    private final int maxAge;
    private final int minAge;

    public static maxAge lookupRange(int i)
    {
        maxAge amaxage[] = values();
        int k = amaxage.length;
        for (int j = 0; j < k; j++)
        {
            maxAge maxage = amaxage[j];
            if (maxage.minAge <= i && maxage.maxAge >= i)
            {
                return maxage;
            }
        }

        throw new IllegalArgumentException("Age does not match");
    }

    public static maxAge lookupRange(String s)
    {
        maxAge amaxage[] = values();
        int j = amaxage.length;
        for (int i = 0; i < j; i++)
        {
            maxAge maxage = amaxage[i];
            if (maxage.ageRange.equals(s))
            {
                return maxage;
            }
        }

        return null;
    }

    public static ageRange valueOf(String s)
    {
        return (ageRange)Enum.valueOf(com/weather/dal2/ups/Demographics$AgeRange, s);
    }

    public static ageRange[] values()
    {
        return (ageRange[])$VALUES.clone();
    }

    public String toString()
    {
        return ageRange;
    }

    static 
    {
        AGE_RANGE_UNDER = new <init>("AGE_RANGE_UNDER", 0, "under13", 0, 12);
        AGE_RANGE_13_TO_17 = new <init>("AGE_RANGE_13_TO_17", 1, "13-17", 13, 17);
        AGE_RANGE_18_TO_24 = new <init>("AGE_RANGE_18_TO_24", 2, "18-24", 18, 24);
        AGE_RANGE_25_TO_34 = new <init>("AGE_RANGE_25_TO_34", 3, "25-34", 25, 34);
        AGE_RANGE_35_TO_44 = new <init>("AGE_RANGE_35_TO_44", 4, "35-44", 35, 44);
        AGE_RANGE_45_TO_54 = new <init>("AGE_RANGE_45_TO_54", 5, "45-54", 45, 54);
        AGE_RANGE_55_TO_64 = new <init>("AGE_RANGE_55_TO_64", 6, "55-64", 55, 64);
        AGE_RANGE_65_PLUS = new <init>("AGE_RANGE_65_PLUS", 7, "65plus", 65, 0x7fffffff);
        $VALUES = (new .VALUES[] {
            AGE_RANGE_UNDER, AGE_RANGE_13_TO_17, AGE_RANGE_18_TO_24, AGE_RANGE_25_TO_34, AGE_RANGE_35_TO_44, AGE_RANGE_45_TO_54, AGE_RANGE_55_TO_64, AGE_RANGE_65_PLUS
        });
    }

    private (String s, int i, String s1, int j, int k)
    {
        super(s, i);
        ageRange = s1;
        minAge = j;
        maxAge = k;
    }
}
