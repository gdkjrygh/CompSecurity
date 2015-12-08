// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sessionm.ui;


// Referenced classes of package com.sessionm.ui:
//            SessionMViewContainer

public static final class  extends Enum
{

    private static final BROWSER $VALUES[];
    public static final BROWSER BROWSER;
    public static final BROWSER NORMAL;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/sessionm/ui/SessionMViewContainer$WebViewType, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        NORMAL = new <init>("NORMAL", 0);
        BROWSER = new <init>("BROWSER", 1);
        $VALUES = (new .VALUES[] {
            NORMAL, BROWSER
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
