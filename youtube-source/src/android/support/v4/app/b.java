// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.support.v4.f.e;
import android.util.Log;
import java.io.PrintWriter;
import java.util.ArrayList;

// Referenced classes of package android.support.v4.app:
//            v, Fragment, c, m

final class b extends v
    implements Runnable
{

    final m a;
    c b;
    c c;
    int d;
    int e;
    int f;
    int g;
    int h;
    int i;
    int j;
    boolean k;
    boolean l;
    String m;
    boolean n;
    int o;
    int p;
    CharSequence q;
    int r;
    CharSequence s;

    public b(m m1)
    {
        l = true;
        o = -1;
        a = m1;
    }

    private void a(int i1, Fragment fragment, String s1, int j1)
    {
        fragment.B = a;
        if (s1 != null)
        {
            if (fragment.H != null && !s1.equals(fragment.H))
            {
                throw new IllegalStateException((new StringBuilder("Can't change tag of fragment ")).append(fragment).append(": was ").append(fragment.H).append(" now ").append(s1).toString());
            }
            fragment.H = s1;
        }
        if (i1 != 0)
        {
            if (fragment.F != 0 && fragment.F != i1)
            {
                throw new IllegalStateException((new StringBuilder("Can't change container ID of fragment ")).append(fragment).append(": was ").append(fragment.F).append(" now ").append(i1).toString());
            }
            fragment.F = i1;
            fragment.G = i1;
        }
        s1 = new c();
        s1.c = j1;
        s1.d = fragment;
        a(((c) (s1)));
    }

    private int b(boolean flag)
    {
        if (n)
        {
            throw new IllegalStateException("commit already called");
        }
        if (m.a)
        {
            Log.v("FragmentManager", (new StringBuilder("Commit: ")).append(this).toString());
            a("  ", new PrintWriter(new e("FragmentManager")));
        }
        n = true;
        if (k)
        {
            o = a.a(this);
        } else
        {
            o = -1;
        }
        a.a(this, flag);
        return o;
    }

    public final int a()
    {
        return b(false);
    }

    public final v a(int i1)
    {
        i = i1;
        return this;
    }

    public final v a(int i1, Fragment fragment, String s1)
    {
        a(i1, fragment, s1, 1);
        return this;
    }

    public final v a(Fragment fragment)
    {
        c c1 = new c();
        c1.c = 3;
        c1.d = fragment;
        a(c1);
        return this;
    }

    public final v a(Fragment fragment, String s1)
    {
        a(0, fragment, s1, 1);
        return this;
    }

    final void a(c c1)
    {
        if (b == null)
        {
            c = c1;
            b = c1;
        } else
        {
            c1.b = c;
            c.a = c1;
            c = c1;
        }
        c1.e = e;
        c1.f = f;
        c1.g = g;
        c1.h = h;
        d = d + 1;
    }

    public final void a(String s1, PrintWriter printwriter)
    {
        a(s1, printwriter, true);
    }

    public final void a(String s1, PrintWriter printwriter, boolean flag)
    {
        c c1;
        String s3;
        int i1;
        if (flag)
        {
            printwriter.print(s1);
            printwriter.print("mName=");
            printwriter.print(m);
            printwriter.print(" mIndex=");
            printwriter.print(o);
            printwriter.print(" mCommitted=");
            printwriter.println(n);
            if (i != 0)
            {
                printwriter.print(s1);
                printwriter.print("mTransition=#");
                printwriter.print(Integer.toHexString(i));
                printwriter.print(" mTransitionStyle=#");
                printwriter.println(Integer.toHexString(j));
            }
            if (e != 0 || f != 0)
            {
                printwriter.print(s1);
                printwriter.print("mEnterAnim=#");
                printwriter.print(Integer.toHexString(e));
                printwriter.print(" mExitAnim=#");
                printwriter.println(Integer.toHexString(f));
            }
            if (g != 0 || h != 0)
            {
                printwriter.print(s1);
                printwriter.print("mPopEnterAnim=#");
                printwriter.print(Integer.toHexString(g));
                printwriter.print(" mPopExitAnim=#");
                printwriter.println(Integer.toHexString(h));
            }
            if (p != 0 || q != null)
            {
                printwriter.print(s1);
                printwriter.print("mBreadCrumbTitleRes=#");
                printwriter.print(Integer.toHexString(p));
                printwriter.print(" mBreadCrumbTitleText=");
                printwriter.println(q);
            }
            if (r != 0 || s != null)
            {
                printwriter.print(s1);
                printwriter.print("mBreadCrumbShortTitleRes=#");
                printwriter.print(Integer.toHexString(r));
                printwriter.print(" mBreadCrumbShortTitleText=");
                printwriter.println(s);
            }
        }
        if (b == null)
        {
            break MISSING_BLOCK_LABEL_798;
        }
        printwriter.print(s1);
        printwriter.println("Operations:");
        s3 = (new StringBuilder()).append(s1).append("    ").toString();
        c1 = b;
        i1 = 0;
_L13:
        if (c1 == null) goto _L2; else goto _L1
_L1:
        c1.c;
        JVM INSTR tableswitch 0 7: default 408
    //                   0 678
    //                   1 686
    //                   2 694
    //                   3 702
    //                   4 710
    //                   5 718
    //                   6 726
    //                   7 734;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11
_L11:
        break MISSING_BLOCK_LABEL_734;
_L3:
        String s2 = (new StringBuilder("cmd=")).append(c1.c).toString();
_L12:
        printwriter.print(s1);
        printwriter.print("  Op #");
        printwriter.print(i1);
        printwriter.print(": ");
        printwriter.print(s2);
        printwriter.print(" ");
        printwriter.println(c1.d);
        if (flag)
        {
            if (c1.e != 0 || c1.f != 0)
            {
                printwriter.print(s1);
                printwriter.print("enterAnim=#");
                printwriter.print(Integer.toHexString(c1.e));
                printwriter.print(" exitAnim=#");
                printwriter.println(Integer.toHexString(c1.f));
            }
            if (c1.g != 0 || c1.h != 0)
            {
                printwriter.print(s1);
                printwriter.print("popEnterAnim=#");
                printwriter.print(Integer.toHexString(c1.g));
                printwriter.print(" popExitAnim=#");
                printwriter.println(Integer.toHexString(c1.h));
            }
        }
        if (c1.i != null && c1.i.size() > 0)
        {
            int j1 = 0;
            while (j1 < c1.i.size()) 
            {
                printwriter.print(s3);
                if (c1.i.size() == 1)
                {
                    printwriter.print("Removed: ");
                } else
                {
                    if (j1 == 0)
                    {
                        printwriter.println("Removed:");
                    }
                    printwriter.print(s3);
                    printwriter.print("  #");
                    printwriter.print(j1);
                    printwriter.print(": ");
                }
                printwriter.println(c1.i.get(j1));
                j1++;
            }
        }
        break MISSING_BLOCK_LABEL_782;
_L4:
        s2 = "NULL";
          goto _L12
_L5:
        s2 = "ADD";
          goto _L12
_L6:
        s2 = "REPLACE";
          goto _L12
_L7:
        s2 = "REMOVE";
          goto _L12
_L8:
        s2 = "HIDE";
          goto _L12
_L9:
        s2 = "SHOW";
          goto _L12
_L10:
        s2 = "DETACH";
          goto _L12
        s2 = "ATTACH";
          goto _L12
        c1 = c1.a;
        i1++;
          goto _L13
_L2:
    }

    public final void a(boolean flag)
    {
        c c1;
        if (m.a)
        {
            Log.v("FragmentManager", (new StringBuilder("popFromBackStack: ")).append(this).toString());
            a("  ", new PrintWriter(new e("FragmentManager")));
        }
        b(-1);
        c1 = c;
_L10:
        if (c1 == null)
        {
            break MISSING_BLOCK_LABEL_442;
        }
        c1.c;
        JVM INSTR tableswitch 1 7: default 112
    //                   1 140
    //                   2 180
    //                   3 277
    //                   4 302
    //                   5 337
    //                   6 372
    //                   7 407;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L8:
        break MISSING_BLOCK_LABEL_407;
_L3:
        break; /* Loop/switch isn't completed */
_L1:
        throw new IllegalArgumentException((new StringBuilder("Unknown cmd: ")).append(c1.c).toString());
_L2:
        Fragment fragment = c1.d;
        fragment.P = c1.h;
        a.a(fragment, android.support.v4.app.m.c(i), j);
_L11:
        c1 = c1.b;
        if (true) goto _L10; else goto _L9
_L9:
        Fragment fragment1 = c1.d;
        if (fragment1 != null)
        {
            fragment1.P = c1.h;
            a.a(fragment1, android.support.v4.app.m.c(i), j);
        }
        if (c1.i != null)
        {
            int i1 = 0;
            while (i1 < c1.i.size()) 
            {
                Fragment fragment2 = (Fragment)c1.i.get(i1);
                fragment2.P = c1.g;
                a.a(fragment2, false);
                i1++;
            }
        }
          goto _L11
_L4:
        Fragment fragment3 = c1.d;
        fragment3.P = c1.g;
        a.a(fragment3, false);
          goto _L11
_L5:
        Fragment fragment4 = c1.d;
        fragment4.P = c1.g;
        a.c(fragment4, android.support.v4.app.m.c(i), j);
          goto _L11
_L6:
        Fragment fragment5 = c1.d;
        fragment5.P = c1.h;
        a.b(fragment5, android.support.v4.app.m.c(i), j);
          goto _L11
_L7:
        Fragment fragment6 = c1.d;
        fragment6.P = c1.g;
        a.e(fragment6, android.support.v4.app.m.c(i), j);
          goto _L11
        Fragment fragment7 = c1.d;
        fragment7.P = c1.g;
        a.d(fragment7, android.support.v4.app.m.c(i), j);
          goto _L11
        if (flag)
        {
            a.a(a.n, android.support.v4.app.m.c(i), j, true);
        }
        if (o >= 0)
        {
            a.b(o);
            o = -1;
        }
        return;
    }

    public final int b()
    {
        return b(true);
    }

    public final v b(int i1, Fragment fragment, String s1)
    {
        if (i1 == 0)
        {
            throw new IllegalArgumentException("Must use non-zero containerViewId");
        } else
        {
            a(i1, fragment, s1, 2);
            return this;
        }
    }

    public final v b(Fragment fragment)
    {
        c c1 = new c();
        c1.c = 6;
        c1.d = fragment;
        a(c1);
        return this;
    }

    final void b(int i1)
    {
        if (k)
        {
            if (m.a)
            {
                Log.v("FragmentManager", (new StringBuilder("Bump nesting in ")).append(this).append(" by ").append(i1).toString());
            }
            c c1 = b;
            while (c1 != null) 
            {
                if (c1.d != null)
                {
                    Fragment fragment = c1.d;
                    fragment.A = fragment.A + i1;
                    if (m.a)
                    {
                        Log.v("FragmentManager", (new StringBuilder("Bump nesting of ")).append(c1.d).append(" to ").append(c1.d.A).toString());
                    }
                }
                if (c1.i != null)
                {
                    for (int j1 = c1.i.size() - 1; j1 >= 0; j1--)
                    {
                        Fragment fragment1 = (Fragment)c1.i.get(j1);
                        fragment1.A = fragment1.A + i1;
                        if (m.a)
                        {
                            Log.v("FragmentManager", (new StringBuilder("Bump nesting of ")).append(fragment1).append(" to ").append(fragment1.A).toString());
                        }
                    }

                }
                c1 = c1.a;
            }
        }
    }

    public final v c(Fragment fragment)
    {
        c c1 = new c();
        c1.c = 7;
        c1.d = fragment;
        a(c1);
        return this;
    }

    public final void run()
    {
        c c1;
        if (m.a)
        {
            Log.v("FragmentManager", (new StringBuilder("Run: ")).append(this).toString());
        }
        if (k && o < 0)
        {
            throw new IllegalStateException("addToBackStack() called after commit()");
        }
        b(1);
        c1 = b;
_L10:
        if (c1 == null)
        {
            break MISSING_BLOCK_LABEL_616;
        }
        c1.c;
        JVM INSTR tableswitch 1 7: default 116
    //                   1 144
    //                   2 174
    //                   3 456
    //                   4 488
    //                   5 520
    //                   6 552
    //                   7 584;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L8:
        break MISSING_BLOCK_LABEL_584;
_L3:
        break; /* Loop/switch isn't completed */
_L1:
        throw new IllegalArgumentException((new StringBuilder("Unknown cmd: ")).append(c1.c).toString());
_L2:
        Fragment fragment = c1.d;
        fragment.P = c1.e;
        a.a(fragment, false);
_L11:
        c1 = c1.a;
        if (true) goto _L10; else goto _L9
_L9:
        Fragment fragment1 = c1.d;
        Fragment fragment7;
        if (a.g != null)
        {
            int i1 = 0;
label0:
            do
            {
label1:
                {
                    fragment7 = fragment1;
                    if (i1 >= a.g.size())
                    {
                        break label0;
                    }
                    Fragment fragment8 = (Fragment)a.g.get(i1);
                    if (m.a)
                    {
                        Log.v("FragmentManager", (new StringBuilder("OP_REPLACE: adding=")).append(fragment1).append(" old=").append(fragment8).toString());
                    }
                    if (fragment1 != null)
                    {
                        fragment7 = fragment1;
                        if (fragment8.G != fragment1.G)
                        {
                            break label1;
                        }
                    }
                    if (fragment8 == fragment1)
                    {
                        fragment7 = null;
                        c1.d = null;
                    } else
                    {
                        if (c1.i == null)
                        {
                            c1.i = new ArrayList();
                        }
                        c1.i.add(fragment8);
                        fragment8.P = c1.f;
                        if (k)
                        {
                            fragment8.A = fragment8.A + 1;
                            if (m.a)
                            {
                                Log.v("FragmentManager", (new StringBuilder("Bump nesting of ")).append(fragment8).append(" to ").append(fragment8.A).toString());
                            }
                        }
                        a.a(fragment8, i, j);
                        fragment7 = fragment1;
                    }
                }
                i1++;
                fragment1 = fragment7;
            } while (true);
        } else
        {
            fragment7 = fragment1;
        }
        if (fragment7 != null)
        {
            fragment7.P = c1.e;
            a.a(fragment7, false);
        }
          goto _L11
_L4:
        Fragment fragment2 = c1.d;
        fragment2.P = c1.f;
        a.a(fragment2, i, j);
          goto _L11
_L5:
        Fragment fragment3 = c1.d;
        fragment3.P = c1.f;
        a.b(fragment3, i, j);
          goto _L11
_L6:
        Fragment fragment4 = c1.d;
        fragment4.P = c1.e;
        a.c(fragment4, i, j);
          goto _L11
_L7:
        Fragment fragment5 = c1.d;
        fragment5.P = c1.f;
        a.d(fragment5, i, j);
          goto _L11
        Fragment fragment6 = c1.d;
        fragment6.P = c1.e;
        a.e(fragment6, i, j);
          goto _L11
        a.a(a.n, i, j, true);
        if (k)
        {
            a.b(this);
        }
        return;
    }

    public final String toString()
    {
        StringBuilder stringbuilder = new StringBuilder(128);
        stringbuilder.append("BackStackEntry{");
        stringbuilder.append(Integer.toHexString(System.identityHashCode(this)));
        if (o >= 0)
        {
            stringbuilder.append(" #");
            stringbuilder.append(o);
        }
        if (m != null)
        {
            stringbuilder.append(" ");
            stringbuilder.append(m);
        }
        stringbuilder.append("}");
        return stringbuilder.toString();
    }
}
