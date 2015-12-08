// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.util.metric;

import com.google.common.base.Charsets;
import com.google.common.base.Preconditions;
import com.weather.util.device.FileUtils;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.Locale;
import java.util.SortedSet;
import java.util.concurrent.Executor;

// Referenced classes of package com.weather.util.metric:
//            MetricReporter, MetricRegistry, TimerMetric, CsvFileLineWriter, 
//            MetricRegistryVisitor

public class CsvMetricReporter
    implements MetricReporter
{

    static final String CSV_DATA_PLACEHOLDER_TIMERS = "%s, %s,%d%n";
    public static final String CSV_FILE_EXTENSION = ".csv";
    static final String CSV_HEADERS_TIMERS = "name, start,elapsed";
    private static final Locale LOCAL;
    private static final String TAG = com/weather/util/metric/CsvMetricReporter.getName();
    static final String UTC_TIME_FORMAT = "yyyy-MM-dd'T'HH:mm:ss'Z'";
    private final CsvFileLineWriter csvWriter;
    private final DateFormat dateFormat;
    private final File directory;
    private final Executor executor;
    MetricRegistry registry;

    public CsvMetricReporter(MetricRegistry metricregistry, Executor executor1)
    {
        this(metricregistry, executor1, FileUtils.getExternalPerformanceDataDir(), new CsvFileLineWriter() {

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

        });
    }

    public CsvMetricReporter(MetricRegistry metricregistry, Executor executor1, File file, CsvFileLineWriter csvfilelinewriter)
    {
        dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", LOCAL);
        registry = (MetricRegistry)Preconditions.checkNotNull(metricregistry);
        executor = (Executor)Preconditions.checkNotNull(executor1);
        directory = (File)Preconditions.checkNotNull(file);
        csvWriter = csvfilelinewriter;
        initPerformanceDir();
    }

    private void initPerformanceDir()
    {
        if (!directory.exists() && !directory.mkdirs())
        {
            LogUtil.w(TAG, LoggingMetaTags.TWC_METRICS, (new StringBuilder()).append("Could not create performance metric directory, ").append(directory.getAbsolutePath()).toString(), new Object[0]);
        }
    }

    private void reportTimers(Iterable iterable)
    {
        final TimerMetric timerMetric;
        final File file;
        for (iterable = iterable.iterator(); iterable.hasNext(); executor.execute(new Runnable() {

        final CsvMetricReporter this$0;
        final File val$file;
        final TimerMetric val$timerMetric;

        public void run()
        {
            if (!timerMetric.hasStarted()) goto _L2; else goto _L1
_L1:
            String s = dateFormat.format(timerMetric.getInitialStartTime());
_L5:
            if (!timerMetric.hasStarted() || timerMetric.isRunning()) goto _L4; else goto _L3
_L3:
            long l = timerMetric.getElapsedTime();
_L6:
            csvWriter.writeMetricsToFile(file, "name, start,elapsed", "%s, %s,%d%n", new Object[] {
                timerMetric.getName(), s, Long.valueOf(l)
            });
            return;
_L2:
            s = "";
              goto _L5
_L4:
            l = 0L;
              goto _L6
            IOException ioexception;
            ioexception;
            LogUtil.w(CsvMetricReporter.TAG, LoggingMetaTags.TWC_METRICS, (new StringBuilder()).append("Could not create ").append(file).append(" due to : ").append(ioexception.getMessage()).toString(), new Object[0]);
            return;
              goto _L5
        }

            
            {
                this$0 = CsvMetricReporter.this;
                timerMetric = timermetric;
                file = file1;
                super();
            }
    }))
        {
            timerMetric = (TimerMetric)iterable.next();
            file = new File(directory, (new StringBuilder()).append(timerMetric.getName()).append(".csv").toString());
        }

    }

    public void report()
    {
        registry.visit(new MetricRegistryVisitor() {

            final CsvMetricReporter this$0;

            public void visit(SortedSet sortedset)
            {
                if (!sortedset.isEmpty())
                {
                    reportTimers(sortedset);
                }
            }

            
            {
                this$0 = CsvMetricReporter.this;
                super();
            }
        });
    }

    static 
    {
        LOCAL = Locale.US;
    }




}
