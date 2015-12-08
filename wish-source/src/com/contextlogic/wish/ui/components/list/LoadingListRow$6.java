// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.components.list;


// Referenced classes of package com.contextlogic.wish.ui.components.list:
//            LoadingListRow

static class adingMode
{

    static final int $SwitchMap$com$contextlogic$wish$ui$components$list$LoadingListRow$ButtonColor[];
    static final int $SwitchMap$com$contextlogic$wish$ui$components$list$LoadingListRow$LoadingMode[];

    static 
    {
        $SwitchMap$com$contextlogic$wish$ui$components$list$LoadingListRow$ButtonColor = new int[ttonColor.values().length];
        try
        {
            $SwitchMap$com$contextlogic$wish$ui$components$list$LoadingListRow$ButtonColor[ttonColor.Blue.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            $SwitchMap$com$contextlogic$wish$ui$components$list$LoadingListRow$ButtonColor[ttonColor.Orange.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        $SwitchMap$com$contextlogic$wish$ui$components$list$LoadingListRow$LoadingMode = new int[adingMode.values().length];
        try
        {
            $SwitchMap$com$contextlogic$wish$ui$components$list$LoadingListRow$LoadingMode[adingMode.Hidden.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            $SwitchMap$com$contextlogic$wish$ui$components$list$LoadingListRow$LoadingMode[adingMode.Loading.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$com$contextlogic$wish$ui$components$list$LoadingListRow$LoadingMode[adingMode.ClickToLoad.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$contextlogic$wish$ui$components$list$LoadingListRow$LoadingMode[adingMode.NoMoreItems.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
