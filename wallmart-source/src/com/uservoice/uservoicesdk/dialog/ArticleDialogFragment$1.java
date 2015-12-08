// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.uservoice.uservoicesdk.dialog;

import android.content.DialogInterface;
import android.support.v4.app.FragmentActivity;
import com.uservoice.uservoicesdk.activity.InstantAnswersActivity;
import com.uservoice.uservoicesdk.deflection.Deflection;
import com.uservoice.uservoicesdk.ui.InstantAnswersAdapter;

// Referenced classes of package com.uservoice.uservoicesdk.dialog:
//            ArticleDialogFragment, UnhelpfulDialogFragment

class this._cls0
    implements android.content.istener
{

    final ArticleDialogFragment this$0;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        if (getActivity() instanceof InstantAnswersActivity)
        {
            Deflection.trackDeflection("unhelpful", ArticleDialogFragment.access$000(ArticleDialogFragment.this));
            ((InstantAnswersAdapter)((InstantAnswersActivity)getActivity()).getListAdapter()).notHelpful();
            return;
        } else
        {
            (new UnhelpfulDialogFragment()).show(getActivity().getSupportFragmentManager(), "UnhelpfulDialogFragment");
            return;
        }
    }

    ()
    {
        this$0 = ArticleDialogFragment.this;
        super();
    }
}
