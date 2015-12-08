// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.components.navigation;


// Referenced classes of package com.contextlogic.wish.ui.components.navigation:
//            WishNavigationBar

public static final class Y extends Enum
{

    private static final Modal $VALUES[];
    public static final Modal Main;
    public static final Modal Modal;

    public static Y valueOf(String s)
    {
        return (Y)Enum.valueOf(com/contextlogic/wish/ui/components/navigation/WishNavigationBar$NavigationBarColor, s);
    }

    public static Y[] values()
    {
        return (Y[])$VALUES.clone();
    }

    static 
    {
        Main = new <init>("Main", 0);
        Modal = new <init>("Modal", 1);
        $VALUES = (new .VALUES[] {
            Main, Modal
        });
    }

    private Y(String s, int i)
    {
        super(s, i);
    }
}
