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
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import com.uservoice.uservoicesdk.Session;
import com.uservoice.uservoicesdk.babayaga.Babayaga;
import com.uservoice.uservoicesdk.model.AccessToken;
import com.uservoice.uservoicesdk.model.AccessTokenResult;
import com.uservoice.uservoicesdk.model.RequestToken;
import com.uservoice.uservoicesdk.model.User;
import com.uservoice.uservoicesdk.rest.Callback;
import com.uservoice.uservoicesdk.rest.RestResult;
import com.uservoice.uservoicesdk.ui.DefaultCallback;
import com.uservoice.uservoicesdk.ui.Utils;

// Referenced classes of package com.uservoice.uservoicesdk.dialog:
//            DialogFragmentBugfixed

public class SigninDialogFragment extends DialogFragmentBugfixed
{

    private Runnable callback;
    private String email;
    private EditText emailField;
    private String name;
    private EditText nameField;
    private EditText passwordField;
    private View passwordFields;
    private Runnable requestTokenCallback;

    public SigninDialogFragment()
    {
    }

    public SigninDialogFragment(String s, String s1, Runnable runnable)
    {
        email = s;
        name = s1;
        callback = runnable;
    }

    private void discoverUser()
    {
        User.discover(emailField.getText().toString(), new Callback() {

            final SigninDialogFragment this$0;

            public void onError(RestResult restresult)
            {
                passwordFields.setVisibility(8);
                nameField.setVisibility(0);
                nameField.requestFocus();
            }

            public void onModel(User user)
            {
                passwordFields.setVisibility(0);
                nameField.setVisibility(8);
                passwordField.requestFocus();
            }

            public volatile void onModel(Object obj)
            {
                onModel((User)obj);
            }

            
            {
                this$0 = SigninDialogFragment.this;
                super();
            }
        });
    }

    private void sendForgotPassword()
    {
        FragmentActivity fragmentactivity = getActivity();
        User.sendForgotPassword(emailField.getText().toString(), new DefaultCallback(fragmentactivity) {

            final SigninDialogFragment this$0;
            final Activity val$activity;

            public void onModel(User user)
            {
                Toast.makeText(activity, com.uservoice.uservoicesdk.R.string.uv_msg_forgot_password, 0).show();
            }

            public volatile void onModel(Object obj)
            {
                onModel((User)obj);
            }

            
            {
                this$0 = SigninDialogFragment.this;
                activity = activity1;
                super(final_context);
            }
        });
    }

    private void signIn()
    {
        Runnable runnable = new Runnable() {

            final SigninDialogFragment this$0;
            final Activity val$activity;

            public void run()
            {
                if (nameField.getVisibility() == 0)
                {
                    User.findOrCreate(emailField.getText().toString(), nameField.getText().toString(), new DefaultCallback(getActivity()) {

                        final _cls6 this$1;

                        public void onModel(AccessTokenResult accesstokenresult)
                        {
                            Session.getInstance().setUser((User)accesstokenresult.getModel());
                            Session.getInstance().setAccessToken(activity, accesstokenresult.getAccessToken());
                            Babayaga.track(com.uservoice.uservoicesdk.babayaga.Babayaga.Event.AUTHENTICATE);
                            dismiss();
                            callback.run();
                        }

                        public volatile void onModel(Object obj)
                        {
                            onModel((AccessTokenResult)obj);
                        }

            
            {
                this$1 = _cls6.this;
                super(context);
            }
                    });
                    return;
                } else
                {
                    AccessToken.authorize(emailField.getText().toString(), passwordField.getText().toString(), new Callback() {

                        final _cls6 this$1;

                        public void onError(RestResult restresult)
                        {
                            Toast.makeText(activity, com.uservoice.uservoicesdk.R.string.uv_failed_signin_error, 0).show();
                        }

                        public void onModel(AccessToken accesstoken)
                        {
                            Session.getInstance().setAccessToken(activity, accesstoken);
                            User.loadCurrentUser(new DefaultCallback(getActivity()) {

                                final _cls2 this$2;

                                public void onModel(User user)
                                {
                                    Session.getInstance().setUser(user);
                                    Babayaga.track(com.uservoice.uservoicesdk.babayaga.Babayaga.Event.AUTHENTICATE);
                                    dismiss();
                                    callback.run();
                                }

                                public volatile void onModel(Object obj)
                                {
                                    onModel((User)obj);
                                }

            
            {
                this$2 = _cls2.this;
                super(context);
            }
                            });
                        }

                        public volatile void onModel(Object obj)
                        {
                            onModel((AccessToken)obj);
                        }

            
            {
                this$1 = _cls6.this;
                super();
            }
                    });
                    return;
                }
            }

            
            {
                this$0 = SigninDialogFragment.this;
                activity = activity1;
                super();
            }
        };
        if (Session.getInstance().getRequestToken() != null)
        {
            runnable.run();
            return;
        } else
        {
            requestTokenCallback = runnable;
            return;
        }
    }

    public Dialog onCreateDialog(final Bundle dialog)
    {
        RequestToken.getRequestToken(new DefaultCallback(getActivity()) {

            final SigninDialogFragment this$0;

            public void onModel(RequestToken requesttoken)
            {
                Session.getInstance().setRequestToken(requesttoken);
                if (requestTokenCallback != null)
                {
                    requestTokenCallback.run();
                }
            }

            public volatile void onModel(Object obj)
            {
                onModel((RequestToken)obj);
            }

            
            {
                this$0 = SigninDialogFragment.this;
                super(context);
            }
        });
        dialog = new android.app.AlertDialog.Builder(getActivity());
        if (!Utils.isDarkTheme(getActivity()))
        {
            dialog.setInverseBackgroundForced(true);
        }
        dialog.setTitle(com.uservoice.uservoicesdk.R.string.uv_signin_dialog_title);
        View view = getActivity().getLayoutInflater().inflate(com.uservoice.uservoicesdk.R.layout.uv_signin_layout, null);
        emailField = (EditText)view.findViewById(com.uservoice.uservoicesdk.R.id.uv_signin_email);
        nameField = (EditText)view.findViewById(com.uservoice.uservoicesdk.R.id.uv_signin_name);
        passwordField = (EditText)view.findViewById(com.uservoice.uservoicesdk.R.id.uv_signin_password);
        passwordFields = view.findViewById(com.uservoice.uservoicesdk.R.id.uv_signin_password_fields);
        Button button = (Button)view.findViewById(com.uservoice.uservoicesdk.R.id.uv_signin_forgot_password);
        passwordFields.setVisibility(8);
        emailField.setText(email);
        nameField.setText(name);
        if (email != null)
        {
            discoverUser();
        }
        button.setOnClickListener(new android.view.View.OnClickListener() {

            final SigninDialogFragment this$0;

            public void onClick(View view1)
            {
                sendForgotPassword();
            }

            
            {
                this$0 = SigninDialogFragment.this;
                super();
            }
        });
        emailField.setOnFocusChangeListener(new android.view.View.OnFocusChangeListener() {

            final SigninDialogFragment this$0;

            public void onFocusChange(View view1, boolean flag)
            {
                if (view1 == emailField && !flag)
                {
                    discoverUser();
                }
            }

            
            {
                this$0 = SigninDialogFragment.this;
                super();
            }
        });
        dialog.setView(view);
        dialog.setNegativeButton(0x1040000, null);
        dialog.setPositiveButton(com.uservoice.uservoicesdk.R.string.uv_signin_dialog_ok, null);
        dialog = dialog.create();
        dialog.setOnShowListener(new android.content.DialogInterface.OnShowListener() {

            final SigninDialogFragment this$0;
            final AlertDialog val$dialog;

            public void onShow(DialogInterface dialoginterface)
            {
                dialog.getButton(-1).setOnClickListener(new android.view.View.OnClickListener() {

                    final _cls4 this$1;

                    public void onClick(View view)
                    {
                        signIn();
                    }

            
            {
                this$1 = _cls4.this;
                super();
            }
                });
                ((InputMethodManager)getActivity().getSystemService("input_method")).showSoftInput(emailField, 1);
            }

            
            {
                this$0 = SigninDialogFragment.this;
                dialog = alertdialog;
                super();
            }
        });
        dialog.getWindow().setSoftInputMode(5);
        return dialog;
    }









}
