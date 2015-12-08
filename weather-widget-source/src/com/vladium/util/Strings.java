// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.util;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

// Referenced classes of package com.vladium.util:
//            Files

public abstract class Strings
{

    private static final boolean USE_GET_CHARS = true;
    public static final String WHITE_SPACE = " \t\r\n";

    private Strings()
    {
    }

    public static String HTMLEscape(String s)
    {
        StringBuffer stringbuffer = new StringBuffer();
        HTMLEscape(s, stringbuffer);
        return stringbuffer.toString();
    }

    public static void HTMLEscape(String s, StringBuffer stringbuffer)
    {
        char ac[];
        int i;
        int j;
        if (s == null)
        {
            throw new IllegalArgumentException("null input: s");
        }
        if (stringbuffer == null)
        {
            throw new IllegalArgumentException("null input: append");
        }
        ac = s.toCharArray();
        i = 0;
        j = s.length();
_L7:
        char c;
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_151;
        }
        c = ac[i];
        c;
        JVM INSTR lookupswitch 4: default 96
    //                   34: 131
    //                   38: 141
    //                   60: 111
    //                   62: 121;
           goto _L1 _L2 _L3 _L4 _L5
_L3:
        break MISSING_BLOCK_LABEL_141;
_L4:
        break; /* Loop/switch isn't completed */
_L1:
        stringbuffer.append(c);
_L8:
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        stringbuffer.append("&lt;");
          goto _L8
_L5:
        stringbuffer.append("&gt;");
          goto _L8
_L2:
        stringbuffer.append("&#34;");
          goto _L8
        stringbuffer.append("&amp;");
          goto _L8
    }

    public static void HTMLEscapeNB(String s, StringBuffer stringbuffer)
    {
        char ac[];
        int i;
        int j;
        if (s == null)
        {
            throw new IllegalArgumentException("null input: s");
        }
        if (stringbuffer == null)
        {
            throw new IllegalArgumentException("null input: append");
        }
        ac = s.toCharArray();
        i = 0;
        j = s.length();
_L9:
        char c;
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_188;
        }
        c = ac[i];
        c;
        JVM INSTR lookupswitch 6: default 112
    //                   9: 138
    //                   32: 127
    //                   34: 168
    //                   38: 178
    //                   60: 148
    //                   62: 158;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L5:
        break MISSING_BLOCK_LABEL_178;
_L3:
        break; /* Loop/switch isn't completed */
_L1:
        stringbuffer.append(c);
_L10:
        i++;
        if (true) goto _L9; else goto _L8
_L8:
        stringbuffer.append('\240');
          goto _L10
_L2:
        stringbuffer.append("\240\240\240\240\240\240\240\240");
          goto _L10
_L6:
        stringbuffer.append("&lt;");
          goto _L10
_L7:
        stringbuffer.append("&gt;");
          goto _L10
_L4:
        stringbuffer.append("&#34;");
          goto _L10
        stringbuffer.append("&amp;");
          goto _L10
    }

    public static String HTMLEscapeSP(String s)
    {
        StringBuffer stringbuffer = new StringBuffer();
        HTMLEscapeNB(s, stringbuffer);
        return stringbuffer.toString();
    }

    public static String[] merge(String as[], String s, boolean flag)
    {
        int j;
        if (as != null)
        {
            if ((j = as.length) != 0)
            {
                if (s == null || s.length() == 0)
                {
                    throw new IllegalArgumentException("null/empty input: delimiters");
                }
                HashSet hashset = new HashSet(j);
                ArrayList arraylist = new ArrayList(j);
                int i = 0;
                while (i < j) 
                {
                    Object obj = as[i];
                    if (!flag || obj != null)
                    {
                        obj = new StringTokenizer(((String) (obj)), s);
                        while (((StringTokenizer) (obj)).hasMoreTokens()) 
                        {
                            String s1 = ((StringTokenizer) (obj)).nextToken();
                            if (hashset.add(s1))
                            {
                                arraylist.add(s1);
                            }
                        }
                    }
                    i++;
                }
                as = new String[arraylist.size()];
                arraylist.toArray(as);
                return as;
            }
        }
        return as;
    }

    public static String[] mergeAT(String as[], String s, boolean flag)
        throws IOException
    {
        String as1[];
        if (!flag)
        {
            as1 = merge(as, s, true);
        } else
        {
            as1 = as;
            if (as != null)
            {
                int k = as.length;
                as1 = as;
                if (k != 0)
                {
                    if (s == null || s.length() == 0)
                    {
                        throw new IllegalArgumentException("null/empty input: delimiters");
                    }
                    HashSet hashset = new HashSet(k);
                    ArrayList arraylist = new ArrayList(k);
                    int i = 0;
                    while (i < k) 
                    {
                        Object obj = as[i];
                        if (obj != null)
                        {
                            obj = new StringTokenizer(((String) (obj)), s);
                            while (((StringTokenizer) (obj)).hasMoreTokens()) 
                            {
                                Object obj1 = ((StringTokenizer) (obj)).nextToken();
                                if (((String) (obj1)).startsWith("@"))
                                {
                                    obj1 = Files.readFileList(new File(((String) (obj1)).substring(1)));
                                    int j = 0;
                                    while (j < obj1.length) 
                                    {
                                        Object obj2 = obj1[j];
                                        if (hashset.add(obj2))
                                        {
                                            arraylist.add(obj2);
                                        }
                                        j++;
                                    }
                                } else
                                if (hashset.add(obj1))
                                {
                                    arraylist.add(obj1);
                                }
                            }
                        }
                        i++;
                    }
                    as = new String[arraylist.size()];
                    arraylist.toArray(as);
                    return as;
                }
            }
        }
        return as1;
    }

    public static String[] removeDuplicates(String as[], boolean flag)
    {
        if (as != null) goto _L2; else goto _L1
_L1:
        int j;
        return as;
_L2:
        if ((j = as.length) == 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        HashSet hashset = new HashSet(j);
        ArrayList arraylist = new ArrayList(j);
        int i = 0;
        do
        {
            if (i >= j)
            {
                break;
            }
            String s = as[i];
            if ((!flag || s != null) && hashset.add(s))
            {
                arraylist.add(s);
            }
            i++;
        } while (true);
        i = arraylist.size();
        if (i != j)
        {
            as = new String[i];
            arraylist.toArray(as);
            return as;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    public static String toListForm(String as[], char c)
    {
        if (as == null)
        {
            return null;
        }
        if (as.length == 0)
        {
            return "";
        }
        StringBuffer stringbuffer = new StringBuffer();
        int i = 0;
        for (int j = as.length; i < j; i++)
        {
            if (i != 0)
            {
                stringbuffer.append(c);
            }
            stringbuffer.append(as[i]);
        }

        return stringbuffer.toString();
    }
}
