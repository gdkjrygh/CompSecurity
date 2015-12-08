// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.javawriter;


// Referenced classes of package com.squareup.javawriter:
//            JavaWriter

private static final class  extends Enum
{

    private static final INITIALIZER $VALUES[];
    public static final INITIALIZER ABSTRACT_METHOD;
    public static final INITIALIZER ANNOTATION_ARRAY_VALUE;
    public static final INITIALIZER ANNOTATION_ATTRIBUTE;
    public static final INITIALIZER CONSTRUCTOR;
    public static final INITIALIZER CONTROL_FLOW;
    public static final INITIALIZER INITIALIZER;
    public static final INITIALIZER INTERFACE_DECLARATION;
    public static final INITIALIZER NON_ABSTRACT_METHOD;
    public static final INITIALIZER TYPE_DECLARATION;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/squareup/javawriter/JavaWriter$Scope, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        TYPE_DECLARATION = new <init>("TYPE_DECLARATION", 0);
        INTERFACE_DECLARATION = new <init>("INTERFACE_DECLARATION", 1);
        ABSTRACT_METHOD = new <init>("ABSTRACT_METHOD", 2);
        NON_ABSTRACT_METHOD = new <init>("NON_ABSTRACT_METHOD", 3);
        CONSTRUCTOR = new <init>("CONSTRUCTOR", 4);
        CONTROL_FLOW = new <init>("CONTROL_FLOW", 5);
        ANNOTATION_ATTRIBUTE = new <init>("ANNOTATION_ATTRIBUTE", 6);
        ANNOTATION_ARRAY_VALUE = new <init>("ANNOTATION_ARRAY_VALUE", 7);
        INITIALIZER = new <init>("INITIALIZER", 8);
        $VALUES = (new .VALUES[] {
            TYPE_DECLARATION, INTERFACE_DECLARATION, ABSTRACT_METHOD, NON_ABSTRACT_METHOD, CONSTRUCTOR, CONTROL_FLOW, ANNOTATION_ATTRIBUTE, ANNOTATION_ARRAY_VALUE, INITIALIZER
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
