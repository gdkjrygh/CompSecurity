// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.emma.report;


// Referenced classes of package com.vladium.emma.report:
//            AllItem, PackageItem, SrcFileItem, ClassItem, 
//            MethodItem

public interface IItemMetadata
{
    public static abstract class Factory
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


        private Factory()
        {
        }
    }


    public static final int TYPE_ID_ALL = 0;
    public static final int TYPE_ID_CLASS = 3;
    public static final int TYPE_ID_METHOD = 4;
    public static final int TYPE_ID_PACKAGE = 1;
    public static final int TYPE_ID_SRCFILE = 2;

    public abstract long getAttributeIDs();

    public abstract int getTypeID();

    public abstract String getTypeName();
}
