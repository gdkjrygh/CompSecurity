// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.config;


// Referenced classes of package com.weather.commons.config:
//            ConfigPrefs

public static final class  extends Enum
{

    private static final LAYERS_CONFIG $VALUES[];
    public static final LAYERS_CONFIG AD_CONFIG;
    public static final LAYERS_CONFIG AD_TEST_CONFIG;
    public static final LAYERS_CONFIG ALLERGY_MODULE_CONFIG;
    public static final LAYERS_CONFIG APP_RATING_CONFIG;
    public static final LAYERS_CONFIG BEACON_CONFIG;
    public static final LAYERS_CONFIG COLD_FLU_MODULE_CONFIG;
    public static final LAYERS_CONFIG CONFIG_FILE_CONFIG;
    public static final LAYERS_CONFIG DAL_CONFIG;
    public static final LAYERS_CONFIG FACTUAL_CONFIG;
    public static final LAYERS_CONFIG FLAGSHIP_CONFIG;
    public static final LAYERS_CONFIG HURRICANE_MODULE_CONFIG;
    public static final LAYERS_CONFIG LAYERS_CONFIG;
    public static final LAYERS_CONFIG MODULE_CONFIG;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/weather/commons/config/ConfigPrefs$Keys, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        CONFIG_FILE_CONFIG = new <init>("CONFIG_FILE_CONFIG", 0);
        APP_RATING_CONFIG = new <init>("APP_RATING_CONFIG", 1);
        AD_CONFIG = new <init>("AD_CONFIG", 2);
        AD_TEST_CONFIG = new <init>("AD_TEST_CONFIG", 3);
        DAL_CONFIG = new <init>("DAL_CONFIG", 4);
        FACTUAL_CONFIG = new <init>("FACTUAL_CONFIG", 5);
        FLAGSHIP_CONFIG = new <init>("FLAGSHIP_CONFIG", 6);
        BEACON_CONFIG = new <init>("BEACON_CONFIG", 7);
        MODULE_CONFIG = new <init>("MODULE_CONFIG", 8);
        HURRICANE_MODULE_CONFIG = new <init>("HURRICANE_MODULE_CONFIG", 9);
        ALLERGY_MODULE_CONFIG = new <init>("ALLERGY_MODULE_CONFIG", 10);
        COLD_FLU_MODULE_CONFIG = new <init>("COLD_FLU_MODULE_CONFIG", 11);
        LAYERS_CONFIG = new <init>("LAYERS_CONFIG", 12);
        $VALUES = (new .VALUES[] {
            CONFIG_FILE_CONFIG, APP_RATING_CONFIG, AD_CONFIG, AD_TEST_CONFIG, DAL_CONFIG, FACTUAL_CONFIG, FLAGSHIP_CONFIG, BEACON_CONFIG, MODULE_CONFIG, HURRICANE_MODULE_CONFIG, 
            ALLERGY_MODULE_CONFIG, COLD_FLU_MODULE_CONFIG, LAYERS_CONFIG
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
