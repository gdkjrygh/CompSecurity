// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.youtube.player.internal;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.a;
import com.google.android.youtube.player.internal.b.d;
import java.util.ArrayList;

// Referenced classes of package com.google.android.youtube.player.internal:
//            ar, al, at, w, 
//            ao, am, ap, as, 
//            v

public abstract class aj
    implements ar
{

    final Handler a;
    private final Context b;
    private IInterface c;
    private ArrayList d;
    private final ArrayList e = new ArrayList();
    private boolean f;
    private ArrayList g;
    private boolean h;
    private final ArrayList i = new ArrayList();
    private ServiceConnection j;
    private boolean k;

    protected aj(Context context, as as1, at at1)
    {
        f = false;
        h = false;
        k = false;
        if (Looper.getMainLooper().getThread() != Thread.currentThread())
        {
            throw new IllegalStateException("Clients must be created on the UI thread.");
        } else
        {
            b = (Context)com.google.android.youtube.player.internal.b.d.a(context);
            d = new ArrayList();
            d.add(com.google.android.youtube.player.internal.b.d.a(as1));
            g = new ArrayList();
            g.add(com.google.android.youtube.player.internal.b.d.a(at1));
            a = new al(this);
            return;
        }
    }

    static IInterface a(aj aj1, IInterface iinterface)
    {
        aj1.c = iinterface;
        return iinterface;
    }

    static YouTubeInitializationResult a(String s)
    {
        return b(s);
    }

    static ArrayList a(aj aj1)
    {
        return aj1.d;
    }

    private void a()
    {
        if (j != null)
        {
            try
            {
                b.unbindService(j);
            }
            catch (IllegalArgumentException illegalargumentexception)
            {
                Log.w("YouTubeClient", "Unexpected error from unbindService()", illegalargumentexception);
            }
        }
        c = null;
        j = null;
    }

    private static YouTubeInitializationResult b(String s)
    {
        try
        {
            s = YouTubeInitializationResult.valueOf(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return YouTubeInitializationResult.UNKNOWN_ERROR;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return YouTubeInitializationResult.UNKNOWN_ERROR;
        }
        return s;
    }

    static boolean b(aj aj1)
    {
        return aj1.k;
    }

    static ArrayList c(aj aj1)
    {
        return aj1.i;
    }

    static IInterface d(aj aj1)
    {
        return aj1.c;
    }

    static void e(aj aj1)
    {
        aj1.a();
    }

    protected abstract IInterface a(IBinder ibinder);

    protected final void a(YouTubeInitializationResult youtubeinitializationresult)
    {
        a.removeMessages(4);
        ArrayList arraylist = g;
        arraylist;
        JVM INSTR monitorenter ;
        ArrayList arraylist1;
        int i1;
        h = true;
        arraylist1 = g;
        i1 = arraylist1.size();
        int l = 0;
_L2:
        if (l >= i1)
        {
            break MISSING_BLOCK_LABEL_85;
        }
        if (k)
        {
            break MISSING_BLOCK_LABEL_51;
        }
        arraylist;
        JVM INSTR monitorexit ;
        return;
        if (g.contains(arraylist1.get(l)))
        {
            ((at)arraylist1.get(l)).a(youtubeinitializationresult);
        }
        break MISSING_BLOCK_LABEL_98;
        h = false;
        arraylist;
        JVM INSTR monitorexit ;
        return;
        youtubeinitializationresult;
        arraylist;
        JVM INSTR monitorexit ;
        throw youtubeinitializationresult;
        l++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    protected abstract void a(v v, ao ao1);

    protected abstract String b();

    protected final void b(IBinder ibinder)
    {
        try
        {
            a(com.google.android.youtube.player.internal.w.a(ibinder), new ao(this));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (IBinder ibinder)
        {
            Log.w("YouTubeClient", "service died");
        }
    }

    protected abstract String c();

    public void d()
    {
        h();
        k = false;
        ArrayList arraylist = i;
        arraylist;
        JVM INSTR monitorenter ;
        int i1 = i.size();
        int l = 0;
_L2:
        if (l >= i1)
        {
            break; /* Loop/switch isn't completed */
        }
        ((am)i.get(l)).b();
        l++;
        if (true) goto _L2; else goto _L1
_L1:
        i.clear();
        arraylist;
        JVM INSTR monitorexit ;
        a();
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final void e()
    {
        k = true;
        YouTubeInitializationResult youtubeinitializationresult = com.google.android.youtube.player.a.a(b);
        if (youtubeinitializationresult != YouTubeInitializationResult.SUCCESS)
        {
            a.sendMessage(a.obtainMessage(3, youtubeinitializationresult));
        } else
        {
            Intent intent = new Intent(c());
            if (j != null)
            {
                Log.e("YouTubeClient", "Calling connect() while still connected, missing disconnect().");
                a();
            }
            j = new ap(this);
            if (!b.bindService(intent, j, 129))
            {
                a.sendMessage(a.obtainMessage(3, YouTubeInitializationResult.ERROR_CONNECTING_TO_SERVICE));
                return;
            }
        }
    }

    public final boolean f()
    {
        return c != null;
    }

    protected final void g()
    {
        boolean flag1 = true;
        ArrayList arraylist = d;
        arraylist;
        JVM INSTR monitorenter ;
        ArrayList arraylist1;
        Exception exception;
        int l;
        int i1;
        boolean flag;
        if (!f)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.android.youtube.player.internal.b.d.a(flag);
        a.removeMessages(4);
        f = true;
        if (e.size() == 0)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        com.google.android.youtube.player.internal.b.d.a(flag);
        arraylist1 = d;
        i1 = arraylist1.size();
        l = 0;
_L2:
        if (l >= i1)
        {
            break MISSING_BLOCK_LABEL_121;
        }
        if (k && f())
        {
            if (!e.contains(arraylist1.get(l)))
            {
                ((as)arraylist1.get(l)).a();
            }
            break MISSING_BLOCK_LABEL_141;
        }
        e.clear();
        f = false;
        arraylist;
        JVM INSTR monitorexit ;
        return;
        exception;
        arraylist;
        JVM INSTR monitorexit ;
        throw exception;
        l++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    protected final void h()
    {
        a.removeMessages(4);
        ArrayList arraylist = d;
        arraylist;
        JVM INSTR monitorenter ;
        ArrayList arraylist1;
        int i1;
        f = true;
        arraylist1 = d;
        i1 = arraylist1.size();
        int l = 0;
_L2:
        if (l >= i1)
        {
            break MISSING_BLOCK_LABEL_77;
        }
        if (k)
        {
            if (d.contains(arraylist1.get(l)))
            {
                ((as)arraylist1.get(l)).b();
            }
            break MISSING_BLOCK_LABEL_90;
        }
        f = false;
        arraylist;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        arraylist;
        JVM INSTR monitorexit ;
        throw exception;
        l++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    protected final void i()
    {
        if (!f())
        {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        } else
        {
            return;
        }
    }

    protected final IInterface j()
    {
        i();
        return c;
    }
}
