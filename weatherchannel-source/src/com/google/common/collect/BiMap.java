// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Map;
import java.util.Set;

public interface BiMap
    extends Map
{

    public abstract Object forcePut(Object obj, Object obj1);

    public abstract BiMap inverse();

    public abstract Object put(Object obj, Object obj1);

    public abstract void putAll(Map map);

    public abstract Set values();
}
