// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.samsung.android.sdk.richnotification.actions;


// Referenced classes of package com.samsung.android.sdk.richnotification.actions:
//            SrnRemoteInputAction

public static final class  extends Enum
{

    public static final EMOJI EMOJI;
    private static final EMOJI ENUM$VALUES[];
    public static final EMOJI NORMAL;
    public static final EMOJI NUMBER;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/samsung/android/sdk/richnotification/actions/SrnRemoteInputAction$KeyboardInputMode$KeyboardType, s);
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
        NORMAL = new <init>("NORMAL", 0);
        NUMBER = new <init>("NUMBER", 1);
        EMOJI = new <init>("EMOJI", 2);
        ENUM$VALUES = (new ENUM.VALUES[] {
            NORMAL, NUMBER, EMOJI
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
