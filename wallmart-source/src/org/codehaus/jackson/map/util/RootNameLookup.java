// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.map.util;

import org.codehaus.jackson.io.SerializedString;
import org.codehaus.jackson.map.AnnotationIntrospector;
import org.codehaus.jackson.map.MapperConfig;
import org.codehaus.jackson.map.introspect.BasicBeanDescription;
import org.codehaus.jackson.map.type.ClassKey;
import org.codehaus.jackson.type.JavaType;

// Referenced classes of package org.codehaus.jackson.map.util:
//            LRUMap

public class RootNameLookup
{

    protected LRUMap _rootNames;

    public RootNameLookup()
    {
    }

    public SerializedString findRootName(Class class1, MapperConfig mapperconfig)
    {
        this;
        JVM INSTR monitorenter ;
        ClassKey classkey = new ClassKey(class1);
        if (_rootNames != null) goto _L2; else goto _L1
_L1:
        _rootNames = new LRUMap(20, 200);
_L6:
        Object obj;
        obj = (BasicBeanDescription)mapperconfig.introspectClassAnnotations(class1);
        obj = mapperconfig.getAnnotationIntrospector().findRootName(((BasicBeanDescription) (obj)).getClassInfo());
        mapperconfig = ((MapperConfig) (obj));
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        mapperconfig = class1.getSimpleName();
        class1 = new SerializedString(mapperconfig);
        _rootNames.put(classkey, class1);
_L4:
        this;
        JVM INSTR monitorexit ;
        return class1;
_L2:
        obj = (SerializedString)_rootNames.get(classkey);
        if (obj == null)
        {
            break; /* Loop/switch isn't completed */
        }
        class1 = ((Class) (obj));
        if (true) goto _L4; else goto _L3
_L3:
        if (true) goto _L6; else goto _L5
_L5:
        class1;
        throw class1;
    }

    public SerializedString findRootName(JavaType javatype, MapperConfig mapperconfig)
    {
        return findRootName(javatype.getRawClass(), mapperconfig);
    }
}
