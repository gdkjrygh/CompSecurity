// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.payment.view;


// Referenced classes of package com.walmartlabs.payment.view:
//            SlidingUpPanelLayout

public static final class  extends Enum
{

    private static final DRAGGING $VALUES[];
    public static final DRAGGING ANCHORED;
    public static final DRAGGING COLLAPSED;
    public static final DRAGGING DRAGGING;
    public static final DRAGGING EXPANDED;
    public static final DRAGGING HIDDEN;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/walmartlabs/payment/view/SlidingUpPanelLayout$PanelState, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        EXPANDED = new <init>("EXPANDED", 0);
        COLLAPSED = new <init>("COLLAPSED", 1);
        ANCHORED = new <init>("ANCHORED", 2);
        HIDDEN = new <init>("HIDDEN", 3);
        DRAGGING = new <init>("DRAGGING", 4);
        $VALUES = (new .VALUES[] {
            EXPANDED, COLLAPSED, ANCHORED, HIDDEN, DRAGGING
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
