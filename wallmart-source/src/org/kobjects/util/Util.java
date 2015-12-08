// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.kobjects.util;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public final class Util
{

    public Util()
    {
    }

    public static String buildUrl(String s, String s1)
    {
        int i = s1.indexOf(':');
        if (!s1.startsWith("/") && i != 1) goto _L2; else goto _L1
_L1:
        String s2 = (new StringBuilder()).append("file:///").append(s1).toString();
_L4:
        return s2;
_L2:
        if (i <= 2)
        {
            break; /* Loop/switch isn't completed */
        }
        s2 = s1;
        if (i < 6) goto _L4; else goto _L3
_L3:
        if (s != null) goto _L6; else goto _L5
_L5:
        s = "file:///";
_L8:
        return (new StringBuilder()).append(s).append(s1).toString();
_L6:
        String s3 = s;
        if (s.indexOf(':') == -1)
        {
            s3 = (new StringBuilder()).append("file:///").append(s).toString();
        }
        s = s3;
        if (!s3.endsWith("/"))
        {
            s = (new StringBuilder()).append(s3).append("/").toString();
        }
        if (true) goto _L8; else goto _L7
_L7:
    }

    public static int indexOf(Object aobj[], Object obj)
    {
        for (int i = 0; i < aobj.length; i++)
        {
            if (aobj[i].equals(obj))
            {
                return i;
            }
        }

        return -1;
    }

    public static void sort(Object aobj[], int i, int j)
    {
        if (j - i <= 2)
        {
            if (j - i == 2 && aobj[i].toString().compareTo(aobj[i + 1].toString()) > 0)
            {
                Object obj = aobj[i];
                aobj[i] = aobj[i + 1];
                aobj[i + 1] = obj;
            }
            return;
        }
        if (j - i == 3)
        {
            sort(aobj, i, i + 2);
            sort(aobj, i + 1, i + 3);
            sort(aobj, i, i + 2);
            return;
        }
        int j1 = (i + j) / 2;
        sort(aobj, i, j1);
        sort(aobj, j1, j);
        Object aobj1[] = new Object[j - i];
        int i1 = i;
        int k = j1;
        int l = 0;
        while (l < aobj1.length) 
        {
            if (i1 == j1)
            {
                aobj1[l] = aobj[k];
                k++;
            } else
            if (k == j || aobj[i1].toString().compareTo(aobj[k].toString()) < 0)
            {
                aobj1[l] = aobj[i1];
                i1++;
            } else
            {
                aobj1[l] = aobj[k];
                k++;
            }
            l++;
        }
        System.arraycopy(((Object) (aobj1)), 0, ((Object) (aobj)), i, aobj1.length);
    }

    public static OutputStream streamcopy(InputStream inputstream, OutputStream outputstream)
        throws IOException
    {
        byte abyte0[];
        int i;
        if (Runtime.getRuntime().freeMemory() >= 0x100000L)
        {
            i = 16384;
        } else
        {
            i = 128;
        }
        abyte0 = new byte[i];
        do
        {
            i = inputstream.read(abyte0, 0, abyte0.length);
            if (i == -1)
            {
                inputstream.close();
                return outputstream;
            }
            outputstream.write(abyte0, 0, i);
        } while (true);
    }
}
