// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.uservoice.uservoicesdk.dialog;

import android.support.v4.app.FragmentActivity;
import android.view.View;

// Referenced classes of package com.uservoice.uservoicesdk.dialog:
//            SuggestionDialogFragment, CommentDialogFragment

class this._cls0
    implements android.view.tionDialogFragment._cls2
{

    final SuggestionDialogFragment this$0;

    public void onClick(View view)
    {
        (new CommentDialogFragment(SuggestionDialogFragment.access$000(SuggestionDialogFragment.this), SuggestionDialogFragment.this)).show(getActivity().getSupportFragmentManager(), "CommentDialogFragment");
    }

    ()
    {
        this$0 = SuggestionDialogFragment.this;
        super();
    }
}
