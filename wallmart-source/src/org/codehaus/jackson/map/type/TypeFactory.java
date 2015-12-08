// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.map.type;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.codehaus.jackson.map.util.ArrayBuilders;
import org.codehaus.jackson.type.JavaType;
import org.codehaus.jackson.type.TypeReference;

// Referenced classes of package org.codehaus.jackson.map.type:
//            TypeParser, CollectionType, MapType, HierarchicType, 
//            TypeBindings, TypeModifier, ArrayType, SimpleType, 
//            CollectionLikeType, MapLikeType

public final class TypeFactory
{

    private static final JavaType NO_TYPES[] = new JavaType[0];
    public static final TypeFactory instance = new TypeFactory();
    protected HierarchicType _cachedArrayListType;
    protected HierarchicType _cachedHashMapType;
    protected final TypeModifier _modifiers[];
    protected final TypeParser _parser;

    private TypeFactory()
    {
        _parser = new TypeParser(this);
        _modifiers = null;
    }

    protected TypeFactory(TypeParser typeparser, TypeModifier atypemodifier[])
    {
        _parser = typeparser;
        _modifiers = atypemodifier;
    }

    private JavaType _collectionType(Class class1)
    {
        JavaType ajavatype[] = findTypeParameters(class1, java/util/Collection);
        if (ajavatype == null)
        {
            return CollectionType.construct(class1, _unknownType());
        }
        if (ajavatype.length != 1)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Strange Collection type ").append(class1.getName()).append(": can not determine type parameters").toString());
        } else
        {
            return CollectionType.construct(class1, ajavatype[0]);
        }
    }

    private JavaType _mapType(Class class1)
    {
        JavaType ajavatype[] = findTypeParameters(class1, java/util/Map);
        if (ajavatype == null)
        {
            return MapType.construct(class1, _unknownType(), _unknownType());
        }
        if (ajavatype.length != 2)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Strange Map type ").append(class1.getName()).append(": can not determine type parameters").toString());
        } else
        {
            return MapType.construct(class1, ajavatype[0], ajavatype[1]);
        }
    }

    public static JavaType arrayType(Class class1)
    {
        return instance.constructArrayType(instance.constructType(class1));
    }

    public static JavaType arrayType(JavaType javatype)
    {
        return instance.constructArrayType(javatype);
    }

    public static JavaType collectionType(Class class1, Class class2)
    {
        return instance.constructCollectionType(class1, instance.constructType(class2));
    }

    public static JavaType collectionType(Class class1, JavaType javatype)
    {
        return instance.constructCollectionType(class1, javatype);
    }

    public static TypeFactory defaultInstance()
    {
        return instance;
    }

    public static JavaType fastSimpleType(Class class1)
    {
        return instance.uncheckedSimpleType(class1);
    }

    public static JavaType[] findParameterTypes(Class class1, Class class2)
    {
        return instance.findTypeParameters(class1, class2);
    }

    public static JavaType[] findParameterTypes(Class class1, Class class2, TypeBindings typebindings)
    {
        return instance.findTypeParameters(class1, class2, typebindings);
    }

    public static JavaType[] findParameterTypes(JavaType javatype, Class class1)
    {
        return instance.findTypeParameters(javatype, class1);
    }

    public static JavaType fromCanonical(String s)
        throws IllegalArgumentException
    {
        return instance.constructFromCanonical(s);
    }

    public static JavaType fromClass(Class class1)
    {
        return instance._fromClass(class1, null);
    }

    public static JavaType fromType(Type type1)
    {
        return instance._constructType(type1, null);
    }

    public static JavaType fromTypeReference(TypeReference typereference)
    {
        return type(typereference.getType());
    }

    public static JavaType mapType(Class class1, Class class2, Class class3)
    {
        return instance.constructMapType(class1, type(class2), instance.constructType(class3));
    }

    public static JavaType mapType(Class class1, JavaType javatype, JavaType javatype1)
    {
        return instance.constructMapType(class1, javatype, javatype1);
    }

    public static transient JavaType parametricType(Class class1, Class aclass[])
    {
        return instance.constructParametricType(class1, aclass);
    }

    public static transient JavaType parametricType(Class class1, JavaType ajavatype[])
    {
        return instance.constructParametricType(class1, ajavatype);
    }

    public static Class rawClass(Type type1)
    {
        if (type1 instanceof Class)
        {
            return (Class)type1;
        } else
        {
            return defaultInstance().constructType(type1).getRawClass();
        }
    }

    public static JavaType specialize(JavaType javatype, Class class1)
    {
        return instance.constructSpecializedType(javatype, class1);
    }

    public static JavaType type(Type type1)
    {
        return instance._constructType(type1, null);
    }

    public static JavaType type(Type type1, Class class1)
    {
        return instance.constructType(type1, class1);
    }

    public static JavaType type(Type type1, TypeBindings typebindings)
    {
        return instance._constructType(type1, typebindings);
    }

    public static JavaType type(Type type1, JavaType javatype)
    {
        return instance.constructType(type1, javatype);
    }

    public static JavaType type(TypeReference typereference)
    {
        return instance.constructType(typereference.getType());
    }

    public static JavaType unknownType()
    {
        return defaultInstance()._unknownType();
    }

    protected HierarchicType _arrayListSuperInterfaceChain(HierarchicType hierarchictype)
    {
        this;
        JVM INSTR monitorenter ;
        if (_cachedArrayListType == null)
        {
            HierarchicType hierarchictype1 = hierarchictype.deepCloneWithoutSubtype();
            _doFindSuperInterfaceChain(hierarchictype1, java/util/List);
            _cachedArrayListType = hierarchictype1.getSuperType();
        }
        HierarchicType hierarchictype2 = _cachedArrayListType.deepCloneWithoutSubtype();
        hierarchictype.setSuperType(hierarchictype2);
        hierarchictype2.setSubType(hierarchictype);
        this;
        JVM INSTR monitorexit ;
        return hierarchictype;
        hierarchictype;
        throw hierarchictype;
    }

    public JavaType _constructType(Type type1, TypeBindings typebindings)
    {
        Object obj;
        JavaType javatype;
        if (type1 instanceof Class)
        {
            Object obj1 = (Class)type1;
            obj = typebindings;
            if (typebindings == null)
            {
                obj = new TypeBindings(this, ((Class) (obj1)));
            }
            obj1 = _fromClass(((Class) (obj1)), ((TypeBindings) (obj)));
            typebindings = ((TypeBindings) (obj));
            obj = obj1;
        } else
        if (type1 instanceof ParameterizedType)
        {
            obj = _fromParamType((ParameterizedType)type1, typebindings);
        } else
        if (type1 instanceof GenericArrayType)
        {
            obj = _fromArrayType((GenericArrayType)type1, typebindings);
        } else
        if (type1 instanceof TypeVariable)
        {
            obj = _fromVariable((TypeVariable)type1, typebindings);
        } else
        if (type1 instanceof WildcardType)
        {
            obj = _fromWildcard((WildcardType)type1, typebindings);
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Unrecognized Type: ").append(type1.toString()).toString());
        }
        javatype = ((JavaType) (obj));
        if (_modifiers != null)
        {
            javatype = ((JavaType) (obj));
            if (!((JavaType) (obj)).isContainerType())
            {
                TypeModifier atypemodifier[] = _modifiers;
                int j = atypemodifier.length;
                int i = 0;
                do
                {
                    javatype = ((JavaType) (obj));
                    if (i >= j)
                    {
                        break;
                    }
                    obj = atypemodifier[i].modifyType(((JavaType) (obj)), type1, typebindings, this);
                    i++;
                } while (true);
            }
        }
        return javatype;
    }

    protected HierarchicType _doFindSuperInterfaceChain(HierarchicType hierarchictype, Class class1)
    {
        Object obj = hierarchictype.getRawClass();
        Type atype[] = ((Class) (obj)).getGenericInterfaces();
        if (atype != null)
        {
            int j = atype.length;
            for (int i = 0; i < j; i++)
            {
                HierarchicType hierarchictype1 = _findSuperInterfaceChain(atype[i], class1);
                if (hierarchictype1 != null)
                {
                    hierarchictype1.setSubType(hierarchictype);
                    hierarchictype.setSuperType(hierarchictype1);
                    return hierarchictype;
                }
            }

        }
        obj = ((Class) (obj)).getGenericSuperclass();
        if (obj != null)
        {
            class1 = _findSuperInterfaceChain(((Type) (obj)), class1);
            if (class1 != null)
            {
                class1.setSubType(hierarchictype);
                hierarchictype.setSuperType(class1);
                return hierarchictype;
            }
        }
        return null;
    }

    protected HierarchicType _findSuperClassChain(Type type1, Class class1)
    {
        type1 = new HierarchicType(type1);
        Object obj = type1.getRawClass();
        if (obj == class1)
        {
            return type1;
        }
        obj = ((Class) (obj)).getGenericSuperclass();
        if (obj != null)
        {
            class1 = _findSuperClassChain(((Type) (obj)), class1);
            if (class1 != null)
            {
                class1.setSubType(type1);
                type1.setSuperType(class1);
                return type1;
            }
        }
        return null;
    }

    protected HierarchicType _findSuperInterfaceChain(Type type1, Class class1)
    {
        HierarchicType hierarchictype = new HierarchicType(type1);
        Class class2 = hierarchictype.getRawClass();
        if (class2 == class1)
        {
            return new HierarchicType(type1);
        }
        if (class2 == java/util/HashMap && class1 == java/util/Map)
        {
            return _hashMapSuperInterfaceChain(hierarchictype);
        }
        if (class2 == java/util/ArrayList && class1 == java/util/List)
        {
            return _arrayListSuperInterfaceChain(hierarchictype);
        } else
        {
            return _doFindSuperInterfaceChain(hierarchictype, class1);
        }
    }

    protected HierarchicType _findSuperTypeChain(Class class1, Class class2)
    {
        if (class2.isInterface())
        {
            return _findSuperInterfaceChain(class1, class2);
        } else
        {
            return _findSuperClassChain(class1, class2);
        }
    }

    protected JavaType _fromArrayType(GenericArrayType genericarraytype, TypeBindings typebindings)
    {
        return ArrayType.construct(_constructType(genericarraytype.getGenericComponentType(), typebindings), null, null);
    }

    protected JavaType _fromClass(Class class1, TypeBindings typebindings)
    {
        if (class1.isArray())
        {
            return ArrayType.construct(_constructType(class1.getComponentType(), null), null, null);
        }
        if (class1.isEnum())
        {
            return new SimpleType(class1);
        }
        if (java/util/Map.isAssignableFrom(class1))
        {
            return _mapType(class1);
        }
        if (java/util/Collection.isAssignableFrom(class1))
        {
            return _collectionType(class1);
        } else
        {
            return new SimpleType(class1);
        }
    }

    protected JavaType _fromParamType(ParameterizedType parameterizedtype, TypeBindings typebindings)
    {
        Class class1;
        Type atype[];
        int i;
        class1 = (Class)parameterizedtype.getRawType();
        atype = parameterizedtype.getActualTypeArguments();
        if (atype == null)
        {
            i = 0;
        } else
        {
            i = atype.length;
        }
        if (i != 0) goto _L2; else goto _L1
_L1:
        parameterizedtype = NO_TYPES;
_L4:
        if (java/util/Map.isAssignableFrom(class1))
        {
            parameterizedtype = findTypeParameters(constructSimpleType(class1, parameterizedtype), java/util/Map);
            JavaType ajavatype[];
            int j;
            if (parameterizedtype.length != 2)
            {
                throw new IllegalArgumentException((new StringBuilder()).append("Could not find 2 type parameters for Map class ").append(class1.getName()).append(" (found ").append(parameterizedtype.length).append(")").toString());
            } else
            {
                return MapType.construct(class1, parameterizedtype[0], parameterizedtype[1]);
            }
        }
        break MISSING_BLOCK_LABEL_176;
_L2:
        ajavatype = new JavaType[i];
        j = 0;
        do
        {
            parameterizedtype = ajavatype;
            if (j >= i)
            {
                break;
            }
            ajavatype[j] = _constructType(atype[j], typebindings);
            j++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
        if (java/util/Collection.isAssignableFrom(class1))
        {
            parameterizedtype = findTypeParameters(constructSimpleType(class1, parameterizedtype), java/util/Collection);
            if (parameterizedtype.length != 1)
            {
                throw new IllegalArgumentException((new StringBuilder()).append("Could not find 1 type parameter for Collection class ").append(class1.getName()).append(" (found ").append(parameterizedtype.length).append(")").toString());
            } else
            {
                return CollectionType.construct(class1, parameterizedtype[0]);
            }
        }
        if (i == 0)
        {
            return new SimpleType(class1);
        } else
        {
            return constructSimpleType(class1, parameterizedtype);
        }
    }

    protected JavaType _fromParameterizedClass(Class class1, List list)
    {
        if (class1.isArray())
        {
            return ArrayType.construct(_constructType(class1.getComponentType(), null), null, null);
        }
        if (class1.isEnum())
        {
            return new SimpleType(class1);
        }
        if (java/util/Map.isAssignableFrom(class1))
        {
            if (list.size() > 0)
            {
                JavaType javatype = (JavaType)list.get(0);
                if (list.size() >= 2)
                {
                    list = (JavaType)list.get(1);
                } else
                {
                    list = _unknownType();
                }
                return MapType.construct(class1, javatype, list);
            } else
            {
                return _mapType(class1);
            }
        }
        if (java/util/Collection.isAssignableFrom(class1))
        {
            if (list.size() >= 1)
            {
                return CollectionType.construct(class1, (JavaType)list.get(0));
            } else
            {
                return _collectionType(class1);
            }
        }
        if (list.size() == 0)
        {
            return new SimpleType(class1);
        } else
        {
            return constructSimpleType(class1, (JavaType[])list.toArray(new JavaType[list.size()]));
        }
    }

    protected JavaType _fromVariable(TypeVariable typevariable, TypeBindings typebindings)
    {
        JavaType javatype;
        if (typebindings == null)
        {
            javatype = _unknownType();
        } else
        {
            String s = typevariable.getName();
            JavaType javatype1 = typebindings.findType(s);
            javatype = javatype1;
            if (javatype1 == null)
            {
                typevariable = typevariable.getBounds();
                typebindings._addPlaceholder(s);
                return _constructType(typevariable[0], typebindings);
            }
        }
        return javatype;
    }

    protected JavaType _fromWildcard(WildcardType wildcardtype, TypeBindings typebindings)
    {
        return _constructType(wildcardtype.getUpperBounds()[0], typebindings);
    }

    protected HierarchicType _hashMapSuperInterfaceChain(HierarchicType hierarchictype)
    {
        this;
        JVM INSTR monitorenter ;
        if (_cachedHashMapType == null)
        {
            HierarchicType hierarchictype1 = hierarchictype.deepCloneWithoutSubtype();
            _doFindSuperInterfaceChain(hierarchictype1, java/util/Map);
            _cachedHashMapType = hierarchictype1.getSuperType();
        }
        HierarchicType hierarchictype2 = _cachedHashMapType.deepCloneWithoutSubtype();
        hierarchictype.setSuperType(hierarchictype2);
        hierarchictype2.setSubType(hierarchictype);
        this;
        JVM INSTR monitorexit ;
        return hierarchictype;
        hierarchictype;
        throw hierarchictype;
    }

    protected JavaType _resolveVariableViaSubTypes(HierarchicType hierarchictype, String s, TypeBindings typebindings)
    {
        if (hierarchictype != null && hierarchictype.isGeneric())
        {
            TypeVariable atypevariable[] = hierarchictype.getRawClass().getTypeParameters();
            int i = 0;
            for (int j = atypevariable.length; i < j; i++)
            {
                if (s.equals(atypevariable[i].getName()))
                {
                    s = hierarchictype.asGeneric().getActualTypeArguments()[i];
                    if (s instanceof TypeVariable)
                    {
                        return _resolveVariableViaSubTypes(hierarchictype.getSubType(), ((TypeVariable)s).getName(), typebindings);
                    } else
                    {
                        return _constructType(s, typebindings);
                    }
                }
            }

        }
        return _unknownType();
    }

    protected JavaType _unknownType()
    {
        return new SimpleType(java/lang/Object);
    }

    public ArrayType constructArrayType(Class class1)
    {
        return ArrayType.construct(_constructType(class1, null), null, null);
    }

    public ArrayType constructArrayType(JavaType javatype)
    {
        return ArrayType.construct(javatype, null, null);
    }

    public CollectionLikeType constructCollectionLikeType(Class class1, Class class2)
    {
        return CollectionLikeType.construct(class1, constructType(class2));
    }

    public CollectionLikeType constructCollectionLikeType(Class class1, JavaType javatype)
    {
        return CollectionLikeType.construct(class1, javatype);
    }

    public CollectionType constructCollectionType(Class class1, Class class2)
    {
        return CollectionType.construct(class1, constructType(class2));
    }

    public CollectionType constructCollectionType(Class class1, JavaType javatype)
    {
        return CollectionType.construct(class1, javatype);
    }

    public JavaType constructFromCanonical(String s)
        throws IllegalArgumentException
    {
        return _parser.parse(s);
    }

    public MapLikeType constructMapLikeType(Class class1, Class class2, Class class3)
    {
        return MapType.construct(class1, constructType(class2), constructType(class3));
    }

    public MapLikeType constructMapLikeType(Class class1, JavaType javatype, JavaType javatype1)
    {
        return MapLikeType.construct(class1, javatype, javatype1);
    }

    public MapType constructMapType(Class class1, Class class2, Class class3)
    {
        return MapType.construct(class1, constructType(class2), constructType(class3));
    }

    public MapType constructMapType(Class class1, JavaType javatype, JavaType javatype1)
    {
        return MapType.construct(class1, javatype, javatype1);
    }

    public transient JavaType constructParametricType(Class class1, Class aclass[])
    {
        int j = aclass.length;
        JavaType ajavatype[] = new JavaType[j];
        for (int i = 0; i < j; i++)
        {
            ajavatype[i] = _fromClass(aclass[i], null);
        }

        return constructParametricType(class1, ajavatype);
    }

    public transient JavaType constructParametricType(Class class1, JavaType ajavatype[])
    {
        if (class1.isArray())
        {
            if (ajavatype.length != 1)
            {
                throw new IllegalArgumentException((new StringBuilder()).append("Need exactly 1 parameter type for arrays (").append(class1.getName()).append(")").toString());
            } else
            {
                return constructArrayType(ajavatype[0]);
            }
        }
        if (java/util/Map.isAssignableFrom(class1))
        {
            if (ajavatype.length != 2)
            {
                throw new IllegalArgumentException((new StringBuilder()).append("Need exactly 2 parameter types for Map types (").append(class1.getName()).append(")").toString());
            } else
            {
                return constructMapType(class1, ajavatype[0], ajavatype[1]);
            }
        }
        if (java/util/Collection.isAssignableFrom(class1))
        {
            if (ajavatype.length != 1)
            {
                throw new IllegalArgumentException((new StringBuilder()).append("Need exactly 1 parameter type for Collection types (").append(class1.getName()).append(")").toString());
            } else
            {
                return constructCollectionType(class1, ajavatype[0]);
            }
        } else
        {
            return constructSimpleType(class1, ajavatype);
        }
    }

    public CollectionLikeType constructRawCollectionLikeType(Class class1)
    {
        return CollectionLikeType.construct(class1, unknownType());
    }

    public CollectionType constructRawCollectionType(Class class1)
    {
        return CollectionType.construct(class1, unknownType());
    }

    public MapLikeType constructRawMapLikeType(Class class1)
    {
        return MapLikeType.construct(class1, unknownType(), unknownType());
    }

    public MapType constructRawMapType(Class class1)
    {
        return MapType.construct(class1, unknownType(), unknownType());
    }

    public JavaType constructSimpleType(Class class1, JavaType ajavatype[])
    {
        TypeVariable atypevariable[] = class1.getTypeParameters();
        if (atypevariable.length != ajavatype.length)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Parameter type mismatch for ").append(class1.getName()).append(": expected ").append(atypevariable.length).append(" parameters, was given ").append(ajavatype.length).toString());
        }
        String as[] = new String[atypevariable.length];
        int i = 0;
        for (int j = atypevariable.length; i < j; i++)
        {
            as[i] = atypevariable[i].getName();
        }

        return new SimpleType(class1, as, ajavatype, null, null);
    }

    public JavaType constructSpecializedType(JavaType javatype, Class class1)
    {
        if ((javatype instanceof SimpleType) && (class1.isArray() || java/util/Map.isAssignableFrom(class1) || java/util/Collection.isAssignableFrom(class1)))
        {
            if (!javatype.getRawClass().isAssignableFrom(class1))
            {
                throw new IllegalArgumentException((new StringBuilder()).append("Class ").append(class1.getClass().getName()).append(" not subtype of ").append(javatype).toString());
            }
            Object obj = _fromClass(class1, new TypeBindings(this, javatype.getRawClass()));
            Object obj1 = javatype.getValueHandler();
            class1 = ((Class) (obj));
            if (obj1 != null)
            {
                class1 = ((JavaType) (obj)).withValueHandler(obj1);
            }
            obj = javatype.getTypeHandler();
            javatype = class1;
            if (obj != null)
            {
                javatype = class1.withTypeHandler(obj);
            }
            return javatype;
        } else
        {
            return javatype.narrowBy(class1);
        }
    }

    public JavaType constructType(Type type1)
    {
        return _constructType(type1, null);
    }

    public JavaType constructType(Type type1, Class class1)
    {
        if (class1 == null)
        {
            class1 = null;
        } else
        {
            class1 = new TypeBindings(this, class1);
        }
        return _constructType(type1, class1);
    }

    public JavaType constructType(Type type1, TypeBindings typebindings)
    {
        return _constructType(type1, typebindings);
    }

    public JavaType constructType(Type type1, JavaType javatype)
    {
        if (javatype == null)
        {
            javatype = null;
        } else
        {
            javatype = new TypeBindings(this, javatype);
        }
        return _constructType(type1, javatype);
    }

    public JavaType constructType(TypeReference typereference)
    {
        return _constructType(typereference.getType(), null);
    }

    public JavaType[] findTypeParameters(Class class1, Class class2)
    {
        return findTypeParameters(class1, class2, new TypeBindings(this, class1));
    }

    public JavaType[] findTypeParameters(Class class1, Class class2, TypeBindings typebindings)
    {
        HierarchicType hierarchictype = _findSuperTypeChain(class1, class2);
        if (hierarchictype == null)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Class ").append(class1.getName()).append(" is not a subtype of ").append(class2.getName()).toString());
        }
        for (class1 = hierarchictype; class1.getSuperType() != null; typebindings = class2)
        {
            class1 = class1.getSuperType();
            Class class3 = class1.getRawClass();
            class2 = new TypeBindings(this, class3);
            if (!class1.isGeneric())
            {
                continue;
            }
            Type atype[] = class1.asGeneric().getActualTypeArguments();
            TypeVariable atypevariable[] = class3.getTypeParameters();
            int j = atype.length;
            for (int i = 0; i < j; i++)
            {
                class2.addBinding(atypevariable[i].getName(), instance._constructType(atype[i], typebindings));
            }

        }

        if (!class1.isGeneric())
        {
            return null;
        } else
        {
            return typebindings.typesAsArray();
        }
    }

    public JavaType[] findTypeParameters(JavaType javatype, Class class1)
    {
        Object obj;
        int j;
        obj = javatype.getRawClass();
        if (obj != class1)
        {
            break MISSING_BLOCK_LABEL_62;
        }
        j = javatype.containedTypeCount();
        if (j != 0) goto _L2; else goto _L1
_L1:
        class1 = null;
_L4:
        return class1;
_L2:
        obj = new JavaType[j];
        int i = 0;
        do
        {
            class1 = ((Class) (obj));
            if (i >= j)
            {
                break;
            }
            obj[i] = javatype.containedType(i);
            i++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
        return findTypeParameters(((Class) (obj)), class1, new TypeBindings(this, javatype));
    }

    public JavaType uncheckedSimpleType(Class class1)
    {
        return new SimpleType(class1);
    }

    public TypeFactory withModifier(TypeModifier typemodifier)
    {
        if (_modifiers == null)
        {
            return new TypeFactory(_parser, new TypeModifier[] {
                typemodifier
            });
        } else
        {
            return new TypeFactory(_parser, (TypeModifier[])ArrayBuilders.insertInListNoDup(_modifiers, typemodifier));
        }
    }

}
