// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sessionm.ui;


// Referenced classes of package com.sessionm.ui:
//            SessionMViewContainer

public static final class  extends Enum
{

    private static final WEB_VIEW_LOAD_FAILURE $VALUES[];
    public static final WEB_VIEW_LOAD_FAILURE CONTENT_UNAVAILABLE;
    public static final WEB_VIEW_LOAD_FAILURE NONE;
    public static final WEB_VIEW_LOAD_FAILURE WEB_VIEW_LOAD_FAILURE;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/sessionm/ui/SessionMViewContainer$ActivityControllerTestFailureMode, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        NONE = new <init>("NONE", 0);
        CONTENT_UNAVAILABLE = new <init>("CONTENT_UNAVAILABLE", 1);
        WEB_VIEW_LOAD_FAILURE = new <init>("WEB_VIEW_LOAD_FAILURE", 2);
        $VALUES = (new .VALUES[] {
            NONE, CONTENT_UNAVAILABLE, WEB_VIEW_LOAD_FAILURE
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
