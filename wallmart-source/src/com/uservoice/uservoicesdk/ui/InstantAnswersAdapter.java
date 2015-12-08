// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.uservoice.uservoicesdk.ui;

import android.content.Context;
import android.os.Handler;
import android.support.v4.app.FragmentActivity;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Patterns;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.squareup.otto.Bus;
import com.uservoice.uservoicesdk.Config;
import com.uservoice.uservoicesdk.Session;
import com.uservoice.uservoicesdk.deflection.Deflection;
import com.uservoice.uservoicesdk.model.Article;
import com.uservoice.uservoicesdk.model.BaseModel;
import com.uservoice.uservoicesdk.model.Suggestion;
import com.walmart.android.service.MessageBus;
import com.walmartlabs.ui.FloatLabel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.uservoice.uservoicesdk.ui:
//            Utils, DefaultCallback

public abstract class InstantAnswersAdapter extends BaseAdapter
    implements android.widget.AdapterView.OnItemClickListener
{
    protected static final class State extends Enum
    {

        private static final State $VALUES[];
        public static final State DETAILS;
        public static final State INIT;
        public static final State INIT_LOADING;
        public static final State INSTANT_ANSWERS;

        public static State valueOf(String s)
        {
            return (State)Enum.valueOf(com/uservoice/uservoicesdk/ui/InstantAnswersAdapter$State, s);
        }

        public static State[] values()
        {
            return (State[])$VALUES.clone();
        }

        static 
        {
            INIT = new State("INIT", 0);
            INIT_LOADING = new State("INIT_LOADING", 1);
            INSTANT_ANSWERS = new State("INSTANT_ANSWERS", 2);
            DETAILS = new State("DETAILS", 3);
            $VALUES = (new State[] {
                INIT, INIT_LOADING, INSTANT_ANSWERS, DETAILS
            });
        }

        private State(String s, int i)
        {
            super(s, i);
        }
    }


    protected int BUTTON;
    protected int EMAIL_FIELD;
    protected int HEADING;
    protected int INSTANT_ANSWER;
    protected int LOADING;
    protected int NAME_FIELD;
    protected int SPACE;
    protected int TEXT;
    protected FragmentActivity context;
    protected int continueButtonMessage;
    protected EditText emailField;
    private final Handler handler = new Handler();
    protected LayoutInflater inflater;
    private boolean initialFocusSet;
    protected List instantAnswers;
    protected EditText nameField;
    protected State state;
    protected EditText textField;

    public InstantAnswersAdapter(FragmentActivity fragmentactivity)
    {
        TEXT = 0;
        BUTTON = 1;
        HEADING = 2;
        LOADING = 3;
        INSTANT_ANSWER = 4;
        EMAIL_FIELD = 5;
        NAME_FIELD = 6;
        SPACE = 7;
        state = State.INIT;
        context = fragmentactivity;
        inflater = (LayoutInflater)fragmentactivity.getSystemService("layout_inflater");
    }

    private void handleFocus(int i)
    {
        if (i == EMAIL_FIELD)
        {
            tempDisableFocusability(textField);
            tempDisableFocusability(nameField);
        } else
        {
            if (i == NAME_FIELD)
            {
                tempDisableFocusability(textField);
                tempDisableFocusability(emailField);
                return;
            }
            if (i == TEXT)
            {
                tempDisableFocusability(nameField);
                tempDisableFocusability(emailField);
                return;
            }
        }
    }

    public static final boolean isValidEmail(CharSequence charsequence)
    {
        if (TextUtils.isEmpty(charsequence))
        {
            return false;
        } else
        {
            return Patterns.EMAIL_ADDRESS.matcher(charsequence).matches();
        }
    }

    private void tempDisableFocusability(final View view)
    {
        if (view != null)
        {
            view.setFocusable(false);
            handler.postDelayed(new Runnable() {

                final InstantAnswersAdapter this$0;
                final View val$view;

                public void run()
                {
                    view.setFocusableInTouchMode(true);
                    view.setFocusable(true);
                }

            
            {
                this$0 = InstantAnswersAdapter.this;
                view = view1;
                super();
            }
            }, 200L);
        }
    }

    protected abstract void doSubmit(Button button);

    public int getCount()
    {
        if (isLoading())
        {
            return 1;
        } else
        {
            return getRows().size();
        }
    }

    protected abstract List getDetailRows();

    public Object getItem(int i)
    {
        if (getItemViewType(i) == INSTANT_ANSWER)
        {
            return instantAnswers.get(i - getRows().indexOf(Integer.valueOf(INSTANT_ANSWER)));
        } else
        {
            return null;
        }
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public int getItemViewType(int i)
    {
        if (isLoading())
        {
            return LOADING;
        } else
        {
            return ((Integer)getRows().get(i)).intValue();
        }
    }

    protected List getRows()
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(Integer.valueOf(TEXT));
        if (state != State.INIT && state != State.INIT_LOADING && !instantAnswers.isEmpty())
        {
            arraylist.add(Integer.valueOf(HEADING));
        }
        if (state == State.INSTANT_ANSWERS || state == State.DETAILS)
        {
            if (instantAnswers.size() > 0)
            {
                arraylist.add(Integer.valueOf(INSTANT_ANSWER));
            }
            if (instantAnswers.size() > 1)
            {
                arraylist.add(Integer.valueOf(INSTANT_ANSWER));
            }
            if (instantAnswers.size() > 2)
            {
                arraylist.add(Integer.valueOf(INSTANT_ANSWER));
            }
        }
        if (state == State.DETAILS)
        {
            arraylist.addAll(getDetailRows());
        }
        arraylist.add(Integer.valueOf(BUTTON));
        return arraylist;
    }

    protected abstract String getSubmitString();

    public View getView(int i, View view, final ViewGroup button)
    {
        final int type;
        button = view;
        type = getItemViewType(i);
        view = button;
        if (button != null) goto _L2; else goto _L1
_L1:
        if (type != LOADING) goto _L4; else goto _L3
_L3:
        view = inflater.inflate(com.uservoice.uservoicesdk.R.layout.uv_loading_item, null);
_L2:
        if (type != BUTTON) goto _L6; else goto _L5
_L5:
        button = (Button)view.findViewById(com.uservoice.uservoicesdk.R.id.uv_contact_button);
        static class _cls7
        {

            static final int $SwitchMap$com$uservoice$uservoicesdk$ui$InstantAnswersAdapter$State[];

            static 
            {
                $SwitchMap$com$uservoice$uservoicesdk$ui$InstantAnswersAdapter$State = new int[State.values().length];
                try
                {
                    $SwitchMap$com$uservoice$uservoicesdk$ui$InstantAnswersAdapter$State[State.INIT.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$uservoice$uservoicesdk$ui$InstantAnswersAdapter$State[State.INIT_LOADING.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$uservoice$uservoicesdk$ui$InstantAnswersAdapter$State[State.INSTANT_ANSWERS.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$uservoice$uservoicesdk$ui$InstantAnswersAdapter$State[State.DETAILS.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        boolean flag2;
        if (state != State.INIT_LOADING)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        button.setEnabled(flag2);
        _cls7..SwitchMap.com.uservoice.uservoicesdk.ui.InstantAnswersAdapter.State[state.ordinal()];
        JVM INSTR tableswitch 1 4: default 116
    //                   1 369
    //                   2 378
    //                   3 387
    //                   4 397;
           goto _L7 _L8 _L9 _L10 _L11
_L7:
        return view;
_L4:
        if (type == BUTTON)
        {
            view = inflater.inflate(com.uservoice.uservoicesdk.R.layout.uv_contact_button_item, null);
            button = (Button)view.findViewById(com.uservoice.uservoicesdk.R.id.uv_contact_button);
            button.setOnClickListener(new android.view.View.OnClickListener() {

                final InstantAnswersAdapter this$0;
                final Button val$button;

                public void onClick(View view1)
                {
                    onButtonTapped(button);
                }

            
            {
                this$0 = InstantAnswersAdapter.this;
                button = button1;
                super();
            }
            });
            continue; /* Loop/switch isn't completed */
        }
        if (type == HEADING)
        {
            view = inflater.inflate(com.uservoice.uservoicesdk.R.layout.uv_header_item, null);
            continue; /* Loop/switch isn't completed */
        }
        if (type == INSTANT_ANSWER)
        {
            view = inflater.inflate(com.uservoice.uservoicesdk.R.layout.uv_instant_answer_item, null);
            continue; /* Loop/switch isn't completed */
        }
        if (type == SPACE)
        {
            view = new LinearLayout(context);
            view.setPadding(0, 30, 0, 0);
            continue; /* Loop/switch isn't completed */
        }
        if (type == TEXT)
        {
            view = inflater.inflate(com.uservoice.uservoicesdk.R.layout.uv_contact_text_item, null);
            button = (EditText)view.findViewById(com.uservoice.uservoicesdk.R.id.uv_text);
            restoreEnteredText(textField, button, "");
            textField = button;
            textField.addTextChangedListener(new TextWatcher() {

                final InstantAnswersAdapter this$0;

                public void afterTextChanged(Editable editable)
                {
                }

                public void beforeTextChanged(CharSequence charsequence, int j, int k, int l)
                {
                }

                public void onTextChanged(CharSequence charsequence, int j, int k, int l)
                {
                    if (state != State.INIT)
                    {
                        state = State.INIT;
                        notifyDataSetChanged();
                    }
                }

            
            {
                this$0 = InstantAnswersAdapter.this;
                super();
            }
            });
            button.setOnTouchListener(new android.view.View.OnTouchListener() {

                final InstantAnswersAdapter this$0;
                final int val$type;

                public boolean onTouch(View view1, MotionEvent motionevent)
                {
                    if (1 == motionevent.getAction())
                    {
                        handleFocus(type);
                    }
                    return false;
                }

            
            {
                this$0 = InstantAnswersAdapter.this;
                type = i;
                super();
            }
            });
            continue; /* Loop/switch isn't completed */
        }
        if (type != EMAIL_FIELD)
        {
            view = button;
            if (type != NAME_FIELD)
            {
                continue; /* Loop/switch isn't completed */
            }
        }
        view = inflater.inflate(com.uservoice.uservoicesdk.R.layout.uv_text_field_item, null);
        continue; /* Loop/switch isn't completed */
_L8:
        button.setText(com.uservoice.uservoicesdk.R.string.uv_next);
        return view;
_L9:
        button.setText(com.uservoice.uservoicesdk.R.string.uv_loading);
        return view;
_L10:
        button.setText(continueButtonMessage);
        return view;
_L11:
        button.setText(getSubmitString());
        if (initialFocusSet) goto _L7; else goto _L12
_L12:
        initialFocusSet = true;
        if (textField == null) goto _L7; else goto _L13
_L13:
        handleFocus(TEXT);
        textField.requestFocus();
        return view;
_L6:
        EditText edittext;
        if (type == INSTANT_ANSWER)
        {
            Utils.displayInstantAnswer(view, (BaseModel)getItem(i));
            button = view.findViewById(com.uservoice.uservoicesdk.R.id.uv_divider);
            if (getRows().lastIndexOf(Integer.valueOf(INSTANT_ANSWER)) == i)
            {
                i = 8;
            } else
            {
                i = 0;
            }
            button.setVisibility(i);
            return view;
        }
        if (type != EMAIL_FIELD && type != NAME_FIELD)
        {
            continue; /* Loop/switch isn't completed */
        }
        button = (FloatLabel)view.findViewById(com.uservoice.uservoicesdk.R.id.uv_header_text);
        edittext = (EditText)view.findViewById(com.uservoice.uservoicesdk.R.id.uv_text_field);
        button.attach(edittext);
        if (type != EMAIL_FIELD) goto _L15; else goto _L14
_L14:
        button.setText(com.uservoice.uservoicesdk.R.string.uv_your_email_address);
        restoreEnteredText(emailField, edittext, Session.getInstance().getConfig().getEmail());
        emailField = edittext;
        edittext.setHint(com.uservoice.uservoicesdk.R.string.uv_your_email_address);
        edittext.setInputType(32);
_L17:
        edittext.setOnTouchListener(new android.view.View.OnTouchListener() {

            final InstantAnswersAdapter this$0;
            final int val$type;

            public boolean onTouch(View view1, MotionEvent motionevent)
            {
                if (1 == motionevent.getAction())
                {
                    handleFocus(type);
                }
                return false;
            }

            
            {
                this$0 = InstantAnswersAdapter.this;
                type = i;
                super();
            }
        });
        return view;
_L15:
        if (type == NAME_FIELD)
        {
            button.setText(com.uservoice.uservoicesdk.R.string.uv_your_name);
            restoreEnteredText(nameField, edittext, Session.getInstance().getConfig().getName());
            nameField = edittext;
            edittext.setHint(com.uservoice.uservoicesdk.R.string.uv_your_name);
            edittext.setInputType(96);
        }
        if (true) goto _L17; else goto _L16
_L16:
        if (type != HEADING) goto _L7; else goto _L18
_L18:
        button = (TextView)view.findViewById(com.uservoice.uservoicesdk.R.id.uv_header_text);
        boolean flag = false;
        i = 0;
        Iterator iterator = instantAnswers.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            BaseModel basemodel = (BaseModel)iterator.next();
            boolean flag1 = flag;
            if (basemodel instanceof Article)
            {
                flag1 = true;
            }
            flag = flag1;
            if (basemodel instanceof Suggestion)
            {
                i = 1;
                flag = flag1;
            }
        } while (true);
        if (flag)
        {
            if (i != 0)
            {
                i = com.uservoice.uservoicesdk.R.string.uv_matching_articles_and_ideas;
            } else
            {
                i = com.uservoice.uservoicesdk.R.string.uv_matching_articles;
            }
        } else
        {
            i = com.uservoice.uservoicesdk.R.string.uv_matching_ideas;
        }
        button.setText(i);
        return view;
        if (true) goto _L2; else goto _L19
_L19:
    }

    public int getViewTypeCount()
    {
        return 8;
    }

    public boolean hasText()
    {
        return textField != null && textField.getText().toString().length() != 0;
    }

    public boolean isEnabled(int i)
    {
        return getItemViewType(i) == INSTANT_ANSWER;
    }

    protected boolean isLoading()
    {
        return Session.getInstance().getClientConfig() == null;
    }

    public void notHelpful()
    {
        if (state == State.INSTANT_ANSWERS)
        {
            state = State.DETAILS;
            notifyDataSetChanged();
        }
    }

    protected void onButtonTapped(Button button)
    {
        if (state != State.INIT) goto _L2; else goto _L1
_L1:
        button = textField.getText().toString().trim();
        if (button.length() != 0) goto _L4; else goto _L3
_L3:
        return;
_L4:
        state = State.INIT_LOADING;
        notifyDataSetChanged();
        Deflection.setSearchText(button);
        Article.loadInstantAnswers(button, new DefaultCallback(context) {

            final InstantAnswersAdapter this$0;

            public volatile void onModel(Object obj)
            {
                onModel((List)obj);
            }

            public void onModel(List list)
            {
                Deflection.trackSearchDeflection(list);
                instantAnswers = list;
                if (instantAnswers.isEmpty())
                {
                    state = State.DETAILS;
                } else
                {
                    state = State.INSTANT_ANSWERS;
                }
                notifyDataSetChanged();
            }

            
            {
                this$0 = InstantAnswersAdapter.this;
                super(context1);
            }
        });
        return;
_L2:
        if (state == State.INSTANT_ANSWERS)
        {
            state = State.DETAILS;
            notifyDataSetChanged();
            return;
        }
        if (state == State.DETAILS)
        {
            doSubmit(button);
            return;
        }
        if (true) goto _L3; else goto _L5
_L5:
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        if (getItemViewType(i) == INSTANT_ANSWER)
        {
            view = (BaseModel)getItem(i);
            adapterview = null;
            boolean flag;
            if (view instanceof Article)
            {
                adapterview = ((Article)view).getTitle();
            } else
            if (view instanceof Suggestion)
            {
                adapterview = ((Suggestion)view).getTitle();
            }
            Deflection.trackDeflection("show", view);
            Utils.showModel(context, view);
            if (!TextUtils.isEmpty(Session.getInstance().getConfig().getGuid()))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            adapterview = (new com.walmartlabs.anivia.AniviaEventAsJson.Builder("pageView")).putString("name", "related help content overlay").putString("section", "user feedback").putString("isSignedIn", Boolean.toString(flag)).putString("articleHeading", adapterview);
            MessageBus.getBus().post(adapterview);
        }
    }

    protected void restoreEnteredText(EditText edittext, EditText edittext1, String s)
    {
        if (edittext != null)
        {
            edittext1.setText(edittext.getText().toString());
            edittext1.setSelection(edittext1.getText().length());
            return;
        } else
        {
            edittext1.setText(s);
            edittext1.setSelection(edittext1.getText().length());
            return;
        }
    }

    public void showInvalidEmailDialog(boolean flag)
    {
        com.walmartlabs.anivia.AniviaEventAsJson.Builder builder;
        int i;
        if (flag)
        {
            i = com.uservoice.uservoicesdk.R.string.uv_msg_user_identity_validation;
        } else
        {
            i = com.uservoice.uservoicesdk.R.string.uv_invalid_email_msg;
        }
        if (!TextUtils.isEmpty(Session.getInstance().getConfig().getGuid()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        builder = (new com.walmartlabs.anivia.AniviaEventAsJson.Builder("pageView")).putString("name", "enter valid email overlay").putString("isSignedIn", Boolean.toString(flag)).putString("section", "user feedback");
        MessageBus.getBus().post(builder);
        (new android.app.AlertDialog.Builder(context)).setCancelable(true).setPositiveButton(0x104000a, null).setMessage(i).show();
    }

}
