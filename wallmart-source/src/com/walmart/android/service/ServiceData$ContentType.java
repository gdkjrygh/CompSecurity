// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service;


// Referenced classes of package com.walmart.android.service:
//            ServiceData

public static final class _cls9 extends Enum
{

    private static final UNKNOWN $VALUES[];
    public static final UNKNOWN HTML;
    public static final UNKNOWN JSON;
    public static final UNKNOWN UNKNOWN;

    public static _cls9 valueOf(String s)
    {
        return (_cls9)Enum.valueOf(com/walmart/android/service/ServiceData$ContentType, s);
    }

    public static _cls9[] values()
    {
        return (_cls9[])$VALUES.clone();
    }

    static 
    {
        JSON = new <init>("JSON", 0);
        HTML = new <init>("HTML", 1);
        UNKNOWN = new <init>("UNKNOWN", 2);
        $VALUES = (new .VALUES[] {
            JSON, HTML, UNKNOWN
        });
    }

    private _cls9(String s, int i)
    {
        super(s, i);
    }
}
