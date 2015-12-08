// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.uservoice.uservoicesdk.dialog;

import android.app.Activity;
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
import android.widget.TextView;
import android.widget.Toast;
import com.uservoice.uservoicesdk.Session;
import com.uservoice.uservoicesdk.flow.SigninManager;
import com.uservoice.uservoicesdk.model.Comment;
import com.uservoice.uservoicesdk.model.Suggestion;
import com.uservoice.uservoicesdk.ui.DefaultCallback;
import com.uservoice.uservoicesdk.ui.Utils;

// Referenced classes of package com.uservoice.uservoicesdk.dialog:
//            DialogFragmentBugfixed, SuggestionDialogFragment

public class CommentDialogFragment extends DialogFragmentBugfixed
{

    private final Suggestion suggestion;
    private final SuggestionDialogFragment suggestionDialog;

    public CommentDialogFragment(Suggestion suggestion1, SuggestionDialogFragment suggestiondialogfragment)
    {
        suggestion = suggestion1;
        suggestionDialog = suggestiondialogfragment;
    }

    public Dialog onCreateDialog(Bundle bundle)
    {
        bundle = new android.app.AlertDialog.Builder(getActivity());
        if (!Utils.isDarkTheme(getActivity()))
        {
            bundle.setInverseBackgroundForced(true);
        }
        bundle.setTitle(com.uservoice.uservoicesdk.R.string.uv_post_a_comment);
        final FragmentActivity context = getActivity().getLayoutInflater().inflate(com.uservoice.uservoicesdk.R.layout.uv_comment_dialog, null);
        final EditText textField = (EditText)context.findViewById(com.uservoice.uservoicesdk.R.id.uv_comment_edit_text);
        View view = context.findViewById(com.uservoice.uservoicesdk.R.id.uv_email);
        View view1 = context.findViewById(com.uservoice.uservoicesdk.R.id.uv_name);
        final EditText emailField = (EditText)view.findViewById(com.uservoice.uservoicesdk.R.id.uv_text_field);
        final EditText nameField = (EditText)view1.findViewById(com.uservoice.uservoicesdk.R.id.uv_text_field);
        if (Session.getInstance().getUser() != null)
        {
            view.setVisibility(8);
            view1.setVisibility(8);
        } else
        {
            emailField.setText(Session.getInstance().getEmail());
            ((TextView)view.findViewById(com.uservoice.uservoicesdk.R.id.uv_header_text)).setText(com.uservoice.uservoicesdk.R.string.uv_your_email_address);
            nameField.setText(Session.getInstance().getName());
            ((TextView)view1.findViewById(com.uservoice.uservoicesdk.R.id.uv_header_text)).setText(com.uservoice.uservoicesdk.R.string.uv_your_name);
        }
        bundle.setView(context);
        bundle.setNegativeButton(com.uservoice.uservoicesdk.R.string.uv_cancel, null);
        context = getActivity();
        bundle.setPositiveButton(com.uservoice.uservoicesdk.R.string.uv_post_comment, new android.content.DialogInterface.OnClickListener() {

            final CommentDialogFragment this$0;
            final Activity val$context;
            final EditText val$emailField;
            final EditText val$nameField;
            final EditText val$textField;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                dialoginterface = textField.getText().toString();
                if (dialoginterface.trim().length() > 0)
                {
                    SigninManager.signIn(getActivity(), emailField.getText().toString(), nameField.getText().toString(), dialoginterface. new Runnable() {

                        final _cls1 this$1;
                        final String val$text;

                        public void run()
                        {
                            Comment.createComment(suggestion, text, new DefaultCallback(getActivity()) {

                                final _cls1 this$2;

                                public void onModel(Comment comment)
                                {
                                    Toast.makeText(context, com.uservoice.uservoicesdk.R.string.uv_msg_comment_posted, 0).show();
                                    suggestionDialog.commentPosted(comment);
                                }

                                public volatile void onModel(Object obj)
                                {
                                    onModel((Comment)obj);
                                }

            
            {
                this$2 = _cls1.this;
                super(context);
            }
                            });
                        }

            
            {
                this$1 = final__pcls1;
                text = String.this;
                super();
            }
                    });
                }
            }

            
            {
                this$0 = CommentDialogFragment.this;
                textField = edittext;
                emailField = edittext1;
                nameField = edittext2;
                context = activity;
                super();
            }
        });
        bundle = bundle.create();
        bundle.getWindow().setSoftInputMode(5);
        return bundle;
    }


}
