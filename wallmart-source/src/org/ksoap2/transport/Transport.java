// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.ksoap2.transport;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import org.ksoap2.SoapEnvelope;
import org.kxml2.io.KXmlParser;
import org.kxml2.io.KXmlSerializer;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

public abstract class Transport
{

    public boolean debug;
    public String requestDump;
    public String responseDump;
    protected String url;
    private String xmlVersionTag;

    public Transport()
    {
        xmlVersionTag = "";
    }

    public Transport(String s)
    {
        xmlVersionTag = "";
        url = s;
    }

    public abstract void call(String s, SoapEnvelope soapenvelope)
        throws IOException, XmlPullParserException;

    protected byte[] createRequestData(SoapEnvelope soapenvelope)
        throws IOException
    {
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        bytearrayoutputstream.write(xmlVersionTag.getBytes());
        KXmlSerializer kxmlserializer = new KXmlSerializer();
        kxmlserializer.setOutput(bytearrayoutputstream, null);
        soapenvelope.write(kxmlserializer);
        kxmlserializer.flush();
        bytearrayoutputstream.write(13);
        bytearrayoutputstream.write(10);
        bytearrayoutputstream.flush();
        return bytearrayoutputstream.toByteArray();
    }

    protected void parseResponse(SoapEnvelope soapenvelope, InputStream inputstream)
        throws XmlPullParserException, IOException
    {
        KXmlParser kxmlparser = new KXmlParser();
        kxmlparser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", true);
        kxmlparser.setInput(inputstream, null);
        soapenvelope.parse(kxmlparser);
    }

    public void reset()
    {
    }

    public void setUrl(String s)
    {
        url = s;
    }

    public void setXmlVersionTag(String s)
    {
        xmlVersionTag = s;
    }
}
