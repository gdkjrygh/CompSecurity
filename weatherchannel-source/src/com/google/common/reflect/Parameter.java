// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.reflect;

import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableList;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.util.Iterator;

// Referenced classes of package com.google.common.reflect:
//            Invokable, TypeToken

public final class Parameter
    implements AnnotatedElement
{

    private final ImmutableList annotations;
    private final Invokable declaration;
    private final int position;
    private final TypeToken type;

    Parameter(Invokable invokable, int i, TypeToken typetoken, Annotation aannotation[])
    {
        declaration = invokable;
        position = i;
        type = typetoken;
        annotations = ImmutableList.copyOf(aannotation);
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof Parameter)
        {
            obj = (Parameter)obj;
            flag = flag1;
            if (position == ((Parameter) (obj)).position)
            {
                flag = flag1;
                if (declaration.equals(((Parameter) (obj)).declaration))
                {
                    flag = true;
                }
            }
        }
        return flag;
    }

    public Annotation getAnnotation(Class class1)
    {
        Preconditions.checkNotNull(class1);
        for (Iterator iterator = annotations.iterator(); iterator.hasNext();)
        {
            Annotation annotation = (Annotation)iterator.next();
            if (class1.isInstance(annotation))
            {
                return (Annotation)class1.cast(annotation);
            }
        }

        return null;
    }

    public Annotation[] getAnnotations()
    {
        return getDeclaredAnnotations();
    }

    public Annotation[] getAnnotationsByType(Class class1)
    {
        return getDeclaredAnnotationsByType(class1);
    }

    public Annotation getDeclaredAnnotation(Class class1)
    {
        Preconditions.checkNotNull(class1);
        return (Annotation)FluentIterable.from(annotations).filter(class1).first().orNull();
    }

    public Annotation[] getDeclaredAnnotations()
    {
        return (Annotation[])annotations.toArray(new Annotation[annotations.size()]);
    }

    public Annotation[] getDeclaredAnnotationsByType(Class class1)
    {
        return (Annotation[])FluentIterable.from(annotations).filter(class1).toArray(class1);
    }

    public Invokable getDeclaringInvokable()
    {
        return declaration;
    }

    public TypeToken getType()
    {
        return type;
    }

    public int hashCode()
    {
        return position;
    }

    public boolean isAnnotationPresent(Class class1)
    {
        return getAnnotation(class1) != null;
    }

    public String toString()
    {
        String s = String.valueOf(String.valueOf(type));
        int i = position;
        return (new StringBuilder(s.length() + 15)).append(s).append(" arg").append(i).toString();
    }
}
