// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.answers;


// Referenced classes of package com.crashlytics.android.answers:
//            SessionEvent

static final class  extends Enum
{

    private static final PREDEFINED $VALUES[];
    public static final PREDEFINED CRASH;
    public static final PREDEFINED CREATE;
    public static final PREDEFINED CUSTOM;
    public static final PREDEFINED DESTROY;
    public static final PREDEFINED ERROR;
    public static final PREDEFINED INSTALL;
    public static final PREDEFINED PAUSE;
    public static final PREDEFINED PREDEFINED;
    public static final PREDEFINED RESUME;
    public static final PREDEFINED SAVE_INSTANCE_STATE;
    public static final PREDEFINED START;
    public static final PREDEFINED STOP;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/crashlytics/android/answers/SessionEvent$Type, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        CREATE = new <init>("CREATE", 0);
        START = new <init>("START", 1);
        RESUME = new <init>("RESUME", 2);
        SAVE_INSTANCE_STATE = new <init>("SAVE_INSTANCE_STATE", 3);
        PAUSE = new <init>("PAUSE", 4);
        STOP = new <init>("STOP", 5);
        DESTROY = new <init>("DESTROY", 6);
        ERROR = new <init>("ERROR", 7);
        CRASH = new <init>("CRASH", 8);
        INSTALL = new <init>("INSTALL", 9);
        CUSTOM = new <init>("CUSTOM", 10);
        PREDEFINED = new <init>("PREDEFINED", 11);
        $VALUES = (new .VALUES[] {
            CREATE, START, RESUME, SAVE_INSTANCE_STATE, PAUSE, STOP, DESTROY, ERROR, CRASH, INSTALL, 
            CUSTOM, PREDEFINED
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
