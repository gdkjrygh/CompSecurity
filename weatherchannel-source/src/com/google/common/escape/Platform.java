// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.escape;


final class Platform
{

    private static final ThreadLocal DEST_TL = new ThreadLocal() {

        protected volatile Object initialValue()
        {
            return initialValue();
        }

        protected char[] initialValue()
        {
            return new char[1024];
        }

    };

    private Platform()
    {
    }

    static char[] charBufferFromThreadLocal()
    {
        return (char[])DEST_TL.get();
    }

}
