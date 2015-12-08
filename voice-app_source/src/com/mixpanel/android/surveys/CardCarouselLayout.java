// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.surveys;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CardCarouselLayout extends ViewGroup
{
    private static class ChoiceAdapter
        implements ListAdapter
    {

        private static final int VIEW_TYPE_FIRST = 0;
        private static final int VIEW_TYPE_LAST = 1;
        private static final int VIEW_TYPE_MAX = 3;
        private static final int VIEW_TYPE_MIDDLE = 2;
        private final List mChoices;
        private final LayoutInflater mInflater;

        public boolean areAllItemsEnabled()
        {
            return true;
        }

        public int getCount()
        {
            return mChoices.size();
        }

        public volatile Object getItem(int i)
        {
            return getItem(i);
        }

        public String getItem(int i)
        {
            return (String)mChoices.get(i);
        }

        public long getItemId(int i)
        {
            return (long)i;
        }

        public int getItemViewType(int i)
        {
            if (i == 0)
            {
                return 0;
            }
            return i != mChoices.size() - 1 ? 2 : 1;
        }

        public View getView(int i, View view, ViewGroup viewgroup)
        {
            View view1;
            int j;
            j = -1;
            view1 = view;
            if (view != null) goto _L2; else goto _L1
_L1:
            getItemViewType(i);
            JVM INSTR tableswitch 0 2: default 40
        //                       0 83
        //                       1 91
        //                       2 99;
               goto _L3 _L4 _L5 _L6
_L3:
            view1 = mInflater.inflate(j, viewgroup, false);
_L2:
            ((TextView)view1.findViewById(com.mixpanel.android.R.id.com_mixpanel_android_multiple_choice_answer_text)).setText((String)mChoices.get(i));
            return view1;
_L4:
            j = com.mixpanel.android.R.layout.com_mixpanel_android_first_choice_answer;
            continue; /* Loop/switch isn't completed */
_L5:
            j = com.mixpanel.android.R.layout.com_mixpanel_android_last_choice_answer;
            continue; /* Loop/switch isn't completed */
_L6:
            j = com.mixpanel.android.R.layout.com_mixpanel_android_middle_choice_answer;
            if (true) goto _L3; else goto _L7
_L7:
        }

        public int getViewTypeCount()
        {
            return 3;
        }

        public boolean hasStableIds()
        {
            return true;
        }

        public boolean isEmpty()
        {
            return mChoices.isEmpty();
        }

        public boolean isEnabled(int i)
        {
            return true;
        }

        public void registerDataSetObserver(DataSetObserver datasetobserver)
        {
        }

        public void unregisterDataSetObserver(DataSetObserver datasetobserver)
        {
        }

        public ChoiceAdapter(List list, LayoutInflater layoutinflater)
        {
            mChoices = list;
            mInflater = layoutinflater;
        }
    }

    public static final class Direction extends Enum
    {

        public static final Direction BACKWARD;
        private static final Direction ENUM$VALUES[];
        public static final Direction FORWARD;

        public static Direction valueOf(String s)
        {
            return (Direction)Enum.valueOf(com/mixpanel/android/surveys/CardCarouselLayout$Direction, s);
        }

        public static Direction[] values()
        {
            Direction adirection[] = ENUM$VALUES;
            int i = adirection.length;
            Direction adirection1[] = new Direction[i];
            System.arraycopy(adirection, 0, adirection1, 0, i);
            return adirection1;
        }

        static 
        {
            FORWARD = new Direction("FORWARD", 0);
            BACKWARD = new Direction("BACKWARD", 1);
            ENUM$VALUES = (new Direction[] {
                FORWARD, BACKWARD
            });
        }

        private Direction(String s, int i)
        {
            super(s, i);
        }
    }

    public static interface OnQuestionAnsweredListener
    {

        public abstract void onQuestionAnswered(com.mixpanel.android.mpmetrics.Survey.Question question, String s);
    }

    private class QuestionCard
    {

        private final View mCardView;
        private final ListView mChoiceView;
        private final TextView mEditAnswerView;
        private final TextView mPromptView;
        private com.mixpanel.android.mpmetrics.Survey.Question mQuestion;
        final CardCarouselLayout this$0;

        public View getView()
        {
            return mCardView;
        }

        public void showQuestionOnCard(com.mixpanel.android.mpmetrics.Survey.Question question, String s)
            throws UnrecognizedAnswerTypeException
        {
            InputMethodManager inputmethodmanager;
            com.mixpanel.android.mpmetrics.Survey.QuestionType questiontype;
            mQuestion = question;
            mPromptView.setText(mQuestion.getPrompt());
            inputmethodmanager = (InputMethodManager)mCardView.getContext().getSystemService("input_method");
            questiontype = question.getType();
            if (com.mixpanel.android.mpmetrics.Survey.QuestionType.TEXT != questiontype) goto _L2; else goto _L1
_L1:
            mChoiceView.setVisibility(8);
            mEditAnswerView.setVisibility(0);
            if (s != null)
            {
                mEditAnswerView.setText(s);
            }
            if (getResources().getConfiguration().orientation == 1)
            {
                mEditAnswerView.requestFocus();
                inputmethodmanager.showSoftInput(mEditAnswerView, 0);
            } else
            {
                inputmethodmanager.hideSoftInputFromWindow(mCardView.getWindowToken(), 0);
            }
_L4:
            mCardView.invalidate();
            return;
_L2:
            if (com.mixpanel.android.mpmetrics.Survey.QuestionType.MULTIPLE_CHOICE != questiontype)
            {
                break; /* Loop/switch isn't completed */
            }
            inputmethodmanager.hideSoftInputFromWindow(mCardView.getWindowToken(), 0);
            mChoiceView.setVisibility(0);
            mEditAnswerView.setVisibility(8);
            question = new ChoiceAdapter(question.getChoices(), LayoutInflater.from(getContext()));
            mChoiceView.setAdapter(question);
            mChoiceView.clearChoices();
            if (s != null)
            {
                int i = 0;
                while (i < question.getCount()) 
                {
                    if (question.getItem(i).equals(s))
                    {
                        mChoiceView.setItemChecked(i, true);
                    }
                    i++;
                }
            }
            if (true) goto _L4; else goto _L3
_L3:
            throw new UnrecognizedAnswerTypeException((new StringBuilder("No way to display question type ")).append(questiontype).toString(), null);
        }



        public QuestionCard(View view)
        {
            this$0 = CardCarouselLayout.this;
            super();
            mCardView = view;
            mPromptView = (TextView)view.findViewWithTag("com_mixpanel_android_TAG_prompt_text");
            mEditAnswerView = (EditText)view.findViewWithTag("com_mixpanel_android_TAG_text_answer");
            mChoiceView = (ListView)view.findViewWithTag("com_mixpanel_android_TAG_choice_list");
            mEditAnswerView.setText("");
            mEditAnswerView.setOnEditorActionListener(new _cls1());
            mChoiceView.setOnItemClickListener(new _cls2());
        }
    }

    public static class UnrecognizedAnswerTypeException extends Exception
    {

        private static final long serialVersionUID = 0xac2c3044c7bf6078L;

        private UnrecognizedAnswerTypeException(String s)
        {
            super(s);
        }

        UnrecognizedAnswerTypeException(String s, UnrecognizedAnswerTypeException unrecognizedanswertypeexception)
        {
            this(s);
        }
    }


    private static int $SWITCH_TABLE$com$mixpanel$android$surveys$CardCarouselLayout$Direction[];
    private static final long ANIMATION_DURATION_MILLIS = 330L;
    private static final long ANIMATION_ROTATION_MILLIS = 198L;
    private static int EXIT_ANGLE = 45;
    private static float EXIT_ROTATION_CENTER_X = 0.5F;
    private static float EXIT_ROTATION_CENTER_Y = 0.5F;
    private static float EXIT_SIZE = 0.8F;
    private QuestionCard mBackupCard;
    private OnQuestionAnsweredListener mListener;
    private final List mMatchParentChildren;
    private QuestionCard mVisibleCard;

    static int[] $SWITCH_TABLE$com$mixpanel$android$surveys$CardCarouselLayout$Direction()
    {
        int ai[] = $SWITCH_TABLE$com$mixpanel$android$surveys$CardCarouselLayout$Direction;
        if (ai != null)
        {
            return ai;
        }
        ai = new int[Direction.values().length];
        try
        {
            ai[Direction.BACKWARD.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            ai[Direction.FORWARD.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror) { }
        $SWITCH_TABLE$com$mixpanel$android$surveys$CardCarouselLayout$Direction = ai;
        return ai;
    }

    public CardCarouselLayout(Context context)
    {
        super(context);
        mMatchParentChildren = new ArrayList(1);
        mListener = null;
        initCards(context);
    }

    public CardCarouselLayout(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        mMatchParentChildren = new ArrayList(1);
        mListener = null;
        initCards(context);
    }

    public CardCarouselLayout(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        mMatchParentChildren = new ArrayList(1);
        mListener = null;
        initCards(context);
    }

    private Animation enterLeft()
    {
        AnimationSet animationset = new AnimationSet(false);
        Object obj = new RotateAnimation(-EXIT_ANGLE, 0.0F, 1, EXIT_ROTATION_CENTER_X, 1, EXIT_ROTATION_CENTER_Y);
        ((RotateAnimation) (obj)).setDuration(198L);
        animationset.addAnimation(((Animation) (obj)));
        obj = new ScaleAnimation(EXIT_SIZE, 1.0F, EXIT_SIZE, 1.0F, 1, EXIT_ROTATION_CENTER_X, 1, EXIT_ROTATION_CENTER_Y);
        ((ScaleAnimation) (obj)).setDuration(198L);
        animationset.addAnimation(((Animation) (obj)));
        obj = new TranslateAnimation(2, -1.3F, 2, 0.0F, 2, 0.0F, 2, 0.0F);
        ((TranslateAnimation) (obj)).setDuration(330L);
        animationset.addAnimation(((Animation) (obj)));
        return animationset;
    }

    private Animation enterRight()
    {
        AnimationSet animationset = new AnimationSet(false);
        Object obj = new RotateAnimation(EXIT_ANGLE, 0.0F, 1, EXIT_ROTATION_CENTER_X, 1, EXIT_ROTATION_CENTER_Y);
        ((RotateAnimation) (obj)).setDuration(198L);
        animationset.addAnimation(((Animation) (obj)));
        obj = new ScaleAnimation(EXIT_SIZE, 1.0F, EXIT_SIZE, 1.0F, 1, EXIT_ROTATION_CENTER_X, 1, EXIT_ROTATION_CENTER_Y);
        ((ScaleAnimation) (obj)).setDuration(198L);
        animationset.addAnimation(((Animation) (obj)));
        obj = new TranslateAnimation(2, 1.3F, 2, 0.0F, 2, 0.0F, 2, 0.0F);
        ((TranslateAnimation) (obj)).setDuration(330L);
        animationset.addAnimation(((Animation) (obj)));
        return animationset;
    }

    private Animation exitLeft()
    {
        AnimationSet animationset = new AnimationSet(false);
        Object obj = new RotateAnimation(0.0F, -EXIT_ANGLE, 1, EXIT_ROTATION_CENTER_X, 1, EXIT_ROTATION_CENTER_Y);
        ((RotateAnimation) (obj)).setDuration(330L);
        ((RotateAnimation) (obj)).setStartOffset(132L);
        animationset.addAnimation(((Animation) (obj)));
        obj = new ScaleAnimation(1.0F, EXIT_SIZE, 1.0F, EXIT_SIZE, 1, EXIT_ROTATION_CENTER_X, 1, EXIT_ROTATION_CENTER_Y);
        ((ScaleAnimation) (obj)).setDuration(330L);
        ((ScaleAnimation) (obj)).setStartOffset(132L);
        animationset.addAnimation(((Animation) (obj)));
        obj = new TranslateAnimation(2, -1F, 2, -2.3F, 2, 0.0F, 2, 0.0F);
        ((TranslateAnimation) (obj)).setInterpolator(new AccelerateInterpolator());
        ((TranslateAnimation) (obj)).setDuration(330L);
        animationset.addAnimation(((Animation) (obj)));
        return animationset;
    }

    private Animation exitRight()
    {
        AnimationSet animationset = new AnimationSet(false);
        Object obj = new RotateAnimation(0.0F, EXIT_ANGLE, 1, EXIT_ROTATION_CENTER_X, 1, EXIT_ROTATION_CENTER_Y);
        ((RotateAnimation) (obj)).setDuration(198L);
        ((RotateAnimation) (obj)).setStartOffset(132L);
        animationset.addAnimation(((Animation) (obj)));
        obj = new ScaleAnimation(1.0F, EXIT_SIZE, 1.0F, EXIT_SIZE, 1, EXIT_ROTATION_CENTER_X, 1, EXIT_ROTATION_CENTER_Y);
        ((ScaleAnimation) (obj)).setDuration(198L);
        ((ScaleAnimation) (obj)).setStartOffset(132L);
        animationset.addAnimation(((Animation) (obj)));
        obj = new TranslateAnimation(2, -1F, 2, 0.3F, 2, 0.0F, 2, 0.0F);
        ((TranslateAnimation) (obj)).setInterpolator(new AccelerateInterpolator());
        ((TranslateAnimation) (obj)).setDuration(330L);
        animationset.addAnimation(((Animation) (obj)));
        return animationset;
    }

    private void initCards(Context context)
    {
        Object obj = LayoutInflater.from(context);
        context = ((LayoutInflater) (obj)).inflate(com.mixpanel.android.R.layout.com_mixpanel_android_question_card, this, false);
        mVisibleCard = new QuestionCard(context);
        obj = ((LayoutInflater) (obj)).inflate(com.mixpanel.android.R.layout.com_mixpanel_android_question_card, this, false);
        mBackupCard = new QuestionCard(((View) (obj)));
        addView(context);
        addView(((View) (obj)));
    }

    public void moveTo(com.mixpanel.android.mpmetrics.Survey.Question question, String s, Direction direction)
        throws UnrecognizedAnswerTypeException
    {
        final View viewShowing;
        View view;
        viewShowing = mBackupCard;
        mBackupCard = mVisibleCard;
        mVisibleCard = viewShowing;
        mVisibleCard.showQuestionOnCard(question, s);
        viewShowing = mBackupCard.getView();
        view = mVisibleCard.getView();
        viewShowing.setVisibility(0);
        view.setVisibility(0);
        s = null;
        question = null;
        $SWITCH_TABLE$com$mixpanel$android$surveys$CardCarouselLayout$Direction()[direction.ordinal()];
        JVM INSTR tableswitch 1 2: default 92
    //                   1 123
    //                   2 136;
           goto _L1 _L2 _L3
_L1:
        s.setAnimationListener(new android.view.animation.Animation.AnimationListener() {

            final CardCarouselLayout this$0;
            private final View val$viewShowing;

            public void onAnimationEnd(Animation animation)
            {
                viewShowing.setVisibility(8);
            }

            public void onAnimationRepeat(Animation animation)
            {
            }

            public void onAnimationStart(Animation animation)
            {
            }

            
            {
                this$0 = CardCarouselLayout.this;
                viewShowing = view;
                super();
            }
        });
        viewShowing.startAnimation(s);
        view.startAnimation(question);
        invalidate();
        return;
_L2:
        s = exitLeft();
        question = enterRight();
        continue; /* Loop/switch isn't completed */
_L3:
        s = exitRight();
        question = enterLeft();
        if (true) goto _L1; else goto _L4
_L4:
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        View view = mVisibleCard.getView();
        i = 0;
        if (view.getVisibility() != 8)
        {
            i = view.getMeasuredWidth();
            view.layout(0, 0, i, view.getMeasuredHeight());
        }
        view = mBackupCard.getView();
        if (view.getVisibility() != 8)
        {
            view.layout(i, 0, i + view.getMeasuredWidth(), view.getMeasuredHeight());
        }
    }

    protected void onMeasure(int i, int j)
    {
        Object obj;
        int k;
        int i1;
        int i2;
        int j2;
        int k2 = getChildCount();
        if (android.view.View.MeasureSpec.getMode(i) == 0x40000000 && android.view.View.MeasureSpec.getMode(j) == 0x40000000)
        {
            k = 0;
        } else
        {
            k = 1;
        }
        mMatchParentChildren.clear();
        j2 = 0;
        i1 = 0;
        i2 = 0;
_L3:
        if (i2 < k2) goto _L2; else goto _L1
_L1:
        k = Math.max(j2, getSuggestedMinimumHeight());
        setMeasuredDimension(resolveSize(Math.max(i1, getSuggestedMinimumWidth()), i), resolveSize(k, j));
        obj = mMatchParentChildren.iterator();
_L4:
        if (!((Iterator) (obj)).hasNext())
        {
            return;
        }
        break MISSING_BLOCK_LABEL_263;
_L2:
        int k1;
        int l1;
label0:
        {
            obj = getChildAt(i2);
            k1 = j2;
            l1 = i1;
            if (((View) (obj)).getVisibility() == 8)
            {
                break label0;
            }
            android.view.ViewGroup.LayoutParams layoutparams = ((View) (obj)).getLayoutParams();
            ((View) (obj)).measure(getChildMeasureSpec(i, 0, layoutparams.width), getChildMeasureSpec(j, 0, layoutparams.height));
            i1 = Math.max(i1, ((View) (obj)).getMeasuredWidth());
            j2 = Math.max(j2, ((View) (obj)).getMeasuredHeight());
            k1 = j2;
            l1 = i1;
            if (k == 0)
            {
                break label0;
            }
            if (layoutparams.width != -1)
            {
                k1 = j2;
                l1 = i1;
                if (layoutparams.height != -1)
                {
                    break label0;
                }
            }
            mMatchParentChildren.add(obj);
            l1 = i1;
            k1 = j2;
        }
        i2++;
        j2 = k1;
        i1 = l1;
          goto _L3
        View view = (View)((Iterator) (obj)).next();
        android.view.ViewGroup.LayoutParams layoutparams1 = view.getLayoutParams();
        int l;
        int j1;
        if (layoutparams1.width == -1)
        {
            l = android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0x40000000);
        } else
        {
            l = getChildMeasureSpec(i, 0, layoutparams1.width);
        }
        if (layoutparams1.height == -1)
        {
            j1 = android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0x40000000);
        } else
        {
            j1 = getChildMeasureSpec(j, 0, layoutparams1.height);
        }
        view.measure(l, j1);
          goto _L4
    }

    public void replaceTo(com.mixpanel.android.mpmetrics.Survey.Question question, String s)
        throws UnrecognizedAnswerTypeException
    {
        mVisibleCard.showQuestionOnCard(question, s);
        removeAllViews();
        addView(mVisibleCard.getView());
        addView(mBackupCard.getView());
        invalidate();
    }

    public void setOnQuestionAnsweredListener(OnQuestionAnsweredListener onquestionansweredlistener)
    {
        mListener = onquestionansweredlistener;
    }

    public boolean shouldDelayChildPressedState()
    {
        return false;
    }



    // Unreferenced inner class com/mixpanel/android/surveys/CardCarouselLayout$QuestionCard$1

/* anonymous class */
    class QuestionCard._cls1
        implements android.widget.TextView.OnEditorActionListener
    {

        final QuestionCard this$1;

        public boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
        {
            boolean flag1 = false;
            boolean flag;
            if (keyevent != null && keyevent.getKeyCode() == 66 && keyevent.getAction() == 0 && (keyevent.getFlags() & 0x20) == 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag || i == 6)
            {
                textview.clearComposingText();
                if (mListener != null)
                {
                    textview = textview.getText().toString();
                    mListener.onQuestionAnswered(mQuestion, textview);
                }
                flag1 = true;
            }
            return flag1;
        }

            
            {
                this$1 = QuestionCard.this;
                super();
            }
    }


    // Unreferenced inner class com/mixpanel/android/surveys/CardCarouselLayout$QuestionCard$2

/* anonymous class */
    class QuestionCard._cls2
        implements android.widget.AdapterView.OnItemClickListener
    {

        final QuestionCard this$1;

        public void onItemClick(AdapterView adapterview, View view, int i, long l)
        {
            if (mListener != null)
            {
                adapterview = adapterview.getItemAtPosition(i).toString();
                postDelayed(adapterview. new Runnable() {

                    final QuestionCard._cls2 this$2;
                    private final String val$answer;

                    public void run()
                    {
    class QuestionCard._cls2
        implements android.widget.AdapterView.OnItemClickListener
    {
                        mListener.onQuestionAnswered(mQuestion, answer);
                    }

            
            {
                this$2 = final__pcls2;
                answer = String.this;
                super();
            }
                }, 165L);
            }
        }


            
            {
                this$1 = QuestionCard.this;
                super();
            }
    }

}
