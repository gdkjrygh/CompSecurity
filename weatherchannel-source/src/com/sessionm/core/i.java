// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sessionm.core;

import android.content.Context;
import android.util.Log;
import com.sessionm.c.a;
import com.sessionm.net.Request;
import com.sessionm.net.RequestQueue;
import com.sessionm.net.c;
import com.sessionm.net.http.d;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutorService;

public class i
{

    protected static final String TAG = null;
    private Context cf;
    private ExecutorService ck;
    private List fs;
    private List ft;
    private RequestQueue fu;

    public i(Context context, ExecutorService executorservice, com.sessionm.net.a a1)
    {
        fs = new ArrayList();
        ft = new ArrayList();
        cf = context;
        context = new a();
        ArrayList arraylist = new ArrayList();
        arraylist.add(context);
        ck = executorservice;
        fu = new RequestQueue(arraylist, com.sessionm.net.RequestQueue.RequestQueueType.hI, executorservice, a1);
        context = new FileFilter() {

            final i fv;

            public boolean accept(File file)
            {
                return file.getName().endsWith("complete");
            }

            
            {
                fv = i.this;
                super();
            }
        };
        context = aF().listFiles(context);
        int k = context.length;
        for (int j = 0; j < k; j++)
        {
            if (!context[j].getName().startsWith("sm_"));
        }

    }

    static RequestQueue a(i j)
    {
        return j.fu;
    }

    static void a(i j, String s)
    {
        j.w(s);
    }

    private File aF()
    {
        return new File(cf.getCacheDir(), "SessionMVideos");
    }

    static File b(i j, String s)
    {
        return j.y(s);
    }

    static List b(i j)
    {
        return j.ft;
    }

    static File c(i j, String s)
    {
        return j.x(s);
    }

    static List c(i j)
    {
        return j.fs;
    }

    static ExecutorService d(i j)
    {
        return j.ck;
    }

    private void w(String s)
    {
        aF().mkdirs();
        s = new Request(com.sessionm.net.Request.Type.gP, new Object[] {
            s
        });
        s.e(com.sessionm.net.Request.Header.go.getKey(), "no-cache");
        s.a(new c() {

            final i fv;

            public void onReplyReceived(Request request)
            {
                com.sessionm.core.i.d(fv).execute(new Runnable(this, request) {

                    final Request fx;
                    final _cls3 fy;

                    public void run()
                    {
                        if (Log.isLoggable(i.TAG, 3))
                        {
                            Log.d(i.TAG, String.format(Locale.US, "finished video preload request: %s", new Object[] {
                                fx.getURL()
                            }));
                        }
                        i.b(fy.fv).remove(fx.getURL());
                        if (fx.bd() != com.sessionm.net.Request.State.gI || fx.aU().bC() == null)
                        {
                            break MISSING_BLOCK_LABEL_147;
                        }
                        if (i.b(fy.fv, fx.getURL()).createNewFile())
                        {
                            com.sessionm.core.i.c(fy.fv).add(com.sessionm.core.i.c(fy.fv, fx.getURL()).getName());
                        }
_L1:
                        return;
                        IOException ioexception;
                        ioexception;
                        if (Log.isLoggable(i.TAG, 5))
                        {
                            Log.w(i.TAG, "Error saving video ", ioexception);
                            return;
                        }
                          goto _L1
                    }

            
            {
                fy = _pcls3;
                fx = request;
                super();
            }
                });
            }

            public File outputFileForRequest(Request request)
            {
                return com.sessionm.core.i.c(fv, request.getURL());
            }

            
            {
                fv = i.this;
                super();
            }
        });
        fu.e(s);
    }

    private File x(String s)
    {
        s = String.format(Locale.US, (new StringBuilder()).append("sm_").append(com.sessionm.a.a.d(s, "SHA-1")).toString(), new Object[0]);
        return new File(aF(), s);
    }

    private File y(String s)
    {
        return new File(cf.getCacheDir(), String.format(Locale.US, "sm_%s.complete", new Object[] {
            com.sessionm.a.a.d(s, "SHA-1")
        }));
    }

    public void a(String as[])
    {
        this;
        JVM INSTR monitorenter ;
        ck.execute(new Runnable(as) {

            final i fv;
            final String fw[];

            public void run()
            {
                i j = fv;
                j;
                JVM INSTR monitorenter ;
                String as1[];
                int l;
                com.sessionm.core.i.a(fv).start();
                as1 = fw;
                l = as1.length;
                int k = 0;
_L2:
                String s;
                if (k >= l)
                {
                    break MISSING_BLOCK_LABEL_84;
                }
                s = as1[k];
                if (i.b(fv).contains(s) && !com.sessionm.core.i.c(fv).contains(s))
                {
                    com.sessionm.core.i.a(fv, s);
                }
                break MISSING_BLOCK_LABEL_92;
                j;
                JVM INSTR monitorexit ;
                return;
                Exception exception;
                exception;
                j;
                JVM INSTR monitorexit ;
                throw exception;
                k++;
                if (true) goto _L2; else goto _L1
_L1:
            }

            
            {
                fv = i.this;
                fw = as;
                super();
            }
        });
        this;
        JVM INSTR monitorexit ;
        return;
        as;
        throw as;
    }

    public void aG()
    {
        this;
        JVM INSTR monitorenter ;
        fu.stop();
        fu.reset();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public String z(String s)
    {
        this;
        JVM INSTR monitorenter ;
        s = x(s).getAbsolutePath();
        this;
        JVM INSTR monitorexit ;
        return s;
        s;
        throw s;
    }

}
