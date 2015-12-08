// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.widgets;


public final class WidgetType extends Enum
{

    private static final WidgetType $VALUES[];
    public static final WidgetType FourByOne;
    public static final WidgetType FourByTwo;
    public static final WidgetType OneByOne;
    public static final WidgetType TwoByTwo;
    private final int value;

    private WidgetType(String s, int i, int j)
    {
        super(s, i);
        value = j;
    }

    public static WidgetType getWidget(int i)
    {
        WidgetType awidgettype[] = values();
        int k = awidgettype.length;
        for (int j = 0; j < k; j++)
        {
            WidgetType widgettype = awidgettype[j];
            if (widgettype.getValue() == i)
            {
                return widgettype;
            }
        }

        return null;
    }

    public static WidgetType valueOf(String s)
    {
        return (WidgetType)Enum.valueOf(com/weather/Weather/widgets/WidgetType, s);
    }

    public static WidgetType[] values()
    {
        return (WidgetType[])$VALUES.clone();
    }

    int getValue()
    {
        return value;
    }

    static 
    {
        OneByOne = new WidgetType("OneByOne", 0, 1);
        TwoByTwo = new WidgetType("TwoByTwo", 1, 2);
        FourByOne = new WidgetType("FourByOne", 2, 3);
        FourByTwo = new WidgetType("FourByTwo", 3, 4);
        $VALUES = (new WidgetType[] {
            OneByOne, TwoByTwo, FourByOne, FourByTwo
        });
    }
}
