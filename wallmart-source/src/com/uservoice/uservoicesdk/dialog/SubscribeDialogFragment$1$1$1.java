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

class this._cls2 extends DefaultCallback
{

    final onModel this$2;

    public void onModel(Suggestion suggestion)
    {
        if (getActivity() instanceof InstantAnswersActivity)
        {
            Deflection.trackDeflection("subscribed", suggestion);
        }
        SubscribeDialogFragment.access$000(_fld0).suggestionSubscriptionUpdated(suggestion);
        dialog.dismiss();
    }

    public volatile void onModel(Object obj)
    {
        onModel((Suggestion)obj);
    }

    ._cls0(Context context)
    {
        this$2 = this._cls2.this;
        super(context);
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


    // Unreferenced inner class com/uservoice/uservoicesdk/dialog/SubscribeDialogFragment$1$1

/* anonymous class */
    class SubscribeDialogFragment._cls1._cls1
        implements Runnable
    {

        final SubscribeDialogFragment._cls1 this$1;
        final DialogInterface val$dialog;

        public void run()
        {
            SubscribeDialogFragment.access$100(this$0).subscribe(new SubscribeDialogFragment._cls1._cls1._cls1(getActivity()));
        }

            
            {
                this$1 = final__pcls1;
                dialog = DialogInterface.this;
                super();
            }
    }

}
