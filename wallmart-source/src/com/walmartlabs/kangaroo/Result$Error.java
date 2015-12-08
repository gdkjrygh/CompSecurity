// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.kangaroo;


// Referenced classes of package com.walmartlabs.kangaroo:
//            Result

public static final class mCategory extends Enum
{
    public static final class Category extends Enum
    {

        private static final Category $VALUES[];
        public static final Category CONNECT;
        public static final Category PARSE;
        public static final Category UNKNOWN;

        public static Category valueOf(String s)
        {
            return (Category)Enum.valueOf(com/walmartlabs/kangaroo/Result$Error$Category, s);
        }

        public static Category[] values()
        {
            return (Category[])$VALUES.clone();
        }

        static 
        {
            CONNECT = new Category("CONNECT", 0);
            PARSE = new Category("PARSE", 1);
            UNKNOWN = new Category("UNKNOWN", 2);
            $VALUES = (new Category[] {
                CONNECT, PARSE, UNKNOWN
            });
        }

        private Category(String s, int i)
        {
            super(s, i);
        }
    }


    private static final ERROR_UNKNOWN $VALUES[];
    public static final ERROR_UNKNOWN ERROR_CONNECT_OTHER;
    public static final ERROR_UNKNOWN ERROR_CONNECT_UNCLASSIFIED;
    public static final ERROR_UNKNOWN ERROR_NOT_CONNECTED;
    public static final ERROR_UNKNOWN ERROR_OUT_OF_MEMORY;
    public static final ERROR_UNKNOWN ERROR_TIMEOUT;
    public static final ERROR_UNKNOWN ERROR_UNEXPECTED_RESPONSE;
    public static final ERROR_UNKNOWN ERROR_UNKNOWN;
    private final Category mCategory;

    public static Category valueOf(String s)
    {
        return (Category)Enum.valueOf(com/walmartlabs/kangaroo/Result$Error, s);
    }

    public static Category[] values()
    {
        return (Category[])$VALUES.clone();
    }

    public boolean connectionError()
    {
        return mCategory.equals(Category.CONNECT);
    }

    static 
    {
        ERROR_CONNECT_UNCLASSIFIED = new <init>("ERROR_CONNECT_UNCLASSIFIED", 0, Category.CONNECT);
        ERROR_NOT_CONNECTED = new <init>("ERROR_NOT_CONNECTED", 1, Category.CONNECT);
        ERROR_TIMEOUT = new <init>("ERROR_TIMEOUT", 2, Category.CONNECT);
        ERROR_CONNECT_OTHER = new <init>("ERROR_CONNECT_OTHER", 3, Category.CONNECT);
        ERROR_UNEXPECTED_RESPONSE = new <init>("ERROR_UNEXPECTED_RESPONSE", 4, Category.PARSE);
        ERROR_OUT_OF_MEMORY = new <init>("ERROR_OUT_OF_MEMORY", 5, Category.PARSE);
        ERROR_UNKNOWN = new <init>("ERROR_UNKNOWN", 6, Category.UNKNOWN);
        $VALUES = (new .VALUES[] {
            ERROR_CONNECT_UNCLASSIFIED, ERROR_NOT_CONNECTED, ERROR_TIMEOUT, ERROR_CONNECT_OTHER, ERROR_UNEXPECTED_RESPONSE, ERROR_OUT_OF_MEMORY, ERROR_UNKNOWN
        });
    }

    private Category(String s, int i, Category category)
    {
        super(s, i);
        mCategory = category;
    }
}
