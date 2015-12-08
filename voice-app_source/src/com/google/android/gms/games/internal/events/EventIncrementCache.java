// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.events;

import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class EventIncrementCache
{

    final Object zzasG = new Object();
    private Handler zzasH;
    private boolean zzasI;
    private HashMap zzasJ;
    private int zzasK;

    public EventIncrementCache(Looper looper, int i)
    {
        zzasH = new Handler(looper);
        zzasJ = new HashMap();
        zzasK = i;
    }

    static void zza(EventIncrementCache eventincrementcache)
    {
        eventincrementcache.zzth();
    }

    private void zzth()
    {
        synchronized (zzasG)
        {
            zzasI = false;
            flush();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void flush()
    {
        Object obj = zzasG;
        obj;
        JVM INSTR monitorenter ;
        java.util.Map.Entry entry;
        for (Iterator iterator = zzasJ.entrySet().iterator(); iterator.hasNext(); zzs((String)entry.getKey(), ((AtomicInteger)entry.getValue()).get()))
        {
            entry = (java.util.Map.Entry)iterator.next();
        }

        break MISSING_BLOCK_LABEL_72;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        zzasJ.clear();
        obj;
        JVM INSTR monitorexit ;
    }

    protected abstract void zzs(String s, int i);

    public void zzw(String s, int i)
    {
        Object obj = zzasG;
        obj;
        JVM INSTR monitorenter ;
        AtomicInteger atomicinteger1;
        if (!zzasI)
        {
            zzasI = true;
            zzasH.postDelayed(new Runnable() {

                final EventIncrementCache zzasL;

                public void run()
                {
                    EventIncrementCache.zza(zzasL);
                }

            
            {
                zzasL = EventIncrementCache.this;
                super();
            }
            }, zzasK);
        }
        atomicinteger1 = (AtomicInteger)zzasJ.get(s);
        AtomicInteger atomicinteger;
        atomicinteger = atomicinteger1;
        if (atomicinteger1 != null)
        {
            break MISSING_BLOCK_LABEL_81;
        }
        atomicinteger = new AtomicInteger();
        zzasJ.put(s, atomicinteger);
        atomicinteger.addAndGet(i);
        obj;
        JVM INSTR monitorexit ;
        return;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }
}
