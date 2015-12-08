// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.core;

import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Logger;
import io.fabric.sdk.android.services.common.CommonUtils;
import io.fabric.sdk.android.services.common.QueueFile;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;

// Referenced classes of package com.crashlytics.android.core:
//            FileLogStore, ByteString

class QueueFileLogStore
    implements FileLogStore
{

    private QueueFile logFile;
    private final int maxLogSize;
    private final File workingFile;

    public QueueFileLogStore(File file, int i)
    {
        workingFile = file;
        maxLogSize = i;
    }

    private void doWriteToLog(long l, String s)
    {
        if (logFile != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        String s1 = s;
        if (s == null)
        {
            s1 = "null";
        }
        int i;
        try
        {
            i = maxLogSize / 4;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Fabric.getLogger().e("CrashlyticsCore", "There was a problem writing to the Crashlytics log.", s);
            return;
        }
        s = s1;
        if (s1.length() > i)
        {
            s = (new StringBuilder()).append("...").append(s1.substring(s1.length() - i)).toString();
        }
        s = s.replaceAll("\r", " ").replaceAll("\n", " ");
        s = String.format(Locale.US, "%d %s%n", new Object[] {
            Long.valueOf(l), s
        }).getBytes("UTF-8");
        logFile.add(s);
        while (!logFile.isEmpty() && logFile.usedBytes() > maxLogSize) 
        {
            logFile.remove();
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    private void openLogFile()
    {
        if (logFile != null)
        {
            break MISSING_BLOCK_LABEL_22;
        }
        logFile = new QueueFile(workingFile);
        return;
        IOException ioexception;
        ioexception;
        Fabric.getLogger().e("CrashlyticsCore", (new StringBuilder()).append("Could not open log file: ").append(workingFile).toString(), ioexception);
        return;
    }

    public void closeLogFile()
    {
        CommonUtils.closeOrLog(logFile, "There was a problem closing the Crashlytics log file.");
        logFile = null;
    }

    public void deleteLogFile()
    {
        closeLogFile();
        workingFile.delete();
    }

    public ByteString getLogAsByteString()
    {
        if (workingFile.exists())
        {
            openLogFile();
            if (logFile != null)
            {
                final int offsetHolder[] = new int[1];
                offsetHolder[0] = 0;
                final byte logBytes[] = new byte[logFile.usedBytes()];
                try
                {
                    logFile.forEach(new io.fabric.sdk.android.services.common.QueueFile.ElementReader() {

                        final QueueFileLogStore this$0;
                        final byte val$logBytes[];
                        final int val$offsetHolder[];

                        public void read(InputStream inputstream, int i)
                            throws IOException
                        {
                            int ai[];
                            inputstream.read(logBytes, offsetHolder[0], i);
                            ai = offsetHolder;
                            ai[0] = ai[0] + i;
                            inputstream.close();
                            return;
                            Exception exception;
                            exception;
                            inputstream.close();
                            throw exception;
                        }

            
            {
                this$0 = QueueFileLogStore.this;
                logBytes = abyte0;
                offsetHolder = ai;
                super();
            }
                    });
                }
                catch (IOException ioexception)
                {
                    Fabric.getLogger().e("CrashlyticsCore", "A problem occurred while reading the Crashlytics log file.", ioexception);
                }
                return ByteString.copyFrom(logBytes, 0, offsetHolder[0]);
            }
        }
        return null;
    }

    public void writeToLog(long l, String s)
    {
        openLogFile();
        doWriteToLog(l, s);
    }
}
