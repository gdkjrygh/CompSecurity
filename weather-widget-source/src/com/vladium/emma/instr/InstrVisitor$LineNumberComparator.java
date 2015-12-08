// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.emma.instr;

import com.vladium.jcd.cls.attribute.LineNumber_info;
import java.util.Comparator;

// Referenced classes of package com.vladium.emma.instr:
//            InstrVisitor

private static final class <init>
    implements Comparator
{

    public final int compare(Object obj, Object obj1)
    {
        return ((LineNumber_info)obj).m_start_pc - ((LineNumber_info)obj1).m_start_pc;
    }

    private ()
    {
    }

    ( )
    {
        this();
    }
}
