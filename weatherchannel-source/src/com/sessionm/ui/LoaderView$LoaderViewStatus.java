// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sessionm.ui;


// Referenced classes of package com.sessionm.ui:
//            LoaderView

public static final class  extends Enum
{

    private static final UNAVAILABLE $VALUES[];
    public static final UNAVAILABLE FAILED;
    public static final UNAVAILABLE LOADING;
    public static final UNAVAILABLE UNAVAILABLE;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/sessionm/ui/LoaderView$LoaderViewStatus, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        LOADING = new <init>("LOADING", 0);
        FAILED = new <init>("FAILED", 1);
        UNAVAILABLE = new <init>("UNAVAILABLE", 2);
        $VALUES = (new .VALUES[] {
            LOADING, FAILED, UNAVAILABLE
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
