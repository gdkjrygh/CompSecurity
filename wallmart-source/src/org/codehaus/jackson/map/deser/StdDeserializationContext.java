// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.map.deser;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.JsonToken;
import org.codehaus.jackson.map.BeanProperty;
import org.codehaus.jackson.map.DeserializationConfig;
import org.codehaus.jackson.map.DeserializationContext;
import org.codehaus.jackson.map.DeserializationProblemHandler;
import org.codehaus.jackson.map.DeserializerProvider;
import org.codehaus.jackson.map.InjectableValues;
import org.codehaus.jackson.map.JsonDeserializer;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.exc.UnrecognizedPropertyException;
import org.codehaus.jackson.map.util.ArrayBuilders;
import org.codehaus.jackson.map.util.ClassUtil;
import org.codehaus.jackson.map.util.LinkedNode;
import org.codehaus.jackson.map.util.ObjectBuffer;
import org.codehaus.jackson.type.JavaType;

public class StdDeserializationContext extends DeserializationContext
{

    static final int MAX_ERROR_STR_LEN = 500;
    protected ArrayBuilders _arrayBuilders;
    protected DateFormat _dateFormat;
    protected final DeserializerProvider _deserProvider;
    protected final InjectableValues _injectableValues;
    protected ObjectBuffer _objectBuffer;
    protected JsonParser _parser;

    public StdDeserializationContext(DeserializationConfig deserializationconfig, JsonParser jsonparser, DeserializerProvider deserializerprovider, InjectableValues injectablevalues)
    {
        super(deserializationconfig);
        _parser = jsonparser;
        _deserProvider = deserializerprovider;
        _injectableValues = injectablevalues;
    }

    protected String _calcName(Class class1)
    {
        if (class1.isArray())
        {
            return (new StringBuilder()).append(_calcName(class1.getComponentType())).append("[]").toString();
        } else
        {
            return class1.getName();
        }
    }

    protected String _desc(String s)
    {
        String s1 = s;
        if (s.length() > 500)
        {
            s1 = (new StringBuilder()).append(s.substring(0, 500)).append("]...[").append(s.substring(s.length() - 500)).toString();
        }
        return s1;
    }

    protected String _valueDesc()
    {
        String s;
        try
        {
            s = _desc(_parser.getText());
        }
        catch (Exception exception)
        {
            return "[N/A]";
        }
        return s;
    }

    public Calendar constructCalendar(Date date)
    {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar;
    }

    protected String determineClassName(Object obj)
    {
        return ClassUtil.getClassDescription(obj);
    }

    public Object findInjectableValue(Object obj, BeanProperty beanproperty, Object obj1)
    {
        if (_injectableValues == null)
        {
            throw new IllegalStateException((new StringBuilder()).append("No 'injectableValues' configured, can not inject value with id [").append(obj).append("]").toString());
        } else
        {
            return _injectableValues.findInjectableValue(obj, this, beanproperty, obj1);
        }
    }

    public final ArrayBuilders getArrayBuilders()
    {
        if (_arrayBuilders == null)
        {
            _arrayBuilders = new ArrayBuilders();
        }
        return _arrayBuilders;
    }

    protected DateFormat getDateFormat()
    {
        if (_dateFormat == null)
        {
            _dateFormat = (DateFormat)_config.getDateFormat().clone();
        }
        return _dateFormat;
    }

    public DeserializerProvider getDeserializerProvider()
    {
        return _deserProvider;
    }

    public JsonParser getParser()
    {
        return _parser;
    }

    public boolean handleUnknownProperty(JsonParser jsonparser, JsonDeserializer jsondeserializer, Object obj, String s)
        throws IOException, JsonProcessingException
    {
        JsonParser jsonparser1;
        LinkedNode linkednode = _config.getProblemHandlers();
        if (linkednode == null)
        {
            break MISSING_BLOCK_LABEL_76;
        }
        jsonparser1 = _parser;
        _parser = jsonparser;
        jsonparser = linkednode;
_L2:
        if (jsonparser == null)
        {
            break; /* Loop/switch isn't completed */
        }
        boolean flag = ((DeserializationProblemHandler)jsonparser.value()).handleUnknownProperty(this, jsondeserializer, obj, s);
        if (flag)
        {
            _parser = jsonparser1;
            return true;
        }
        jsonparser = jsonparser.next();
        if (true) goto _L2; else goto _L1
_L1:
        _parser = jsonparser1;
        return false;
        jsonparser;
        _parser = jsonparser1;
        throw jsonparser;
    }

    public JsonMappingException instantiationException(Class class1, String s)
    {
        return JsonMappingException.from(_parser, (new StringBuilder()).append("Can not construct instance of ").append(class1.getName()).append(", problem: ").append(s).toString());
    }

    public JsonMappingException instantiationException(Class class1, Throwable throwable)
    {
        return JsonMappingException.from(_parser, (new StringBuilder()).append("Can not construct instance of ").append(class1.getName()).append(", problem: ").append(throwable.getMessage()).toString(), throwable);
    }

    public final ObjectBuffer leaseObjectBuffer()
    {
        ObjectBuffer objectbuffer = _objectBuffer;
        if (objectbuffer == null)
        {
            return new ObjectBuffer();
        } else
        {
            _objectBuffer = null;
            return objectbuffer;
        }
    }

    public JsonMappingException mappingException(Class class1)
    {
        return mappingException(class1, _parser.getCurrentToken());
    }

    public JsonMappingException mappingException(Class class1, JsonToken jsontoken)
    {
        class1 = _calcName(class1);
        return JsonMappingException.from(_parser, (new StringBuilder()).append("Can not deserialize instance of ").append(class1).append(" out of ").append(jsontoken).append(" token").toString());
    }

    public Date parseDate(String s)
        throws IllegalArgumentException
    {
        try
        {
            s = getDateFormat().parse(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new IllegalArgumentException(s.getMessage());
        }
        return s;
    }

    public final void returnObjectBuffer(ObjectBuffer objectbuffer)
    {
        if (_objectBuffer == null || objectbuffer.initialCapacity() >= _objectBuffer.initialCapacity())
        {
            _objectBuffer = objectbuffer;
        }
    }

    public JsonMappingException unknownFieldException(Object obj, String s)
    {
        return UnrecognizedPropertyException.from(_parser, obj, s);
    }

    public JsonMappingException unknownTypeException(JavaType javatype, String s)
    {
        return JsonMappingException.from(_parser, (new StringBuilder()).append("Could not resolve type id '").append(s).append("' into a subtype of ").append(javatype).toString());
    }

    public JsonMappingException weirdKeyException(Class class1, String s, String s1)
    {
        return JsonMappingException.from(_parser, (new StringBuilder()).append("Can not construct Map key of type ").append(class1.getName()).append(" from String \"").append(_desc(s)).append("\": ").append(s1).toString());
    }

    public JsonMappingException weirdNumberException(Class class1, String s)
    {
        return JsonMappingException.from(_parser, (new StringBuilder()).append("Can not construct instance of ").append(class1.getName()).append(" from number value (").append(_valueDesc()).append("): ").append(s).toString());
    }

    public JsonMappingException weirdStringException(Class class1, String s)
    {
        return JsonMappingException.from(_parser, (new StringBuilder()).append("Can not construct instance of ").append(class1.getName()).append(" from String value '").append(_valueDesc()).append("': ").append(s).toString());
    }

    public JsonMappingException wrongTokenException(JsonParser jsonparser, JsonToken jsontoken, String s)
    {
        return JsonMappingException.from(jsonparser, (new StringBuilder()).append("Unexpected token (").append(jsonparser.getCurrentToken()).append("), expected ").append(jsontoken).append(": ").append(s).toString());
    }
}
