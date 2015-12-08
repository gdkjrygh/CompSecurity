// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.util.maps;


// Referenced classes of package com.weather.util.maps:
//            GoogleStaticMapsUrl

public static final class styleString extends Enum
{

    private static final SHADOWED $VALUES[];
    public static final SHADOWED NONE;
    public static final SHADOWED SHADOWED;
    private final String styleString;

    private String getStyleString()
    {
        return styleString;
    }

    public static styleString valueOf(String s)
    {
        return (styleString)Enum.valueOf(com/weather/util/maps/GoogleStaticMapsUrl$MapIcon$Decoration, s);
    }

    public static styleString[] values()
    {
        return (styleString[])$VALUES.clone();
    }

    static 
    {
        NONE = new <init>("NONE", 0, "shadow:false");
        SHADOWED = new <init>("SHADOWED", 1, "");
        $VALUES = (new .VALUES[] {
            NONE, SHADOWED
        });
    }


    private (String s, int i, String s1)
    {
        super(s, i);
        styleString = s1;
    }
}
