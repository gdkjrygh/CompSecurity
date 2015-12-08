// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.kobjects.pim;

import java.io.IOException;
import java.io.Writer;
import java.util.Enumeration;

// Referenced classes of package org.kobjects.pim:
//            PimItem, PimField

public class PimWriter
{

    Writer writer;

    public PimWriter(Writer writer1)
    {
        writer = writer1;
    }

    public void writeEntry(PimItem pimitem)
        throws IOException
    {
        writer.write("begin:");
        writer.write(pimitem.getType());
        writer.write("\r\n");
        for (Enumeration enumeration = pimitem.fieldNames(); enumeration.hasMoreElements();)
        {
            String s = (String)enumeration.nextElement();
            int i = 0;
            while (i < pimitem.getFieldCount(s)) 
            {
                PimField pimfield = pimitem.getField(s, i);
                writer.write(s);
                writer.write(58);
                writer.write(pimfield.getValue().toString());
                writer.write("\r\n");
                i++;
            }
        }

        writer.write("end:");
        writer.write(pimitem.getType());
        writer.write("\r\n\r\n");
    }
}
