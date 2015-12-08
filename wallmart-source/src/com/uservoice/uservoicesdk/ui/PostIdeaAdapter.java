// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.uservoice.uservoicesdk.ui;

import android.content.Context;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import com.uservoice.uservoicesdk.Session;
import com.uservoice.uservoicesdk.babayaga.Babayaga;
import com.uservoice.uservoicesdk.flow.SigninManager;
import com.uservoice.uservoicesdk.model.Category;
import com.uservoice.uservoicesdk.model.Forum;
import com.uservoice.uservoicesdk.model.Suggestion;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.uservoice.uservoicesdk.ui:
//            InstantAnswersAdapter, SpinnerAdapter, DefaultCallback

public class PostIdeaAdapter extends InstantAnswersAdapter
{

    private static int CATEGORY = 9;
    private static int DESCRIPTION = 8;
    private static int HELP = 10;
    private static int TEXT_HEADING = 11;
    private Spinner categorySelect;
    private EditText descriptionField;

    public PostIdeaAdapter(FragmentActivity fragmentactivity)
    {
        super(fragmentactivity);
        continueButtonMessage = com.uservoice.uservoicesdk.R.string.uv_post_idea_continue_button;
    }

    protected void doSubmit(Button button)
    {
        button.setEnabled(false);
        if (isValidEmail(emailField.getText()))
        {
            SigninManager.signIn(context, emailField.getText().toString(), nameField.getText().toString(), new Runnable() {

                final PostIdeaAdapter this$0;

                public void run()
                {
                    Category category;
                    if (categorySelect == null)
                    {
                        category = null;
                    } else
                    {
                        category = (Category)categorySelect.getSelectedItem();
                    }
                    Suggestion.createSuggestion(Session.getInstance().getForum(), category, textField.getText().toString(), descriptionField.getText().toString(), 1, new DefaultCallback(context) {

                        final _cls1 this$1;

                        public void onModel(Suggestion suggestion)
                        {
                            Babayaga.track(com.uservoice.uservoicesdk.babayaga.Babayaga.Event.SUBMIT_IDEA);
                            Toast.makeText(context, com.uservoice.uservoicesdk.R.string.uv_msg_idea_created, 0).show();
                            context.finish();
                        }

                        public volatile void onModel(Object obj)
                        {
                            onModel((Suggestion)obj);
                        }

            
            {
                this$1 = _cls1.this;
                super(context);
            }
                    });
                }

            
            {
                this$0 = PostIdeaAdapter.this;
                super();
            }
            });
            return;
        } else
        {
            showInvalidEmailDialog(false);
            button.setEnabled(true);
            return;
        }
    }

    protected List getDetailRows()
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(Integer.valueOf(DESCRIPTION));
        Forum forum = Session.getInstance().getForum();
        if (forum != null && forum.getCategories() != null && forum.getCategories().size() > 0)
        {
            arraylist.add(Integer.valueOf(CATEGORY));
        }
        arraylist.add(Integer.valueOf(SPACE));
        arraylist.add(Integer.valueOf(EMAIL_FIELD));
        arraylist.add(Integer.valueOf(NAME_FIELD));
        return arraylist;
    }

    protected List getRows()
    {
        List list = super.getRows();
        list.add(0, Integer.valueOf(TEXT_HEADING));
        if (state == InstantAnswersAdapter.State.DETAILS)
        {
            list.add(Integer.valueOf(HELP));
        }
        return list;
    }

    protected String getSubmitString()
    {
        return context.getString(com.uservoice.uservoicesdk.R.string.uv_submit_idea);
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        View view2 = view;
        int j = getItemViewType(i);
        View view1 = view2;
        if (view2 == null)
        {
            if (j == DESCRIPTION)
            {
                view1 = inflater.inflate(com.uservoice.uservoicesdk.R.layout.uv_text_field_item, null);
                ((TextView)view1.findViewById(com.uservoice.uservoicesdk.R.id.uv_header_text)).setText(com.uservoice.uservoicesdk.R.string.uv_idea_description_heading);
                view = (EditText)view1.findViewById(com.uservoice.uservoicesdk.R.id.uv_text_field);
                restoreEnteredText(descriptionField, view, "");
                descriptionField = view;
                descriptionField.setHint(com.uservoice.uservoicesdk.R.string.uv_idea_description_hint);
            } else
            if (j == CATEGORY)
            {
                view1 = inflater.inflate(com.uservoice.uservoicesdk.R.layout.uv_select_field_item, null);
                TextView textview = (TextView)view1.findViewById(com.uservoice.uservoicesdk.R.id.uv_header_text);
                categorySelect = (Spinner)view1.findViewById(com.uservoice.uservoicesdk.R.id.uv_select_field);
                view = Session.getInstance().getForum();
                Spinner spinner = categorySelect;
                if (view == null || view.getCategories() == null)
                {
                    view = null;
                } else
                {
                    view = new SpinnerAdapter(context, view.getCategories());
                }
                spinner.setAdapter(view);
                textview.setText(com.uservoice.uservoicesdk.R.string.uv_category);
            } else
            if (j == HELP)
            {
                view1 = inflater.inflate(com.uservoice.uservoicesdk.R.layout.uv_idea_help_item, null);
            } else
            if (j == TEXT_HEADING)
            {
                view1 = inflater.inflate(com.uservoice.uservoicesdk.R.layout.uv_header_item, null);
                ((TextView)view1.findViewById(com.uservoice.uservoicesdk.R.id.uv_header_text)).setText(com.uservoice.uservoicesdk.R.string.uv_idea_text_heading);
            } else
            {
                view1 = super.getView(i, view, viewgroup);
            }
        }
        if (j == DESCRIPTION || j == CATEGORY || j == HELP || j == TEXT_HEADING)
        {
            return view1;
        }
        if (j == TEXT)
        {
            ((TextView)view1.findViewById(com.uservoice.uservoicesdk.R.id.uv_text)).setHint(com.uservoice.uservoicesdk.R.string.uv_idea_text_hint);
            view1.findViewById(com.uservoice.uservoicesdk.R.id.uv_header_text).setVisibility(8);
            return view1;
        } else
        {
            return super.getView(i, view1, viewgroup);
        }
    }

    public int getViewTypeCount()
    {
        return super.getViewTypeCount() + 4;
    }



}
