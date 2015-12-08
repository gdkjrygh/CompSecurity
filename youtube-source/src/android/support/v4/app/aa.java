// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.support.v4.content.i;
import android.support.v4.f.d;
import android.support.v4.f.n;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;

// Referenced classes of package android.support.v4.app:
//            y, ab, z, FragmentActivity

final class aa extends y
{

    static boolean a = false;
    final n b;
    final n c;
    final String d;
    FragmentActivity e;
    boolean f;
    boolean g;

    final void a(FragmentActivity fragmentactivity)
    {
        e = fragmentactivity;
    }

    public final void a(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
    {
        boolean flag = false;
        if (b.a() > 0)
        {
            printwriter.print(s);
            printwriter.println("Active Loaders:");
            String s1 = (new StringBuilder()).append(s).append("    ").toString();
            for (int j = 0; j < b.a(); j++)
            {
                ab ab1 = (ab)b.b(j);
                printwriter.print(s);
                printwriter.print("  #");
                printwriter.print(b.a(j));
                printwriter.print(": ");
                printwriter.println(ab1.toString());
                ab1.a(s1, filedescriptor, printwriter, as);
            }

        }
        if (c.a() > 0)
        {
            printwriter.print(s);
            printwriter.println("Inactive Loaders:");
            String s2 = (new StringBuilder()).append(s).append("    ").toString();
            for (int k = ((flag) ? 1 : 0); k < c.a(); k++)
            {
                ab ab2 = (ab)c.b(k);
                printwriter.print(s);
                printwriter.print("  #");
                printwriter.print(c.a(k));
                printwriter.print(": ");
                printwriter.println(ab2.toString());
                ab2.a(s2, filedescriptor, printwriter, as);
            }

        }
    }

    public final boolean a()
    {
        int k = b.a();
        int j = 0;
        boolean flag1 = false;
        while (j < k) 
        {
            ab ab1 = (ab)b.b(j);
            boolean flag;
            if (ab1.h && !ab1.f)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            flag1 |= flag;
            j++;
        }
        return flag1;
    }

    final void b()
    {
        if (a)
        {
            Log.v("LoaderManager", (new StringBuilder("Starting in ")).append(this).toString());
        }
        if (f)
        {
            RuntimeException runtimeexception = new RuntimeException("here");
            runtimeexception.fillInStackTrace();
            Log.w("LoaderManager", (new StringBuilder("Called doStart when already started: ")).append(this).toString(), runtimeexception);
        } else
        {
            f = true;
            int j = b.a() - 1;
            while (j >= 0) 
            {
                ab ab1 = (ab)b.b(j);
                if (ab1.i && ab1.j)
                {
                    ab1.h = true;
                } else
                if (!ab1.h)
                {
                    ab1.h = true;
                    if (a)
                    {
                        Log.v("LoaderManager", (new StringBuilder("  Starting: ")).append(ab1).toString());
                    }
                    if (ab1.d == null && ab1.c != null)
                    {
                        z z1 = ab1.c;
                        int k = ab1.a;
                        android.os.Bundle bundle = ab1.b;
                        ab1.d = z1.a();
                    }
                    if (ab1.d != null)
                    {
                        if (ab1.d.getClass().isMemberClass() && !Modifier.isStatic(ab1.d.getClass().getModifiers()))
                        {
                            throw new IllegalArgumentException((new StringBuilder("Object returned from onCreateLoader must not be a non-static inner member class: ")).append(ab1.d).toString());
                        }
                        if (!ab1.m)
                        {
                            ab1.d.a(ab1.a, ab1);
                            ab1.m = true;
                        }
                        ab1.d.a();
                    }
                }
                j--;
            }
        }
    }

    final void c()
    {
        if (a)
        {
            Log.v("LoaderManager", (new StringBuilder("Stopping in ")).append(this).toString());
        }
        if (!f)
        {
            RuntimeException runtimeexception = new RuntimeException("here");
            runtimeexception.fillInStackTrace();
            Log.w("LoaderManager", (new StringBuilder("Called doStop when not started: ")).append(this).toString(), runtimeexception);
            return;
        }
        for (int j = b.a() - 1; j >= 0; j--)
        {
            ((ab)b.b(j)).a();
        }

        f = false;
    }

    final void d()
    {
        if (a)
        {
            Log.v("LoaderManager", (new StringBuilder("Retaining in ")).append(this).toString());
        }
        if (!f)
        {
            RuntimeException runtimeexception = new RuntimeException("here");
            runtimeexception.fillInStackTrace();
            Log.w("LoaderManager", (new StringBuilder("Called doRetain when not started: ")).append(this).toString(), runtimeexception);
        } else
        {
            g = true;
            f = false;
            int j = b.a() - 1;
            while (j >= 0) 
            {
                ab ab1 = (ab)b.b(j);
                if (a)
                {
                    Log.v("LoaderManager", (new StringBuilder("  Retaining: ")).append(ab1).toString());
                }
                ab1.i = true;
                ab1.j = ab1.h;
                ab1.h = false;
                ab1.c = null;
                j--;
            }
        }
    }

    final void e()
    {
        if (g)
        {
            if (a)
            {
                Log.v("LoaderManager", (new StringBuilder("Finished Retaining in ")).append(this).toString());
            }
            g = false;
            for (int j = b.a() - 1; j >= 0; j--)
            {
                ab ab1 = (ab)b.b(j);
                if (ab1.i)
                {
                    if (a)
                    {
                        Log.v("LoaderManager", (new StringBuilder("  Finished Retaining: ")).append(ab1).toString());
                    }
                    ab1.i = false;
                    if (ab1.h != ab1.j && !ab1.h)
                    {
                        ab1.a();
                    }
                }
                if (ab1.h && ab1.e && !ab1.k)
                {
                    ab1.a(ab1.d, ab1.g);
                }
            }

        }
    }

    final void f()
    {
        for (int j = b.a() - 1; j >= 0; j--)
        {
            ((ab)b.b(j)).k = true;
        }

    }

    final void g()
    {
        for (int j = b.a() - 1; j >= 0; j--)
        {
            ab ab1 = (ab)b.b(j);
            if (!ab1.h || !ab1.k)
            {
                continue;
            }
            ab1.k = false;
            if (ab1.e)
            {
                ab1.a(ab1.d, ab1.g);
            }
        }

    }

    final void h()
    {
        if (!g)
        {
            if (a)
            {
                Log.v("LoaderManager", (new StringBuilder("Destroying Active in ")).append(this).toString());
            }
            for (int j = b.a() - 1; j >= 0; j--)
            {
                ((ab)b.b(j)).b();
            }

            b.b();
        }
        if (a)
        {
            Log.v("LoaderManager", (new StringBuilder("Destroying Inactive in ")).append(this).toString());
        }
        for (int k = c.a() - 1; k >= 0; k--)
        {
            ((ab)c.b(k)).b();
        }

        c.b();
    }

    public final String toString()
    {
        StringBuilder stringbuilder = new StringBuilder(128);
        stringbuilder.append("LoaderManager{");
        stringbuilder.append(Integer.toHexString(System.identityHashCode(this)));
        stringbuilder.append(" in ");
        android.support.v4.f.d.a(e, stringbuilder);
        stringbuilder.append("}}");
        return stringbuilder.toString();
    }

}
