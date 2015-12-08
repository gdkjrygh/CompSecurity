// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.devicecollector;

import android.app.Activity;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.util.Log;
import com.devicecollector.collectors.CollectorEnum;
import java.util.EnumSet;

// Referenced classes of package com.devicecollector:
//            CollectorProcess, AbstractCollectorProcess

public final class DeviceCollector
{
    public static final class ErrorCode extends Enum
    {

        private static final ErrorCode $VALUES[];
        public static final ErrorCode INVALID_MERCHANT;
        public static final ErrorCode INVALID_SESSION;
        public static final ErrorCode INVALID_URL;
        public static final ErrorCode MERCHANT_CANCELLED;
        public static final ErrorCode NO_NETWORK;
        public static final ErrorCode RUNTIME_FAILURE;

        public static ErrorCode valueOf(String s)
        {
            return (ErrorCode)Enum.valueOf(com/devicecollector/DeviceCollector$ErrorCode, s);
        }

        public static ErrorCode[] values()
        {
            return (ErrorCode[])$VALUES.clone();
        }

        static 
        {
            NO_NETWORK = new ErrorCode("NO_NETWORK", 0);
            INVALID_URL = new ErrorCode("INVALID_URL", 1);
            INVALID_MERCHANT = new ErrorCode("INVALID_MERCHANT", 2);
            INVALID_SESSION = new ErrorCode("INVALID_SESSION", 3);
            MERCHANT_CANCELLED = new ErrorCode("MERCHANT_CANCELLED", 4);
            RUNTIME_FAILURE = new ErrorCode("RUNTIME_FAILURE", 5);
            $VALUES = (new ErrorCode[] {
                NO_NETWORK, INVALID_URL, INVALID_MERCHANT, INVALID_SESSION, MERCHANT_CANCELLED, RUNTIME_FAILURE
            });
        }

        private ErrorCode(String s, int i)
        {
            super(s, i);
        }
    }

    public static interface StatusListener
    {

        public abstract void onCollectorError(ErrorCode errorcode, Exception exception);

        public abstract void onCollectorStart();

        public abstract void onCollectorSuccess();
    }


    private static final String RE_MERC = "^\\d{1,6}$";
    private static final String RE_SESS = "^[\\w-]{1,32}$";
    private static final String RE_URL = "^https?://[\\w-]+(\\.[\\w-]+)+(/[^?]*)?$";
    public static final String VERSION = "2.5";
    private Activity activity;
    private AbstractCollectorProcess collectorProcess;
    private String collectorUrl;
    private StatusListener listener;
    private String merchantId;
    private EnumSet skipList;

    public DeviceCollector(Activity activity1)
    {
        activity = activity1;
    }

    private boolean isNetworkAvailable()
    {
        NetworkInfo networkinfo;
        boolean flag;
        try
        {
            networkinfo = ((ConnectivityManager)activity.getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo();
        }
        catch (Exception exception)
        {
            onCollectorError(ErrorCode.RUNTIME_FAILURE, exception);
            return false;
        }
        if (networkinfo == null) goto _L2; else goto _L1
_L1:
        if (!networkinfo.isConnectedOrConnecting()) goto _L2; else goto _L3
_L3:
        flag = true;
_L5:
        if (flag)
        {
            break MISSING_BLOCK_LABEL_44;
        }
        onCollectorError(ErrorCode.NO_NETWORK, null);
        return flag;
_L2:
        flag = false;
        if (true) goto _L5; else goto _L4
_L4:
    }

    private boolean isValidParams(String s, String s1, String s2)
    {
        if (s == null || !s.matches("^https?://[\\w-]+(\\.[\\w-]+)+(/[^?]*)?$"))
        {
            onCollectorError(ErrorCode.INVALID_URL, null);
            return false;
        }
        if (s1 == null || !s1.matches("^\\d{1,6}$"))
        {
            onCollectorError(ErrorCode.INVALID_MERCHANT, null);
            return false;
        }
        if (s2 == null || !s2.matches("^[\\w-]{1,32}$"))
        {
            onCollectorError(ErrorCode.INVALID_SESSION, null);
            return false;
        } else
        {
            return true;
        }
    }

    private void onCollectorError(ErrorCode errorcode, Exception exception)
    {
        if (listener != null)
        {
            listener.onCollectorError(errorcode, exception);
        }
    }

    public void collect(String s)
    {
        collect(s, -1L);
    }

    public void collect(String s, long l)
    {
        if (collectorProcess != null) goto _L2; else goto _L1
_L1:
        if (!isNetworkAvailable() || !isValidParams(collectorUrl, merchantId, s)) goto _L4; else goto _L3
_L3:
        collectorProcess = new CollectorProcess(activity, listener, skipList);
        collectorProcess.setTimoutMs(l);
        if (android.os.Build.VERSION.SDK_INT <= 10) goto _L6; else goto _L5
_L5:
        collectorProcess.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[] {
            collectorUrl, merchantId, s
        });
_L4:
        return;
_L6:
        collectorProcess.execute(new String[] {
            collectorUrl, merchantId, s
        });
        return;
_L2:
        if (listener != null)
        {
            if (!collectorProcess.isFinished())
            {
                listener.onCollectorError(ErrorCode.RUNTIME_FAILURE, new RuntimeException("Already running. Will not start collecting again."));
                return;
            } else
            {
                listener.onCollectorError(ErrorCode.RUNTIME_FAILURE, new RuntimeException("Already completed. Will not start collecting again."));
                return;
            }
        }
        if (true) goto _L4; else goto _L7
_L7:
    }

    public void setCollectorUrl(String s)
    {
        collectorUrl = s;
    }

    public void setMerchantId(String s)
    {
        merchantId = s;
    }

    public void setStatusListener(StatusListener statuslistener)
    {
        listener = statuslistener;
        if (collectorProcess != null)
        {
            collectorProcess.setListener(listener);
        }
    }

    public void skipCollectors(EnumSet enumset)
    {
        if (enumset != null && enumset.contains(CollectorEnum.WEB))
        {
            throw new RuntimeException("You cannot skip the Web collector");
        } else
        {
            skipList = enumset;
            return;
        }
    }

    public boolean stopNow()
    {
        if (collectorProcess != null && !collectorProcess.isFinished())
        {
            Log.d(getClass().getSimpleName(), "Attempting to cancel..");
            collectorProcess.cancel(true);
            return true;
        } else
        {
            Log.d(getClass().getSimpleName(), "Not started, or already finished.  Skipping cancel.");
            return false;
        }
    }
}
