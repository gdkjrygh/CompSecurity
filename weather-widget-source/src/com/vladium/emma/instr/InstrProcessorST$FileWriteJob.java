// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.emma.instr;

import java.io.File;
import java.io.IOException;

// Referenced classes of package com.vladium.emma.instr:
//            InstrProcessorST

private static final class m_mkdirs extends m_mkdirs
{

    byte m_data[];
    final boolean m_mkdirs;
    final File m_outFile;

    protected void run()
        throws IOException
    {
        InstrProcessorST.writeFile(m_data, m_outFile, m_mkdirs);
        m_data = null;
    }

    (File file, byte abyte0[], boolean flag)
    {
        super(null);
        m_outFile = file;
        m_data = abyte0;
        m_mkdirs = flag;
    }
}
