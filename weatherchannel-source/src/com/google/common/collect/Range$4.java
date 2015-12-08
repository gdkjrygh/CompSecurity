// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;


// Referenced classes of package com.google.common.collect:
//            Range, BoundType

static class e
{

    static final int $SwitchMap$com$google$common$collect$BoundType[];

    static 
    {
        $SwitchMap$com$google$common$collect$BoundType = new int[BoundType.values().length];
        try
        {
            $SwitchMap$com$google$common$collect$BoundType[BoundType.OPEN.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$google$common$collect$BoundType[BoundType.CLOSED.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
