// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.reflect;

import com.google.common.base.Function;
import com.google.common.base.Joiner;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicates;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import java.io.Serializable;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

// Referenced classes of package com.google.common.reflect:
//            TypeCapture, TypeVisitor

final class Types
{
    private static abstract class ClassOwnership extends Enum
    {

        private static final ClassOwnership $VALUES[];
        static final ClassOwnership JVM_BEHAVIOR = detectJvmBehavior();
        public static final ClassOwnership LOCAL_CLASS_HAS_NO_OWNER;
        public static final ClassOwnership OWNED_BY_ENCLOSING_CLASS;

        private static ClassOwnership detectJvmBehavior()
        {
            ParameterizedType parameterizedtype = (ParameterizedType)(new ClassOwnership._cls1LocalClass() {

            }).getClass().getGenericSuperclass();
            ClassOwnership aclassownership[] = values();
            int j = aclassownership.length;
            for (int i = 0; i < j; i++)
            {
                ClassOwnership classownership = aclassownership[i];
                if (classownership.getOwnerType(com/google/common/reflect/Types$ClassOwnership$1LocalClass) == parameterizedtype.getOwnerType())
                {
                    return classownership;
                }
            }

            throw new AssertionError();
        }

        public static ClassOwnership valueOf(String s)
        {
            return (ClassOwnership)Enum.valueOf(com/google/common/reflect/Types$ClassOwnership, s);
        }

        public static ClassOwnership[] values()
        {
            return (ClassOwnership[])$VALUES.clone();
        }

        abstract Class getOwnerType(Class class1);

        static 
        {
            OWNED_BY_ENCLOSING_CLASS = new ClassOwnership("OWNED_BY_ENCLOSING_CLASS", 0) {

                Class getOwnerType(Class class1)
                {
                    return class1.getEnclosingClass();
                }

            };
            LOCAL_CLASS_HAS_NO_OWNER = new ClassOwnership("LOCAL_CLASS_HAS_NO_OWNER", 1) {

                Class getOwnerType(Class class1)
                {
                    if (class1.isLocalClass())
                    {
                        return null;
                    } else
                    {
                        return class1.getEnclosingClass();
                    }
                }

            };
            $VALUES = (new ClassOwnership[] {
                OWNED_BY_ENCLOSING_CLASS, LOCAL_CLASS_HAS_NO_OWNER
            });
        }

        private ClassOwnership(String s, int i)
        {
            super(s, i);
        }

    }

    class ClassOwnership._cls1LocalClass
    {

        ClassOwnership._cls1LocalClass()
        {
        }
    }

    private static final class GenericArrayTypeImpl
        implements GenericArrayType, Serializable
    {

        private static final long serialVersionUID = 0L;
        private final Type componentType;

        public boolean equals(Object obj)
        {
            if (obj instanceof GenericArrayType)
            {
                obj = (GenericArrayType)obj;
                return Objects.equal(getGenericComponentType(), ((GenericArrayType) (obj)).getGenericComponentType());
            } else
            {
                return false;
            }
        }

        public Type getGenericComponentType()
        {
            return componentType;
        }

        public int hashCode()
        {
            return componentType.hashCode();
        }

        public String toString()
        {
            return String.valueOf(Types.toString(componentType)).concat("[]");
        }

        GenericArrayTypeImpl(Type type)
        {
            componentType = JavaVersion.CURRENT.usedInGenericType(type);
        }
    }

    static abstract class JavaVersion extends Enum
    {

        private static final JavaVersion $VALUES[];
        static final JavaVersion CURRENT;
        public static final JavaVersion JAVA6;
        public static final JavaVersion JAVA7;
        public static final JavaVersion JAVA8;

        public static JavaVersion valueOf(String s)
        {
            return (JavaVersion)Enum.valueOf(com/google/common/reflect/Types$JavaVersion, s);
        }

        public static JavaVersion[] values()
        {
            return (JavaVersion[])$VALUES.clone();
        }

        abstract Type newArrayType(Type type);

        String typeName(Type type)
        {
            return Types.toString(type);
        }

        final ImmutableList usedInGenericType(Type atype[])
        {
            com.google.common.collect.ImmutableList.Builder builder = ImmutableList.builder();
            int j = atype.length;
            for (int i = 0; i < j; i++)
            {
                builder.add(usedInGenericType(atype[i]));
            }

            return builder.build();
        }

        abstract Type usedInGenericType(Type type);

        static 
        {
            JAVA6 = new JavaVersion("JAVA6", 0) {

                GenericArrayType newArrayType(Type type)
                {
                    return new GenericArrayTypeImpl(type);
                }

                volatile Type newArrayType(Type type)
                {
                    return newArrayType(type);
                }

                Type usedInGenericType(Type type)
                {
                    Preconditions.checkNotNull(type);
                    Object obj = type;
                    if (type instanceof Class)
                    {
                        Class class1 = (Class)type;
                        obj = type;
                        if (class1.isArray())
                        {
                            obj = new GenericArrayTypeImpl(class1.getComponentType());
                        }
                    }
                    return ((Type) (obj));
                }

            };
            JAVA7 = new JavaVersion("JAVA7", 1) {

                Type newArrayType(Type type)
                {
                    if (type instanceof Class)
                    {
                        return Types.getArrayClass((Class)type);
                    } else
                    {
                        return new GenericArrayTypeImpl(type);
                    }
                }

                Type usedInGenericType(Type type)
                {
                    return (Type)Preconditions.checkNotNull(type);
                }

            };
            JAVA8 = new JavaVersion("JAVA8", 2) {

                Type newArrayType(Type type)
                {
                    return JAVA7.newArrayType(type);
                }

                String typeName(Type type)
                {
                    try
                    {
                        type = (String)java/lang/reflect/Type.getMethod("getTypeName", new Class[0]).invoke(type, new Object[0]);
                    }
                    // Misplaced declaration of an exception variable
                    catch (Type type)
                    {
                        throw new AssertionError("Type.getTypeName should be available in Java 8");
                    }
                    // Misplaced declaration of an exception variable
                    catch (Type type)
                    {
                        throw new RuntimeException(type);
                    }
                    // Misplaced declaration of an exception variable
                    catch (Type type)
                    {
                        throw new RuntimeException(type);
                    }
                    return type;
                }

                Type usedInGenericType(Type type)
                {
                    return JAVA7.usedInGenericType(type);
                }

            };
            $VALUES = (new JavaVersion[] {
                JAVA6, JAVA7, JAVA8
            });
            if (java/lang/reflect/AnnotatedElement.isAssignableFrom(java/lang/reflect/TypeVariable))
            {
                CURRENT = JAVA8;
            } else
            if ((new TypeCapture() {

    }).capture() instanceof Class)
            {
                CURRENT = JAVA7;
            } else
            {
                CURRENT = JAVA6;
            }
        }

        private JavaVersion(String s, int i)
        {
            super(s, i);
        }

    }

    static final class NativeTypeVariableEquals
    {

        static final boolean NATIVE_TYPE_VARIABLE_ONLY;

        static 
        {
            boolean flag = false;
            if (!com/google/common/reflect/Types$NativeTypeVariableEquals.getTypeParameters()[0].equals(Types.newArtificialTypeVariable(com/google/common/reflect/Types$NativeTypeVariableEquals, "X", new Type[0])))
            {
                flag = true;
            }
            NATIVE_TYPE_VARIABLE_ONLY = flag;
        }

        NativeTypeVariableEquals()
        {
        }
    }

    private static final class ParameterizedTypeImpl
        implements ParameterizedType, Serializable
    {

        private static final long serialVersionUID = 0L;
        private final ImmutableList argumentsList;
        private final Type ownerType;
        private final Class rawType;

        public boolean equals(Object obj)
        {
            if (obj instanceof ParameterizedType)
            {
                if (getRawType().equals(((ParameterizedType) (obj = (ParameterizedType)obj)).getRawType()) && Objects.equal(getOwnerType(), ((ParameterizedType) (obj)).getOwnerType()) && Arrays.equals(getActualTypeArguments(), ((ParameterizedType) (obj)).getActualTypeArguments()))
                {
                    return true;
                }
            }
            return false;
        }

        public Type[] getActualTypeArguments()
        {
            return Types.toArray(argumentsList);
        }

        public Type getOwnerType()
        {
            return ownerType;
        }

        public Type getRawType()
        {
            return rawType;
        }

        public int hashCode()
        {
            int i;
            if (ownerType == null)
            {
                i = 0;
            } else
            {
                i = ownerType.hashCode();
            }
            return i ^ argumentsList.hashCode() ^ rawType.hashCode();
        }

        public String toString()
        {
            StringBuilder stringbuilder = new StringBuilder();
            if (ownerType != null)
            {
                stringbuilder.append(JavaVersion.CURRENT.typeName(ownerType)).append('.');
            }
            stringbuilder.append(rawType.getName()).append('<').append(Types.COMMA_JOINER.join(Iterables.transform(argumentsList, Types.TYPE_NAME))).append('>');
            return stringbuilder.toString();
        }

        ParameterizedTypeImpl(Type type, Class class1, Type atype[])
        {
            Preconditions.checkNotNull(class1);
            boolean flag;
            if (atype.length == class1.getTypeParameters().length)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkArgument(flag);
            Types.disallowPrimitiveType(atype, "type parameter");
            ownerType = type;
            rawType = class1;
            argumentsList = JavaVersion.CURRENT.usedInGenericType(atype);
        }
    }

    private static final class TypeVariableImpl
        implements TypeVariable
    {

        private final ImmutableList bounds;
        private final GenericDeclaration genericDeclaration;
        private final String name;

        public boolean equals(Object obj)
        {
            if (!NativeTypeVariableEquals.NATIVE_TYPE_VARIABLE_ONLY) goto _L2; else goto _L1
_L1:
            if (!(obj instanceof TypeVariableImpl)) goto _L4; else goto _L3
_L3:
            obj = (TypeVariableImpl)obj;
            if (!name.equals(((TypeVariableImpl) (obj)).getName()) || !genericDeclaration.equals(((TypeVariableImpl) (obj)).getGenericDeclaration()) || !bounds.equals(((TypeVariableImpl) (obj)).bounds)) goto _L6; else goto _L5
_L5:
            return true;
_L6:
            return false;
_L4:
            return false;
_L2:
            if (obj instanceof TypeVariable)
            {
                obj = (TypeVariable)obj;
                if (!name.equals(((TypeVariable) (obj)).getName()) || !genericDeclaration.equals(((TypeVariable) (obj)).getGenericDeclaration()))
                {
                    return false;
                }
            } else
            {
                return false;
            }
            if (true) goto _L5; else goto _L7
_L7:
        }

        public Type[] getBounds()
        {
            return Types.toArray(bounds);
        }

        public GenericDeclaration getGenericDeclaration()
        {
            return genericDeclaration;
        }

        public String getName()
        {
            return name;
        }

        public int hashCode()
        {
            return genericDeclaration.hashCode() ^ name.hashCode();
        }

        public String toString()
        {
            return name;
        }

        TypeVariableImpl(GenericDeclaration genericdeclaration, String s, Type atype[])
        {
            Types.disallowPrimitiveType(atype, "bound for type variable");
            genericDeclaration = (GenericDeclaration)Preconditions.checkNotNull(genericdeclaration);
            name = (String)Preconditions.checkNotNull(s);
            bounds = ImmutableList.copyOf(atype);
        }
    }

    static final class WildcardTypeImpl
        implements WildcardType, Serializable
    {

        private static final long serialVersionUID = 0L;
        private final ImmutableList lowerBounds;
        private final ImmutableList upperBounds;

        public boolean equals(Object obj)
        {
            boolean flag1 = false;
            boolean flag = flag1;
            if (obj instanceof WildcardType)
            {
                obj = (WildcardType)obj;
                flag = flag1;
                if (lowerBounds.equals(Arrays.asList(((WildcardType) (obj)).getLowerBounds())))
                {
                    flag = flag1;
                    if (upperBounds.equals(Arrays.asList(((WildcardType) (obj)).getUpperBounds())))
                    {
                        flag = true;
                    }
                }
            }
            return flag;
        }

        public Type[] getLowerBounds()
        {
            return Types.toArray(lowerBounds);
        }

        public Type[] getUpperBounds()
        {
            return Types.toArray(upperBounds);
        }

        public int hashCode()
        {
            return lowerBounds.hashCode() ^ upperBounds.hashCode();
        }

        public String toString()
        {
            StringBuilder stringbuilder = new StringBuilder("?");
            Type type;
            for (Iterator iterator = lowerBounds.iterator(); iterator.hasNext(); stringbuilder.append(" super ").append(JavaVersion.CURRENT.typeName(type)))
            {
                type = (Type)iterator.next();
            }

            Type type1;
            for (Iterator iterator1 = Types.filterUpperBounds(upperBounds).iterator(); iterator1.hasNext(); stringbuilder.append(" extends ").append(JavaVersion.CURRENT.typeName(type1)))
            {
                type1 = (Type)iterator1.next();
            }

            return stringbuilder.toString();
        }

        WildcardTypeImpl(Type atype[], Type atype1[])
        {
            Types.disallowPrimitiveType(atype, "lower bound for wildcard");
            Types.disallowPrimitiveType(atype1, "upper bound for wildcard");
            lowerBounds = JavaVersion.CURRENT.usedInGenericType(atype);
            upperBounds = JavaVersion.CURRENT.usedInGenericType(atype1);
        }
    }


    private static final Joiner COMMA_JOINER = Joiner.on(", ").useForNull("null");
    private static final Function TYPE_NAME = new Function() {

        public volatile Object apply(Object obj)
        {
            return apply((Type)obj);
        }

        public String apply(Type type)
        {
            return JavaVersion.CURRENT.typeName(type);
        }

    };

    private Types()
    {
    }

    private static void disallowPrimitiveType(Type atype[], String s)
    {
        int j = atype.length;
        int i = 0;
        while (i < j) 
        {
            Object obj = atype[i];
            if (obj instanceof Class)
            {
                obj = (Class)obj;
                boolean flag;
                if (!((Class) (obj)).isPrimitive())
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                Preconditions.checkArgument(flag, "Primitive type '%s' used as %s", new Object[] {
                    obj, s
                });
            }
            i++;
        }
    }

    private static Iterable filterUpperBounds(Iterable iterable)
    {
        return Iterables.filter(iterable, Predicates.not(Predicates.equalTo(java/lang/Object)));
    }

    static Class getArrayClass(Class class1)
    {
        return Array.newInstance(class1, 0).getClass();
    }

    static Type getComponentType(Type type)
    {
        Preconditions.checkNotNull(type);
        AtomicReference atomicreference = new AtomicReference();
        (new TypeVisitor(atomicreference) {

            final AtomicReference val$result;

            void visitClass(Class class1)
            {
                result.set(class1.getComponentType());
            }

            void visitGenericArrayType(GenericArrayType genericarraytype)
            {
                result.set(genericarraytype.getGenericComponentType());
            }

            void visitTypeVariable(TypeVariable typevariable)
            {
                result.set(Types.subtypeOfComponentType(typevariable.getBounds()));
            }

            void visitWildcardType(WildcardType wildcardtype)
            {
                result.set(Types.subtypeOfComponentType(wildcardtype.getUpperBounds()));
            }

            
            {
                result = atomicreference;
                super();
            }
        }).visit(new Type[] {
            type
        });
        return (Type)atomicreference.get();
    }

    static Type newArrayType(Type type)
    {
        boolean flag1 = true;
        if (type instanceof WildcardType)
        {
            type = (WildcardType)type;
            Type atype[] = type.getLowerBounds();
            boolean flag;
            if (atype.length <= 1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkArgument(flag, "Wildcard cannot have more than one lower bounds.");
            if (atype.length == 1)
            {
                return supertypeOf(newArrayType(atype[0]));
            }
            type = type.getUpperBounds();
            if (type.length == 1)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            Preconditions.checkArgument(flag, "Wildcard should have only one upper bound.");
            return subtypeOf(newArrayType(type[0]));
        } else
        {
            return JavaVersion.CURRENT.newArrayType(type);
        }
    }

    static transient TypeVariable newArtificialTypeVariable(GenericDeclaration genericdeclaration, String s, Type atype[])
    {
        Type atype1[] = atype;
        if (atype.length == 0)
        {
            atype1 = new Type[1];
            atype1[0] = java/lang/Object;
        }
        return new TypeVariableImpl(genericdeclaration, s, atype1);
    }

    static transient ParameterizedType newParameterizedType(Class class1, Type atype[])
    {
        return new ParameterizedTypeImpl(ClassOwnership.JVM_BEHAVIOR.getOwnerType(class1), class1, atype);
    }

    static transient ParameterizedType newParameterizedTypeWithOwner(Type type, Class class1, Type atype[])
    {
        if (type == null)
        {
            return newParameterizedType(class1, atype);
        }
        Preconditions.checkNotNull(atype);
        boolean flag;
        if (class1.getEnclosingClass() != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "Owner type for unenclosed %s", new Object[] {
            class1
        });
        return new ParameterizedTypeImpl(type, class1, atype);
    }

    static WildcardType subtypeOf(Type type)
    {
        return new WildcardTypeImpl(new Type[0], new Type[] {
            type
        });
    }

    private static Type subtypeOfComponentType(Type atype[])
    {
        int j = atype.length;
        for (int i = 0; i < j; i++)
        {
            Type type = getComponentType(atype[i]);
            if (type != null)
            {
                if (type instanceof Class)
                {
                    atype = (Class)type;
                    if (atype.isPrimitive())
                    {
                        return atype;
                    }
                }
                return subtypeOf(type);
            }
        }

        return null;
    }

    static WildcardType supertypeOf(Type type)
    {
        return new WildcardTypeImpl(new Type[] {
            type
        }, new Type[] {
            java/lang/Object
        });
    }

    private static Type[] toArray(Collection collection)
    {
        return (Type[])collection.toArray(new Type[collection.size()]);
    }

    static String toString(Type type)
    {
        if (type instanceof Class)
        {
            return ((Class)type).getName();
        } else
        {
            return type.toString();
        }
    }







}
