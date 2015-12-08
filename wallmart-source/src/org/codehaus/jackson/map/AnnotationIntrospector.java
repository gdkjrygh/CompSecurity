// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.map;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import org.codehaus.jackson.map.introspect.Annotated;
import org.codehaus.jackson.map.introspect.AnnotatedClass;
import org.codehaus.jackson.map.introspect.AnnotatedConstructor;
import org.codehaus.jackson.map.introspect.AnnotatedField;
import org.codehaus.jackson.map.introspect.AnnotatedMember;
import org.codehaus.jackson.map.introspect.AnnotatedMethod;
import org.codehaus.jackson.map.introspect.AnnotatedParameter;
import org.codehaus.jackson.map.introspect.NopAnnotationIntrospector;
import org.codehaus.jackson.map.introspect.VisibilityChecker;
import org.codehaus.jackson.map.jsontype.TypeResolverBuilder;
import org.codehaus.jackson.type.JavaType;

// Referenced classes of package org.codehaus.jackson.map:
//            MapperConfig

public abstract class AnnotationIntrospector
{
    public static class Pair extends AnnotationIntrospector
    {

        protected final AnnotationIntrospector _primary;
        protected final AnnotationIntrospector _secondary;

        public static AnnotationIntrospector create(AnnotationIntrospector annotationintrospector, AnnotationIntrospector annotationintrospector1)
        {
            if (annotationintrospector == null)
            {
                return annotationintrospector1;
            }
            if (annotationintrospector1 == null)
            {
                return annotationintrospector;
            } else
            {
                return new Pair(annotationintrospector, annotationintrospector1);
            }
        }

        public Collection allIntrospectors()
        {
            return allIntrospectors(((Collection) (new ArrayList())));
        }

        public Collection allIntrospectors(Collection collection)
        {
            _primary.allIntrospectors(collection);
            _secondary.allIntrospectors(collection);
            return collection;
        }

        public VisibilityChecker findAutoDetectVisibility(AnnotatedClass annotatedclass, VisibilityChecker visibilitychecker)
        {
            visibilitychecker = _secondary.findAutoDetectVisibility(annotatedclass, visibilitychecker);
            return _primary.findAutoDetectVisibility(annotatedclass, visibilitychecker);
        }

        public Boolean findCachability(AnnotatedClass annotatedclass)
        {
            Boolean boolean2 = _primary.findCachability(annotatedclass);
            Boolean boolean1 = boolean2;
            if (boolean2 == null)
            {
                boolean1 = _secondary.findCachability(annotatedclass);
            }
            return boolean1;
        }

        public Class findContentDeserializer(Annotated annotated)
        {
            Class class1;
label0:
            {
                Class class2 = _primary.findContentDeserializer(annotated);
                if (class2 != null)
                {
                    class1 = class2;
                    if (class2 != org/codehaus/jackson/map/JsonDeserializer$None)
                    {
                        break label0;
                    }
                }
                class1 = _secondary.findContentDeserializer(annotated);
            }
            return class1;
        }

        public Class findContentSerializer(Annotated annotated)
        {
            Class class1;
label0:
            {
                Class class2 = _primary.findContentSerializer(annotated);
                if (class2 != null)
                {
                    class1 = class2;
                    if (class2 != org/codehaus/jackson/map/JsonSerializer$None)
                    {
                        break label0;
                    }
                }
                class1 = _secondary.findContentSerializer(annotated);
            }
            return class1;
        }

        public String findDeserializablePropertyName(AnnotatedField annotatedfield)
        {
            String s1 = _primary.findDeserializablePropertyName(annotatedfield);
            String s;
            if (s1 == null)
            {
                s = _secondary.findDeserializablePropertyName(annotatedfield);
            } else
            {
                s = s1;
                if (s1.length() == 0)
                {
                    annotatedfield = _secondary.findDeserializablePropertyName(annotatedfield);
                    s = s1;
                    if (annotatedfield != null)
                    {
                        return annotatedfield;
                    }
                }
            }
            return s;
        }

        public Class findDeserializationContentType(Annotated annotated, JavaType javatype, String s)
        {
            Class class2 = _primary.findDeserializationContentType(annotated, javatype, s);
            Class class1 = class2;
            if (class2 == null)
            {
                class1 = _secondary.findDeserializationContentType(annotated, javatype, s);
            }
            return class1;
        }

        public Class findDeserializationKeyType(Annotated annotated, JavaType javatype, String s)
        {
            Class class2 = _primary.findDeserializationKeyType(annotated, javatype, s);
            Class class1 = class2;
            if (class2 == null)
            {
                class1 = _secondary.findDeserializationKeyType(annotated, javatype, s);
            }
            return class1;
        }

        public Class findDeserializationType(Annotated annotated, JavaType javatype, String s)
        {
            Class class2 = _primary.findDeserializationType(annotated, javatype, s);
            Class class1 = class2;
            if (class2 == null)
            {
                class1 = _secondary.findDeserializationType(annotated, javatype, s);
            }
            return class1;
        }

        public Object findDeserializer(Annotated annotated)
        {
            Object obj1 = _primary.findDeserializer(annotated);
            Object obj = obj1;
            if (obj1 == null)
            {
                obj = _secondary.findDeserializer(annotated);
            }
            return obj;
        }

        public String findEnumValue(Enum enum)
        {
            String s1 = _primary.findEnumValue(enum);
            String s = s1;
            if (s1 == null)
            {
                s = _secondary.findEnumValue(enum);
            }
            return s;
        }

        public Object findFilterId(AnnotatedClass annotatedclass)
        {
            Object obj1 = _primary.findFilterId(annotatedclass);
            Object obj = obj1;
            if (obj1 == null)
            {
                obj = _secondary.findFilterId(annotatedclass);
            }
            return obj;
        }

        public String findGettablePropertyName(AnnotatedMethod annotatedmethod)
        {
            String s1 = _primary.findGettablePropertyName(annotatedmethod);
            String s;
            if (s1 == null)
            {
                s = _secondary.findGettablePropertyName(annotatedmethod);
            } else
            {
                s = s1;
                if (s1.length() == 0)
                {
                    annotatedmethod = _secondary.findGettablePropertyName(annotatedmethod);
                    s = s1;
                    if (annotatedmethod != null)
                    {
                        return annotatedmethod;
                    }
                }
            }
            return s;
        }

        public Boolean findIgnoreUnknownProperties(AnnotatedClass annotatedclass)
        {
            Boolean boolean2 = _primary.findIgnoreUnknownProperties(annotatedclass);
            Boolean boolean1 = boolean2;
            if (boolean2 == null)
            {
                boolean1 = _secondary.findIgnoreUnknownProperties(annotatedclass);
            }
            return boolean1;
        }

        public Object findInjectableValueId(AnnotatedMember annotatedmember)
        {
            Object obj1 = _primary.findInjectableValueId(annotatedmember);
            Object obj = obj1;
            if (obj1 == null)
            {
                obj = _secondary.findInjectableValueId(annotatedmember);
            }
            return obj;
        }

        public Class findKeyDeserializer(Annotated annotated)
        {
            Class class1;
label0:
            {
                Class class2 = _primary.findKeyDeserializer(annotated);
                if (class2 != null)
                {
                    class1 = class2;
                    if (class2 != org/codehaus/jackson/map/KeyDeserializer$None)
                    {
                        break label0;
                    }
                }
                class1 = _secondary.findKeyDeserializer(annotated);
            }
            return class1;
        }

        public Class findKeySerializer(Annotated annotated)
        {
            Class class1;
label0:
            {
                Class class2 = _primary.findKeySerializer(annotated);
                if (class2 != null)
                {
                    class1 = class2;
                    if (class2 != org/codehaus/jackson/map/JsonSerializer$None)
                    {
                        break label0;
                    }
                }
                class1 = _secondary.findKeySerializer(annotated);
            }
            return class1;
        }

        public String[] findPropertiesToIgnore(AnnotatedClass annotatedclass)
        {
            String as1[] = _primary.findPropertiesToIgnore(annotatedclass);
            String as[] = as1;
            if (as1 == null)
            {
                as = _secondary.findPropertiesToIgnore(annotatedclass);
            }
            return as;
        }

        public TypeResolverBuilder findPropertyContentTypeResolver(MapperConfig mapperconfig, AnnotatedMember annotatedmember, JavaType javatype)
        {
            TypeResolverBuilder typeresolverbuilder1 = _primary.findPropertyContentTypeResolver(mapperconfig, annotatedmember, javatype);
            TypeResolverBuilder typeresolverbuilder = typeresolverbuilder1;
            if (typeresolverbuilder1 == null)
            {
                typeresolverbuilder = _secondary.findPropertyContentTypeResolver(mapperconfig, annotatedmember, javatype);
            }
            return typeresolverbuilder;
        }

        public String findPropertyNameForParam(AnnotatedParameter annotatedparameter)
        {
            String s1 = _primary.findPropertyNameForParam(annotatedparameter);
            String s = s1;
            if (s1 == null)
            {
                s = _secondary.findPropertyNameForParam(annotatedparameter);
            }
            return s;
        }

        public TypeResolverBuilder findPropertyTypeResolver(MapperConfig mapperconfig, AnnotatedMember annotatedmember, JavaType javatype)
        {
            TypeResolverBuilder typeresolverbuilder1 = _primary.findPropertyTypeResolver(mapperconfig, annotatedmember, javatype);
            TypeResolverBuilder typeresolverbuilder = typeresolverbuilder1;
            if (typeresolverbuilder1 == null)
            {
                typeresolverbuilder = _secondary.findPropertyTypeResolver(mapperconfig, annotatedmember, javatype);
            }
            return typeresolverbuilder;
        }

        public ReferenceProperty findReferenceType(AnnotatedMember annotatedmember)
        {
            ReferenceProperty referenceproperty1 = _primary.findReferenceType(annotatedmember);
            ReferenceProperty referenceproperty = referenceproperty1;
            if (referenceproperty1 == null)
            {
                referenceproperty = _secondary.findReferenceType(annotatedmember);
            }
            return referenceproperty;
        }

        public String findRootName(AnnotatedClass annotatedclass)
        {
            String s1 = _primary.findRootName(annotatedclass);
            String s;
            if (s1 == null)
            {
                s = _secondary.findRootName(annotatedclass);
            } else
            {
                s = s1;
                if (s1.length() <= 0)
                {
                    annotatedclass = _secondary.findRootName(annotatedclass);
                    s = s1;
                    if (annotatedclass != null)
                    {
                        return annotatedclass;
                    }
                }
            }
            return s;
        }

        public String findSerializablePropertyName(AnnotatedField annotatedfield)
        {
            String s1 = _primary.findSerializablePropertyName(annotatedfield);
            String s;
            if (s1 == null)
            {
                s = _secondary.findSerializablePropertyName(annotatedfield);
            } else
            {
                s = s1;
                if (s1.length() == 0)
                {
                    annotatedfield = _secondary.findSerializablePropertyName(annotatedfield);
                    s = s1;
                    if (annotatedfield != null)
                    {
                        return annotatedfield;
                    }
                }
            }
            return s;
        }

        public Class findSerializationContentType(Annotated annotated, JavaType javatype)
        {
            Class class2 = _primary.findSerializationContentType(annotated, javatype);
            Class class1 = class2;
            if (class2 == null)
            {
                class1 = _secondary.findSerializationContentType(annotated, javatype);
            }
            return class1;
        }

        public org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion findSerializationInclusion(Annotated annotated, org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion inclusion)
        {
            inclusion = _secondary.findSerializationInclusion(annotated, inclusion);
            return _primary.findSerializationInclusion(annotated, inclusion);
        }

        public Class findSerializationKeyType(Annotated annotated, JavaType javatype)
        {
            Class class2 = _primary.findSerializationKeyType(annotated, javatype);
            Class class1 = class2;
            if (class2 == null)
            {
                class1 = _secondary.findSerializationKeyType(annotated, javatype);
            }
            return class1;
        }

        public String[] findSerializationPropertyOrder(AnnotatedClass annotatedclass)
        {
            String as1[] = _primary.findSerializationPropertyOrder(annotatedclass);
            String as[] = as1;
            if (as1 == null)
            {
                as = _secondary.findSerializationPropertyOrder(annotatedclass);
            }
            return as;
        }

        public Boolean findSerializationSortAlphabetically(AnnotatedClass annotatedclass)
        {
            Boolean boolean2 = _primary.findSerializationSortAlphabetically(annotatedclass);
            Boolean boolean1 = boolean2;
            if (boolean2 == null)
            {
                boolean1 = _secondary.findSerializationSortAlphabetically(annotatedclass);
            }
            return boolean1;
        }

        public Class findSerializationType(Annotated annotated)
        {
            Class class2 = _primary.findSerializationType(annotated);
            Class class1 = class2;
            if (class2 == null)
            {
                class1 = _secondary.findSerializationType(annotated);
            }
            return class1;
        }

        public org.codehaus.jackson.map.annotate.JsonSerialize.Typing findSerializationTyping(Annotated annotated)
        {
            org.codehaus.jackson.map.annotate.JsonSerialize.Typing typing1 = _primary.findSerializationTyping(annotated);
            org.codehaus.jackson.map.annotate.JsonSerialize.Typing typing = typing1;
            if (typing1 == null)
            {
                typing = _secondary.findSerializationTyping(annotated);
            }
            return typing;
        }

        public Class[] findSerializationViews(Annotated annotated)
        {
            Class aclass1[] = _primary.findSerializationViews(annotated);
            Class aclass[] = aclass1;
            if (aclass1 == null)
            {
                aclass = _secondary.findSerializationViews(annotated);
            }
            return aclass;
        }

        public Object findSerializer(Annotated annotated)
        {
            Object obj1 = _primary.findSerializer(annotated);
            Object obj = obj1;
            if (obj1 == null)
            {
                obj = _secondary.findSerializer(annotated);
            }
            return obj;
        }

        public String findSettablePropertyName(AnnotatedMethod annotatedmethod)
        {
            String s1 = _primary.findSettablePropertyName(annotatedmethod);
            String s;
            if (s1 == null)
            {
                s = _secondary.findSettablePropertyName(annotatedmethod);
            } else
            {
                s = s1;
                if (s1.length() == 0)
                {
                    annotatedmethod = _secondary.findSettablePropertyName(annotatedmethod);
                    s = s1;
                    if (annotatedmethod != null)
                    {
                        return annotatedmethod;
                    }
                }
            }
            return s;
        }

        public List findSubtypes(Annotated annotated)
        {
            List list = _primary.findSubtypes(annotated);
            annotated = _secondary.findSubtypes(annotated);
            if (list == null || list.isEmpty())
            {
                return annotated;
            }
            if (annotated == null || annotated.isEmpty())
            {
                return list;
            } else
            {
                ArrayList arraylist = new ArrayList(list.size() + annotated.size());
                arraylist.addAll(list);
                arraylist.addAll(annotated);
                return arraylist;
            }
        }

        public String findTypeName(AnnotatedClass annotatedclass)
        {
            String s;
label0:
            {
                String s1 = _primary.findTypeName(annotatedclass);
                if (s1 != null)
                {
                    s = s1;
                    if (s1.length() != 0)
                    {
                        break label0;
                    }
                }
                s = _secondary.findTypeName(annotatedclass);
            }
            return s;
        }

        public TypeResolverBuilder findTypeResolver(MapperConfig mapperconfig, AnnotatedClass annotatedclass, JavaType javatype)
        {
            TypeResolverBuilder typeresolverbuilder1 = _primary.findTypeResolver(mapperconfig, annotatedclass, javatype);
            TypeResolverBuilder typeresolverbuilder = typeresolverbuilder1;
            if (typeresolverbuilder1 == null)
            {
                typeresolverbuilder = _secondary.findTypeResolver(mapperconfig, annotatedclass, javatype);
            }
            return typeresolverbuilder;
        }

        public Object findValueInstantiator(AnnotatedClass annotatedclass)
        {
            Object obj1 = _primary.findValueInstantiator(annotatedclass);
            Object obj = obj1;
            if (obj1 == null)
            {
                obj = _secondary.findValueInstantiator(annotatedclass);
            }
            return obj;
        }

        public boolean hasAnyGetterAnnotation(AnnotatedMethod annotatedmethod)
        {
            return _primary.hasAnyGetterAnnotation(annotatedmethod) || _secondary.hasAnyGetterAnnotation(annotatedmethod);
        }

        public boolean hasAnySetterAnnotation(AnnotatedMethod annotatedmethod)
        {
            return _primary.hasAnySetterAnnotation(annotatedmethod) || _secondary.hasAnySetterAnnotation(annotatedmethod);
        }

        public boolean hasAsValueAnnotation(AnnotatedMethod annotatedmethod)
        {
            return _primary.hasAsValueAnnotation(annotatedmethod) || _secondary.hasAsValueAnnotation(annotatedmethod);
        }

        public boolean hasCreatorAnnotation(Annotated annotated)
        {
            return _primary.hasCreatorAnnotation(annotated) || _secondary.hasCreatorAnnotation(annotated);
        }

        public boolean hasIgnoreMarker(AnnotatedMember annotatedmember)
        {
            return _primary.hasIgnoreMarker(annotatedmember) || _secondary.hasIgnoreMarker(annotatedmember);
        }

        public boolean isHandled(Annotation annotation)
        {
            return _primary.isHandled(annotation) || _secondary.isHandled(annotation);
        }

        public boolean isIgnorableConstructor(AnnotatedConstructor annotatedconstructor)
        {
            return _primary.isIgnorableConstructor(annotatedconstructor) || _secondary.isIgnorableConstructor(annotatedconstructor);
        }

        public boolean isIgnorableField(AnnotatedField annotatedfield)
        {
            return _primary.isIgnorableField(annotatedfield) || _secondary.isIgnorableField(annotatedfield);
        }

        public boolean isIgnorableMethod(AnnotatedMethod annotatedmethod)
        {
            return _primary.isIgnorableMethod(annotatedmethod) || _secondary.isIgnorableMethod(annotatedmethod);
        }

        public Boolean isIgnorableType(AnnotatedClass annotatedclass)
        {
            Boolean boolean2 = _primary.isIgnorableType(annotatedclass);
            Boolean boolean1 = boolean2;
            if (boolean2 == null)
            {
                boolean1 = _secondary.isIgnorableType(annotatedclass);
            }
            return boolean1;
        }

        public Boolean shouldUnwrapProperty(AnnotatedMember annotatedmember)
        {
            Boolean boolean2 = _primary.shouldUnwrapProperty(annotatedmember);
            Boolean boolean1 = boolean2;
            if (boolean2 == null)
            {
                boolean1 = _secondary.shouldUnwrapProperty(annotatedmember);
            }
            return boolean1;
        }

        public Pair(AnnotationIntrospector annotationintrospector, AnnotationIntrospector annotationintrospector1)
        {
            _primary = annotationintrospector;
            _secondary = annotationintrospector1;
        }
    }

    public static class ReferenceProperty
    {

        private final String _name;
        private final Type _type;

        public static ReferenceProperty back(String s)
        {
        /* block-local class not found */
        class Type {}

            return new ReferenceProperty(Type.BACK_REFERENCE, s);
        }

        public static ReferenceProperty managed(String s)
        {
            return new ReferenceProperty(Type.MANAGED_REFERENCE, s);
        }

        public String getName()
        {
            return _name;
        }

        public Type getType()
        {
            return _type;
        }

        public boolean isBackReference()
        {
            return _type == Type.BACK_REFERENCE;
        }

        public boolean isManagedReference()
        {
            return _type == Type.MANAGED_REFERENCE;
        }

        public ReferenceProperty(Type type, String s)
        {
            _type = type;
            _name = s;
        }
    }


    public AnnotationIntrospector()
    {
    }

    public static AnnotationIntrospector nopInstance()
    {
        return NopAnnotationIntrospector.instance;
    }

    public static AnnotationIntrospector pair(AnnotationIntrospector annotationintrospector, AnnotationIntrospector annotationintrospector1)
    {
        return new Pair(annotationintrospector, annotationintrospector1);
    }

    public Collection allIntrospectors()
    {
        return Collections.singletonList(this);
    }

    public Collection allIntrospectors(Collection collection)
    {
        collection.add(this);
        return collection;
    }

    public VisibilityChecker findAutoDetectVisibility(AnnotatedClass annotatedclass, VisibilityChecker visibilitychecker)
    {
        return visibilitychecker;
    }

    public Boolean findCachability(AnnotatedClass annotatedclass)
    {
        return null;
    }

    public abstract Class findContentDeserializer(Annotated annotated);

    public Class findContentSerializer(Annotated annotated)
    {
        return null;
    }

    public abstract String findDeserializablePropertyName(AnnotatedField annotatedfield);

    public abstract Class findDeserializationContentType(Annotated annotated, JavaType javatype, String s);

    public abstract Class findDeserializationKeyType(Annotated annotated, JavaType javatype, String s);

    public abstract Class findDeserializationType(Annotated annotated, JavaType javatype, String s);

    public abstract Object findDeserializer(Annotated annotated);

    public String findEnumValue(Enum enum)
    {
        return enum.name();
    }

    public Object findFilterId(AnnotatedClass annotatedclass)
    {
        return null;
    }

    public abstract String findGettablePropertyName(AnnotatedMethod annotatedmethod);

    public abstract Boolean findIgnoreUnknownProperties(AnnotatedClass annotatedclass);

    public Object findInjectableValueId(AnnotatedMember annotatedmember)
    {
        return null;
    }

    public abstract Class findKeyDeserializer(Annotated annotated);

    public Class findKeySerializer(Annotated annotated)
    {
        return null;
    }

    public abstract String[] findPropertiesToIgnore(AnnotatedClass annotatedclass);

    public TypeResolverBuilder findPropertyContentTypeResolver(MapperConfig mapperconfig, AnnotatedMember annotatedmember, JavaType javatype)
    {
        return null;
    }

    public abstract String findPropertyNameForParam(AnnotatedParameter annotatedparameter);

    public TypeResolverBuilder findPropertyTypeResolver(MapperConfig mapperconfig, AnnotatedMember annotatedmember, JavaType javatype)
    {
        return null;
    }

    public ReferenceProperty findReferenceType(AnnotatedMember annotatedmember)
    {
        return null;
    }

    public abstract String findRootName(AnnotatedClass annotatedclass);

    public abstract String findSerializablePropertyName(AnnotatedField annotatedfield);

    public Class findSerializationContentType(Annotated annotated, JavaType javatype)
    {
        return null;
    }

    public org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion findSerializationInclusion(Annotated annotated, org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion inclusion)
    {
        return inclusion;
    }

    public Class findSerializationKeyType(Annotated annotated, JavaType javatype)
    {
        return null;
    }

    public abstract String[] findSerializationPropertyOrder(AnnotatedClass annotatedclass);

    public abstract Boolean findSerializationSortAlphabetically(AnnotatedClass annotatedclass);

    public abstract Class findSerializationType(Annotated annotated);

    public abstract org.codehaus.jackson.map.annotate.JsonSerialize.Typing findSerializationTyping(Annotated annotated);

    public abstract Class[] findSerializationViews(Annotated annotated);

    public abstract Object findSerializer(Annotated annotated);

    public abstract String findSettablePropertyName(AnnotatedMethod annotatedmethod);

    public List findSubtypes(Annotated annotated)
    {
        return null;
    }

    public String findTypeName(AnnotatedClass annotatedclass)
    {
        return null;
    }

    public TypeResolverBuilder findTypeResolver(MapperConfig mapperconfig, AnnotatedClass annotatedclass, JavaType javatype)
    {
        return null;
    }

    public Object findValueInstantiator(AnnotatedClass annotatedclass)
    {
        return null;
    }

    public boolean hasAnyGetterAnnotation(AnnotatedMethod annotatedmethod)
    {
        return false;
    }

    public boolean hasAnySetterAnnotation(AnnotatedMethod annotatedmethod)
    {
        return false;
    }

    public abstract boolean hasAsValueAnnotation(AnnotatedMethod annotatedmethod);

    public boolean hasCreatorAnnotation(Annotated annotated)
    {
        return false;
    }

    public boolean hasIgnoreMarker(AnnotatedMember annotatedmember)
    {
        if (annotatedmember instanceof AnnotatedMethod)
        {
            return isIgnorableMethod((AnnotatedMethod)annotatedmember);
        }
        if (annotatedmember instanceof AnnotatedField)
        {
            return isIgnorableField((AnnotatedField)annotatedmember);
        }
        if (annotatedmember instanceof AnnotatedConstructor)
        {
            return isIgnorableConstructor((AnnotatedConstructor)annotatedmember);
        } else
        {
            return false;
        }
    }

    public abstract boolean isHandled(Annotation annotation);

    public abstract boolean isIgnorableConstructor(AnnotatedConstructor annotatedconstructor);

    public abstract boolean isIgnorableField(AnnotatedField annotatedfield);

    public abstract boolean isIgnorableMethod(AnnotatedMethod annotatedmethod);

    public Boolean isIgnorableType(AnnotatedClass annotatedclass)
    {
        return null;
    }

    public Boolean shouldUnwrapProperty(AnnotatedMember annotatedmember)
    {
        return null;
    }
}
