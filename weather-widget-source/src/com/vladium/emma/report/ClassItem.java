// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.emma.report;

import com.vladium.emma.data.ClassDescriptor;
import com.vladium.emma.data.MethodDescriptor;
import com.vladium.util.IntObjectMap;
import java.util.Iterator;

// Referenced classes of package com.vladium.emma.report:
//            Item, IItemVisitor, MethodItem, IItem, 
//            IItemMetadata

public final class ClassItem extends Item
{

    private static final Item.ItemMetadata METADATA = new Item.ItemMetadata(3, "class", 31L);
    final ClassDescriptor m_cls;
    final boolean m_coverage[][];
    private int m_firstLine;

    public ClassItem(IItem iitem, ClassDescriptor classdescriptor, boolean aflag[][])
    {
        super(iitem);
        m_cls = classdescriptor;
        m_coverage = aflag;
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
        int ai4[];
label0:
        {
label1:
            {
                ai4 = m_aggregates;
                int j1 = ai4[i];
                int j = j1;
                if (j1 < 0)
                {
                    switch (i)
                    {
                    case 2: // '\002'
                    case 4: // '\004'
                    case 6: // '\006'
                    case 8: // '\b'
                    case 9: // '\t'
                    case 10: // '\n'
                    default:
                        j = super.getAggregate(i);
                        break;

                    case 1: // '\001'
                    case 3: // '\003'
                    case 7: // '\007'
                        break label0;

                    case 5: // '\005'
                    case 11: // '\013'
                        break label1;
                    }
                }
                return j;
            }
            ai4[11] = 1;
            int k;
            if (m_coverage != null)
            {
                k = 1;
            } else
            {
                k = 0;
            }
            ai4[5] = k;
            return ai4[i];
        }
        boolean aflag1[][] = m_coverage;
        IntObjectMap intobjectmap = new IntObjectMap();
        MethodDescriptor amethoddescriptor[] = m_cls.getMethods();
        for (Iterator iterator = getChildren(); iterator.hasNext();)
        {
            int l = ((MethodItem)iterator.next()).getID();
            boolean aflag[];
            MethodDescriptor methoddescriptor;
            int ai5[];
            IntObjectMap intobjectmap1;
            int ai6[];
            int j2;
            if (aflag1 == null)
            {
                aflag = null;
            } else
            {
                aflag = aflag1[l];
            }
            methoddescriptor = amethoddescriptor[l];
            ai5 = methoddescriptor.getBlockSizes();
            intobjectmap1 = methoddescriptor.getLineMap();
            ai6 = intobjectmap1.keys();
            l = 0;
            j2 = ai6.length;
            while (l < j2) 
            {
                int k1 = ai6[l];
                int ai3[] = (int[])(int[])intobjectmap.get(k1);
                int ai1[] = ai3;
                if (ai3 == null)
                {
                    ai1 = new int[4];
                    intobjectmap.put(k1, ai1);
                }
                ai3 = (int[])(int[])intobjectmap1.get(k1);
                int l2 = ai3.length;
                ai1[0] = ai1[0] + l2;
                k1 = 0;
                while (k1 < l2) 
                {
                    int j3 = ai3[k1];
                    boolean flag;
                    if (aflag != null && aflag[j3] != 0)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    j3 = ai5[j3];
                    ai1[1] = ai1[1] + j3;
                    if (flag)
                    {
                        ai1[2] = ai1[2] + 1;
                        ai1[3] = ai1[3] + j3;
                    }
                    k1++;
                }
                l++;
            }
        }

        ai4[7] = intobjectmap.size();
        int k2 = 0;
        int i1 = 0;
        int ai[] = intobjectmap.keys();
        int l1 = 0;
        for (int k3 = ai.length; l1 < k3;)
        {
            int ai2[] = (int[])(int[])intobjectmap.get(ai[l1]);
            int j4 = ai2[0];
            int l3 = ai2[1];
            int k4 = ai2[2];
            int i4 = ai2[3];
            int i3 = k2;
            int i2 = i1;
            if (i4 > 0)
            {
                i3 = k2 + (k4 * 100) / j4;
                i2 = i1 + (i4 * 100) / l3;
            }
            l1++;
            k2 = i3;
            i1 = i2;
        }

        ai4[1] = k2;
        ai4[3] = i1;
        return ai4[i];
    }

    public ClassDescriptor getClassDescriptor()
    {
        return m_cls;
    }

    public boolean[][] getCoverage()
    {
        return m_coverage;
    }

    public int getFirstLine()
    {
        if (m_firstLine == 0)
        {
            MethodDescriptor amethoddescriptor[] = m_cls.getMethods();
            int j = 0x7fffffff;
            int i = 0;
            for (int i1 = amethoddescriptor.length; i < i1;)
            {
                int l = amethoddescriptor[i].getFirstLine();
                int k = j;
                if (l > 0)
                {
                    k = j;
                    if (l < j)
                    {
                        k = l;
                    }
                }
                i++;
                j = k;
            }

            m_firstLine = j;
            return j;
        } else
        {
            return m_firstLine;
        }
    }

    public final IItemMetadata getMetadata()
    {
        return METADATA;
    }

    public String getName()
    {
        return m_cls.getName();
    }

    public String getSrcFileName()
    {
        return m_cls.getSrcFileName();
    }

    public boolean loaded()
    {
        return m_coverage != null;
    }

}
