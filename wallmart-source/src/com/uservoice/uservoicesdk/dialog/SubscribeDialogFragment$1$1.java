// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.uservoice.uservoicesdk.dialog;

import android.content.Context;
import android.content.DialogInterface;
import com.uservoice.uservoicesdk.Session;
import com.uservoice.uservoicesdk.activity.InstantAnswersActivity;
import com.uservoice.uservoicesdk.deflection.Deflection;
import com.uservoice.uservoicesdk.flow.SigninManager;
import com.uservoice.uservoicesdk.model.Suggestion;
import com.uservoice.uservoicesdk.ui.DefaultCallback;

// Referenced classes of package com.uservoice.uservoicesdk.dialog:
//            SubscribeDialogFragment, SuggestionDialogFragment

class val.dialog
    implements Runnable
{

    final _cls1.onModel this$1;
    final DialogInterface val$dialog;

    public void run()
    {
        SubscribeDialogFragment.access$100(_fld0).subscribe(new DefaultCallback(getActivity()) {

            final SubscribeDialogFragment._cls1._cls1 this$2;

            public void onModel(Suggestion suggestion)
            {
                if (getActivity() instanceof InstantAnswersActivity)
                {
                    Deflection.trackDeflection("subscribed", suggestion);
                }
                SubscribeDialogFragment.access$000(this$0).suggestionSubscriptionUpdated(suggestion);
                dialog.dismiss();
            }

            public volatile void onModel(Object obj)
            {
                onModel((Suggestion)obj);
            }

            
            {
                this$2 = SubscribeDialogFragment._cls1._cls1.this;
                super(context);
            }
        });
    }

    is._cls0()
    {
        this$1 = final__pcls0;
        val$dialog = DialogInterface.this;
        super();
    }

    // Unreferenced inner class com/uservoice/uservoicesdk/dialog/SubscribeDialogFragment$1

/* anonymous class */
    class SubscribeDialogFragment._cls1
        implements android.content.DialogInterface.OnClickListener
    {

        final SubscribeDialogFragment this$0;

        public void onClick(DialogInterface dialoginterface, int i)
        {
            SigninManager.signinForSubscribe(getActivity(), Session.getInstance().getEmail(), dialoginterface. new SubscribeDialogFragment._cls1._cls1());
        }

            
            {
                this$0 = SubscribeDialogFragment.this;
                super();
            }
    }

}
