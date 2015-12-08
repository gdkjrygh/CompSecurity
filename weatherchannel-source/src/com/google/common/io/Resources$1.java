// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.io;

import com.google.common.collect.Lists;
import java.util.List;

// Referenced classes of package com.google.common.io:
//            LineProcessor, Resources

static final class r
    implements LineProcessor
{

    final List result = Lists.newArrayList();

    public volatile Object getResult()
    {
        return getResult();
    }

    public List getResult()
    {
        return result;
    }

    public boolean processLine(String s)
    {
        result.add(s);
        return true;
    }

    r()
    {
    }
}
