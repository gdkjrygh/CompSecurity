// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.aspectj.internal.lang.reflect;

import java.lang.reflect.Type;
import org.aspectj.lang.reflect.AjType;
import org.aspectj.lang.reflect.DeclareParents;
import org.aspectj.lang.reflect.TypePattern;

// Referenced classes of package org.aspectj.internal.lang.reflect:
//            TypePatternImpl, StringToType

public class DeclareParentsImpl
    implements DeclareParents
{

    private AjType declaringType;
    private String firstMissingTypeName;
    private boolean isExtends;
    private Type parents[];
    private boolean parentsError;
    private String parentsString;
    private TypePattern targetTypesPattern;

    public DeclareParentsImpl(String s, String s1, boolean flag, AjType ajtype)
    {
        parentsError = false;
        targetTypesPattern = new TypePatternImpl(s);
        isExtends = flag;
        declaringType = ajtype;
        parentsString = s1;
        try
        {
            parents = StringToType.commaSeparatedListToTypeArray(s1, ajtype.getJavaClass());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            parentsError = true;
        }
        firstMissingTypeName = s.getMessage();
    }

    public AjType getDeclaringType()
    {
        return declaringType;
    }

    public Type[] getParentTypes()
        throws ClassNotFoundException
    {
        if (parentsError)
        {
            throw new ClassNotFoundException(firstMissingTypeName);
        } else
        {
            return parents;
        }
    }

    public TypePattern getTargetTypesPattern()
    {
        return targetTypesPattern;
    }

    public boolean isExtends()
    {
        return isExtends;
    }

    public boolean isImplements()
    {
        return !isExtends;
    }

    public String toString()
    {
        StringBuffer stringbuffer = new StringBuffer();
        stringbuffer.append("declare parents : ");
        stringbuffer.append(getTargetTypesPattern().asString());
        String s;
        if (isExtends())
        {
            s = " extends ";
        } else
        {
            s = " implements ";
        }
        stringbuffer.append(s);
        stringbuffer.append(parentsString);
        return stringbuffer.toString();
    }
}
