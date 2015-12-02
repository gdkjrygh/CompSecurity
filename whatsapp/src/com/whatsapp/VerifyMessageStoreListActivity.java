// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.app.Dialog;

// Referenced classes of package com.whatsapp:
//            DialogToastListActivity, vy, vj

public class VerifyMessageStoreListActivity extends DialogToastListActivity
{

    private vj i;

    public VerifyMessageStoreListActivity()
    {
        i = new vy(this, this);
    }

    protected void a()
    {
    }

    protected void b()
    {
    }

    protected Dialog onCreateDialog(int j)
    {
        Dialog dialog = i.a(j);
        if (dialog != null)
        {
            return dialog;
        } else
        {
            return super.onCreateDialog(j);
        }
    }
}
