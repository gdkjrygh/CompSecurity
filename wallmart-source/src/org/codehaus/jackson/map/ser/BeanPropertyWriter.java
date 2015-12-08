// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.map.ser;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.HashMap;
import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.io.SerializedString;
import org.codehaus.jackson.map.BeanProperty;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.JsonSerializer;
import org.codehaus.jackson.map.SerializerProvider;
import org.codehaus.jackson.map.TypeSerializer;
import org.codehaus.jackson.map.introspect.AnnotatedMember;
import org.codehaus.jackson.map.ser.impl.PropertySerializerMap;
import org.codehaus.jackson.map.ser.impl.UnwrappingBeanPropertyWriter;
import org.codehaus.jackson.map.util.Annotations;
import org.codehaus.jackson.type.JavaType;

public class BeanPropertyWriter
    implements BeanProperty
{

    protected final Method _accessorMethod;
    protected final JavaType _cfgSerializationType;
    protected final Annotations _contextAnnotations;
    protected final JavaType _declaredType;
    protected PropertySerializerMap _dynamicSerializers;
    protected final Field _field;
    protected Class _includeInViews[];
    protected HashMap _internalSettings;
    protected final AnnotatedMember _member;
    protected final SerializedString _name;
    protected JavaType _nonTrivialBaseType;
    protected final JsonSerializer _serializer;
    protected final boolean _suppressNulls;
    protected final Object _suppressableValue;
    protected TypeSerializer _typeSerializer;

    public BeanPropertyWriter(AnnotatedMember annotatedmember, Annotations annotations, String s, JavaType javatype, JsonSerializer jsonserializer, TypeSerializer typeserializer, JavaType javatype1, 
            Method method, Field field, boolean flag, Object obj)
    {
        this(annotatedmember, annotations, new SerializedString(s), javatype, jsonserializer, typeserializer, javatype1, method, field, flag, obj);
    }

    public BeanPropertyWriter(AnnotatedMember annotatedmember, Annotations annotations, SerializedString serializedstring, JavaType javatype, JsonSerializer jsonserializer, TypeSerializer typeserializer, JavaType javatype1, 
            Method method, Field field, boolean flag, Object obj)
    {
        _member = annotatedmember;
        _contextAnnotations = annotations;
        _name = serializedstring;
        _declaredType = javatype;
        _serializer = jsonserializer;
        if (jsonserializer == null)
        {
            annotatedmember = PropertySerializerMap.emptyMap();
        } else
        {
            annotatedmember = null;
        }
        _dynamicSerializers = annotatedmember;
        _typeSerializer = typeserializer;
        _cfgSerializationType = javatype1;
        _accessorMethod = method;
        _field = field;
        _suppressNulls = flag;
        _suppressableValue = obj;
    }

    protected BeanPropertyWriter(BeanPropertyWriter beanpropertywriter)
    {
        this(beanpropertywriter, beanpropertywriter._serializer);
    }

    protected BeanPropertyWriter(BeanPropertyWriter beanpropertywriter, JsonSerializer jsonserializer)
    {
        _serializer = jsonserializer;
        _member = beanpropertywriter._member;
        _contextAnnotations = beanpropertywriter._contextAnnotations;
        _declaredType = beanpropertywriter._declaredType;
        _accessorMethod = beanpropertywriter._accessorMethod;
        _field = beanpropertywriter._field;
        if (beanpropertywriter._internalSettings != null)
        {
            _internalSettings = new HashMap(beanpropertywriter._internalSettings);
        }
        _name = beanpropertywriter._name;
        _cfgSerializationType = beanpropertywriter._cfgSerializationType;
        _dynamicSerializers = beanpropertywriter._dynamicSerializers;
        _suppressNulls = beanpropertywriter._suppressNulls;
        _suppressableValue = beanpropertywriter._suppressableValue;
        _includeInViews = beanpropertywriter._includeInViews;
        _typeSerializer = beanpropertywriter._typeSerializer;
        _nonTrivialBaseType = beanpropertywriter._nonTrivialBaseType;
    }

    protected JsonSerializer _findAndAddDynamic(PropertySerializerMap propertyserializermap, Class class1, SerializerProvider serializerprovider)
        throws JsonMappingException
    {
        if (_nonTrivialBaseType != null)
        {
            class1 = propertyserializermap.findAndAddSerializer(serializerprovider.constructSpecializedType(_nonTrivialBaseType, class1), serializerprovider, this);
        } else
        {
            class1 = propertyserializermap.findAndAddSerializer(class1, serializerprovider, this);
        }
        if (propertyserializermap != ((org.codehaus.jackson.map.ser.impl.PropertySerializerMap.SerializerAndMapResult) (class1)).map)
        {
            _dynamicSerializers = ((org.codehaus.jackson.map.ser.impl.PropertySerializerMap.SerializerAndMapResult) (class1)).map;
        }
        return ((org.codehaus.jackson.map.ser.impl.PropertySerializerMap.SerializerAndMapResult) (class1)).serializer;
    }

    protected void _reportSelfReference(Object obj)
        throws JsonMappingException
    {
        throw new JsonMappingException("Direct self-reference leading to cycle");
    }

    public final Object get(Object obj)
        throws Exception
    {
        if (_accessorMethod != null)
        {
            return _accessorMethod.invoke(obj, new Object[0]);
        } else
        {
            return _field.get(obj);
        }
    }

    public Annotation getAnnotation(Class class1)
    {
        return _member.getAnnotation(class1);
    }

    public Annotation getContextAnnotation(Class class1)
    {
        return _contextAnnotations.get(class1);
    }

    public Type getGenericPropertyType()
    {
        if (_accessorMethod != null)
        {
            return _accessorMethod.getGenericReturnType();
        } else
        {
            return _field.getGenericType();
        }
    }

    public Object getInternalSetting(Object obj)
    {
        if (_internalSettings == null)
        {
            return null;
        } else
        {
            return _internalSettings.get(obj);
        }
    }

    public AnnotatedMember getMember()
    {
        return _member;
    }

    public String getName()
    {
        return _name.getValue();
    }

    public Class getPropertyType()
    {
        if (_accessorMethod != null)
        {
            return _accessorMethod.getReturnType();
        } else
        {
            return _field.getType();
        }
    }

    public Class getRawSerializationType()
    {
        if (_cfgSerializationType == null)
        {
            return null;
        } else
        {
            return _cfgSerializationType.getRawClass();
        }
    }

    public JavaType getSerializationType()
    {
        return _cfgSerializationType;
    }

    public SerializedString getSerializedName()
    {
        return _name;
    }

    public JsonSerializer getSerializer()
    {
        return _serializer;
    }

    public JavaType getType()
    {
        return _declaredType;
    }

    public Class[] getViews()
    {
        return _includeInViews;
    }

    public boolean hasSerializer()
    {
        return _serializer != null;
    }

    public Object removeInternalSetting(Object obj)
    {
        Object obj1 = null;
        if (_internalSettings != null)
        {
            obj = _internalSettings.remove(obj);
            obj1 = obj;
            if (_internalSettings.size() == 0)
            {
                _internalSettings = null;
                obj1 = obj;
            }
        }
        return obj1;
    }

    public void serializeAsField(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        throws Exception
    {
        Object obj1 = get(obj);
        if (obj1 == null)
        {
            if (!_suppressNulls)
            {
                jsongenerator.writeFieldName(_name);
                serializerprovider.defaultSerializeNull(jsongenerator);
            }
        } else
        {
            if (obj1 == obj)
            {
                _reportSelfReference(obj);
            }
            if (_suppressableValue == null || !_suppressableValue.equals(obj1))
            {
                JsonSerializer jsonserializer = _serializer;
                obj = jsonserializer;
                if (jsonserializer == null)
                {
                    Class class1 = obj1.getClass();
                    PropertySerializerMap propertyserializermap = _dynamicSerializers;
                    JsonSerializer jsonserializer1 = propertyserializermap.serializerFor(class1);
                    obj = jsonserializer1;
                    if (jsonserializer1 == null)
                    {
                        obj = _findAndAddDynamic(propertyserializermap, class1, serializerprovider);
                    }
                }
                jsongenerator.writeFieldName(_name);
                if (_typeSerializer == null)
                {
                    ((JsonSerializer) (obj)).serialize(obj1, jsongenerator, serializerprovider);
                    return;
                } else
                {
                    ((JsonSerializer) (obj)).serializeWithType(obj1, jsongenerator, serializerprovider, _typeSerializer);
                    return;
                }
            }
        }
    }

    public Object setInternalSetting(Object obj, Object obj1)
    {
        if (_internalSettings == null)
        {
            _internalSettings = new HashMap();
        }
        return _internalSettings.put(obj, obj1);
    }

    public void setNonTrivialBaseType(JavaType javatype)
    {
        _nonTrivialBaseType = javatype;
    }

    public void setViews(Class aclass[])
    {
        _includeInViews = aclass;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder(40);
        stringbuilder.append("property '").append(getName()).append("' (");
        if (_accessorMethod != null)
        {
            stringbuilder.append("via method ").append(_accessorMethod.getDeclaringClass().getName()).append("#").append(_accessorMethod.getName());
        } else
        {
            stringbuilder.append("field \"").append(_field.getDeclaringClass().getName()).append("#").append(_field.getName());
        }
        if (_serializer == null)
        {
            stringbuilder.append(", no static serializer");
        } else
        {
            stringbuilder.append((new StringBuilder()).append(", static serializer of type ").append(_serializer.getClass().getName()).toString());
        }
        stringbuilder.append(')');
        return stringbuilder.toString();
    }

    public BeanPropertyWriter unwrappingWriter()
    {
        return new UnwrappingBeanPropertyWriter(this);
    }

    public BeanPropertyWriter withSerializer(JsonSerializer jsonserializer)
    {
        if (getClass() != org/codehaus/jackson/map/ser/BeanPropertyWriter)
        {
            throw new IllegalStateException("BeanPropertyWriter sub-class does not override 'withSerializer()'; needs to!");
        } else
        {
            return new BeanPropertyWriter(this, jsonserializer);
        }
    }
}
