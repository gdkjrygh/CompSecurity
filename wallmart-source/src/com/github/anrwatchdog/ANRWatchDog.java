// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.github.anrwatchdog;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;

// Referenced classes of package com.github.anrwatchdog:
//            ANRError

public class ANRWatchDog extends Thread
{
    public static interface ANRListener
    {

        public abstract void onAppNotResponding(ANRError anrerror);
    }

    public static interface InterruptionListener
    {

        public abstract void onInterrupted(InterruptedException interruptedexception);
    }


    private static final ANRListener DEFAULT_ANR_LISTENER = new ANRListener() {

        public void onAppNotResponding(ANRError anrerror)
        {
            throw anrerror;
        }

    };
    private static final int DEFAULT_ANR_TIMEOUT = 5000;
    private static final InterruptionListener DEFAULT_INTERRUPTION_LISTENER = new InterruptionListener() {

        public void onInterrupted(InterruptedException interruptedexception)
        {
            Log.w("ANRWatchdog", (new StringBuilder()).append("Interrupted: ").append(interruptedexception.getMessage()).toString());
        }

    };
    private ANRListener _anrListener;
    private InterruptionListener _interruptionListener;
    private boolean _logThreadsWithoutStackTrace;
    private String _namePrefix;
    private volatile int _tick;
    private final Runnable _ticker;
    private final int _timeoutInterval;
    private final Handler _uiHandler;

    public ANRWatchDog()
    {
        this(5000);
    }

    public ANRWatchDog(int i)
    {
        _anrListener = DEFAULT_ANR_LISTENER;
        _interruptionListener = DEFAULT_INTERRUPTION_LISTENER;
        _uiHandler = new Handler(Looper.getMainLooper());
        _namePrefix = "";
        _logThreadsWithoutStackTrace = false;
        _tick = 0;
        _ticker = new Runnable() {

            final ANRWatchDog this$0;

            public void run()
            {
                _tick = (_tick + 1) % 10;
            }

            
            {
                this$0 = ANRWatchDog.this;
                super();
            }
        };
        _timeoutInterval = i;
    }

    public void run()
    {
        setName("|ANR-WatchDog|");
        do
        {
            if (isInterrupted())
            {
                break;
            }
            int i = _tick;
            _uiHandler.post(_ticker);
            Object obj;
            try
            {
                Thread.sleep(_timeoutInterval);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                _interruptionListener.onInterrupted(((InterruptedException) (obj)));
                return;
            }
            if (_tick != i)
            {
                continue;
            }
            if (_namePrefix != null)
            {
                obj = ANRError.New(_namePrefix, _logThreadsWithoutStackTrace);
            } else
            {
                obj = ANRError.NewMainOnly();
            }
            _anrListener.onAppNotResponding(((ANRError) (obj)));
            break;
        } while (true);
    }

    public ANRWatchDog setANRListener(ANRListener anrlistener)
    {
        if (anrlistener == null)
        {
            _anrListener = DEFAULT_ANR_LISTENER;
            return this;
        } else
        {
            _anrListener = anrlistener;
            return this;
        }
    }

    public ANRWatchDog setInterruptionListener(InterruptionListener interruptionlistener)
    {
        if (interruptionlistener == null)
        {
            _interruptionListener = DEFAULT_INTERRUPTION_LISTENER;
            return this;
        } else
        {
            _interruptionListener = interruptionlistener;
            return this;
        }
    }

    public void setLogThreadsWithoutStackTrace(boolean flag)
    {
        _logThreadsWithoutStackTrace = flag;
    }

    public ANRWatchDog setReportMainThreadOnly()
    {
        _namePrefix = null;
        return this;
    }

    public ANRWatchDog setReportThreadNamePrefix(String s)
    {
        String s1 = s;
        if (s == null)
        {
            s1 = "";
        }
        _namePrefix = s1;
        return this;
    }




/*
    static int access$002(ANRWatchDog anrwatchdog, int i)
    {
        anrwatchdog._tick = i;
        return i;
    }

*/
}
