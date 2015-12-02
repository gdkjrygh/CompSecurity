// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.aspectj.lang.reflect;


// Referenced classes of package org.aspectj.lang.reflect:
//            DeclareAnnotation

public static final class  extends Enum
{

    private static final Type $VALUES[];
    public static final Type Constructor;
    public static final Type Field;
    public static final Type Method;
    public static final Type Type;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(org/aspectj/lang/reflect/DeclareAnnotation$Kind, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        Field = new <init>("Field", 0);
        Method = new <init>("Method", 1);
        Constructor = new <init>("Constructor", 2);
        Type = new <init>("Type", 3);
        $VALUES = (new .VALUES[] {
            Field, Method, Constructor, Type
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
