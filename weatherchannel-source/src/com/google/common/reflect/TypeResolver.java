// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.reflect;

import com.google.common.base.Joiner;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.google.common.reflect:
//            Types, TypeVisitor

public final class TypeResolver
{
    private static final class TypeMappingIntrospector extends TypeVisitor
    {

        private static final WildcardCapturer wildcardCapturer = new WildcardCapturer();
        private final Map mappings = Maps.newHashMap();

        static ImmutableMap getTypeMappings(Type type)
        {
            TypeMappingIntrospector typemappingintrospector = new TypeMappingIntrospector();
            typemappingintrospector.visit(new Type[] {
                wildcardCapturer.capture(type)
            });
            return ImmutableMap.copyOf(typemappingintrospector.mappings);
        }

        private void map(TypeVariableKey typevariablekey, Type type)
        {
            if (!mappings.containsKey(typevariablekey)) goto _L2; else goto _L1
_L1:
            return;
_L2:
            Type type1 = type;
            do
            {
                if (type1 == null)
                {
                    break;
                }
                if (typevariablekey.equalsType(type1))
                {
                    while (type != null) 
                    {
                        type = (Type)mappings.remove(TypeVariableKey.forLookup(type));
                    }
                    continue; /* Loop/switch isn't completed */
                }
                type1 = (Type)mappings.get(TypeVariableKey.forLookup(type1));
            } while (true);
            mappings.put(typevariablekey, type);
            return;
            if (true) goto _L1; else goto _L3
_L3:
        }

        void visitClass(Class class1)
        {
            visit(new Type[] {
                class1.getGenericSuperclass()
            });
            visit(class1.getGenericInterfaces());
        }

        void visitParameterizedType(ParameterizedType parameterizedtype)
        {
            Class class1 = (Class)parameterizedtype.getRawType();
            TypeVariable atypevariable[] = class1.getTypeParameters();
            Type atype[] = parameterizedtype.getActualTypeArguments();
            boolean flag;
            if (atypevariable.length == atype.length)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkState(flag);
            for (int i = 0; i < atypevariable.length; i++)
            {
                map(new TypeVariableKey(atypevariable[i]), atype[i]);
            }

            visit(new Type[] {
                class1
            });
            visit(new Type[] {
                parameterizedtype.getOwnerType()
            });
        }

        void visitTypeVariable(TypeVariable typevariable)
        {
            visit(typevariable.getBounds());
        }

        void visitWildcardType(WildcardType wildcardtype)
        {
            visit(wildcardtype.getUpperBounds());
        }


        private TypeMappingIntrospector()
        {
        }
    }

    private static class TypeTable
    {

        private final ImmutableMap map;

        final Type resolve(final TypeVariable var)
        {
            return resolveInternal(var, new TypeTable() {

                final TypeTable this$0;
                final TypeTable val$unguarded;
                final TypeVariable val$var;

                public Type resolveInternal(TypeVariable typevariable, TypeTable typetable)
                {
                    if (typevariable.getGenericDeclaration().equals(var.getGenericDeclaration()))
                    {
                        return typevariable;
                    } else
                    {
                        return unguarded.resolveInternal(typevariable, typetable);
                    }
                }

            
            {
                this$0 = final_typetable;
                var = typevariable;
                unguarded = TypeTable.this;
                super();
            }
            });
        }

        Type resolveInternal(TypeVariable typevariable, TypeTable typetable)
        {
            Type type;
            type = (Type)map.get(new TypeVariableKey(typevariable));
            if (type != null)
            {
                break MISSING_BLOCK_LABEL_82;
            }
            type = typevariable.getBounds();
            if (type.length != 0) goto _L2; else goto _L1
_L1:
            return typevariable;
_L2:
            typetable = (new TypeResolver(typetable)).resolveTypes(type);
            if (Types.NativeTypeVariableEquals.NATIVE_TYPE_VARIABLE_ONLY && Arrays.equals(type, typetable)) goto _L1; else goto _L3
_L3:
            return Types.newArtificialTypeVariable(typevariable.getGenericDeclaration(), typevariable.getName(), typetable);
            return (new TypeResolver(typetable)).resolveType(type);
        }

        final TypeTable where(Map map1)
        {
            com.google.common.collect.ImmutableMap.Builder builder = ImmutableMap.builder();
            builder.putAll(map);
            map1 = map1.entrySet().iterator();
            while (map1.hasNext()) 
            {
                Object obj = (java.util.Map.Entry)map1.next();
                TypeVariableKey typevariablekey = (TypeVariableKey)((java.util.Map.Entry) (obj)).getKey();
                obj = (Type)((java.util.Map.Entry) (obj)).getValue();
                boolean flag;
                if (!typevariablekey.equalsType(((Type) (obj))))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                Preconditions.checkArgument(flag, "Type variable %s bound to itself", new Object[] {
                    typevariablekey
                });
                builder.put(typevariablekey, obj);
            }
            return new TypeTable(builder.build());
        }

        TypeTable()
        {
            map = ImmutableMap.of();
        }

        private TypeTable(ImmutableMap immutablemap)
        {
            map = immutablemap;
        }
    }

    static final class TypeVariableKey
    {

        private final TypeVariable var;

        private boolean equalsTypeVariable(TypeVariable typevariable)
        {
            return var.getGenericDeclaration().equals(typevariable.getGenericDeclaration()) && var.getName().equals(typevariable.getName());
        }

        static Object forLookup(Type type)
        {
            if (type instanceof TypeVariable)
            {
                return new TypeVariableKey((TypeVariable)type);
            } else
            {
                return null;
            }
        }

        public boolean equals(Object obj)
        {
            if (obj instanceof TypeVariableKey)
            {
                return equalsTypeVariable(((TypeVariableKey)obj).var);
            } else
            {
                return false;
            }
        }

        boolean equalsType(Type type)
        {
            if (type instanceof TypeVariable)
            {
                return equalsTypeVariable((TypeVariable)type);
            } else
            {
                return false;
            }
        }

        public int hashCode()
        {
            return Objects.hashCode(new Object[] {
                var.getGenericDeclaration(), var.getName()
            });
        }

        public String toString()
        {
            return var.toString();
        }

        TypeVariableKey(TypeVariable typevariable)
        {
            var = (TypeVariable)Preconditions.checkNotNull(typevariable);
        }
    }

    private static final class WildcardCapturer
    {

        private final AtomicInteger id;

        private Type[] capture(Type atype[])
        {
            Type atype1[] = new Type[atype.length];
            for (int i = 0; i < atype.length; i++)
            {
                atype1[i] = capture(atype[i]);
            }

            return atype1;
        }

        private Type captureNullable(Type type)
        {
            if (type == null)
            {
                return null;
            } else
            {
                return capture(type);
            }
        }

        Type capture(Type type)
        {
            Preconditions.checkNotNull(type);
            break MISSING_BLOCK_LABEL_5;
            if (!(type instanceof Class) && !(type instanceof TypeVariable))
            {
                if (type instanceof GenericArrayType)
                {
                    return Types.newArrayType(capture(((GenericArrayType)type).getGenericComponentType()));
                }
                if (type instanceof ParameterizedType)
                {
                    type = (ParameterizedType)type;
                    return Types.newParameterizedTypeWithOwner(captureNullable(type.getOwnerType()), (Class)type.getRawType(), capture(type.getActualTypeArguments()));
                }
                if (type instanceof WildcardType)
                {
                    WildcardType wildcardtype = (WildcardType)type;
                    if (wildcardtype.getLowerBounds().length == 0)
                    {
                        type = wildcardtype.getUpperBounds();
                        int i = id.incrementAndGet();
                        type = String.valueOf(String.valueOf(Joiner.on('&').join(type)));
                        return Types.newArtificialTypeVariable(com/google/common/reflect/TypeResolver$WildcardCapturer, (new StringBuilder(type.length() + 33)).append("capture#").append(i).append("-of ? extends ").append(type).toString(), wildcardtype.getUpperBounds());
                    }
                } else
                {
                    throw new AssertionError("must have been one of the known types");
                }
            }
            return type;
        }

        private WildcardCapturer()
        {
            id = new AtomicInteger();
        }

    }


    private final TypeTable typeTable;

    public TypeResolver()
    {
        typeTable = new TypeTable();
    }

    private TypeResolver(TypeTable typetable)
    {
        typeTable = typetable;
    }


    static TypeResolver accordingTo(Type type)
    {
        return (new TypeResolver()).where(TypeMappingIntrospector.getTypeMappings(type));
    }

    private static Object expectArgument(Class class1, Object obj)
    {
        Object obj1;
        try
        {
            obj1 = class1.cast(obj);
        }
        catch (ClassCastException classcastexception)
        {
            obj = String.valueOf(String.valueOf(obj));
            class1 = String.valueOf(String.valueOf(class1.getSimpleName()));
            throw new IllegalArgumentException((new StringBuilder(((String) (obj)).length() + 10 + class1.length())).append(((String) (obj))).append(" is not a ").append(class1).toString());
        }
        return obj1;
    }

    private static void populateTypeMappings(Map map, Type type, Type type1)
    {
        if (type.equals(type1))
        {
            return;
        } else
        {
            (new TypeVisitor(map, type1) {

                final Map val$mappings;
                final Type val$to;

                void visitClass(Class class1)
                {
                    class1 = String.valueOf(String.valueOf(class1));
                    throw new IllegalArgumentException((new StringBuilder(class1.length() + 21)).append("No type mapping from ").append(class1).toString());
                }

                void visitGenericArrayType(GenericArrayType genericarraytype)
                {
                    Type type2 = Types.getComponentType(to);
                    boolean flag;
                    if (type2 != null)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    Preconditions.checkArgument(flag, "%s is not an array type.", new Object[] {
                        to
                    });
                    TypeResolver.populateTypeMappings(mappings, genericarraytype.getGenericComponentType(), type2);
                }

                void visitParameterizedType(ParameterizedType parameterizedtype)
                {
                    ParameterizedType parameterizedtype1 = (ParameterizedType)TypeResolver.expectArgument(java/lang/reflect/ParameterizedType, to);
                    Preconditions.checkArgument(parameterizedtype.getRawType().equals(parameterizedtype1.getRawType()), "Inconsistent raw type: %s vs. %s", new Object[] {
                        parameterizedtype, to
                    });
                    Type atype[] = parameterizedtype.getActualTypeArguments();
                    Type atype1[] = parameterizedtype1.getActualTypeArguments();
                    boolean flag;
                    if (atype.length == atype1.length)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    Preconditions.checkArgument(flag, "%s not compatible with %s", new Object[] {
                        parameterizedtype, parameterizedtype1
                    });
                    for (int i = 0; i < atype.length; i++)
                    {
                        TypeResolver.populateTypeMappings(mappings, atype[i], atype1[i]);
                    }

                }

                void visitTypeVariable(TypeVariable typevariable)
                {
                    mappings.put(new TypeVariableKey(typevariable), to);
                }

                void visitWildcardType(WildcardType wildcardtype)
                {
                    WildcardType wildcardtype1 = (WildcardType)TypeResolver.expectArgument(java/lang/reflect/WildcardType, to);
                    Type atype[] = wildcardtype.getUpperBounds();
                    Type atype1[] = wildcardtype1.getUpperBounds();
                    Type atype2[] = wildcardtype.getLowerBounds();
                    Type atype3[] = wildcardtype1.getLowerBounds();
                    boolean flag;
                    if (atype.length == atype1.length && atype2.length == atype3.length)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    Preconditions.checkArgument(flag, "Incompatible type: %s vs. %s", new Object[] {
                        wildcardtype, to
                    });
                    for (int i = 0; i < atype.length; i++)
                    {
                        TypeResolver.populateTypeMappings(mappings, atype[i], atype1[i]);
                    }

                    for (int j = 0; j < atype2.length; j++)
                    {
                        TypeResolver.populateTypeMappings(mappings, atype2[j], atype3[j]);
                    }

                }

            
            {
                mappings = map;
                to = type;
                super();
            }
            }).visit(new Type[] {
                type
            });
            return;
        }
    }

    private Type resolveGenericArrayType(GenericArrayType genericarraytype)
    {
        return Types.newArrayType(resolveType(genericarraytype.getGenericComponentType()));
    }

    private ParameterizedType resolveParameterizedType(ParameterizedType parameterizedtype)
    {
        Type type = parameterizedtype.getOwnerType();
        Type type1;
        if (type == null)
        {
            type = null;
        } else
        {
            type = resolveType(type);
        }
        type1 = resolveType(parameterizedtype.getRawType());
        parameterizedtype = resolveTypes(parameterizedtype.getActualTypeArguments());
        return Types.newParameterizedTypeWithOwner(type, (Class)type1, parameterizedtype);
    }

    private Type[] resolveTypes(Type atype[])
    {
        Type atype1[] = new Type[atype.length];
        for (int i = 0; i < atype.length; i++)
        {
            atype1[i] = resolveType(atype[i]);
        }

        return atype1;
    }

    private WildcardType resolveWildcardType(WildcardType wildcardtype)
    {
        Type atype[] = wildcardtype.getLowerBounds();
        wildcardtype = wildcardtype.getUpperBounds();
        return new Types.WildcardTypeImpl(resolveTypes(atype), resolveTypes(wildcardtype));
    }

    public Type resolveType(Type type)
    {
        Preconditions.checkNotNull(type);
        Type type1;
        if (type instanceof TypeVariable)
        {
            type1 = typeTable.resolve((TypeVariable)type);
        } else
        {
            if (type instanceof ParameterizedType)
            {
                return resolveParameterizedType((ParameterizedType)type);
            }
            if (type instanceof GenericArrayType)
            {
                return resolveGenericArrayType((GenericArrayType)type);
            }
            type1 = type;
            if (type instanceof WildcardType)
            {
                return resolveWildcardType((WildcardType)type);
            }
        }
        return type1;
    }

    public TypeResolver where(Type type, Type type1)
    {
        java.util.HashMap hashmap = Maps.newHashMap();
        populateTypeMappings(hashmap, (Type)Preconditions.checkNotNull(type), (Type)Preconditions.checkNotNull(type1));
        return where(((Map) (hashmap)));
    }

    TypeResolver where(Map map)
    {
        return new TypeResolver(typeTable.where(map));
    }



}
