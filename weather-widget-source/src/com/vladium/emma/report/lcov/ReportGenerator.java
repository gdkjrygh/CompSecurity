// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.emma.report.lcov;

import com.vladium.emma.EMMARuntimeException;
import com.vladium.emma.IAppErrorCodes;
import com.vladium.emma.data.ICoverageData;
import com.vladium.emma.data.IMetaData;
import com.vladium.emma.report.AbstractReportGenerator;
import com.vladium.emma.report.AllItem;
import com.vladium.emma.report.ClassItem;
import com.vladium.emma.report.IItem;
import com.vladium.emma.report.IItemMetadata;
import com.vladium.emma.report.IReportDataView;
import com.vladium.emma.report.MethodItem;
import com.vladium.emma.report.PackageItem;
import com.vladium.emma.report.SourcePathCache;
import com.vladium.emma.report.SrcFileItem;
import com.vladium.logging.Logger;
import com.vladium.util.Descriptors;
import com.vladium.util.Files;
import com.vladium.util.IProperties;
import com.vladium.util.IntObjectMap;
import com.vladium.util.asserts.$assert;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public final class ReportGenerator extends AbstractReportGenerator
    implements IAppErrorCodes
{

    private static final int IO_BUF_SIZE = 32768;
    private static final String TYPE = "lcov";
    private BufferedWriter m_out;
    private LinkedList m_queue;

    public ReportGenerator()
    {
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

    private void emitFileCoverage(SrcFileItem srcfileitem)
    {
        String s;
        String s1;
        s = srcfileitem.getFullVMName();
        s1 = ((PackageItem)srcfileitem.getParent()).getVMName();
        if (!m_hasLineNumberInfo)
        {
            m_log.info((new StringBuilder()).append("source file '").append(Descriptors.combineVMName(s1, s)).append("' has no line number information").toString());
        }
        Object obj = m_typeSortComparators[ClassItem.getTypeMetadata().getTypeID()];
        int i = 0;
        obj = srcfileitem.getChildren(((com.vladium.emma.report.ItemComparator) (obj)));
_L6:
        if (!((Iterator) (obj)).hasNext()) goto _L2; else goto _L1
_L1:
        Object obj1;
        boolean aflag[][];
        Object obj2;
        obj2 = (ClassItem)((Iterator) (obj)).next();
        obj1 = ((ClassItem) (obj2)).getName();
        ((ClassItem) (obj2)).getClassDescriptor();
        aflag = ((ClassItem) (obj2)).getCoverage();
        obj2 = ((ClassItem) (obj2)).getChildren(m_typeSortComparators[MethodItem.getTypeMetadata().getTypeID()]);
_L5:
        if (!((Iterator) (obj2)).hasNext()) goto _L4; else goto _L3
_L3:
        String s2;
        Object obj3;
        int j;
        obj3 = (MethodItem)((Iterator) (obj2)).next();
        s2 = ((MethodItem) (obj3)).getName();
        j = ((MethodItem) (obj3)).getID();
        boolean flag;
        flag = false;
        if (aflag != null)
        {
            flag = aflag[j][0];
        }
        row((new StringBuilder()).append("FN:").append(((MethodItem) (obj3)).getFirstLine()).append(",").append(((String) (obj1))).append("::").append(s2).toString());
        obj3 = (new StringBuilder()).append("FNDA:");
        if (flag)
        {
            j = 1;
        } else
        {
            j = 0;
        }
        row(((StringBuilder) (obj3)).append(j).append(",").append(((String) (obj1))).append("::").append(s2).toString());
          goto _L5
_L13:
        if (i == 0)
        {
            m_log.info((new StringBuilder()).append("[source file '").append(Descriptors.combineVMName(s1, s)).append("' not found in sourcepath]").toString());
        }
        return;
_L4:
        i++;
          goto _L6
_L2:
        m_settings.getUnitsType();
        srcfileitem = srcfileitem.getLineCoverage();
        int ai[];
        if (srcfileitem != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assert.ASSERT(flag, "null: lineCoverageMap");
        ai = srcfileitem.keys();
        Arrays.sort(ai);
        i = 0;
_L14:
        if (i >= ai.length) goto _L8; else goto _L7
_L7:
        j = ai[i];
        obj1 = (com.vladium.emma.report.SrcFileItem.LineCoverageData)srcfileitem.get(j);
        ((com.vladium.emma.report.SrcFileItem.LineCoverageData) (obj1)).m_coverageStatus;
        JVM INSTR tableswitch 0 2: default 604
    //                   0 502
    //                   1 534
    //                   2 566;
           goto _L9 _L10 _L11 _L12
_L9:
        $assert.ASSERT(false, (new StringBuilder()).append("invalid line coverage status: ").append(((com.vladium.emma.report.SrcFileItem.LineCoverageData) (obj1)).m_coverageStatus).toString());
        break MISSING_BLOCK_LABEL_607;
_L10:
        try
        {
            row((new StringBuilder()).append("DA:").append(j).append(",0").toString());
            break MISSING_BLOCK_LABEL_607;
        }
        // Misplaced declaration of an exception variable
        catch (SrcFileItem srcfileitem)
        {
            srcfileitem.printStackTrace(System.out);
            i = 0;
        }
          goto _L13
_L11:
        row((new StringBuilder()).append("DA:").append(j).append(",1").toString());
        break MISSING_BLOCK_LABEL_607;
_L12:
        row((new StringBuilder()).append("DA:").append(j).append(",1").toString());
        break MISSING_BLOCK_LABEL_607;
_L8:
        i = 1;
          goto _L13
        i++;
          goto _L14
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
        file.delete();
        if (file.exists())
        {
            throw new EMMARuntimeException((new StringBuilder()).append("Failed to delete ").append(file).toString());
        }
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
        return "lcov";
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
            file = new File("coverage.lcov");
            m_settings.setOutFile(file);
        }
        file = Files.newFile(m_settings.getOutDir(), file);
        m_log.info((new StringBuilder()).append("writing [").append(getType()).append("] report to [").append(file.getAbsolutePath()).append("] ...").toString());
        openOutFile(file, m_settings.getOutEncoding(), true);
        IItem iitem;
        for (allitem = allitem.getChildren(m_typeSortComparators[PackageItem.getTypeMetadata().getTypeID()]); allitem.hasNext(); m_queue.addLast(iitem))
        {
            iitem = (IItem)allitem.next();
        }

        return obj;
    }

    public Object visit(ClassItem classitem, Object obj)
    {
        return obj;
    }

    public Object visit(PackageItem packageitem, Object obj)
    {
        if (m_verbose)
        {
            m_log.verbose((new StringBuilder()).append("  report: processing package [").append(packageitem.getName()).append("] ...").toString());
        }
        IItem iitem;
        int i;
        if (m_srcView)
        {
            i = SrcFileItem.getTypeMetadata().getTypeID();
        } else
        {
            i = ClassItem.getTypeMetadata().getTypeID();
        }
        for (packageitem = packageitem.getChildren(m_typeSortComparators[i]); packageitem.hasNext(); m_queue.addLast(iitem))
        {
            iitem = (IItem)packageitem.next();
        }

        return obj;
    }

    public Object visit(SrcFileItem srcfileitem, Object obj)
    {
        row("SF:".concat(srcfileitem.getFullVMName()));
        emitFileCoverage(srcfileitem);
        row("end_of_record");
        return obj;
    }
}
