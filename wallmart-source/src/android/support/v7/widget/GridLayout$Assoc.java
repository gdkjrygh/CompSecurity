// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.util.Pair;
import java.lang.reflect.Array;
import java.util.ArrayList;

// Referenced classes of package android.support.v7.widget:
//            GridLayout

static final class valueType extends ArrayList
{

    private final Class keyType;
    private final Class valueType;

    public static valueType of(Class class1, Class class2)
    {
        return new <init>(class1, class2);
    }

    public Map pack()
    {
        int j = size();
        Object aobj[] = (Object[])(Object[])Array.newInstance(keyType, j);
        Object aobj1[] = (Object[])(Object[])Array.newInstance(valueType, j);
        for (int i = 0; i < j; i++)
        {
            aobj[i] = ((Pair)get(i)).first;
            aobj1[i] = ((Pair)get(i)).second;
        }

        return new Map(aobj, aobj1, null);
    }

    public void put(Object obj, Object obj1)
    {
        add(Pair.create(obj, obj1));
    }

    private Map(Class class1, Class class2)
    {
        keyType = class1;
        valueType = class2;
    }
}
