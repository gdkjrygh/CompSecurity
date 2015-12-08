// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.map.introspect;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import org.codehaus.jackson.map.type.TypeBindings;
import org.codehaus.jackson.map.type.TypeFactory;
import org.codehaus.jackson.type.JavaType;

// Referenced classes of package org.codehaus.jackson.map.introspect:
//            AnnotatedMember, AnnotationMap, AnnotatedParameter

public abstract class AnnotatedWithParams extends AnnotatedMember
{

    protected final AnnotationMap _paramAnnotations[];

    protected AnnotatedWithParams(AnnotationMap annotationmap, AnnotationMap aannotationmap[])
    {
        super(annotationmap);
        _paramAnnotations = aannotationmap;
    }

    public final void addIfNotPresent(Annotation annotation)
    {
        _annotations.addIfNotPresent(annotation);
    }

    public final void addOrOverride(Annotation annotation)
    {
        _annotations.add(annotation);
    }

    public final void addOrOverrideParam(int i, Annotation annotation)
    {
        AnnotationMap annotationmap1 = _paramAnnotations[i];
        AnnotationMap annotationmap = annotationmap1;
        if (annotationmap1 == null)
        {
            annotationmap = new AnnotationMap();
            _paramAnnotations[i] = annotationmap;
        }
        annotationmap.add(annotation);
    }

    public abstract Object call()
        throws Exception;

    public abstract Object call(Object aobj[])
        throws Exception;

    public abstract Object call1(Object obj)
        throws Exception;

    public final Annotation getAnnotation(Class class1)
    {
        return _annotations.get(class1);
    }

    public final int getAnnotationCount()
    {
        return _annotations.size();
    }

    public final AnnotatedParameter getParameter(int i)
    {
        return new AnnotatedParameter(this, getParameterType(i), _paramAnnotations[i], i);
    }

    public final AnnotationMap getParameterAnnotations(int i)
    {
        if (_paramAnnotations != null && i >= 0 && i <= _paramAnnotations.length)
        {
            return _paramAnnotations[i];
        } else
        {
            return null;
        }
    }

    public abstract Class getParameterClass(int i);

    public abstract int getParameterCount();

    public abstract Type getParameterType(int i);

    protected JavaType getType(TypeBindings typebindings, TypeVariable atypevariable[])
    {
        Object obj = typebindings;
        if (atypevariable != null)
        {
            obj = typebindings;
            if (atypevariable.length > 0)
            {
                TypeBindings typebindings1 = typebindings.childInstance();
                int j = atypevariable.length;
                int i = 0;
                do
                {
                    obj = typebindings1;
                    if (i >= j)
                    {
                        break;
                    }
                    obj = atypevariable[i];
                    typebindings1._addPlaceholder(((TypeVariable) (obj)).getName());
                    typebindings = ((TypeVariable) (obj)).getBounds()[0];
                    if (typebindings == null)
                    {
                        typebindings = TypeFactory.unknownType();
                    } else
                    {
                        typebindings = typebindings1.resolveType(typebindings);
                    }
                    typebindings1.addBinding(((TypeVariable) (obj)).getName(), typebindings);
                    i++;
                } while (true);
            }
        }
        return ((TypeBindings) (obj)).resolveType(getGenericType());
    }

    protected AnnotatedParameter replaceParameterAnnotations(int i, AnnotationMap annotationmap)
    {
        _paramAnnotations[i] = annotationmap;
        return getParameter(i);
    }

    public final JavaType resolveParameterType(int i, TypeBindings typebindings)
    {
        return typebindings.resolveType(getParameterType(i));
    }
}
