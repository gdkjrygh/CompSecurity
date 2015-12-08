// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.emma.data;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.vladium.emma.data:
//            ICoverageData, DataFactory, ClassDescriptor, IMergeable

final class CoverageData
    implements ICoverageData, Cloneable
{

    private HashMap m_coverageMap;

    CoverageData()
    {
        m_coverageMap = new HashMap();
    }

    private CoverageData(HashMap hashmap)
    {
        m_coverageMap = hashmap;
    }

    static CoverageData readExternal(DataInput datainput)
        throws IOException
    {
        int k = datainput.readInt();
        HashMap hashmap = new HashMap(k);
        for (int i = 0; i < k; i++)
        {
            String s = datainput.readUTF();
            long l1 = datainput.readLong();
            int l = datainput.readInt();
            boolean aflag[][] = new boolean[l][];
            for (int j = 0; j < l; j++)
            {
                aflag[j] = DataFactory.readBooleanArray(datainput);
            }

            hashmap.put(s, new ICoverageData.DataHolder(aflag, l1));
        }

        return new CoverageData(hashmap);
    }

    static void writeExternal(CoverageData coveragedata, DataOutput dataoutput)
        throws IOException
    {
        coveragedata = coveragedata.m_coverageMap;
        int k = coveragedata.size();
        dataoutput.writeInt(k);
        coveragedata = coveragedata.entrySet().iterator();
        for (int i = 0; i < k; i++)
        {
            Object obj = (java.util.Map.Entry)coveragedata.next();
            String s = (String)((java.util.Map.Entry) (obj)).getKey();
            obj = (ICoverageData.DataHolder)((java.util.Map.Entry) (obj)).getValue();
            boolean aflag[][] = ((ICoverageData.DataHolder) (obj)).m_coverage;
            dataoutput.writeUTF(s);
            dataoutput.writeLong(((ICoverageData.DataHolder) (obj)).m_stamp);
            int l = aflag.length;
            dataoutput.writeInt(l);
            for (int j = 0; j < l; j++)
            {
                DataFactory.writeBooleanArray(aflag[j], dataoutput);
            }

        }

    }

    public void addClass(boolean aflag[][], String s, long l)
    {
        m_coverageMap.put(s, new ICoverageData.DataHolder(aflag, l));
    }

    public ICoverageData.DataHolder getCoverage(ClassDescriptor classdescriptor)
    {
        if (classdescriptor == null)
        {
            throw new IllegalArgumentException("null input: cls");
        } else
        {
            return (ICoverageData.DataHolder)m_coverageMap.get(classdescriptor.getClassVMName());
        }
    }

    public boolean isEmpty()
    {
        return m_coverageMap.isEmpty();
    }

    public Object lock()
    {
        return m_coverageMap;
    }

    public IMergeable merge(IMergeable imergeable)
    {
        if (imergeable != null && !imergeable.isEmpty() && imergeable != this)
        {
            imergeable = ((CoverageData)imergeable).m_coverageMap.entrySet().iterator();
            while (imergeable.hasNext()) 
            {
                Object obj = (java.util.Map.Entry)imergeable.next();
                String s = (String)((java.util.Map.Entry) (obj)).getKey();
                ICoverageData.DataHolder dataholder = (ICoverageData.DataHolder)((java.util.Map.Entry) (obj)).getValue();
                obj = (ICoverageData.DataHolder)m_coverageMap.get(s);
                if (obj == null)
                {
                    m_coverageMap.put(s, dataholder);
                } else
                if (dataholder.m_stamp != ((ICoverageData.DataHolder) (obj)).m_stamp)
                {
                    m_coverageMap.put(s, dataholder);
                } else
                {
                    boolean aflag[][] = dataholder.m_coverage;
                    boolean aflag1[][] = ((ICoverageData.DataHolder) (obj)).m_coverage;
                    int i = 0;
                    int k = aflag1.length;
                    while (i < k) 
                    {
                        boolean aflag2[] = aflag[i];
                        boolean aflag3[] = aflag1[i];
                        if (aflag3 != null)
                        {
                            int j = 0;
                            int l = aflag3.length;
                            while (j < l) 
                            {
                                if (aflag2[j])
                                {
                                    aflag3[j] = true;
                                }
                                j++;
                            }
                        }
                        i++;
                    }
                }
            }
        }
        return this;
    }

    public ICoverageData shallowCopy()
    {
        CoverageData coveragedata;
        HashMap hashmap;
        try
        {
            coveragedata = (CoverageData)super.clone();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new Error(((CloneNotSupportedException) (obj)).toString());
        }
        synchronized (lock())
        {
            hashmap = (HashMap)m_coverageMap.clone();
        }
        coveragedata.m_coverageMap = hashmap;
        return coveragedata;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public int size()
    {
        return m_coverageMap.size();
    }
}
