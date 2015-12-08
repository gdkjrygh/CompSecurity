// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.jcd.cls.attribute;

import com.vladium.jcd.compiler.IClassFormatOutput;

// Referenced classes of package com.vladium.jcd.cls.attribute:
//            Exception_info

public interface IExceptionHandlerTable
    extends Cloneable, IClassFormatOutput
{

    public abstract int add(Exception_info exception_info);

    public abstract Object clone();

    public abstract Exception_info get(int i);

    public abstract long length();

    public abstract Exception_info set(int i, Exception_info exception_info);

    public abstract int size();
}
