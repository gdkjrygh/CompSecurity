// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class hzd extends Thread
{

    public hzd()
    {
        super("Okio Watchdog");
        setDaemon(true);
    }

    public final void run()
    {
        do
        {
            hzc hzc1;
            do
            {
                hzc1 = hzc.access$000();
            } while (hzc1 == null);
            try
            {
                hzc1.timedOut();
            }
            catch (InterruptedException interruptedexception) { }
        } while (true);
    }
}
