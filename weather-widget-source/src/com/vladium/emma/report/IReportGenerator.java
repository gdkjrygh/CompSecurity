// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.emma.report;

import com.vladium.emma.EMMARuntimeException;
import com.vladium.emma.data.ICoverageData;
import com.vladium.emma.data.IMetaData;
import com.vladium.util.IProperties;

// Referenced classes of package com.vladium.emma.report:
//            SourcePathCache

public interface IReportGenerator
{

    public abstract void cleanup();

    public abstract String getType();

    public abstract void process(IMetaData imetadata, ICoverageData icoveragedata, SourcePathCache sourcepathcache, IProperties iproperties)
        throws EMMARuntimeException;
}
