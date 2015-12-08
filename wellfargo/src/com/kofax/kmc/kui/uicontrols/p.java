// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kui.uicontrols;

import android.os.Handler;
import android.os.Looper;
import com.squareup.otto.Bus;
import java.util.LinkedList;

// Referenced classes of package com.kofax.kmc.kui.uicontrols:
//            l

final class p
{

    private final LinkedList a = new LinkedList();
    private final Bus b;
    private boolean c;
    private boolean d;
    private Object e;

    public p(Bus bus)
    {
        e = new Object();
        if (bus == null)
        {
            throw new IllegalArgumentException("Bus cannot be null");
        } else
        {
            b = bus;
            b.register(this);
            return;
        }
    }

    static Bus a(p p1)
    {
        return p1.b;
    }

    private void a()
    {
        Object obj1 = e;
        obj1;
        JVM INSTR monitorenter ;
        Object obj;
        LinkedList linkedlist;
        linkedlist = new LinkedList();
        obj = (l)a.pop();
_L2:
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_70;
        }
        l l1;
        linkedlist.add(obj);
        l1 = (l)a.pollFirst();
        ((l) (obj)).setNext(l1);
        if (l1 == null)
        {
            break MISSING_BLOCK_LABEL_95;
        }
        l1.setNext(null);
        break MISSING_BLOCK_LABEL_95;
        a.clear();
        a.addAll(linkedlist);
        obj1;
        JVM INSTR monitorexit ;
        return;
        obj;
        obj1;
        JVM INSTR monitorexit ;
        throw obj;
        obj = l1;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public l a(int i)
    {
        Object obj = e;
        obj;
        JVM INSTR monitorenter ;
        l l1;
        if (i >= a.size())
        {
            break MISSING_BLOCK_LABEL_38;
        }
        l1 = (l)a.remove(i);
        a();
        obj;
        JVM INSTR monitorexit ;
        return l1;
        a();
        obj;
        JVM INSTR monitorexit ;
        return null;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        exception;
        a();
        throw exception;
    }

    public void a(int i, l l1)
    {
        Object obj = e;
        obj;
        JVM INSTR monitorenter ;
        int j = i;
        if (a.remove(l1))
        {
            j = i - 1;
        }
        a.add(j, l1);
        a();
        obj;
        JVM INSTR monitorexit ;
        return;
        l1;
        obj;
        JVM INSTR monitorexit ;
        throw l1;
    }

    public void a(BusEvents.ImageCapturedBusEvent imagecapturedbusevent)
    {
        c = false;
    }

    public void a(BusEvents.UseVideoChangedEvent usevideochangedevent)
    {
        d = usevideochangedevent.useVideo;
    }

    public void a(l l1)
    {
        synchronized (e)
        {
            a(a.size(), l1);
        }
        return;
        l1;
        obj;
        JVM INSTR monitorexit ;
        throw l1;
    }

    boolean a(BusEvents.PreviewImageReadyBusEvent previewimagereadybusevent)
    {
label0:
        {
            synchronized (e)
            {
                if (!c && a.size() > 0)
                {
                    break label0;
                }
            }
            return false;
        }
        if (((l)a.get(0)).isMet(previewimagereadybusevent))
        {
            break MISSING_BLOCK_LABEL_52;
        }
        obj;
        JVM INSTR monitorexit ;
        return false;
        c = true;
        if (!d)
        {
            break MISSING_BLOCK_LABEL_91;
        }
        (new Handler(Looper.getMainLooper())).post(new _cls1(previewimagereadybusevent));
_L1:
        obj;
        JVM INSTR monitorexit ;
        return true;
        b.post(new BusEvents.CaptureImageRequestEvent());
          goto _L1
        previewimagereadybusevent;
        obj;
        JVM INSTR monitorexit ;
        throw previewimagereadybusevent;
    }

    public void b(BusEvents.PreviewImageReadyBusEvent previewimagereadybusevent)
    {
        a(previewimagereadybusevent);
    }

    public boolean b(l l1)
    {
        Object obj = e;
        obj;
        JVM INSTR monitorenter ;
        boolean flag = a.remove(l1);
        a();
        obj;
        JVM INSTR monitorexit ;
        return flag;
        l1;
        a();
        throw l1;
        l1;
        obj;
        JVM INSTR monitorexit ;
        throw l1;
    }

    private class _cls1
        implements Runnable
    {

        final BusEvents.PreviewImageReadyBusEvent a;
        final p b;

        public void run()
        {
            p.a(b).post(new BusEvents.ImageCapturedBusEvent(a.getBitmap(true)));
        }

        _cls1(BusEvents.PreviewImageReadyBusEvent previewimagereadybusevent)
        {
            b = p.this;
            a = previewimagereadybusevent;
            super();
        }
    }

}
