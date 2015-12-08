// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.map.introspect;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import org.codehaus.jackson.map.type.TypeBindings;
import org.codehaus.jackson.type.JavaType;

// Referenced classes of package org.codehaus.jackson.map.introspect:
//            AnnotationMap

public abstract class Annotated
{

    protected Annotated()
    {
    }

    protected abstract AnnotationMap getAllAnnotations();

    public abstract AnnotatedElement getAnnotated();

    public abstract Annotation getAnnotation(Class class1);

    public abstract Type getGenericType();

    protected abstract int getModifiers();

    public abstract String getName();

    public abstract Class getRawType();

    public JavaType getType(TypeBindings typebindings)
    {
        return typebindings.resolveType(getGenericType());
    }

    public final boolean hasAnnotation(Class class1)
    {
        return getAnnotation(class1) != null;
    }

    public final boolean isPublic()
    {
        return Modifier.isPublic(getModifiers());
    }

    public abstract Annotated withAnnotations(AnnotationMap annotationmap);

    public final Annotated withFallBackAnnotationsFrom(Annotated annotated)
    {
        return withAnnotations(AnnotationMap.merge(getAllAnnotations(), annotated.getAllAnnotations()));
    }
}
