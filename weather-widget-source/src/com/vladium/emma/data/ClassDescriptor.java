// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.emma.data;

import com.vladium.util.IConstants;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.Serializable;

// Referenced classes of package com.vladium.emma.data:
//            MethodDescriptor

public final class ClassDescriptor
    implements IConstants, Serializable
{

    private final boolean m_hasCompleteLineNumberInfo;
    private transient int m_hash;
    private final MethodDescriptor m_methods[];
    private final String m_name;
    private final String m_packageVMName;
    private final String m_srcFileName;
    private final long m_stamp;

    public ClassDescriptor(String s, String s1, long l, String s2, MethodDescriptor amethoddescriptor[])
    {
        if (s == null)
        {
            throw new IllegalArgumentException("null input: packageVMName");
        }
        if (s1 == null)
        {
            throw new IllegalArgumentException("null input: name");
        }
        if (amethoddescriptor == null)
        {
            throw new IllegalArgumentException("null input: methods");
        }
        m_packageVMName = s;
        m_name = s1;
        m_stamp = l;
        m_srcFileName = s2;
        m_methods = amethoddescriptor;
        boolean flag1 = true;
        int i = 0;
        do
        {
label0:
            {
                boolean flag = flag1;
                if (i < m_methods.length)
                {
                    if ((amethoddescriptor[i].getStatus() & 0xe) != 0 || m_methods[i].hasLineNumberInfo())
                    {
                        break label0;
                    }
                    flag = false;
                }
                m_hasCompleteLineNumberInfo = flag;
                return;
            }
            i++;
        } while (true);
    }

    static ClassDescriptor readExternal(DataInput datainput)
        throws IOException
    {
        String s1 = datainput.readUTF();
        String s2 = datainput.readUTF();
        long l = datainput.readLong();
        String s;
        MethodDescriptor amethoddescriptor[];
        int j;
        if (datainput.readByte() != 0)
        {
            s = datainput.readUTF();
        } else
        {
            s = null;
        }
        j = datainput.readInt();
        amethoddescriptor = new MethodDescriptor[j];
        for (int i = 0; i < j; i++)
        {
            amethoddescriptor[i] = MethodDescriptor.readExternal(datainput);
        }

        return new ClassDescriptor(s1, s2, l, s, amethoddescriptor);
    }

    static void writeExternal(ClassDescriptor classdescriptor, DataOutput dataoutput)
        throws IOException
    {
        dataoutput.writeUTF(classdescriptor.m_packageVMName);
        dataoutput.writeUTF(classdescriptor.m_name);
        dataoutput.writeLong(classdescriptor.m_stamp);
        int j;
        if (classdescriptor.m_srcFileName != null)
        {
            dataoutput.writeByte(1);
            dataoutput.writeUTF(classdescriptor.m_srcFileName);
        } else
        {
            dataoutput.writeByte(0);
        }
        classdescriptor = classdescriptor.m_methods;
        j = classdescriptor.length;
        dataoutput.writeInt(j);
        for (int i = 0; i < j; i++)
        {
            MethodDescriptor.writeExternal(classdescriptor[i], dataoutput);
        }

    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof ClassDescriptor)
        {
            if (hashCode() == ((ClassDescriptor) (obj = (ClassDescriptor)obj)).hashCode() && m_name.equals(((ClassDescriptor) (obj)).m_name) && m_packageVMName.equals(((ClassDescriptor) (obj)).m_packageVMName))
            {
                return true;
            }
        }
        return false;
    }

    public final String getClassVMName()
    {
        if (m_packageVMName.length() == 0)
        {
            return m_name;
        } else
        {
            return m_packageVMName + "/" + m_name;
        }
    }

    public final MethodDescriptor[] getMethods()
    {
        return m_methods;
    }

    public final String getName()
    {
        return m_name;
    }

    public final String getPackageVMName()
    {
        return m_packageVMName;
    }

    public final String getSrcFileName()
    {
        return m_srcFileName;
    }

    public final long getStamp()
    {
        return m_stamp;
    }

    public final boolean hasCompleteLineNumberInfo()
    {
        return m_hasCompleteLineNumberInfo;
    }

    public final boolean hasSrcFileInfo()
    {
        return m_srcFileName != null;
    }

    public final int hashCode()
    {
        if (m_hash == 0)
        {
            int i = m_name.hashCode() + m_packageVMName.hashCode() * 16661;
            m_hash = i;
            return i;
        } else
        {
            return m_hash;
        }
    }

    public String toString()
    {
        return toString("");
    }

    public String toString(String s)
    {
        StringBuilder stringbuilder = (new StringBuilder()).append(s).append("class [");
        Object obj;
        if (m_packageVMName.length() > 0)
        {
            obj = (new StringBuilder()).append(m_packageVMName).append("/").toString();
        } else
        {
            obj = "";
        }
        obj = new StringBuffer(stringbuilder.append(((String) (obj))).append(m_name).append("] descriptor:").toString());
        for (int i = 0; i < m_methods.length; i++)
        {
            ((StringBuffer) (obj)).append(EOL);
            ((StringBuffer) (obj)).append(m_methods[i].toString((new StringBuilder()).append(s).append("  ").toString()));
        }

        return ((StringBuffer) (obj)).toString();
    }
}
