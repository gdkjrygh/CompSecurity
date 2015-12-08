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

class this._cls0
    implements android.view.tionDialogFragment._cls1
{

    final SuggestionDialogFragment this$0;

    public void onClick(final View callback)
    {
        callback = new DefaultCallback(getActivity()) {

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
        };
        if (SuggestionDialogFragment.access$000(SuggestionDialogFragment.this).isSubscribed())
        {
            if (Session.getInstance().getEmail() != null)
            {
                SuggestionDialogFragment.access$000(SuggestionDialogFragment.this).unsubscribe(callback);
                return;
            } else
            {
                SigninManager.signinForSubscribe(getActivity(), Session.getInstance().getEmail(), new Runnable() {

                    final SuggestionDialogFragment._cls1 this$1;
                    final DefaultCallback val$callback;

                    public void run()
                    {
                        SuggestionDialogFragment.access$000(this$0).unsubscribe(callback);
                    }

            
            {
                this$1 = SuggestionDialogFragment._cls1.this;
                callback = defaultcallback;
                super();
            }
                });
                return;
            }
        }
        if (Session.getInstance().getEmail() != null)
        {
            SigninManager.signinForSubscribe(getActivity(), Session.getInstance().getEmail(), new Runnable() {

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
            });
            return;
        } else
        {
            (new SubscribeDialogFragment(SuggestionDialogFragment.access$000(SuggestionDialogFragment.this), SuggestionDialogFragment.this)).show(getFragmentManager(), "SubscribeDialogFragment");
            return;
        }
    }

    _cls3.val.callback()
    {
        this$0 = SuggestionDialogFragment.this;
        super();
    }
}
