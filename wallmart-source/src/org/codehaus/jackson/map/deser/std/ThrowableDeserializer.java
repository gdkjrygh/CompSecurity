// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.map.deser.std;

import java.io.IOException;
import java.util.HashSet;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.JsonToken;
import org.codehaus.jackson.map.DeserializationContext;
import org.codehaus.jackson.map.JsonDeserializer;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.deser.BeanDeserializer;
import org.codehaus.jackson.map.deser.SettableAnyProperty;
import org.codehaus.jackson.map.deser.SettableBeanProperty;
import org.codehaus.jackson.map.deser.ValueInstantiator;
import org.codehaus.jackson.map.deser.impl.BeanPropertyMap;
import org.codehaus.jackson.type.JavaType;

public class ThrowableDeserializer extends BeanDeserializer
{

    protected static final String PROP_NAME_MESSAGE = "message";

    public ThrowableDeserializer(BeanDeserializer beandeserializer)
    {
        super(beandeserializer);
    }

    protected ThrowableDeserializer(BeanDeserializer beandeserializer, boolean flag)
    {
        super(beandeserializer, flag);
    }

    public Object deserializeFromObject(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException
    {
        if (_propertyBasedCreator == null) goto _L2; else goto _L1
_L1:
        jsonparser = ((JsonParser) (_deserializeUsingPropertyBased(jsonparser, deserializationcontext)));
_L4:
        return jsonparser;
_L2:
        if (_delegateDeserializer != null)
        {
            return _valueInstantiator.createUsingDelegate(_delegateDeserializer.deserialize(jsonparser, deserializationcontext));
        }
        if (_beanType.isAbstract())
        {
            throw JsonMappingException.from(jsonparser, (new StringBuilder()).append("Can not instantiate abstract type ").append(_beanType).append(" (need to add/enable type information?)").toString());
        }
        boolean flag = _valueInstantiator.canCreateFromString();
        boolean flag1 = _valueInstantiator.canCreateUsingDefault();
        if (!flag && !flag1)
        {
            throw new JsonMappingException((new StringBuilder()).append("Can not deserialize Throwable of type ").append(_beanType).append(" without having a default contructor, a single-String-arg constructor; or explicit @JsonCreator").toString());
        }
        Object obj1 = null;
        Object obj = null;
        int i = 0;
        while (jsonparser.getCurrentToken() != JsonToken.END_OBJECT) 
        {
            Object obj2 = jsonparser.getCurrentName();
            SettableBeanProperty settablebeanproperty = _beanProperties.find(((String) (obj2)));
            jsonparser.nextToken();
            int j;
            if (settablebeanproperty != null)
            {
                if (obj1 != null)
                {
                    settablebeanproperty.deserializeAndSet(jsonparser, deserializationcontext, obj1);
                    j = i;
                    obj2 = obj;
                } else
                {
                    obj2 = obj;
                    if (obj == null)
                    {
                        j = _beanProperties.size();
                        obj2 = ((Object) (new Object[j + j]));
                    }
                    int l = i + 1;
                    obj2[i] = settablebeanproperty;
                    j = l + 1;
                    obj2[l] = settablebeanproperty.deserialize(jsonparser, deserializationcontext);
                }
            } else
            if ("message".equals(obj2) && flag)
            {
                Object obj3 = _valueInstantiator.createFromString(jsonparser.getText());
                obj2 = obj;
                j = i;
                obj1 = obj3;
                if (obj != null)
                {
                    for (j = 0; j < i; j += 2)
                    {
                        ((SettableBeanProperty)obj[j]).set(obj3, obj[j + 1]);
                    }

                    obj2 = null;
                    j = i;
                    obj1 = obj3;
                }
            } else
            if (_ignorableProps != null && _ignorableProps.contains(obj2))
            {
                jsonparser.skipChildren();
                obj2 = obj;
                j = i;
            } else
            if (_anySetter != null)
            {
                _anySetter.deserializeAndSet(jsonparser, deserializationcontext, obj1, ((String) (obj2)));
                obj2 = obj;
                j = i;
            } else
            {
                handleUnknownProperty(jsonparser, deserializationcontext, obj1, ((String) (obj2)));
                obj2 = obj;
                j = i;
            }
            jsonparser.nextToken();
            obj = obj2;
            i = j;
        }
        jsonparser = ((JsonParser) (obj1));
        if (obj1 != null)
        {
            continue;
        }
        int k;
        if (flag)
        {
            deserializationcontext = ((DeserializationContext) (_valueInstantiator.createFromString(null)));
        } else
        {
            deserializationcontext = ((DeserializationContext) (_valueInstantiator.createUsingDefault()));
        }
        jsonparser = deserializationcontext;
        if (obj == null)
        {
            continue;
        }
        k = 0;
        do
        {
            jsonparser = deserializationcontext;
            if (k >= i)
            {
                continue;
            }
            ((SettableBeanProperty)obj[k]).set(deserializationcontext, obj[k + 1]);
            k += 2;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public JsonDeserializer unwrappingDeserializer()
    {
        if (getClass() != org/codehaus/jackson/map/deser/std/ThrowableDeserializer)
        {
            return this;
        } else
        {
            return new ThrowableDeserializer(this, true);
        }
    }
}
