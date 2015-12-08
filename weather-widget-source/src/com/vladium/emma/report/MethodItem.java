// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.emma.report;

import com.vladium.emma.data.ClassDescriptor;
import com.vladium.emma.data.MethodDescriptor;
import com.vladium.util.Descriptors;
import com.vladium.util.IntObjectMap;

// Referenced classes of package com.vladium.emma.report:
//            Item, IItemVisitor, ClassItem, IItem, 
//            IItemMetadata

public final class MethodItem extends Item
{

    private static final Item.ItemMetadata METADATA = new Item.ItemMetadata(4, "method", 29L);
    private final int m_ID;
    private final String m_descriptor;
    private final int m_firstLine;
    private final String m_name;
    private transient String m_userName;

    public MethodItem(IItem iitem, int i, String s, String s1, int j)
    {
        super(iitem);
        m_ID = i;
        m_name = s;
        m_descriptor = s1;
        m_firstLine = j;
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
        int ai[];
        int j;
        int l;
        ai = m_aggregates;
        l = ai[i];
        j = l;
        if (l >= 0) goto _L2; else goto _L1
_L1:
        ClassItem classitem;
        Object obj;
        classitem = (ClassItem)m_parent;
        obj = classitem.m_cls.getMethods()[m_ID];
        j = ((MethodDescriptor) (obj)).getStatus();
        if ((j & 0xe) == 0) goto _L4; else goto _L3
_L3:
        for (j = 0; j < ai.length; j++)
        {
            ai[j] = 0;
        }

          goto _L5
_L4:
        boolean aflag[];
        int ai1[];
        int i1;
        int j1;
        int k3;
        int k1;
        int i2;
        int i3;
        int l3;
        if ((j & 1) == 0)
        {
            j1 = 1;
        } else
        {
            j1 = 0;
        }
        if (classitem.m_coverage != null)
        {
            aflag = classitem.m_coverage[m_ID];
        } else
        {
            aflag = null;
        }
        k3 = ((MethodDescriptor) (obj)).getBlockCount();
        ai[10] = 1;
        ai[6] = k3;
        l = 0;
        i1 = 0;
        ai1 = ((MethodDescriptor) (obj)).getBlockSizes();
        if (aflag == null) goto _L7; else goto _L6
_L6:
        l = 0;
        boolean flag = false;
        j = 0;
        boolean flag1 = false;
        for (k1 = 0; k1 < k3;)
        {
            l3 = ai1[k1];
            i3 = i1 + l3;
            i2 = l;
            i1 = j;
            if (aflag[k1])
            {
                i2 = l + 1;
                i1 = j + l3;
            }
            k1++;
            l = i2;
            j = i1;
            i1 = i3;
        }

        if (j1 != 0)
        {
            obj = ((MethodDescriptor) (obj)).getLineMap();
            int k4 = ((IntObjectMap) (obj)).size();
            ai[7] = k4;
            int ai2[] = ((IntObjectMap) (obj)).keys();
            j1 = 0;
            int l1 = ((flag1) ? 1 : 0);
            int j2 = ((flag) ? 1 : 0);
            for (; j1 < k4; j1++)
            {
                int ai3[] = (int[])(int[])((IntObjectMap) (obj)).get(ai2[j1]);
                int j3 = 0;
                int l4 = ai3.length;
                int k2 = 0;
                k3 = 0;
                for (int l2 = 0; l2 < l4;)
                {
                    int j5 = ai3[l2];
                    int i5 = ai1[j5];
                    int j4 = k3 + i5;
                    int i4 = j3;
                    k3 = k2;
                    if (aflag[j5])
                    {
                        i4 = j3 + 1;
                        k3 = k2 + i5;
                    }
                    l2++;
                    j3 = i4;
                    k2 = k3;
                    k3 = j4;
                }

                j2 += (j3 * 100) / l4;
                l1 += (k2 * 100) / k3;
            }

            ai[1] = j2;
            ai[3] = l1;
        }
        ai[8] = i1;
        if (l > 0)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        ai[4] = i1;
        ai[0] = l;
        ai[2] = j;
_L5:
        j = ai[i];
_L2:
        return j;
_L7:
        for (int k = 0; k < k3; k++)
        {
            l += ai1[k];
        }

        ai[8] = l;
        ai[4] = 0;
        ai[0] = 0;
        ai[2] = 0;
        if (j1 != 0)
        {
            ai[7] = ((MethodDescriptor) (obj)).getLineMap().size();
            ai[1] = 0;
            ai[3] = 0;
        }
        if (true) goto _L5; else goto _L8
_L8:
    }

    public int getFirstLine()
    {
        return m_firstLine;
    }

    public int getID()
    {
        return m_ID;
    }

    public final IItemMetadata getMetadata()
    {
        return METADATA;
    }

    public String getName()
    {
        if (m_userName == null)
        {
            m_userName = Descriptors.methodVMNameToJavaName(m_parent.getName(), m_name, m_descriptor, true, true, true);
        }
        return m_userName;
    }

}
