// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.dal2.ups;


// Referenced classes of package com.weather.dal2.ups:
//            Demographics

public static final class gender extends Enum
{

    private static final GENDER_FEMALE $VALUES[];
    public static final GENDER_FEMALE GENDER_FEMALE;
    public static final GENDER_FEMALE GENDER_MALE;
    private final String gender;

    public static gender valueOf(String s)
    {
        return (gender)Enum.valueOf(com/weather/dal2/ups/Demographics$Gender, s);
    }

    public static gender[] values()
    {
        return (gender[])$VALUES.clone();
    }

    public String toString()
    {
        return gender;
    }

    static 
    {
        GENDER_MALE = new <init>("GENDER_MALE", 0, "M");
        GENDER_FEMALE = new <init>("GENDER_FEMALE", 1, "F");
        $VALUES = (new .VALUES[] {
            GENDER_MALE, GENDER_FEMALE
        });
    }

    private (String s, int i, String s1)
    {
        super(s, i);
        gender = s1;
    }
}
