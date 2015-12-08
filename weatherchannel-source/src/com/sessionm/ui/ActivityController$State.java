// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sessionm.ui;


// Referenced classes of package com.sessionm.ui:
//            ActivityController

public static final class  extends Enum
{

    private static final UNPRESENTABLE $VALUES[];
    public static final UNPRESENTABLE DISMISSED;
    public static final UNPRESENTABLE DISMISSING;
    public static final UNPRESENTABLE LOADED_CONTENT;
    public static final UNPRESENTABLE LOADED_WEBVIEW;
    public static final UNPRESENTABLE LOADING_CONTENT;
    public static final UNPRESENTABLE LOADING_WEBVIEW;
    public static final UNPRESENTABLE PRESENTED;
    public static final UNPRESENTABLE UNPRESENTABLE;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/sessionm/ui/ActivityController$State, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        DISMISSED = new <init>("DISMISSED", 0);
        LOADING_CONTENT = new <init>("LOADING_CONTENT", 1);
        LOADED_CONTENT = new <init>("LOADED_CONTENT", 2);
        LOADING_WEBVIEW = new <init>("LOADING_WEBVIEW", 3);
        LOADED_WEBVIEW = new <init>("LOADED_WEBVIEW", 4);
        PRESENTED = new <init>("PRESENTED", 5);
        DISMISSING = new <init>("DISMISSING", 6);
        UNPRESENTABLE = new <init>("UNPRESENTABLE", 7);
        $VALUES = (new .VALUES[] {
            DISMISSED, LOADING_CONTENT, LOADED_CONTENT, LOADING_WEBVIEW, LOADED_WEBVIEW, PRESENTED, DISMISSING, UNPRESENTABLE
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
