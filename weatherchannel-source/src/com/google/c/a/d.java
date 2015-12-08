// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.c.a;


public final class d
{

    public static int a(int i, int j)
    {
        return a(i, j, "index");
    }

    public static int a(int i, int j, String s)
    {
        if (i < 0 || i >= j)
        {
            throw new IndexOutOfBoundsException(c(i, j, s));
        } else
        {
            return i;
        }
    }

    public static Object a(Object obj)
    {
        if (obj == null)
        {
            throw new NullPointerException();
        } else
        {
            return obj;
        }
    }

    public static Object a(Object obj, Object obj1)
    {
        if (obj == null)
        {
            throw new NullPointerException(String.valueOf(obj1));
        } else
        {
            return obj;
        }
    }

    static transient String a(String s, Object aobj[])
    {
        StringBuilder stringbuilder;
label0:
        {
            int i = 0;
            s = String.valueOf(s);
            stringbuilder = new StringBuilder(s.length() + aobj.length * 16);
            int j = 0;
label1:
            do
            {
                int k;
label2:
                {
                    if (i < aobj.length)
                    {
                        k = s.indexOf("%s", j);
                        if (k != -1)
                        {
                            break label2;
                        }
                    }
                    stringbuilder.append(s.substring(j));
                    if (i >= aobj.length)
                    {
                        break label0;
                    }
                    stringbuilder.append(" [");
                    stringbuilder.append(aobj[i]);
                    for (i++; i < aobj.length; i++)
                    {
                        stringbuilder.append(", ");
                        stringbuilder.append(aobj[i]);
                    }

                    break label1;
                }
                stringbuilder.append(s.substring(j, k));
                stringbuilder.append(aobj[i]);
                j = k + 2;
                i++;
            } while (true);
            stringbuilder.append(']');
        }
        return stringbuilder.toString();
    }

    public static void a(int i, int j, int k)
    {
        if (i < 0 || j < i || j > k)
        {
            throw new IndexOutOfBoundsException(b(i, j, k));
        } else
        {
            return;
        }
    }

    public static void a(boolean flag)
    {
        if (!flag)
        {
            throw new IllegalArgumentException();
        } else
        {
            return;
        }
    }

    public static void a(boolean flag, Object obj)
    {
        if (!flag)
        {
            throw new IllegalStateException(String.valueOf(obj));
        } else
        {
            return;
        }
    }

    public static int b(int i, int j)
    {
        return b(i, j, "index");
    }

    public static int b(int i, int j, String s)
    {
        if (i < 0 || i > j)
        {
            throw new IndexOutOfBoundsException(d(i, j, s));
        } else
        {
            return i;
        }
    }

    private static String b(int i, int j, int k)
    {
        if (i < 0 || i > k)
        {
            return d(i, k, "start index");
        }
        if (j < 0 || j > k)
        {
            return d(j, k, "end index");
        } else
        {
            return a("end index (%s) must not be less than start index (%s)", new Object[] {
                Integer.valueOf(j), Integer.valueOf(i)
            });
        }
    }

    private static String c(int i, int j, String s)
    {
        if (i < 0)
        {
            return a("%s (%s) must not be negative", new Object[] {
                s, Integer.valueOf(i)
            });
        }
        if (j < 0)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("negative size: ").append(j).toString());
        } else
        {
            return a("%s (%s) must be less than size (%s)", new Object[] {
                s, Integer.valueOf(i), Integer.valueOf(j)
            });
        }
    }

    private static String d(int i, int j, String s)
    {
        if (i < 0)
        {
            return a("%s (%s) must not be negative", new Object[] {
                s, Integer.valueOf(i)
            });
        }
        if (j < 0)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("negative size: ").append(j).toString());
        } else
        {
            return a("%s (%s) must not be greater than size (%s)", new Object[] {
                s, Integer.valueOf(i), Integer.valueOf(j)
            });
        }
    }
}
