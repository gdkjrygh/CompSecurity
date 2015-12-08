// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.kobjects.pim;

import java.io.IOException;
import java.io.PrintStream;
import java.io.Reader;
import java.util.Vector;
import org.kobjects.io.LookAheadReader;

// Referenced classes of package org.kobjects.pim:
//            PimItem, PimField

public class PimParser
{

    LookAheadReader reader;
    Class type;

    public PimParser(Reader reader1, Class class1)
    {
        reader = new LookAheadReader(reader1);
        type = class1;
    }

    String[] readArrayValue(int i)
        throws IOException
    {
        Vector vector;
        String as[];
        boolean flag;
        vector = new Vector();
        as = new StringBuffer();
        flag = true;
_L6:
        as.append(reader.readTo(";\n\r"));
        reader.read();
        JVM INSTR lookupswitch 3: default 76
    //                   10: 183
    //                   13: 162
    //                   59: 142;
           goto _L1 _L2 _L3 _L4
_L2:
        break MISSING_BLOCK_LABEL_183;
_L1:
        boolean flag1 = flag;
_L7:
        flag = flag1;
        if (flag1) goto _L6; else goto _L5
_L5:
        if (as.length() != 0)
        {
            vector.addElement(as.toString());
        }
        as = new String[i];
        for (i = 0; i < Math.min(as.length, vector.size()); i++)
        {
            as[i] = (String)vector.elementAt(i);
        }

        break MISSING_BLOCK_LABEL_217;
_L4:
        vector.addElement(as.toString());
        as.setLength(0);
        flag1 = flag;
          goto _L7
_L3:
        if (reader.peek(0) == 10)
        {
            reader.read();
        }
        if (reader.peek(0) != 32)
        {
            flag1 = false;
        } else
        {
            reader.read();
            flag1 = flag;
        }
          goto _L7
        return as;
    }

    public PimItem readItem()
        throws IOException
    {
        PimItem pimitem;
        String s = readName();
        if (s == null)
        {
            return null;
        }
        if (!s.equals("begin"))
        {
            throw new RuntimeException("'begin:' expected");
        }
        try
        {
            pimitem = (PimItem)type.newInstance();
        }
        catch (Exception exception)
        {
            throw new RuntimeException(exception.toString());
        }
        reader.read();
        if (!pimitem.getType().equals(readStringValue().toLowerCase()))
        {
            throw new RuntimeException("item types do not match!");
        }
          goto _L1
_L5:
        Object obj;
        obj = readArrayValue(pimitem.getArraySize(((String) (obj))));
_L3:
        PimField pimfield;
        pimfield.setValue(obj);
        System.out.println((new StringBuilder()).append("value:").append(obj).toString());
        pimitem.addField(pimfield);
_L1:
        obj = readName();
        if (((String) (obj)).equals("end"))
        {
            reader.read();
            System.out.println((new StringBuilder()).append("end:").append(readStringValue()).toString());
            return pimitem;
        }
        pimfield = new PimField(((String) (obj)));
        readProperties(pimfield);
        switch (pimitem.getType(((String) (obj))))
        {
        default:
            obj = readStringValue();
            break;

        case 1: // '\001'
            continue; /* Loop/switch isn't completed */
        }
        if (true) goto _L3; else goto _L2
_L2:
        if (true) goto _L5; else goto _L4
_L4:
    }

    String readName()
        throws IOException
    {
        String s = reader.readTo(":;").trim().toLowerCase();
        System.out.println((new StringBuilder()).append("name:").append(s).toString());
        if (reader.peek(0) == -1)
        {
            s = null;
        }
        return s;
    }

    void readProperties(PimField pimfield)
        throws IOException
    {
        int i = reader.read();
        int j;
        do
        {
            j = i;
            if (i != 32)
            {
                break;
            }
            i = reader.read();
        } while (true);
        while (j != 58) 
        {
            String s = reader.readTo(":;=").trim().toLowerCase();
            j = reader.read();
            if (j == 61)
            {
                pimfield.setProperty(s, reader.readTo(":;").trim().toLowerCase());
                j = reader.read();
            } else
            {
                pimfield.setAttribute(s, true);
            }
        }
    }

    String readStringValue()
        throws IOException
    {
        String s;
        for (s = reader.readLine(); reader.peek(0) == 32; s = (new StringBuilder()).append(s).append(reader.readLine()).toString())
        {
            reader.read();
        }

        return s;
    }
}
