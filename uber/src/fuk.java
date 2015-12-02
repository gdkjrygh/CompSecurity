// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.chat.model.ConversationThread;
import com.ubercab.chat.model.ReceiveStatus;
import com.ubercab.rider.realtime.model.Trip;
import com.ubercab.rider.realtime.model.TripDriver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class fuk
{

    private final cxu a;
    private final hkr b;
    private final List c = new ArrayList();
    private final ick d = new ick() {

        final fuk a;

        private void a(ReceiveStatus receivestatus)
        {
            ConversationThread conversationthread;
            conversationthread = fuk.a(a);
            break MISSING_BLOCK_LABEL_8;
            if (conversationthread != null && (gjx.a(receivestatus.getThreadId(), conversationthread.getThreadId()) || gjx.a(receivestatus.getConnectedUserId(), conversationthread.getConnectedUserId())) && receivestatus.getStatus() == 1 && conversationthread.getLastReceivedMessage() != null)
            {
                receivestatus = fuk.b(a).iterator();
                while (receivestatus.hasNext()) 
                {
                    ((ful)receivestatus.next()).D();
                }
            }
            return;
        }

        public final void a()
        {
        }

        public final volatile void a(Object obj)
        {
            a((ReceiveStatus)obj);
        }

        public final void a(Throwable throwable)
        {
        }

            
            {
                a = fuk.this;
                super();
            }
    };

    public fuk(cxu cxu1, hkr hkr1)
    {
        a = cxu1;
        b = hkr1;
    }

    static ConversationThread a(fuk fuk1)
    {
        return fuk1.c();
    }

    static List b(fuk fuk1)
    {
        return fuk1.c;
    }

    private ConversationThread c()
    {
        Object obj = b.f();
        if (obj == null)
        {
            return null;
        } else
        {
            String s = ((Trip) (obj)).getDriver().getUuid();
            obj = ((Trip) (obj)).getUuid();
            return a.a(s, ((String) (obj)));
        }
    }

    public final void a()
    {
        if (!d.c())
        {
            a.b().b(d);
        }
    }

    public final void a(ful ful)
    {
        c.add(ful);
    }

    public final void b()
    {
        if (d.c())
        {
            d.b();
        }
    }

    public final void b(ful ful)
    {
        c.remove(ful);
    }
}
