// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.a.c.c;

import java.io.File;
import java.io.PrintStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;

public final class a
{

    public static String a = "\r\n";
    private static long b = 0L;
    private static final SimpleDateFormat c = new SimpleDateFormat("yyyy-MM-dd kk:mm:ss:SSS");

    public static String a(Object obj)
    {
        if (obj == null)
        {
            return "null";
        }
        if (obj instanceof Object[])
        {
            return (new StringBuilder("[Object[]: ")).append(((Object[])obj).length).append("]").toString();
        }
        if (obj instanceof char[])
        {
            return (new StringBuilder("[char[]: ")).append(((char[])obj).length).append("]").toString();
        }
        if (obj instanceof byte[])
        {
            return (new StringBuilder("[byte[]: ")).append(((byte[])obj).length).append("]").toString();
        }
        if (obj instanceof short[])
        {
            return (new StringBuilder("[short[]: ")).append(((short[])obj).length).append("]").toString();
        }
        if (obj instanceof int[])
        {
            return (new StringBuilder("[int[]: ")).append(((int[])obj).length).append("]").toString();
        }
        if (obj instanceof long[])
        {
            return (new StringBuilder("[long[]: ")).append(((long[])obj).length).append("]").toString();
        }
        if (obj instanceof float[])
        {
            return (new StringBuilder("[float[]: ")).append(((float[])obj).length).append("]").toString();
        }
        if (obj instanceof double[])
        {
            return (new StringBuilder("[double[]: ")).append(((double[])obj).length).append("]").toString();
        }
        if (obj instanceof boolean[])
        {
            return (new StringBuilder("[boolean[]: ")).append(((boolean[])obj).length).append("]").toString();
        } else
        {
            return obj.getClass().getName();
        }
    }

    private static String a(String s, byte abyte0[])
    {
        StringBuffer stringbuffer = new StringBuffer();
        if (abyte0 != null) goto _L2; else goto _L1
_L1:
        stringbuffer.append((new StringBuilder(String.valueOf(s))).append(" (").append(null).append(")").append(a).toString());
_L4:
        return stringbuffer.toString();
_L2:
        stringbuffer.append((new StringBuilder(String.valueOf(s))).append(" (").append(abyte0.length).append(")").append(a).toString());
        int i = 0;
        do
        {
label0:
            {
                if (i < 250 && i < abyte0.length)
                {
                    break label0;
                }
                if (abyte0.length > 250)
                {
                    stringbuffer.append((new StringBuilder("\t...")).append(a).toString());
                }
                stringbuffer.append(a);
            }
            if (true)
            {
                continue;
            }
            int j = abyte0[i] & 0xff;
            char c1;
            if (j == 0 || j == 10 || j == 11 || j == 13)
            {
                c1 = ' ';
            } else
            {
                c1 = (char)j;
            }
            stringbuffer.append((new StringBuilder("\t")).append(i).append(": ").append(j).append(" (").append(c1).append(", 0x").append(Integer.toHexString(j)).append(")").append(a).toString());
            i++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    private static String a(String s, int ai[])
    {
        StringBuffer stringbuffer = new StringBuffer();
        if (ai != null) goto _L2; else goto _L1
_L1:
        stringbuffer.append((new StringBuilder(String.valueOf(s))).append(" (").append(null).append(")").append(a).toString());
_L4:
        return stringbuffer.toString();
_L2:
        stringbuffer.append((new StringBuilder(String.valueOf(s))).append(" (").append(ai.length).append(")").append(a).toString());
        int i = 0;
        do
        {
label0:
            {
                if (i < ai.length)
                {
                    break label0;
                }
                stringbuffer.append(a);
            }
            if (true)
            {
                continue;
            }
            stringbuffer.append((new StringBuilder("\t")).append(ai[i]).append(a).toString());
            i++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    private static String a(Throwable throwable, int i)
    {
        StringBuffer stringbuffer = new StringBuffer();
        if (throwable == null) goto _L2; else goto _L1
_L1:
        throwable = throwable.getStackTrace();
        if (throwable == null) goto _L4; else goto _L3
_L3:
        if (i < throwable.length) goto _L5; else goto _L4
_L4:
        stringbuffer.append(a);
_L2:
        return stringbuffer.toString();
_L5:
        StackTraceElement stacktraceelement = throwable[i];
        stringbuffer.append((new StringBuilder("\tat ")).append(stacktraceelement.getClassName()).append(".").append(stacktraceelement.getMethodName()).append("(").append(stacktraceelement.getFileName()).append(":").append(stacktraceelement.getLineNumber()).append(")").append(a).toString());
        i++;
        if (true) goto _L3; else goto _L6
_L6:
    }

    public static void a(String s, int i)
    {
        s = (new StringBuilder(String.valueOf(s))).append(": ").append(i).toString();
        System.out.println(s);
    }

    public static void a(String s, Object obj)
    {
        if (obj == null)
        {
            a(s, "null");
            return;
        }
        if (!(obj instanceof char[])) goto _L2; else goto _L1
_L1:
        StringBuffer stringbuffer;
        obj = (char[])obj;
        stringbuffer = new StringBuffer();
        if (obj != null) goto _L4; else goto _L3
_L3:
        stringbuffer.append((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf(s))).append(" (").append(null).append(")").toString()))).append(a).toString());
_L6:
        s = stringbuffer.toString();
        System.out.println(s);
        return;
_L4:
        stringbuffer.append((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf(s))).append(" (").append(obj.length).append(")").toString()))).append(a).toString());
        int i = 0;
        do
        {
            if (i >= obj.length)
            {
                stringbuffer.append(a);
                continue; /* Loop/switch isn't completed */
            }
            stringbuffer.append((new StringBuilder(String.valueOf((new StringBuilder("\t")).append(obj[i]).append(" (").append(obj[i] & 0xff).toString()))).append(")").append(a).toString());
            i++;
        } while (true);
_L2:
        if (obj instanceof byte[])
        {
            s = a(s, (byte[])obj);
            System.out.println(s);
            return;
        }
        if (obj instanceof int[])
        {
            s = a(s, (int[])obj);
            System.out.println(s);
            return;
        }
        if (obj instanceof String)
        {
            a(s, (String)obj);
            return;
        }
        if (obj instanceof List)
        {
            a(s, (List)obj);
            return;
        }
        if (obj instanceof Map)
        {
            a(s, (Map)obj);
            return;
        }
        if (obj instanceof File)
        {
            File file = (File)obj;
            obj = (new StringBuilder(String.valueOf(s))).append(": ");
            if (file == null)
            {
                s = "null";
            } else
            {
                s = file.getPath();
            }
            s = ((StringBuilder) (obj)).append(s).toString();
            System.out.println(s);
            return;
        }
        if (obj instanceof Date)
        {
            obj = (Date)obj;
            SimpleDateFormat simpledateformat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
            if (obj == null)
            {
                obj = "null";
            } else
            {
                obj = simpledateformat.format(((Date) (obj)));
            }
            a(s, ((String) (obj)));
            return;
        }
        if (obj instanceof Calendar)
        {
            obj = (Calendar)obj;
            SimpleDateFormat simpledateformat1 = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
            if (obj == null)
            {
                obj = "null";
            } else
            {
                obj = simpledateformat1.format(((Calendar) (obj)).getTime());
            }
            a(s, ((String) (obj)));
            return;
        }
        a(s, obj.toString());
        return;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public static void a(String s, String s1)
    {
        s = (new StringBuilder(String.valueOf(s))).append(" ").append(s1).toString();
        System.out.println(s);
    }

    private static void a(String s, List list)
    {
        Object obj = new StringBuilder(" [");
        long l = b;
        b = 1L + l;
        obj = ((StringBuilder) (obj)).append(l).append("]").toString();
        s = (new StringBuilder(String.valueOf(s))).append(" (").append(list.size()).append(")").append(((String) (obj))).toString();
        System.out.println(s);
        int i = 0;
        do
        {
            if (i >= list.size())
            {
                System.out.print(a);
                return;
            }
            s = (new StringBuilder("\t")).append(list.get(i).toString()).append(((String) (obj))).toString();
            System.out.println(s);
            i++;
        } while (true);
    }

    private static void a(String s, Map map)
    {
        StringBuffer stringbuffer = new StringBuffer();
        if (map != null) goto _L2; else goto _L1
_L1:
        s = (new StringBuilder(String.valueOf(s))).append(" map: ").append(null).toString();
_L4:
        System.out.println(s);
        return;
_L2:
        ArrayList arraylist = new ArrayList(map.keySet());
        stringbuffer.append((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf(s))).append(" map: ").append(arraylist.size()).toString()))).append(a).toString());
        int i = 0;
        do
        {
label0:
            {
                if (i < arraylist.size())
                {
                    break label0;
                }
                stringbuffer.append(a);
                s = stringbuffer.toString();
            }
            if (true)
            {
                continue;
            }
            s = ((String) (arraylist.get(i)));
            Object obj = map.get(s);
            stringbuffer.append((new StringBuilder(String.valueOf((new StringBuilder("\t")).append(i).append(": '").append(s).append("' -> '").append(obj).append("'").toString()))).append(a).toString());
            i++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static void a(Throwable throwable)
    {
        StringBuffer stringbuffer = new StringBuffer();
        Object obj = c.format(new Date()).toLowerCase();
        stringbuffer.append(a);
        StringBuilder stringbuilder = new StringBuilder("Throwable: ");
        String s;
        if (throwable == null)
        {
            s = "";
        } else
        {
            s = (new StringBuilder("(")).append(throwable.getClass().getName()).append(")").toString();
        }
        stringbuffer.append(stringbuilder.append(s).append(":").append(((String) (obj))).append(a).toString());
        obj = new StringBuilder("Throwable: ");
        if (throwable == null)
        {
            s = "null";
        } else
        {
            s = throwable.getLocalizedMessage();
        }
        stringbuffer.append(((StringBuilder) (obj)).append(s).append(a).toString());
        stringbuffer.append(a);
        stringbuffer.append(a(throwable, 0));
        stringbuffer.append((new StringBuilder("Caught here:")).append(a).toString());
        stringbuffer.append(a(((Throwable) (new Exception())), 1));
        stringbuffer.append(a);
        throwable = stringbuffer.toString();
        System.out.println(throwable);
    }

}
