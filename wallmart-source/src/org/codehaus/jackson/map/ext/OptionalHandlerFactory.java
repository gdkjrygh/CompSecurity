// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.map.ext;

import java.util.Collection;
import java.util.Iterator;
import org.codehaus.jackson.map.DeserializationConfig;
import org.codehaus.jackson.map.DeserializerProvider;
import org.codehaus.jackson.map.JsonDeserializer;
import org.codehaus.jackson.map.JsonSerializer;
import org.codehaus.jackson.map.SerializationConfig;
import org.codehaus.jackson.map.deser.std.StdDeserializer;
import org.codehaus.jackson.map.util.Provider;
import org.codehaus.jackson.type.JavaType;

public class OptionalHandlerFactory
{

    private static final String CLASS_NAME_DOM_DOCUMENT = "org.w3c.dom.Node";
    private static final String CLASS_NAME_DOM_NODE = "org.w3c.dom.Node";
    private static final String DESERIALIZERS_FOR_JAVAX_XML = "org.codehaus.jackson.map.ext.CoreXMLDeserializers";
    private static final String DESERIALIZERS_FOR_JODA_DATETIME = "org.codehaus.jackson.map.ext.JodaDeserializers";
    private static final String DESERIALIZER_FOR_DOM_DOCUMENT = "org.codehaus.jackson.map.ext.DOMDeserializer$DocumentDeserializer";
    private static final String DESERIALIZER_FOR_DOM_NODE = "org.codehaus.jackson.map.ext.DOMDeserializer$NodeDeserializer";
    private static final String PACKAGE_PREFIX_JAVAX_XML = "javax.xml.";
    private static final String PACKAGE_PREFIX_JODA_DATETIME = "org.joda.time.";
    private static final String SERIALIZERS_FOR_JAVAX_XML = "org.codehaus.jackson.map.ext.CoreXMLSerializers";
    private static final String SERIALIZERS_FOR_JODA_DATETIME = "org.codehaus.jackson.map.ext.JodaSerializers";
    private static final String SERIALIZER_FOR_DOM_NODE = "org.codehaus.jackson.map.ext.DOMSerializer";
    public static final OptionalHandlerFactory instance = new OptionalHandlerFactory();

    protected OptionalHandlerFactory()
    {
    }

    private boolean doesImplement(Class class1, String s)
    {
        for (; class1 != null; class1 = class1.getSuperclass())
        {
            while (class1.getName().equals(s) || hasInterface(class1, s)) 
            {
                return true;
            }
        }

        return false;
    }

    private boolean hasInterface(Class class1, String s)
    {
        int i;
        int k;
        class1 = class1.getInterfaces();
        k = class1.length;
        i = 0;
_L7:
        if (i >= k) goto _L2; else goto _L1
_L1:
        if (!class1[i].getName().equals(s)) goto _L4; else goto _L3
_L3:
        return true;
_L4:
        i++;
        continue; /* Loop/switch isn't completed */
_L2:
        int l = class1.length;
        int j = 0;
label0:
        do
        {
label1:
            {
                if (j >= l)
                {
                    break label1;
                }
                if (hasInterface(class1[j], s))
                {
                    break label0;
                }
                j++;
            }
        } while (true);
        if (true) goto _L3; else goto _L5
_L5:
        return false;
        if (true) goto _L7; else goto _L6
_L6:
    }

    private boolean hasInterfaceStartingWith(Class class1, String s)
    {
        int i;
        int k;
        class1 = class1.getInterfaces();
        k = class1.length;
        i = 0;
_L7:
        if (i >= k) goto _L2; else goto _L1
_L1:
        if (!class1[i].getName().startsWith(s)) goto _L4; else goto _L3
_L3:
        return true;
_L4:
        i++;
        continue; /* Loop/switch isn't completed */
_L2:
        int l = class1.length;
        int j = 0;
label0:
        do
        {
label1:
            {
                if (j >= l)
                {
                    break label1;
                }
                if (hasInterfaceStartingWith(class1[j], s))
                {
                    break label0;
                }
                j++;
            }
        } while (true);
        if (true) goto _L3; else goto _L5
_L5:
        return false;
        if (true) goto _L7; else goto _L6
_L6:
    }

    private boolean hasSupertypeStartingWith(Class class1, String s)
    {
        Class class2 = class1.getSuperclass();
_L7:
        if (class2 == null) goto _L2; else goto _L1
_L1:
        if (!class2.getName().startsWith(s)) goto _L4; else goto _L3
_L3:
        return true;
_L4:
        class2 = class2.getSuperclass();
        continue; /* Loop/switch isn't completed */
_L2:
label0:
        do
        {
label1:
            {
                if (class1 == null)
                {
                    break label1;
                }
                if (hasInterfaceStartingWith(class1, s))
                {
                    break label0;
                }
                class1 = class1.getSuperclass();
            }
        } while (true);
        if (true) goto _L3; else goto _L5
_L5:
        return false;
        if (true) goto _L7; else goto _L6
_L6:
    }

    private Object instantiate(String s)
    {
        s = ((String) (Class.forName(s).newInstance()));
        return s;
        s;
_L2:
        return null;
        s;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public JsonDeserializer findDeserializer(JavaType javatype, DeserializationConfig deserializationconfig, DeserializerProvider deserializerprovider)
    {
        deserializationconfig = javatype.getRawClass();
        javatype = deserializationconfig.getName();
        if (!javatype.startsWith("org.joda.time.")) goto _L2; else goto _L1
_L1:
        javatype = "org.codehaus.jackson.map.ext.JodaDeserializers";
_L9:
        javatype = ((JavaType) (instantiate(javatype)));
        if (javatype != null) goto _L4; else goto _L3
_L3:
        return null;
_L2:
        if (javatype.startsWith("javax.xml.") || hasSupertypeStartingWith(deserializationconfig, "javax.xml."))
        {
            javatype = "org.codehaus.jackson.map.ext.CoreXMLDeserializers";
            continue; /* Loop/switch isn't completed */
        }
        if (doesImplement(deserializationconfig, "org.w3c.dom.Node"))
        {
            return (JsonDeserializer)instantiate("org.codehaus.jackson.map.ext.DOMDeserializer$DocumentDeserializer");
        }
        if (doesImplement(deserializationconfig, "org.w3c.dom.Node"))
        {
            return (JsonDeserializer)instantiate("org.codehaus.jackson.map.ext.DOMDeserializer$NodeDeserializer");
        }
        if (true) goto _L3; else goto _L4
_L4:
        javatype = ((Provider)javatype).provide();
        for (deserializerprovider = javatype.iterator(); deserializerprovider.hasNext();)
        {
            StdDeserializer stddeserializer = (StdDeserializer)deserializerprovider.next();
            if (deserializationconfig == stddeserializer.getValueClass())
            {
                return stddeserializer;
            }
        }

        javatype = javatype.iterator();
_L7:
        if (!javatype.hasNext()) goto _L3; else goto _L5
_L5:
        deserializerprovider = (StdDeserializer)javatype.next();
        if (!deserializerprovider.getValueClass().isAssignableFrom(deserializationconfig)) goto _L7; else goto _L6
_L6:
        return deserializerprovider;
        if (true) goto _L9; else goto _L8
_L8:
    }

    public JsonSerializer findSerializer(SerializationConfig serializationconfig, JavaType javatype)
    {
        javatype = javatype.getRawClass();
        serializationconfig = javatype.getName();
        if (!serializationconfig.startsWith("org.joda.time.")) goto _L2; else goto _L1
_L1:
        serializationconfig = "org.codehaus.jackson.map.ext.JodaSerializers";
_L4:
        serializationconfig = ((SerializationConfig) (instantiate(serializationconfig)));
        if (serializationconfig == null)
        {
            return null;
        }
        break MISSING_BLOCK_LABEL_81;
_L2:
        if (!serializationconfig.startsWith("javax.xml.") && !hasSupertypeStartingWith(javatype, "javax.xml."))
        {
            break; /* Loop/switch isn't completed */
        }
        serializationconfig = "org.codehaus.jackson.map.ext.CoreXMLSerializers";
        if (true) goto _L4; else goto _L3
_L3:
        if (doesImplement(javatype, "org.w3c.dom.Node"))
        {
            return (JsonSerializer)instantiate("org.codehaus.jackson.map.ext.DOMSerializer");
        } else
        {
            return null;
        }
        serializationconfig = ((Provider)serializationconfig).provide();
        for (Iterator iterator = serializationconfig.iterator(); iterator.hasNext();)
        {
            java.util.Map.Entry entry1 = (java.util.Map.Entry)iterator.next();
            if (javatype == entry1.getKey())
            {
                return (JsonSerializer)entry1.getValue();
            }
        }

        for (serializationconfig = serializationconfig.iterator(); serializationconfig.hasNext();)
        {
            java.util.Map.Entry entry = (java.util.Map.Entry)serializationconfig.next();
            if (((Class)entry.getKey()).isAssignableFrom(javatype))
            {
                return (JsonSerializer)entry.getValue();
            }
        }

        return null;
    }

}
