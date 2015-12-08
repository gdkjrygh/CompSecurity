// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.f.d;
import android.support.v4.f.m;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import java.io.FileDescriptor;
import java.io.PrintWriter;

// Referenced classes of package android.support.v4.app:
//            m, SuperNotCalledException, FragmentActivity, aa, 
//            e, l

public class Fragment
    implements ComponentCallbacks, android.view.View.OnCreateContextMenuListener
{

    private static final m a = new m();
    int A;
    android.support.v4.app.m B;
    FragmentActivity C;
    android.support.v4.app.m D;
    Fragment E;
    int F;
    int G;
    String H;
    boolean I;
    boolean J;
    boolean K;
    boolean L;
    boolean M;
    boolean N;
    boolean O;
    int P;
    ViewGroup Q;
    View R;
    View S;
    boolean T;
    boolean U;
    aa V;
    boolean W;
    boolean X;
    int j;
    View k;
    int l;
    Bundle m;
    SparseArray n;
    int o;
    String p;
    Bundle q;
    Fragment r;
    int s;
    int t;
    boolean u;
    boolean v;
    boolean w;
    boolean x;
    boolean y;
    boolean z;

    public Fragment()
    {
        j = 0;
        o = -1;
        s = -1;
        N = true;
        U = true;
    }

    public static Fragment a(Context context, String s1)
    {
        return a(context, s1, null);
    }

    public static Fragment a(Context context, String s1, Bundle bundle)
    {
        Class class1;
        Class class2;
        try
        {
            class2 = (Class)a.get(s1);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new InstantiationException((new StringBuilder("Unable to instantiate fragment ")).append(s1).append(": make sure class name exists, is public, and has an empty constructor that is public").toString(), context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new InstantiationException((new StringBuilder("Unable to instantiate fragment ")).append(s1).append(": make sure class name exists, is public, and has an empty constructor that is public").toString(), context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new InstantiationException((new StringBuilder("Unable to instantiate fragment ")).append(s1).append(": make sure class name exists, is public, and has an empty constructor that is public").toString(), context);
        }
        class1 = class2;
        if (class2 != null)
        {
            break MISSING_BLOCK_LABEL_38;
        }
        class1 = context.getClassLoader().loadClass(s1);
        a.put(s1, class1);
        context = (Fragment)class1.newInstance();
        if (bundle == null)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        bundle.setClassLoader(context.getClass().getClassLoader());
        context.q = bundle;
        return context;
    }

    static boolean b(Context context, String s1)
    {
        Class class1;
        Class class2;
        boolean flag;
        try
        {
            class2 = (Class)a.get(s1);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return false;
        }
        class1 = class2;
        if (class2 != null)
        {
            break MISSING_BLOCK_LABEL_35;
        }
        class1 = context.getClassLoader().loadClass(s1);
        a.put(s1, class1);
        flag = android/support/v4/app/Fragment.isAssignableFrom(class1);
        return flag;
    }

    public static void n()
    {
    }

    public static void o()
    {
    }

    public static Animation p()
    {
        return null;
    }

    public static void v()
    {
    }

    final void A()
    {
        if (D != null)
        {
            D.m();
        }
        O = false;
        e();
        if (!O)
        {
            throw new SuperNotCalledException((new StringBuilder("Fragment ")).append(this).append(" did not call through to super.onStop()").toString());
        } else
        {
            return;
        }
    }

    final void B()
    {
label0:
        {
            if (D != null)
            {
                D.n();
            }
            if (W)
            {
                W = false;
                if (!X)
                {
                    X = true;
                    V = C.a(p, W, false);
                }
                if (V != null)
                {
                    if (C.h)
                    {
                        break label0;
                    }
                    V.c();
                }
            }
            return;
        }
        V.d();
    }

    final void C()
    {
        if (D != null)
        {
            D.o();
        }
        O = false;
        f();
        if (!O)
        {
            throw new SuperNotCalledException((new StringBuilder("Fragment ")).append(this).append(" did not call through to super.onDestroyView()").toString());
        }
        if (V != null)
        {
            V.f();
        }
    }

    final void D()
    {
        if (D != null)
        {
            D.p();
        }
        O = false;
        t();
        if (!O)
        {
            throw new SuperNotCalledException((new StringBuilder("Fragment ")).append(this).append(" did not call through to super.onDestroy()").toString());
        } else
        {
            return;
        }
    }

    public View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return null;
    }

    public final String a(int i1)
    {
        return j().getString(i1);
    }

    public final transient String a(int i1, Object aobj[])
    {
        return j().getString(i1, aobj);
    }

    final void a(int i1, Fragment fragment)
    {
        o = i1;
        if (fragment != null)
        {
            p = (new StringBuilder()).append(fragment.p).append(":").append(o).toString();
            return;
        } else
        {
            p = (new StringBuilder("android:fragment:")).append(o).toString();
            return;
        }
    }

    public void a(Activity activity)
    {
        O = true;
    }

    public void a(Activity activity, AttributeSet attributeset, Bundle bundle)
    {
        O = true;
    }

    public final void a(Intent intent)
    {
        if (C == null)
        {
            throw new IllegalStateException((new StringBuilder("Fragment ")).append(this).append(" not attached to Activity").toString());
        } else
        {
            C.a(this, intent, -1);
            return;
        }
    }

    final void a(Configuration configuration)
    {
        onConfigurationChanged(configuration);
        if (D != null)
        {
            D.a(configuration);
        }
    }

    public void a(Bundle bundle)
    {
        O = true;
    }

    public final void a(SavedState savedstate)
    {
        if (o >= 0)
        {
            throw new IllegalStateException("Fragment already active");
        }
        if (savedstate != null && savedstate.mState != null)
        {
            savedstate = savedstate.mState;
        } else
        {
            savedstate = null;
        }
        m = savedstate;
    }

    public void a(View view, Bundle bundle)
    {
    }

    public final void a(String s1, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
    {
        printwriter.print(s1);
        printwriter.print("mFragmentId=#");
        printwriter.print(Integer.toHexString(F));
        printwriter.print(" mContainerId=#");
        printwriter.print(Integer.toHexString(G));
        printwriter.print(" mTag=");
        printwriter.println(H);
        printwriter.print(s1);
        printwriter.print("mState=");
        printwriter.print(j);
        printwriter.print(" mIndex=");
        printwriter.print(o);
        printwriter.print(" mWho=");
        printwriter.print(p);
        printwriter.print(" mBackStackNesting=");
        printwriter.println(A);
        printwriter.print(s1);
        printwriter.print("mAdded=");
        printwriter.print(u);
        printwriter.print(" mRemoving=");
        printwriter.print(v);
        printwriter.print(" mResumed=");
        printwriter.print(w);
        printwriter.print(" mFromLayout=");
        printwriter.print(x);
        printwriter.print(" mInLayout=");
        printwriter.println(y);
        printwriter.print(s1);
        printwriter.print("mHidden=");
        printwriter.print(I);
        printwriter.print(" mDetached=");
        printwriter.print(J);
        printwriter.print(" mMenuVisible=");
        printwriter.print(N);
        printwriter.print(" mHasMenu=");
        printwriter.println(M);
        printwriter.print(s1);
        printwriter.print("mRetainInstance=");
        printwriter.print(K);
        printwriter.print(" mRetaining=");
        printwriter.print(L);
        printwriter.print(" mUserVisibleHint=");
        printwriter.println(U);
        if (B != null)
        {
            printwriter.print(s1);
            printwriter.print("mFragmentManager=");
            printwriter.println(B);
        }
        if (C != null)
        {
            printwriter.print(s1);
            printwriter.print("mActivity=");
            printwriter.println(C);
        }
        if (E != null)
        {
            printwriter.print(s1);
            printwriter.print("mParentFragment=");
            printwriter.println(E);
        }
        if (q != null)
        {
            printwriter.print(s1);
            printwriter.print("mArguments=");
            printwriter.println(q);
        }
        if (m != null)
        {
            printwriter.print(s1);
            printwriter.print("mSavedFragmentState=");
            printwriter.println(m);
        }
        if (n != null)
        {
            printwriter.print(s1);
            printwriter.print("mSavedViewState=");
            printwriter.println(n);
        }
        if (r != null)
        {
            printwriter.print(s1);
            printwriter.print("mTarget=");
            printwriter.print(r);
            printwriter.print(" mTargetRequestCode=");
            printwriter.println(t);
        }
        if (P != 0)
        {
            printwriter.print(s1);
            printwriter.print("mNextAnim=");
            printwriter.println(P);
        }
        if (Q != null)
        {
            printwriter.print(s1);
            printwriter.print("mContainer=");
            printwriter.println(Q);
        }
        if (R != null)
        {
            printwriter.print(s1);
            printwriter.print("mView=");
            printwriter.println(R);
        }
        if (S != null)
        {
            printwriter.print(s1);
            printwriter.print("mInnerView=");
            printwriter.println(R);
        }
        if (k != null)
        {
            printwriter.print(s1);
            printwriter.print("mAnimatingAway=");
            printwriter.println(k);
            printwriter.print(s1);
            printwriter.print("mStateAfterAnimating=");
            printwriter.println(l);
        }
        if (V != null)
        {
            printwriter.print(s1);
            printwriter.println("Loader Manager:");
            V.a((new StringBuilder()).append(s1).append("  ").toString(), filedescriptor, printwriter, as);
        }
        if (D != null)
        {
            printwriter.print(s1);
            printwriter.println((new StringBuilder("Child ")).append(D).append(":").toString());
            D.a((new StringBuilder()).append(s1).append("  ").toString(), filedescriptor, printwriter, as);
        }
    }

    final boolean a(Menu menu)
    {
        boolean flag1 = false;
        boolean flag2 = false;
        if (!I)
        {
            boolean flag = flag2;
            if (M)
            {
                flag = flag2;
                if (N)
                {
                    flag = true;
                }
            }
            flag1 = flag;
            if (D != null)
            {
                flag1 = flag | D.a(menu);
            }
        }
        return flag1;
    }

    final boolean a(Menu menu, MenuInflater menuinflater)
    {
        boolean flag1 = false;
        boolean flag2 = false;
        if (!I)
        {
            boolean flag = flag2;
            if (M)
            {
                flag = flag2;
                if (N)
                {
                    flag = true;
                }
            }
            flag1 = flag;
            if (D != null)
            {
                flag1 = flag | D.a(menu, menuinflater);
            }
        }
        return flag1;
    }

    final boolean a(MenuItem menuitem)
    {
        if (!I)
        {
            boolean flag;
            if (M)
            {
                flag = N;
            }
            if (D != null && D.a(menuitem))
            {
                return true;
            }
        }
        return false;
    }

    public LayoutInflater b(Bundle bundle)
    {
        return C.getLayoutInflater();
    }

    final View b(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        if (D != null)
        {
            D.g();
        }
        return a(layoutinflater, viewgroup, bundle);
    }

    final void b(Menu menu)
    {
        if (!I)
        {
            boolean flag;
            if (M)
            {
                flag = N;
            }
            if (D != null)
            {
                D.b(menu);
            }
        }
    }

    final boolean b(MenuItem menuitem)
    {
        return !I && D != null && D.b(menuitem);
    }

    public void c()
    {
        O = true;
    }

    public void d()
    {
        O = true;
        if (!W)
        {
            W = true;
            if (!X)
            {
                X = true;
                V = C.a(p, W, false);
            }
            if (V != null)
            {
                V.b();
            }
        }
    }

    public void d(Bundle bundle)
    {
        O = true;
    }

    public void e()
    {
        O = true;
    }

    public void e(Bundle bundle)
    {
    }

    public final boolean equals(Object obj)
    {
        return super.equals(obj);
    }

    public void f()
    {
        O = true;
    }

    final void f(Bundle bundle)
    {
        if (n != null)
        {
            S.restoreHierarchyState(n);
            n = null;
        }
        O = false;
        O = true;
        if (!O)
        {
            throw new SuperNotCalledException((new StringBuilder("Fragment ")).append(this).append(" did not call through to super.onViewStateRestored()").toString());
        } else
        {
            return;
        }
    }

    public void g(Bundle bundle)
    {
        if (o >= 0)
        {
            throw new IllegalStateException("Fragment already active");
        } else
        {
            q = bundle;
            return;
        }
    }

    final boolean g()
    {
        return A > 0;
    }

    public final Bundle h()
    {
        return q;
    }

    final void h(Bundle bundle)
    {
        if (D != null)
        {
            D.g();
        }
        O = false;
        a(bundle);
        if (!O)
        {
            throw new SuperNotCalledException((new StringBuilder("Fragment ")).append(this).append(" did not call through to super.onCreate()").toString());
        }
        if (bundle != null)
        {
            bundle = bundle.getParcelable("android:support:fragments");
            if (bundle != null)
            {
                if (D == null)
                {
                    D = new android.support.v4.app.m();
                    D.a(C, new e(this), this);
                }
                D.a(bundle, null);
                D.h();
            }
        }
    }

    public final int hashCode()
    {
        return super.hashCode();
    }

    public final FragmentActivity i()
    {
        return C;
    }

    final void i(Bundle bundle)
    {
        if (D != null)
        {
            D.g();
        }
        O = false;
        d(bundle);
        if (!O)
        {
            throw new SuperNotCalledException((new StringBuilder("Fragment ")).append(this).append(" did not call through to super.onActivityCreated()").toString());
        }
        if (D != null)
        {
            D.i();
        }
    }

    public final Resources j()
    {
        if (C == null)
        {
            throw new IllegalStateException((new StringBuilder("Fragment ")).append(this).append(" not attached to Activity").toString());
        } else
        {
            return C.getResources();
        }
    }

    final void j(Bundle bundle)
    {
        e(bundle);
        if (D != null)
        {
            Parcelable parcelable = D.f();
            if (parcelable != null)
            {
                bundle.putParcelable("android:support:fragments", parcelable);
            }
        }
    }

    public final l k()
    {
        return B;
    }

    public final boolean l()
    {
        return J;
    }

    public final boolean m()
    {
        return w;
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        O = true;
    }

    public void onCreateContextMenu(ContextMenu contextmenu, View view, android.view.ContextMenu.ContextMenuInfo contextmenuinfo)
    {
        C.onCreateContextMenu(contextmenu, view, contextmenuinfo);
    }

    public void onLowMemory()
    {
        O = true;
    }

    public final View q()
    {
        return R;
    }

    public void r()
    {
        O = true;
    }

    public void s()
    {
        O = true;
    }

    public void t()
    {
        O = true;
        if (!X)
        {
            X = true;
            V = C.a(p, W, false);
        }
        if (V != null)
        {
            V.h();
        }
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder(128);
        android.support.v4.f.d.a(this, stringbuilder);
        if (o >= 0)
        {
            stringbuilder.append(" #");
            stringbuilder.append(o);
        }
        if (F != 0)
        {
            stringbuilder.append(" id=0x");
            stringbuilder.append(Integer.toHexString(F));
        }
        if (H != null)
        {
            stringbuilder.append(" ");
            stringbuilder.append(H);
        }
        stringbuilder.append('}');
        return stringbuilder.toString();
    }

    final void u()
    {
        o = -1;
        p = null;
        u = false;
        v = false;
        w = false;
        x = false;
        y = false;
        z = false;
        A = 0;
        B = null;
        C = null;
        F = 0;
        G = 0;
        H = null;
        I = false;
        J = false;
        L = false;
        V = null;
        W = false;
        X = false;
    }

    final void w()
    {
        if (D != null)
        {
            D.g();
            D.d();
        }
        O = false;
        d();
        if (!O)
        {
            throw new SuperNotCalledException((new StringBuilder("Fragment ")).append(this).append(" did not call through to super.onStart()").toString());
        }
        if (D != null)
        {
            D.j();
        }
        if (V != null)
        {
            V.g();
        }
    }

    final void x()
    {
        if (D != null)
        {
            D.g();
            D.d();
        }
        O = false;
        r();
        if (!O)
        {
            throw new SuperNotCalledException((new StringBuilder("Fragment ")).append(this).append(" did not call through to super.onResume()").toString());
        }
        if (D != null)
        {
            D.k();
            D.d();
        }
    }

    final void y()
    {
        onLowMemory();
        if (D != null)
        {
            D.q();
        }
    }

    final void z()
    {
        if (D != null)
        {
            D.l();
        }
        O = false;
        s();
        if (!O)
        {
            throw new SuperNotCalledException((new StringBuilder("Fragment ")).append(this).append(" did not call through to super.onPause()").toString());
        } else
        {
            return;
        }
    }


    private class InstantiationException extends RuntimeException
    {

        public InstantiationException(String s1, Exception exception)
        {
            super(s1, exception);
        }
    }


    private class SavedState
        implements Parcelable
    {

        public static final android.os.Parcelable.Creator CREATOR = new f();
        final Bundle mState;

        public int describeContents()
        {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i1)
        {
            parcel.writeBundle(mState);
        }


        SavedState(Bundle bundle)
        {
            mState = bundle;
        }

        SavedState(Parcel parcel, ClassLoader classloader)
        {
            mState = parcel.readBundle();
            if (classloader != null && mState != null)
            {
                mState.setClassLoader(classloader);
            }
        }
    }

}
