// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sessionm.net;

import android.util.Log;
import com.sessionm.c.c;
import com.sessionm.core.Session;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;

// Referenced classes of package com.sessionm.net:
//            c, Request, d, a

public class RequestQueue extends com.sessionm.net.c
{
    public static final class RequestQueueNetworkState extends Enum
    {

        public static final RequestQueueNetworkState hA;
        private static final RequestQueueNetworkState hB[];
        public static final RequestQueueNetworkState hy;
        public static final RequestQueueNetworkState hz;

        public static RequestQueueNetworkState valueOf(String s)
        {
            return (RequestQueueNetworkState)Enum.valueOf(com/sessionm/net/RequestQueue$RequestQueueNetworkState, s);
        }

        public static RequestQueueNetworkState[] values()
        {
            return (RequestQueueNetworkState[])hB.clone();
        }

        static 
        {
            hy = new RequestQueueNetworkState("CONNECTED", 0);
            hz = new RequestQueueNetworkState("DISCONNECTED", 1);
            hA = new RequestQueueNetworkState("CONNECTING", 2);
            hB = (new RequestQueueNetworkState[] {
                hy, hz, hA
            });
        }

        private RequestQueueNetworkState(String s, int l)
        {
            super(s, l);
        }
    }

    public static final class RequestQueueSendState extends Enum
    {

        public static final RequestQueueSendState hC;
        public static final RequestQueueSendState hD;
        private static final RequestQueueSendState hE[];

        public static RequestQueueSendState valueOf(String s)
        {
            return (RequestQueueSendState)Enum.valueOf(com/sessionm/net/RequestQueue$RequestQueueSendState, s);
        }

        public static RequestQueueSendState[] values()
        {
            return (RequestQueueSendState[])hE.clone();
        }

        static 
        {
            hC = new RequestQueueSendState("IDLE", 0);
            hD = new RequestQueueSendState("SENDING", 1);
            hE = (new RequestQueueSendState[] {
                hC, hD
            });
        }

        private RequestQueueSendState(String s, int l)
        {
            super(s, l);
        }
    }

    public static final class RequestQueueState extends Enum
    {

        public static final RequestQueueState hF;
        public static final RequestQueueState hG;
        private static final RequestQueueState hH[];

        public static RequestQueueState valueOf(String s)
        {
            return (RequestQueueState)Enum.valueOf(com/sessionm/net/RequestQueue$RequestQueueState, s);
        }

        public static RequestQueueState[] values()
        {
            return (RequestQueueState[])hH.clone();
        }

        static 
        {
            hF = new RequestQueueState("STOPPED", 0);
            hG = new RequestQueueState("STARTED", 1);
            hH = (new RequestQueueState[] {
                hF, hG
            });
        }

        private RequestQueueState(String s, int l)
        {
            super(s, l);
        }
    }

    public static final class RequestQueueType extends Enum
    {

        public static final RequestQueueType hI;
        public static final RequestQueueType hJ;
        private static final RequestQueueType hK[];

        public static RequestQueueType valueOf(String s)
        {
            return (RequestQueueType)Enum.valueOf(com/sessionm/net/RequestQueue$RequestQueueType, s);
        }

        public static RequestQueueType[] values()
        {
            return (RequestQueueType[])hK.clone();
        }

        static 
        {
            hI = new RequestQueueType("FAST_FAIL", 0);
            hJ = new RequestQueueType("BEST_EFFORT", 1);
            hK = (new RequestQueueType[] {
                hI, hJ
            });
        }

        private RequestQueueType(String s, int l)
        {
            super(s, l);
        }
    }

    class a extends TimerTask
    {

        final RequestQueue hx;

        public void run()
        {
            if (Log.isLoggable("SessionM.RequestQueue", 3))
            {
                Log.d("SessionM.RequestQueue", "Executing scheduled send task.");
            }
            RequestQueue.d(hx).execute(new Runnable(this) {

                final a hL;

                public void run()
                {
                    synchronized (Session.D())
                    {
                        RequestQueue.a(hL.hx, null, null, true);
                    }
                    return;
                    exception;
                    session;
                    JVM INSTR monitorexit ;
                    throw exception;
                }

            
            {
                hL = a1;
                super();
            }
            });
        }

        a()
        {
            hx = RequestQueue.this;
            super();
        }
    }


    public static final String TAG = "SessionM.RequestQueue";
    private static final int hh = 10;
    private static final int hi = 1000;
    private ExecutorService ck;
    private com.sessionm.net.a fV;
    private Request gk;
    private List he;
    private final Map hf = new ConcurrentHashMap();
    private final List hg = new CopyOnWriteArrayList();
    private Request hj;
    private Request hk;
    private int hl;
    private int hm;
    private boolean hn;
    private RequestQueueState ho;
    private int hp;
    private int hq;
    private RequestQueueSendState hr;
    private RequestQueueType hs;
    private Timer ht;
    private boolean hu;
    private RequestQueueNetworkState hv;
    private long hw;

    public RequestQueue(List list, RequestQueueType requestqueuetype, ExecutorService executorservice, com.sessionm.net.a a1)
    {
        he = new ArrayList();
        he.addAll(list);
        hr = RequestQueueSendState.hC;
        hv = RequestQueueNetworkState.hz;
        q(10);
        p(1000);
        hn = false;
        hs = requestqueuetype;
        ck = executorservice;
        fV = a1;
    }

    private void a(Request request, c c1, boolean flag)
    {
        if (request != null)
        {
            if (request.ba() != null && Log.isLoggable("SessionM.RequestQueue", 6))
            {
                Log.e("SessionM.RequestQueue", "Request is already enqueued.");
            }
            c1.l(request);
        }
        if (ho != RequestQueueState.hF) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (!flag)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (Log.isLoggable("SessionM.RequestQueue", 3))
        {
            Log.d("SessionM.RequestQueue", String.format(Locale.US, "Attempt to immediately dispatch request %s", new Object[] {
                request
            }));
        }
        if (hj != null)
        {
            break; /* Loop/switch isn't completed */
        }
        request = g(request);
        if (request != null)
        {
            i(request);
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        if (hk != null)
        {
            if (Log.isLoggable("SessionM.RequestQueue", 6))
            {
                Log.e("SessionM.RequestQueue", String.format("There already is a next request: %s", new Object[] {
                    hk
                }));
                return;
            }
        } else
        {
            if (Log.isLoggable("SessionM.RequestQueue", 3))
            {
                Log.d("SessionM.RequestQueue", String.format(Locale.US, "Setting request(%s) to nextRequest.", new Object[] {
                    request
                }));
            }
            hk = request;
            hu = true;
            return;
        }
        if (true)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (hm != 0 || hj != null) goto _L1; else goto _L4
_L4:
        request = g(null);
        if (request != null)
        {
            i(request);
            return;
        }
        if (true) goto _L1; else goto _L5
_L5:
    }

    private void a(RequestQueueSendState requestqueuesendstate)
    {
        if (hr != requestqueuesendstate)
        {
            if (Log.isLoggable("SessionM.RequestQueue", 3))
            {
                Log.d("SessionM.RequestQueue", String.format(Locale.US, "Queue: %s transitioning to state: %s", new Object[] {
                    this, requestqueuesendstate
                }));
            }
            hr = requestqueuesendstate;
            for (requestqueuesendstate = hg.iterator(); requestqueuesendstate.hasNext(); ((d)requestqueuesendstate.next()).a(this, hr)) { }
        }
    }

    static void a(RequestQueue requestqueue, Request request, c c1, boolean flag)
    {
        requestqueue.a(request, c1, flag);
    }

    private void ar()
    {
        String s;
        if (hs != RequestQueueType.hI)
        {
            if (!(s = Thread.currentThread().getName()).startsWith("SessionM Session Thread") && Log.isLoggable("SessionM.RequestQueue", 3))
            {
                Log.d("SessionM.RequestQueue", String.format("RequestQueue method called from wrong thread: %s", new Object[] {
                    s
                }), new Throwable());
                return;
            }
        }
    }

    private void bu()
    {
        if (hr != RequestQueueSendState.hD)
        {
            Request request = hk;
            hk = null;
            request = g(request);
            if (request != null)
            {
                i(request);
                return;
            }
        }
    }

    private void bv()
    {
        if (ht != null)
        {
            ht.cancel();
            ht = null;
        }
        if (hn && bw() > 0)
        {
            ht = new Timer();
            ht.schedule(new a(), bw());
        }
    }

    private int bw()
    {
        return hm;
    }

    private Request bx()
    {
        return gk;
    }

    static ExecutorService d(RequestQueue requestqueue)
    {
        return requestqueue.ck;
    }

    private void d(Request request)
    {
        if (gk != null && gk != request)
        {
            gk.reset();
        }
        gk = request;
    }

    static void d(RequestQueue requestqueue, Request request)
    {
        requestqueue.j(request);
    }

    static void e(RequestQueue requestqueue, Request request)
    {
        requestqueue.h(request);
    }

    private Request g(Request request)
    {
        int l;
        if (Log.isLoggable("SessionM.RequestQueue", 3))
        {
            Log.d("SessionM.RequestQueue", String.format(Locale.US, "linking requests on queue:%s to request: %s", new Object[] {
                this, request
            }));
        }
        if (request != null)
        {
            l = hl - 1;
        } else
        {
            l = hl;
        }
        if (l == 0)
        {
            l = 1;
        }
        if (request == null || l != 1) goto _L2; else goto _L1
_L1:
        return request;
_L2:
        Object obj;
        Object obj1;
        obj = null;
        Iterator iterator = he.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break; /* Loop/switch isn't completed */
            }
            obj1 = ((c)iterator.next()).r(l);
            obj = obj1;
        } while (((List) (obj1)).size() <= 0);
_L4:
        obj = request;
        if (obj1 != null)
        {
            obj = request;
            if (((List) (obj1)).size() > 0)
            {
                if (request != null)
                {
                    request.b(((List) (obj1)));
                    obj = request;
                } else
                {
                    obj = (Request)((List) (obj1)).get(0);
                    if (((List) (obj1)).size() > 1)
                    {
                        ((Request) (obj)).b(((List) (obj1)).subList(1, ((List) (obj1)).size()));
                    }
                }
            }
        }
        request = ((Request) (obj));
        if (Log.isLoggable("SessionM.RequestQueue", 3))
        {
            Log.d("SessionM.RequestQueue", String.format(Locale.US, "Request(%s) linked on queue: %s", new Object[] {
                obj, this
            }));
            return ((Request) (obj));
        }
        if (true) goto _L1; else goto _L3
_L3:
        obj1 = obj;
          goto _L4
        if (true) goto _L1; else goto _L5
_L5:
    }

    private void h(Request request)
    {
        this;
        JVM INSTR monitorenter ;
        Object obj;
        ar();
        obj = (List)hf.get(request.getID());
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_64;
        }
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); ((com.sessionm.net.c)((Iterator) (obj)).next()).onReplyReceived(request)) { }
        break MISSING_BLOCK_LABEL_64;
        request;
        throw request;
        obj = hg.iterator();
_L1:
        d d1;
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break MISSING_BLOCK_LABEL_153;
            }
            d1 = (d)((Iterator) (obj)).next();
            if (request.bc() != 1)
            {
                break MISSING_BLOCK_LABEL_112;
            }
            d1.b(this, request);
        } while (true);
        Iterator iterator = request.bb().iterator();
        while (iterator.hasNext()) 
        {
            d1.b(this, (Request)iterator.next());
        }
          goto _L1
        if (request.bd() != Request.State.gJ && !request.be()) goto _L3; else goto _L2
_L2:
        a(RequestQueueNetworkState.hz);
_L6:
        d(request);
        if (request.bd().bh())
        {
            k(request);
            hj = null;
        }
        a(RequestQueueSendState.hC);
        boolean flag;
        if (hu || hn && bw() == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        hu = false;
        if (!flag) goto _L5; else goto _L4
_L4:
        bu();
_L8:
        this;
        JVM INSTR monitorexit ;
        return;
_L3:
        a(RequestQueueNetworkState.hy);
          goto _L6
_L5:
        if (!hn || ht == null) goto _L8; else goto _L7
_L7:
        ht.schedule(new a(), bw());
          goto _L8
    }

    private void i(Request request)
    {
        if (Log.isLoggable("SessionM.RequestQueue", 3))
        {
            Log.d("SessionM.RequestQueue", (new StringBuilder()).append("Start request: ").append(request).toString());
        }
        long l = hw - System.currentTimeMillis();
        boolean flag;
        if (l <= 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            if (Log.isLoggable("SessionM.RequestQueue", 3))
            {
                Log.d("SessionM.RequestQueue", (new StringBuilder()).append("Abort request dispatch. Send threshold time not exceeded. Remaining delay: ").append(l).append("ms").toString());
            }
            return;
        }
        hw = -1L;
        if (hj != null && Log.isLoggable("SessionM.RequestQueue", 6))
        {
            Log.e("SessionM.RequestQueue", (new StringBuilder()).append("current request ").append(hj).append(" was not null").toString());
        }
        if (hv == RequestQueueNetworkState.hz)
        {
            a(RequestQueueNetworkState.hA);
        }
        request.o(hp);
        request.a(this);
        request.d(bx());
        request.a(fV);
        hj = request;
        request.send();
        hp = hp + 1;
        hq = hq + request.bc();
    }

    private void j(Request request)
    {
        ar();
        a(RequestQueueSendState.hD);
        Object obj = (List)hf.get(request.getID());
        if (obj != null)
        {
            for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); ((com.sessionm.net.c)((Iterator) (obj)).next()).onRequestSent(request)) { }
        }
        for (Iterator iterator = hg.iterator(); iterator.hasNext();)
        {
            d d1 = (d)iterator.next();
            if (request.bc() == 1)
            {
                d1.a(this, request);
            } else
            {
                Iterator iterator1 = request.bb().iterator();
                while (iterator1.hasNext()) 
                {
                    d1.a(this, (Request)iterator1.next());
                }
            }
        }

    }

    private void k(Request request)
    {
        if (Log.isLoggable("SessionM.RequestQueue", 3))
        {
            Log.d("SessionM.RequestQueue", (new StringBuilder()).append("Finish request: ").append(request).toString());
        }
        if (ho != RequestQueueState.hF && hj != request && Log.isLoggable("SessionM.RequestQueue", 6))
        {
            Log.e("SessionM.RequestQueue", (new StringBuilder()).append("Request finished ").append(request).append(" but it was not the current request ").append(hj).toString());
        }
        if (hs != RequestQueueType.hI && (hs != RequestQueueType.hJ || request.bd() != Request.State.gI && !request.be())) goto _L2; else goto _L1
_L1:
        c c1 = request.ba();
        if (c1 != null) goto _L4; else goto _L3
_L3:
        if (Log.isLoggable("SessionM.RequestQueue", 3))
        {
            Log.e("SessionM.RequestQueue", "Store is null for request. This should not happen.");
        }
_L6:
        hf.remove(request.getID());
_L2:
        return;
_L4:
        boolean flag;
        if (request.bg())
        {
            break; /* Loop/switch isn't completed */
        }
        Iterator iterator = hg.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break; /* Loop/switch isn't completed */
            }
        } while (!((d)iterator.next()).c(this, request));
        flag = true;
_L7:
        if (!flag)
        {
            c1.m(request);
        }
        if (true) goto _L6; else goto _L5
_L5:
        flag = false;
          goto _L7
        if (true) goto _L6; else goto _L8
_L8:
    }

    public void a(Request request, c c1)
    {
        this;
        JVM INSTR monitorenter ;
        if (Log.isLoggable("SessionM.RequestQueue", 3))
        {
            Log.d("SessionM.RequestQueue", String.format(Locale.US, "Enqueueing request: %s on queue: %s", new Object[] {
                request, this
            }));
        }
        a(request, c1, false);
        this;
        JVM INSTR monitorexit ;
        return;
        request;
        throw request;
    }

    public void a(Request request, com.sessionm.net.c c1)
    {
        this;
        JVM INSTR monitorenter ;
        List list;
        ar();
        list = (List)hf.get(request.getID());
        Object obj;
        obj = list;
        if (list != null)
        {
            break MISSING_BLOCK_LABEL_40;
        }
        obj = new ArrayList();
        ((List) (obj)).add(c1);
        hf.put(request.getID(), obj);
        this;
        JVM INSTR monitorexit ;
        return;
        request;
        throw request;
    }

    public void a(RequestQueueNetworkState requestqueuenetworkstate)
    {
        this;
        JVM INSTR monitorenter ;
        ar();
        if (hv != requestqueuenetworkstate)
        {
            if (Log.isLoggable("SessionM.RequestQueue", 3))
            {
                Log.d("SessionM.RequestQueue", String.format(Locale.US, "Queue: %s transitioning to network state: %s", new Object[] {
                    this, requestqueuenetworkstate
                }));
            }
            hv = requestqueuenetworkstate;
            for (requestqueuenetworkstate = hg.iterator(); requestqueuenetworkstate.hasNext(); ((d)requestqueuenetworkstate.next()).a(this, hv)) { }
        }
        break MISSING_BLOCK_LABEL_101;
        requestqueuenetworkstate;
        throw requestqueuenetworkstate;
        this;
        JVM INSTR monitorexit ;
    }

    public void a(d d1)
    {
        this;
        JVM INSTR monitorenter ;
        ar();
        if (!hg.contains(d1))
        {
            hg.add(d1);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        d1;
        throw d1;
    }

    public void b(d d1)
    {
        this;
        JVM INSTR monitorenter ;
        ar();
        hg.remove(d1);
        this;
        JVM INSTR monitorexit ;
        return;
        d1;
        throw d1;
    }

    public void bi()
    {
        this;
        JVM INSTR monitorenter ;
        ar();
        if (Log.isLoggable("SessionM.RequestQueue", 3))
        {
            Log.d("SessionM.RequestQueue", String.format(Locale.US, "Send next enqueued request on queue: %s", new Object[] {
                this
            }));
        }
        a(null, null, true);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void bj()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag;
        ar();
        flag = hn;
        if (!flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        hn = true;
        if (bw() != 0)
        {
            break MISSING_BLOCK_LABEL_42;
        }
        bu();
          goto _L1
        Exception exception;
        exception;
        throw exception;
        bv();
          goto _L1
    }

    public void bk()
    {
        this;
        JVM INSTR monitorenter ;
        ar();
        if (Log.isLoggable("SessionM.RequestQueue", 3))
        {
            Log.d("SessionM.RequestQueue", String.format(Locale.US, "Stop autosend mode on queue: %s", new Object[] {
                this
            }));
        }
        hn = false;
        bv();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public long bl()
    {
        this;
        JVM INSTR monitorenter ;
        long l;
        ar();
        l = hw;
        this;
        JVM INSTR monitorexit ;
        return l;
        Exception exception;
        exception;
        throw exception;
    }

    public void bm()
    {
        this;
        JVM INSTR monitorenter ;
        hg.clear();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public List bn()
    {
        return he;
    }

    public int bo()
    {
        return hl;
    }

    public int bp()
    {
        this;
        JVM INSTR monitorenter ;
        int l = hp;
        this;
        JVM INSTR monitorexit ;
        return l;
        Exception exception;
        exception;
        throw exception;
    }

    public int bq()
    {
        this;
        JVM INSTR monitorenter ;
        int l = hq;
        this;
        JVM INSTR monitorexit ;
        return l;
        Exception exception;
        exception;
        throw exception;
    }

    public RequestQueueSendState br()
    {
        this;
        JVM INSTR monitorenter ;
        RequestQueueSendState requestqueuesendstate;
        ar();
        requestqueuesendstate = hr;
        this;
        JVM INSTR monitorexit ;
        return requestqueuesendstate;
        Exception exception;
        exception;
        throw exception;
    }

    public RequestQueueNetworkState bs()
    {
        this;
        JVM INSTR monitorenter ;
        RequestQueueNetworkState requestqueuenetworkstate = hv;
        this;
        JVM INSTR monitorexit ;
        return requestqueuenetworkstate;
        Exception exception;
        exception;
        throw exception;
    }

    public boolean bt()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = hn;
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    public void d(long l)
    {
        this;
        JVM INSTR monitorenter ;
        ar();
        hw = l;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void e(Request request)
    {
        this;
        JVM INSTR monitorenter ;
        ar();
        if (Log.isLoggable("SessionM.RequestQueue", 3))
        {
            Log.d("SessionM.RequestQueue", String.format(Locale.US, "Enqueueing (with immediate dispatch) request : %s on queue: %s", new Object[] {
                request, this
            }));
        }
        a(request, (c)he.get(0), true);
        this;
        JVM INSTR monitorexit ;
        return;
        request;
        throw request;
    }

    public void f(Request request)
    {
        this;
        JVM INSTR monitorenter ;
        ar();
        a(request, (c)he.get(0), false);
        this;
        JVM INSTR monitorexit ;
        return;
        request;
        throw request;
    }

    public int getSize()
    {
        this;
        JVM INSTR monitorenter ;
        Iterator iterator = he.iterator();
        int l = 0;
_L2:
        c c1;
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        c1 = (c)iterator.next();
        long l1 = l;
        long l2 = c1.getSize();
        l = (int)(l2 + l1);
        if (true) goto _L2; else goto _L1
_L1:
        return l;
        Exception exception;
        exception;
        throw exception;
    }

    public void onReplyReceived(final Request request)
    {
        ck.execute(new Runnable() {

            final RequestQueue hx;
            final Request val$request;

            public void run()
            {
                synchronized (Session.D())
                {
                    RequestQueue.e(hx, request);
                }
                return;
                exception;
                session;
                JVM INSTR monitorexit ;
                throw exception;
            }

            
            {
                hx = RequestQueue.this;
                request = request1;
                super();
            }
        });
    }

    public void onRequestSent(final Request request)
    {
        ck.execute(new Runnable() {

            final RequestQueue hx;
            final Request val$request;

            public void run()
            {
                synchronized (Session.D())
                {
                    RequestQueue.d(hx, request);
                }
                return;
                exception;
                session;
                JVM INSTR monitorexit ;
                throw exception;
            }

            
            {
                hx = RequestQueue.this;
                request = request1;
                super();
            }
        });
    }

    public void p(int l)
    {
        this;
        JVM INSTR monitorenter ;
        int i1;
        i1 = l;
        if (l == 0)
        {
            i1 = 1;
        }
        hl = i1;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void q(int l)
    {
        this;
        JVM INSTR monitorenter ;
        hm = l;
        bv();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void reconnect()
    {
        this;
        JVM INSTR monitorenter ;
        ar();
        if (hv != RequestQueueNetworkState.hy) goto _L2; else goto _L1
_L1:
        if (Log.isLoggable("SessionM.RequestQueue", 6))
        {
            Log.e("SessionM.RequestQueue", "Unexpected reconnect call in already connected state");
        }
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        Iterator iterator = hg.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_145;
            }
        } while (((d)iterator.next()).a(this));
        boolean flag = false;
_L5:
        if (!flag) goto _L4; else goto _L3
_L3:
        d(0L);
        if (getSize() <= 0)
        {
            break MISSING_BLOCK_LABEL_105;
        }
        bu();
          goto _L4
        Exception exception;
        exception;
        throw exception;
        Iterator iterator1 = hg.iterator();
        while (iterator1.hasNext()) 
        {
            ((d)iterator1.next()).a(this, RequestQueueNetworkState.hy);
        }
          goto _L4
        flag = true;
          goto _L5
    }

    public void reset()
    {
        this;
        JVM INSTR monitorenter ;
        for (Iterator iterator = he.iterator(); iterator.hasNext(); ((c)iterator.next()).removeAll()) { }
        break MISSING_BLOCK_LABEL_44;
        Exception exception;
        exception;
        throw exception;
        if (hj != null)
        {
            hj.a(null);
            hj = null;
        }
        hr = RequestQueueSendState.hC;
        hv = RequestQueueNetworkState.hy;
        hw = 0L;
        hq = 0;
        this;
        JVM INSTR monitorexit ;
    }

    public void shutdown()
    {
        for (Iterator iterator = he.iterator(); iterator.hasNext(); ((c)iterator.next()).close()) { }
    }

    public void start()
    {
        this;
        JVM INSTR monitorenter ;
        ar();
        ho = RequestQueueState.hG;
        if (Log.isLoggable("SessionM.RequestQueue", 3))
        {
            Log.d("SessionM.RequestQueue", String.format(Locale.US, "Request queue started. %s", new Object[] {
                this
            }));
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void stop()
    {
        this;
        JVM INSTR monitorenter ;
        ar();
        if (Log.isLoggable("SessionM.RequestQueue", 3))
        {
            Log.d("SessionM.RequestQueue", String.format(Locale.US, "Stopping request queue: %s", new Object[] {
                this
            }));
        }
        bk();
        if (hj != null)
        {
            if (br() != RequestQueueSendState.hC && Log.isLoggable("SessionM.RequestQueue", 3))
            {
                Log.d("SessionM.RequestQueue", String.format(Locale.US, "Stopping non-idle request queue: %s", new Object[] {
                    this
                }));
            }
            hf.remove(hj.getID());
            a(RequestQueueSendState.hC);
            hj.a(null);
            hj = null;
        }
        ho = RequestQueueState.hF;
        if (Log.isLoggable("SessionM.RequestQueue", 3))
        {
            Log.d("SessionM.RequestQueue", String.format(Locale.US, "Request queue: %s stopped.", new Object[] {
                this
            }));
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public String toString()
    {
        return String.format(Locale.US, "<RequestQueue type: %s autoSendMode: %b batchSize: %d state: %s networkState: %s>", new Object[] {
            hs, Boolean.valueOf(hn), Integer.valueOf(hl), hr, hv
        });
    }
}
