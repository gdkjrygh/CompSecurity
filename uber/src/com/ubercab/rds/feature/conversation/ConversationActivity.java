// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rds.feature.conversation;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.text.TextUtils;
import com.ubercab.rds.core.app.RdsMvcActivity;
import gpz;
import hbo;
import hct;

public class ConversationActivity extends RdsMvcActivity
{

    public ConversationActivity()
    {
    }

    public static Intent a(Context context, String s, String s1)
    {
        return (new Intent(context, com/ubercab/rds/feature/conversation/ConversationActivity)).putExtra("com.ubercab.rds.CONTACT_UUID", s).putExtra("com.ubercab.rds.FLOW_NODE_NAME", s1);
    }

    private String a(String s)
    {
        if (!TextUtils.isEmpty(s))
        {
            return s;
        } else
        {
            return getString(hbo.ub__rds__conversation);
        }
    }

    protected final gpz c()
    {
        ActionBar actionbar = b();
        actionbar.b(true);
        actionbar.a(a(getIntent().getStringExtra("com.ubercab.rds.FLOW_NODE_NAME")));
        return new hct(this, getIntent().getStringExtra("com.ubercab.rds.CONTACT_UUID"));
    }
}
