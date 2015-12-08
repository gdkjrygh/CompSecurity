// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.util;


public abstract class Descriptors
{

    public static final char JAVA_NAME_SEPARATOR = 46;
    private static final boolean RENAME_INNER_CLASSES = false;
    public static final char VM_NAME_SEPARATOR = 47;

    private Descriptors()
    {
    }

    public static String combine(String s, String s1, char c)
    {
        if (s1 == null || s1.length() == 0)
        {
            throw new IllegalArgumentException("null or empty input: name");
        }
        if (s == null || s.length() == 0)
        {
            return s1;
        } else
        {
            return s + c + s1;
        }
    }

    public static String combineJavaName(String s, String s1)
    {
        return combine(s, s1, '.');
    }

    public static String combineVMName(String s, String s1)
    {
        return combine(s, s1, '/');
    }

    public static String javaNameToVMName(String s)
    {
        if (s == null)
        {
            return null;
        } else
        {
            return s.replace('.', '/');
        }
    }

    public static String methodVMNameToJavaName(String s, String s1, String s2, boolean flag, boolean flag1, boolean flag2)
    {
        StringBuffer stringbuffer = new StringBuffer();
        int j;
        if (flag)
        {
            if ("<clinit>".equals(s1))
            {
                return "<static initializer>";
            }
            int i;
            if ("<init>".equals(s1))
            {
                stringbuffer.append(s);
            } else
            {
                stringbuffer.append(s1);
            }
        } else
        {
            if ("<clinit>".equals(s1))
            {
                return "<clinit>";
            }
            stringbuffer.append(s1);
        }
        s = s2.toCharArray();
        stringbuffer.append(" (");
        i = s.length;
        do
        {
            j = i - 1;
            i = j;
        } while (s[j] != ')');
        for (i = 1; i < j; i = typeDescriptorToJavaName(s, i, flag1, stringbuffer))
        {
            if (i > 1)
            {
                stringbuffer.append(", ");
            }
        }

        if (flag2)
        {
            stringbuffer.append("): ");
            typeDescriptorToJavaName(s, j + 1, flag1, stringbuffer);
        } else
        {
            stringbuffer.append(')');
        }
        return stringbuffer.toString();
    }

    private static int typeDescriptorToJavaName(char ac[], int i, boolean flag, StringBuffer stringbuffer)
    {
        char c;
        int j1;
        j1 = 0;
        int j;
        for (j = i; ac[j] == '['; j++)
        {
            j1++;
        }

        i = j + 1;
        c = ac[j];
        c;
        JVM INSTR lookupswitch 10: default 132
    //                   66: 327
    //                   67: 337
    //                   68: 347
    //                   70: 357
    //                   73: 367
    //                   74: 377
    //                   76: 160
    //                   83: 387
    //                   86: 407
    //                   90: 397;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11
_L1:
        throw new IllegalStateException((new StringBuilder()).append("unknown type descriptor element: ").append(c).toString());
_L8:
        int l;
        if (flag)
        {
            int k1 = -1;
            for (int k = i; ac[k] != ';'; k++)
            {
                if (ac[k] == '/')
                {
                    k1 = k;
                }
            }

            if (k1 > 0)
            {
                i = k1 + 1;
            }
            do
            {
                l = i;
                if (ac[i] == ';')
                {
                    break;
                }
                stringbuffer.append(ac[i]);
                i++;
            } while (true);
        } else
        {
            do
            {
                l = i;
                if (ac[i] == ';')
                {
                    break;
                }
                char c1 = ac[i];
                if (c1 == '/')
                {
                    c1 = '.';
                }
                stringbuffer.append(c1);
                i++;
            } while (true);
        }
        i = l + 1;
_L13:
        if (j1 > 0)
        {
            stringbuffer.append(' ');
            for (int i1 = 0; i1 < j1; i1++)
            {
                stringbuffer.append("[]");
            }

        }
        break; /* Loop/switch isn't completed */
_L2:
        stringbuffer.append("byte");
        continue; /* Loop/switch isn't completed */
_L3:
        stringbuffer.append("char");
        continue; /* Loop/switch isn't completed */
_L4:
        stringbuffer.append("double");
        continue; /* Loop/switch isn't completed */
_L5:
        stringbuffer.append("float");
        continue; /* Loop/switch isn't completed */
_L6:
        stringbuffer.append("int");
        continue; /* Loop/switch isn't completed */
_L7:
        stringbuffer.append("long");
        continue; /* Loop/switch isn't completed */
_L9:
        stringbuffer.append("short");
        continue; /* Loop/switch isn't completed */
_L11:
        stringbuffer.append("boolean");
        continue; /* Loop/switch isn't completed */
_L10:
        stringbuffer.append("void");
        if (true) goto _L13; else goto _L12
_L12:
        return i;
    }

    public static String vmNameToJavaName(String s)
    {
        if (s == null)
        {
            return null;
        } else
        {
            return s.replace('/', '.');
        }
    }
}
