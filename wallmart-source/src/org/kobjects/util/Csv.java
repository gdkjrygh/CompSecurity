// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.kobjects.util;

import java.util.Vector;

public class Csv
{

    public Csv()
    {
    }

    public static String[] decode(String s)
    {
        Vector vector;
        int i;
        vector = new Vector();
        i = 0;
_L8:
        int k;
        for (k = s.length(); i < k && s.charAt(i) <= ' '; i++) { }
        if (i < k) goto _L2; else goto _L1
_L2:
        if (s.charAt(i) != '"') goto _L4; else goto _L3
_L3:
        i++;
        stringbuffer = new StringBuffer();
_L6:
        int j;
        j = i + 1;
        c = s.charAt(i);
        if (c == '^' && j < k)
        {
            i = j + 1;
            c = s.charAt(j);
            if (c != '^')
            {
                c -= '@';
            }
            stringbuffer.append(c);
            continue; /* Loop/switch isn't completed */
        }
        if (c != '"')
        {
            break MISSING_BLOCK_LABEL_375;
        }
        if (j == k || s.charAt(j) != '"')
        {
            vector.addElement(stringbuffer.toString());
            for (; j < k && s.charAt(j) <= ' '; j++) { }
            break; /* Loop/switch isn't completed */
        }
        i = j + 1;
_L9:
        stringbuffer.append(c);
        if (true) goto _L6; else goto _L5
_L5:
        if (j >= k) goto _L1; else goto _L7
_L7:
        if (s.charAt(j) != ',')
        {
            throw new RuntimeException((new StringBuilder()).append("Comma expected at ").append(j).append(" line: ").append(s).toString());
        }
        i = j + 1;
          goto _L8
_L4:
label0:
        {
            j = s.indexOf(',', i);
            if (j != -1)
            {
                break label0;
            }
            vector.addElement(s.substring(i).trim());
        }
          goto _L1
        vector.addElement(s.substring(i, j).trim());
        i = j + 1;
          goto _L8
_L1:
        s = new String[vector.size()];
        char c;
        StringBuffer stringbuffer;
        for (i = 0; i < s.length; i++)
        {
            s[i] = (String)vector.elementAt(i);
        }

        return s;
        i = j;
          goto _L9
    }

    public static String encode(String s, char c)
    {
        StringBuffer stringbuffer = new StringBuffer();
        int i = 0;
        while (i < s.length()) 
        {
            char c1 = s.charAt(i);
            if (c1 == c || c1 == '^')
            {
                stringbuffer.append(c1);
                stringbuffer.append(c1);
            } else
            if (c1 < ' ')
            {
                stringbuffer.append('^');
                stringbuffer.append((char)(c1 + 64));
            } else
            {
                stringbuffer.append(c1);
            }
            i++;
        }
        return stringbuffer.toString();
    }

    public static String encode(Object aobj[])
    {
        StringBuffer stringbuffer = new StringBuffer();
        int i = 0;
        while (i < aobj.length) 
        {
            if (i != 0)
            {
                stringbuffer.append(',');
            }
            Object obj = aobj[i];
            if ((obj instanceof Number) || (obj instanceof Boolean))
            {
                stringbuffer.append(obj.toString());
            } else
            {
                stringbuffer.append('"');
                stringbuffer.append(encode(obj.toString(), '"'));
                stringbuffer.append('"');
            }
            i++;
        }
        return stringbuffer.toString();
    }
}
