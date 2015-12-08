// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.reflect;

import com.google.common.base.Preconditions;
import java.lang.annotation.Annotation;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;

// Referenced classes of package com.google.common.reflect:
//            TypeToken

class Element extends AccessibleObject
    implements Member
{

    private final AccessibleObject accessibleObject;
    private final Member member;

    Element(AccessibleObject accessibleobject)
    {
        Preconditions.checkNotNull(accessibleobject);
        accessibleObject = accessibleobject;
        member = (Member)accessibleobject;
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof Element)
        {
            obj = (Element)obj;
            flag = flag1;
            if (getOwnerType().equals(((Element) (obj)).getOwnerType()))
            {
                flag = flag1;
                if (member.equals(((Element) (obj)).member))
                {
                    flag = true;
                }
            }
        }
        return flag;
    }

    public final Annotation getAnnotation(Class class1)
    {
        return accessibleObject.getAnnotation(class1);
    }

    public final Annotation[] getAnnotations()
    {
        return accessibleObject.getAnnotations();
    }

    public final Annotation[] getDeclaredAnnotations()
    {
        return accessibleObject.getDeclaredAnnotations();
    }

    public Class getDeclaringClass()
    {
        return member.getDeclaringClass();
    }

    public final int getModifiers()
    {
        return member.getModifiers();
    }

    public final String getName()
    {
        return member.getName();
    }

    public TypeToken getOwnerType()
    {
        return TypeToken.of(getDeclaringClass());
    }

    public int hashCode()
    {
        return member.hashCode();
    }

    public final boolean isAbstract()
    {
        return Modifier.isAbstract(getModifiers());
    }

    public final boolean isAccessible()
    {
        return accessibleObject.isAccessible();
    }

    public final boolean isAnnotationPresent(Class class1)
    {
        return accessibleObject.isAnnotationPresent(class1);
    }

    public final boolean isFinal()
    {
        return Modifier.isFinal(getModifiers());
    }

    public final boolean isNative()
    {
        return Modifier.isNative(getModifiers());
    }

    public final boolean isPackagePrivate()
    {
        return !isPrivate() && !isPublic() && !isProtected();
    }

    public final boolean isPrivate()
    {
        return Modifier.isPrivate(getModifiers());
    }

    public final boolean isProtected()
    {
        return Modifier.isProtected(getModifiers());
    }

    public final boolean isPublic()
    {
        return Modifier.isPublic(getModifiers());
    }

    public final boolean isStatic()
    {
        return Modifier.isStatic(getModifiers());
    }

    public final boolean isSynchronized()
    {
        return Modifier.isSynchronized(getModifiers());
    }

    public final boolean isSynthetic()
    {
        return member.isSynthetic();
    }

    final boolean isTransient()
    {
        return Modifier.isTransient(getModifiers());
    }

    final boolean isVolatile()
    {
        return Modifier.isVolatile(getModifiers());
    }

    public final void setAccessible(boolean flag)
        throws SecurityException
    {
        accessibleObject.setAccessible(flag);
    }

    public String toString()
    {
        return member.toString();
    }
}
