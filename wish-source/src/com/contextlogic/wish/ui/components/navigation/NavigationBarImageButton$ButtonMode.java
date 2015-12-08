// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.components.navigation;


// Referenced classes of package com.contextlogic.wish.ui.components.navigation:
//            NavigationBarImageButton

public static final class  extends Enum
{

    private static final MenuOpen $VALUES[];
    public static final MenuOpen Action;
    public static final MenuOpen Back;
    public static final MenuOpen BackGray;
    public static final MenuOpen Blank;
    public static final MenuOpen Filter;
    public static final MenuOpen LeftBlank;
    public static final MenuOpen MenuOpen;
    public static final MenuOpen NextGray;
    public static final MenuOpen Search;
    public static final MenuOpen X;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/contextlogic/wish/ui/components/navigation/NavigationBarImageButton$ButtonMode, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        Back = new <init>("Back", 0);
        BackGray = new <init>("BackGray", 1);
        Blank = new <init>("Blank", 2);
        Action = new <init>("Action", 3);
        Filter = new <init>("Filter", 4);
        X = new <init>("X", 5);
        NextGray = new <init>("NextGray", 6);
        Search = new <init>("Search", 7);
        LeftBlank = new <init>("LeftBlank", 8);
        MenuOpen = new <init>("MenuOpen", 9);
        $VALUES = (new .VALUES[] {
            Back, BackGray, Blank, Action, Filter, X, NextGray, Search, LeftBlank, MenuOpen
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
