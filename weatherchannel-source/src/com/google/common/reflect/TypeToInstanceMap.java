// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.reflect;

import java.util.Map;

// Referenced classes of package com.google.common.reflect:
//            TypeToken

public interface TypeToInstanceMap
    extends Map
{

    public abstract Object getInstance(TypeToken typetoken);

    public abstract Object getInstance(Class class1);

    public abstract Object putInstance(TypeToken typetoken, Object obj);

    public abstract Object putInstance(Class class1, Object obj);
}
