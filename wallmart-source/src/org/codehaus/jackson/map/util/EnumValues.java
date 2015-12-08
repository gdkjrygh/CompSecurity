// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.map.util;

import java.util.Collection;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
import org.codehaus.jackson.io.SerializedString;
import org.codehaus.jackson.map.AnnotationIntrospector;

// Referenced classes of package org.codehaus.jackson.map.util:
//            ClassUtil

public final class EnumValues
{

    private final EnumMap _values;

    private EnumValues(Map map)
    {
        _values = new EnumMap(map);
    }

    public static EnumValues construct(Class class1, AnnotationIntrospector annotationintrospector)
    {
        return constructFromName(class1, annotationintrospector);
    }

    public static EnumValues constructFromName(Class class1, AnnotationIntrospector annotationintrospector)
    {
        Enum aenum[] = (Enum[])ClassUtil.findEnumType(class1).getEnumConstants();
        if (aenum != null)
        {
            class1 = new HashMap();
            int j = aenum.length;
            for (int i = 0; i < j; i++)
            {
                Enum enum = aenum[i];
                class1.put(enum, new SerializedString(annotationintrospector.findEnumValue(enum)));
            }

            return new EnumValues(class1);
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Can not determine enum constants for Class ").append(class1.getName()).toString());
        }
    }

    public static EnumValues constructFromToString(Class class1, AnnotationIntrospector annotationintrospector)
    {
        annotationintrospector = (Enum[])ClassUtil.findEnumType(class1).getEnumConstants();
        if (annotationintrospector != null)
        {
            class1 = new HashMap();
            int j = annotationintrospector.length;
            for (int i = 0; i < j; i++)
            {
                Enum enum = annotationintrospector[i];
                class1.put(enum, new SerializedString(enum.toString()));
            }

            return new EnumValues(class1);
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Can not determine enum constants for Class ").append(class1.getName()).toString());
        }
    }

    public SerializedString serializedValueFor(Enum enum)
    {
        return (SerializedString)_values.get(enum);
    }

    public String valueFor(Enum enum)
    {
        enum = (SerializedString)_values.get(enum);
        if (enum == null)
        {
            return null;
        } else
        {
            return enum.getValue();
        }
    }

    public Collection values()
    {
        return _values.values();
    }
}
