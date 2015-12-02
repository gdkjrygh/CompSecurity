// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

// Referenced classes of package com.google.android.gms.internal:
//            qw

public final class qx
{

    private static void a(String s, Object obj, StringBuffer stringbuffer, StringBuffer stringbuffer1)
    {
        boolean flag = qw.a;
        if (obj != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (!(obj instanceof qw))
        {
            break; /* Loop/switch isn't completed */
        }
        int l = stringbuffer.length();
        Field afield[];
        Class class1;
        int i1;
        if (s != null)
        {
            try
            {
                stringbuffer1.append(stringbuffer).append(dl(s)).append(" <\n");
                stringbuffer.append("  ");
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s;
            }
        }
        class1 = obj.getClass();
        afield = class1.getFields();
        i1 = afield.length;
        Object obj1;
        Object obj2;
        NoSuchMethodException nosuchmethodexception;
        Class class2;
        Method amethod[];
        Object obj3;
        int j;
        int k;
        boolean flag1;
        for (int i = 0; i >= i1; i++)
        {
            break MISSING_BLOCK_LABEL_261;
        }

        obj3 = afield[i];
        j = ((Field) (obj3)).getModifiers();
        obj2 = ((Field) (obj3)).getName();
        if ((j & 1) != 1 || (j & 8) == 8)
        {
            break MISSING_BLOCK_LABEL_256;
        }
        flag1 = ((String) (obj2)).startsWith("_");
label0:
        {
label1:
            {
label2:
                {
                    if (flag1)
                    {
                        break MISSING_BLOCK_LABEL_256;
                    }
                    try
                    {
                        flag1 = ((String) (obj2)).endsWith("_");
                    }
                    // Misplaced declaration of an exception variable
                    catch (String s)
                    {
                        throw s;
                    }
                    if (flag1)
                    {
                        break MISSING_BLOCK_LABEL_256;
                    }
                    class2 = ((Field) (obj3)).getType();
                    obj3 = ((Field) (obj3)).get(obj);
                    if (!class2.isArray())
                    {
                        break label0;
                    }
                    class2 = class2.getComponentType();
                    try
                    {
                        if (class2 != Byte.TYPE)
                        {
                            break label2;
                        }
                        a(((String) (obj2)), obj3, stringbuffer, stringbuffer1);
                    }
                    // Misplaced declaration of an exception variable
                    catch (String s)
                    {
                        try
                        {
                            throw s;
                        }
                        // Misplaced declaration of an exception variable
                        catch (String s) { }
                        try
                        {
                            throw s;
                        }
                        // Misplaced declaration of an exception variable
                        catch (String s)
                        {
                            throw s;
                        }
                    }
                    if (!flag)
                    {
                        break label1;
                    }
                }
                if (obj3 == null)
                {
                    j = 0;
                } else
                {
                    j = Array.getLength(obj3);
                }
                k = 0;
                do
                {
                    if (k >= j)
                    {
                        break;
                    }
                    a(((String) (obj2)), Array.get(obj3, k), stringbuffer, stringbuffer1);
                    k++;
                } while (!flag);
            }
            if (!flag)
            {
                break MISSING_BLOCK_LABEL_256;
            }
        }
        try
        {
            a(((String) (obj2)), obj3, stringbuffer, stringbuffer1);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_639;
        }
        amethod = class1.getMethods();
        j = amethod.length;
        i = 0;
_L11:
        if (i >= j) goto _L4; else goto _L3
_L3:
        obj1 = amethod[i].getName();
        if (!((String) (obj1)).startsWith("set")) goto _L6; else goto _L5
_L5:
        obj3 = ((String) (obj1)).substring(3);
        obj1 = null;
        obj2 = class1.getMethod((new StringBuilder()).append("has").append(((String) (obj3))).toString(), new Class[0]);
        obj1 = obj2;
_L9:
        try
        {
            flag1 = ((Boolean)((Method) (obj1)).invoke(obj, new Object[0])).booleanValue();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            try
            {
                throw s;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s;
            }
        }
        if (flag1) goto _L7; else goto _L6
_L6:
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_630;
        }
_L4:
        if (s != null)
        {
            try
            {
                stringbuffer.setLength(l);
                stringbuffer1.append(stringbuffer).append(">\n");
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s;
            }
        }
        if (!flag) goto _L1; else goto _L8
_L8:
        s = dl(s);
        stringbuffer1.append(stringbuffer).append(s).append(": ");
        if (!(obj instanceof String))
        {
            break MISSING_BLOCK_LABEL_459;
        }
        s = dm((String)obj);
        stringbuffer1.append("\"").append(s).append("\"");
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_492;
        }
        flag1 = obj instanceof byte[];
        if (flag1)
        {
            try
            {
                a((byte[])(byte[])obj, stringbuffer1);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s;
            }
            if (!flag)
            {
                break MISSING_BLOCK_LABEL_492;
            }
        }
        stringbuffer1.append(obj);
        stringbuffer1.append("\n");
        return;
        s;
        throw s;
        nosuchmethodexception;
        if (!flag) goto _L6; else goto _L9
_L7:
        obj1 = null;
        nosuchmethodexception = class1.getMethod((new StringBuilder()).append("get").append(((String) (obj3))).toString(), new Class[0]);
        obj1 = nosuchmethodexception;
_L10:
        try
        {
            a(((String) (obj3)), ((Method) (obj1)).invoke(obj, new Object[0]), stringbuffer, stringbuffer1);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
        break; /* Loop/switch isn't completed */
        nosuchmethodexception;
        if (!flag) goto _L6; else goto _L10
        s;
        try
        {
            throw s;
        }
        // Misplaced declaration of an exception variable
        catch (String s) { }
        throw s;
        i++;
          goto _L11
    }

    private static void a(byte abyte0[], StringBuffer stringbuffer)
    {
        boolean flag = qw.a;
        if (abyte0 == null)
        {
            stringbuffer.append("\"\"");
            return;
        }
        stringbuffer.append('"');
        int i = 0;
label0:
        do
        {
label1:
            {
                if (i >= abyte0.length)
                {
                    break label0;
                }
                int j = abyte0[i] & 0xff;
                if (j == 92 || j == 34)
                {
                    stringbuffer.append('\\').append((char)j);
                    if (!flag)
                    {
                        break label1;
                    }
                }
                if (j >= 32 && j < 127)
                {
                    stringbuffer.append((char)j);
                    if (!flag)
                    {
                        break label1;
                    }
                }
                stringbuffer.append(String.format("\\%03o", new Object[] {
                    Integer.valueOf(j)
                }));
            }
            i++;
        } while (!flag);
        stringbuffer.append('"');
    }

    private static String bh(String s)
    {
        boolean flag = qw.a;
        int j = s.length();
        StringBuilder stringbuilder = new StringBuilder(j);
        int i = 0;
label0:
        do
        {
label1:
            {
                if (i >= j)
                {
                    break label0;
                }
                char c = s.charAt(i);
                if (c >= ' ' && c <= '~' && c != '"' && c != '\'')
                {
                    stringbuilder.append(c);
                    if (!flag)
                    {
                        break label1;
                    }
                }
                stringbuilder.append(String.format("\\u%04x", new Object[] {
                    Integer.valueOf(c)
                }));
            }
            i++;
        } while (!flag);
        return stringbuilder.toString();
    }

    private static String dl(String s)
    {
        boolean flag = qw.a;
        StringBuffer stringbuffer = new StringBuffer();
        int i = 0;
label0:
        do
        {
label1:
            {
                if (i >= s.length())
                {
                    break label0;
                }
                char c = s.charAt(i);
                if (i == 0)
                {
                    stringbuffer.append(Character.toLowerCase(c));
                    if (!flag)
                    {
                        break label1;
                    }
                }
                if (Character.isUpperCase(c))
                {
                    stringbuffer.append('_').append(Character.toLowerCase(c));
                    if (!flag)
                    {
                        break label1;
                    }
                }
                stringbuffer.append(c);
            }
            i++;
        } while (!flag);
        return stringbuffer.toString();
    }

    private static String dm(String s)
    {
        String s1 = s;
        if (!s.startsWith("http"))
        {
            s1 = s;
            if (s.length() > 200)
            {
                s1 = (new StringBuilder()).append(s.substring(0, 200)).append("[...]").toString();
            }
        }
        return bh(s1);
    }

    public static String g(qw qw1)
    {
        if (qw1 == null)
        {
            return "";
        }
        StringBuffer stringbuffer = new StringBuffer();
        try
        {
            a(null, qw1, new StringBuffer(), stringbuffer);
        }
        // Misplaced declaration of an exception variable
        catch (qw qw1)
        {
            return (new StringBuilder()).append("Error printing proto: ").append(qw1.getMessage()).toString();
        }
        // Misplaced declaration of an exception variable
        catch (qw qw1)
        {
            return (new StringBuilder()).append("Error printing proto: ").append(qw1.getMessage()).toString();
        }
        return stringbuffer.toString();
    }
}
