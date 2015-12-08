// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.emma.data;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.Serializable;

public final class CoverageOptions
    implements Serializable
{

    private final boolean m_doSUIDCompensation;
    private final boolean m_excludeBridgeMethods;
    private final boolean m_excludeSyntheticMethods;

    CoverageOptions(boolean flag, boolean flag1, boolean flag2)
    {
        m_excludeSyntheticMethods = flag;
        m_excludeBridgeMethods = flag1;
        m_doSUIDCompensation = flag2;
    }

    static CoverageOptions readExternal(DataInput datainput)
        throws IOException
    {
        return new CoverageOptions(datainput.readBoolean(), datainput.readBoolean(), datainput.readBoolean());
    }

    static void writeExternal(CoverageOptions coverageoptions, DataOutput dataoutput)
        throws IOException
    {
        dataoutput.writeBoolean(coverageoptions.m_excludeSyntheticMethods);
        dataoutput.writeBoolean(coverageoptions.m_excludeBridgeMethods);
        dataoutput.writeBoolean(coverageoptions.m_doSUIDCompensation);
    }

    public boolean doSUIDCompensation()
    {
        return m_doSUIDCompensation;
    }

    public boolean excludeBridgeMethods()
    {
        return m_excludeBridgeMethods;
    }

    public boolean excludeSyntheticMethods()
    {
        return m_excludeSyntheticMethods;
    }
}
