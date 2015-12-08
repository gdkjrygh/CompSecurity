// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import android.os.Handler;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.facebook:
//            RequestOutputStream, FacebookSdk, RequestProgress, GraphRequestBatch, 
//            GraphRequest

class ProgressOutputStream extends FilterOutputStream
    implements RequestOutputStream
{

    private long batchProgress;
    private RequestProgress currentRequestProgress;
    private long lastReportedProgress;
    private long maxProgress;
    private final Map progressMap;
    private final GraphRequestBatch requests;
    private final long threshold = FacebookSdk.getOnProgressThreshold();

    ProgressOutputStream(OutputStream outputstream, GraphRequestBatch graphrequestbatch, Map map, long l)
    {
        super(outputstream);
        requests = graphrequestbatch;
        progressMap = map;
        maxProgress = l;
    }

    private void addProgress(long l)
    {
        if (currentRequestProgress != null)
        {
            currentRequestProgress.addProgress(l);
        }
        batchProgress = batchProgress + l;
        if (batchProgress >= lastReportedProgress + threshold || batchProgress >= maxProgress)
        {
            reportBatchProgress();
        }
    }

    private void reportBatchProgress()
    {
        if (batchProgress <= lastReportedProgress) goto _L2; else goto _L1
_L1:
        Iterator iterator = requests.getCallbacks().iterator();
_L6:
        if (iterator.hasNext()) goto _L4; else goto _L3
_L3:
        lastReportedProgress = batchProgress;
_L2:
        return;
_L4:
        final GraphRequestBatch.OnProgressCallback progressCallback = (GraphRequestBatch.Callback)iterator.next();
        if (progressCallback instanceof GraphRequestBatch.OnProgressCallback)
        {
            Handler handler = requests.getCallbackHandler();
            progressCallback = (GraphRequestBatch.OnProgressCallback)progressCallback;
            if (handler == null)
            {
                progressCallback.onBatchProgress(requests, batchProgress, maxProgress);
            } else
            {
                handler.post(new Runnable() {

                    final ProgressOutputStream this$0;
                    private final GraphRequestBatch.OnProgressCallback val$progressCallback;

                    public void run()
                    {
                        progressCallback.onBatchProgress(requests, batchProgress, maxProgress);
                    }

            
            {
                this$0 = ProgressOutputStream.this;
                progressCallback = onprogresscallback;
                super();
            }
                });
            }
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void close()
        throws IOException
    {
        super.close();
        Iterator iterator = progressMap.values().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                reportBatchProgress();
                return;
            }
            ((RequestProgress)iterator.next()).reportProgress();
        } while (true);
    }

    long getBatchProgress()
    {
        return batchProgress;
    }

    long getMaxProgress()
    {
        return maxProgress;
    }

    public void setCurrentRequest(GraphRequest graphrequest)
    {
        if (graphrequest != null)
        {
            graphrequest = (RequestProgress)progressMap.get(graphrequest);
        } else
        {
            graphrequest = null;
        }
        currentRequestProgress = graphrequest;
    }

    public void write(int i)
        throws IOException
    {
        out.write(i);
        addProgress(1L);
    }

    public void write(byte abyte0[])
        throws IOException
    {
        out.write(abyte0);
        addProgress(abyte0.length);
    }

    public void write(byte abyte0[], int i, int j)
        throws IOException
    {
        out.write(abyte0, i, j);
        addProgress(j);
    }



}
