// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.map.deser.std;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.URI;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Currency;
import java.util.Locale;
import java.util.TimeZone;
import java.util.UUID;
import java.util.regex.Pattern;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.JsonToken;
import org.codehaus.jackson.map.DeserializationContext;

// Referenced classes of package org.codehaus.jackson.map.deser.std:
//            StdScalarDeserializer

public abstract class FromStringDeserializer extends StdScalarDeserializer
{
    protected static class CharsetDeserializer extends FromStringDeserializer
    {

        protected volatile Object _deserialize(String s, DeserializationContext deserializationcontext)
            throws IOException, JsonProcessingException
        {
            return _deserialize(s, deserializationcontext);
        }

        protected Charset _deserialize(String s, DeserializationContext deserializationcontext)
            throws IOException
        {
            return Charset.forName(s);
        }

        public CharsetDeserializer()
        {
            super(java/nio/charset/Charset);
        }
    }

    public static class CurrencyDeserializer extends FromStringDeserializer
    {

        protected volatile Object _deserialize(String s, DeserializationContext deserializationcontext)
            throws IOException, JsonProcessingException
        {
            return _deserialize(s, deserializationcontext);
        }

        protected Currency _deserialize(String s, DeserializationContext deserializationcontext)
            throws IllegalArgumentException
        {
            return Currency.getInstance(s);
        }

        public CurrencyDeserializer()
        {
            super(java/util/Currency);
        }
    }

    protected static class InetAddressDeserializer extends FromStringDeserializer
    {

        protected volatile Object _deserialize(String s, DeserializationContext deserializationcontext)
            throws IOException, JsonProcessingException
        {
            return _deserialize(s, deserializationcontext);
        }

        protected InetAddress _deserialize(String s, DeserializationContext deserializationcontext)
            throws IOException
        {
            return InetAddress.getByName(s);
        }

        public InetAddressDeserializer()
        {
            super(java/net/InetAddress);
        }
    }

    protected static class LocaleDeserializer extends FromStringDeserializer
    {

        protected volatile Object _deserialize(String s, DeserializationContext deserializationcontext)
            throws IOException, JsonProcessingException
        {
            return _deserialize(s, deserializationcontext);
        }

        protected Locale _deserialize(String s, DeserializationContext deserializationcontext)
            throws IOException
        {
            int i = s.indexOf('_');
            if (i < 0)
            {
                return new Locale(s);
            }
            deserializationcontext = s.substring(0, i);
            s = s.substring(i + 1);
            i = s.indexOf('_');
            if (i < 0)
            {
                return new Locale(deserializationcontext, s);
            } else
            {
                return new Locale(deserializationcontext, s.substring(0, i), s.substring(i + 1));
            }
        }

        public LocaleDeserializer()
        {
            super(java/util/Locale);
        }
    }

    public static class PatternDeserializer extends FromStringDeserializer
    {

        protected volatile Object _deserialize(String s, DeserializationContext deserializationcontext)
            throws IOException, JsonProcessingException
        {
            return _deserialize(s, deserializationcontext);
        }

        protected Pattern _deserialize(String s, DeserializationContext deserializationcontext)
            throws IllegalArgumentException
        {
            return Pattern.compile(s);
        }

        public PatternDeserializer()
        {
            super(java/util/regex/Pattern);
        }
    }

    protected static class TimeZoneDeserializer extends FromStringDeserializer
    {

        protected volatile Object _deserialize(String s, DeserializationContext deserializationcontext)
            throws IOException, JsonProcessingException
        {
            return _deserialize(s, deserializationcontext);
        }

        protected TimeZone _deserialize(String s, DeserializationContext deserializationcontext)
            throws IOException
        {
            return TimeZone.getTimeZone(s);
        }

        public TimeZoneDeserializer()
        {
            super(java/util/TimeZone);
        }
    }

    public static class URIDeserializer extends FromStringDeserializer
    {

        protected volatile Object _deserialize(String s, DeserializationContext deserializationcontext)
            throws IOException, JsonProcessingException
        {
            return _deserialize(s, deserializationcontext);
        }

        protected URI _deserialize(String s, DeserializationContext deserializationcontext)
            throws IllegalArgumentException
        {
            return URI.create(s);
        }

        public URIDeserializer()
        {
            super(java/net/URI);
        }
    }

    public static class URLDeserializer extends FromStringDeserializer
    {

        protected volatile Object _deserialize(String s, DeserializationContext deserializationcontext)
            throws IOException, JsonProcessingException
        {
            return _deserialize(s, deserializationcontext);
        }

        protected URL _deserialize(String s, DeserializationContext deserializationcontext)
            throws IOException
        {
            return new URL(s);
        }

        public URLDeserializer()
        {
            super(java/net/URL);
        }
    }

    public static class UUIDDeserializer extends FromStringDeserializer
    {

        protected volatile Object _deserialize(String s, DeserializationContext deserializationcontext)
            throws IOException, JsonProcessingException
        {
            return _deserialize(s, deserializationcontext);
        }

        protected UUID _deserialize(String s, DeserializationContext deserializationcontext)
            throws IOException, JsonProcessingException
        {
            return UUID.fromString(s);
        }

        protected volatile Object _deserializeEmbedded(Object obj, DeserializationContext deserializationcontext)
            throws IOException, JsonProcessingException
        {
            return _deserializeEmbedded(obj, deserializationcontext);
        }

        protected UUID _deserializeEmbedded(Object obj, DeserializationContext deserializationcontext)
            throws IOException, JsonProcessingException
        {
            if (obj instanceof byte[])
            {
                obj = (byte[])(byte[])obj;
                if (obj.length != 16)
                {
                    deserializationcontext.mappingException((new StringBuilder()).append("Can only construct UUIDs from 16 byte arrays; got ").append(obj.length).append(" bytes").toString());
                }
                obj = new DataInputStream(new ByteArrayInputStream(((byte []) (obj))));
                return new UUID(((DataInputStream) (obj)).readLong(), ((DataInputStream) (obj)).readLong());
            } else
            {
                _deserializeEmbedded(obj, deserializationcontext);
                return null;
            }
        }

        public UUIDDeserializer()
        {
            super(java/util/UUID);
        }
    }


    protected FromStringDeserializer(Class class1)
    {
        super(class1);
    }

    public static Iterable all()
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new UUIDDeserializer());
        arraylist.add(new URLDeserializer());
        arraylist.add(new URIDeserializer());
        arraylist.add(new CurrencyDeserializer());
        arraylist.add(new PatternDeserializer());
        arraylist.add(new LocaleDeserializer());
        arraylist.add(new InetAddressDeserializer());
        arraylist.add(new TimeZoneDeserializer());
        arraylist.add(new CharsetDeserializer());
        return arraylist;
    }

    protected abstract Object _deserialize(String s, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException;

    protected Object _deserializeEmbedded(Object obj, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException
    {
        throw deserializationcontext.mappingException((new StringBuilder()).append("Don't know how to convert embedded Object of type ").append(obj.getClass().getName()).append(" into ").append(_valueClass.getName()).toString());
    }

    public final Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException
    {
        Object obj = null;
        if (jsonparser.getCurrentToken() != JsonToken.VALUE_STRING) goto _L2; else goto _L1
_L1:
        jsonparser = jsonparser.getText().trim();
        if (jsonparser.length() != 0) goto _L4; else goto _L3
_L3:
        jsonparser = ((JsonParser) (obj));
_L6:
        return jsonparser;
_L4:
        obj = _deserialize(jsonparser, deserializationcontext);
        jsonparser = ((JsonParser) (obj));
        if (obj != null) goto _L6; else goto _L5
_L5:
        throw deserializationcontext.weirdStringException(_valueClass, "not a valid textual representation");
_L2:
        if (jsonparser.getCurrentToken() == JsonToken.VALUE_EMBEDDED_OBJECT)
        {
            Object obj1 = jsonparser.getEmbeddedObject();
            jsonparser = ((JsonParser) (obj));
            if (obj1 != null)
            {
                if (_valueClass.isAssignableFrom(obj1.getClass()))
                {
                    return obj1;
                } else
                {
                    return _deserializeEmbedded(obj1, deserializationcontext);
                }
            }
        } else
        {
            throw deserializationcontext.mappingException(_valueClass);
        }
          goto _L6
        jsonparser;
          goto _L5
    }
}
