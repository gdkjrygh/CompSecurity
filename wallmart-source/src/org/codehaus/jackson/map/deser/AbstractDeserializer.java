// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.map.deser;

import java.io.IOException;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.JsonToken;
import org.codehaus.jackson.map.DeserializationContext;
import org.codehaus.jackson.map.JsonDeserializer;
import org.codehaus.jackson.map.TypeDeserializer;
import org.codehaus.jackson.type.JavaType;

public class AbstractDeserializer extends JsonDeserializer
{

    protected final boolean _acceptBoolean;
    protected final boolean _acceptDouble;
    protected final boolean _acceptInt;
    protected final boolean _acceptString;
    protected final JavaType _baseType;

    public AbstractDeserializer(JavaType javatype)
    {
label0:
        {
            boolean flag1 = false;
            super();
            _baseType = javatype;
            javatype = javatype.getRawClass();
            _acceptString = javatype.isAssignableFrom(java/lang/String);
            boolean flag;
            if (javatype == Boolean.TYPE || javatype.isAssignableFrom(java/lang/Boolean))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            _acceptBoolean = flag;
            if (javatype == Integer.TYPE || javatype.isAssignableFrom(java/lang/Integer))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            _acceptInt = flag;
            if (javatype != Double.TYPE)
            {
                flag = flag1;
                if (!javatype.isAssignableFrom(java/lang/Double))
                {
                    break label0;
                }
            }
            flag = true;
        }
        _acceptDouble = flag;
    }

    protected Object _deserializeIfNatural(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException
    {
    /* anonymous class not found */
    class _anm1 {}

        _cls1..SwitchMap.org.codehaus.jackson.JsonToken[jsonparser.getCurrentToken().ordinal()];
        JVM INSTR tableswitch 1 5: default 44
    //                   1 46
    //                   2 58
    //                   3 73
    //                   4 88
    //                   5 99;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        return null;
_L2:
        if (_acceptString)
        {
            return jsonparser.getText();
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (_acceptInt)
        {
            return Integer.valueOf(jsonparser.getIntValue());
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (_acceptDouble)
        {
            return Double.valueOf(jsonparser.getDoubleValue());
        }
        continue; /* Loop/switch isn't completed */
_L5:
        if (_acceptBoolean)
        {
            return Boolean.TRUE;
        }
        continue; /* Loop/switch isn't completed */
_L6:
        if (_acceptBoolean)
        {
            return Boolean.FALSE;
        }
        if (true) goto _L1; else goto _L7
_L7:
    }

    public Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException
    {
        throw deserializationcontext.instantiationException(_baseType.getRawClass(), "abstract types can only be instantiated with additional type information");
    }

    public Object deserializeWithType(JsonParser jsonparser, DeserializationContext deserializationcontext, TypeDeserializer typedeserializer)
        throws IOException, JsonProcessingException
    {
        Object obj = _deserializeIfNatural(jsonparser, deserializationcontext);
        if (obj != null)
        {
            return obj;
        } else
        {
            return typedeserializer.deserializeTypedFromObject(jsonparser, deserializationcontext);
        }
    }
}
