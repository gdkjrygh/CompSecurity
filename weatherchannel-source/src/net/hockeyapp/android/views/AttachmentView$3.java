// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.hockeyapp.android.views;

import android.content.Context;
import android.content.Intent;
import android.view.View;

// Referenced classes of package net.hockeyapp.android.views:
//            AttachmentView

class val.openOnClick
    implements android.view.ner
{

    final AttachmentView this$0;
    final boolean val$openOnClick;

    public void onClick(View view)
    {
        if (!val$openOnClick)
        {
            return;
        } else
        {
            view = new Intent();
            view.setAction("android.intent.action.VIEW");
            view.setDataAndType(AttachmentView.access$300(AttachmentView.this), "image/*");
            AttachmentView.access$400(AttachmentView.this).startActivity(view);
            return;
        }
    }

    ()
    {
        this$0 = final_attachmentview;
        val$openOnClick = Z.this;
        super();
    }
}
