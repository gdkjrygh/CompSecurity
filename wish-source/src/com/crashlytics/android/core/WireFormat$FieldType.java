// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.core;


// Referenced classes of package com.crashlytics.android.core:
//            WireFormat

static class <init> extends Enum
{

    private static final SINT64 $VALUES[];
    public static final SINT64 BOOL;
    public static final SINT64 BYTES;
    public static final SINT64 DOUBLE;
    public static final SINT64 ENUM;
    public static final SINT64 FIXED32;
    public static final SINT64 FIXED64;
    public static final SINT64 FLOAT;
    public static final SINT64 GROUP;
    public static final SINT64 INT32;
    public static final SINT64 INT64;
    public static final SINT64 MESSAGE;
    public static final SINT64 SFIXED32;
    public static final SINT64 SFIXED64;
    public static final SINT64 SINT32;
    public static final SINT64 SINT64;
    public static final SINT64 STRING;
    public static final SINT64 UINT32;
    public static final SINT64 UINT64;
    private final SINT64 javaType;
    private final int wireType;

    public static <init> valueOf(String s)
    {
        return (<init>)Enum.valueOf(com/crashlytics/android/core/WireFormat$FieldType, s);
    }

    public static <init>[] values()
    {
        return (<init>[])$VALUES.clone();
    }

    public e_3B_.clone getJavaType()
    {
        return javaType;
    }

    public int getWireType()
    {
        return wireType;
    }

    public boolean isPackable()
    {
        return true;
    }

    static 
    {
        DOUBLE = new <init>("DOUBLE", 0, OUBLE, 1);
        FLOAT = new <init>("FLOAT", 1, LOAT, 5);
        INT64 = new <init>("INT64", 2, ONG, 0);
        UINT64 = new <init>("UINT64", 3, ONG, 0);
        INT32 = new <init>("INT32", 4, NT, 0);
        FIXED64 = new <init>("FIXED64", 5, ONG, 1);
        FIXED32 = new <init>("FIXED32", 6, NT, 5);
        BOOL = new <init>("BOOL", 7, OOLEAN, 0);
        STRING = new WireFormat.FieldType("STRING", 8, TRING, 2) {

            public boolean isPackable()
            {
                return false;
            }

        };
        GROUP = new WireFormat.FieldType("GROUP", 9, ESSAGE, 3) {

            public boolean isPackable()
            {
                return false;
            }

        };
        MESSAGE = new WireFormat.FieldType("MESSAGE", 10, ESSAGE, 2) {

            public boolean isPackable()
            {
                return false;
            }

        };
        BYTES = new WireFormat.FieldType("BYTES", 11, YTE_STRING, 2) {

            public boolean isPackable()
            {
                return false;
            }

        };
        UINT32 = new <init>("UINT32", 12, NT, 0);
        ENUM = new <init>("ENUM", 13, NUM, 0);
        SFIXED32 = new <init>("SFIXED32", 14, NT, 5);
        SFIXED64 = new <init>("SFIXED64", 15, ONG, 1);
        SINT32 = new <init>("SINT32", 16, NT, 0);
        SINT64 = new <init>("SINT64", 17, ONG, 0);
        $VALUES = (new .VALUES[] {
            DOUBLE, FLOAT, INT64, UINT64, INT32, FIXED64, FIXED32, BOOL, STRING, GROUP, 
            MESSAGE, BYTES, UINT32, ENUM, SFIXED32, SFIXED64, SINT32, SINT64
        });
    }

    private _cls4(String s, int i, _cls4 _pcls4, int j)
    {
        super(s, i);
        javaType = _pcls4;
        wireType = j;
    }

    wireType(String s, int i, wireType wiretype, int j, wireType wiretype1)
    {
        this(s, i, wiretype, j);
    }
}
