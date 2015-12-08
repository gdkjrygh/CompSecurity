// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.config;

import com.weather.util.prefs.Prefs;

public final class ConfigPrefs
{
    public static final class Keys extends Enum
    {

        private static final Keys $VALUES[];
        public static final Keys AD_CONFIG;
        public static final Keys AD_TEST_CONFIG;
        public static final Keys ALLERGY_MODULE_CONFIG;
        public static final Keys APP_RATING_CONFIG;
        public static final Keys BEACON_CONFIG;
        public static final Keys COLD_FLU_MODULE_CONFIG;
        public static final Keys CONFIG_FILE_CONFIG;
        public static final Keys DAL_CONFIG;
        public static final Keys FACTUAL_CONFIG;
        public static final Keys FLAGSHIP_CONFIG;
        public static final Keys HURRICANE_MODULE_CONFIG;
        public static final Keys LAYERS_CONFIG;
        public static final Keys MODULE_CONFIG;

        public static Keys valueOf(String s)
        {
            return (Keys)Enum.valueOf(com/weather/commons/config/ConfigPrefs$Keys, s);
        }

        public static Keys[] values()
        {
            return (Keys[])$VALUES.clone();
        }

        static 
        {
            CONFIG_FILE_CONFIG = new Keys("CONFIG_FILE_CONFIG", 0);
            APP_RATING_CONFIG = new Keys("APP_RATING_CONFIG", 1);
            AD_CONFIG = new Keys("AD_CONFIG", 2);
            AD_TEST_CONFIG = new Keys("AD_TEST_CONFIG", 3);
            DAL_CONFIG = new Keys("DAL_CONFIG", 4);
            FACTUAL_CONFIG = new Keys("FACTUAL_CONFIG", 5);
            FLAGSHIP_CONFIG = new Keys("FLAGSHIP_CONFIG", 6);
            BEACON_CONFIG = new Keys("BEACON_CONFIG", 7);
            MODULE_CONFIG = new Keys("MODULE_CONFIG", 8);
            HURRICANE_MODULE_CONFIG = new Keys("HURRICANE_MODULE_CONFIG", 9);
            ALLERGY_MODULE_CONFIG = new Keys("ALLERGY_MODULE_CONFIG", 10);
            COLD_FLU_MODULE_CONFIG = new Keys("COLD_FLU_MODULE_CONFIG", 11);
            LAYERS_CONFIG = new Keys("LAYERS_CONFIG", 12);
            $VALUES = (new Keys[] {
                CONFIG_FILE_CONFIG, APP_RATING_CONFIG, AD_CONFIG, AD_TEST_CONFIG, DAL_CONFIG, FACTUAL_CONFIG, FLAGSHIP_CONFIG, BEACON_CONFIG, MODULE_CONFIG, HURRICANE_MODULE_CONFIG, 
                ALLERGY_MODULE_CONFIG, COLD_FLU_MODULE_CONFIG, LAYERS_CONFIG
            });
        }

        private Keys(String s, int i)
        {
            super(s, i);
        }
    }


    private static final String FILE_NAME = "TWC_CONFIG";
    private static final Prefs INSTANCE = new Prefs("TWC_CONFIG");

    private ConfigPrefs()
    {
    }

    public static void clearAll()
    {
        getInstance().remove(Keys.CONFIG_FILE_CONFIG);
        getInstance().remove(Keys.APP_RATING_CONFIG);
        getInstance().remove(Keys.AD_CONFIG);
        getInstance().remove(Keys.AD_TEST_CONFIG);
        getInstance().remove(Keys.DAL_CONFIG);
        getInstance().remove(Keys.FACTUAL_CONFIG);
        getInstance().remove(Keys.FLAGSHIP_CONFIG);
        getInstance().remove(Keys.LAYERS_CONFIG);
        getInstance().remove(Keys.BEACON_CONFIG);
        getInstance().remove(Keys.MODULE_CONFIG);
        getInstance().remove(Keys.HURRICANE_MODULE_CONFIG);
    }

    public static Prefs getInstance()
    {
        return INSTANCE;
    }

}
