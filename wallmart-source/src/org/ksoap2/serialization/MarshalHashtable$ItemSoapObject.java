// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.ksoap2.serialization;

import java.util.Hashtable;

// Referenced classes of package org.ksoap2.serialization:
//            SoapObject, MarshalHashtable

class addProperty extends SoapObject
{

    Hashtable h;
    int resolvedIndex;
    final MarshalHashtable this$0;

    public void setProperty(int i, Object obj)
    {
        if (resolvedIndex == -1)
        {
            super.setProperty(i, obj);
            resolvedIndex = i;
            return;
        }
        Object obj1;
        if (resolvedIndex == 0)
        {
            obj1 = getProperty(0);
        } else
        {
            obj1 = getProperty(1);
        }
        if (i == 0)
        {
            h.put(obj, obj1);
            return;
        } else
        {
            h.put(obj1, obj);
            return;
        }
    }

    (Hashtable hashtable)
    {
        this$0 = MarshalHashtable.this;
        super(null, null);
        resolvedIndex = -1;
        h = hashtable;
        addProperty("key", null);
        addProperty("value", null);
    }
}
