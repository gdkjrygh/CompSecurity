// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.jcd.lib;

import java.lang.reflect.Array;

// Referenced classes of package com.vladium.jcd.lib:
//            Types

private static class <init>
{

    Class arrayOf(String s)
        throws ClassNotFoundException
    {
        char c = s.charAt(0);
        if (c == '[')
        {
            s = arrayOf(s.substring(1));
        } else
        if (c == 'L')
        {
            s = Class.forName(Types.vmNameToJavaName(s.substring(1, s.length() - 1)));
        } else
        {
            s = primitive(c);
        }
        return Array.newInstance(s, 0).getClass();
    }

    Class descriptorToClass(String s)
        throws ClassNotFoundException
    {
        char c = s.charAt(0);
        if (c == '[')
        {
            return arrayOf(s.substring(1));
        }
        if (c == 'L')
        {
            return Class.forName(Types.vmNameToJavaName(s.substring(1, s.length() - 1)));
        } else
        {
            return primitive(c);
        }
    }

    Class primitive(char c)
        throws ClassNotFoundException
    {
        if (c == 'B')
        {
            return Byte.TYPE;
        }
        if (c == 'C')
        {
            return Character.TYPE;
        }
        if (c == 'D')
        {
            return Double.TYPE;
        }
        if (c == 'F')
        {
            return Float.TYPE;
        }
        if (c == 'I')
        {
            return Integer.TYPE;
        }
        if (c == 'J')
        {
            return Long.TYPE;
        }
        if (c == 'S')
        {
            return Short.TYPE;
        }
        if (c == 'Z')
        {
            return Boolean.TYPE;
        } else
        {
            throw new ClassNotFoundException((new StringBuilder()).append("unknown base type: ").append(c).toString());
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
