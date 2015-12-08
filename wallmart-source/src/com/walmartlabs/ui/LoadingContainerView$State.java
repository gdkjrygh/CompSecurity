// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.ui;


// Referenced classes of package com.walmartlabs.ui:
//            LoadingContainerView

private static final class  extends Enum
{

    private static final CONTENT $VALUES[];
    public static final CONTENT CONTENT;
    public static final CONTENT EMPTY;
    public static final CONTENT ERROR;
    public static final CONTENT LOADING;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/walmartlabs/ui/LoadingContainerView$State, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        LOADING = new <init>("LOADING", 0);
        EMPTY = new <init>("EMPTY", 1);
        ERROR = new <init>("ERROR", 2);
        CONTENT = new <init>("CONTENT", 3);
        $VALUES = (new .VALUES[] {
            LOADING, EMPTY, ERROR, CONTENT
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
