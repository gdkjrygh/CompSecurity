// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.client.utils;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class CloneUtils
{

    private CloneUtils()
    {
    }

    public static Object clone(Object obj)
        throws CloneNotSupportedException
    {
        if (obj == null)
        {
            return null;
        }
        if (obj instanceof Cloneable)
        {
            Object obj1 = obj.getClass();
            try
            {
                obj1 = ((Class) (obj1)).getMethod("clone", (Class[])null);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw new NoSuchMethodError(((NoSuchMethodException) (obj)).getMessage());
            }
            try
            {
                obj = ((Method) (obj1)).invoke(obj, (Object[])null);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                obj = ((InvocationTargetException) (obj)).getCause();
                if (obj instanceof CloneNotSupportedException)
                {
                    throw (CloneNotSupportedException)obj;
                } else
                {
                    throw new Error("Unexpected exception", ((Throwable) (obj)));
                }
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw new IllegalAccessError(((IllegalAccessException) (obj)).getMessage());
            }
            return obj;
        } else
        {
            throw new CloneNotSupportedException();
        }
    }
}
