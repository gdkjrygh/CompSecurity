// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.primitives.Primitives;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            ClassToInstanceMap, MapConstraint

public final class MutableClassToInstanceMap extends MapConstraints.ConstrainedMap
    implements ClassToInstanceMap
{

    private static final MapConstraint VALUE_CAN_BE_CAST_TO_KEY = new MapConstraint() {

        public void checkKeyValue(Class class1, Object obj)
        {
            MutableClassToInstanceMap.cast(class1, obj);
        }

        public volatile void checkKeyValue(Object obj, Object obj1)
        {
            checkKeyValue((Class)obj, obj1);
        }

    };
    private static final long serialVersionUID = 0L;

    private MutableClassToInstanceMap(Map map)
    {
        super(map, VALUE_CAN_BE_CAST_TO_KEY);
    }

    private static Object cast(Class class1, Object obj)
    {
        return Primitives.wrap(class1).cast(obj);
    }

    public static MutableClassToInstanceMap create()
    {
        return new MutableClassToInstanceMap(new HashMap());
    }

    public static MutableClassToInstanceMap create(Map map)
    {
        return new MutableClassToInstanceMap(map);
    }

    public volatile Set entrySet()
    {
        return super.entrySet();
    }

    public Object getInstance(Class class1)
    {
        return cast(class1, get(class1));
    }

    public volatile void putAll(Map map)
    {
        super.putAll(map);
    }

    public Object putInstance(Class class1, Object obj)
    {
        return cast(class1, put(class1, obj));
    }


}
