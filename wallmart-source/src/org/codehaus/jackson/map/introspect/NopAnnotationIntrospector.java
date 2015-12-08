// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.map.introspect;

import java.lang.annotation.Annotation;
import org.codehaus.jackson.map.AnnotationIntrospector;
import org.codehaus.jackson.type.JavaType;

// Referenced classes of package org.codehaus.jackson.map.introspect:
//            Annotated, AnnotatedField, AnnotatedMethod, AnnotatedClass, 
//            AnnotatedParameter, AnnotatedMember, AnnotatedConstructor

public class NopAnnotationIntrospector extends AnnotationIntrospector
{

    public static final NopAnnotationIntrospector instance = new NopAnnotationIntrospector();

    public NopAnnotationIntrospector()
    {
    }

    public Class findContentDeserializer(Annotated annotated)
    {
        return null;
    }

    public String findDeserializablePropertyName(AnnotatedField annotatedfield)
    {
        return null;
    }

    public Class findDeserializationContentType(Annotated annotated, JavaType javatype, String s)
    {
        return null;
    }

    public Class findDeserializationKeyType(Annotated annotated, JavaType javatype, String s)
    {
        return null;
    }

    public Class findDeserializationType(Annotated annotated, JavaType javatype, String s)
    {
        return null;
    }

    public Object findDeserializer(Annotated annotated)
    {
        return null;
    }

    public String findEnumValue(Enum enum)
    {
        return enum.name();
    }

    public String findGettablePropertyName(AnnotatedMethod annotatedmethod)
    {
        return null;
    }

    public Boolean findIgnoreUnknownProperties(AnnotatedClass annotatedclass)
    {
        return null;
    }

    public Class findKeyDeserializer(Annotated annotated)
    {
        return null;
    }

    public String[] findPropertiesToIgnore(AnnotatedClass annotatedclass)
    {
        return null;
    }

    public String findPropertyNameForParam(AnnotatedParameter annotatedparameter)
    {
        return null;
    }

    public String findRootName(AnnotatedClass annotatedclass)
    {
        return null;
    }

    public String findSerializablePropertyName(AnnotatedField annotatedfield)
    {
        return null;
    }

    public String[] findSerializationPropertyOrder(AnnotatedClass annotatedclass)
    {
        return null;
    }

    public Boolean findSerializationSortAlphabetically(AnnotatedClass annotatedclass)
    {
        return null;
    }

    public Class findSerializationType(Annotated annotated)
    {
        return null;
    }

    public org.codehaus.jackson.map.annotate.JsonSerialize.Typing findSerializationTyping(Annotated annotated)
    {
        return null;
    }

    public Class[] findSerializationViews(Annotated annotated)
    {
        return null;
    }

    public Object findSerializer(Annotated annotated)
    {
        return null;
    }

    public String findSettablePropertyName(AnnotatedMethod annotatedmethod)
    {
        return null;
    }

    public boolean hasAsValueAnnotation(AnnotatedMethod annotatedmethod)
    {
        return false;
    }

    public boolean hasIgnoreMarker(AnnotatedMember annotatedmember)
    {
        return false;
    }

    public boolean isHandled(Annotation annotation)
    {
        return false;
    }

    public boolean isIgnorableConstructor(AnnotatedConstructor annotatedconstructor)
    {
        return false;
    }

    public boolean isIgnorableField(AnnotatedField annotatedfield)
    {
        return false;
    }

    public boolean isIgnorableMethod(AnnotatedMethod annotatedmethod)
    {
        return false;
    }

}
