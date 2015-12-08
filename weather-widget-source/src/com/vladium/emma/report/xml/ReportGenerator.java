// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.emma.report.xml;

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
import com.vladium.emma.report.ItemComparator;
import com.vladium.emma.report.MethodItem;
import com.vladium.emma.report.PackageItem;
import com.vladium.emma.report.SourcePathCache;
import com.vladium.emma.report.SrcFileItem;
import com.vladium.logging.Logger;
import com.vladium.util.Files;
import com.vladium.util.IConstants;
import com.vladium.util.IProperties;
import com.vladium.util.Strings;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.util.Date;
import java.util.Iterator;

public final class ReportGenerator extends AbstractReportGenerator
    implements IAppErrorCodes
{
    private static final class IndentingWriter extends BufferedWriter
    {

        private static final int INDENT_INCREMENT = 2;
        private int m_indent;
        private transient String m_sindent;
        private int m_state;

        private void indent()
            throws IOException
        {
            if (m_state == 0)
            {
                String s = getIndent();
                super.write(s, 0, s.length());
                m_state = 1;
            }
        }

        void decIndent()
        {
            decIndent(2);
        }

        void decIndent(int i)
        {
            if (i < 0)
            {
                throw new IllegalArgumentException((new StringBuilder()).append("delta be non-negative: ").append(i).toString());
            }
            if (i > m_indent)
            {
                throw new IllegalArgumentException((new StringBuilder()).append("delta = ").append(i).append(", current indent = ").append(m_indent).toString());
            } else
            {
                m_indent = m_indent - i;
                return;
            }
        }

        String getIndent()
        {
            if (m_indent <= 0)
            {
                return "";
            }
            if (m_sindent == null || m_sindent.length() < m_indent)
            {
                char ac[] = new char[m_indent];
                for (int i = 0; i < m_indent; i++)
                {
                    ac[i] = ' ';
                }

                m_sindent = new String(ac);
                return m_sindent;
            } else
            {
                return m_sindent.substring(0, m_indent);
            }
        }

        void incIndent()
        {
            incIndent(2);
        }

        void incIndent(int i)
        {
            if (i < 0)
            {
                throw new IllegalArgumentException((new StringBuilder()).append("delta be non-negative: ").append(i).toString());
            } else
            {
                m_indent = m_indent + i;
                return;
            }
        }

        public void newLine()
            throws IOException
        {
            m_state = 0;
            super.write(IConstants.EOL, 0, IConstants.EOL.length());
        }

        public void write(int i)
            throws IOException
        {
            indent();
            super.write(i);
        }

        public void write(String s, int i, int j)
            throws IOException
        {
            indent();
            super.write(s, i, j);
        }

        public void write(char ac[], int i, int j)
            throws IOException
        {
            indent();
            super.write(ac, i, j);
        }

        IndentingWriter(Writer writer, int i, int j)
        {
            super(writer, i);
            m_indent = j;
        }
    }


    private static final int IO_BUF_SIZE = 0x10000;
    private static final String TYPE = "xml";
    private IndentingWriter m_out;

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

    private void closeElementTag(boolean flag)
        throws IOException
    {
        if (flag)
        {
            m_out.write("/>");
            return;
        } else
        {
            m_out.write(62);
            return;
        }
    }

    private void emitItem(IItem iitem, ItemComparator itemcomparator)
        throws IOException
    {
        boolean flag1 = false;
        IItemMetadata iitemmetadata = iitem.getMetadata();
        int ai[] = m_settings.getColumnOrder();
        String s = iitemmetadata.getTypeName();
        eol();
        openElementTag(s);
        m_out.write(" name=\"");
        m_out.write(Strings.HTMLEscape(iitem.getName()));
        m_out.write(34);
        closeElementTag(false);
        eol();
        m_out.incIndent();
        emitItemCoverage(iitem, ai);
        boolean flag = flag1;
        if (itemcomparator != null)
        {
            flag = flag1;
            if (m_settings.getDepth() > iitemmetadata.getTypeID())
            {
                flag = flag1;
                if (iitem.getChildCount() > 0)
                {
                    flag = true;
                }
            }
        }
        if (flag)
        {
            for (iitem = iitem.getChildren(itemcomparator); iitem.hasNext(); ((IItem)iitem.next()).accept(this, null)) { }
            eol();
        }
        m_out.decIndent();
        endElement(s);
    }

    private void emitItemCoverage(IItem iitem, int ai[])
        throws IOException
    {
        StringBuffer stringbuffer = new StringBuffer(64);
        int i = 0;
        for (int j = ai.length; i < j; i++)
        {
            int k = ai[i];
            if (k == 0)
            {
                continue;
            }
            IItemAttribute iitemattribute = iitem.getAttribute(k, m_settings.getUnitsType());
            if (iitemattribute != null)
            {
                openElementTag("coverage");
                m_out.write(" type=\"");
                m_out.write(Strings.HTMLEscape(iitemattribute.getName()));
                m_out.write("\" value=\"");
                iitemattribute.format(iitem, stringbuffer);
                m_out.write(Strings.HTMLEscape(stringbuffer.toString()));
                m_out.write(34);
                stringbuffer.setLength(0);
                closeElementTag(true);
                eol();
            }
        }

    }

    private void emitStatsCount(String s, int i)
        throws IOException
    {
        eol();
        openElementTag(s);
        m_out.write((new StringBuilder()).append(" value=\"").append(i).toString());
        m_out.write(34);
        closeElementTag(true);
    }

    private void endElement(String s)
        throws IOException
    {
        m_out.write("</");
        m_out.write(s);
        m_out.write(62);
    }

    private void eol()
        throws IOException
    {
        m_out.newLine();
    }

    private void openElementTag(String s)
        throws IOException
    {
        m_out.write(60);
        m_out.write(s);
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
        m_out = new IndentingWriter(new OutputStreamWriter(new FileOutputStream(file), s), 0x10000, 0);
        return;
    }

    public void cleanup()
    {
        close();
        super.cleanup();
    }

    public String getType()
    {
        return "xml";
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
        m_view.getRoot().accept(this, null);
        close();
        if (flag)
        {
            long l1 = System.currentTimeMillis();
            m_log.trace1("process", (new StringBuilder()).append("[").append(getType()).append("] report generated in ").append(l1 - l).append(" ms").toString());
        }
    }

    public Object visit(AllItem allitem, Object obj)
    {
        Object obj1;
        File file;
        try
        {
            file = m_settings.getOutFile();
        }
        // Misplaced declaration of an exception variable
        catch (AllItem allitem)
        {
            throw new EMMARuntimeException("REPORT_IO_FAILURE", allitem);
        }
        obj1 = file;
        if (file != null)
        {
            break MISSING_BLOCK_LABEL_36;
        }
        obj1 = new File("coverage.xml");
        m_settings.setOutFile(((File) (obj1)));
        obj1 = Files.newFile(m_settings.getOutDir(), ((File) (obj1)));
        m_log.info((new StringBuilder()).append("writing [").append(getType()).append("] report to [").append(((File) (obj1)).getAbsolutePath()).append("] ...").toString());
        openOutFile(((File) (obj1)), m_settings.getOutEncoding(), true);
        m_out.write((new StringBuilder()).append("<?xml version=\"1.0\" encoding=\"").append(m_settings.getOutEncoding()).append("\"?>").toString());
        obj1 = new StringBuffer(101);
        ((StringBuffer) (obj1)).append("<!-- ");
        ((StringBuffer) (obj1)).append("EMMA");
        ((StringBuffer) (obj1)).append(" v");
        ((StringBuffer) (obj1)).append("0.0.0 (unsupported private build)");
        ((StringBuffer) (obj1)).append(" report, generated ");
        ((StringBuffer) (obj1)).append(new Date(EMMAProperties.getTimeStamp()));
        ((StringBuffer) (obj1)).append(" -->");
        m_out.write(((StringBuffer) (obj1)).toString());
        m_out.newLine();
        m_out.flush();
        eol();
        openElementTag("report");
        closeElementTag(false);
        m_out.incIndent();
        eol();
        openElementTag("stats");
        closeElementTag(false);
        m_out.incIndent();
        emitStatsCount("packages", allitem.getChildCount());
        emitStatsCount("classes", allitem.getAggregate(11));
        emitStatsCount("methods", allitem.getAggregate(10));
        if (m_srcView && m_hasSrcFileInfo)
        {
            emitStatsCount("srcfiles", allitem.getAggregate(12));
            if (m_hasLineNumberInfo)
            {
                emitStatsCount("srclines", allitem.getAggregate(7));
            }
        }
        m_out.decIndent();
        eol();
        endElement("stats");
        eol();
        openElementTag("data");
        closeElementTag(false);
        m_out.incIndent();
        emitItem(allitem, m_typeSortComparators[PackageItem.getTypeMetadata().getTypeID()]);
        m_out.decIndent();
        eol();
        endElement("data");
        m_out.decIndent();
        eol();
        endElement("report");
        return obj;
        allitem;
        throw new EMMARuntimeException("REPORT_IO_FAILURE", allitem);
    }

    public Object visit(ClassItem classitem, Object obj)
    {
        try
        {
            emitItem(classitem, m_typeSortComparators[MethodItem.getTypeMetadata().getTypeID()]);
        }
        // Misplaced declaration of an exception variable
        catch (ClassItem classitem)
        {
            throw new EMMARuntimeException("REPORT_IO_FAILURE", classitem);
        }
        return obj;
    }

    public Object visit(MethodItem methoditem, Object obj)
    {
        try
        {
            emitItem(methoditem, null);
        }
        // Misplaced declaration of an exception variable
        catch (MethodItem methoditem)
        {
            throw new EMMARuntimeException("REPORT_IO_FAILURE", methoditem);
        }
        return obj;
    }

    public Object visit(PackageItem packageitem, Object obj)
    {
        if (m_verbose)
        {
            m_log.verbose((new StringBuilder()).append("  report: processing package [").append(packageitem.getName()).append("] ...").toString());
        }
        ItemComparator aitemcomparator[];
        int i;
        aitemcomparator = m_typeSortComparators;
        if (!m_srcView)
        {
            break MISSING_BLOCK_LABEL_76;
        }
        i = SrcFileItem.getTypeMetadata().getTypeID();
_L1:
        emitItem(packageitem, aitemcomparator[i]);
        return obj;
        try
        {
            i = ClassItem.getTypeMetadata().getTypeID();
        }
        // Misplaced declaration of an exception variable
        catch (PackageItem packageitem)
        {
            throw new EMMARuntimeException("REPORT_IO_FAILURE", packageitem);
        }
          goto _L1
    }

    public Object visit(SrcFileItem srcfileitem, Object obj)
    {
        try
        {
            emitItem(srcfileitem, m_typeSortComparators[ClassItem.getTypeMetadata().getTypeID()]);
        }
        // Misplaced declaration of an exception variable
        catch (SrcFileItem srcfileitem)
        {
            throw new EMMARuntimeException("REPORT_IO_FAILURE", srcfileitem);
        }
        return obj;
    }
}
