// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.uservoice.uservoicesdk.dialog;

import android.content.DialogInterface;
import android.support.v4.app.FragmentActivity;
import com.uservoice.uservoicesdk.activity.InstantAnswersActivity;
import com.uservoice.uservoicesdk.babayaga.Babayaga;
import com.uservoice.uservoicesdk.deflection.Deflection;
import com.uservoice.uservoicesdk.model.Article;

// Referenced classes of package com.uservoice.uservoicesdk.dialog:
//            ArticleDialogFragment, HelpfulDialogFragment

class this._cls0
    implements android.content.istener
{

    final ArticleDialogFragment this$0;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        Babayaga.track(com.uservoice.uservoicesdk.babayaga.CLE, ArticleDialogFragment.access$000(ArticleDialogFragment.this).getId());
        if (getActivity() instanceof InstantAnswersActivity)
        {
            Deflection.trackDeflection("helpful", ArticleDialogFragment.access$000(ArticleDialogFragment.this));
            (new HelpfulDialogFragment()).show(getActivity().getSupportFragmentManager(), "HelpfulDialogFragment");
        }
    }

    ()
    {
        this$0 = ArticleDialogFragment.this;
        super();
    }
}
