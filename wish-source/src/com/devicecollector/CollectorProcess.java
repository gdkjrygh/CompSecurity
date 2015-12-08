// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.devicecollector;

import android.app.Activity;
import android.os.AsyncTask;
import com.devicecollector.collectors.AbstractAsyncCollectorTask;
import com.devicecollector.collectors.CollectorEnum;
import com.devicecollector.collectors.CollectorStatusListener;
import com.devicecollector.collectors.LocalCollector;
import com.devicecollector.collectors.LocationCollectorTask;
import com.devicecollector.collectors.SoftErrorCode;
import com.devicecollector.collectors.WebCollectorTask;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;

// Referenced classes of package com.devicecollector:
//            AbstractCollectorProcess, DataCollection, AsyncTransmissionTask

public class CollectorProcess extends AbstractCollectorProcess
    implements CollectorStatusListener
{

    protected static final int GINGERBREAD_MR1 = 10;
    private ArrayList collectors;
    private DataCollection dataCollection;
    private Exception errorCause;
    private DeviceCollector.ErrorCode errorCode;

    public CollectorProcess(Activity activity, DeviceCollector.StatusListener statuslistener, EnumSet enumset)
    {
        super(activity, statuslistener, enumset);
    }

    private void checkIfDone()
    {
        debug("checking if we are done...", new Object[0]);
        if (collectors != null && collectors.size() > 0)
        {
            Object obj = new ArrayList();
            Iterator iterator = collectors.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                AbstractAsyncCollectorTask abstractasynccollectortask1 = (AbstractAsyncCollectorTask)iterator.next();
                if (abstractasynccollectortask1.isFinished())
                {
                    ((ArrayList) (obj)).add(abstractasynccollectortask1);
                }
            } while (true);
            AbstractAsyncCollectorTask abstractasynccollectortask;
            for (obj = ((ArrayList) (obj)).iterator(); ((Iterator) (obj)).hasNext(); collectors.remove(abstractasynccollectortask))
            {
                abstractasynccollectortask = (AbstractAsyncCollectorTask)((Iterator) (obj)).next();
            }

        }
        if (dataCollection != null && dataCollection.getServerUrl() != null && (collectors == null || collectors.size() == 0))
        {
            debug("All done, sending data...", new Object[0]);
            sendDataCollection();
            endProcess(null, null);
            return;
        } else
        {
            debug("[%s] collectors left", new Object[] {
                (new StringBuilder()).append("").append(collectors.size()).toString()
            });
            return;
        }
    }

    private void endProcess(DeviceCollector.ErrorCode errorcode, Exception exception)
    {
        finished = true;
        if (errorcode != null)
        {
            errorCode = errorcode;
            errorCause = exception;
        }
        if (lstnr == null) goto _L2; else goto _L1
_L1:
        if (errorCode == null)
        {
            debug("Telling the listener we succeeded...", new Object[0]);
            lstnr.onCollectorSuccess();
        } else
        {
            debug("Telling the listener we had a bad error...", new Object[0]);
            lstnr.onCollectorError(errorCode, errorCause);
        }
        this;
        JVM INSTR monitorenter ;
        notifyAll();
        this;
        JVM INSTR monitorexit ;
_L4:
        finished = true;
        return;
        errorcode;
        this;
        JVM INSTR monitorexit ;
        throw errorcode;
_L2:
        debug("No listener to notify", new Object[0]);
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void removeCollectorFromList(CollectorEnum collectorenum)
    {
        if (collectors != null)
        {
            Object obj = null;
            Iterator iterator = collectors.iterator();
            AbstractAsyncCollectorTask abstractasynccollectortask;
            do
            {
                abstractasynccollectortask = obj;
                if (!iterator.hasNext())
                {
                    break;
                }
                abstractasynccollectortask = (AbstractAsyncCollectorTask)iterator.next();
            } while (!abstractasynccollectortask.getCollectorType().equals(collectorenum));
            if (abstractasynccollectortask != null)
            {
                debug("Removing collector [%s]", new Object[] {
                    abstractasynccollectortask.getCollectorType()
                });
                collectors.remove(abstractasynccollectortask);
                return;
            } else
            {
                debug("Collector not found [%s]", new Object[] {
                    collectorenum
                });
                return;
            }
        } else
        {
            debug("No collectors being held", new Object[0]);
            return;
        }
    }

    private void sendDataCollection()
    {
        Object obj = new AsyncTransmissionTask();
        Object obj1 = new DataCollection[1];
        obj1[0] = dataCollection;
        if (android.os.Build.VERSION.SDK_INT > 10)
        {
            ((AsyncTransmissionTask) (obj)).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, ((Object []) (obj1)));
        } else
        {
            ((AsyncTransmissionTask) (obj)).execute(((Object []) (obj1)));
        }
        debug("Final Collection:", new Object[0]);
        for (obj = dataCollection.getPostData().keySet().iterator(); ((Iterator) (obj)).hasNext(); debug("key:[%s] value:[%s]", new Object[] {
    obj1, dataCollection.getPostData().get(obj1)
}))
        {
            obj1 = (String)((Iterator) (obj)).next();
        }

    }

    private boolean skip(CollectorEnum collectorenum)
    {
        if (skipList != null && skipList.contains(collectorenum))
        {
            dataCollection.addError(collectorenum, SoftErrorCode.MERCHANT_SKIPPED);
            return true;
        } else
        {
            return false;
        }
    }

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((String[])aobj);
    }

    protected transient Void doInBackground(String as[])
    {
        collectors = new ArrayList();
        dataCollection = new DataCollection(as[0], as[1], as[2]);
        long l;
        if (getTimeoutOverridden())
        {
            l = getTimeoutMs();
        } else
        {
            l = 5000L;
        }
        as = new WebCollectorTask(activity, this, dataCollection, l);
        collectors.add(as);
        if (!skip(CollectorEnum.GEO_LOCATION))
        {
            as = new LocationCollectorTask(activity, this, dataCollection, l);
            collectors.add(as);
        }
        for (as = collectors.iterator(); as.hasNext();)
        {
            AbstractAsyncCollectorTask abstractasynccollectortask = (AbstractAsyncCollectorTask)as.next();
            debug((new StringBuilder()).append("Starting off ").append(abstractasynccollectortask.getClass().getName()).toString(), new Object[0]);
            if (android.os.Build.VERSION.SDK_INT > 10)
            {
                abstractasynccollectortask.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
            } else
            {
                abstractasynccollectortask.execute(new Void[0]);
            }
        }

        debug("Getting the quick data...", new Object[0]);
        as = new LocalCollector(activity, dataCollection);
        as.collectRequiredInfo();
        debug("Got Required Info", new Object[0]);
        as.collectOptionalInfo();
        debug("Got optional info...", new Object[0]);
        as.collectDeviceId();
        debug("Got Device Cookie Info", new Object[0]);
        debug("Done with quick data", new Object[0]);
        checkIfDone();
        return null;
    }

    public void onCancelled()
    {
        debug("Called cancel..", new Object[0]);
        if (!finished && dataCollection != null && dataCollection.getServerUrl() != null)
        {
            debug("Cancelling each collector", new Object[0]);
            Iterator iterator = collectors.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                AbstractAsyncCollectorTask abstractasynccollectortask = (AbstractAsyncCollectorTask)iterator.next();
                if (!abstractasynccollectortask.isFinished() && !abstractasynccollectortask.isCancelled())
                {
                    dataCollection.addError(abstractasynccollectortask.getCollectorType(), SoftErrorCode.MERCHANT_CANCELLED);
                    debug((new StringBuilder()).append("Cancelling [").append(abstractasynccollectortask.getCollectorType()).append("] collector...").toString(), new Object[0]);
                    abstractasynccollectortask.cancel(true);
                    debug((new StringBuilder()).append("Cancelled [").append(abstractasynccollectortask.getCollectorType()).append("] collector.").toString(), new Object[0]);
                }
            } while (true);
            sendDataCollection();
            endProcess(null, null);
        } else
        if (!finished)
        {
            endProcess(DeviceCollector.ErrorCode.MERCHANT_CANCELLED, new CancellationException("Merchant Cancelled"));
            return;
        }
    }

    public void onCollectorError(CollectorEnum collectorenum, SoftErrorCode softerrorcode, Exception exception)
    {
        debug("Removing collector[%s] due to error [%s]", new Object[] {
            collectorenum, softerrorcode
        });
        removeCollectorFromList(collectorenum);
        if (!CollectorEnum.WEB.equals(collectorenum))
        {
            break MISSING_BLOCK_LABEL_89;
        }
        finished = true;
        errorCode = DeviceCollector.ErrorCode.RUNTIME_FAILURE;
        errorCause = exception;
        if (lstnr != null)
        {
            lstnr.onCollectorError(errorCode, errorCause);
        }
        this;
        JVM INSTR monitorenter ;
        notifyAll();
        this;
        JVM INSTR monitorexit ;
        return;
        collectorenum;
        this;
        JVM INSTR monitorexit ;
        throw collectorenum;
        checkIfDone();
        return;
    }

    public void onCollectorStart(CollectorEnum collectorenum)
    {
        debug((new StringBuilder()).append("Long Collector starting:").append(collectorenum).toString(), new Object[0]);
    }

    public void onCollectorSuccess(CollectorEnum collectorenum)
    {
        debug("Collector success [%s]", new Object[] {
            collectorenum
        });
        removeCollectorFromList(collectorenum);
        checkIfDone();
    }

    public void timeout()
    {
        if (!finished && dataCollection != null && dataCollection.getServerUrl() != null)
        {
            for (Iterator iterator = collectors.iterator(); iterator.hasNext(); ((AbstractAsyncCollectorTask)iterator.next()).timeout()) { }
            sendDataCollection();
            endProcess(errorCode, errorCause);
            return;
        } else
        {
            debug("Nothing to timeout", new Object[0]);
            return;
        }
    }
}
