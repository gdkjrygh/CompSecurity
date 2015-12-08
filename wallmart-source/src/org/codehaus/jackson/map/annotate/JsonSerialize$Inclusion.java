// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.map.annotate;


// Referenced classes of package org.codehaus.jackson.map.annotate:
//            JsonSerialize

public static final class  extends Enum
{

    private static final NON_EMPTY $VALUES[];
    public static final NON_EMPTY ALWAYS;
    public static final NON_EMPTY NON_DEFAULT;
    public static final NON_EMPTY NON_EMPTY;
    public static final NON_EMPTY NON_NULL;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(org/codehaus/jackson/map/annotate/JsonSerialize$Inclusion, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        ALWAYS = new <init>("ALWAYS", 0);
        NON_NULL = new <init>("NON_NULL", 1);
        NON_DEFAULT = new <init>("NON_DEFAULT", 2);
        NON_EMPTY = new <init>("NON_EMPTY", 3);
        $VALUES = (new .VALUES[] {
            ALWAYS, NON_NULL, NON_DEFAULT, NON_EMPTY
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
