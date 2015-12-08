// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.emma.data;

import java.io.Serializable;

// Referenced classes of package com.vladium.emma.data:
//            ISessionData, ICoverageData, IMetaData

public final class SessionData
    implements ISessionData, Serializable
{

    private final ICoverageData m_cdata;
    private final IMetaData m_mdata;

    public SessionData(IMetaData imetadata, ICoverageData icoveragedata)
    {
        if (imetadata == null)
        {
            throw new IllegalArgumentException("null input: mdata");
        }
        if (icoveragedata == null)
        {
            throw new IllegalArgumentException("null input: cdata");
        } else
        {
            m_mdata = imetadata;
            m_cdata = icoveragedata;
            return;
        }
    }

    public ICoverageData getCoverageData()
    {
        return m_cdata;
    }

    public IMetaData getMetaData()
    {
        return m_mdata;
    }
}
