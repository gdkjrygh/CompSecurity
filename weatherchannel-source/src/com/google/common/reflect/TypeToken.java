// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.reflect;

import com.google.common.base.Joiner;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ForwardingSet;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import com.google.common.collect.Ordering;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.primitives.Primitives;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.common.reflect:
//            TypeCapture, TypeResolver, Types, TypeParameter, 
//            Invokable, TypeVisitor

public abstract class TypeToken extends TypeCapture
    implements Serializable
{
    private final class ClassSet extends TypeSet
    {

        private static final long serialVersionUID = 0L;
        private transient ImmutableSet classes;
        final TypeToken this$0;

        private Object readResolve()
        {
            return getTypes().classes();
        }

        public TypeSet classes()
        {
            return this;
        }

        protected volatile Object _mthdelegate()
        {
            return _mthdelegate();
        }

        protected volatile Collection _mthdelegate()
        {
            return _mthdelegate();
        }

        protected Set _mthdelegate()
        {
            ImmutableSet immutableset1 = classes;
            ImmutableSet immutableset = immutableset1;
            if (immutableset1 == null)
            {
                immutableset = FluentIterable.from(TypeCollector.FOR_GENERIC_TYPE.classesOnly().collectTypes(TypeToken.this)).filter(TypeFilter.IGNORE_TYPE_VARIABLE_OR_WILDCARD).toSet();
                classes = immutableset;
            }
            return immutableset;
        }

        public TypeSet interfaces()
        {
            throw new UnsupportedOperationException("classes().interfaces() not supported.");
        }

        public Set rawTypes()
        {
            return ImmutableSet.copyOf(TypeCollector.FOR_RAW_TYPE.classesOnly().collectTypes(getImmediateRawTypes()));
        }

        private ClassSet()
        {
            this$0 = TypeToken.this;
            super();
        }

    }

    private final class InterfaceSet extends TypeSet
    {

        private static final long serialVersionUID = 0L;
        private final transient TypeSet allTypes;
        private transient ImmutableSet interfaces;
        final TypeToken this$0;

        private Object readResolve()
        {
            return getTypes().interfaces();
        }

        public TypeSet classes()
        {
            throw new UnsupportedOperationException("interfaces().classes() not supported.");
        }

        protected volatile Object _mthdelegate()
        {
            return _mthdelegate();
        }

        protected volatile Collection _mthdelegate()
        {
            return _mthdelegate();
        }

        protected Set _mthdelegate()
        {
            ImmutableSet immutableset1 = interfaces;
            ImmutableSet immutableset = immutableset1;
            if (immutableset1 == null)
            {
                immutableset = FluentIterable.from(allTypes).filter(TypeFilter.INTERFACE_ONLY).toSet();
                interfaces = immutableset;
            }
            return immutableset;
        }

        public TypeSet interfaces()
        {
            return this;
        }

        public Set rawTypes()
        {
            return FluentIterable.from(TypeCollector.FOR_RAW_TYPE.collectTypes(getImmediateRawTypes())).filter(new Predicate() {

                final InterfaceSet this$1;

                public boolean apply(Class class1)
                {
                    return class1.isInterface();
                }

                public volatile boolean apply(Object obj)
                {
                    return apply((Class)obj);
                }

            
            {
                this$1 = InterfaceSet.this;
                super();
            }
            }).toSet();
        }

        InterfaceSet(TypeSet typeset)
        {
            this$0 = TypeToken.this;
            super();
            allTypes = typeset;
        }
    }

    private static final class SimpleTypeToken extends TypeToken
    {

        private static final long serialVersionUID = 0L;

        SimpleTypeToken(Type type)
        {
            super(type, null);
        }
    }

    private static abstract class TypeCollector
    {

        static final TypeCollector FOR_GENERIC_TYPE = new TypeCollector() {

            Iterable getInterfaces(TypeToken typetoken)
            {
                return typetoken.getGenericInterfaces();
            }

            volatile Iterable getInterfaces(Object obj)
            {
                return getInterfaces((TypeToken)obj);
            }

            Class getRawType(TypeToken typetoken)
            {
                return typetoken.getRawType();
            }

            volatile Class getRawType(Object obj)
            {
                return getRawType((TypeToken)obj);
            }

            TypeToken getSuperclass(TypeToken typetoken)
            {
                return typetoken.getGenericSuperclass();
            }

            volatile Object getSuperclass(Object obj)
            {
                return getSuperclass((TypeToken)obj);
            }

        };
        static final TypeCollector FOR_RAW_TYPE = new TypeCollector() {

            Iterable getInterfaces(Class class1)
            {
                return Arrays.asList(class1.getInterfaces());
            }

            volatile Iterable getInterfaces(Object obj)
            {
                return getInterfaces((Class)obj);
            }

            Class getRawType(Class class1)
            {
                return class1;
            }

            volatile Class getRawType(Object obj)
            {
                return getRawType((Class)obj);
            }

            Class getSuperclass(Class class1)
            {
                return class1.getSuperclass();
            }

            volatile Object getSuperclass(Object obj)
            {
                return getSuperclass((Class)obj);
            }

        };

        private int collectTypes(Object obj, Map map)
        {
            Object obj1 = (Integer)map.get(this);
            if (obj1 != null)
            {
                return ((Integer) (obj1)).intValue();
            }
            int i;
            if (getRawType(obj).isInterface())
            {
                i = 1;
            } else
            {
                i = 0;
            }
            for (obj1 = getInterfaces(obj).iterator(); ((Iterator) (obj1)).hasNext();)
            {
                i = Math.max(i, collectTypes(((Iterator) (obj1)).next(), map));
            }

            obj1 = getSuperclass(obj);
            int j = i;
            if (obj1 != null)
            {
                j = Math.max(i, collectTypes(obj1, map));
            }
            map.put(obj, Integer.valueOf(j + 1));
            return j + 1;
        }

        private static ImmutableList sortKeysByValue(Map map, Comparator comparator)
        {
            return (new Ordering(comparator, map) {

                final Map val$map;
                final Comparator val$valueComparator;

                public int compare(Object obj, Object obj1)
                {
                    return valueComparator.compare(map.get(obj), map.get(obj1));
                }

            
            {
                valueComparator = comparator;
                map = map1;
                super();
            }
            }).immutableSortedCopy(map.keySet());
        }

        final TypeCollector classesOnly()
        {
            return new TypeCollector.ForwardingTypeCollector(this) {

                final TypeCollector this$0;

                ImmutableList collectTypes(Iterable iterable)
                {
                    com.google.common.collect.ImmutableList.Builder builder = ImmutableList.builder();
                    iterable = iterable.iterator();
                    do
                    {
                        if (!iterable.hasNext())
                        {
                            break;
                        }
                        Object obj = iterable.next();
                        if (!getRawType(obj).isInterface())
                        {
                            builder.add(obj);
                        }
                    } while (true);
                    return super.collectTypes(builder.build());
                }

                Iterable getInterfaces(Object obj)
                {
                    return ImmutableSet.of();
                }

            
            {
                this$0 = TypeCollector.this;
                super(typecollector1);
            }
            };
        }

        ImmutableList collectTypes(Iterable iterable)
        {
            java.util.HashMap hashmap = Maps.newHashMap();
            for (iterable = iterable.iterator(); iterable.hasNext(); collectTypes(iterable.next(), ((Map) (hashmap)))) { }
            return sortKeysByValue(hashmap, Ordering.natural().reverse());
        }

        final ImmutableList collectTypes(Object obj)
        {
            return collectTypes(((Iterable) (ImmutableList.of(obj))));
        }

        abstract Iterable getInterfaces(Object obj);

        abstract Class getRawType(Object obj);

        abstract Object getSuperclass(Object obj);


        private TypeCollector()
        {
        }

    }

    private static class TypeCollector.ForwardingTypeCollector extends TypeCollector
    {

        private final TypeCollector _flddelegate;

        Iterable getInterfaces(Object obj)
        {
            return _flddelegate.getInterfaces(obj);
        }

        Class getRawType(Object obj)
        {
            return _flddelegate.getRawType(obj);
        }

        Object getSuperclass(Object obj)
        {
            return _flddelegate.getSuperclass(obj);
        }

        TypeCollector.ForwardingTypeCollector(TypeCollector typecollector)
        {
            _flddelegate = typecollector;
        }
    }

    private static abstract class TypeFilter extends Enum
        implements Predicate
    {

        private static final TypeFilter $VALUES[];
        public static final TypeFilter IGNORE_TYPE_VARIABLE_OR_WILDCARD;
        public static final TypeFilter INTERFACE_ONLY;

        public static TypeFilter valueOf(String s)
        {
            return (TypeFilter)Enum.valueOf(com/google/common/reflect/TypeToken$TypeFilter, s);
        }

        public static TypeFilter[] values()
        {
            return (TypeFilter[])$VALUES.clone();
        }

        static 
        {
            IGNORE_TYPE_VARIABLE_OR_WILDCARD = new TypeFilter("IGNORE_TYPE_VARIABLE_OR_WILDCARD", 0) {

                public boolean apply(TypeToken typetoken)
                {
                    return !(typetoken.runtimeType instanceof TypeVariable) && !(typetoken.runtimeType instanceof WildcardType);
                }

                public volatile boolean apply(Object obj)
                {
                    return apply((TypeToken)obj);
                }

            };
            INTERFACE_ONLY = new TypeFilter("INTERFACE_ONLY", 1) {

                public boolean apply(TypeToken typetoken)
                {
                    return typetoken.getRawType().isInterface();
                }

                public volatile boolean apply(Object obj)
                {
                    return apply((TypeToken)obj);
                }

            };
            $VALUES = (new TypeFilter[] {
                IGNORE_TYPE_VARIABLE_OR_WILDCARD, INTERFACE_ONLY
            });
        }

        private TypeFilter(String s, int i)
        {
            super(s, i);
        }

    }

    public class TypeSet extends ForwardingSet
        implements Serializable
    {

        private static final long serialVersionUID = 0L;
        final TypeToken this$0;
        private transient ImmutableSet types;

        public TypeSet classes()
        {
            return new ClassSet();
        }

        protected volatile Object _mthdelegate()
        {
            return _mthdelegate();
        }

        protected volatile Collection _mthdelegate()
        {
            return _mthdelegate();
        }

        protected Set _mthdelegate()
        {
            ImmutableSet immutableset1 = types;
            ImmutableSet immutableset = immutableset1;
            if (immutableset1 == null)
            {
                immutableset = FluentIterable.from(TypeCollector.FOR_GENERIC_TYPE.collectTypes(TypeToken.this)).filter(TypeFilter.IGNORE_TYPE_VARIABLE_OR_WILDCARD).toSet();
                types = immutableset;
            }
            return immutableset;
        }

        public TypeSet interfaces()
        {
            return new InterfaceSet(this);
        }

        public Set rawTypes()
        {
            return ImmutableSet.copyOf(TypeCollector.FOR_RAW_TYPE.collectTypes(getImmediateRawTypes()));
        }

        TypeSet()
        {
            this$0 = TypeToken.this;
            super();
        }
    }


    private final Type runtimeType;
    private transient TypeResolver typeResolver;

    protected TypeToken()
    {
        runtimeType = capture();
        boolean flag;
        if (!(runtimeType instanceof TypeVariable))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag, "Cannot construct a TypeToken for a type variable.\nYou probably meant to call new TypeToken<%s>(getClass()) that can resolve the type variable for you.\nIf you do need to create a TypeToken of a type variable, please use TypeToken.of() instead.", new Object[] {
            runtimeType
        });
    }

    protected TypeToken(Class class1)
    {
        Type type = super.capture();
        if (type instanceof Class)
        {
            runtimeType = type;
            return;
        } else
        {
            runtimeType = of(class1).resolveType(type).runtimeType;
            return;
        }
    }

    private TypeToken(Type type)
    {
        runtimeType = (Type)Preconditions.checkNotNull(type);
    }


    private TypeToken boundAsSuperclass(Type type)
    {
        type = of(type);
        if (type.getRawType().isInterface())
        {
            return null;
        } else
        {
            return type;
        }
    }

    private ImmutableList boundsAsInterfaces(Type atype[])
    {
        com.google.common.collect.ImmutableList.Builder builder = ImmutableList.builder();
        int j = atype.length;
        for (int i = 0; i < j; i++)
        {
            TypeToken typetoken = of(atype[i]);
            if (typetoken.getRawType().isInterface())
            {
                builder.add(typetoken);
            }
        }

        return builder.build();
    }

    private TypeToken getArraySubtype(Class class1)
    {
        return of(newArrayClassOrGenericArrayType(getComponentType().getSubtype(class1.getComponentType()).runtimeType));
    }

    private TypeToken getArraySupertype(Class class1)
    {
        return of(newArrayClassOrGenericArrayType(((TypeToken)Preconditions.checkNotNull(getComponentType(), "%s isn't a super type of %s", new Object[] {
            class1, this
        })).getSupertype(class1.getComponentType()).runtimeType));
    }

    private ImmutableSet getImmediateRawTypes()
    {
        return getRawTypes(runtimeType);
    }

    static Class getRawType(Type type)
    {
        return (Class)getRawTypes(type).iterator().next();
    }

    static ImmutableSet getRawTypes(Type type)
    {
        Preconditions.checkNotNull(type);
        com.google.common.collect.ImmutableSet.Builder builder = ImmutableSet.builder();
        (new TypeVisitor(builder) {

            final com.google.common.collect.ImmutableSet.Builder val$builder;

            void visitClass(Class class1)
            {
                builder.add(class1);
            }

            void visitGenericArrayType(GenericArrayType genericarraytype)
            {
                builder.add(Types.getArrayClass(TypeToken.getRawType(genericarraytype.getGenericComponentType())));
            }

            void visitParameterizedType(ParameterizedType parameterizedtype)
            {
                builder.add((Class)parameterizedtype.getRawType());
            }

            void visitTypeVariable(TypeVariable typevariable)
            {
                visit(typevariable.getBounds());
            }

            void visitWildcardType(WildcardType wildcardtype)
            {
                visit(wildcardtype.getUpperBounds());
            }

            
            {
                builder = builder1;
                super();
            }
        }).visit(new Type[] {
            type
        });
        return builder.build();
    }

    private TypeToken getSubtypeFromLowerBounds(Class class1, Type atype[])
    {
        if (atype.length < 0)
        {
            return of(atype[0]).getSubtype(class1);
        } else
        {
            class1 = String.valueOf(String.valueOf(class1));
            atype = String.valueOf(String.valueOf(this));
            throw new IllegalArgumentException((new StringBuilder(class1.length() + 21 + atype.length())).append(class1).append(" isn't a subclass of ").append(atype).toString());
        }
    }

    private TypeToken getSupertypeFromUpperBounds(Class class1, Type atype[])
    {
        int j = atype.length;
        for (int i = 0; i < j; i++)
        {
            TypeToken typetoken = of(atype[i]);
            if (of(class1).isAssignableFrom(typetoken))
            {
                return typetoken.getSupertype(class1);
            }
        }

        class1 = String.valueOf(String.valueOf(class1));
        atype = String.valueOf(String.valueOf(this));
        throw new IllegalArgumentException((new StringBuilder(class1.length() + 23 + atype.length())).append(class1).append(" isn't a super type of ").append(atype).toString());
    }

    private static boolean isAssignable(Type type, Type type1)
    {
        if (type1.equals(type))
        {
            return true;
        }
        if (type1 instanceof WildcardType)
        {
            return isAssignableToWildcardType(type, (WildcardType)type1);
        }
        if (type instanceof TypeVariable)
        {
            return isAssignableFromAny(((TypeVariable)type).getBounds(), type1);
        }
        if (type instanceof WildcardType)
        {
            return isAssignableFromAny(((WildcardType)type).getUpperBounds(), type1);
        }
        if (type instanceof GenericArrayType)
        {
            return isAssignableFromGenericArrayType((GenericArrayType)type, type1);
        }
        if (type1 instanceof Class)
        {
            return isAssignableToClass(type, (Class)type1);
        }
        if (type1 instanceof ParameterizedType)
        {
            return isAssignableToParameterizedType(type, (ParameterizedType)type1);
        }
        if (type1 instanceof GenericArrayType)
        {
            return isAssignableToGenericArrayType(type, (GenericArrayType)type1);
        } else
        {
            return false;
        }
    }

    private static boolean isAssignableBySubtypeBound(Type type, WildcardType wildcardtype)
    {
        wildcardtype = subtypeBound(wildcardtype);
        if (wildcardtype == null)
        {
            return true;
        }
        type = subtypeBound(type);
        if (type == null)
        {
            return false;
        } else
        {
            return isAssignable(wildcardtype, type);
        }
    }

    private static boolean isAssignableFromAny(Type atype[], Type type)
    {
        int j = atype.length;
        for (int i = 0; i < j; i++)
        {
            if (isAssignable(atype[i], type))
            {
                return true;
            }
        }

        return false;
    }

    private static boolean isAssignableFromGenericArrayType(GenericArrayType genericarraytype, Type type)
    {
        boolean flag = false;
        if (!(type instanceof Class)) goto _L2; else goto _L1
_L1:
        type = (Class)type;
        if (type.isArray()) goto _L4; else goto _L3
_L3:
        if (type == java/lang/Object)
        {
            flag = true;
        }
_L6:
        return flag;
_L4:
        return isAssignable(genericarraytype.getGenericComponentType(), type.getComponentType());
_L2:
        if (type instanceof GenericArrayType)
        {
            type = (GenericArrayType)type;
            return isAssignable(genericarraytype.getGenericComponentType(), type.getGenericComponentType());
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    private static boolean isAssignableToClass(Type type, Class class1)
    {
        return class1.isAssignableFrom(getRawType(type));
    }

    private static boolean isAssignableToGenericArrayType(Type type, GenericArrayType genericarraytype)
    {
        if (!(type instanceof Class)) goto _L2; else goto _L1
_L1:
        type = (Class)type;
        if (type.isArray()) goto _L4; else goto _L3
_L3:
        return false;
_L4:
        return isAssignable(type.getComponentType(), genericarraytype.getGenericComponentType());
_L2:
        if (type instanceof GenericArrayType)
        {
            return isAssignable(((GenericArrayType)type).getGenericComponentType(), genericarraytype.getGenericComponentType());
        }
        if (true) goto _L3; else goto _L5
_L5:
    }

    private static boolean isAssignableToParameterizedType(Type type, ParameterizedType parameterizedtype)
    {
        Class class1 = getRawType(parameterizedtype);
        if (class1.isAssignableFrom(getRawType(type))) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        TypeVariable atypevariable[] = class1.getTypeParameters();
        parameterizedtype = parameterizedtype.getActualTypeArguments();
        type = of(type);
        int i = 0;
label0:
        do
        {
label1:
            {
                if (i >= atypevariable.length)
                {
                    break label1;
                }
                if (!matchTypeArgument(type.resolveType(atypevariable[i]).runtimeType, parameterizedtype[i]))
                {
                    break label0;
                }
                i++;
            }
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
        return true;
    }

    private static boolean isAssignableToWildcardType(Type type, WildcardType wildcardtype)
    {
        return isAssignable(type, supertypeBound(wildcardtype)) && isAssignableBySubtypeBound(type, wildcardtype);
    }

    private boolean isWrapper()
    {
        return Primitives.allWrapperTypes().contains(runtimeType);
    }

    private static boolean matchTypeArgument(Type type, Type type1)
    {
        if (type.equals(type1))
        {
            return true;
        }
        if (type1 instanceof WildcardType)
        {
            return isAssignableToWildcardType(type, (WildcardType)type1);
        } else
        {
            return false;
        }
    }

    private static Type newArrayClassOrGenericArrayType(Type type)
    {
        return Types.JavaVersion.JAVA7.newArrayType(type);
    }

    public static TypeToken of(Class class1)
    {
        return new SimpleTypeToken(class1);
    }

    public static TypeToken of(Type type)
    {
        return new SimpleTypeToken(type);
    }

    private Type[] resolveInPlace(Type atype[])
    {
        for (int i = 0; i < atype.length; i++)
        {
            atype[i] = resolveType(atype[i]).getType();
        }

        return atype;
    }

    private TypeToken resolveSupertype(Type type)
    {
        type = resolveType(type);
        type.typeResolver = typeResolver;
        return type;
    }

    private Type resolveTypeArgsForSubclass(Class class1)
    {
        if (runtimeType instanceof Class)
        {
            return class1;
        } else
        {
            class1 = toGenericType(class1);
            Type type = class1.getSupertype(getRawType()).runtimeType;
            return (new TypeResolver()).where(type, runtimeType).resolveType(((TypeToken) (class1)).runtimeType);
        }
    }

    private static Type subtypeBound(Type type)
    {
        Type type1 = type;
        if (type instanceof WildcardType)
        {
            type1 = subtypeBound((WildcardType)type);
        }
        return type1;
    }

    private static Type subtypeBound(WildcardType wildcardtype)
    {
        Type atype[] = wildcardtype.getLowerBounds();
        if (atype.length == 1)
        {
            return subtypeBound(atype[0]);
        }
        if (atype.length == 0)
        {
            return null;
        } else
        {
            wildcardtype = String.valueOf(String.valueOf(wildcardtype));
            throw new AssertionError((new StringBuilder(wildcardtype.length() + 46)).append("Wildcard should have at most one lower bound: ").append(wildcardtype).toString());
        }
    }

    private static Type supertypeBound(Type type)
    {
        Type type1 = type;
        if (type instanceof WildcardType)
        {
            type1 = supertypeBound((WildcardType)type);
        }
        return type1;
    }

    private static Type supertypeBound(WildcardType wildcardtype)
    {
        Type atype[] = wildcardtype.getUpperBounds();
        if (atype.length == 1)
        {
            return supertypeBound(atype[0]);
        }
        if (atype.length == 0)
        {
            return java/lang/Object;
        } else
        {
            wildcardtype = String.valueOf(String.valueOf(wildcardtype));
            throw new AssertionError((new StringBuilder(wildcardtype.length() + 59)).append("There should be at most one upper bound for wildcard type: ").append(wildcardtype).toString());
        }
    }

    static TypeToken toGenericType(Class class1)
    {
        if (class1.isArray())
        {
            return of(Types.newArrayType(toGenericType(class1.getComponentType()).runtimeType));
        }
        TypeVariable atypevariable[] = class1.getTypeParameters();
        if (atypevariable.length > 0)
        {
            return of(Types.newParameterizedType(class1, atypevariable));
        } else
        {
            return of(class1);
        }
    }

    public final Invokable constructor(Constructor constructor1)
    {
        boolean flag;
        if (constructor1.getDeclaringClass() == getRawType())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "%s not declared by %s", new Object[] {
            constructor1, getRawType()
        });
        return new Invokable.ConstructorInvokable(constructor1) {

            final TypeToken this$0;

            Type[] getGenericExceptionTypes()
            {
                return resolveInPlace(getGenericExceptionTypes());
            }

            Type[] getGenericParameterTypes()
            {
                return resolveInPlace(getGenericParameterTypes());
            }

            Type getGenericReturnType()
            {
                return resolveType(super.getGenericReturnType()).getType();
            }

            public TypeToken getOwnerType()
            {
                return TypeToken.this;
            }

            public String toString()
            {
                String s = String.valueOf(String.valueOf(getOwnerType()));
                String s1 = String.valueOf(String.valueOf(Joiner.on(", ").join(getGenericParameterTypes())));
                return (new StringBuilder(s.length() + 2 + s1.length())).append(s).append("(").append(s1).append(")").toString();
            }

            
            {
                this$0 = TypeToken.this;
                super(constructor1);
            }
        };
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof TypeToken)
        {
            obj = (TypeToken)obj;
            return runtimeType.equals(((TypeToken) (obj)).runtimeType);
        } else
        {
            return false;
        }
    }

    public final TypeToken getComponentType()
    {
        Type type = Types.getComponentType(runtimeType);
        if (type == null)
        {
            return null;
        } else
        {
            return of(type);
        }
    }

    final ImmutableList getGenericInterfaces()
    {
        if (runtimeType instanceof TypeVariable)
        {
            return boundsAsInterfaces(((TypeVariable)runtimeType).getBounds());
        }
        if (runtimeType instanceof WildcardType)
        {
            return boundsAsInterfaces(((WildcardType)runtimeType).getUpperBounds());
        }
        com.google.common.collect.ImmutableList.Builder builder = ImmutableList.builder();
        Type atype[] = getRawType().getGenericInterfaces();
        int j = atype.length;
        for (int i = 0; i < j; i++)
        {
            builder.add(resolveSupertype(atype[i]));
        }

        return builder.build();
    }

    final TypeToken getGenericSuperclass()
    {
        if (runtimeType instanceof TypeVariable)
        {
            return boundAsSuperclass(((TypeVariable)runtimeType).getBounds()[0]);
        }
        if (runtimeType instanceof WildcardType)
        {
            return boundAsSuperclass(((WildcardType)runtimeType).getUpperBounds()[0]);
        }
        Type type = getRawType().getGenericSuperclass();
        if (type == null)
        {
            return null;
        } else
        {
            return resolveSupertype(type);
        }
    }

    public final Class getRawType()
    {
        return getRawType(runtimeType);
    }

    public final TypeToken getSubtype(Class class1)
    {
        boolean flag;
        if (!(runtimeType instanceof TypeVariable))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "Cannot get subtype of type variable <%s>", new Object[] {
            this
        });
        if (runtimeType instanceof WildcardType)
        {
            return getSubtypeFromLowerBounds(class1, ((WildcardType)runtimeType).getLowerBounds());
        }
        Preconditions.checkArgument(getRawType().isAssignableFrom(class1), "%s isn't a subclass of %s", new Object[] {
            class1, this
        });
        if (isArray())
        {
            return getArraySubtype(class1);
        } else
        {
            return of(resolveTypeArgsForSubclass(class1));
        }
    }

    public final TypeToken getSupertype(Class class1)
    {
        Preconditions.checkArgument(class1.isAssignableFrom(getRawType()), "%s is not a super class of %s", new Object[] {
            class1, this
        });
        if (runtimeType instanceof TypeVariable)
        {
            return getSupertypeFromUpperBounds(class1, ((TypeVariable)runtimeType).getBounds());
        }
        if (runtimeType instanceof WildcardType)
        {
            return getSupertypeFromUpperBounds(class1, ((WildcardType)runtimeType).getUpperBounds());
        }
        if (class1.isArray())
        {
            return getArraySupertype(class1);
        } else
        {
            return resolveSupertype(toGenericType(class1).runtimeType);
        }
    }

    public final Type getType()
    {
        return runtimeType;
    }

    public final TypeSet getTypes()
    {
        return new TypeSet();
    }

    public int hashCode()
    {
        return runtimeType.hashCode();
    }

    public final boolean isArray()
    {
        return getComponentType() != null;
    }

    public final boolean isAssignableFrom(TypeToken typetoken)
    {
        return isAssignableFrom(typetoken.runtimeType);
    }

    public final boolean isAssignableFrom(Type type)
    {
        return isAssignable((Type)Preconditions.checkNotNull(type), runtimeType);
    }

    public final boolean isPrimitive()
    {
        return (runtimeType instanceof Class) && ((Class)runtimeType).isPrimitive();
    }

    public final Invokable method(Method method1)
    {
        Preconditions.checkArgument(of(method1.getDeclaringClass()).isAssignableFrom(this), "%s not declared by %s", new Object[] {
            method1, this
        });
        return new Invokable.MethodInvokable(method1) {

            final TypeToken this$0;

            Type[] getGenericExceptionTypes()
            {
                return resolveInPlace(getGenericExceptionTypes());
            }

            Type[] getGenericParameterTypes()
            {
                return resolveInPlace(getGenericParameterTypes());
            }

            Type getGenericReturnType()
            {
                return resolveType(super.getGenericReturnType()).getType();
            }

            public TypeToken getOwnerType()
            {
                return TypeToken.this;
            }

            public String toString()
            {
                String s = String.valueOf(String.valueOf(getOwnerType()));
                String s1 = String.valueOf(String.valueOf(super.toString()));
                return (new StringBuilder(s.length() + 1 + s1.length())).append(s).append(".").append(s1).toString();
            }

            
            {
                this$0 = TypeToken.this;
                super(method1);
            }
        };
    }

    final TypeToken rejectTypeVariables()
    {
        (new TypeVisitor() {

            final TypeToken this$0;

            void visitGenericArrayType(GenericArrayType genericarraytype)
            {
                visit(new Type[] {
                    genericarraytype.getGenericComponentType()
                });
            }

            void visitParameterizedType(ParameterizedType parameterizedtype)
            {
                visit(parameterizedtype.getActualTypeArguments());
                visit(new Type[] {
                    parameterizedtype.getOwnerType()
                });
            }

            void visitTypeVariable(TypeVariable typevariable)
            {
                typevariable = String.valueOf(String.valueOf(runtimeType));
                throw new IllegalArgumentException((new StringBuilder(typevariable.length() + 58)).append(typevariable).append("contains a type variable and is not safe for the operation").toString());
            }

            void visitWildcardType(WildcardType wildcardtype)
            {
                visit(wildcardtype.getLowerBounds());
                visit(wildcardtype.getUpperBounds());
            }

            
            {
                this$0 = TypeToken.this;
                super();
            }
        }).visit(new Type[] {
            runtimeType
        });
        return this;
    }

    public final TypeToken resolveType(Type type)
    {
        Preconditions.checkNotNull(type);
        TypeResolver typeresolver1 = typeResolver;
        TypeResolver typeresolver = typeresolver1;
        if (typeresolver1 == null)
        {
            typeresolver = TypeResolver.accordingTo(runtimeType);
            typeResolver = typeresolver;
        }
        return of(typeresolver.resolveType(type));
    }

    public String toString()
    {
        return Types.toString(runtimeType);
    }

    public final TypeToken unwrap()
    {
        TypeToken typetoken = this;
        if (isWrapper())
        {
            typetoken = of(Primitives.unwrap((Class)runtimeType));
        }
        return typetoken;
    }

    public final TypeToken where(TypeParameter typeparameter, TypeToken typetoken)
    {
        return new SimpleTypeToken((new TypeResolver()).where(ImmutableMap.of(new TypeResolver.TypeVariableKey(typeparameter.typeVariable), typetoken.runtimeType)).resolveType(runtimeType));
    }

    public final TypeToken where(TypeParameter typeparameter, Class class1)
    {
        return where(typeparameter, of(class1));
    }

    public final TypeToken wrap()
    {
        TypeToken typetoken = this;
        if (isPrimitive())
        {
            typetoken = of(Primitives.wrap((Class)runtimeType));
        }
        return typetoken;
    }

    protected Object writeReplace()
    {
        return of((new TypeResolver()).resolveType(runtimeType));
    }



}
