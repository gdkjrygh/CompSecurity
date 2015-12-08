// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.emma.report;

import com.vladium.emma.EMMARuntimeException;
import com.vladium.emma.data.ClassDescriptor;
import com.vladium.emma.data.ICoverageData;
import com.vladium.emma.data.IMetaData;
import com.vladium.emma.report.html.ReportGenerator;
import com.vladium.logging.Logger;
import com.vladium.util.Descriptors;
import com.vladium.util.IProperties;
import com.vladium.util.IntIntMap;
import com.vladium.util.IntVector;
import com.vladium.util.ObjectIntMap;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

// Referenced classes of package com.vladium.emma.report:
//            AbstractItemVisitor, IReportGenerator, ReportProperties, ItemComparator, 
//            IItemMetadata, IReportDataModel, SourcePathCache, IReportDataView

public abstract class AbstractReportGenerator extends AbstractItemVisitor
    implements IReportGenerator
{

    private static final int MAX_DEBUG_INFO_WARNING_COUNT = 3;
    protected SourcePathCache m_cache;
    protected boolean m_hasLineNumberInfo;
    protected boolean m_hasSrcFileInfo;
    protected Logger m_log;
    protected int m_metrics[];
    protected ReportProperties.ParsedProperties m_settings;
    protected boolean m_srcView;
    protected ItemComparator m_typeSortComparators[];
    protected boolean m_verbose;
    protected IReportDataView m_view;

    public AbstractReportGenerator()
    {
    }

    public static IReportGenerator create(String s)
    {
        if (s == null || s.length() == 0)
        {
            throw new IllegalArgumentException("null/empty input: type");
        }
        if ("html".equals(s))
        {
            return new ReportGenerator();
        }
        if ("lcov".equals(s))
        {
            return new com.vladium.emma.report.lcov.ReportGenerator();
        }
        if ("txt".equals(s))
        {
            return new com.vladium.emma.report.txt.ReportGenerator();
        }
        if ("xml".equals(s))
        {
            return new com.vladium.emma.report.xml.ReportGenerator();
        } else
        {
            throw new EMMARuntimeException((new StringBuilder()).append("no report generator class found for type [").append(s).append("]").toString());
        }
    }

    public void cleanup()
    {
        reset();
    }

    public void initialize(IMetaData imetadata, ICoverageData icoveragedata, SourcePathCache sourcepathcache, IProperties iproperties)
        throws EMMARuntimeException
    {
        m_log = Logger.getLogger();
        m_verbose = m_log.atVERBOSE();
        m_settings = ReportProperties.parseProperties(iproperties, getType());
        m_cache = sourcepathcache;
        m_hasSrcFileInfo = imetadata.hasSrcFileData();
        m_hasLineNumberInfo = imetadata.hasLineNumberData();
        int l = 0;
        boolean flag3 = false;
        boolean flag = l;
        if (!imetadata.hasSrcFileData())
        {
            flag = l;
            if (m_settings.getViewType() == 1)
            {
                flag = true;
                m_log.warning("not all instrumented classes were compiled with source file");
                m_log.warning("debug data: no sources will be embedded in the report.");
                m_settings.setViewType(0);
            }
        }
        l = ((flag3) ? 1 : 0);
        boolean flag2 = flag;
        if (!m_hasLineNumberInfo)
        {
            sourcepathcache = m_settings.getColumnOrder();
            iproperties = new IntVector();
            boolean flag1 = false;
            l = 0;
            while (l < sourcepathcache.length) 
            {
                if (sourcepathcache[l] == 4)
                {
                    flag1 = true;
                } else
                {
                    iproperties.add(sourcepathcache[l]);
                }
                l++;
            }
            l = ((flag3) ? 1 : 0);
            flag2 = flag;
            if (flag1)
            {
                flag2 = true;
                int ai[];
                Iterator iterator;
                ClassDescriptor classdescriptor;
                String s;
                if (iproperties.size() == 0)
                {
                    m_log.warning((new StringBuilder()).append("line coverage requested in a report of type [").append(getType()).append("] but").toString());
                    m_log.warning("not all instrumented classes were compiled with line number");
                    m_log.warning("debug data: since this was the only requested column, no report will be generated.");
                    l = 1;
                } else
                {
                    m_log.warning((new StringBuilder()).append("line coverage requested in a report of type [").append(getType()).append("] but").toString());
                    m_log.warning("not all instrumented classes were compiled with line number");
                    m_log.warning("debug data: this column will be removed from the report.");
                    m_settings.setColumnOrder(iproperties.values());
                    sourcepathcache = m_settings.getSortOrder();
                    iproperties = new IntVector();
                    for (i = 0; i < sourcepathcache.length; i += 2)
                    {
                        if (Math.abs(sourcepathcache[i]) != 4)
                        {
                            iproperties.add(sourcepathcache[i]);
                            iproperties.add(sourcepathcache[i + 1]);
                        }
                    }

                    m_settings.setSortOrder(iproperties.values());
                    l = ((flag3) ? 1 : 0);
                }
            }
        }
        if (flag2 && m_log.atINFO())
        {
            sourcepathcache = new TreeSet();
            iproperties = new ObjectIntMap();
            ai = new int[1];
            iterator = imetadata.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                classdescriptor = (ClassDescriptor)iterator.next();
                if (!classdescriptor.hasCompleteLineNumberInfo() || !classdescriptor.hasSrcFileInfo())
                {
                    s = classdescriptor.getPackageVMName();
                    int i;
                    if (iproperties.get(s, ai))
                    {
                        i = ai[0];
                    } else
                    {
                        i = 0;
                    }
                    if (i < 3)
                    {
                        sourcepathcache.add(Descriptors.vmNameToJavaName(classdescriptor.getClassVMName()));
                        iproperties.put(s, i + 1);
                    }
                }
            } while (true);
            m_log.info("showing up to 3 classes without full debug info per package:");
            for (sourcepathcache = sourcepathcache.iterator(); sourcepathcache.hasNext(); m_log.info((new StringBuilder()).append("  ").append(sourcepathcache.next()).toString())) { }
        }
        if (l != 0)
        {
            throw new EMMARuntimeException("BAILED OUT");
        }
        sourcepathcache = IItemMetadata.Factory.getAllTypes();
        m_typeSortComparators = new ItemComparator[sourcepathcache.length];
        for (int j = 0; j < sourcepathcache.length; j++)
        {
            iproperties = new IntVector();
            long l1 = sourcepathcache[j].getAttributeIDs();
            for (int i1 = 0; i1 < m_settings.getSortOrder().length; i1 += 2)
            {
                int j1 = m_settings.getSortOrder()[i1];
                if (((long)(1 << j1) & l1) != 0L)
                {
                    iproperties.add(j1);
                    iproperties.add(m_settings.getSortOrder()[i1 + 1]);
                }
            }

            m_typeSortComparators[j] = ItemComparator.Factory.create(iproperties.values(), m_settings.getUnitsType());
        }

        m_metrics = new int[sourcepathcache.length];
        sourcepathcache = m_settings.getMetrics();
        for (int k = 0; k < m_metrics.length; k++)
        {
            m_metrics[k] = -1;
            sourcepathcache.get(k, m_metrics, k);
        }

        m_view = IReportDataModel.Factory.create(imetadata, icoveragedata).getView(m_settings.getViewType());
        boolean flag4;
        if (m_settings.getViewType() == 1)
        {
            flag4 = true;
        } else
        {
            flag4 = false;
        }
        m_srcView = flag4;
    }

    protected void reset()
    {
        m_settings = null;
        m_cache = null;
        m_view = null;
        m_srcView = false;
        m_typeSortComparators = null;
        m_metrics = null;
        m_log = null;
    }
}
