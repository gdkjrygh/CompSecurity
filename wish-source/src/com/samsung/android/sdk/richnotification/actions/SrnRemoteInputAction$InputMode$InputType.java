// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.samsung.android.sdk.richnotification.actions;


// Referenced classes of package com.samsung.android.sdk.richnotification.actions:
//            SrnRemoteInputAction

static final class  extends Enum
{

    private static final KEYBOARD ENUM$VALUES[];
    public static final KEYBOARD KEYBOARD;
    public static final KEYBOARD MULTI_SELECT;
    public static final KEYBOARD SINGLE_SELECT;
    public static final KEYBOARD VOICE;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/samsung/android/sdk/richnotification/actions/SrnRemoteInputAction$InputMode$InputType, s);
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
        SINGLE_SELECT = new <init>("SINGLE_SELECT", 0);
        MULTI_SELECT = new <init>("MULTI_SELECT", 1);
        VOICE = new <init>("VOICE", 2);
        KEYBOARD = new <init>("KEYBOARD", 3);
        ENUM$VALUES = (new ENUM.VALUES[] {
            SINGLE_SELECT, MULTI_SELECT, VOICE, KEYBOARD
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
