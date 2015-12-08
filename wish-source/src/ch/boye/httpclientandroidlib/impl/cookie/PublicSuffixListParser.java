// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.impl.cookie;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Collection;

// Referenced classes of package ch.boye.httpclientandroidlib.impl.cookie:
//            PublicSuffixFilter

public class PublicSuffixListParser
{

    private static final int MAX_LINE_LEN = 256;
    private final PublicSuffixFilter filter;

    PublicSuffixListParser(PublicSuffixFilter publicsuffixfilter)
    {
        filter = publicsuffixfilter;
    }

    private boolean readLine(Reader reader, StringBuilder stringbuilder)
        throws IOException
    {
        boolean flag1 = false;
        stringbuilder.setLength(0);
        boolean flag = false;
        do
        {
            char c;
label0:
            {
                int i = reader.read();
                if (i != -1)
                {
                    c = (char)i;
                    if (c != '\n')
                    {
                        break label0;
                    }
                }
                if (i != -1)
                {
                    flag1 = true;
                }
                return flag1;
            }
            if (Character.isWhitespace(c))
            {
                flag = true;
            }
            if (!flag)
            {
                stringbuilder.append(c);
            }
            if (stringbuilder.length() > 256)
            {
                throw new IOException("Line too long");
            }
        } while (true);
    }

    public void parse(Reader reader)
        throws IOException
    {
        ArrayList arraylist = new ArrayList();
        ArrayList arraylist1 = new ArrayList();
        BufferedReader bufferedreader = new BufferedReader(reader);
        StringBuilder stringbuilder = new StringBuilder(256);
        boolean flag = true;
        do
        {
            if (!flag)
            {
                break;
            }
            boolean flag1 = readLine(bufferedreader, stringbuilder);
            Object obj = stringbuilder.toString();
            flag = flag1;
            if (((String) (obj)).length() != 0)
            {
                flag = flag1;
                if (!((String) (obj)).startsWith("//"))
                {
                    reader = ((Reader) (obj));
                    if (((String) (obj)).startsWith("."))
                    {
                        reader = ((String) (obj)).substring(1);
                    }
                    flag = reader.startsWith("!");
                    obj = reader;
                    if (flag)
                    {
                        obj = reader.substring(1);
                    }
                    if (flag)
                    {
                        arraylist1.add(obj);
                        flag = flag1;
                    } else
                    {
                        arraylist.add(obj);
                        flag = flag1;
                    }
                }
            }
        } while (true);
        filter.setPublicSuffixes(arraylist);
        filter.setExceptions(arraylist1);
    }
}
