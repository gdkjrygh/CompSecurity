// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.client.android;


final class  extends Enum
{

    private static final DONE $VALUES[];
    public static final DONE DONE;
    public static final DONE PREVIEW;
    public static final DONE SUCCESS;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/zxing/client/android/CaptureActivityHandler$State, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        PREVIEW = new <init>("PREVIEW", 0);
        SUCCESS = new <init>("SUCCESS", 1);
        DONE = new <init>("DONE", 2);
        $VALUES = (new .VALUES[] {
            PREVIEW, SUCCESS, DONE
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
