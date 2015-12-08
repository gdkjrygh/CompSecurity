// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.emma.report;


// Referenced classes of package com.vladium.emma.report:
//            SrcFileItem

public final class m_coverageRatio
{

    public static final int LINE_COVERAGE_COMPLETE = 2;
    public static final int LINE_COVERAGE_PARTIAL = 1;
    public static final int LINE_COVERAGE_ZERO = 0;
    public final int m_coverageRatio[][];
    public final int m_coverageStatus;
    final SrcFileItem this$0;

    (int i, int ai[][])
    {
        this$0 = SrcFileItem.this;
        super();
        m_coverageStatus = i;
        m_coverageRatio = ai;
    }
}
