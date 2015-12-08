// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.samsung.android.sdk.richnotification;


// Referenced classes of package com.samsung.android.sdk.richnotification:
//            SrnAction

protected static final class  extends Enum
{

    private static final REMOTE_INPUT ENUM$VALUES[];
    public static final REMOTE_INPUT HOST;
    public static final REMOTE_INPUT REMOTE_BUILT_IN;
    public static final REMOTE_INPUT REMOTE_INPUT;
    public static final REMOTE_INPUT REMOTE_LAUNCH;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/samsung/android/sdk/richnotification/SrnAction$ActionType, s);
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
        HOST = new <init>("HOST", 0);
        REMOTE_BUILT_IN = new <init>("REMOTE_BUILT_IN", 1);
        REMOTE_LAUNCH = new <init>("REMOTE_LAUNCH", 2);
        REMOTE_INPUT = new <init>("REMOTE_INPUT", 3);
        ENUM$VALUES = (new ENUM.VALUES[] {
            HOST, REMOTE_BUILT_IN, REMOTE_LAUNCH, REMOTE_INPUT
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
