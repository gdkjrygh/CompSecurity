// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.jcd.compiler;

import com.vladium.jcd.cls.ClassDef;
import com.vladium.jcd.lib.UDataOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public abstract class ClassWriter
{

    public ClassWriter()
    {
    }

    public static void writeClassTable(ClassDef classdef, OutputStream outputstream)
        throws IOException
    {
        classdef.writeInClassFormat(new UDataOutputStream(outputstream));
    }
}
