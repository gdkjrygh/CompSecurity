// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.emma.report;

import com.vladium.emma.data.ICoverageData;
import com.vladium.emma.data.IMetaData;

// Referenced classes of package com.vladium.emma.report:
//            IReportDataView, ReportDataModel

public interface IReportDataModel
{
    public static abstract class Factory
    {

        public static IReportDataModel create(IMetaData imetadata, ICoverageData icoveragedata)
        {
            return new ReportDataModel(imetadata, icoveragedata);
        }

        public Factory()
        {
        }
    }


    public abstract IReportDataView getView(int i);
}
