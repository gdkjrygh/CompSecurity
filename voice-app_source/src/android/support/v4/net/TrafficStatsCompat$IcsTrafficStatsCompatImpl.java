// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.net;

import java.net.Socket;
import java.net.SocketException;

// Referenced classes of package android.support.v4.net:
//            TrafficStatsCompat, TrafficStatsCompatIcs

static class I
    implements I
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

    I()
    {
    }
}
