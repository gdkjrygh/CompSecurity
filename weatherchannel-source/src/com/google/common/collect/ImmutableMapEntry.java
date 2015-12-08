// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;


// Referenced classes of package com.google.common.collect:
//            ImmutableEntry, CollectPreconditions

abstract class ImmutableMapEntry extends ImmutableEntry
{
    static final class TerminalEntry extends ImmutableMapEntry
    {

        ImmutableMapEntry getNextInKeyBucket()
        {
            return null;
        }

        ImmutableMapEntry getNextInValueBucket()
        {
            return null;
        }

        TerminalEntry(ImmutableMapEntry immutablemapentry)
        {
            super(immutablemapentry);
        }

        TerminalEntry(Object obj, Object obj1)
        {
            super(obj, obj1);
        }
    }


    ImmutableMapEntry(ImmutableMapEntry immutablemapentry)
    {
        super(immutablemapentry.getKey(), immutablemapentry.getValue());
    }

    ImmutableMapEntry(Object obj, Object obj1)
    {
        super(obj, obj1);
        CollectPreconditions.checkEntryNotNull(obj, obj1);
    }

    abstract ImmutableMapEntry getNextInKeyBucket();

    abstract ImmutableMapEntry getNextInValueBucket();
}
