// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.a.b;
import android.support.v7.c.a;
import android.util.TypedValue;
import android.view.View;

// Referenced classes of package android.support.v7.app:
//            t, u

public class al extends Dialog
    implements t
{

    private u a;

    public al(Context context, int i)
    {
        super(context, a(context, i));
        a().a(null);
    }

    private static int a(Context context, int i)
    {
        int j = i;
        if (i == 0)
        {
            TypedValue typedvalue = new TypedValue();
            context.getTheme().resolveAttribute(b.dialogTheme, typedvalue, true);
            j = typedvalue.resourceId;
        }
        return j;
    }

    public u a()
    {
        if (a == null)
        {
            a = android.support.v7.app.u.a(this, this);
        }
        return a;
    }

    public boolean a(int i)
    {
        return a().b(i);
    }

    public void addContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
        a().b(view, layoutparams);
    }

    public void invalidateOptionsMenu()
    {
        a().e();
    }

    protected void onCreate(Bundle bundle)
    {
        a().h();
        super.onCreate(bundle);
        a().a(bundle);
    }

    protected void onStop()
    {
        super.onStop();
        a().c();
    }

    public void onSupportActionModeFinished(a a1)
    {
    }

    public void onSupportActionModeStarted(a a1)
    {
    }

    public a onWindowStartingSupportActionMode(android.support.v7.c.b b1)
    {
        return null;
    }

    public void setContentView(int i)
    {
        a().a(i);
    }

    public void setContentView(View view)
    {
        a().a(view);
    }

    public void setContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
        a().a(view, layoutparams);
    }

    public void setTitle(int i)
    {
        super.setTitle(i);
        a().a(getContext().getString(i));
    }

    public void setTitle(CharSequence charsequence)
    {
        super.setTitle(charsequence);
        a().a(charsequence);
    }
}
