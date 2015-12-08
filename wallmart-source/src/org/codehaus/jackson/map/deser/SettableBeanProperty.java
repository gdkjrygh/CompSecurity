// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.map.deser;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.JsonToken;
import org.codehaus.jackson.map.BeanProperty;
import org.codehaus.jackson.map.DeserializationContext;
import org.codehaus.jackson.map.JsonDeserializer;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.TypeDeserializer;
import org.codehaus.jackson.map.introspect.AnnotatedField;
import org.codehaus.jackson.map.introspect.AnnotatedMember;
import org.codehaus.jackson.map.introspect.AnnotatedMethod;
import org.codehaus.jackson.map.util.Annotations;
import org.codehaus.jackson.type.JavaType;
import org.codehaus.jackson.util.InternCache;

public abstract class SettableBeanProperty
    implements BeanProperty
{
    public static final class FieldProperty extends SettableBeanProperty
    {

        protected final AnnotatedField _annotated;
        protected final Field _field;

        public void deserializeAndSet(JsonParser jsonparser, DeserializationContext deserializationcontext, Object obj)
            throws IOException, JsonProcessingException
        {
            set(obj, deserialize(jsonparser, deserializationcontext));
        }

        public Annotation getAnnotation(Class class1)
        {
            return _annotated.getAnnotation(class1);
        }

        public AnnotatedMember getMember()
        {
            return _annotated;
        }

        public final void set(Object obj, Object obj1)
            throws IOException
        {
            try
            {
                _field.set(obj, obj1);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                _throwAsIOE(((Exception) (obj)), obj1);
            }
        }

        public FieldProperty withValueDeserializer(JsonDeserializer jsondeserializer)
        {
            return new FieldProperty(this, jsondeserializer);
        }

        public volatile SettableBeanProperty withValueDeserializer(JsonDeserializer jsondeserializer)
        {
            return withValueDeserializer(jsondeserializer);
        }

        public FieldProperty(String s, JavaType javatype, TypeDeserializer typedeserializer, Annotations annotations, AnnotatedField annotatedfield)
        {
            super(s, javatype, typedeserializer, annotations);
            _annotated = annotatedfield;
            _field = annotatedfield.getAnnotated();
        }

        protected FieldProperty(FieldProperty fieldproperty, JsonDeserializer jsondeserializer)
        {
            super(fieldproperty, jsondeserializer);
            _annotated = fieldproperty._annotated;
            _field = fieldproperty._field;
        }
    }

    public static final class MethodProperty extends SettableBeanProperty
    {

        protected final AnnotatedMethod _annotated;
        protected final Method _setter;

        public void deserializeAndSet(JsonParser jsonparser, DeserializationContext deserializationcontext, Object obj)
            throws IOException, JsonProcessingException
        {
            set(obj, deserialize(jsonparser, deserializationcontext));
        }

        public Annotation getAnnotation(Class class1)
        {
            return _annotated.getAnnotation(class1);
        }

        public AnnotatedMember getMember()
        {
            return _annotated;
        }

        public final void set(Object obj, Object obj1)
            throws IOException
        {
            try
            {
                _setter.invoke(obj, new Object[] {
                    obj1
                });
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                _throwAsIOE(((Exception) (obj)), obj1);
            }
        }

        public MethodProperty withValueDeserializer(JsonDeserializer jsondeserializer)
        {
            return new MethodProperty(this, jsondeserializer);
        }

        public volatile SettableBeanProperty withValueDeserializer(JsonDeserializer jsondeserializer)
        {
            return withValueDeserializer(jsondeserializer);
        }

        public MethodProperty(String s, JavaType javatype, TypeDeserializer typedeserializer, Annotations annotations, AnnotatedMethod annotatedmethod)
        {
            super(s, javatype, typedeserializer, annotations);
            _annotated = annotatedmethod;
            _setter = annotatedmethod.getAnnotated();
        }

        protected MethodProperty(MethodProperty methodproperty, JsonDeserializer jsondeserializer)
        {
            super(methodproperty, jsondeserializer);
            _annotated = methodproperty._annotated;
            _setter = methodproperty._setter;
        }
    }

    public static final class SetterlessProperty extends SettableBeanProperty
    {

        protected final AnnotatedMethod _annotated;
        protected final Method _getter;

        public final void deserializeAndSet(JsonParser jsonparser, DeserializationContext deserializationcontext, Object obj)
            throws IOException, JsonProcessingException
        {
            if (jsonparser.getCurrentToken() == JsonToken.VALUE_NULL)
            {
                return;
            }
            try
            {
                obj = _getter.invoke(obj, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (JsonParser jsonparser)
            {
                _throwAsIOE(jsonparser);
                return;
            }
            if (obj == null)
            {
                throw new JsonMappingException((new StringBuilder()).append("Problem deserializing 'setterless' property '").append(getName()).append("': get method returned null").toString());
            } else
            {
                _valueDeserializer.deserialize(jsonparser, deserializationcontext, obj);
                return;
            }
        }

        public Annotation getAnnotation(Class class1)
        {
            return _annotated.getAnnotation(class1);
        }

        public AnnotatedMember getMember()
        {
            return _annotated;
        }

        public final void set(Object obj, Object obj1)
            throws IOException
        {
            throw new UnsupportedOperationException("Should never call 'set' on setterless property");
        }

        public SetterlessProperty withValueDeserializer(JsonDeserializer jsondeserializer)
        {
            return new SetterlessProperty(this, jsondeserializer);
        }

        public volatile SettableBeanProperty withValueDeserializer(JsonDeserializer jsondeserializer)
        {
            return withValueDeserializer(jsondeserializer);
        }

        public SetterlessProperty(String s, JavaType javatype, TypeDeserializer typedeserializer, Annotations annotations, AnnotatedMethod annotatedmethod)
        {
            super(s, javatype, typedeserializer, annotations);
            _annotated = annotatedmethod;
            _getter = annotatedmethod.getAnnotated();
        }

        protected SetterlessProperty(SetterlessProperty setterlessproperty, JsonDeserializer jsondeserializer)
        {
            super(setterlessproperty, jsondeserializer);
            _annotated = setterlessproperty._annotated;
            _getter = setterlessproperty._getter;
        }
    }


    protected final Annotations _contextAnnotations;
    protected String _managedReferenceName;
    protected NullProvider _nullProvider;
    protected final String _propName;
    protected int _propertyIndex;
    protected final JavaType _type;
    protected JsonDeserializer _valueDeserializer;
    protected TypeDeserializer _valueTypeDeserializer;

    protected SettableBeanProperty(String s, JavaType javatype, TypeDeserializer typedeserializer, Annotations annotations)
    {
        _propertyIndex = -1;
        if (s == null || s.length() == 0)
        {
            _propName = "";
        } else
        {
            _propName = InternCache.instance.intern(s);
        }
        _type = javatype;
        _contextAnnotations = annotations;
        _valueTypeDeserializer = typedeserializer;
    }

    protected SettableBeanProperty(SettableBeanProperty settablebeanproperty)
    {
        _propertyIndex = -1;
        _propName = settablebeanproperty._propName;
        _type = settablebeanproperty._type;
        _contextAnnotations = settablebeanproperty._contextAnnotations;
        _valueDeserializer = settablebeanproperty._valueDeserializer;
        _valueTypeDeserializer = settablebeanproperty._valueTypeDeserializer;
        _nullProvider = settablebeanproperty._nullProvider;
        _managedReferenceName = settablebeanproperty._managedReferenceName;
        _propertyIndex = settablebeanproperty._propertyIndex;
    }

    protected SettableBeanProperty(SettableBeanProperty settablebeanproperty, JsonDeserializer jsondeserializer)
    {
        Object obj = null;
        super();
        _propertyIndex = -1;
        _propName = settablebeanproperty._propName;
        _type = settablebeanproperty._type;
        _contextAnnotations = settablebeanproperty._contextAnnotations;
        _valueTypeDeserializer = settablebeanproperty._valueTypeDeserializer;
        _managedReferenceName = settablebeanproperty._managedReferenceName;
        _propertyIndex = settablebeanproperty._propertyIndex;
        _valueDeserializer = jsondeserializer;
        if (jsondeserializer == null)
        {
            _nullProvider = null;
            return;
        }
        settablebeanproperty = ((SettableBeanProperty) (jsondeserializer.getNullValue()));
    /* block-local class not found */
    class NullProvider {}

        if (settablebeanproperty == null)
        {
            settablebeanproperty = obj;
        } else
        {
            settablebeanproperty = new NullProvider(_type, settablebeanproperty);
        }
        _nullProvider = settablebeanproperty;
    }

    protected IOException _throwAsIOE(Exception exception)
        throws IOException
    {
        if (exception instanceof IOException)
        {
            throw (IOException)exception;
        }
        if (exception instanceof RuntimeException)
        {
            throw (RuntimeException)exception;
        }
        for (; exception.getCause() != null; exception = exception.getCause()) { }
        throw new JsonMappingException(exception.getMessage(), null, exception);
    }

    protected void _throwAsIOE(Exception exception, Object obj)
        throws IOException
    {
        if (exception instanceof IllegalArgumentException)
        {
            StringBuilder stringbuilder;
            if (obj == null)
            {
                obj = "[NULL]";
            } else
            {
                obj = obj.getClass().getName();
            }
            stringbuilder = (new StringBuilder("Problem deserializing property '")).append(getPropertyName());
            stringbuilder.append("' (expected type: ").append(getType());
            stringbuilder.append("; actual type: ").append(((String) (obj))).append(")");
            obj = exception.getMessage();
            if (obj != null)
            {
                stringbuilder.append(", problem: ").append(((String) (obj)));
            } else
            {
                stringbuilder.append(" (no error message provided)");
            }
            throw new JsonMappingException(stringbuilder.toString(), null, exception);
        } else
        {
            _throwAsIOE(exception);
            return;
        }
    }

    public void assignIndex(int i)
    {
        if (_propertyIndex != -1)
        {
            throw new IllegalStateException((new StringBuilder()).append("Property '").append(getName()).append("' already had index (").append(_propertyIndex).append("), trying to assign ").append(i).toString());
        } else
        {
            _propertyIndex = i;
            return;
        }
    }

    public final Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException
    {
        if (jsonparser.getCurrentToken() == JsonToken.VALUE_NULL)
        {
            if (_nullProvider == null)
            {
                return null;
            } else
            {
                return _nullProvider.nullValue(deserializationcontext);
            }
        }
        if (_valueTypeDeserializer != null)
        {
            return _valueDeserializer.deserializeWithType(jsonparser, deserializationcontext, _valueTypeDeserializer);
        } else
        {
            return _valueDeserializer.deserialize(jsonparser, deserializationcontext);
        }
    }

    public abstract void deserializeAndSet(JsonParser jsonparser, DeserializationContext deserializationcontext, Object obj)
        throws IOException, JsonProcessingException;

    public abstract Annotation getAnnotation(Class class1);

    public Annotation getContextAnnotation(Class class1)
    {
        return _contextAnnotations.get(class1);
    }

    protected final Class getDeclaringClass()
    {
        return getMember().getDeclaringClass();
    }

    public Object getInjectableValueId()
    {
        return null;
    }

    public String getManagedReferenceName()
    {
        return _managedReferenceName;
    }

    public abstract AnnotatedMember getMember();

    public final String getName()
    {
        return _propName;
    }

    public int getPropertyIndex()
    {
        return _propertyIndex;
    }

    public String getPropertyName()
    {
        return _propName;
    }

    public int getProperytIndex()
    {
        return getPropertyIndex();
    }

    public JavaType getType()
    {
        return _type;
    }

    public JsonDeserializer getValueDeserializer()
    {
        return _valueDeserializer;
    }

    public TypeDeserializer getValueTypeDeserializer()
    {
        return _valueTypeDeserializer;
    }

    public boolean hasValueDeserializer()
    {
        return _valueDeserializer != null;
    }

    public boolean hasValueTypeDeserializer()
    {
        return _valueTypeDeserializer != null;
    }

    public abstract void set(Object obj, Object obj1)
        throws IOException;

    public void setManagedReferenceName(String s)
    {
        _managedReferenceName = s;
    }

    public void setValueDeserializer(JsonDeserializer jsondeserializer)
    {
        if (_valueDeserializer != null)
        {
            throw new IllegalStateException((new StringBuilder()).append("Already had assigned deserializer for property '").append(getName()).append("' (class ").append(getDeclaringClass().getName()).append(")").toString());
        }
        _valueDeserializer = jsondeserializer;
        jsondeserializer = ((JsonDeserializer) (_valueDeserializer.getNullValue()));
        if (jsondeserializer == null)
        {
            jsondeserializer = null;
        } else
        {
            jsondeserializer = new NullProvider(_type, jsondeserializer);
        }
        _nullProvider = jsondeserializer;
    }

    public String toString()
    {
        return (new StringBuilder()).append("[property '").append(getName()).append("']").toString();
    }

    public abstract SettableBeanProperty withValueDeserializer(JsonDeserializer jsondeserializer);

    // Unreferenced inner class org/codehaus/jackson/map/deser/SettableBeanProperty$InnerClassProperty
    /* block-local class not found */
    class InnerClassProperty {}


    // Unreferenced inner class org/codehaus/jackson/map/deser/SettableBeanProperty$ManagedReferenceProperty
    /* block-local class not found */
    class ManagedReferenceProperty {}

}
