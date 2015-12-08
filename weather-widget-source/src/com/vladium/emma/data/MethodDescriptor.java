// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.emma.data;

import com.vladium.util.IConstants;
import com.vladium.util.IntObjectMap;
import com.vladium.util.IntSet;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.Serializable;

// Referenced classes of package com.vladium.emma.data:
//            IMetadataConstants, DataFactory

public final class MethodDescriptor
    implements IConstants, IMetadataConstants, Serializable
{

    private final int m_blockMap[][];
    private final int m_blockSizes[];
    private final String m_descriptor;
    private final int m_firstLine;
    private IntObjectMap m_lineMap;
    private final String m_name;
    private final int m_status;

    public MethodDescriptor(String s, String s1, int i, int ai[], int ai1[][], int j)
    {
        if (s == null)
        {
            throw new IllegalArgumentException("null input: name");
        }
        if (s1 == null)
        {
            throw new IllegalArgumentException("null input: descriptor");
        }
        if ((i & 0xe) == 0)
        {
            int k = ai.length;
            m_blockSizes = ai;
            if ((i & 0xf) == 0)
            {
                if (ai1 == null || ai1.length == 0)
                {
                    throw new IllegalArgumentException("null or empty input: blockMap");
                }
                m_blockMap = ai1;
                m_firstLine = j;
            } else
            {
                m_blockMap = (int[][])null;
                m_firstLine = 0;
            }
        } else
        {
            m_blockSizes = null;
            m_blockMap = (int[][])null;
            m_firstLine = 0;
        }
        m_name = s;
        m_descriptor = s1;
        m_status = i;
    }

    static MethodDescriptor readExternal(DataInput datainput)
        throws IOException
    {
        String s = datainput.readUTF();
        String s1 = datainput.readUTF();
        int k = datainput.readInt();
        int ai[] = null;
        int ai2[][] = (int[][])null;
        boolean flag = false;
        int ai1[][] = ai2;
        int i = ((flag) ? 1 : 0);
        if ((k & 0xe) == 0)
        {
            int ai3[] = DataFactory.readIntArray(datainput);
            ai = ai3;
            ai1 = ai2;
            i = ((flag) ? 1 : 0);
            if ((k & 0xf) == 0)
            {
                int j = datainput.readInt();
                ai1 = new int[j][];
                for (i = 0; i < j; i++)
                {
                    ai1[i] = DataFactory.readIntArray(datainput);
                }

                i = datainput.readInt();
                ai = ai3;
            }
        }
        return new MethodDescriptor(s, s1, k, ai, ai1, i);
    }

    static void writeExternal(MethodDescriptor methoddescriptor, DataOutput dataoutput)
        throws IOException
    {
        dataoutput.writeUTF(methoddescriptor.m_name);
        dataoutput.writeUTF(methoddescriptor.m_descriptor);
        int i = methoddescriptor.m_status;
        dataoutput.writeInt(i);
        if ((i & 0xe) == 0)
        {
            DataFactory.writeIntArray(methoddescriptor.m_blockSizes, dataoutput);
            if ((i & 0xf) == 0)
            {
                int ai[][] = methoddescriptor.m_blockMap;
                int k = ai.length;
                dataoutput.writeInt(k);
                for (int j = 0; j < k; j++)
                {
                    DataFactory.writeIntArray(ai[j], dataoutput);
                }

                dataoutput.writeInt(methoddescriptor.m_firstLine);
            }
        }
    }

    public int getBlockCount()
    {
        return m_blockSizes.length;
    }

    public int[][] getBlockMap()
    {
        return m_blockMap;
    }

    public int[] getBlockSizes()
    {
        return m_blockSizes;
    }

    public String getDescriptor()
    {
        return m_descriptor;
    }

    public int getFirstLine()
    {
        return m_firstLine;
    }

    public IntObjectMap getLineMap()
    {
        IntObjectMap intobjectmap = m_lineMap;
        if (intobjectmap != null)
        {
            return intobjectmap;
        }
        if ((m_status & 0xf) == 0)
        {
            IntObjectMap intobjectmap1 = new IntObjectMap();
            int ai1[][] = m_blockMap;
            int i = 0;
label0:
            for (int l = ai1.length; i < l; i++)
            {
                int ai2[] = ai1[i];
                if (ai2 == null)
                {
                    continue;
                }
                int j1 = ai2.length;
                int j = 0;
                do
                {
                    if (j >= j1)
                    {
                        continue label0;
                    }
                    int k1 = ai2[j];
                    IntSet intset1 = (IntSet)intobjectmap1.get(k1);
                    IntSet intset = intset1;
                    if (intset1 == null)
                    {
                        intset = new IntSet();
                        intobjectmap1.put(k1, intset);
                    }
                    intset.add(i);
                    j++;
                } while (true);
            }

            int ai[] = intobjectmap1.keys();
            i = 0;
            for (int k = ai.length; i < k; i++)
            {
                int i1 = ai[i];
                intobjectmap1.put(i1, ((IntSet)intobjectmap1.get(i1)).values());
            }

            m_lineMap = intobjectmap1;
            return intobjectmap1;
        } else
        {
            return null;
        }
    }

    public String getName()
    {
        return m_name;
    }

    public int getStatus()
    {
        return m_status;
    }

    public boolean hasLineNumberInfo()
    {
        return (m_status & 0xf) == 0;
    }

    public String toString()
    {
        return toString("");
    }

    public String toString(String s)
    {
        StringBuffer stringbuffer = new StringBuffer((new StringBuilder()).append(s).append("method [").append(m_name).append("] descriptor:").toString());
        if ((m_status & 0xf) == 0)
        {
            for (int i = 0; i < m_blockMap.length; i++)
            {
                stringbuffer.append(EOL);
                stringbuffer.append((new StringBuilder()).append(s).append("  ").append("block ").append(i).append(" (").append(m_blockSizes[i]).append(" instrs) : ").toString());
                int ai[] = m_blockMap[i];
                for (int k = 0; k < ai.length; k++)
                {
                    if (k != 0)
                    {
                        stringbuffer.append(", ");
                    }
                    stringbuffer.append(ai[k]);
                }

            }

            stringbuffer.append(EOL);
            stringbuffer.append((new StringBuilder()).append(s).append("  ").append("---").toString());
            int ai1[] = m_lineMap.keys();
            for (int j = 0; j < ai1.length; j++)
            {
                stringbuffer.append(EOL);
                stringbuffer.append((new StringBuilder()).append(s).append("  ").append("line ").append(ai1[j]).append(": ").toString());
                int ai2[] = (int[])(int[])m_lineMap.get(ai1[j]);
                for (int l = 0; l < ai2.length; l++)
                {
                    if (l != 0)
                    {
                        stringbuffer.append(", ");
                    }
                    stringbuffer.append(ai2[l]);
                }

            }

        } else
        {
            stringbuffer.append(" <no line info>");
        }
        return stringbuffer.toString();
    }
}
