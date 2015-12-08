// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.map.introspect;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.codehaus.jackson.map.AnnotationIntrospector;
import org.codehaus.jackson.map.util.Annotations;
import org.codehaus.jackson.map.util.ClassUtil;

// Referenced classes of package org.codehaus.jackson.map.introspect:
//            Annotated, AnnotationMap, MemberKey, AnnotatedConstructor, 
//            AnnotatedMethod, AnnotatedField, AnnotatedMethodMap, MethodFilter

public final class AnnotatedClass extends Annotated
{

    private static final AnnotationMap NO_ANNOTATION_MAPS[] = new AnnotationMap[0];
    protected final AnnotationIntrospector _annotationIntrospector;
    protected final Class _class;
    protected AnnotationMap _classAnnotations;
    protected List _constructors;
    protected List _creatorMethods;
    protected AnnotatedConstructor _defaultConstructor;
    protected List _fields;
    protected AnnotatedMethodMap _memberMethods;
    protected final org.codehaus.jackson.map.ClassIntrospector.MixInResolver _mixInResolver;
    protected final Class _primaryMixIn;
    protected final List _superTypes;

    private AnnotatedClass(Class class1, List list, AnnotationIntrospector annotationintrospector, org.codehaus.jackson.map.ClassIntrospector.MixInResolver mixinresolver, AnnotationMap annotationmap)
    {
        _class = class1;
        _superTypes = list;
        _annotationIntrospector = annotationintrospector;
        _mixInResolver = mixinresolver;
        if (_mixInResolver == null)
        {
            class1 = null;
        } else
        {
            class1 = _mixInResolver.findMixInClassFor(_class);
        }
        _primaryMixIn = class1;
        _classAnnotations = annotationmap;
    }

    private AnnotationMap _emptyAnnotationMap()
    {
        return new AnnotationMap();
    }

    private AnnotationMap[] _emptyAnnotationMaps(int i)
    {
        if (i != 0) goto _L2; else goto _L1
_L1:
        AnnotationMap aannotationmap[] = NO_ANNOTATION_MAPS;
_L4:
        return aannotationmap;
_L2:
        AnnotationMap aannotationmap1[] = new AnnotationMap[i];
        int j = 0;
        do
        {
            aannotationmap = aannotationmap1;
            if (j >= i)
            {
                continue;
            }
            aannotationmap1[j] = _emptyAnnotationMap();
            j++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    private boolean _isIncludableField(Field field)
    {
        int i;
        if (!field.isSynthetic())
        {
            if (!Modifier.isStatic(i = field.getModifiers()) && !Modifier.isTransient(i))
            {
                return true;
            }
        }
        return false;
    }

    public static AnnotatedClass construct(Class class1, AnnotationIntrospector annotationintrospector, org.codehaus.jackson.map.ClassIntrospector.MixInResolver mixinresolver)
    {
        class1 = new AnnotatedClass(class1, ClassUtil.findSuperTypes(class1, null), annotationintrospector, mixinresolver, null);
        class1.resolveClassAnnotations();
        return class1;
    }

    public static AnnotatedClass constructWithoutSuperTypes(Class class1, AnnotationIntrospector annotationintrospector, org.codehaus.jackson.map.ClassIntrospector.MixInResolver mixinresolver)
    {
        class1 = new AnnotatedClass(class1, Collections.emptyList(), annotationintrospector, mixinresolver, null);
        class1.resolveClassAnnotations();
        return class1;
    }

    protected void _addClassMixIns(AnnotationMap annotationmap, Class class1)
    {
        if (_mixInResolver != null)
        {
            _addClassMixIns(annotationmap, class1, _mixInResolver.findMixInClassFor(class1));
        }
    }

    protected void _addClassMixIns(AnnotationMap annotationmap, Class class1, Class class2)
    {
        if (class2 != null)
        {
            Annotation aannotation[] = class2.getDeclaredAnnotations();
            int k = aannotation.length;
            for (int i = 0; i < k; i++)
            {
                Annotation annotation1 = aannotation[i];
                if (_annotationIntrospector.isHandled(annotation1))
                {
                    annotationmap.addIfNotPresent(annotation1);
                }
            }

            class1 = ClassUtil.findSuperTypes(class2, class1).iterator();
            while (class1.hasNext()) 
            {
                class2 = ((Class)class1.next()).getDeclaredAnnotations();
                int l = class2.length;
                int j = 0;
                while (j < l) 
                {
                    Annotation annotation = class2[j];
                    if (_annotationIntrospector.isHandled(annotation))
                    {
                        annotationmap.addIfNotPresent(annotation);
                    }
                    j++;
                }
            }
        }
    }

    protected void _addConstructorMixIns(Class class1)
    {
        MemberKey memberkey;
        Class class2;
        Constructor constructor;
        int i;
        memberkey = null;
        Constructor aconstructor[];
        int j;
        int i1;
        if (_constructors == null)
        {
            i = 0;
        } else
        {
            i = _constructors.size();
        }
        aconstructor = class1.getDeclaredConstructors();
        i1 = aconstructor.length;
        j = 0;
        if (j >= i1)
        {
            break MISSING_BLOCK_LABEL_225;
        }
        constructor = aconstructor[j];
        if (constructor.getParameterTypes().length != 0)
        {
            break; /* Loop/switch isn't completed */
        }
        class2 = memberkey;
        if (_defaultConstructor != null)
        {
            _addMixOvers(constructor, _defaultConstructor, false);
            class2 = memberkey;
        }
_L4:
        j++;
        memberkey = class2;
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_26;
_L1:
        int l;
        class1 = memberkey;
        if (memberkey == null)
        {
            MemberKey amemberkey[] = new MemberKey[i];
            int k = 0;
            do
            {
                class1 = amemberkey;
                if (k >= i)
                {
                    break;
                }
                amemberkey[k] = new MemberKey(((AnnotatedConstructor)_constructors.get(k)).getAnnotated());
                k++;
            } while (true);
        }
        amemberkey = new MemberKey(constructor);
        l = 0;
        do
        {
            class2 = class1;
            if (l >= i)
            {
                continue; /* Loop/switch isn't completed */
            }
label0:
            {
                if (amemberkey.equals(class1[l]))
                {
                    break label0;
                }
                l++;
            }
        } while (true);
        _addMixOvers(constructor, (AnnotatedConstructor)_constructors.get(l), true);
        class2 = class1;
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected void _addFactoryMixIns(Class class1)
    {
        MemberKey memberkey;
        Method amethod[];
        int i;
        int l;
        int i1;
        memberkey = null;
        l = _creatorMethods.size();
        amethod = class1.getDeclaredMethods();
        i1 = amethod.length;
        i = 0;
_L2:
        Class class2;
        Method method;
        if (i >= i1)
        {
            break MISSING_BLOCK_LABEL_205;
        }
        method = amethod[i];
        if (Modifier.isStatic(method.getModifiers()))
        {
            break; /* Loop/switch isn't completed */
        }
        class2 = memberkey;
_L4:
        i++;
        memberkey = class2;
        if (true) goto _L2; else goto _L1
_L1:
        class2 = memberkey;
        if (method.getParameterTypes().length == 0) goto _L4; else goto _L3
_L3:
        int k;
        class1 = memberkey;
        if (memberkey == null)
        {
            MemberKey amemberkey[] = new MemberKey[l];
            int j = 0;
            do
            {
                class1 = amemberkey;
                if (j >= l)
                {
                    break;
                }
                amemberkey[j] = new MemberKey(((AnnotatedMethod)_creatorMethods.get(j)).getAnnotated());
                j++;
            } while (true);
        }
        amemberkey = new MemberKey(method);
        k = 0;
_L6:
        class2 = class1;
        if (k >= l) goto _L4; else goto _L5
_L5:
label0:
        {
            if (amemberkey.equals(class1[k]))
            {
                break label0;
            }
            k++;
        }
          goto _L6
        _addMixOvers(method, (AnnotatedMethod)_creatorMethods.get(k), true);
        class2 = class1;
          goto _L4
    }

    protected void _addFieldMixIns(Class class1, Class class2, Map map)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(class2);
        ClassUtil.findSuperTypes(class2, class1, arraylist);
        for (class1 = arraylist.iterator(); class1.hasNext();)
        {
            class2 = ((Class)class1.next()).getDeclaredFields();
            int k = class2.length;
            int i = 0;
            while (i < k) 
            {
                Field field = class2[i];
                AnnotatedField annotatedfield;
                if (_isIncludableField(field))
                {
                    if ((annotatedfield = (AnnotatedField)map.get(field.getName())) != null)
                    {
                        Annotation aannotation[] = field.getDeclaredAnnotations();
                        int l = aannotation.length;
                        int j = 0;
                        while (j < l) 
                        {
                            Annotation annotation = aannotation[j];
                            if (_annotationIntrospector.isHandled(annotation))
                            {
                                annotatedfield.addOrOverride(annotation);
                            }
                            j++;
                        }
                    }
                }
                i++;
            }
        }

    }

    protected void _addFields(Map map, Class class1)
    {
        Class class2 = class1.getSuperclass();
        if (class2 != null)
        {
            _addFields(map, class2);
            Field afield[] = class1.getDeclaredFields();
            int j = afield.length;
            int i = 0;
            while (i < j) 
            {
                Field field = afield[i];
                if (_isIncludableField(field))
                {
                    map.put(field.getName(), _constructField(field));
                }
                i++;
            }
            if (_mixInResolver != null)
            {
                class1 = _mixInResolver.findMixInClassFor(class1);
                if (class1 != null)
                {
                    _addFieldMixIns(class2, class1, map);
                }
            }
        }
    }

    protected void _addMemberMethods(Class class1, MethodFilter methodfilter, AnnotatedMethodMap annotatedmethodmap, Class class2, AnnotatedMethodMap annotatedmethodmap1)
    {
        if (class2 != null)
        {
            _addMethodMixIns(class1, methodfilter, annotatedmethodmap, class2, annotatedmethodmap1);
        }
        if (class1 != null)
        {
            class1 = class1.getDeclaredMethods();
            int j = class1.length;
            int i = 0;
            while (i < j) 
            {
                class2 = class1[i];
                if (_isIncludableMethod(class2, methodfilter))
                {
                    AnnotatedMethod annotatedmethod = annotatedmethodmap.find(class2);
                    if (annotatedmethod == null)
                    {
                        annotatedmethod = _constructMethod(class2);
                        annotatedmethodmap.add(annotatedmethod);
                        class2 = annotatedmethodmap1.remove(class2);
                        if (class2 != null)
                        {
                            _addMixOvers(class2.getAnnotated(), annotatedmethod, false);
                        }
                    } else
                    {
                        _addMixUnders(class2, annotatedmethod);
                        if (annotatedmethod.getDeclaringClass().isInterface() && !class2.getDeclaringClass().isInterface())
                        {
                            annotatedmethodmap.add(annotatedmethod.withMethod(class2));
                        }
                    }
                }
                i++;
            }
        }
    }

    protected void _addMethodMixIns(Class class1, MethodFilter methodfilter, AnnotatedMethodMap annotatedmethodmap, Class class2, AnnotatedMethodMap annotatedmethodmap1)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(class2);
        ClassUtil.findSuperTypes(class2, class1, arraylist);
        for (class1 = arraylist.iterator(); class1.hasNext();)
        {
            class2 = ((Class)class1.next()).getDeclaredMethods();
            int j = class2.length;
            int i = 0;
            while (i < j) 
            {
                Method method = class2[i];
                if (_isIncludableMethod(method, methodfilter))
                {
                    AnnotatedMethod annotatedmethod = annotatedmethodmap.find(method);
                    if (annotatedmethod != null)
                    {
                        _addMixUnders(method, annotatedmethod);
                    } else
                    {
                        annotatedmethodmap1.add(_constructMethod(method));
                    }
                }
                i++;
            }
        }

    }

    protected void _addMixOvers(Constructor constructor, AnnotatedConstructor annotatedconstructor, boolean flag)
    {
        Annotation aannotation[] = constructor.getDeclaredAnnotations();
        int k = aannotation.length;
        for (int i = 0; i < k; i++)
        {
            Annotation annotation = aannotation[i];
            if (_annotationIntrospector.isHandled(annotation))
            {
                annotatedconstructor.addOrOverride(annotation);
            }
        }

        if (flag)
        {
            constructor = constructor.getParameterAnnotations();
            int j = 0;
            for (int i1 = constructor.length; j < i1; j++)
            {
                Object obj = constructor[j];
                int j1 = obj.length;
                for (int l = 0; l < j1; l++)
                {
                    annotatedconstructor.addOrOverrideParam(j, obj[l]);
                }

            }

        }
    }

    protected void _addMixOvers(Method method, AnnotatedMethod annotatedmethod, boolean flag)
    {
        Annotation aannotation[] = method.getDeclaredAnnotations();
        int k = aannotation.length;
        for (int i = 0; i < k; i++)
        {
            Annotation annotation = aannotation[i];
            if (_annotationIntrospector.isHandled(annotation))
            {
                annotatedmethod.addOrOverride(annotation);
            }
        }

        if (flag)
        {
            method = method.getParameterAnnotations();
            int j = 0;
            for (int i1 = method.length; j < i1; j++)
            {
                Object obj = method[j];
                int j1 = obj.length;
                for (int l = 0; l < j1; l++)
                {
                    annotatedmethod.addOrOverrideParam(j, obj[l]);
                }

            }

        }
    }

    protected void _addMixUnders(Method method, AnnotatedMethod annotatedmethod)
    {
        method = method.getDeclaredAnnotations();
        int j = method.length;
        for (int i = 0; i < j; i++)
        {
            Annotation annotation = method[i];
            if (_annotationIntrospector.isHandled(annotation))
            {
                annotatedmethod.addIfNotPresent(annotation);
            }
        }

    }

    protected AnnotationMap _collectRelevantAnnotations(Annotation aannotation[])
    {
        AnnotationMap annotationmap = new AnnotationMap();
        if (aannotation != null)
        {
            int j = aannotation.length;
            for (int i = 0; i < j; i++)
            {
                Annotation annotation = aannotation[i];
                if (_annotationIntrospector.isHandled(annotation))
                {
                    annotationmap.add(annotation);
                }
            }

        }
        return annotationmap;
    }

    protected AnnotationMap[] _collectRelevantAnnotations(Annotation aannotation[][])
    {
        int j = aannotation.length;
        AnnotationMap aannotationmap[] = new AnnotationMap[j];
        for (int i = 0; i < j; i++)
        {
            aannotationmap[i] = _collectRelevantAnnotations(aannotation[i]);
        }

        return aannotationmap;
    }

    protected AnnotatedConstructor _constructConstructor(Constructor constructor, boolean flag)
    {
        AnnotationMap aannotationmap1[];
        Object obj;
        int i;
        if (_annotationIntrospector == null)
        {
            return new AnnotatedConstructor(constructor, _emptyAnnotationMap(), _emptyAnnotationMaps(constructor.getParameterTypes().length));
        }
        if (flag)
        {
            return new AnnotatedConstructor(constructor, _collectRelevantAnnotations(constructor.getDeclaredAnnotations()), null);
        }
        aannotationmap1 = constructor.getParameterAnnotations();
        i = constructor.getParameterTypes().length;
        obj = null;
        if (i == aannotationmap1.length) goto _L2; else goto _L1
_L1:
        Class class1 = constructor.getDeclaringClass();
        if (!class1.isEnum() || i != aannotationmap1.length + 2) goto _L4; else goto _L3
_L3:
        AnnotationMap aannotationmap[];
        Annotation aannotation[][];
        aannotation = new Annotation[aannotationmap1.length + 2][];
        System.arraycopy(aannotationmap1, 0, aannotation, 2, aannotationmap1.length);
        aannotationmap = _collectRelevantAnnotations(aannotation);
_L6:
        aannotationmap1 = aannotationmap;
        if (aannotationmap == null)
        {
            throw new IllegalStateException((new StringBuilder()).append("Internal error: constructor for ").append(constructor.getDeclaringClass().getName()).append(" has mismatch: ").append(i).append(" parameters; ").append(aannotation.length).append(" sets of annotations").toString());
        }
        break; /* Loop/switch isn't completed */
_L4:
        aannotation = aannotationmap1;
        aannotationmap = obj;
        if (class1.isMemberClass())
        {
            aannotation = aannotationmap1;
            aannotationmap = obj;
            if (i == aannotationmap1.length + 1)
            {
                aannotation = new Annotation[aannotationmap1.length + 1][];
                System.arraycopy(aannotationmap1, 0, aannotation, 1, aannotationmap1.length);
                aannotationmap = _collectRelevantAnnotations(aannotation);
            }
        }
        if (true) goto _L6; else goto _L5
_L2:
        aannotationmap1 = _collectRelevantAnnotations(aannotationmap1);
_L5:
        return new AnnotatedConstructor(constructor, _collectRelevantAnnotations(constructor.getDeclaredAnnotations()), aannotationmap1);
    }

    protected AnnotatedMethod _constructCreatorMethod(Method method)
    {
        if (_annotationIntrospector == null)
        {
            return new AnnotatedMethod(method, _emptyAnnotationMap(), _emptyAnnotationMaps(method.getParameterTypes().length));
        } else
        {
            return new AnnotatedMethod(method, _collectRelevantAnnotations(method.getDeclaredAnnotations()), _collectRelevantAnnotations(method.getParameterAnnotations()));
        }
    }

    protected AnnotatedField _constructField(Field field)
    {
        if (_annotationIntrospector == null)
        {
            return new AnnotatedField(field, _emptyAnnotationMap());
        } else
        {
            return new AnnotatedField(field, _collectRelevantAnnotations(field.getDeclaredAnnotations()));
        }
    }

    protected AnnotatedMethod _constructMethod(Method method)
    {
        if (_annotationIntrospector == null)
        {
            return new AnnotatedMethod(method, _emptyAnnotationMap(), null);
        } else
        {
            return new AnnotatedMethod(method, _collectRelevantAnnotations(method.getDeclaredAnnotations()), null);
        }
    }

    protected boolean _isIncludableMethod(Method method, MethodFilter methodfilter)
    {
        while (methodfilter != null && !methodfilter.includeMethod(method) || method.isSynthetic() || method.isBridge()) 
        {
            return false;
        }
        return true;
    }

    public Iterable fields()
    {
        if (_fields == null)
        {
            return Collections.emptyList();
        } else
        {
            return _fields;
        }
    }

    public AnnotatedMethod findMethod(String s, Class aclass[])
    {
        return _memberMethods.find(s, aclass);
    }

    protected AnnotationMap getAllAnnotations()
    {
        return _classAnnotations;
    }

    public Class getAnnotated()
    {
        return _class;
    }

    public volatile AnnotatedElement getAnnotated()
    {
        return getAnnotated();
    }

    public Annotation getAnnotation(Class class1)
    {
        if (_classAnnotations == null)
        {
            return null;
        } else
        {
            return _classAnnotations.get(class1);
        }
    }

    public Annotations getAnnotations()
    {
        return _classAnnotations;
    }

    public List getConstructors()
    {
        if (_constructors == null)
        {
            return Collections.emptyList();
        } else
        {
            return _constructors;
        }
    }

    public AnnotatedConstructor getDefaultConstructor()
    {
        return _defaultConstructor;
    }

    public int getFieldCount()
    {
        if (_fields == null)
        {
            return 0;
        } else
        {
            return _fields.size();
        }
    }

    public Type getGenericType()
    {
        return _class;
    }

    public int getMemberMethodCount()
    {
        return _memberMethods.size();
    }

    public int getModifiers()
    {
        return _class.getModifiers();
    }

    public String getName()
    {
        return _class.getName();
    }

    public Class getRawType()
    {
        return _class;
    }

    public List getStaticMethods()
    {
        if (_creatorMethods == null)
        {
            return Collections.emptyList();
        } else
        {
            return _creatorMethods;
        }
    }

    public boolean hasAnnotations()
    {
        return _classAnnotations.size() > 0;
    }

    public Iterable memberMethods()
    {
        return _memberMethods;
    }

    public void resolveClassAnnotations()
    {
        _classAnnotations = new AnnotationMap();
        if (_annotationIntrospector == null)
        {
            return;
        }
        if (_primaryMixIn != null)
        {
            _addClassMixIns(_classAnnotations, _class, _primaryMixIn);
        }
        Annotation aannotation[] = _class.getDeclaredAnnotations();
        int k = aannotation.length;
        for (int i = 0; i < k; i++)
        {
            Annotation annotation = aannotation[i];
            if (_annotationIntrospector.isHandled(annotation))
            {
                _classAnnotations.addIfNotPresent(annotation);
            }
        }

        for (Iterator iterator = _superTypes.iterator(); iterator.hasNext();)
        {
            Class class1 = (Class)iterator.next();
            _addClassMixIns(_classAnnotations, class1);
            Annotation aannotation1[] = class1.getDeclaredAnnotations();
            int l = aannotation1.length;
            int j = 0;
            while (j < l) 
            {
                Annotation annotation1 = aannotation1[j];
                if (_annotationIntrospector.isHandled(annotation1))
                {
                    _classAnnotations.addIfNotPresent(annotation1);
                }
                j++;
            }
        }

        _addClassMixIns(_classAnnotations, java/lang/Object);
    }

    public void resolveCreators(boolean flag)
    {
label0:
        {
            _constructors = null;
            Object aobj[] = _class.getDeclaredConstructors();
            int k = aobj.length;
            int i = 0;
            while (i < k) 
            {
                Constructor constructor = aobj[i];
                if (constructor.getParameterTypes().length == 0)
                {
                    _defaultConstructor = _constructConstructor(constructor, true);
                } else
                if (flag)
                {
                    if (_constructors == null)
                    {
                        _constructors = new ArrayList(Math.max(10, aobj.length));
                    }
                    _constructors.add(_constructConstructor(constructor, false));
                }
                i++;
            }
            if (_primaryMixIn != null && (_defaultConstructor != null || _constructors != null))
            {
                _addConstructorMixIns(_primaryMixIn);
            }
            if (_annotationIntrospector != null)
            {
                if (_defaultConstructor != null && _annotationIntrospector.isIgnorableConstructor(_defaultConstructor))
                {
                    _defaultConstructor = null;
                }
                if (_constructors != null)
                {
                    i = _constructors.size();
                    do
                    {
                        k = i - 1;
                        if (k < 0)
                        {
                            break;
                        }
                        i = k;
                        if (_annotationIntrospector.isIgnorableConstructor((AnnotatedConstructor)_constructors.get(k)))
                        {
                            _constructors.remove(k);
                            i = k;
                        }
                    } while (true);
                }
            }
            _creatorMethods = null;
            if (!flag)
            {
                break label0;
            }
            aobj = _class.getDeclaredMethods();
            k = aobj.length;
            i = 0;
            do
            {
                if (i >= k)
                {
                    break;
                }
                Method method = aobj[i];
                if (Modifier.isStatic(method.getModifiers()) && method.getParameterTypes().length >= 1)
                {
                    if (_creatorMethods == null)
                    {
                        _creatorMethods = new ArrayList(8);
                    }
                    _creatorMethods.add(_constructCreatorMethod(method));
                }
                i++;
            } while (true);
            if (_primaryMixIn != null && _creatorMethods != null)
            {
                _addFactoryMixIns(_primaryMixIn);
            }
            if (_annotationIntrospector != null && _creatorMethods != null)
            {
                int j = _creatorMethods.size();
                do
                {
                    int l = j - 1;
                    if (l < 0)
                    {
                        break;
                    }
                    j = l;
                    if (_annotationIntrospector.isIgnorableMethod((AnnotatedMethod)_creatorMethods.get(l)))
                    {
                        _creatorMethods.remove(l);
                        j = l;
                    }
                } while (true);
            }
        }
    }

    public void resolveFields()
    {
        LinkedHashMap linkedhashmap = new LinkedHashMap();
        _addFields(linkedhashmap, _class);
        if (linkedhashmap.isEmpty())
        {
            _fields = Collections.emptyList();
            return;
        } else
        {
            _fields = new ArrayList(linkedhashmap.size());
            _fields.addAll(linkedhashmap.values());
            return;
        }
    }

    public void resolveFields(boolean flag)
    {
        resolveFields();
    }

    public void resolveMemberMethods(MethodFilter methodfilter)
    {
        Object obj;
        _memberMethods = new AnnotatedMethodMap();
        obj = new AnnotatedMethodMap();
        _addMemberMethods(_class, methodfilter, _memberMethods, _primaryMixIn, ((AnnotatedMethodMap) (obj)));
        Iterator iterator = _superTypes.iterator();
        while (iterator.hasNext()) 
        {
            Class class3 = (Class)iterator.next();
            Class class1;
            if (_mixInResolver == null)
            {
                class1 = null;
            } else
            {
                class1 = _mixInResolver.findMixInClassFor(class3);
            }
            _addMemberMethods(class3, methodfilter, _memberMethods, class1, ((AnnotatedMethodMap) (obj)));
        }
        if (_mixInResolver != null)
        {
            Class class2 = _mixInResolver.findMixInClassFor(java/lang/Object);
            if (class2 != null)
            {
                _addMethodMixIns(_class, methodfilter, _memberMethods, class2, ((AnnotatedMethodMap) (obj)));
            }
        }
        if (_annotationIntrospector == null || ((AnnotatedMethodMap) (obj)).isEmpty()) goto _L2; else goto _L1
_L1:
        methodfilter = ((AnnotatedMethodMap) (obj)).iterator();
_L3:
        AnnotatedMethod annotatedmethod;
        if (!methodfilter.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        annotatedmethod = (AnnotatedMethod)methodfilter.next();
        obj = java/lang/Object.getDeclaredMethod(annotatedmethod.getName(), annotatedmethod.getParameterClasses());
        if (obj != null)
        {
            try
            {
                obj = _constructMethod(((Method) (obj)));
                _addMixOvers(annotatedmethod.getAnnotated(), ((AnnotatedMethod) (obj)), false);
                _memberMethods.add(((AnnotatedMethod) (obj)));
            }
            catch (Exception exception) { }
        }
        if (true) goto _L3; else goto _L2
_L2:
    }

    public void resolveMemberMethods(MethodFilter methodfilter, boolean flag)
    {
        resolveMemberMethods(methodfilter);
    }

    public String toString()
    {
        return (new StringBuilder()).append("[AnnotedClass ").append(_class.getName()).append("]").toString();
    }

    public volatile Annotated withAnnotations(AnnotationMap annotationmap)
    {
        return withAnnotations(annotationmap);
    }

    public AnnotatedClass withAnnotations(AnnotationMap annotationmap)
    {
        return new AnnotatedClass(_class, _superTypes, _annotationIntrospector, _mixInResolver, annotationmap);
    }

}
