// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.kobjects.pim;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

// Referenced classes of package org.kobjects.pim:
//            PimField

public abstract class PimItem
{

    public static final int TYPE_STRING = 0;
    public static final int TYPE_STRING_ARRAY = 1;
    Hashtable fields;

    public PimItem()
    {
        fields = new Hashtable();
    }

    public PimItem(PimItem pimitem)
    {
        fields = new Hashtable();
        for (pimitem = pimitem.fields(); pimitem.hasMoreElements(); addField(new PimField((PimField)pimitem.nextElement()))) { }
    }

    public void addField(PimField pimfield)
    {
        Vector vector1 = (Vector)fields.get(pimfield.name);
        Vector vector = vector1;
        if (vector1 == null)
        {
            vector = new Vector();
            fields.put(pimfield.name, vector);
        }
        vector.addElement(pimfield);
    }

    public Enumeration fieldNames()
    {
        return fields.keys();
    }

    public Enumeration fields()
    {
        Vector vector = new Vector();
        for (Enumeration enumeration = fieldNames(); enumeration.hasMoreElements();)
        {
            Enumeration enumeration1 = fields((String)enumeration.nextElement());
            while (enumeration1.hasMoreElements()) 
            {
                vector.addElement(enumeration1.nextElement());
            }
        }

        return vector.elements();
    }

    public Enumeration fields(String s)
    {
        Vector vector = (Vector)fields.get(s);
        s = vector;
        if (vector == null)
        {
            s = new Vector();
        }
        return s.elements();
    }

    public abstract int getArraySize(String s);

    public PimField getField(String s, int i)
    {
        return (PimField)((Vector)fields.get(s)).elementAt(i);
    }

    public int getFieldCount(String s)
    {
        s = (Vector)fields.get(s);
        if (s == null)
        {
            return 0;
        } else
        {
            return s.size();
        }
    }

    public int getType(String s)
    {
        return getArraySize(s) != -1 ? 1 : 0;
    }

    public abstract String getType();

    public void removeField(String s, int i)
    {
        ((Vector)fields.get(s)).removeElementAt(i);
    }

    public String toString()
    {
        return (new StringBuilder()).append(getType()).append(":").append(fields.toString()).toString();
    }
}
