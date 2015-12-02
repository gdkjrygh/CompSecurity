// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import com.ubercab.client.core.app.RiderActivity;
import com.ubercab.client.core.app.RiderApplication;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public abstract class cyz extends gkv
    implements czh
{

    public static final cic e = new cic() {

        public final String name()
        {
            return "";
        }

    };
    private final Set a = new HashSet();
    private czh b;
    private czj c;
    Collection f;

    public cyz()
    {
    }

    public static Bundle b(int i)
    {
        Bundle bundle = new Bundle();
        bundle.putInt("dialog.request_code", i);
        return bundle;
    }

    private static Collection d()
    {
        return Collections.emptySet();
    }

    public abstract cic a();

    public abstract czj a(dfp dfp);

    public abstract void a(czj czj);

    public final RiderActivity b()
    {
        return (RiderActivity)getActivity();
    }

    public final czj c()
    {
        return a(((RiderApplication)getActivity().getApplication()).b());
    }

    public final void c(int i)
    {
        RiderActivity rideractivity = (RiderActivity)getActivity();
        if (rideractivity != null)
        {
            Bundle bundle = getArguments();
            if (bundle != null)
            {
                rideractivity.a(bundle.getInt("dialog.request_code"), i, bundle);
            }
        }
    }

    public void onActivityCreated(Bundle bundle)
    {
        if (getShowsDialog() && getDialog() == null)
        {
            setShowsDialog(false);
        }
        super.onActivityCreated(bundle);
    }

    public void onCancel(DialogInterface dialoginterface)
    {
        super.onCancel(dialoginterface);
        for (dialoginterface = a.iterator(); dialoginterface.hasNext(); dialoginterface.next()) { }
    }

    public void onCreate(Bundle bundle)
    {
        if (b == null)
        {
            c = a(((RiderApplication)getActivity().getApplication()).b());
            a(c);
        } else
        {
            c = b.c();
            b.a(c);
        }
        super.onCreate(bundle);
        a.addAll(f);
        a.addAll(d());
        for (bundle = a.iterator(); bundle.hasNext(); bundle.next()) { }
    }

    public void onDestroy()
    {
        super.onDestroy();
        for (Iterator iterator = a.iterator(); iterator.hasNext(); iterator.next()) { }
    }

    public void onPause()
    {
        super.onPause();
        for (Iterator iterator = a.iterator(); iterator.hasNext(); ((czv)iterator.next()).b()) { }
    }

    public final void onRequestPermissionsResult(int i, String as[], int ai[])
    {
    }

    public void onResume()
    {
        super.onResume();
        for (Iterator iterator = a.iterator(); iterator.hasNext(); ((czv)iterator.next()).a()) { }
    }

}
