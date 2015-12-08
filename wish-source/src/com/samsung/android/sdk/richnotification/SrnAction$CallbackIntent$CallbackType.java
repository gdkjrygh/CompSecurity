// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.samsung.android.sdk.richnotification;


// Referenced classes of package com.samsung.android.sdk.richnotification:
//            SrnAction

private static final class mAbbreviation extends Enum
{

    public static final SERVICE_CALLBACK ACTIVITY_CALLBACK;
    public static final SERVICE_CALLBACK BROADCAST_CALLBACK;
    private static final SERVICE_CALLBACK ENUM$VALUES[];
    public static final SERVICE_CALLBACK SERVICE_CALLBACK;
    private final String mAbbreviation;

    private String getAbbreviation()
    {
        return mAbbreviation;
    }

    public static mAbbreviation valueOf(String s)
    {
        return (mAbbreviation)Enum.valueOf(com/samsung/android/sdk/richnotification/SrnAction$CallbackIntent$CallbackType, s);
    }

    public static mAbbreviation[] values()
    {
        mAbbreviation amabbreviation[] = ENUM$VALUES;
        int i = amabbreviation.length;
        mAbbreviation amabbreviation1[] = new ENUM.VALUES[i];
        System.arraycopy(amabbreviation, 0, amabbreviation1, 0, i);
        return amabbreviation1;
    }

    static 
    {
        ACTIVITY_CALLBACK = new <init>("ACTIVITY_CALLBACK", 0, "a");
        BROADCAST_CALLBACK = new <init>("BROADCAST_CALLBACK", 1, "b");
        SERVICE_CALLBACK = new <init>("SERVICE_CALLBACK", 2, "s");
        ENUM$VALUES = (new ENUM.VALUES[] {
            ACTIVITY_CALLBACK, BROADCAST_CALLBACK, SERVICE_CALLBACK
        });
    }


    private (String s, int i, String s1)
    {
        super(s, i);
        mAbbreviation = s1;
    }
}
