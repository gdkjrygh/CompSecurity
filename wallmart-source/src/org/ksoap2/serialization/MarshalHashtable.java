// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.ksoap2.serialization;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Hashtable;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

// Referenced classes of package org.ksoap2.serialization:
//            Marshal, PropertyInfo, SoapSerializationEnvelope, SoapObject

public class MarshalHashtable
    implements Marshal
{
    class ItemSoapObject extends SoapObject
    {

        Hashtable h;
        int resolvedIndex;
        final MarshalHashtable this$0;

        public void setProperty(int i, Object obj)
        {
            if (resolvedIndex == -1)
            {
                super.setProperty(i, obj);
                resolvedIndex = i;
                return;
            }
            Object obj1;
            if (resolvedIndex == 0)
            {
                obj1 = getProperty(0);
            } else
            {
                obj1 = getProperty(1);
            }
            if (i == 0)
            {
                h.put(obj, obj1);
                return;
            } else
            {
                h.put(obj1, obj);
                return;
            }
        }

        ItemSoapObject(Hashtable hashtable)
        {
            this$0 = MarshalHashtable.this;
            super(null, null);
            resolvedIndex = -1;
            h = hashtable;
            addProperty("key", null);
            addProperty("value", null);
        }
    }


    public static final Class HASHTABLE_CLASS = (new Hashtable()).getClass();
    public static final String NAME = "Map";
    public static final String NAMESPACE = "http://xml.apache.org/xml-soap";
    SoapSerializationEnvelope envelope;

    public MarshalHashtable()
    {
    }

    public Object readInstance(XmlPullParser xmlpullparser, String s, String s1, PropertyInfo propertyinfo)
        throws IOException, XmlPullParserException
    {
        s = new Hashtable();
        s1 = xmlpullparser.getName();
        for (; xmlpullparser.nextTag() != 3; xmlpullparser.require(3, null, "item"))
        {
            propertyinfo = new ItemSoapObject(s);
            xmlpullparser.require(2, null, "item");
            xmlpullparser.nextTag();
            Object obj = envelope.read(xmlpullparser, propertyinfo, 0, null, null, PropertyInfo.OBJECT_TYPE);
            xmlpullparser.nextTag();
            if (obj != null)
            {
                propertyinfo.setProperty(0, obj);
            }
            obj = envelope.read(xmlpullparser, propertyinfo, 1, null, null, PropertyInfo.OBJECT_TYPE);
            xmlpullparser.nextTag();
            if (obj != null)
            {
                propertyinfo.setProperty(1, obj);
            }
        }

        xmlpullparser.require(3, null, s1);
        return s;
    }

    public void register(SoapSerializationEnvelope soapserializationenvelope)
    {
        envelope = soapserializationenvelope;
        soapserializationenvelope.addMapping("http://xml.apache.org/xml-soap", "Map", HASHTABLE_CLASS, this);
    }

    public void writeInstance(XmlSerializer xmlserializer, Object obj)
        throws IOException
    {
        obj = (Hashtable)obj;
        SoapObject soapobject = new SoapObject(null, null);
        soapobject.addProperty("key", null);
        soapobject.addProperty("value", null);
        for (Enumeration enumeration = ((Hashtable) (obj)).keys(); enumeration.hasMoreElements(); xmlserializer.endTag("", "item"))
        {
            xmlserializer.startTag("", "item");
            Object obj1 = enumeration.nextElement();
            soapobject.setProperty(0, obj1);
            soapobject.setProperty(1, ((Hashtable) (obj)).get(obj1));
            envelope.writeObjectBody(xmlserializer, soapobject);
        }

    }

}
