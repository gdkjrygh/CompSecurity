// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.emma.report.html;

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
import com.vladium.emma.report.html.doc.Attribute;
import com.vladium.emma.report.html.doc.AttributeSet;
import com.vladium.emma.report.html.doc.ElementList;
import com.vladium.emma.report.html.doc.HTMLDocument;
import com.vladium.emma.report.html.doc.HTMLTable;
import com.vladium.emma.report.html.doc.HTMLWriter;
import com.vladium.emma.report.html.doc.HyperRef;
import com.vladium.emma.report.html.doc.IContent;
import com.vladium.emma.report.html.doc.IElement;
import com.vladium.emma.report.html.doc.IElementList;
import com.vladium.emma.report.html.doc.Tag;
import com.vladium.emma.report.html.doc.Text;
import com.vladium.logging.Logger;
import com.vladium.util.Descriptors;
import com.vladium.util.Files;
import com.vladium.util.IProperties;
import com.vladium.util.IntObjectMap;
import com.vladium.util.IntVector;
import com.vladium.util.ObjectIntMap;
import com.vladium.util.Property;
import com.vladium.util.asserts.$assert;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.text.FieldPosition;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;

public final class ReportGenerator extends AbstractReportGenerator
    implements IAppErrorCodes
{
    private static final class IDGenerator
    {

        private final ObjectIntMap m_namespace;
        private final int m_out[];

        String getID(String s)
        {
            int ai[] = m_out;
            int i;
            if (m_namespace.get(s, ai))
            {
                i = ai[0];
            } else
            {
                i = m_namespace.size();
                m_namespace.put(s, i);
            }
            return Integer.toHexString(i);
        }

        IDGenerator()
        {
            m_namespace = new ObjectIntMap(101);
            m_out = new int[1];
        }

        IDGenerator(int i)
        {
            m_namespace = new ObjectIntMap(i);
            m_out = new int[1];
        }
    }


    private static final long ATTRIBUTE_SETS[];
    private static final String CSS = " TABLE,TD,TH {border-style:solid; border-color:black;} TD,TH {background:white;margin:0;line-height:100%;padding-left:0.5em;padding-right:0.5em;} TD {border-width:0 1px 0 0;} TH {border-width:1px 1px 1px 0;} TR TD.h {color:red;} TABLE {border-spacing:0; border-collapse:collapse;border-width:0 0 1px 1px;} P,H1,H2,H3,TH {font-family:verdana,arial,sans-serif;font-size:10pt;} TD {font-family:courier,monospace;font-size:10pt;} TABLE.hdft {border-spacing:0;border-collapse:collapse;border-style:none;} TABLE.hdft TH,TABLE.hdft TD {border-style:none;line-height:normal;} TABLE.hdft TH.tl,TABLE.hdft TD.tl {background:#6699CC;color:white;} TABLE.hdft TD.nv {background:#6633DD;color:white;} .nv A:link {color:white;} .nv A:visited {color:white;} .nv A:active {color:yellow;} TABLE.hdft A:link {color:white;} TABLE.hdft A:visited {color:white;} TABLE.hdft A:active {color:yellow;} .in {color:#356085;} TABLE.s TD {padding-left:0.25em;padding-right:0.25em;} TABLE.s TD.l {padding-left:0.25em;padding-right:0.25em;text-align:right;background:#F0F0F0;} TABLE.s TR.z TD {background:#FF9999;} TABLE.s TR.p TD {background:#FFFF88;} TABLE.s TR.c TD {background:#CCFFCC;} A:link {color:#0000EE;text-decoration:none;} A:visited {color:#0000EE;text-decoration:none;} A:hover {color:#0000EE;text-decoration:underline;} TABLE.cn {border-width:0 0 1px 0;} TABLE.s {border-width:1px 0 1px 1px;} TD.h {color:red;border-width:0 1px 0 0;} TD.f {border-width:0 1px 0 1px;} TD.hf {color:red;border-width:0 1px 0 1px;} TH.f {border-width:1px 1px 1px 1px;} TR.cis TD {background:#F0F0F0;} TR.cis TD {border-width:1px 1px 1px 0;} TR.cis TD.h {color:red;border-width:1px 1px 1px 0;} TR.cis TD.f {border-width:1px 1px 1px 1px;} TR.cis TD.hf {color:red;border-width:1px 1px 1px 1px;} TD.b {border-style:none;background:transparent;line-height:50%;}  TD.bt {border-width:1px 0 0 0;background:transparent;line-height:50%;} TR.o TD {background:#F0F0F0;}TABLE.it {border-style:none;}TABLE.it TD,TABLE.it TH {border-style:none;}";
    private static final String CSS_BLANK = "b";
    private static final String CSS_BOTTOM = "bt";
    private static final String CSS_CLASS_ITEM_SPECIAL = "cis";
    private static final String CSS_CLS_NOLEFT = "cn";
    private static final String CSS_COVERAGE_COMPLETE = "c";
    private static final String CSS_COVERAGE_PARTIAL = "p";
    private static final String CSS_COVERAGE_ZERO = "z";
    private static final String CSS_DATA = "";
    private static final String CSS_DATA_FIRST = "f";
    private static final String CSS_DATA_HIGHLIGHT = "h";
    private static final String CSS_DATA_HIGHLIGHT_FIRST = "hf";
    private static final String CSS_HEADER = "";
    private static final String CSS_HEADER_FIRST = "f";
    private static final String CSS_HEADER_FOOTER = "hdft";
    private static final String CSS_INVISIBLE_TABLE = "it";
    private static final String CSS_ITEM_NAME = "in";
    private static final String CSS_LINENUM = "l";
    private static final String CSS_NAV = "nv";
    private static final String CSS_ODDROW = "o";
    private static final String CSS_SOURCE = "s";
    private static final String CSS_TITLE = "tl";
    private static final String DARKER_BACKGROUND = "#F0F0F0";
    private static final String FILE_EXTENSION = ".html";
    private static final int IO_BUF_SIZE = 32768;
    private static final IContent LEFT_BRACKET = new Text("[", false);
    private static final int MAX_DISPLAY_NAME_LENGTH = 80;
    private static final String NAV_BACKGROUND = "#6633DD";
    private static final File NESTED_ITEMS_PARENT_DIR = new File("_files");
    private static final String NESTED_ITEMS_PARENT_DIRNAME = "_files";
    private static final int NESTING[][];
    private static final String REPORT_HEADER_TITLE = "EMMA Coverage Report";
    private static final IContent RIGHT_BRACKET = new Text("]", false);
    private static final int SRC_LINE_OFFSET = 4;
    private static final String TITLE_BACKGROUND = "#6699CC";
    private static final String TYPE = "html";
    private static final boolean USE_LINE_COVERAGE_TOOLTIPS = true;
    private final FieldPosition m_fieldPosition = new FieldPosition(0);
    private IContent m_footerBottom;
    private final DecimalFormat m_format = (DecimalFormat)NumberFormat.getPercentInstance();
    private IContent m_pageTitle;
    private LinkedList m_queue;
    private IDGenerator m_reportIDNamespace;

    public ReportGenerator()
    {
        m_format.setMaximumFractionDigits(0);
    }

    private void addClassItemRow(IItem iitem, boolean flag, HTMLTable htmltable, int ai[], String s, boolean flag1)
    {
        com.vladium.emma.report.html.doc.HTMLTable.IRow irow = htmltable.newRow();
        if (flag)
        {
            irow.setClass("o");
        }
        StringBuffer stringbuffer = new StringBuffer(11);
        int i = 0;
        do
        {
            while (i < ai.length) 
            {
                int j = ai[i];
                htmltable = iitem.getAttribute(j, m_settings.getUnitsType());
                if (htmltable != null)
                {
                    com.vladium.emma.report.html.doc.HTMLTable.ICell icell = irow.newCell();
                    flag = false;
                    if (s != null && j == 0)
                    {
                        stringbuffer.setLength(0);
                        htmltable.format(iitem, stringbuffer);
                        trimForDisplay(stringbuffer);
                        if (flag1)
                        {
                            htmltable = "#".concat(s);
                        } else
                        {
                            htmltable = s;
                        }
                        icell.add(new HyperRef(htmltable, stringbuffer.toString(), true));
                    } else
                    {
                        if (m_metrics[j] > 0 && !htmltable.passes(iitem, m_metrics[j]))
                        {
                            flag = true;
                        } else
                        {
                            flag = false;
                        }
                        stringbuffer.setLength(0);
                        htmltable.format(iitem, stringbuffer);
                        trimForDisplay(stringbuffer);
                        icell.setText(stringbuffer.toString(), true);
                    }
                    icell.setClass(dataCellStyle(i, flag));
                } else
                {
                    htmltable = irow.newCell();
                    htmltable.setText(" ", true);
                    htmltable.setClass(dataCellStyle(i, false));
                }
                i++;
            }
            return;
        } while (true);
    }

    private void addClassRow(ClassItem classitem, int i, HTMLTable htmltable, int ai[], String s, boolean flag)
    {
        com.vladium.emma.report.html.doc.HTMLTable.IRow irow = htmltable.newRow();
        com.vladium.emma.report.html.doc.HTMLTable.IRow irow1 = htmltable.newRow();
        irow1.setClass("cis");
        StringBuffer stringbuffer = new StringBuffer(11);
        int j = 0;
        do
        {
            while (j < ai.length) 
            {
                int k = ai[j];
                IItemAttribute iitemattribute = classitem.getAttribute(k, m_settings.getUnitsType());
                if (iitemattribute != null)
                {
                    stringbuffer.setLength(0);
                    iitemattribute.format(classitem, stringbuffer);
                    com.vladium.emma.report.html.doc.HTMLTable.ICell icell = irow.newCell();
                    boolean flag1;
                    if (i == 0)
                    {
                        htmltable = "b";
                    } else
                    {
                        htmltable = "bt";
                    }
                    icell.setClass(htmltable);
                    icell.setText(" ", true);
                    icell = irow1.newCell();
                    flag1 = false;
                    if (k == 0)
                    {
                        if (s != null)
                        {
                            if (flag)
                            {
                                htmltable = "#".concat(s);
                            } else
                            {
                                htmltable = s;
                            }
                            icell.add(new Text("class ", true));
                            icell.add(new HyperRef(htmltable, stringbuffer.toString(), true));
                        } else
                        {
                            icell.setText((new StringBuilder()).append("class ").append(stringbuffer.toString()).toString(), true);
                        }
                    } else
                    {
                        if (m_metrics[k] > 0 && !iitemattribute.passes(classitem, m_metrics[k]))
                        {
                            flag1 = true;
                        } else
                        {
                            flag1 = false;
                        }
                        icell.setText(stringbuffer.toString(), true);
                    }
                    icell.setClass(dataCellStyle(j, flag1));
                } else
                {
                    htmltable = irow1.newCell();
                    htmltable.setText(" ", true);
                    htmltable.setClass(dataCellStyle(j, false));
                }
                j++;
            }
            return;
        } while (true);
    }

    private int[] addHeaderRow(IItem iitem, HTMLTable htmltable, int ai[])
    {
        htmltable = htmltable.newTitleRow();
        IntVector intvector = new IntVector(ai.length);
        for (int i = 0; i < ai.length; i++)
        {
            int j = ai[i];
            IItemAttribute iitemattribute = iitem.getAttribute(j, m_settings.getUnitsType());
            if (iitemattribute != null)
            {
                com.vladium.emma.report.html.doc.HTMLTable.ICell icell = htmltable.newCell();
                icell.setText(iitemattribute.getName(), true);
                icell.setClass(headerCellStyle(i));
                intvector.add(j);
            }
        }

        return intvector.values();
    }

    private void addItemRow(IItem iitem, boolean flag, HTMLTable htmltable, int ai[], String s, boolean flag1)
    {
        com.vladium.emma.report.html.doc.HTMLTable.IRow irow = htmltable.newRow();
        if (flag)
        {
            irow.setClass("o");
        }
        StringBuffer stringbuffer = new StringBuffer(11);
        int i = 0;
        while (i < ai.length) 
        {
            int j = ai[i];
            htmltable = iitem.getAttribute(j, m_settings.getUnitsType());
            if (htmltable != null)
            {
                com.vladium.emma.report.html.doc.HTMLTable.ICell icell = irow.newCell();
                if (s != null && j == 0)
                {
                    stringbuffer.setLength(0);
                    htmltable.format(iitem, stringbuffer);
                    trimForDisplay(stringbuffer);
                    if (flag1)
                    {
                        htmltable = "#".concat(s);
                    } else
                    {
                        htmltable = s;
                    }
                    icell.add(new HyperRef(htmltable, stringbuffer.toString(), true));
                } else
                {
                    boolean flag2;
                    if (m_metrics[j] > 0 && !htmltable.passes(iitem, m_metrics[j]))
                    {
                        flag2 = true;
                    } else
                    {
                        flag2 = false;
                    }
                    stringbuffer.setLength(0);
                    htmltable.format(iitem, stringbuffer);
                    trimForDisplay(stringbuffer);
                    icell.setText(stringbuffer.toString(), true);
                    if (flag2)
                    {
                        icell.setClass("h");
                    }
                }
            } else
            {
                irow.newCell().setText(" ", true);
            }
            i++;
        }
    }

    private static String addLineAnchorID(int i, String s, IntObjectMap intobjectmap)
    {
        if (i > 0)
        {
            String s1 = (String)intobjectmap.get(i);
            if (s1 != null)
            {
                return s1;
            } else
            {
                intobjectmap.put(i, s);
                return s;
            }
        } else
        {
            return null;
        }
    }

    private IElement addPageFooter(HTMLDocument htmldocument, IItem iitem, IItem aiitem[])
    {
        HTMLTable htmltable = new HTMLTable("100%", null, null, "0");
        htmltable.setClass("hdft");
        com.vladium.emma.report.html.doc.HTMLTable.ICell icell = htmltable.newRow().newCell();
        icell.setClass("nv");
        int i;
        int j;
        if (aiitem.length > 1)
        {
            i = aiitem.length - 1;
        } else
        {
            i = aiitem.length;
        }
        for (j = 0; j < i; j++)
        {
            icell.add(LEFT_BRACKET);
            String s = aiitem[j].getName();
            icell.add(new HyperRef(getItemHREF(iitem, aiitem[j]), s, true));
            icell.add(RIGHT_BRACKET);
        }

        iitem = htmltable.newRow().newCell();
        iitem.setClass("tl");
        iitem.add(getFooterBottom());
        iitem = new ElementList();
        iitem.add(com.vladium.emma.report.html.doc.IElement.Factory.create(Tag.P));
        iitem.add(htmltable);
        htmldocument.setFooter(iitem);
        return htmltable;
    }

    private IElement addPageHeader(HTMLDocument htmldocument, IItem iitem, IItem aiitem[])
    {
        HTMLTable htmltable = new HTMLTable("100%", null, null, "0");
        htmltable.setClass("hdft");
        addPageHeaderTitleRow(htmltable);
        com.vladium.emma.report.html.doc.HTMLTable.ICell icell = htmltable.newRow().newCell();
        icell.setClass("nv");
        int i;
        int j;
        if (aiitem.length > 1)
        {
            i = aiitem.length - 1;
        } else
        {
            i = aiitem.length;
        }
        for (j = 0; j < i; j++)
        {
            icell.add(LEFT_BRACKET);
            String s = aiitem[j].getName();
            icell.add(new HyperRef(getItemHREF(iitem, aiitem[j]), s, true));
            icell.add(RIGHT_BRACKET);
        }

        htmldocument.setHeader(htmltable);
        return htmltable;
    }

    private void addPageHeaderTitleRow(HTMLTable htmltable)
    {
        htmltable = htmltable.newTitleRow().newCell();
        htmltable.setClass("tl");
        htmltable.add(getPageTitle());
    }

    private HTMLDocument createPage(String s)
    {
        s = new HTMLDocument(s, m_settings.getOutEncoding());
        s.addStyle(" TABLE,TD,TH {border-style:solid; border-color:black;} TD,TH {background:white;margin:0;line-height:100%;padding-left:0.5em;padding-right:0.5em;} TD {border-width:0 1px 0 0;} TH {border-width:1px 1px 1px 0;} TR TD.h {color:red;} TABLE {border-spacing:0; border-collapse:collapse;border-width:0 0 1px 1px;} P,H1,H2,H3,TH {font-family:verdana,arial,sans-serif;font-size:10pt;} TD {font-family:courier,monospace;font-size:10pt;} TABLE.hdft {border-spacing:0;border-collapse:collapse;border-style:none;} TABLE.hdft TH,TABLE.hdft TD {border-style:none;line-height:normal;} TABLE.hdft TH.tl,TABLE.hdft TD.tl {background:#6699CC;color:white;} TABLE.hdft TD.nv {background:#6633DD;color:white;} .nv A:link {color:white;} .nv A:visited {color:white;} .nv A:active {color:yellow;} TABLE.hdft A:link {color:white;} TABLE.hdft A:visited {color:white;} TABLE.hdft A:active {color:yellow;} .in {color:#356085;} TABLE.s TD {padding-left:0.25em;padding-right:0.25em;} TABLE.s TD.l {padding-left:0.25em;padding-right:0.25em;text-align:right;background:#F0F0F0;} TABLE.s TR.z TD {background:#FF9999;} TABLE.s TR.p TD {background:#FFFF88;} TABLE.s TR.c TD {background:#CCFFCC;} A:link {color:#0000EE;text-decoration:none;} A:visited {color:#0000EE;text-decoration:none;} A:hover {color:#0000EE;text-decoration:underline;} TABLE.cn {border-width:0 0 1px 0;} TABLE.s {border-width:1px 0 1px 1px;} TD.h {color:red;border-width:0 1px 0 0;} TD.f {border-width:0 1px 0 1px;} TD.hf {color:red;border-width:0 1px 0 1px;} TH.f {border-width:1px 1px 1px 1px;} TR.cis TD {background:#F0F0F0;} TR.cis TD {border-width:1px 1px 1px 0;} TR.cis TD.h {color:red;border-width:1px 1px 1px 0;} TR.cis TD.f {border-width:1px 1px 1px 1px;} TR.cis TD.hf {color:red;border-width:1px 1px 1px 1px;} TD.b {border-style:none;background:transparent;line-height:50%;}  TD.bt {border-width:1px 0 0 0;background:transparent;line-height:50%;} TR.o TD {background:#F0F0F0;}TABLE.it {border-style:none;}TABLE.it TD,TABLE.it TH {border-style:none;}");
        return s;
    }

    private static String dataCellStyle(int i, boolean flag)
    {
        if (i == 0)
        {
            if (flag)
            {
                return "hf";
            } else
            {
                return "f";
            }
        }
        if (flag)
        {
            return "h";
        } else
        {
            return "";
        }
    }

    private void embedSrcFile(SrcFileItem srcfileitem, HTMLDocument htmldocument, IntObjectMap intobjectmap, SourcePathCache sourcepathcache)
    {
        String s;
        String s1;
        HTMLTable htmltable;
        int i;
        int j;
        s = srcfileitem.getName();
        s1 = ((PackageItem)srcfileitem.getParent()).getVMName();
        j = 0;
        htmltable = new HTMLTable("100%", null, null, "0");
        i = j;
        if (sourcepathcache == null) goto _L2; else goto _L1
_L1:
        Object obj;
        htmltable.setClass("s");
        obj = sourcepathcache.find(s1, s);
        i = j;
        if (obj == null) goto _L2; else goto _L3
_L3:
        StringBuffer stringbuffer;
        sourcepathcache = null;
        stringbuffer = null;
        obj = new BufferedReader(new FileReader(((File) (obj))), 32768);
        int k;
        boolean flag1;
        flag1 = m_hasLineNumberInfo;
        k = m_settings.getUnitsType();
        sourcepathcache = null;
        stringbuffer = null;
        if (!flag1) goto _L5; else goto _L4
_L4:
        sourcepathcache = srcfileitem.getLineCoverage();
        com.vladium.emma.report.html.doc.HTMLTable.ICell icell;
        com.vladium.emma.report.html.doc.HTMLTable.IRow irow;
        Object obj1;
        boolean flag;
        if (sourcepathcache != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assert.ASSERT(flag, "null: lineCoverageMap");
        stringbuffer = new StringBuffer(64);
          goto _L5
_L26:
        srcfileitem = ((BufferedReader) (obj)).readLine();
        if (srcfileitem == null) goto _L7; else goto _L6
_L6:
        irow = htmltable.newRow();
        icell = irow.newCell();
        icell.setClass("l");
        if (intobjectmap == null) goto _L9; else goto _L8
_L8:
        if (i < 4)
        {
            j = i;
        } else
        {
            j = i + 4;
        }
        obj1 = (String)intobjectmap.get(j);
        if (obj1 == null) goto _L11; else goto _L10
_L10:
        IElement ielement = com.vladium.emma.report.html.doc.IElement.Factory.create(Tag.A);
        ielement.getAttributes().set(Attribute.NAME, ((String) (obj1)));
        ielement.setText(Integer.toString(i), true);
        icell.add(ielement);
_L19:
        obj1 = irow.newCell();
        if (srcfileitem.length() <= 0)
        {
            srcfileitem = " ";
        }
        ((com.vladium.emma.report.html.doc.HTMLTable.ICell) (obj1)).setText(srcfileitem, true);
        if (!flag1) goto _L13; else goto _L12
_L12:
        srcfileitem = (com.vladium.emma.report.SrcFileItem.LineCoverageData)sourcepathcache.get(i);
        if (srcfileitem == null) goto _L13; else goto _L14
_L14:
        ((com.vladium.emma.report.SrcFileItem.LineCoverageData) (srcfileitem)).m_coverageStatus;
        JVM INSTR tableswitch 0 2: default 783
    //                   0 535
    //                   1 548
    //                   2 725;
           goto _L15 _L16 _L17 _L18
_L15:
        $assert.ASSERT(false, (new StringBuilder()).append("invalid line coverage status: ").append(((com.vladium.emma.report.SrcFileItem.LineCoverageData) (srcfileitem)).m_coverageStatus).toString());
          goto _L13
_L11:
        icell.setText(Integer.toString(i), true);
          goto _L19
        intobjectmap;
        srcfileitem = ((SrcFileItem) (obj));
_L24:
        sourcepathcache = srcfileitem;
        intobjectmap.printStackTrace(System.out);
        i = 0;
        int l;
        if (srcfileitem != null)
        {
            try
            {
                srcfileitem.close();
            }
            // Misplaced declaration of an exception variable
            catch (SrcFileItem srcfileitem) { }
        }
_L2:
        if (i == 0)
        {
            htmltable.setClass("it");
            htmltable.newTitleRow().newCell().setText((new StringBuilder()).append("[source file '").append(Descriptors.combineVMName(s1, s)).append("' not found in sourcepath]").toString(), false);
        }
        htmldocument.add(htmltable);
        return;
_L9:
        icell.setText(Integer.toString(i), true);
          goto _L19
        srcfileitem;
        sourcepathcache = ((SourcePathCache) (obj));
_L23:
        if (sourcepathcache != null)
        {
            try
            {
                sourcepathcache.close();
            }
            // Misplaced declaration of an exception variable
            catch (HTMLDocument htmldocument) { }
        }
        throw srcfileitem;
_L16:
        irow.setClass("z");
          goto _L13
_L17:
        irow.setClass("p");
        stringbuffer.setLength(0);
        srcfileitem = ((com.vladium.emma.report.SrcFileItem.LineCoverageData) (srcfileitem)).m_coverageRatio[k];
        j = srcfileitem[0];
        l = srcfileitem[1];
        m_format.format((double)l / (double)j, stringbuffer, m_fieldPosition);
        stringbuffer.append(" line coverage (");
        stringbuffer.append(l);
        stringbuffer.append(" out of ");
        stringbuffer.append(j);
        k;
        JVM INSTR tableswitch 0 1: default 810
    //                   0 701
    //                   1 713;
           goto _L20 _L21 _L22
_L20:
        icell.getAttributes().set(Attribute.TITLE, stringbuffer.toString());
        ((com.vladium.emma.report.html.doc.HTMLTable.ICell) (obj1)).getAttributes().set(Attribute.TITLE, stringbuffer.toString());
          goto _L13
_L21:
        stringbuffer.append(" basic blocks)");
          goto _L20
_L22:
        stringbuffer.append(" instructions)");
          goto _L20
_L18:
        irow.setClass("c");
          goto _L13
_L7:
        i = 1;
        if (obj != null)
        {
            try
            {
                ((BufferedReader) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (SrcFileItem srcfileitem) { }
        }
          goto _L2
        srcfileitem;
          goto _L23
        intobjectmap;
        srcfileitem = stringbuffer;
          goto _L24
_L5:
        i = 1;
        continue; /* Loop/switch isn't completed */
_L13:
        i++;
        if (true) goto _L26; else goto _L25
_L25:
    }

    private IContent getFooterBottom()
    {
        IContent icontent = m_footerBottom;
        Object obj = icontent;
        if (icontent == null)
        {
            ElementList elementlist = new ElementList();
            elementlist.add(new HyperRef("this private build is unsupported", "EMMA 0.0.0 (unsupported private build)", true));
            elementlist.add(new Text(" (C) Vladimir Roubtsov", true));
            obj = elementlist;
            m_footerBottom = elementlist;
        }
        return ((IContent) (obj));
    }

    private static File getItemFile(File file, String s)
    {
        if (file == null)
        {
            return new File(s.concat(".html"));
        } else
        {
            return new File(file, s.concat(".html"));
        }
    }

    private String getItemHREF(IItem iitem, IItem iitem1)
    {
        String s;
        if (iitem1 instanceof AllItem)
        {
            s = m_settings.getOutFile().getName();
        } else
        {
            s = m_reportIDNamespace.getID(getItemKey(iitem1)).concat(".html");
        }
        if (iitem == null)
        {
            return s;
        }
        int i = NESTING[iitem.getMetadata().getTypeID()][iitem1.getMetadata().getTypeID()];
        if (i == 1)
        {
            return "_files".concat("/").concat(s);
        }
        if (i == -1)
        {
            return "../".concat(s);
        } else
        {
            return s;
        }
    }

    private static String getItemKey(IItem iitem)
    {
        StringBuffer stringbuffer = new StringBuffer();
        for (; iitem != null; iitem = iitem.getParent())
        {
            stringbuffer.append(iitem.getName());
            stringbuffer.append(':');
        }

        return stringbuffer.toString();
    }

    private IContent getPageTitle()
    {
        IContent icontent = m_pageTitle;
        Object obj = icontent;
        if (icontent == null)
        {
            ElementList elementlist = new ElementList();
            elementlist.add(new HyperRef("this private build is unsupported", "EMMA", true));
            obj = new StringBuffer(" Coverage Report (generated ");
            ((StringBuffer) (obj)).append(new Date(EMMAProperties.getTimeStamp()));
            ((StringBuffer) (obj)).append(')');
            elementlist.add(new Text(((StringBuffer) (obj)).toString(), true));
            obj = elementlist;
            m_pageTitle = elementlist;
        }
        return ((IContent) (obj));
    }

    private IItem[] getParentPath(IItem iitem)
    {
        Object obj = new LinkedList();
        for (; iitem != null; iitem = iitem.getParent())
        {
            ((LinkedList) (obj)).add(iitem);
        }

        iitem = new IItem[((LinkedList) (obj)).size()];
        int i = iitem.length - 1;
        for (obj = ((LinkedList) (obj)).iterator(); ((Iterator) (obj)).hasNext();)
        {
            iitem[i] = (IItem)((Iterator) (obj)).next();
            i--;
        }

        return iitem;
    }

    private static String headerCellStyle(int i)
    {
        if (i == 0)
        {
            return "f";
        } else
        {
            return "";
        }
    }

    private static HTMLWriter openOutFile(File file, String s, boolean flag)
    {
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_18;
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
            break MISSING_BLOCK_LABEL_18;
        }
        file1.mkdirs();
        file = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), s), 32768);
        return new HTMLWriter(file);
    }

    private boolean srcFileAvailable(SrcFileItem srcfileitem, SourcePathCache sourcepathcache)
    {
        if (sourcepathcache == null)
        {
            return false;
        }
        String s = srcfileitem.getName();
        boolean flag;
        if (sourcepathcache.find(((PackageItem)srcfileitem.getParent()).getVMName(), s) != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return flag;
    }

    private static void trimForDisplay(StringBuffer stringbuffer)
    {
        if (stringbuffer.length() > 80)
        {
            stringbuffer.setLength(77);
            stringbuffer.append("...");
        }
    }

    public void cleanup()
    {
        m_queue = null;
        m_reportIDNamespace = null;
        super.cleanup();
    }

    public final String getType()
    {
        return "html";
    }

    public void process(IMetaData imetadata, ICoverageData icoveragedata, SourcePathCache sourcepathcache, IProperties iproperties)
        throws EMMARuntimeException
    {
        initialize(imetadata, icoveragedata, sourcepathcache, iproperties);
        m_pageTitle = null;
        m_footerBottom = null;
        icoveragedata = m_settings.getOutDir();
        if (icoveragedata == null || icoveragedata.equals(new File(Property.getSystemProperty("user.dir", ""))))
        {
            icoveragedata = new File("coverage");
            m_settings.setOutDir(icoveragedata);
        }
        long l = 0L;
        boolean flag = m_log.atTRACE1();
        if (flag)
        {
            l = System.currentTimeMillis();
        }
        m_queue = new LinkedList();
        m_reportIDNamespace = new IDGenerator(imetadata.size());
        m_queue.add(m_view.getRoot());
        for (; !m_queue.isEmpty(); ((IItem)m_queue.removeFirst()).accept(this, null)) { }
        m_reportIDNamespace = null;
        if (flag)
        {
            long l1 = System.currentTimeMillis();
            m_log.trace1("process", (new StringBuilder()).append("[").append(getType()).append("] report generated in ").append(l1 - l).append(" ms").toString());
        }
    }

    public Object visit(AllItem allitem, Object obj)
    {
        HTMLWriter htmlwriter;
        Object obj2;
        obj2 = null;
        htmlwriter = ((HTMLWriter) (obj2));
        Object obj4 = m_settings.getOutFile();
        Object obj1;
        obj1 = obj4;
        if (obj4 != null)
        {
            break MISSING_BLOCK_LABEL_56;
        }
        htmlwriter = ((HTMLWriter) (obj2));
        obj1 = new File("index".concat(".html"));
        htmlwriter = ((HTMLWriter) (obj2));
        m_settings.setOutFile(((File) (obj1)));
        htmlwriter = ((HTMLWriter) (obj2));
        obj1 = Files.newFile(m_settings.getOutDir(), ((File) (obj1)));
        htmlwriter = ((HTMLWriter) (obj2));
        m_log.info((new StringBuilder()).append("writing [").append(getType()).append("] report to [").append(((File) (obj1)).getAbsolutePath()).append("] ...").toString());
        htmlwriter = ((HTMLWriter) (obj2));
        obj4 = openOutFile(((File) (obj1)), m_settings.getOutEncoding(), true);
        htmlwriter = ((HTMLWriter) (obj4));
        int ai1[] = m_settings.getColumnOrder();
        htmlwriter = ((HTMLWriter) (obj4));
        obj1 = new StringBuffer();
        htmlwriter = ((HTMLWriter) (obj4));
        obj2 = new StringBuffer("EMMA Coverage Report");
        htmlwriter = ((HTMLWriter) (obj4));
        ((StringBuffer) (obj2)).append(" (generated ");
        htmlwriter = ((HTMLWriter) (obj4));
        ((StringBuffer) (obj2)).append(new Date(EMMAProperties.getTimeStamp()));
        htmlwriter = ((HTMLWriter) (obj4));
        ((StringBuffer) (obj2)).append(')');
        htmlwriter = ((HTMLWriter) (obj4));
        HTMLDocument htmldocument = createPage(((StringBuffer) (obj2)).toString());
        htmlwriter = ((HTMLWriter) (obj4));
        IItem aiitem[] = getParentPath(allitem);
        htmlwriter = ((HTMLWriter) (obj4));
        addPageHeader(htmldocument, allitem, aiitem);
        htmlwriter = ((HTMLWriter) (obj4));
        addPageFooter(htmldocument, allitem, aiitem);
        htmlwriter = ((HTMLWriter) (obj4));
        htmldocument.addH(1, "OVERALL COVERAGE SUMMARY", null);
        htmlwriter = ((HTMLWriter) (obj4));
        aiitem = new HTMLTable("100%", null, null, "0");
        htmlwriter = ((HTMLWriter) (obj4));
        com.vladium.emma.report.html.doc.HTMLTable.IRow irow = aiitem.newTitleRow();
        htmlwriter = ((HTMLWriter) (obj4));
        com.vladium.emma.report.html.doc.HTMLTable.IRow irow1 = aiitem.newRow();
        int i = 0;
_L9:
        htmlwriter = ((HTMLWriter) (obj4));
        if (i >= ai1.length) goto _L2; else goto _L1
_L1:
        int j;
        j = ai1[i];
        htmlwriter = ((HTMLWriter) (obj4));
        Object obj5 = allitem.getAttribute(j, m_settings.getUnitsType());
        htmlwriter = ((HTMLWriter) (obj4));
        irow.newCell().setText(((IItemAttribute) (obj5)).getName(), true);
        if (obj5 == null) goto _L4; else goto _L3
_L3:
        htmlwriter = ((HTMLWriter) (obj4));
        if (m_metrics[j] <= 0) goto _L6; else goto _L5
_L5:
        htmlwriter = ((HTMLWriter) (obj4));
        if (((IItemAttribute) (obj5)).passes(allitem, m_metrics[j])) goto _L6; else goto _L7
_L7:
        j = 1;
_L10:
        htmlwriter = ((HTMLWriter) (obj4));
        ((StringBuffer) (obj1)).setLength(0);
        htmlwriter = ((HTMLWriter) (obj4));
        ((IItemAttribute) (obj5)).format(allitem, ((StringBuffer) (obj1)));
        htmlwriter = ((HTMLWriter) (obj4));
        obj5 = irow1.newCell();
        htmlwriter = ((HTMLWriter) (obj4));
        ((com.vladium.emma.report.html.doc.HTMLTable.ICell) (obj5)).setText(((StringBuffer) (obj1)).toString(), true);
        if (!j) goto _L4; else goto _L8
_L8:
        htmlwriter = ((HTMLWriter) (obj4));
        ((com.vladium.emma.report.html.doc.HTMLTable.ICell) (obj5)).setClass("h");
          goto _L4
_L2:
        htmlwriter = ((HTMLWriter) (obj4));
        htmldocument.add(aiitem);
        htmlwriter = ((HTMLWriter) (obj4));
        htmldocument.addH(2, "OVERALL STATS SUMMARY", null);
        htmlwriter = ((HTMLWriter) (obj4));
        obj1 = new HTMLTable(null, null, null, "0");
        htmlwriter = ((HTMLWriter) (obj4));
        ((HTMLTable) (obj1)).setClass("it");
        htmlwriter = ((HTMLWriter) (obj4));
        aiitem = ((HTMLTable) (obj1)).newRow();
        htmlwriter = ((HTMLWriter) (obj4));
        aiitem.newCell().setText("total packages:", true);
        htmlwriter = ((HTMLWriter) (obj4));
        aiitem.newCell().setText((new StringBuilder()).append("").append(allitem.getChildCount()).toString(), false);
        htmlwriter = ((HTMLWriter) (obj4));
        if (!m_srcView)
        {
            break MISSING_BLOCK_LABEL_717;
        }
        htmlwriter = ((HTMLWriter) (obj4));
        if (!m_hasSrcFileInfo)
        {
            break MISSING_BLOCK_LABEL_717;
        }
        htmlwriter = ((HTMLWriter) (obj4));
        aiitem = ((HTMLTable) (obj1)).newRow();
        htmlwriter = ((HTMLWriter) (obj4));
        aiitem.newCell().setText("total executable files:", true);
        htmlwriter = ((HTMLWriter) (obj4));
        aiitem.newCell().setText((new StringBuilder()).append("").append(allitem.getAggregate(12)).toString(), false);
        htmlwriter = ((HTMLWriter) (obj4));
        aiitem = ((HTMLTable) (obj1)).newRow();
        htmlwriter = ((HTMLWriter) (obj4));
        aiitem.newCell().setText("total classes:", true);
        htmlwriter = ((HTMLWriter) (obj4));
        aiitem.newCell().setText((new StringBuilder()).append("").append(allitem.getAggregate(11)).toString(), true);
        htmlwriter = ((HTMLWriter) (obj4));
        aiitem = ((HTMLTable) (obj1)).newRow();
        htmlwriter = ((HTMLWriter) (obj4));
        aiitem.newCell().setText("total methods:", true);
        htmlwriter = ((HTMLWriter) (obj4));
        aiitem.newCell().setText((new StringBuilder()).append("").append(allitem.getAggregate(10)).toString(), true);
        htmlwriter = ((HTMLWriter) (obj4));
        if (!m_srcView)
        {
            break MISSING_BLOCK_LABEL_960;
        }
        htmlwriter = ((HTMLWriter) (obj4));
        if (!m_hasSrcFileInfo)
        {
            break MISSING_BLOCK_LABEL_960;
        }
        htmlwriter = ((HTMLWriter) (obj4));
        if (!m_hasLineNumberInfo)
        {
            break MISSING_BLOCK_LABEL_960;
        }
        htmlwriter = ((HTMLWriter) (obj4));
        aiitem = ((HTMLTable) (obj1)).newRow();
        htmlwriter = ((HTMLWriter) (obj4));
        aiitem.newCell().setText("total executable lines:", true);
        htmlwriter = ((HTMLWriter) (obj4));
        aiitem.newCell().setText((new StringBuilder()).append("").append(allitem.getAggregate(7)).toString(), true);
        htmlwriter = ((HTMLWriter) (obj4));
        htmldocument.add(((IContent) (obj1)));
        htmlwriter = ((HTMLWriter) (obj4));
        boolean flag;
        int ai[];
        Object obj3;
        HTMLTable htmltable;
        Iterator iterator;
        IItem iitem;
        if (m_settings.getDepth() > allitem.getMetadata().getTypeID())
        {
            i = 1;
        } else
        {
            i = 0;
        }
        htmlwriter = ((HTMLWriter) (obj4));
        htmldocument.addH(2, "COVERAGE BREAKDOWN BY PACKAGE", null);
        htmlwriter = ((HTMLWriter) (obj4));
        htmltable = new HTMLTable("100%", null, null, "0");
        obj3 = null;
        flag = true;
        htmlwriter = ((HTMLWriter) (obj4));
        iterator = allitem.getChildren(m_typeSortComparators[PackageItem.getTypeMetadata().getTypeID()]);
_L11:
        htmlwriter = ((HTMLWriter) (obj4));
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_1167;
        }
        htmlwriter = ((HTMLWriter) (obj4));
        iitem = (IItem)iterator.next();
        ai = ((int []) (obj3));
        if (obj3 != null)
        {
            break MISSING_BLOCK_LABEL_1109;
        }
        htmlwriter = ((HTMLWriter) (obj4));
        ai = addHeaderRow(iitem, htmltable, ai1);
        obj3 = null;
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_1129;
        }
        htmlwriter = ((HTMLWriter) (obj4));
        obj3 = getItemHREF(allitem, iitem);
        htmlwriter = ((HTMLWriter) (obj4));
        addItemRow(iitem, flag, htmltable, ai, ((String) (obj3)), false);
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_1234;
        }
        htmlwriter = ((HTMLWriter) (obj4));
        m_queue.addLast(iitem);
        break MISSING_BLOCK_LABEL_1234;
        htmlwriter = ((HTMLWriter) (obj4));
        htmldocument.add(htmltable);
        htmlwriter = ((HTMLWriter) (obj4));
        htmldocument.emit(((HTMLWriter) (obj4)));
        htmlwriter = ((HTMLWriter) (obj4));
        ((HTMLWriter) (obj4)).flush();
        if (obj4 != null)
        {
            ((HTMLWriter) (obj4)).close();
        }
        return obj;
        allitem;
        if (htmlwriter != null)
        {
            htmlwriter.close();
        }
        throw allitem;
_L4:
        i++;
          goto _L9
_L6:
        j = 0;
          goto _L10
        if (!flag)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj3 = ai;
          goto _L11
    }

    public Object visit(ClassItem classitem, Object obj)
    {
        HTMLWriter htmlwriter;
        StringBuffer stringbuffer;
        stringbuffer = null;
        htmlwriter = stringbuffer;
        Object obj1 = getItemFile(NESTED_ITEMS_PARENT_DIR, m_reportIDNamespace.getID(getItemKey(classitem)));
        htmlwriter = stringbuffer;
        obj1 = openOutFile(Files.newFile(m_settings.getOutDir(), ((File) (obj1))), m_settings.getOutEncoding(), true);
        htmlwriter = ((HTMLWriter) (obj1));
        int ai1[] = m_settings.getColumnOrder();
        htmlwriter = ((HTMLWriter) (obj1));
        stringbuffer = new StringBuffer();
        htmlwriter = ((HTMLWriter) (obj1));
        HTMLDocument htmldocument = createPage("EMMA Coverage Report");
        htmlwriter = ((HTMLWriter) (obj1));
        IItem aiitem[] = getParentPath(classitem);
        htmlwriter = ((HTMLWriter) (obj1));
        addPageHeader(htmldocument, classitem, aiitem);
        htmlwriter = ((HTMLWriter) (obj1));
        addPageFooter(htmldocument, classitem, aiitem);
        htmlwriter = ((HTMLWriter) (obj1));
        Object obj2 = com.vladium.emma.report.html.doc.IElement.Factory.create(Tag.SPAN);
        htmlwriter = ((HTMLWriter) (obj1));
        ((IElement) (obj2)).setText(classitem.getName(), true);
        htmlwriter = ((HTMLWriter) (obj1));
        ((IElement) (obj2)).setClass("in");
        htmlwriter = ((HTMLWriter) (obj1));
        Object obj3 = new ElementList();
        htmlwriter = ((HTMLWriter) (obj1));
        ((IElementList) (obj3)).add(new Text("COVERAGE SUMMARY FOR CLASS [", true));
        htmlwriter = ((HTMLWriter) (obj1));
        ((IElementList) (obj3)).add(((IContent) (obj2)));
        htmlwriter = ((HTMLWriter) (obj1));
        ((IElementList) (obj3)).add(new Text("]", true));
        htmlwriter = ((HTMLWriter) (obj1));
        htmldocument.addH(1, ((IContent) (obj3)), null);
        htmlwriter = ((HTMLWriter) (obj1));
        obj2 = new HTMLTable("100%", null, null, "0");
        htmlwriter = ((HTMLWriter) (obj1));
        obj3 = ((HTMLTable) (obj2)).newTitleRow();
        htmlwriter = ((HTMLWriter) (obj1));
        Object obj4 = ((HTMLTable) (obj2)).newRow();
        int i = 0;
_L9:
        htmlwriter = ((HTMLWriter) (obj1));
        if (i >= ai1.length) goto _L2; else goto _L1
_L1:
        int j;
        j = ai1[i];
        htmlwriter = ((HTMLWriter) (obj1));
        Object obj5 = classitem.getAttribute(j, m_settings.getUnitsType());
        htmlwriter = ((HTMLWriter) (obj1));
        ((com.vladium.emma.report.html.doc.HTMLTable.IRow) (obj3)).newCell().setText(((IItemAttribute) (obj5)).getName(), true);
        if (obj5 == null) goto _L4; else goto _L3
_L3:
        htmlwriter = ((HTMLWriter) (obj1));
        if (m_metrics[j] <= 0) goto _L6; else goto _L5
_L5:
        htmlwriter = ((HTMLWriter) (obj1));
        if (((IItemAttribute) (obj5)).passes(classitem, m_metrics[j])) goto _L6; else goto _L7
_L7:
        j = 1;
_L10:
        htmlwriter = ((HTMLWriter) (obj1));
        stringbuffer.setLength(0);
        htmlwriter = ((HTMLWriter) (obj1));
        ((IItemAttribute) (obj5)).format(classitem, stringbuffer);
        htmlwriter = ((HTMLWriter) (obj1));
        obj5 = ((com.vladium.emma.report.html.doc.HTMLTable.IRow) (obj4)).newCell();
        htmlwriter = ((HTMLWriter) (obj1));
        ((com.vladium.emma.report.html.doc.HTMLTable.ICell) (obj5)).setText(stringbuffer.toString(), true);
        if (!j) goto _L4; else goto _L8
_L8:
        htmlwriter = ((HTMLWriter) (obj1));
        ((com.vladium.emma.report.html.doc.HTMLTable.ICell) (obj5)).setClass("h");
          goto _L4
_L2:
        htmlwriter = ((HTMLWriter) (obj1));
        htmldocument.add(((IContent) (obj2)));
        htmlwriter = ((HTMLWriter) (obj1));
        htmldocument.addH(2, "COVERAGE BREAKDOWN BY METHOD", null);
        htmlwriter = ((HTMLWriter) (obj1));
        obj2 = new HTMLTable("100%", null, null, "0");
        boolean flag;
        stringbuffer = null;
        flag = true;
        htmlwriter = ((HTMLWriter) (obj1));
        obj3 = classitem.getChildren(m_typeSortComparators[MethodItem.getTypeMetadata().getTypeID()]);
        classitem = stringbuffer;
_L11:
        htmlwriter = ((HTMLWriter) (obj1));
        if (!((Iterator) (obj3)).hasNext())
        {
            break MISSING_BLOCK_LABEL_614;
        }
        htmlwriter = ((HTMLWriter) (obj1));
        obj4 = (MethodItem)((Iterator) (obj3)).next();
        int ai[];
        ai = classitem;
        if (classitem != null)
        {
            break MISSING_BLOCK_LABEL_586;
        }
        htmlwriter = ((HTMLWriter) (obj1));
        ai = addHeaderRow(((IItem) (obj4)), ((HTMLTable) (obj2)), ai1);
        htmlwriter = ((HTMLWriter) (obj1));
        addItemRow(((IItem) (obj4)), flag, ((HTMLTable) (obj2)), ai, null, false);
        if (!flag)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        break MISSING_BLOCK_LABEL_681;
        htmlwriter = ((HTMLWriter) (obj1));
        htmldocument.add(((IContent) (obj2)));
        htmlwriter = ((HTMLWriter) (obj1));
        htmldocument.emit(((HTMLWriter) (obj1)));
        htmlwriter = ((HTMLWriter) (obj1));
        ((HTMLWriter) (obj1)).flush();
        if (obj1 != null)
        {
            ((HTMLWriter) (obj1)).close();
        }
        return obj;
        classitem;
        if (htmlwriter != null)
        {
            htmlwriter.close();
        }
        throw classitem;
_L4:
        i++;
          goto _L9
_L6:
        j = 0;
          goto _L10
        classitem = ai;
          goto _L11
    }

    public Object visit(PackageItem packageitem, Object obj)
    {
        HTMLWriter htmlwriter;
        Object obj1;
        obj1 = null;
        htmlwriter = ((HTMLWriter) (obj1));
        if (!m_verbose)
        {
            break MISSING_BLOCK_LABEL_52;
        }
        htmlwriter = ((HTMLWriter) (obj1));
        m_log.verbose((new StringBuilder()).append("  report: processing package [").append(packageitem.getName()).append("] ...").toString());
        htmlwriter = ((HTMLWriter) (obj1));
        Object obj2 = getItemFile(NESTED_ITEMS_PARENT_DIR, m_reportIDNamespace.getID(getItemKey(packageitem)));
        htmlwriter = ((HTMLWriter) (obj1));
        HTMLWriter htmlwriter1 = openOutFile(Files.newFile(m_settings.getOutDir(), ((File) (obj2))), m_settings.getOutEncoding(), true);
        htmlwriter = htmlwriter1;
        int ai[] = m_settings.getColumnOrder();
        htmlwriter = htmlwriter1;
        obj1 = new StringBuffer();
        htmlwriter = htmlwriter1;
        HTMLDocument htmldocument = createPage("EMMA Coverage Report");
        htmlwriter = htmlwriter1;
        IItem aiitem[] = getParentPath(packageitem);
        htmlwriter = htmlwriter1;
        addPageHeader(htmldocument, packageitem, aiitem);
        htmlwriter = htmlwriter1;
        addPageFooter(htmldocument, packageitem, aiitem);
        htmlwriter = htmlwriter1;
        aiitem = com.vladium.emma.report.html.doc.IElement.Factory.create(Tag.SPAN);
        htmlwriter = htmlwriter1;
        aiitem.setText(packageitem.getName(), true);
        htmlwriter = htmlwriter1;
        aiitem.setClass("in");
        htmlwriter = htmlwriter1;
        Object obj4 = new ElementList();
        htmlwriter = htmlwriter1;
        ((IElementList) (obj4)).add(new Text("COVERAGE SUMMARY FOR PACKAGE [", true));
        htmlwriter = htmlwriter1;
        ((IElementList) (obj4)).add(aiitem);
        htmlwriter = htmlwriter1;
        ((IElementList) (obj4)).add(new Text("]", true));
        htmlwriter = htmlwriter1;
        htmldocument.addH(1, ((IContent) (obj4)), null);
        htmlwriter = htmlwriter1;
        aiitem = new HTMLTable("100%", null, null, "0");
        htmlwriter = htmlwriter1;
        obj4 = aiitem.newTitleRow();
        htmlwriter = htmlwriter1;
        com.vladium.emma.report.html.doc.HTMLTable.IRow irow = aiitem.newRow();
        int i = 0;
_L14:
        htmlwriter = htmlwriter1;
        if (i >= ai.length) goto _L2; else goto _L1
_L1:
        int j;
        j = ai[i];
        htmlwriter = htmlwriter1;
        Object obj5 = packageitem.getAttribute(j, m_settings.getUnitsType());
        htmlwriter = htmlwriter1;
        ((com.vladium.emma.report.html.doc.HTMLTable.IRow) (obj4)).newCell().setText(((IItemAttribute) (obj5)).getName(), true);
        if (obj5 == null) goto _L4; else goto _L3
_L3:
        htmlwriter = htmlwriter1;
        if (m_metrics[j] <= 0) goto _L6; else goto _L5
_L5:
        htmlwriter = htmlwriter1;
        if (((IItemAttribute) (obj5)).passes(packageitem, m_metrics[j])) goto _L6; else goto _L7
_L7:
        j = 1;
_L15:
        htmlwriter = htmlwriter1;
        ((StringBuffer) (obj1)).setLength(0);
        htmlwriter = htmlwriter1;
        ((IItemAttribute) (obj5)).format(packageitem, ((StringBuffer) (obj1)));
        htmlwriter = htmlwriter1;
        obj5 = irow.newCell();
        htmlwriter = htmlwriter1;
        ((com.vladium.emma.report.html.doc.HTMLTable.ICell) (obj5)).setText(((StringBuffer) (obj1)).toString(), true);
        if (j == 0) goto _L4; else goto _L8
_L8:
        htmlwriter = htmlwriter1;
        ((com.vladium.emma.report.html.doc.HTMLTable.ICell) (obj5)).setClass("h");
          goto _L4
_L2:
        htmlwriter = htmlwriter1;
        htmldocument.add(aiitem);
        htmlwriter = htmlwriter1;
        boolean flag;
        Object obj3;
        HTMLTable htmltable;
        Iterator iterator;
        IItem iitem;
        if (m_settings.getDepth() > packageitem.getMetadata().getTypeID())
        {
            i = 1;
        } else
        {
            i = 0;
        }
        htmlwriter = htmlwriter1;
        if (m_srcView)
        {
            obj1 = "COVERAGE BREAKDOWN BY SOURCE FILE";
        } else
        {
            obj1 = "COVERAGE BREAKDOWN BY CLASS";
        }
        htmlwriter = htmlwriter1;
        htmldocument.addH(2, ((String) (obj1)), null);
        htmlwriter = htmlwriter1;
        htmltable = new HTMLTable("100%", null, null, "0");
        obj3 = null;
        flag = true;
        htmlwriter = htmlwriter1;
        obj1 = m_typeSortComparators;
        htmlwriter = htmlwriter1;
        if (!m_srcView) goto _L10; else goto _L9
_L9:
        htmlwriter = htmlwriter1;
        j = SrcFileItem.getTypeMetadata().getTypeID();
_L13:
        htmlwriter = htmlwriter1;
        iterator = packageitem.getChildren(obj1[j]);
_L16:
        htmlwriter = htmlwriter1;
        if (!iterator.hasNext()) goto _L12; else goto _L11
_L11:
        htmlwriter = htmlwriter1;
        iitem = (IItem)iterator.next();
        obj1 = obj3;
        if (obj3 != null)
        {
            break MISSING_BLOCK_LABEL_697;
        }
        htmlwriter = htmlwriter1;
        obj1 = addHeaderRow(iitem, htmltable, ai);
        obj3 = null;
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_717;
        }
        htmlwriter = htmlwriter1;
        obj3 = getItemHREF(packageitem, iitem);
        htmlwriter = htmlwriter1;
        addItemRow(iitem, flag, htmltable, ((int []) (obj1)), ((String) (obj3)), false);
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_838;
        }
        htmlwriter = htmlwriter1;
        m_queue.addLast(iitem);
        break MISSING_BLOCK_LABEL_838;
_L10:
        htmlwriter = htmlwriter1;
        j = ClassItem.getTypeMetadata().getTypeID();
          goto _L13
_L12:
        htmlwriter = htmlwriter1;
        htmldocument.add(htmltable);
        htmlwriter = htmlwriter1;
        htmldocument.emit(htmlwriter1);
        htmlwriter = htmlwriter1;
        htmlwriter1.flush();
        if (htmlwriter1 != null)
        {
            htmlwriter1.close();
        }
        return obj;
        packageitem;
        if (htmlwriter != null)
        {
            htmlwriter.close();
        }
        throw packageitem;
_L4:
        i++;
          goto _L14
_L6:
        j = 0;
          goto _L15
        if (!flag)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj3 = obj1;
          goto _L16
    }

    public Object visit(SrcFileItem srcfileitem, Object obj)
    {
        HTMLWriter htmlwriter;
        Object obj1;
        obj1 = null;
        htmlwriter = ((HTMLWriter) (obj1));
        Object obj2 = getItemFile(NESTED_ITEMS_PARENT_DIR, m_reportIDNamespace.getID(getItemKey(srcfileitem)));
        htmlwriter = ((HTMLWriter) (obj1));
        HTMLWriter htmlwriter1 = openOutFile(Files.newFile(m_settings.getOutDir(), ((File) (obj2))), m_settings.getOutEncoding(), true);
        htmlwriter = htmlwriter1;
        int ai1[] = m_settings.getColumnOrder();
        htmlwriter = htmlwriter1;
        obj1 = new StringBuffer();
        htmlwriter = htmlwriter1;
        HTMLDocument htmldocument = createPage("EMMA Coverage Report");
        htmlwriter = htmlwriter1;
        IItem aiitem[] = getParentPath(srcfileitem);
        htmlwriter = htmlwriter1;
        addPageHeader(htmldocument, srcfileitem, aiitem);
        htmlwriter = htmlwriter1;
        addPageFooter(htmldocument, srcfileitem, aiitem);
        htmlwriter = htmlwriter1;
        aiitem = com.vladium.emma.report.html.doc.IElement.Factory.create(Tag.SPAN);
        htmlwriter = htmlwriter1;
        aiitem.setText(srcfileitem.getName(), true);
        htmlwriter = htmlwriter1;
        aiitem.setClass("in");
        htmlwriter = htmlwriter1;
        Object obj3 = new ElementList();
        htmlwriter = htmlwriter1;
        ((IElementList) (obj3)).add(new Text("COVERAGE SUMMARY FOR SOURCE FILE [", true));
        htmlwriter = htmlwriter1;
        ((IElementList) (obj3)).add(aiitem);
        htmlwriter = htmlwriter1;
        ((IElementList) (obj3)).add(new Text("]", true));
        htmlwriter = htmlwriter1;
        htmldocument.addH(1, ((IContent) (obj3)), null);
        htmlwriter = htmlwriter1;
        aiitem = new HTMLTable("100%", null, null, "0");
        htmlwriter = htmlwriter1;
        obj3 = aiitem.newTitleRow();
        htmlwriter = htmlwriter1;
        Object obj4 = aiitem.newRow();
        int i = 0;
_L25:
        htmlwriter = htmlwriter1;
        if (i >= ai1.length) goto _L2; else goto _L1
_L1:
        int j;
        j = ai1[i];
        htmlwriter = htmlwriter1;
        Object obj5 = srcfileitem.getAttribute(j, m_settings.getUnitsType());
        htmlwriter = htmlwriter1;
        ((com.vladium.emma.report.html.doc.HTMLTable.IRow) (obj3)).newCell().setText(((IItemAttribute) (obj5)).getName(), true);
        if (obj5 == null) goto _L4; else goto _L3
_L3:
        htmlwriter = htmlwriter1;
        if (m_metrics[j] <= 0) goto _L6; else goto _L5
_L5:
        htmlwriter = htmlwriter1;
        if (((IItemAttribute) (obj5)).passes(srcfileitem, m_metrics[j])) goto _L6; else goto _L7
_L7:
        j = 1;
_L26:
        htmlwriter = htmlwriter1;
        ((StringBuffer) (obj1)).setLength(0);
        htmlwriter = htmlwriter1;
        ((IItemAttribute) (obj5)).format(srcfileitem, ((StringBuffer) (obj1)));
        htmlwriter = htmlwriter1;
        obj5 = ((com.vladium.emma.report.html.doc.HTMLTable.IRow) (obj4)).newCell();
        htmlwriter = htmlwriter1;
        ((com.vladium.emma.report.html.doc.HTMLTable.ICell) (obj5)).setText(((StringBuffer) (obj1)).toString(), true);
        if (j == 0) goto _L4; else goto _L8
_L8:
        htmlwriter = htmlwriter1;
        ((com.vladium.emma.report.html.doc.HTMLTable.ICell) (obj5)).setClass("h");
          goto _L4
_L2:
        htmlwriter = htmlwriter1;
        htmldocument.add(aiitem);
        htmlwriter = htmlwriter1;
        int ai[];
        Iterator iterator;
        Object obj6;
        MethodItem methoditem;
        boolean flag;
        boolean flag1;
        if (m_settings.getDepth() > ClassItem.getTypeMetadata().getTypeID())
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (i == 0) goto _L10; else goto _L9
_L9:
        htmlwriter = htmlwriter1;
        if (!srcFileAvailable(srcfileitem, m_cache)) goto _L10; else goto _L11
_L11:
        j = 1;
_L27:
        if (j == 0) goto _L13; else goto _L12
_L12:
        htmlwriter = htmlwriter1;
        if (!m_hasLineNumberInfo) goto _L13; else goto _L14
_L14:
        flag1 = true;
_L28:
        if (!flag1) goto _L16; else goto _L15
_L15:
        htmlwriter = htmlwriter1;
        obj1 = new IDGenerator();
_L29:
        htmlwriter = htmlwriter1;
        htmldocument.addH(2, "COVERAGE BREAKDOWN BY CLASS AND METHOD", null);
        if (j == 0) goto _L18; else goto _L17
_L17:
        htmlwriter = htmlwriter1;
        aiitem = new IntObjectMap();
_L30:
        htmlwriter = htmlwriter1;
        obj5 = new HTMLTable("100%", null, null, "0");
        htmlwriter = htmlwriter1;
        ((HTMLTable) (obj5)).setClass("cn");
        obj4 = null;
        htmlwriter = htmlwriter1;
        obj3 = m_typeSortComparators[ClassItem.getTypeMetadata().getTypeID()];
        j = 0;
        htmlwriter = htmlwriter1;
        iterator = srcfileitem.getChildren(((com.vladium.emma.report.ItemComparator) (obj3)));
_L31:
        htmlwriter = htmlwriter1;
        if (!iterator.hasNext()) goto _L20; else goto _L19
_L19:
        htmlwriter = htmlwriter1;
        obj6 = (ClassItem)iterator.next();
        ai = ((int []) (obj4));
        if (obj4 != null)
        {
            break MISSING_BLOCK_LABEL_702;
        }
        htmlwriter = htmlwriter1;
        ai = addHeaderRow(((IItem) (obj6)), ((HTMLTable) (obj5)), ai1);
        obj4 = null;
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_742;
        }
        htmlwriter = htmlwriter1;
        obj4 = getItemKey(((IItem) (obj6)));
        htmlwriter = htmlwriter1;
        obj4 = addLineAnchorID(((ClassItem) (obj6)).getFirstLine(), ((IDGenerator) (obj1)).getID(((String) (obj4))), aiitem);
        htmlwriter = htmlwriter1;
        addClassRow(((ClassItem) (obj6)), j, ((HTMLTable) (obj5)), ai, ((String) (obj4)), flag1);
        flag = false;
        htmlwriter = htmlwriter1;
        obj6 = ((ClassItem) (obj6)).getChildren(m_typeSortComparators[MethodItem.getTypeMetadata().getTypeID()]);
_L22:
        htmlwriter = htmlwriter1;
        if (!((Iterator) (obj6)).hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        htmlwriter = htmlwriter1;
        methoditem = (MethodItem)((Iterator) (obj6)).next();
        obj4 = null;
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_855;
        }
        htmlwriter = htmlwriter1;
        obj4 = getItemKey(methoditem);
        htmlwriter = htmlwriter1;
        obj4 = addLineAnchorID(methoditem.getFirstLine(), ((IDGenerator) (obj1)).getID(((String) (obj4))), aiitem);
        htmlwriter = htmlwriter1;
        addClassItemRow(methoditem, flag, ((HTMLTable) (obj5)), ai, ((String) (obj4)), flag1);
        if (!flag)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (true) goto _L22; else goto _L21
_L20:
        htmlwriter = htmlwriter1;
        htmldocument.add(((IContent) (obj5)));
        if (i == 0) goto _L24; else goto _L23
_L23:
        htmlwriter = htmlwriter1;
        htmldocument.addEmptyP();
        htmlwriter = htmlwriter1;
        embedSrcFile(srcfileitem, htmldocument, aiitem, m_cache);
_L24:
        htmlwriter = htmlwriter1;
        htmldocument.emit(htmlwriter1);
        htmlwriter = htmlwriter1;
        htmlwriter1.flush();
        if (htmlwriter1 != null)
        {
            htmlwriter1.close();
        }
        return obj;
        srcfileitem;
        if (htmlwriter != null)
        {
            htmlwriter.close();
        }
        throw srcfileitem;
_L4:
        i++;
          goto _L25
_L6:
        j = 0;
          goto _L26
_L10:
        j = 0;
          goto _L27
_L13:
        flag1 = false;
          goto _L28
_L16:
        obj1 = null;
          goto _L29
_L18:
        aiitem = null;
          goto _L30
_L21:
        j++;
        obj4 = ai;
          goto _L31
    }

    static 
    {
        IItemMetadata aiitemmetadata[] = com.vladium.emma.report.IItemMetadata.Factory.getAllTypes();
        ATTRIBUTE_SETS = new long[aiitemmetadata.length];
        for (int i = 0; i < aiitemmetadata.length; i++)
        {
            ATTRIBUTE_SETS[aiitemmetadata[i].getTypeID()] = aiitemmetadata[i].getAttributeIDs();
        }

        NESTING = (int[][])Array.newInstance(Integer.TYPE, new int[] {
            4, 4
        });
        int j = AllItem.getTypeMetadata().getTypeID();
        NESTING[j][PackageItem.getTypeMetadata().getTypeID()] = 1;
        NESTING[j][SrcFileItem.getTypeMetadata().getTypeID()] = 1;
        NESTING[j][ClassItem.getTypeMetadata().getTypeID()] = 1;
        j = PackageItem.getTypeMetadata().getTypeID();
        NESTING[j][AllItem.getTypeMetadata().getTypeID()] = -1;
        j = SrcFileItem.getTypeMetadata().getTypeID();
        NESTING[j][AllItem.getTypeMetadata().getTypeID()] = -1;
        j = ClassItem.getTypeMetadata().getTypeID();
        NESTING[j][AllItem.getTypeMetadata().getTypeID()] = -1;
    }
}
