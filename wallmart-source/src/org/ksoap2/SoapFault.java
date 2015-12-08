// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.ksoap2;

import java.io.IOException;
import org.kxml2.kdom.Node;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

public class SoapFault extends IOException
{

    public Node detail;
    public String faultactor;
    public String faultcode;
    public String faultstring;

    public SoapFault()
    {
    }

    public void parse(XmlPullParser xmlpullparser)
        throws IOException, XmlPullParserException
    {
        xmlpullparser.require(2, "http://schemas.xmlsoap.org/soap/envelope/", "Fault");
        while (xmlpullparser.nextTag() == 2) 
        {
            String s = xmlpullparser.getName();
            if (s.equals("detail"))
            {
                detail = new Node();
                detail.parse(xmlpullparser);
            } else
            {
                if (s.equals("faultcode"))
                {
                    faultcode = xmlpullparser.nextText();
                } else
                if (s.equals("faultstring"))
                {
                    faultstring = xmlpullparser.nextText();
                } else
                if (s.equals("faultactor"))
                {
                    faultactor = xmlpullparser.nextText();
                } else
                {
                    throw new RuntimeException((new StringBuilder()).append("unexpected tag:").append(s).toString());
                }
                xmlpullparser.require(3, null, s);
            }
        }
    }

    public String toString()
    {
        return (new StringBuilder()).append("SoapFault - faultcode: '").append(faultcode).append("' faultstring: '").append(faultstring).append("' faultactor: '").append(faultactor).append("' detail: ").append(detail).toString();
    }

    public void write(XmlSerializer xmlserializer)
        throws IOException
    {
        xmlserializer.startTag("http://schemas.xmlsoap.org/soap/envelope/", "Fault");
        xmlserializer.startTag(null, "faultcode");
        xmlserializer.text((new StringBuilder()).append("").append(faultcode).toString());
        xmlserializer.endTag(null, "faultcode");
        xmlserializer.startTag(null, "faultstring");
        xmlserializer.text((new StringBuilder()).append("").append(faultstring).toString());
        xmlserializer.endTag(null, "faultstring");
        xmlserializer.startTag(null, "detail");
        if (detail != null)
        {
            detail.write(xmlserializer);
        }
        xmlserializer.endTag(null, "detail");
        xmlserializer.endTag("http://schemas.xmlsoap.org/soap/envelope/", "Fault");
    }
}
