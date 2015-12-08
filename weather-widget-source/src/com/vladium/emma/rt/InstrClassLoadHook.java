// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.emma.rt;

import com.vladium.emma.data.IMetaData;
import com.vladium.emma.filter.IInclExclFilter;
import com.vladium.emma.instr.InstrVisitor;
import com.vladium.jcd.compiler.ClassWriter;
import com.vladium.jcd.parser.ClassDefParser;
import com.vladium.util.ByteArrayOStream;
import com.vladium.util.Descriptors;
import java.io.IOException;

// Referenced classes of package com.vladium.emma.rt:
//            IClassLoadHook

public final class InstrClassLoadHook
    implements IClassLoadHook
{

    private final InstrVisitor m_classDefProcessor;
    private final IInclExclFilter m_filter;
    private final com.vladium.emma.instr.InstrVisitor.InstrResult m_instrResult;
    private final IMetaData m_metadata;

    public InstrClassLoadHook(IInclExclFilter iinclexclfilter, IMetaData imetadata)
    {
        if (imetadata == null)
        {
            throw new IllegalArgumentException("null input: mdata");
        } else
        {
            m_filter = iinclexclfilter;
            m_metadata = imetadata;
            m_classDefProcessor = new InstrVisitor(imetadata.getOptions());
            m_instrResult = new com.vladium.emma.instr.InstrVisitor.InstrResult();
            return;
        }
    }

    public boolean processClassDef(String s, byte abyte0[], int i, ByteArrayOStream bytearrayostream)
        throws IOException
    {
        Object obj = m_filter;
        if (obj != null && !((IInclExclFilter) (obj)).included(s))
        {
            break MISSING_BLOCK_LABEL_172;
        }
        abyte0 = ClassDefParser.parseClass(abyte0, i);
        obj = Descriptors.javaNameToVMName(s);
        boolean flag;
        synchronized (m_metadata.lock())
        {
            flag = m_metadata.hasDescriptor(((String) (obj)));
        }
        obj = m_classDefProcessor;
        boolean flag1;
        if (!flag)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ((InstrVisitor) (obj)).process(abyte0, false, true, flag, m_instrResult);
        flag = m_instrResult.m_instrumented;
        flag1 = flag;
        if (m_instrResult.m_descriptor == null)
        {
            break MISSING_BLOCK_LABEL_143;
        }
        s;
        JVM INSTR monitorenter ;
        if (!m_metadata.add(m_instrResult.m_descriptor, false))
        {
            flag = false;
        }
        s;
        JVM INSTR monitorexit ;
        flag1 = flag;
        if (flag1)
        {
            ClassWriter.writeClassTable(abyte0, bytearrayostream);
            return true;
        }
        break MISSING_BLOCK_LABEL_172;
        abyte0;
        s;
        JVM INSTR monitorexit ;
        throw abyte0;
        abyte0;
        s;
        JVM INSTR monitorexit ;
        throw abyte0;
        return false;
    }
}
