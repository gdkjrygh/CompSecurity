// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.a.b;
import android.util.TypedValue;
import android.view.KeyEvent;

// Referenced classes of package android.support.v7.app:
//            al, h

public class r extends al
    implements DialogInterface
{

    private h a;

    r(Context context, int i, boolean flag)
    {
        super(context, a(context, i));
        a = new h(getContext(), this, getWindow());
    }

    static int a(Context context, int i)
    {
        if (i >= 0x1000000)
        {
            return i;
        } else
        {
            TypedValue typedvalue = new TypedValue();
            context.getTheme().resolveAttribute(b.alertDialogTheme, typedvalue, true);
            return typedvalue.resourceId;
        }
    }

    static h a(r r1)
    {
        return r1.a;
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        a.a();
    }

    public boolean onKeyDown(int i, KeyEvent keyevent)
    {
        if (a.a(i, keyevent))
        {
            return true;
        } else
        {
            return super.onKeyDown(i, keyevent);
        }
    }

    public boolean onKeyUp(int i, KeyEvent keyevent)
    {
        if (a.b(i, keyevent))
        {
            return true;
        } else
        {
            return super.onKeyUp(i, keyevent);
        }
    }

    public void setTitle(CharSequence charsequence)
    {
        super.setTitle(charsequence);
        a.a(charsequence);
    }
}
