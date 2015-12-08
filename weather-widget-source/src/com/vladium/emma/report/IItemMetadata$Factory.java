// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.emma.report;


// Referenced classes of package com.vladium.emma.report:
//            IItemMetadata, AllItem, PackageItem, SrcFileItem, 
//            ClassItem, MethodItem

public static abstract class 
{

    private static final IItemMetadata METADATA[] = {
        AllItem.getTypeMetadata(), PackageItem.getTypeMetadata(), SrcFileItem.getTypeMetadata(), ClassItem.getTypeMetadata(), MethodItem.getTypeMetadata()
    };

    public static IItemMetadata[] getAllTypes()
    {
        return METADATA;
    }

    public static IItemMetadata getTypeMetadata(int i)
    {
        if (i < 0 || i > 4)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("invalid type ID: ").append(i).toString());
        } else
        {
            return METADATA[i];
        }
    }


    private ()
    {
    }
}
