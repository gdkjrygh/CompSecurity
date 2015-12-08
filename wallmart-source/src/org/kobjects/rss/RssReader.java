// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.kobjects.rss;

import java.io.IOException;
import java.io.Reader;
import org.kobjects.xml.XmlReader;

public class RssReader
{

    public static final int AUTHOR = 4;
    public static final int DATE = 3;
    public static final int DESCRIPTION = 2;
    public static final int LINK = 1;
    public static final int TITLE = 0;
    XmlReader xr;

    public RssReader(Reader reader)
        throws IOException
    {
        xr = new XmlReader(reader);
    }

    public String[] next()
        throws IOException
    {
        String as[];
label0:
        {
            String as1[] = new String[5];
            while (xr.next() != 1) 
            {
                if (xr.getType() == 2)
                {
                    String s = xr.getName().toLowerCase();
                    if (s.equals("item") || s.endsWith(":item"))
                    {
                        do
                        {
                            as = as1;
                            if (xr.next() == 3)
                            {
                                break;
                            }
                            if (xr.getType() == 2)
                            {
                                Object obj = xr.getName().toLowerCase();
                                int i = ((String) (obj)).indexOf(":");
                                as = ((String []) (obj));
                                if (i != -1)
                                {
                                    as = ((String) (obj)).substring(i + 1);
                                }
                                obj = new StringBuffer();
                                readText(((StringBuffer) (obj)));
                                obj = ((StringBuffer) (obj)).toString();
                                if (as.equals("title"))
                                {
                                    as1[0] = ((String) (obj));
                                } else
                                if (as.equals("link"))
                                {
                                    as1[1] = ((String) (obj));
                                } else
                                if (as.equals("description"))
                                {
                                    as1[2] = ((String) (obj));
                                } else
                                if (as.equals("date"))
                                {
                                    as1[3] = ((String) (obj));
                                } else
                                if (as.equals("author"))
                                {
                                    as1[4] = ((String) (obj));
                                }
                            }
                        } while (true);
                        break label0;
                    }
                }
            }
            as = null;
        }
        return as;
    }

    void readText(StringBuffer stringbuffer)
        throws IOException
    {
        do
        {
            if (xr.next() == 3)
            {
                break;
            }
            switch (xr.getType())
            {
            case 2: // '\002'
                readText(stringbuffer);
                break;

            case 4: // '\004'
                stringbuffer.append(xr.getText());
                break;
            }
        } while (true);
    }
}
