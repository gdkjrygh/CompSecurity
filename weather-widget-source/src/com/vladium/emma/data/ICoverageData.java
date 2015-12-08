// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.emma.data;


// Referenced classes of package com.vladium.emma.data:
//            IMergeable, ClassDescriptor

public interface ICoverageData
    extends IMergeable
{
    public static final class DataHolder
    {

        public final boolean m_coverage[][];
        public final long m_stamp;

        public DataHolder(boolean aflag[][], long l)
        {
            m_coverage = aflag;
            m_stamp = l;
        }
    }


    public abstract void addClass(boolean aflag[][], String s, long l);

    public abstract DataHolder getCoverage(ClassDescriptor classdescriptor);

    public abstract Object lock();

    public abstract ICoverageData shallowCopy();

    public abstract int size();
}
