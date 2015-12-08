// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;


// Referenced classes of package com.google.common.collect:
//            MultimapBuilder, SetMultimap, Multimap

public static abstract class  extends MultimapBuilder
{

    public volatile Multimap build()
    {
        return build();
    }

    public volatile Multimap build(Multimap multimap)
    {
        return build(multimap);
    }

    public abstract SetMultimap build();

    public SetMultimap build(Multimap multimap)
    {
        return (SetMultimap)super.build(multimap);
    }

    ()
    {
        super(null);
    }
}
