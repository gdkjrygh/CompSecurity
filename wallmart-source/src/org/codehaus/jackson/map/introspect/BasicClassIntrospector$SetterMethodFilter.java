// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.map.introspect;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

// Referenced classes of package org.codehaus.jackson.map.introspect:
//            MethodFilter, BasicClassIntrospector

public static class 
    implements MethodFilter
{

    public boolean includeMethod(Method method)
    {
        if (Modifier.isStatic(method.getModifiers()))
        {
            return false;
        }
        switch (method.getParameterTypes().length)
        {
        default:
            return false;

        case 1: // '\001'
            return true;

        case 2: // '\002'
            return true;
        }
    }

    public ()
    {
    }
}
