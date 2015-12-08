// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.emma.data;

import com.vladium.logging.Logger;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.vladium.emma.data:
//            IMetaData, CoverageOptions, ClassDescriptor, IMergeable

final class MetaData
    implements IMetaData, Cloneable
{

    private HashMap m_classMap;
    private boolean m_hasLineNumberInfo;
    private boolean m_hasSrcFileInfo;
    private final CoverageOptions m_options;
    private transient HashSet m_packagesWarned;

    MetaData(CoverageOptions coverageoptions)
    {
        m_options = coverageoptions;
        m_hasSrcFileInfo = true;
        m_hasLineNumberInfo = true;
        m_classMap = new HashMap();
        m_packagesWarned = new HashSet();
    }

    private MetaData(CoverageOptions coverageoptions, HashMap hashmap, boolean flag, boolean flag1)
    {
        m_options = coverageoptions;
        m_hasSrcFileInfo = flag;
        m_hasLineNumberInfo = flag1;
        m_classMap = hashmap;
    }

    static MetaData readExternal(DataInput datainput)
        throws IOException
    {
        CoverageOptions coverageoptions = CoverageOptions.readExternal(datainput);
        boolean flag = datainput.readBoolean();
        boolean flag1 = datainput.readBoolean();
        int j = datainput.readInt();
        HashMap hashmap = new HashMap(j);
        for (int i = 0; i < j; i++)
        {
            hashmap.put(datainput.readUTF(), ClassDescriptor.readExternal(datainput));
        }

        return new MetaData(coverageoptions, hashmap, flag, flag1);
    }

    static void writeExternal(MetaData metadata, DataOutput dataoutput)
        throws IOException
    {
        CoverageOptions.writeExternal(metadata.m_options, dataoutput);
        dataoutput.writeBoolean(metadata.m_hasSrcFileInfo);
        dataoutput.writeBoolean(metadata.m_hasLineNumberInfo);
        metadata = metadata.m_classMap;
        int j = metadata.size();
        dataoutput.writeInt(j);
        metadata = metadata.entrySet().iterator();
        for (int i = 0; i < j; i++)
        {
            Object obj = (java.util.Map.Entry)metadata.next();
            String s = (String)((java.util.Map.Entry) (obj)).getKey();
            obj = (ClassDescriptor)((java.util.Map.Entry) (obj)).getValue();
            dataoutput.writeUTF(s);
            ClassDescriptor.writeExternal(((ClassDescriptor) (obj)), dataoutput);
        }

    }

    public boolean add(ClassDescriptor classdescriptor, boolean flag)
    {
label0:
        {
            boolean flag2 = false;
            String s = classdescriptor.getClassVMName();
            if (!flag)
            {
                flag = flag2;
                if (m_classMap.containsKey(s))
                {
                    break label0;
                }
            }
            m_classMap.put(s, classdescriptor);
            boolean flag1 = false;
            if (!classdescriptor.hasSrcFileInfo())
            {
                m_hasSrcFileInfo = false;
                flag1 = true;
            }
            if (!classdescriptor.hasCompleteLineNumberInfo())
            {
                m_hasLineNumberInfo = false;
                flag1 = true;
            }
            if (flag1)
            {
                Logger logger = Logger.getLogger();
                if (logger.atINFO())
                {
                    String s1 = classdescriptor.getPackageVMName();
                    if (m_packagesWarned.add(s1))
                    {
                        logger.info((new StringBuilder()).append("package [").append(s1).append("] contains classes [").append(classdescriptor.getName()).append("] without full debug info").toString());
                    }
                }
            }
            flag = true;
        }
        return flag;
    }

    public CoverageOptions getOptions()
    {
        return m_options;
    }

    public boolean hasDescriptor(String s)
    {
        return m_classMap.containsKey(s);
    }

    public boolean hasLineNumberData()
    {
        return m_hasLineNumberInfo;
    }

    public boolean hasSrcFileData()
    {
        return m_hasSrcFileInfo;
    }

    public boolean isEmpty()
    {
        return m_classMap.isEmpty();
    }

    public Iterator iterator()
    {
        return m_classMap.values().iterator();
    }

    public Object lock()
    {
        return m_classMap;
    }

    public IMergeable merge(IMergeable imergeable)
    {
        if (imergeable != null && !imergeable.isEmpty() && imergeable != this)
        {
            imergeable = (MetaData)imergeable;
            String s;
            Object obj;
            for (Iterator iterator1 = ((MetaData) (imergeable)).m_classMap.entrySet().iterator(); iterator1.hasNext(); m_classMap.put(s, obj))
            {
                obj = (java.util.Map.Entry)iterator1.next();
                s = (String)((java.util.Map.Entry) (obj)).getKey();
                obj = ((java.util.Map.Entry) (obj)).getValue();
            }

            if (!imergeable.hasSrcFileData())
            {
                m_hasSrcFileInfo = false;
            }
            if (!imergeable.hasLineNumberData())
            {
                m_hasLineNumberInfo = false;
                return this;
            }
        }
        return this;
    }

    public IMetaData shallowCopy()
    {
        MetaData metadata;
        HashMap hashmap;
        try
        {
            metadata = (MetaData)super.clone();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new Error(((CloneNotSupportedException) (obj)).toString());
        }
        synchronized (lock())
        {
            hashmap = (HashMap)m_classMap.clone();
        }
        metadata.m_classMap = hashmap;
        return metadata;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public int size()
    {
        return m_classMap.size();
    }
}
