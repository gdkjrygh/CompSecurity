// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.kobjects.xmlrpc;

import java.io.IOException;
import java.util.Hashtable;
import java.util.Vector;
import org.kobjects.base64.Base64;
import org.kobjects.isodate.IsoDate;
import org.kobjects.xml.XmlReader;

public class XmlRpcParser
{

    private XmlReader parser;

    public XmlRpcParser(XmlReader xmlreader)
    {
        parser = null;
        parser = xmlreader;
    }

    private final int nextTag()
        throws IOException
    {
        parser.getType();
        int j = parser.next();
        int i = j;
        if (j == 4)
        {
            i = j;
            if (parser.isWhitespace())
            {
                i = parser.next();
            }
        }
        if (i != 3 && i != 2)
        {
            throw new IOException((new StringBuilder()).append("unexpected type: ").append(i).toString());
        } else
        {
            return i;
        }
    }

    private final String nextText()
        throws IOException
    {
        if (parser.getType() != 2)
        {
            throw new IOException("precondition: START_TAG");
        }
        int i = parser.next();
        String s;
        if (i == 4)
        {
            s = parser.getText();
            i = parser.next();
        } else
        {
            s = "";
        }
        if (i != 3)
        {
            throw new IOException("END_TAG expected");
        } else
        {
            return s;
        }
    }

    private final Vector parseArray()
        throws IOException
    {
        nextTag();
        int i = nextTag();
        Vector vector = new Vector();
        for (; i != 3; i = parser.getType())
        {
            vector.addElement(parseValue());
        }

        nextTag();
        nextTag();
        return vector;
    }

    private final Object parseFault()
        throws IOException
    {
        nextTag();
        Object obj = parseValue();
        nextTag();
        return obj;
    }

    private final Object parseParams()
        throws IOException
    {
        Vector vector = new Vector();
        for (int i = nextTag(); i != 3; i = nextTag())
        {
            nextTag();
            vector.addElement(parseValue());
        }

        nextTag();
        return vector;
    }

    private final Hashtable parseStruct()
        throws IOException
    {
        Hashtable hashtable = new Hashtable();
        for (int i = nextTag(); i != 3; i = nextTag())
        {
            nextTag();
            String s = nextText();
            nextTag();
            hashtable.put(s, parseValue());
        }

        nextTag();
        return hashtable;
    }

    private final Object parseValue()
        throws IOException
    {
        Object obj;
        Object obj1;
        int i;
        obj = null;
        int j = parser.next();
        i = j;
        if (j == 4)
        {
            obj = parser.getText();
            i = parser.next();
        }
        obj1 = obj;
        if (i != 2) goto _L2; else goto _L1
_L1:
        obj1 = parser.getName();
        if (!((String) (obj1)).equals("array")) goto _L4; else goto _L3
_L3:
        obj1 = parseArray();
_L2:
        nextTag();
        return obj1;
_L4:
        if (((String) (obj1)).equals("struct"))
        {
            obj1 = parseStruct();
            continue; /* Loop/switch isn't completed */
        }
        if (!((String) (obj1)).equals("string"))
        {
            break; /* Loop/switch isn't completed */
        }
        obj = nextText();
_L6:
        nextTag();
        obj1 = obj;
        if (true) goto _L2; else goto _L5
_L5:
        if (((String) (obj1)).equals("i4") || ((String) (obj1)).equals("int"))
        {
            obj = new Integer(Integer.parseInt(nextText().trim()));
        } else
        if (((String) (obj1)).equals("boolean"))
        {
            obj = new Boolean(nextText().trim().equals("1"));
        } else
        if (((String) (obj1)).equals("dateTime.iso8601"))
        {
            obj = IsoDate.stringToDate(nextText(), 3);
        } else
        if (((String) (obj1)).equals("base64"))
        {
            obj = Base64.decode(nextText());
        } else
        if (((String) (obj1)).equals("double"))
        {
            obj = nextText();
        }
          goto _L6
        if (true) goto _L2; else goto _L7
_L7:
    }

    public final Object parseResponse()
        throws IOException
    {
        Object obj1 = null;
        nextTag();
        Object obj = obj1;
        if (nextTag() == 2)
        {
            if ("fault".equals(parser.getName()))
            {
                obj = parseFault();
            } else
            {
                obj = obj1;
                if ("params".equals(parser.getName()))
                {
                    return parseParams();
                }
            }
        }
        return obj;
    }
}
