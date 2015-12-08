// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.impl.conn.tsccm;


// Referenced classes of package ch.boye.httpclientandroidlib.impl.conn.tsccm:
//            WaitingThread

public class WaitingThreadAborter
{

    private boolean aborted;
    private WaitingThread waitingThread;

    public WaitingThreadAborter()
    {
    }

    public void abort()
    {
        aborted = true;
        if (waitingThread != null)
        {
            waitingThread.interrupt();
        }
    }

    public void setWaitingThread(WaitingThread waitingthread)
    {
        waitingThread = waitingthread;
        if (aborted)
        {
            waitingthread.interrupt();
        }
    }
}
