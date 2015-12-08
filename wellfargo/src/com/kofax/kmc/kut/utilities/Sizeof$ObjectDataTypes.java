// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kut.utilities;


public final class  extends Enum
{

    public static final DATA_TYPE_APP_CREATED DATA_TYPE_APP_CREATED;
    public static final DATA_TYPE_APP_CREATED DATA_TYPE_BOOLEAN_FIELD;
    public static final DATA_TYPE_APP_CREATED DATA_TYPE_BYTE_FIELD;
    public static final DATA_TYPE_APP_CREATED DATA_TYPE_CHAR_FIELD;
    public static final DATA_TYPE_APP_CREATED DATA_TYPE_DOUBLE_FIELD;
    public static final DATA_TYPE_APP_CREATED DATA_TYPE_FLOAT_FIELD;
    public static final DATA_TYPE_APP_CREATED DATA_TYPE_INT_FIELD;
    public static final DATA_TYPE_APP_CREATED DATA_TYPE_LONG_FIELD;
    public static final DATA_TYPE_APP_CREATED DATA_TYPE_OBJECT_REF;
    public static final DATA_TYPE_APP_CREATED DATA_TYPE_OBJECT_SHELL;
    public static final DATA_TYPE_APP_CREATED DATA_TYPE_SHORT_FIELD;
    private static final DATA_TYPE_APP_CREATED a[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/kofax/kmc/kut/utilities/Sizeof$ObjectDataTypes, s);
    }

    public static [] values()
    {
        return ([])a.clone();
    }

    static 
    {
        DATA_TYPE_OBJECT_SHELL = new <init>("DATA_TYPE_OBJECT_SHELL", 0);
        DATA_TYPE_OBJECT_REF = new <init>("DATA_TYPE_OBJECT_REF", 1);
        DATA_TYPE_LONG_FIELD = new <init>("DATA_TYPE_LONG_FIELD", 2);
        DATA_TYPE_INT_FIELD = new <init>("DATA_TYPE_INT_FIELD", 3);
        DATA_TYPE_SHORT_FIELD = new <init>("DATA_TYPE_SHORT_FIELD", 4);
        DATA_TYPE_CHAR_FIELD = new <init>("DATA_TYPE_CHAR_FIELD", 5);
        DATA_TYPE_BYTE_FIELD = new <init>("DATA_TYPE_BYTE_FIELD", 6);
        DATA_TYPE_BOOLEAN_FIELD = new <init>("DATA_TYPE_BOOLEAN_FIELD", 7);
        DATA_TYPE_DOUBLE_FIELD = new <init>("DATA_TYPE_DOUBLE_FIELD", 8);
        DATA_TYPE_FLOAT_FIELD = new <init>("DATA_TYPE_FLOAT_FIELD", 9);
        DATA_TYPE_APP_CREATED = new <init>("DATA_TYPE_APP_CREATED", 10);
        a = (new a[] {
            DATA_TYPE_OBJECT_SHELL, DATA_TYPE_OBJECT_REF, DATA_TYPE_LONG_FIELD, DATA_TYPE_INT_FIELD, DATA_TYPE_SHORT_FIELD, DATA_TYPE_CHAR_FIELD, DATA_TYPE_BYTE_FIELD, DATA_TYPE_BOOLEAN_FIELD, DATA_TYPE_DOUBLE_FIELD, DATA_TYPE_FLOAT_FIELD, 
            DATA_TYPE_APP_CREATED
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
