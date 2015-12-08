// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.tropical;


// Referenced classes of package com.weather.commons.tropical:
//            StormData

public static abstract class <init> extends Enum
{

    private static final HURRICANE $VALUES[];
    public static final HURRICANE HURRICANE;
    public static final HURRICANE TROPICAL_DEPRESSION;
    public static final HURRICANE TROPICAL_STORM;

    public static <init> valueOf(String s)
    {
        return (<init>)Enum.valueOf(com/weather/commons/tropical/StormData$StormType, s);
    }

    public static <init>[] values()
    {
        return (<init>[])$VALUES.clone();
    }

    abstract String convertCategory(int i);

    static 
    {
        TROPICAL_DEPRESSION = new StormData.StormType("TROPICAL_DEPRESSION", 0) {

            String convertCategory(int i)
            {
                return "TD";
            }

        };
        TROPICAL_STORM = new StormData.StormType("TROPICAL_STORM", 1) {

            String convertCategory(int i)
            {
                return "TS";
            }

        };
        HURRICANE = new StormData.StormType("HURRICANE", 2) {

            String convertCategory(int i)
            {
                return String.valueOf(i);
            }

        };
        $VALUES = (new .VALUES[] {
            TROPICAL_DEPRESSION, TROPICAL_STORM, HURRICANE
        });
    }

    private _cls3(String s, int i)
    {
        super(s, i);
    }

    _cls3(String s, int i, _cls3 _pcls3)
    {
        this(s, i);
    }
}
