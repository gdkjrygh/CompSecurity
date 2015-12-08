// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.net;

import java.net.Socket;

// Referenced classes of package android.support.v4.net:
//            TrafficStatsCompat

static class _cls1.initialValue
    implements _cls1.initialValue
{
    private static class SocketTags
    {

        public int statsTag;

        private SocketTags()
        {
            statsTag = -1;
        }

        SocketTags(TrafficStatsCompat._cls1 _pcls1)
        {
            this();
        }
    }


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

    _cls1.this._cls0()
    {
        mThreadSocketTags = new ThreadLocal() {

            final TrafficStatsCompat.BaseTrafficStatsCompatImpl this$0;

            protected SocketTags initialValue()
            {
                return new SocketTags(null);
            }

            protected volatile Object initialValue()
            {
                return initialValue();
            }

            
            {
                this$0 = TrafficStatsCompat.BaseTrafficStatsCompatImpl.this;
                super();
            }
        };
    }
}
