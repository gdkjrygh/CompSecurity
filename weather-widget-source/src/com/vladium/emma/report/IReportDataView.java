// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.emma.report;


// Referenced classes of package com.vladium.emma.report:
//            IItem

public interface IReportDataView
{

    public static final int HIER_CLS_VIEW = 0;
    public static final int HIER_SRC_VIEW = 1;

    public abstract IItem getRoot();
}
