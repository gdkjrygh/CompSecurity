// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.ytremote.backend.browserchannel;

import android.content.Context;
import android.util.Log;
import com.google.android.apps.ytremote.a.d.b;
import com.google.android.apps.ytremote.fork.net.async.l;
import com.google.android.apps.ytremote.fork.net.async.p;
import com.google.android.apps.ytremote.logic.exception.HttpConnectionException;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

// Referenced classes of package com.google.android.apps.ytremote.backend.browserchannel:
//            i, NetworkNotAvailableException, f, g, 
//            h, j

class HttpClientConnection
{

    private static final Logger a = Logger.getLogger(com/google/android/apps/ytremote/backend/browserchannel/HttpClientConnection.getName());
    private static final String b = com/google/android/apps/ytremote/backend/browserchannel/HttpClientConnection.getCanonicalName();
    private static boolean c = false;
    private InetSocketAddress d;
    private ByteArrayOutputStream e;
    private int f;
    private ByteArrayOutputStream g;
    private l h;
    private int i;
    private final Context j;
    private Map k;
    private p l;
    private i m;
    private ByteArrayOutputStream n;
    private Map o;
    private boolean p;
    private final LinkedBlockingQueue q = new LinkedBlockingQueue();
    private ByteArrayOutputStream r;
    private int s;
    private ResponseState t;

    public HttpClientConnection(Context context, p p1, String s1, int i1)
    {
        l = p1;
        d = new InetSocketAddress(s1, i1);
        h = null;
        t = ResponseState.HEADER;
        p = false;
        j = context;
    }

    private int a(byte abyte0[], int i1, int j1, boolean flag)
    {
        int k1 = b(abyte0, i1, j1);
        if (k1 == -1) goto _L2; else goto _L1
_L1:
        String s1;
        n.write(abyte0, i1, k1);
        s1 = n.toString("UTF-8");
        if (!"".equals(s1)) goto _L4; else goto _L3
_L3:
        if (!flag) goto _L6; else goto _L5
_L5:
        t = ResponseState.BODY;
        if (!o.containsKey("transfer-encoding")) goto _L8; else goto _L7
_L7:
        if (!"chunked".equals(o.get("transfer-encoding"))) goto _L10; else goto _L9
_L9:
        t = ResponseState.CHUNK_SIZE;
_L11:
        n.reset();
        return k1 + 2;
_L10:
        throw new HttpConnectionException("Unknown transfer-encoding");
_L8:
        if (o.containsKey("content-length"))
        {
            i = Integer.valueOf((String)o.get("content-length")).intValue();
        }
        continue; /* Loop/switch isn't completed */
_L6:
        t = ResponseState.DONE;
        p = true;
        continue; /* Loop/switch isn't completed */
_L4:
        i1 = s1.indexOf(":");
        if (i1 == -1 && flag && s == 0)
        {
            if (s1.startsWith("HTTP/"))
            {
                i1 = s1.indexOf(" ");
                if (i1 != -1)
                {
                    j1 = s1.indexOf(" ", i1 + 1);
                    if (j1 != -1)
                    {
                        s = Integer.parseInt(s1.substring(i1 + 1, j1));
                        if (m != null)
                        {
                            m.a(s);
                        }
                    }
                }
            }
        } else
        {
            if (s == 0)
            {
                throw new HttpConnectionException("Received header fields without HTTP response code");
            }
            abyte0 = s1.substring(i1 + 1, s1.length()).trim();
            s1 = s1.substring(0, i1).toLowerCase();
            if ("set-cookie".equals(s1))
            {
                abyte0 = abyte0.split(";")[0].split("=", 2);
                k.put(abyte0[0].trim(), abyte0[1].trim());
            } else
            {
                o.put(s1, abyte0);
            }
        }
        if (true) goto _L11; else goto _L2
_L2:
        n.write(abyte0, i1, j1);
        return j1;
    }

    static l a(HttpClientConnection httpclientconnection)
    {
        return httpclientconnection.h;
    }

    private void a(byte abyte0[], int i1, int j1)
    {
        r.write(abyte0, i1, j1);
        if (m != null)
        {
            m.a(abyte0, i1, j1);
        }
    }

    private static int b(byte abyte0[], int i1, int j1)
    {
        for (int k1 = 0; k1 < j1 - 1; k1++)
        {
            if (abyte0[i1 + k1] == 13 && abyte0[i1 + k1 + 1] == 10)
            {
                return k1;
            }
        }

        return -1;
    }

    static LinkedBlockingQueue b(HttpClientConnection httpclientconnection)
    {
        return httpclientconnection.q;
    }

    public final j a(String s1)
    {
        this;
        JVM INSTR monitorenter ;
        if (!com.google.android.apps.ytremote.a.d.b.a(j))
        {
            Log.w(b, (new StringBuilder("No network connection - request: ")).append(s1).append(" not sent.").toString());
            throw new NetworkNotAvailableException("No network connection");
        }
        break MISSING_BLOCK_LABEL_56;
        s1;
        this;
        JVM INSTR monitorexit ;
        throw s1;
        Object obj;
        s = 0;
        r = new ByteArrayOutputStream();
        t = ResponseState.HEADER;
        f = 0;
        p = false;
        n = new ByteArrayOutputStream();
        g = new ByteArrayOutputStream();
        e = new ByteArrayOutputStream();
        o = new HashMap();
        k = new HashMap();
        obj = h;
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_206;
        }
        a();
        h = new l(l, new f(this));
        h.a(d, new g(this));
        h.d();
        h.c().write(s1.getBytes());
        h.e();
        obj = new ByteArrayOutputStream();
_L16:
        if (p) goto _L2; else goto _L1
_L1:
        if (!ResponseState.BODY.equals(t) || i != 0 || !q.isEmpty()) goto _L4; else goto _L3
_L3:
        a();
        int i1 = 1;
_L14:
        if (h != null) goto _L6; else goto _L5
_L5:
        if (q.isEmpty()) goto _L8; else goto _L7
_L7:
        s1 = new StringBuilder();
_L13:
        if (q.isEmpty()) goto _L10; else goto _L9
_L9:
        obj = (IncomingItem)q.take();
        if (!((IncomingItem) (obj)).c()) goto _L12; else goto _L11
_L11:
        s1.append("\nclosed event");
          goto _L13
        s1;
        throw new HttpConnectionException("Could not open socket", s1);
_L4:
        Object obj1 = (IncomingItem)q.poll(60L, TimeUnit.SECONDS);
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_384;
        }
        if (!((IncomingItem) (obj1)).c())
        {
            break MISSING_BLOCK_LABEL_394;
        }
        a();
        i1 = 1;
          goto _L14
        byte abyte0[];
        int j1;
        if (((IncomingItem) (obj1)).d())
        {
            a();
            throw new HttpConnectionException("Error occurred in connection", ((IncomingItem) (obj1)).b());
        }
        obj1 = ((IncomingItem) (obj1)).a();
        ((ByteArrayOutputStream) (obj)).write(((ByteBuffer) (obj1)).array());
        j1 = ((ByteBuffer) (obj1)).capacity();
        abyte0 = ((ByteBuffer) (obj1)).array();
        int k1 = 0;
_L33:
        if (j1 == 0) goto _L16; else goto _L15
_L15:
        Logger logger;
        StringBuilder stringbuilder;
        if (!c)
        {
            break MISSING_BLOCK_LABEL_565;
        }
        logger = a;
        stringbuilder = (new StringBuilder("PRE offset = ")).append(k1).append("; lengthRemaining = ").append(j1).append("; responseState = ").append(t).append("; chunkLength = ").append(f).append("\nNext few bytes: ");
        if (j1 < 10)
        {
            i1 = j1;
        } else
        {
            i1 = 10;
        }
        logger.info(stringbuilder.append(new String(abyte0, k1, i1)).append("\n-----------------------").toString());
        h.a[t.ordinal()];
        JVM INSTR tableswitch 1 7: default 1271
    //                   1 819
    //                   2 834
    //                   3 1285
    //                   4 882
    //                   5 897
    //                   6 999
    //                   7 1044;
           goto _L17 _L18 _L19 _L20 _L21 _L22 _L23 _L24
_L25:
        if (c)
        {
            a.info((new StringBuilder("POST ; responseState = ")).append(t).append("; consumedNow = ").append(i1).append("\nconsumed: ").append(new String(abyte0, k1, i1)).append("\n-----------------------").toString());
        }
        if (i1 != 0)
        {
            break MISSING_BLOCK_LABEL_1292;
        }
        if (t != ResponseState.BODY || i != 0)
        {
            throw new HttpConnectionException((new StringBuilder("Unable to process data in state ")).append(t).append("\nlengthRemaining: ").append(j1).append("\ncontentLength: ").append(i).append("\noffset: ").append(k1).append("\nbytes: ").append(new String(abyte0)).append("\nRequest:\n").append(s1).append("\nResponse:\n").append(new String(abyte0)).toString());
        }
        break MISSING_BLOCK_LABEL_1292;
_L18:
        i1 = a(abyte0, k1, j1, true);
          goto _L25
_L19:
        if (j1 < i - r.size()) goto _L27; else goto _L26
_L26:
        i1 = i - r.size();
        p = true;
_L32:
        a(abyte0, k1, i1);
          goto _L25
_L21:
        i1 = a(abyte0, k1, j1, false);
          goto _L25
_L22:
        i1 = b(abyte0, k1, j1);
        if (i1 == -1)
        {
            break MISSING_BLOCK_LABEL_980;
        }
        t = ResponseState.CHUNK_DATA;
        g.write(abyte0, k1, i1);
        f = Integer.parseInt(g.toString("UTF-8"), 16);
        if (f == 0)
        {
            t = ResponseState.TRAILER;
        }
        g.reset();
        i1 += 2;
          goto _L25
        g.write(abyte0, k1, j1);
        i1 = j1;
          goto _L25
_L23:
        if (j1 < f) goto _L29; else goto _L28
_L28:
        i1 = f;
        t = ResponseState.CHUNK_END;
_L31:
        a(abyte0, k1, i1);
        f = f - i1;
          goto _L25
_L24:
        i1 = e.size();
        if (j1 + i1 < 2)
        {
            break MISSING_BLOCK_LABEL_1097;
        }
        i1 = 2 - i1;
        e.write(abyte0, k1, i1);
        t = ResponseState.CHUNK_SIZE;
        e.reset();
          goto _L25
        e.write(abyte0, k1, j1);
        i1 = j1;
          goto _L25
_L12:
label0:
        {
            if (!((IncomingItem) (obj)).d())
            {
                break label0;
            }
            s1.append("\nerror: ").append(((IncomingItem) (obj)).b());
        }
          goto _L13
        s1.append("\ndata: ").append(((IncomingItem) (obj)).a().toString());
          goto _L13
_L10:
        throw new HttpConnectionException((new StringBuilder("Request completed with data still in the incoming queue:")).append(s1.toString()).toString());
_L6:
        if (p || i1 != 0) goto _L8; else goto _L30
_L30:
        throw new HttpConnectionException("Abrupt connection end");
_L8:
        s1 = r.toByteArray();
        s1 = new j(((ByteArrayOutputStream) (obj)), p, s, s1, o, k);
        this;
        JVM INSTR monitorexit ;
        return s1;
_L29:
        i1 = j1;
          goto _L31
_L27:
        i1 = j1;
          goto _L32
_L2:
        i1 = 0;
          goto _L14
_L17:
        i1 = j1;
          goto _L25
_L20:
        i1 = j1;
          goto _L25
        k1 += i1;
        j1 -= i1;
          goto _L33
    }

    public final void a()
    {
        try
        {
            if (h != null)
            {
                h.f();
                h = null;
            }
            return;
        }
        catch (IOException ioexception)
        {
            return;
        }
    }

    public final void a(i i1)
    {
        m = i1;
    }


    private class ResponseState extends Enum
    {

        private static final ResponseState $VALUES[];
        public static final ResponseState BODY;
        public static final ResponseState CHUNK_DATA;
        public static final ResponseState CHUNK_END;
        public static final ResponseState CHUNK_SIZE;
        public static final ResponseState DONE;
        public static final ResponseState HEADER;
        public static final ResponseState TRAILER;

        public static ResponseState valueOf(String s1)
        {
            return (ResponseState)Enum.valueOf(com/google/android/apps/ytremote/backend/browserchannel/HttpClientConnection$ResponseState, s1);
        }

        public static ResponseState[] values()
        {
            return (ResponseState[])$VALUES.clone();
        }

        static 
        {
            BODY = new ResponseState("BODY", 0);
            CHUNK_DATA = new ResponseState("CHUNK_DATA", 1);
            CHUNK_END = new ResponseState("CHUNK_END", 2);
            CHUNK_SIZE = new ResponseState("CHUNK_SIZE", 3);
            DONE = new ResponseState("DONE", 4);
            HEADER = new ResponseState("HEADER", 5);
            TRAILER = new ResponseState("TRAILER", 6);
            $VALUES = (new ResponseState[] {
                BODY, CHUNK_DATA, CHUNK_END, CHUNK_SIZE, DONE, HEADER, TRAILER
            });
        }

        private ResponseState(String s1, int i1)
        {
            super(s1, i1);
        }
    }


    private class IncomingItem
    {

        private ByteBuffer a;
        private Exception b;
        private State c;

        public final ByteBuffer a()
        {
            if (!State.DATA.equals(c))
            {
                throw new IllegalStateException("data accessed when state was not DATA");
            } else
            {
                return a;
            }
        }

        public final Exception b()
        {
            if (!State.ERROR.equals(c))
            {
                throw new IllegalStateException("data accessed when state was not ERROR");
            } else
            {
                return b;
            }
        }

        public final boolean c()
        {
            return State.CLOSED.equals(c);
        }

        public final boolean d()
        {
            return State.ERROR.equals(c);
        }

        public IncomingItem()
        {
            class State extends Enum
            {

                private static final State $VALUES[];
                public static final State CLOSED;
                public static final State DATA;
                public static final State ERROR;

                public static State valueOf(String s1)
                {
                    return (State)Enum.valueOf(com/google/android/apps/ytremote/backend/browserchannel/HttpClientConnection$IncomingItem$State, s1);
                }

                public static State[] values()
                {
                    return (State[])$VALUES.clone();
                }

                static 
                {
                    CLOSED = new State("CLOSED", 0);
                    DATA = new State("DATA", 1);
                    ERROR = new State("ERROR", 2);
                    $VALUES = (new State[] {
                        CLOSED, DATA, ERROR
                    });
                }

                private State(String s1, int i1)
                {
                    super(s1, i1);
                }
            }

            c = State.CLOSED;
        }

        public IncomingItem(Exception exception)
        {
            c = State.ERROR;
            b = exception;
        }

        public IncomingItem(ByteBuffer bytebuffer)
        {
            c = State.DATA;
            a = bytebuffer;
        }
    }

}
