// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.map.deser.std;

import java.util.HashMap;
import org.codehaus.jackson.map.DeserializationConfig;
import org.codehaus.jackson.map.KeyDeserializer;
import org.codehaus.jackson.map.introspect.AnnotatedMethod;
import org.codehaus.jackson.map.introspect.BasicBeanDescription;
import org.codehaus.jackson.map.type.TypeFactory;
import org.codehaus.jackson.map.util.ClassUtil;
import org.codehaus.jackson.map.util.EnumResolver;
import org.codehaus.jackson.type.JavaType;

// Referenced classes of package org.codehaus.jackson.map.deser.std:
//            StdKeyDeserializer

public class StdKeyDeserializers
{

    protected final HashMap _keyDeserializers = new HashMap();

    protected StdKeyDeserializers()
    {
        add(new StdKeyDeserializer.BoolKD());
        add(new StdKeyDeserializer.ByteKD());
        add(new StdKeyDeserializer.CharKD());
        add(new StdKeyDeserializer.ShortKD());
        add(new StdKeyDeserializer.IntKD());
        add(new StdKeyDeserializer.LongKD());
        add(new StdKeyDeserializer.FloatKD());
        add(new StdKeyDeserializer.DoubleKD());
        add(new StdKeyDeserializer.DateKD());
        add(new StdKeyDeserializer.CalendarKD());
        add(new StdKeyDeserializer.UuidKD());
    }

    private void add(StdKeyDeserializer stdkeydeserializer)
    {
        Class class1 = stdkeydeserializer.getKeyClass();
        _keyDeserializers.put(TypeFactory.defaultInstance().uncheckedSimpleType(class1), stdkeydeserializer);
    }

    public static HashMap constructAll()
    {
        return (new StdKeyDeserializers())._keyDeserializers;
    }

    public static KeyDeserializer constructEnumKeyDeserializer(EnumResolver enumresolver)
    {
        return new StdKeyDeserializer.EnumKD(enumresolver, null);
    }

    public static KeyDeserializer constructEnumKeyDeserializer(EnumResolver enumresolver, AnnotatedMethod annotatedmethod)
    {
        return new StdKeyDeserializer.EnumKD(enumresolver, annotatedmethod);
    }

    public static KeyDeserializer constructStringKeyDeserializer(DeserializationConfig deserializationconfig, JavaType javatype)
    {
        return StdKeyDeserializer.StringKD.forType(javatype.getClass());
    }

    public static KeyDeserializer findStringBasedKeyDeserializer(DeserializationConfig deserializationconfig, JavaType javatype)
    {
        javatype = (BasicBeanDescription)deserializationconfig.introspect(javatype);
        java.lang.reflect.Constructor constructor = javatype.findSingleArgConstructor(new Class[] {
            java/lang/String
        });
        if (constructor != null)
        {
            if (deserializationconfig.isEnabled(org.codehaus.jackson.map.DeserializationConfig.Feature.CAN_OVERRIDE_ACCESS_MODIFIERS))
            {
                ClassUtil.checkAndFixAccess(constructor);
            }
            return new StdKeyDeserializer.StringCtorKeyDeserializer(constructor);
        }
        javatype = javatype.findFactoryMethod(new Class[] {
            java/lang/String
        });
        if (javatype != null)
        {
            if (deserializationconfig.isEnabled(org.codehaus.jackson.map.DeserializationConfig.Feature.CAN_OVERRIDE_ACCESS_MODIFIERS))
            {
                ClassUtil.checkAndFixAccess(javatype);
            }
            return new StdKeyDeserializer.StringFactoryKeyDeserializer(javatype);
        } else
        {
            return null;
        }
    }
}
