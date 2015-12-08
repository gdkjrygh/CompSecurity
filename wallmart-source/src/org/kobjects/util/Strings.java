// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.kobjects.util;


public class Strings
{

    public Strings()
    {
    }

    public static String beautify(String s)
    {
        StringBuffer stringbuffer = new StringBuffer();
        if (s.length() > 0)
        {
            stringbuffer.append(Character.toUpperCase(s.charAt(0)));
            for (int i = 1; i < s.length() - 1; i++)
            {
                char c = s.charAt(i);
                if (Character.isUpperCase(c) && Character.isLowerCase(s.charAt(i - 1)) && Character.isLowerCase(s.charAt(i + 1)))
                {
                    stringbuffer.append(" ");
                }
                stringbuffer.append(c);
            }

            if (s.length() > 1)
            {
                stringbuffer.append(s.charAt(s.length() - 1));
            }
        }
        return stringbuffer.toString();
    }

    public static String fill(String s, int i, char c)
    {
        boolean flag;
        if (i < 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        i = Math.abs(i);
        if (s.length() >= i)
        {
            return s;
        }
        StringBuffer stringbuffer = new StringBuffer();
        for (i -= s.length(); i > 0; i--)
        {
            stringbuffer.append(c);
        }

        if (flag)
        {
            stringbuffer.append(s);
            return stringbuffer.toString();
        } else
        {
            return (new StringBuilder()).append(s).append(stringbuffer.toString()).toString();
        }
    }

    public static String lTrim(String s, String s1)
    {
        int i = 0;
        for (int j = s.length(); i < j && (s1 != null ? s1.indexOf(s.charAt(i)) != -1 : s.charAt(i) <= ' '); i++) { }
        if (i == 0)
        {
            return s;
        } else
        {
            return s.substring(i);
        }
    }

    public static String rTrim(String s, String s1)
    {
        int i;
        for (i = s.length() - 1; i >= 0 && (s1 != null ? s1.indexOf(s.charAt(i)) != -1 : s.charAt(i) <= ' '); i--) { }
        if (i == s.length() - 1)
        {
            return s;
        } else
        {
            return s.substring(0, i + 1);
        }
    }

    public static String replace(String s, String s1, String s2)
    {
        int i = s.indexOf(s1);
        if (i == -1)
        {
            return s;
        }
        StringBuffer stringbuffer = new StringBuffer(s.substring(0, i));
        do
        {
            stringbuffer.append(s2);
            int j = i + s1.length();
            i = s.indexOf(s1, j);
            if (i == -1)
            {
                stringbuffer.append(s.substring(j));
                return stringbuffer.toString();
            }
            stringbuffer.append(s.substring(j, i));
        } while (true);
    }

    public static String toAscii(String s)
    {
        StringBuffer stringbuffer;
        int i;
        stringbuffer = new StringBuffer();
        i = 0;
_L2:
        if (i >= s.length())
        {
            break; /* Loop/switch isn't completed */
        }
        char c = s.charAt(i);
        if (c <= ' ')
        {
            stringbuffer.append(' ');
        } else
        if (c < '\177')
        {
            stringbuffer.append(c);
        } else
        {
            switch (c)
            {
            default:
                stringbuffer.append('?');
                break;

            case 196: 
                stringbuffer.append("Ae");
                break;

            case 228: 
                stringbuffer.append("ae");
                break;

            case 214: 
                stringbuffer.append("Oe");
                break;

            case 246: 
                stringbuffer.append("oe");
                break;

            case 220: 
                stringbuffer.append("Ue");
                break;

            case 252: 
                stringbuffer.append("ue");
                break;

            case 223: 
                stringbuffer.append("ss");
                break;
            }
            continue; /* Loop/switch isn't completed */
        }
_L4:
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        return stringbuffer.toString();
        if (true) goto _L4; else goto _L3
_L3:
    }
}
