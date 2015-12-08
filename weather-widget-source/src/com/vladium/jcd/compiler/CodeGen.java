// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.jcd.compiler;

import com.vladium.jcd.cls.ClassDef;
import com.vladium.jcd.cls.IConstantCollection;
import com.vladium.jcd.cls.constant.CONSTANT_Integer_info;
import com.vladium.jcd.opcodes.IOpcodes;
import com.vladium.util.ByteArrayOStream;

public abstract class CodeGen
    implements IOpcodes
{

    private CodeGen()
    {
    }

    public static void load_local_object_var(ByteArrayOStream bytearrayostream, int i)
    {
        if (i <= 3)
        {
            bytearrayostream.write(i + 42);
            return;
        }
        if (i <= 255)
        {
            bytearrayostream.write2(25, i);
            return;
        } else
        {
            bytearrayostream.write4(196, 25, i >>> 8, i);
            return;
        }
    }

    public static void push_constant_index(ByteArrayOStream bytearrayostream, int i)
    {
        if (i <= 255)
        {
            bytearrayostream.write2(18, i);
            return;
        } else
        {
            bytearrayostream.write3(19, i >>> 8, i);
            return;
        }
    }

    public static void push_int_value(ByteArrayOStream bytearrayostream, ClassDef classdef, int i)
    {
        if (-1 <= i && i <= 5)
        {
            bytearrayostream.write(i + 3);
            return;
        }
        if (-128 <= i && i <= 127)
        {
            bytearrayostream.write2(16, i);
            return;
        }
        if (-32768 <= i && i <= 32767)
        {
            bytearrayostream.write3(17, i >>> 8, i);
            return;
        }
        i = classdef.getConstants().add(new CONSTANT_Integer_info(i));
        if (i <= 255)
        {
            bytearrayostream.write2(18, i);
            return;
        } else
        {
            bytearrayostream.write3(19, i >>> 8, i);
            return;
        }
    }

    public static void store_local_object_var(ByteArrayOStream bytearrayostream, int i)
    {
        if (i <= 3)
        {
            bytearrayostream.write(i + 75);
            return;
        }
        if (i <= 255)
        {
            bytearrayostream.write2(58, i);
            return;
        } else
        {
            bytearrayostream.write4(196, 58, i >>> 8, i);
            return;
        }
    }
}
