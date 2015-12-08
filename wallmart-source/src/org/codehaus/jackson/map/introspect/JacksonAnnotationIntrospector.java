// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.map.introspect;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;
import org.codehaus.jackson.annotate.JacksonAnnotation;
import org.codehaus.jackson.annotate.JsonAnyGetter;
import org.codehaus.jackson.annotate.JsonAnySetter;
import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonBackReference;
import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonGetter;
import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonIgnoreType;
import org.codehaus.jackson.annotate.JsonManagedReference;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;
import org.codehaus.jackson.annotate.JsonRawValue;
import org.codehaus.jackson.annotate.JsonSetter;
import org.codehaus.jackson.annotate.JsonSubTypes;
import org.codehaus.jackson.annotate.JsonTypeInfo;
import org.codehaus.jackson.annotate.JsonTypeName;
import org.codehaus.jackson.annotate.JsonUnwrapped;
import org.codehaus.jackson.annotate.JsonValue;
import org.codehaus.jackson.annotate.JsonWriteNullProperties;
import org.codehaus.jackson.map.AnnotationIntrospector;
import org.codehaus.jackson.map.MapperConfig;
import org.codehaus.jackson.map.annotate.JacksonInject;
import org.codehaus.jackson.map.annotate.JsonCachable;
import org.codehaus.jackson.map.annotate.JsonDeserialize;
import org.codehaus.jackson.map.annotate.JsonFilter;
import org.codehaus.jackson.map.annotate.JsonRootName;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonTypeIdResolver;
import org.codehaus.jackson.map.annotate.JsonTypeResolver;
import org.codehaus.jackson.map.annotate.JsonValueInstantiator;
import org.codehaus.jackson.map.annotate.JsonView;
import org.codehaus.jackson.map.annotate.NoClass;
import org.codehaus.jackson.map.jsontype.NamedType;
import org.codehaus.jackson.map.jsontype.TypeIdResolver;
import org.codehaus.jackson.map.jsontype.TypeResolverBuilder;
import org.codehaus.jackson.map.jsontype.impl.StdTypeResolverBuilder;
import org.codehaus.jackson.map.ser.std.RawSerializer;
import org.codehaus.jackson.type.JavaType;

// Referenced classes of package org.codehaus.jackson.map.introspect:
//            Annotated, AnnotatedClass, VisibilityChecker, AnnotatedField, 
//            AnnotatedMethod, AnnotatedMember, AnnotatedParameter, AnnotatedConstructor

public class JacksonAnnotationIntrospector extends AnnotationIntrospector
{

    public JacksonAnnotationIntrospector()
    {
    }

    protected StdTypeResolverBuilder _constructNoTypeResolverBuilder()
    {
        return StdTypeResolverBuilder.noTypeInfoBuilder();
    }

    protected StdTypeResolverBuilder _constructStdTypeResolverBuilder()
    {
        return new StdTypeResolverBuilder();
    }

    protected TypeResolverBuilder _findTypeResolver(MapperConfig mapperconfig, Annotated annotated, JavaType javatype)
    {
        Object obj;
        JsonTypeInfo jsontypeinfo;
        jsontypeinfo = (JsonTypeInfo)annotated.getAnnotation(org/codehaus/jackson/annotate/JsonTypeInfo);
        obj = (JsonTypeResolver)annotated.getAnnotation(org/codehaus/jackson/map/annotate/JsonTypeResolver);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_171;
        }
        if (jsontypeinfo != null) goto _L2; else goto _L1
_L1:
        mapperconfig = null;
_L4:
        return mapperconfig;
_L2:
        obj = mapperconfig.typeResolverBuilderInstance(annotated, ((JsonTypeResolver) (obj)).value());
_L5:
        JsonTypeIdResolver jsontypeidresolver = (JsonTypeIdResolver)annotated.getAnnotation(org/codehaus/jackson/map/annotate/JsonTypeIdResolver);
        if (jsontypeidresolver == null)
        {
            mapperconfig = null;
        } else
        {
            mapperconfig = mapperconfig.typeIdResolverInstance(annotated, jsontypeidresolver.value());
        }
        if (mapperconfig != null)
        {
            mapperconfig.init(javatype);
        }
        obj = ((TypeResolverBuilder) (obj)).init(jsontypeinfo.use(), mapperconfig);
        javatype = jsontypeinfo.include();
        mapperconfig = javatype;
        if (javatype == org.codehaus.jackson.annotate.JsonTypeInfo.As.EXTERNAL_PROPERTY)
        {
            mapperconfig = javatype;
            if (annotated instanceof AnnotatedClass)
            {
                mapperconfig = org.codehaus.jackson.annotate.JsonTypeInfo.As.PROPERTY;
            }
        }
        annotated = ((TypeResolverBuilder) (obj)).inclusion(mapperconfig).typeProperty(jsontypeinfo.property());
        javatype = jsontypeinfo.defaultImpl();
        mapperconfig = annotated;
        if (javatype == org/codehaus/jackson/annotate/JsonTypeInfo$None) goto _L4; else goto _L3
_L3:
        return annotated.defaultImpl(javatype);
        if (jsontypeinfo == null)
        {
            return null;
        }
        if (jsontypeinfo.use() == org.codehaus.jackson.annotate.JsonTypeInfo.Id.NONE)
        {
            return _constructNoTypeResolverBuilder();
        }
        obj = _constructStdTypeResolverBuilder();
          goto _L5
    }

    protected boolean _isIgnorable(Annotated annotated)
    {
        annotated = (JsonIgnore)annotated.getAnnotation(org/codehaus/jackson/annotate/JsonIgnore);
        return annotated != null && annotated.value();
    }

    public VisibilityChecker findAutoDetectVisibility(AnnotatedClass annotatedclass, VisibilityChecker visibilitychecker)
    {
        annotatedclass = (JsonAutoDetect)annotatedclass.getAnnotation(org/codehaus/jackson/annotate/JsonAutoDetect);
        if (annotatedclass == null)
        {
            return visibilitychecker;
        } else
        {
            return visibilitychecker.with(annotatedclass);
        }
    }

    public Boolean findCachability(AnnotatedClass annotatedclass)
    {
        annotatedclass = (JsonCachable)annotatedclass.getAnnotation(org/codehaus/jackson/map/annotate/JsonCachable);
        if (annotatedclass == null)
        {
            return null;
        }
        if (annotatedclass.value())
        {
            return Boolean.TRUE;
        } else
        {
            return Boolean.FALSE;
        }
    }

    public Class findContentDeserializer(Annotated annotated)
    {
        annotated = (JsonDeserialize)annotated.getAnnotation(org/codehaus/jackson/map/annotate/JsonDeserialize);
        if (annotated != null)
        {
            annotated = annotated.contentUsing();
            if (annotated != org/codehaus/jackson/map/JsonDeserializer$None)
            {
                return annotated;
            }
        }
        return null;
    }

    public Class findContentSerializer(Annotated annotated)
    {
        annotated = (JsonSerialize)annotated.getAnnotation(org/codehaus/jackson/map/annotate/JsonSerialize);
        if (annotated != null)
        {
            annotated = annotated.contentUsing();
            if (annotated != org/codehaus/jackson/map/JsonSerializer$None)
            {
                return annotated;
            }
        }
        return null;
    }

    public String findDeserializablePropertyName(AnnotatedField annotatedfield)
    {
        JsonProperty jsonproperty = (JsonProperty)annotatedfield.getAnnotation(org/codehaus/jackson/annotate/JsonProperty);
        if (jsonproperty != null)
        {
            return jsonproperty.value();
        }
        if (annotatedfield.hasAnnotation(org/codehaus/jackson/map/annotate/JsonDeserialize) || annotatedfield.hasAnnotation(org/codehaus/jackson/map/annotate/JsonView) || annotatedfield.hasAnnotation(org/codehaus/jackson/annotate/JsonBackReference) || annotatedfield.hasAnnotation(org/codehaus/jackson/annotate/JsonManagedReference))
        {
            return "";
        } else
        {
            return null;
        }
    }

    public Class findDeserializationContentType(Annotated annotated, JavaType javatype, String s)
    {
        annotated = (JsonDeserialize)annotated.getAnnotation(org/codehaus/jackson/map/annotate/JsonDeserialize);
        if (annotated != null)
        {
            annotated = annotated.contentAs();
            if (annotated != org/codehaus/jackson/map/annotate/NoClass)
            {
                return annotated;
            }
        }
        return null;
    }

    public Class findDeserializationKeyType(Annotated annotated, JavaType javatype, String s)
    {
        annotated = (JsonDeserialize)annotated.getAnnotation(org/codehaus/jackson/map/annotate/JsonDeserialize);
        if (annotated != null)
        {
            annotated = annotated.keyAs();
            if (annotated != org/codehaus/jackson/map/annotate/NoClass)
            {
                return annotated;
            }
        }
        return null;
    }

    public Class findDeserializationType(Annotated annotated, JavaType javatype, String s)
    {
        annotated = (JsonDeserialize)annotated.getAnnotation(org/codehaus/jackson/map/annotate/JsonDeserialize);
        if (annotated != null)
        {
            annotated = annotated.as();
            if (annotated != org/codehaus/jackson/map/annotate/NoClass)
            {
                return annotated;
            }
        }
        return null;
    }

    public Class findDeserializer(Annotated annotated)
    {
        annotated = (JsonDeserialize)annotated.getAnnotation(org/codehaus/jackson/map/annotate/JsonDeserialize);
        if (annotated != null)
        {
            annotated = annotated.using();
            if (annotated != org/codehaus/jackson/map/JsonDeserializer$None)
            {
                return annotated;
            }
        }
        return null;
    }

    public volatile Object findDeserializer(Annotated annotated)
    {
        return findDeserializer(annotated);
    }

    public String findEnumValue(Enum enum)
    {
        return enum.name();
    }

    public Object findFilterId(AnnotatedClass annotatedclass)
    {
        annotatedclass = (JsonFilter)annotatedclass.getAnnotation(org/codehaus/jackson/map/annotate/JsonFilter);
        if (annotatedclass != null)
        {
            annotatedclass = annotatedclass.value();
            if (annotatedclass.length() > 0)
            {
                return annotatedclass;
            }
        }
        return null;
    }

    public String findGettablePropertyName(AnnotatedMethod annotatedmethod)
    {
        Object obj = (JsonProperty)annotatedmethod.getAnnotation(org/codehaus/jackson/annotate/JsonProperty);
        if (obj != null)
        {
            return ((JsonProperty) (obj)).value();
        }
        obj = (JsonGetter)annotatedmethod.getAnnotation(org/codehaus/jackson/annotate/JsonGetter);
        if (obj != null)
        {
            return ((JsonGetter) (obj)).value();
        }
        if (annotatedmethod.hasAnnotation(org/codehaus/jackson/map/annotate/JsonSerialize) || annotatedmethod.hasAnnotation(org/codehaus/jackson/map/annotate/JsonView))
        {
            return "";
        } else
        {
            return null;
        }
    }

    public Boolean findIgnoreUnknownProperties(AnnotatedClass annotatedclass)
    {
        annotatedclass = (JsonIgnoreProperties)annotatedclass.getAnnotation(org/codehaus/jackson/annotate/JsonIgnoreProperties);
        if (annotatedclass == null)
        {
            return null;
        } else
        {
            return Boolean.valueOf(annotatedclass.ignoreUnknown());
        }
    }

    public Object findInjectableValueId(AnnotatedMember annotatedmember)
    {
        Object obj = (JacksonInject)annotatedmember.getAnnotation(org/codehaus/jackson/map/annotate/JacksonInject);
        if (obj == null)
        {
            obj = null;
        } else
        {
            String s = ((JacksonInject) (obj)).value();
            obj = s;
            if (s.length() == 0)
            {
                if (!(annotatedmember instanceof AnnotatedMethod))
                {
                    return annotatedmember.getRawType().getName();
                }
                AnnotatedMethod annotatedmethod = (AnnotatedMethod)annotatedmember;
                if (annotatedmethod.getParameterCount() == 0)
                {
                    return annotatedmember.getRawType().getName();
                } else
                {
                    return annotatedmethod.getParameterClass(0).getName();
                }
            }
        }
        return obj;
    }

    public Class findKeyDeserializer(Annotated annotated)
    {
        annotated = (JsonDeserialize)annotated.getAnnotation(org/codehaus/jackson/map/annotate/JsonDeserialize);
        if (annotated != null)
        {
            annotated = annotated.keyUsing();
            if (annotated != org/codehaus/jackson/map/KeyDeserializer$None)
            {
                return annotated;
            }
        }
        return null;
    }

    public Class findKeySerializer(Annotated annotated)
    {
        annotated = (JsonSerialize)annotated.getAnnotation(org/codehaus/jackson/map/annotate/JsonSerialize);
        if (annotated != null)
        {
            annotated = annotated.keyUsing();
            if (annotated != org/codehaus/jackson/map/JsonSerializer$None)
            {
                return annotated;
            }
        }
        return null;
    }

    public String[] findPropertiesToIgnore(AnnotatedClass annotatedclass)
    {
        annotatedclass = (JsonIgnoreProperties)annotatedclass.getAnnotation(org/codehaus/jackson/annotate/JsonIgnoreProperties);
        if (annotatedclass == null)
        {
            return null;
        } else
        {
            return annotatedclass.value();
        }
    }

    public TypeResolverBuilder findPropertyContentTypeResolver(MapperConfig mapperconfig, AnnotatedMember annotatedmember, JavaType javatype)
    {
        if (!javatype.isContainerType())
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Must call method with a container type (got ").append(javatype).append(")").toString());
        } else
        {
            return _findTypeResolver(mapperconfig, annotatedmember, javatype);
        }
    }

    public String findPropertyNameForParam(AnnotatedParameter annotatedparameter)
    {
        if (annotatedparameter != null)
        {
            annotatedparameter = (JsonProperty)annotatedparameter.getAnnotation(org/codehaus/jackson/annotate/JsonProperty);
            if (annotatedparameter != null)
            {
                return annotatedparameter.value();
            }
        }
        return null;
    }

    public TypeResolverBuilder findPropertyTypeResolver(MapperConfig mapperconfig, AnnotatedMember annotatedmember, JavaType javatype)
    {
        if (javatype.isContainerType())
        {
            return null;
        } else
        {
            return _findTypeResolver(mapperconfig, annotatedmember, javatype);
        }
    }

    public org.codehaus.jackson.map.AnnotationIntrospector.ReferenceProperty findReferenceType(AnnotatedMember annotatedmember)
    {
        JsonManagedReference jsonmanagedreference = (JsonManagedReference)annotatedmember.getAnnotation(org/codehaus/jackson/annotate/JsonManagedReference);
        if (jsonmanagedreference != null)
        {
            return org.codehaus.jackson.map.AnnotationIntrospector.ReferenceProperty.managed(jsonmanagedreference.value());
        }
        annotatedmember = (JsonBackReference)annotatedmember.getAnnotation(org/codehaus/jackson/annotate/JsonBackReference);
        if (annotatedmember != null)
        {
            return org.codehaus.jackson.map.AnnotationIntrospector.ReferenceProperty.back(annotatedmember.value());
        } else
        {
            return null;
        }
    }

    public String findRootName(AnnotatedClass annotatedclass)
    {
        annotatedclass = (JsonRootName)annotatedclass.getAnnotation(org/codehaus/jackson/map/annotate/JsonRootName);
        if (annotatedclass == null)
        {
            return null;
        } else
        {
            return annotatedclass.value();
        }
    }

    public String findSerializablePropertyName(AnnotatedField annotatedfield)
    {
        JsonProperty jsonproperty = (JsonProperty)annotatedfield.getAnnotation(org/codehaus/jackson/annotate/JsonProperty);
        if (jsonproperty != null)
        {
            return jsonproperty.value();
        }
        if (annotatedfield.hasAnnotation(org/codehaus/jackson/map/annotate/JsonSerialize) || annotatedfield.hasAnnotation(org/codehaus/jackson/map/annotate/JsonView))
        {
            return "";
        } else
        {
            return null;
        }
    }

    public Class findSerializationContentType(Annotated annotated, JavaType javatype)
    {
        annotated = (JsonSerialize)annotated.getAnnotation(org/codehaus/jackson/map/annotate/JsonSerialize);
        if (annotated != null)
        {
            annotated = annotated.contentAs();
            if (annotated != org/codehaus/jackson/map/annotate/NoClass)
            {
                return annotated;
            }
        }
        return null;
    }

    public org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion findSerializationInclusion(Annotated annotated, org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion inclusion)
    {
        JsonSerialize jsonserialize = (JsonSerialize)annotated.getAnnotation(org/codehaus/jackson/map/annotate/JsonSerialize);
        if (jsonserialize != null)
        {
            return jsonserialize.include();
        }
        annotated = (JsonWriteNullProperties)annotated.getAnnotation(org/codehaus/jackson/annotate/JsonWriteNullProperties);
        if (annotated != null)
        {
            if (annotated.value())
            {
                return org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion.ALWAYS;
            } else
            {
                return org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion.NON_NULL;
            }
        } else
        {
            return inclusion;
        }
    }

    public Class findSerializationKeyType(Annotated annotated, JavaType javatype)
    {
        annotated = (JsonSerialize)annotated.getAnnotation(org/codehaus/jackson/map/annotate/JsonSerialize);
        if (annotated != null)
        {
            annotated = annotated.keyAs();
            if (annotated != org/codehaus/jackson/map/annotate/NoClass)
            {
                return annotated;
            }
        }
        return null;
    }

    public String[] findSerializationPropertyOrder(AnnotatedClass annotatedclass)
    {
        annotatedclass = (JsonPropertyOrder)annotatedclass.getAnnotation(org/codehaus/jackson/annotate/JsonPropertyOrder);
        if (annotatedclass == null)
        {
            return null;
        } else
        {
            return annotatedclass.value();
        }
    }

    public Boolean findSerializationSortAlphabetically(AnnotatedClass annotatedclass)
    {
        annotatedclass = (JsonPropertyOrder)annotatedclass.getAnnotation(org/codehaus/jackson/annotate/JsonPropertyOrder);
        if (annotatedclass == null)
        {
            return null;
        } else
        {
            return Boolean.valueOf(annotatedclass.alphabetic());
        }
    }

    public Class findSerializationType(Annotated annotated)
    {
        annotated = (JsonSerialize)annotated.getAnnotation(org/codehaus/jackson/map/annotate/JsonSerialize);
        if (annotated != null)
        {
            annotated = annotated.as();
            if (annotated != org/codehaus/jackson/map/annotate/NoClass)
            {
                return annotated;
            }
        }
        return null;
    }

    public org.codehaus.jackson.map.annotate.JsonSerialize.Typing findSerializationTyping(Annotated annotated)
    {
        annotated = (JsonSerialize)annotated.getAnnotation(org/codehaus/jackson/map/annotate/JsonSerialize);
        if (annotated == null)
        {
            return null;
        } else
        {
            return annotated.typing();
        }
    }

    public Class[] findSerializationViews(Annotated annotated)
    {
        annotated = (JsonView)annotated.getAnnotation(org/codehaus/jackson/map/annotate/JsonView);
        if (annotated == null)
        {
            return null;
        } else
        {
            return annotated.value();
        }
    }

    public Object findSerializer(Annotated annotated)
    {
        Object obj = (JsonSerialize)annotated.getAnnotation(org/codehaus/jackson/map/annotate/JsonSerialize);
        if (obj != null)
        {
            obj = ((JsonSerialize) (obj)).using();
            if (obj != org/codehaus/jackson/map/JsonSerializer$None)
            {
                return obj;
            }
        }
        obj = (JsonRawValue)annotated.getAnnotation(org/codehaus/jackson/annotate/JsonRawValue);
        if (obj != null && ((JsonRawValue) (obj)).value())
        {
            return new RawSerializer(annotated.getRawType());
        } else
        {
            return null;
        }
    }

    public String findSettablePropertyName(AnnotatedMethod annotatedmethod)
    {
        Object obj = (JsonProperty)annotatedmethod.getAnnotation(org/codehaus/jackson/annotate/JsonProperty);
        if (obj != null)
        {
            return ((JsonProperty) (obj)).value();
        }
        obj = (JsonSetter)annotatedmethod.getAnnotation(org/codehaus/jackson/annotate/JsonSetter);
        if (obj != null)
        {
            return ((JsonSetter) (obj)).value();
        }
        if (annotatedmethod.hasAnnotation(org/codehaus/jackson/map/annotate/JsonDeserialize) || annotatedmethod.hasAnnotation(org/codehaus/jackson/map/annotate/JsonView) || annotatedmethod.hasAnnotation(org/codehaus/jackson/annotate/JsonBackReference) || annotatedmethod.hasAnnotation(org/codehaus/jackson/annotate/JsonManagedReference))
        {
            return "";
        } else
        {
            return null;
        }
    }

    public List findSubtypes(Annotated annotated)
    {
        annotated = (JsonSubTypes)annotated.getAnnotation(org/codehaus/jackson/annotate/JsonSubTypes);
        if (annotated != null) goto _L2; else goto _L1
_L1:
        annotated = null;
_L4:
        return annotated;
_L2:
        org.codehaus.jackson.annotate.JsonSubTypes.Type atype[] = annotated.value();
        ArrayList arraylist = new ArrayList(atype.length);
        int j = atype.length;
        int i = 0;
        do
        {
            annotated = arraylist;
            if (i >= j)
            {
                continue;
            }
            annotated = atype[i];
            arraylist.add(new NamedType(annotated.value(), annotated.name()));
            i++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public String findTypeName(AnnotatedClass annotatedclass)
    {
        annotatedclass = (JsonTypeName)annotatedclass.getAnnotation(org/codehaus/jackson/annotate/JsonTypeName);
        if (annotatedclass == null)
        {
            return null;
        } else
        {
            return annotatedclass.value();
        }
    }

    public TypeResolverBuilder findTypeResolver(MapperConfig mapperconfig, AnnotatedClass annotatedclass, JavaType javatype)
    {
        return _findTypeResolver(mapperconfig, annotatedclass, javatype);
    }

    public Object findValueInstantiator(AnnotatedClass annotatedclass)
    {
        annotatedclass = (JsonValueInstantiator)annotatedclass.getAnnotation(org/codehaus/jackson/map/annotate/JsonValueInstantiator);
        if (annotatedclass == null)
        {
            return null;
        } else
        {
            return annotatedclass.value();
        }
    }

    public boolean hasAnyGetterAnnotation(AnnotatedMethod annotatedmethod)
    {
        return annotatedmethod.hasAnnotation(org/codehaus/jackson/annotate/JsonAnyGetter);
    }

    public boolean hasAnySetterAnnotation(AnnotatedMethod annotatedmethod)
    {
        return annotatedmethod.hasAnnotation(org/codehaus/jackson/annotate/JsonAnySetter);
    }

    public boolean hasAsValueAnnotation(AnnotatedMethod annotatedmethod)
    {
        annotatedmethod = (JsonValue)annotatedmethod.getAnnotation(org/codehaus/jackson/annotate/JsonValue);
        return annotatedmethod != null && annotatedmethod.value();
    }

    public boolean hasCreatorAnnotation(Annotated annotated)
    {
        return annotated.hasAnnotation(org/codehaus/jackson/annotate/JsonCreator);
    }

    public boolean hasIgnoreMarker(AnnotatedMember annotatedmember)
    {
        return _isIgnorable(annotatedmember);
    }

    public boolean isHandled(Annotation annotation)
    {
        return annotation.annotationType().getAnnotation(org/codehaus/jackson/annotate/JacksonAnnotation) != null;
    }

    public boolean isIgnorableConstructor(AnnotatedConstructor annotatedconstructor)
    {
        return _isIgnorable(annotatedconstructor);
    }

    public boolean isIgnorableField(AnnotatedField annotatedfield)
    {
        return _isIgnorable(annotatedfield);
    }

    public boolean isIgnorableMethod(AnnotatedMethod annotatedmethod)
    {
        return _isIgnorable(annotatedmethod);
    }

    public Boolean isIgnorableType(AnnotatedClass annotatedclass)
    {
        annotatedclass = (JsonIgnoreType)annotatedclass.getAnnotation(org/codehaus/jackson/annotate/JsonIgnoreType);
        if (annotatedclass == null)
        {
            return null;
        } else
        {
            return Boolean.valueOf(annotatedclass.value());
        }
    }

    public Boolean shouldUnwrapProperty(AnnotatedMember annotatedmember)
    {
        annotatedmember = (JsonUnwrapped)annotatedmember.getAnnotation(org/codehaus/jackson/annotate/JsonUnwrapped);
        if (annotatedmember != null && annotatedmember.enabled())
        {
            return Boolean.TRUE;
        } else
        {
            return null;
        }
    }
}
