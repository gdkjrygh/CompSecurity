// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.preference;


public interface UAPreference
{
    public static final class PreferenceType extends Enum
    {

        private static final PreferenceType $VALUES[];
        public static final PreferenceType APID;
        public static final PreferenceType LOCATION_BACKGROUND_ENABLE;
        public static final PreferenceType LOCATION_ENABLE;
        public static final PreferenceType LOCATION_FOREGROUND_ENABLE;
        public static final PreferenceType PUSH_ENABLE;
        public static final PreferenceType QUIET_TIME_ENABLE;
        public static final PreferenceType QUIET_TIME_END;
        public static final PreferenceType QUIET_TIME_START;
        public static final PreferenceType SOUND_ENABLE;
        public static final PreferenceType USER_ID;
        public static final PreferenceType VIBRATE_ENABLE;

        public static PreferenceType valueOf(String s)
        {
            return (PreferenceType)Enum.valueOf(com/urbanairship/preference/UAPreference$PreferenceType, s);
        }

        public static PreferenceType[] values()
        {
            return (PreferenceType[])$VALUES.clone();
        }

        static 
        {
            PUSH_ENABLE = new PreferenceType("PUSH_ENABLE", 0);
            SOUND_ENABLE = new PreferenceType("SOUND_ENABLE", 1);
            VIBRATE_ENABLE = new PreferenceType("VIBRATE_ENABLE", 2);
            QUIET_TIME_ENABLE = new PreferenceType("QUIET_TIME_ENABLE", 3);
            QUIET_TIME_START = new PreferenceType("QUIET_TIME_START", 4);
            QUIET_TIME_END = new PreferenceType("QUIET_TIME_END", 5);
            LOCATION_ENABLE = new PreferenceType("LOCATION_ENABLE", 6);
            LOCATION_FOREGROUND_ENABLE = new PreferenceType("LOCATION_FOREGROUND_ENABLE", 7);
            LOCATION_BACKGROUND_ENABLE = new PreferenceType("LOCATION_BACKGROUND_ENABLE", 8);
            APID = new PreferenceType("APID", 9);
            USER_ID = new PreferenceType("USER_ID", 10);
            $VALUES = (new PreferenceType[] {
                PUSH_ENABLE, SOUND_ENABLE, VIBRATE_ENABLE, QUIET_TIME_ENABLE, QUIET_TIME_START, QUIET_TIME_END, LOCATION_ENABLE, LOCATION_FOREGROUND_ENABLE, LOCATION_BACKGROUND_ENABLE, APID, 
                USER_ID
            });
        }

        private PreferenceType(String s, int i)
        {
            super(s, i);
        }
    }


    public abstract PreferenceType getPreferenceType();

    public abstract void setValue(Object obj);
}
