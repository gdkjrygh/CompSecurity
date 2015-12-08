// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.map.introspect;

import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import org.codehaus.jackson.map.type.TypeBindings;
import org.codehaus.jackson.type.JavaType;

// Referenced classes of package org.codehaus.jackson.map.introspect:
//            AnnotatedWithParams, AnnotationMap, Annotated

public final class AnnotatedMethod extends AnnotatedWithParams
{

    protected final Method _method;
    protected Class _paramTypes[];

    public AnnotatedMethod(Method method, AnnotationMap annotationmap, AnnotationMap aannotationmap[])
    {
        super(annotationmap, aannotationmap);
        _method = method;
    }

    public final Object call()
        throws Exception
    {
        return _method.invoke(null, new Object[0]);
    }

    public final Object call(Object aobj[])
        throws Exception
    {
        return _method.invoke(null, aobj);
    }

    public final Object call1(Object obj)
        throws Exception
    {
        return _method.invoke(null, new Object[] {
            obj
        });
    }

    public volatile AnnotatedElement getAnnotated()
    {
        return getAnnotated();
    }

    public Method getAnnotated()
    {
        return _method;
    }

    public Class getDeclaringClass()
    {
        return _method.getDeclaringClass();
    }

    public String getFullName()
    {
        return (new StringBuilder()).append(getDeclaringClass().getName()).append("#").append(getName()).append("(").append(getParameterCount()).append(" params)").toString();
    }

    public Type getGenericType()
    {
        return _method.getGenericReturnType();
    }

    public Member getMember()
    {
        return _method;
    }

    public int getModifiers()
    {
        return _method.getModifiers();
    }

    public String getName()
    {
        return _method.getName();
    }

    public Class getParameterClass(int i)
    {
        Class aclass[] = _method.getParameterTypes();
        if (i >= aclass.length)
        {
            return null;
        } else
        {
            return aclass[i];
        }
    }

    public Class[] getParameterClasses()
    {
        if (_paramTypes == null)
        {
            _paramTypes = _method.getParameterTypes();
        }
        return _paramTypes;
    }

    public int getParameterCount()
    {
        return getParameterTypes().length;
    }

    public Type getParameterType(int i)
    {
        Type atype[] = _method.getGenericParameterTypes();
        if (i >= atype.length)
        {
            return null;
        } else
        {
            return atype[i];
        }
    }

    public Type[] getParameterTypes()
    {
        return _method.getGenericParameterTypes();
    }

    public Class getRawType()
    {
        return _method.getReturnType();
    }

    public JavaType getType(TypeBindings typebindings)
    {
        return getType(typebindings, _method.getTypeParameters());
    }

    public void setValue(Object obj, Object obj1)
        throws IllegalArgumentException
    {
        try
        {
            _method.invoke(obj, new Object[] {
                obj1
            });
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Failed to setValue() with method ").append(getFullName()).append(": ").append(((IllegalAccessException) (obj)).getMessage()).toString(), ((Throwable) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Failed to setValue() with method ").append(getFullName()).append(": ").append(((InvocationTargetException) (obj)).getMessage()).toString(), ((Throwable) (obj)));
        }
    }

    public String toString()
    {
        return (new StringBuilder()).append("[method ").append(getName()).append(", annotations: ").append(_annotations).append("]").toString();
    }

    public volatile Annotated withAnnotations(AnnotationMap annotationmap)
    {
        return withAnnotations(annotationmap);
    }

    public AnnotatedMethod withAnnotations(AnnotationMap annotationmap)
    {
        return new AnnotatedMethod(_method, annotationmap, _paramAnnotations);
    }

    public AnnotatedMethod withMethod(Method method)
    {
        return new AnnotatedMethod(method, _annotations, _paramAnnotations);
    }
}
