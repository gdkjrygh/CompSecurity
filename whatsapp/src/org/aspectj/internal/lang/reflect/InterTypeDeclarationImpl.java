// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.aspectj.internal.lang.reflect;

import org.aspectj.lang.reflect.AjType;
import org.aspectj.lang.reflect.InterTypeDeclaration;

// Referenced classes of package org.aspectj.internal.lang.reflect:
//            StringToType

public class InterTypeDeclarationImpl
    implements InterTypeDeclaration
{

    private AjType declaringType;
    private int modifiers;
    private AjType targetType;
    protected String targetTypeName;

    public InterTypeDeclarationImpl(AjType ajtype, String s, int i)
    {
        declaringType = ajtype;
        targetTypeName = s;
        modifiers = i;
        try
        {
            targetType = (AjType)StringToType.stringToType(s, ajtype.getJavaClass());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (AjType ajtype)
        {
            return;
        }
    }

    public InterTypeDeclarationImpl(AjType ajtype, AjType ajtype1, int i)
    {
        declaringType = ajtype;
        targetType = ajtype1;
        targetTypeName = ajtype1.getName();
        modifiers = i;
    }

    public AjType getDeclaringType()
    {
        return declaringType;
    }

    public int getModifiers()
    {
        return modifiers;
    }

    public AjType getTargetType()
        throws ClassNotFoundException
    {
        if (targetType == null)
        {
            throw new ClassNotFoundException(targetTypeName);
        } else
        {
            return targetType;
        }
    }
}
