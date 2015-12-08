// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.map.util;

import java.lang.reflect.Field;
import java.util.EnumMap;
import java.util.EnumSet;

// Referenced classes of package org.codehaus.jackson.map.util:
//            ClassUtil

private static class 
{

    static final enumSetTypeField instance = new <init>();
    private final Field enumMapTypeField = locateField(java/util/EnumMap, "elementType", java/lang/Class);
    private final Field enumSetTypeField = locateField(java/util/EnumSet, "elementType", java/lang/Class);

    private Object get(Object obj, Field field)
    {
        try
        {
            obj = field.get(obj);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new IllegalArgumentException(((Throwable) (obj)));
        }
        return obj;
    }

    private static Field locateField(Class class1, String s, Class class2)
    {
        Object obj;
        Field afield[];
        int i;
        int j;
        obj = null;
        afield = class1.getDeclaredFields();
        j = afield.length;
        i = 0;
_L2:
        class1 = obj;
        if (i < j)
        {
            class1 = afield[i];
            if (!s.equals(class1.getName()) || class1.getType() != class2)
            {
                break MISSING_BLOCK_LABEL_95;
            }
        }
label0:
        {
            s = class1;
            if (class1 == null)
            {
                j = afield.length;
                i = 0;
                break label0;
            }
        }
        break MISSING_BLOCK_LABEL_117;
        i++;
        continue; /* Loop/switch isn't completed */
        while (true) 
        {
            s = class1;
            if (i >= j)
            {
                break;
            }
            Field field = afield[i];
            s = class1;
            if (field.getType() == class2)
            {
                if (class1 != null)
                {
                    return null;
                }
                s = field;
            }
            i++;
            class1 = s;
        }
        if (s != null)
        {
            try
            {
                s.setAccessible(true);
            }
            // Misplaced declaration of an exception variable
            catch (Class class1) { }
        }
        return s;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public Class enumTypeFor(EnumMap enummap)
    {
        if (enumMapTypeField != null)
        {
            return (Class)get(enummap, enumMapTypeField);
        } else
        {
            throw new IllegalStateException("Can not figure out type for EnumMap (odd JDK platform?)");
        }
    }

    public Class enumTypeFor(EnumSet enumset)
    {
        if (enumSetTypeField != null)
        {
            return (Class)get(enumset, enumSetTypeField);
        } else
        {
            throw new IllegalStateException("Can not figure out type for EnumSet (odd JDK platform?)");
        }
    }


    private ()
    {
    }
}
