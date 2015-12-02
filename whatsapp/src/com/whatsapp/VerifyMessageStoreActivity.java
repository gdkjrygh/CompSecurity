// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.app.Dialog;

// Referenced classes of package com.whatsapp:
//            UserFeedbackActivity, v6, vj

public class VerifyMessageStoreActivity extends UserFeedbackActivity
{

    private vj j;

    public VerifyMessageStoreActivity()
    {
        j = new v6(this, this);
    }

    protected void a(boolean flag)
    {
        j.b(flag);
    }

    protected void b()
    {
    }

    protected void b(boolean flag)
    {
        j.a(flag, true);
    }

    protected void d()
    {
    }

    protected void e()
    {
        j.b();
    }

    protected Dialog onCreateDialog(int i)
    {
        Dialog dialog = j.a(i);
        if (dialog != null)
        {
            return dialog;
        } else
        {
            return super.onCreateDialog(i);
        }
    }
}
