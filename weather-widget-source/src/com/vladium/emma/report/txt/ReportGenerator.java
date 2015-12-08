// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.emma.report.txt;

import com.vladium.emma.EMMAProperties;
import com.vladium.emma.EMMARuntimeException;
import com.vladium.emma.IAppErrorCodes;
import com.vladium.emma.data.ICoverageData;
import com.vladium.emma.data.IMetaData;
import com.vladium.emma.report.AbstractReportGenerator;
import com.vladium.emma.report.AllItem;
import com.vladium.emma.report.ClassItem;
import com.vladium.emma.report.IItem;
import com.vladium.emma.report.IItemAttribute;
import com.vladium.emma.report.IItemMetadata;
import com.vladium.emma.report.IReportDataView;
import com.vladium.emma.report.MethodItem;
import com.vladium.emma.report.PackageItem;
import com.vladium.emma.report.SourcePathCache;
import com.vladium.emma.report.SrcFileItem;
import com.vladium.logging.Logger;
import com.vladium.util.Files;
import com.vladium.util.IProperties;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;

public final class ReportGenerator extends AbstractReportGenerator
    implements IAppErrorCodes
{

    private static final int IO_BUF_SIZE = 32768;
    private static final String LINE = "-------------------------------------------------------------------------------";
    private static final String TYPE = "txt";
    private BufferedWriter m_out;
    private LinkedList m_queue;
    private char m_separator;

    public ReportGenerator()
    {
        m_separator = '\t';
    }

    private void addHeaderRow(IItem iitem, int ai[])
    {
        StringBuffer stringbuffer = new StringBuffer();
        int i = 0;
        for (int j = ai.length; i < j; i++)
        {
            IItemAttribute iitemattribute = iitem.getAttribute(ai[i], m_settings.getUnitsType());
            if (iitemattribute != null)
            {
                stringbuffer.append('[');
                stringbuffer.append(iitemattribute.getName());
                stringbuffer.append(']');
            }
            if (i != j - 1)
            {
                stringbuffer.append(m_separator);
            }
        }

        row(stringbuffer);
    }

    private void addItemRow(IItem iitem, int ai[])
    {
        StringBuffer stringbuffer = new StringBuffer(11);
        int i = 0;
        int k = ai.length;
        while (i < k) 
        {
            int j = ai[i];
            IItemAttribute iitemattribute = iitem.getAttribute(j, m_settings.getUnitsType());
            if (iitemattribute != null)
            {
                boolean flag;
                if (m_metrics[j] > 0 && !iitemattribute.passes(iitem, m_metrics[j]))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (flag)
                {
                    iitemattribute.format(iitem, stringbuffer);
                    stringbuffer.append('!');
                } else
                {
                    iitemattribute.format(iitem, stringbuffer);
                }
            }
            if (i != k - 1)
            {
                stringbuffer.append(m_separator);
            }
            i++;
        }
        row(stringbuffer);
    }

    private void addTitleRow(String s, int i, int j)
    {
        for (int k = 0; k < i; k++)
        {
            eol();
        }

        row((new StringBuffer(s)).append(":"));
        for (i = 0; i < j; i++)
        {
            eol();
        }

    }

    private void close()
    {
        if (m_out == null)
        {
            break MISSING_BLOCK_LABEL_26;
        }
        m_out.flush();
        m_out.close();
        m_out = null;
        return;
        Object obj;
        obj;
        throw new EMMARuntimeException("REPORT_IO_FAILURE", ((Throwable) (obj)));
        obj;
        m_out = null;
        throw obj;
    }

    private void eol()
    {
        try
        {
            m_out.newLine();
            return;
        }
        catch (IOException ioexception)
        {
            throw new EMMARuntimeException("REPORT_IO_FAILURE", ioexception);
        }
    }

    private void line()
    {
        try
        {
            m_out.write("-------------------------------------------------------------------------------");
            m_out.newLine();
            return;
        }
        catch (IOException ioexception)
        {
            throw new EMMARuntimeException("REPORT_IO_FAILURE", ioexception);
        }
    }

    private void openOutFile(File file, String s, boolean flag)
    {
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_21;
        }
        File file1;
        try
        {
            file1 = file.getParentFile();
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            throw new EMMARuntimeException(file);
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            throw new EMMARuntimeException(file);
        }
        if (file1 == null)
        {
            break MISSING_BLOCK_LABEL_21;
        }
        file1.mkdirs();
        m_out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), s), 32768);
        return;
    }

    private void row(String s)
    {
        try
        {
            m_out.write(s);
            m_out.newLine();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new EMMARuntimeException("REPORT_IO_FAILURE", s);
        }
    }

    private void row(StringBuffer stringbuffer)
    {
        try
        {
            m_out.write(stringbuffer.toString());
            m_out.newLine();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (StringBuffer stringbuffer)
        {
            throw new EMMARuntimeException("REPORT_IO_FAILURE", stringbuffer);
        }
    }

    public void cleanup()
    {
        m_queue = null;
        close();
        super.cleanup();
    }

    public String getType()
    {
        return "txt";
    }

    public void process(IMetaData imetadata, ICoverageData icoveragedata, SourcePathCache sourcepathcache, IProperties iproperties)
        throws EMMARuntimeException
    {
        initialize(imetadata, icoveragedata, sourcepathcache, iproperties);
        long l = 0L;
        boolean flag = m_log.atTRACE1();
        if (flag)
        {
            l = System.currentTimeMillis();
        }
        m_queue = new LinkedList();
        m_queue.add(m_view.getRoot());
        for (; !m_queue.isEmpty(); ((IItem)m_queue.removeFirst()).accept(this, null)) { }
        line();
        close();
        if (flag)
        {
            long l1 = System.currentTimeMillis();
            m_log.trace1("process", (new StringBuilder()).append("[").append(getType()).append("] report generated in ").append(l1 - l).append(" ms").toString());
        }
    }

    public Object visit(AllItem allitem, Object obj)
    {
        File file1 = m_settings.getOutFile();
        File file = file1;
        if (file1 == null)
        {
            file = new File("coverage.txt");
            m_settings.setOutFile(file);
        }
        file = Files.newFile(m_settings.getOutDir(), file);
        m_log.info((new StringBuilder()).append("writing [").append(getType()).append("] report to [").append(file.getAbsolutePath()).append("] ...").toString());
        openOutFile(file, m_settings.getOutEncoding(), true);
        int ai[];
        boolean flag;
        boolean flag1;
        try
        {
            StringBuffer stringbuffer = new StringBuffer(101);
            stringbuffer.append("[");
            stringbuffer.append("EMMA");
            stringbuffer.append(" v");
            stringbuffer.append("0.0.0 (unsupported private build)");
            stringbuffer.append(" report, generated ");
            stringbuffer.append(new Date(EMMAProperties.getTimeStamp()));
            stringbuffer.append("]");
            m_out.write(stringbuffer.toString());
            m_out.newLine();
            m_out.flush();
        }
        // Misplaced declaration of an exception variable
        catch (AllItem allitem)
        {
            throw new EMMARuntimeException("REPORT_IO_FAILURE", allitem);
        }
        ai = m_settings.getColumnOrder();
        line();
        addTitleRow("OVERALL COVERAGE SUMMARY", 0, 1);
        addHeaderRow(allitem, ai);
        addItemRow(allitem, ai);
        addTitleRow("OVERALL STATS SUMMARY", 1, 1);
        row((new StringBuilder()).append("total packages:").append(m_separator).append(allitem.getChildCount()).toString());
        row((new StringBuilder()).append("total classes:").append(m_separator).append(allitem.getAggregate(11)).toString());
        row((new StringBuilder()).append("total methods:").append(m_separator).append(allitem.getAggregate(10)).toString());
        if (m_srcView && m_hasSrcFileInfo)
        {
            row((new StringBuilder()).append("total executable files:").append(m_separator).append(allitem.getAggregate(12)).toString());
            if (m_hasLineNumberInfo)
            {
                row((new StringBuilder()).append("total executable lines:").append(m_separator).append(allitem.getAggregate(7)).toString());
            }
        }
        if (m_settings.getDepth() > allitem.getMetadata().getTypeID())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        addTitleRow("COVERAGE BREAKDOWN BY PACKAGE", 1, 1);
        flag1 = false;
        allitem = allitem.getChildren(m_typeSortComparators[PackageItem.getTypeMetadata().getTypeID()]);
        do
        {
            if (!allitem.hasNext())
            {
                break;
            }
            IItem iitem = (IItem)allitem.next();
            boolean flag2 = flag1;
            if (!flag1)
            {
                addHeaderRow(iitem, ai);
                flag2 = true;
            }
            addItemRow(iitem, ai);
            flag1 = flag2;
            if (flag)
            {
                m_queue.addLast(iitem);
                flag1 = flag2;
            }
        } while (true);
        return obj;
    }

    public Object visit(ClassItem classitem, Object obj)
    {
        int ai[] = m_settings.getColumnOrder();
        line();
        addTitleRow("COVERAGE SUMMARY FOR CLASS [".concat(classitem.getName()).concat("]"), 0, 1);
        addHeaderRow(classitem, ai);
        addItemRow(classitem, ai);
        addTitleRow("COVERAGE BREAKDOWN BY METHOD", 1, 1);
        for (classitem = classitem.getChildren(m_typeSortComparators[MethodItem.getTypeMetadata().getTypeID()]); classitem.hasNext(); addItemRow((IItem)classitem.next(), ai)) { }
        return obj;
    }

    public Object visit(PackageItem packageitem, Object obj)
    {
        boolean flag = false;
        if (m_verbose)
        {
            m_log.verbose((new StringBuilder()).append("  report: processing package [").append(packageitem.getName()).append("] ...").toString());
        }
        int ai[] = m_settings.getColumnOrder();
        line();
        addTitleRow("COVERAGE SUMMARY FOR PACKAGE [".concat(packageitem.getName()).concat("]"), 0, 1);
        addHeaderRow(packageitem, ai);
        addItemRow(packageitem, ai);
        if (m_settings.getDepth() > packageitem.getMetadata().getTypeID())
        {
            flag = true;
        }
        Object obj1;
        int i;
        boolean flag1;
        if (m_srcView)
        {
            obj1 = "COVERAGE BREAKDOWN BY SOURCE FILE";
        } else
        {
            obj1 = "COVERAGE BREAKDOWN BY CLASS";
        }
        addTitleRow(((String) (obj1)), 1, 1);
        flag1 = false;
        obj1 = m_typeSortComparators;
        if (m_srcView)
        {
            i = SrcFileItem.getTypeMetadata().getTypeID();
        } else
        {
            i = ClassItem.getTypeMetadata().getTypeID();
        }
        packageitem = packageitem.getChildren(obj1[i]);
        i = ((flag1) ? 1 : 0);
        do
        {
            if (!packageitem.hasNext())
            {
                break;
            }
            obj1 = (IItem)packageitem.next();
            boolean flag2 = i;
            if (i == 0)
            {
                addHeaderRow(((IItem) (obj1)), ai);
                flag2 = true;
            }
            addItemRow(((IItem) (obj1)), ai);
            i = ((flag2) ? 1 : 0);
            if (flag)
            {
                m_queue.addLast(obj1);
                i = ((flag2) ? 1 : 0);
            }
        } while (true);
        return obj;
    }

    public Object visit(SrcFileItem srcfileitem, Object obj)
    {
        int ai[] = m_settings.getColumnOrder();
        line();
        addTitleRow("COVERAGE SUMMARY FOR SOURCE FILE [".concat(srcfileitem.getName()).concat("]"), 0, 1);
        addHeaderRow(srcfileitem, ai);
        addItemRow(srcfileitem, ai);
        addTitleRow("COVERAGE BREAKDOWN BY CLASS AND METHOD", 1, 1);
        boolean flag = false;
        srcfileitem = srcfileitem.getChildren(m_typeSortComparators[ClassItem.getTypeMetadata().getTypeID()]);
        do
        {
label0:
            {
                if (!srcfileitem.hasNext())
                {
                    break label0;
                }
                Object obj1 = (IItem)srcfileitem.next();
                boolean flag1 = flag;
                if (!flag)
                {
                    addHeaderRow(((IItem) (obj1)), ai);
                    flag1 = true;
                }
                addTitleRow((new StringBuilder()).append("class [").append(((IItem) (obj1)).getName()).append("] methods").toString(), 0, 0);
                obj1 = ((IItem) (obj1)).getChildren(m_typeSortComparators[MethodItem.getTypeMetadata().getTypeID()]);
                do
                {
                    flag = flag1;
                    if (!((Iterator) (obj1)).hasNext())
                    {
                        break;
                    }
                    addItemRow((MethodItem)((Iterator) (obj1)).next(), ai);
                } while (true);
            }
        } while (true);
        return obj;
    }
}
