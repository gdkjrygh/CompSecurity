// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.uservoice.uservoicesdk.ui;

import android.content.Context;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import com.squareup.otto.Bus;
import com.uservoice.uservoicesdk.babayaga.Babayaga;
import com.uservoice.uservoicesdk.model.Ticket;
import com.uservoice.uservoicesdk.rest.RestResult;
import com.walmart.android.service.MessageBus;

// Referenced classes of package com.uservoice.uservoicesdk.ui:
//            DefaultCallback, ContactAdapter

class init> extends DefaultCallback
{

    final ContactAdapter this$0;
    final Button val$button;

    public void onError(RestResult restresult)
    {
        super.onError(restresult);
        val$button.setEnabled(true);
    }

    public void onModel(Ticket ticket)
    {
        Babayaga.track(com.uservoice.uservoicesdk.babayaga.BMIT_TICKET);
        Toast.makeText(context, com.uservoice.uservoicesdk.icket_created, 0).show();
        com.walmartlabs.anivia..Builder builder = new com.walmartlabs.anivia..Builder("feedbackSubmit");
        if (TextUtils.isEmpty(emailField.getText().toString()))
        {
            ticket = "no";
        } else
        {
            ticket = "yes";
        }
        builder = builder.putString("emailPresent", ticket);
        if (TextUtils.isEmpty(nameField.getText().toString()))
        {
            ticket = "no";
        } else
        {
            ticket = "yes";
        }
        ticket = builder.putString("namePresent", ticket).putString("issueType", ContactAdapter.access$100(ContactAdapter.this)).putString("section", "user feedback");
        MessageBus.getBus().post(ticket);
        context.finish();
        context.overridePendingTransition(0, com.uservoice.uservoicesdk.ut_down);
    }

    public volatile void onModel(Object obj)
    {
        onModel((Ticket)obj);
    }

    r(Button button1)
    {
        this$0 = final_contactadapter;
        val$button = button1;
        super(Context.this);
    }
}
