// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spatial4j.core.context;

import com.spatial4j.core.distance.CartesianDistCalc;
import com.spatial4j.core.distance.DistanceCalculator;
import com.spatial4j.core.io.BinaryCodec;
import com.spatial4j.core.io.WktShapeParser;
import com.spatial4j.core.shape.Rectangle;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Map;

// Referenced classes of package com.spatial4j.core.context:
//            SpatialContext

public class SpatialContextFactory
{

    protected Map args;
    public Class binaryCodecClass;
    protected ClassLoader classLoader;
    public DistanceCalculator distCalc;
    public boolean geo;
    public boolean normWrapLongitude;
    public Class wktShapeParserClass;
    public Rectangle worldBounds;

    public SpatialContextFactory()
    {
        geo = true;
        normWrapLongitude = false;
        wktShapeParserClass = com/spatial4j/core/io/WktShapeParser;
        binaryCodecClass = com/spatial4j/core/io/BinaryCodec;
    }

    private static transient Object a(Class class1, Object aobj[])
    {
        Constructor aconstructor[];
        Constructor constructor;
        Class aclass[];
        Object obj;
        int i;
        int j;
        int k;
        try
        {
            aconstructor = class1.getConstructors();
            k = aconstructor.length;
        }
        // Misplaced declaration of an exception variable
        catch (Class class1)
        {
            throw new RuntimeException(class1);
        }
        i = 0;
        if (i >= k) goto _L2; else goto _L1
_L1:
        constructor = aconstructor[i];
        aclass = constructor.getParameterTypes();
        if (aclass.length != 2)
        {
            continue; /* Loop/switch isn't completed */
        }
        j = 0;
_L4:
        if (j >= 2)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = aobj[j];
        if (!aclass[j].isAssignableFrom(obj.getClass()))
        {
            continue; /* Loop/switch isn't completed */
        }
        j++;
        if (true) goto _L4; else goto _L3
_L3:
        class1 = ((Class) (class1.cast(constructor.newInstance(aobj))));
        return class1;
        i++;
        break MISSING_BLOCK_LABEL_12;
_L2:
        throw new RuntimeException((new StringBuilder()).append(class1).append(" needs a constructor that takes: ").append(Arrays.toString(aobj)).toString());
    }

    public static SpatialContext makeSpatialContext(Map map, ClassLoader classloader)
    {
        ClassLoader classloader1 = classloader;
        if (classloader == null)
        {
            classloader1 = com/spatial4j/core/context/SpatialContextFactory.getClassLoader();
        }
        String s = (String)map.get("spatialContextFactory");
        classloader = s;
        if (s == null)
        {
            classloader = System.getProperty("SpatialContextFactory");
        }
        if (classloader == null)
        {
            classloader = new SpatialContextFactory();
        } else
        {
            try
            {
                classloader = (SpatialContextFactory)classloader1.loadClass(classloader).newInstance();
            }
            // Misplaced declaration of an exception variable
            catch (Map map)
            {
                throw new RuntimeException(map);
            }
        }
        classloader.init(map, classloader1);
        return classloader.newSpatialContext();
    }

    protected void init(Map map, ClassLoader classloader)
    {
        args = map;
        classLoader = classloader;
        initField("geo");
        initCalculator();
        initField("wktShapeParserClass");
        initWorldBounds();
        initField("normWrapLongitude");
        initField("binaryCodecClass");
    }

    protected void initCalculator()
    {
        String s = (String)args.get("distCalculator");
        if (s == null)
        {
            return;
        }
        if (s.equalsIgnoreCase("haversine"))
        {
            distCalc = new com.spatial4j.core.distance.GeodesicSphereDistCalc.Haversine();
            return;
        }
        if (s.equalsIgnoreCase("lawOfCosines"))
        {
            distCalc = new com.spatial4j.core.distance.GeodesicSphereDistCalc.LawOfCosines();
            return;
        }
        if (s.equalsIgnoreCase("vincentySphere"))
        {
            distCalc = new com.spatial4j.core.distance.GeodesicSphereDistCalc.Vincenty();
            return;
        }
        if (s.equalsIgnoreCase("cartesian"))
        {
            distCalc = new CartesianDistCalc();
            return;
        }
        if (s.equalsIgnoreCase("cartesian^2"))
        {
            distCalc = new CartesianDistCalc(true);
            return;
        } else
        {
            throw new RuntimeException((new StringBuilder("Unknown calculator: ")).append(s).toString());
        }
    }

    protected void initField(String s)
    {
        Object obj;
        Field field;
        String s1;
        try
        {
            field = getClass().getField(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new Error(s);
        }
        s1 = (String)args.get(s);
        if (s1 == null) goto _L2; else goto _L1
_L1:
        if (field.getType() != Boolean.TYPE) goto _L4; else goto _L3
_L3:
        obj = Boolean.valueOf(s1);
_L5:
        field.set(this, obj);
_L2:
        return;
_L4:
        try
        {
            obj = field.getType();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new Error(s);
        }
        catch (Exception exception)
        {
            throw new RuntimeException((new StringBuilder("Invalid value '")).append(s1).append("' on field ").append(s).append(" of type ").append(field.getType()).toString(), exception);
        }
        if (obj != java/lang/Class)
        {
            break MISSING_BLOCK_LABEL_106;
        }
        obj = classLoader.loadClass(s1);
          goto _L5
        obj;
        throw new RuntimeException(((Throwable) (obj)));
label0:
        {
            if (!field.getType().isEnum())
            {
                break label0;
            }
            obj = Enum.valueOf(field.getType().asSubclass(java/lang/Enum), s1);
        }
          goto _L5
        throw new Error((new StringBuilder("unsupported field type: ")).append(field.getType()).toString());
    }

    protected void initWorldBounds()
    {
        String s = (String)args.get("worldBounds");
        if (s == null)
        {
            return;
        } else
        {
            worldBounds = (Rectangle)newSpatialContext().readShape(s);
            return;
        }
    }

    public BinaryCodec makeBinaryCodec(SpatialContext spatialcontext)
    {
        return (BinaryCodec)a(binaryCodecClass, new Object[] {
            spatialcontext, this
        });
    }

    public WktShapeParser makeWktShapeParser(SpatialContext spatialcontext)
    {
        return (WktShapeParser)a(wktShapeParserClass, new Object[] {
            spatialcontext, this
        });
    }

    public SpatialContext newSpatialContext()
    {
        return new SpatialContext(this);
    }
}
