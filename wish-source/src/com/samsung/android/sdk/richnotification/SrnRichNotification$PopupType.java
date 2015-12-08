// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.samsung.android.sdk.richnotification;


// Referenced classes of package com.samsung.android.sdk.richnotification:
//            SrnRichNotification

public static final class  extends Enum
{

    private static final NONE ENUM$VALUES[];
    public static final NONE NONE;
    public static final NONE NORMAL;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/samsung/android/sdk/richnotification/SrnRichNotification$PopupType, s);
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
        NONE = new <init>("NONE", 1);
        ENUM$VALUES = (new ENUM.VALUES[] {
            NORMAL, NONE
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
