// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.surveys;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.mixpanel.android.mpmetrics.InAppNotification;
import com.mixpanel.android.mpmetrics.MPConfig;
import com.mixpanel.android.mpmetrics.MixpanelAPI;
import com.mixpanel.android.mpmetrics.Survey;
import com.mixpanel.android.mpmetrics.UpdateDisplayState;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.mixpanel.android.surveys:
//            FadingImageView, CardCarouselLayout

public class SurveyActivity extends Activity
{

    private static final String CURRENT_QUESTION_BUNDLE_KEY = "com.mixpanel.android.surveys.SurveyActivity.CURRENT_QUESTION_BUNDLE_KEY";
    private static final int GRAY_30PERCENT = Color.argb(255, 90, 90, 90);
    public static final String INTENT_ID_KEY = "com.mixpanel.android.surveys.SurveyActivity.INTENT_ID_KEY";
    private static final String LOGTAG = "MixpanelAPI.SrvyActvty";
    private static final int SHADOW_SIZE_THRESHOLD_PX = 100;
    private static final String SURVEY_BEGUN_BUNDLE_KEY = "com.mixpanel.android.surveys.SurveyActivity.SURVEY_BEGIN_BUNDLE_KEY";
    private static final String SURVEY_STATE_BUNDLE_KEY = "com.mixpanel.android.surveys.SurveyActivity.SURVEY_STATE_BUNDLE_KEY";
    private CardCarouselLayout mCardHolder;
    private int mCurrentQuestion;
    private AlertDialog mDialog;
    private int mIntentId;
    private MixpanelAPI mMixpanel;
    private View mNextButton;
    private View mPreviousButton;
    private TextView mProgressTextView;
    private boolean mSurveyBegun;
    private UpdateDisplayState mUpdateDisplayState;

    public SurveyActivity()
    {
        mSurveyBegun = false;
        mCurrentQuestion = 0;
        mIntentId = -1;
    }

    private void completeSurvey()
    {
        finish();
    }

    private com.mixpanel.android.mpmetrics.UpdateDisplayState.DisplayState.SurveyState getSurveyState()
    {
        return (com.mixpanel.android.mpmetrics.UpdateDisplayState.DisplayState.SurveyState)mUpdateDisplayState.getDisplayState();
    }

    private void goToNextQuestion()
    {
        int i = getSurveyState().getSurvey().getQuestions().size();
        if (mCurrentQuestion < i - 1)
        {
            showQuestion(mCurrentQuestion + 1);
            return;
        } else
        {
            completeSurvey();
            return;
        }
    }

    private void goToPreviousQuestion()
    {
        if (mCurrentQuestion > 0)
        {
            showQuestion(mCurrentQuestion - 1);
            return;
        } else
        {
            completeSurvey();
            return;
        }
    }

    private boolean isShowingInApp()
    {
        if (mUpdateDisplayState == null)
        {
            return false;
        } else
        {
            return "InAppNotificationState".equals(mUpdateDisplayState.getDisplayState().getType());
        }
    }

    private boolean isShowingSurvey()
    {
        if (mUpdateDisplayState == null)
        {
            return false;
        } else
        {
            return "SurveyState".equals(mUpdateDisplayState.getDisplayState().getType());
        }
    }

    private void onCreateInAppNotification(Bundle bundle)
    {
        Object obj;
        Object obj1;
        setContentView(com.mixpanel.android.R.layout.com_mixpanel_android_activity_notification_full);
        obj1 = (ImageView)findViewById(com.mixpanel.android.R.id.com_mixpanel_android_notification_gradient);
        obj = (FadingImageView)findViewById(com.mixpanel.android.R.id.com_mixpanel_android_notification_image);
        bundle = (TextView)findViewById(com.mixpanel.android.R.id.com_mixpanel_android_notification_title);
        TextView textview = (TextView)findViewById(com.mixpanel.android.R.id.com_mixpanel_android_notification_subtext);
        Button button = (Button)findViewById(com.mixpanel.android.R.id.com_mixpanel_android_notification_button);
        LinearLayout linearlayout = (LinearLayout)findViewById(com.mixpanel.android.R.id.com_mixpanel_android_button_exit_wrapper);
        final InAppNotification inApp = ((com.mixpanel.android.mpmetrics.UpdateDisplayState.DisplayState.InAppNotificationState)mUpdateDisplayState.getDisplayState()).getInAppNotification();
        Object obj2 = getWindowManager().getDefaultDisplay();
        Point point = new Point();
        ((Display) (obj2)).getSize(point);
        if (getResources().getConfiguration().orientation == 1)
        {
            obj2 = (android.widget.RelativeLayout.LayoutParams)linearlayout.getLayoutParams();
            ((android.widget.RelativeLayout.LayoutParams) (obj2)).setMargins(0, 0, 0, (int)((float)point.y * 0.06F));
            linearlayout.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj2)));
        }
        obj2 = new GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.LEFT_RIGHT, new int[] {
            0xe560607c, 0xe548485d, 0xe518181f, 0xe518181f
        });
        ((GradientDrawable) (obj2)).setGradientType(1);
        if (getResources().getConfiguration().orientation == 2)
        {
            ((GradientDrawable) (obj2)).setGradientCenter(0.25F, 0.5F);
            ((GradientDrawable) (obj2)).setGradientRadius((float)Math.min(point.x, point.y) * 0.8F);
        } else
        {
            ((GradientDrawable) (obj2)).setGradientCenter(0.5F, 0.33F);
            ((GradientDrawable) (obj2)).setGradientRadius((float)Math.min(point.x, point.y) * 0.7F);
        }
        setViewBackground(((View) (obj1)), ((Drawable) (obj2)));
        bundle.setText(inApp.getTitle());
        textview.setText(inApp.getBody());
        obj1 = inApp.getImage();
        ((FadingImageView) (obj)).setBackgroundResource(com.mixpanel.android.R.drawable.com_mixpanel_android_square_dropshadow);
        if (((Bitmap) (obj1)).getWidth() >= 100 && ((Bitmap) (obj1)).getHeight() >= 100) goto _L2; else goto _L1
_L1:
        ((FadingImageView) (obj)).setBackgroundResource(com.mixpanel.android.R.drawable.com_mixpanel_android_square_nodropshadow);
_L4:
        ((FadingImageView) (obj)).setImageBitmap(((Bitmap) (obj1)));
        obj1 = inApp.getCallToActionUrl();
        if (obj1 != null && ((String) (obj1)).length() > 0)
        {
            button.setText(inApp.getCallToAction());
        }
        button.setOnClickListener(new android.view.View.OnClickListener() {

            final SurveyActivity this$0;
            private final InAppNotification val$inApp;

            public void onClick(View view)
            {
                view = inApp.getCallToActionUrl();
                if (view != null && view.length() > 0)
                {
                    try
                    {
                        view = Uri.parse(view);
                    }
                    // Misplaced declaration of an exception variable
                    catch (View view)
                    {
                        Log.i("MixpanelAPI.SrvyActvty", "Can't parse notification URI, will not take any action", view);
                        return;
                    }
                    try
                    {
                        view = new Intent("android.intent.action.VIEW", view);
                        startActivity(view);
                        mMixpanel.getPeople().trackNotification("$campaign_open", inApp);
                    }
                    // Misplaced declaration of an exception variable
                    catch (View view)
                    {
                        Log.i("MixpanelAPI.SrvyActvty", "User doesn't have an activity for notification URI");
                    }
                }
                finish();
                UpdateDisplayState.releaseDisplayState(mIntentId);
            }

            
            {
                this$0 = SurveyActivity.this;
                inApp = inappnotification;
                super();
            }
        });
        button.setOnTouchListener(new android.view.View.OnTouchListener() {

            final SurveyActivity this$0;

            public boolean onTouch(View view, MotionEvent motionevent)
            {
                if (motionevent.getAction() == 0)
                {
                    view.setBackgroundResource(com.mixpanel.android.R.drawable.com_mixpanel_android_cta_button_highlight);
                } else
                {
                    view.setBackgroundResource(com.mixpanel.android.R.drawable.com_mixpanel_android_cta_button);
                }
                return false;
            }

            
            {
                this$0 = SurveyActivity.this;
                super();
            }
        });
        linearlayout.setOnClickListener(new android.view.View.OnClickListener() {

            final SurveyActivity this$0;

            public void onClick(View view)
            {
                finish();
                UpdateDisplayState.releaseDisplayState(mIntentId);
            }

            
            {
                this$0 = SurveyActivity.this;
                super();
            }
        });
        inApp = new ScaleAnimation(0.95F, 1.0F, 0.95F, 1.0F, 1, 0.5F, 1, 1.0F);
        inApp.setDuration(200L);
        ((FadingImageView) (obj)).startAnimation(inApp);
        obj = new TranslateAnimation(1, 0.0F, 1, 0.0F, 1, 0.5F, 1, 0.0F);
        ((TranslateAnimation) (obj)).setInterpolator(new DecelerateInterpolator());
        ((TranslateAnimation) (obj)).setDuration(200L);
        bundle.startAnimation(((android.view.animation.Animation) (obj)));
        textview.startAnimation(((android.view.animation.Animation) (obj)));
        button.startAnimation(((android.view.animation.Animation) (obj)));
        linearlayout.startAnimation(AnimationUtils.loadAnimation(this, com.mixpanel.android.R.anim.com_mixpanel_android_fade_in));
        return;
_L2:
        if (Color.alpha(Bitmap.createScaledBitmap(((Bitmap) (obj1)), 1, 1, false).getPixel(0, 0)) < 255)
        {
            ((FadingImageView) (obj)).setBackgroundResource(com.mixpanel.android.R.drawable.com_mixpanel_android_square_nodropshadow);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void onCreateSurvey(Bundle bundle)
    {
        requestOrientationLock();
        if (bundle != null)
        {
            mCurrentQuestion = bundle.getInt("com.mixpanel.android.surveys.SurveyActivity.CURRENT_QUESTION_BUNDLE_KEY", 0);
            mSurveyBegun = bundle.getBoolean("com.mixpanel.android.surveys.SurveyActivity.SURVEY_BEGIN_BUNDLE_KEY");
        }
        if (mUpdateDisplayState.getDistinctId() == null)
        {
            Log.i("MixpanelAPI.SrvyActvty", "Can't show a survey to a user with no distinct id set");
            finish();
            return;
        }
        setContentView(com.mixpanel.android.R.layout.com_mixpanel_android_activity_survey);
        bundle = getSurveyState().getBackground();
        if (bundle == null)
        {
            findViewById(com.mixpanel.android.R.id.com_mixpanel_android_activity_survey_id).setBackgroundColor(GRAY_30PERCENT);
        } else
        {
            getWindow().setBackgroundDrawable(new BitmapDrawable(getResources(), bundle));
        }
        mPreviousButton = findViewById(com.mixpanel.android.R.id.com_mixpanel_android_button_previous);
        mNextButton = findViewById(com.mixpanel.android.R.id.com_mixpanel_android_button_next);
        mProgressTextView = (TextView)findViewById(com.mixpanel.android.R.id.com_mixpanel_android_progress_text);
        mCardHolder = (CardCarouselLayout)findViewById(com.mixpanel.android.R.id.com_mixpanel_android_question_card_holder);
        mCardHolder.setOnQuestionAnsweredListener(new CardCarouselLayout.OnQuestionAnsweredListener() {

            final SurveyActivity this$0;

            public void onQuestionAnswered(com.mixpanel.android.mpmetrics.Survey.Question question, String s)
            {
                saveAnswer(question, s);
                goToNextQuestion();
            }

            
            {
                this$0 = SurveyActivity.this;
                super();
            }
        });
    }

    private void onDestroySurvey()
    {
        if (mMixpanel == null) goto _L2; else goto _L1
_L1:
        if (mUpdateDisplayState == null) goto _L4; else goto _L3
_L3:
        Survey survey;
        Object obj;
        Object obj1;
        Object obj2;
        obj1 = getSurveyState();
        survey = ((com.mixpanel.android.mpmetrics.UpdateDisplayState.DisplayState.SurveyState) (obj1)).getSurvey();
        obj2 = survey.getQuestions();
        obj = mUpdateDisplayState.getDistinctId();
        obj = mMixpanel.getPeople().withIdentity(((String) (obj)));
        ((com.mixpanel.android.mpmetrics.MixpanelAPI.People) (obj)).append("$responses", Integer.valueOf(survey.getCollectionId()));
        obj1 = ((com.mixpanel.android.mpmetrics.UpdateDisplayState.DisplayState.SurveyState) (obj1)).getAnswers();
        obj2 = ((List) (obj2)).iterator();
_L7:
        if (((Iterator) (obj2)).hasNext()) goto _L5; else goto _L4
_L4:
        mMixpanel.flush();
_L2:
        UpdateDisplayState.releaseDisplayState(mIntentId);
        return;
_L5:
        Object obj3 = (com.mixpanel.android.mpmetrics.Survey.Question)((Iterator) (obj2)).next();
        String s = ((com.mixpanel.android.mpmetrics.UpdateDisplayState.AnswerMap) (obj1)).get(Integer.valueOf(((com.mixpanel.android.mpmetrics.Survey.Question) (obj3)).getId()));
        if (s != null)
        {
            try
            {
                JSONObject jsonobject = new JSONObject();
                jsonobject.put("$survey_id", survey.getId());
                jsonobject.put("$collection_id", survey.getCollectionId());
                jsonobject.put("$question_id", ((com.mixpanel.android.mpmetrics.Survey.Question) (obj3)).getId());
                jsonobject.put("$question_type", ((com.mixpanel.android.mpmetrics.Survey.Question) (obj3)).getType().toString());
                obj3 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
                ((DateFormat) (obj3)).setTimeZone(TimeZone.getTimeZone("UTC"));
                jsonobject.put("$time", ((DateFormat) (obj3)).format(new Date()));
                jsonobject.put("$value", s);
                ((com.mixpanel.android.mpmetrics.MixpanelAPI.People) (obj)).append("$answers", jsonobject);
            }
            catch (JSONException jsonexception)
            {
                Log.e("MixpanelAPI.SrvyActvty", "Couldn't record user's answer.", jsonexception);
            }
        }
        if (true) goto _L7; else goto _L6
_L6:
    }

    private void onSaveInstanceStateSurvey(Bundle bundle)
    {
        bundle.putBoolean("com.mixpanel.android.surveys.SurveyActivity.SURVEY_BEGIN_BUNDLE_KEY", mSurveyBegun);
        bundle.putInt("com.mixpanel.android.surveys.SurveyActivity.CURRENT_QUESTION_BUNDLE_KEY", mCurrentQuestion);
        bundle.putParcelable("com.mixpanel.android.surveys.SurveyActivity.SURVEY_STATE_BUNDLE_KEY", mUpdateDisplayState);
    }

    private void onStartSurvey()
    {
        if (mSurveyBegun)
        {
            return;
        }
        if (!MPConfig.getInstance(this).getTestMode())
        {
            trackSurveyAttempted();
        }
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(this);
        builder.setTitle(com.mixpanel.android.R.string.com_mixpanel_android_survey_prompt_dialog_title);
        builder.setMessage(com.mixpanel.android.R.string.com_mixpanel_android_survey_prompt_dialog_message);
        builder.setPositiveButton(com.mixpanel.android.R.string.com_mixpanel_android_sure, new android.content.DialogInterface.OnClickListener() {

            final SurveyActivity this$0;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                findViewById(com.mixpanel.android.R.id.com_mixpanel_android_activity_survey_id).setVisibility(0);
                mSurveyBegun = true;
                showQuestion(mCurrentQuestion);
            }

            
            {
                this$0 = SurveyActivity.this;
                super();
            }
        });
        builder.setNegativeButton(com.mixpanel.android.R.string.com_mixpanel_android_no_thanks, new android.content.DialogInterface.OnClickListener() {

            final SurveyActivity this$0;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                finish();
            }

            
            {
                this$0 = SurveyActivity.this;
                super();
            }
        });
        builder.setCancelable(false);
        mDialog = builder.create();
        mDialog.show();
    }

    private void requestOrientationLock()
    {
        if (android.os.Build.VERSION.SDK_INT >= 18)
        {
            setRequestedOrientation(14);
        } else
        {
            int i = getResources().getConfiguration().orientation;
            if (i == 2)
            {
                setRequestedOrientation(0);
                return;
            }
            if (i == 1)
            {
                setRequestedOrientation(1);
                return;
            }
        }
    }

    private void saveAnswer(com.mixpanel.android.mpmetrics.Survey.Question question, String s)
    {
        getSurveyState().getAnswers().put(Integer.valueOf(question.getId()), s.toString());
    }

    private void setViewBackground(View view, Drawable drawable)
    {
        if (android.os.Build.VERSION.SDK_INT < 16)
        {
            view.setBackgroundDrawable(drawable);
            return;
        } else
        {
            view.setBackground(drawable);
            return;
        }
    }

    private void showQuestion(int i)
    {
        com.mixpanel.android.mpmetrics.Survey.Question question;
        Object obj;
        int j;
        obj = getSurveyState();
        List list = ((com.mixpanel.android.mpmetrics.UpdateDisplayState.DisplayState.SurveyState) (obj)).getSurvey().getQuestions();
        if (i == 0 || list.size() == 0)
        {
            mPreviousButton.setEnabled(false);
        } else
        {
            mPreviousButton.setEnabled(true);
        }
        if (i >= list.size() - 1)
        {
            mNextButton.setEnabled(false);
        } else
        {
            mNextButton.setEnabled(true);
        }
        j = mCurrentQuestion;
        mCurrentQuestion = i;
        question = (com.mixpanel.android.mpmetrics.Survey.Question)list.get(i);
        obj = ((com.mixpanel.android.mpmetrics.UpdateDisplayState.DisplayState.SurveyState) (obj)).getAnswers().get(Integer.valueOf(question.getId()));
        if (j >= i) goto _L2; else goto _L1
_L1:
        try
        {
            mCardHolder.moveTo(question, ((String) (obj)), CardCarouselLayout.Direction.FORWARD);
        }
        catch (CardCarouselLayout.UnrecognizedAnswerTypeException unrecognizedanswertypeexception)
        {
            goToNextQuestion();
            return;
        }
_L3:
        if (list.size() > 1)
        {
            mProgressTextView.setText((new StringBuilder()).append(i + 1).append(" of ").append(list.size()).toString());
            return;
        } else
        {
            mProgressTextView.setText("");
            return;
        }
_L2:
        if (j <= i)
        {
            break MISSING_BLOCK_LABEL_213;
        }
        mCardHolder.moveTo(question, ((String) (obj)), CardCarouselLayout.Direction.BACKWARD);
        break MISSING_BLOCK_LABEL_114;
        mCardHolder.replaceTo(question, ((String) (obj)));
          goto _L3
    }

    private void trackSurveyAttempted()
    {
        Survey survey = getSurveyState().getSurvey();
        com.mixpanel.android.mpmetrics.MixpanelAPI.People people = mMixpanel.getPeople().withIdentity(mUpdateDisplayState.getDistinctId());
        people.append("$surveys", Integer.valueOf(survey.getId()));
        people.append("$collections", Integer.valueOf(survey.getCollectionId()));
    }

    public void completeSurvey(View view)
    {
        completeSurvey();
    }

    public void goToNextQuestion(View view)
    {
        goToNextQuestion();
    }

    public void goToPreviousQuestion(View view)
    {
        goToPreviousQuestion();
    }

    public void onBackPressed()
    {
        if (isShowingSurvey() && mCurrentQuestion > 0)
        {
            goToPreviousQuestion();
            return;
        }
        if (isShowingInApp())
        {
            UpdateDisplayState.releaseDisplayState(mIntentId);
        }
        super.onBackPressed();
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        mIntentId = getIntent().getIntExtra("com.mixpanel.android.surveys.SurveyActivity.INTENT_ID_KEY", 0x7fffffff);
        mUpdateDisplayState = UpdateDisplayState.claimDisplayState(mIntentId);
        if (mUpdateDisplayState == null)
        {
            Log.e("MixpanelAPI.SrvyActvty", "SurveyActivity intent received, but nothing was found to show.");
            finish();
            return;
        }
        mMixpanel = MixpanelAPI.getInstance(this, mUpdateDisplayState.getToken());
        if (isShowingInApp())
        {
            onCreateInAppNotification(bundle);
            return;
        }
        if (isShowingSurvey())
        {
            onCreateSurvey(bundle);
            return;
        } else
        {
            finish();
            return;
        }
    }

    protected void onDestroy()
    {
        if (isShowingSurvey())
        {
            onDestroySurvey();
        }
        super.onDestroy();
    }

    protected void onPause()
    {
        super.onPause();
        if (mDialog != null)
        {
            mDialog.dismiss();
            mDialog = null;
        }
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        if (isShowingSurvey())
        {
            onSaveInstanceStateSurvey(bundle);
        }
    }

    protected void onStart()
    {
        super.onStart();
        com.mixpanel.android.mpmetrics.UpdateDisplayState.DisplayState displaystate = mUpdateDisplayState.getDisplayState();
        if (displaystate != null && displaystate.getType() == "SurveyState")
        {
            onStartSurvey();
        }
    }








}
