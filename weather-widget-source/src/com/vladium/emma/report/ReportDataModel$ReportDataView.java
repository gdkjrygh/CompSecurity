// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.emma.report;


// Referenced classes of package com.vladium.emma.report:
//            IReportDataView, ReportDataModel, IItem

private static final class m_root
    implements IReportDataView
{

    private final IItem m_root;

    public IItem getRoot()
    {
        return m_root;
    }

    (IItem iitem)
    {
        m_root = iitem;
    }
}
