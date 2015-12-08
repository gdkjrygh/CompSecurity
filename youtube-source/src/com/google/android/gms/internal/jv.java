// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

// Referenced classes of package com.google.android.gms.internal:
//            jt

public final class jv
{

    public static String a(jt jt1)
    {
        if (jt1 == null)
        {
            return "";
        }
        StringBuffer stringbuffer = new StringBuffer();
        try
        {
            a(null, jt1, new StringBuffer(), stringbuffer);
        }
        // Misplaced declaration of an exception variable
        catch (jt jt1)
        {
            return (new StringBuilder("Error printing proto: ")).append(jt1.getMessage()).toString();
        }
        // Misplaced declaration of an exception variable
        catch (jt jt1)
        {
            return (new StringBuilder("Error printing proto: ")).append(jt1.getMessage()).toString();
        }
        return stringbuffer.toString();
    }

    private static String a(String s)
    {
        StringBuffer stringbuffer = new StringBuffer();
        int i = 0;
        while (i < s.length()) 
        {
            char c = s.charAt(i);
            if (i == 0)
            {
                stringbuffer.append(Character.toLowerCase(c));
            } else
            if (Character.isUpperCase(c))
            {
                stringbuffer.append('_').append(Character.toLowerCase(c));
            } else
            {
                stringbuffer.append(c);
            }
            i++;
        }
        return stringbuffer.toString();
    }

    private static void a(String s, Object obj, StringBuffer stringbuffer, StringBuffer stringbuffer1)
    {
        if (obj == null) goto _L2; else goto _L1
_L1:
        if (!(obj instanceof jt)) goto _L4; else goto _L3
_L3:
        Class class1;
        Object aobj[];
        int i;
        int l;
        int j1;
        j1 = stringbuffer.length();
        if (s != null)
        {
            stringbuffer1.append(stringbuffer).append(a(s)).append(" <\n");
            stringbuffer.append("  ");
        }
        class1 = obj.getClass();
        aobj = class1.getFields();
        int k1 = aobj.length;
        i = 0;
        while (i < k1) 
        {
            Object obj1 = aobj[i];
            int j = ((Field) (obj1)).getModifiers();
            String s1 = ((Field) (obj1)).getName();
            if ((j & 1) == 1 && (j & 8) != 8 && !s1.startsWith("_") && !s1.endsWith("_"))
            {
                Class class2 = ((Field) (obj1)).getType();
                obj1 = ((Field) (obj1)).get(obj);
                if (class2.isArray())
                {
                    if (class2.getComponentType() == Byte.TYPE)
                    {
                        a(s1, obj1, stringbuffer, stringbuffer1);
                    } else
                    {
                        int k;
                        int i1;
                        if (obj1 == null)
                        {
                            k = 0;
                        } else
                        {
                            k = Array.getLength(obj1);
                        }
                        i1 = 0;
                        while (i1 < k) 
                        {
                            a(s1, Array.get(obj1, i1), stringbuffer, stringbuffer1);
                            i1++;
                        }
                    }
                } else
                {
                    a(s1, obj1, stringbuffer, stringbuffer1);
                }
            }
            i++;
        }
        aobj = class1.getMethods();
        l = aobj.length;
        i = 0;
_L6:
        String s2;
        if (i >= l)
        {
            break; /* Loop/switch isn't completed */
        }
        s2 = aobj[i].getName();
        if (!s2.startsWith("set"))
        {
            break MISSING_BLOCK_LABEL_390;
        }
        s2 = s2.substring(3);
        Method method = class1.getMethod((new StringBuilder("has")).append(s2).toString(), new Class[0]);
        if (!((Boolean)method.invoke(obj, new Object[0])).booleanValue())
        {
            break MISSING_BLOCK_LABEL_390;
        }
        method = class1.getMethod((new StringBuilder("get")).append(s2).toString(), new Class[0]);
        a(s2, method.invoke(obj, new Object[0]), stringbuffer, stringbuffer1);
_L7:
        i++;
        if (true) goto _L6; else goto _L5
_L5:
        if (s != null)
        {
            stringbuffer.setLength(j1);
            stringbuffer1.append(stringbuffer).append(">\n");
        }
_L2:
        return;
_L4:
        s = a(s);
        stringbuffer1.append(stringbuffer).append(s).append(": ");
        if (obj instanceof String)
        {
            obj = (String)obj;
            s = ((String) (obj));
            if (!((String) (obj)).startsWith("http"))
            {
                s = ((String) (obj));
                if (((String) (obj)).length() > 200)
                {
                    s = (new StringBuilder()).append(((String) (obj)).substring(0, 200)).append("[...]").toString();
                }
            }
            s = b(s);
            stringbuffer1.append("\"").append(s).append("\"");
        } else
        if (obj instanceof byte[])
        {
            a((byte[])obj, stringbuffer1);
        } else
        {
            stringbuffer1.append(obj);
        }
        stringbuffer1.append("\n");
        return;
        NoSuchMethodException nosuchmethodexception;
        nosuchmethodexception;
          goto _L7
        nosuchmethodexception;
          goto _L7
    }

    private static void a(byte abyte0[], StringBuffer stringbuffer)
    {
        if (abyte0 == null)
        {
            stringbuffer.append("\"\"");
            return;
        }
        stringbuffer.append('"');
        int i = 0;
        while (i < abyte0.length) 
        {
            byte byte0 = abyte0[i];
            if (byte0 == 92 || byte0 == 34)
            {
                stringbuffer.append('\\').append((char)byte0);
            } else
            if (byte0 >= 32 && byte0 < 127)
            {
                stringbuffer.append((char)byte0);
            } else
            {
                stringbuffer.append(String.format("\\%03o", new Object[] {
                    Integer.valueOf(byte0)
                }));
            }
            i++;
        }
        stringbuffer.append('"');
    }

    private static String b(String s)
    {
        int j = s.length();
        StringBuilder stringbuilder = new StringBuilder(j);
        int i = 0;
        while (i < j) 
        {
            char c = s.charAt(i);
            if (c >= ' ' && c <= '~' && c != '"' && c != '\'')
            {
                stringbuilder.append(c);
            } else
            {
                stringbuilder.append(String.format("\\u%04x", new Object[] {
                    Integer.valueOf(c)
                }));
            }
            i++;
        }
        return stringbuilder.toString();
    }
}
