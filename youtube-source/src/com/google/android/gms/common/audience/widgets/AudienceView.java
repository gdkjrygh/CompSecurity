// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.audience.widgets;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Pair;
import android.widget.FrameLayout;
import com.google.android.gms.common.e;
import com.google.android.gms.common.people.data.Audience;
import com.google.android.gms.internal.ej;
import com.google.android.gms.internal.ek;

// Referenced classes of package com.google.android.gms.common.audience.widgets:
//            a

public final class AudienceView extends FrameLayout
{

    private static Context a;
    private final Context b;
    private final ej c;

    public AudienceView(Context context)
    {
        this(context, null, 0);
    }

    public AudienceView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public AudienceView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        context = a(context);
        c = (ej)((Pair) (context)).first;
        b = (Context)((Pair) (context)).second;
    }

    private static Pair a(Context context)
    {
        if (a == null)
        {
            a = e.c(context);
        }
        if (a == null) goto _L2; else goto _L1
_L1:
        Object obj = a.getClassLoader();
        obj = new Pair(ek.a((IBinder)((ClassLoader) (obj)).loadClass("com.google.android.gms.plus.audience.widgets.AudienceViewImpl$DynamiteHost").newInstance()), a);
        return ((Pair) (obj));
        Object obj1;
        obj1;
_L4:
        if (Log.isLoggable("AudienceView", 3))
        {
            Log.d("AudienceView", "Can't load com.google.android.gms.plus.audience.widgets.AudienceViewImpl$DynamiteHost", ((Throwable) (obj1)));
        }
_L2:
        return new Pair(new a((byte)0), context);
        obj1;
        continue; /* Loop/switch isn't completed */
        obj1;
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected final void onRestoreInstanceState(Parcelable parcelable)
    {
        parcelable = (Bundle)parcelable;
        super.onRestoreInstanceState(parcelable.getParcelable("parent"));
        try
        {
            c.a(parcelable.getBundle("impl"));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Parcelable parcelable)
        {
            return;
        }
    }

    protected final Parcelable onSaveInstanceState()
    {
        Bundle bundle = new Bundle();
        bundle.putParcelable("parent", super.onSaveInstanceState());
        try
        {
            bundle.putBundle("impl", c.b());
        }
        catch (RemoteException remoteexception)
        {
            return bundle;
        }
        return bundle;
    }

    public final void setAudience(Audience audience)
    {
        try
        {
            c.a(audience);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Audience audience)
        {
            return;
        }
    }

    public final void setEditMode(int i)
    {
        try
        {
            c.a(i);
            return;
        }
        catch (RemoteException remoteexception)
        {
            return;
        }
    }

    public final void setShowEmptyText(boolean flag)
    {
        try
        {
            c.a(flag);
            return;
        }
        catch (RemoteException remoteexception)
        {
            return;
        }
    }
}
