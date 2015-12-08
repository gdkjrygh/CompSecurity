// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.signin.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.q;
import com.google.android.gms.common.api.r;
import com.google.android.gms.common.internal.AuthAccountRequest;
import com.google.android.gms.common.internal.BinderWrapper;
import com.google.android.gms.common.internal.ResolveAccountRequest;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.common.internal.ae;
import com.google.android.gms.common.internal.ao;
import com.google.android.gms.common.internal.au;
import com.google.android.gms.common.internal.h;
import com.google.android.gms.common.internal.m;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.signin.f;
import com.google.android.gms.signin.g;
import java.util.Set;
import java.util.concurrent.ExecutorService;

// Referenced classes of package com.google.android.gms.signin.internal:
//            o, i, AuthAccountResult, f, 
//            j

public class n extends m
    implements f
{

    private final boolean d;
    private final h e;
    private final g f;
    private Integer g;
    private final ExecutorService h;

    public n(Context context, Looper looper, boolean flag, h h1, g g1, q q1, r r, 
            ExecutorService executorservice)
    {
        super(context, looper, 44, h1, q1, r);
        d = flag;
        e = h1;
        f = h1.i();
        g = h1.j();
        h = executorservice;
    }

    public static Bundle a(g g1, Integer integer, ExecutorService executorservice)
    {
        Bundle bundle = new Bundle();
        bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", g1.a());
        bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", g1.b());
        bundle.putString("com.google.android.gms.signin.internal.serverClientId", g1.c());
        if (g1.d() != null)
        {
            bundle.putParcelable("com.google.android.gms.signin.internal.signInCallbacks", new BinderWrapper((new o(g1, executorservice)).asBinder()));
        }
        if (integer != null)
        {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", integer.intValue());
        }
        return bundle;
    }

    protected IInterface a(IBinder ibinder)
    {
        return b(ibinder);
    }

    public void a(ae ae, Set set, com.google.android.gms.signin.internal.f f1)
    {
        au.a(f1, "Expecting a valid ISignInCallbacks");
        try
        {
            ((i)m()).a(new AuthAccountRequest(ae, set), f1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ae ae)
        {
            Log.w("SignInClientImpl", "Remote service probably died when authAccount is called");
        }
        try
        {
            f1.a(new ConnectionResult(8, null), new AuthAccountResult());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ae ae)
        {
            Log.wtf("SignInClientImpl", "ISignInCallbacks#onAuthAccount should be executed from the same process, unexpected RemoteException.");
        }
    }

    public void a(ae ae, boolean flag)
    {
        try
        {
            ((i)m()).a(ae, g.intValue(), flag);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ae ae)
        {
            Log.w("SignInClientImpl", "Remote service probably died when saveDefaultAccount is called");
        }
    }

    public void a(ao ao1)
    {
        au.a(ao1, "Expecting a valid IResolveAccountCallbacks");
        try
        {
            android.accounts.Account account = e.c();
            ((i)m()).a(new ResolveAccountRequest(account, g.intValue()), ao1);
            return;
        }
        catch (RemoteException remoteexception)
        {
            Log.w("SignInClientImpl", "Remote service probably died when resolveAccount is called");
        }
        try
        {
            ao1.a(new ResolveAccountResponse(8));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ao ao1)
        {
            Log.wtf("SignInClientImpl", "IResolveAccountCallbacks#onAccountResolutionComplete should be executed from the same process, unexpected RemoteException.");
        }
    }

    protected i b(IBinder ibinder)
    {
        return j.a(ibinder);
    }

    public boolean c()
    {
        return d;
    }

    protected String d()
    {
        return "com.google.android.gms.signin.service.START";
    }

    protected String e()
    {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    protected Bundle k()
    {
        Bundle bundle = a(f, e.j(), h);
        String s1 = e.g();
        if (!i().getPackageName().equals(s1))
        {
            bundle.putString("com.google.android.gms.signin.internal.realClientPackageName", e.g());
        }
        return bundle;
    }

    public void p()
    {
        try
        {
            ((i)m()).a(g.intValue());
            return;
        }
        catch (RemoteException remoteexception)
        {
            Log.w("SignInClientImpl", "Remote service probably died when clearAccountFromSessionStore is called");
        }
    }

    public void q()
    {
        a(new s(this));
    }
}
