// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.aspectj.lang.reflect;

import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

// Referenced classes of package org.aspectj.lang.reflect:
//            NoSuchAdviceException, NoSuchPointcutException, Advice, AdviceKind, 
//            DeclareAnnotation, DeclareErrorOrWarning, DeclareParents, DeclarePrecedence, 
//            DeclareSoft, InterTypeConstructorDeclaration, InterTypeFieldDeclaration, InterTypeMethodDeclaration, 
//            Pointcut, PerClause

public interface AjType
    extends Type, AnnotatedElement
{

    public abstract Advice getAdvice(String s)
        throws NoSuchAdviceException;

    public transient abstract Advice[] getAdvice(AdviceKind aadvicekind[]);

    public abstract AjType[] getAjTypes();

    public transient abstract Constructor getConstructor(AjType aajtype[])
        throws NoSuchMethodException;

    public abstract Constructor[] getConstructors();

    public abstract DeclareAnnotation[] getDeclareAnnotations();

    public abstract DeclareErrorOrWarning[] getDeclareErrorOrWarnings();

    public abstract DeclareParents[] getDeclareParents();

    public abstract DeclarePrecedence[] getDeclarePrecedence();

    public abstract DeclareSoft[] getDeclareSofts();

    public abstract Advice getDeclaredAdvice(String s)
        throws NoSuchAdviceException;

    public transient abstract Advice[] getDeclaredAdvice(AdviceKind aadvicekind[]);

    public abstract AjType[] getDeclaredAjTypes();

    public transient abstract Constructor getDeclaredConstructor(AjType aajtype[])
        throws NoSuchMethodException;

    public abstract Constructor[] getDeclaredConstructors();

    public abstract Field getDeclaredField(String s)
        throws NoSuchFieldException;

    public abstract Field[] getDeclaredFields();

    public transient abstract InterTypeConstructorDeclaration getDeclaredITDConstructor(AjType ajtype, AjType aajtype[])
        throws NoSuchMethodException;

    public abstract InterTypeConstructorDeclaration[] getDeclaredITDConstructors();

    public abstract InterTypeFieldDeclaration getDeclaredITDField(String s, AjType ajtype)
        throws NoSuchFieldException;

    public abstract InterTypeFieldDeclaration[] getDeclaredITDFields();

    public transient abstract InterTypeMethodDeclaration getDeclaredITDMethod(String s, AjType ajtype, AjType aajtype[])
        throws NoSuchMethodException;

    public abstract InterTypeMethodDeclaration[] getDeclaredITDMethods();

    public transient abstract Method getDeclaredMethod(String s, AjType aajtype[])
        throws NoSuchMethodException;

    public abstract Method[] getDeclaredMethods();

    public abstract Pointcut getDeclaredPointcut(String s)
        throws NoSuchPointcutException;

    public abstract Pointcut[] getDeclaredPointcuts();

    public abstract AjType getDeclaringType();

    public abstract Constructor getEnclosingConstructor();

    public abstract Method getEnclosingMethod();

    public abstract AjType getEnclosingType();

    public abstract Object[] getEnumConstants();

    public abstract Field getField(String s)
        throws NoSuchFieldException;

    public abstract Field[] getFields();

    public abstract Type getGenericSupertype();

    public transient abstract InterTypeConstructorDeclaration getITDConstructor(AjType ajtype, AjType aajtype[])
        throws NoSuchMethodException;

    public abstract InterTypeConstructorDeclaration[] getITDConstructors();

    public abstract InterTypeFieldDeclaration getITDField(String s, AjType ajtype)
        throws NoSuchFieldException;

    public abstract InterTypeFieldDeclaration[] getITDFields();

    public transient abstract InterTypeMethodDeclaration getITDMethod(String s, AjType ajtype, AjType aajtype[])
        throws NoSuchMethodException;

    public abstract InterTypeMethodDeclaration[] getITDMethods();

    public abstract AjType[] getInterfaces();

    public abstract Class getJavaClass();

    public transient abstract Method getMethod(String s, AjType aajtype[])
        throws NoSuchMethodException;

    public abstract Method[] getMethods();

    public abstract int getModifiers();

    public abstract String getName();

    public abstract Package getPackage();

    public abstract PerClause getPerClause();

    public abstract Pointcut getPointcut(String s)
        throws NoSuchPointcutException;

    public abstract Pointcut[] getPointcuts();

    public abstract AjType getSupertype();

    public abstract TypeVariable[] getTypeParameters();

    public abstract boolean isArray();

    public abstract boolean isAspect();

    public abstract boolean isEnum();

    public abstract boolean isInstance(Object obj);

    public abstract boolean isInterface();

    public abstract boolean isLocalClass();

    public abstract boolean isMemberAspect();

    public abstract boolean isMemberClass();

    public abstract boolean isPrimitive();

    public abstract boolean isPrivileged();
}
