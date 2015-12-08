// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package retrofit;


final class  extends Enum
{

    private static final HEADER $VALUES[];
    public static final HEADER BODY;
    public static final HEADER ENCODED_PATH;
    public static final HEADER ENCODED_QUERY;
    public static final HEADER ENCODED_QUERY_MAP;
    public static final HEADER FIELD;
    public static final HEADER FIELD_MAP;
    public static final HEADER HEADER;
    public static final HEADER PART;
    public static final HEADER PART_MAP;
    public static final HEADER PATH;
    public static final HEADER QUERY;
    public static final HEADER QUERY_MAP;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(retrofit/RestMethodInfo$ParamUsage, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        PATH = new <init>("PATH", 0);
        ENCODED_PATH = new <init>("ENCODED_PATH", 1);
        QUERY = new <init>("QUERY", 2);
        ENCODED_QUERY = new <init>("ENCODED_QUERY", 3);
        QUERY_MAP = new <init>("QUERY_MAP", 4);
        ENCODED_QUERY_MAP = new <init>("ENCODED_QUERY_MAP", 5);
        FIELD = new <init>("FIELD", 6);
        FIELD_MAP = new <init>("FIELD_MAP", 7);
        PART = new <init>("PART", 8);
        PART_MAP = new <init>("PART_MAP", 9);
        BODY = new <init>("BODY", 10);
        HEADER = new <init>("HEADER", 11);
        $VALUES = (new .VALUES[] {
            PATH, ENCODED_PATH, QUERY, ENCODED_QUERY, QUERY_MAP, ENCODED_QUERY_MAP, FIELD, FIELD_MAP, PART, PART_MAP, 
            BODY, HEADER
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
