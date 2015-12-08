// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.uservoice.uservoicesdk.dialog;

import android.content.Context;
import android.view.View;
import com.uservoice.uservoicesdk.Session;
import com.uservoice.uservoicesdk.activity.InstantAnswersActivity;
import com.uservoice.uservoicesdk.deflection.Deflection;
import com.uservoice.uservoicesdk.flow.SigninManager;
import com.uservoice.uservoicesdk.model.Suggestion;
import com.uservoice.uservoicesdk.ui.DefaultCallback;

// Referenced classes of package com.uservoice.uservoicesdk.dialog:
//            SuggestionDialogFragment, SubscribeDialogFragment

class val.callback
    implements Runnable
{

    final val.callback this$1;
    final DefaultCallback val$callback;

    public void run()
    {
        SuggestionDialogFragment.access$000(_fld0).unsubscribe(val$callback);
    }

    is._cls0()
    {
        this$1 = final__pcls0;
        val$callback = DefaultCallback.this;
        super();
    }

    // Unreferenced inner class com/uservoice/uservoicesdk/dialog/SuggestionDialogFragment$1

/* anonymous class */
    class SuggestionDialogFragment._cls1
        implements android.view.View.OnClickListener
    {

        final SuggestionDialogFragment this$0;

        public void onClick(final View callback)
        {
            callback = new SuggestionDialogFragment._cls1._cls1(getActivity());
            if (SuggestionDialogFragment.access$000(SuggestionDialogFragment.this).isSubscribed())
            {
                if (Session.getInstance().getEmail() != null)
                {
                    SuggestionDialogFragment.access$000(SuggestionDialogFragment.this).unsubscribe(callback);
                    return;
                } else
                {
                    SigninManager.signinForSubscribe(getActivity(), Session.getInstance().getEmail(), callback. new SuggestionDialogFragment._cls1._cls2());
                    return;
                }
            }
            if (Session.getInstance().getEmail() != null)
            {
                SigninManager.signinForSubscribe(getActivity(), Session.getInstance().getEmail(), new SuggestionDialogFragment._cls1._cls3());
                return;
            } else
            {
                (new SubscribeDialogFragment(SuggestionDialogFragment.access$000(SuggestionDialogFragment.this), SuggestionDialogFragment.this)).show(getFragmentManager(), "SubscribeDialogFragment");
                return;
            }
        }

            
            {
                this$0 = SuggestionDialogFragment.this;
                super();
            }

        // Unreferenced inner class com/uservoice/uservoicesdk/dialog/SuggestionDialogFragment$1$1

/* anonymous class */
        class SuggestionDialogFragment._cls1._cls1 extends DefaultCallback
        {

            final SuggestionDialogFragment._cls1 this$1;

            public void onModel(Suggestion suggestion)
            {
                if (getActivity() instanceof InstantAnswersActivity)
                {
                    Deflection.trackDeflection("subscribed", suggestion);
                }
                suggestionSubscriptionUpdated(suggestion);
            }

            public volatile void onModel(Object obj)
            {
                onModel((Suggestion)obj);
            }

                    
                    {
                        this$1 = SuggestionDialogFragment._cls1.this;
                        super(context);
                    }
        }


        // Unreferenced inner class com/uservoice/uservoicesdk/dialog/SuggestionDialogFragment$1$3

/* anonymous class */
        class SuggestionDialogFragment._cls1._cls3
            implements Runnable
        {

            final SuggestionDialogFragment._cls1 this$1;
            final DefaultCallback val$callback;

            public void run()
            {
                SuggestionDialogFragment.access$000(this$0).subscribe(callback);
            }

                    
                    {
                        this$1 = SuggestionDialogFragment._cls1.this;
                        callback = defaultcallback;
                        super();
                    }
        }

    }

}
