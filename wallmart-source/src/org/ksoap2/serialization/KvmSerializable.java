// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.ksoap2.serialization;

import java.util.Hashtable;

// Referenced classes of package org.ksoap2.serialization:
//            PropertyInfo

public interface KvmSerializable
{

    public abstract Object getProperty(int i);

    public abstract int getPropertyCount();

    public abstract void getPropertyInfo(int i, Hashtable hashtable, PropertyInfo propertyinfo);

    public abstract void setProperty(int i, Object obj);
}
