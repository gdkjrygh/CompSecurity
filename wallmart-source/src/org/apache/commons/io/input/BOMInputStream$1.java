// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.io.input;

import java.util.Comparator;
import org.apache.commons.io.ByteOrderMark;

// Referenced classes of package org.apache.commons.io.input:
//            BOMInputStream

static final class 
    implements Comparator
{

    public volatile int compare(Object obj, Object obj1)
    {
        return compare((ByteOrderMark)obj, (ByteOrderMark)obj1);
    }

    public int compare(ByteOrderMark byteordermark, ByteOrderMark byteordermark1)
    {
        int i = byteordermark.length();
        int j = byteordermark1.length();
        if (i > j)
        {
            return -1;
        }
        return j <= i ? 0 : 1;
    }

    ()
    {
    }
}
