// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.util.metric;

import com.google.common.base.Charsets;
import com.google.common.base.Preconditions;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

// Referenced classes of package com.weather.util.metric:
//            CsvFileLineWriter, CsvMetricReporter

class 
    implements CsvFileLineWriter
{

    public transient void writeMetricsToFile(File file, String s, String s1, Object aobj[])
        throws IOException
    {
        PrintWriter printwriter;
        Preconditions.checkNotNull(file);
        Preconditions.checkNotNull(s);
        Preconditions.checkNotNull(s1);
        Preconditions.checkNotNull(((Object) (aobj)));
        printwriter = new PrintWriter(new OutputStreamWriter(new FileOutputStream(file, true), Charsets.UTF_8));
        boolean flag = file.exists();
        if (flag)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        if (!file.createNewFile())
        {
            break MISSING_BLOCK_LABEL_87;
        }
        if (flag)
        {
            break MISSING_BLOCK_LABEL_78;
        }
        printwriter.println(s);
        printwriter.printf(s1, aobj);
        printwriter.close();
        return;
        file;
        printwriter.close();
        throw file;
    }

    ()
    {
    }
}
