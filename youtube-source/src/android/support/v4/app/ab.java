// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.os.Bundle;
import android.support.v4.content.i;
import android.support.v4.content.j;
import android.support.v4.f.d;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;

// Referenced classes of package android.support.v4.app:
//            aa, FragmentActivity, m, z

final class ab
    implements j
{

    final int a;
    final Bundle b;
    z c;
    i d;
    boolean e;
    boolean f;
    Object g;
    boolean h;
    boolean i;
    boolean j;
    boolean k;
    boolean l;
    boolean m;
    ab n;
    final aa o;

    final void a()
    {
        if (aa.a)
        {
            Log.v("LoaderManager", (new StringBuilder("  Stopping: ")).append(this).toString());
        }
        h = false;
        if (!i && d != null && m)
        {
            m = false;
            d.a(this);
            d.b();
        }
    }

    final void a(i i1, Object obj)
    {
        if (c == null)
        {
            break MISSING_BLOCK_LABEL_148;
        }
        String s;
        StringBuilder stringbuilder;
        if (o.e != null)
        {
            s = o.e.b.u;
            o.e.b.u = "onLoadFinished";
        } else
        {
            s = null;
        }
        if (aa.a)
        {
            i1 = (new StringBuilder("  onLoadFinished in ")).append(i1).append(": ");
            stringbuilder = new StringBuilder(64);
            android.support.v4.f.d.a(obj, stringbuilder);
            stringbuilder.append("}");
            Log.v("LoaderManager", i1.append(stringbuilder.toString()).toString());
        }
        i1 = c;
        if (o.e != null)
        {
            o.e.b.u = s;
        }
        f = true;
        return;
        i1;
        if (o.e != null)
        {
            o.e.b.u = s;
        }
        throw i1;
    }

    public final void a(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
    {
        filedescriptor = s;
        s = this;
        do
        {
            printwriter.print(filedescriptor);
            printwriter.print("mId=");
            printwriter.print(((ab) (s)).a);
            printwriter.print(" mArgs=");
            printwriter.println(((ab) (s)).b);
            printwriter.print(filedescriptor);
            printwriter.print("mCallbacks=");
            printwriter.println(((ab) (s)).c);
            printwriter.print(filedescriptor);
            printwriter.print("mLoader=");
            printwriter.println(((ab) (s)).d);
            if (((ab) (s)).d != null)
            {
                ((ab) (s)).d.a((new StringBuilder()).append(filedescriptor).append("  ").toString(), printwriter);
            }
            if (((ab) (s)).e || ((ab) (s)).f)
            {
                printwriter.print(filedescriptor);
                printwriter.print("mHaveData=");
                printwriter.print(((ab) (s)).e);
                printwriter.print("  mDeliveredData=");
                printwriter.println(((ab) (s)).f);
                printwriter.print(filedescriptor);
                printwriter.print("mData=");
                printwriter.println(((ab) (s)).g);
            }
            printwriter.print(filedescriptor);
            printwriter.print("mStarted=");
            printwriter.print(((ab) (s)).h);
            printwriter.print(" mReportNextStart=");
            printwriter.print(((ab) (s)).k);
            printwriter.print(" mDestroyed=");
            printwriter.println(((ab) (s)).l);
            printwriter.print(filedescriptor);
            printwriter.print("mRetaining=");
            printwriter.print(((ab) (s)).i);
            printwriter.print(" mRetainingStarted=");
            printwriter.print(((ab) (s)).j);
            printwriter.print(" mListenerRegistered=");
            printwriter.println(((ab) (s)).m);
            if (((ab) (s)).n != null)
            {
                printwriter.print(filedescriptor);
                printwriter.println("Pending Loader ");
                printwriter.print(((ab) (s)).n);
                printwriter.println(":");
                s = ((ab) (s)).n;
                filedescriptor = (new StringBuilder()).append(filedescriptor).append("  ").toString();
            } else
            {
                return;
            }
        } while (true);
    }

    final void b()
    {
        ab ab1 = this;
_L2:
        if (aa.a)
        {
            Log.v("LoaderManager", (new StringBuilder("  Destroying: ")).append(ab1).toString());
        }
        ab1.l = true;
        boolean flag = ab1.f;
        ab1.f = false;
        if (ab1.c == null || ab1.d == null || !ab1.e || !flag)
        {
            break MISSING_BLOCK_LABEL_173;
        }
        if (aa.a)
        {
            Log.v("LoaderManager", (new StringBuilder("  Reseting: ")).append(ab1).toString());
        }
        String s;
        Object obj;
        Exception exception;
        if (ab1.o.e != null)
        {
            s = ab1.o.e.b.u;
            ab1.o.e.b.u = "onLoaderReset";
        } else
        {
            s = null;
        }
        obj = ab1.c;
        obj = ab1.d;
        if (ab1.o.e != null)
        {
            ab1.o.e.b.u = s;
        }
        ab1.c = null;
        ab1.g = null;
        ab1.e = false;
        if (ab1.d != null)
        {
            if (ab1.m)
            {
                ab1.m = false;
                ab1.d.a(ab1);
            }
            ab1.d.c();
        }
        if (ab1.n != null)
        {
            ab1 = ab1.n;
        } else
        {
            return;
        }
        if (true) goto _L2; else goto _L1
_L1:
        exception;
        if (ab1.o.e != null)
        {
            ab1.o.e.b.u = s;
        }
        throw exception;
    }

    public final String toString()
    {
        StringBuilder stringbuilder = new StringBuilder(64);
        stringbuilder.append("LoaderInfo{");
        stringbuilder.append(Integer.toHexString(System.identityHashCode(this)));
        stringbuilder.append(" #");
        stringbuilder.append(a);
        stringbuilder.append(" : ");
        android.support.v4.f.d.a(d, stringbuilder);
        stringbuilder.append("}}");
        return stringbuilder.toString();
    }
}
