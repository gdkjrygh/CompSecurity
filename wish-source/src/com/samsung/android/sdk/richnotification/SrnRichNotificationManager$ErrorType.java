// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.samsung.android.sdk.richnotification;


// Referenced classes of package com.samsung.android.sdk.richnotification:
//            SrnRichNotificationManager

public static final class  extends Enum
{

    private static final UNDEFINED ENUM$VALUES[];
    public static final UNDEFINED UNDEFINED;

    static  get(int i)
    {
        if (i >= 0 && i < values().length)
        {
            return values()[i];
        } else
        {
            return UNDEFINED;
        }
    }

    public static UNDEFINED valueOf(String s)
    {
        return (UNDEFINED)Enum.valueOf(com/samsung/android/sdk/richnotification/SrnRichNotificationManager$ErrorType, s);
    }

    public static UNDEFINED[] values()
    {
        UNDEFINED aundefined[] = ENUM$VALUES;
        int i = aundefined.length;
        UNDEFINED aundefined1[] = new ENUM.VALUES[i];
        System.arraycopy(aundefined, 0, aundefined1, 0, i);
        return aundefined1;
    }

    static 
    {
        UNDEFINED = new <init>("UNDEFINED", 0);
        ENUM$VALUES = (new ENUM.VALUES[] {
            UNDEFINED
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
