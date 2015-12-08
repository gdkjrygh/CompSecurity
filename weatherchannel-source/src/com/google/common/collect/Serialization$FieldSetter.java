// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.lang.reflect.Field;

// Referenced classes of package com.google.common.collect:
//            Serialization

static final class <init>
{

    private final Field field;

    void set(Object obj, int i)
    {
        try
        {
            field.set(obj, Integer.valueOf(i));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new AssertionError(obj);
        }
    }

    void set(Object obj, Object obj1)
    {
        try
        {
            field.set(obj, obj1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new AssertionError(obj);
        }
    }

    private _cls9(Field field1)
    {
        field = field1;
        field1.setAccessible(true);
    }

    field(Field field1, field field2)
    {
        this(field1);
    }
}
