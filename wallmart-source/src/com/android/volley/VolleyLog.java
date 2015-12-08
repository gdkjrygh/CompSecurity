// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.volley;

import android.os.SystemClock;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public class VolleyLog
{
    static class MarkerLog
    {

        public static final boolean ENABLED;
        private static final long MIN_DURATION_FOR_LOGGING_MS = 0L;
        private boolean mFinished;
        private final List mMarkers = new ArrayList();

        private long getTotalDuration()
        {
            if (mMarkers.size() == 0)
            {
                return 0L;
            } else
            {
                long l = ((Marker)mMarkers.get(0)).time;
                return ((Marker)mMarkers.get(mMarkers.size() - 1)).time - l;
            }
        }

        public void add(String s, long l)
        {
            this;
            JVM INSTR monitorenter ;
            if (mFinished)
            {
                throw new IllegalStateException("Marker added to finished log");
            }
            break MISSING_BLOCK_LABEL_24;
            s;
            this;
            JVM INSTR monitorexit ;
            throw s;
            mMarkers.add(new Marker(s, l, SystemClock.elapsedRealtime()));
            this;
            JVM INSTR monitorexit ;
        }

        protected void finalize()
            throws Throwable
        {
            if (!mFinished)
            {
                finish("Request on the loose");
                VolleyLog.e("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
            }
        }

        public void finish(String s)
        {
            this;
            JVM INSTR monitorenter ;
            long l1;
            mFinished = true;
            l1 = getTotalDuration();
            if (l1 > 0L) goto _L2; else goto _L1
_L1:
            this;
            JVM INSTR monitorexit ;
            return;
_L2:
            long l;
            l = ((Marker)mMarkers.get(0)).time;
            VolleyLog.d("(%-4d ms) %s", new Object[] {
                Long.valueOf(l1), s
            });
            s = mMarkers.iterator();
_L4:
            if (!s.hasNext())
            {
                break; /* Loop/switch isn't completed */
            }
            Marker marker = (Marker)s.next();
            l1 = marker.time;
            VolleyLog.d("(+%-4d) [%2d] %s", new Object[] {
                Long.valueOf(l1 - l), Long.valueOf(marker.thread), marker.name
            });
            l = l1;
            if (true) goto _L4; else goto _L3
_L3:
            if (true) goto _L1; else goto _L5
_L5:
            s;
            throw s;
        }

        static 
        {
            ENABLED = VolleyLog.DEBUG;
        }

        MarkerLog()
        {
            mFinished = false;
        }
    }

    private static class MarkerLog.Marker
    {

        public final String name;
        public final long thread;
        public final long time;

        public MarkerLog.Marker(String s, long l, long l1)
        {
            name = s;
            thread = l;
            time = l1;
        }
    }


    public static boolean DEBUG;
    public static String TAG;

    public VolleyLog()
    {
    }

    private static transient String buildMessage(String s, Object aobj[])
    {
        String s1;
        StackTraceElement astacktraceelement[];
        int i;
        if (aobj != null)
        {
            s = String.format(Locale.US, s, aobj);
        }
        astacktraceelement = (new Throwable()).fillInStackTrace().getStackTrace();
        s1 = "<unknown>";
        i = 2;
        do
        {
label0:
            {
                aobj = s1;
                if (i < astacktraceelement.length)
                {
                    if (astacktraceelement[i].getClass().equals(com/android/volley/VolleyLog))
                    {
                        break label0;
                    }
                    aobj = astacktraceelement[i].getClassName();
                    aobj = ((String) (aobj)).substring(((String) (aobj)).lastIndexOf('.') + 1);
                    aobj = ((String) (aobj)).substring(((String) (aobj)).lastIndexOf('$') + 1);
                    aobj = (new StringBuilder()).append(((String) (aobj))).append(".").append(astacktraceelement[i].getMethodName()).toString();
                }
                return String.format(Locale.US, "[%d] %s: %s", new Object[] {
                    Long.valueOf(Thread.currentThread().getId()), aobj, s
                });
            }
            i++;
        } while (true);
    }

    public static transient void d(String s, Object aobj[])
    {
        Log.d(TAG, buildMessage(s, aobj));
    }

    public static transient void e(String s, Object aobj[])
    {
        Log.e(TAG, buildMessage(s, aobj));
    }

    public static transient void e(Throwable throwable, String s, Object aobj[])
    {
        Log.e(TAG, buildMessage(s, aobj), throwable);
    }

    public static void setTag(String s)
    {
        d("Changing log tag to %s", new Object[] {
            s
        });
        TAG = s;
        DEBUG = Log.isLoggable(TAG, 2);
    }

    public static transient void v(String s, Object aobj[])
    {
        if (DEBUG)
        {
            Log.v(TAG, buildMessage(s, aobj));
        }
    }

    public static transient void wtf(String s, Object aobj[])
    {
        Log.wtf(TAG, buildMessage(s, aobj));
    }

    public static transient void wtf(Throwable throwable, String s, Object aobj[])
    {
        Log.wtf(TAG, buildMessage(s, aobj), throwable);
    }

    static 
    {
        TAG = "Volley";
        DEBUG = Log.isLoggable(TAG, 2);
    }
}
