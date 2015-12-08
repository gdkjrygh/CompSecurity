// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.emma.report;

import com.vladium.util.IntIntMap;
import java.io.File;

// Referenced classes of package com.vladium.emma.report:
//            ReportProperties

public static final class 
{

    private int m_columnOrder[];
    private int m_depth;
    private boolean m_hideClasses;
    private IntIntMap m_metrics;
    private File m_outDir;
    private String m_outEncoding;
    private File m_outFile;
    private int m_sortOrder[];
    private int m_unitsType;
    private int m_viewType;

    public int[] getColumnOrder()
    {
        return m_columnOrder;
    }

    public int getDepth()
    {
        return m_depth;
    }

    public boolean getHideClasses()
    {
        return m_hideClasses;
    }

    public IntIntMap getMetrics()
    {
        return m_metrics;
    }

    public File getOutDir()
    {
        return m_outDir;
    }

    public String getOutEncoding()
    {
        return m_outEncoding;
    }

    public File getOutFile()
    {
        return m_outFile;
    }

    public int[] getSortOrder()
    {
        return m_sortOrder;
    }

    public int getUnitsType()
    {
        return m_unitsType;
    }

    public int getViewType()
    {
        return m_viewType;
    }

    public void setColumnOrder(int ai[])
    {
        m_columnOrder = ai;
    }

    public void setDepth(int i)
    {
        m_depth = i;
    }

    public void setHideClasses(boolean flag)
    {
        m_hideClasses = flag;
    }

    public void setMetrics(IntIntMap intintmap)
    {
        m_metrics = intintmap;
    }

    public void setOutDir(File file)
    {
        m_outDir = file;
    }

    public void setOutEncoding(String s)
    {
        m_outEncoding = s;
    }

    public void setOutFile(File file)
    {
        m_outFile = file;
    }

    public void setSortOrder(int ai[])
    {
        m_sortOrder = ai;
    }

    public void setUnitsType(int i)
    {
        m_unitsType = i;
    }

    public void setViewType(int i)
    {
        m_viewType = i;
    }

    void validate()
        throws IllegalArgumentException
    {
    }

    public ()
    {
    }
}
