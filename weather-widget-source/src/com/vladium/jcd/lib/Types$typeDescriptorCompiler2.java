// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.jcd.lib;


// Referenced classes of package com.vladium.jcd.lib:
//            Types

private static class <init>
{

    String arrayOf(String s)
    {
        char c = s.charAt(0);
        if (c == '[')
        {
            s = arrayOf(s.substring(1));
        } else
        if (c == 'L')
        {
            s = Types.vmNameToJavaName(s.substring(1, s.length() - 1));
        } else
        {
            s = primitive(c);
        }
        return (new StringBuilder()).append(s).append(" []").toString();
    }

    String descriptorToClass(String s)
    {
        char c = s.charAt(0);
        if (c == '[')
        {
            return arrayOf(s.substring(1));
        }
        if (c == 'L')
        {
            return Types.vmNameToJavaName(s.substring(1, s.length() - 1));
        } else
        {
            return primitive(c);
        }
    }

    String primitive(char c)
    {
        switch (c)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder()).append("unknown primitive: ").append(c).toString());

        case 66: // 'B'
            return "byte";

        case 67: // 'C'
            return "char";

        case 68: // 'D'
            return "double";

        case 70: // 'F'
            return "float";

        case 73: // 'I'
            return "int";

        case 74: // 'J'
            return "long";

        case 83: // 'S'
            return "short";

        case 90: // 'Z'
            return "boolean";
        }
    }

    private ()
    {
    }

    ( )
    {
        this();
    }
}
