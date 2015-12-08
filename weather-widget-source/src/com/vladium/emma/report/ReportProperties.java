// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.emma.report;

import com.vladium.emma.EMMARuntimeException;
import com.vladium.emma.IAppErrorCodes;
import com.vladium.util.Files;
import com.vladium.util.IProperties;
import com.vladium.util.IntIntMap;
import com.vladium.util.IntVector;
import com.vladium.util.ObjectIntMap;
import com.vladium.util.Property;
import java.io.File;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

// Referenced classes of package com.vladium.emma.report:
//            AllItem, IItemMetadata, PackageItem, SrcFileItem, 
//            ClassItem, MethodItem

public abstract class ReportProperties
    implements IAppErrorCodes
{
    public static final class ParsedProperties
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

        public ParsedProperties()
        {
        }
    }

    private static final class ReportPropertyMapper
        implements com.vladium.util.IProperties.IMapper
    {

        public String getMappedKey(String s)
        {
            if (s != null && s.startsWith("report."))
            {
                int i = s.indexOf('.', "report.".length());
                if (i > 0)
                {
                    return "report.".concat(s.substring(i + 1));
                }
            }
            return null;
        }

        private ReportPropertyMapper()
        {
        }

    }


    private static final ObjectIntMap COLUMNS;
    private static final boolean REMOVE_DUPLICATE_COLUMNS = true;
    public static final com.vladium.util.IProperties.IMapper REPORT_PROPERTY_MAPPER = new ReportPropertyMapper();

    private ReportProperties()
    {
    }

    private static String getReportProperty(IProperties iproperties, String s, String s1, boolean flag)
    {
        return getReportProperty(iproperties, s, s1, flag, null);
    }

    private static String getReportProperty(IProperties iproperties, String s, String s1, boolean flag, String s2)
    {
        iproperties = iproperties.getProperty("report.".concat(s).concat(".").concat(s1), s2);
        if (!flag && iproperties != null && iproperties.trim().length() == 0)
        {
            return s2;
        } else
        {
            return iproperties;
        }
    }

    public static ParsedProperties parseProperties(IProperties iproperties, String s)
    {
        Object obj;
        ParsedProperties parsedproperties;
        Object obj1;
        int ai[];
        parsedproperties = new ParsedProperties();
        parsedproperties.setOutEncoding(getReportProperty(iproperties, s, "out.encoding", false));
        obj = getReportProperty(iproperties, s, "out.dir", true);
        obj1 = getReportProperty(iproperties, s, "out.file", false);
        Object obj3;
        int i;
        if (obj1 != null)
        {
            obj = Files.newFile(((String) (obj)), ((String) (obj1)));
            obj1 = ((File) (obj)).getParentFile();
            if (obj1 != null)
            {
                parsedproperties.setOutDir(((File) (obj1)));
            }
            parsedproperties.setOutFile(new File(((File) (obj)).getName()));
        } else
        if (obj != null)
        {
            parsedproperties.setOutDir(new File(((String) (obj))));
        }
        if ("count".equals(getReportProperty(iproperties, s, "units", true, "instr")))
        {
            i = 0;
        } else
        {
            i = 1;
        }
        parsedproperties.setUnitsType(i);
        parsedproperties.setViewType(1);
        parsedproperties.setHideClasses(Property.toBoolean(getReportProperty(iproperties, s, "hideclasses", true, "true")));
        if (parsedproperties.getViewType() == 0)
        {
            parsedproperties.setHideClasses(false);
        }
        obj = getReportProperty(iproperties, s, "depth", false, "package");
        if ("all".equals(obj))
        {
            parsedproperties.setDepth(AllItem.getTypeMetadata().getTypeID());
        } else
        if ("package".equals(obj))
        {
            parsedproperties.setDepth(PackageItem.getTypeMetadata().getTypeID());
        } else
        if ("source".equals(obj))
        {
            parsedproperties.setDepth(SrcFileItem.getTypeMetadata().getTypeID());
        } else
        if ("class".equals(obj))
        {
            parsedproperties.setDepth(ClassItem.getTypeMetadata().getTypeID());
        } else
        if ("method".equals(obj))
        {
            parsedproperties.setDepth(MethodItem.getTypeMetadata().getTypeID());
        } else
        {
            throw new EMMARuntimeException("INVALID_PARAMETER_VALUE", new Object[] {
                "depth", obj
            });
        }
_L7:
        Object obj2;
        int ai1[];
        StringTokenizer stringtokenizer;
        if (parsedproperties.getHideClasses() && parsedproperties.getViewType() == 1 && parsedproperties.getDepth() == 3)
        {
            parsedproperties.setDepth(2);
        }
        obj1 = new HashSet();
        obj3 = getReportProperty(iproperties, s, "columns", false, "class,method,block,line,name");
        obj = new IntVector();
        ai = new int[1];
        for (obj3 = new StringTokenizer(((String) (obj3)), ","); ((StringTokenizer) (obj3)).hasMoreTokens();)
        {
            String s1 = ((StringTokenizer) (obj3)).nextToken().trim();
            if (!COLUMNS.get(s1, ai))
            {
                throw new EMMARuntimeException("INVALID_COLUMN_NAME", new Object[] {
                    s1
                });
            }
            if (!((Set) (obj1)).contains(s1))
            {
                ((Set) (obj1)).add(s1);
                ((IntVector) (obj)).add(ai[0]);
            }
        }

        parsedproperties.setColumnOrder(((IntVector) (obj)).values());
        obj = getReportProperty(iproperties, s, "sort", false, "+block,+name");
        obj2 = new IntVector();
        ai1 = new int[1];
        stringtokenizer = new StringTokenizer(((String) (obj)), ",");
_L2:
        int j;
        if (!stringtokenizer.hasMoreTokens())
        {
            break MISSING_BLOCK_LABEL_695;
        }
        obj = stringtokenizer.nextToken().trim();
        switch (((String) (obj)).charAt(0))
        {
        case 44: // ','
        default:
            j = 1;
            break;

        case 43: // '+'
            break; /* Loop/switch isn't completed */

        case 45: // '-'
            break MISSING_BLOCK_LABEL_681;
        }
_L3:
        if (((Set) (obj1)).contains(obj))
        {
            COLUMNS.get(obj, ai1);
            ((IntVector) (obj2)).add(ai1[0]);
            ((IntVector) (obj2)).add(j);
        }
        parsedproperties.setSortOrder(((IntVector) (obj2)).values());
        if (true) goto _L2; else goto _L1
_L1:
        j = 1;
        obj = ((String) (obj)).substring(1);
          goto _L3
        j = -1;
        obj = ((String) (obj)).substring(1);
          goto _L3
        obj = getReportProperty(iproperties, s, "metrics", true, "method:70,block:80,line:80,class:100");
        iproperties = new IntIntMap();
        s = new int[1];
        obj = new StringTokenizer(((String) (obj)), ",");
_L5:
        if (!((StringTokenizer) (obj)).hasMoreTokens())
        {
            break; /* Loop/switch isn't completed */
        }
        obj2 = ((StringTokenizer) (obj)).nextToken().trim();
        j = ((String) (obj2)).indexOf(':');
        if (j <= 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        double d = Double.parseDouble(((String) (obj2)).substring(j + 1));
        if (d >= 0.0D && d <= 101D)
        {
            obj2 = ((String) (obj2)).substring(0, j);
            if (((Set) (obj1)).contains(obj2))
            {
                COLUMNS.get(obj2, s);
                iproperties.put(s[0], (int)Math.round((100D * d) / 100D));
            }
        }
        continue; /* Loop/switch isn't completed */
        NumberFormatException numberformatexception;
        numberformatexception;
        numberformatexception.printStackTrace(System.out);
        if (true) goto _L5; else goto _L4
_L4:
        parsedproperties.setMetrics(iproperties);
        parsedproperties.validate();
        return parsedproperties;
        if (true) goto _L7; else goto _L6
_L6:
    }

    static 
    {
        ObjectIntMap objectintmap = new ObjectIntMap();
        objectintmap.put("name", 0);
        objectintmap.put("class", 1);
        objectintmap.put("method", 2);
        objectintmap.put("block", 3);
        objectintmap.put("line", 4);
        COLUMNS = objectintmap;
    }
}
