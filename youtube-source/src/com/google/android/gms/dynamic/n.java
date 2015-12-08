// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.dynamic;

import java.lang.reflect.Field;

// Referenced classes of package com.google.android.gms.dynamic:
//            l, k

public final class n extends l
{

    private final Object a;

    private n(Object obj)
    {
        a = obj;
    }

    public static k a(Object obj)
    {
        return new n(obj);
    }

    public static Object a(k k1)
    {
        if (k1 instanceof n)
        {
            return ((n)k1).a;
        }
        k1 = k1.asBinder();
        Field afield[] = k1.getClass().getDeclaredFields();
        if (afield.length == 1)
        {
            Field field = afield[0];
            if (!field.isAccessible())
            {
                field.setAccessible(true);
                try
                {
                    k1 = ((k) (field.get(k1)));
                }
                // Misplaced declaration of an exception variable
                catch (k k1)
                {
                    throw new IllegalArgumentException("Binder object is null.", k1);
                }
                // Misplaced declaration of an exception variable
                catch (k k1)
                {
                    throw new IllegalArgumentException("remoteBinder is the wrong class.", k1);
                }
                // Misplaced declaration of an exception variable
                catch (k k1)
                {
                    throw new IllegalArgumentException("Could not access the field in remoteBinder.", k1);
                }
                return k1;
            } else
            {
                throw new IllegalArgumentException("The concrete class implementing IObjectWrapper must have exactly one declared *private* field for the wrapped object. Preferably, this is an instance of the ObjectWrapper<T> class.");
            }
        } else
        {
            throw new IllegalArgumentException("The concrete class implementing IObjectWrapper must have exactly *one* declared private field for the wrapped object.  Preferably, this is an instance of the ObjectWrapper<T> class.");
        }
    }
}
