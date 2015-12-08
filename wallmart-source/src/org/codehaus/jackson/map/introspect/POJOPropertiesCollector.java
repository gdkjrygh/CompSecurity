// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.map.introspect;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import org.codehaus.jackson.map.AnnotationIntrospector;
import org.codehaus.jackson.map.MapperConfig;
import org.codehaus.jackson.map.PropertyNamingStrategy;
import org.codehaus.jackson.map.util.BeanUtil;
import org.codehaus.jackson.type.JavaType;

// Referenced classes of package org.codehaus.jackson.map.introspect:
//            POJOPropertyBuilder, AnnotatedClass, AnnotatedConstructor, AnnotatedMethod, 
//            AnnotatedField, VisibilityChecker, AnnotatedMember

public class POJOPropertiesCollector
{

    protected final AnnotationIntrospector _annotationIntrospector;
    protected LinkedList _anyGetters;
    protected LinkedList _anySetters;
    protected final AnnotatedClass _classDef;
    protected final MapperConfig _config;
    protected LinkedList _creatorProperties;
    protected final boolean _forSerialization;
    protected Set _ignoredPropertyNames;
    protected Set _ignoredPropertyNamesForDeser;
    protected LinkedHashMap _injectables;
    protected LinkedList _jsonValueGetters;
    protected final LinkedHashMap _properties = new LinkedHashMap();
    protected final JavaType _type;
    protected final VisibilityChecker _visibilityChecker;

    protected POJOPropertiesCollector(MapperConfig mapperconfig, boolean flag, JavaType javatype, AnnotatedClass annotatedclass)
    {
        Object obj = null;
        super();
        _creatorProperties = null;
        _anyGetters = null;
        _anySetters = null;
        _jsonValueGetters = null;
        _config = mapperconfig;
        _forSerialization = flag;
        _type = javatype;
        _classDef = annotatedclass;
        javatype = obj;
        if (mapperconfig.isAnnotationProcessingEnabled())
        {
            javatype = _config.getAnnotationIntrospector();
        }
        _annotationIntrospector = javatype;
        if (_annotationIntrospector == null)
        {
            _visibilityChecker = _config.getDefaultVisibilityChecker();
            return;
        } else
        {
            _visibilityChecker = _annotationIntrospector.findAutoDetectVisibility(annotatedclass, _config.getDefaultVisibilityChecker());
            return;
        }
    }

    private void _addIgnored(POJOPropertyBuilder pojopropertybuilder)
    {
        if (!_forSerialization)
        {
            String s = pojopropertybuilder.getName();
            _ignoredPropertyNames = addToSet(_ignoredPropertyNames, s);
            if (pojopropertybuilder.anyDeserializeIgnorals())
            {
                _ignoredPropertyNamesForDeser = addToSet(_ignoredPropertyNamesForDeser, s);
                return;
            }
        }
    }

    private Set addToSet(Set set, String s)
    {
        Object obj = set;
        if (set == null)
        {
            obj = new HashSet();
        }
        ((Set) (obj)).add(s);
        return ((Set) (obj));
    }

    protected void _addCreators()
    {
        AnnotationIntrospector annotationintrospector = _annotationIntrospector;
        if (annotationintrospector != null)
        {
            for (Iterator iterator = _classDef.getConstructors().iterator(); iterator.hasNext();)
            {
                AnnotatedConstructor annotatedconstructor = (AnnotatedConstructor)iterator.next();
                if (_creatorProperties == null)
                {
                    _creatorProperties = new LinkedList();
                }
                int i = 0;
                int k = annotatedconstructor.getParameterCount();
                while (i < k) 
                {
                    AnnotatedParameter annotatedparameter = annotatedconstructor.getParameter(i);
                    String s = annotationintrospector.findPropertyNameForParam(annotatedparameter);
                    if (s != null)
                    {
                        POJOPropertyBuilder pojopropertybuilder = _property(s);
                        pojopropertybuilder.addCtor(annotatedparameter, s, true, false);
                        _creatorProperties.add(pojopropertybuilder);
                    }
                    i++;
                }
            }

            Iterator iterator1 = _classDef.getStaticMethods().iterator();
            while (iterator1.hasNext()) 
            {
                AnnotatedMethod annotatedmethod = (AnnotatedMethod)iterator1.next();
                if (_creatorProperties == null)
                {
                    _creatorProperties = new LinkedList();
                }
                int j = 0;
                int l = annotatedmethod.getParameterCount();
                while (j < l) 
                {
                    AnnotatedParameter annotatedparameter1 = annotatedmethod.getParameter(j);
                    String s1 = annotationintrospector.findPropertyNameForParam(annotatedparameter1);
                    if (s1 != null)
                    {
                        POJOPropertyBuilder pojopropertybuilder1 = _property(s1);
                        pojopropertybuilder1.addCtor(annotatedparameter1, s1, true, false);
                        _creatorProperties.add(pojopropertybuilder1);
                    }
                    j++;
                }
            }
        }
    }

    protected void _addFields()
    {
        AnnotationIntrospector annotationintrospector = _annotationIntrospector;
        Iterator iterator = _classDef.fields().iterator();
        while (iterator.hasNext()) 
        {
            AnnotatedField annotatedfield = (AnnotatedField)iterator.next();
            String s2 = annotatedfield.getName();
            String s;
            String s1;
            boolean flag;
            boolean flag1;
            if (annotationintrospector == null)
            {
                s = null;
            } else
            if (_forSerialization)
            {
                s = annotationintrospector.findSerializablePropertyName(annotatedfield);
            } else
            {
                s = annotationintrospector.findDeserializablePropertyName(annotatedfield);
            }
            s1 = s;
            if ("".equals(s))
            {
                s1 = s2;
            }
            if (s1 != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            flag1 = flag;
            if (!flag)
            {
                flag1 = _visibilityChecker.isFieldVisible(annotatedfield);
            }
            if (annotationintrospector != null && annotationintrospector.hasIgnoreMarker(annotatedfield))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            _property(s2).addField(annotatedfield, s1, flag1, flag);
        }
    }

    protected void _addInjectables()
    {
        AnnotationIntrospector annotationintrospector = _annotationIntrospector;
        if (annotationintrospector != null)
        {
            AnnotatedField annotatedfield;
            for (Iterator iterator = _classDef.fields().iterator(); iterator.hasNext(); _doAddInjectable(annotationintrospector.findInjectableValueId(annotatedfield), annotatedfield))
            {
                annotatedfield = (AnnotatedField)iterator.next();
            }

            Iterator iterator1 = _classDef.memberMethods().iterator();
            while (iterator1.hasNext()) 
            {
                AnnotatedMethod annotatedmethod = (AnnotatedMethod)iterator1.next();
                if (annotatedmethod.getParameterCount() == 1)
                {
                    _doAddInjectable(annotationintrospector.findInjectableValueId(annotatedmethod), annotatedmethod);
                }
            }
        }
    }

    protected void _addMethods()
    {
        AnnotationIntrospector annotationintrospector = _annotationIntrospector;
        Iterator iterator = _classDef.memberMethods().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            AnnotatedMethod annotatedmethod = (AnnotatedMethod)iterator.next();
            int i = annotatedmethod.getParameterCount();
            if (i == 0)
            {
                if (annotationintrospector != null)
                {
                    if (annotationintrospector.hasAnyGetterAnnotation(annotatedmethod))
                    {
                        if (_anyGetters == null)
                        {
                            _anyGetters = new LinkedList();
                        }
                        _anyGetters.add(annotatedmethod);
                        continue;
                    }
                    if (annotationintrospector.hasAsValueAnnotation(annotatedmethod))
                    {
                        if (_jsonValueGetters == null)
                        {
                            _jsonValueGetters = new LinkedList();
                        }
                        _jsonValueGetters.add(annotatedmethod);
                        continue;
                    }
                }
                String s;
                String s2;
                boolean flag;
                boolean flag2;
                if (annotationintrospector == null)
                {
                    s = null;
                } else
                {
                    s = annotationintrospector.findGettablePropertyName(annotatedmethod);
                }
                if (s == null)
                {
                    s2 = BeanUtil.okNameForRegularGetter(annotatedmethod, annotatedmethod.getName());
                    if (s2 == null)
                    {
                        s2 = BeanUtil.okNameForIsGetter(annotatedmethod, annotatedmethod.getName());
                        if (s2 == null)
                        {
                            continue;
                        }
                        flag = _visibilityChecker.isIsGetterVisible(annotatedmethod);
                    } else
                    {
                        flag = _visibilityChecker.isGetterVisible(annotatedmethod);
                    }
                } else
                {
                    String s4 = BeanUtil.okNameForGetter(annotatedmethod);
                    s2 = s4;
                    if (s4 == null)
                    {
                        s2 = annotatedmethod.getName();
                    }
                    s4 = s;
                    if (s.length() == 0)
                    {
                        s4 = s2;
                    }
                    flag = true;
                    s = s4;
                }
                if (annotationintrospector == null)
                {
                    flag2 = false;
                } else
                {
                    flag2 = annotationintrospector.hasIgnoreMarker(annotatedmethod);
                }
                _property(s2).addGetter(annotatedmethod, s, flag, flag2);
                continue;
            }
            if (i == 1)
            {
                String s1;
                String s3;
                boolean flag1;
                boolean flag3;
                if (annotationintrospector == null)
                {
                    s1 = null;
                } else
                {
                    s1 = annotationintrospector.findSettablePropertyName(annotatedmethod);
                }
                if (s1 == null)
                {
                    s3 = BeanUtil.okNameForSetter(annotatedmethod);
                    if (s3 == null)
                    {
                        continue;
                    }
                    flag1 = _visibilityChecker.isSetterVisible(annotatedmethod);
                } else
                {
                    String s5 = BeanUtil.okNameForSetter(annotatedmethod);
                    s3 = s5;
                    if (s5 == null)
                    {
                        s3 = annotatedmethod.getName();
                    }
                    s5 = s1;
                    if (s1.length() == 0)
                    {
                        s5 = s3;
                    }
                    flag1 = true;
                    s1 = s5;
                }
                if (annotationintrospector == null)
                {
                    flag3 = false;
                } else
                {
                    flag3 = annotationintrospector.hasIgnoreMarker(annotatedmethod);
                }
                _property(s3).addSetter(annotatedmethod, s1, flag1, flag3);
            } else
            if (i == 2 && annotationintrospector != null && annotationintrospector.hasAnySetterAnnotation(annotatedmethod))
            {
                if (_anySetters == null)
                {
                    _anySetters = new LinkedList();
                }
                _anySetters.add(annotatedmethod);
            }
        } while (true);
    }

    protected void _doAddInjectable(Object obj, AnnotatedMember annotatedmember)
    {
        if (obj != null)
        {
            if (_injectables == null)
            {
                _injectables = new LinkedHashMap();
            }
            if ((AnnotatedMember)_injectables.put(obj, annotatedmember) != null)
            {
                if (obj == null)
                {
                    annotatedmember = "[null]";
                } else
                {
                    annotatedmember = obj.getClass().getName();
                }
                throw new IllegalArgumentException((new StringBuilder()).append("Duplicate injectable value with id '").append(String.valueOf(obj)).append("' (of type ").append(annotatedmember).append(")").toString());
            }
        }
    }

    protected POJOPropertyBuilder _property(String s)
    {
        POJOPropertyBuilder pojopropertybuilder1 = (POJOPropertyBuilder)_properties.get(s);
        POJOPropertyBuilder pojopropertybuilder = pojopropertybuilder1;
        if (pojopropertybuilder1 == null)
        {
            pojopropertybuilder = new POJOPropertyBuilder(s);
            _properties.put(s, pojopropertybuilder);
        }
        return pojopropertybuilder;
    }

    protected void _removeUnwantedProperties()
    {
        Iterator iterator = _properties.entrySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            POJOPropertyBuilder pojopropertybuilder = (POJOPropertyBuilder)((java.util.Map.Entry)iterator.next()).getValue();
            if (!pojopropertybuilder.anyVisible())
            {
                iterator.remove();
                continue;
            }
            if (pojopropertybuilder.anyIgnorals())
            {
                _addIgnored(pojopropertybuilder);
                if (!pojopropertybuilder.anyExplicitNames())
                {
                    iterator.remove();
                    continue;
                }
                pojopropertybuilder.removeIgnored();
            }
            pojopropertybuilder.removeNonVisible();
        } while (true);
    }

    protected void _renameProperties()
    {
        Iterator iterator = _properties.entrySet().iterator();
        Object obj = null;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            POJOPropertyBuilder pojopropertybuilder1 = (POJOPropertyBuilder)((java.util.Map.Entry)iterator.next()).getValue();
            String s1 = pojopropertybuilder1.findNewName();
            if (s1 != null)
            {
                LinkedList linkedlist = ((LinkedList) (obj));
                if (obj == null)
                {
                    linkedlist = new LinkedList();
                }
                linkedlist.add(pojopropertybuilder1.withName(s1));
                iterator.remove();
                obj = linkedlist;
            }
        } while (true);
        if (obj != null)
        {
            for (obj = ((LinkedList) (obj)).iterator(); ((Iterator) (obj)).hasNext();)
            {
                POJOPropertyBuilder pojopropertybuilder = (POJOPropertyBuilder)((Iterator) (obj)).next();
                String s = pojopropertybuilder.getName();
                POJOPropertyBuilder pojopropertybuilder2 = (POJOPropertyBuilder)_properties.get(s);
                if (pojopropertybuilder2 == null)
                {
                    _properties.put(s, pojopropertybuilder);
                } else
                {
                    pojopropertybuilder2.addAll(pojopropertybuilder);
                }
            }

        }
    }

    protected void _renameUsing(PropertyNamingStrategy propertynamingstrategy)
    {
        POJOPropertyBuilder apojopropertybuilder[] = (POJOPropertyBuilder[])_properties.values().toArray(new POJOPropertyBuilder[_properties.size()]);
        _properties.clear();
        int j = apojopropertybuilder.length;
        int i = 0;
        while (i < j) 
        {
            POJOPropertyBuilder pojopropertybuilder = apojopropertybuilder[i];
            Object obj1 = pojopropertybuilder.getName();
            Object obj;
            if (_forSerialization)
            {
                if (pojopropertybuilder.hasGetter())
                {
                    obj = propertynamingstrategy.nameForGetterMethod(_config, pojopropertybuilder.getGetter(), ((String) (obj1)));
                } else
                {
                    obj = obj1;
                    if (pojopropertybuilder.hasField())
                    {
                        obj = propertynamingstrategy.nameForField(_config, pojopropertybuilder.getField(), ((String) (obj1)));
                    }
                }
            } else
            if (pojopropertybuilder.hasSetter())
            {
                obj = propertynamingstrategy.nameForSetterMethod(_config, pojopropertybuilder.getSetter(), ((String) (obj1)));
            } else
            if (pojopropertybuilder.hasConstructorParameter())
            {
                obj = propertynamingstrategy.nameForConstructorParameter(_config, pojopropertybuilder.getConstructorParameter(), ((String) (obj1)));
            } else
            if (pojopropertybuilder.hasField())
            {
                obj = propertynamingstrategy.nameForField(_config, pojopropertybuilder.getField(), ((String) (obj1)));
            } else
            {
                obj = obj1;
                if (pojopropertybuilder.hasGetter())
                {
                    obj = propertynamingstrategy.nameForGetterMethod(_config, pojopropertybuilder.getGetter(), ((String) (obj1)));
                }
            }
            obj1 = pojopropertybuilder;
            if (!((String) (obj)).equals(pojopropertybuilder.getName()))
            {
                obj1 = pojopropertybuilder.withName(((String) (obj)));
            }
            pojopropertybuilder = (POJOPropertyBuilder)_properties.get(obj);
            if (pojopropertybuilder == null)
            {
                _properties.put(obj, obj1);
            } else
            {
                pojopropertybuilder.addAll(((POJOPropertyBuilder) (obj1)));
            }
            i++;
        }
    }

    protected void _sortProperties()
    {
        Object obj;
        LinkedHashMap linkedhashmap;
label0:
        {
            obj = _config.getAnnotationIntrospector();
            Object obj1 = ((AnnotationIntrospector) (obj)).findSerializationSortAlphabetically(_classDef);
            String as[];
            boolean flag;
            if (obj1 == null)
            {
                flag = _config.shouldSortPropertiesAlphabetically();
            } else
            {
                flag = ((Boolean) (obj1)).booleanValue();
            }
            as = ((AnnotationIntrospector) (obj)).findSerializationPropertyOrder(_classDef);
            if (!flag && _creatorProperties == null && as == null)
            {
                return;
            }
            int i = _properties.size();
            POJOPropertyBuilder pojopropertybuilder;
            if (flag)
            {
                obj = new TreeMap();
            } else
            {
                obj = new LinkedHashMap(i + i);
            }
            for (obj1 = _properties.values().iterator(); ((Iterator) (obj1)).hasNext(); ((Map) (obj)).put(pojopropertybuilder.getName(), pojopropertybuilder))
            {
                pojopropertybuilder = (POJOPropertyBuilder)((Iterator) (obj1)).next();
            }

            linkedhashmap = new LinkedHashMap(i + i);
            if (as == null)
            {
                break label0;
            }
            int k = as.length;
            for (int j = 0; j < k; j++)
            {
                Object obj2;
                Object obj3;
label1:
                {
                    String s = as[j];
                    POJOPropertyBuilder pojopropertybuilder2 = (POJOPropertyBuilder)((Map) (obj)).get(s);
                    obj3 = s;
                    obj2 = pojopropertybuilder2;
                    if (pojopropertybuilder2 != null)
                    {
                        break label1;
                    }
                    Iterator iterator1 = _properties.values().iterator();
                    do
                    {
                        obj3 = s;
                        obj2 = pojopropertybuilder2;
                        if (!iterator1.hasNext())
                        {
                            break label1;
                        }
                        obj3 = (POJOPropertyBuilder)iterator1.next();
                    } while (!s.equals(((POJOPropertyBuilder) (obj3)).getInternalName()));
                    obj2 = obj3;
                    obj3 = ((POJOPropertyBuilder) (obj3)).getName();
                }
                if (obj2 != null)
                {
                    linkedhashmap.put(obj3, obj2);
                }
            }

        }
        if (_creatorProperties != null)
        {
            POJOPropertyBuilder pojopropertybuilder1;
            for (Iterator iterator = _creatorProperties.iterator(); iterator.hasNext(); linkedhashmap.put(pojopropertybuilder1.getName(), pojopropertybuilder1))
            {
                pojopropertybuilder1 = (POJOPropertyBuilder)iterator.next();
            }

        }
        linkedhashmap.putAll(((Map) (obj)));
        _properties.clear();
        _properties.putAll(linkedhashmap);
    }

    public POJOPropertiesCollector collect()
    {
        _properties.clear();
        _addFields();
        _addMethods();
        _addCreators();
        _addInjectables();
        _removeUnwantedProperties();
        _renameProperties();
        PropertyNamingStrategy propertynamingstrategy = _config.getPropertyNamingStrategy();
        if (propertynamingstrategy != null)
        {
            _renameUsing(propertynamingstrategy);
        }
        for (Iterator iterator = _properties.values().iterator(); iterator.hasNext(); ((POJOPropertyBuilder)iterator.next()).trimByVisibility()) { }
        for (Iterator iterator1 = _properties.values().iterator(); iterator1.hasNext(); ((POJOPropertyBuilder)iterator1.next()).mergeAnnotations(_forSerialization)) { }
        _sortProperties();
        return this;
    }

    public AnnotationIntrospector getAnnotationIntrospector()
    {
        return _annotationIntrospector;
    }

    public AnnotatedMethod getAnyGetterMethod()
    {
        if (_anyGetters != null)
        {
            if (_anyGetters.size() > 1)
            {
                reportProblem((new StringBuilder()).append("Multiple 'any-getters' defined (").append(_anyGetters.get(0)).append(" vs ").append(_anyGetters.get(1)).append(")").toString());
            }
            return (AnnotatedMethod)_anyGetters.getFirst();
        } else
        {
            return null;
        }
    }

    public AnnotatedMethod getAnySetterMethod()
    {
        if (_anySetters != null)
        {
            if (_anySetters.size() > 1)
            {
                reportProblem((new StringBuilder()).append("Multiple 'any-setters' defined (").append(_anySetters.get(0)).append(" vs ").append(_anySetters.get(1)).append(")").toString());
            }
            return (AnnotatedMethod)_anySetters.getFirst();
        } else
        {
            return null;
        }
    }

    public AnnotatedClass getClassDef()
    {
        return _classDef;
    }

    public MapperConfig getConfig()
    {
        return _config;
    }

    public Set getIgnoredPropertyNames()
    {
        return _ignoredPropertyNames;
    }

    public Set getIgnoredPropertyNamesForDeser()
    {
        return _ignoredPropertyNamesForDeser;
    }

    public Map getInjectables()
    {
        return _injectables;
    }

    public AnnotatedMethod getJsonValueMethod()
    {
        if (_jsonValueGetters != null)
        {
            if (_jsonValueGetters.size() > 1)
            {
                reportProblem((new StringBuilder()).append("Multiple value properties defined (").append(_jsonValueGetters.get(0)).append(" vs ").append(_jsonValueGetters.get(1)).append(")").toString());
            }
            return (AnnotatedMethod)_jsonValueGetters.get(0);
        } else
        {
            return null;
        }
    }

    public List getProperties()
    {
        return new ArrayList(_properties.values());
    }

    protected Map getPropertyMap()
    {
        return _properties;
    }

    public JavaType getType()
    {
        return _type;
    }

    protected void reportProblem(String s)
    {
        throw new IllegalArgumentException((new StringBuilder()).append("Problem with definition of ").append(_classDef).append(": ").append(s).toString());
    }
}
