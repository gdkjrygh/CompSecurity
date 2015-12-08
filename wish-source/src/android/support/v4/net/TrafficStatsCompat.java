// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.net;

import java.net.Socket;
import java.net.SocketException;

// Referenced classes of package android.support.v4.net:
//            TrafficStatsCompatIcs

public class TrafficStatsCompat
{
    static class BaseTrafficStatsCompatImpl
        implements TrafficStatsCompatImpl
    {

        private ThreadLocal mThreadSocketTags;

        public void clearThreadStatsTag()
        {
            ((SocketTags)mThreadSocketTags.get()).statsTag = -1;
        }

        public int getThreadStatsTag()
        {
            return ((SocketTags)mThreadSocketTags.get()).statsTag;
        }

        public void incrementOperationCount(int i)
        {
        }

        public void incrementOperationCount(int i, int j)
        {
        }

        public void setThreadStatsTag(int i)
        {
            ((SocketTags)mThreadSocketTags.get()).statsTag = i;
        }

        public void tagSocket(Socket socket)
        {
        }

        public void untagSocket(Socket socket)
        {
        }

        BaseTrafficStatsCompatImpl()
        {
            mThreadSocketTags = new _cls1();
        }
    }

    private static class BaseTrafficStatsCompatImpl.SocketTags
    {

        public int statsTag;

        private BaseTrafficStatsCompatImpl.SocketTags()
        {
            statsTag = -1;
        }

    }

    static class IcsTrafficStatsCompatImpl
        implements TrafficStatsCompatImpl
    {

        public void clearThreadStatsTag()
        {
            TrafficStatsCompatIcs.clearThreadStatsTag();
        }

        public int getThreadStatsTag()
        {
            return TrafficStatsCompatIcs.getThreadStatsTag();
        }

        public void incrementOperationCount(int i)
        {
            TrafficStatsCompatIcs.incrementOperationCount(i);
        }

        public void incrementOperationCount(int i, int j)
        {
            TrafficStatsCompatIcs.incrementOperationCount(i, j);
        }

        public void setThreadStatsTag(int i)
        {
            TrafficStatsCompatIcs.setThreadStatsTag(i);
        }

        public void tagSocket(Socket socket)
            throws SocketException
        {
            TrafficStatsCompatIcs.tagSocket(socket);
        }

        public void untagSocket(Socket socket)
            throws SocketException
        {
            TrafficStatsCompatIcs.untagSocket(socket);
        }

        IcsTrafficStatsCompatImpl()
        {
        }
    }

    static interface TrafficStatsCompatImpl
    {

        public abstract void clearThreadStatsTag();

        public abstract int getThreadStatsTag();

        public abstract void incrementOperationCount(int i);

        public abstract void incrementOperationCount(int i, int j);

        public abstract void setThreadStatsTag(int i);

        public abstract void tagSocket(Socket socket)
            throws SocketException;

        public abstract void untagSocket(Socket socket)
            throws SocketException;
    }


    private static final TrafficStatsCompatImpl IMPL;

    public TrafficStatsCompat()
    {
    }

    public static void clearThreadStatsTag()
    {
        IMPL.clearThreadStatsTag();
    }

    public static int getThreadStatsTag()
    {
        return IMPL.getThreadStatsTag();
    }

    public static void incrementOperationCount(int i)
    {
        IMPL.incrementOperationCount(i);
    }

    public static void incrementOperationCount(int i, int j)
    {
        IMPL.incrementOperationCount(i, j);
    }

    public static void setThreadStatsTag(int i)
    {
        IMPL.setThreadStatsTag(i);
    }

    public static void tagSocket(Socket socket)
        throws SocketException
    {
        IMPL.tagSocket(socket);
    }

    public static void untagSocket(Socket socket)
        throws SocketException
    {
        IMPL.untagSocket(socket);
    }

    static 
    {
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            IMPL = new IcsTrafficStatsCompatImpl();
        } else
        {
            IMPL = new BaseTrafficStatsCompatImpl();
        }
    }

    // Unreferenced inner class android/support/v4/net/TrafficStatsCompat$BaseTrafficStatsCompatImpl$1

/* anonymous class */
    class BaseTrafficStatsCompatImpl._cls1 extends ThreadLocal
    {

        final BaseTrafficStatsCompatImpl this$0;

        protected BaseTrafficStatsCompatImpl.SocketTags initialValue()
        {
            return new BaseTrafficStatsCompatImpl.SocketTags();
        }

        protected volatile Object initialValue()
        {
            return initialValue();
        }

            
            {
                this$0 = BaseTrafficStatsCompatImpl.this;
                super();
            }
    }

}
