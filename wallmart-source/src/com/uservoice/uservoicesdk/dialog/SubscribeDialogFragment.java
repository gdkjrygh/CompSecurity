// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.uservoice.uservoicesdk.dialog;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import com.uservoice.uservoicesdk.Session;
import com.uservoice.uservoicesdk.activity.InstantAnswersActivity;
import com.uservoice.uservoicesdk.deflection.Deflection;
import com.uservoice.uservoicesdk.flow.SigninManager;
import com.uservoice.uservoicesdk.model.Suggestion;
import com.uservoice.uservoicesdk.ui.DefaultCallback;
import com.uservoice.uservoicesdk.ui.Utils;

// Referenced classes of package com.uservoice.uservoicesdk.dialog:
//            DialogFragmentBugfixed, SuggestionDialogFragment

public class SubscribeDialogFragment extends DialogFragmentBugfixed
{

    private final Suggestion suggestion;
    private final SuggestionDialogFragment suggestionDialog;

    public SubscribeDialogFragment(Suggestion suggestion1, SuggestionDialogFragment suggestiondialogfragment)
    {
        suggestion = suggestion1;
        suggestionDialog = suggestiondialogfragment;
    }

    public Dialog onCreateDialog(Bundle bundle)
    {
        bundle = new android.app.AlertDialog.Builder(getActivity());
        bundle.setTitle(com.uservoice.uservoicesdk.R.string.uv_subscribe_dialog_title);
        if (!Utils.isDarkTheme(getActivity()))
        {
            bundle.setInverseBackgroundForced(true);
        }
        View view = getActivity().getLayoutInflater().inflate(com.uservoice.uservoicesdk.R.layout.uv_subscribe_dialog, null);
        ((EditText)view.findViewById(com.uservoice.uservoicesdk.R.id.uv_email)).setText(Session.getInstance().getEmail());
        bundle.setView(view);
        bundle.setNegativeButton(com.uservoice.uservoicesdk.R.string.uv_nevermind, null);
        bundle.setPositiveButton(com.uservoice.uservoicesdk.R.string.uv_subscribe, new android.content.DialogInterface.OnClickListener() {

            final SubscribeDialogFragment this$0;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                SigninManager.signinForSubscribe(getActivity(), Session.getInstance().getEmail(), dialoginterface. new Runnable() {

                    final _cls1 this$1;
                    final DialogInterface val$dialog;

                    public void run()
                    {
                        suggestion.subscribe(new DefaultCallback(getActivity()) {

                            final _cls1 this$2;

                            public void onModel(Suggestion suggestion1)
                            {
                                if (getActivity() instanceof InstantAnswersActivity)
                                {
                                    Deflection.trackDeflection("subscribed", suggestion1);
                                }
                                suggestionDialog.suggestionSubscriptionUpdated(suggestion1);
                                dialog.dismiss();
                            }

                            public volatile void onModel(Object obj)
                            {
                                onModel((Suggestion)obj);
                            }

            
            {
                this$2 = _cls1.this;
                super(context);
            }
                        });
                    }

            
            {
                this$1 = final__pcls1;
                dialog = DialogInterface.this;
                super();
            }
                });
            }

            
            {
                this$0 = SubscribeDialogFragment.this;
                super();
            }
        });
        bundle = bundle.create();
        bundle.getWindow().setSoftInputMode(5);
        return bundle;
    }


}
