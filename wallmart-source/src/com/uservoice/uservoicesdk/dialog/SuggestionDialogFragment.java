// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.uservoice.uservoicesdk.dialog;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.uservoice.uservoicesdk.Session;
import com.uservoice.uservoicesdk.activity.ForumActivity;
import com.uservoice.uservoicesdk.activity.InstantAnswersActivity;
import com.uservoice.uservoicesdk.babayaga.Babayaga;
import com.uservoice.uservoicesdk.deflection.Deflection;
import com.uservoice.uservoicesdk.flow.SigninManager;
import com.uservoice.uservoicesdk.image.ImageCache;
import com.uservoice.uservoicesdk.model.Comment;
import com.uservoice.uservoicesdk.model.Suggestion;
import com.uservoice.uservoicesdk.rest.Callback;
import com.uservoice.uservoicesdk.ui.DefaultCallback;
import com.uservoice.uservoicesdk.ui.PaginatedAdapter;
import com.uservoice.uservoicesdk.ui.PaginationScrollListener;
import com.uservoice.uservoicesdk.ui.Utils;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

// Referenced classes of package com.uservoice.uservoicesdk.dialog:
//            DialogFragmentBugfixed, SubscribeDialogFragment, CommentDialogFragment

public class SuggestionDialogFragment extends DialogFragmentBugfixed
{

    private PaginatedAdapter adapter;
    private View headerView;
    private View parentView;
    private Suggestion suggestion;

    public SuggestionDialogFragment(Suggestion suggestion1)
    {
        suggestion = suggestion1;
    }

    private void displaySuggestion(Suggestion suggestion1)
    {
        if (getActivity() != null)
        {
            View view = headerView;
            TextView textview = (TextView)parentView.findViewById(com.uservoice.uservoicesdk.R.id.uv_status);
            TextView textview1 = (TextView)view.findViewById(com.uservoice.uservoicesdk.R.id.uv_response_status);
            View view1 = view.findViewById(com.uservoice.uservoicesdk.R.id.uv_response_divider);
            TextView textview2 = (TextView)view.findViewById(com.uservoice.uservoicesdk.R.id.uv_title);
            ((CheckBox)view.findViewById(com.uservoice.uservoicesdk.R.id.uv_subscribe_checkbox)).setChecked(suggestion1.isSubscribed());
            if (suggestion1.getStatus() == null)
            {
                textview.setVisibility(8);
                textview1.setTextColor(0xff444444);
                view1.setBackgroundColor(0xff444444);
            } else
            {
                int i = Color.parseColor(suggestion1.getStatusColor());
                textview.setBackgroundColor(i);
                textview.setText(suggestion1.getStatus());
                textview1.setTextColor(i);
                textview1.setText(String.format(getString(com.uservoice.uservoicesdk.R.string.uv_admin_response_format), new Object[] {
                    suggestion1.getStatus().toUpperCase(Locale.getDefault())
                }));
                view1.setBackgroundColor(i);
            }
            textview2.setText(suggestion1.getTitle());
            ((TextView)view.findViewById(com.uservoice.uservoicesdk.R.id.uv_text)).setText(suggestion1.getText());
            ((TextView)view.findViewById(com.uservoice.uservoicesdk.R.id.uv_creator)).setText(String.format(view.getContext().getString(com.uservoice.uservoicesdk.R.string.uv_posted_by_format), new Object[] {
                suggestion1.getCreatorName(), DateFormat.getDateInstance().format(suggestion1.getCreatedAt())
            }));
            if (suggestion1.getAdminResponseText() == null)
            {
                view.findViewById(com.uservoice.uservoicesdk.R.id.uv_admin_response).setVisibility(8);
            } else
            {
                view.findViewById(com.uservoice.uservoicesdk.R.id.uv_admin_response).setVisibility(0);
                ((TextView)view.findViewById(com.uservoice.uservoicesdk.R.id.uv_admin_name)).setText(suggestion1.getAdminResponseUserName());
                ((TextView)view.findViewById(com.uservoice.uservoicesdk.R.id.uv_response_date)).setText(DateFormat.getDateInstance().format(suggestion1.getAdminResponseCreatedAt()));
                ((TextView)view.findViewById(com.uservoice.uservoicesdk.R.id.uv_response_text)).setText(suggestion1.getAdminResponseText());
                ImageView imageview = (ImageView)view.findViewById(com.uservoice.uservoicesdk.R.id.uv_admin_avatar);
                ImageCache.getInstance().loadImage(suggestion1.getAdminResponseAvatarUrl(), imageview);
            }
            ((TextView)view.findViewById(com.uservoice.uservoicesdk.R.id.uv_comment_count)).setText(Utils.getQuantityString(view, com.uservoice.uservoicesdk.R.plurals.uv_comments, suggestion1.getNumberOfComments()).toUpperCase(Locale.getDefault()));
            ((TextView)view.findViewById(com.uservoice.uservoicesdk.R.id.uv_subscriber_count)).setText(String.format(view.getContext().getResources().getQuantityString(com.uservoice.uservoicesdk.R.plurals.uv_number_of_subscribers_format, suggestion1.getNumberOfSubscribers()), new Object[] {
                Utils.getQuantityString(view, com.uservoice.uservoicesdk.R.plurals.uv_subscribers, suggestion1.getNumberOfSubscribers())
            }));
        }
    }

    private PaginatedAdapter getListAdapter()
    {
        return new PaginatedAdapter(getActivity(), com.uservoice.uservoicesdk.R.layout.uv_comment_item, new ArrayList()) {

            final SuggestionDialogFragment this$0;

            protected void customizeLayout(View view, Comment comment)
            {
                ((TextView)view.findViewById(com.uservoice.uservoicesdk.R.id.uv_text)).setText(comment.getText());
                ((TextView)view.findViewById(com.uservoice.uservoicesdk.R.id.uv_name)).setText(comment.getUserName());
                ((TextView)view.findViewById(com.uservoice.uservoicesdk.R.id.uv_date)).setText(DateFormat.getDateInstance().format(comment.getCreatedAt()));
                view = (ImageView)view.findViewById(com.uservoice.uservoicesdk.R.id.uv_avatar);
                ImageCache.getInstance().loadImage(comment.getAvatarUrl(), view);
            }

            protected volatile void customizeLayout(View view, Object obj)
            {
                customizeLayout(view, (Comment)obj);
            }

            protected int getTotalNumberOfObjects()
            {
                return suggestion.getNumberOfComments();
            }

            public boolean isEnabled(int i)
            {
                return false;
            }

            protected void loadPage(int i, Callback callback)
            {
                Comment.loadComments(suggestion, i, callback);
            }

            
            {
                this$0 = SuggestionDialogFragment.this;
                super(context, i, list);
            }
        };
    }

    public void commentPosted(Comment comment)
    {
        adapter.add(0, comment);
        suggestion.commentPosted(comment);
        displaySuggestion(suggestion);
    }

    public Dialog onCreateDialog(Bundle bundle)
    {
        bundle = new android.app.AlertDialog.Builder(getActivity());
        setStyle(1, getTheme());
        if (!Utils.isDarkTheme(getActivity()))
        {
            bundle.setInverseBackgroundForced(true);
        }
        parentView = getActivity().getLayoutInflater().inflate(com.uservoice.uservoicesdk.R.layout.uv_idea_dialog, null);
        headerView = getActivity().getLayoutInflater().inflate(com.uservoice.uservoicesdk.R.layout.uv_idea_dialog_header, null);
        headerView.findViewById(com.uservoice.uservoicesdk.R.id.uv_subscribe).setOnClickListener(new android.view.View.OnClickListener() {

            final SuggestionDialogFragment this$0;

            public void onClick(View view)
            {
                view = new DefaultCallback(getActivity()) {

                    final _cls1 this$1;

                    public void onModel(Suggestion suggestion1)
                    {
                        if (getActivity() instanceof InstantAnswersActivity)
                        {
                            Deflection.trackDeflection("subscribed", suggestion1);
                        }
                        suggestionSubscriptionUpdated(suggestion1);
                    }

                    public volatile void onModel(Object obj)
                    {
                        onModel((Suggestion)obj);
                    }

            
            {
                this$1 = _cls1.this;
                super(context);
            }
                };
                if (suggestion.isSubscribed())
                {
                    if (Session.getInstance().getEmail() != null)
                    {
                        suggestion.unsubscribe(view);
                        return;
                    } else
                    {
                        SigninManager.signinForSubscribe(getActivity(), Session.getInstance().getEmail(), view. new Runnable() {

                            final _cls1 this$1;
                            final DefaultCallback val$callback;

                            public void run()
                            {
                                suggestion.unsubscribe(callback);
                            }

            
            {
                this$1 = final__pcls1;
                callback = DefaultCallback.this;
                super();
            }
                        });
                        return;
                    }
                }
                if (Session.getInstance().getEmail() != null)
                {
                    SigninManager.signinForSubscribe(getActivity(), Session.getInstance().getEmail(), view. new Runnable() {

                        final _cls1 this$1;
                        final DefaultCallback val$callback;

                        public void run()
                        {
                            suggestion.subscribe(callback);
                        }

            
            {
                this$1 = final__pcls1;
                callback = DefaultCallback.this;
                super();
            }
                    });
                    return;
                } else
                {
                    (new SubscribeDialogFragment(suggestion, SuggestionDialogFragment.this)).show(getFragmentManager(), "SubscribeDialogFragment");
                    return;
                }
            }

            
            {
                this$0 = SuggestionDialogFragment.this;
                super();
            }
        });
        headerView.findViewById(com.uservoice.uservoicesdk.R.id.uv_post_comment).setOnClickListener(new android.view.View.OnClickListener() {

            final SuggestionDialogFragment this$0;

            public void onClick(View view)
            {
                (new CommentDialogFragment(suggestion, SuggestionDialogFragment.this)).show(getActivity().getSupportFragmentManager(), "CommentDialogFragment");
            }

            
            {
                this$0 = SuggestionDialogFragment.this;
                super();
            }
        });
        ListView listview = (ListView)parentView.findViewById(com.uservoice.uservoicesdk.R.id.uv_list);
        displaySuggestion(suggestion);
        listview.addHeaderView(headerView);
        adapter = getListAdapter();
        listview.setAdapter(adapter);
        listview.setDivider(null);
        listview.setOnScrollListener(new PaginationScrollListener(adapter));
        bundle.setView(parentView);
        bundle.setNegativeButton(com.uservoice.uservoicesdk.R.string.uv_close, null);
        Babayaga.track(com.uservoice.uservoicesdk.babayaga.Babayaga.Event.VIEW_IDEA, suggestion.getId());
        return bundle.create();
    }

    public void suggestionSubscriptionUpdated(Suggestion suggestion1)
    {
        FragmentActivity fragmentactivity = getActivity();
        if (fragmentactivity != null)
        {
            int i;
            if (suggestion.isSubscribed())
            {
                i = com.uservoice.uservoicesdk.R.string.uv_msg_subscribe_success;
            } else
            {
                i = com.uservoice.uservoicesdk.R.string.uv_msg_unsubscribe;
            }
            Toast.makeText(fragmentactivity, i, 0).show();
            displaySuggestion(suggestion);
            if (fragmentactivity instanceof ForumActivity)
            {
                ((ForumActivity)fragmentactivity).suggestionUpdated(suggestion1);
            }
        }
    }

}
