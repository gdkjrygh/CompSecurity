// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.emma.report;

import com.vladium.emma.EMMARuntimeException;
import com.vladium.emma.data.ClassDescriptor;
import com.vladium.emma.data.ICoverageData;
import com.vladium.emma.data.IMetaData;
import com.vladium.emma.data.MethodDescriptor;
import com.vladium.util.Descriptors;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

// Referenced classes of package com.vladium.emma.report:
//            IReportDataModel, IReportDataView, AllItem, PackageItem, 
//            SrcFileItem, ClassItem, MethodItem, IItem

final class ReportDataModel
    implements IReportDataModel
{
    private static final class ReportDataView
        implements IReportDataView
    {

        private final IItem m_root;

        public IItem getRoot()
        {
            return m_root;
        }

        ReportDataView(IItem iitem)
        {
            m_root = iitem;
        }
    }


    private final ICoverageData m_cdata;
    private final IMetaData m_mdata;
    private final IReportDataView m_views[];

    ReportDataModel(IMetaData imetadata, ICoverageData icoveragedata)
    {
        if (imetadata == null)
        {
            throw new IllegalArgumentException("null input: mdata");
        }
        if (icoveragedata == null)
        {
            throw new IllegalArgumentException("null input: cdata");
        } else
        {
            m_views = new IReportDataView[2];
            m_mdata = imetadata;
            m_cdata = icoveragedata;
            return;
        }
    }

    public IReportDataView getView(int i)
    {
        this;
        JVM INSTR monitorenter ;
        if (i >= m_views.length)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("invalid viewType: ").append(i).toString());
        }
        break MISSING_BLOCK_LABEL_43;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        Object obj = m_views[i];
        if (obj == null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return ((IReportDataView) (obj));
_L2:
        int j;
        PackageItem packageitem;
        Object obj1;
        boolean aflag[][];
        AllItem allitem;
        HashMap hashmap;
        HashMap hashmap1;
        Iterator iterator;
        Object obj2;
        Object obj3;
        String s;
        boolean flag;
        if (i == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_93;
        }
        if (!m_mdata.hasSrcFileData())
        {
            throw new IllegalStateException("source file data view requested for metadata with incomplete SourceFile debug info");
        }
        allitem = new AllItem();
        hashmap = new HashMap();
        hashmap1 = new HashMap();
        iterator = m_mdata.iterator();
_L20:
        if (!iterator.hasNext()) goto _L4; else goto _L3
_L3:
        obj2 = (ClassDescriptor)iterator.next();
        obj1 = ((ClassDescriptor) (obj2)).getPackageVMName();
        obj = (PackageItem)hashmap.get(obj1);
        packageitem = ((PackageItem) (obj));
        if (obj != null) goto _L6; else goto _L5
_L5:
        if (((String) (obj1)).length() != 0) goto _L8; else goto _L7
_L7:
        obj = "default package";
_L10:
        packageitem = new PackageItem(allitem, ((String) (obj)), ((String) (obj1)));
        hashmap.put(obj1, packageitem);
        allitem.addChild(packageitem);
_L6:
        obj = null;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_294;
        }
        obj3 = ((ClassDescriptor) (obj2)).getSrcFileName();
        s = Descriptors.combineVMName(((String) (obj1)), ((String) (obj3)));
        obj1 = (SrcFileItem)hashmap1.get(s);
        obj = obj1;
        if (obj1 != null)
        {
            break MISSING_BLOCK_LABEL_294;
        }
        obj = new SrcFileItem(packageitem, ((String) (obj3)), s);
        hashmap1.put(s, obj);
        packageitem.addChild(((IItem) (obj)));
        obj1 = m_cdata.getCoverage(((ClassDescriptor) (obj2)));
        if (obj1 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (((com.vladium.emma.data.ICoverageData.DataHolder) (obj1)).m_stamp != ((ClassDescriptor) (obj2)).getStamp())
        {
            throw new EMMARuntimeException("CLASS_STAMP_MISMATCH", new Object[] {
                Descriptors.vmNameToJavaName(((ClassDescriptor) (obj2)).getClassVMName())
            });
        }
        break; /* Loop/switch isn't completed */
_L8:
        obj = Descriptors.vmNameToJavaName(((String) (obj1)));
        if (true) goto _L10; else goto _L9
_L9:
        if (obj1 == null) goto _L12; else goto _L11
_L11:
        aflag = ((com.vladium.emma.data.ICoverageData.DataHolder) (obj1)).m_coverage;
_L18:
        if (!flag) goto _L14; else goto _L13
_L13:
        aflag = new ClassItem(((IItem) (obj)), ((ClassDescriptor) (obj2)), aflag);
_L19:
        obj2 = ((ClassDescriptor) (obj2)).getMethods();
        j = 0;
_L21:
        if (j >= obj2.length) goto _L16; else goto _L15
_L15:
        obj3 = obj2[j];
        if ((((MethodDescriptor) (obj3)).getStatus() & 0xe) != 0)
        {
            break MISSING_BLOCK_LABEL_539;
        }
          goto _L17
_L12:
        aflag = (boolean[][])null;
          goto _L18
_L14:
        aflag = new ClassItem(packageitem, ((ClassDescriptor) (obj2)), aflag);
          goto _L19
_L17:
        aflag.addChild(new MethodItem(aflag, j, ((MethodDescriptor) (obj3)).getName(), ((MethodDescriptor) (obj3)).getDescriptor(), ((MethodDescriptor) (obj3)).getFirstLine()));
        break MISSING_BLOCK_LABEL_539;
_L16:
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_504;
        }
        ((SrcFileItem) (obj)).addChild(aflag);
          goto _L20
        packageitem.addChild(aflag);
          goto _L20
_L4:
        obj = new ReportDataView(allitem);
        m_views[i] = ((IReportDataView) (obj));
          goto _L1
        j++;
          goto _L21
    }
}
