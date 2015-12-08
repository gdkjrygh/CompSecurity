// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.item.view;


// Referenced classes of package com.walmart.android.app.item.view:
//            OnlineView

public static final class  extends Enum
{

    private static final GONE $VALUES[];
    public static final GONE DISABLED;
    public static final GONE ENABLED;
    public static final GONE GONE;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/walmart/android/app/item/view/OnlineView$AddToButtonState, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        ENABLED = new <init>("ENABLED", 0);
        DISABLED = new <init>("DISABLED", 1);
        GONE = new <init>("GONE", 2);
        $VALUES = (new .VALUES[] {
            ENABLED, DISABLED, GONE
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
