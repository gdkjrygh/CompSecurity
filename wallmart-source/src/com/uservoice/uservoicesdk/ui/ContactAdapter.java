// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.uservoice.uservoicesdk.ui;

import android.content.Context;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import com.squareup.otto.Bus;
import com.uservoice.uservoicesdk.Config;
import com.uservoice.uservoicesdk.Session;
import com.uservoice.uservoicesdk.babayaga.Babayaga;
import com.uservoice.uservoicesdk.integration.IntegrationProvider;
import com.uservoice.uservoicesdk.model.ClientConfig;
import com.uservoice.uservoicesdk.model.CustomField;
import com.uservoice.uservoicesdk.model.Ticket;
import com.uservoice.uservoicesdk.rest.RestResult;
import com.walmart.android.service.MessageBus;
import com.walmartlabs.ui.FloatLabel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.uservoice.uservoicesdk.ui:
//            InstantAnswersAdapter, DefaultCallback

public class ContactAdapter extends InstantAnswersAdapter
{

    private int CUSTOM_PREDEFINED_FIELD;
    private int CUSTOM_TEXT_FIELD;
    private Map customFieldValues;
    private String issueType;

    public ContactAdapter(FragmentActivity fragmentactivity)
    {
        super(fragmentactivity);
        CUSTOM_TEXT_FIELD = 8;
        CUSTOM_PREDEFINED_FIELD = 9;
        customFieldValues = new HashMap(Session.getInstance().getConfig().getCustomFields());
        continueButtonMessage = com.uservoice.uservoicesdk.R.string.uv_contact_continue_button;
    }

    private boolean validateCustomFields()
    {
        for (Iterator iterator = Session.getInstance().getClientConfig().getCustomFields().iterator(); iterator.hasNext();)
        {
            Object obj = (CustomField)iterator.next();
            if (((CustomField) (obj)).isRequired())
            {
                obj = (String)customFieldValues.get(((CustomField) (obj)).getName());
                if (obj == null || ((String) (obj)).length() == 0)
                {
                    return false;
                }
            }
        }

        return true;
    }

    protected void doSubmit(Button button)
    {
        boolean flag = false;
        button.setEnabled(false);
        if (validateCustomFields())
        {
            if (emailField.length() == 0)
            {
                flag = true;
            }
            Object obj = Session.getInstance().getConfig();
            if (isValidEmail(emailField.getText()) || flag && ((Config) (obj)).getAllowAnonymousFeedback())
            {
                if (flag)
                {
                    obj = ((Config) (obj)).getProvider().getAnonymousEmail(context);
                } else
                {
                    obj = emailField.getText().toString();
                }
                Ticket.createTicket(textField.getText().toString(), ((String) (obj)), nameField.getText().toString(), customFieldValues, new DefaultCallback(button) {

                    final ContactAdapter this$0;
                    final Button val$button;

                    public void onError(RestResult restresult)
                    {
                        super.onError(restresult);
                        button.setEnabled(true);
                    }

                    public void onModel(Ticket ticket)
                    {
                        Babayaga.track(com.uservoice.uservoicesdk.babayaga.Babayaga.Event.SUBMIT_TICKET);
                        Toast.makeText(context, com.uservoice.uservoicesdk.R.string.uv_msg_ticket_created, 0).show();
                        com.walmartlabs.anivia.AniviaEventAsJson.Builder builder1 = new com.walmartlabs.anivia.AniviaEventAsJson.Builder("feedbackSubmit");
                        if (TextUtils.isEmpty(emailField.getText().toString()))
                        {
                            ticket = "no";
                        } else
                        {
                            ticket = "yes";
                        }
                        builder1 = builder1.putString("emailPresent", ticket);
                        if (TextUtils.isEmpty(nameField.getText().toString()))
                        {
                            ticket = "no";
                        } else
                        {
                            ticket = "yes";
                        }
                        ticket = builder1.putString("namePresent", ticket).putString("issueType", issueType).putString("section", "user feedback");
                        MessageBus.getBus().post(ticket);
                        context.finish();
                        context.overridePendingTransition(0, com.uservoice.uservoicesdk.R.anim.uv_slide_out_down);
                    }

                    public volatile void onModel(Object obj1)
                    {
                        onModel((Ticket)obj1);
                    }

            
            {
                this$0 = ContactAdapter.this;
                button = button1;
                super(final_context);
            }
                });
                return;
            } else
            {
                showInvalidEmailDialog(flag);
                button.setEnabled(true);
                return;
            }
        }
        Toast.makeText(context, com.uservoice.uservoicesdk.R.string.uv_msg_custom_fields_validation, 0).show();
        com.walmartlabs.anivia.AniviaEventAsJson.Builder builder;
        if (!TextUtils.isEmpty(Session.getInstance().getConfig().getGuid()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        builder = (new com.walmartlabs.anivia.AniviaEventAsJson.Builder("pageView")).putString("name", "complete required fields overlay").putString("isSignedIn", Boolean.toString(flag)).putString("section", "user feedback");
        MessageBus.getBus().post(builder);
        button.setEnabled(true);
    }

    protected List getDetailRows()
    {
        ArrayList arraylist = new ArrayList();
        for (Iterator iterator = Session.getInstance().getClientConfig().getCustomFields().iterator(); iterator.hasNext();)
        {
            if (((CustomField)iterator.next()).isPredefined())
            {
                arraylist.add(Integer.valueOf(CUSTOM_PREDEFINED_FIELD));
            } else
            {
                arraylist.add(Integer.valueOf(CUSTOM_TEXT_FIELD));
            }
        }

        arraylist.addAll(Arrays.asList(new Integer[] {
            Integer.valueOf(NAME_FIELD), Integer.valueOf(EMAIL_FIELD)
        }));
        return arraylist;
    }

    public Object getItem(int i)
    {
        int j = getItemViewType(i);
        if (j == CUSTOM_PREDEFINED_FIELD || j == CUSTOM_TEXT_FIELD)
        {
            List list = getRows();
            int k;
            int l;
            if (list.contains(Integer.valueOf(CUSTOM_PREDEFINED_FIELD)))
            {
                k = list.indexOf(Integer.valueOf(CUSTOM_PREDEFINED_FIELD));
            } else
            {
                k = list.size();
            }
            if (list.contains(Integer.valueOf(CUSTOM_TEXT_FIELD)))
            {
                l = list.indexOf(Integer.valueOf(CUSTOM_TEXT_FIELD));
            } else
            {
                l = list.size();
            }
            k = Math.min(k, l);
            return Session.getInstance().getClientConfig().getCustomFields().get(i - k);
        } else
        {
            return super.getItem(i);
        }
    }

    protected String getSubmitString()
    {
        return context.getString(com.uservoice.uservoicesdk.R.string.uv_send_message);
    }

    public View getView(int i, final View customField, final ViewGroup field)
    {
        View view1 = customField;
        int j = getItemViewType(i);
        View view = view1;
        if (view1 == null)
        {
            if (j == CUSTOM_TEXT_FIELD)
            {
                view = inflater.inflate(com.uservoice.uservoicesdk.R.layout.uv_text_field_item, null);
            } else
            if (j == CUSTOM_PREDEFINED_FIELD)
            {
                view = inflater.inflate(com.uservoice.uservoicesdk.R.layout.uv_select_field_item, null);
            } else
            {
                return super.getView(i, customField, field);
            }
        }
        if (j == CUSTOM_TEXT_FIELD)
        {
            customField = (TextView)view.findViewById(com.uservoice.uservoicesdk.R.id.uv_header_text);
            field = (EditText)view.findViewById(com.uservoice.uservoicesdk.R.id.uv_text_field);
            final CustomField customField = (CustomField)getItem(i);
            String s = (String)customFieldValues.get(customField.getName());
            customField.setText(customField.getName());
            field.setHint(com.uservoice.uservoicesdk.R.string.uv_value);
            field.setInputType(64);
            field.setText(s);
            field.setOnFocusChangeListener(new android.view.View.OnFocusChangeListener() {

                final ContactAdapter this$0;
                final CustomField val$customField;
                final EditText val$field;

                public void onFocusChange(View view2, boolean flag)
                {
                    if (!flag)
                    {
                        customFieldValues.put(customField.getName(), field.getText().toString());
                    }
                }

            
            {
                this$0 = ContactAdapter.this;
                customField = customfield;
                field = edittext;
                super();
            }
            });
        } else
        if (j == CUSTOM_PREDEFINED_FIELD)
        {
            customField = (CustomField)getItem(i);
            field = (FloatLabel)view.findViewById(com.uservoice.uservoicesdk.R.id.uv_header_text);
            field.setText(customField.getName());
            Spinner spinner = (Spinner)view.findViewById(com.uservoice.uservoicesdk.R.id.uv_select_field);
            spinner.setOnItemSelectedListener(new android.widget.AdapterView.OnItemSelectedListener() {

                final ContactAdapter this$0;
                final CustomField val$customField;
                final FloatLabel val$title;

                public void onItemSelected(AdapterView adapterview, View view2, int k, long l)
                {
                    issueType = (String)customField.getPredefinedValues().get(k);
                    customFieldValues.put(customField.getName(), issueType);
                    title.show();
                }

                public void onNothingSelected(AdapterView adapterview)
                {
                }

            
            {
                this$0 = ContactAdapter.this;
                customField = customfield;
                title = floatlabel;
                super();
            }
            });
            Object obj = customField.getPredefinedValues();
            spinner.setAdapter(new com.walmartlabs.ui.NoDefaultSpinner.Adapter(context, customField.getName(), (String[])((List) (obj)).toArray(new String[((List) (obj)).size()])));
            obj = (String)customFieldValues.get(customField.getName());
            if (obj != null)
            {
                i = customField.getPredefinedValues().indexOf(obj);
                if (i != -1)
                {
                    spinner.setSelection(i);
                }
            }
            field.attach(spinner);
        } else
        {
            return super.getView(i, view, field);
        }
        return view;
    }

    public int getViewTypeCount()
    {
        return super.getViewTypeCount() + 2;
    }




/*
    static String access$102(ContactAdapter contactadapter, String s)
    {
        contactadapter.issueType = s;
        return s;
    }

*/
}
