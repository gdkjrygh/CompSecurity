// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.base;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

// Referenced classes of package com.google.common.base:
//            Splitter, Preconditions

public static final class <init>
{

    private static final String INVALID_ENTRY_MESSAGE = "Chunk [%s] is not a valid entry";
    private final Splitter entrySplitter;
    private final Splitter outerSplitter;

    public Map split(CharSequence charsequence)
    {
        LinkedHashMap linkedhashmap = new LinkedHashMap();
        charsequence = outerSplitter.split(charsequence).iterator();
        while (charsequence.hasNext()) 
        {
            String s = (String)charsequence.next();
            Iterator iterator = Splitter.access$000(entrySplitter, s);
            Preconditions.checkArgument(iterator.hasNext(), "Chunk [%s] is not a valid entry", new Object[] {
                s
            });
            String s1 = (String)iterator.next();
            boolean flag;
            if (!linkedhashmap.containsKey(s1))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkArgument(flag, "Duplicate key [%s] found.", new Object[] {
                s1
            });
            Preconditions.checkArgument(iterator.hasNext(), "Chunk [%s] is not a valid entry", new Object[] {
                s
            });
            linkedhashmap.put(s1, (String)iterator.next());
            if (!iterator.hasNext())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkArgument(flag, "Chunk [%s] is not a valid entry", new Object[] {
                s
            });
        }
        return Collections.unmodifiableMap(linkedhashmap);
    }

    private (Splitter splitter, Splitter splitter1)
    {
        outerSplitter = splitter;
        entrySplitter = (Splitter)Preconditions.checkNotNull(splitter1);
    }

    tNull(Splitter splitter, Splitter splitter1, tNull tnull)
    {
        this(splitter, splitter1);
    }
}
