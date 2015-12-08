// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.ksoap2.serialization;

import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

// Referenced classes of package org.ksoap2.serialization:
//            PropertyInfo, SoapSerializationEnvelope

public interface Marshal
{

    public abstract Object readInstance(XmlPullParser xmlpullparser, String s, String s1, PropertyInfo propertyinfo)
        throws IOException, XmlPullParserException;

    public abstract void register(SoapSerializationEnvelope soapserializationenvelope);

    public abstract void writeInstance(XmlSerializer xmlserializer, Object obj)
        throws IOException;
}
