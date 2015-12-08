// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.preference;


// Referenced classes of package com.urbanairship.preference:
//            UAPreference

public static final class  extends Enum
{

    private static final USER_ID $VALUES[];
    public static final USER_ID APID;
    public static final USER_ID LOCATION_BACKGROUND_ENABLE;
    public static final USER_ID LOCATION_ENABLE;
    public static final USER_ID LOCATION_FOREGROUND_ENABLE;
    public static final USER_ID PUSH_ENABLE;
    public static final USER_ID QUIET_TIME_ENABLE;
    public static final USER_ID QUIET_TIME_END;
    public static final USER_ID QUIET_TIME_START;
    public static final USER_ID SOUND_ENABLE;
    public static final USER_ID USER_ID;
    public static final USER_ID VIBRATE_ENABLE;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/urbanairship/preference/UAPreference$PreferenceType, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        PUSH_ENABLE = new <init>("PUSH_ENABLE", 0);
        SOUND_ENABLE = new <init>("SOUND_ENABLE", 1);
        VIBRATE_ENABLE = new <init>("VIBRATE_ENABLE", 2);
        QUIET_TIME_ENABLE = new <init>("QUIET_TIME_ENABLE", 3);
        QUIET_TIME_START = new <init>("QUIET_TIME_START", 4);
        QUIET_TIME_END = new <init>("QUIET_TIME_END", 5);
        LOCATION_ENABLE = new <init>("LOCATION_ENABLE", 6);
        LOCATION_FOREGROUND_ENABLE = new <init>("LOCATION_FOREGROUND_ENABLE", 7);
        LOCATION_BACKGROUND_ENABLE = new <init>("LOCATION_BACKGROUND_ENABLE", 8);
        APID = new <init>("APID", 9);
        USER_ID = new <init>("USER_ID", 10);
        $VALUES = (new .VALUES[] {
            PUSH_ENABLE, SOUND_ENABLE, VIBRATE_ENABLE, QUIET_TIME_ENABLE, QUIET_TIME_START, QUIET_TIME_END, LOCATION_ENABLE, LOCATION_FOREGROUND_ENABLE, LOCATION_BACKGROUND_ENABLE, APID, 
            USER_ID
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
