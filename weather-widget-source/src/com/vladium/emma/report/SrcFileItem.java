// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.emma.report;

import com.vladium.emma.data.ClassDescriptor;
import com.vladium.emma.data.MethodDescriptor;
import com.vladium.util.IntObjectMap;
import java.util.Iterator;

// Referenced classes of package com.vladium.emma.report:
//            Item, IItemVisitor, IItem, ClassItem, 
//            MethodItem, IItemMetadata

public final class SrcFileItem extends Item
{
    public final class LineCoverageData
    {

        public static final int LINE_COVERAGE_COMPLETE = 2;
        public static final int LINE_COVERAGE_PARTIAL = 1;
        public static final int LINE_COVERAGE_ZERO = 0;
        public final int m_coverageRatio[][];
        public final int m_coverageStatus;
        final SrcFileItem this$0;

        LineCoverageData(int i, int ai[][])
        {
            this$0 = SrcFileItem.this;
            super();
            m_coverageStatus = i;
            m_coverageRatio = ai;
        }
    }


    private static final Item.ItemMetadata METADATA = new Item.ItemMetadata(2, "srcfile", 31L);
    private int m_firstLine;
    private final String m_fullVMName;
    private IntObjectMap m_lineCoverage;
    private final String m_name;

    public SrcFileItem(IItem iitem, String s, String s1)
    {
        super(iitem);
        m_name = s;
        m_fullVMName = s1;
    }

    public static IItemMetadata getTypeMetadata()
    {
        return METADATA;
    }

    public void accept(IItemVisitor iitemvisitor, Object obj)
    {
        iitemvisitor.visit(this, obj);
    }

    public int getAggregate(int i)
    {
        int ai3[] = m_aggregates;
        int j = ai3[i];
        if (j < 0)
        {
            IntObjectMap intobjectmap1;
            Iterator iterator1;
            switch (i)
            {
            case 2: // '\002'
            case 4: // '\004'
            case 6: // '\006'
            case 8: // '\b'
            case 9: // '\t'
            case 10: // '\n'
            default:
                return super.getAggregate(i);

            case 5: // '\005'
            case 11: // '\013'
                ai3[11] = getChildCount();
                j = 0;
                for (Iterator iterator = getChildren(); iterator.hasNext();)
                {
                    j += ((IItem)iterator.next()).getAggregate(5);
                }

                ai3[5] = j;
                return ai3[i];

            case 12: // '\f'
                ai3[12] = 1;
                return 1;

            case 1: // '\001'
            case 3: // '\003'
            case 7: // '\007'
                intobjectmap1 = new IntObjectMap();
                iterator1 = getChildren();
                break;
            }
            while (iterator1.hasNext()) 
            {
                ClassItem classitem = (ClassItem)iterator1.next();
                boolean aflag1[][] = classitem.getCoverage();
                MethodDescriptor amethoddescriptor[] = classitem.getClassDescriptor().getMethods();
                Iterator iterator2 = classitem.getChildren();
                while (iterator2.hasNext()) 
                {
                    j = ((MethodItem)iterator2.next()).getID();
                    boolean aflag[];
                    MethodDescriptor methoddescriptor;
                    int ai4[];
                    IntObjectMap intobjectmap2;
                    int ai5[];
                    int j1;
                    if (aflag1 == null)
                    {
                        aflag = null;
                    } else
                    {
                        aflag = aflag1[j];
                    }
                    methoddescriptor = amethoddescriptor[j];
                    ai4 = methoddescriptor.getBlockSizes();
                    intobjectmap2 = methoddescriptor.getLineMap();
                    ai5 = intobjectmap2.keys();
                    j = 0;
                    j1 = ai5.length;
                    while (j < j1) 
                    {
                        int k = ai5[j];
                        int ai1[] = (int[])(int[])intobjectmap1.get(k);
                        int ai[] = ai1;
                        if (ai1 == null)
                        {
                            ai = new int[4];
                            intobjectmap1.put(k, ai);
                        }
                        ai1 = (int[])(int[])intobjectmap2.get(k);
                        int l1 = ai1.length;
                        ai[0] = ai[0] + l1;
                        k = 0;
                        while (k < l1) 
                        {
                            int j2 = ai1[k];
                            boolean flag;
                            if (aflag != null && aflag[j2] != 0)
                            {
                                flag = true;
                            } else
                            {
                                flag = false;
                            }
                            j2 = ai4[j2];
                            ai[1] = ai[1] + j2;
                            if (flag)
                            {
                                ai[2] = ai[2] + 1;
                                ai[3] = ai[3] + j2;
                            }
                            k++;
                        }
                        j++;
                    }
                }
            }
            int j3 = intobjectmap1.size();
            ai3[7] = j3;
            int k2 = 0;
            j = 0;
            IntObjectMap intobjectmap = new IntObjectMap(j3);
            int l = 0x7fffffff;
            int ai2[] = intobjectmap1.keys();
            int i1 = 0;
            while (i1 < j3) 
            {
                int i3 = ai2[i1];
                Object obj = (int[])(int[])intobjectmap1.get(i3);
                int l2 = obj[0];
                int k3 = obj[1];
                int l3 = obj[2];
                int i4 = obj[3];
                int i2 = k2;
                int k1 = j;
                if (i4 > 0)
                {
                    i2 = k2 + (l3 * 100) / l2;
                    k1 = j + (i4 * 100) / k3;
                }
                obj = (int[][])null;
                if (i4 == 0)
                {
                    j = 0;
                } else
                if (i4 == k3)
                {
                    j = 2;
                } else
                {
                    j = 1;
                    obj = new int[2][];
                    obj[0] = (new int[] {
                        l2, l3
                    });
                    obj[1] = (new int[] {
                        k3, i4
                    });
                }
                intobjectmap.put(i3, new LineCoverageData(j, ((int [][]) (obj))));
                l2 = l;
                if (i3 < l)
                {
                    l2 = i3;
                }
                i1++;
                k2 = i2;
                j = k1;
                l = l2;
            }
            m_lineCoverage = intobjectmap;
            m_firstLine = l;
            ai3[1] = k2;
            ai3[3] = j;
            return ai3[i];
        } else
        {
            return j;
        }
    }

    public int getFirstLine()
    {
        if (m_firstLine == 0)
        {
            getAggregate(7);
        }
        return m_firstLine;
    }

    public String getFullVMName()
    {
        return m_fullVMName;
    }

    public IntObjectMap getLineCoverage()
    {
        if (m_lineCoverage == null)
        {
            getAggregate(7);
        }
        return m_lineCoverage;
    }

    public final IItemMetadata getMetadata()
    {
        return METADATA;
    }

    public String getName()
    {
        return m_name;
    }

}
