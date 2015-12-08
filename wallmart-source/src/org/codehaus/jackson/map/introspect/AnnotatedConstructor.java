// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.map.introspect;

import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Type;
import org.codehaus.jackson.map.type.TypeBindings;
import org.codehaus.jackson.type.JavaType;

// Referenced classes of package org.codehaus.jackson.map.introspect:
//            AnnotatedWithParams, AnnotationMap, Annotated

public final class AnnotatedConstructor extends AnnotatedWithParams
{

    protected final Constructor _constructor;

    public AnnotatedConstructor(Constructor constructor, AnnotationMap annotationmap, AnnotationMap aannotationmap[])
    {
        super(annotationmap, aannotationmap);
        if (constructor == null)
        {
            throw new IllegalArgumentException("Null constructor not allowed");
        } else
        {
            _constructor = constructor;
            return;
        }
    }

    public final Object call()
        throws Exception
    {
        return _constructor.newInstance(new Object[0]);
    }

    public final Object call(Object aobj[])
        throws Exception
    {
        return _constructor.newInstance(aobj);
    }

    public final Object call1(Object obj)
        throws Exception
    {
        return _constructor.newInstance(new Object[] {
            obj
        });
    }

    public volatile AnnotatedElement getAnnotated()
    {
        return getAnnotated();
    }

    public Constructor getAnnotated()
    {
        return _constructor;
    }

    public Class getDeclaringClass()
    {
        return _constructor.getDeclaringClass();
    }

    public Type getGenericType()
    {
        return getRawType();
    }

    public Member getMember()
    {
        return _constructor;
    }

    public int getModifiers()
    {
        return _constructor.getModifiers();
    }

    public String getName()
    {
        return _constructor.getName();
    }

    public Class getParameterClass(int i)
    {
        Class aclass[] = _constructor.getParameterTypes();
        if (i >= aclass.length)
        {
            return null;
        } else
        {
            return aclass[i];
        }
    }

    public int getParameterCount()
    {
        return _constructor.getParameterTypes().length;
    }

    public Type getParameterType(int i)
    {
        Type atype[] = _constructor.getGenericParameterTypes();
        if (i >= atype.length)
        {
            return null;
        } else
        {
            return atype[i];
        }
    }

    public Class getRawType()
    {
        return _constructor.getDeclaringClass();
    }

    public JavaType getType(TypeBindings typebindings)
    {
        return getType(typebindings, _constructor.getTypeParameters());
    }

    public void setValue(Object obj, Object obj1)
        throws UnsupportedOperationException
    {
        throw new UnsupportedOperationException((new StringBuilder()).append("Cannot call setValue() on constructor of ").append(getDeclaringClass().getName()).toString());
    }

    public String toString()
    {
        return (new StringBuilder()).append("[constructor for ").append(getName()).append(", annotations: ").append(_annotations).append("]").toString();
    }

    public volatile Annotated withAnnotations(AnnotationMap annotationmap)
    {
        return withAnnotations(annotationmap);
    }

    public AnnotatedConstructor withAnnotations(AnnotationMap annotationmap)
    {
        return new AnnotatedConstructor(_constructor, annotationmap, _paramAnnotations);
    }
}
