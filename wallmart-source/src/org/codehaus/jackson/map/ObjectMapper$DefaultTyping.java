// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.map;


// Referenced classes of package org.codehaus.jackson.map:
//            ObjectMapper

public static final class _cls9 extends Enum
{

    private static final NON_FINAL $VALUES[];
    public static final NON_FINAL JAVA_LANG_OBJECT;
    public static final NON_FINAL NON_CONCRETE_AND_ARRAYS;
    public static final NON_FINAL NON_FINAL;
    public static final NON_FINAL OBJECT_AND_NON_CONCRETE;

    public static _cls9 valueOf(String s)
    {
        return (_cls9)Enum.valueOf(org/codehaus/jackson/map/ObjectMapper$DefaultTyping, s);
    }

    public static _cls9[] values()
    {
        return (_cls9[])$VALUES.clone();
    }

    static 
    {
        JAVA_LANG_OBJECT = new <init>("JAVA_LANG_OBJECT", 0);
        OBJECT_AND_NON_CONCRETE = new <init>("OBJECT_AND_NON_CONCRETE", 1);
        NON_CONCRETE_AND_ARRAYS = new <init>("NON_CONCRETE_AND_ARRAYS", 2);
        NON_FINAL = new <init>("NON_FINAL", 3);
        $VALUES = (new .VALUES[] {
            JAVA_LANG_OBJECT, OBJECT_AND_NON_CONCRETE, NON_CONCRETE_AND_ARRAYS, NON_FINAL
        });
    }

    private _cls9(String s, int i)
    {
        super(s, i);
    }
}
