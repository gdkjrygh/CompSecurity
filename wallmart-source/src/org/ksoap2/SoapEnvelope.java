// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.ksoap2;

import java.io.IOException;
import org.kxml2.kdom.Element;
import org.kxml2.kdom.Node;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

// Referenced classes of package org.ksoap2:
//            SoapFault

public class SoapEnvelope
{

    public static final String ENC = "http://schemas.xmlsoap.org/soap/encoding/";
    public static final String ENC2001 = "http://www.w3.org/2001/12/soap-encoding";
    public static final String ENV = "http://schemas.xmlsoap.org/soap/envelope/";
    public static final String ENV2001 = "http://www.w3.org/2001/12/soap-envelope";
    public static final int VER10 = 100;
    public static final int VER11 = 110;
    public static final int VER12 = 120;
    public static final String XSD = "http://www.w3.org/2001/XMLSchema";
    public static final String XSD1999 = "http://www.w3.org/1999/XMLSchema";
    public static final String XSI = "http://www.w3.org/2001/XMLSchema-instance";
    public static final String XSI1999 = "http://www.w3.org/1999/XMLSchema-instance";
    public Object bodyIn;
    public Object bodyOut;
    public String enc;
    public String encodingStyle;
    public String env;
    public Element headerIn[];
    public Element headerOut[];
    public int version;
    public String xsd;
    public String xsi;

    public SoapEnvelope(int i)
    {
        version = i;
        if (i == 100)
        {
            xsi = "http://www.w3.org/1999/XMLSchema-instance";
            xsd = "http://www.w3.org/1999/XMLSchema";
        } else
        {
            xsi = "http://www.w3.org/2001/XMLSchema-instance";
            xsd = "http://www.w3.org/2001/XMLSchema";
        }
        if (i < 120)
        {
            enc = "http://schemas.xmlsoap.org/soap/encoding/";
            env = "http://schemas.xmlsoap.org/soap/envelope/";
            return;
        } else
        {
            enc = "http://www.w3.org/2001/12/soap-encoding";
            env = "http://www.w3.org/2001/12/soap-envelope";
            return;
        }
    }

    public static boolean stringToBoolean(String s)
    {
        if (s != null)
        {
            if ((s = s.trim().toLowerCase()).equals("1") || s.equals("true"))
            {
                return true;
            }
        }
        return false;
    }

    public void parse(XmlPullParser xmlpullparser)
        throws IOException, XmlPullParserException
    {
        xmlpullparser.nextTag();
        xmlpullparser.require(2, env, "Envelope");
        encodingStyle = xmlpullparser.getAttributeValue(env, "encodingStyle");
        xmlpullparser.nextTag();
        if (xmlpullparser.getEventType() == 2 && xmlpullparser.getNamespace().equals(env) && xmlpullparser.getName().equals("Header"))
        {
            parseHeader(xmlpullparser);
            xmlpullparser.require(3, env, "Header");
            xmlpullparser.nextTag();
        }
        xmlpullparser.require(2, env, "Body");
        encodingStyle = xmlpullparser.getAttributeValue(env, "encodingStyle");
        parseBody(xmlpullparser);
        xmlpullparser.require(3, env, "Body");
        xmlpullparser.nextTag();
        xmlpullparser.require(3, env, "Envelope");
    }

    public void parseBody(XmlPullParser xmlpullparser)
        throws IOException, XmlPullParserException
    {
        xmlpullparser.nextTag();
        if (xmlpullparser.getEventType() == 2 && xmlpullparser.getNamespace().equals(env) && xmlpullparser.getName().equals("Fault"))
        {
            SoapFault soapfault = new SoapFault();
            soapfault.parse(xmlpullparser);
            bodyIn = soapfault;
            return;
        }
        Node node;
        if (bodyIn instanceof Node)
        {
            node = (Node)bodyIn;
        } else
        {
            node = new Node();
        }
        node.parse(xmlpullparser);
        bodyIn = node;
    }

    public void parseHeader(XmlPullParser xmlpullparser)
        throws IOException, XmlPullParserException
    {
        xmlpullparser.nextTag();
        Node node = new Node();
        node.parse(xmlpullparser);
        int k = 0;
        for (int i = 0; i < node.getChildCount();)
        {
            int l = k;
            if (node.getElement(i) != null)
            {
                l = k + 1;
            }
            i++;
            k = l;
        }

        headerIn = new Element[k];
        k = 0;
        for (int j = 0; j < node.getChildCount();)
        {
            xmlpullparser = node.getElement(j);
            int i1 = k;
            if (xmlpullparser != null)
            {
                headerIn[k] = xmlpullparser;
                i1 = k + 1;
            }
            j++;
            k = i1;
        }

    }

    public void setOutputSoapObject(Object obj)
    {
        bodyOut = obj;
    }

    public void write(XmlSerializer xmlserializer)
        throws IOException
    {
        xmlserializer.setPrefix("i", xsi);
        xmlserializer.setPrefix("d", xsd);
        xmlserializer.setPrefix("c", enc);
        xmlserializer.setPrefix("v", env);
        xmlserializer.startTag(env, "Envelope");
        xmlserializer.startTag(env, "Header");
        writeHeader(xmlserializer);
        xmlserializer.endTag(env, "Header");
        xmlserializer.startTag(env, "Body");
        writeBody(xmlserializer);
        xmlserializer.endTag(env, "Body");
        xmlserializer.endTag(env, "Envelope");
    }

    public void writeBody(XmlSerializer xmlserializer)
        throws IOException
    {
        if (encodingStyle != null)
        {
            xmlserializer.attribute(env, "encodingStyle", encodingStyle);
        }
        ((Node)bodyOut).write(xmlserializer);
    }

    public void writeHeader(XmlSerializer xmlserializer)
        throws IOException
    {
        if (headerOut != null)
        {
            for (int i = 0; i < headerOut.length; i++)
            {
                headerOut[i].write(xmlserializer);
            }

        }
    }
}
