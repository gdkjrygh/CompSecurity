// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.ksoap2.serialization;

import java.io.IOException;
import java.math.BigDecimal;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

// Referenced classes of package org.ksoap2.serialization:
//            Marshal, SoapSerializationEnvelope, PropertyInfo

public class MarshalFloat
    implements Marshal
{

    public MarshalFloat()
    {
    }

    public Object readInstance(XmlPullParser xmlpullparser, String s, String s1, PropertyInfo propertyinfo)
        throws IOException, XmlPullParserException
    {
        xmlpullparser = xmlpullparser.nextText();
        if (s1.equals("float"))
        {
            return new Float(xmlpullparser);
        }
        if (s1.equals("double"))
        {
            return new Double(xmlpullparser);
        }
        if (s1.equals("decimal"))
        {
            return new BigDecimal(xmlpullparser);
        } else
        {
            throw new RuntimeException("float, double, or decimal expected");
        }
    }

    public void register(SoapSerializationEnvelope soapserializationenvelope)
    {
        soapserializationenvelope.addMapping(soapserializationenvelope.xsd, "float", java/lang/Float, this);
        soapserializationenvelope.addMapping(soapserializationenvelope.xsd, "double", java/lang/Double, this);
        soapserializationenvelope.addMapping(soapserializationenvelope.xsd, "decimal", java/math/BigDecimal, this);
    }

    public void writeInstance(XmlSerializer xmlserializer, Object obj)
        throws IOException
    {
        xmlserializer.text(obj.toString());
    }
}
