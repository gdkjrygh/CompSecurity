// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class b
{

    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;

    public b()
    {
    }

    public static String a(String s)
    {
        int k = g.d;
        StringBuffer stringbuffer = new StringBuffer();
        int i = 0;
label0:
        do
        {
            int j;
label1:
            {
                if (i >= s.length())
                {
                    break label0;
                }
                char c1 = s.charAt(i);
                j = i;
                if (c1 == '\\')
                {
                    j = i;
                    if (i < s.length() - 3)
                    {
                        j = i;
                        if (s.charAt(i + 1) != 'r')
                        {
                            break label1;
                        }
                        j = i;
                        if (s.charAt(i + 2) != '\\')
                        {
                            break label1;
                        }
                        j = i;
                        if (s.charAt(i + 3) != 'n')
                        {
                            break label1;
                        }
                        stringbuffer.append('\n');
                        i += 3;
                        j = i;
                        if (k == 0)
                        {
                            break label1;
                        }
                        j = i;
                    }
                }
                stringbuffer.append(c1);
            }
            i = j + 1;
        } while (k == 0);
        return stringbuffer.toString();
    }

    public String a()
    {
        StringBuilder stringbuilder = new StringBuilder();
        if (f != null && f.length() > 0)
        {
            stringbuilder.append(a(f)).append('\n');
        }
        boolean flag1 = false;
        boolean flag = flag1;
        if (b != null)
        {
            flag = flag1;
            if (b.length() > 0)
            {
                stringbuilder.append(b);
                flag = true;
            }
        }
        flag1 = flag;
        if (d != null)
        {
            flag1 = flag;
            if (d.length() > 0)
            {
                if (flag)
                {
                    stringbuilder.append(" ");
                }
                stringbuilder.append(d);
                flag1 = true;
            }
        }
        flag = flag1;
        if (e != null)
        {
            flag = flag1;
            if (e.length() > 0)
            {
                if (flag1)
                {
                    stringbuilder.append(" ");
                }
                stringbuilder.append(e);
                flag = true;
            }
        }
        if (c != null && c.length() > 0)
        {
            if (flag)
            {
                stringbuilder.append(" ");
            }
            stringbuilder.append(c);
        }
        return stringbuilder.toString();
    }

    public String b()
    {
        StringBuilder stringbuilder = new StringBuilder();
        if (f != null)
        {
            stringbuilder.append(f);
        }
        stringbuilder.append(";");
        if (b != null)
        {
            stringbuilder.append(b);
        }
        stringbuilder.append(";");
        if (d != null)
        {
            stringbuilder.append(d);
        }
        stringbuilder.append(";");
        if (e != null)
        {
            stringbuilder.append(e);
        }
        stringbuilder.append(";");
        if (c != null)
        {
            stringbuilder.append(c);
        }
        return stringbuilder.toString();
    }

    public String c()
    {
        return a(f);
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(a(f)).append(" ").append(b).append(" ").append(d).append(" ").append(e).append(" ").append(c);
        return stringbuilder.toString();
    }
}
