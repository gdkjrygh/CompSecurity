// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.util.exception;

import java.io.PrintStream;
import java.io.PrintWriter;

interface IThrowableWrapper
{

    public abstract void __printStackTrace(PrintStream printstream);

    public abstract void __printStackTrace(PrintWriter printwriter);

    public abstract Throwable getCause();
}
