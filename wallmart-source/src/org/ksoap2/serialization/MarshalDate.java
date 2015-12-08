// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.ksoap2.serialization;

import java.io.IOException;
import java.util.Date;
import org.kobjects.isodate.IsoDate;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

// Referenced classes of package org.ksoap2.serialization:
//            Marshal, SoapSerializationEnvelope, PropertyInfo

public class MarshalDate
    implements Marshal
{

    public static Class DATE_CLASS = (new Date()).getClass();

    public MarshalDate()
    {
    }

    public Object readInstance(XmlPullParser xmlpullparser, String s, String s1, PropertyInfo propertyinfo)
        throws IOException, XmlPullParserException
    {
        return IsoDate.stringToDate(xmlpullparser.nextText(), 3);
    }

    public void register(SoapSerializationEnvelope soapserializationenvelope)
    {
        soapserializationenvelope.addMapping(soapserializationenvelope.xsd, "dateTime", DATE_CLASS, this);
    }

    public void writeInstance(XmlSerializer xmlserializer, Object obj)
        throws IOException
    {
        xmlserializer.text(IsoDate.dateToString((Date)obj, 3));
    }

}
