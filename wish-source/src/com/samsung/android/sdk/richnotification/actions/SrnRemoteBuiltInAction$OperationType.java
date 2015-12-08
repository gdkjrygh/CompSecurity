// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.samsung.android.sdk.richnotification.actions;


// Referenced classes of package com.samsung.android.sdk.richnotification.actions:
//            SrnRemoteBuiltInAction

public static final class  extends Enum
{

    public static final SMS CALL;
    private static final SMS ENUM$VALUES[];
    public static final SMS SMS;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/samsung/android/sdk/richnotification/actions/SrnRemoteBuiltInAction$OperationType, s);
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
        CALL = new <init>("CALL", 0);
        SMS = new <init>("SMS", 1);
        ENUM$VALUES = (new ENUM.VALUES[] {
            CALL, SMS
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
