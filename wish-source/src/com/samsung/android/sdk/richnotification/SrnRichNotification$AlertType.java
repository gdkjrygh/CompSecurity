// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.samsung.android.sdk.richnotification;


// Referenced classes of package com.samsung.android.sdk.richnotification:
//            SrnRichNotification

public static final class  extends Enum
{

    private static final SOUND_AND_VIBRATION ENUM$VALUES[];
    public static final SOUND_AND_VIBRATION SILENCE;
    public static final SOUND_AND_VIBRATION SOUND;
    public static final SOUND_AND_VIBRATION SOUND_AND_VIBRATION;
    public static final SOUND_AND_VIBRATION VIBRATION;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/samsung/android/sdk/richnotification/SrnRichNotification$AlertType, s);
    }

    public static [] values()
    {
         a[] = ENUM$VALUES;
        int i = a.length;
         a1[] = new ENUM.VALUES[i];
        System.arraycopy(a, 0, a1, 0, i);
        return a1;
    }

    static 
    {
        SILENCE = new <init>("SILENCE", 0);
        VIBRATION = new <init>("VIBRATION", 1);
        SOUND = new <init>("SOUND", 2);
        SOUND_AND_VIBRATION = new <init>("SOUND_AND_VIBRATION", 3);
        ENUM$VALUES = (new ENUM.VALUES[] {
            SILENCE, VIBRATION, SOUND, SOUND_AND_VIBRATION
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
