// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.emma.instr;

import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

// Referenced classes of package com.vladium.emma.instr:
//            InstrProcessorST

private static final class m_isCopy extends m_isCopy
{

    byte m_data[];
    final ZipEntry m_entry;
    final boolean m_isCopy;
    final ZipOutputStream m_out;

    protected void run()
        throws IOException
    {
        InstrProcessorST.writeZipEntry(m_data, m_out, m_entry, m_isCopy);
        m_data = null;
    }

    (ZipOutputStream zipoutputstream, byte abyte0[], ZipEntry zipentry, boolean flag)
    {
        super(null);
        m_out = zipoutputstream;
        m_data = abyte0;
        m_entry = zipentry;
        m_isCopy = flag;
    }
}
