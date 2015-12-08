// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.cache;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

// Referenced classes of package com.contextlogic.wish.cache:
//            DiskLruCache

private final class <init>
{

    private  currentEditor;
    private final String key;
    private final long lengths[];
    private boolean readable;
    private long sequenceNumber;
    final DiskLruCache this$0;
    private long timestamp;

    private IOException invalidLengths(String as[])
        throws IOException
    {
        throw new IOException((new StringBuilder()).append("unexpected journal line: ").append(Arrays.toString(as)).toString());
    }

    private void setLengths(String as[])
        throws IOException
    {
        if (as.length != DiskLruCache.access$2400(DiskLruCache.this))
        {
            throw invalidLengths(as);
        }
        int i = 0;
        do
        {
            try
            {
                if (i >= as.length)
                {
                    break;
                }
                lengths[i] = Long.parseLong(as[i]);
            }
            catch (NumberFormatException numberformatexception)
            {
                throw invalidLengths(as);
            }
            i++;
        } while (true);
    }

    private void setTimestamp(String s)
        throws NumberFormatException
    {
        timestamp = Long.parseLong(s);
    }

    public File getCleanFile(int i)
    {
        return new File(DiskLruCache.access$2500(DiskLruCache.this), (new StringBuilder()).append(key).append(".").append(i).toString());
    }

    public File getDirtyFile(int i)
    {
        return new File(DiskLruCache.access$2500(DiskLruCache.this), (new StringBuilder()).append(key).append(".").append(i).append(".tmp").toString());
    }

    public String getLengths()
        throws IOException
    {
        StringBuilder stringbuilder = new StringBuilder();
        long al[] = lengths;
        int j = al.length;
        for (int i = 0; i < j; i++)
        {
            long l = al[i];
            stringbuilder.append(' ').append(l);
        }

        return stringbuilder.toString();
    }






/*
    static long access$1402( , long l)
    {
        .sequenceNumber = l;
        return l;
    }

*/



/*
    static boolean access$602(sequenceNumber sequencenumber, boolean flag)
    {
        sequencenumber.readable = flag;
        return flag;
    }

*/



/*
    static  access$702( ,  1)
    {
        .currentEditor = 1;
        return 1;
    }

*/



    private currentEditor(String s)
    {
        this$0 = DiskLruCache.this;
        super();
        key = s;
        lengths = new long[DiskLruCache.access$2400(DiskLruCache.this)];
    }

    ._cls2400(String s, ._cls2400 _pcls2400)
    {
        this(s);
    }
}
