// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            Multimap, Multiset

final class Serialization
{
    static final class FieldSetter
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

        private FieldSetter(Field field1)
        {
            field = field1;
            field1.setAccessible(true);
        }

    }


    private Serialization()
    {
    }

    static FieldSetter getFieldSetter(Class class1, String s)
    {
        try
        {
            class1 = new FieldSetter(class1.getDeclaredField(s));
        }
        // Misplaced declaration of an exception variable
        catch (Class class1)
        {
            throw new AssertionError(class1);
        }
        return class1;
    }

    static void populateMap(Map map, ObjectInputStream objectinputstream)
        throws IOException, ClassNotFoundException
    {
        populateMap(map, objectinputstream, objectinputstream.readInt());
    }

    static void populateMap(Map map, ObjectInputStream objectinputstream, int i)
        throws IOException, ClassNotFoundException
    {
        for (int j = 0; j < i; j++)
        {
            map.put(objectinputstream.readObject(), objectinputstream.readObject());
        }

    }

    static void populateMultimap(Multimap multimap, ObjectInputStream objectinputstream)
        throws IOException, ClassNotFoundException
    {
        populateMultimap(multimap, objectinputstream, objectinputstream.readInt());
    }

    static void populateMultimap(Multimap multimap, ObjectInputStream objectinputstream, int i)
        throws IOException, ClassNotFoundException
    {
        for (int j = 0; j < i; j++)
        {
            Collection collection = multimap.get(objectinputstream.readObject());
            int l = objectinputstream.readInt();
            for (int k = 0; k < l; k++)
            {
                collection.add(objectinputstream.readObject());
            }

        }

    }

    static void populateMultiset(Multiset multiset, ObjectInputStream objectinputstream)
        throws IOException, ClassNotFoundException
    {
        populateMultiset(multiset, objectinputstream, objectinputstream.readInt());
    }

    static void populateMultiset(Multiset multiset, ObjectInputStream objectinputstream, int i)
        throws IOException, ClassNotFoundException
    {
        for (int j = 0; j < i; j++)
        {
            multiset.add(objectinputstream.readObject(), objectinputstream.readInt());
        }

    }

    static int readCount(ObjectInputStream objectinputstream)
        throws IOException
    {
        return objectinputstream.readInt();
    }

    static void writeMap(Map map, ObjectOutputStream objectoutputstream)
        throws IOException
    {
        objectoutputstream.writeInt(map.size());
        java.util.Map.Entry entry;
        for (map = map.entrySet().iterator(); map.hasNext(); objectoutputstream.writeObject(entry.getValue()))
        {
            entry = (java.util.Map.Entry)map.next();
            objectoutputstream.writeObject(entry.getKey());
        }

    }

    static void writeMultimap(Multimap multimap, ObjectOutputStream objectoutputstream)
        throws IOException
    {
        objectoutputstream.writeInt(multimap.asMap().size());
        for (multimap = multimap.asMap().entrySet().iterator(); multimap.hasNext();)
        {
            Object obj = (java.util.Map.Entry)multimap.next();
            objectoutputstream.writeObject(((java.util.Map.Entry) (obj)).getKey());
            objectoutputstream.writeInt(((Collection)((java.util.Map.Entry) (obj)).getValue()).size());
            obj = ((Collection)((java.util.Map.Entry) (obj)).getValue()).iterator();
            while (((Iterator) (obj)).hasNext()) 
            {
                objectoutputstream.writeObject(((Iterator) (obj)).next());
            }
        }

    }

    static void writeMultiset(Multiset multiset, ObjectOutputStream objectoutputstream)
        throws IOException
    {
        objectoutputstream.writeInt(multiset.entrySet().size());
        Multiset.Entry entry;
        for (multiset = multiset.entrySet().iterator(); multiset.hasNext(); objectoutputstream.writeInt(entry.getCount()))
        {
            entry = (Multiset.Entry)multiset.next();
            objectoutputstream.writeObject(entry.getElement());
        }

    }
}
