// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.jcd.cls;

import com.vladium.jcd.cls.constant.CONSTANT_info;

// Referenced classes of package com.vladium.jcd.cls:
//            IConstantCollection

public static interface 
{

    public abstract CONSTANT_info nextConstant();

    public abstract int nextIndex();

    public abstract CONSTANT_info set(CONSTANT_info constant_info);
}
