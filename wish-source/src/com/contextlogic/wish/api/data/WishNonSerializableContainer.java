// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.data;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashMap;

public class WishNonSerializableContainer
    implements Serializable
{

    private static final long serialVersionUID = 0x7fdadeec08692c4eL;
    private HashMap container;

    public WishNonSerializableContainer()
    {
        container = new HashMap();
    }

    private void readObject(ObjectInputStream objectinputstream)
    {
    }

    private void writeObject(ObjectOutputStream objectoutputstream)
    {
    }

    public Object getContainedObject(String s)
    {
        return container.get(s);
    }

    public void storeObject(String s, Object obj)
    {
        container.put(s, obj);
    }
}
