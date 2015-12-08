// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.protobuf.nano;

import java.lang.reflect.Array;
import java.lang.reflect.Field;

// Referenced classes of package com.google.protobuf.nano:
//            c

public final class d
{

    public static String a(c c1)
    {
        if (c1 == null)
        {
            return "null";
        }
        StringBuffer stringbuffer = new StringBuffer();
        try
        {
            a(c1.getClass().getSimpleName(), c1.getClass(), c1, new StringBuffer(), stringbuffer);
        }
        // Misplaced declaration of an exception variable
        catch (c c1)
        {
            return (new StringBuilder("Error printing proto: ")).append(c1.getMessage()).toString();
        }
        return stringbuffer.toString();
    }

    private static String a(String s)
    {
        int j = s.length();
        StringBuilder stringbuilder = new StringBuilder(j);
        int i = 0;
        while (i < j) 
        {
            char c1 = s.charAt(i);
            if (c1 >= ' ' && c1 <= '~' && c1 != '"' && c1 != '\'')
            {
                stringbuilder.append(c1);
            } else
            {
                stringbuilder.append(String.format("\\u%04x", new Object[] {
                    Integer.valueOf(c1)
                }));
            }
            i++;
        }
        return stringbuilder.toString();
    }

    private static void a(String s, Class class1, Object obj, StringBuffer stringbuffer, StringBuffer stringbuffer1)
    {
        if (!com/google/protobuf/nano/c.isAssignableFrom(class1)) goto _L2; else goto _L1
_L1:
        if (obj != null) goto _L4; else goto _L3
_L3:
        return;
_L4:
        stringbuffer1.append(stringbuffer).append(s);
        stringbuffer.append("  ");
        stringbuffer1.append(" <\n");
        s = class1.getFields();
        int j1 = s.length;
        int i = 0;
        while (i < j1) 
        {
            Object obj1 = s[i];
            int k = ((Field) (obj1)).getModifiers();
            class1 = ((Field) (obj1)).getName();
            if ((k & 1) == 1 && (k & 8) != 8 && !class1.startsWith("_") && !class1.endsWith("_"))
            {
                Class class2 = ((Field) (obj1)).getType();
                obj1 = ((Field) (obj1)).get(obj);
                if (class2.isArray())
                {
                    Class class3 = class2.getComponentType();
                    if (class3 == Byte.TYPE)
                    {
                        a(((String) (class1)), class2, obj1, stringbuffer, stringbuffer1);
                    } else
                    {
                        int l;
                        int i1;
                        if (obj1 == null)
                        {
                            l = 0;
                        } else
                        {
                            l = Array.getLength(obj1);
                        }
                        i1 = 0;
                        while (i1 < l) 
                        {
                            a(((String) (class1)), class3, Array.get(obj1, i1), stringbuffer, stringbuffer1);
                            i1++;
                        }
                    }
                } else
                {
                    a(((String) (class1)), class2, obj1, stringbuffer, stringbuffer1);
                }
            }
            i++;
        }
        stringbuffer.delete(stringbuffer.length() - 2, stringbuffer.length());
        stringbuffer1.append(stringbuffer).append(">\n");
        return;
_L2:
        if (obj != null)
        {
            class1 = new StringBuffer();
            int j = 0;
            while (j < s.length()) 
            {
                char c1 = s.charAt(j);
                if (j == 0)
                {
                    class1.append(Character.toLowerCase(c1));
                } else
                if (Character.isUpperCase(c1))
                {
                    class1.append('_').append(Character.toLowerCase(c1));
                } else
                {
                    class1.append(c1);
                }
                j++;
            }
            s = class1.toString();
            stringbuffer1.append(stringbuffer).append(s).append(": ");
            if (obj instanceof String)
            {
                class1 = (String)obj;
                s = class1;
                if (!class1.startsWith("http"))
                {
                    s = class1;
                    if (class1.length() > 200)
                    {
                        s = (new StringBuilder()).append(class1.substring(0, 200)).append("[...]").toString();
                    }
                }
                s = a(s);
                stringbuffer1.append("\"").append(s).append("\"");
            } else
            {
                stringbuffer1.append(obj);
            }
            stringbuffer1.append("\n");
            return;
        }
        if (true) goto _L3; else goto _L5
_L5:
    }
}
