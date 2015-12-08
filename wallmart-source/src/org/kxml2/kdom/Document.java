// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.kxml2.kdom;

import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

// Referenced classes of package org.kxml2.kdom:
//            Node, Element

public class Document extends Node
{

    String encoding;
    protected int rootIndex;
    Boolean standalone;

    public Document()
    {
        rootIndex = -1;
    }

    public void addChild(int i, int j, Object obj)
    {
        if (j != 2) goto _L2; else goto _L1
_L1:
        rootIndex = i;
_L4:
        super.addChild(i, j, obj);
        return;
_L2:
        if (rootIndex >= i)
        {
            rootIndex = rootIndex + 1;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public String getEncoding()
    {
        return encoding;
    }

    public String getName()
    {
        return "#document";
    }

    public Element getRootElement()
    {
        if (rootIndex == -1)
        {
            throw new RuntimeException("Document has no root element!");
        } else
        {
            return (Element)getChild(rootIndex);
        }
    }

    public Boolean getStandalone()
    {
        return standalone;
    }

    public void parse(XmlPullParser xmlpullparser)
        throws IOException, XmlPullParserException
    {
        xmlpullparser.require(0, null, null);
        xmlpullparser.nextToken();
        encoding = xmlpullparser.getInputEncoding();
        standalone = (Boolean)xmlpullparser.getProperty("http://xmlpull.org/v1/doc/properties.html#xmldecl-standalone");
        super.parse(xmlpullparser);
        if (xmlpullparser.getEventType() != 1)
        {
            throw new RuntimeException("Document end expected!");
        } else
        {
            return;
        }
    }

    public void removeChild(int i)
    {
        if (i != rootIndex) goto _L2; else goto _L1
_L1:
        rootIndex = -1;
_L4:
        super.removeChild(i);
        return;
_L2:
        if (i < rootIndex)
        {
            rootIndex = rootIndex - 1;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void setEncoding(String s)
    {
        encoding = s;
    }

    public void setStandalone(Boolean boolean1)
    {
        standalone = boolean1;
    }

    public void write(XmlSerializer xmlserializer)
        throws IOException
    {
        xmlserializer.startDocument(encoding, standalone);
        writeChildren(xmlserializer);
        xmlserializer.endDocument();
    }
}
