// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.support.v4.f.d;
import android.support.v4.f.e;
import android.util.Log;
import android.util.SparseArray;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;

// Referenced classes of package android.support.v4.app:
//            l, n, Fragment, FragmentActivity, 
//            b, o, aa, FragmentManagerState, 
//            FragmentState, BackStackState, SuperNotCalledException, ag, 
//            k, p, v

final class m extends l
{

    static final Interpolator A = new DecelerateInterpolator(1.5F);
    static final Interpolator B = new AccelerateInterpolator(2.5F);
    static final Interpolator C = new AccelerateInterpolator(1.5F);
    static boolean a = false;
    static final boolean b;
    static final Interpolator z = new DecelerateInterpolator(2.5F);
    ArrayList c;
    Runnable d[];
    boolean e;
    ArrayList f;
    ArrayList g;
    ArrayList h;
    ArrayList i;
    ArrayList j;
    ArrayList k;
    ArrayList l;
    ArrayList m;
    int n;
    FragmentActivity o;
    k p;
    Fragment q;
    boolean r;
    boolean s;
    boolean t;
    String u;
    boolean v;
    Bundle w;
    SparseArray x;
    Runnable y;

    m()
    {
        n = 0;
        w = null;
        x = null;
        y = new n(this);
    }

    private Fragment a(Bundle bundle, String s1)
    {
        int i1 = bundle.getInt(s1, -1);
        if (i1 == -1)
        {
            bundle = null;
        } else
        {
            if (i1 >= f.size())
            {
                a(((RuntimeException) (new IllegalStateException((new StringBuilder("Fragement no longer exists for key ")).append(s1).append(": index ").append(i1).toString()))));
            }
            Fragment fragment = (Fragment)f.get(i1);
            bundle = fragment;
            if (fragment == null)
            {
                a(((RuntimeException) (new IllegalStateException((new StringBuilder("Fragement no longer exists for key ")).append(s1).append(": index ").append(i1).toString()))));
                return fragment;
            }
        }
        return bundle;
    }

    private static Animation a(float f1, float f2)
    {
        AlphaAnimation alphaanimation = new AlphaAnimation(f1, f2);
        alphaanimation.setInterpolator(A);
        alphaanimation.setDuration(220L);
        return alphaanimation;
    }

    private static Animation a(float f1, float f2, float f3, float f4)
    {
        AnimationSet animationset = new AnimationSet(false);
        Object obj = new ScaleAnimation(f1, f2, f1, f2, 1, 0.5F, 1, 0.5F);
        ((ScaleAnimation) (obj)).setInterpolator(z);
        ((ScaleAnimation) (obj)).setDuration(220L);
        animationset.addAnimation(((Animation) (obj)));
        obj = new AlphaAnimation(f3, f4);
        ((AlphaAnimation) (obj)).setInterpolator(A);
        ((AlphaAnimation) (obj)).setDuration(220L);
        animationset.addAnimation(((Animation) (obj)));
        return animationset;
    }

    private Animation a(Fragment fragment, int i1, boolean flag, int j1)
    {
        int k1;
        k1 = fragment.P;
        Fragment.p();
        if (fragment.P != 0)
        {
            fragment = AnimationUtils.loadAnimation(o, fragment.P);
            if (fragment != null)
            {
                return fragment;
            }
        }
        if (i1 == 0)
        {
            return null;
        }
        k1 = -1;
        i1;
        JVM INSTR lookupswitch 3: default 80
    //                   4097: 89
    //                   4099: 117
    //                   8194: 103;
           goto _L1 _L2 _L3 _L4
_L1:
        i1 = k1;
_L6:
        if (i1 < 0)
        {
            return null;
        }
        break; /* Loop/switch isn't completed */
_L2:
        if (flag)
        {
            i1 = 1;
        } else
        {
            i1 = 2;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (flag)
        {
            i1 = 3;
        } else
        {
            i1 = 4;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (flag)
        {
            i1 = 5;
        } else
        {
            i1 = 6;
        }
        if (true) goto _L6; else goto _L5
_L5:
        switch (i1)
        {
        default:
            i1 = j1;
            if (j1 == 0)
            {
                i1 = j1;
                if (o.getWindow() != null)
                {
                    i1 = o.getWindow().getAttributes().windowAnimations;
                }
            }
            if (i1 == 0)
            {
                return null;
            } else
            {
                return null;
            }

        case 1: // '\001'
            fragment = o;
            return a(1.125F, 1.0F, 0.0F, 1.0F);

        case 2: // '\002'
            fragment = o;
            return a(1.0F, 0.975F, 1.0F, 0.0F);

        case 3: // '\003'
            fragment = o;
            return a(0.975F, 1.0F, 0.0F, 1.0F);

        case 4: // '\004'
            fragment = o;
            return a(1.0F, 1.075F, 1.0F, 0.0F);

        case 5: // '\005'
            fragment = o;
            return a(0.0F, 1.0F);

        case 6: // '\006'
            fragment = o;
            return a(1.0F, 0.0F);
        }
    }

    private void a(int i1, b b1)
    {
        this;
        JVM INSTR monitorenter ;
        int k1;
        if (k == null)
        {
            k = new ArrayList();
        }
        k1 = k.size();
        int j1 = k1;
        if (i1 >= k1) goto _L2; else goto _L1
_L1:
        if (a)
        {
            Log.v("FragmentManager", (new StringBuilder("Setting back stack index ")).append(i1).append(" to ").append(b1).toString());
        }
        k.set(i1, b1);
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (j1 >= i1)
        {
            break; /* Loop/switch isn't completed */
        }
        k.add(null);
        if (l == null)
        {
            l = new ArrayList();
        }
        if (a)
        {
            Log.v("FragmentManager", (new StringBuilder("Adding available back stack index ")).append(j1).toString());
        }
        l.add(Integer.valueOf(j1));
        j1++;
        if (true) goto _L2; else goto _L3
_L3:
        if (a)
        {
            Log.v("FragmentManager", (new StringBuilder("Adding back stack index ")).append(i1).append(" with ").append(b1).toString());
        }
        k.add(b1);
          goto _L4
        b1;
        throw b1;
    }

    private void a(int i1, boolean flag)
    {
        a(i1, 0, 0, false);
    }

    private void a(RuntimeException runtimeexception)
    {
        Log.e("FragmentManager", runtimeexception.getMessage());
        Log.e("FragmentManager", "Activity state:");
        Object obj = new PrintWriter(new e("FragmentManager"));
        if (o != null)
        {
            try
            {
                o.dump("  ", null, ((PrintWriter) (obj)), new String[0]);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                Log.e("FragmentManager", "Failed dumping state", ((Throwable) (obj)));
            }
        } else
        {
            try
            {
                a("  ", ((FileDescriptor) (null)), ((PrintWriter) (obj)), new String[0]);
            }
            catch (Exception exception)
            {
                Log.e("FragmentManager", "Failed dumping state", exception);
            }
        }
        throw runtimeexception;
    }

    public static int c(int i1)
    {
        switch (i1)
        {
        default:
            return 0;

        case 4097: 
            return 8194;

        case 8194: 
            return 4097;

        case 4099: 
            return 4099;
        }
    }

    private void c(Fragment fragment)
    {
        if (fragment.S != null)
        {
            if (x == null)
            {
                x = new SparseArray();
            } else
            {
                x.clear();
            }
            fragment.S.saveHierarchyState(x);
            if (x.size() > 0)
            {
                fragment.n = x;
                x = null;
                return;
            }
        }
    }

    private Bundle d(Fragment fragment)
    {
        if (w == null)
        {
            w = new Bundle();
        }
        fragment.j(w);
        Bundle bundle;
        Bundle bundle1;
        if (!w.isEmpty())
        {
            bundle1 = w;
            w = null;
        } else
        {
            bundle1 = null;
        }
        if (fragment.R != null)
        {
            c(fragment);
        }
        bundle = bundle1;
        if (fragment.n != null)
        {
            bundle = bundle1;
            if (bundle1 == null)
            {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", fragment.n);
        }
        bundle1 = bundle;
        if (!fragment.U)
        {
            bundle1 = bundle;
            if (bundle == null)
            {
                bundle1 = new Bundle();
            }
            bundle1.putBoolean("android:user_visible_hint", fragment.U);
        }
        return bundle1;
    }

    private void r()
    {
        if (f != null)
        {
            int i1 = 0;
            while (i1 < f.size()) 
            {
                Fragment fragment = (Fragment)f.get(i1);
                if (fragment != null && fragment.T)
                {
                    if (e)
                    {
                        v = true;
                    } else
                    {
                        fragment.T = false;
                        a(fragment, n, 0, 0, false);
                    }
                }
                i1++;
            }
        }
    }

    private void s()
    {
        if (s)
        {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (u != null)
        {
            throw new IllegalStateException((new StringBuilder("Can not perform this action inside of ")).append(u).toString());
        } else
        {
            return;
        }
    }

    private void t()
    {
        if (m != null)
        {
            for (int i1 = 0; i1 < m.size(); i1++)
            {
                m.get(i1);
            }

        }
    }

    public final int a(b b1)
    {
        this;
        JVM INSTR monitorenter ;
        int i1;
        if (l != null && l.size() > 0)
        {
            break MISSING_BLOCK_LABEL_95;
        }
        if (k == null)
        {
            k = new ArrayList();
        }
        i1 = k.size();
        if (a)
        {
            Log.v("FragmentManager", (new StringBuilder("Setting back stack index ")).append(i1).append(" to ").append(b1).toString());
        }
        k.add(b1);
        this;
        JVM INSTR monitorexit ;
        return i1;
        i1 = ((Integer)l.remove(l.size() - 1)).intValue();
        if (a)
        {
            Log.v("FragmentManager", (new StringBuilder("Adding back stack index ")).append(i1).append(" with ").append(b1).toString());
        }
        k.set(i1, b1);
        this;
        JVM INSTR monitorexit ;
        return i1;
        b1;
        throw b1;
    }

    public final Fragment.SavedState a(Fragment fragment)
    {
        Object obj = null;
        if (fragment.o < 0)
        {
            a(((RuntimeException) (new IllegalStateException((new StringBuilder("Fragment ")).append(fragment).append(" is not currently in the FragmentManager").toString()))));
        }
        Fragment.SavedState savedstate = obj;
        if (fragment.j > 0)
        {
            fragment = d(fragment);
            savedstate = obj;
            if (fragment != null)
            {
                savedstate = new Fragment.SavedState(fragment);
            }
        }
        return savedstate;
    }

    public final Fragment a(int i1)
    {
        if (g == null) goto _L2; else goto _L1
_L1:
        int j1 = g.size() - 1;
_L11:
        if (j1 < 0) goto _L2; else goto _L3
_L3:
        Fragment fragment = (Fragment)g.get(j1);
        if (fragment == null || fragment.F != i1) goto _L5; else goto _L4
_L4:
        return fragment;
_L5:
        j1--;
        continue; /* Loop/switch isn't completed */
_L2:
        if (f == null)
        {
            break MISSING_BLOCK_LABEL_118;
        }
        j1 = f.size() - 1;
_L9:
        if (j1 < 0) goto _L7; else goto _L6
_L6:
        Fragment fragment1;
        fragment1 = (Fragment)f.get(j1);
        if (fragment1 == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        fragment = fragment1;
        if (fragment1.F == i1) goto _L4; else goto _L8
_L8:
        j1--;
          goto _L9
_L7:
        return null;
        if (true) goto _L11; else goto _L10
_L10:
    }

    public final Fragment a(String s1)
    {
        if (g == null || s1 == null) goto _L2; else goto _L1
_L1:
        int i1 = g.size() - 1;
_L11:
        if (i1 < 0) goto _L2; else goto _L3
_L3:
        Fragment fragment = (Fragment)g.get(i1);
        if (fragment == null || !s1.equals(fragment.H)) goto _L5; else goto _L4
_L4:
        return fragment;
_L5:
        i1--;
        continue; /* Loop/switch isn't completed */
_L2:
        if (f == null || s1 == null)
        {
            break MISSING_BLOCK_LABEL_132;
        }
        i1 = f.size() - 1;
_L9:
        if (i1 < 0) goto _L7; else goto _L6
_L6:
        Fragment fragment1;
        fragment1 = (Fragment)f.get(i1);
        if (fragment1 == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        fragment = fragment1;
        if (s1.equals(fragment1.H)) goto _L4; else goto _L8
_L8:
        i1--;
          goto _L9
_L7:
        return null;
        if (true) goto _L11; else goto _L10
_L10:
    }

    public final v a()
    {
        return new b(this);
    }

    public final void a(int i1, int j1)
    {
        if (i1 < 0)
        {
            throw new IllegalArgumentException((new StringBuilder("Bad id: ")).append(i1).toString());
        } else
        {
            a(((Runnable) (new o(this, i1, 1))), false);
            return;
        }
    }

    final void a(int i1, int j1, int k1, boolean flag)
    {
        if (o == null && i1 != 0)
        {
            throw new IllegalStateException("No activity");
        }
        if (flag || n != i1)
        {
            n = i1;
            if (f != null)
            {
                int l1 = 0;
                boolean flag1 = false;
                for (; l1 < f.size(); l1++)
                {
                    Fragment fragment = (Fragment)f.get(l1);
                    if (fragment == null)
                    {
                        continue;
                    }
                    a(fragment, i1, j1, k1, false);
                    if (fragment.V != null)
                    {
                        flag1 |= fragment.V.a();
                    }
                }

                if (!flag1)
                {
                    r();
                }
                if (r && o != null && n == 5)
                {
                    o.b();
                    r = false;
                    return;
                }
            }
        }
    }

    public final void a(Configuration configuration)
    {
        if (g != null)
        {
            for (int i1 = 0; i1 < g.size(); i1++)
            {
                Fragment fragment = (Fragment)g.get(i1);
                if (fragment != null)
                {
                    fragment.a(configuration);
                }
            }

        }
    }

    final void a(Parcelable parcelable, ArrayList arraylist)
    {
        if (parcelable != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (((FragmentManagerState) (parcelable = (FragmentManagerState)parcelable)).mActive != null)
        {
            if (arraylist != null)
            {
                for (int i1 = 0; i1 < arraylist.size(); i1++)
                {
                    Fragment fragment = (Fragment)arraylist.get(i1);
                    if (a)
                    {
                        Log.v("FragmentManager", (new StringBuilder("restoreAllState: re-attaching retained ")).append(fragment).toString());
                    }
                    FragmentState fragmentstate1 = ((FragmentManagerState) (parcelable)).mActive[fragment.o];
                    fragmentstate1.mInstance = fragment;
                    fragment.n = null;
                    fragment.A = 0;
                    fragment.y = false;
                    fragment.u = false;
                    fragment.r = null;
                    if (fragmentstate1.mSavedFragmentState != null)
                    {
                        fragmentstate1.mSavedFragmentState.setClassLoader(o.getClassLoader());
                        fragment.n = fragmentstate1.mSavedFragmentState.getSparseParcelableArray("android:view_state");
                    }
                }

            }
            f = new ArrayList(((FragmentManagerState) (parcelable)).mActive.length);
            if (h != null)
            {
                h.clear();
            }
            int j1 = 0;
            while (j1 < ((FragmentManagerState) (parcelable)).mActive.length) 
            {
                FragmentState fragmentstate = ((FragmentManagerState) (parcelable)).mActive[j1];
                if (fragmentstate != null)
                {
                    Fragment fragment2 = fragmentstate.instantiate(o, q);
                    if (a)
                    {
                        Log.v("FragmentManager", (new StringBuilder("restoreAllState: active #")).append(j1).append(": ").append(fragment2).toString());
                    }
                    f.add(fragment2);
                    fragmentstate.mInstance = null;
                } else
                {
                    f.add(null);
                    if (h == null)
                    {
                        h = new ArrayList();
                    }
                    if (a)
                    {
                        Log.v("FragmentManager", (new StringBuilder("restoreAllState: avail #")).append(j1).toString());
                    }
                    h.add(Integer.valueOf(j1));
                }
                j1++;
            }
            if (arraylist != null)
            {
                int k1 = 0;
                while (k1 < arraylist.size()) 
                {
                    Fragment fragment1 = (Fragment)arraylist.get(k1);
                    if (fragment1.s >= 0)
                    {
                        if (fragment1.s < f.size())
                        {
                            fragment1.r = (Fragment)f.get(fragment1.s);
                        } else
                        {
                            Log.w("FragmentManager", (new StringBuilder("Re-attaching retained fragment ")).append(fragment1).append(" target no longer exists: ").append(fragment1.s).toString());
                            fragment1.r = null;
                        }
                    }
                    k1++;
                }
            }
            if (((FragmentManagerState) (parcelable)).mAdded != null)
            {
                g = new ArrayList(((FragmentManagerState) (parcelable)).mAdded.length);
                for (int l1 = 0; l1 < ((FragmentManagerState) (parcelable)).mAdded.length; l1++)
                {
                    arraylist = (Fragment)f.get(((FragmentManagerState) (parcelable)).mAdded[l1]);
                    if (arraylist == null)
                    {
                        a(((RuntimeException) (new IllegalStateException((new StringBuilder("No instantiated fragment for index #")).append(((FragmentManagerState) (parcelable)).mAdded[l1]).toString()))));
                    }
                    arraylist.u = true;
                    if (a)
                    {
                        Log.v("FragmentManager", (new StringBuilder("restoreAllState: added #")).append(l1).append(": ").append(arraylist).toString());
                    }
                    if (g.contains(arraylist))
                    {
                        throw new IllegalStateException("Already added!");
                    }
                    g.add(arraylist);
                }

            } else
            {
                g = null;
            }
            if (((FragmentManagerState) (parcelable)).mBackStack != null)
            {
                i = new ArrayList(((FragmentManagerState) (parcelable)).mBackStack.length);
                int i2 = 0;
                while (i2 < ((FragmentManagerState) (parcelable)).mBackStack.length) 
                {
                    arraylist = ((FragmentManagerState) (parcelable)).mBackStack[i2].instantiate(this);
                    if (a)
                    {
                        Log.v("FragmentManager", (new StringBuilder("restoreAllState: back stack #")).append(i2).append(" (index ").append(((b) (arraylist)).o).append("): ").append(arraylist).toString());
                        arraylist.a("  ", new PrintWriter(new e("FragmentManager")), false);
                    }
                    i.add(arraylist);
                    if (((b) (arraylist)).o >= 0)
                    {
                        a(((b) (arraylist)).o, ((b) (arraylist)));
                    }
                    i2++;
                }
            } else
            {
                i = null;
                return;
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    public final void a(Fragment fragment, int i1, int j1)
    {
        if (a)
        {
            Log.v("FragmentManager", (new StringBuilder("remove: ")).append(fragment).append(" nesting=").append(fragment.A).toString());
        }
        int k1;
        if (!fragment.g())
        {
            k1 = 1;
        } else
        {
            k1 = 0;
        }
        if (!fragment.J || k1 != 0)
        {
            if (g != null)
            {
                g.remove(fragment);
            }
            if (fragment.M && fragment.N)
            {
                r = true;
            }
            fragment.u = false;
            fragment.v = true;
            if (k1 != 0)
            {
                k1 = 0;
            } else
            {
                k1 = 1;
            }
            a(fragment, k1, i1, j1, false);
        }
    }

    final void a(Fragment fragment, int i1, int j1, int k1, boolean flag)
    {
        int l1;
label0:
        {
            if (fragment.u)
            {
                l1 = i1;
                if (!fragment.J)
                {
                    break label0;
                }
            }
            l1 = i1;
            if (i1 > 1)
            {
                l1 = 1;
            }
        }
        int j2 = l1;
        if (fragment.v)
        {
            j2 = l1;
            if (l1 > fragment.j)
            {
                j2 = fragment.j;
            }
        }
        i1 = j2;
        if (fragment.T)
        {
            i1 = j2;
            if (fragment.j < 4)
            {
                i1 = j2;
                if (j2 > 3)
                {
                    i1 = 3;
                }
            }
        }
        if (fragment.j >= i1) goto _L2; else goto _L1
_L1:
        int i2;
        int k2;
        int l2;
        if (fragment.x && !fragment.y)
        {
            return;
        }
        if (fragment.k != null)
        {
            fragment.k = null;
            a(fragment, fragment.l, 0, 0, true);
        }
        i2 = i1;
        l2 = i1;
        k2 = i1;
        fragment.j;
        JVM INSTR tableswitch 0 4: default 184
    //                   0 194
    //                   1 549
    //                   2 861
    //                   3 861
    //                   4 908;
           goto _L3 _L4 _L5 _L6 _L6 _L7
_L3:
        i2 = i1;
_L16:
        fragment.j = i2;
        return;
_L4:
        if (a)
        {
            Log.v("FragmentManager", (new StringBuilder("moveto CREATED: ")).append(fragment).toString());
        }
        k2 = i1;
        if (fragment.m != null)
        {
            fragment.n = fragment.m.getSparseParcelableArray("android:view_state");
            fragment.r = a(fragment.m, "android:target_state");
            if (fragment.r != null)
            {
                fragment.t = fragment.m.getInt("android:target_req_state", 0);
            }
            fragment.U = fragment.m.getBoolean("android:user_visible_hint", true);
            k2 = i1;
            if (!fragment.U)
            {
                fragment.T = true;
                k2 = i1;
                if (i1 > 3)
                {
                    k2 = 3;
                }
            }
        }
        fragment.C = o;
        fragment.E = q;
        Object obj;
        if (q != null)
        {
            obj = q.D;
        } else
        {
            obj = o.b;
        }
        fragment.B = ((m) (obj));
        fragment.O = false;
        fragment.a(o);
        if (!fragment.O)
        {
            throw new SuperNotCalledException((new StringBuilder("Fragment ")).append(fragment).append(" did not call through to super.onAttach()").toString());
        }
        if (fragment.E == null)
        {
            obj = o;
        }
        if (!fragment.L)
        {
            fragment.h(fragment.m);
        }
        fragment.L = false;
        i2 = k2;
        if (fragment.x)
        {
            fragment.R = fragment.b(fragment.b(fragment.m), null, fragment.m);
            Object obj2;
            if (fragment.R != null)
            {
                fragment.S = fragment.R;
                fragment.R = ag.a(fragment.R);
                if (fragment.I)
                {
                    fragment.R.setVisibility(8);
                }
                fragment.a(fragment.R, fragment.m);
                i2 = k2;
            } else
            {
                fragment.S = null;
                i2 = k2;
            }
        }
_L5:
        l2 = i2;
        if (i2 > 1)
        {
            if (a)
            {
                Log.v("FragmentManager", (new StringBuilder("moveto ACTIVITY_CREATED: ")).append(fragment).toString());
            }
            if (!fragment.x)
            {
                Object obj1;
                if (fragment.G != 0)
                {
                    obj2 = (ViewGroup)p.a(fragment.G);
                    obj1 = obj2;
                    if (obj2 == null)
                    {
                        obj1 = obj2;
                        if (!fragment.z)
                        {
                            a(((RuntimeException) (new IllegalArgumentException((new StringBuilder("No view found for id 0x")).append(Integer.toHexString(fragment.G)).append(" (").append(fragment.j().getResourceName(fragment.G)).append(") for fragment ").append(fragment).toString()))));
                            obj1 = obj2;
                        }
                    }
                } else
                {
                    obj1 = null;
                }
                fragment.Q = ((ViewGroup) (obj1));
                fragment.R = fragment.b(fragment.b(fragment.m), ((ViewGroup) (obj1)), fragment.m);
                if (fragment.R != null)
                {
                    fragment.S = fragment.R;
                    fragment.R = ag.a(fragment.R);
                    if (obj1 != null)
                    {
                        obj2 = a(fragment, j1, true, k1);
                        if (obj2 != null)
                        {
                            fragment.R.startAnimation(((Animation) (obj2)));
                        }
                        ((ViewGroup) (obj1)).addView(fragment.R);
                    }
                    if (fragment.I)
                    {
                        fragment.R.setVisibility(8);
                    }
                    fragment.a(fragment.R, fragment.m);
                } else
                {
                    fragment.S = null;
                }
            }
            fragment.i(fragment.m);
            if (fragment.R != null)
            {
                fragment.f(fragment.m);
            }
            fragment.m = null;
            l2 = i2;
        }
_L6:
        k2 = l2;
        if (l2 > 3)
        {
            if (a)
            {
                Log.v("FragmentManager", (new StringBuilder("moveto STARTED: ")).append(fragment).toString());
            }
            fragment.w();
            k2 = l2;
        }
_L7:
        i2 = k2;
        if (k2 > 4)
        {
            if (a)
            {
                Log.v("FragmentManager", (new StringBuilder("moveto RESUMED: ")).append(fragment).toString());
            }
            fragment.w = true;
            fragment.x();
            fragment.m = null;
            fragment.n = null;
            i2 = k2;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        i2 = i1;
        if (fragment.j <= i1)
        {
            continue; /* Loop/switch isn't completed */
        }
        fragment.j;
        JVM INSTR tableswitch 1 5: default 1044
    //                   1 1050
    //                   2 1224
    //                   3 1186
    //                   4 1148
    //                   5 1105;
           goto _L8 _L9 _L10 _L11 _L12 _L13
_L8:
        i2 = i1;
        break; /* Loop/switch isn't completed */
_L9:
        i2 = i1;
        if (i1 > 0)
        {
            break; /* Loop/switch isn't completed */
        }
        if (t && fragment.k != null)
        {
            obj1 = fragment.k;
            fragment.k = null;
            ((View) (obj1)).clearAnimation();
        }
        if (fragment.k != null)
        {
            fragment.l = i1;
            i2 = 1;
            break; /* Loop/switch isn't completed */
        }
          goto _L14
_L13:
        if (i1 < 5)
        {
            if (a)
            {
                Log.v("FragmentManager", (new StringBuilder("movefrom RESUMED: ")).append(fragment).toString());
            }
            fragment.z();
            fragment.w = false;
        }
_L12:
        if (i1 < 4)
        {
            if (a)
            {
                Log.v("FragmentManager", (new StringBuilder("movefrom STARTED: ")).append(fragment).toString());
            }
            fragment.A();
        }
_L11:
        if (i1 < 3)
        {
            if (a)
            {
                Log.v("FragmentManager", (new StringBuilder("movefrom STOPPED: ")).append(fragment).toString());
            }
            fragment.B();
        }
_L10:
        if (i1 < 2)
        {
            if (a)
            {
                Log.v("FragmentManager", (new StringBuilder("movefrom ACTIVITY_CREATED: ")).append(fragment).toString());
            }
            if (fragment.R != null && !o.isFinishing() && fragment.n == null)
            {
                c(fragment);
            }
            fragment.C();
            if (fragment.R != null && fragment.Q != null)
            {
                if (n > 0 && !t)
                {
                    obj1 = a(fragment, j1, false, k1);
                } else
                {
                    obj1 = null;
                }
                if (obj1 != null)
                {
                    fragment.k = fragment.R;
                    fragment.l = i1;
                    ((Animation) (obj1)).setAnimationListener(new p(this, fragment));
                    fragment.R.startAnimation(((Animation) (obj1)));
                }
                fragment.Q.removeView(fragment.R);
            }
            fragment.Q = null;
            fragment.R = null;
            fragment.S = null;
        }
        if (true) goto _L9; else goto _L14
_L14:
        if (a)
        {
            Log.v("FragmentManager", (new StringBuilder("movefrom CREATED: ")).append(fragment).toString());
        }
        if (!fragment.L)
        {
            fragment.D();
        }
        fragment.O = false;
        fragment.c();
        if (!fragment.O)
        {
            throw new SuperNotCalledException((new StringBuilder("Fragment ")).append(fragment).append(" did not call through to super.onDetach()").toString());
        }
        i2 = i1;
        if (flag)
        {
            break; /* Loop/switch isn't completed */
        }
        if (!fragment.L)
        {
            i2 = i1;
            if (fragment.o >= 0)
            {
                if (a)
                {
                    Log.v("FragmentManager", (new StringBuilder("Freeing fragment index ")).append(fragment).toString());
                }
                f.set(fragment.o, null);
                if (h == null)
                {
                    h = new ArrayList();
                }
                h.add(Integer.valueOf(fragment.o));
                o.a(fragment.p);
                fragment.u();
                i2 = i1;
            }
        } else
        {
            fragment.C = null;
            fragment.B = null;
            i2 = i1;
        }
        if (true) goto _L16; else goto _L15
_L15:
    }

    public final void a(Fragment fragment, boolean flag)
    {
        if (g == null)
        {
            g = new ArrayList();
        }
        if (a)
        {
            Log.v("FragmentManager", (new StringBuilder("add: ")).append(fragment).toString());
        }
        if (fragment.o < 0)
        {
            if (h == null || h.size() <= 0)
            {
                if (f == null)
                {
                    f = new ArrayList();
                }
                fragment.a(f.size(), q);
                f.add(fragment);
            } else
            {
                fragment.a(((Integer)h.remove(h.size() - 1)).intValue(), q);
                f.set(fragment.o, fragment);
            }
            if (a)
            {
                Log.v("FragmentManager", (new StringBuilder("Allocated fragment index ")).append(fragment).toString());
            }
        }
        if (!fragment.J)
        {
            if (g.contains(fragment))
            {
                throw new IllegalStateException((new StringBuilder("Fragment already added: ")).append(fragment).toString());
            }
            g.add(fragment);
            fragment.u = true;
            fragment.v = false;
            if (fragment.M && fragment.N)
            {
                r = true;
            }
            if (flag)
            {
                b(fragment);
            }
        }
    }

    public final void a(FragmentActivity fragmentactivity, k k1, Fragment fragment)
    {
        if (o != null)
        {
            throw new IllegalStateException("Already attached");
        } else
        {
            o = fragmentactivity;
            p = k1;
            q = fragment;
            return;
        }
    }

    public final void a(Runnable runnable, boolean flag)
    {
        if (!flag)
        {
            s();
        }
        this;
        JVM INSTR monitorenter ;
        if (t || o == null)
        {
            throw new IllegalStateException("Activity has been destroyed");
        }
        break MISSING_BLOCK_LABEL_40;
        runnable;
        this;
        JVM INSTR monitorexit ;
        throw runnable;
        if (c == null)
        {
            c = new ArrayList();
        }
        c.add(runnable);
        if (c.size() == 1)
        {
            o.a.removeCallbacks(y);
            o.a.post(y);
        }
        this;
        JVM INSTR monitorexit ;
    }

    public final void a(String s1, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
    {
        boolean flag;
        flag = false;
        String s2 = (new StringBuilder()).append(s1).append("    ").toString();
        if (f != null)
        {
            int k2 = f.size();
            if (k2 > 0)
            {
                printwriter.print(s1);
                printwriter.print("Active Fragments in ");
                printwriter.print(Integer.toHexString(System.identityHashCode(this)));
                printwriter.println(":");
                for (int i1 = 0; i1 < k2; i1++)
                {
                    Fragment fragment = (Fragment)f.get(i1);
                    printwriter.print(s1);
                    printwriter.print("  #");
                    printwriter.print(i1);
                    printwriter.print(": ");
                    printwriter.println(fragment);
                    if (fragment != null)
                    {
                        fragment.a(s2, filedescriptor, printwriter, as);
                    }
                }

            }
        }
        if (g != null)
        {
            int l2 = g.size();
            if (l2 > 0)
            {
                printwriter.print(s1);
                printwriter.println("Added Fragments:");
                for (int j1 = 0; j1 < l2; j1++)
                {
                    filedescriptor = (Fragment)g.get(j1);
                    printwriter.print(s1);
                    printwriter.print("  #");
                    printwriter.print(j1);
                    printwriter.print(": ");
                    printwriter.println(filedescriptor.toString());
                }

            }
        }
        if (j != null)
        {
            int i3 = j.size();
            if (i3 > 0)
            {
                printwriter.print(s1);
                printwriter.println("Fragments Created Menus:");
                for (int k1 = 0; k1 < i3; k1++)
                {
                    filedescriptor = (Fragment)j.get(k1);
                    printwriter.print(s1);
                    printwriter.print("  #");
                    printwriter.print(k1);
                    printwriter.print(": ");
                    printwriter.println(filedescriptor.toString());
                }

            }
        }
        if (i != null)
        {
            int j3 = i.size();
            if (j3 > 0)
            {
                printwriter.print(s1);
                printwriter.println("Back Stack:");
                for (int l1 = 0; l1 < j3; l1++)
                {
                    filedescriptor = (b)i.get(l1);
                    printwriter.print(s1);
                    printwriter.print("  #");
                    printwriter.print(l1);
                    printwriter.print(": ");
                    printwriter.println(filedescriptor.toString());
                    filedescriptor.a(s2, printwriter);
                }

            }
        }
        this;
        JVM INSTR monitorenter ;
        if (k == null) goto _L2; else goto _L1
_L1:
        int k3 = k.size();
        if (k3 <= 0) goto _L2; else goto _L3
_L3:
        printwriter.print(s1);
        printwriter.println("Back Stack Indices:");
        int i2 = 0;
_L4:
        if (i2 >= k3)
        {
            break; /* Loop/switch isn't completed */
        }
        filedescriptor = (b)k.get(i2);
        printwriter.print(s1);
        printwriter.print("  #");
        printwriter.print(i2);
        printwriter.print(": ");
        printwriter.println(filedescriptor);
        i2++;
        if (true) goto _L4; else goto _L2
_L2:
        if (l != null && l.size() > 0)
        {
            printwriter.print(s1);
            printwriter.print("mAvailBackStackIndices: ");
            printwriter.println(Arrays.toString(l.toArray()));
        }
        this;
        JVM INSTR monitorexit ;
        if (c != null)
        {
            int l3 = c.size();
            if (l3 > 0)
            {
                printwriter.print(s1);
                printwriter.println("Pending Actions:");
                for (int j2 = ((flag) ? 1 : 0); j2 < l3; j2++)
                {
                    filedescriptor = (Runnable)c.get(j2);
                    printwriter.print(s1);
                    printwriter.print("  #");
                    printwriter.print(j2);
                    printwriter.print(": ");
                    printwriter.println(filedescriptor);
                }

            }
        }
        break MISSING_BLOCK_LABEL_700;
        s1;
        throw s1;
        printwriter.print(s1);
        printwriter.println("FragmentManager misc state:");
        printwriter.print(s1);
        printwriter.print("  mActivity=");
        printwriter.println(o);
        printwriter.print(s1);
        printwriter.print("  mContainer=");
        printwriter.println(p);
        if (q != null)
        {
            printwriter.print(s1);
            printwriter.print("  mParent=");
            printwriter.println(q);
        }
        printwriter.print(s1);
        printwriter.print("  mCurState=");
        printwriter.print(n);
        printwriter.print(" mStateSaved=");
        printwriter.print(s);
        printwriter.print(" mDestroyed=");
        printwriter.println(t);
        if (r)
        {
            printwriter.print(s1);
            printwriter.print("  mNeedMenuInvalidate=");
            printwriter.println(r);
        }
        if (u != null)
        {
            printwriter.print(s1);
            printwriter.print("  mNoTransactionsBecause=");
            printwriter.println(u);
        }
        if (h != null && h.size() > 0)
        {
            printwriter.print(s1);
            printwriter.print("  mAvailIndices: ");
            printwriter.println(Arrays.toString(h.toArray()));
        }
        return;
    }

    public final boolean a(Menu menu)
    {
        boolean flag1;
        if (g != null)
        {
            int i1 = 0;
            boolean flag = false;
            do
            {
                flag1 = flag;
                if (i1 >= g.size())
                {
                    break;
                }
                Fragment fragment = (Fragment)g.get(i1);
                flag1 = flag;
                if (fragment != null)
                {
                    flag1 = flag;
                    if (fragment.a(menu))
                    {
                        flag1 = true;
                    }
                }
                i1++;
                flag = flag1;
            } while (true);
        } else
        {
            flag1 = false;
        }
        return flag1;
    }

    public final boolean a(Menu menu, MenuInflater menuinflater)
    {
        boolean flag = false;
        ArrayList arraylist1 = null;
        ArrayList arraylist = null;
        boolean flag2;
        if (g != null)
        {
            int i1 = 0;
            boolean flag1 = false;
            do
            {
                arraylist1 = arraylist;
                flag2 = flag1;
                if (i1 >= g.size())
                {
                    break;
                }
                Fragment fragment = (Fragment)g.get(i1);
                arraylist1 = arraylist;
                flag2 = flag1;
                if (fragment != null)
                {
                    arraylist1 = arraylist;
                    flag2 = flag1;
                    if (fragment.a(menu, menuinflater))
                    {
                        flag2 = true;
                        arraylist1 = arraylist;
                        if (arraylist == null)
                        {
                            arraylist1 = new ArrayList();
                        }
                        arraylist1.add(fragment);
                    }
                }
                i1++;
                flag1 = flag2;
                arraylist = arraylist1;
            } while (true);
        } else
        {
            flag2 = false;
        }
        if (j != null)
        {
            for (int j1 = ((flag) ? 1 : 0); j1 < j.size(); j1++)
            {
                menu = (Fragment)j.get(j1);
                if (arraylist1 == null || !arraylist1.contains(menu))
                {
                    Fragment.v();
                }
            }

        }
        j = arraylist1;
        return flag2;
    }

    public final boolean a(MenuItem menuitem)
    {
        boolean flag;
        boolean flag1;
        flag1 = false;
        flag = flag1;
        if (g == null) goto _L2; else goto _L1
_L1:
        int i1 = 0;
_L7:
        flag = flag1;
        if (i1 >= g.size()) goto _L2; else goto _L3
_L3:
        Fragment fragment = (Fragment)g.get(i1);
        if (fragment == null || !fragment.a(menuitem)) goto _L5; else goto _L4
_L4:
        flag = true;
_L2:
        return flag;
_L5:
        i1++;
        if (true) goto _L7; else goto _L6
_L6:
    }

    final boolean a(String s1, int i1, int j1)
    {
        if (i != null) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        if (i1 >= 0 || (j1 & 1) != 0) goto _L4; else goto _L3
_L3:
        if ((i1 = i.size() - 1) < 0) goto _L1; else goto _L5
_L5:
        ((b)i.remove(i1)).a(true);
_L8:
        t();
        return true;
_L4:
        int k1;
        int l1;
        k1 = -1;
        if (i1 < 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        l1 = i.size() - 1;
        do
        {
            if (l1 < 0)
            {
                break;
            }
            s1 = (b)i.get(l1);
            if (i1 >= 0 && i1 == ((b) (s1)).o)
            {
                break;
            }
            l1--;
        } while (true);
        if (l1 < 0) goto _L1; else goto _L6
_L6:
        k1 = l1;
        if ((j1 & 1) != 0)
        {
            j1 = l1 - 1;
            do
            {
                k1 = j1;
                if (j1 < 0)
                {
                    break;
                }
                s1 = (b)i.get(j1);
                k1 = j1;
                if (i1 < 0)
                {
                    break;
                }
                k1 = j1;
                if (i1 != ((b) (s1)).o)
                {
                    break;
                }
                j1--;
            } while (true);
        }
        if (k1 == i.size() - 1) goto _L1; else goto _L7
_L7:
        s1 = new ArrayList();
        for (i1 = i.size() - 1; i1 > k1; i1--)
        {
            s1.add(i.remove(i1));
        }

        j1 = s1.size() - 1;
        i1 = 0;
        while (i1 <= j1) 
        {
            if (a)
            {
                Log.v("FragmentManager", (new StringBuilder("Popping back stack state: ")).append(s1.get(i1)).toString());
            }
            b b1 = (b)s1.get(i1);
            boolean flag;
            if (i1 == j1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            b1.a(flag);
            i1++;
        }
          goto _L8
    }

    public final void b(int i1)
    {
        this;
        JVM INSTR monitorenter ;
        k.set(i1, null);
        if (l == null)
        {
            l = new ArrayList();
        }
        if (a)
        {
            Log.v("FragmentManager", (new StringBuilder("Freeing back stack index ")).append(i1).toString());
        }
        l.add(Integer.valueOf(i1));
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    final void b(Fragment fragment)
    {
        a(fragment, n, 0, 0, false);
    }

    public final void b(Fragment fragment, int i1, int j1)
    {
        if (a)
        {
            Log.v("FragmentManager", (new StringBuilder("hide: ")).append(fragment).toString());
        }
        if (!fragment.I)
        {
            fragment.I = true;
            if (fragment.R != null)
            {
                Animation animation = a(fragment, i1, false, j1);
                if (animation != null)
                {
                    fragment.R.startAnimation(animation);
                }
                fragment.R.setVisibility(8);
            }
            if (fragment.u && fragment.M && fragment.N)
            {
                r = true;
            }
            Fragment.n();
        }
    }

    final void b(b b1)
    {
        if (i == null)
        {
            i = new ArrayList();
        }
        i.add(b1);
        t();
    }

    public final void b(Menu menu)
    {
        if (g != null)
        {
            for (int i1 = 0; i1 < g.size(); i1++)
            {
                Fragment fragment = (Fragment)g.get(i1);
                if (fragment != null)
                {
                    fragment.b(menu);
                }
            }

        }
    }

    public final boolean b()
    {
        return d();
    }

    public final boolean b(MenuItem menuitem)
    {
        boolean flag;
        boolean flag1;
        flag1 = false;
        flag = flag1;
        if (g == null) goto _L2; else goto _L1
_L1:
        int i1 = 0;
_L7:
        flag = flag1;
        if (i1 >= g.size()) goto _L2; else goto _L3
_L3:
        Fragment fragment = (Fragment)g.get(i1);
        if (fragment == null || !fragment.b(menuitem)) goto _L5; else goto _L4
_L4:
        flag = true;
_L2:
        return flag;
_L5:
        i1++;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public final void c(Fragment fragment, int i1, int j1)
    {
        if (a)
        {
            Log.v("FragmentManager", (new StringBuilder("show: ")).append(fragment).toString());
        }
        if (fragment.I)
        {
            fragment.I = false;
            if (fragment.R != null)
            {
                Animation animation = a(fragment, i1, true, j1);
                if (animation != null)
                {
                    fragment.R.startAnimation(animation);
                }
                fragment.R.setVisibility(0);
            }
            if (fragment.u && fragment.M && fragment.N)
            {
                r = true;
            }
            Fragment.n();
        }
    }

    public final boolean c()
    {
        s();
        d();
        Handler handler = o.a;
        return a(((String) (null)), -1, 0);
    }

    public final void d(Fragment fragment, int i1, int j1)
    {
        if (a)
        {
            Log.v("FragmentManager", (new StringBuilder("detach: ")).append(fragment).toString());
        }
        if (!fragment.J)
        {
            fragment.J = true;
            if (fragment.u)
            {
                if (g != null)
                {
                    if (a)
                    {
                        Log.v("FragmentManager", (new StringBuilder("remove from detach: ")).append(fragment).toString());
                    }
                    g.remove(fragment);
                }
                if (fragment.M && fragment.N)
                {
                    r = true;
                }
                fragment.u = false;
                a(fragment, 1, i1, j1, false);
            }
        }
    }

    public final boolean d()
    {
        if (e)
        {
            throw new IllegalStateException("Recursive entry to executePendingTransactions");
        }
        if (Looper.myLooper() != o.a.getLooper())
        {
            throw new IllegalStateException("Must be called from main thread of process");
        }
        boolean flag = false;
_L2:
        this;
        JVM INSTR monitorenter ;
        if (c != null && c.size() != 0)
        {
            break MISSING_BLOCK_LABEL_141;
        }
        this;
        JVM INSTR monitorexit ;
        int k1;
        if (!v)
        {
            break MISSING_BLOCK_LABEL_274;
        }
        int i1 = 0;
        int l1;
        for (k1 = 0; i1 < f.size(); k1 = l1)
        {
            Fragment fragment = (Fragment)f.get(i1);
            l1 = k1;
            if (fragment != null)
            {
                l1 = k1;
                if (fragment.V != null)
                {
                    l1 = k1 | fragment.V.a();
                }
            }
            i1++;
        }

        break; /* Loop/switch isn't completed */
        k1 = c.size();
        if (d == null || d.length < k1)
        {
            d = new Runnable[k1];
        }
        c.toArray(d);
        c.clear();
        o.a.removeCallbacks(y);
        this;
        JVM INSTR monitorexit ;
        e = true;
        for (int j1 = 0; j1 < k1; j1++)
        {
            d[j1].run();
            d[j1] = null;
        }

        break MISSING_BLOCK_LABEL_250;
        Exception exception;
        exception;
        throw exception;
        e = false;
        flag = true;
        if (true) goto _L2; else goto _L1
_L1:
        if (k1 == 0)
        {
            v = false;
            r();
        }
        return flag;
    }

    final ArrayList e()
    {
        ArrayList arraylist1 = null;
        ArrayList arraylist = null;
        if (f != null)
        {
            int i1 = 0;
            do
            {
                arraylist1 = arraylist;
                if (i1 >= f.size())
                {
                    break;
                }
                Fragment fragment = (Fragment)f.get(i1);
                ArrayList arraylist2 = arraylist;
                if (fragment != null)
                {
                    arraylist2 = arraylist;
                    if (fragment.K)
                    {
                        arraylist1 = arraylist;
                        if (arraylist == null)
                        {
                            arraylist1 = new ArrayList();
                        }
                        arraylist1.add(fragment);
                        fragment.L = true;
                        int j1;
                        if (fragment.r != null)
                        {
                            j1 = fragment.r.o;
                        } else
                        {
                            j1 = -1;
                        }
                        fragment.s = j1;
                        arraylist2 = arraylist1;
                        if (a)
                        {
                            Log.v("FragmentManager", (new StringBuilder("retainNonConfig: keeping retained ")).append(fragment).toString());
                            arraylist2 = arraylist1;
                        }
                    }
                }
                i1++;
                arraylist = arraylist2;
            } while (true);
        }
        return arraylist1;
    }

    public final void e(Fragment fragment, int i1, int j1)
    {
        if (a)
        {
            Log.v("FragmentManager", (new StringBuilder("attach: ")).append(fragment).toString());
        }
        if (fragment.J)
        {
            fragment.J = false;
            if (!fragment.u)
            {
                if (g == null)
                {
                    g = new ArrayList();
                }
                if (g.contains(fragment))
                {
                    throw new IllegalStateException((new StringBuilder("Fragment already added: ")).append(fragment).toString());
                }
                if (a)
                {
                    Log.v("FragmentManager", (new StringBuilder("add from attach: ")).append(fragment).toString());
                }
                g.add(fragment);
                fragment.u = true;
                if (fragment.M && fragment.N)
                {
                    r = true;
                }
                a(fragment, n, i1, j1, false);
            }
        }
    }

    final Parcelable f()
    {
        FragmentManagerState fragmentmanagerstate;
        fragmentmanagerstate = null;
        d();
        if (b)
        {
            s = true;
        }
        if (f != null && f.size() > 0) goto _L2; else goto _L1
_L1:
        return null;
_L2:
        FragmentState afragmentstate[];
        int j2 = f.size();
        afragmentstate = new FragmentState[j2];
        int k1 = 0;
        boolean flag = false;
        while (k1 < j2) 
        {
            Fragment fragment = (Fragment)f.get(k1);
            if (fragment == null)
            {
                continue;
            }
            if (fragment.o < 0)
            {
                a(new IllegalStateException((new StringBuilder("Failure saving state: active ")).append(fragment).append(" has cleared index: ").append(fragment.o).toString()));
            }
            FragmentState fragmentstate = new FragmentState(fragment);
            afragmentstate[k1] = fragmentstate;
            if (fragment.j > 0 && fragmentstate.mSavedFragmentState == null)
            {
                fragmentstate.mSavedFragmentState = d(fragment);
                if (fragment.r != null)
                {
                    if (fragment.r.o < 0)
                    {
                        a(new IllegalStateException((new StringBuilder("Failure saving state: ")).append(fragment).append(" has target not in fragment manager: ").append(fragment.r).toString()));
                    }
                    if (fragmentstate.mSavedFragmentState == null)
                    {
                        fragmentstate.mSavedFragmentState = new Bundle();
                    }
                    Bundle bundle = fragmentstate.mSavedFragmentState;
                    Fragment fragment1 = fragment.r;
                    if (fragment1.o < 0)
                    {
                        a(new IllegalStateException((new StringBuilder("Fragment ")).append(fragment1).append(" is not currently in the FragmentManager").toString()));
                    }
                    bundle.putInt("android:target_state", fragment1.o);
                    if (fragment.t != 0)
                    {
                        fragmentstate.mSavedFragmentState.putInt("android:target_req_state", fragment.t);
                    }
                }
            } else
            {
                fragmentstate.mSavedFragmentState = fragment.m;
            }
            if (a)
            {
                Log.v("FragmentManager", (new StringBuilder("Saved state of ")).append(fragment).append(": ").append(fragmentstate.mSavedFragmentState).toString());
            }
            flag = true;
            k1++;
        }
        if (flag)
        {
            break; /* Loop/switch isn't completed */
        }
        if (a)
        {
            Log.v("FragmentManager", "saveAllState: no fragments!");
            return null;
        }
        if (true) goto _L1; else goto _L3
_L3:
        int ai[];
label0:
        {
            if (g != null)
            {
                int l1 = g.size();
                if (l1 > 0)
                {
                    int ai1[] = new int[l1];
                    int i1 = 0;
                    do
                    {
                        ai = ai1;
                        if (i1 >= l1)
                        {
                            break;
                        }
                        ai1[i1] = ((Fragment)g.get(i1)).o;
                        if (ai1[i1] < 0)
                        {
                            a(new IllegalStateException((new StringBuilder("Failure saving state: active ")).append(g.get(i1)).append(" has cleared index: ").append(ai1[i1]).toString()));
                        }
                        if (a)
                        {
                            Log.v("FragmentManager", (new StringBuilder("saveAllState: adding fragment #")).append(i1).append(": ").append(g.get(i1)).toString());
                        }
                        i1++;
                    } while (true);
                    break label0;
                }
            }
            ai = null;
        }
        BackStackState abackstackstate[] = fragmentmanagerstate;
        if (i != null)
        {
            int i2 = i.size();
            abackstackstate = fragmentmanagerstate;
            if (i2 > 0)
            {
                BackStackState abackstackstate1[] = new BackStackState[i2];
                int j1 = 0;
                do
                {
                    abackstackstate = abackstackstate1;
                    if (j1 >= i2)
                    {
                        break;
                    }
                    abackstackstate1[j1] = new BackStackState(this, (b)i.get(j1));
                    if (a)
                    {
                        Log.v("FragmentManager", (new StringBuilder("saveAllState: adding back stack #")).append(j1).append(": ").append(i.get(j1)).toString());
                    }
                    j1++;
                } while (true);
            }
        }
        abackstackstate1 = new FragmentManagerState();
        abackstackstate1.mActive = afragmentstate;
        abackstackstate1.mAdded = ai;
        abackstackstate1.mBackStack = abackstackstate;
        return abackstackstate1;
    }

    public final void g()
    {
        s = false;
    }

    public final void h()
    {
        s = false;
        a(1, false);
    }

    public final void i()
    {
        s = false;
        a(2, false);
    }

    public final void j()
    {
        s = false;
        a(4, false);
    }

    public final void k()
    {
        s = false;
        a(5, false);
    }

    public final void l()
    {
        a(4, false);
    }

    public final void m()
    {
        s = true;
        a(3, false);
    }

    public final void n()
    {
        a(2, false);
    }

    public final void o()
    {
        a(1, false);
    }

    public final void p()
    {
        t = true;
        d();
        a(0, false);
        o = null;
        p = null;
        q = null;
    }

    public final void q()
    {
        if (g != null)
        {
            for (int i1 = 0; i1 < g.size(); i1++)
            {
                Fragment fragment = (Fragment)g.get(i1);
                if (fragment != null)
                {
                    fragment.y();
                }
            }

        }
    }

    public final String toString()
    {
        StringBuilder stringbuilder = new StringBuilder(128);
        stringbuilder.append("FragmentManager{");
        stringbuilder.append(Integer.toHexString(System.identityHashCode(this)));
        stringbuilder.append(" in ");
        if (q != null)
        {
            android.support.v4.f.d.a(q, stringbuilder);
        } else
        {
            android.support.v4.f.d.a(o, stringbuilder);
        }
        stringbuilder.append("}}");
        return stringbuilder.toString();
    }

    static 
    {
        boolean flag = false;
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            flag = true;
        }
        b = flag;
    }
}
